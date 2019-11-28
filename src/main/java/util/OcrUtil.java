package util;

import java.io.File;
import java.util.HashMap;

import org.json.JSONObject;

import com.baidu.aip.ocr.AipOcr;

public class OcrUtil {
	// 设置APPID/AK/SK  这些值从百度云获取 免费的可以调用5万次/天
	private static final String APP_ID = "";
	private static final String API_KEY = "";
	private static final String SECRET_KEY = "";
	// 初始化一个AipOcr
	private static AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

	public static String parseImg(String path) {
		File file = new File(path);
		if(!file.isFile()) {
			System.out.println("log ::: not a file");
			return null;
		}

		// 可选：设置网络连接参数
		client.setConnectionTimeoutInMillis(2000);
		client.setSocketTimeoutInMillis(60000);

		// 可选：设置代理服务器地址, http和socket二选一，或者均不设置
		// client.setHttpProxy("proxy_host", proxy_port); // 设置http代理
		// client.setSocketProxy("proxy_host", proxy_port); // 设置socket代理

		// 可选：设置log4j日志输出格式，若不设置，则使用默认配置
		// 也可以直接通过jvm启动参数设置此环境变量
		// System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");

		// 调用接口

		JSONObject res = client.basicGeneral(path, new HashMap<String, String>());
		return res.toString(2);
	}

}
