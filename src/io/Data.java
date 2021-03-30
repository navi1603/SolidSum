package io;

import java.util.Scanner;

public class Data implements IData {

    private Scanner scanner;

    public Data (Scanner scanner){
        this.scanner = scanner;
    }

    @Override
    public void print (String text) {
        System.out.println(text);
    }

    @Override
    public void print (int number){
        System.out.println(number);
    }

    @Override
    public int read () {
        return scanner.nextInt();
    }

    @Override
    public int input (String text){
        print(text);
        return read();
    }
}
