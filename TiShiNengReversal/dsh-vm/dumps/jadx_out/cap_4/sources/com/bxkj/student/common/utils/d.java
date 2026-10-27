package com.bxkj.student.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class d {
    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(android.content.Context r2, java.lang.String... r3) {
            g(r2)
            e(r2)
            d(r2)
            h(r2)
            f(r2)
            if (r3 != 0) goto L12
            goto L1e
        L12:
            int r2 = r3.length
            r0 = 0
        L14:
            if (r0 >= r2) goto L1e
            r1 = r3[r0]
            b(r1)
            int r0 = r0 + 1
            goto L14
        L1e:
            return
    }

    public static void b(java.lang.String r1) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            i(r0)
            return
    }

    public static void c(android.content.Context r0, java.lang.String r1) {
            r0.deleteDatabase(r1)
            return
    }

    public static void d(android.content.Context r3) {
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "/data/data/"
            r1.append(r2)
            java.lang.String r3 = r3.getPackageName()
            r1.append(r3)
            java.lang.String r3 = "/databases"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            i(r0)
            return
    }

    public static void e(android.content.Context r2) {
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            java.lang.String r1 = "mounted"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L13
            java.io.File r2 = r2.getExternalCacheDir()
            i(r2)
        L13:
            return
    }

    public static void f(android.content.Context r0) {
            java.io.File r0 = r0.getFilesDir()
            i(r0)
            return
    }

    public static void g(android.content.Context r0) {
            java.io.File r0 = r0.getCacheDir()
            i(r0)
            return
    }

    public static void h(android.content.Context r3) {
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "/data/data/"
            r1.append(r2)
            java.lang.String r3 = r3.getPackageName()
            r1.append(r3)
            java.lang.String r3 = "/shared_prefs"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            i(r0)
            return
    }

    private static void i(java.io.File r3) {
            if (r3 == 0) goto L1e
            boolean r0 = r3.exists()
            if (r0 == 0) goto L1e
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto L1e
            java.io.File[] r3 = r3.listFiles()
            int r0 = r3.length
            r1 = 0
        L14:
            if (r1 >= r0) goto L1e
            r2 = r3[r1]
            r2.delete()
            int r1 = r1 + 1
            goto L14
        L1e:
            return
    }

    public static void j(java.lang.String r4, boolean r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L3c
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L3c
            r0.<init>(r4)     // Catch: java.lang.Exception -> L3c
            boolean r4 = r0.isDirectory()     // Catch: java.lang.Exception -> L3c
            if (r4 == 0) goto L26
            java.io.File[] r4 = r0.listFiles()     // Catch: java.lang.Exception -> L3c
            r1 = 0
        L16:
            int r2 = r4.length     // Catch: java.lang.Exception -> L3c
            if (r1 >= r2) goto L26
            r2 = r4[r1]     // Catch: java.lang.Exception -> L3c
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Exception -> L3c
            r3 = 1
            j(r2, r3)     // Catch: java.lang.Exception -> L3c
            int r1 = r1 + 1
            goto L16
        L26:
            if (r5 == 0) goto L3c
            boolean r4 = r0.isDirectory()     // Catch: java.lang.Exception -> L3c
            if (r4 != 0) goto L32
            r0.delete()     // Catch: java.lang.Exception -> L3c
            return
        L32:
            java.io.File[] r4 = r0.listFiles()     // Catch: java.lang.Exception -> L3c
            int r4 = r4.length     // Catch: java.lang.Exception -> L3c
            if (r4 != 0) goto L3c
            r0.delete()     // Catch: java.lang.Exception -> L3c
        L3c:
            return
    }

    public static java.lang.String k(android.content.Context r2) throws java.lang.Exception {
            java.io.File r2 = r2.getExternalCacheDir()
            long r0 = l(r2)
            double r0 = (double) r0
            java.lang.String r2 = m(r0)
            return r2
    }

    public static long l(java.io.File r5) throws java.lang.Exception {
            r0 = 0
            java.io.File[] r5 = r5.listFiles()     // Catch: java.lang.Exception -> L24
            r2 = 0
        L7:
            int r3 = r5.length     // Catch: java.lang.Exception -> L24
            if (r2 >= r3) goto L24
            r3 = r5[r2]     // Catch: java.lang.Exception -> L24
            boolean r3 = r3.isDirectory()     // Catch: java.lang.Exception -> L24
            if (r3 == 0) goto L1a
            r3 = r5[r2]     // Catch: java.lang.Exception -> L24
            long r3 = l(r3)     // Catch: java.lang.Exception -> L24
        L18:
            long r0 = r0 + r3
            goto L21
        L1a:
            r3 = r5[r2]     // Catch: java.lang.Exception -> L24
            long r3 = r3.length()     // Catch: java.lang.Exception -> L24
            goto L18
        L21:
            int r2 = r2 + 1
            goto L7
        L24:
            return r0
    }

    public static java.lang.String m(double r9) {
            r0 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r2 = r9 / r0
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.String r9 = "Byte"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            return r9
        L1c:
            double r9 = r2 / r0
            r6 = 4
            r7 = 2
            int r8 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r8 >= 0) goto L47
            java.math.BigDecimal r9 = new java.math.BigDecimal
            java.lang.String r10 = java.lang.Double.toString(r2)
            r9.<init>(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.math.BigDecimal r9 = r9.setScale(r7, r6)
            java.lang.String r9 = r9.toPlainString()
            r10.append(r9)
            java.lang.String r9 = "KB"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            return r9
        L47:
            double r2 = r9 / r0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 >= 0) goto L70
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r9 = java.lang.Double.toString(r9)
            r0.<init>(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.math.BigDecimal r10 = r0.setScale(r7, r6)
            java.lang.String r10 = r10.toPlainString()
            r9.append(r10)
            java.lang.String r10 = "MB"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            return r9
        L70:
            double r9 = r2 / r0
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 >= 0) goto L99
            java.math.BigDecimal r9 = new java.math.BigDecimal
            java.lang.String r10 = java.lang.Double.toString(r2)
            r9.<init>(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.math.BigDecimal r9 = r9.setScale(r7, r6)
            java.lang.String r9 = r9.toPlainString()
            r10.append(r9)
            java.lang.String r9 = "GB"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            return r9
        L99:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.math.BigDecimal r10 = r0.setScale(r7, r6)
            java.lang.String r10 = r10.toPlainString()
            r9.append(r10)
            java.lang.String r10 = "TB"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            return r9
    }
}
