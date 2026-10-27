package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class t0 {
    java.io.RandomAccessFile a;

    public t0() throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = ""
            r1 = 0
            r3.<init>(r0, r1)
            return
    }

    public t0(java.lang.String r4, long r5) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L31
            java.io.File r1 = r0.getParentFile()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L1f
            java.io.File r1 = r0.getParentFile()
            r1.mkdirs()
        L1f:
            boolean r1 = r0.exists()     // Catch: java.io.IOException -> L29
            if (r1 != 0) goto L31
            r0.createNewFile()     // Catch: java.io.IOException -> L29
            goto L31
        L29:
            r0 = move-exception
            java.lang.String r1 = "FileAccessI"
            java.lang.String r2 = "create"
            com.amap.api.col.p0003l.w5.p(r0, r1, r2)
        L31:
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r4, r1)
            r3.a = r0
            r0.seek(r5)
            return
    }

    public final synchronized int a(byte[] r2) throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.io.RandomAccessFile r0 = r1.a     // Catch: java.lang.Throwable -> L9
            r0.write(r2)     // Catch: java.lang.Throwable -> L9
            int r2 = r2.length     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public final void b() {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.a
            if (r0 == 0) goto La
            r0.close()     // Catch: java.io.IOException -> L7
        L7:
            r0 = 0
            r1.a = r0
        La:
            return
    }
}
