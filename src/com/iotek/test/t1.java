package com.iotek.test;

import java.math.BigInteger;
import java.security.MessageDigest;

public class t1 {
	public static void main(String[] args) {
		String str="123";
		System.out.println(str.getBytes());
	}

	public String getMD5 (String str) {
		try {
			// ����һ��MD5���ܼ���ժҪ
			MessageDigest md = MessageDigest.getInstance("MD5");
			// ����md5����
			md.update(str.getBytes());
			//update����������ʹ��ָ�����ֽڸ���ժҪ��
			// digest()���ȷ������md5 hashֵ������ֵΪ8Ϊ�ַ�������Ϊmd5 hashֵ��16λ��hexֵ��ʵ���Ͼ���8λ���ַ�
			// BigInteger������8λ���ַ���ת����16λhexֵ�����ַ�������ʾ���õ��ַ�����ʽ��hashֵ
			return new BigInteger(1, md.digest()).toString(16);
			//ͨ��ִ���������֮������ղ�����ɹ�ϣ���㡣
			//digest(byte[] buf, int offset, int len) 
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
}