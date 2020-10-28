package com.fc.com.fc.dynamicproxy;


import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
/*        Host host = new Host();
        ProxyInnovationHandle pih = new ProxyInnovationHandle();
        pih.setProxyTarget(host);
        Rent proxy = (Rent)pih.getProxy();
        proxy.rent();*/
        ProxyInnovationHandle ph = new ProxyInnovationHandle();
        ph.setProxyTarget(new ArrayList());
        List list = (List)ph.getProxy();
        list.add("hello");
    }
}
