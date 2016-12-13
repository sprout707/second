package com.og.localhost.util;

import java.util.Random;

public class CertifCodeManager {
	
	private Random random=new Random();
	
	//랜덤 문자열 생성
	public String createCode()
	{
		String result="";
		
		int[] arr=new int[6];
		
		for(int i=0; i<6; i++)
			arr[i]=random.nextInt(3);
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==0)
				result+=createRandomInt();
			
			if(arr[i]==1)
				result+=createRandomUpChar();
			
			if(arr[i]==2)
				result+=createRandomLowChar();
		}
		
		return result;
	}
	
	//대문자 반환(A ~ Z)
	public char createRandomUpChar() 
	{
		char[] upper=new char[26];
		
		for(int i=0; i<26; i++)
			upper[i]=(char)(i+65);
		
		return upper[random.nextInt(25)];
	}
	
	//소문자 반환(a ~ z)
	public char createRandomLowChar()
	{
		char[] lower=new char[26];
		
		for(int i=0; i<26; i++)
			lower[i]=(char)(i+97);
		
		return lower[random.nextInt(25)];
	}
	
	//숫자 반환(0 ~ 9)
	public int createRandomInt()
	{
		return random.nextInt(10);
	}

}









