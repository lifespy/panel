package com.not404.panel.utils;

import com.not404.panel.domain.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 加密工具类
 * @author dalong
 * @since 2018年6月23日
 *
 */
public class HEX {

    private final static Logger logger = LoggerFactory.getLogger(UserDto.class);

    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String s = encode2SHA256("asd");
        System.out.println(s);
    }


    public static String encode2SHA256(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String result = "";
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes("UTF-8"));
            result = byte2Hex(messageDigest.digest());
        } catch (NoSuchAlgorithmException e1) {
            logger.error("加密数据出现异常！");
            e1.printStackTrace();
            throw e1;
        } catch (UnsupportedEncodingException e2) {
            logger.error("加密数据出现异常！");
            e2.printStackTrace();
            throw e2;
        }

        return result;
    }

    /**
     * 将byte转为16进制
     * @param bytes
     * @return
     */
    private static String byte2Hex(byte[] bytes){
        StringBuffer stringBuffer = new StringBuffer();
        String temp = null;
        for (int i=0;i<bytes.length;i++){
            temp = Integer.toHexString(bytes[i] & 0xFF);
            if (temp.length()==1){
                //1得到一位的进行补0操作
                stringBuffer.append("0");
            }
            stringBuffer.append(temp);
        }
        return stringBuffer.toString();
    }


    private HEX() {
    }
}
