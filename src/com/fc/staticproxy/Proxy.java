package com.fc.staticproxy;

public class Proxy implements Rent{
    private Host host;

    public Proxy(Host host){
        this.host = host;
    }

    //租房
    public void rent(){
        seeHouse();
        host.rent();
        fare();
    }

    //看房
    public void seeHouse(){
        System.out.println("看看房子");
    }

    //中介费
    public void fare(){
        System.out.println("交中介费");
    }
}
