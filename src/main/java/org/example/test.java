package org.example;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.security.SecureRandom;

public class test {
    /**
     * 使用AES算法加密字符串
     *
     * @param str 待加密的原始字符串
     * @param str2 用于生成密钥的种子字符串
     * @return 加密后的十六进制字符串，如果加密失败则返回空字符串
     */
    public  static String encrypt(String str,String str2) {
        try {
            // 初始化AES密钥生成器
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");

            // 使用种子初始化随机数生成器
            secureRandom.setSeed(str2.getBytes());
            keyGenerator.init(128,secureRandom);

            // 生成AES密钥
            SecretKeySpec secretKeySpec = new SecretKeySpec(keyGenerator.generateKey().getEncoded(), "AES");

            // 初始化加密器
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(1, secretKeySpec);

            // 执行加密并转换为十六进制字符串
            return DatatypeConverter.printHexBinary(cipher.doFinal(str.getBytes()));
        }catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * 测试加密函数
     */
    public static void main(String[] args) {
        // 生成包含时间戳的测试数据并加密
        System.out.println(encrypt("1;1;"+System.currentTimeMillis(),"5d116b4a-40db-4e"));
    }
}
