package com.myj.designpattern.DesignPattern.interpreter;

import java.util.HashMap;

/**
 * Created by maoyujiao on 2019/9/16.
 */

public class SubExpression extends SymbolExpression {

    public SubExpression(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public int interprete(HashMap<String, Integer> var) {
        return super.leftExpression.interprete(var) - super.rightExpression.interprete(var);
    }
}
