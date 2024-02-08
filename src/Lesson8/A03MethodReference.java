package Lesson8;

import java.util.List;
import java.util.function.Predicate;

public class A03MethodReference {
    public static void main(String[] args) {
        List <SalesTxn> tlist = SalesTxn.createTxnList();
        System.out.println("Ca transactions Lambda");
        Predicate<SalesTxn> transCA = t -> t.getState().equals(State.CA);
        tlist.stream()
                .filter(transCA)
                .forEach(t -> t.printSummary());
    }
}
