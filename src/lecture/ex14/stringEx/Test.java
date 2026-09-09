package lecture.ex14.stringEx;

public class Test {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = "Hello";
        String s3 = "Hello";
        System.out.println(s1 == s2);//false       //부정확한 결과 나올 수 있음
        System.out.println(s3 == s2);       //문자열 비교 시 == 쓰면 안됨.
        System.out.println(s1.equals(s2)); //문자열 비교 시 equals써야함
        System.out.println(s3.equals(s2));

        String str1 = "Hi~ Java World";
        String[] strs = str1.split(" ");

        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }

        String str2 = "aaa:bbb:ccc";
        strs = str2.split(":");

        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);

        }
    }
}
