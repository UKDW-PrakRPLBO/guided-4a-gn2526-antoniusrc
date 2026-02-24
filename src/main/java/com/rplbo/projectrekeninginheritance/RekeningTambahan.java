package com.rplbo.projectrekeninginheritance;

public class RekeningTambahan extends RekeningKeluarga{

    public RekeningTambahan(Nasabah nasabah, int saldo) {
        super(nasabah, saldo);
    }

    public RekeningTambahan(Nasabah nasabah) {
        super(nasabah);
    }

    public void penarikan(int jumlah) {
        if (jumlah < 500000){
            super.penarikan(jumlah);
        }
    }
}
