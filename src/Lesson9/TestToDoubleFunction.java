package Lesson9;

import Lesson8.SalesTxn;

import java.util.List;
import java.util.function.ToDoubleFunction;

public class TestToDoubleFunction {
    public static void main(String[] args) {
        List<Lesson8.SalesTxn> tList = SalesTxn.createTxnList();
        SalesTxn first  = tList.get(0);
        ToDoubleFunction <SalesTxn> discountFunction = t-> t.getTransactionTotal()* t.getDiscountRate();
        System.out.println("Discount: "+ discountFunction.applyAsDouble(first));
    }
}
