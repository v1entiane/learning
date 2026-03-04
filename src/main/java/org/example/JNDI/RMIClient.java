package org.example.JNDI;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class RMIClient {
        public static void main(String[] args) throws NamingException, MalformedURLException, NotBoundException, RemoteException {
            RMIServer.IRemoteHelloWorld hello = (RMIServer.IRemoteHelloWorld) Naming.lookup("rmi://192.168.110.252/Hello");
            String ret = hello.Hello();
            System.out.println(ret);
        }
    }
