package com.abitov;

import com.abitov.appledevices.AppleDevice;
import com.abitov.appledevices.Device;
import org.reflections.Reflections;


import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class AppleDeviceCreator {
    private static Logger logger = Logger.getLogger(AppleDeviceCreator.class.getName());


    private static AppleDeviceCreator instance;

    private static final Map<AppleDeviceType, Class> mapping
            = fillAppleDevicesTypes();


    public AppleDevice createAppleDevice(AppleDeviceType appleDeviceType,
                                         AppleDeviceColor color ){
        Class clazz = mapping.get(appleDeviceType);
        try {
            AppleDevice appleDevice = (AppleDevice)clazz.newInstance([color]);
        }catch (Exception ex){
            logger.log(Level.INFO, ex.getMessage() +"\r\n"
                + ex.getStackTrace());
        }


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
                    Collectors.toMap(Device::getType, ));
    }

}
