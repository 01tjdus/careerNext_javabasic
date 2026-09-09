package lecture.ex11.bb;

import lecture.ex11.aa.Person2;

public class Child extends Person2 {
  void m(){
      //data2 = 10;
      //Child는 Person2와 동일팩키지에 있는 클래스가아니므로 컴파일오류

      data3 = 10;
  }
}
