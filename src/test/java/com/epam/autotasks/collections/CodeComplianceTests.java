package com.epam.autotasks.collections;

import org.junit.jupiter.api.Test;

import java.util.AbstractSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeComplianceTests {

    @Test
    void testAncestor() {
        assertEquals(AbstractSet.class, RangedOpsIntegerSet.class.getSuperclass());
    }
}