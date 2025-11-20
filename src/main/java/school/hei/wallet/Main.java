package school.hei.wallet;

import school.hei.wallet.model.Wallet;

public class Main {
    public static void main(String[] args) {
        int monArgent = 5000;

        new Wallet("rouge", "grand", monArgent);
    }
}
