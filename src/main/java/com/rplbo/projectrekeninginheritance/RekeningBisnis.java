package com.rplbo.projectrekeninginheritance;

public class RekeningBisnis extends Rekening {

    public RekeningBisnis(Nasabah nasabah, int saldo) {
        super(nasabah, saldo);
    }

    public RekeningBisnis(Nasabah nasabah) {
        super(nasabah);
    }

    @Override
    public void penyetoran(int jumlah) {
        int total = jumlah + bunga(jumlah);
        super.penyetoran(total);
    }

    private int bunga(int jumlah) {
        return (int) (jumlah * 0.1/100);
    }
}

