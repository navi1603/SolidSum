package model;

import Service.IService;
import io.Data;
import io.IData;
import io.IPrinter;
import io.IReader;

public class Module {

    private IReader reader;
    private IPrinter printer;
    private IService service;
    private IData data;

    public Module(IReader reader, IPrinter printer, IService service) {
        this.reader = reader;
        this.printer = printer;
        this.service = service;
        this.data = new Data(reader, printer);
    }



    public void execute() {
        Model model = new Model();
        model.init(data);
        model.calc(service);
        model.done(printer);
    }
}
