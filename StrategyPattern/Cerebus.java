import java.util.ArrayList;

public class Cerebus extends Protocols{
    //Constants given in Encryption protocols
    private final int CEREBUS_INIT_VALUE = 32;
    private final int CEREBUS_ALPH_SIZE = 128;

    public Cerebus(){
        ArrayList <Integer> key1 = new ArrayList<>();
        ArrayList <Integer> key2 = new ArrayList<>();
        //Constants given in EncryptionProtocols for the different types of cerebus added to an array list so other types could be easily added
        key1.add(18);
        key2.add(31);
        keys.add(key1);
        keys.add(key2);
    }
    //Cerebus encryption method given in EncryptionProtocols
    @Override
    public String encrypt(int am, String in) {
        ArrayList<Integer> key = keys.get(am);
        StringBuilder out = new StringBuilder();
        String use = in.toLowerCase();
        for(char a : use.toCharArray()) {
            out.append((char)(((a + key.get(0) - CEREBUS_INIT_VALUE) % CEREBUS_ALPH_SIZE) + CEREBUS_INIT_VALUE)+"");
        }
        return out.toString();
    }

    //Cerebus decryption method given in EncryptionProtocols
    @Override
    public String decrypt(int am, String in) {
        ArrayList<Integer> key = keys.get(am);
        StringBuilder out = new StringBuilder();
        String use = in.toLowerCase();
        for(char a : use.toCharArray()) {
            out.append((char)(((a - key.get(0)  - CEREBUS_INIT_VALUE + CEREBUS_ALPH_SIZE) % CEREBUS_ALPH_SIZE) + CEREBUS_INIT_VALUE)+"");
        }
        return out.toString();
    }
}

