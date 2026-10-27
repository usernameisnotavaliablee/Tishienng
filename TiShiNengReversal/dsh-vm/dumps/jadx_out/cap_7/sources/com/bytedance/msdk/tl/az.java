package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class az {
    private static boolean j = true;

    static {
            java.lang.String r0 = "tobEmbedEncrypt"
            com.bytedance.sdk.openadsdk.l.m.j(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L6
            return
        L6:
            r0 = 0
            com.bytedance.msdk.tl.az.j = r0
            return
    }

    public az() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean j() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "applogSOLoadSuccess = "
            r0.<init>(r1)
            boolean r1 = com.bytedance.msdk.tl.az.j
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TMe"
            com.bytedance.msdk.j.up.cw.xt(r1, r0)
            boolean r0 = com.bytedance.msdk.tl.az.j
            return r0
    }

    public static byte[] j(byte[] r1, int r2) {
            java.lang.Class<com.bytedance.sdk.component.r.xt> r0 = com.bytedance.sdk.component.r.xt.class
            java.lang.Object r0 = com.bytedance.sdk.openadsdk.ats.AutoService.j(r0)
            com.bytedance.sdk.component.r.xt r0 = (com.bytedance.sdk.component.r.xt) r0
            if (r0 == 0) goto Lf
            byte[] r1 = r0.j(r1, r2)
            return r1
        Lf:
            r1 = 0
            byte[] r1 = new byte[r1]
            return r1
    }
}
