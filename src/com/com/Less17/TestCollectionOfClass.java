package com.com.Less17;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by uitsc_000 on 14.11.2015.
 */
class Address{
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    public Address(String city, String name, String street, String state, String code) {
        this.city = city;
        this.name = name;
        this.street = street;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}


class TestCollectionOfClass {
    public static void main(String[] args) {
        List<Address> ml = new LinkedList<>();
        ml.add(new Address("1","1","1","1","1"));
        ml.add(new Address("2","2","2","2","2"));
        ml.add(new Address("3","3","3","3","3"));

        for (Address element : ml){
            System.out.println(element + "\n");
        }
        System.out.println();
    }
}
