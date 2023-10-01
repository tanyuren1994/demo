package com.example.demo.testclass;

public class NonGenericClass {

    private Object val;

    public NonGenericClass(Object val) {
        this.val = val;
    }

    public Object get() {
        return val;
    }
}
