package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class t6 extends com.amap.api.col.p0003l.l4 {
    protected android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    protected com.amap.api.col.p0003l.p4 f3994b;

    /* renamed from: c, reason: collision with root package name */
    protected byte[] f3995c;

    public t6(android.content.Context r1, com.amap.api.col.p0003l.p4 r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto Lf
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.a = r1
        Lf:
            r0.f3994b = r2
            r1 = 1
            r0.setBinary(r1)
            return
    }

    protected static byte[] a(byte[] r0) {
            int r0 = r0.length
            byte[] r0 = com.amap.api.col.p0003l.q4.n(r0)
            return r0
    }

    private static byte[] i() {
            java.lang.String r0 = "gbh"
            java.lang.String r1 = "bre"
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            java.lang.String r3 = "PANDORA$"
            byte[] r3 = com.amap.api.col.p0003l.q4.o(r3)     // Catch: java.lang.Throwable -> L2f
            r2.write(r3)     // Catch: java.lang.Throwable -> L2f
            r3 = 1
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> L2f
            r5 = 0
            r4[r5] = r3     // Catch: java.lang.Throwable -> L2f
            r2.write(r4)     // Catch: java.lang.Throwable -> L2f
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L2f
            r3[r5] = r5     // Catch: java.lang.Throwable -> L2f
            r2.write(r3)     // Catch: java.lang.Throwable -> L2f
            byte[] r3 = r2.toByteArray()     // Catch: java.lang.Throwable -> L2f
            r2.close()     // Catch: java.lang.Throwable -> L2a
            return r3
        L2a:
            r2 = move-exception
            com.amap.api.col.p0003l.r5.e(r2, r1, r0)
            return r3
        L2f:
            r3 = move-exception
            com.amap.api.col.p0003l.r5.e(r3, r1, r0)     // Catch: java.lang.Throwable -> L3d
            r2.close()     // Catch: java.lang.Throwable -> L37
            goto L3b
        L37:
            r2 = move-exception
            com.amap.api.col.p0003l.r5.e(r2, r1, r0)
        L3b:
            r0 = 0
            return r0
        L3d:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r2 = move-exception
            com.amap.api.col.p0003l.r5.e(r2, r1, r0)
        L46:
            throw r3
    }

    private byte[] j() {
            r10 = this;
            java.lang.String r0 = "gred"
            java.lang.String r1 = "bre"
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            r3 = 1
            r4 = 0
            byte[] r5 = new byte[r3]     // Catch: java.lang.Throwable -> L32
            r6 = 3
            r5[r4] = r6     // Catch: java.lang.Throwable -> L32
            r2.write(r5)     // Catch: java.lang.Throwable -> L32
            boolean r5 = r10.f()     // Catch: java.lang.Throwable -> L32
            r6 = 2
            if (r5 == 0) goto L44
            android.content.Context r5 = r10.a     // Catch: java.lang.Throwable -> L32
            boolean r7 = r10.h()     // Catch: java.lang.Throwable -> L32
            com.amap.api.col.3l.p4 r8 = r10.f3994b     // Catch: java.lang.Throwable -> L32
            if (r8 == 0) goto L34
            java.lang.String r9 = "navi"
            java.lang.String r8 = r8.a()     // Catch: java.lang.Throwable -> L32
            boolean r8 = r9.equals(r8)     // Catch: java.lang.Throwable -> L32
            if (r8 == 0) goto L34
            r8 = 1
            goto L35
        L32:
            r5 = move-exception
            goto L99
        L34:
            r8 = 0
        L35:
            byte[] r5 = com.amap.api.col.p0003l.h4.f(r5, r7, r8)     // Catch: java.lang.Throwable -> L32
            byte[] r7 = a(r5)     // Catch: java.lang.Throwable -> L32
            r2.write(r7)     // Catch: java.lang.Throwable -> L32
            r2.write(r5)     // Catch: java.lang.Throwable -> L32
            goto L4c
        L44:
            byte[] r5 = new byte[r6]     // Catch: java.lang.Throwable -> L32
            r5 = {x00b6: FILL_ARRAY_DATA , data: [0, 0} // fill-array     // Catch: java.lang.Throwable -> L32
            r2.write(r5)     // Catch: java.lang.Throwable -> L32
        L4c:
            java.lang.String r5 = r10.e()     // Catch: java.lang.Throwable -> L32
            byte[] r5 = com.amap.api.col.p0003l.q4.o(r5)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L64
            int r7 = r5.length     // Catch: java.lang.Throwable -> L32
            if (r7 <= 0) goto L64
            byte[] r7 = a(r5)     // Catch: java.lang.Throwable -> L32
            r2.write(r7)     // Catch: java.lang.Throwable -> L32
            r2.write(r5)     // Catch: java.lang.Throwable -> L32
            goto L6c
        L64:
            byte[] r5 = new byte[r6]     // Catch: java.lang.Throwable -> L32
            r5 = {x00bc: FILL_ARRAY_DATA , data: [0, 0} // fill-array     // Catch: java.lang.Throwable -> L32
            r2.write(r5)     // Catch: java.lang.Throwable -> L32
        L6c:
            java.lang.String r5 = r10.g()     // Catch: java.lang.Throwable -> L32
            byte[] r5 = com.amap.api.col.p0003l.q4.o(r5)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L84
            int r7 = r5.length     // Catch: java.lang.Throwable -> L32
            if (r7 <= 0) goto L84
            byte[] r6 = a(r5)     // Catch: java.lang.Throwable -> L32
            r2.write(r6)     // Catch: java.lang.Throwable -> L32
            r2.write(r5)     // Catch: java.lang.Throwable -> L32
            goto L8c
        L84:
            byte[] r5 = new byte[r6]     // Catch: java.lang.Throwable -> L32
            r5 = {x00c2: FILL_ARRAY_DATA , data: [0, 0} // fill-array     // Catch: java.lang.Throwable -> L32
            r2.write(r5)     // Catch: java.lang.Throwable -> L32
        L8c:
            byte[] r3 = r2.toByteArray()     // Catch: java.lang.Throwable -> L32
            r2.close()     // Catch: java.lang.Throwable -> L94
            return r3
        L94:
            r2 = move-exception
            com.amap.api.col.p0003l.r5.e(r2, r1, r0)
            return r3
        L99:
            java.lang.String r6 = "gpd"
            com.amap.api.col.p0003l.r5.e(r5, r1, r6)     // Catch: java.lang.Throwable -> Lab
            r2.close()     // Catch: java.lang.Throwable -> La2
            goto La6
        La2:
            r2 = move-exception
            com.amap.api.col.p0003l.r5.e(r2, r1, r0)
        La6:
            byte[] r0 = new byte[r3]
            r0[r4] = r4
            return r0
        Lab:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> Lb0
            goto Lb4
        Lb0:
            r2 = move-exception
            com.amap.api.col.p0003l.r5.e(r2, r1, r0)
        Lb4:
            throw r3
    }

    private byte[] k() {
            r7 = this;
            java.lang.String r0 = "grrd"
            java.lang.String r1 = "bre"
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            r3 = 1
            r4 = 0
            byte[] r5 = r7.c()     // Catch: java.lang.Throwable -> L33
            if (r5 == 0) goto L35
            int r6 = r5.length     // Catch: java.lang.Throwable -> L33
            if (r6 != 0) goto L15
            goto L35
        L15:
            byte[] r6 = new byte[r3]     // Catch: java.lang.Throwable -> L33
            r6[r4] = r3     // Catch: java.lang.Throwable -> L33
            r2.write(r6)     // Catch: java.lang.Throwable -> L33
            byte[] r6 = a(r5)     // Catch: java.lang.Throwable -> L33
            r2.write(r6)     // Catch: java.lang.Throwable -> L33
            r2.write(r5)     // Catch: java.lang.Throwable -> L33
            byte[] r3 = r2.toByteArray()     // Catch: java.lang.Throwable -> L33
        L2a:
            r2.close()     // Catch: java.lang.Throwable -> L2e
            return r3
        L2e:
            r2 = move-exception
            com.amap.api.col.p0003l.r5.e(r2, r1, r0)
            return r3
        L33:
            r5 = move-exception
            goto L41
        L35:
            byte[] r5 = new byte[r3]     // Catch: java.lang.Throwable -> L33
            r5[r4] = r4     // Catch: java.lang.Throwable -> L33
            r2.write(r5)     // Catch: java.lang.Throwable -> L33
            byte[] r3 = r2.toByteArray()     // Catch: java.lang.Throwable -> L33
            goto L2a
        L41:
            com.amap.api.col.p0003l.r5.e(r5, r1, r0)     // Catch: java.lang.Throwable -> L51
            r2.close()     // Catch: java.lang.Throwable -> L48
            goto L4c
        L48:
            r2 = move-exception
            com.amap.api.col.p0003l.r5.e(r2, r1, r0)
        L4c:
            byte[] r0 = new byte[r3]
            r0[r4] = r4
            return r0
        L51:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L56
            goto L5a
        L56:
            r2 = move-exception
            com.amap.api.col.p0003l.r5.e(r2, r1, r0)
        L5a:
            throw r3
    }

    private byte[] l() {
            r7 = this;
            java.lang.String r0 = "gred"
            java.lang.String r1 = "bre"
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            r3 = 1
            r4 = 0
            byte[] r5 = r7.d()     // Catch: java.lang.Throwable -> L37
            if (r5 == 0) goto L39
            int r6 = r5.length     // Catch: java.lang.Throwable -> L37
            if (r6 != 0) goto L15
            goto L39
        L15:
            byte[] r6 = new byte[r3]     // Catch: java.lang.Throwable -> L37
            r6[r4] = r3     // Catch: java.lang.Throwable -> L37
            r2.write(r6)     // Catch: java.lang.Throwable -> L37
            byte[] r5 = com.amap.api.col.p0003l.h4.g(r5)     // Catch: java.lang.Throwable -> L37
            byte[] r6 = a(r5)     // Catch: java.lang.Throwable -> L37
            r2.write(r6)     // Catch: java.lang.Throwable -> L37
            r2.write(r5)     // Catch: java.lang.Throwable -> L37
            byte[] r3 = r2.toByteArray()     // Catch: java.lang.Throwable -> L37
        L2e:
            r2.close()     // Catch: java.lang.Throwable -> L32
            return r3
        L32:
            r2 = move-exception
            com.amap.api.col.p0003l.r5.e(r2, r1, r0)
            return r3
        L37:
            r5 = move-exception
            goto L45
        L39:
            byte[] r5 = new byte[r3]     // Catch: java.lang.Throwable -> L37
            r5[r4] = r4     // Catch: java.lang.Throwable -> L37
            r2.write(r5)     // Catch: java.lang.Throwable -> L37
            byte[] r3 = r2.toByteArray()     // Catch: java.lang.Throwable -> L37
            goto L2e
        L45:
            com.amap.api.col.p0003l.r5.e(r5, r1, r0)     // Catch: java.lang.Throwable -> L55
            r2.close()     // Catch: java.lang.Throwable -> L4c
            goto L50
        L4c:
            r2 = move-exception
            com.amap.api.col.p0003l.r5.e(r2, r1, r0)
        L50:
            byte[] r0 = new byte[r3]
            r0[r4] = r4
            return r0
        L55:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r2 = move-exception
            com.amap.api.col.p0003l.r5.e(r2, r1, r0)
        L5e:
            throw r3
    }

    public abstract byte[] c();

    public abstract byte[] d();

    protected java.lang.String e() {
            r1 = this;
            java.lang.String r0 = "2.1"
            return r0
    }

    public boolean f() {
            r1 = this;
            r0 = 1
            return r0
    }

    public java.lang.String g() {
            r4 = this;
            com.amap.api.col.3l.p4 r0 = r4.f3994b
            java.lang.String r0 = r0.f()
            com.amap.api.col.3l.p4 r1 = r4.f3994b
            java.lang.String r1 = r1.a()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "platform=Android&sdkversion=%s&product=%s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            return r0
    }

    @Override // com.amap.api.col.p0003l.Cif
    public final byte[] getEntityBytes() {
            r4 = this;
            java.lang.String r0 = "geb"
            java.lang.String r1 = "bre"
            byte[] r2 = r4.f3995c
            if (r2 == 0) goto L9
            return r2
        L9:
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            byte[] r3 = i()     // Catch: java.lang.Throwable -> L39
            r2.write(r3)     // Catch: java.lang.Throwable -> L39
            byte[] r3 = r4.j()     // Catch: java.lang.Throwable -> L39
            r2.write(r3)     // Catch: java.lang.Throwable -> L39
            byte[] r3 = r4.k()     // Catch: java.lang.Throwable -> L39
            r2.write(r3)     // Catch: java.lang.Throwable -> L39
            byte[] r3 = r4.l()     // Catch: java.lang.Throwable -> L39
            r2.write(r3)     // Catch: java.lang.Throwable -> L39
            byte[] r3 = r2.toByteArray()     // Catch: java.lang.Throwable -> L39
            r4.f3995c = r3     // Catch: java.lang.Throwable -> L39
            r2.close()     // Catch: java.lang.Throwable -> L34
            return r3
        L34:
            r2 = move-exception
            com.amap.api.col.p0003l.r5.e(r2, r1, r0)
            return r3
        L39:
            r3 = move-exception
            com.amap.api.col.p0003l.r5.e(r3, r1, r0)     // Catch: java.lang.Throwable -> L47
            r2.close()     // Catch: java.lang.Throwable -> L41
            goto L45
        L41:
            r2 = move-exception
            com.amap.api.col.p0003l.r5.e(r2, r1, r0)
        L45:
            r0 = 0
            return r0
        L47:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L4c
            goto L50
        L4c:
            r2 = move-exception
            com.amap.api.col.p0003l.r5.e(r2, r1, r0)
        L50:
            throw r3
    }

    @Override // com.amap.api.col.p0003l.Cif
    public java.util.Map<java.lang.String, java.lang.String> getParams() {
            r5 = this;
            android.content.Context r0 = r5.a
            java.lang.String r0 = com.amap.api.col.p0003l.f4.j(r0)
            java.lang.String r1 = com.amap.api.col.p0003l.h4.a()
            android.content.Context r2 = r5.a
            java.lang.String r3 = "key="
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r3 = r3.concat(r4)
            java.lang.String r2 = com.amap.api.col.p0003l.h4.c(r2, r1, r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "ts"
            r3.put(r4, r1)
            java.lang.String r1 = "key"
            r3.put(r1, r0)
            java.lang.String r0 = "scode"
            r3.put(r0, r2)
            return r3
    }

    protected boolean h() {
            r1 = this;
            r0 = 0
            return r0
    }
}
