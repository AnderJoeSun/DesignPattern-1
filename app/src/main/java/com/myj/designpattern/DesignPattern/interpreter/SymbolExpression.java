package com.myj.designpattern.DesignPattern.interpreter;

import java.util.HashMap;

/**
 * Created by maoyujiao on 2019/9/16.
 */

public class SymbolExpression extends Expression {

    protected Expression leftExpression;
    protected Expression rightExpression;



    public SymbolExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interprete(HashMap<String, Integer> var) {
        return 0;
    }
}
