package com.abitov;

import org.reflections.Reflections;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class AppleDeviceCreator {

    private static AppleDeviceCreator instance;

    private static final Map<AppleDeviceType, Class> mapping
            = fillAppleDevicesTypes();


    private static AppleDevice createAppleDevice(){
        return null;
    }

    private  AppleDeviceCreator() {}


    public static AppleDeviceCreator getInstance(){
        if (instance == null){
            instance = new AppleDeviceCreator();
        }
        return instance;
    }

    private static Map<AppleDeviceType, Class> fillAppleDevicesTypes() {
        Reflections reflections = new Reflections("com.abitov.appledevices");
        Set<Class<? extends AppleDevice>> allClasses =
                reflections.getSubTypesOf(AppleDevice.class);
        return allClasses.stream().collect(
                Collectors.toMap(AppleDevice::getType, AppleDevice::calculateDeliveryPrice));
    }

}
