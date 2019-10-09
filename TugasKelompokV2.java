package PBO;

public class TugasKelompokV2 {

    public static void main(String[] args) {
        TugasKelompokV2 kantin = new TugasKelompokV2();
        kantin.setKantin("");
        kantin.setMakanan("");
        kantin.setMinuman("");

    }

    void setKantin(String kantin) {
        kantin = "Kantin 1 - 6";
        System.out.println(kantin);

    }

    private void setMakanan(String Makanan) {
        Makanan = "\n1. ayam geprek [10k]" + "\n2. mie ayam [9k]" + "\n3. Belut Crispy [9k]" + "\n5. Rawon [10k]" + "\n6. Soto Ayam [9k]" + "\nNasi Pecel [8k]";
        System.out.println("\n===================="+"\n    -- MAKANAN --" + "\n===================" + Makanan);
    }

    private void setMinuman(String minuman) {
        minuman = "\n1. Esteh [3k]" + "\n2. Es Jeruk [3k]" + "\n3. Teh Pucuk [3k]" + "\n4. Le Minerale [3k]" + "\n5. Milo [3,5k]" + "\n6. Good Day [3k]";
        System.out.println("\n===================="+ "\n    -- MINUMAN -- " +"\n====================" + minuman);
    }

}
