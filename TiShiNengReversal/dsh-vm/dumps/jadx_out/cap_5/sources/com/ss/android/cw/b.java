package com.ss.android.cw;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b implements com.ss.android.cw.c {
    private final java.io.RandomAccessFile a;

    public b(java.io.File r3) throws java.io.FileNotFoundException {
            r2 = this;
            r2.<init>()
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "r"
            r0.<init>(r3, r1)
            r2.a = r0
            return
    }

    @Override // com.ss.android.cw.c
    public int j(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.a
            int r2 = r0.read(r2, r3, r4)
            return r2
    }

    @Override // com.ss.android.cw.c
    public long j() throws java.io.IOException {
            r2 = this;
            java.io.RandomAccessFile r0 = r2.a
            long r0 = r0.length()
            return r0
    }

    @Override // com.ss.android.cw.c
    public void j(long r1, long r3) throws java.io.IOException {
            r0 = this;
            java.io.RandomAccessFile r3 = r0.a
            r3.seek(r1)
            return
    }

    @Override // com.ss.android.cw.c
    public void xt() throws java.io.IOException {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.a
            r0.close()
            return
    }
}
