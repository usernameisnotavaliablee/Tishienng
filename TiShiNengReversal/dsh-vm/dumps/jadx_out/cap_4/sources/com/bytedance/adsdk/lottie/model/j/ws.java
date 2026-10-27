package com.bytedance.adsdk.lottie.model.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
abstract class ws<V, O> implements com.bytedance.adsdk.lottie.model.j.jy<V, O> {
    final java.util.List<com.bytedance.adsdk.lottie.m.j<V>> j;

    ws(java.util.List<com.bytedance.adsdk.lottie.m.j<V>> r1) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            return
    }

    @Override // com.bytedance.adsdk.lottie.model.j.jy
    public java.util.List<com.bytedance.adsdk.lottie.m.j<V>> cw() {
            r1 = this;
            java.util.List<com.bytedance.adsdk.lottie.m.j<V>> r0 = r1.j
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.List<com.bytedance.adsdk.lottie.m.j<V>> r1 = r2.j
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L1f
            java.lang.String r1 = "values="
            r0.append(r1)
            java.util.List<com.bytedance.adsdk.lottie.m.j<V>> r1 = r2.j
            java.lang.Object[] r1 = r1.toArray()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
        L1f:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.bytedance.adsdk.lottie.model.j.jy
    public boolean xt() {
            r3 = this;
            java.util.List<com.bytedance.adsdk.lottie.m.j<V>> r0 = r3.j
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 != 0) goto L22
            java.util.List<com.bytedance.adsdk.lottie.m.j<V>> r0 = r3.j
            int r0 = r0.size()
            r2 = 0
            if (r0 != r1) goto L21
            java.util.List<com.bytedance.adsdk.lottie.m.j<V>> r0 = r3.j
            java.lang.Object r0 = r0.get(r2)
            com.bytedance.adsdk.lottie.m.j r0 = (com.bytedance.adsdk.lottie.m.j) r0
            boolean r0 = r0.up()
            if (r0 == 0) goto L21
            goto L22
        L21:
            return r2
        L22:
            return r1
    }
}
