package com.example;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

//created by chike - 23/03/17

public class JsonifyTest {

    @Test //you inform the program that you are running a test
    public void getJsonify() throws Exception {

        String exampleJson = "{\"full name\": \"chike\", \"age\": \"16\"}";

        //JSON string example, if the Constructor function produces an output in the same format as this, it'll pass the test
        Jsonify string = new Jsonify("chike", "16");
        //New Jsonify object takes name, surname and age and creates the JSON string
        Assert.assertThat("Testing the sort:", string.getJsonify(), equalTo(exampleJson));
        //I'm asking that the program confirms that the value returned from the getter function
        //is equal to the value of the
    }

    @Test
    public void getJsonify1() throws Exception {
        String exampleJson = "{\"full name\": \"\", \"age\": \"\"}";

        //JSON string example, if the Constructor function produces an output in the same format as this, it'll pass the test
        Jsonify string = new Jsonify();
        //New Jsonify object takes name, surname and age and creates the JSON string
        Assert.assertThat("Testing the sort:", string.getJsonify(), equalTo(exampleJson));
        //I'm asking that the program confirms that the value returned from the getter function
        //is equal to the value of the
    }
}

//add new test