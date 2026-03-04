package org.example.Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserProxyInvocationHandler implements InvocationHandler {
    // 被代理的接口
    private UserServer userServer;


    public void setUserServer(UserServer userServer) {
        this.userServer = userServer;
    }

    // 动态生成代理类实例
    public Object getProxy(){
        Object obj = Proxy.newProxyInstance(this.getClass().getClassLoader(),
                userServer.getClass().getInterfaces(),
                this);
        return obj;
    }

    // 处理代理类实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = method.invoke(userServer, args);
        return obj;
    }

    public void log(Method method){
        System.out.println("log: " + method.getName() + "方法被调用了");
    }

}
