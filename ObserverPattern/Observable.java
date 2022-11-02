public interface Observable {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void addProtocol(Protocols p);
    public void removeProtocol(Protocols p);
    public void Notify();
}
