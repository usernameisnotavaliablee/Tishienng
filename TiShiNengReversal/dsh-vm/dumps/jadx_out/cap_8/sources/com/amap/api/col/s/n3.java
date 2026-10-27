package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class n3 extends com.amap.api.col.s.p3 {

    /* renamed from: d, reason: collision with root package name */
    public static int f4579d = 13;

    /* renamed from: e, reason: collision with root package name */
    public static int f4580e = 6;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f4581c;

    static {
            return
    }

    public n3(android.content.Context r1, com.amap.api.col.s.p3 r2) {
            r0 = this;
            r0.<init>(r2)
            r0.f4581c = r1
            return
    }

    private static byte[] d(android.content.Context r5) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            byte[] r2 = new byte[r1]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = "1.2."
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L7a
            int r4 = com.amap.api.col.s.n3.f4579d     // Catch: java.lang.Throwable -> L7a
            r3.append(r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = "."
            r3.append(r4)     // Catch: java.lang.Throwable -> L7a
            int r4 = com.amap.api.col.s.n3.f4580e     // Catch: java.lang.Throwable -> L7a
            r3.append(r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L7a
            com.amap.api.col.s.j1.k(r0, r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = "Android"
            com.amap.api.col.s.j1.k(r0, r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = com.amap.api.col.s.c1.H()     // Catch: java.lang.Throwable -> L7a
            com.amap.api.col.s.j1.k(r0, r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = com.amap.api.col.s.c1.C()     // Catch: java.lang.Throwable -> L7a
            com.amap.api.col.s.j1.k(r0, r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = com.amap.api.col.s.c1.y(r5)     // Catch: java.lang.Throwable -> L7a
            com.amap.api.col.s.j1.k(r0, r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L7a
            com.amap.api.col.s.j1.k(r0, r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L7a
            com.amap.api.col.s.j1.k(r0, r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = android.os.Build.DEVICE     // Catch: java.lang.Throwable -> L7a
            com.amap.api.col.s.j1.k(r0, r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = com.amap.api.col.s.c1.M()     // Catch: java.lang.Throwable -> L7a
            com.amap.api.col.s.j1.k(r0, r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = com.amap.api.col.s.x0.f(r5)     // Catch: java.lang.Throwable -> L7a
            com.amap.api.col.s.j1.k(r0, r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = com.amap.api.col.s.x0.g(r5)     // Catch: java.lang.Throwable -> L7a
            com.amap.api.col.s.j1.k(r0, r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r5 = com.amap.api.col.s.x0.i(r5)     // Catch: java.lang.Throwable -> L7a
            com.amap.api.col.s.j1.k(r0, r5)     // Catch: java.lang.Throwable -> L7a
            r5 = 1
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L7a
            r5[r1] = r1     // Catch: java.lang.Throwable -> L7a
            r0.write(r5)     // Catch: java.lang.Throwable -> L7a
            byte[] r2 = r0.toByteArray()     // Catch: java.lang.Throwable -> L7a
        L76:
            r0.close()     // Catch: java.lang.Throwable -> L83
            goto L83
        L7a:
            r5 = move-exception
            java.lang.String r1 = "sm"
            java.lang.String r3 = "gh"
            com.amap.api.col.s.g2.o(r5, r1, r3)     // Catch: java.lang.Throwable -> L84
            goto L76
        L83:
            return r2
        L84:
            r5 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L88
        L88:
            throw r5
    }

    @Override // com.amap.api.col.s.p3
    protected final byte[] b(byte[] r5) {
            r4 = this;
            android.content.Context r0 = r4.f4581c
            byte[] r0 = d(r0)
            int r1 = r0.length
            int r2 = r5.length
            int r1 = r1 + r2
            byte[] r1 = new byte[r1]
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            int r0 = r0.length
            int r2 = r5.length
            java.lang.System.arraycopy(r5, r3, r1, r0, r2)
            return r1
    }
}
