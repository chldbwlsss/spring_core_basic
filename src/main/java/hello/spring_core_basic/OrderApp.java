package hello.spring_core_basic;

import hello.spring_core_basic.order.Order;
import hello.spring_core_basic.order.OrderService;

public class OrderApp {

    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "youjin", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "tumbler", 10000);

        System.out.println("order = " + order);

    }
}
