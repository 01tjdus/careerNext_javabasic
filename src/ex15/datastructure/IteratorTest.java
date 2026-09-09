package ex15.datastructure;
import com.sun.source.tree.Tree;

import java.util.*;

class A{
    int i;
    public String toString() {
        return "" + i;
    }
}

public class IteratorTest {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        A aaa = new A(); aaa.i = 10;
        hs.add(aaa);
        hs.add(aaa);
        hs.add(1);// 저장한 순서대로 저장되진 않음
        // set은 같은 객체를 두번 저장해도 한번만 저장됨
        // set은 순서가 없어서 인덱스가 없음
        visitAll(hs);
        hs.forEach(System.out::println);//알아서 두번 실행해주는 ex)1 10 1 10


        TreeSet ts = new TreeSet(new Comparator<A>() {
            @Override
            public int compare(A o1, A o2) {
                return o1.i - o2.i;
            }
        });

        ts.add(aaa);// Comparator 타입의 사용자 정의 클래스는 비교 메소드를 제공 해야함
        ts.add(aaa);
//        ts.add(10);
//        ts.add(5);
//        ts.add(5);
//        ts.add(1);// 정렬 방법을 제공해줘야 오류가 안남

        visitAll(ts);
        System.out.println("===========");
        ts.forEach(System.out::println);

        ArrayList arr = new ArrayList();

        arr.add(10);
        arr.add(5);
        arr.add(5);
        arr.add(1);// list는 저장한 순서대로 저장됨.

        visitAll(arr);
        System.out.println("===========");
        arr.forEach(System.out::println);
    }

    public  static void visitAll(Collection ccc){
        Iterator iii = ccc.iterator();

        while (iii.hasNext()) {
            System.out.println(iii.next());
        }
    }
}
