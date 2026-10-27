package com.baidu.idl.face.platform.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class MD5Utils {
    public MD5Utils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String encryption(byte[] r5) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Throwable -> L32
            byte[] r5 = r0.digest(r5)     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            int r1 = r5.length     // Catch: java.lang.Throwable -> L32
            int r1 = r1 * 2
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L32
            int r1 = r5.length     // Catch: java.lang.Throwable -> L32
            r2 = 0
        L14:
            if (r2 >= r1) goto L2d
            r3 = r5[r2]     // Catch: java.lang.Throwable -> L32
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 16
            if (r3 >= r4) goto L23
            r4 = 48
            r0.append(r4)     // Catch: java.lang.Throwable -> L32
        L23:
            java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch: java.lang.Throwable -> L32
            r0.append(r3)     // Catch: java.lang.Throwable -> L32
            int r2 = r2 + 1
            goto L14
        L2d:
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L32
            return r5
        L32:
            java.lang.String r5 = ""
            return r5
    }
}
