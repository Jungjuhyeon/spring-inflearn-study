package inflearn.core.discount;

import inflearn.core.member.Grade;
import inflearn.core.member.Member;

public class FixDiscountPolicy implements  DiscountPolicy{

    private int disccountFixAmount = 1000;//1000원할인
    @Override
    public int discount(Member member, int price) {

        if (member.getGrade() == Grade.VIP)
            return disccountFixAmount;
        else{
            return 0;
        }
    }

}
