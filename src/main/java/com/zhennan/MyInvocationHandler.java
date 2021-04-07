package com.zhennan;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

//MyInvocationHandler不是动态代理类，而是创建动态代理的类
public class MyInvocationHandler implements InvocationHandler {
    //接收委托对象
    private Object object = null;
    //传入委托对象，返回代理对象
    public Object bind(Object obj){
        this.object = obj;
        //创建一个代理proxy，和当前invocationHandler类关联
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(), this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //代理实现的方法1
        System.out.println(method.getName() + "参数" + Arrays.toString(args));
        //委托对象自己的业务方法，非代理完成
        Object result = method.invoke(this.object, args);
        //代理实现的方法2
        System.out.println("结果是" + result);
        //返回业务逻辑方法应该返回的值
        return result;
    }
}
