package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class s {
    public s() {
            r1 = this;
            r1.<init>()
            return
    }

    static com.bytedance.adsdk.lottie.j.xt.g j(android.util.JsonReader r7, com.bytedance.adsdk.lottie.m r8) throws java.io.IOException {
            android.util.JsonToken r0 = r7.peek()
            android.util.JsonToken r1 = android.util.JsonToken.BEGIN_OBJECT
            if (r0 != r1) goto Lb
            r0 = 1
            r5 = 1
            goto Ld
        Lb:
            r0 = 0
            r5 = 0
        Ld:
            float r3 = com.bytedance.adsdk.lottie.up.g.j()
            com.bytedance.adsdk.lottie.r.a r4 = com.bytedance.adsdk.lottie.r.a.j
            r6 = 0
            r1 = r7
            r2 = r8
            com.bytedance.adsdk.lottie.m.j r7 = com.bytedance.adsdk.lottie.r.kt.j(r1, r2, r3, r4, r5, r6)
            com.bytedance.adsdk.lottie.j.xt.g r8 = new com.bytedance.adsdk.lottie.j.xt.g
            r8.<init>(r2, r7)
            return r8
    }
}
