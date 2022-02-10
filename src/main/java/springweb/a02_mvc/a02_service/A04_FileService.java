package springweb.a02_mvc.a02_service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

// springweb.a02_mvc.a02_service.A03_FileService
@Service
public class A04_FileService {
	@Value("${upload}")
	private String upload;
	public String uploadFile(MultipartFile mf) {
		String fname =mf.getOriginalFilename();
		System.out.println("경로와파일명:"+upload+fname);
		File file = new File(upload+fname);
		String result="";
		try {
			mf.transferTo(file);
			result="업로드 성공";
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result="에러발생1:"+e.getMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result="에러발생2:"+e.getMessage();
		} catch(Exception e) {
			result="에러발생3:"+e.getMessage();
		}
		System.out.println("파일업로드:"+result);
		return result;
	}
}
