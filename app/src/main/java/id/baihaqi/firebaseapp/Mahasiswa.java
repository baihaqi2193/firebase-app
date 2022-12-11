package id.baihaqi.firebaseapp;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String jurusan;
    private String angkatan;

    public Mahasiswa(String nim, String nama, String jurusan, String angkatan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.angkatan = angkatan;
    }

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getNama() {
        return nama;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
