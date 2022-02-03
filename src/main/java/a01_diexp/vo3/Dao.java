package a01_diexp.vo3;
// a01_diexp.vo3.Dao
public class Dao {
	private String ip;
	private String url;
	private String user;
	private String pass;
	public Dao() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dao(String ip, String url, String user, String pass) {
		super();
		this.ip = ip;
		this.url = url;
		this.user = user;
		this.pass = pass;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
