package com.baidu.liantian.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class g {
    public g() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a() {
            java.lang.String r0 = b()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L1d
            java.lang.String r1 = c()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = r1.toUpperCase()     // Catch: java.lang.Throwable -> L1a
            r2 = 0
            r3 = 17
            java.lang.String r0 = r1.substring(r2, r3)     // Catch: java.lang.Throwable -> L1a
            return r0
        L1a:
            com.baidu.liantian.b.e.a()
        L1d:
            return r0
    }

    public static java.lang.String a(android.content.Context r5) {
            java.lang.String r0 = ""
            java.lang.String r1 = "xyus"
            com.baidu.liantian.e r2 = new com.baidu.liantian.e     // Catch: java.lang.Throwable -> L52
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L52
            android.content.SharedPreferences r3 = r2.f5991b     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = r3.getString(r1, r0)     // Catch: java.lang.Throwable -> L52
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L52
            if (r4 != 0) goto L16
            return r3
        L16:
            java.lang.String r3 = n(r5)     // Catch: java.lang.Throwable -> L52
            java.lang.String r5 = e(r5)     // Catch: java.lang.Throwable -> L52
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L52
            if (r4 == 0) goto L26
            java.lang.String r5 = "0"
        L26:
            java.lang.StringBuffer r4 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L52
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L52
            java.lang.StringBuffer r5 = r4.reverse()     // Catch: java.lang.Throwable -> L52
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L52
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r4.<init>()     // Catch: java.lang.Throwable -> L52
            r4.append(r3)     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = "|"
            r4.append(r3)     // Catch: java.lang.Throwable -> L52
            r4.append(r5)     // Catch: java.lang.Throwable -> L52
            java.lang.String r5 = r4.toString()     // Catch: java.lang.Throwable -> L52
            android.content.SharedPreferences$Editor r3 = r2.f5993d     // Catch: java.lang.Throwable -> L52
            r3.putString(r1, r5)     // Catch: java.lang.Throwable -> L52
            android.content.SharedPreferences$Editor r1 = r2.f5993d     // Catch: java.lang.Throwable -> L52
            r1.commit()     // Catch: java.lang.Throwable -> L52
            return r5
        L52:
            com.baidu.liantian.b.e.a()
            return r0
    }

    private static java.lang.String a(java.io.Reader r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            r1 = 4096(0x1000, float:5.74E-42)
            char[] r1 = new char[r1]     // Catch: java.lang.Throwable -> L1d
            int r2 = r4.read(r1)     // Catch: java.lang.Throwable -> L1d
        Ld:
            if (r2 < 0) goto L18
            r3 = 0
            r0.append(r1, r3, r2)     // Catch: java.lang.Throwable -> L1d
            int r2 = r4.read(r1)     // Catch: java.lang.Throwable -> L1d
            goto Ld
        L18:
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L1d
            return r4
        L1d:
            com.baidu.liantian.b.e.a()
            r4 = 0
            return r4
    }

    private static java.lang.String a(java.lang.String r5) {
            java.lang.String r0 = "30212102dicudiab"
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r2 = ""
            if (r1 == 0) goto Lb
            return r2
        Lb:
            java.io.File r1 = new java.io.File
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r4 = "baidu/.cuid"
            r1.<init>(r3, r4)
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Exception -> L66
            r3.<init>(r1)     // Catch: java.lang.Exception -> L66
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L66
            r1.<init>(r3)     // Catch: java.lang.Exception -> L66
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L66
            r3.<init>()     // Catch: java.lang.Exception -> L66
        L25:
            java.lang.String r4 = r1.readLine()     // Catch: java.lang.Exception -> L66
            if (r4 == 0) goto L34
            r3.append(r4)     // Catch: java.lang.Exception -> L66
            java.lang.String r4 = "\r\n"
            r3.append(r4)     // Catch: java.lang.Exception -> L66
            goto L25
        L34:
            r1.close()     // Catch: java.lang.Exception -> L66
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L66
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L66
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Exception -> L66
            r4 = 0
            byte[] r3 = android.util.Base64.decode(r3, r4)     // Catch: java.lang.Exception -> L66
            byte[] r0 = com.baidu.liantian.b.a.a(r0, r0, r3)     // Catch: java.lang.Exception -> L66
            r1.<init>(r0)     // Catch: java.lang.Exception -> L66
            java.lang.String r0 = "="
            java.lang.String[] r0 = r1.split(r0)     // Catch: java.lang.Exception -> L66
            if (r0 == 0) goto L65
            int r1 = r0.length     // Catch: java.lang.Exception -> L66
            r3 = 2
            if (r1 != r3) goto L65
            r1 = r0[r4]     // Catch: java.lang.Exception -> L66
            boolean r5 = r5.equals(r1)     // Catch: java.lang.Exception -> L66
            if (r5 == 0) goto L65
            r5 = 1
            r5 = r0[r5]     // Catch: java.lang.Exception -> L66
            return r5
        L65:
            return r2
        L66:
            com.baidu.liantian.b.e.a()
            return r2
    }

    private static java.lang.String a(byte[] r7) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L41
            r0.reset()     // Catch: java.security.NoSuchAlgorithmException -> L41
            r0.update(r7)     // Catch: java.security.NoSuchAlgorithmException -> L41
            byte[] r7 = r0.digest()     // Catch: java.security.NoSuchAlgorithmException -> L41
            java.lang.String r0 = ""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.security.NoSuchAlgorithmException -> L41
            r1.<init>()     // Catch: java.security.NoSuchAlgorithmException -> L41
            int r2 = r7.length     // Catch: java.security.NoSuchAlgorithmException -> L41
            r3 = 0
        L19:
            if (r3 >= r2) goto L3c
            r4 = r7[r3]     // Catch: java.security.NoSuchAlgorithmException -> L41
            r4 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)     // Catch: java.security.NoSuchAlgorithmException -> L41
            java.lang.String r4 = r4.toUpperCase()     // Catch: java.security.NoSuchAlgorithmException -> L41
            int r5 = r4.length()     // Catch: java.security.NoSuchAlgorithmException -> L41
            r6 = 1
            if (r5 != r6) goto L33
            java.lang.String r5 = "0"
            r1.append(r5)     // Catch: java.security.NoSuchAlgorithmException -> L41
        L33:
            r1.append(r4)     // Catch: java.security.NoSuchAlgorithmException -> L41
            r1.append(r0)     // Catch: java.security.NoSuchAlgorithmException -> L41
            int r3 = r3 + 1
            goto L19
        L3c:
            java.lang.String r7 = r1.toString()     // Catch: java.security.NoSuchAlgorithmException -> L41
            return r7
        L41:
            com.baidu.liantian.b.e.a()
            r7 = 0
            return r7
    }

    private static java.lang.String b() {
            java.lang.String r0 = ""
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "cat /sys/class/net/wlan0/address"
            java.lang.Process r2 = r2.exec(r3)     // Catch: java.lang.Throwable -> L3c
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3c
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Throwable -> L3c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L3c
            java.io.LineNumberReader r2 = new java.io.LineNumberReader     // Catch: java.lang.Throwable -> L3a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3a
            r1 = r0
        L1c:
            if (r1 == 0) goto L2b
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L1c
            java.lang.String r0 = r1.trim()     // Catch: java.lang.Throwable -> L29
            goto L2b
        L29:
            r1 = r3
            goto L3d
        L2b:
            r3.close()     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            com.baidu.liantian.b.e.a()
        L32:
            r2.close()     // Catch: java.io.IOException -> L36
            goto L4c
        L36:
            com.baidu.liantian.b.e.a()
            goto L4c
        L3a:
            r2 = r1
            goto L29
        L3c:
            r2 = r1
        L3d:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L49
            r1.close()     // Catch: java.lang.Throwable -> L46
            goto L49
        L46:
            com.baidu.liantian.b.e.a()
        L49:
            if (r2 == 0) goto L4c
            goto L32
        L4c:
            return r0
        L4d:
            r0 = move-exception
            if (r1 == 0) goto L57
            r1.close()     // Catch: java.lang.Throwable -> L54
            goto L57
        L54:
            com.baidu.liantian.b.e.a()
        L57:
            if (r2 == 0) goto L60
            r2.close()     // Catch: java.io.IOException -> L5d
            goto L60
        L5d:
            com.baidu.liantian.b.e.a()
        L60:
            throw r0
    }

    public static java.lang.String b(android.content.Context r5) {
            java.lang.String r0 = "sgud"
            java.lang.String r1 = ""
            com.baidu.liantian.e r2 = new com.baidu.liantian.e     // Catch: java.lang.Throwable -> L6e
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L6e
            android.content.SharedPreferences r3 = r2.f5991b     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = r3.getString(r0, r1)     // Catch: java.lang.Throwable -> L6e
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L6e
            if (r4 != 0) goto L16
            return r3
        L16:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L6e
            r4 = 25
            if (r3 <= r4) goto L1d
            return r1
        L1d:
            java.lang.String r3 = e(r5)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r5 = f(r5)     // Catch: java.lang.Throwable -> L6e
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L32
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L32
            return r1
        L32:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e
            r4.<init>()     // Catch: java.lang.Throwable -> L6e
            r4.append(r3)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = ":"
            r4.append(r3)     // Catch: java.lang.Throwable -> L6e
            r4.append(r5)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r5 = r4.toString()     // Catch: java.lang.Throwable -> L6e
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L6e
            r3 = 0
        L4b:
            int r4 = r5.length     // Catch: java.lang.Throwable -> L6e
            if (r3 >= r4) goto L58
            r4 = r5[r3]     // Catch: java.lang.Throwable -> L6e
            r4 = r4 ^ 246(0xf6, float:3.45E-43)
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L6e
            r5[r3] = r4     // Catch: java.lang.Throwable -> L6e
            int r3 = r3 + 1
            goto L4b
        L58:
            java.lang.String r5 = com.baidu.liantian.b.o.a(r5)     // Catch: java.lang.Throwable -> L6e
            boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto L63
            return r1
        L63:
            android.content.SharedPreferences$Editor r3 = r2.f5993d     // Catch: java.lang.Throwable -> L6e
            r3.putString(r0, r5)     // Catch: java.lang.Throwable -> L6e
            android.content.SharedPreferences$Editor r0 = r2.f5993d     // Catch: java.lang.Throwable -> L6e
            r0.commit()     // Catch: java.lang.Throwable -> L6e
            return r5
        L6e:
            com.baidu.liantian.b.e.a()
            return r1
    }

    private static java.lang.String c() {
            java.lang.String r0 = "/sys/class/net/eth0/address"
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L13
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = a(r1)     // Catch: java.lang.Throwable -> L14
            r1.close()     // Catch: java.lang.Throwable -> Lf
            goto L22
        Lf:
            com.baidu.liantian.b.e.a()
            goto L22
        L13:
            r1 = 0
        L14:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L20
            r1.close()     // Catch: java.lang.Throwable -> L1d
            goto L20
        L1d:
            com.baidu.liantian.b.e.a()
        L20:
            java.lang.String r0 = ""
        L22:
            return r0
        L23:
            r0 = move-exception
            if (r1 == 0) goto L2d
            r1.close()     // Catch: java.lang.Throwable -> L2a
            goto L2d
        L2a:
            com.baidu.liantian.b.e.a()
        L2d:
            throw r0
    }

    public static java.lang.String c(android.content.Context r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "4|"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = com.baidu.liantian.b.p.a(r2)     // Catch: java.lang.Throwable -> L13
            r0.append(r2)     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> L13
            return r2
        L13:
            com.baidu.liantian.b.e.a()
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String d(android.content.Context r5) {
            java.lang.String r0 = ""
            java.lang.String r1 = f(r5)     // Catch: java.lang.Throwable -> L81
            android.content.ContentResolver r2 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = "bd_setting_i"
            java.lang.String r2 = android.provider.Settings.System.getString(r2, r3)     // Catch: java.lang.Throwable -> L1b
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L1f
            java.lang.String r2 = e(r5)     // Catch: java.lang.Throwable -> L1c
            goto L1f
        L1b:
            r2 = r0
        L1c:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L81
        L1f:
            android.content.ContentResolver r3 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L81
            java.lang.String r4 = "com.baidu.deviceid"
            java.lang.String r3 = android.provider.Settings.System.getString(r3, r4)     // Catch: java.lang.Throwable -> L81
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L81
            if (r4 == 0) goto L50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L81
            java.lang.String r4 = "com.baidu"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L81
            r3.append(r2)     // Catch: java.lang.Throwable -> L81
            r3.append(r1)     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L81
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = a(r1)     // Catch: java.lang.Throwable -> L81
            android.content.ContentResolver r2 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = android.provider.Settings.System.getString(r2, r1)     // Catch: java.lang.Throwable -> L81
        L50:
            if (r3 != 0) goto L53
            return r0
        L53:
            java.lang.String r5 = e(r5)     // Catch: java.lang.Throwable -> L81
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto L5f
            java.lang.String r5 = "0"
        L5f:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L81
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuffer r5 = r1.reverse()     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L81
            r1.<init>()     // Catch: java.lang.Throwable -> L81
            r1.append(r3)     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "|"
            r1.append(r2)     // Catch: java.lang.Throwable -> L81
            r1.append(r5)     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L81
            return r5
        L81:
            return r0
    }

    public static java.lang.String e(android.content.Context r2) {
            boolean r0 = com.baidu.liantian.b.q.a(r2)
            java.lang.String r1 = ""
            if (r0 != 0) goto L9
            return r1
        L9:
            java.lang.String r0 = "phone"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            if (r2 == 0) goto L1f
            java.lang.String r2 = r2.getDeviceId()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L1e
            return r1
        L1e:
            return r2
        L1f:
            return r1
    }

    public static java.lang.String f(android.content.Context r1) {
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r0 = "android_id"
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L12
            java.lang.String r1 = ""
        L12:
            return r1
    }

    public static java.lang.String g(android.content.Context r3) {
            java.lang.String r0 = ""
            android.content.ContentResolver r1 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            java.lang.String r2 = "bd_setting_i"
            java.lang.String r1 = android.provider.Settings.System.getString(r1, r2)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            if (r2 == 0) goto L16
            java.lang.String r1 = e(r3)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
        L16:
            java.lang.String r3 = e(r3)     // Catch: java.lang.Throwable -> L4f
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L4f
            if (r2 == 0) goto L22
            java.lang.String r3 = "0"
        L22:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L4f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuffer r3 = r2.reverse()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = a(r1)     // Catch: java.lang.Throwable -> L4f
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L4f
            if (r2 != 0) goto L4e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r2.<init>()     // Catch: java.lang.Throwable -> L4f
            r2.append(r1)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = "|"
            r2.append(r1)     // Catch: java.lang.Throwable -> L4f
            r2.append(r3)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Throwable -> L4f
            return r3
        L4e:
            return r0
        L4f:
            com.baidu.liantian.b.e.a()
        L52:
            return r0
    }

    public static java.lang.String h(android.content.Context r3) {
            java.lang.String r0 = "window"
            java.lang.Object r3 = r3.getSystemService(r0)     // Catch: java.lang.Exception -> L4a
            android.view.WindowManager r3 = (android.view.WindowManager) r3     // Catch: java.lang.Exception -> L4a
            android.view.Display r3 = r3.getDefaultDisplay()     // Catch: java.lang.Exception -> L4a
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics     // Catch: java.lang.Exception -> L4a
            r0.<init>()     // Catch: java.lang.Exception -> L4a
            r3.getMetrics(r0)     // Catch: java.lang.Exception -> L4a
            int r3 = r0.widthPixels     // Catch: java.lang.Exception -> L4a
            int r1 = r0.heightPixels     // Catch: java.lang.Exception -> L4a
            java.lang.String r2 = "*"
            if (r3 >= r1) goto L33
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4a
            r3.<init>()     // Catch: java.lang.Exception -> L4a
            int r1 = r0.widthPixels     // Catch: java.lang.Exception -> L4a
            r3.append(r1)     // Catch: java.lang.Exception -> L4a
            r3.append(r2)     // Catch: java.lang.Exception -> L4a
            int r0 = r0.heightPixels     // Catch: java.lang.Exception -> L4a
            r3.append(r0)     // Catch: java.lang.Exception -> L4a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L4a
            return r3
        L33:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4a
            r3.<init>()     // Catch: java.lang.Exception -> L4a
            int r1 = r0.heightPixels     // Catch: java.lang.Exception -> L4a
            r3.append(r1)     // Catch: java.lang.Exception -> L4a
            r3.append(r2)     // Catch: java.lang.Exception -> L4a
            int r0 = r0.widthPixels     // Catch: java.lang.Exception -> L4a
            r3.append(r0)     // Catch: java.lang.Exception -> L4a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L4a
            return r3
        L4a:
            com.baidu.liantian.b.e.a()
            java.lang.String r3 = ""
            return r3
    }

    public static java.lang.String i(android.content.Context r1) {
            java.lang.String r0 = "phone"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch: java.lang.Throwable -> Lf
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L12
            java.lang.String r1 = r1.getSubscriberId()     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            com.baidu.liantian.b.e.a()
        L12:
            java.lang.String r1 = ""
            return r1
    }

    public static java.lang.String j(android.content.Context r2) {
            java.lang.String r0 = ""
            java.lang.String r1 = "phone"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch: java.lang.Throwable -> L1b
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1a
            java.lang.String r2 = r2.getSimSerialNumber()     // Catch: java.lang.Throwable -> L1b
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L17
            return r0
        L17:
            return r2
        L18:
            r0 = r2
            goto L1b
        L1a:
            return r0
        L1b:
            com.baidu.liantian.b.e.a()
            return r0
    }

    public static java.lang.String k(android.content.Context r2) {
            java.lang.String r0 = ""
            java.lang.String r1 = "phone"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch: java.lang.Throwable -> L1b
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1a
            java.lang.String r2 = r2.getSimOperatorName()     // Catch: java.lang.Throwable -> L1b
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L17
            return r0
        L17:
            return r2
        L18:
            r0 = r2
            goto L1b
        L1a:
            return r0
        L1b:
            com.baidu.liantian.b.e.a()
            return r0
    }

    public static java.lang.String l(android.content.Context r2) {
            java.lang.String r0 = ""
            java.lang.String r1 = "phone"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch: java.lang.Throwable -> L1b
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1a
            java.lang.String r2 = r2.getNetworkOperator()     // Catch: java.lang.Throwable -> L1b
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L17
            return r0
        L17:
            return r2
        L18:
            r0 = r2
            goto L1b
        L1a:
            return r0
        L1b:
            com.baidu.liantian.b.e.a()
            return r0
    }

    public static java.lang.String m(android.content.Context r2) {
            java.lang.String r0 = ""
            java.lang.String r1 = "wifi"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch: java.lang.Throwable -> L1b
            android.net.wifi.WifiManager r2 = (android.net.wifi.WifiManager) r2     // Catch: java.lang.Throwable -> L1b
            android.net.wifi.WifiInfo r2 = r2.getConnectionInfo()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = r2.getBSSID()     // Catch: java.lang.Throwable -> L1b
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L19
            return r0
        L19:
            return r2
        L1a:
            r0 = r2
        L1b:
            com.baidu.liantian.b.e.a()
            return r0
    }

    private static java.lang.String n(android.content.Context r3) {
            java.lang.String r0 = ""
            java.lang.String r1 = e(r3)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = f(r3)     // Catch: java.lang.Throwable -> Lc
            goto Lf
        Lb:
            r1 = r0
        Lc:
            com.baidu.liantian.b.e.a()
        Lf:
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r0)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            byte[] r3 = r3.getBytes()
            java.lang.String r3 = a(r3)
            return r3
    }
}
