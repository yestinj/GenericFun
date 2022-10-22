package org.example;

public interface Service <T extends Response, S extends Request> {
    void insertRequest(S request);
}
