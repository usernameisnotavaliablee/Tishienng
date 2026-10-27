package com.bytedance.adsdk.lottie.model.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ws {
    private boolean cw;
    private final java.util.List<com.bytedance.adsdk.lottie.model.j> j;
    private android.graphics.PointF xt;

    public ws() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.j = r0
            return
    }

    public ws(android.graphics.PointF r1, boolean r2, java.util.List<com.bytedance.adsdk.lottie.model.j> r3) {
            r0 = this;
            r0.<init>()
            r0.xt = r1
            r0.cw = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            r0.j = r1
            return
    }

    public java.util.List<com.bytedance.adsdk.lottie.model.j> cw() {
            r1 = this;
            java.util.List<com.bytedance.adsdk.lottie.model.j> r0 = r1.j
            return r0
    }

    public android.graphics.PointF j() {
            r1 = this;
            android.graphics.PointF r0 = r1.xt
            return r0
    }

    public void j(float r2, float r3) {
            r1 = this;
            android.graphics.PointF r0 = r1.xt
            if (r0 != 0) goto Lb
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r1.xt = r0
        Lb:
            android.graphics.PointF r0 = r1.xt
            r0.set(r2, r3)
            return
    }

    public void j(com.bytedance.adsdk.lottie.model.xt.ws r11, com.bytedance.adsdk.lottie.model.xt.ws r12, @com.bytedance.component.sdk.annotation.FloatRange(from = 0.0d, to = 1.0d) float r13) {
            r10 = this;
            android.graphics.PointF r0 = r10.xt
            if (r0 != 0) goto Lb
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r10.xt = r0
        Lb:
            boolean r0 = r11.xt()
            r1 = 1
            if (r0 != 0) goto L1b
            boolean r0 = r12.xt()
            if (r0 == 0) goto L19
            goto L1b
        L19:
            r0 = 0
            goto L1c
        L1b:
            r0 = 1
        L1c:
            r10.cw = r0
            java.util.List r0 = r11.cw()
            int r0 = r0.size()
            java.util.List r2 = r12.cw()
            int r2 = r2.size()
            if (r0 == r2) goto L59
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Curves must have the same number of control points. Shape 1: "
            r0.<init>(r2)
            java.util.List r2 = r11.cw()
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r2 = "\tShape 2: "
            r0.append(r2)
            java.util.List r2 = r12.cw()
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.bytedance.adsdk.lottie.up.up.xt(r0)
        L59:
            java.util.List r0 = r11.cw()
            int r0 = r0.size()
            java.util.List r2 = r12.cw()
            int r2 = r2.size()
            int r0 = java.lang.Math.min(r0, r2)
            java.util.List<com.bytedance.adsdk.lottie.model.j> r2 = r10.j
            int r2 = r2.size()
            if (r2 >= r0) goto L8a
            java.util.List<com.bytedance.adsdk.lottie.model.j> r2 = r10.j
            int r2 = r2.size()
        L7b:
            if (r2 >= r0) goto La8
            java.util.List<com.bytedance.adsdk.lottie.model.j> r3 = r10.j
            com.bytedance.adsdk.lottie.model.j r4 = new com.bytedance.adsdk.lottie.model.j
            r4.<init>()
            r3.add(r4)
            int r2 = r2 + 1
            goto L7b
        L8a:
            java.util.List<com.bytedance.adsdk.lottie.model.j> r2 = r10.j
            int r2 = r2.size()
            if (r2 <= r0) goto La8
            java.util.List<com.bytedance.adsdk.lottie.model.j> r2 = r10.j
            int r2 = r2.size()
            int r2 = r2 - r1
        L99:
            if (r2 < r0) goto La8
            java.util.List<com.bytedance.adsdk.lottie.model.j> r3 = r10.j
            int r4 = r3.size()
            int r4 = r4 - r1
            r3.remove(r4)
            int r2 = r2 + (-1)
            goto L99
        La8:
            android.graphics.PointF r0 = r11.j()
            android.graphics.PointF r2 = r12.j()
            float r3 = r0.x
            float r4 = r2.x
            float r3 = com.bytedance.adsdk.lottie.up.tl.j(r3, r4, r13)
            float r0 = r0.y
            float r2 = r2.y
            float r0 = com.bytedance.adsdk.lottie.up.tl.j(r0, r2, r13)
            r10.j(r3, r0)
            java.util.List<com.bytedance.adsdk.lottie.model.j> r0 = r10.j
            int r0 = r0.size()
            int r0 = r0 - r1
        Lca:
            if (r0 < 0) goto L14d
            java.util.List r1 = r11.cw()
            java.lang.Object r1 = r1.get(r0)
            com.bytedance.adsdk.lottie.model.j r1 = (com.bytedance.adsdk.lottie.model.j) r1
            java.util.List r2 = r12.cw()
            java.lang.Object r2 = r2.get(r0)
            com.bytedance.adsdk.lottie.model.j r2 = (com.bytedance.adsdk.lottie.model.j) r2
            android.graphics.PointF r3 = r1.j()
            android.graphics.PointF r4 = r1.xt()
            android.graphics.PointF r1 = r1.cw()
            android.graphics.PointF r5 = r2.j()
            android.graphics.PointF r6 = r2.xt()
            android.graphics.PointF r2 = r2.cw()
            java.util.List<com.bytedance.adsdk.lottie.model.j> r7 = r10.j
            java.lang.Object r7 = r7.get(r0)
            com.bytedance.adsdk.lottie.model.j r7 = (com.bytedance.adsdk.lottie.model.j) r7
            float r8 = r3.x
            float r9 = r5.x
            float r8 = com.bytedance.adsdk.lottie.up.tl.j(r8, r9, r13)
            float r3 = r3.y
            float r5 = r5.y
            float r3 = com.bytedance.adsdk.lottie.up.tl.j(r3, r5, r13)
            r7.j(r8, r3)
            java.util.List<com.bytedance.adsdk.lottie.model.j> r3 = r10.j
            java.lang.Object r3 = r3.get(r0)
            com.bytedance.adsdk.lottie.model.j r3 = (com.bytedance.adsdk.lottie.model.j) r3
            float r5 = r4.x
            float r7 = r6.x
            float r5 = com.bytedance.adsdk.lottie.up.tl.j(r5, r7, r13)
            float r4 = r4.y
            float r6 = r6.y
            float r4 = com.bytedance.adsdk.lottie.up.tl.j(r4, r6, r13)
            r3.xt(r5, r4)
            java.util.List<com.bytedance.adsdk.lottie.model.j> r3 = r10.j
            java.lang.Object r3 = r3.get(r0)
            com.bytedance.adsdk.lottie.model.j r3 = (com.bytedance.adsdk.lottie.model.j) r3
            float r4 = r1.x
            float r5 = r2.x
            float r4 = com.bytedance.adsdk.lottie.up.tl.j(r4, r5, r13)
            float r1 = r1.y
            float r2 = r2.y
            float r1 = com.bytedance.adsdk.lottie.up.tl.j(r1, r2, r13)
            r3.cw(r4, r1)
            int r0 = r0 + (-1)
            goto Lca
        L14d:
            return
    }

    public void j(boolean r1) {
            r0 = this;
            r0.cw = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ShapeData{numCurves="
            r0.<init>(r1)
            java.util.List<com.bytedance.adsdk.lottie.model.j> r1 = r2.j
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = "closed="
            r0.append(r1)
            boolean r1 = r2.cw
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public boolean xt() {
            r1 = this;
            boolean r0 = r1.cw
            return r0
    }
}
