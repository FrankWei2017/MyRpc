package com.dxc.rpc.simple.client;

public interface HelloService {

    String hello(String name);

    String hello(Person person);
}
