package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void  testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("Product 1");
        Product product2 = new Product("Product 2");
        Product product3 = new Product("Product 3");
        Product product4 = new Product("Product 4");
        Product product5 = new Product("Product 5");
        Product product6 = new Product("Product 6");
        Product product7 = new Product("Product 7");

        Item item1 = new Item(BigDecimal.valueOf(1.155),1500,BigDecimal.valueOf(0.095));
        Item item2 = new Item(BigDecimal.valueOf(5.100),1000,BigDecimal.valueOf(2.095));
        Item item3 = new Item(BigDecimal.valueOf(0.108),7000,BigDecimal.valueOf(0.050));
        Item item4 = new Item(BigDecimal.valueOf(85.745),11500,BigDecimal.valueOf(54.000));
        Item item5 = new Item(BigDecimal.valueOf(15.100),9000,BigDecimal.valueOf(22.095));
        Item item6 = new Item(BigDecimal.valueOf(20.108),11000,BigDecimal.valueOf(3.050));
        Item item7 = new Item(BigDecimal.valueOf(3.745),1500,BigDecimal.valueOf(6.000));

        Invoice invoice1 = new Invoice("12033");
        Invoice invoice2 = new Invoice("12034");
        Invoice invoice3 = new Invoice("12035");

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
        item4.setProduct(product4);
        item5.setProduct(product5);
        item6.setProduct(product6);
        item7.setProduct(product7);

        product1.getItems().add(item1);
        product2.getItems().add(item2);
        product3.getItems().add(item3);
        product4.getItems().add(item4);
        product5.getItems().add(item5);
        product6.getItems().add(item6);
        product7.getItems().add(item7);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item4);
        invoice2.getItems().add(item4);
        invoice2.getItems().add(item2);
        invoice2.getItems().add(item3);
        invoice3.getItems().add(item7);
        invoice3.getItems().add(item6);
        invoice3.getItems().add(item5);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice2);
        item3.setInvoice(invoice2);
        item4.setInvoice(invoice1);
        item4.setInvoice(invoice2);
        item5.setInvoice(invoice3);
        item6.setInvoice(invoice3);
        item6.setInvoice(invoice3);

        //When
        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);
        invoiceDao.save(invoice3);

        //Then
        Assert.assertNotEquals(0, invoice1.getId());
        Assert.assertNotEquals(0, invoice2.getId());
        Assert.assertNotEquals(0, invoice3.getId());

        //CleanUp
        try {
            invoiceDao.delete(invoice1.getId());
            invoiceDao.delete(invoice2.getId());
            invoiceDao.delete(invoice3.getId());
        } catch (Exception e) {
            //do nothing
        }
    }
}
