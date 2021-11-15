package hello.core.member;

//역할 틀을 만들어준다 = interface
public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);

}
