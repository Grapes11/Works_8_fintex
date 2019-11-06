package com.company;

class MyException extends Exception {
    MyException() {
        System.out.println("Было введено явно не число");
    }
}
