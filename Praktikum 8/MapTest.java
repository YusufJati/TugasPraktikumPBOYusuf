/*
 * File         : MapTest.java
 * Deskripsi    : Program yang menggunakan generic untuk pasangan kunci-nilai
 */

import java.util.*;
public class MapTest {
    public static void main(String[] args) {
        // kunci -> integer , nilai -> string
        Map<Integer, String> map = new HashMap<Integer, String>();
        // menempatkan elemen ke map
        map.put(1, "Hello");
        map.put(2, "World");
        map.put(3, "!");
        // mengambil elemen pertama
        System.out.println(map.get(1));
        // mengambil keseluruhan
        Set<Integer> keys = map.keySet();
        // iterasi pada keseluruhan elemen
        for (Integer key : keys) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
