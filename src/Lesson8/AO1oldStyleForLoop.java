package Lesson8;

import java.util.List;

public class AO1oldStyleForLoop {



    public static void main(String[] args) {
        List<SalesTxn> tList = SalesTxn.createTxnList();

        System.out.println("Print List with for");

        for(SalesTxn t:tList)
        {
            t.printSummary();
        }
    }

}
