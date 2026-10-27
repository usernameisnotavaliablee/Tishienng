package com.ss.android.socialbase.downloader.ae;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ae implements java.io.Closeable {
    private java.io.RandomAccessFile cw;
    private java.io.BufferedOutputStream j;
    private java.io.FileDescriptor xt;

    public ae(java.io.File r3, int r4) throws com.ss.android.socialbase.downloader.up.j {
            r2 = this;
            r2.<init>()
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.io.IOException -> L34
            java.lang.String r1 = "rw"
            r0.<init>(r3, r1)     // Catch: java.io.IOException -> L34
            r2.cw = r0     // Catch: java.io.IOException -> L34
            java.io.FileDescriptor r3 = r0.getFD()     // Catch: java.io.IOException -> L34
            r2.xt = r3     // Catch: java.io.IOException -> L34
            if (r4 <= 0) goto L36
            r3 = 8192(0x2000, float:1.148E-41)
            if (r4 >= r3) goto L1b
            r4 = 8192(0x2000, float:1.148E-41)
            goto L21
        L1b:
            r3 = 131072(0x20000, float:1.83671E-40)
            if (r4 <= r3) goto L21
            r4 = 131072(0x20000, float:1.83671E-40)
        L21:
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch: java.io.IOException -> L34
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L34
            java.io.RandomAccessFile r1 = r2.cw     // Catch: java.io.IOException -> L34
            java.io.FileDescriptor r1 = r1.getFD()     // Catch: java.io.IOException -> L34
            r0.<init>(r1)     // Catch: java.io.IOException -> L34
            r3.<init>(r0, r4)     // Catch: java.io.IOException -> L34
            r2.j = r3     // Catch: java.io.IOException -> L34
            return
        L34:
            r3 = move-exception
            goto L49
        L36:
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch: java.io.IOException -> L34
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L34
            java.io.RandomAccessFile r0 = r2.cw     // Catch: java.io.IOException -> L34
            java.io.FileDescriptor r0 = r0.getFD()     // Catch: java.io.IOException -> L34
            r4.<init>(r0)     // Catch: java.io.IOException -> L34
            r3.<init>(r4)     // Catch: java.io.IOException -> L34
            r2.j = r3     // Catch: java.io.IOException -> L34
            return
        L49:
            com.ss.android.socialbase.downloader.up.j r4 = new com.ss.android.socialbase.downloader.up.j
            r0 = 1039(0x40f, float:1.456E-42)
            r4.<init>(r0, r3)
            throw r4
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r4 = this;
            java.io.RandomAccessFile r0 = r4.cw
            java.io.BufferedOutputStream r1 = r4.j
            r2 = 2
            java.io.Closeable[] r2 = new java.io.Closeable[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            com.ss.android.socialbase.downloader.az.m.j(r2)
            return
    }

    public void cw() throws java.io.IOException {
            r1 = this;
            java.io.FileDescriptor r0 = r1.xt
            if (r0 == 0) goto L7
            r0.sync()
        L7:
            return
    }

    public void j() throws java.io.IOException {
            r1 = this;
            java.io.BufferedOutputStream r0 = r1.j
            if (r0 == 0) goto L7
            r0.flush()
        L7:
            java.io.FileDescriptor r0 = r1.xt
            if (r0 == 0) goto Le
            r0.sync()
        Le:
            return
    }

    public void j(long r2) throws java.io.IOException {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.cw
            r0.seek(r2)
            return
    }

    public void j(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.BufferedOutputStream r0 = r1.j
            r0.write(r2, r3, r4)
            return
    }

    public void xt() throws java.io.IOException {
            r1 = this;
            java.io.BufferedOutputStream r0 = r1.j
            if (r0 == 0) goto L7
            r0.flush()
        L7:
            return
    }

    public void xt(long r2) throws java.io.IOException {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.cw
            r0.setLength(r2)
            return
    }
}
