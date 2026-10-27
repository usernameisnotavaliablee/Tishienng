package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ag {
    public ag() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.json.JSONObject a(android.content.Context r5) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L4f
            r2 = 24
            java.lang.String r3 = "xreplace"
            if (r1 < r2) goto L17
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L4f
            java.io.File r5 = l1.a.a(r5)     // Catch: java.lang.Throwable -> L4f
            r1.<init>(r5, r3)     // Catch: java.lang.Throwable -> L4f
            goto L33
        L17:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = "/data/data/"
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Throwable -> L4f
            r2.append(r5)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = "/xreplace"
            r2.append(r5)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L4f
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L4f
        L33:
            boolean r5 = r1.exists()     // Catch: java.lang.Throwable -> L4f
            r1 = 1
            if (r5 == 0) goto L3d
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L4f
        L3d:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = "/storage/emulated/0/xxsq"
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L4f
            boolean r5 = r5.exists()     // Catch: java.lang.Throwable -> L4f
            if (r5 == 0) goto L4f
            java.lang.String r5 = "xxsq"
            r0.put(r5, r1)     // Catch: java.lang.Throwable -> L4f
        L4f:
            return r0
    }
}
