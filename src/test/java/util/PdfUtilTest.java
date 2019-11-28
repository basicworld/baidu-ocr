package util;

public class PdfUtilTest {
public static void main(String[] args) {
	String pdfPath = "C:\\Users\\lenovo\\working-workspace\\baidu-ocr\\src\\test\\resources\\pdf1.pdf";
	String imgPath = "C:\\Users\\lenovo\\working-workspace\\baidu-ocr\\src\\test\\resources\\pdf1.pdf.png";
	String type = "png";
	String pngPath = PdfUtil.pdf2png(pdfPath, imgPath, type);
	System.out.println(pngPath);
}
}
