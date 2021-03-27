package reference;

import java.io.IOException;

/**
 * @version: 1.0.0
 * @Author: Danny Zeng
 * @Date: 2021/3/25 23:19
 * @LastEditors: Danny Zeng
 * @LastEditTime: 2021/3/25 23:19
 */
public class NormalReferenceDemo {
    public static void main(String[] args) throws IOException {
        Demo demo = new Demo();
        demo = null;
        System.gc();
        System.in.read();
    }
}
