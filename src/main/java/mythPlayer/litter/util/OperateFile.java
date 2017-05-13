package mythPlayer.litter.util;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class OperateFile {
	/**
	 * 读指定文件的内容
	 * 
	 * @param fileName
	 *            要读的文件的名称(包含文件绝对路径)
	 * @return String 指定文件的内容
	 */
	public static String readFile(String fileName) {
		String content = null;

		StringBuilder builder = new StringBuilder();
		FileInputStream fileInputStream = null;
		Reader reader = null;
		try {
			fileInputStream = new FileInputStream(fileName);
			reader = new InputStreamReader(fileInputStream);
			char[] chars = new char[1024];
			int count = -1;
			while ((count = reader.read(chars)) != -1) {
				builder.append(chars, 0, count);
			}
		} catch (Exception e) {
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (Exception e2) {
			}

		}
		content = builder.toString();
		return content;
	}
}
