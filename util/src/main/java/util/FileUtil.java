package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileUtil {
	
	public static final String default_charest = "UTF-8";
	public static final String carriage_return = "\r\n";
	
	public static void trimLines(File in, File out) throws Exception {
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		try {
			isr = new InputStreamReader(new FileInputStream(in), default_charest);
			br = new BufferedReader(isr);
			
			osw = new OutputStreamWriter(new FileOutputStream(out), default_charest);
			bw = new BufferedWriter(osw);
			
			String str;
			while ((str = br.readLine()) != null) {
				str = str.trim().substring(str.lastIndexOf("\\")+1);
				bw.write(str);
				bw.write(carriage_return);
				bw.flush();
			}
			
		} finally {
			bw.close();
			br.close();
		}
	}
	
	public static void sortLines(File in, File out) throws Exception {
		FileInputStream fin = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		FileOutputStream fout = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		List<String> list = new ArrayList<String>();
		
		try {
			fin = new FileInputStream(in);
			isr = new InputStreamReader(fin, default_charest);
			br = new BufferedReader(isr);
			
			fout = new FileOutputStream(out);
			osw = new OutputStreamWriter(fout, default_charest);
			bw = new BufferedWriter(osw);
			
			String str;
			while ((str = br.readLine()) != null) {
				list.add(str);
			}
			
			Collections.sort(list);
			
			for (String item : list) {
				bw.write(item);
				bw.write(carriage_return);
				bw.flush();
			}
				
		} finally {
			bw.close();
			br.close();
		}
		
	}
}
