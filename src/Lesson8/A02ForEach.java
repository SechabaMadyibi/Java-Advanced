package Lesson8;

import java.util.List;

public class A02ForEach {
    public static void main(String[] args) {
        List<SalesTxn> tList = SalesTxn.createTxnList();

        System.out.println("Print List with for");
        tList.forEach(t-> t.printSummary());
        tList.forEach(t -> System.out.println("id: "+ t.getTxnId()));

    }
}
