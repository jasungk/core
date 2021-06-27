package hello.core.discount;

import hello.core.member.Member;

// 할인정책이라는 interface 생성
public interface DiscountPolicy {

    /*
    * @return 할인 대상 금액
    * 구현체를 만들러 가자
    * */
    int discount(Member member, int price);

}
