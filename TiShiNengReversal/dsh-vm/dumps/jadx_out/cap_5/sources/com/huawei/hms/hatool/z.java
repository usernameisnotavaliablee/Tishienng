package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class z {
    public z() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = com.huawei.hms.hatool.r1.a(r3, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lf
            java.lang.String r2 = com.huawei.hms.hatool.r1.a(r3, r4)
            return r2
        Lf:
            java.lang.String r0 = "hmsSdk"
            java.lang.String r1 = "getAndroidId(): to getConfigByType()"
            com.huawei.hms.hatool.j1.h(r0, r1)
            java.lang.String r2 = c(r2, r3, r4)
            return r2
    }

    public static java.lang.String b(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = "oper"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Ld
            java.lang.String r1 = d(r1, r2, r3)
            return r1
        Ld:
            java.lang.String r0 = "maint"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1a
            java.lang.String r1 = d(r1, r2, r3)
            return r1
        L1a:
            java.lang.String r0 = "diffprivacy"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L27
            java.lang.String r1 = d(r1, r2, r3)
            return r1
        L27:
            java.lang.String r0 = "preins"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L34
            java.lang.String r1 = d(r1, r2, r3)
            return r1
        L34:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getChannel(): Invalid type: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "hmsSdk"
            com.huawei.hms.hatool.j1.m(r2, r1)
            java.lang.String r1 = ""
            return r1
    }

    private static java.lang.String c(android.content.Context r0, java.lang.String r1, java.lang.String r2) {
            boolean r1 = com.huawei.hms.hatool.r1.b(r1, r2)
            if (r1 == 0) goto L24
            java.lang.String r1 = com.huawei.hms.hatool.y0.g()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L1f
            java.lang.String r0 = com.huawei.hms.hatool.s0.d(r0)
            com.huawei.hms.hatool.d1 r1 = com.huawei.hms.hatool.d1.e()
            com.huawei.hms.hatool.u r1 = r1.d()
            r1.e(r0)
        L1f:
            java.lang.String r0 = com.huawei.hms.hatool.y0.g()
            return r0
        L24:
            java.lang.String r0 = ""
            return r0
    }

    private static java.lang.String d(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = com.huawei.hms.hatool.c.e(r2, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lf
            java.lang.String r1 = com.huawei.hms.hatool.c.e(r2, r3)
            return r1
        Lf:
            com.huawei.hms.hatool.d1 r2 = com.huawei.hms.hatool.d1.e()
            com.huawei.hms.hatool.u r2 = r2.d()
            java.lang.String r3 = r2.p()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L34
            java.lang.String r1 = com.huawei.hms.hatool.s0.h(r1)
            java.lang.String r3 = "channel"
            r0 = 256(0x100, float:3.59E-43)
            boolean r3 = com.huawei.hms.hatool.n.c(r3, r1, r0)
            if (r3 != 0) goto L31
            java.lang.String r1 = ""
        L31:
            r2.m(r1)
        L34:
            java.lang.String r1 = r2.p()
            return r1
    }
}
