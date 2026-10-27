package com.bytedance.adsdk.lottie;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class w {
    private final java.util.Map<java.lang.String, com.bytedance.adsdk.lottie.up.ae> cw;
    private boolean j;

    /* renamed from: r, reason: collision with root package name */
    private final java.util.Comparator<android.util.Pair<java.lang.String, java.lang.Float>> f1902r;
    private final java.util.Set<java.lang.Object> xt;


    public w() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.j = r0
            com.bytedance.adsdk.lottie.j r0 = new com.bytedance.adsdk.lottie.j
            r0.<init>()
            r1.xt = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.cw = r0
            com.bytedance.adsdk.lottie.w$1 r0 = new com.bytedance.adsdk.lottie.w$1
            r0.<init>(r1)
            r1.f1902r = r0
            return
    }

    public void j(java.lang.String r3, float r4) {
            r2 = this;
            boolean r0 = r2.j
            if (r0 != 0) goto L5
            goto L34
        L5:
            java.util.Map<java.lang.String, com.bytedance.adsdk.lottie.up.ae> r0 = r2.cw
            java.lang.Object r0 = r0.get(r3)
            com.bytedance.adsdk.lottie.up.ae r0 = (com.bytedance.adsdk.lottie.up.ae) r0
            if (r0 != 0) goto L19
            com.bytedance.adsdk.lottie.up.ae r0 = new com.bytedance.adsdk.lottie.up.ae
            r0.<init>()
            java.util.Map<java.lang.String, com.bytedance.adsdk.lottie.up.ae> r1 = r2.cw
            r1.put(r3, r0)
        L19:
            r0.j(r4)
            java.lang.String r4 = "__container"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L34
            java.util.Set<java.lang.Object> r3 = r2.xt
            java.util.Iterator r3 = r3.iterator()
        L2a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L34
            r3.next()
            goto L2a
        L34:
            return
    }

    void j(boolean r1) {
            r0 = this;
            r0.j = r1
            return
    }
}
