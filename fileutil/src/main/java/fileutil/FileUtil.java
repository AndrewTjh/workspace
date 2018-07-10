package fileutil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class FileUtil {
	static int level = 0;
	static byte[] buf = new byte[8192*32];
	static int len;
	
	static void writeTo(FileInputStream in, FileOutputStream out) {
		try {
			while ((len = in.read(buf)) != -1) {
				out.write(buf, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] args) throws Exception {
//		FileUtil.walkTree(new File("E:\\Andrew's Files锛坱emp锛塡\dev work\\docs, excels, table sheets, sample data"));
		
//		File file = new File("C:\\Users\\Administrator\\Desktop\\鍟嗗搧姣旇緝鍣�.ods");
//		System.out.println(file.length());
//		System.out.println(file.getFreeSpace());
//		System.out.println(file.getUsableSpace());
//		System.out.println(file.getTotalSpace());
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getPath());
//		System.out.println(file.getParent());
//		System.out.println(file.getAbsoluteFile());
//		System.out.println(file.getCanonicalFile());
//		System.out.println(file.getCanonicalPath());
		
		// read all java files in the given directory
//		FileUtil.filter(new File("E:\\Andrew's Files锛坢isc锛塡\2. projects and programs"), new FileFilter(){
//			public boolean accept(File file) {
//				return file.getName().endsWith(".java");
//			}
//		});
//		
//		// sort all files by name
//		List<FileNodeInfo> fileNodes = FileUtil.getFilteredFileNodes();
//		Collections.sort(fileNodes, new Comparator<FileNodeInfo>() {
//			public int compare(FileNodeInfo o1, FileNodeInfo o2) {
//				return o1.name.compareTo(o2.name);
//			}
//		});
////		System.out.println("file node count:"+fileNodes.size());
//		
//		File out = new File("C:\\Users\\Administrator\\Desktop\\all-java-sources-in-one.java");
//		FileOutputStream outStream = new FileOutputStream(out);
//		// process the files one by one
//		for (FileNodeInfo filenode : fileNodes) {
////			System.out.println(filenode.getName()+" ["+filenode.getPath()+"]");
////			System.out.println(filenode.getName().substring(0, filenode.getName().lastIndexOf(".")));
////			filenode.viewContent();
//			File file = filenode.getFile();
//			FileInputStream inStream = new FileInputStream(file);
//			writeTo(inStream, outStream);
//			outStream.write('\r');
//			outStream.write('\n');
//			inStream.close();
//		}
//		
//		outStream.close();
		
//		File file = new File("C:\\Users\\Administrator\\Desktop\\鏈満婧愮爜搴�.txt");
//		FileInputStream in = new FileInputStream(file);
////		FileReader fr = new FileReader(file);
//		InputStreamReader fr = new InputStreamReader(in, "UTF-8");
//		BufferedReader br = new BufferedReader(fr);
//		try {
//			String s;
//			while ((s=br.readLine())!=null) {
//				System.out.println(s);
//			}
//		} finally {
//			br.close();
//			fr.close();
//		}
		
//		File[] files = new File[]{
//			new File("C:\\Users\\Administrator\\Desktop\\鏈満婧愮爜搴�.txt"),
//			new File("C:\\Users\\Administrator\\Desktop\\鐢靛瓙鏈烘鐖卞ソ鑰�.txt"),
//			new File("C:\\Users\\Administrator\\Desktop\\TO-DO-LIST.txt"),
//		};
//
//		byte[] buf = new byte[8192];
//		int len;
//		
//		File out = new File("C:\\Users\\Administrator\\Desktop\\allText.java");
//		FileOutputStream fout = new FileOutputStream(out);
//		
//		for (File file : files) {
//			FileInputStream fin = new FileInputStream(file);
//			while ((len = fin.read(buf)) != -1) {
//				fout.write(buf, 0, len);
//			}
//			fout.write('\r');
//			fout.write('\n');
//			fin.close();
//		}
//		
//		fout.close();
		
		// all imports
//		File file = new File("C:\\Users\\Administrator\\Desktop\\all-java-sources-in-one.java");
//		FileReader fr = new FileReader(file);
//		BufferedReader br = new BufferedReader(fr);
//		String s;
//		
//		File file2 = new File("C:\\Users\\Administrator\\Desktop\\all-imports.java");
//		FileWriter fout = new FileWriter(file2);
//		BufferedWriter bw = new BufferedWriter(fout);
//		
//		// bug-prone, when an irregularly-formatted file is encountered
//		while ((s=br.readLine().trim())!=null) {
//			if (s.startsWith("import ")) {
//				bw.write(s+"\r\n");
//				bw.flush();
//			}
//		}
//		
//		fout.close();
//		fr.close();
		
		// eliminate duplication
//		File file = new File("C:\\Users\\Administrator\\Desktop\\all-imports.java");
//		FileReader fr = new FileReader(file);
//		BufferedReader br = new BufferedReader(fr);
//		
//		Set<String> set = new HashSet<String>();
//		
//		File file2 = new File("C:\\Users\\Administrator\\Desktop\\all-imports-without-duplication.java");
//		FileWriter fw = new FileWriter(file2);
//		BufferedWriter bw = new BufferedWriter(fw);
//		
//		String s;
//		while ((s = br.readLine()) != null) {
//			set.add(s);
//		}
//		
//		for (String ele : set) {
//			bw.write(ele+"\r\n");
//			bw.flush();
//		}
//		
//		fw.close();
//		fr.close();
		
		// an ordered import list without duplication
		File file1 = new File("C:\\Users\\Administrator\\Desktop\\all-imports-without-duplication.java");
		File file2 = new File("C:\\Users\\Administrator\\Desktop\\all-imports-without-duplication-ordered.java");
		FileReader fr = new FileReader(file1);
		FileWriter fw = new FileWriter(file2);
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		List<String> list = new ArrayList<String>();
		String str;
		while ((str=br.readLine())!=null) {
			list.add(str);
		}
//		System.out.println(list.size());
		Collections.sort(list);
//		System.out.println(list);
		for (String ele : list) {
			bw.write(ele+"\r\n");
			bw.flush();
//			System.out.println(ele);
		}
		fw.close();
		fr.close();
		
	}
	
	public static final void walkTree(File file) {
		for (int i = 0; i < level; i++) {
			System.out.print("     ");
		}
		boolean isDir = file.isDirectory();
		System.out.println("|--->"+file.getName()+" ["+(isDir?"dir":"file")+"]");
		if (isDir) {
			File[] files = file.listFiles();
			for (File ele : files) {
				level++;
				walkTree(ele);
				level--;
			}
		}
	}
	
	private static List<FileNodeInfo> fileNodes = new ArrayList<FileNodeInfo>();
	private static List<File> resultList = new ArrayList<File>();
	
	public static final List<FileNodeInfo> getFilteredFileNodes() {
		return fileNodes;
	}
	
	public static final List<File> getFilteredFiles() {
		return resultList;
	}
	
	public static final void filter(File file, FileFilter filter) {
		boolean accepted = filter.accept(file);
		if (accepted) {
			/*FileNodeInfo node = new FileNodeInfo(file);
			fileNodes.add(node);*/
			resultList.add(file);
		}
		boolean isDir = file.isDirectory();
		if (isDir) {
			File[] files = file.listFiles();
			for (File ele : files) {
				filter(ele, filter);
			}
		}
	}
	
	public static final class FileReaderUtil {
		public static final void read(File file) {
			FileInputStream in;
			InputStreamReader isr;
			BufferedReader br;
			
		}
		public static final void read(File in, File out) {
			
		}
	}
	
	public static final class FileNodeInfo {
		private String name;
		private String path;
		private String pathname;
		private String suffix;
		private Long size;
		private File file;
		private FileReaderUtil reader;
		
		public FileNodeInfo() {}
		public FileNodeInfo(File file) {
			this.pathname = file.getAbsolutePath();
			this.path = file.getParent();
			this.name = file.getName();
			this.suffix = this.name.substring(this.name.lastIndexOf("."));
			this.size = file.length();
			this.file = file;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPath() {
			return path;
		}
		public void setPath(String path) {
			this.path = path;
		}
		public String getPathname() {
			return pathname;
		}
		public void setPathname(String pathname) {
			this.pathname = pathname;
		}
		public String getSuffix() {
			return suffix;
		}
		public void setSuffix(String suffix) {
			this.suffix = suffix;
		}
		public Long getSize() {
			return size;
		}
		public void setSize(Long size) {
			this.size = size;
		}
		public File getFile() {
			return file;
		}
		public void setFile(File file) {
			this.file = file;
		}
		public void viewContent() {
			FileInputStream fin = null;
			InputStreamReader isr = null;
			BufferedReader br = null;
			String s = null;
			try {
				fin = new FileInputStream(this.file);
				isr = new InputStreamReader(fin, "UTF-8");
				br = new BufferedReader(isr, 1024*32);
				System.out.println(this.name);
				while ((s = br.readLine()) != null) {
					System.out.println(s);
				}
				System.out.println();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (br != null) {
						br.close();
					}
					if (isr != null) {
						isr.close();
					}
					if (fin != null) {
						fin.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		@Override
		public String toString() {
			return "FileNodeInfo [" +
					"name=" + name + 
					", path=" + path + 
					", pathname=" + pathname + 
					", suffix=" + suffix +
					", size=" + size + "B" +
					"]";
		}
	}
	
	/**
	 * file:10248,partialSize=1024,bufSize=128
	 * 128x8x10
	 * 
	 * */
	public static final File[] split(File source, long partialSize) throws Exception {
		FileInputStream fin = new FileInputStream(source);
		long bufSize = 128;
		File[] files = null;
		FileOutputStream[] fouts = null;
		long sourceSize = source.length();
		int numOfOutputFiles = 1;
		if (sourceSize > partialSize) {
			numOfOutputFiles = (sourceSize % partialSize == 0) ? (int)(sourceSize / partialSize) : (int)(sourceSize / partialSize + 1);
		}
		files = new File[numOfOutputFiles];
		fouts = new FileOutputStream[numOfOutputFiles];
		int i;
		for (i = 0; i < files.length; i++) {
			files[i] = new File(source.getAbsolutePath()+"-"+(i+1));
			fouts[i] = new FileOutputStream(files[i]);
		}
		i = 0;
		try {
			byte[] buf = new byte[(int)bufSize];
			int len;
			while ((len=fin.read(buf))!=-1) {
				for (int j = 0; j < 10/*readTimesCount*/; j++) {
					fouts[i].write(buf, 0, len);
				}
				i++;
			}
		} finally {
			for (i = 0; i < fouts.length; i++) {
				fouts[i].close();
			}
			fin.close();
		}
		return files;
	}
}
