package io;

import java.util.Scanner;

public class ReaderConsole implements IReader {

    Scanner scanner;

    public ReaderConsole (Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public int read() {
        return scanner.nextInt();
    }
}
