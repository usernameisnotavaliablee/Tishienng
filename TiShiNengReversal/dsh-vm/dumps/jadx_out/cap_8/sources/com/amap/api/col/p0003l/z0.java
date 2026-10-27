package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class z0 {
    private com.amap.api.col.3l.z0.c a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements com.amap.api.col.3l.z0.d {
        final /* synthetic */ com.amap.api.col.p0003l.v0 a;

        a(com.amap.api.col.p0003l.v0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.amap.api.col.3l.z0.d
        public final void a() {
                r1 = this;
                com.amap.api.col.3l.v0 r0 = r1.a
                if (r0 == 0) goto L7
                r0.c()
            L7:
                return
        }

        @Override // com.amap.api.col.3l.z0.d
        public final void a(long r2) {
                r1 = this;
                com.amap.api.col.3l.v0 r0 = r1.a     // Catch: java.lang.Exception -> L7
                if (r0 == 0) goto L7
                r0.a(r2)     // Catch: java.lang.Exception -> L7
            L7:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b {
        public boolean a;

        public b() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.a = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c {
        private java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f4282b;

        /* renamed from: c, reason: collision with root package name */
        private com.amap.api.col.p0003l.v0 f4283c;

        /* renamed from: d, reason: collision with root package name */
        private com.amap.api.col.3l.z0.b f4284d;

        /* renamed from: e, reason: collision with root package name */
        private java.lang.String f4285e;

        public c(com.amap.api.col.p0003l.w0 r2, com.amap.api.col.p0003l.v0 r3) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f4283c = r0
                com.amap.api.col.3l.z0$b r0 = new com.amap.api.col.3l.z0$b
                r0.<init>()
                r1.f4284d = r0
                java.lang.String r0 = r2.x()
                r1.a = r0
                java.lang.String r2 = r2.e()
                r1.f4282b = r2
                r1.f4283c = r3
                return
        }

        public final java.lang.String a() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        public final void b(java.lang.String r3) {
                r2 = this;
                int r0 = r3.length()
                r1 = 1
                if (r0 <= r1) goto L9
                r2.f4285e = r3
            L9:
                return
        }

        public final java.lang.String c() {
                r1 = this;
                java.lang.String r0 = r1.f4282b
                return r0
        }

        public final java.lang.String d() {
                r1 = this;
                java.lang.String r0 = r1.f4285e
                return r0
        }

        public final com.amap.api.col.p0003l.v0 e() {
                r1 = this;
                com.amap.api.col.3l.v0 r0 = r1.f4283c
                return r0
        }

        public final com.amap.api.col.3l.z0.b f() {
                r1 = this;
                com.amap.api.col.3l.z0$b r0 = r1.f4284d
                return r0
        }

        public final void g() {
                r2 = this;
                com.amap.api.col.3l.z0$b r0 = r2.f4284d
                r1 = 1
                r0.a = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface d {
        void a();

        void a(long r1);
    }

    public z0(com.amap.api.col.p0003l.w0 r2, com.amap.api.col.p0003l.v0 r3) {
            r1 = this;
            r1.<init>()
            com.amap.api.col.3l.z0$c r0 = new com.amap.api.col.3l.z0$c
            r0.<init>(r2, r3)
            r1.a = r0
            return
    }

    private static int a(java.io.File r8, java.util.zip.ZipInputStream r9, long r10, long r12, com.amap.api.col.3l.z0.d r14, com.amap.api.col.3l.z0.b r15) throws java.lang.Exception {
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r8)
            r0.<init>(r1)
            r8 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r8]
            r2 = 0
            r3 = 0
        L10:
            int r4 = r9.read(r1, r2, r8)
            r5 = -1
            if (r4 == r5) goto L3e
            if (r15 == 0) goto L21
            boolean r5 = r15.a
            if (r5 == 0) goto L21
            r0.close()
            return r3
        L21:
            r0.write(r1, r2, r4)
            int r3 = r3 + r4
            r4 = 0
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 <= 0) goto L10
            if (r14 == 0) goto L10
            long r4 = (long) r3
            long r4 = r4 + r10
            r6 = 100
            long r4 = r4 * r6
            long r4 = r4 / r12
            if (r15 == 0) goto L3a
            boolean r6 = r15.a
            if (r6 != 0) goto L10
        L3a:
            r14.a(r4)
            goto L10
        L3e:
            r0.close()
            return r3
    }

    private static void c(com.amap.api.col.3l.z0.c r5) {
            if (r5 != 0) goto L4
            goto La7
        L4:
            com.amap.api.col.3l.v0 r0 = r5.e()
            if (r0 == 0) goto Ld
            r0.p()
        Ld:
            java.lang.String r1 = r5.a()
            java.lang.String r2 = r5.c()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L94
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L23
            goto L94
        L23:
            java.io.File r3 = new java.io.File
            r3.<init>(r1)
            boolean r1 = r3.exists()
            if (r1 != 0) goto L42
            com.amap.api.col.3l.z0$b r5 = r5.f()
            boolean r5 = r5.a
            if (r5 == 0) goto L3c
            if (r0 == 0) goto La7
            r0.r()
            return
        L3c:
            if (r0 == 0) goto La7
            r0.c()
            return
        L42:
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L50
            r1.mkdirs()
        L50:
            com.amap.api.col.3l.z0$a r2 = new com.amap.api.col.3l.z0$a
            r2.<init>(r0)
            com.amap.api.col.3l.z0$b r4 = r5.f()     // Catch: java.lang.Throwable -> L63
            boolean r4 = r4.a     // Catch: java.lang.Throwable -> L63
            if (r4 == 0) goto L65
            if (r0 == 0) goto L65
            r0.r()     // Catch: java.lang.Throwable -> L63
            goto L65
        L63:
            goto L80
        L65:
            e(r3, r1, r2, r5)     // Catch: java.lang.Throwable -> L63
            com.amap.api.col.3l.z0$b r1 = r5.f()     // Catch: java.lang.Throwable -> L63
            boolean r1 = r1.a     // Catch: java.lang.Throwable -> L63
            if (r1 == 0) goto L76
            if (r0 == 0) goto La7
            r0.r()     // Catch: java.lang.Throwable -> L63
            return
        L76:
            if (r0 == 0) goto La7
            java.lang.String r1 = r5.d()     // Catch: java.lang.Throwable -> L63
            r0.b(r1)     // Catch: java.lang.Throwable -> L63
            return
        L80:
            com.amap.api.col.3l.z0$b r5 = r5.f()
            boolean r5 = r5.a
            if (r5 == 0) goto L8e
            if (r0 == 0) goto La7
            r0.r()
            return
        L8e:
            if (r0 == 0) goto La7
            r0.c()
            goto La7
        L94:
            com.amap.api.col.3l.z0$b r5 = r5.f()
            boolean r5 = r5.a
            if (r5 == 0) goto La2
            if (r0 == 0) goto La7
            r0.r()
            return
        La2:
            if (r0 == 0) goto La7
            r0.c()
        La7:
            return
    }

    private static void d(java.io.File r1) {
            java.io.File r1 = r1.getParentFile()
            boolean r0 = r1.exists()
            if (r0 != 0) goto L10
            d(r1)
            r1.mkdir()
        L10:
            return
    }

    private static void e(java.io.File r9, java.io.File r10, com.amap.api.col.3l.z0.d r11, com.amap.api.col.3l.z0.c r12) throws java.lang.Exception {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            com.amap.api.col.3l.z0$b r6 = r12.f()
            r1 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L71
            r3.<init>(r9)     // Catch: java.lang.Exception -> L71
            java.util.zip.CheckedInputStream r4 = new java.util.zip.CheckedInputStream     // Catch: java.lang.Exception -> L71
            java.util.zip.CRC32 r5 = new java.util.zip.CRC32     // Catch: java.lang.Exception -> L71
            r5.<init>()     // Catch: java.lang.Exception -> L71
            r4.<init>(r3, r5)     // Catch: java.lang.Exception -> L71
            java.util.zip.ZipInputStream r5 = new java.util.zip.ZipInputStream     // Catch: java.lang.Exception -> L71
            r5.<init>(r4)     // Catch: java.lang.Exception -> L71
        L1f:
            java.util.zip.ZipEntry r7 = r5.getNextEntry()     // Catch: java.lang.Exception -> L71
            if (r7 == 0) goto L61
            if (r6 == 0) goto L38
            boolean r8 = r6.a     // Catch: java.lang.Exception -> L71
            if (r8 == 0) goto L38
            r5.closeEntry()     // Catch: java.lang.Exception -> L71
            r5.close()     // Catch: java.lang.Exception -> L71
            r4.close()     // Catch: java.lang.Exception -> L71
            r3.close()     // Catch: java.lang.Exception -> L71
            goto L61
        L38:
            boolean r8 = r7.isDirectory()     // Catch: java.lang.Exception -> L71
            if (r8 != 0) goto L58
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Exception -> L71
            boolean r8 = g(r8)     // Catch: java.lang.Exception -> L71
            if (r8 != 0) goto L4c
            r11.a()     // Catch: java.lang.Exception -> L71
            goto L61
        L4c:
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Exception -> L71
            r0.append(r8)     // Catch: java.lang.Exception -> L71
            java.lang.String r8 = ";"
            r0.append(r8)     // Catch: java.lang.Exception -> L71
        L58:
            long r7 = r7.getSize()     // Catch: java.lang.Exception -> L71
            long r1 = r1 + r7
            r5.closeEntry()     // Catch: java.lang.Exception -> L71
            goto L1f
        L61:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L71
            r12.b(r0)     // Catch: java.lang.Exception -> L71
            r5.close()     // Catch: java.lang.Exception -> L71
            r4.close()     // Catch: java.lang.Exception -> L71
            r3.close()     // Catch: java.lang.Exception -> L71
        L71:
            r3 = r1
            java.io.FileInputStream r12 = new java.io.FileInputStream
            r12.<init>(r9)
            java.util.zip.CheckedInputStream r9 = new java.util.zip.CheckedInputStream
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r9.<init>(r12, r0)
            java.util.zip.ZipInputStream r2 = new java.util.zip.ZipInputStream
            r2.<init>(r9)
            r1 = r10
            r5 = r11
            f(r1, r2, r3, r5, r6)
            r2.close()
            r9.close()
            r12.close()
            return
    }

    private static void f(java.io.File r9, java.util.zip.ZipInputStream r10, long r11, com.amap.api.col.3l.z0.d r13, com.amap.api.col.3l.z0.b r14) throws java.lang.Exception {
            r0 = 0
            r8 = 0
        L2:
            java.util.zip.ZipEntry r0 = r10.getNextEntry()
            if (r0 == 0) goto L5f
            if (r14 == 0) goto L12
            boolean r1 = r14.a
            if (r1 == 0) goto L12
            r10.closeEntry()
            return
        L12:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r9.getPath()
            r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            java.lang.String r2 = r0.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r0.getName()
            boolean r2 = g(r2)
            if (r2 != 0) goto L3e
            if (r13 == 0) goto L5f
            r13.a()
            return
        L3e:
            r2 = r0
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            d(r0)
            boolean r1 = r2.isDirectory()
            if (r1 == 0) goto L51
            r0.mkdirs()
            goto L5b
        L51:
            long r2 = (long) r8
            r1 = r10
            r4 = r11
            r6 = r13
            r7 = r14
            int r0 = a(r0, r1, r2, r4, r6, r7)
            int r8 = r8 + r0
        L5b:
            r10.closeEntry()
            goto L2
        L5f:
            return
    }

    private static boolean g(java.lang.String r1) {
            java.lang.String r0 = ".."
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L22
            java.lang.String r0 = "/"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L22
            java.lang.String r0 = "\\"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L22
            java.lang.String r0 = "%"
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L22
            r1 = 1
            return r1
        L22:
            r1 = 0
            return r1
    }

    public final void b() {
            r1 = this;
            com.amap.api.col.3l.z0$c r0 = r1.a
            if (r0 == 0) goto L7
            r0.g()
        L7:
            return
    }

    public final void h() {
            r1 = this;
            com.amap.api.col.3l.z0$c r0 = r1.a
            if (r0 == 0) goto L7
            c(r0)
        L7:
            return
    }
}
