package io;

public class PrinterStars implements IPrinter {

    @Override
    public void print(String text) {
        System.out.print(text);
    }

    @Override
    public void print (int number) {
        for (int i = 0; i < number; i++) {
            print("*");
        }
    }


}
