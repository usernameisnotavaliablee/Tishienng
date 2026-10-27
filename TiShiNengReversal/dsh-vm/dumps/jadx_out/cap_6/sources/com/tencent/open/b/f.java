package com.tencent.open.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class f {
    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a() {
            android.content.Context r0 = com.tencent.open.utils.g.a()
            r1 = 0
            com.tencent.open.utils.i r0 = com.tencent.open.utils.i.a(r0, r1)
            java.lang.String r1 = "Common_HttpRetryCount"
            int r0 = r0.a(r1)
            if (r0 != 0) goto L12
            r0 = 2
        L12:
            return r0
    }

    public static int a(java.lang.String r2) {
            android.content.Context r0 = com.tencent.open.utils.g.a()
            r1 = 100
            if (r0 != 0) goto L9
            return r1
        L9:
            android.content.Context r0 = com.tencent.open.utils.g.a()
            com.tencent.open.utils.i r2 = com.tencent.open.utils.i.a(r0, r2)
            java.lang.String r0 = "Common_BusinessReportFrequency"
            int r2 = r2.a(r0)
            if (r2 != 0) goto L1a
            return r1
        L1a:
            return r2
    }
}
