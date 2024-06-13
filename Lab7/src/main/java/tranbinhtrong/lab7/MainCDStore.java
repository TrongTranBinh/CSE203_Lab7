package tranbinhtrong.lab7;

public class MainCDStore {

    public static void main(String[] args) {
        CDManager cdManager = new CDManager();
        new CDStore(cdManager).setVisible(true);
    }

}
