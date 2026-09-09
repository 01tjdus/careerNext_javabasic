package minipjt01.board.post;
import minipjt01.board.member.Member;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.*;

public class PostRepository {

    //게시판 글을 저장하는 자료구조
    private static final ArrayList<Post> board = new ArrayList<>();


    //게시글 번호로 게시글 검색(try-catch 로 변환 하는 이유는 단순히 long으로 변환하면 프로그램이 죽음. 따라서 try-catch문으로 보완)
    //try-catch는 주로 변환할때 사용
    public Post findById(Long postId) {
        if (postId == null) return null;

        for (Post p : board) {
            if (postId.equals(p.getId())) {
                return p;
            }
        }
        return null;
    }

    //전체 글 검색
    public ArrayList<Post> findAll(){
        return board;
    }

    //게시글 등록
    boolean save(Post post){
        if(post != null){
            board.add(post);
            return true;
        }
        return false; // 게시글 등록을 성공하면 true를 리턴해야 합니다.
    }

    // 제목에 매개인자의 키워드가 포함된 경우의 게시글 목록(저장 공간)
    ArrayList<Post> findTitleContaining(String keyword){
        ArrayList<Post> result = new ArrayList<>();
        for(Post p : board){
            if(p.getTitle().contains(keyword)){
                result.add(p);
            }
        }
            return result;
        }


    // 파일에 board(게시판 글을 저장하는 자료구조)즉,ArraryList 객체를 저장합니다.
    //(참고, ArraryList 객체 하나만 객체 직렬화해서 파일에 저장하면 그 안의 모든 post 객체가 같이 저장됨/

    boolean saveToFile(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("post.bin"))) {
            oos.writeObject(board);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    boolean loadToFile(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("post.bin"))) {
            ArrayList<Post> loaded = (ArrayList<Post>) ois.readObject();
            board.clear();
            board.addAll(loaded);
            return true;
        } catch (IOException | ClassNotFoundException e) {
            return false;
        }
    }

}
