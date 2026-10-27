package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a1 {
    private static final java.lang.String c = "a1";
    private java.lang.String a;
    private java.lang.String b;

    static {
            return
    }

    public a1(android.content.Context r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "UNKNOWN"
            r1.a = r0
            r1.b = r0
            r1.a(r2, r3)
            java.lang.String r2 = r1.b
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toUpperCase(r3)
            r1.b = r2
            return
    }

    private void a(android.content.Context r2, boolean r3) {
            r1 = this;
            java.lang.String r3 = "get CountryCode error"
            if (r2 == 0) goto L27
            com.huawei.hms.framework.network.grs.GrsApp r0 = com.huawei.hms.framework.network.grs.GrsApp.getInstance()     // Catch: java.lang.Exception -> L1c java.lang.NullPointerException -> L22
            java.lang.String r2 = r0.getIssueCountryCode(r2)     // Catch: java.lang.Exception -> L1c java.lang.NullPointerException -> L22
            r1.b = r2     // Catch: java.lang.Exception -> L1c java.lang.NullPointerException -> L22
            boolean r2 = r1.b()     // Catch: java.lang.Exception -> L1c java.lang.NullPointerException -> L22
            if (r2 == 0) goto L27
            java.lang.String r2 = com.huawei.hms.scankit.p.a1.c     // Catch: java.lang.Exception -> L1c java.lang.NullPointerException -> L22
            java.lang.String r0 = "getCountryCode unknown"
            com.huawei.hms.framework.common.Logger.i(r2, r0)     // Catch: java.lang.Exception -> L1c java.lang.NullPointerException -> L22
            return
        L1c:
            java.lang.String r2 = com.huawei.hms.scankit.p.a1.c
            com.huawei.hms.framework.common.Logger.w(r2, r3)
            goto L27
        L22:
            java.lang.String r2 = com.huawei.hms.scankit.p.a1.c
            com.huawei.hms.framework.common.Logger.w(r2, r3)
        L27:
            return
    }

    private boolean b() {
            r2 = this;
            java.lang.String r0 = r2.b
            java.lang.String r1 = "UNKNOWN"
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            return r0
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }
}
