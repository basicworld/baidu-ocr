package util;

public class OcrUtilTest {
public static void main(String[] args) {
//	String path = "C:\\Users\\lenovo\\working-workspace\\baidu-ocr\\src\\test\\resources\\ocr1.jpg";
//	System.out.println(OcrUtil.parseImg(path));
	
//	String path2 = "C:\\Users\\lenovo\\working-workspace\\baidu-ocr\\src\\test\\resources\\ocr2.jpg";
//	System.out.println(OcrUtil.parseImg(path2));
//	String path3 = "C:\\Users\\lenovo\\working-workspace\\baidu-ocr\\src\\test\\resources\\pdf1.pdf";
//	System.out.println(OcrUtil.parseImg(path3));
	
	String pdfPath ="C:\\Users\\lenovo\\working-workspace\\baidu-ocr\\src\\test\\resources\\pdf1.pdf";
	String pngPath ="C:\\Users\\lenovo\\working-workspace\\baidu-ocr\\src\\test\\resources\\pdf1.pdf.png";
	String type = "png";
	System.out.println(OcrUtil.parseImg(PdfUtil.pdf2png(pdfPath, pngPath, type)));
}
}
