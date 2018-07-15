package fileutil;

import java.io.File;
import java.io.FileFilter;
import java.util.List;
import java.util.function.Consumer;

import org.junit.Ignore;
import org.junit.Test;

import fileutil.FileUtil.FileNodeInfo;

public class FileUtilTest {
	@Ignore
	@Test
	public void testFileFilter() throws Exception {
		FileFilter filter = (file)->file.getName().toLowerCase().endsWith(".chm");
		FileUtil.filter(new File("E:\\Andrew's Files（books,docs）\\2. Andrew-MSET-软件编程开发技术书籍"), filter);
		List<FileNodeInfo> fileNodes = FileUtil.getFilteredFileNodes();
		Consumer<FileNodeInfo> action = (node)->{System.out.println(node.getName());};
		fileNodes.forEach(action);
	}
	
	@Ignore
	@Test
	public void testFileFilter2() throws Exception {
		FileFilter filter = (file)->file.getName().toLowerCase().endsWith(".chm");
		FileUtil.filter(new File("E:\\Andrew's Files（books,docs）\\2. Andrew-MSET-软件编程开发技术书籍"), filter);
		List<File> resultList = FileUtil.getFilteredFiles();
		resultList.forEach((file)->{System.out.println(file.getName());});
	}
	
	@Ignore
	@Test
	public void testFileSplit() throws Exception {
		FileUtil.split(new File("C:\\Users\\Administrator\\Desktop\\今日食谱.ods"), 1024);
	}
}
