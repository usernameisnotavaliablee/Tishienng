package com.baidu.liantian.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class p {
    private static java.lang.String a = "";

    static {
            return
    }

    public p() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r1) {
            java.lang.String r0 = com.baidu.liantian.b.p.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L13
            com.baidu.liantian.b.p r0 = new com.baidu.liantian.b.p
            r0.<init>()
            java.lang.String r1 = b(r1)
            com.baidu.liantian.b.p.a = r1
        L13:
            java.lang.String r1 = com.baidu.liantian.b.p.a
            return r1
    }

    private static java.lang.String a(android.content.Context r0, java.lang.String r1) {
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L9
            java.lang.String r0 = android.provider.Settings.System.getString(r0, r1)     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            com.baidu.liantian.b.e.a()
            r0 = 0
            return r0
    }

    private static java.lang.String a(java.io.File r5) {
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L26
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L26
            r5 = 8192(0x2000, float:1.148E-41)
            char[] r5 = new char[r5]     // Catch: java.lang.Throwable -> L27
            java.io.CharArrayWriter r2 = new java.io.CharArrayWriter     // Catch: java.lang.Throwable -> L27
            r2.<init>()     // Catch: java.lang.Throwable -> L27
        Lf:
            int r3 = r1.read(r5)     // Catch: java.lang.Throwable -> L27
            if (r3 <= 0) goto L1a
            r4 = 0
            r2.write(r5, r4, r3)     // Catch: java.lang.Throwable -> L27
            goto Lf
        L1a:
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L27
            r1.close()     // Catch: java.lang.Throwable -> L22
            return r5
        L22:
            com.baidu.liantian.b.e.a()
            return r5
        L26:
            r1 = r0
        L27:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L33
            r1.close()     // Catch: java.lang.Throwable -> L30
            goto L33
        L30:
            com.baidu.liantian.b.e.a()
        L33:
            return r0
        L34:
            r5 = move-exception
            if (r1 == 0) goto L3e
            r1.close()     // Catch: java.lang.Throwable -> L3b
            goto L3e
        L3b:
            com.baidu.liantian.b.e.a()
        L3e:
            throw r5
    }

    private static boolean a(android.content.Context r0, java.lang.String r1, java.lang.String r2) {
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L9
            boolean r0 = android.provider.Settings.System.putString(r0, r1, r2)     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            com.baidu.liantian.b.e.a()
            r0 = 0
            return r0
    }

    private static java.lang.String b(android.content.Context r7) {
            java.lang.String r0 = c(r7)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto L78
            java.lang.String r0 = d(r7)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r3 = 1
            if (r1 == 0) goto L76
            java.lang.String r0 = e(r7)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L73
            java.lang.String r0 = com.baidu.liantian.b.g.e(r7)
            java.lang.String r1 = com.baidu.liantian.b.g.f(r7)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L4f
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L4f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "1|"
            r0.<init>(r1)
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = com.baidu.liantian.b.o.a(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L70
        L4f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "0|"
            r4.<init>(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = r5.toString()
            java.lang.String r0 = com.baidu.liantian.b.o.a(r0)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
        L70:
            r1 = 1
            r4 = 1
            goto L7b
        L73:
            r1 = 1
        L74:
            r4 = 0
            goto L7b
        L76:
            r1 = 0
            goto L74
        L78:
            r1 = 0
            r3 = 0
            goto L74
        L7b:
            if (r3 != 0) goto L87
            java.lang.String r3 = c(r7)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L98
        L87:
            com.baidu.liantian.e r3 = new com.baidu.liantian.e
            r3.<init>(r7)
            android.content.SharedPreferences$Editor r5 = r3.f5993d
            java.lang.String r6 = "rpnewuid"
            r5.putString(r6, r0)
            android.content.SharedPreferences$Editor r3 = r3.f5993d
            r3.commit()
        L98:
            if (r1 != 0) goto La4
            java.lang.String r1 = d(r7)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto La9
        La4:
            java.lang.String r1 = "com.q.zi.i"
            a(r7, r1, r0)
        La9:
            java.lang.String r1 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r1 = b(r7, r1)
            if (r1 == 0) goto L10d
            if (r4 != 0) goto Lbd
            java.lang.String r7 = e(r7)
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L10d
        Lbd:
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> Lf8
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r3 = ".zp"
            r7.<init>(r1, r3)     // Catch: java.lang.Throwable -> Lf8
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r3 = ".icosc"
            r1.<init>(r7, r3)     // Catch: java.lang.Throwable -> Lf8
            boolean r3 = r7.exists()     // Catch: java.lang.Throwable -> Lf8
            if (r3 == 0) goto Le2
            boolean r3 = r7.isDirectory()     // Catch: java.lang.Throwable -> Lf8
            if (r3 != 0) goto Le5
            r7.delete()     // Catch: java.lang.Throwable -> Lf8
            r7.mkdirs()     // Catch: java.lang.Throwable -> Lf8
            goto Le5
        Le2:
            r7.mkdirs()     // Catch: java.lang.Throwable -> Lf8
        Le5:
            java.io.FileWriter r7 = new java.io.FileWriter     // Catch: java.lang.Throwable -> Lf8
            r7.<init>(r1, r2)     // Catch: java.lang.Throwable -> Lf8
            r7.write(r0)     // Catch: java.lang.Throwable -> Lf9
            r7.flush()     // Catch: java.lang.Throwable -> Lf9
            r7.close()     // Catch: java.lang.Throwable -> Lf4
            return r0
        Lf4:
            com.baidu.liantian.b.e.a()
            goto L10d
        Lf8:
            r7 = 0
        Lf9:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L102
            if (r7 == 0) goto L10d
            r7.close()     // Catch: java.lang.Throwable -> Lf4
            goto L10d
        L102:
            r0 = move-exception
            if (r7 == 0) goto L10c
            r7.close()     // Catch: java.lang.Throwable -> L109
            goto L10c
        L109:
            com.baidu.liantian.b.e.a()
        L10c:
            throw r0
        L10d:
            return r0
    }

    private static boolean b(android.content.Context r3, java.lang.String r4) {
            r0 = 0
            int r1 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L12
            int r2 = android.os.Process.myUid()     // Catch: java.lang.Throwable -> L12
            int r3 = r3.checkPermission(r4, r1, r2)     // Catch: java.lang.Throwable -> L12
            if (r3 != 0) goto L11
            r3 = 1
            return r3
        L11:
            return r0
        L12:
            com.baidu.liantian.b.e.a()
            return r0
    }

    private static java.lang.String c(android.content.Context r2) {
            java.lang.String r0 = ""
            com.baidu.liantian.e r1 = new com.baidu.liantian.e     // Catch: java.lang.Throwable -> L10
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L10
            android.content.SharedPreferences r2 = r1.f5991b     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = "rpnewuid"
            java.lang.String r2 = r2.getString(r1, r0)     // Catch: java.lang.Throwable -> L10
            return r2
        L10:
            com.baidu.liantian.b.e.a()
            return r0
    }

    private static java.lang.String d(android.content.Context r1) {
            java.lang.String r0 = "com.q.zi.i"
            java.lang.String r1 = a(r1, r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            com.baidu.liantian.b.e.a()
            java.lang.String r1 = ""
            return r1
    }

    private static java.lang.String e(android.content.Context r3) {
            java.lang.String r0 = ""
            java.lang.String r1 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r3 = b(r3, r1)     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto Lb
            return r0
        Lb:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L21
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = ".zp/.icosc"
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L21
            boolean r1 = r3.exists()     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L24
            java.lang.String r3 = a(r3)     // Catch: java.lang.Throwable -> L21
            return r3
        L21:
            com.baidu.liantian.b.e.a()
        L24:
            return r0
    }
}
