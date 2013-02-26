package com.amazon.exercise.stream.provided.impl;

import com.amazon.exercise.stream.provided.Stream;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: felipe
 * Date: 2/24/13
 * Time: 10:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class DefaultStreamTest {
    private Stream stream;

    @Before
    public void setup(){
        stream = new DefaultStream("felipe");
    }

    @Test
    public void metodosDaApiFuncionamDireito(){
        assertTrue(stream.hasNext());
        assertEquals('f', stream.getNext());
        assertTrue(stream.hasNext());
        assertEquals('e', stream.getNext());
        assertTrue(stream.hasNext());
        assertEquals('l', stream.getNext());
        assertTrue(stream.hasNext());
        assertEquals('i', stream.getNext());
        assertTrue(stream.hasNext());
        assertEquals('p', stream.getNext());
        assertTrue(stream.hasNext());
        assertEquals('e', stream.getNext());
        assertFalse(stream.hasNext());
    }
}
