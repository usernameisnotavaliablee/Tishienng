package cn.jiguang.commons.z;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class c {
    private final android.content.Context a;

    public c(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private cn.jiguang.commons.z.d.c a(byte[] r5, java.lang.String r6) {
            r4 = this;
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 == 0) goto Lc
            r5 = 0
            return r5
        Lc:
            java.lang.String r1 = cn.jiguang.commons.L.k.d(r5)
            boolean r2 = android.text.TextUtils.equals(r1, r6)
            java.lang.String r3 = "JSM"
            if (r2 == 0) goto L78
            r6 = 3087(0xc0f, float:4.326E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.l(r6)
            java.lang.String r6 = "m ok"
            cn.jiguang.commons.w.a.a(r3, r6)
            byte[] r5 = cn.jiguang.commons.L.p.a(r5)     // Catch: java.lang.Exception -> L55
            r6 = 3089(0xc11, float:4.329E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L55
            r0.l(r6)     // Catch: java.lang.Exception -> L55
            java.lang.String r6 = cn.jiguang.commons.z.g.a(r5)
            if (r6 == 0) goto L4e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "v info: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            cn.jiguang.commons.w.a.a(r3, r0)
        L4e:
            cn.jiguang.commons.z.d$c r0 = new cn.jiguang.commons.z.d$c
            r1 = 1
            r0.<init>(r1, r6, r5)
            return r0
        L55:
            r5 = move-exception
            r6 = 3088(0xc10, float:4.327E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.l(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "decompress err: "
            r6.append(r0)
            java.lang.String r0 = r5.getMessage()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            cn.jiguang.commons.w.a.c(r3, r6)
            throw r5
        L78:
            r5 = 3086(0xc0e, float:4.324E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.l(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "m f: "
            r5.append(r0)
            r5.append(r6)
            java.lang.String r6 = " vs "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            cn.jiguang.commons.w.a.c(r3, r5)
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "MD5 validation failed"
            r5.<init>(r6)
            throw r5
    }

    private void a(java.lang.String r6, byte[] r7) {
            r5 = this;
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()
            if (r7 == 0) goto La2
            int r1 = r7.length
            if (r1 == 0) goto La2
            boolean r1 = r5.a(r7)
            java.lang.String r2 = "JSM"
            if (r1 == 0) goto L8c
            java.lang.String r1 = cn.jiguang.commons.L.k.d(r7)
            android.content.Context r3 = r5.a
            java.lang.String r3 = cn.jiguang.commons.z.a.a(r3, r6)
            java.io.File r4 = new java.io.File
            r4.<init>(r3)
            boolean r3 = cn.jiguang.commons.L.m.a(r4, r7)
            if (r3 == 0) goto L7b
            int r3 = r7.length
            long r3 = (long) r3
            boolean r6 = r5.a(r6, r3, r1)
            if (r6 == 0) goto L6a
            r6 = 3093(0xc15, float:4.334E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.l(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "s ok:  "
            r6.append(r0)
            int r7 = r7.length
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            cn.jiguang.commons.w.a.a(r2, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 != 0) goto L69
            cn.jiguang.commons.z.e.d(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "c m: "
            r6.append(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            cn.jiguang.commons.w.a.a(r2, r6)
        L69:
            return
        L6a:
            r6 = 3094(0xc16, float:4.336E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.l(r6)
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "Saved file integrity verification failed"
            r6.<init>(r7)
            throw r6
        L7b:
            r6 = 3092(0xc14, float:4.333E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.l(r6)
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "Failed to save file atomically"
            r6.<init>(r7)
            throw r6
        L8c:
            r6 = 3091(0xc13, float:4.331E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.l(r6)
            java.lang.String r6 = "d invalid"
            cn.jiguang.commons.w.a.c(r2, r6)
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "Downloaded data validation failed"
            r6.<init>(r7)
            throw r6
        La2:
            r6 = 3090(0xc12, float:4.33E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.l(r6)
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "Downloaded data is null or empty"
            r6.<init>(r7)
            throw r6
    }

    private boolean a(java.lang.String r6, long r7, java.lang.String r9) {
            r5 = this;
            java.lang.String r0 = "JSM"
            r1 = 0
            android.content.Context r2 = r5.a     // Catch: java.lang.Exception -> L2d
            java.lang.String r6 = cn.jiguang.commons.z.a.a(r2, r6)     // Catch: java.lang.Exception -> L2d
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L2d
            r2.<init>(r6)     // Catch: java.lang.Exception -> L2d
            boolean r3 = r2.exists()     // Catch: java.lang.Exception -> L2d
            if (r3 == 0) goto L31
            long r2 = r2.length()     // Catch: java.lang.Exception -> L2d
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 == 0) goto L1d
            goto L31
        L1d:
            java.lang.String r6 = cn.jiguang.commons.L.m.a(r6)     // Catch: java.lang.Exception -> L2d
            boolean r6 = android.text.TextUtils.equals(r6, r9)     // Catch: java.lang.Exception -> L2d
            if (r6 != 0) goto L2f
            java.lang.String r6 = "s verify f"
            cn.jiguang.commons.w.a.c(r0, r6)     // Catch: java.lang.Exception -> L2d
            return r1
        L2d:
            r6 = move-exception
            goto L37
        L2f:
            r6 = 1
            return r6
        L31:
            java.lang.String r6 = "s mismatch"
            cn.jiguang.commons.w.a.c(r0, r6)     // Catch: java.lang.Exception -> L2d
            return r1
        L37:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "s verify err: "
            r7.append(r8)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            cn.jiguang.commons.w.a.c(r0, r6)
            return r1
    }

    private boolean a(byte[] r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L24
            int r1 = r5.length
            r2 = 4
            if (r1 >= r2) goto L8
            goto L24
        L8:
            r1 = r5[r0]
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 != r2) goto L24
            r1 = 1
            r2 = r5[r1]
            r3 = 69
            if (r2 != r3) goto L24
            r2 = 2
            r2 = r5[r2]
            r3 = 76
            if (r2 != r3) goto L24
            r2 = 3
            r5 = r5[r2]
            r2 = 70
            if (r5 != r2) goto L24
            return r1
        L24:
            return r0
    }

    public cn.jiguang.commons.z.d.c a(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            cn.jiguang.commons.A.a r0 = cn.jiguang.commons.A.a.f()
            r1 = 3070(0xbfe, float:4.302E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.l(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "s d: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "JSM"
            cn.jiguang.commons.w.a.a(r2, r1)
            java.lang.String r1 = "GET"
            cn.jiguang.commons.x.d r5 = cn.jiguang.commons.z.e.c(r5, r1)     // Catch: java.lang.Exception -> L4b
            if (r5 == 0) goto Lae
            int r1 = r5.d()     // Catch: java.lang.Exception -> L4b
            r3 = 200(0xc8, float:2.8E-43)
            if (r1 != r3) goto L8e
            byte[] r1 = r5.c()     // Catch: java.lang.Exception -> L4b
            if (r1 == 0) goto L7d
            int r3 = r1.length     // Catch: java.lang.Exception -> L4b
            if (r3 == 0) goto L7d
            java.lang.String r5 = cn.jiguang.commons.z.e.a(r5)     // Catch: java.lang.Exception -> L4b
            boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L4b
            if (r3 == 0) goto L4d
            java.lang.String r5 = cn.jiguang.commons.z.e.g()     // Catch: java.lang.Exception -> L4b
            goto L4d
        L4b:
            r5 = move-exception
            goto Lb6
        L4d:
            cn.jiguang.commons.z.d$c r1 = r4.a(r1, r5)     // Catch: java.lang.Exception -> L4b
            byte[] r3 = r1.f1239d     // Catch: java.lang.Exception -> L4b
            r4.a(r6, r3)     // Catch: java.lang.Exception -> L4b
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L4b
            if (r6 != 0) goto L73
            cn.jiguang.commons.z.e.e(r5)     // Catch: java.lang.Exception -> L4b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4b
            r6.<init>()     // Catch: java.lang.Exception -> L4b
            java.lang.String r3 = "save zip md5: "
            r6.append(r3)     // Catch: java.lang.Exception -> L4b
            r6.append(r5)     // Catch: java.lang.Exception -> L4b
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Exception -> L4b
            cn.jiguang.commons.w.a.a(r2, r5)     // Catch: java.lang.Exception -> L4b
        L73:
            r5 = 3072(0xc00, float:4.305E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L4b
            r0.l(r5)     // Catch: java.lang.Exception -> L4b
            return r1
        L7d:
            r5 = 3095(0xc17, float:4.337E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L4b
            r0.l(r5)     // Catch: java.lang.Exception -> L4b
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Exception -> L4b
            java.lang.String r6 = "File size exceeds maximum allowed size"
            r5.<init>(r6)     // Catch: java.lang.Exception -> L4b
            throw r5     // Catch: java.lang.Exception -> L4b
        L8e:
            r5 = 3085(0xc0d, float:4.323E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L4b
            r0.l(r5)     // Catch: java.lang.Exception -> L4b
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Exception -> L4b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4b
            r6.<init>()     // Catch: java.lang.Exception -> L4b
            java.lang.String r3 = "download failed with response code: "
            r6.append(r3)     // Catch: java.lang.Exception -> L4b
            r6.append(r1)     // Catch: java.lang.Exception -> L4b
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L4b
            r5.<init>(r6)     // Catch: java.lang.Exception -> L4b
            throw r5     // Catch: java.lang.Exception -> L4b
        Lae:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Exception -> L4b
            java.lang.String r6 = "failed to download file: response is null"
            r5.<init>(r6)     // Catch: java.lang.Exception -> L4b
            throw r5     // Catch: java.lang.Exception -> L4b
        Lb6:
            r6 = 3075(0xc03, float:4.309E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.l(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "dl f: "
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            cn.jiguang.commons.w.a.c(r2, r5)
            cn.jiguang.commons.z.d$c r5 = new cn.jiguang.commons.z.d$c
            r6 = 0
            r0 = 0
            r5.<init>(r6, r0, r0)
            return r5
    }

    public boolean a(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "JSM"
            r1 = 3079(0xc07, float:4.315E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            cn.jiguang.commons.A.a r2 = cn.jiguang.commons.A.a.f()
            r3 = 3077(0xc05, float:4.312E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.l(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            r4 = 0
            if (r3 == 0) goto L1d
            return r4
        L1d:
            java.lang.String r3 = "HEAD"
            cn.jiguang.commons.x.d r7 = cn.jiguang.commons.z.e.c(r7, r3)     // Catch: java.lang.Exception -> L29
            if (r7 != 0) goto L2b
            r2.l(r1)     // Catch: java.lang.Exception -> L29
            return r4
        L29:
            r7 = move-exception
            goto L58
        L2b:
            java.lang.String r7 = cn.jiguang.commons.z.e.a(r7)     // Catch: java.lang.Exception -> L29
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L29
            r3.<init>()     // Catch: java.lang.Exception -> L29
            java.lang.String r5 = "m check: "
            r3.append(r5)     // Catch: java.lang.Exception -> L29
            r3.append(r7)     // Catch: java.lang.Exception -> L29
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L29
            cn.jiguang.commons.w.a.a(r0, r3)     // Catch: java.lang.Exception -> L29
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L29
            if (r7 != 0) goto L54
            r7 = 3078(0xc06, float:4.313E-42)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L29
            r2.l(r7)     // Catch: java.lang.Exception -> L29
            r7 = 1
            return r7
        L54:
            r2.l(r1)     // Catch: java.lang.Exception -> L29
            goto L79
        L58:
            r1 = 3080(0xc08, float:4.316E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.l(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "pre-check f: "
            r1.append(r2)
            java.lang.String r7 = r7.getMessage()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r7)
        L79:
            return r4
    }
}
