package invoice;

import org.junit.Test;
import static org.junit.Assert.*;
import invoice.Invoice;
import org.junit.Assert;

public class Invoice_ {

    @Test
    public void should_allow_discount() {
        Invoice invoice = new Invoice(10, 2.5);
        assertEquals(22.5, invoice.getTotal(), 0.01);
    }

    @Test
    public void should_allow_no_discount() {
        Invoice invoice = new Invoice(2, 2.5);
        assertEquals(5, invoice.getTotal(), 0.01);
    }

}