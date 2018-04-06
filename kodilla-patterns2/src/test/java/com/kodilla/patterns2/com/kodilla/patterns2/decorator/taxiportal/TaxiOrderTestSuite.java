package com.kodilla.patterns2.com.kodilla.patterns2.decorator.taxiportal;

import com.kodilla.patterns2.decorator.taxiportal.*;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.prefs.BackingStoreException;

import static org.junit.Assert.assertEquals;

public class TaxiOrderTestSuite {
    @Test
    public void testBasicTaxiOrderGetCost(){
        //given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        //when
        BigDecimal calculatedCost = taxiOrder.getCost();
        //then
        assertEquals(new BigDecimal(5),calculatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription(){
        //given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        //when
        String description = taxiOrder.getDescription();
        //then
        assertEquals("Drive a course", description);
    }

    @Test
    public void testTaxiNetworkGetCost(){
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //when
        BigDecimal theCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(40),theCost);
    }

    @Test
    public void testTaxiNetworkGetDescription(){
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //when
        String theDescrition = theOrder.getDescription();
        //then
        assertEquals("Drive a course by Taxi Network", theDescrition);
    }

    @Test
    public void testMyTaxiWithChildSeatGetCost(){
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //when
        BigDecimal theCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(37),theCost);
    }

    @Test
    public void testMyTaxiWithChildSeatGetDescription(){
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //when
        String description  = theOrder.getDescription();
        //then
        assertEquals("Drive a course by MyTaxi Network + child seat",description);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetCost(){
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //when
        BigDecimal theCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(52),theCost);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription(){
        //given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //when
        String theDescription  = theOrder.getDescription();
        //then
        assertEquals("Drive a course by Taxi Network variant VIP + child seat",theDescription);
    }
}
