package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a1 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        java.lang.String A;
        java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        java.lang.String f4301b;

        /* renamed from: c, reason: collision with root package name */
        java.lang.String f4302c;

        /* renamed from: d, reason: collision with root package name */
        java.lang.String f4303d;

        /* renamed from: e, reason: collision with root package name */
        java.lang.String f4304e;

        /* renamed from: f, reason: collision with root package name */
        java.lang.String f4305f;

        /* renamed from: g, reason: collision with root package name */
        java.lang.String f4306g;

        /* renamed from: h, reason: collision with root package name */
        java.lang.String f4307h;

        /* renamed from: i, reason: collision with root package name */
        java.lang.String f4308i;

        /* renamed from: j, reason: collision with root package name */
        java.lang.String f4309j;

        /* renamed from: k, reason: collision with root package name */
        java.lang.String f4310k;
        java.lang.String l;
        java.lang.String m;
        java.lang.String n;
        java.lang.String o;
        java.lang.String p;
        java.lang.String q;
        java.lang.String r;
        java.lang.String s;
        java.lang.String t;
        java.lang.String u;
        java.lang.String v;
        java.lang.String w;
        java.lang.String x;
        java.lang.String y;
        java.lang.String z;

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ a(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public a1() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a() {
            r0 = 0
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "1"
            boolean r2 = com.amap.api.col.s.x0.c()     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L16
            java.lang.String r1 = "0"
            goto L16
        L14:
            r1 = move-exception
            goto L3a
        L16:
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L14
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r3.<init>()     // Catch: java.lang.Throwable -> L14
            int r4 = r2 + (-2)
            r5 = 0
            java.lang.String r4 = r0.substring(r5, r4)     // Catch: java.lang.Throwable -> L14
            r3.append(r4)     // Catch: java.lang.Throwable -> L14
            r3.append(r1)     // Catch: java.lang.Throwable -> L14
            int r2 = r2 + (-1)
            java.lang.String r1 = r0.substring(r2)     // Catch: java.lang.Throwable -> L14
            r3.append(r1)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L14
            return r0
        L3a:
            java.lang.String r2 = "CI"
            java.lang.String r3 = "TS"
            com.amap.api.col.s.d2.e(r1, r2, r3)
            return r0
    }

    public static java.lang.String b(android.content.Context r0) {
            java.lang.String r0 = i(r0)
            return r0
    }

    public static java.lang.String c(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = ":"
            java.lang.String r3 = com.amap.api.col.s.x0.h(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r1.<init>()     // Catch: java.lang.Throwable -> L2e
            r1.append(r3)     // Catch: java.lang.Throwable -> L2e
            r1.append(r0)     // Catch: java.lang.Throwable -> L2e
            int r3 = r4.length()     // Catch: java.lang.Throwable -> L2e
            int r3 = r3 + (-3)
            r2 = 0
            java.lang.String r3 = r4.substring(r2, r3)     // Catch: java.lang.Throwable -> L2e
            r1.append(r3)     // Catch: java.lang.Throwable -> L2e
            r1.append(r0)     // Catch: java.lang.Throwable -> L2e
            r1.append(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = com.amap.api.col.s.g1.a(r3)     // Catch: java.lang.Throwable -> L2e
            return r3
        L2e:
            r3 = move-exception
            java.lang.String r4 = "CI"
            java.lang.String r5 = "Sco"
            com.amap.api.col.s.d2.e(r3, r4, r5)
            r3 = 0
            return r3
    }

    private static java.lang.String d(com.amap.api.col.s.a1.a r0) {
            byte[] r0 = j(r0)
            java.lang.String r0 = com.amap.api.col.s.d1.f(r0)
            return r0
    }

    private static void e(java.io.ByteArrayOutputStream r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L1f
            byte[] r0 = r3.getBytes()
            int r0 = r0.length
            r1 = 255(0xff, float:3.57E-43)
            if (r0 <= r1) goto L11
            r0 = -1
            goto L17
        L11:
            byte[] r0 = r3.getBytes()
            int r0 = r0.length
            byte r0 = (byte) r0
        L17:
            byte[] r3 = com.amap.api.col.s.j1.o(r3)
            com.amap.api.col.s.j1.j(r2, r0, r3)
            return
        L1f:
            r3 = 0
            byte[] r0 = new byte[r3]
            com.amap.api.col.s.j1.j(r2, r3, r0)
            return
    }

    public static byte[] f(android.content.Context r1, boolean r2) {
            com.amap.api.col.s.a1$a r1 = h(r1, r2)     // Catch: java.lang.Throwable -> L9
            byte[] r1 = j(r1)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r1 = move-exception
            java.lang.String r2 = "CI"
            java.lang.String r0 = "gz"
            com.amap.api.col.s.d2.e(r1, r2, r0)
            r1 = 0
            return r1
    }

    public static byte[] g(byte[] r0) throws java.security.cert.CertificateException, java.security.spec.InvalidKeySpecException, java.security.NoSuchAlgorithmException, java.lang.NullPointerException, java.io.IOException, java.security.InvalidKeyException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
            byte[] r0 = com.amap.api.col.s.d1.b(r0)
            return r0
    }

    private static com.amap.api.col.s.a1.a h(android.content.Context r5, boolean r6) {
            com.amap.api.col.s.a1$a r0 = new com.amap.api.col.s.a1$a
            r1 = 0
            r0.<init>(r1)
            java.lang.String r2 = com.amap.api.col.s.c1.H()
            r0.a = r2
            java.lang.String r2 = com.amap.api.col.s.c1.C()
            r0.f4301b = r2
            java.lang.String r2 = com.amap.api.col.s.c1.y(r5)
            java.lang.String r3 = ""
            if (r2 != 0) goto L1b
            r2 = r3
        L1b:
            r0.f4302c = r2
            java.lang.String r2 = com.amap.api.col.s.x0.f(r5)
            r0.f4303d = r2
            java.lang.String r2 = android.os.Build.MODEL
            r0.f4304e = r2
            java.lang.String r2 = android.os.Build.MANUFACTURER
            r0.f4305f = r2
            java.lang.String r2 = android.os.Build.DEVICE
            r0.f4306g = r2
            java.lang.String r2 = com.amap.api.col.s.x0.d(r5)
            r0.f4307h = r2
            java.lang.String r2 = com.amap.api.col.s.x0.g(r5)
            r0.f4308i = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.f4309j = r2
            java.lang.String r2 = com.amap.api.col.s.c1.M()
            r0.f4310k = r2
            java.lang.String r2 = com.amap.api.col.s.c1.G(r5)
            r0.l = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r4 = com.amap.api.col.s.c1.D(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.m = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r4 = com.amap.api.col.s.c1.B(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.n = r2
            java.lang.String r2 = com.amap.api.col.s.c1.O(r5)
            r0.o = r2
            java.lang.String r2 = com.amap.api.col.s.c1.A(r5)
            r0.p = r2
            r0.q = r3
            r0.r = r3
            java.lang.String[] r2 = com.amap.api.col.s.c1.E()
            r1 = r2[r1]
            r0.s = r1
            r1 = 1
            r1 = r2[r1]
            r0.t = r1
            java.lang.String r1 = com.amap.api.col.s.c1.i()
            r0.w = r1
            java.lang.String r1 = com.amap.api.col.s.c1.j(r5)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto La3
            r0.x = r1
            goto La5
        La3:
            r0.x = r3
        La5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "aid="
            r1.<init>(r2)
            java.lang.String r2 = com.amap.api.col.s.c1.z()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.y = r1
            if (r6 == 0) goto Lbf
            boolean r6 = com.amap.api.col.s.s1.f4676e
            if (r6 != 0) goto Lc3
        Lbf:
            boolean r6 = com.amap.api.col.s.s1.f4677f
            if (r6 == 0) goto Le5
        Lc3:
            java.lang.String r6 = com.amap.api.col.s.c1.w(r5)
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto Le5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.y
            r1.append(r2)
            java.lang.String r2 = "|oaid="
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.y = r6
        Le5:
            java.lang.String r6 = com.amap.api.col.s.c1.F()
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L107
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.y
            r1.append(r2)
            java.lang.String r2 = "|multiImeis="
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.y = r6
        L107:
            java.lang.String r6 = com.amap.api.col.s.c1.J()
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L129
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.y
            r1.append(r2)
            java.lang.String r2 = "|meid="
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.y = r6
        L129:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = r0.y
            r6.append(r1)
            java.lang.String r1 = "|serial="
            r6.append(r1)
            java.lang.String r1 = com.amap.api.col.s.c1.x()
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r0.y = r6
            java.lang.String r6 = com.amap.api.col.s.c1.o()
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L167
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.y
            r1.append(r2)
            java.lang.String r2 = "|adiuExtras="
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.y = r6
        L167:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = r0.y
            r6.append(r1)
            java.lang.String r1 = "|storage="
            r6.append(r1)
            long r1 = com.amap.api.col.s.c1.N()
            r6.append(r1)
            java.lang.String r1 = "|ram="
            r6.append(r1)
            int r5 = com.amap.api.col.s.c1.L(r5)
            r6.append(r5)
            java.lang.String r5 = "|arch="
            r6.append(r5)
            java.lang.String r5 = com.amap.api.col.s.c1.P()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r0.y = r5
            com.amap.api.col.s.da r5 = com.amap.api.col.s.c2.a()
            java.lang.String r5 = r5.b()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L1ac
            r0.z = r5
            return r0
        L1ac:
            r0.z = r3
            return r0
    }

    private static java.lang.String i(android.content.Context r2) {
            r0 = 0
            com.amap.api.col.s.a1$a r2 = h(r2, r0)     // Catch: java.lang.Throwable -> La
            java.lang.String r2 = d(r2)     // Catch: java.lang.Throwable -> La
            return r2
        La:
            r2 = move-exception
            java.lang.String r0 = "CI"
            java.lang.String r1 = "gCXi"
            com.amap.api.col.s.d2.e(r2, r0, r1)
            r2 = 0
            return r2
    }

    private static byte[] j(com.amap.api.col.s.a1.a r4) {
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> La4
            r1.<init>()     // Catch: java.lang.Throwable -> La4
            java.lang.String r2 = r4.a     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r4.f4301b     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r4.f4302c     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r4.f4303d     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r4.f4304e     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r4.f4305f     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r4.f4306g     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r4.f4307h     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r4.f4308i     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r4.f4309j     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r4.f4310k     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r4.l     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r4.m     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r4.n     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r4.o     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r4.p     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r4.q     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r4.r     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r4.s     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r4.t     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r4.u     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r4.v     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r4.w     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r4.x     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r4.y     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = r4.z     // Catch: java.lang.Throwable -> La2
            e(r1, r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r4 = r4.A     // Catch: java.lang.Throwable -> La2
            e(r1, r4)     // Catch: java.lang.Throwable -> La2
            byte[] r4 = r1.toByteArray()     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> La2
            r2.<init>(r4)     // Catch: java.lang.Throwable -> La2
            byte[] r4 = com.amap.api.col.s.j1.s(r4)     // Catch: java.lang.Throwable -> La2
            byte[] r4 = k(r4)     // Catch: java.lang.Throwable -> La2
            r1.close()     // Catch: java.lang.Throwable -> La1
        La1:
            return r4
        La2:
            r4 = move-exception
            goto La6
        La4:
            r4 = move-exception
            r1 = r0
        La6:
            java.lang.String r2 = "CI"
            java.lang.String r3 = "gzx"
            com.amap.api.col.s.d2.e(r4, r2, r3)     // Catch: java.lang.Throwable -> Lb3
            if (r1 == 0) goto Lb2
            r1.close()     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            return r0
        Lb3:
            r4 = move-exception
            if (r1 == 0) goto Lb9
            r1.close()     // Catch: java.lang.Throwable -> Lb9
        Lb9:
            throw r4
    }

    private static byte[] k(byte[] r5) throws java.security.cert.CertificateException, java.security.spec.InvalidKeySpecException, java.security.NoSuchAlgorithmException, java.lang.NullPointerException, java.io.IOException, java.security.InvalidKeyException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
            java.security.PublicKey r0 = com.amap.api.col.s.j1.w()
            int r1 = r5.length
            r2 = 117(0x75, float:1.64E-43)
            if (r1 <= r2) goto L23
            byte[] r1 = new byte[r2]
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r1, r3, r2)
            byte[] r0 = com.amap.api.col.s.d1.c(r1, r0)
            int r1 = r5.length
            int r1 = r1 + 11
            byte[] r1 = new byte[r1]
            r4 = 128(0x80, float:1.8E-43)
            java.lang.System.arraycopy(r0, r3, r1, r3, r4)
            int r0 = r5.length
            int r0 = r0 - r2
            java.lang.System.arraycopy(r5, r2, r1, r4, r0)
            return r1
        L23:
            byte[] r5 = com.amap.api.col.s.d1.c(r5, r0)
            return r5
    }
}
