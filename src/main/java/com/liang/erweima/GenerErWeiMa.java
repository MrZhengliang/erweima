/**
 * Title. 生成二维码类<br>
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
package com.liang.erweima;

import java.io.File;
import java.util.Hashtable;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;

/**
 * @author Administrator
 *
 */
public class GenerErWeiMa {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		try {
			String text = "http://www.eimarket.cn/";
			int width = 300;
			int height = 300;
			// 二维码的图片格式
			String format = "jpg";
			Hashtable hints = new Hashtable();
			
			//内容所使用编码
			hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
			BitMatrix bitMatrix = new MultiFormatWriter().encode(text,
					 BarcodeFormat.QR_CODE, width, height, hints);
			
			//生成二维码
			File outputFile = new File("G:"+File.separator+"我的微信"+File.separator+"二维码"+File.separator+"辽宁政企超市二维码.jpg");
			MatrixToImageWriter.writeToFile(bitMatrix, format, outputFile);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
