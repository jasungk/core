package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {
    // 저장소니까 Map 사용
    // 동시성 이슈 조심
    private static Map<Long, Member> store = new HashMap<>();


    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        // findById 하면 store에서 get memberId 해서
        //   파라미터에 넣어서 아이디 찾기
        return store.get(memberId);
    }
}
