package util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

public class PdfUtil {

	/**
	 * 转换全部的pdf 如果转换成功则输出图片地址  如果失败则输出null
	 * 
	 * @param fileAddress 文件地址
	 * @param filename    PDF文件名
	 * @param type        图片类型
	 */
	public static String pdf2png(String pdfPath, String imgPath, String type) {
		// 将pdf装图片 并且自定义图片得格式大小
		File file = new File(pdfPath);
		try {
			PDDocument doc = PDDocument.load(file);
			PDFRenderer renderer = new PDFRenderer(doc);
			int pageCount = doc.getNumberOfPages();
			for (int i = 0; i < pageCount; i++) {
				BufferedImage image = renderer.renderImageWithDPI(i, 144); // Windows native DPI
				// BufferedImage srcImage = resize(image, 240, 240);//产生缩略图
				ImageIO.write(image, type, new File(imgPath));
				
				// test
				File testF = new File(imgPath);
				if(testF.isFile()) {
					return imgPath;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	
}
