package com.company;

public class  ShowStudent  {

    public static void main(String[] args) {
        // Instantiating the MISStudent class
        Student MISStudent = new MISStudent();
        // setting IdNumber as my age
        MISStudent.setIdNumber(23);
        // setting myName to my name
        MISStudent.setMyName( "Edward ");

        // printing out my ID Number
        System.out.println(" My Id Number is " + MISStudent.getIdNumber());

        // printing out my name
        System.out.println(" My name is " + MISStudent.getMyName());





    }


}