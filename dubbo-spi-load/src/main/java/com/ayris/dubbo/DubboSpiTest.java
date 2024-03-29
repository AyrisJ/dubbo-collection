package com.ayris.dubbo;

import com.ayris.dubbo.service.Study;
import com.ayris.dubbo.service.Travel;
import org.apache.dubbo.common.extension.ExtensionLoader;

public class DubboSpiTest {

    public static void main(String[] args) {
        ExtensionLoader<Travel> extensionLoader = ExtensionLoader.getExtensionLoader(Travel.class);

//        extensionLoader.getSupportedExtensions().forEach(System.out::println);
//        extensionLoader.getSupportedExtensionInstances().forEach(System.out::println);
//        System.out.println("----------------------------------------");

        Travel travel = extensionLoader.getExtension("car");
        travel.traffic();

//        Travel walkTravel = extensionLoader.getExtension("walk");
//        walkTravel.traffic();

        Study study = ExtensionLoader.getExtensionLoader(Study.class).getExtension("math");
        study.subject();

    }
}
