package org.example.Proxy.morestaticproxy;

public class UserServerProxy implements UserServer{
    private UserServerImpl userServer;
    public UserServerProxy(UserServerImpl userServer) {
        this.userServer = userServer;
    }

    public void setUserServer(UserServerImpl userServer){
        this.userServer = userServer;
    }

    public void add() {
        log("add");
        userServer.add();
    }

    public void delete() {
        log("delete");
        userServer.delete();
    }

    public void update() {
        log("update");
        userServer.update();
    }

    public void query() {
        log("query");
        userServer.query();
    }

    public void log(String msg) {
        System.out.println("log:" + msg);
    }

}
