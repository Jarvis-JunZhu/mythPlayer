package mythPlayer.litter.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

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

	/**
	 * 将内容保存到指定的文件中
	 * 
	 * @param content
	 *            文件的内容
	 * @param fileName
	 *            文件名字（包含绝对路径）
	 */
	public static void saveFile(String content, String fileName) {
		FileOutputStream fileOutputStream = null;
		Writer writer = null;
		try {
			fileOutputStream = new FileOutputStream(fileName);
			writer = new OutputStreamWriter(fileOutputStream);
			writer.write(content);

			writer.flush();
			fileOutputStream.flush();
		} catch (Exception e) {
		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}
	}
}
