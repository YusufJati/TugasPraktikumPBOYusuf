/*
 * Nama File          : ArrayListTest.java
 * Tanggal            : 17 Mei 2023
 * Deskripsi          : Program penggunaan objek arraylist sebagai collection class
 */

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // inisialisasi arraylist
        ArrayList<String> strings = new ArrayList<String>();
        // menambahkan elemen ke arraylist
        strings.add("Hello");
        strings.add("World");
        strings.add("!");
        // menghapus elemen dari arraylist
        strings.remove(2);
        // iterasi  pada keselurhunan elemen arraylist
        for (String s : strings) {
            System.out.println(s + " ");
        }
    }
}