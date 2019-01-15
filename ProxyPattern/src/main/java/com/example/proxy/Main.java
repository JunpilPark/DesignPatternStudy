package com.example.proxy;

import java.lang.reflect.Proxy;

public class Main
{

    public static void main(String[] args) {
        Main main = new Main();
        PersonBean person1 = new PersonBeanImpl();

        PersonBean ownerProxy = main.getOwnerProxy(person1);
        ownerProxy.setName("홍길동");
        ownerProxy.setGender("남자");
        ownerProxy.setInterest("무협소설 읽기");
        ownerProxy.setHotOrNotRating(10); // ownerProxy 이기 때문에 실제 실행이 안되는 것을 볼 수 있다.

        PersonBean nonOwnProxy = main.getNonOwnerProxy(person1);
        nonOwnProxy.setName("박길동");  // nonOwnProxy 이기 때문에 setName은  실행이 안되는 것을 볼 수 있다.

        System.out.println(nonOwnProxy.getName());
        System.out.println(nonOwnProxy.getGender());
        System.out.println(nonOwnProxy.getInterest());
        System.out.println(nonOwnProxy.getHotOrNotRating());
        nonOwnProxy.setHotOrNotRating(10);
        System.out.println(nonOwnProxy.getHotOrNotRating());
    }

    PersonBean getOwnerProxy(PersonBean person)
    {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvoctionHandler(person));
    }

    PersonBean getNonOwnerProxy(PersonBean person)
    {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvoctionHandler(person));
    }
}
