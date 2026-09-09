package minipjt01.board.member;

import java.util.ArrayList;

public class MemberService {
    MemberRepository memberRepository = new MemberRepository();

    // 회원 등록 (CLI 버전)  ← BoardCLI가 부르는 것
    public Long createMember(String email, String password, String nickname) {
        if (memberRepository.findByEmail(email) != null) {
            return null;   // 이메일 중복
        }

        Member member = new Member();
        member.setId((long)(memberRepository.findAll().size() + 1));
        member.setEmail(email);
        member.setPassword(password);
        member.setNickname(nickname);

        memberRepository.save(member);
        return member.getId();
    }

    // 회원 등록 (DTO 버전)
    public Long createMember(MemberRequestDto dto) {
        return createMember(dto.getEmail(), dto.getPassword(), dto.getNickname());
    }

    // 회원번호로 회원 검색
    public Member getMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    // 이메일로 회원 검색
    public Member getMember(String email) {
        return memberRepository.findByEmail(email);
    }

    // 전체 회원 검색
    public ArrayList<Member> getMember() {
        return memberRepository.findAll();
    }

    // 파일 저장/불러오기 통로  ← BoardCLI가 부르는 것
    public boolean saveToFile() {
        return memberRepository.saveToFile();
    }

    public boolean loadToFile() {
        return memberRepository.loadToFile();
    }
}