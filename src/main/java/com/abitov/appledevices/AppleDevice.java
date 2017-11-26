package com.abitov.appledevices;


import com.abitov.AppleDeviceColor;
import com.abitov.AppleDeviceType;

import java.math.BigDecimal;
import java.sql.SQLException;

/**
 *  Interface which represent what state and behavior must have and
 *  implement typical Apple Device
 */
public abstract class AppleDevice implements Device {


    /**
     * color property
     */
    private AppleDeviceColor color;


    /**
     * Default Constructor
     * @param color
     */
    public AppleDevice(AppleDeviceColor color) {
        setColor(color);
    }


    /**
     *  setter for color prorepty
     * @param color
     */
    private void setColor(AppleDeviceColor color){
        this.color = color;
    }


    /**,
     * @see com.abitov.AppleDeviceColor
     * @return AppleDeviceColor
     */
    private AppleDeviceColor getColor(){
        return color;
    }




    /**
     * Must  retrun result of checking price in DB
     * @return At curent moment return  java.lang.UnsupportedOperationException
     * @throws SQLException
     */
    public abstract boolean verifyPrice() throws SQLException;


    /**
     *
     * @return calcaulte and return price in USD
     */
    public abstract BigDecimal calculateDeliveryPrice();


    /**
     *  Send request message about reserving Apple device in stock system
     *  using messageing service
     *  @return result of reserve in stock system

     */
    public abstract boolean reserveItem();


    /**
     * send Notification for all interested group
     * @return true if all groups were notificated
     */
    public abstract boolean sendNotification();


    /**
     * send Product to customer
     */
    public abstract void sendToCustomer();

}
