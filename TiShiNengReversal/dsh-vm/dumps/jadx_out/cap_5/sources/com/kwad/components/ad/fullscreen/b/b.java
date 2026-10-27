package com.kwad.components.ad.fullscreen.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.ksad.json.annotation.KsJson
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b extends com.kwad.sdk.core.response.a.a {
    private static java.text.SimpleDateFormat jB;
    public long jC;
    public int jD;

    static {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd"
            r0.<init>(r1)
            com.kwad.components.ad.fullscreen.b.b.jB = r0
            return
    }

    public b() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.jC = r0
            r0 = -1
            r2.jD = r0
            return
    }

    public b(long r1, int r3) {
            r0 = this;
            r0.<init>()
            r0.jC = r1
            r1 = 1
            r0.jD = r1
            return
    }

    public final boolean F(int r2) {
            r1 = this;
            int r0 = r1.jD
            if (r0 <= 0) goto L8
            if (r0 < r2) goto L8
            r2 = 1
            return r2
        L8:
            r2 = 0
            return r2
    }

    public final boolean j(long r7) {
            r6 = this;
            long r0 = r6.jC
            r2 = 0
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L2f
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 > 0) goto Le
            goto L2f
        Le:
            java.text.SimpleDateFormat r0 = com.kwad.components.ad.fullscreen.b.b.jB     // Catch: java.lang.Exception -> L2b
            java.util.Date r1 = new java.util.Date     // Catch: java.lang.Exception -> L2b
            long r3 = r6.jC     // Catch: java.lang.Exception -> L2b
            r1.<init>(r3)     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = r0.format(r1)     // Catch: java.lang.Exception -> L2b
            java.text.SimpleDateFormat r1 = com.kwad.components.ad.fullscreen.b.b.jB     // Catch: java.lang.Exception -> L2b
            java.util.Date r3 = new java.util.Date     // Catch: java.lang.Exception -> L2b
            r3.<init>(r7)     // Catch: java.lang.Exception -> L2b
            java.lang.String r7 = r1.format(r3)     // Catch: java.lang.Exception -> L2b
            boolean r7 = r0.equals(r7)     // Catch: java.lang.Exception -> L2b
            return r7
        L2b:
            r7 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r7)
        L2f:
            return r2
    }
}
