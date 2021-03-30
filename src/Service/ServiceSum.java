package Service;

public class ServiceSum implements IService {

    @Override
    public int calculate (int a, int b){
        return a + b;
    }
}
