package com.umeng.socialize.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class l {
    public l() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(byte[] r2, java.io.OutputStream r3) {
            r0 = 0
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L10
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L10
            r1.write(r2)     // Catch: java.lang.Throwable -> Ld
            com.umeng.socialize.a.c.a(r1)
            return
        Ld:
            r2 = move-exception
            r0 = r1
            goto L11
        L10:
            r2 = move-exception
        L11:
            java.lang.String r3 = "zip"
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L1e
            com.umeng.commonsdk.debug.UMRTLog.e(r3, r2)     // Catch: java.lang.Throwable -> L1e
            com.umeng.socialize.a.c.a(r0)
            return
        L1e:
            r2 = move-exception
            com.umeng.socialize.a.c.a(r0)
            throw r2
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
            com.umeng.socialize.a.c.a(r1)
            return
        L22:
            r3 = move-exception
        L23:
            java.lang.String r4 = "unzip"
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L30
            com.umeng.commonsdk.debug.UMRTLog.e(r4, r3)     // Catch: java.lang.Throwable -> L30
            com.umeng.socialize.a.c.a(r0)
            return
        L30:
            r3 = move-exception
            com.umeng.socialize.a.c.a(r0)
            throw r3
    }
}
