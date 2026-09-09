package lecture.ex15.datastructure;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList  arr = new ArrayList ();
        //arr.add(2) ;
        arr.add("test") ;

        for(int i = 0 ; i < arr.size(); i++){
            Object o = arr.get(i);

            System.out.println( arr.get(i) );
        }
        arr.forEach(System.out::println);

        ArrayList<String> a = m();
        String o =   a.get(0);

    }
    static ArrayList<String> m() {
        ArrayList<String> a = new ArrayList<String>();
        a.add("aa");
        return a;
    }
}
