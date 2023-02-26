package hello.spring_core_basic.discount;

import hello.spring_core_basic.Member;

public interface DiscountPolicy {

    //할인금액
    int discount(Member member, int price);
}
