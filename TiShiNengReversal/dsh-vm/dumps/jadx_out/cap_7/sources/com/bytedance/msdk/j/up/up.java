package com.bytedance.msdk.j.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class up {
    public up() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String j() {
            java.lang.String r0 = "TTMediationSDK_"
            return r0
    }

    public static java.lang.String j(com.bytedance.msdk.core.oq.xt r2) {
            if (r2 == 0) goto L25
            java.lang.String r0 = r2.rn()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Ld
            goto L25
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TTMediationSDK_"
            r0.<init>(r1)
            java.lang.String r2 = r2.rn()
            r0.append(r2)
            java.lang.String r2 = "_"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L25:
            java.lang.String r2 = j()
            return r2
    }

    public static java.lang.String j(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Lb
            java.lang.String r2 = j()
            return r2
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TTMediationSDK_"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = "_"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String j(java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Lb
            java.lang.String r2 = j()
            return r2
        Lb:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L16
            java.lang.String r2 = j(r2)
            return r2
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TTMediationSDK_"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = "_"
            r0.append(r2)
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String xt(java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Lb
            java.lang.String r2 = j()
            return r2
        Lb:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L16
            java.lang.String r2 = j(r2)
            return r2
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TTMediationSDK_"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = "_"
            r0.append(r2)
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
