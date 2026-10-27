package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class f4 {
    private static java.lang.String a = "";

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.String f3275b = "";

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.String f3276c = "";

    /* renamed from: d, reason: collision with root package name */
    private static java.lang.String f3277d = "";

    /* renamed from: e, reason: collision with root package name */
    static java.lang.String f3278e;

    /* renamed from: f, reason: collision with root package name */
    static boolean f3279f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class a extends com.amap.api.col.p0003l.c8 {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ android.content.Context f3280d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ java.lang.String f3281e;

        a(android.content.Context r1, java.lang.String r2) {
                r0 = this;
                r0.f3280d = r1
                r0.f3281e = r2
                r0.<init>()
                return
        }

        @Override // com.amap.api.col.p0003l.c8
        public final void runTask() {
                r5 = this;
                r0 = 0
                android.content.Context r1 = r5.f3280d     // Catch: java.lang.Throwable -> L20
                java.lang.String r2 = "k.store"
                java.lang.String r1 = com.amap.api.col.p0003l.s5.i(r1, r2)     // Catch: java.lang.Throwable -> L20
                java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L20
                r2.<init>(r1)     // Catch: java.lang.Throwable -> L20
                java.io.File r1 = r2.getParentFile()     // Catch: java.lang.Throwable -> L20
                boolean r1 = r1.exists()     // Catch: java.lang.Throwable -> L20
                if (r1 != 0) goto L22
                java.io.File r1 = r2.getParentFile()     // Catch: java.lang.Throwable -> L20
                r1.mkdirs()     // Catch: java.lang.Throwable -> L20
                goto L22
            L20:
                r1 = move-exception
                goto L38
            L22:
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L20
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L20
                java.lang.String r0 = r5.f3281e     // Catch: java.lang.Throwable -> L34
                byte[] r0 = com.amap.api.col.p0003l.q4.o(r0)     // Catch: java.lang.Throwable -> L34
                r1.write(r0)     // Catch: java.lang.Throwable -> L34
                r1.close()     // Catch: java.lang.Throwable -> L33
            L33:
                return
            L34:
                r0 = move-exception
                r4 = r1
                r1 = r0
                r0 = r4
            L38:
                java.lang.String r2 = "AI"
                java.lang.String r3 = "stf"
                com.amap.api.col.p0003l.r5.e(r1, r2, r3)     // Catch: java.lang.Throwable -> L46
                if (r0 == 0) goto L45
                r0.close()     // Catch: java.lang.Throwable -> L45
            L45:
                return
            L46:
                r1 = move-exception
                if (r0 == 0) goto L4c
                r0.close()     // Catch: java.lang.Throwable -> L4c
            L4c:
                throw r1
        }
    }

    static {
            return
    }

    public f4() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r0) {
            java.lang.String r0 = l(r0)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            java.lang.String r0 = com.amap.api.col.p0003l.f4.f3277d
            return r0
    }

    static void b(android.content.Context r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L7
            goto L17
        L7:
            com.amap.api.col.p0003l.f4.f3277d = r3
            if (r2 == 0) goto L17
            com.amap.api.col.3l.b8 r0 = com.amap.api.col.p0003l.b8.h()
            com.amap.api.col.3l.f4$a r1 = new com.amap.api.col.3l.f4$a
            r1.<init>(r2, r3)
            r0.b(r1)
        L17:
            return
    }

    public static void c(java.lang.String r0) {
            com.amap.api.col.p0003l.f4.f3275b = r0
            return
    }

    static boolean d() {
            r0 = 1
            boolean r1 = com.amap.api.col.p0003l.f4.f3279f     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L6
            return r0
        L6:
            java.lang.String r1 = com.amap.api.col.p0003l.f4.f3278e     // Catch: java.lang.Throwable -> L38
            boolean r1 = f(r1)     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L11
            com.amap.api.col.p0003l.f4.f3279f = r0     // Catch: java.lang.Throwable -> L38
            return r0
        L11:
            java.lang.String r1 = com.amap.api.col.p0003l.f4.f3278e     // Catch: java.lang.Throwable -> L38
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L38
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L20
            com.amap.api.col.p0003l.f4.f3279f = r3     // Catch: java.lang.Throwable -> L38
            com.amap.api.col.p0003l.f4.f3278e = r2     // Catch: java.lang.Throwable -> L38
            return r3
        L20:
            java.lang.String r1 = com.amap.api.col.p0003l.f4.f3275b     // Catch: java.lang.Throwable -> L38
            boolean r1 = f(r1)     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L2b
            com.amap.api.col.p0003l.f4.f3279f = r0     // Catch: java.lang.Throwable -> L38
            return r0
        L2b:
            java.lang.String r1 = com.amap.api.col.p0003l.f4.f3275b     // Catch: java.lang.Throwable -> L38
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L38
            if (r1 != 0) goto L38
            com.amap.api.col.p0003l.f4.f3279f = r3     // Catch: java.lang.Throwable -> L38
            com.amap.api.col.p0003l.f4.f3275b = r2     // Catch: java.lang.Throwable -> L38
            return r3
        L38:
            return r0
    }

    public static java.lang.String e(android.content.Context r2) {
            java.lang.String r0 = ""
            java.lang.String r1 = com.amap.api.col.p0003l.f4.a     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto Ld
            java.lang.String r2 = com.amap.api.col.p0003l.f4.a     // Catch: java.lang.Throwable -> L23
            return r2
        Ld:
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L23
            r1 = 0
            android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo(r2, r1)     // Catch: java.lang.Throwable -> L23
            java.lang.CharSequence r2 = r0.getApplicationLabel(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L23
            com.amap.api.col.p0003l.f4.a = r2     // Catch: java.lang.Throwable -> L23
            goto L2b
        L23:
            r2 = move-exception
            java.lang.String r0 = "AI"
            java.lang.String r1 = "gAN"
            com.amap.api.col.p0003l.r5.e(r2, r0, r1)
        L2b:
            java.lang.String r2 = com.amap.api.col.p0003l.f4.a
            return r2
    }

    private static boolean f(java.lang.String r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 != 0) goto L37
            r6.toCharArray()
            char[] r0 = r6.toCharArray()
            int r2 = r0.length
            r3 = 0
        L10:
            if (r3 >= r2) goto L35
            char r4 = r0[r3]
            r5 = 65
            if (r5 > r4) goto L1c
            r5 = 122(0x7a, float:1.71E-43)
            if (r4 <= r5) goto L32
        L1c:
            r5 = 48
            if (r5 > r4) goto L24
            r5 = 58
            if (r4 <= r5) goto L32
        L24:
            r5 = 46
            if (r4 == r5) goto L32
            com.amap.api.col.3l.p4 r0 = com.amap.api.col.p0003l.q4.a()     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "errorPackage"
            com.amap.api.col.p0003l.w5.o(r0, r6, r2)     // Catch: java.lang.Throwable -> L31
        L31:
            return r1
        L32:
            int r3 = r3 + 1
            goto L10
        L35:
            r6 = 1
            return r6
        L37:
            return r1
    }

    public static java.lang.String g(android.content.Context r2) {
            java.lang.String r0 = com.amap.api.col.p0003l.f4.f3275b     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto Lf
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto Lf
            java.lang.String r2 = com.amap.api.col.p0003l.f4.f3275b     // Catch: java.lang.Throwable -> L22
            return r2
        Lf:
            java.lang.String r0 = r2.getPackageName()     // Catch: java.lang.Throwable -> L22
            com.amap.api.col.p0003l.f4.f3275b = r0     // Catch: java.lang.Throwable -> L22
            boolean r0 = f(r0)     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L2a
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L22
            com.amap.api.col.p0003l.f4.f3275b = r2     // Catch: java.lang.Throwable -> L22
            goto L2a
        L22:
            r2 = move-exception
            java.lang.String r0 = "AI"
            java.lang.String r1 = "gpck"
            com.amap.api.col.p0003l.r5.e(r2, r0, r1)
        L2a:
            java.lang.String r2 = com.amap.api.col.p0003l.f4.f3275b
            return r2
    }

    public static java.lang.String h(android.content.Context r3) {
            java.lang.String r0 = ""
            java.lang.String r1 = com.amap.api.col.p0003l.f4.f3276c     // Catch: java.lang.Throwable -> Ld
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto Lf
            java.lang.String r3 = com.amap.api.col.p0003l.f4.f3276c     // Catch: java.lang.Throwable -> Ld
            return r3
        Ld:
            r3 = move-exception
            goto L21
        Lf:
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> Ld
            r2 = 0
            android.content.pm.PackageInfo r3 = r1.getPackageInfo(r3, r2)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = r3.versionName     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.p0003l.f4.f3276c = r3     // Catch: java.lang.Throwable -> Ld
            goto L28
        L21:
            java.lang.String r1 = "AI"
            java.lang.String r2 = "gAV"
            com.amap.api.col.p0003l.r5.e(r3, r1, r2)
        L28:
            java.lang.String r3 = com.amap.api.col.p0003l.f4.f3276c
            if (r3 != 0) goto L2d
            return r0
        L2d:
            return r3
    }

    public static java.lang.String i(android.content.Context r7) {
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = r7.getPackageName()     // Catch: java.lang.Throwable -> L73
            r2 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: java.lang.Throwable -> L73
            android.content.pm.Signature[] r1 = r0.signatures     // Catch: java.lang.Throwable -> L73
            r2 = 0
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L73
            byte[] r1 = r1.toByteArray()     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = "IU0hBMQ"
            java.lang.String r3 = com.amap.api.col.p0003l.q4.u(r3)     // Catch: java.lang.Throwable -> L73
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch: java.lang.Throwable -> L73
            byte[] r1 = r3.digest(r1)     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L73
            r3.<init>()     // Catch: java.lang.Throwable -> L73
        L2a:
            int r4 = r1.length     // Catch: java.lang.Throwable -> L73
            if (r2 >= r4) goto L52
            r4 = r1[r2]     // Catch: java.lang.Throwable -> L73
            r4 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)     // Catch: java.lang.Throwable -> L73
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = r4.toUpperCase(r5)     // Catch: java.lang.Throwable -> L73
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L73
            r6 = 1
            if (r5 != r6) goto L47
            java.lang.String r5 = "0"
            r3.append(r5)     // Catch: java.lang.Throwable -> L73
        L47:
            r3.append(r4)     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = ":"
            r3.append(r4)     // Catch: java.lang.Throwable -> L73
            int r2 = r2 + 1
            goto L2a
        L52:
            java.lang.String r1 = r0.packageName     // Catch: java.lang.Throwable -> L73
            boolean r2 = f(r1)     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto L5c
            java.lang.String r1 = r0.packageName     // Catch: java.lang.Throwable -> L73
        L5c:
            java.lang.String r0 = com.amap.api.col.p0003l.f4.f3275b     // Catch: java.lang.Throwable -> L73
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L65
            goto L69
        L65:
            java.lang.String r1 = g(r7)     // Catch: java.lang.Throwable -> L73
        L69:
            r3.append(r1)     // Catch: java.lang.Throwable -> L73
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L73
            com.amap.api.col.p0003l.f4.f3278e = r7     // Catch: java.lang.Throwable -> L73
            return r7
        L73:
            r7 = move-exception
            java.lang.String r0 = "AI"
            java.lang.String r1 = "gsp"
            com.amap.api.col.p0003l.r5.e(r7, r0, r1)
            java.lang.String r7 = com.amap.api.col.p0003l.f4.f3278e
            return r7
    }

    public static java.lang.String j(android.content.Context r2) {
            com.amap.api.col.p0003l.g4.g(r2)     // Catch: java.lang.Throwable -> L3
        L3:
            java.lang.String r2 = l(r2)     // Catch: java.lang.Throwable -> L8
            return r2
        L8:
            r2 = move-exception
            java.lang.String r0 = "AI"
            java.lang.String r1 = "gKy"
            com.amap.api.col.p0003l.r5.e(r2, r0, r1)
            java.lang.String r2 = com.amap.api.col.p0003l.f4.f3277d
            return r2
    }

    private static java.lang.String k(android.content.Context r6) {
            java.lang.String r0 = "k.store"
            java.lang.String r6 = com.amap.api.col.p0003l.s5.i(r6, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
            boolean r6 = r0.exists()
            java.lang.String r1 = ""
            if (r6 != 0) goto L14
            return r1
        L14:
            r6 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L36
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L36
            int r6 = r2.available()     // Catch: java.lang.Throwable -> L34
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L34
            r2.read(r6)     // Catch: java.lang.Throwable -> L34
            java.lang.String r6 = com.amap.api.col.p0003l.q4.g(r6)     // Catch: java.lang.Throwable -> L34
            int r0 = r6.length()     // Catch: java.lang.Throwable -> L34
            r3 = 32
            if (r0 != r3) goto L30
            r1 = r6
        L30:
            r2.close()     // Catch: java.lang.Throwable -> L33
        L33:
            return r1
        L34:
            r6 = move-exception
            goto L3a
        L36:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L3a:
            java.lang.String r3 = "AI"
            java.lang.String r4 = "gKe"
            com.amap.api.col.p0003l.r5.e(r6, r3, r4)     // Catch: java.lang.Throwable -> L52
            boolean r6 = r0.exists()     // Catch: java.lang.Throwable -> L4b
            if (r6 == 0) goto L4c
            r0.delete()     // Catch: java.lang.Throwable -> L4b
            goto L4c
        L4b:
        L4c:
            if (r2 == 0) goto L51
            r2.close()     // Catch: java.lang.Throwable -> L51
        L51:
            return r1
        L52:
            r6 = move-exception
            if (r2 == 0) goto L58
            r2.close()     // Catch: java.lang.Throwable -> L58
        L58:
            throw r6
    }

    private static java.lang.String l(android.content.Context r3) throws android.content.pm.PackageManager.NameNotFoundException {
            java.lang.String r0 = com.amap.api.col.p0003l.f4.f3277d
            if (r0 == 0) goto Lc
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L31
        Lc:
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            java.lang.String r1 = r3.getPackageName()
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r2)
            if (r0 == 0) goto L34
            android.os.Bundle r0 = r0.metaData
            if (r0 != 0) goto L21
            goto L34
        L21:
            java.lang.String r1 = "com.amap.api.v2.apikey"
            java.lang.String r0 = r0.getString(r1)
            com.amap.api.col.p0003l.f4.f3277d = r0
            if (r0 != 0) goto L31
            java.lang.String r3 = k(r3)
            com.amap.api.col.p0003l.f4.f3277d = r3
        L31:
            java.lang.String r3 = com.amap.api.col.p0003l.f4.f3277d
            return r3
        L34:
            java.lang.String r3 = com.amap.api.col.p0003l.f4.f3277d
            return r3
    }
}
