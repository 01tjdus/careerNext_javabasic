package minipjt01.board.post;

import minipjt01.board.member.Member;
import minipjt01.board.member.MemberRepository;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class PostService {
    MemberRepository memberRepository = new MemberRepository();
    PostRepository postRepository = new PostRepository();

    // 게시글 등록 (DTO 버전)
    public Long createPost(Long memberId, PostRequestDto dto) {
        return createPost(memberId, dto.getTitle(), dto.getContent());
    }

    // 게시글 등록 (CLI 버전)  ← BoardCLI가 부르는 것
    public Long createPost(Long memberId, String title, String content) {
        Member writer = memberRepository.findById(memberId);
        if (writer == null) {
            return null;   // 없는 회원번호
        }

        Post post = new Post();
        post.setId((long)(postRepository.findAll().size() + 1));
        post.setWriter(writer);
        post.setTitle(title);
        post.setContent(content);

        postRepository.save(post);
        return post.getId();
    }

    // 글번호로 게시글 검색
    public Post getPost(Long postId) {
        return postRepository.findById(postId);
    }

    // 전체 글 (삭제되지 않은) 검색
    public ArrayList<Post> getPost() {
        return postRepository.findAll().stream()
                .filter(post -> !post.isDeleted())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // 키워드로 글 (삭제되지 않은) 검색
    public ArrayList<Post> getPost(String keyword) {
        return postRepository.findTitleContaining(keyword).stream()
                .filter(post -> !post.isDeleted())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // 글 삭제 (소프트 삭제)
    public boolean deletePost(Long postId) {
        Post post = postRepository.findById(postId);
        if (post == null) {
            return false;
        }
        post.setStatus(PostStatus.DELETED);
        return true;
    }

    // 파일 저장/불러오기 통로  ← BoardCLI가 부르는 것
    public boolean saveToFile() {
        return postRepository.saveToFile();
    }

    public boolean loadToFile() {
        return postRepository.loadToFile();
    }
}