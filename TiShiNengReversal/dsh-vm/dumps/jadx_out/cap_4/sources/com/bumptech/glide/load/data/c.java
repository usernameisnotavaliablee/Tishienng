package com.bumptech.glide.load.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class c extends java.io.OutputStream {

    @androidx.annotation.NonNull
    private final java.io.OutputStream a;
    private byte[] b;
    private com.bumptech.glide.load.engine.bitmap_recycle.b c;
    private int d;

    public c(@androidx.annotation.NonNull java.io.OutputStream r2, @androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.b r3) {
            r1 = this;
            r0 = 65536(0x10000, float:9.1835E-41)
            r1.<init>(r2, r3, r0)
            return
    }

    @androidx.annotation.VisibleForTesting
    c(@androidx.annotation.NonNull java.io.OutputStream r1, com.bumptech.glide.load.engine.bitmap_recycle.b r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.c = r2
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.Object r1 = r2.c(r3, r1)
            byte[] r1 = (byte[]) r1
            r0.b = r1
            return
    }

    private void a() throws java.io.IOException {
            r4 = this;
            int r0 = r4.d
            if (r0 <= 0) goto Le
            java.io.OutputStream r1 = r4.a
            byte[] r2 = r4.b
            r3 = 0
            r1.write(r2, r3, r0)
            r4.d = r3
        Le:
            return
    }

    private void b() throws java.io.IOException {
            r2 = this;
            int r0 = r2.d
            byte[] r1 = r2.b
            int r1 = r1.length
            if (r0 != r1) goto La
            r2.a()
        La:
            return
    }

    private void release() {
            r2 = this;
            byte[] r0 = r2.b
            if (r0 == 0) goto Lc
            com.bumptech.glide.load.engine.bitmap_recycle.b r1 = r2.c
            r1.put(r0)
            r0 = 0
            r2.b = r0
        Lc:
            return
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            r2.flush()     // Catch: java.lang.Throwable -> Lc
            java.io.OutputStream r0 = r2.a
            r0.close()
            r2.release()
            return
        Lc:
            r0 = move-exception
            java.io.OutputStream r1 = r2.a
            r1.close()
            throw r0
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            r1.a()
            java.io.OutputStream r0 = r1.a
            r0.flush()
            return
    }

    @Override // java.io.OutputStream
    public void write(int r4) throws java.io.IOException {
            r3 = this;
            byte[] r0 = r3.b
            int r1 = r3.d
            int r2 = r1 + 1
            r3.d = r2
            byte r4 = (byte) r4
            r0[r1] = r4
            r3.b()
            return
    }

    @Override // java.io.OutputStream
    public void write(@androidx.annotation.NonNull byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.write(r3, r0, r1)
            return
    }

    @Override // java.io.OutputStream
    public void write(@androidx.annotation.NonNull byte[] r6, int r7, int r8) throws java.io.IOException {
            r5 = this;
            r0 = 0
        L1:
            int r1 = r8 - r0
            int r2 = r7 + r0
            int r3 = r5.d
            if (r3 != 0) goto L14
            byte[] r4 = r5.b
            int r4 = r4.length
            if (r1 < r4) goto L14
            java.io.OutputStream r7 = r5.a
            r7.write(r6, r2, r1)
            return
        L14:
            byte[] r4 = r5.b
            int r4 = r4.length
            int r4 = r4 - r3
            int r1 = java.lang.Math.min(r1, r4)
            byte[] r3 = r5.b
            int r4 = r5.d
            java.lang.System.arraycopy(r6, r2, r3, r4, r1)
            int r2 = r5.d
            int r2 = r2 + r1
            r5.d = r2
            int r0 = r0 + r1
            r5.b()
            if (r0 < r8) goto L1
            return
    }
}
