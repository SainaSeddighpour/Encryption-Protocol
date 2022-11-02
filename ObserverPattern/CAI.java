import java.util.ArrayList;
import java.util.Random;

public class CAI implements Observable{
    Random random = new Random();
    private ArrayList<Observer> observers = new ArrayList<>();
    private ArrayList<Protocols> protocols = new ArrayList<>();
    private Protocols protocol;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void addProtocol(Protocols p) {
        protocols.add(p);
    }

    @Override
    public void removeProtocol(Protocols p) {
        protocols.remove(p);
    }

    @Override
    public void Notify() {
        for (Observer observer:observers){
            observer.Update();
        }
    }

    public void setProtocol(){
        int k = random.nextInt(protocols.size());
        this.protocol = protocols.get(k);
    }

    public Protocols getProtocol(){
        return this.protocol;
    }
}
