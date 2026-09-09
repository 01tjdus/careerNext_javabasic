package ex18.enumEx;
class OrderStatus1{
    public static int PAID = 0;
    public static int DELIVERED = 1;
    public static int COMPLETED = 2;
}
enum OrderStatus2{
    PAID,DELIVERED,COMPLETED;
}

public class EnumTest {
    public static void main(String[] args) {
        OrderStatus2 orderStatus2 = OrderStatus2.DELIVERED;
        int orderState1 = OrderStatus1.DELIVERED;
        int orderState = 3; // enum이라서 컴파일 오류 못찾음
        System.out.println(OrderStatus1.PAID);
        System.out.println(OrderStatus2.PAID);
    }
}
