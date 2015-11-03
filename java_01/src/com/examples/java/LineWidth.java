package com.examples.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LineWidth {
	public static void main(String[] args){
		System.out.println("Entering main : ");
		BufferedReader br = null;

		try {

			br = new BufferedReader(new FileReader(args[0]));
			String currentLine;
			int maxLength = 0;
			int i = 0;
			LineWidth lW = new LineWidth();
			ArrayList<String> lines = new ArrayList<String>();

			while ((currentLine = br.readLine()) != null) {
				if (maxLength < currentLine.length())
					maxLength = currentLine.length();
				lines.add(currentLine);				
			}

			String mL = Integer.toString(maxLength);

			while (i<lines.size()){
				String str = lW.formatSpace(mL.length() - (Integer.toString(lines.get(i).length()).length()));
				System.out.println(str + lines.get(i).length()+ " | "+ lines.get(i));
				i++;
			}

			/*while ((sCurrentLine = br1.readLine()) != null) {
				String str = lW.formatSpace(mL.length() - (Integer.toString(sCurrentLine.length())).length());
				System.out.println(str+sCurrentLine.length()+ " | "+ sCurrentLine);
			}	*/

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}				
	}

	public String formatSpace(int length){
		String padding = "";
		for (int i = 0; i < length; i ++){
			padding = padding + " ";
		}		
		return padding;
	}
}
