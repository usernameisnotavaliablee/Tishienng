package com.baidu.liantian.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class h {
    public h() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            r0 = 0
            java.lang.String r1 = a(r1, r2, r3, r0, r0)
            return r1
    }

    public static java.lang.String a(android.content.Context r1, java.lang.String r2, java.lang.String r3, boolean r4) {
            r0 = 0
            java.lang.String r1 = a(r1, r2, r3, r4, r0)
            return r1
    }

    public static java.lang.String a(android.content.Context r9, java.lang.String r10, java.lang.String r11, boolean r12, boolean r13) {
            java.lang.String[] r0 = com.baidu.liantian.b.e.g(r9)
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            r0 = r0[r3]
            java.util.Date r4 = new java.util.Date
            r4.<init>()
            long r4 = r4.getTime()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r0 = com.baidu.liantian.b.o.a(r0)
            byte[] r5 = com.baidu.liantian.core.i.a()
            java.lang.String r6 = new java.lang.String
            r6.<init>(r5)
            com.baidu.liantian.b.a()
            boolean r6 = android.text.TextUtils.isEmpty(r11)
            java.lang.String r7 = ""
            if (r6 != 0) goto L6f
            byte[] r11 = r11.getBytes()
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
            r6.<init>(r11)
            java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream
            r11.<init>()
            com.baidu.liantian.b.j.a(r6, r11)
            byte[] r8 = r11.toByteArray()
            r11.flush()
            r11.close()
            r6.close()
            int r11 = r8.length
            com.baidu.liantian.b.a()
            com.baidu.liantian.ac.F r11 = com.baidu.liantian.ac.F.getInstance()
            byte[] r11 = r11.ae(r8, r5)
            goto L73
        L6f:
            byte[] r11 = r7.getBytes()
        L73:
            int r6 = r11.length
            java.lang.String r6 = new java.lang.String
            r6.<init>(r11)
            com.baidu.liantian.b.a()
            java.lang.String r6 = com.baidu.liantian.b.g.a(r9)
            java.lang.String r6 = com.baidu.liantian.b.o.a(r6)
            byte[] r6 = r6.getBytes()
            java.lang.String r8 = new java.lang.String
            r8.<init>(r6)
            com.baidu.liantian.b.a()
            com.baidu.liantian.ac.F r8 = com.baidu.liantian.ac.F.getInstance()
            byte[] r5 = r8.re(r5, r6)
            int r8 = r5.length
            com.baidu.liantian.b.a()
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r1)
            com.baidu.liantian.b.a()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r10)
            java.lang.String r10 = "/150/"
            r8.append(r10)
            r8.append(r2)
            java.lang.String r10 = "/"
            r8.append(r10)
            r8.append(r4)
            r8.append(r10)
            r8.append(r0)
            boolean r10 = android.text.TextUtils.isEmpty(r5)
            if (r10 != 0) goto Ld5
            java.lang.String r10 = "?skey="
            r8.append(r10)
            java.lang.String r10 = "utf-8"
            java.lang.String r10 = java.net.URLEncoder.encode(r5, r10)
            r8.append(r10)
        Ld5:
            com.baidu.liantian.b.a()
            if (r13 == 0) goto Le8
            com.baidu.liantian.b.m r10 = new com.baidu.liantian.b.m     // Catch: java.lang.Throwable -> Lf6
            r10.<init>(r9)     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r11 = r8.toString()     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r7 = r10.a(r11)     // Catch: java.lang.Throwable -> Lf6
            goto Lf9
        Le8:
            com.baidu.liantian.b.m r10 = new com.baidu.liantian.b.m     // Catch: java.lang.Throwable -> Lf6
            r10.<init>(r9)     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r13 = r8.toString()     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r7 = r10.a(r13, r11)     // Catch: java.lang.Throwable -> Lf6
            goto Lf9
        Lf6:
            com.baidu.liantian.b.e.a()
        Lf9:
            com.baidu.liantian.b.a()
            if (r12 == 0) goto L1ac
            boolean r10 = android.text.TextUtils.isEmpty(r7)
            if (r10 == 0) goto L1ac
            com.baidu.liantian.e r10 = new com.baidu.liantian.e     // Catch: java.lang.Throwable -> L1a1
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L1a1
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1a1
            android.content.SharedPreferences r13 = r10.a     // Catch: java.lang.Throwable -> L1a1
            java.lang.String r0 = "pu_cl_fd"
            r4 = 0
            long r6 = r13.getLong(r0, r4)     // Catch: java.lang.Throwable -> L1a1
            int r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r13 != 0) goto L122
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1a1
            r10.j()     // Catch: java.lang.Throwable -> L1a1
        L122:
            long r11 = r11 - r6
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 <= 0) goto L189
            java.util.HashMap r11 = new java.util.HashMap     // Catch: java.lang.Throwable -> L1a1
            r11.<init>()     // Catch: java.lang.Throwable -> L1a1
            boolean r12 = com.baidu.liantian.b.e.e(r9)     // Catch: java.lang.Throwable -> L1a1
            java.lang.String r13 = "1"
            java.lang.String r0 = "0"
            if (r12 == 0) goto L151
            int r12 = r10.l()     // Catch: java.lang.Throwable -> L1a1
            int r12 = r12 + r3
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L1a1
            r11.put(r0, r12)     // Catch: java.lang.Throwable -> L1a1
            int r12 = r10.m()     // Catch: java.lang.Throwable -> L1a1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L1a1
            r11.put(r13, r12)     // Catch: java.lang.Throwable -> L1a1
            goto L168
        L151:
            int r12 = r10.l()     // Catch: java.lang.Throwable -> L1a1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L1a1
            r11.put(r0, r12)     // Catch: java.lang.Throwable -> L1a1
            int r12 = r10.m()     // Catch: java.lang.Throwable -> L1a1
            int r12 = r12 + r3
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L1a1
            r11.put(r13, r12)     // Catch: java.lang.Throwable -> L1a1
        L168:
            android.content.SharedPreferences$Editor r12 = r10.f5992c     // Catch: java.lang.Throwable -> L1a1
            java.lang.String r13 = "mo_fa_pu_cl"
            r12.putInt(r13, r1)     // Catch: java.lang.Throwable -> L1a1
            android.content.SharedPreferences$Editor r12 = r10.f5992c     // Catch: java.lang.Throwable -> L1a1
            r12.commit()     // Catch: java.lang.Throwable -> L1a1
            android.content.SharedPreferences$Editor r12 = r10.f5992c     // Catch: java.lang.Throwable -> L1a1
            java.lang.String r13 = "wi_fa_pu_cl"
            r12.putInt(r13, r1)     // Catch: java.lang.Throwable -> L1a1
            android.content.SharedPreferences$Editor r12 = r10.f5992c     // Catch: java.lang.Throwable -> L1a1
            r12.commit()     // Catch: java.lang.Throwable -> L1a1
            r10.j()     // Catch: java.lang.Throwable -> L1a1
            java.lang.String r10 = "1003112"
            com.baidu.liantian.b.e.a(r9, r10, r11)     // Catch: java.lang.Throwable -> L1a1
            goto L1a4
        L189:
            boolean r9 = com.baidu.liantian.b.e.e(r9)     // Catch: java.lang.Throwable -> L1a1
            if (r9 == 0) goto L198
            int r9 = r10.l()     // Catch: java.lang.Throwable -> L1a1
            int r9 = r9 + r3
            r10.a(r9)     // Catch: java.lang.Throwable -> L1a1
            goto L1a4
        L198:
            int r9 = r10.m()     // Catch: java.lang.Throwable -> L1a1
            int r9 = r9 + r3
            r10.b(r9)     // Catch: java.lang.Throwable -> L1a1
            goto L1a4
        L1a1:
            com.baidu.liantian.b.e.a()
        L1a4:
            android.accounts.NetworkErrorException r9 = new android.accounts.NetworkErrorException
            java.lang.String r10 = "response is empty"
            r9.<init>(r10)
            throw r9
        L1ac:
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>(r7)
            java.lang.String r11 = "skey"
            java.lang.String r11 = r10.optString(r11)
            com.baidu.liantian.b.a()
            byte[] r11 = android.util.Base64.decode(r11, r1)
            int r12 = r11.length
            com.baidu.liantian.b.a()
            com.baidu.liantian.ac.F r12 = com.baidu.liantian.ac.F.getInstance()
            byte[] r11 = r12.rd(r11, r6)
            java.lang.String r12 = new java.lang.String
            r12.<init>(r11)
            com.baidu.liantian.b.a()
            java.lang.String r12 = "response"
            java.lang.String r12 = r10.optString(r12)
            java.lang.String r13 = "request_id"
            r10.optString(r13)
            com.baidu.liantian.b.a()
            com.baidu.liantian.b.a()
            byte[] r10 = android.util.Base64.decode(r12, r1)
            int r12 = r10.length
            com.baidu.liantian.b.a()
            com.baidu.liantian.ac.F r12 = com.baidu.liantian.ac.F.getInstance()
            byte[] r11 = r12.ad(r10, r11)
            int r10 = r10.length
            if (r10 <= 0) goto L207
            if (r11 == 0) goto L1fc
            int r10 = r11.length
            if (r10 == 0) goto L1fc
            goto L207
        L1fc:
            com.baidu.liantian.b.e.k(r9)
            android.accounts.NetworkErrorException r9 = new android.accounts.NetworkErrorException
            java.lang.String r10 = "aes is fail"
            r9.<init>(r10)
            throw r9
        L207:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r11)
            return r9
    }

    public static boolean a(android.content.Context r9) {
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L54
            r1.<init>()     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = r9.getPackageName()     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = "pkg"
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L54
            android.content.pm.PackageManager r3 = r9.getPackageManager()     // Catch: java.lang.Throwable -> L54
            r4 = 64
            android.content.pm.PackageInfo r2 = r3.getPackageInfo(r2, r4)     // Catch: java.lang.Throwable -> L1a
            goto L1e
        L1a:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L54
            r2 = 0
        L1e:
            java.lang.String r4 = "app"
            java.lang.String r5 = "sign"
            java.lang.String r6 = ""
            if (r2 == 0) goto L6c
            android.content.pm.ApplicationInfo r7 = r2.applicationInfo     // Catch: java.lang.Throwable -> L54
            java.lang.String r7 = r7.sourceDir     // Catch: java.lang.Throwable -> L54
            java.security.PublicKey r7 = com.baidu.liantian.b.e.a(r2, r7)     // Catch: java.lang.Throwable -> L54
            if (r7 == 0) goto L57
            byte[] r7 = r7.getEncoded()     // Catch: java.lang.Throwable -> L54
            if (r7 == 0) goto L5a
            com.baidu.liantian.b.e.a(r9, r7)     // Catch: java.lang.Throwable -> L54
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r0)     // Catch: java.lang.Throwable -> L54
            java.lang.String r8 = "\n"
            java.lang.String r7 = r7.replace(r8, r6)     // Catch: java.lang.Throwable -> L54
            java.lang.String r8 = "\r"
            java.lang.String r6 = r7.replace(r8, r6)     // Catch: java.lang.Throwable -> L54
            java.lang.String r6 = com.baidu.liantian.b.o.a(r6)     // Catch: java.lang.Throwable -> L54
            r1.put(r5, r6)     // Catch: java.lang.Throwable -> L54
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L54
            goto L5a
        L54:
            r9 = move-exception
            goto L112
        L57:
            r1.put(r5, r6)     // Catch: java.lang.Throwable -> L54
        L5a:
            android.content.pm.ApplicationInfo r2 = r2.applicationInfo     // Catch: java.lang.Throwable -> L54
            java.lang.CharSequence r2 = r2.loadLabel(r3)     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = com.baidu.liantian.b.e.e(r2)     // Catch: java.lang.Throwable -> L54
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L54
            goto L72
        L6c:
            r1.put(r5, r6)     // Catch: java.lang.Throwable -> L54
            r1.put(r4, r6)     // Catch: java.lang.Throwable -> L54
        L72:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L54
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r2.<init>()     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = com.baidu.liantian.b.e.b()     // Catch: java.lang.Throwable -> L54
            r2.append(r3)     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = "p/1/auh"
            r2.append(r3)     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = a(r9, r2, r1, r0)     // Catch: java.lang.Throwable -> L54
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L54
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L54
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L54
            int r1 = r2.length()     // Catch: java.lang.Throwable -> L54
            if (r1 <= 0) goto L11b
            java.lang.String r1 = "code"
            int r1 = r2.optInt(r1)     // Catch: java.lang.Throwable -> L54
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L54
            r3 = 200(0xc8, float:2.8E-43)
            if (r1 != r3) goto L11b
            java.lang.String r1 = "ak"
            java.lang.String r1 = r2.optString(r1)     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = "sk"
            java.lang.String r2 = r2.optString(r3)     // Catch: java.lang.Throwable -> L54
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L54
            if (r3 != 0) goto L11b
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L54
            if (r3 != 0) goto L11b
            com.baidu.liantian.core.d r9 = com.baidu.liantian.core.d.a(r9)     // Catch: java.lang.Throwable -> L54
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L10d
            if (r3 != 0) goto L110
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L10d
            if (r3 == 0) goto Ld6
            goto L110
        Ld6:
            java.lang.String r3 = com.baidu.liantian.b.e.f5910d     // Catch: java.lang.Throwable -> L10d
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L10d
            if (r3 == 0) goto Le7
            java.lang.String r3 = com.baidu.liantian.b.e.f5911e     // Catch: java.lang.Throwable -> L10d
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L10d
            if (r3 == 0) goto Le7
            goto L110
        Le7:
            com.baidu.liantian.b.e.a(r1, r2)     // Catch: java.lang.Throwable -> L10d
            com.baidu.liantian.e r9 = r9.a     // Catch: java.lang.Throwable -> L10d
            android.content.SharedPreferences$Editor r3 = r9.f5992c     // Catch: java.lang.Throwable -> L10d
            java.lang.String r4 = "svi_n"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10d
            r5.<init>()     // Catch: java.lang.Throwable -> L10d
            r5.append(r1)     // Catch: java.lang.Throwable -> L10d
            java.lang.String r1 = "-"
            r5.append(r1)     // Catch: java.lang.Throwable -> L10d
            r5.append(r2)     // Catch: java.lang.Throwable -> L10d
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L10d
            r3.putString(r4, r1)     // Catch: java.lang.Throwable -> L10d
            android.content.SharedPreferences$Editor r9 = r9.f5992c     // Catch: java.lang.Throwable -> L10d
            r9.commit()     // Catch: java.lang.Throwable -> L10d
            goto L110
        L10d:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L54
        L110:
            r0 = 1
            goto L11b
        L112:
            r9.toString()
            com.baidu.liantian.b.a()
            com.baidu.liantian.b.e.a()
        L11b:
            return r0
    }

    public static byte[] a(byte[] r9, byte[] r10) {
            r0 = 256(0x100, float:3.59E-43)
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = 0
        L6:
            if (r3 >= r0) goto Le
            byte r4 = (byte) r3
            r1[r3] = r4
            int r3 = r3 + 1
            goto L6
        Le:
            if (r10 == 0) goto L32
            int r3 = r10.length
            if (r3 != 0) goto L14
            goto L32
        L14:
            r3 = 0
            r4 = 0
            r5 = 0
        L17:
            if (r3 >= r0) goto L33
            r6 = r10[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = r1[r3]
            r8 = r7 & 255(0xff, float:3.57E-43)
            int r6 = r6 + r8
            int r6 = r6 + r5
            r5 = r6 & 255(0xff, float:3.57E-43)
            r6 = r1[r5]
            r1[r3] = r6
            r1[r5] = r7
            int r4 = r4 + 1
            int r6 = r10.length
            int r4 = r4 % r6
            int r3 = r3 + 1
            goto L17
        L32:
            r1 = 0
        L33:
            int r10 = r9.length
            byte[] r10 = new byte[r10]
            r0 = 0
            r3 = 0
        L38:
            int r4 = r9.length
            if (r2 >= r4) goto L65
            int r0 = r0 + 1
            r0 = r0 & 255(0xff, float:3.57E-43)
            r4 = r1[r0]
            r5 = r4 & 255(0xff, float:3.57E-43)
            int r5 = r5 + r3
            r3 = r5 & 255(0xff, float:3.57E-43)
            r5 = r1[r3]
            r1[r0] = r5
            r1[r3] = r4
            r5 = r1[r0]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r5 = r5 + r4
            r4 = r5 & 255(0xff, float:3.57E-43)
            r5 = r9[r2]
            r4 = r1[r4]
            r4 = r4 ^ r5
            byte r4 = (byte) r4
            r10[r2] = r4
            r4 = r4 ^ 42
            byte r4 = (byte) r4
            r10[r2] = r4
            int r2 = r2 + 1
            goto L38
        L65:
            return r10
    }
}
