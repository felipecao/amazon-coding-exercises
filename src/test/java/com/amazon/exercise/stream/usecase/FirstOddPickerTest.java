package com.amazon.exercise.stream.usecase;

import com.amazon.exercise.stream.provided.Stream;
import com.amazon.exercise.stream.provided.impl.DefaultStream;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;

/**
 * <b>Coding exercise:</b>
 * Find the first character in a stream which is not repeated in the rest of the stream. Please note that you are being
 * provided a stream as a source for these characters. The stream is guaranteed to eventually terminate (i.e. return
 * false from a call to the hasNext() method), though it could be very long. You will access this stream through the
 * provided interface methods. A call to hasNext() will return whether the stream contains any more characters to process.
 * A call to getNext() will return the next character to be processed in the stream. It is not possible to restart the stream.
 *
 * Example:
 * Input: aAbBABac
 * Output: b
 * In this example, the character ‘b’ is the first character in the stream which is not repeated in the stream.
 */
public class FirstOddPickerTest {
    private FirstOddPicker firstOddPicker;

    @Before
    public void setup(){
        firstOddPicker = new FirstOddPicker();
    }

    @Test
    public void nullStreamReturnsNull(){
        assertNull(firstOddPicker.identifyFirstOddFromStream(null));
    }

    @Test
    public void bIsTheFirstOdd(){
        Stream s = new DefaultStream("aAbBABac");
        Character c = firstOddPicker.identifyFirstOddFromStream(s);
        assertNotNull(c);
        assertEquals(Character.valueOf('b'), c);
    }

    @Test
    public void cIsTheFirstOdd(){
        Stream s = new DefaultStream("aaaaAAAAAAcBD");
        Character c = firstOddPicker.identifyFirstOddFromStream(s);
        assertNotNull(c);
        assertEquals(Character.valueOf('c'), c);
    }

    @Test
    public void cIsTheFirstOddInLastPosition(){
        Stream s = new DefaultStream("aaaaAAAAAAc");
        Character c = firstOddPicker.identifyFirstOddFromStream(s);
        assertNotNull(c);
        assertEquals(Character.valueOf('c'), c);
    }
}
