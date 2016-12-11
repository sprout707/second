package com.og.localhost.util;

import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository
public class FileManager {

   // #jin. 시작부분

   // path : UploadPath 클래스에 미리 지정해둔 파일을 저장할 경로
   // 리턴 : 서버에 저장된 새로운 파일명
   public String fileUpload(HttpSession session, MultipartFile orgFile, String uploadPath) {

      String path = session.getServletContext().getRealPath(uploadPath);

      String newFileName = null;

      try {
         byte[] bytes = orgFile.getBytes();
         String orgFileName = orgFile.getOriginalFilename();
         if (bytes == null) {
            return null;
         }

         // 클라이언트가 업로드한 파일의 이름
         if (orgFileName.equals("")) {
            return null;
         }

         // 파일의 확장자만을 잘라준다.
         String fileExt = orgFileName.substring(orgFileName.lastIndexOf("."));
         if (fileExt == null || fileExt.equals("")) {
            return null;
         }
         // 서버에 저장할 새로운 파일명을 만든다.
         // UUID는 범용 고유 식별자로 국제기구 표준이다.
         newFileName = UUID.randomUUID().toString() + "_" + fileExt;

         // 업로드할 경로가 존재하지 않는 경우 폴더를 생성 한다.
         File dir = new File(path);
         if (!dir.exists()) {
            dir.mkdirs();
         }
         String pathName = path + File.separator + newFileName;

         FileOutputStream fos = new FileOutputStream(pathName);
         fos.write(bytes);
         fos.close();

      } catch (Exception e) {
         e.printStackTrace();
         return null;
      }
      return newFileName;
   }

   // 서버에 업로드된 파일 삭제
   // 세션, DB에 저장된 파일명, UploadPath 클래스에 미리 지정한 경로를 파라미터로 받는다.
   public void fileDelete(HttpSession session, String fileName, String uploadPath) {
      try {

         String path = session.getServletContext().getRealPath(uploadPath);

         String pathName = path + File.separator + fileName;

         File file = new File(pathName);
         if (file.exists()) {
            file.delete();
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
   // #jin. 끝부분
   
}