package com.abitov.appledevices;

import com.abitov.AppleDevice;

import com.abitov.AppleDeviceColor;
import com.abitov.AppleDeviceType;

import java.math.BigDecimal;
import java.sql.SQLException;


public class IPod extends AppleDevice {


    public IPod(AppleDeviceColor color) {
        super(color);
    }

    public AppleDeviceType getType(){
        return AppleDeviceType.IPOD;
    }

    public  boolean verifyPrice() throws SQLException{
        return Boolean.TRUE;
    }


    @Override
    public BigDecimal calculateDeliveryPrice() {
        return BigDecimal.valueOf(1000L);
    }

    @Override
    public boolean reserveItem() {
        return true;
    }

    @Override
    public boolean sendNotification() {
        return true;
    }

    @Override
    public void sendToCustomer() {
        System.out.println("AppleStore sell" + this.getType());
    }
}
