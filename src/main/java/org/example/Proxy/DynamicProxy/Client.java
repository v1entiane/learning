package org.example.Proxy.DynamicProxy;

import org.example.Proxy.DynamicProxy.UserServer;


public class Client {
    public static void main(String[] args) {
        UserServerImpl userServerImpl = new UserServerImpl();
        // 代理角色，不存在
        UserProxyInvocationHandler userProxyInvocationHandler = new UserProxyInvocationHandler();
        userProxyInvocationHandler.setUserServer((UserServer) userServerImpl);

        UserServer proxy = (UserServer)userProxyInvocationHandler.getProxy();
        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.query();
    }
}
