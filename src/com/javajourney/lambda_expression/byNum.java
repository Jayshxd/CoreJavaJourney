package com.javajourney.lambda_expression;

import java.util.Comparator;

public class byNum implements Comparator<Students> {
    public int compare(Students o1, Students o2) {
        return o1.getId() - o2.getId();
    }
}
