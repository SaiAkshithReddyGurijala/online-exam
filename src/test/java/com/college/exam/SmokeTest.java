package com.college.exam;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class SmokeTest {
    @Test
    public void applicationNameIsPresent() {
        String applicationName = "Online Examination System";
        assertTrue(applicationName.contains("Examination"));
    }
}
