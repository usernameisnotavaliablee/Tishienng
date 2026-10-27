package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class bp {


    public bp() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(java.lang.String[] r4) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r4.length     // Catch: java.lang.Exception -> L18
            if (r0 >= r2) goto L18
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L18
            r3 = r4[r0]     // Catch: java.lang.Exception -> L18
            r2.<init>(r3)     // Catch: java.lang.Exception -> L18
            boolean r2 = r2.exists()     // Catch: java.lang.Exception -> L18
            if (r2 == 0) goto L15
            r2 = 1
            int r2 = r2 << r0
            r1 = r1 | r2
        L15:
            int r0 = r0 + 1
            goto L2
        L18:
            return r1
    }

    private static java.util.List<java.io.File> a(java.io.File r5, java.lang.String r6, int r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.kuaishou.weapon.p0.bp$1 r1 = new com.kuaishou.weapon.p0.bp$1     // Catch: java.lang.Throwable -> L2d
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L2d
            java.io.File[] r5 = r5.listFiles(r1)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L2d
            int r1 = r5.length     // Catch: java.lang.Throwable -> L2d
            r2 = 0
        L12:
            if (r2 >= r1) goto L2d
            r3 = r5[r2]     // Catch: java.lang.Throwable -> L2d
            boolean r4 = r3.isFile()     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L20
            r0.add(r3)     // Catch: java.lang.Throwable -> L2d
            return r0
        L20:
            int r4 = r7 + 1
            java.util.List r7 = a(r3, r6, r7)     // Catch: java.lang.Throwable -> L2d
            r0.addAll(r7)     // Catch: java.lang.Throwable -> L2d
            int r2 = r2 + 1
            r7 = r4
            goto L12
        L2d:
            return r0
    }

    public static void a(java.io.Closeable r0) {
            if (r0 != 0) goto L3
            return
        L3:
            r0.close()     // Catch: java.io.IOException -> L6
        L6:
            return
    }

    public static boolean a(android.content.Context r2, java.lang.String r3) {
            java.lang.String r2 = com.kuaishou.weapon.p0.jni.Engine.soPath     // Catch: java.lang.Throwable -> L29
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L29
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r1.<init>()     // Catch: java.lang.Throwable -> L29
            r1.append(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "/lib"
            r1.append(r2)     // Catch: java.lang.Throwable -> L29
            r1.append(r3)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = r1.toString()     // Catch: java.lang.Throwable -> L29
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L29
            boolean r2 = r0.exists()     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L29
            r2 = 1
            return r2
        L29:
            r2 = 0
            return r2
    }
}
