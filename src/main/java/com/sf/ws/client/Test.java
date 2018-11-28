package com.sf.ws.client;

public class Test {
	public static void main(String[] args) throws WSException {
		UploadImageActionService uas = new UploadImageActionService();
		IUploadImageAction ua = uas.getUploadImageActionPort();
		WaybillImageStream imageStream = new WaybillImageStream();
		String ip = "";
		byte[] passWord = "".getBytes();
		ua.uploadImage(imageStream, ip, passWord);
	}
}
