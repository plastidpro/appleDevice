package com.abitov.appledevices;

import com.abitov.AppleDeviceColor;
import com.abitov.AppleDeviceType;

import java.math.BigDecimal;
import java.sql.SQLException;

public class IPhone extends AppleDevice {

    
    public AppleDeviceType getType() {
        return AppleDeviceType.IPHONE;
    }


    public IPhone(AppleDeviceColor color) {
        super(color);
    }

    public boolean verifyPrice() throws SQLException {
        return false;
    }

    
    public BigDecimal calculateDeliveryPrice() {
        return null;
    }

    
    public boolean reserveItem() {
        return false;
    }

    
    public boolean sendNotification() {
        return false;
    }

    
    public void sendToCustomer() {
        System.out.println("AppleStore sell" + this.getType());
    }
}
