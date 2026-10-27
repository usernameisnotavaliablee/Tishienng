package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class p9 {
    public p9() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(java.lang.Throwable r1) {
            boolean r0 = com.amap.api.col.p0003l.j9.a
            if (r0 == 0) goto L7
            b(r1)
        L7:
            return
    }

    private static java.lang.String b(java.lang.Throwable r2) {
            java.lang.String r0 = ""
            if (r2 != 0) goto L5
            return r0
        L5:
            if (r2 == 0) goto L11
            boolean r1 = r2 instanceof java.net.UnknownHostException
            if (r1 == 0) goto Lc
            return r0
        Lc:
            java.lang.Throwable r2 = r2.getCause()
            goto L5
        L11:
            java.io.StringWriter r2 = new java.io.StringWriter
            r2.<init>()
            java.io.PrintWriter r0 = new java.io.PrintWriter
            r0.<init>(r2)
            r0.flush()
            java.lang.String r2 = r2.toString()
            return r2
    }
}
