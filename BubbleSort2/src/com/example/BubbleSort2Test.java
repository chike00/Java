package com.example;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by chike on 23/03/2017.
 */
public class BubbleSort2Test { //it might be necessary to put 'Test' on the end
    @Test //you inform the program that you are running a test
    public void getSortedArray() throws Exception { //void does not return a value, it throws Exception because the Exception
        //expected is one which is intentional
        int[] unsortedArray = {12, 11, 232, 1, 4, 23, 657, 2}; //this is what an unsorted array looks like
        int[] sortedArray = {1, 2, 4, 11, 12, 23, 232, 657}; //this is what the sorted array should look like

        BubbleSort2 bubbleSort2 = new BubbleSort2(unsortedArray); //create a new instance of our BubbleSort2 class
        //BubbleSort2 needs to be public in order to access it from another java file
        Assert.assertThat("Testing the sort", bubbleSort2.getSortedArray(), equalTo(sortedArray));
        //bubbleSort2 is the unsorted array, we are asking the program to confirm array which was passed through our
        //getter function is equalTo the actual sorted array
    }

}