package rikkei;

import java.util.ArrayList;
import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
//MyList<Integer> myList = new MyList<>();
//myList.add(1);
//myList.add(2);
//        System.out.println(myList);
//        System.out.println(myList.isEmty());

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(0,9);
        arrayList.add(1,5);
        System.out.println("contains " + arrayList.contains(-1));// tim xem phan tu co trong danh sach hay khong
//        arrayList.clear(); // xoa tat ca danh sach
        arrayList.remove( 1);// xoa vi tri index phan tu trong danh sach
        System.out.println("get " + arrayList.get(3)); // hien thi vi tri index trong danh sach
        System.out.println("size " + arrayList.size());// hien thi so luong phan tu trong danh sach
//        arrayList.ensureCapacity(2);
        System.out.println("danh sach " + arrayList);// hien thi cac phan tu trong danh sach
        System.out.println("clone " + arrayList.clone());// sap chep toan bo danh sach

        System.out.println("kiem tra rong " + arrayList.isEmpty());// kiem tra danh sach rong

    }
}
