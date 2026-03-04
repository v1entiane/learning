package org.example.Proxy.morestaticproxy;

public class Client {
    public static void main(String[] args) {
        UserServerImpl userServer = new UserServerImpl();
        UserServerProxy proxy = new UserServerProxy(userServer);
        proxy.setUserServer(userServer);
        proxy.add();
    }
}
