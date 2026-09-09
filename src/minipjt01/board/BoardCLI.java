package minipjt01.board;

import minipjt01.board.member.MemberService;
import minipjt01.board.post.Post;
import minipjt01.board.post.PostService;

import java.util.Scanner;

public class BoardCLI {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        PostService postService = new PostService();
        Scanner sc = new Scanner(System.in);

        String initMessage = """
                <  게시판메뉴   >
                1. 전체 글 보기
                2. 회원 등록
                3. 글 등록
                4. 글 삭제
                0. 종료
                """;

        postService.loadToFile();
        memberService.loadToFile();

        while (true) {
            System.out.print(initMessage + "메뉴 > ");

            int menu;
            try {
                menu = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력하세요.\n");
                continue;
            }

            if (menu == 1) {
                for (Post p : postService.getPost()) {
                    System.out.println(p.getId() + " / " + p.getTitle()
                            + " / " + p.getWriter().getNickname()
                            + " / " + p.getCreatedAt());
                }

            } else if (menu == 2) {
                System.out.print("이메일 : ");   String email = sc.nextLine();
                System.out.print("비밀번호 : "); String pw = sc.nextLine();
                System.out.print("닉네임 : ");   String nick = sc.nextLine();

                if (memberService.createMember(email, pw, nick) == null) {
                    System.out.println("이미 가입된 이메일입니다.");
                }

            } else if (menu == 3) {
                System.out.print("회원번호 : ");
                Long no = Long.parseLong(sc.nextLine().trim());
                System.out.print("제목 : ");     String title = sc.nextLine();
                System.out.print("내용 : ");     String content = sc.nextLine();

                if (postService.createPost(no, title, content) == null) {
                    System.out.println("존재하지 않는 회원번호입니다.");
                }

            } else if (menu == 4) {
                System.out.print("글번호 : ");
                Long id = Long.parseLong(sc.nextLine().trim());

                if (!postService.deletePost(id)) {
                    System.out.println("존재하지 않는 글번호입니다.");
                }

            } else if (menu == 0) {
                postService.saveToFile();
                memberService.saveToFile();
                break;
            }
        }
    }
}