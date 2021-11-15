package hello.core.member;

//역할 틀을 만들어준다 = interface
public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
