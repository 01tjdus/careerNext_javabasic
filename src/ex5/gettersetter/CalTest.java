package ex5.gettersetter;

import javax.xml.namespace.QName;

class Cal {
    String name;
    int result;
    public int getResult(){   //get 필드명
        return result;
    }

    public void setResult(int result) {    //set 필드명
        this.result = result;
    }

//    public String getName() {
//        return name;
//    } 쓸수만 있게 하는 용ㅇ도

    public void setName(String name) {
        if(!name.equals("kim")) //name이 kim과 다른 경우만 반환
            this.name = name;
    }
}

public class CalTest {
    public static void main (String[] args){
        Cal c = new Cal();
       // c.name = "lee"; //private이므로 접근 못함
        c.setName("lee");
    }
}
