package com.github.prifiz.homestuffmaintenance.service.client;

import java.io.IOException;

public interface StuffClient {

    Long findStuffId(String name, String manufacturer, String model) throws IOException;
}
