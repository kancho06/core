package hello.core.member;

import java.util.HashMap;
import java.util.Map;

//인터페이스의 구현체 = 구체적인 자동차 (ex. 아반떼, 벤츠)
public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
