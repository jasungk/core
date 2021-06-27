package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class RateDisscountPolicy implements DiscountPolicy{

    // 할인금액 10% 설정
    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        // enum
        if(member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }
}
