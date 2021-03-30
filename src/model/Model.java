package model;

import Service.IService;
import io.IData;
import io.IPrinter;

public class Model {

    int a, b, sum;

    public void init (IData data){
        a = data.input("Enter a: ");
        b = data.input("Enter b: ");
    }

    public void calc (IService service) {
        sum = service.calculate(a, b);
    }

    public void done (IPrinter printer) {
        printer.print("Result: ");
        printer.print(sum);
    }

}
