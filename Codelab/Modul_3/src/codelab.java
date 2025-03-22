class KarakterGame {
    protected String nama;
    protected int kesehatan;

    public  KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    public String getNama() {
        return nama;
    }

    public int getKesehatan() {
        return kesehatan;
    }

}

class Pahlawan extends KarakterGame {
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    public void serang(KarakterGame target) {
        System.out.println(nama + " menyerang " + target.getNama() + " menggunakan Lightning Attack!");
        target.kesehatan -= 30;
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}

class Musuh extends KarakterGame {
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    public void serang(KarakterGame target) {
        System.out.println(nama + " menyerang " + target.getNama() + " menggunakan Fire Whip!");
        target.kesehatan -= 25;
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}

class Main {
    public static void main(String[] args) {
        Pahlawan pahlawan = new Pahlawan("Zeus", 100);
        Musuh musuh = new Musuh("Demon", 100);

        System.out.println("Status awal:");
        System.out.println(pahlawan.getNama() + " memiliki kesehatan: " + pahlawan.getKesehatan());
        System.out.println(musuh.getNama() + " memiliki kesehatan: " + musuh.getKesehatan());
        System.out.println();


        pahlawan.serang(musuh);
        musuh.serang(pahlawan);
    }
}

