package springweb.a02_mvc.a03_dao;

import java.util.ArrayList;

import springweb.vo.FileInfo;
// springweb.a02_mvc.a03_dao.A04_FileDao
public interface A04_FileDao {
	public void insertFileInfo(FileInfo ins);
	public ArrayList<FileInfo> getFileList();
}
