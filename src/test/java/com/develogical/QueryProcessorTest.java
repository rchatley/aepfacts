package com.develogical;


import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

    @Test
    public void canGreetYou() {
        String result = new QueryProcessor().process("hi");
        assertNotNull(result);
        assertThat(result, is("hello"));
    }

    @Test
    public void returnsEmptyStringForUnknownQueries() {
        String result = new QueryProcessor().process("unknown");
        assertNotNull(result);
        assertThat(result, is(""));
    }
}



