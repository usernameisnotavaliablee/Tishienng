package com.bytedance.msdk.xt;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt {
    public static final java.lang.String j = null;
    public static boolean xt;

    static {
            java.lang.String r0 = com.bytedance.msdk.tl.rn.r()
            com.bytedance.msdk.xt.xt.j = r0
            r0 = 1
            com.bytedance.msdk.xt.xt.xt = r0
            return
    }

    public xt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String cw() {
            java.lang.String r0 = xt()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3c
            java.lang.String r0 = xt()
            java.lang.String r1 = "\\."
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 4
            if (r1 < r2) goto L3c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            r2 = r0[r2]
            r1.append(r2)
            java.lang.String r2 = "."
            r1.append(r2)
            r3 = 1
            r3 = r0[r3]
            r1.append(r3)
            r1.append(r2)
            r2 = 2
            r0 = r0[r2]
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L3c:
            java.lang.String r0 = ""
            return r0
    }

    public static int j() {
            java.lang.String r0 = xt()
            java.lang.String r1 = "."
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)
            int r0 = java.lang.Integer.parseInt(r0)
            return r0
    }

    public static java.lang.String r() {
            java.lang.String r0 = com.bytedance.sdk.gromore.init.j.r()
            return r0
    }

    public static java.lang.String xt() {
            java.lang.String r0 = com.bytedance.sdk.gromore.init.j.cw()
            return r0
    }
}
