package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDisscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    // orderService는 2개가 필요한데
    // 1. 멤버리파지토리에서 회원을 찾기
    // 2. 할인정책 필요. 그중에 고정할인정책으로 객채구현
    // 할인 정책을 변경하려면 클라이언트인 "orderServiceImpl" 코드를 고치면된다.
    // 아래는 추상에도 의존하고 구체에도 의존해서 DIP 위반이다.
    // 그래서 아래와 같이 변경했지만 구체가 없어 NPE 에러가 났다.
    // *해결방안*
    // 누군가가 클라이언트인 'orderServiceImple'에 'DiscountPolicy'의 구현 객체를 대신 생성하고
    // 주입해야 한다.
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private DiscountPolicy discountPolicy;


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
