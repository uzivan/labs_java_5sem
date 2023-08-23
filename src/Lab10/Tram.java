package Lab10;

public class Tram extends PublicTransport{
    public int n = 40;
    public void who(){
        System.out.println("Tram");
    }
    public int n_passengers(){
        return n;
    }
}
