package fileutil;

import java.io.File;

import org.junit.Test;

public class FileUtilTest {
	@Test
	public void testFileSplit() throws Exception {
		FileUtil.split(new File("C:\\Users\\Administrator\\Desktop\\今日食谱.ods"), 1024);
	}
}
