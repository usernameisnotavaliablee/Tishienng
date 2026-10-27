package com.kwad.components.core.proxy.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    private java.lang.String WH;
    private long WI;
    private long WJ;
    private long WK;
    private boolean WL;

    @androidx.annotation.Nullable
    private com.kwad.components.core.proxy.a.c WM;


    public a(@androidx.annotation.Nullable com.kwad.components.core.proxy.a.c r1) {
            r0 = this;
            r0.<init>()
            r0.WM = r1
            return
    }

    static /* synthetic */ long a(com.kwad.components.core.proxy.a.a r0, long r1) {
            r0.WK = r1
            return r1
    }

    public final void L(long r1) {
            r0 = this;
            r0.WI = r1
            long r1 = android.os.SystemClock.uptimeMillis()
            r0.WJ = r1
            return
    }

    public final void a(com.kwad.components.core.proxy.PageCreateStage r2) {
            r1 = this;
            com.kwad.components.core.proxy.a.c r0 = r1.WM
            if (r0 == 0) goto L7
            r0.onCreateStageChange(r2)
        L7:
            return
    }

    public final void aC(java.lang.String r1) {
            r0 = this;
            r0.WH = r1
            return
    }

    public final void report() {
            r9 = this;
            com.kwad.components.core.proxy.a.b r0 = new com.kwad.components.core.proxy.a.b
            r0.<init>()
            java.lang.String r1 = r9.WH
            r0.WH = r1
            long r1 = r9.WI
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L15
            long r5 = r9.WJ
            long r5 = r5 - r1
            goto L16
        L15:
            r5 = r3
        L16:
            r0.WP = r5
            long r5 = r9.WJ
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L22
            long r7 = r9.WK
            long r7 = r7 - r5
            goto L23
        L22:
            r7 = r3
        L23:
            r0.WQ = r7
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L2c
            long r3 = r9.WK
            long r3 = r3 - r1
        L2c:
            r0.WO = r3
            com.kwad.components.core.p.a r1 = com.kwad.components.core.p.a.se()
            r1.a(r0)
            java.lang.String r1 = "PageMonitor"
            java.lang.String r0 = r0.toString()
            com.kwad.sdk.core.d.c.d(r1, r0)
            return
    }

    public final void sd() {
            r1 = this;
            boolean r0 = r1.WL
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.WL = r0
            com.kwad.components.core.proxy.a.a$1 r0 = new com.kwad.components.core.proxy.a.a$1
            r0.<init>(r1)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            return
    }
}
