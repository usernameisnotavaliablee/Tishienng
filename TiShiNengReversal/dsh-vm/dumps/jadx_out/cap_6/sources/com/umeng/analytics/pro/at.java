package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class at {
    public at() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(byte[] r3, java.io.OutputStream r4) {
            r0 = 0
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L10
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L10
            r1.write(r3)     // Catch: java.lang.Throwable -> Ld
            com.umeng.analytics.pro.ap.a(r1)
            return
        Ld:
            r3 = move-exception
            r0 = r1
            goto L11
        L10:
            r3 = move-exception
        L11:
            java.lang.String r4 = "MobclickRT"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r1.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = "gzip error: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L2f
            r1.append(r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L2f
            com.umeng.commonsdk.debug.UMRTLog.e(r4, r3)     // Catch: java.lang.Throwable -> L2f
            com.umeng.analytics.pro.ap.a(r0)
            return
        L2f:
            r3 = move-exception
            com.umeng.analytics.pro.ap.a(r0)
            throw r3
    }

    public static byte[] a(byte[] r3, byte[] r4) {
            if (r3 == 0) goto L20
            int r0 = r3.length
            if (r0 == 0) goto L20
            if (r4 == 0) goto L20
            int r0 = r4.length
            if (r0 != 0) goto Lb
            goto L20
        Lb:
            r0 = 0
        Lc:
            int r1 = r3.length
            if (r0 >= r1) goto L20
            r1 = r3[r0]
            int r2 = r4.length
            int r2 = r0 % r2
            r2 = r4[r2]
            r1 = r1 ^ r2
            r2 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 ^ r2
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r0 + 1
            goto Lc
        L20:
            return r3
    }

    public static void b(byte[] r3, java.io.OutputStream r4) {
            r0 = 0
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L22
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L22
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L22
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L22
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L1b
        Lf:
            int r0 = r1.read(r3)     // Catch: java.lang.Throwable -> L1b
            r2 = -1
            if (r0 == r2) goto L1e
            r2 = 0
            r4.write(r3, r2, r0)     // Catch: java.lang.Throwable -> L1b
            goto Lf
        L1b:
            r3 = move-exception
            r0 = r1
            goto L23
        L1e:
            com.umeng.analytics.pro.ap.a(r1)
            return
        L22:
            r3 = move-exception
        L23:
            java.lang.String r4 = "MobclickRT"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r1.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = "unGzip error: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L41
            r1.append(r3)     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L41
            com.umeng.commonsdk.debug.UMRTLog.e(r4, r3)     // Catch: java.lang.Throwable -> L41
            com.umeng.analytics.pro.ap.a(r0)
            return
        L41:
            r3 = move-exception
            com.umeng.analytics.pro.ap.a(r0)
            throw r3
    }
}
