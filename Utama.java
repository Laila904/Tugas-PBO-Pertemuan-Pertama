/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuankesatu;

/**
 *
 * @author ASUS
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hewan gajah = new Hewan();
        gajah.bernapas();
        gajah.tumbuh();
        gajah.setBerjalan("berjalan");
        gajah.setJumlahKaki(4);
        System.out.println("Gajah Adalah hewan yang " + gajah.getBerjalan() + " dan jumlah kakinya adalah " + gajah.getJumlahKaki());
        System.out.println();

        Tumbuhan nanas = new Tumbuhan();
        nanas.bernapas();
        nanas.tumbuh();
        nanas.setWarnaDaun("hijau");
        nanas.setArahDaun("timur");
        System.out.println("Nanas adalah buah yang daunnya berwarna " + nanas.getWarnaDaun() + ", Dan arah daun pada waktu siang adalah " + nanas.getArahDaun());
        System.out.println();

        Aves merpati = new Aves();
        merpati.bernapas();
        merpati.tumbuh();
        merpati.setBersayap("sayap");
        merpati.setBerbulu("bulu");
        System.out.println("merpati merupakan hewan yang mempunyai " + merpati.getBersayap() + " dan memiliki " + merpati.getBerbulu());
        System.out.println();
        
        Mamalia unta = new Mamalia();
        unta.bernapas();
        unta.tumbuh();
        unta.setMelahirkan("melahirkan");
        unta.setMenyusui("menyusui");
        System.out.println("unta merupakan hewan yang " + unta.getMelahirkan() + " dan juga " + unta.getMenyusui());
        System.out.println();
        
        Amfibi ceacilian = new Amfibi();
        ceacilian.bernapas();
        ceacilian.tumbuh();
        ceacilian.setJumlahHabitat("dua");
        ceacilian.setTipeJantung(3);
        System.out.println("Ceacilian merupakan hewan mempunyai habitat " + ceacilian.getJumlahHabitat() + " dan memiliki tipe jantung " + ceacilian.getTipeJantung());
        System.out.println();
        
        Reptil bunglon = new Reptil();
        bunglon.bernapas();
        bunglon.tumbuh();
        bunglon.setMetabolisme("metabolisme");
        bunglon.setKamuflase("kamuflase");
        System.out.println("bunglon merupakan hewang yang bisa " + bunglon.getKamuflase() + " dan juga bisa ber " + bunglon.getKamuflase());
        System.out.println();
        
        ikan salmon = new ikan();
        salmon.bernapas();
        salmon.tumbuh();
        salmon.setIngsang("ingsang");
        salmon.setSisik("sisik");
        System.out.println("Ikan salmon adalah ikan yang bernafas menggunakan " + salmon.getIngsang() + " dan juga memiliki " + salmon.getSisik());
        System.out.println();
        
        Monokotil anggrek = new Monokotil();
        anggrek.setJumlahKelopakBunga(6);
        anggrek.setAkarSrabut("akar serabut");
        System.out.println("Bunga anggrek mempunyai jumlah kelopak bunga " + anggrek.getJumlahKelopakBunga() + " dan mempunyai " + anggrek.getAkarSrabut());
        System.out.println();
        
        Dikotil jambuBiji = new Dikotil();
        jambuBiji.setJumlahBagianBunga("kelipatan empat atau lima");
        jambuBiji.setPolaTulangDaun("menyirip atau menjari");
        System.out.println("jambu biji merupakan tumbuhan yang memiliki jumlah kelopak dengan " + jambuBiji.getJumlahBagianBunga() + " dan juga memiliki pola tulang daun " + jambuBiji.getPolaTulangDaun());
        System.out.println("");
    }
}
