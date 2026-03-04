package org.example.Reflection;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class demo {
/*    public void execute(String className, String methodName)throws Exception {
        Class clazz = Class.forName(className);
        clazz.getMethod(methodName).invoke(clazz.newInstance());
    }*/
public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, IOException {
    //new demo();
/*    Class clazz = Class.forName("java.lang.Runtime");
    //clazz.getMethod("exec", String.class).invoke(clazz.getMethod("getRuntime").invoke(clazz),"calc.exe");
    try {
        clazz.getMethod("exec",
                String.class).invoke(clazz.getMethod("getRuntime").invoke(clazz),
                "calc.exe");*/

/*    Class clazz = Class.forName("java.lang.Runtime");
    Method execMethod = clazz.getMethod("exec", String.class);
    Method getRuntimeMethod = clazz.getMethod("getRuntime");
    Object runtime = getRuntimeMethod.invoke(clazz);
    execMethod.invoke(runtime,"calc.exe");*/

    //Class clazz = Class.forName("java.lang.ProcessBuilder");
    //((ProcessBuilder)clazz.getConstructor(List.class).newInstance(Arrays.asList("calc.exe"))).start();

    //Class clazz = Class.forName("java.lang.ProcessBuilder");
    //((ProcessBuilder) clazz.getConstructor(List.class).newInstance(Arrays.asList("calc.exe"))).start();

    //Class clazz = Class.forName("java.lang.ProcessBuilder");
    //((ProcessBuilder)clazz.getConstructor(String[].class).newInstance(new String[][]{{"calc.exe"}})).start();
    //clazz.getMethod("start").invoke(clazz.getConstructor(String[].class).newInstance(new String[][]{{"calc.exe"}}));
    Class clazz = Class.forName("java.lang.Runtime");
    Constructor methond = clazz.getDeclaredConstructor();
    methond.setAccessible(true);
    clazz.getMethod("exec", String.class).invoke(methond.newInstance(), "calc.exe");

}

/*{
    System.out.printf("Empty block initial %s\n",this.getClass());
}
    static {
    System.out.printf("static block initial block %s\n",demo.class);
    }
    public demo(){
        System.out.printf("initial %s\n",this.getClass());
    }*/
}
