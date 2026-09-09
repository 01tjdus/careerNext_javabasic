package minipjt01.board.member;

import minipjt01.board.post.Post;
import java.io.*;
import java.util.ArrayList;

public class MemberRepository {

    //회원들을 저장하는 자료구조
    private static final ArrayList<Member> members = new ArrayList<>();

    //회원 번호로 회원 검색
    public Member findById(Long memberId){
        if (memberId == null) return null;

        for(Member m : members){
            if (memberId.equals(m.getId())){
                return m;
            }
        }
        return null;
    }

    //전체 회원 검색
    public ArrayList<Member> findAll(){
        return members;
    }

    //회원 등록
    boolean save(Member member){
        if(member != null){
            members.add(member);
            return true;
        }
        return false;
        // 회원 등록을 성공하면 true를 리턴해야 합니다.
    }

    //회원 이메일로 회원 검색
    public Member findByEmail(String email){
        for(Member m : members){
            if(m.getEmail().equals(email)){
                return m;
            }
        }
        return null;
    }

    // 파일에 members  즉,  ArraryList 객체를 저장합니다.
    //(참고, ArraryList 객체 하나만 객체 직렬화해서 파일에 저장하면 그 안의 모든 member 객체가 같이 저장됨
    boolean saveToFile(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("member.bin"))){
            oos.writeObject(members);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    boolean loadToFile(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("member.bin"))) {
            ArrayList<Member> loaded = (ArrayList<Member>) ois.readObject();
            members.clear();
            members.addAll(loaded);
            return true;
        } catch (IOException | ClassNotFoundException e) {
            return false;
        }
    }
}
