package ex15.datastructure;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        String name = "Jennie";
        hm.put(name, 100);
        hm.put("lisa", 90);
        hm.put("lisa",80);

        System.out.println(hm.get(name));
        System.out.println(hm.get("lisa"));//lisa로 두번 저장해도 한번만 나옴
    }
}
interface I{
    public void m(); // interface는 자동으로 public abstract
}
class AA implements I{
    public void m(){
        System.out.println("m");
    }
}