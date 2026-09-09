package lecture.ex5.gettersetter;
class Cal{
    private String name;
    int result;
    // Alt+Insert > getter 및 setter > 필드 선택 후 확인
//
//    public String getName() {
//        return name;
//    }

    public void setName(String name) {
        if (!name.equals("kim")) //name 이 kim과 다르면
            this.name = name;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}

public class CalTest {
    public static void main(String[] args) {
        Cal c = new Cal();
        // c.name = "lee"; // private 이므로 접근 못함.
        c.setName("lee");
    }
}
