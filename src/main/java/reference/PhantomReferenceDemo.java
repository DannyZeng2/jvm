package reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * @version: 1.0.0
 * @Author: Danny Zeng
 * @Date: 2021/3/25 23:56
 * @LastEditors: Danny Zeng
 * @LastEditTime: 2021/3/25 23:56
 */
public class PhantomReferenceDemo {
    private static final ReferenceQueue<Demo> QUEUE = new ReferenceQueue<>();
    public static void main(String[] args) {
        PhantomReference<Demo> demo = new PhantomReference<>(new Demo(),QUEUE);
        System.out.println(demo.get());
    }
}
