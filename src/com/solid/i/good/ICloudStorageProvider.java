package com.solid.i.good;

public interface ICloudStorageProvider {
    void storeFile(String name);
    void getFile(String name);
}
