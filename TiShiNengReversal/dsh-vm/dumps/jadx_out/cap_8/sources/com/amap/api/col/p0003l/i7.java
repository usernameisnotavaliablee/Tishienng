package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class i7 {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f3512b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f3513c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f3514d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f3515e;

    public i7(android.content.Context r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) throws com.amap.api.col.p0003l.fk {
            r2 = this;
            r2.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L22
            int r0 = r6.length()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 > r1) goto L22
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            r2.a = r3
            r2.f3513c = r4
            r2.f3514d = r5
            r2.f3512b = r6
            return
        L22:
            com.amap.api.col.3l.fk r3 = new com.amap.api.col.3l.fk
            java.lang.String r4 = "无效的参数 - IllegalArgumentException"
            r3.<init>(r4)
            throw r3
    }

    private static byte[] c(int r5) {
            int r0 = r5 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            int r1 = r5 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            int r2 = r5 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r3 = 4
            byte[] r3 = new byte[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            r0 = 3
            r3[r0] = r5
            return r3
    }

    private byte[] d(java.lang.String r2) {
            r1 = this;
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r0 = 2
            if (r2 == 0) goto Ld
            byte[] r2 = new byte[r0]
            r2 = {x0022: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            return r2
        Ld:
            java.lang.String r2 = r1.f3515e
            byte[] r2 = com.amap.api.col.p0003l.q4.o(r2)
            if (r2 != 0) goto L1b
            byte[] r2 = new byte[r0]
            r2 = {x0028: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            return r2
        L1b:
            int r2 = r2.length
            byte[] r2 = com.amap.api.col.p0003l.q4.n(r2)
            return r2
    }

    public final void a(java.lang.String r3) throws com.amap.api.col.p0003l.fk {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L11
            int r0 = r3.length()
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 > r1) goto L11
            r2.f3515e = r3
            return
        L11:
            com.amap.api.col.3l.fk r3 = new com.amap.api.col.3l.fk
            java.lang.String r0 = "无效的参数 - IllegalArgumentException"
            r3.<init>(r0)
            throw r3
    }

    public final byte[] b() {
            r8 = this;
            r0 = 0
            byte[] r1 = new byte[r0]
            r2 = 0
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L51
            r3.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = r8.f3513c     // Catch: java.lang.Throwable -> L4e
            com.amap.api.col.p0003l.q4.k(r3, r2)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = r8.f3514d     // Catch: java.lang.Throwable -> L4e
            com.amap.api.col.p0003l.q4.k(r3, r2)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = r8.f3512b     // Catch: java.lang.Throwable -> L4e
            com.amap.api.col.p0003l.q4.k(r3, r2)     // Catch: java.lang.Throwable -> L4e
            android.content.Context r2 = r8.a     // Catch: java.lang.Throwable -> L4e
            int r2 = com.amap.api.col.p0003l.i4.M(r2)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L4e
            com.amap.api.col.p0003l.q4.k(r3, r2)     // Catch: java.lang.Throwable -> L4e
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2d
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            int r0 = (int) r4
        L2d:
            byte[] r0 = c(r0)     // Catch: java.lang.Throwable -> L4e
            r3.write(r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = r8.f3515e     // Catch: java.lang.Throwable -> L4e
            byte[] r0 = r8.d(r0)     // Catch: java.lang.Throwable -> L4e
            r3.write(r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = r8.f3515e     // Catch: java.lang.Throwable -> L4e
            byte[] r0 = com.amap.api.col.p0003l.q4.o(r0)     // Catch: java.lang.Throwable -> L4e
            r3.write(r0)     // Catch: java.lang.Throwable -> L4e
            byte[] r1 = r3.toByteArray()     // Catch: java.lang.Throwable -> L4e
            r3.close()     // Catch: java.lang.Throwable -> L5e
            goto L5e
        L4e:
            r0 = move-exception
            r2 = r3
            goto L52
        L51:
            r0 = move-exception
        L52:
            java.lang.String r3 = "se"
            java.lang.String r4 = "tds"
            com.amap.api.col.p0003l.w5.p(r0, r3, r4)     // Catch: java.lang.Throwable -> L5f
            if (r2 == 0) goto L5e
            r2.close()     // Catch: java.lang.Throwable -> L5e
        L5e:
            return r1
        L5f:
            r0 = move-exception
            if (r2 == 0) goto L65
            r2.close()     // Catch: java.lang.Throwable -> L65
        L65:
            throw r0
    }
}
