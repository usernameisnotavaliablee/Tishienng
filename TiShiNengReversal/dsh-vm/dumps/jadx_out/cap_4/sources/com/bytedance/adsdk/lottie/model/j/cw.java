package com.bytedance.adsdk.lottie.model.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw extends com.bytedance.adsdk.lottie.model.j.ws<com.bytedance.adsdk.lottie.model.xt.r, com.bytedance.adsdk.lottie.model.xt.r> {
    public cw(java.util.List<com.bytedance.adsdk.lottie.m.j<com.bytedance.adsdk.lottie.model.xt.r>> r1) {
            r0 = this;
            java.util.List r1 = j(r1)
            r0.<init>(r1)
            return
    }

    private static com.bytedance.adsdk.lottie.m.j<com.bytedance.adsdk.lottie.model.xt.r> j(com.bytedance.adsdk.lottie.m.j<com.bytedance.adsdk.lottie.model.xt.r> r4) {
            T r0 = r4.j
            com.bytedance.adsdk.lottie.model.xt.r r0 = (com.bytedance.adsdk.lottie.model.xt.r) r0
            T r1 = r4.xt
            com.bytedance.adsdk.lottie.model.xt.r r1 = (com.bytedance.adsdk.lottie.model.xt.r) r1
            if (r0 == 0) goto L31
            if (r1 == 0) goto L31
            float[] r2 = r0.j()
            int r2 = r2.length
            float[] r3 = r1.j()
            int r3 = r3.length
            if (r2 != r3) goto L19
            goto L31
        L19:
            float[] r2 = r0.j()
            float[] r3 = r1.j()
            float[] r2 = j(r2, r3)
            com.bytedance.adsdk.lottie.model.xt.r r0 = r0.j(r2)
            com.bytedance.adsdk.lottie.model.xt.r r1 = r1.j(r2)
            com.bytedance.adsdk.lottie.m.j r4 = r4.j(r0, r1)
        L31:
            return r4
    }

    private static java.util.List<com.bytedance.adsdk.lottie.m.j<com.bytedance.adsdk.lottie.model.xt.r>> j(java.util.List<com.bytedance.adsdk.lottie.m.j<com.bytedance.adsdk.lottie.model.xt.r>> r2) {
            r0 = 0
        L1:
            int r1 = r2.size()
            if (r0 >= r1) goto L17
            java.lang.Object r1 = r2.get(r0)
            com.bytedance.adsdk.lottie.m.j r1 = (com.bytedance.adsdk.lottie.m.j) r1
            com.bytedance.adsdk.lottie.m.j r1 = j(r1)
            r2.set(r0, r1)
            int r0 = r0 + 1
            goto L1
        L17:
            return r2
    }

    static float[] j(float[] r6, float[] r7) {
            int r0 = r6.length
            int r1 = r7.length
            int r0 = r0 + r1
            float[] r1 = new float[r0]
            int r2 = r6.length
            r3 = 0
            java.lang.System.arraycopy(r6, r3, r1, r3, r2)
            int r6 = r6.length
            int r2 = r7.length
            java.lang.System.arraycopy(r7, r3, r1, r6, r2)
            java.util.Arrays.sort(r1)
            r6 = 2143289344(0x7fc00000, float:NaN)
            r7 = 0
            r2 = 0
        L16:
            if (r7 >= r0) goto L27
            r4 = r1[r7]
            int r5 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r5 == 0) goto L24
            r1[r2] = r4
            int r2 = r2 + 1
            r6 = r1[r7]
        L24:
            int r7 = r7 + 1
            goto L16
        L27:
            float[] r6 = java.util.Arrays.copyOfRange(r1, r3, r2)
            return r6
    }

    @Override // com.bytedance.adsdk.lottie.model.j.ws, com.bytedance.adsdk.lottie.model.j.jy
    public /* bridge */ /* synthetic */ java.util.List cw() {
            r1 = this;
            java.util.List r0 = super.cw()
            return r0
    }

    @Override // com.bytedance.adsdk.lottie.model.j.jy
    public com.bytedance.adsdk.lottie.j.xt.j<com.bytedance.adsdk.lottie.model.xt.r, com.bytedance.adsdk.lottie.model.xt.r> j() {
            r2 = this;
            com.bytedance.adsdk.lottie.j.xt.up r0 = new com.bytedance.adsdk.lottie.j.xt.up
            java.util.List<com.bytedance.adsdk.lottie.m.j<V>> r1 = r2.j
            r0.<init>(r1)
            return r0
    }

    @Override // com.bytedance.adsdk.lottie.model.j.ws
    public /* bridge */ /* synthetic */ java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            return r0
    }

    @Override // com.bytedance.adsdk.lottie.model.j.ws, com.bytedance.adsdk.lottie.model.j.jy
    public /* bridge */ /* synthetic */ boolean xt() {
            r1 = this;
            boolean r0 = super.xt()
            return r0
    }
}
