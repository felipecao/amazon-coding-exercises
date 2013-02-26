package com.amazon.exercise.stream.provided.impl;

import com.amazon.exercise.stream.provided.Stream;

/**
 * Created with IntelliJ IDEA.
 * User: felipe
 * Date: 2/24/13
 * Time: 10:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class DefaultStream implements Stream {

    private String word;
    private int counter;

    public DefaultStream(String word) {
        this.word = word;
        counter = 0;
    }

    @Override
    public char getNext() {
        if(hasNext()){
            return word.charAt(counter++);
        }

        return word.charAt(word.length() - 1);
    }

    @Override
    public boolean hasNext() {
        return (counter < word.length());
    }
}
