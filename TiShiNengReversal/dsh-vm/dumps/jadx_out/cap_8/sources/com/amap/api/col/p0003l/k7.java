package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class k7 {
    public k7() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.amap.api.col.p0003l.d7 a(java.lang.ref.WeakReference<com.amap.api.col.p0003l.d7> r1) {
            if (r1 == 0) goto L8
            java.lang.Object r0 = r1.get()
            if (r0 != 0) goto L12
        L8:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            com.amap.api.col.3l.d7 r0 = new com.amap.api.col.3l.d7
            r0.<init>()
            r1.<init>(r0)
        L12:
            java.lang.Object r1 = r1.get()
            com.amap.api.col.3l.d7 r1 = (com.amap.api.col.p0003l.d7) r1
            return r1
    }

    public static java.lang.String b() {
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = com.amap.api.col.p0003l.q4.b(r0)
            return r0
    }

    public static java.lang.String c(android.content.Context r3, com.amap.api.col.p0003l.p4 r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.amap.api.col.p0003l.i4.C()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = "\"sim\":\""
            r0.append(r2)     // Catch: java.lang.Throwable -> L6a
            r0.append(r1)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = "\",\"sdkversion\":\""
            r0.append(r1)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = r4.f()     // Catch: java.lang.Throwable -> L6a
            r0.append(r1)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = "\",\"product\":\""
            r0.append(r1)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = r4.a()     // Catch: java.lang.Throwable -> L6a
            r0.append(r1)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = "\",\"ed\":\""
            r0.append(r1)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = r4.g()     // Catch: java.lang.Throwable -> L6a
            r0.append(r4)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = "\",\"nt\":\""
            r0.append(r4)     // Catch: java.lang.Throwable -> L6a
            int r4 = com.amap.api.col.p0003l.i4.y(r3)     // Catch: java.lang.Throwable -> L6a
            r0.append(r4)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = "\",\"np\":\""
            r0.append(r4)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = com.amap.api.col.p0003l.i4.w(r3)     // Catch: java.lang.Throwable -> L6a
            r0.append(r4)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = "\",\"mnc\":\""
            r0.append(r4)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = com.amap.api.col.p0003l.i4.B()     // Catch: java.lang.Throwable -> L6a
            r0.append(r4)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = "\",\"ant\":\""
            r0.append(r4)     // Catch: java.lang.Throwable -> L6a
            int r3 = com.amap.api.col.p0003l.i4.A(r3)     // Catch: java.lang.Throwable -> L6a
            r0.append(r3)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r3 = "\""
            r0.append(r3)     // Catch: java.lang.Throwable -> L6a
        L6a:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static java.lang.String d(java.lang.String r1, java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = ",\"timestamp\":\""
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "\",\"et\":\""
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "\",\"classname\":\""
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = "\","
            r0.append(r1)
            java.lang.String r1 = "\"detail\":\""
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = "\""
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String e(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = ",\"timestamp\":\""
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "\",\"et\":\""
            r0.append(r1)
            r1 = 1
            r0.append(r1)
            java.lang.String r1 = "\",\"classname\":\""
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "\","
            r0.append(r1)
            java.lang.String r1 = "\"detail\":\""
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = "\""
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static void f(android.content.Context r0, com.amap.api.col.p0003l.d7 r1, java.lang.String r2, int r3, int r4, java.lang.String r5) {
            java.lang.String r0 = com.amap.api.col.p0003l.s5.i(r0, r2)
            r1.a = r0
            r1.f3149d = r3
            long r2 = (long) r4
            r1.f3147b = r2
            r1.f3148c = r5
            return
    }

    static byte[] g(com.amap.api.col.p0003l.p6 r4, java.lang.String r5) {
            r0 = 0
            byte[] r0 = new byte[r0]
            r1 = 0
            com.amap.api.col.3l.p6$e r4 = r4.a(r5)     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L2b
            java.io.InputStream r1 = r4.a()     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L19
            if (r1 == 0) goto L15
            r1.close()     // Catch: java.lang.Throwable -> L15
        L15:
            r4.close()     // Catch: java.lang.Throwable -> L30
            goto L30
        L19:
            int r5 = r1.available()     // Catch: java.lang.Throwable -> L29
            byte[] r0 = new byte[r5]     // Catch: java.lang.Throwable -> L29
            r1.read(r0)     // Catch: java.lang.Throwable -> L29
            r1.close()     // Catch: java.lang.Throwable -> L25
        L25:
            r4.close()     // Catch: java.lang.Throwable -> L28
        L28:
            return r0
        L29:
            r5 = move-exception
            goto L33
        L2b:
            if (r4 == 0) goto L30
            r4.close()     // Catch: java.lang.Throwable -> L30
        L30:
            return r0
        L31:
            r5 = move-exception
            r4 = r1
        L33:
            java.lang.String r2 = "sui"
            java.lang.String r3 = "rdS"
            com.amap.api.col.p0003l.w5.p(r5, r2, r3)     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L41
            r1.close()     // Catch: java.lang.Throwable -> L40
            goto L41
        L40:
        L41:
            if (r4 == 0) goto L46
            r4.close()     // Catch: java.lang.Throwable -> L46
        L46:
            return r0
        L47:
            r5 = move-exception
            if (r1 == 0) goto L4f
            r1.close()     // Catch: java.lang.Throwable -> L4e
            goto L4f
        L4e:
        L4f:
            if (r4 == 0) goto L54
            r4.close()     // Catch: java.lang.Throwable -> L54
        L54:
            throw r5
    }
}
