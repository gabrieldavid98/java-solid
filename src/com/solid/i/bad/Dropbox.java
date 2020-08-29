package com.solid.i.bad;

import java.util.ArrayList;
import java.util.List;

public class Dropbox implements ICloudProvider {
    public void storeFile(String name) {
        return;
    }

    public void getFile(String name) {
        return;
    }

    public void createServer(String region) {
        // No implementado
    }

    public List<String> listServers(String region) {
        // No implementado
        return new ArrayList<>();
    }

    public String getCDNUrl() {
        // No implementado
        return null;
    }
}
