package com.solid.i.good;

import java.util.List;

public class Azure implements ICloudStorageProvider, ICloudHostingProvider, ICDNProvider {
    public String getCDNUrl() {
        return null;
    }

    public void createServer(String region) {

    }

    public List<String> listServers(String region) {
        return null;
    }

    public void storeFile(String name) {

    }

    public void getFile(String name) {

    }
}
