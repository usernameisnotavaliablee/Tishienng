package com.amap.api.services.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SearchUtils {
    public SearchUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getPkgName(android.content.Context r2) {
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> Ld
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> Ld
            return r2
        Ld:
            r2 = move-exception
            java.lang.String r0 = "SearchUtils"
            java.lang.String r1 = "getPkgName"
            com.amap.api.col.s.j4.i(r2, r0, r1)
            r2 = 0
            return r2
    }

    public static java.lang.String getSHA1(android.content.Context r5) {
            android.content.Context r0 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L5b
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L5b
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Throwable -> L5b
            r1 = 64
            android.content.pm.PackageInfo r5 = r0.getPackageInfo(r5, r1)     // Catch: java.lang.Throwable -> L5b
            android.content.pm.Signature[] r5 = r5.signatures     // Catch: java.lang.Throwable -> L5b
            r0 = 0
            r5 = r5[r0]     // Catch: java.lang.Throwable -> L5b
            byte[] r5 = r5.toByteArray()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = "SHA1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L5b
            byte[] r5 = r1.digest(r5)     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L5b
            r1.<init>()     // Catch: java.lang.Throwable -> L5b
        L2e:
            int r2 = r5.length     // Catch: java.lang.Throwable -> L5b
            if (r0 >= r2) goto L56
            r2 = r5[r0]     // Catch: java.lang.Throwable -> L5b
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)     // Catch: java.lang.Throwable -> L5b
            java.util.Locale r3 = java.util.Locale.US     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = r2.toUpperCase(r3)     // Catch: java.lang.Throwable -> L5b
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L5b
            r4 = 1
            if (r3 != r4) goto L4b
            java.lang.String r3 = "0"
            r1.append(r3)     // Catch: java.lang.Throwable -> L5b
        L4b:
            r1.append(r2)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = ":"
            r1.append(r2)     // Catch: java.lang.Throwable -> L5b
            int r0 = r0 + 1
            goto L2e
        L56:
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L5b
            return r5
        L5b:
            r5 = move-exception
            java.lang.String r0 = "SearchUtils"
            java.lang.String r1 = "getSHA1"
            com.amap.api.col.s.j4.i(r5, r0, r1)
            r5 = 0
            return r5
    }

    public static java.lang.String getVersion() {
            java.lang.String r0 = "9.7.0"
            return r0
    }
}
