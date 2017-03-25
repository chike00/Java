package com.example;

//created 23/03/17

class Jsonify {
    private static String jsonify = ""; //where the JSON string will be stored

    Jsonify(){
        jsonify = "{\"full name\": \"\", \"age\": \"\"}";
    }

    Jsonify(String fullname, String age){ //Constructor function Jsonify, takes 3 parameters

        jsonify = String.format(
                "{" +
                        "\"full name\": \"%s\"," +
                        " \"age\": \"%s\"" +
                        "}",

                fullname, age);
    }

        //takes input and puts it in JSON format, validated by JSONLint

    static String getJsonify(){ //getter function which returns the string
        System.out.println(jsonify);
        return jsonify; //returns the string
    }

}