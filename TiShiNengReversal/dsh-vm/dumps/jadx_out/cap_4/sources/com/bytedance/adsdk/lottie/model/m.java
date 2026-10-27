package com.bytedance.adsdk.lottie.model;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class m {
    private final java.lang.String cw;
    public final float j;
    public final float xt;

    public m(java.lang.String r1, float r2, float r3) {
            r0 = this;
            r0.<init>()
            r0.cw = r1
            r0.xt = r3
            r0.j = r2
            return
    }

    public boolean j(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = r4.cw
            boolean r0 = r0.equalsIgnoreCase(r5)
            r1 = 1
            if (r0 == 0) goto La
            return r1
        La:
            java.lang.String r0 = r4.cw
            java.lang.String r2 = "\r"
            boolean r0 = r0.endsWith(r2)
            r2 = 0
            if (r0 == 0) goto L27
            java.lang.String r0 = r4.cw
            int r3 = r0.length()
            int r3 = r3 - r1
            java.lang.String r0 = r0.substring(r2, r3)
            boolean r5 = r0.equalsIgnoreCase(r5)
            if (r5 == 0) goto L27
            return r1
        L27:
            return r2
    }
}
