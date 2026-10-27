package com.bytedance.adsdk.lottie.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt {
    private final java.util.List<com.bytedance.adsdk.lottie.j.j.tj> j;

    public xt() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.j = r0
            return
    }

    public void j(android.graphics.Path r3) {
            r2 = this;
            java.util.List<com.bytedance.adsdk.lottie.j.j.tj> r0 = r2.j
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L18
            java.util.List<com.bytedance.adsdk.lottie.j.j.tj> r1 = r2.j
            java.lang.Object r1 = r1.get(r0)
            com.bytedance.adsdk.lottie.j.j.tj r1 = (com.bytedance.adsdk.lottie.j.j.tj) r1
            com.bytedance.adsdk.lottie.up.g.j(r3, r1)
            int r0 = r0 + (-1)
            goto L8
        L18:
            return
    }

    void j(com.bytedance.adsdk.lottie.j.j.tj r2) {
            r1 = this;
            java.util.List<com.bytedance.adsdk.lottie.j.j.tj> r0 = r1.j
            r0.add(r2)
            return
    }
}
