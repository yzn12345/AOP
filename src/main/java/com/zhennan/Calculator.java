package com.zhennan;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("name1")
@Scope("prototype")
public class Calculator implements Calc{
    @Override
    public int add(int n1, int n2) {
        return n1+n2;
    }

    @Override
    public int sub(int n1, int n2) {
        return n1-n2;
    }

    @Override
    public int multiply(int n1, int n2) {
        return n1*n2;
    }

    @Override
    public int divide(int n1, int n2) {
        return n1/n2;
    }
}
