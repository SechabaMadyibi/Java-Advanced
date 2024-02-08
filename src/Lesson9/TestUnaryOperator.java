package Lesson9;

import Lesson8.SalesTxn;

import java.util.List;
import java.util.function.UnaryOperator;

public class TestUnaryOperator {
    public static void main(String[] args) {
        List<Lesson8.SalesTxn> tList = SalesTxn.createTxnList();
        SalesTxn first  = tList.get(0);
        UnaryOperator <String> uniString = s-> s.toUpperCase();
        System.out.println(uniString.apply(first.getBuyer().getName()));
    }
}
