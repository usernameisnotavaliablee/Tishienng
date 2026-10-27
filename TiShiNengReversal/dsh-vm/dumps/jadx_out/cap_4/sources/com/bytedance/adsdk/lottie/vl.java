package com.bytedance.adsdk.lottie;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class vl<V> {
    private final V j;
    private final java.lang.Throwable xt;

    public vl(V r1) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            r1 = 0
            r0.xt = r1
            return
    }

    public vl(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>()
            r0.xt = r1
            r1 = 0
            r0.j = r1
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.bytedance.adsdk.lottie.vl
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.bytedance.adsdk.lottie.vl r5 = (com.bytedance.adsdk.lottie.vl) r5
            java.lang.Object r1 = r4.j()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r4.j()
            java.lang.Object r3 = r5.j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L21
            return r0
        L21:
            java.lang.Throwable r0 = r4.xt()
            if (r0 == 0) goto L42
            java.lang.Throwable r5 = r5.xt()
            if (r5 == 0) goto L42
            java.lang.Throwable r5 = r4.xt()
            java.lang.String r5 = r5.toString()
            java.lang.Throwable r0 = r4.xt()
            java.lang.String r0 = r0.toString()
            boolean r5 = r5.equals(r0)
            return r5
        L42:
            return r2
    }

    public int hashCode() {
            r4 = this;
            java.lang.Object r0 = r4.j()
            java.lang.Throwable r1 = r4.xt()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            int r0 = java.util.Arrays.hashCode(r2)
            return r0
    }

    public V j() {
            r1 = this;
            V r0 = r1.j
            return r0
    }

    public java.lang.Throwable xt() {
            r1 = this;
            java.lang.Throwable r0 = r1.xt
            return r0
    }
}
