

import Service.ServiceSum;
import io.Data;

import java.util.Scanner;

public class Program {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data(scanner);
        ServiceSum service = new ServiceSum();

        int a = data.input("Enter a: ");
        int b = data.input("Enter b: ");

        int sum = service.calculate(a, b);
        data.print("Results: ");
        data.print(sum);
    }
}
