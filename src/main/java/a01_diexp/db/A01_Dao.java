package a01_diexp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

// mybatis에서는 xml파일와 인터페이스에 의해 아래의 객체를 자동으로 생성한다.
@Component
public class A01_Dao implements A02_EmpDao{
	// ex) 연결 처리 객체 만들기.
	// ~12:20
	// 1. 공통 필드 선언
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs; 
	// 2. 공통 메서드 선언(setConn())
	public void setConn() throws SQLException {
		// 1) 드라이버 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("예외 처리:"+e.getMessage());
		}
		// 2) 특정 서버 연결
		String info = "jdbc:oracle:thin:@localhost:1521:xe";
		con = DriverManager.getConnection(info,"scott","tiger");
		System.out.println("접속 성공");
	}
	void closeRsc() {
		if(rs!=null) { 
			try {
				rs.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
		}
		if(pstmt!=null) { 
			try {
				pstmt.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
		}		
		if(stmt!=null) { 
			try {
				stmt.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
		}
		if(con!=null) { 
			try {
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
		}		
	}
	// 조회 처리 메서드 구현1단계(출력)
	public void empList() {
		// 1. 연결공통메서드 호출
		try {
			setConn();
			// 2. Statement 객체 생성( Connection ==> Statement )
			stmt = con.createStatement();
			String sql = "SELECT * FROM EMP";
			// 3. ResultSet 객체 생성.sql의 결과(Statement ==> ResultSet)
			rs = stmt.executeQuery(sql);
			// 4. while()을 통해 결과 내용 처리 sql의 결과는 처리
			//     rs.next() 행단위로 이동하게 처리..
			int rowNum =1;
			while( rs.next() ) {
				System.out.print(rowNum+++"행\t");
				// rs.get데이터유형("컬럼명/alias명")
				System.out.print(rs.getInt("empno")+"\t");
				// rs.getInt(1), rs.getString(2)
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString("job")+"\t");
				System.out.print(rs.getInt("mgr")+"\t");
				System.out.print(rs.getDate("hiredate")+"\t");
				System.out.print(rs.getDouble("sal")+"\t");
				System.out.print(rs.getDouble("comm")+"\t");
				System.out.print(rs.getInt("deptno")+"\n");
			}
			// 5. 자원 해제
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// 6. 예외 처리..
			System.out.println(e.getMessage());
			if(rs!=null) rs = null; // 강제로 자원해제..
			if(stmt!=null) stmt = null;
		}
	}
	// 조회 처리 메서드 구현1단계(출력)
	// 리턴 VO 만들고,  ArrayList<VO> 선언하기. 자동import : ctrl+shift+o
	public ArrayList<Emp> empListPre(String ename, String job) {
		// 리턴할 객체 선언.
		ArrayList<Emp> emplist = new ArrayList<Emp>();
		// 메서드의 마지막부분 return emplist;
		// 1. 연결공통메서드 호출
		String sql = "SELECT *\r\n"
				+ "FROM emp\r\n"
				+ "WHERE ename LIKE '%'||?||'%'\n"
				+ "AND job LIKE '%'||?||'%'";
		System.out.println("# pstmt 실행 #");
		try {
			setConn();
			// 2. Statement 객체 생성( Connection ==> Statement )
			// sql을 먼저 넘겨주고..
			pstmt = con.prepareStatement(sql);
			// ?에 해당 하는 데이터를 처리.
			pstmt.setString(1, ename);
			pstmt.setString(2, job);
			
			
			// 3. ResultSet 객체 생성.sql의 결과(Statement ==> ResultSet)
			rs = pstmt.executeQuery();
			// 4. while()을 통해 결과 내용 처리 sql의 결과는 처리
			//     rs.next() 행단위로 이동하게 처리..
			int rowNum =1;
			
			// 행단위로 단위 객체를 생성하여 ArrayList에 할당 처리..
			while( rs.next() ) {
				System.out.print(rowNum+++"행\t");
				// rs.get데이터유형("컬럼명/alias명")
				System.out.print(rs.getInt("empno")+"\t");
				// rs.getInt(1), rs.getString(2)
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString("job")+"\t");
				System.out.print(rs.getInt("mgr")+"\t");
				System.out.print(rs.getDate("hiredate")+"\t");
				System.out.print(rs.getDouble("sal")+"\t");
				System.out.print(rs.getDouble("comm")+"\t");
				System.out.print(rs.getInt("deptno")+"\n");
				Emp emp = new Emp();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setHiredate(rs.getDate("hiredate"));
				emp.setSal(rs.getDouble("sal"));
				emp.setComm(rs.getDouble("comm"));
				emp.setDeptno(rs.getInt("deptno"));
				emplist.add(emp); // 단위객체를 emplist에 할당처리.
			}
			// 5. 자원 해제
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// 6. 예외 처리..
			System.out.println(e.getMessage());
			closeRsc();
		}
		return emplist;
	}
	// 3. deptlist 기능 메서드..
	/* 진행하시고, 조별로 손들어 주세요..
	1. Dept(deptno, dname, loc)  Vo 생성.
	2. 리턴할 기능 메서드 선언.
	3. select * from dept where loc like '%'||'A'||'%';
	4. while() 처리할 VO생성하고, ArrayList에 담기
	5. main()에서 출력처리.
	
	~11:40까지 일단 해보시고, 같이 진행하겠습니다
	 * */
	
	public ArrayList<Dept> deptList(String loc) {
		ArrayList<Dept> dlist = new ArrayList<Dept>();
		// return dlist;
		try {
			setConn();
			String sql = "select * \r\n"
					+ "from dept \r\n"
					+ "where loc like '%'||'"+loc+"'||'%'";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			int row=1;
			while(rs.next()) {
				dlist.add( new Dept(rs.getInt(1), rs.getString(2), rs.getString(3) ) );
				// dept 컬럼 데이터 가져와서 출력하기..
				// select deptno, dname, loc from dept
				System.out.print("행:"+row+++"\t");
				System.out.print(rs.getInt("deptno")+"\t");
				System.out.print(rs.getString(2)+"\t"); // select를 통해서 데이터 순서로 1부터
				System.out.print(rs.getString(3)+"\n"); // select를 통해서 데이터 순서로 1부터
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("sql예외:"+e.getMessage());
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		return dlist;
	}
	// ex) A03_DatabaseDao.java를 만들고, 
	//     필드, 공통메서드, public void deptList()로 선언하여
	//     sql을 select * from dept로 처리된 행을 출력하는 내용까지 처리하세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성 및 메서드 처리..
		A01_Dao dao = new A01_Dao();
		dao.empList(); 
		System.out.println("# ArrayList<Emp>를 통한 화면 출력 #");
		for(Emp emp:dao.empListPre("A","")) {
			System.out.println(emp.getEname()+"\t"+emp.getJob());
		}		
	}
	
	
	
}
