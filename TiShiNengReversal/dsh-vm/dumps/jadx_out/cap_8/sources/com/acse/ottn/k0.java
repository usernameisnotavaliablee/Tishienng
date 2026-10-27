package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class k0 {
    public k0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(double r9) {
            r0 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r9 = r9 / r0
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lc
            java.lang.String r9 = "0K"
            return r9
        Lc:
            double r4 = r9 / r0
            r6 = 4
            r7 = 2
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 >= 0) goto L37
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r9 = java.lang.Double.toString(r9)
            r0.<init>(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.math.BigDecimal r10 = r0.setScale(r7, r6)
            java.lang.String r10 = r10.toPlainString()
            r9.append(r10)
            java.lang.String r10 = "KB"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            return r9
        L37:
            double r9 = r4 / r0
            int r8 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r8 >= 0) goto L60
            java.math.BigDecimal r9 = new java.math.BigDecimal
            java.lang.String r10 = java.lang.Double.toString(r4)
            r9.<init>(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.math.BigDecimal r9 = r9.setScale(r7, r6)
            java.lang.String r9 = r9.toPlainString()
            r10.append(r9)
            java.lang.String r9 = "MB"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            return r9
        L60:
            double r0 = r9 / r0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L89
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r9 = java.lang.Double.toString(r9)
            r0.<init>(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.math.BigDecimal r10 = r0.setScale(r7, r6)
            java.lang.String r10 = r10.toPlainString()
            r9.append(r10)
            java.lang.String r10 = "GB"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            return r9
        L89:
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r0)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.math.BigDecimal r9 = r9.setScale(r7, r6)
            java.lang.String r9 = r9.toPlainString()
            r10.append(r9)
            java.lang.String r9 = "TB"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            return r9
    }

    public static void a(android.content.Context r2) {
            java.io.File r0 = r2.getCacheDir()
            a(r0)
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            java.lang.String r1 = "mounted"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1a
            java.io.File r2 = r2.getExternalCacheDir()
            a(r2)
        L1a:
            return
    }

    public static boolean a(java.io.File r6) {
            if (r6 == 0) goto L24
            boolean r0 = r6.isDirectory()
            if (r0 == 0) goto L24
            java.lang.String[] r0 = r6.list()
            if (r0 == 0) goto L24
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L11:
            if (r3 >= r1) goto L24
            java.io.File r4 = new java.io.File
            r5 = r0[r3]
            r4.<init>(r6, r5)
            boolean r4 = a(r4)
            if (r4 != 0) goto L21
            return r2
        L21:
            int r3 = r3 + 1
            goto L11
        L24:
            if (r6 != 0) goto L28
            r6 = 1
            return r6
        L28:
            boolean r6 = r6.delete()
            return r6
    }

    public static long b(java.io.File r6) throws java.lang.Exception {
            r0 = 0
            java.io.File[] r6 = r6.listFiles()     // Catch: java.lang.Exception -> L25
            if (r6 == 0) goto L25
            int r2 = r6.length     // Catch: java.lang.Exception -> L25
            r3 = 0
        La:
            if (r3 >= r2) goto L25
            r4 = r6[r3]     // Catch: java.lang.Exception -> L25
            boolean r4 = r4.isDirectory()     // Catch: java.lang.Exception -> L25
            if (r4 == 0) goto L1b
            r4 = r6[r3]     // Catch: java.lang.Exception -> L25
            long r4 = b(r4)     // Catch: java.lang.Exception -> L25
            goto L21
        L1b:
            r4 = r6[r3]     // Catch: java.lang.Exception -> L25
            long r4 = r4.length()     // Catch: java.lang.Exception -> L25
        L21:
            long r0 = r0 + r4
            int r3 = r3 + 1
            goto La
        L25:
            return r0
    }

    public static java.lang.String b(android.content.Context r4) throws java.lang.Exception {
            java.io.File r0 = r4.getCacheDir()
            long r0 = b(r0)
            java.lang.String r2 = android.os.Environment.getExternalStorageState()
            java.lang.String r3 = "mounted"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L1d
            java.io.File r4 = r4.getExternalCacheDir()
            long r2 = b(r4)
            long r0 = r0 + r2
        L1d:
            double r0 = (double) r0
            java.lang.String r4 = a(r0)
            return r4
    }
}
