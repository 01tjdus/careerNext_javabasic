package minipjt01.board.member;

//회원가입시 사용자에게 입력받은 값을 담는 클래스
public class MemberRequestDto {
    private String email;
    private String password;
    private String nickname;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

}
