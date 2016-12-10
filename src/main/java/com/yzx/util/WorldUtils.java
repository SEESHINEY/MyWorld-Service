package com.yzx.util;

public class WorldUtils {
	private final static String NUMBER="0123456789";
	private final static int NUMBER_LENGTH=10;
	private final static String CHAR="aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ";
	private final static int CHAR_LENGTH=52;
	private final static String NUMBER_AND_CHAR="0123456789aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ";
	private final static int NUMBER_AND_CHAR_LENGTH=62;
	private static StringBuilder randomSb;
	private static String randomStr;
  public static String random(int length){
  	return random(length,NUMBER_AND_CHAR,NUMBER_AND_CHAR_LENGTH);
  }
  public static String numericRandom(int length){
  	return random(length,NUMBER,NUMBER_LENGTH);
  }
  public static String stringRandom(int length){
  	return random(length,CHAR,CHAR_LENGTH);
  }
  private static String random(int reqLength,String model,int length){
  	StringBuilder sb=new StringBuilder();
  	for(int i=0;i<reqLength;i++){
    	int indexOfString=(int) (Math.random()*length);
    	sb.append(model.charAt(indexOfString));
  	}
  	return sb.toString();
  }
}
