package com.solid.i.good;

import java.util.List;

public interface ICloudHostingProvider {
    void createServer(String region);
    List<String> listServers(String region);
}
