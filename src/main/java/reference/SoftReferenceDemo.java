package reference;

import java.lang.ref.SoftReference;

/**
 * @version: 1.0.0
 * @Author: Danny Zeng
 * @Date: 2021/3/25 23:27
 * @LastEditors: Danny Zeng
 * @LastEditTime: 2021/3/25 23:27
 */
public class SoftReferenceDemo {
    public static void main(String[] args) {
        SoftReference<byte[]> sf = new SoftReference<>(new byte[1024*1024*10]);
        System.out.println(sf.get());
        System.gc();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(sf.get());
        byte[] b = new byte[1024*1024*15];
        System.out.println(sf.get());
    }
}
