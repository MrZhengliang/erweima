/**
 * Title. 测试类<br>
 * Description.
 * <p>
 * Copyright: Copyright (c) 2014年8月9日
 * <p>
 * Company: 北京宽连十方数字技术有限公司
 * <p>
 * Author: fuzl@c-platform
 * <p>
 * Version: 1.0
 * <p>
 */
package erweima;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

import org.junit.Test;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.liang.erweima.MatrixToImageWriter;

/**
 * @author Administrator
 * 
 */
public class TestEr {

	//@Test
	public void testGenerTwoCode() throws WriterException, IOException {
		String text = "http://www.baidu.com";
		int width = 300;
		int height = 300;
		// 二维码的图片格式
		String format = "gif";
		Hashtable hints = new Hashtable();
		
		//内容所使用编码
		hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
		BitMatrix bitMatrix = new MultiFormatWriter().encode(text,
				 BarcodeFormat.QR_CODE, width, height, hints);
		
		//生成二维码
		File outputFile = new File("G:"+File.separator+"我的微信"+File.separator+"new.gif");
		MatrixToImageWriter.writeToFile(bitMatrix, format, outputFile);

	}
	
	
	
}
