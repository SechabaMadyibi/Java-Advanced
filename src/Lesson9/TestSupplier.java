package Lesson9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class TestSupplier {
    public static void main(String[] args) {
        List<SalesTxn> tList = new ArrayList<>();
        Supplier<SalesTxn> txnSupplier = () -> new SalesTxn.Builder()
                .txnId(101)
                .salesPerson("John Adams")
                .product("Widget")
                .paymentType("Cash")
                .unitPrice(20)
                .unitCount(8000)
                .txnDate(LocalDate.of(2013, 11, 10))
                .city("Boston")
                .state(State.MA)
                .code("02108")
                .build();
        tList.add(txnSupplier.get());
        tList.forEach(t -> System.out.println(t.getTxnId() + t.getProduct() + t.getSalesPerson() + t.getUnitCount() + t.getUnitPrice()));
    }
}
