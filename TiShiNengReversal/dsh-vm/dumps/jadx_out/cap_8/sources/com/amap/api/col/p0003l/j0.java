package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class j0 {
    private android.content.Context a;

    public j0(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private static boolean b(java.lang.String r5, android.content.Context r6, java.lang.String r7) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = com.amap.api.col.p0003l.b3.X(r6)
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L4c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r3.<init>()     // Catch: java.lang.Throwable -> L4c
            r3.append(r0)     // Catch: java.lang.Throwable -> L4c
            r3.append(r7)     // Catch: java.lang.Throwable -> L4c
            r3.append(r5)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r4 = ".dat"
            r3.append(r4)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4c
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4c
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L35
            boolean r2 = com.amap.api.col.p0003l.a1.l(r2)     // Catch: java.lang.Throwable -> L4c
            if (r2 != 0) goto L35
            return r1
        L35:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c java.lang.Throwable -> L4c
            r2.<init>()     // Catch: java.lang.Throwable -> L4c java.lang.Throwable -> L4c
            r2.append(r0)     // Catch: java.lang.Throwable -> L4c java.lang.Throwable -> L4c
            r2.append(r7)     // Catch: java.lang.Throwable -> L4c java.lang.Throwable -> L4c
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L4c java.lang.Throwable -> L4c
            com.amap.api.col.p0003l.a1.h(r7)     // Catch: java.lang.Throwable -> L4c java.lang.Throwable -> L4c
            com.amap.api.col.p0003l.a1.k(r5, r6)     // Catch: java.lang.Throwable -> L4c java.lang.Throwable -> L4c
            r5 = 1
            return r5
        L4c:
            return r1
    }

    private boolean c(com.amap.api.col.p0003l.ax r7) {
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L47
            java.lang.String r1 = r7.getPinyin()
            android.content.Context r2 = r6.a
            java.lang.String r3 = "vmap/"
            boolean r2 = b(r1, r2, r3)
            java.lang.String r3 = "quanguogaiyaotu"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L19
            java.lang.String r1 = "quanguo"
        L19:
            android.content.Context r3 = r6.a
            java.lang.String r4 = "map/"
            boolean r1 = b(r1, r3, r4)
            r3 = 1
            if (r1 != 0) goto L29
            if (r2 == 0) goto L27
            goto L29
        L27:
            r1 = 0
            goto L2a
        L29:
            r1 = 1
        L2a:
            java.lang.String r2 = r7.getUrl()
            java.lang.String r2 = com.amap.api.col.p0003l.a1.i(r2)
            android.content.Context r5 = r6.a
            boolean r2 = d(r2, r5, r4)
            if (r2 != 0) goto L3e
            if (r1 == 0) goto L3d
            goto L3e
        L3d:
            r3 = 0
        L3e:
            if (r3 == 0) goto L44
            r7.B()
            return r3
        L44:
            r7.A()
        L47:
            return r0
    }

    private static boolean d(java.lang.String r4, android.content.Context r5, java.lang.String r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = com.amap.api.col.p0003l.b3.v(r5)
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r3.<init>()     // Catch: java.lang.Throwable -> L47
            r3.append(r0)     // Catch: java.lang.Throwable -> L47
            r3.append(r6)     // Catch: java.lang.Throwable -> L47
            r3.append(r4)     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L47
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L47
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L47
            if (r3 == 0) goto L30
            boolean r2 = com.amap.api.col.p0003l.a1.l(r2)     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L30
            return r1
        L30:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L47
            r2.<init>()     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L47
            r2.append(r0)     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L47
            r2.append(r6)     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L47
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L47
            com.amap.api.col.p0003l.a1.h(r6)     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L47
            com.amap.api.col.p0003l.a1.k(r4, r5)     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L47
            r4 = 1
            return r4
        L47:
            return r1
    }

    public final void a(com.amap.api.col.p0003l.ax r1) {
            r0 = this;
            r0.c(r1)
            return
    }
}
