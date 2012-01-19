package com.develogical;

import static junit.framework.Assert.assertEquals;

public class WebServerTest {
    private WebServer server = new WebServer();

    /**
     * Ensure that a 'bad' request gets "Unknown" as a response.
     */
    @org.junit.Test
    public void testProcessUnknown() throws Exception {
        assertEquals("Unknown", server.process("What is my favourite colour?"));
    }
}
