package test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {


    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();

        map.put("111",1);
        map.put("222",2);
        map.put("333",3);
    }
}
