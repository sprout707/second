package com.og.localhost.util;

import java.io.File;

public class UploadPath {
   // #jin. 시작부분
   // 철진
   // 사용자 프로필사진이 저장되는 경로
   public static final String PROFILE_PATH = "resources" + File.separator + "upload" + File.separator + "profile";

   // 호스팅시 등록한 숙소 사진이 저장되는 경로
   public static final String HOUSE_PATH = "resources" + File.separator + "upload" + File.separator + "house";

   // 도움말에 관리자가 첨부한 사진이 저장되는 경로
   public static final String HELP_PATH = "resources" + File.separator + "upload" + File.separator + "help";

   // 1:1문의게시판에서 첨부한 사진이 저장되는 경로
   public static final String QNA_PATH = "resources" + File.separator + "upload" + File.separator + "qna";
   
   // 메시지에서 첨부한 사진이 저장되는 경로
   public static final String MESSAGE_PATH = "resources" + File.separator + "upload" + File.separator + "message";
   // #jin. 끝부분
}