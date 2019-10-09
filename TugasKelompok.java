
package PBO;

import javax.swing.JOptionPane;


public class TugasKelompok {

    public static void main(String[] args) {
        String str, str1;
        int choice, p, z = 0;
        String makanan, minuman, harga;

        JOptionPane.showMessageDialog(null, "Selamat Datang\n Tools Kantin \n Kantin 1 - 6 \n\nTools By Kelompok ", "CODENG TROS!", 1);
      
        do{
        str = JOptionPane.showInputDialog(null, "Masukan Nickname Kantin Anda : ");
        

        str
                = JOptionPane.showInputDialog(null, "[1] KANTIN 1 \n[2] KANTIN 2 \n[3] KANTIN 3 \n[4] KANTIN 4 \n[5] KANTIN 5 \n[6] KANTIN 6 \n[7] ABOUT CREATOR \n[8] Keluar \n\nKANTIN MANA GAYN YANG MAU DI STALK ?:", "Pilih Kantin", 3);

        choice = Integer.parseInt(str);
        
        switch (choice) {
            case 1:
                str
                        = JOptionPane.showInputDialog(null, "[1] MAKANAN \n[2] MINUMAN ");
                choice = Integer.parseInt(str);
                if (choice == 1) {
                    JOptionPane.showMessageDialog(null, "\n1. ayam geprek [10k]" + "\n2. mie ayam [9k]" + "\n3. Belut Crispy [9k]" + "\n5. Rawon [10k]" + "\n6. Soto Ayam [9k]" + "\nNasi Pecel [8k] "); //informasi saldo
                    z = JOptionPane.showConfirmDialog(null, "Mau cari menu lain?", "KANTOOLS",
                            JOptionPane.YES_NO_OPTION, 3);
                    
                }
                    
                    if (choice == 2){
                         JOptionPane.showMessageDialog(null, "\n1. Esteh [3k]" + "\n2. Es Jeruk [3k]" + "\n3. Teh Pucuk [3k]" + "\n4. Le Minerale [3k]" + "\n5. Milo [3,5k]" + "\n6. Good Day [3k] "); //informasi saldo
                    z = JOptionPane.showConfirmDialog(null, "Mau cari menu lain?", "KANTOOLS",
                            JOptionPane.YES_NO_OPTION, 3);
                    }

                    if (z == 0) {
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan Tools Kami, Jangan lupa beli");
                    }

                    System.exit(0);
                    case 2:
                        str
                        = JOptionPane.showInputDialog(null, "[1] MAKANAN \n[2] MINUMAN ");
                choice = Integer.parseInt(str);
                if (choice == 1) {
                    JOptionPane.showMessageDialog(null, "\n1. Belut geprek [10k]" + "\n2. Nasi Goreng [9k]" + "\n3. Belut Crispy [9k]" + "\n5. Soto [10k]" + "\n6. Sate Kambing [9k]" + "\nSate Kucing [8k] "); //informasi saldo
                    z = JOptionPane.showConfirmDialog(null, "Mau cari menu lain?", "KANTOOLS",
                            JOptionPane.YES_NO_OPTION, 3);
                }
                    
                    if (choice == 2){
                         JOptionPane.showMessageDialog(null, "\n1. Esteh [3k]" + "\n2. Es Jeruk [3k]" + "\n3. Teh Pucuk [3k]" + "\n4. Le Minerale [3k]" + "\n5. Milo [3,5k]" + "\n6. Good Day [3k] "); //informasi saldo
                    z = JOptionPane.showConfirmDialog(null, "Mau cari menu lain?", "KANTOOLS",
                            JOptionPane.YES_NO_OPTION, 3);
                    }

                    if (z == 0) {
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan Tools Kami, Jangan lupa beli");
                    }

                    System.exit(0);
                    case 3:     //Mulai Dari Sini Belum DIganti
                            str
                        = JOptionPane.showInputDialog(null, "[1] MAKANAN \n[2] MINUMAN ");
                choice = Integer.parseInt(str);
                if (choice == 1) {
                    JOptionPane.showMessageDialog(null, "\n1. Tahu Telor [8k]" + "\n2. Ayam Geprek [10k]" + "\n3. Nasi Pecel [9k]" + "\n5. Soto [10k]" + "\n6. Mie Ayam [10k]" + "\n7. Nasi Campur [8k] "); //informasi saldo
                    z = JOptionPane.showConfirmDialog(null, "Mau cari menu lain?", "KANTOOLS",
                            JOptionPane.YES_NO_OPTION, 3);
                }
                    
                    if (choice == 2){
                         JOptionPane.showMessageDialog(null, "\n1. Air Putih [3k]" + "\n2. Es Teh [3k]" + "\n3. Es Jeruk [3k]" + "\n4. Kopi [3k]" + "\n5. Milo [3,5k] "); //informasi saldo
                    z = JOptionPane.showConfirmDialog(null, "Mau cari menu lain?", "KANTOOLS",
                            JOptionPane.YES_NO_OPTION, 3);
                    }

                    if (z == 0) {
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan Tools Kami, Jangan lupa beli");
                    }

                    System.exit(0);
                    case 4 :
                            str
                        = JOptionPane.showInputDialog(null, "[1] MAKANAN \n[2] MINUMAN ");
                choice = Integer.parseInt(str);
                if (choice == 1) {
                    JOptionPane.showMessageDialog(null, "\n1. Belut geprek [10k]" + "\n2. Nasi Goreng [9k]" + "\n3. Belut Crispy [9k]" + "\n5. Soto [10k]" + "\n6. Sate Kambing [9k]" + "\nSate Kucing [8k] "); //informasi saldo
                    z = JOptionPane.showConfirmDialog(null, "Mau cari menu lain?", "KANTOOLS",
                            JOptionPane.YES_NO_OPTION, 3);
                }
                    
                    if (choice == 2){
                         JOptionPane.showMessageDialog(null, "\n1. Esteh [3k]" + "\n2. Es Jeruk [3k]" + "\n3. Teh Pucuk [3k]" + "\n4. Le Minerale [3k]" + "\n5. Milo [3,5k]" + "\n6. Good Day [3k] "); //informasi saldo
                    z = JOptionPane.showConfirmDialog(null, "Mau cari menu lain?", "KANTOOLS",
                            JOptionPane.YES_NO_OPTION, 3);
                    }

                    if (z == 0) {
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan Tools Kami, Jangan lupa beli");
                    }

                    System.exit(0);
                    case 5 :
                            str
                        = JOptionPane.showInputDialog(null, "[1] MAKANAN \n[2] MINUMAN ");
                choice = Integer.parseInt(str);
                if (choice == 1) {
                    JOptionPane.showMessageDialog(null, "\n1. Belut geprek [10k]" + "\n2. Nasi Goreng [9k]" + "\n3. Belut Crispy [9k]" + "\n5. Soto [10k]" + "\n6. Sate Kambing [9k]" + "\nSate Kucing [8k] "); //informasi saldo
                    z = JOptionPane.showConfirmDialog(null, "Mau cari menu lain?", "KANTOOLS",
                            JOptionPane.YES_NO_OPTION, 3);
                }
                    
                    if (choice == 2){
                         JOptionPane.showMessageDialog(null, "\n1. Esteh [3k]" + "\n2. Es Jeruk [3k]" + "\n3. Teh Pucuk [3k]" + "\n4. Le Minerale [3k]" + "\n5. Milo [3,5k]" + "\n6. Good Day [3k] "); //informasi saldo
                    z = JOptionPane.showConfirmDialog(null, "Mau cari menu lain?", "KANTOOLS",
                            JOptionPane.YES_NO_OPTION, 3);
                    }

                    if (z == 0) {
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan Tools Kami, Jangan lupa beli");
                    }

                    System.exit(0);
                  
                    
                    case 6 :
                            str
                        = JOptionPane.showInputDialog(null, "[1] MAKANAN \n[2] MINUMAN ");
                choice = Integer.parseInt(str);
                if (choice == 1) {
                    JOptionPane.showMessageDialog(null, "\n1. Belut geprek [10k]" + "\n2. Nasi Goreng [9k]" + "\n3. Belut Crispy [9k]" + "\n5. Soto [10k]" + "\n6. Sate Kambing [9k]" + "\nSate Kucing [8k] "); //informasi saldo
                    z = JOptionPane.showConfirmDialog(null, "Mau cari menu lain?", "KANTOOLS",
                            JOptionPane.YES_NO_OPTION, 3);
                }
                    
                    if (choice == 2){
                         JOptionPane.showMessageDialog(null, "\n1. Esteh [3k]" + "\n2. Es Jeruk [3k]" + "\n3. Teh Pucuk [3k]" + "\n4. Le Minerale [3k]" + "\n5. Milo [3,5k]" + "\n6. Good Day [3k] "); //informasi saldo
                    z = JOptionPane.showConfirmDialog(null, "Mau cari menu lain?", "KANTOOLS",
                            JOptionPane.YES_NO_OPTION, 3);
                    }

                    if (z == 0) {
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan Tools Kami, Jangan lupa beli");
                    }

                    System.exit(0);
                    case 7 :
                        JOptionPane.showMessageDialog(null, "\n1. Syihab " + "\n2. Lukas" + "\n3. Fathan " + "\n4. Nesya "); 
                    z = JOptionPane.showConfirmDialog(null, "Mau cari menu lain?", "KANTOOLS",
                            JOptionPane.YES_NO_OPTION, 3);
                     case 8:
                                z = JOptionPane.showConfirmDialog(null, "Anda ingin keluar?", "Keluar", JOptionPane.YES_NO_OPTION, 0);
                                if (z == 0) {
                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan Tools Kami, KANTTOOLS");
                                    System.exit(0);
                                } else {
                                    break;
                                }
                            default:
                                JOptionPane.showMessageDialog(null, "Pilihan menu tidak tersedia\nSilahkan ulangi lagi", "ERROR", 0);
                }

        } while (1 == 1);
        }
    }


    
        
