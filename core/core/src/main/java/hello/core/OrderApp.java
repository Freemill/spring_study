package hello.core;

import hello.core.member.*;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        Member member = new Member(1L, "memberA", Grade.VIP);
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();
        memberService.join(member);

        Order orderA = orderService.createOrder(1L, "orderA", 10000);


    }
}
