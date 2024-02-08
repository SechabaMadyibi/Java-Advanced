package Lesson9;

import Lesson8.SalesTxn;

import java.util.List;
import java.util.function.BiPredicate;

public class TestBiPredicate {
    public static void main(String[] args) {
        List<Lesson8.SalesTxn> tList = Lesson8.SalesTxn.createTxnList();
        SalesTxn first  = tList.get(0);
        String testState ="CA";

        BiPredicate<SalesTxn, String> stateBiPredicate = (t,s)-> t.getState().getStr().equals(s);
        System.out.println("check if first is CA");
        System.out.println(stateBiPredicate.test(first, testState));

    }
}
