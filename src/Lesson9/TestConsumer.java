package Lesson9;

import Lesson8.SalesTxn;

import java.util.List;
import java.util.function.Consumer;

public class TestConsumer {

    public static void main(String[] args) {
        List<SalesTxn> tList = SalesTxn.createTxnList();

        Consumer<SalesTxn> buyerConsumer = t -> System.out.println("Id: " + t.getTxnId() + " Buyer: " + t.getBuyerName());
        System.out.println("");
        tList.stream()
                .forEach(buyerConsumer);

    }
}
