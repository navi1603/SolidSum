

import Service.IService;
import Service.ServiceSum;
import io.Data;
import io.IData;
import model.Model;

import java.util.Scanner;

public class Program {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        IData data = new Data(scanner);
        IService service = new ServiceSum();
        Model model = new Model();
        model.init(data);
        model.calc(service);
        model.done(data);

    }
}
