package com.amazon.exercise.stream.usecase;

import com.amazon.exercise.stream.provided.Stream;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: felipe
 * Date: 2/24/13
 * Time: 10:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class FirstOddPicker {
    public Character identifyFirstOddFromStream(Stream stream) {
      	Set<Character> charsAlreadyRead = new LinkedHashSet<Character>();
		Character n = null;

		if(null == stream){
			return null;
		}

		while (stream.hasNext()){
			n = stream.getNext();

			if(charsAlreadyRead.contains(n)){
				charsAlreadyRead.remove(n);
			} else {
				charsAlreadyRead.add(n);
			}
		}
		
		return (Character) charsAlreadyRead.toArray()[0];
    }
}
