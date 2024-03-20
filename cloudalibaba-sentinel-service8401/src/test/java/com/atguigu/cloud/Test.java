package com.atguigu.cloud;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author weihanqiang
 * @date 2024/3/18
 */
public class Test {
    @org.junit.jupiter.api.Test
     void Test1() {
        List<String> list = new ArrayList<>();
        List<String> synchronizedList = Collections.synchronizedList(list);

        // 同步块确保线程安全
        synchronized (synchronizedList) {
            for (int i = 0; i < 10; i++) {
                synchronizedList.add("Element " + i);
            }

            Iterator<String> iterator = synchronizedList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
}
