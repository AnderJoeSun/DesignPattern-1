package com.myj.designpattern.DesignPattern.interpreter;

import java.util.HashMap;

/**
 * Created by maoyujiao on 2019/9/16.
 */

public class VarExpression extends Expression {

    private String key;

    public VarExpression(String var) {
        this.key = var;
    }

    @Override
    public int interprete(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
