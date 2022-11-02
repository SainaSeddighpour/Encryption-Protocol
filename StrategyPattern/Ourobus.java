import java.util.ArrayList;

public class Ourobus extends Protocols{
    ArrayList<Integer> key_1 = new ArrayList<>();
    ArrayList<Integer> key_2 = new ArrayList<>();

    public Ourobus(){
        //Constants given in Encryption protocols
        key_1.add(3);
        key_1.add(1);
        key_1.add(0);
        key_1.add(2);

        key_2.add(2);
        key_2.add(5);
        key_2.add(4);
        key_2.add(1);
        key_2.add(3);
        key_2.add(0);

        keys.add(key_1);
        keys.add(key_2);
    }

    //Ourobus encryption method given in EncryptionProtocols
    @Override
    public String encrypt(int am, String in) {
        ArrayList<Integer> key = keys.get(am);
        StringBuilder out = new StringBuilder();
        String use = in + new String(new char[key.size() - (in.length() % key.size())]).replace("\0", "");
        for (int i = 0; i < use.length(); i = i + key.size()) {
            char[] next = new char[key.size()];
            for (int j = 0; j < key.size(); j++) {
                next[j] = use.charAt(i + key.get(j));
            }
            out.append(new String(next));
        }
        return out.toString();
    }

    //Ourobus decryption method given in EncryptionProtocols
    @Override
    public String decrypt(int am, String in) {
        ArrayList<Integer> key = keys.get(am);
        StringBuilder out = new StringBuilder();
        String use = in + "";
        for (int i = 0; i < use.length(); i += key.size()) {
            char[] next = new char[key.size()];
            for (int j = 0; j < key.size(); j++) {
                next[key.get(j)] = use.charAt(i + j);
            }
            out.append(new String(next));
        }
        return out.toString();
    }
}
