//package ex16.streamEx;
//
//import java.util.List;
//import java.util.Arrays;
//
//public class StreamTest
//{
//    public static void main(String[] args)
//    {
//        List<String> names = Array.asList("홍길동", "김철수", "이영희", "박밍수", "김영희","금희");
//        names.stream()
//                .filter(name -> name.strartsWith("김"))
//                .forEach(System.out::println);
//        names.stream()
//                .filter(name -> name.startsWith(("김")))
//                .count();
//        System.out.println(count);
//        //이름이 희로 끝나는 사람의 이름 글자가 3이상이면 "이름 글자 수"출력
//        names.stream()
//                .filter(name -> name.endsWith("희"))
//                .map(String::length)
//                .filter(cnt -> cnt >= 3)
//                .forEach(System.out::println);
//    }
//}
