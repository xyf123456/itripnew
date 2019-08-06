package cn.itrip.trade.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *  支付宝手机网站接入配置信息
 * @author hduser
 *
 */
@Component
public class AlipayConfig {

	/**
	 * 商户appid,应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	 */
	private String appID="2016100100639514";
	/**
	 * 应用私钥 pkcs8格式的
	 */
	private String rsaPrivateKey="MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCRYDEBwZt0QEZ295YcOu51Pja2fV3z29Nu9c9+cCQv7kTvZgkhJAzG6lp7ddzzdKKxZ1RrkG3WlZub8gMgeLQ488upS6UnnBK1aJBCcHbPlq5lkTlFVayRDbvmKqcJyYrgpoHKGEBM7vM4ZjTGLshSLy7wrFgDjNn9ID1GqqBL98l1fYiFEZcvkNvps63cQuLrZc3sr0EK9tmJbX4F9TLfmJ4yDaivliPo4ghn6N2MGPrHjUwKzoVawYqBpqJ2ClkjvP5Q/EejMVbnIRE+3hOjoH48+05aN8NOIS943yCmzXopDIb1fSOZveD8hpMgLAl+qVAtVcVW3okKmz3SCV4bAgMBAAECggEAQRyNNpUpdDrplJU1tXUronV3+epSr0sw+sy734yImLMmSvcvdZl444rJdeyHRr9hswVtyTOKDoc5h/IwNlX5mlyPRkcsNH5x3rBzlF5cyINbnwAZX5WM0fcNxnwqDncnbZEGJqcP/aU0aHlWf8EqVazuYDtAvG5UoEvVRhZb70ng3vzAzjOhPdv+wUqwxv20oycJTnwU9EvAN3IXHd5MMMRG1WQy/hU4z5uEU5Q5Lwz4nZ/up2KF1AsXS/wDY/qrZe4UBZy8ishfJgVkHtwbChoB9Nhw6Oz6FtJ5TM3zHAkksayOeKzjzPnbmKcalXl6LegK70mh2A3/eMj50P58eQKBgQDaSVLvp2KQ5ekdQEFExed/P1ozu2kdB/266XvSkt0rJZQ68EDw17jmHlwwbL6ivh6VSAxN9AkAcaKVakzQxXzs8JwkmBRYurzXkbo+32Oi2Sbh/AZEK19oixq9gBCefdlBLtifgwIT+lIyvfEfd9dl+FWXHxK5532EUrayRrwmvwKBgQCqfhKUg6y+kTHuLrTXS0Y+Pa20FPO+23M///2LHGP8DE71mv5QQ95VHRpnruZnvmQ+G15QT9Ed59kqYx6xe0OVcmOu5OGrft/OcTWmLedayPLJDFrUZQ76CMP4LL2W8XmMooYpznZh1z2gY/C18a1h3dGFqE/s0R8SNlc+eSHbpQKBgHGpTnslkGhcnuaxR4sU9bbHeSOIyXHpcE/8NZJvEKTf23BZG6eM3GVOl7hLV3SMRIZ8zpNkp69IfF0KzdbDjoodu2A+pBGTorMo2W7ViR8JrXpsbaLfZr2b+R+FaKHua8rKJtfgMpvOczCiwMQe9dTN21tmPaz5gdz96M2pkV0nAoGAciEJERAAMGWD1hzABCsor3ucbyNjc4z13o7fzCLKL6yRosoJmfOEvtdHmMa1CBekhQrPHNYBd5J/hmdp4YdRW5aCck5XXvUEnu6b6k1qRRSlqb4yg2HPH8OEY/qXQ5cMNf+J7ix+hMqQP3EHbtSEqzHREzbzoeTvdsKXroNqDd0CgYApn4vZ4Hnyp8iXAiqDX646XcRuZ675C7FlaQjSOwbZ+XqW1aBCwDWE+3r6M7hZ7qqZWp5AnBYmNO+INyst4F6CF6X8BMCftpSClv7no0XYCmFfJgU3Go2FcverjX4smhWXaKHgMtQTrDpbbc51Idq9hWClPQwQS1o0gpHRnbVxLQ==";
	/**
	 * 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	 */
	private String notifyUrl="http://192.168.3.175:8083/trade/api/notify";
	/**
	 * 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
	 */
	private String returnUrl="http://192.168.3.175:8083/trade/api/return";
	/**
	 * 请求网关地址(支付宝的网关)
	 */
	private String url="https://openapi.alipaydev.com/gateway.do";
	/**
	 * 编码
	 */
	private String charset="UTF-8";
	/**
	 * 返回格式
	 */
	private String format="json";
	/**
	 * 支付宝公钥,支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm
	 * 对应APPID下的支付宝公钥。，这些就是我们刚才设置的
	 */
	private String alipayPublicKey="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApTrHU9qdXXpflEYBTHSzG0KuNJ1G2WZ4uvcabOZrxapSX2/rlb3ovdZDIWT/LBacxv5Way6HKtbduZIWETTkYlIaRFhwfoVBBnvVq7d9vSCbiI9EAyhvRwBeMNamiNVHpimL/rBMaFMjVbPwKFoY0NtDXRhzo/psmTafXfnK1kCgM4N2VUQ8Q7rKkNXrSDaxQwyVY9FiKyM0SPcatgFD0QYWRyN+lhZ5rF4aA13cOJdVpjIpMxTv4OHHIgZrZqzlic++QRWUg9V825WEzU6jvfsDZFPpO+qS7h5J3ZPA2/wPqnjCuNk4t09q0D7rbnSW5kbAhSDAnbD/lCGTc1t56QIDAQAB";
	/**
	 * 日志记录目录
	 */
	private String logPath="/logs";
	/**
	 * RSA2
	 */
	private String signType="RSA2";
	
	///////////////////////////////////////////支付结果显示
	/**
	 * 支付成功跳转页面
	 */
	private String paymentSuccessUrl;
	/**
	 * 支付失败跳转页面
	 */
	private String paymentFailureUrl;
	///////////////////////////////////////////支付结果显示
	
	public String getAppID() {
		return appID;
	}
	public void setAppID(String appID) {
		this.appID = appID;
	}
	public String getRsaPrivateKey() {
		return rsaPrivateKey;
	}
	public void setRsaPrivateKey(String rsaPrivateKey) {
		this.rsaPrivateKey = rsaPrivateKey;
	}
	public String getNotifyUrl() {
		return notifyUrl;
	}
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
	public String getReturnUrl() {
		return returnUrl;
	}
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCharset() {
		return charset;
	}
	public void setCharset(String charset) {
		this.charset = charset;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getAlipayPublicKey() {
		return alipayPublicKey;
	}
	public void setAlipayPublicKey(String alipayPublicKey) {
		this.alipayPublicKey = alipayPublicKey;
	}
	public String getLogPath() {
		return logPath;
	}
	public void setLogPath(String logPath) {
		this.logPath = logPath;
	}
	public String getSignType() {
		return signType;
	}
	public void setSignType(String signType) {
		this.signType = signType;
	}
	
	public String getPaymentSuccessUrl() {
		return paymentSuccessUrl;
	}
	public void setPaymentSuccessUrl(String paymentSuccessUrl) {
		this.paymentSuccessUrl = paymentSuccessUrl;
	}
	public String getPaymentFailureUrl() {
		return paymentFailureUrl;
	}
	public void setPaymentFailureUrl(String paymentFailureUrl) {
		this.paymentFailureUrl = paymentFailureUrl;
	}
}
