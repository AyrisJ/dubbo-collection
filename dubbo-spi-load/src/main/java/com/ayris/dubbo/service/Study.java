package com.ayris.dubbo.service;

import org.apache.dubbo.common.extension.SPI;

@SPI
public interface Study {

    String subject();
}
