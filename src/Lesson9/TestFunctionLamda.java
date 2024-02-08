package Lesson9;

import Lesson8.SalesTxn;

import java.util.List;
import java.util.function.Function;

public class TestFunctionLamda {
    public static void main(String[] args) {
        List<Lesson8.SalesTxn> tList = SalesTxn.createTxnList();
        SalesTxn first = tList.get(0);
        Function<SalesTxn,String> buyerFunction = t-> t.getBuyer().getName();
        System.out.println("Buyer for first transaction "+ buyerFunction.apply(first));
    }
}
