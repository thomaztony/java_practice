package com.examples.test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class CharacterEncodingTest {
	public static void main(String[] args){
		String defaultCharacterEncoding = System.getProperty("file.encoding");
		
		System.out.println("Default character encoding by property : "+ defaultCharacterEncoding);
		System.out.println("Default character encoding by code : "+ getDefaultCharEncoding() );
		System.out.println("Default character encoding by charSet : "+ Charset.defaultCharset());
		
		System.setProperty("file.encoding", "UTF-16");
		
		System.out.println("Default character encoding by property AFTER updating the file.encoding property : "+ defaultCharacterEncoding);
		System.out.println("Default character encoding by code AFTER updating the file.encoding property : "+ getDefaultCharEncoding() );
		System.out.println("Default character encoding by charSet AFTER updating the file.encoding property : "+ Charset.defaultCharset());
	}

	private static String getDefaultCharEncoding() {
		byte[] bArray = {'w'};
		InputStream is = new ByteArrayInputStream(bArray);
		InputStreamReader reader = new InputStreamReader(is);
		String defaultCharacterEncoding = reader.getEncoding();
		return defaultCharacterEncoding;
	}
}
