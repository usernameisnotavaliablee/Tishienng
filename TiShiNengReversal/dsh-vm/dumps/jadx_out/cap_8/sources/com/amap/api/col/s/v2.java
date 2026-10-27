package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class v2 extends com.amap.api.col.s.f1 {
    protected android.content.Context m;
    protected com.amap.api.col.s.i1 n;
    protected byte[] o;

    public v2(android.content.Context r1, com.amap.api.col.s.i1 r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto Lf
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.m = r1
        Lf:
            r0.n = r2
            r0.y()
            return
    }

    private byte[] H() {
            r8 = this;
            java.lang.String r0 = "gred"
            java.lang.String r1 = "bre"
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            r3 = 1
            r4 = 0
            byte[] r5 = new byte[r3]     // Catch: java.lang.Throwable -> L27
            r6 = 3
            r5[r4] = r6     // Catch: java.lang.Throwable -> L27
            r2.write(r5)     // Catch: java.lang.Throwable -> L27
            android.content.Context r5 = r8.m     // Catch: java.lang.Throwable -> L27
            com.amap.api.col.s.i1 r6 = r8.n     // Catch: java.lang.Throwable -> L27
            if (r6 == 0) goto L29
            java.lang.String r7 = "navi"
            java.lang.String r6 = r6.d()     // Catch: java.lang.Throwable -> L27
            boolean r6 = r7.equals(r6)     // Catch: java.lang.Throwable -> L27
            if (r6 == 0) goto L29
            r6 = 1
            goto L2a
        L27:
            r5 = move-exception
            goto L86
        L29:
            r6 = 0
        L2a:
            byte[] r5 = com.amap.api.col.s.a1.f(r5, r6)     // Catch: java.lang.Throwable -> L27
            byte[] r6 = K(r5)     // Catch: java.lang.Throwable -> L27
            r2.write(r6)     // Catch: java.lang.Throwable -> L27
            r2.write(r5)     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = r8.M()     // Catch: java.lang.Throwable -> L27
            byte[] r5 = com.amap.api.col.s.j1.o(r5)     // Catch: java.lang.Throwable -> L27
            r6 = 2
            if (r5 == 0) goto L51
            int r7 = r5.length     // Catch: java.lang.Throwable -> L27
            if (r7 <= 0) goto L51
            byte[] r7 = K(r5)     // Catch: java.lang.Throwable -> L27
            r2.write(r7)     // Catch: java.lang.Throwable -> L27
            r2.write(r5)     // Catch: java.lang.Throwable -> L27
            goto L59
        L51:
            byte[] r5 = new byte[r6]     // Catch: java.lang.Throwable -> L27
            r5 = {x00a2: FILL_ARRAY_DATA , data: [0, 0} // fill-array     // Catch: java.lang.Throwable -> L27
            r2.write(r5)     // Catch: java.lang.Throwable -> L27
        L59:
            java.lang.String r5 = r8.N()     // Catch: java.lang.Throwable -> L27
            byte[] r5 = com.amap.api.col.s.j1.o(r5)     // Catch: java.lang.Throwable -> L27
            if (r5 == 0) goto L71
            int r7 = r5.length     // Catch: java.lang.Throwable -> L27
            if (r7 <= 0) goto L71
            byte[] r6 = K(r5)     // Catch: java.lang.Throwable -> L27
            r2.write(r6)     // Catch: java.lang.Throwable -> L27
            r2.write(r5)     // Catch: java.lang.Throwable -> L27
            goto L79
        L71:
            byte[] r5 = new byte[r6]     // Catch: java.lang.Throwable -> L27
            r5 = {x00a8: FILL_ARRAY_DATA , data: [0, 0} // fill-array     // Catch: java.lang.Throwable -> L27
            r2.write(r5)     // Catch: java.lang.Throwable -> L27
        L79:
            byte[] r3 = r2.toByteArray()     // Catch: java.lang.Throwable -> L27
            r2.close()     // Catch: java.lang.Throwable -> L81
            return r3
        L81:
            r2 = move-exception
            com.amap.api.col.s.d2.e(r2, r1, r0)
            return r3
        L86:
            java.lang.String r6 = "gpd"
            com.amap.api.col.s.d2.e(r5, r1, r6)     // Catch: java.lang.Throwable -> L98
            r2.close()     // Catch: java.lang.Throwable -> L8f
            goto L93
        L8f:
            r2 = move-exception
            com.amap.api.col.s.d2.e(r2, r1, r0)
        L93:
            byte[] r0 = new byte[r3]
            r0[r4] = r4
            return r0
        L98:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L9d
            goto La1
        L9d:
            r2 = move-exception
            com.amap.api.col.s.d2.e(r2, r1, r0)
        La1:
            throw r3
    }

    private static byte[] I() {
            java.lang.String r0 = "grrd"
            java.lang.String r1 = "bre"
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            r3 = 1
            r4 = 0
            byte[] r5 = new byte[r3]     // Catch: java.lang.Throwable -> L1f
            r5[r4] = r4     // Catch: java.lang.Throwable -> L1f
            r2.write(r5)     // Catch: java.lang.Throwable -> L1f
            byte[] r3 = r2.toByteArray()     // Catch: java.lang.Throwable -> L1f
            r2.close()     // Catch: java.lang.Throwable -> L1a
            return r3
        L1a:
            r2 = move-exception
            com.amap.api.col.s.d2.e(r2, r1, r0)
            return r3
        L1f:
            r5 = move-exception
            com.amap.api.col.s.d2.e(r5, r1, r0)     // Catch: java.lang.Throwable -> L30
            r2.close()     // Catch: java.lang.Throwable -> L27
            goto L2b
        L27:
            r2 = move-exception
            com.amap.api.col.s.d2.e(r2, r1, r0)
        L2b:
            byte[] r0 = new byte[r3]
            r0[r4] = r4
            return r0
        L30:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r2 = move-exception
            com.amap.api.col.s.d2.e(r2, r1, r0)
        L39:
            throw r3
    }

    private byte[] J() {
            r7 = this;
            java.lang.String r0 = "gred"
            java.lang.String r1 = "bre"
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            r3 = 1
            r4 = 0
            byte[] r5 = r7.L()     // Catch: java.lang.Throwable -> L37
            if (r5 == 0) goto L39
            int r6 = r5.length     // Catch: java.lang.Throwable -> L37
            if (r6 != 0) goto L15
            goto L39
        L15:
            byte[] r6 = new byte[r3]     // Catch: java.lang.Throwable -> L37
            r6[r4] = r3     // Catch: java.lang.Throwable -> L37
            r2.write(r6)     // Catch: java.lang.Throwable -> L37
            byte[] r5 = com.amap.api.col.s.a1.g(r5)     // Catch: java.lang.Throwable -> L37
            byte[] r6 = K(r5)     // Catch: java.lang.Throwable -> L37
            r2.write(r6)     // Catch: java.lang.Throwable -> L37
            r2.write(r5)     // Catch: java.lang.Throwable -> L37
            byte[] r3 = r2.toByteArray()     // Catch: java.lang.Throwable -> L37
        L2e:
            r2.close()     // Catch: java.lang.Throwable -> L32
            return r3
        L32:
            r2 = move-exception
            com.amap.api.col.s.d2.e(r2, r1, r0)
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
            com.amap.api.col.s.d2.e(r5, r1, r0)     // Catch: java.lang.Throwable -> L55
            r2.close()     // Catch: java.lang.Throwable -> L4c
            goto L50
        L4c:
            r2 = move-exception
            com.amap.api.col.s.d2.e(r2, r1, r0)
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
            com.amap.api.col.s.d2.e(r2, r1, r0)
        L5e:
            throw r3
    }

    private static byte[] K(byte[] r0) {
            int r0 = r0.length
            byte[] r0 = com.amap.api.col.s.j1.n(r0)
            return r0
    }

    private static byte[] O() {
            java.lang.String r0 = "gbh"
            java.lang.String r1 = "bre"
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            java.lang.String r3 = "PANDORA$"
            byte[] r3 = com.amap.api.col.s.j1.o(r3)     // Catch: java.lang.Throwable -> L2f
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
            com.amap.api.col.s.d2.e(r2, r1, r0)
            return r3
        L2f:
            r3 = move-exception
            com.amap.api.col.s.d2.e(r3, r1, r0)     // Catch: java.lang.Throwable -> L3d
            r2.close()     // Catch: java.lang.Throwable -> L37
            goto L3b
        L37:
            r2 = move-exception
            com.amap.api.col.s.d2.e(r2, r1, r0)
        L3b:
            r0 = 0
            return r0
        L3d:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r2 = move-exception
            com.amap.api.col.s.d2.e(r2, r1, r0)
        L46:
            throw r3
    }

    public abstract byte[] L();

    protected java.lang.String M() {
            r1 = this;
            java.lang.String r0 = "2.1"
            return r0
    }

    public final java.lang.String N() {
            r4 = this;
            com.amap.api.col.s.i1 r0 = r4.n
            java.lang.String r0 = r0.f()
            com.amap.api.col.s.i1 r1 = r4.n
            java.lang.String r1 = r1.d()
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

    @Override // com.amap.api.col.s.dz
    public final java.util.Map<java.lang.String, java.lang.String> o() {
            r5 = this;
            android.content.Context r0 = r5.m
            java.lang.String r0 = com.amap.api.col.s.x0.i(r0)
            java.lang.String r1 = com.amap.api.col.s.a1.a()
            android.content.Context r2 = r5.m
            java.lang.String r3 = "key="
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r3 = r3.concat(r4)
            java.lang.String r2 = com.amap.api.col.s.a1.c(r2, r1, r3)
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

    @Override // com.amap.api.col.s.dz
    public final byte[] q() {
            r4 = this;
            java.lang.String r0 = "geb"
            java.lang.String r1 = "bre"
            byte[] r2 = r4.o
            if (r2 == 0) goto L9
            return r2
        L9:
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            byte[] r3 = O()     // Catch: java.lang.Throwable -> L39
            r2.write(r3)     // Catch: java.lang.Throwable -> L39
            byte[] r3 = r4.H()     // Catch: java.lang.Throwable -> L39
            r2.write(r3)     // Catch: java.lang.Throwable -> L39
            byte[] r3 = I()     // Catch: java.lang.Throwable -> L39
            r2.write(r3)     // Catch: java.lang.Throwable -> L39
            byte[] r3 = r4.J()     // Catch: java.lang.Throwable -> L39
            r2.write(r3)     // Catch: java.lang.Throwable -> L39
            byte[] r3 = r2.toByteArray()     // Catch: java.lang.Throwable -> L39
            r4.o = r3     // Catch: java.lang.Throwable -> L39
            r2.close()     // Catch: java.lang.Throwable -> L34
            return r3
        L34:
            r2 = move-exception
            com.amap.api.col.s.d2.e(r2, r1, r0)
            return r3
        L39:
            r3 = move-exception
            com.amap.api.col.s.d2.e(r3, r1, r0)     // Catch: java.lang.Throwable -> L47
            r2.close()     // Catch: java.lang.Throwable -> L41
            goto L45
        L41:
            r2 = move-exception
            com.amap.api.col.s.d2.e(r2, r1, r0)
        L45:
            r0 = 0
            return r0
        L47:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L4c
            goto L50
        L4c:
            r2 = move-exception
            com.amap.api.col.s.d2.e(r2, r1, r0)
        L50:
            throw r3
    }
}
