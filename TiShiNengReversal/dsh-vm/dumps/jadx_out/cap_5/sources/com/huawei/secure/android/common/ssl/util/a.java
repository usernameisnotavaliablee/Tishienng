package com.huawei.secure.android.common.ssl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    private static final java.lang.String a = "BksUtil";
    private static final java.lang.String b = "com.huawei.hwid";
    private static final java.lang.String c = "com.huawei.hwid";
    private static final java.lang.String d = "com.huawei.hms";
    private static final java.lang.String e = "com.huawei.hwid.tv";
    private static final android.net.Uri f = null;
    private static final java.lang.String g = "files/hmsrootcas.bks";
    private static final java.lang.String h = "4.0.2.300";
    private static final java.lang.String i = "aegis";
    private static final java.lang.String j = "hmsrootcas.bks";
    private static final long k = 604800000;
    private static final java.lang.String l = "last_update_time";
    private static final java.lang.String m = "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05";
    private static final java.lang.String n = "3517262215D8D3008CBF888750B6418EDC4D562AC33ED6874E0D73ABA667BC3C";
    private static final java.lang.String o = "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539";
    private static final java.lang.String[] p = null;
    private static final java.lang.String q = "";
    private static final java.lang.String r = "bks_hash";

    static {
            java.lang.String r0 = "content://com.huawei.hwid"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            com.huawei.secure.android.common.ssl.util.a.f = r0
            java.lang.String r0 = "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05"
            java.lang.String r1 = "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.huawei.secure.android.common.ssl.util.a.p = r0
            return
    }

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int a(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = -1
            if (r0 == 0) goto L8
            return r1
        L8:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r3 = r0.exists()
            java.lang.String r2 = "BksUtil"
            if (r3 == 0) goto L1c
            java.lang.String r3 = "The directory  has already exists"
            com.huawei.secure.android.common.ssl.util.h.g(r2, r3)
            r3 = 1
            return r3
        L1c:
            boolean r3 = r0.mkdirs()
            if (r3 == 0) goto L29
            java.lang.String r3 = "create directory  success"
            com.huawei.secure.android.common.ssl.util.h.b(r2, r3)
            r3 = 0
            return r3
        L29:
            java.lang.String r3 = "create directory  failed"
            com.huawei.secure.android.common.ssl.util.h.d(r2, r3)
            return r1
    }

    private static java.lang.String b(android.content.Context r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            java.lang.String r2 = "aegis"
            if (r0 < r1) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r3 = androidx.profileinstaller.a.a(r3)
            java.io.File r3 = r3.getFilesDir()
            r0.append(r3)
            java.lang.String r3 = java.io.File.separator
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = r0.toString()
            return r3
        L25:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            java.io.File r3 = r3.getFilesDir()
            r0.append(r3)
            java.lang.String r3 = java.io.File.separator
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static java.lang.String c(byte[] r6) {
            if (r6 == 0) goto L2e
            int r0 = r6.length
            if (r0 != 0) goto L6
            goto L2e
        L6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L29
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            int r4 = r3.length()
            r5 = 1
            if (r4 != r5) goto L23
            r4 = 48
            r0.append(r4)
        L23:
            r0.append(r3)
            int r2 = r2 + 1
            goto Ld
        L29:
            java.lang.String r6 = r0.toString()
            return r6
        L2e:
            java.lang.String r6 = ""
            return r6
    }

    private static void d(java.io.InputStream r6, android.content.Context r7) {
            java.lang.String r0 = "BksUtil"
            if (r6 == 0) goto L5a
            if (r7 != 0) goto L7
            goto L5a
        L7:
            java.lang.String r7 = b(r7)
            java.io.File r1 = new java.io.File
            r1.<init>(r7)
            boolean r1 = r1.exists()
            if (r1 != 0) goto L19
            a(r7)
        L19:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "hmsrootcas.bks"
            r1.<init>(r7, r2)
            boolean r7 = r1.exists()
            if (r7 == 0) goto L29
            r1.delete()
        L29:
            r7 = 0
            java.lang.String r2 = "write output stream "
            com.huawei.secure.android.common.ssl.util.h.e(r0, r2)     // Catch: java.io.IOException -> L4c java.lang.Throwable -> L55
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L4c java.lang.Throwable -> L55
            r2.<init>(r1)     // Catch: java.io.IOException -> L4c java.lang.Throwable -> L55
            r7 = 2048(0x800, float:2.87E-42)
            byte[] r1 = new byte[r7]     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L4b
        L38:
            r3 = 0
            int r4 = r6.read(r1, r3, r7)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L4b
            r5 = -1
            if (r4 == r5) goto L47
            r2.write(r1, r3, r4)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L4b
            goto L38
        L44:
            r6 = move-exception
            r7 = r2
            goto L56
        L47:
            com.huawei.secure.android.common.ssl.util.g.h(r2)
            return
        L4b:
            r7 = r2
        L4c:
            java.lang.String r6 = " IOException"
            com.huawei.secure.android.common.ssl.util.h.d(r0, r6)     // Catch: java.lang.Throwable -> L55
            com.huawei.secure.android.common.ssl.util.g.h(r7)
            return
        L55:
            r6 = move-exception
        L56:
            com.huawei.secure.android.common.ssl.util.g.h(r7)
            throw r6
        L5a:
            return
    }

    private static boolean e(int r1) {
            r0 = 40002300(0x26262fc, float:1.6632265E-37)
            if (r1 < r0) goto L7
            r1 = 1
            return r1
        L7:
            r1 = 0
            return r1
    }

    private static byte[] f(android.content.Context r2, java.lang.String r3) {
            r0 = 0
            if (r2 == 0) goto L2f
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto La
            goto L2f
        La:
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> L21 android.content.pm.PackageManager.NameNotFoundException -> L23
            if (r2 == 0) goto L2c
            r1 = 64
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r1)     // Catch: java.lang.Exception -> L21 android.content.pm.PackageManager.NameNotFoundException -> L23
            if (r2 == 0) goto L2c
            android.content.pm.Signature[] r2 = r2.signatures     // Catch: java.lang.Exception -> L21 android.content.pm.PackageManager.NameNotFoundException -> L23
            r2 = r2[r0]     // Catch: java.lang.Exception -> L21 android.content.pm.PackageManager.NameNotFoundException -> L23
            byte[] r2 = r2.toByteArray()     // Catch: java.lang.Exception -> L21 android.content.pm.PackageManager.NameNotFoundException -> L23
            return r2
        L21:
            r2 = move-exception
            goto L25
        L23:
            r2 = move-exception
            goto L29
        L25:
            r2.getMessage()
            goto L2c
        L29:
            r2.getMessage()
        L2c:
            byte[] r2 = new byte[r0]
            return r2
        L2f:
            byte[] r2 = new byte[r0]
            return r2
    }

    private static java.lang.String g(android.content.Context r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = b(r1)
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r1 = "hmsrootcas.bks"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    private static java.lang.String h(byte[] r2) {
            java.lang.String r0 = ""
            if (r2 != 0) goto L5
            return r0
        L5:
            java.lang.String r1 = "SHA-256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.security.NoSuchAlgorithmException -> L17
            r1.update(r2)     // Catch: java.security.NoSuchAlgorithmException -> L17
            byte[] r2 = r1.digest()     // Catch: java.security.NoSuchAlgorithmException -> L17
            java.lang.String r2 = c(r2)     // Catch: java.security.NoSuchAlgorithmException -> L17
            return r2
        L17:
            java.lang.String r2 = "BksUtil"
            java.lang.String r1 = "inputstraem exception"
            com.huawei.secure.android.common.ssl.util.h.d(r2, r1)
            return r0
    }

    private static boolean i(android.content.Context r0, java.lang.String r1) {
            byte[] r0 = f(r0, r1)
            java.lang.String r0 = k(r0)
            java.lang.String r1 = "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539"
            boolean r0 = r1.equalsIgnoreCase(r0)
            return r0
    }

    private static boolean j(java.lang.String r10) {
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "hms version code is : "
            r0.append(r2)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "BksUtil"
            com.huawei.secure.android.common.ssl.util.h.e(r2, r0)
            java.lang.String r0 = "\\."
            java.lang.String[] r10 = r10.split(r0)
            java.lang.String r3 = "4.0.2.300"
            java.lang.String[] r0 = r3.split(r0)
            int r3 = r10.length
            int r4 = r0.length
            int r5 = java.lang.Math.max(r3, r4)
            r6 = 0
        L31:
            r7 = 1
            if (r6 >= r5) goto L6f
            if (r6 >= r3) goto L3f
            r8 = r10[r6]     // Catch: java.lang.Exception -> L3d
            int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.Exception -> L3d
            goto L40
        L3d:
            r10 = move-exception
            goto L49
        L3f:
            r8 = 0
        L40:
            if (r6 >= r4) goto L65
            r9 = r0[r6]     // Catch: java.lang.Exception -> L3d
            int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Exception -> L3d
            goto L66
        L49:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = " exception : "
            r0.append(r3)
            java.lang.String r10 = r10.getMessage()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.huawei.secure.android.common.ssl.util.h.d(r2, r10)
            if (r6 < r4) goto L64
            r1 = 1
        L64:
            return r1
        L65:
            r9 = 0
        L66:
            if (r8 >= r9) goto L69
            return r1
        L69:
            if (r8 <= r9) goto L6c
            return r7
        L6c:
            int r6 = r6 + 1
            goto L31
        L6f:
            return r7
    }

    private static java.lang.String k(byte[] r2) {
            java.lang.String r0 = ""
            if (r2 == 0) goto L1b
            int r1 = r2.length
            if (r1 != 0) goto L8
            goto L1b
        L8:
            java.lang.String r1 = "SHA-256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.security.NoSuchAlgorithmException -> L17
            byte[] r2 = r1.digest(r2)     // Catch: java.security.NoSuchAlgorithmException -> L17
            java.lang.String r2 = c(r2)     // Catch: java.security.NoSuchAlgorithmException -> L17
            return r2
        L17:
            r2 = move-exception
            r2.getMessage()
        L1b:
            return r0
    }

    private static boolean l(android.content.Context r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = b(r1)
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r1 = "hmsrootcas.bks"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.exists()
            return r1
    }

    private static boolean m(android.content.Context r5, java.lang.String r6) {
            byte[] r5 = f(r5, r6)
            java.lang.String[] r6 = com.huawei.secure.android.common.ssl.util.a.p
            int r0 = r6.length
            r1 = 0
            r2 = 0
        L9:
            if (r2 >= r0) goto L1c
            r3 = r6[r2]
            java.lang.String r4 = k(r5)
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L19
            r5 = 1
            return r5
        L19:
            int r2 = r2 + 1
            goto L9
        L1c:
            return r1
    }

    public static synchronized java.io.InputStream n(android.content.Context r9) {
            java.lang.Class<com.huawei.secure.android.common.ssl.util.a> r0 = com.huawei.secure.android.common.ssl.util.a.class
            monitor-enter(r0)
            java.lang.String r1 = "BksUtil"
            java.lang.String r2 = "get bks from tss begin"
            com.huawei.secure.android.common.ssl.util.h.e(r1, r2)     // Catch: java.lang.Throwable -> L10
            if (r9 == 0) goto L13
            com.huawei.secure.android.common.ssl.util.c.b(r9)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r9 = move-exception
            goto L12b
        L13:
            android.content.Context r9 = com.huawei.secure.android.common.ssl.util.c.a()     // Catch: java.lang.Throwable -> L10
            r1 = 0
            if (r9 != 0) goto L23
            java.lang.String r9 = "BksUtil"
            java.lang.String r2 = "context is null"
            com.huawei.secure.android.common.ssl.util.h.d(r9, r2)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return r1
        L23:
            java.lang.String r2 = "com.huawei.hwid"
            java.lang.String r2 = com.huawei.secure.android.common.ssl.util.i.a(r2)     // Catch: java.lang.Throwable -> L10
            boolean r2 = j(r2)     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto L59
            java.lang.String r2 = "com.huawei.hms"
            java.lang.String r2 = com.huawei.secure.android.common.ssl.util.i.a(r2)     // Catch: java.lang.Throwable -> L10
            boolean r2 = j(r2)     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto L59
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r9.<init>()     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = "hms version code is too low : "
            r9.append(r2)     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = "com.huawei.hwid"
            java.lang.String r2 = com.huawei.secure.android.common.ssl.util.i.a(r2)     // Catch: java.lang.Throwable -> L10
            r9.append(r2)     // Catch: java.lang.Throwable -> L10
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = "BksUtil"
            com.huawei.secure.android.common.ssl.util.h.d(r2, r9)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return r1
        L59:
            java.lang.String r2 = "com.huawei.hwid"
            boolean r2 = m(r9, r2)     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto L72
            java.lang.String r2 = "com.huawei.hms"
            boolean r2 = i(r9, r2)     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto L72
            java.lang.String r9 = "BksUtil"
            java.lang.String r2 = "hms sign error"
            com.huawei.secure.android.common.ssl.util.h.d(r9, r2)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return r1
        L72:
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L10
            r2.<init>()     // Catch: java.lang.Throwable -> L10
            android.net.Uri r3 = com.huawei.secure.android.common.ssl.util.a.f     // Catch: java.lang.Throwable -> Lf1 java.lang.Exception -> Lf4
            java.lang.String r4 = "files/hmsrootcas.bks"
            android.net.Uri r3 = android.net.Uri.withAppendedPath(r3, r4)     // Catch: java.lang.Throwable -> Lf1 java.lang.Exception -> Lf4
            android.content.ContentResolver r4 = r9.getContentResolver()     // Catch: java.lang.Throwable -> Lf1 java.lang.Exception -> Lf4
            java.io.InputStream r3 = r4.openInputStream(r3)     // Catch: java.lang.Throwable -> Lf1 java.lang.Exception -> Lf4
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9d
        L8b:
            int r5 = r3.read(r4)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9d
            r6 = -1
            if (r5 <= r6) goto L9f
            r6 = 0
            r2.write(r4, r6, r5)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9d
            goto L8b
        L97:
            r9 = move-exception
            r8 = r3
            r3 = r1
            r1 = r8
            goto L11f
        L9d:
            r4 = move-exception
            goto Lf6
        L9f:
            r2.flush()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9d
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9d
            byte[] r5 = r2.toByteArray()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9d
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9d
            java.lang.String r1 = "bks_hash"
            java.lang.String r5 = ""
            java.lang.String r1 = com.huawei.secure.android.common.ssl.util.j.c(r1, r5, r9)     // Catch: java.lang.Throwable -> Ld0 java.lang.Exception -> Ld2
            byte[] r5 = r2.toByteArray()     // Catch: java.lang.Throwable -> Ld0 java.lang.Exception -> Ld2
            java.lang.String r5 = h(r5)     // Catch: java.lang.Throwable -> Ld0 java.lang.Exception -> Ld2
            boolean r6 = l(r9)     // Catch: java.lang.Throwable -> Ld0 java.lang.Exception -> Ld2
            if (r6 == 0) goto Ld4
            boolean r1 = r1.equals(r5)     // Catch: java.lang.Throwable -> Ld0 java.lang.Exception -> Ld2
            if (r1 != 0) goto Lc8
            goto Ld4
        Lc8:
            java.lang.String r1 = "BksUtil"
            java.lang.String r5 = "bks not update"
            com.huawei.secure.android.common.ssl.util.h.e(r1, r5)     // Catch: java.lang.Throwable -> Ld0 java.lang.Exception -> Ld2
            goto Le3
        Ld0:
            r9 = move-exception
            goto L121
        Ld2:
            r1 = move-exception
            goto Led
        Ld4:
            java.lang.String r1 = "BksUtil"
            java.lang.String r6 = "update bks and sp"
            com.huawei.secure.android.common.ssl.util.h.e(r1, r6)     // Catch: java.lang.Throwable -> Ld0 java.lang.Exception -> Ld2
            d(r4, r9)     // Catch: java.lang.Throwable -> Ld0 java.lang.Exception -> Ld2
            java.lang.String r1 = "bks_hash"
            com.huawei.secure.android.common.ssl.util.j.i(r1, r5, r9)     // Catch: java.lang.Throwable -> Ld0 java.lang.Exception -> Ld2
        Le3:
            com.huawei.secure.android.common.ssl.util.g.g(r3)     // Catch: java.lang.Throwable -> L10
            com.huawei.secure.android.common.ssl.util.g.h(r2)     // Catch: java.lang.Throwable -> L10
            com.huawei.secure.android.common.ssl.util.g.g(r4)     // Catch: java.lang.Throwable -> L10
            goto L119
        Led:
            r8 = r4
            r4 = r1
            r1 = r8
            goto Lf6
        Lf1:
            r9 = move-exception
            r3 = r1
            goto L11f
        Lf4:
            r4 = move-exception
            r3 = r1
        Lf6:
            java.lang.String r5 = "BksUtil"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r6.<init>()     // Catch: java.lang.Throwable -> L97
            java.lang.String r7 = "Get bks from HMS_VERSION_CODE exception : No content provider"
            r6.append(r7)     // Catch: java.lang.Throwable -> L97
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L97
            r6.append(r4)     // Catch: java.lang.Throwable -> L97
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L97
            com.huawei.secure.android.common.ssl.util.h.d(r5, r4)     // Catch: java.lang.Throwable -> L97
            com.huawei.secure.android.common.ssl.util.g.g(r3)     // Catch: java.lang.Throwable -> L10
            com.huawei.secure.android.common.ssl.util.g.h(r2)     // Catch: java.lang.Throwable -> L10
            com.huawei.secure.android.common.ssl.util.g.g(r1)     // Catch: java.lang.Throwable -> L10
        L119:
            java.io.InputStream r9 = o(r9)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return r9
        L11f:
            r4 = r3
            r3 = r1
        L121:
            com.huawei.secure.android.common.ssl.util.g.g(r3)     // Catch: java.lang.Throwable -> L10
            com.huawei.secure.android.common.ssl.util.g.h(r2)     // Catch: java.lang.Throwable -> L10
            com.huawei.secure.android.common.ssl.util.g.g(r4)     // Catch: java.lang.Throwable -> L10
            throw r9     // Catch: java.lang.Throwable -> L10
        L12b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r9
    }

    public static java.io.InputStream o(android.content.Context r2) {
            boolean r0 = l(r2)
            if (r0 == 0) goto L1c
            java.lang.String r0 = "getFilesBksIS "
            java.lang.String r1 = "BksUtil"
            com.huawei.secure.android.common.ssl.util.h.e(r1, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L17
            java.lang.String r2 = g(r2)     // Catch: java.io.FileNotFoundException -> L17
            r0.<init>(r2)     // Catch: java.io.FileNotFoundException -> L17
            return r0
        L17:
            java.lang.String r2 = "FileNotFoundExceptio: "
            com.huawei.secure.android.common.ssl.util.h.d(r1, r2)
        L1c:
            r2 = 0
            return r2
    }
}
