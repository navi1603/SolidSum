package io;

import java.util.Scanner;

public class Data implements IData {

    private IReader reader;
    private IPrinter printer;
    private Scanner scanner;

    public Data (IReader reader, IPrinter printer) {
        this.reader = reader;
        this.printer = printer;
    }

    public Data (Scanner scanner) {

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
