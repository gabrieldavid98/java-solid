package com.solid.i.bad;

import java.util.List;

public interface ICloudProvider {
    void storeFile(String name);
    void getFile(String name);
    void createServer(String region);
    List<String> listServers(String region);
    String getCDNUrl();
}
