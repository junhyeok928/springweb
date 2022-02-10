package springweb.vo;

import org.springframework.web.multipart.MultipartFile;

public class FileVo {
	private String title;
	private MultipartFile report;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public MultipartFile getReport() {
		return report;
	}
	public void setReport(MultipartFile report) {
		this.report = report;
	}
	
}
