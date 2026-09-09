package lab.Test4;
/*
ArrayList<Integer>에 점수 5개를 add()로 추가하세요.
set()으로 특정 인덱스의 값을 수정하고, 값(값 자체)을 기준으로 remove()로 하나를 제거하세요.
for-each로 순회하며 합계를 구해 평균을 출력하세요.
ArrayList객체.remove(int index)는 인덱스 기반, remove(Object o)는 값 기반으로 동작합니다.
정수를 값으로 지우려면 remove(92)처럼 쓰면 인덱스 92로 오해되어 오류가 나므로, Integer.valueOf(92)로 오토박싱해 값 기반 remove를 호출해야 합니다.
ArrayList객체.set(1,100)  은 ArrayList객체의 1번 인덱스의 값을 100으로 수정하는 것입니다.
 */
import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
       System.out.println("합계: " + sum);
//        System.out.println(arr);
//        System.out.println(arr.remove(7));
    }
}
