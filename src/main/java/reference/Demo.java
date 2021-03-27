package reference;

/**
 * @version: 1.0.0
 * @Author: Danny Zeng
 * @Date: 2021/3/25 23:21
 * @LastEditors: Danny Zeng
 * @LastEditTime: 2021/3/25 23:21
 */
public class Demo {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize...");
    }
}
