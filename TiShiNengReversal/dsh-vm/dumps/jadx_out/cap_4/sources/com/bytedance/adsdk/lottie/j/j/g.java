package com.bytedance.adsdk.lottie.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class g extends com.bytedance.adsdk.lottie.j.j.j {
    private final android.util.LongSparseArray<android.graphics.RadialGradient> ae;
    private final com.bytedance.adsdk.lottie.model.xt.ae g;
    private final com.bytedance.adsdk.lottie.j.xt.j<android.graphics.PointF, android.graphics.PointF> jy;

    /* renamed from: m, reason: collision with root package name */
    private final android.util.LongSparseArray<android.graphics.LinearGradient> f1774m;
    private final int oq;
    private final com.bytedance.adsdk.lottie.j.xt.j<com.bytedance.adsdk.lottie.model.xt.r, com.bytedance.adsdk.lottie.model.xt.r> qv;

    /* renamed from: r, reason: collision with root package name */
    private final java.lang.String f1775r;
    private final android.graphics.RectF tl;
    private final boolean up;
    private final com.bytedance.adsdk.lottie.j.xt.j<android.graphics.PointF, android.graphics.PointF> vl;
    private com.bytedance.adsdk.lottie.j.xt.i ws;

    public g(com.bytedance.adsdk.lottie.tl r12, com.bytedance.adsdk.lottie.model.layer.cw r13, com.bytedance.adsdk.lottie.model.xt.m r14) {
            r11 = this;
            com.bytedance.adsdk.lottie.model.xt.w$j r0 = r14.tl()
            android.graphics.Paint$Cap r4 = r0.j()
            com.bytedance.adsdk.lottie.model.xt.w$xt r0 = r14.g()
            android.graphics.Paint$Join r5 = r0.j()
            float r6 = r14.vl()
            com.bytedance.adsdk.lottie.model.j.r r7 = r14.r()
            com.bytedance.adsdk.lottie.model.j.xt r8 = r14.ae()
            java.util.List r9 = r14.oq()
            com.bytedance.adsdk.lottie.model.j.xt r10 = r14.qv()
            r1 = r11
            r2 = r12
            r3 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            android.util.LongSparseArray r12 = new android.util.LongSparseArray
            r12.<init>()
            r1.f1774m = r12
            android.util.LongSparseArray r12 = new android.util.LongSparseArray
            r12.<init>()
            r1.ae = r12
            android.graphics.RectF r12 = new android.graphics.RectF
            r12.<init>()
            r1.tl = r12
            java.lang.String r12 = r14.j()
            r1.f1775r = r12
            com.bytedance.adsdk.lottie.model.xt.ae r12 = r14.xt()
            r1.g = r12
            boolean r12 = r14.jy()
            r1.up = r12
            com.bytedance.adsdk.lottie.m r12 = r2.a()
            float r12 = r12.up()
            r13 = 1107296256(0x42000000, float:32.0)
            float r12 = r12 / r13
            int r12 = (int) r12
            r1.oq = r12
            com.bytedance.adsdk.lottie.model.j.cw r12 = r14.cw()
            com.bytedance.adsdk.lottie.j.xt.j r12 = r12.j()
            r1.qv = r12
            r12.j(r11)
            r3.j(r12)
            com.bytedance.adsdk.lottie.model.j.m r12 = r14.up()
            com.bytedance.adsdk.lottie.j.xt.j r12 = r12.j()
            r1.vl = r12
            r12.j(r11)
            r3.j(r12)
            com.bytedance.adsdk.lottie.model.j.m r12 = r14.m()
            com.bytedance.adsdk.lottie.j.xt.j r12 = r12.j()
            r1.jy = r12
            r12.j(r11)
            r3.j(r12)
            return
    }

    private android.graphics.RadialGradient cw() {
            r13 = this;
            int r0 = r13.r()
            android.util.LongSparseArray<android.graphics.RadialGradient> r1 = r13.ae
            long r2 = (long) r0
            java.lang.Object r0 = r1.get(r2)
            android.graphics.RadialGradient r0 = (android.graphics.RadialGradient) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            com.bytedance.adsdk.lottie.j.xt.j<android.graphics.PointF, android.graphics.PointF> r0 = r13.vl
            java.lang.Object r0 = r0.ae()
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            com.bytedance.adsdk.lottie.j.xt.j<android.graphics.PointF, android.graphics.PointF> r1 = r13.jy
            java.lang.Object r1 = r1.ae()
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            com.bytedance.adsdk.lottie.j.xt.j<com.bytedance.adsdk.lottie.model.xt.r, com.bytedance.adsdk.lottie.model.xt.r> r4 = r13.qv
            java.lang.Object r4 = r4.ae()
            com.bytedance.adsdk.lottie.model.xt.r r4 = (com.bytedance.adsdk.lottie.model.xt.r) r4
            int[] r5 = r4.xt()
            int[] r10 = r13.j(r5)
            float[] r11 = r4.j()
            float r7 = r0.x
            float r8 = r0.y
            float r0 = r1.x
            float r1 = r1.y
            float r0 = r0 - r7
            double r4 = (double) r0
            float r1 = r1 - r8
            double r0 = (double) r1
            double r0 = java.lang.Math.hypot(r4, r0)
            float r9 = (float) r0
            android.graphics.RadialGradient r6 = new android.graphics.RadialGradient
            android.graphics.Shader$TileMode r12 = android.graphics.Shader.TileMode.CLAMP
            r6.<init>(r7, r8, r9, r10, r11, r12)
            android.util.LongSparseArray<android.graphics.RadialGradient> r0 = r13.ae
            r0.put(r2, r6)
            return r6
    }

    private int[] j(int[] r5) {
            r4 = this;
            com.bytedance.adsdk.lottie.j.xt.i r0 = r4.ws
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r0.ae()
            java.lang.Integer[] r0 = (java.lang.Integer[]) r0
            int r1 = r5.length
            int r2 = r0.length
            r3 = 0
            if (r1 != r2) goto L1d
        Lf:
            int r1 = r5.length
            if (r3 >= r1) goto L2e
            r1 = r0[r3]
            int r1 = r1.intValue()
            r5[r3] = r1
            int r3 = r3 + 1
            goto Lf
        L1d:
            int r5 = r0.length
            int[] r5 = new int[r5]
        L20:
            int r1 = r0.length
            if (r3 >= r1) goto L2e
            r1 = r0[r3]
            int r1 = r1.intValue()
            r5[r3] = r1
            int r3 = r3 + 1
            goto L20
        L2e:
            return r5
    }

    private int r() {
            r4 = this;
            com.bytedance.adsdk.lottie.j.xt.j<android.graphics.PointF, android.graphics.PointF> r0 = r4.vl
            float r0 = r0.tl()
            int r1 = r4.oq
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            com.bytedance.adsdk.lottie.j.xt.j<android.graphics.PointF, android.graphics.PointF> r1 = r4.jy
            float r1 = r1.tl()
            int r2 = r4.oq
            float r2 = (float) r2
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            com.bytedance.adsdk.lottie.j.xt.j<com.bytedance.adsdk.lottie.model.xt.r, com.bytedance.adsdk.lottie.model.xt.r> r2 = r4.qv
            float r2 = r2.tl()
            int r3 = r4.oq
            float r3 = (float) r3
            float r2 = r2 * r3
            int r2 = java.lang.Math.round(r2)
            if (r0 == 0) goto L32
            int r0 = r0 * 527
            goto L34
        L32:
            r0 = 17
        L34:
            if (r1 == 0) goto L3a
            int r0 = r0 * 31
            int r0 = r0 * r1
        L3a:
            if (r2 == 0) goto L40
            int r0 = r0 * 31
            int r0 = r0 * r2
        L40:
            return r0
    }

    private android.graphics.LinearGradient xt() {
            r14 = this;
            int r0 = r14.r()
            android.util.LongSparseArray<android.graphics.LinearGradient> r1 = r14.f1774m
            long r2 = (long) r0
            java.lang.Object r0 = r1.get(r2)
            android.graphics.LinearGradient r0 = (android.graphics.LinearGradient) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            com.bytedance.adsdk.lottie.j.xt.j<android.graphics.PointF, android.graphics.PointF> r0 = r14.vl
            java.lang.Object r0 = r0.ae()
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            com.bytedance.adsdk.lottie.j.xt.j<android.graphics.PointF, android.graphics.PointF> r1 = r14.jy
            java.lang.Object r1 = r1.ae()
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            com.bytedance.adsdk.lottie.j.xt.j<com.bytedance.adsdk.lottie.model.xt.r, com.bytedance.adsdk.lottie.model.xt.r> r4 = r14.qv
            java.lang.Object r4 = r4.ae()
            com.bytedance.adsdk.lottie.model.xt.r r4 = (com.bytedance.adsdk.lottie.model.xt.r) r4
            int[] r5 = r4.xt()
            int[] r11 = r14.j(r5)
            float[] r12 = r4.j()
            float r7 = r0.x
            float r8 = r0.y
            float r9 = r1.x
            float r10 = r1.y
            android.graphics.LinearGradient r6 = new android.graphics.LinearGradient
            android.graphics.Shader$TileMode r13 = android.graphics.Shader.TileMode.CLAMP
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            android.util.LongSparseArray<android.graphics.LinearGradient> r0 = r14.f1774m
            r0.put(r2, r6)
            return r6
    }

    @Override // com.bytedance.adsdk.lottie.j.j.j, com.bytedance.adsdk.lottie.j.j.up
    public void j(android.graphics.Canvas r3, android.graphics.Matrix r4, int r5) {
            r2 = this;
            boolean r0 = r2.up
            if (r0 == 0) goto L5
            return
        L5:
            android.graphics.RectF r0 = r2.tl
            r1 = 0
            r2.j(r0, r4, r1)
            com.bytedance.adsdk.lottie.model.xt.ae r0 = r2.g
            com.bytedance.adsdk.lottie.model.xt.ae r1 = com.bytedance.adsdk.lottie.model.xt.ae.j
            if (r0 != r1) goto L16
            android.graphics.LinearGradient r0 = r2.xt()
            goto L1a
        L16:
            android.graphics.RadialGradient r0 = r2.cw()
        L1a:
            r0.setLocalMatrix(r4)
            android.graphics.Paint r1 = r2.xt
            r1.setShader(r0)
            super.j(r3, r4, r5)
            return
    }
}
