package com.bytedance.adsdk.lottie.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt extends com.bytedance.adsdk.lottie.j.xt.ae<java.lang.Integer> {
    public xt(java.util.List<com.bytedance.adsdk.lottie.m.j<java.lang.Integer>> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public int cw(com.bytedance.adsdk.lottie.m.j<java.lang.Integer> r10, float r11) {
            r9 = this;
            T r0 = r10.j
            if (r0 == 0) goto L4b
            T r0 = r10.xt
            if (r0 == 0) goto L4b
            com.bytedance.adsdk.lottie.m.cw<A> r1 = r9.cw
            if (r1 == 0) goto L2e
            float r2 = r10.f1820m
            java.lang.Float r0 = r10.ae
            float r3 = r0.floatValue()
            T r4 = r10.j
            T r5 = r10.xt
            float r7 = r9.r()
            float r8 = r9.tl()
            r6 = r11
            java.lang.Object r11 = r1.j(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 == 0) goto L2f
            int r10 = r11.intValue()
            return r10
        L2e:
            r6 = r11
        L2f:
            r11 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r11 = com.bytedance.adsdk.lottie.up.tl.xt(r6, r11, r0)
            T r0 = r10.j
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            T r10 = r10.xt
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            int r10 = com.bytedance.adsdk.lottie.up.cw.j(r11, r0, r10)
            return r10
        L4b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Missing values for keyframe."
            r10.<init>(r11)
            throw r10
    }

    public int g() {
            r2 = this;
            com.bytedance.adsdk.lottie.m.j r0 = r2.cw()
            float r1 = r2.up()
            int r0 = r2.cw(r0, r1)
            return r0
    }

    @Override // com.bytedance.adsdk.lottie.j.xt.j
    /* synthetic */ java.lang.Object j(com.bytedance.adsdk.lottie.m.j r1, float r2) {
            r0 = this;
            java.lang.Integer r1 = r0.xt(r1, r2)
            return r1
    }

    java.lang.Integer xt(com.bytedance.adsdk.lottie.m.j<java.lang.Integer> r1, float r2) {
            r0 = this;
            int r1 = r0.cw(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }
}
