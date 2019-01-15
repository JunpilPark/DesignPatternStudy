package com.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvoctionHandler implements InvocationHandler {
    PersonBean person;

    public  NonOwnerInvoctionHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if(method.getName().startsWith("get") == true) {
                return method.invoke(person, args);
            }
            else if (method.getName().equals("setHotOrNotRating") == true) {
                return method.invoke(person, args);
            }
            else {
                System.out.println("IllegalAccessException");
                return new IllegalAccessException();
            }
        }
        catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
