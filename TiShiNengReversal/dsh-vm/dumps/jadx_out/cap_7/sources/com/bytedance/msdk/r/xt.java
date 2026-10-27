package com.bytedance.msdk.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt {

    @android.annotation.SuppressLint({"StaticFieldLeak"})
    private static volatile com.bytedance.msdk.r.xt j;
    private final com.bytedance.sdk.component.g.j cw;
    private android.content.Context xt;

    private xt(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            if (r4 != 0) goto La
            android.content.Context r4 = com.bytedance.msdk.core.xt.getContext()
            goto L12
        La:
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
        L12:
            r3.xt = r4
            com.bytedance.sdk.component.g.j$j r4 = new com.bytedance.sdk.component.g.j$j
            r4.<init>()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1 = 10000(0x2710, double:4.9407E-320)
            com.bytedance.sdk.component.g.j$j r4 = r4.j(r1, r0)
            com.bytedance.sdk.component.g.j$j r4 = r4.xt(r1, r0)
            com.bytedance.sdk.component.g.j$j r4 = r4.cw(r1, r0)
            r0 = 1
            com.bytedance.sdk.component.g.j$j r4 = r4.j(r0)
            boolean r0 = com.bytedance.msdk.tl.r.cw.j()
            if (r0 == 0) goto L52
            java.util.Map<java.lang.String, java.lang.Object> r0 = com.bytedance.msdk.tl.r.cw.j
            if (r0 == 0) goto L52
            java.lang.String r1 = "case_id"
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L52
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L52
            com.bytedance.msdk.tl.r.cw$j r0 = new com.bytedance.msdk.tl.r.cw$j
            r0.<init>()
            r4.j(r0)
        L52:
            com.bytedance.sdk.component.g.j r4 = r4.j()
            r3.cw = r4
            com.bytedance.sdk.component.xt.j.vl r4 = r4.m()
            com.bytedance.sdk.component.xt.j.r r4 = r4.j()
            if (r4 == 0) goto L67
            r0 = 16
            r4.j(r0)
        L67:
            return
    }

    public static com.bytedance.msdk.r.xt j() {
            com.bytedance.msdk.r.xt r0 = com.bytedance.msdk.r.xt.j
            if (r0 != 0) goto L1d
            java.lang.Class<com.bytedance.msdk.r.xt> r0 = com.bytedance.msdk.r.xt.class
            monitor-enter(r0)
            com.bytedance.msdk.r.xt r1 = com.bytedance.msdk.r.xt.j     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            com.bytedance.msdk.r.xt r1 = new com.bytedance.msdk.r.xt     // Catch: java.lang.Throwable -> L17
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            com.bytedance.msdk.r.xt.j = r1     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r1 = move-exception
            goto L1b
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            goto L1d
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
        L1d:
            com.bytedance.msdk.r.xt r0 = com.bytedance.msdk.r.xt.j
            return r0
    }

    public com.bytedance.sdk.component.g.j xt() {
            r1 = this;
            com.bytedance.sdk.component.g.j r0 = r1.cw
            return r0
    }
}
