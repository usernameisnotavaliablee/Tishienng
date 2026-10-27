package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class i3 {
    public char[] a;

    public i3() {
            r1 = this;
            r1.<init>()
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000e: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            r1.a = r0
            return
    }

    public static void a(java.lang.String r1) {
            java.lang.String r0 = "PgyerAnalytics"
            com.acse.ottn.h2.d(r0, r1)
            return
    }

    public static boolean a(android.content.Context r2, java.lang.String r3) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            android.content.pm.PackageManager r1 = r2.getPackageManager()
            java.lang.String r2 = r2.getPackageName()
            int r2 = r1.checkPermission(r3, r2)
            if (r2 != 0) goto L14
            r2 = 1
            return r2
        L14:
            return r0
    }

    public static java.lang.String c(java.lang.String r7) {
            java.lang.String r0 = ""
            if (r7 == 0) goto L55
            int r1 = r7.length()
            if (r1 != 0) goto Lb
            goto L55
        Lb:
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.security.NoSuchAlgorithmException -> L55
            byte[] r7 = r7.getBytes()     // Catch: java.security.NoSuchAlgorithmException -> L55
            byte[] r7 = r1.digest(r7)     // Catch: java.security.NoSuchAlgorithmException -> L55
            int r1 = r7.length     // Catch: java.security.NoSuchAlgorithmException -> L55
            r2 = 0
            r3 = r0
        L1c:
            if (r2 >= r1) goto L50
            r4 = r7[r2]     // Catch: java.security.NoSuchAlgorithmException -> L55
            r4 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)     // Catch: java.security.NoSuchAlgorithmException -> L55
            int r5 = r4.length()     // Catch: java.security.NoSuchAlgorithmException -> L55
            r6 = 1
            if (r5 != r6) goto L3e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.security.NoSuchAlgorithmException -> L55
            r5.<init>()     // Catch: java.security.NoSuchAlgorithmException -> L55
            java.lang.String r6 = "0"
            r5.append(r6)     // Catch: java.security.NoSuchAlgorithmException -> L55
            r5.append(r4)     // Catch: java.security.NoSuchAlgorithmException -> L55
            java.lang.String r4 = r5.toString()     // Catch: java.security.NoSuchAlgorithmException -> L55
        L3e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.security.NoSuchAlgorithmException -> L55
            r5.<init>()     // Catch: java.security.NoSuchAlgorithmException -> L55
            r5.append(r3)     // Catch: java.security.NoSuchAlgorithmException -> L55
            r5.append(r4)     // Catch: java.security.NoSuchAlgorithmException -> L55
            java.lang.String r3 = r5.toString()     // Catch: java.security.NoSuchAlgorithmException -> L55
            int r2 = r2 + 1
            goto L1c
        L50:
            java.lang.String r7 = r3.toLowerCase()     // Catch: java.security.NoSuchAlgorithmException -> L55
            return r7
        L55:
            return r0
    }

    public java.lang.String a(long r5) {
            r4 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L1c
            long r5 = r5 / r0
            float r5 = (float) r5
            r6 = 1148846080(0x447a0000, float:1000.0)
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 < 0) goto L12
            float r5 = r5 / r6
            java.lang.String r0 = "GHz"
            goto L14
        L12:
            java.lang.String r0 = "MHz"
        L14:
            int r1 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r1 < 0) goto L1f
            float r5 = r5 / r6
            java.lang.String r0 = "THz"
            goto L1f
        L1c:
            float r5 = (float) r5
            java.lang.String r0 = "KHz"
        L1f:
            java.text.DecimalFormat r6 = new java.text.DecimalFormat
            java.lang.String r1 = "#0.0"
            r6.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            double r2 = (double) r5
            java.lang.String r5 = r6.format(r2)
            r1.<init>(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            return r5
    }

    public java.lang.String a(byte[] r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.length
            int r1 = r1 * 2
            r0.<init>(r1)
            r1 = 0
        L9:
            int r2 = r5.length
            if (r1 >= r2) goto L27
            char[] r2 = r4.a
            r3 = r5[r1]
            r3 = r3 & 240(0xf0, float:3.36E-43)
            int r3 = r3 >>> 4
            char r2 = r2[r3]
            r0.append(r2)
            char[] r2 = r4.a
            r3 = r5[r1]
            r3 = r3 & 15
            char r2 = r2[r3]
            r0.append(r2)
            int r1 = r1 + 1
            goto L9
        L27:
            java.lang.String r5 = r0.toString()
            return r5
    }

    public java.lang.String b(long r5) {
            r4 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L1c
            long r5 = r5 / r0
            float r5 = (float) r5
            r6 = 1148846080(0x447a0000, float:1000.0)
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 < 0) goto L12
            float r5 = r5 / r6
            java.lang.String r0 = "MB"
            goto L14
        L12:
            java.lang.String r0 = "KB"
        L14:
            int r1 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r1 < 0) goto L1f
            float r5 = r5 / r6
            java.lang.String r0 = "GB"
            goto L1f
        L1c:
            float r5 = (float) r5
            java.lang.String r0 = "B"
        L1f:
            java.text.DecimalFormat r6 = new java.text.DecimalFormat
            java.lang.String r1 = "#0.0"
            r6.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            double r2 = (double) r5
            java.lang.String r5 = r6.format(r2)
            r1.<init>(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            return r5
    }

    public java.lang.String b(java.lang.String r5) {
            r4 = this;
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L26
            r1.<init>(r5)     // Catch: java.lang.Exception -> L26
            java.lang.String r5 = "MD5"
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r5)     // Catch: java.lang.Exception -> L26
        Lf:
            int r2 = r1.read(r0)     // Catch: java.lang.Exception -> L26
            if (r2 <= 0) goto L1a
            r3 = 0
            r5.update(r0, r3, r2)     // Catch: java.lang.Exception -> L26
            goto Lf
        L1a:
            r1.close()     // Catch: java.lang.Exception -> L26
            byte[] r5 = r5.digest()     // Catch: java.lang.Exception -> L26
            java.lang.String r5 = r4.a(r5)     // Catch: java.lang.Exception -> L26
            return r5
        L26:
            java.io.PrintStream r5 = java.lang.System.out
            r5.getClass()
            r5 = 0
            return r5
    }
}
