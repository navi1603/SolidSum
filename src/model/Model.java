package model;

import Service.IService;
import io.IData;

public class Model {

    int a, b, sum;

    public void init (IData data){
        a = data.input("Enter a: ");
        b = data.input("Enter b: ");
    }

    public void calc (IService service) {
        sum = service.calculate(a, b);
    }

    public void done (IData data) {
        data.print("Result: ");
        data.print(sum);
    }

}
