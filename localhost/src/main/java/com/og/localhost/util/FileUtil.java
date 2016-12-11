package com.og.localhost.util;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public class FileUtil {
	
	private static final String filePath="C:\\localhost_img\\";

	public String fileUpload(MultipartHttpServletRequest request) throws IOException
	{
		String result="";
		Iterator<String> reqIter=request.getFileNames(); //파일 collection
		
		File file=new File(filePath);
		//파일 경로가 없다면 생성한다.
		if(!file.exists())
			file.mkdirs();
		
		while(reqIter.hasNext())
		{
			//파일 collection에서 파일을 뽑는다.
			MultipartFile multi=request.getFile(reqIter.next());
			
			//파일이 null이 아니라면 다음 액션을 한다.
			if(!multi.isEmpty())
			{
				//1. 경로와 이름으로 server에 파일 생성
				file=new File(filePath+multi.getOriginalFilename());
				//2. 파일을 위 생성된 파일로 저장
				multi.transferTo(file);
				//3. DB에 저장할 파일명을 돌려준다.
				result=multi.getOriginalFilename();
			}
		}
		
		return result;
		
	}
	
	
	
	 
}
