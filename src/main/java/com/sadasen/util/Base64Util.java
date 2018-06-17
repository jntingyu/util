package com.sadasen.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

import javax.xml.bind.DatatypeConverter;

/**
 * @date 2018年6月17日
 * @author lei.ys
 * @addr company
 * @desc base64工具类
 */
public class Base64Util implements Serializable {

	private static final long serialVersionUID = 440952190428862218L;
	
	private Base64Util() {
	}
	
	/**
	 * byte数组转字符串
	 * @param byteArr
	 * @return
	 */
	public static String byteArrayToString(byte[] byteArr) {
		return DatatypeConverter.printBase64Binary(byteArr);
	}
	
	public static byte[] stringToByteArray(String base64String) {
		return DatatypeConverter.parseBase64Binary(base64String);
	}
	
	public static String fileToBase64String(File file) {
		if(file.isDirectory()) {
			return null;
		}
		byte[] buffer = null;
		FileInputStream fis = null;
		ByteArrayOutputStream bos = null;
		try {
			fis = new FileInputStream(file);
			bos = new ByteArrayOutputStream();
			byte[] b = new byte[1024];
			int n;
			while ((n = fis.read(b)) != -1) {
				bos.write(b, 0, n);
			}
			buffer = bos.toByteArray();
			return byteArrayToString(buffer);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
