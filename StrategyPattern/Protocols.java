import java.util.ArrayList;

public abstract class Protocols {
    protected ArrayList<ArrayList<Integer>> keys = new ArrayList<ArrayList<Integer>>();
    public abstract String encrypt(int am, String in);
    public abstract String decrypt(int am, String in);
}
