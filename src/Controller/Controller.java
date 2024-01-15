package Controller;

import model.Product;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    public static void ProductMenu() {
        List<Product> productList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM-------");
        System.out.println("Chọn chức năng theo số ( để tiếp tục ");
        System.out.println("1.Xem danh sách");
        System.out.println("2.Thêm mới ");
        System.out.println("3.Cập nhật");
        System.out.println("4.Xoá");
        System.out.println("5.Sắp xếp");
        System.out.println("6.Tìm sản phẩm có giá đắt nhất");
        System.out.println("7.Đọc từ file");
        System.out.println("8.Ghi từ file");
        System.out.println("9.Thoát");
        System.out.println("Chọn chức năng");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                for (Product product : productList) {
                    System.out.println(product);
                }
                break;
            case 2:
                System.out.println("Nhập mã sản phẩm:");
                int id= scanner.nextInt();
                System.out.println("Nhạp tên");
                String name= scanner.nextLine();
                System.out.println("Nhập giá");
                int cost=scanner.nextInt();
                System.out.println("Nhập số lương:");
                int quantity=scanner.nextInt();
                System.out.println("Mô tẩ sản phẩm:");
                String discription= scanner.nextLine();
                Product sp1= new Product(id,name,cost,discription);
                productList.add(sp1);
                break;
//            case 3:
//                break;
//            case 4:
//                break;
//            case 5:
//                break;
//            case 6:
//                break;
//            case 7:
//                break;
//            case 8:
//                break;
//            case 9:
//
//                break;
//
//        }


    }
}
