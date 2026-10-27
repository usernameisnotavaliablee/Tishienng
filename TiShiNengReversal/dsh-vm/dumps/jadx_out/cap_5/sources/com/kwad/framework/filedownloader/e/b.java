package com.kwad.framework.filedownloader.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b implements com.kwad.framework.filedownloader.e.a {
    private final java.io.BufferedOutputStream apy;
    private final java.io.RandomAccessFile apz;
    private final java.io.FileDescriptor fd;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a implements com.kwad.framework.filedownloader.f.c.e {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.kwad.framework.filedownloader.f.c.e
        public final com.kwad.framework.filedownloader.e.a c(java.io.File r2) {
                r1 = this;
                com.kwad.framework.filedownloader.e.b r0 = new com.kwad.framework.filedownloader.e.b
                r0.<init>(r2)
                return r0
        }
    }

    b(java.io.File r3) {
            r2 = this;
            r2.<init>()
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r3, r1)
            r2.apz = r0
            java.io.FileDescriptor r3 = r0.getFD()
            r2.fd = r3
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            java.io.FileDescriptor r0 = r0.getFD()
            r1.<init>(r0)
            r3.<init>(r1)
            r2.apy = r3
            return
    }

    @Override // com.kwad.framework.filedownloader.e.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            java.io.BufferedOutputStream r0 = r1.apy
            r0.close()
            java.io.RandomAccessFile r0 = r1.apz
            r0.close()
            return
    }

    @Override // com.kwad.framework.filedownloader.e.a
    public final void seek(long r2) {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.apz
            r0.seek(r2)
            return
    }

    @Override // com.kwad.framework.filedownloader.e.a
    public final void setLength(long r2) {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.apz
            r0.setLength(r2)
            return
    }

    @Override // com.kwad.framework.filedownloader.e.a
    public final void write(byte[] r2, int r3, int r4) {
            r1 = this;
            java.io.BufferedOutputStream r3 = r1.apy
            r0 = 0
            r3.write(r2, r0, r4)
            return
    }

    @Override // com.kwad.framework.filedownloader.e.a
    public final void zw() {
            r1 = this;
            java.io.BufferedOutputStream r0 = r1.apy
            r0.flush()
            java.io.FileDescriptor r0 = r1.fd
            r0.sync()
            return
    }
}
