//package lab.Test4;
///*
//1. 상품 번호, 상품 이름, 가격을 생성자의 매개변수로 받는 Product 클래스 생성합니다.
//    ex) new Product(101, "노트북", 1200000 );
//2. 5개의 상품 객체를 임의로 생성하세요.
//3. ProductService 클래스에  HashMap 객체에  상품의  상품번호를 Key로 상품 객체를 Value로 관리하는 프로그램을 작성합니다.
// 이 클래스에  다음 기능을 각각 메소드로 구현 하세요.
//상품 등록 / 상품번호로 상품 조회 / 상품 삭제 / 전체 상품 출력
// */
//import java.util.*;
//
//public class Product {
//    // 필드 3개 (상품번호, 이름, 가격)
//    private class productNo;
//    private class name;
//    private class price;
//
//    // 생성자
//    public Product(int productNo, String name, int price) {
//        this.productNo = _______;
//        this.name = _______;
//        this.price = _______;
//    }
//
//    // getter (상품번호는 Key로 쓰니까 필요)
//    public int getProductNo() {
//        return _______;
//    }
//
//    // 전체 출력할 때 사용
//    @Override
//    public String toString() {
//        return "번호: " + productNo + ", 이름: " + name + ", 가격: " + ;
//    }
//}
//
//public class HashMapTest {
//    public static void main(String[] args) {
//        ProductService service = new ProductService();
//
//        service.register(new Product(101, product, 1200000));
//        service.register(new Product(102, "핸드폰", 10000000));
//        service.register(new Product(103, "TV", 1234500000));
//        service.register(new Product(104, "마우스", 30000));
//        service.register(new Product(105, "에어팟", 12345670));
//    }
//}
