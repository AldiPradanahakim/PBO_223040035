package pertemuan_5;

public class Gelas {
    private String warna;

    public Gelas(String warna) {
        this.warna = warna;
    }
    
    // Setter
    void setWarna(String warna) {
        this.warna = warna;
    }

    //getter
    public String getWarna(){
        return warna;
    }

    public void show(String namaVar){
        System.out.println("Warna " +  namaVar + " " + getWarna());
    }
}