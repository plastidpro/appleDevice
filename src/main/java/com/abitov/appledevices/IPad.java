package com.abitov.appledevices;

import com.abitov.AppleDevice;
import com.abitov.AppleDeviceColor;
import com.abitov.AppleDeviceType;

import java.math.BigDecimal;
import java.sql.SQLException;


public class IPad extends AppleDevice {

    public IPad(AppleDeviceColor color) {
        super(color);
    }

    @Override
    public AppleDeviceType getType() {
        return null;
    }

    @Override
    public boolean verifyPrice() throws SQLException {
        return false;
    }

    @Override
    public BigDecimal calculateDeliveryPrice() {
        return null;
    }

    @Override
    public boolean reserveItem() {
        return false;
    }

    @Override
    public boolean sendNotification() {
        return false;
    }

    @Override
    public void sendToCustomer() {

    }
}
