package util.test;

import java.io.File;

import org.junit.Ignore;
import org.junit.Test;

import util.FileUtil;

public class FileUtilTest {
	@Ignore
	@Test
	public void testTrimFileLine() throws Exception {
		FileUtil.trimLines(new File("E:\\temp\\test.txt"), new File("E:\\temp\\test-2.txt"));
	}
	
	@Ignore
	@Test
	public void testSortFileLine() throws Exception {
		FileUtil.sortLines(new File("E:\\temp\\test-2.txt"), new File("E:\\temp\\test-3.txt"));
	}
}
