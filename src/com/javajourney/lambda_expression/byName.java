package com.javajourney.lambda_expression;

import java.util.Comparator;

public class byName implements Comparator<Students> {
    public int compare(Students o1, Students o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
