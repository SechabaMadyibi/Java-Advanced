package Lesson8;

import java.util.List;

public class A04IterationTest {
    public static void main(String[] args) {
        List<SalesTxn> tList = SalesTxn.createTxnList();
        System.out.println("CA transactions for acme using two filters");

        tList.stream()
                .filter(t->t.getState().equals(State.CA))
                .filter(t-> t.getBuyerName().equals("Acme Electronics"))
                .forEach(SalesTxn::printSummary);

        System.out.println("===Logical filter===");

        tList.stream()
                .filter(t-> t.getBuyerName().equals("Acme Electronics") && t.getState().equals(State.CA))
                .forEach(SalesTxn::printSummary);

    }
}
