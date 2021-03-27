package reference;

import java.lang.ref.WeakReference;

/**
 * @version: 1.0.0
 * @Author: Danny Zeng
 * @Date: 2021/3/25 23:51
 * @LastEditors: Danny Zeng
 * @LastEditTime: 2021/3/25 23:51
 */
public class WeakReferenceDemo {
    public static void main(String[] args) {
        WeakReference<Demo> demo = new WeakReference<>(new Demo());
        System.out.println(demo.get());
        System.gc();
        System.out.println(demo.get());
    }
}
