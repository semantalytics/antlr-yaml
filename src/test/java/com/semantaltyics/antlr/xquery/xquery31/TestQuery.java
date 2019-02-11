package com.semantaltyics.antlr.xquery.xquery31;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;

import java.util.Collection;

public class TestQuery {

    private final String fileName;

    public TestQuery(final String fileName) {
        this.fileName = fileName;
    }

    @Parameter
    public static Collection<Object[]> data() {

    }

    @Test
    public void CanParse() {

    }


}
