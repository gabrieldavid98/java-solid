package com.solid.i.bad;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Amazon implements ICloudProvider {
    public void storeFile(String name) {
        return;
    }

    public void getFile(String name) {
        return;
    }

    public void createServer(String region) {
        return;
    }

    public List<String> listServers(String region) {
        List<String> result = new ArrayList<>();
        IntStream.rangeClosed(1, 10).forEach(f ->
            result.add(String.format("server-%d", f))
        );

        return result;
    }

    public String getCDNUrl() {
        return "https://url.com";
    }
}
