package com.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvoctionHandler implements InvocationHandler {
    PersonBean person;

    OwnerInvoctionHandler(PersonBean personBean) {
        this.person = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
            try {
                if(method.getName().startsWith("get")) {
                    return method.invoke(person, args);
                }
                else if(method.getName().equals("setHotOrNotRating")) {
                    System.out.println("IllegalAccessException");
                    new IllegalAccessException();
                }
                else if(method.getName().startsWith("set")) {
                    return method.invoke(person, args);
                }

            }
            catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            return null;
        }
}
