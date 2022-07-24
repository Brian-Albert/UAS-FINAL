package khs;

import java.util.ArrayList;

public class Khs {
    private String kodeKHS, keterangan, keteranganSingkat;
    private Mahasiswa mahasiswa;
    private Term term;
    public ArrayList<KhsDetail> khsDetails = new ArrayList<KhsDetail>();
    public ArrayList<Retake> retake = new ArrayList<Retake>();

    public Khs(String kodeKHS, String keterangan, String keteranganSingkat, Mahasiswa mahasiswa, Term term) {
        this.kodeKHS = kodeKHS;
        this.keterangan = keterangan;
        this.keteranganSingkat = keteranganSingkat;
        this.mahasiswa = mahasiswa;
        this.term = term;
    }

    public String getKodeKHS() {
        return this.kodeKHS;
    }

    public void setKodeKHS(String kodeKHS) {
        this.kodeKHS = kodeKHS;
    }

    public String getKeterangan() {
        return this.keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getKeteranganSingkat() {
        return this.keteranganSingkat;
    }

    public void setKeteranganSingkat(String keteranganSingkat) {
        this.keteranganSingkat = keteranganSingkat;
    }

    public Mahasiswa getMahasiswa() {
        return this.mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public Term getTerm() {
        return this.term;
    }

    public void setTerm(Term term) {
        this.term = term;
    }

    public ArrayList<KhsDetail> getKhsDetails() {
        return this.khsDetails;
    }

    public void setKhsDetails(ArrayList<KhsDetail> khsDetails) {
        this.khsDetails = khsDetails;
    }

    // public void cetakKHS() {
    //     for (KhsDetail khsDetail : khsDetails) {
    //             khsDetail.tampilkanDetailKHS();  
    //     }
    //     System.out.println("---------------------------------------------------------------------------");
    // }

    public Term getDetailTerm(){
        return term;
    }

    public double getIPSemester() {
        float sumNilai = 0.0f;
        float sumSKS = 0.0f;
        for (KhsDetail i : khsDetails) {
            if (i.getStringRetake() == "retake") {
                continue;
            }
            else {
                float nilaiRetake = 0.0f; 
                int cek = 0;  
                if(retake.size()>0){
                    for(Retake r : retake){
                        if(i.getDetailMatakuliah().getKodeMataKuliah().equals(r.getDetailMatakuliah().getKodeMataKuliah())){
                            nilaiRetake += r.konversiNilai();
                            cek++;
                            break;
                        }
                    }
                }
                if(cek==1){
                    sumNilai+=nilaiRetake*i.getDetailMatakuliah().getSks();
                }
                else {
                    sumNilai+=i.konversiNilai()*i.getDetailMatakuliah().getSks();
                }
                sumSKS += i.getDetailMatakuliah().getSks();
            }
        }
        if(sumNilai==0.0f){
            return 0;
        }
        return sumNilai/sumSKS;
    }

}
