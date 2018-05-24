package com.dkkcorp.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            Student student=mapper.readValue(
                    new File("data/sample-full.json"), Student.class);

            System.out.println("================>>>>> the name is : "+student.getFirstName());
            System.out.println("================>>>>> the Last-name is : "+student.getLastName());

        }catch (Exception exc){
            exc.printStackTrace();
        }
    }
}
