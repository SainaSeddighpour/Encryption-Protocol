public class Site implements Observer {
    private Protocols protocol;
    private CAI c;

    public Site(CAI c){
        this.c = c;
        c.addObserver(this);
    }

    @Override
    public void Update() {
        protocol = c.getProtocol();
    }

    public void displayProtocol() {
        System.out.println("Protocol: " + protocol);
    }
}