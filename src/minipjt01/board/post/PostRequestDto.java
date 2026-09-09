package minipjt01.board.post;

public class PostRequestDto {
    private String title; //글제목
    private String content;  //글내용

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
