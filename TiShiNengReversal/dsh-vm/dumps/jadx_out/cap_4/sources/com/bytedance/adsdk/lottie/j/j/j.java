package com.bytedance.adsdk.lottie.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class j implements com.bytedance.adsdk.lottie.j.j.qv, com.bytedance.adsdk.lottie.j.j.up, com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j {
    private final android.graphics.RectF ae;
    private com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> av;
    private com.bytedance.adsdk.lottie.j.xt.j<android.graphics.ColorFilter, android.graphics.ColorFilter> az;
    float cw;
    private final java.util.List<com.bytedance.adsdk.lottie.j.j.j.C0183j> g;
    private com.bytedance.adsdk.lottie.j.xt.cw i;
    protected final com.bytedance.adsdk.lottie.model.layer.cw j;
    private final java.util.List<com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float>> jy;

    /* renamed from: m, reason: collision with root package name */
    private final android.graphics.Path f1777m;
    private final float[] oq;
    private final com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float> qv;

    /* renamed from: r, reason: collision with root package name */
    private final android.graphics.PathMeasure f1778r;
    private final com.bytedance.adsdk.lottie.tl tl;
    private final android.graphics.Path up;
    private final com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Integer> vl;
    private final com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float> ws;
    final android.graphics.Paint xt;

    /* renamed from: com.bytedance.adsdk.lottie.j.j.j$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* renamed from: com.bytedance.adsdk.lottie.j.j.j$j, reason: collision with other inner class name */
    private static final class C0183j {
        private final java.util.List<com.bytedance.adsdk.lottie.j.j.jy> j;
        private final com.bytedance.adsdk.lottie.j.j.tj xt;

        private C0183j(com.bytedance.adsdk.lottie.j.j.tj r2) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.j = r0
                r1.xt = r2
                return
        }

        /* synthetic */ C0183j(com.bytedance.adsdk.lottie.j.j.tj r1, com.bytedance.adsdk.lottie.j.j.j.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ java.util.List j(com.bytedance.adsdk.lottie.j.j.j.C0183j r0) {
                java.util.List<com.bytedance.adsdk.lottie.j.j.jy> r0 = r0.j
                return r0
        }

        static /* synthetic */ com.bytedance.adsdk.lottie.j.j.tj xt(com.bytedance.adsdk.lottie.j.j.j.C0183j r0) {
                com.bytedance.adsdk.lottie.j.j.tj r0 = r0.xt
                return r0
        }
    }

    j(com.bytedance.adsdk.lottie.tl r3, com.bytedance.adsdk.lottie.model.layer.cw r4, android.graphics.Paint.Cap r5, android.graphics.Paint.Join r6, float r7, com.bytedance.adsdk.lottie.model.j.r r8, com.bytedance.adsdk.lottie.model.j.xt r9, java.util.List<com.bytedance.adsdk.lottie.model.j.xt> r10, com.bytedance.adsdk.lottie.model.j.xt r11) {
            r2 = this;
            r2.<init>()
            android.graphics.PathMeasure r0 = new android.graphics.PathMeasure
            r0.<init>()
            r2.f1778r = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r2.up = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r2.f1777m = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.ae = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.g = r0
            com.bytedance.adsdk.lottie.j.j r0 = new com.bytedance.adsdk.lottie.j.j
            r1 = 1
            r0.<init>(r1)
            r2.xt = r0
            r1 = 0
            r2.cw = r1
            r2.tl = r3
            r2.j = r4
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r3)
            r0.setStrokeCap(r5)
            r0.setStrokeJoin(r6)
            r0.setStrokeMiter(r7)
            com.bytedance.adsdk.lottie.j.xt.j r3 = r8.j()
            r2.vl = r3
            com.bytedance.adsdk.lottie.j.xt.j r3 = r9.j()
            r2.qv = r3
            if (r11 != 0) goto L55
            r3 = 0
            r2.ws = r3
            goto L5b
        L55:
            com.bytedance.adsdk.lottie.j.xt.j r3 = r11.j()
            r2.ws = r3
        L5b:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = r10.size()
            r3.<init>(r5)
            r2.jy = r3
            int r3 = r10.size()
            float[] r3 = new float[r3]
            r2.oq = r3
            r3 = 0
            r5 = 0
        L70:
            int r6 = r10.size()
            if (r5 >= r6) goto L88
            java.util.List<com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float>> r6 = r2.jy
            java.lang.Object r7 = r10.get(r5)
            com.bytedance.adsdk.lottie.model.j.xt r7 = (com.bytedance.adsdk.lottie.model.j.xt) r7
            com.bytedance.adsdk.lottie.j.xt.j r7 = r7.j()
            r6.add(r7)
            int r5 = r5 + 1
            goto L70
        L88:
            com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Integer> r5 = r2.vl
            r4.j(r5)
            com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float> r5 = r2.qv
            r4.j(r5)
            r5 = 0
        L93:
            java.util.List<com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float>> r6 = r2.jy
            int r6 = r6.size()
            if (r5 >= r6) goto La9
            java.util.List<com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float>> r6 = r2.jy
            java.lang.Object r6 = r6.get(r5)
            com.bytedance.adsdk.lottie.j.xt.j r6 = (com.bytedance.adsdk.lottie.j.xt.j) r6
            r4.j(r6)
            int r5 = r5 + 1
            goto L93
        La9:
            com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float> r5 = r2.ws
            if (r5 == 0) goto Lb0
            r4.j(r5)
        Lb0:
            com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Integer> r5 = r2.vl
            r5.j(r2)
            com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float> r5 = r2.qv
            r5.j(r2)
        Lba:
            int r5 = r10.size()
            if (r3 >= r5) goto Lce
            java.util.List<com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float>> r5 = r2.jy
            java.lang.Object r5 = r5.get(r3)
            com.bytedance.adsdk.lottie.j.xt.j r5 = (com.bytedance.adsdk.lottie.j.xt.j) r5
            r5.j(r2)
            int r3 = r3 + 1
            goto Lba
        Lce:
            com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float> r3 = r2.ws
            if (r3 == 0) goto Ld5
            r3.j(r2)
        Ld5:
            com.bytedance.adsdk.lottie.model.xt.j r3 = r4.vl()
            if (r3 == 0) goto Lf1
            com.bytedance.adsdk.lottie.model.xt.j r3 = r4.vl()
            com.bytedance.adsdk.lottie.model.j.xt r3 = r3.j()
            com.bytedance.adsdk.lottie.j.xt.j r3 = r3.j()
            r2.av = r3
            r3.j(r2)
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r3 = r2.av
            r4.j(r3)
        Lf1:
            com.bytedance.adsdk.lottie.r.oq r3 = r4.jy()
            if (r3 == 0) goto L102
            com.bytedance.adsdk.lottie.j.xt.cw r3 = new com.bytedance.adsdk.lottie.j.xt.cw
            com.bytedance.adsdk.lottie.r.oq r5 = r4.jy()
            r3.<init>(r2, r4, r5)
            r2.i = r3
        L102:
            return
    }

    private void j(android.graphics.Canvas r17, com.bytedance.adsdk.lottie.j.j.j.C0183j r18, android.graphics.Matrix r19) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            java.lang.String r3 = "StrokeContent#applyTrimPath"
            com.bytedance.adsdk.lottie.up.j(r3)
            com.bytedance.adsdk.lottie.j.j.tj r4 = com.bytedance.adsdk.lottie.j.j.j.C0183j.xt(r18)
            if (r4 != 0) goto L15
            com.bytedance.adsdk.lottie.up.xt(r3)
            return
        L15:
            android.graphics.Path r4 = r0.up
            r4.reset()
            java.util.List r4 = com.bytedance.adsdk.lottie.j.j.j.C0183j.j(r18)
            int r4 = r4.size()
            int r4 = r4 + (-1)
        L24:
            if (r4 < 0) goto L3c
            android.graphics.Path r5 = r0.up
            java.util.List r6 = com.bytedance.adsdk.lottie.j.j.j.C0183j.j(r18)
            java.lang.Object r6 = r6.get(r4)
            com.bytedance.adsdk.lottie.j.j.jy r6 = (com.bytedance.adsdk.lottie.j.j.jy) r6
            android.graphics.Path r6 = r6.r()
            r5.addPath(r6, r2)
            int r4 = r4 + (-1)
            goto L24
        L3c:
            com.bytedance.adsdk.lottie.j.j.tj r4 = com.bytedance.adsdk.lottie.j.j.j.C0183j.xt(r18)
            com.bytedance.adsdk.lottie.j.xt.j r4 = r4.xt()
            java.lang.Object r4 = r4.ae()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r5
            com.bytedance.adsdk.lottie.j.j.tj r6 = com.bytedance.adsdk.lottie.j.j.j.C0183j.xt(r18)
            com.bytedance.adsdk.lottie.j.xt.j r6 = r6.cw()
            java.lang.Object r6 = r6.ae()
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            float r6 = r6 / r5
            com.bytedance.adsdk.lottie.j.j.tj r5 = com.bytedance.adsdk.lottie.j.j.j.C0183j.xt(r18)
            com.bytedance.adsdk.lottie.j.xt.j r5 = r5.r()
            java.lang.Object r5 = r5.ae()
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r7 = 1135869952(0x43b40000, float:360.0)
            float r5 = r5 / r7
            r7 = 1008981770(0x3c23d70a, float:0.01)
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 >= 0) goto L92
            r7 = 1065185444(0x3f7d70a4, float:0.99)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto L92
            android.graphics.Path r2 = r0.up
            android.graphics.Paint r4 = r0.xt
            r1.drawPath(r2, r4)
            com.bytedance.adsdk.lottie.up.xt(r3)
            return
        L92:
            android.graphics.PathMeasure r7 = r0.f1778r
            android.graphics.Path r8 = r0.up
            r9 = 0
            r7.setPath(r8, r9)
            android.graphics.PathMeasure r7 = r0.f1778r
            float r7 = r7.getLength()
        La0:
            android.graphics.PathMeasure r8 = r0.f1778r
            boolean r8 = r8.nextContour()
            if (r8 == 0) goto Lb0
            android.graphics.PathMeasure r8 = r0.f1778r
            float r8 = r8.getLength()
            float r7 = r7 + r8
            goto La0
        Lb0:
            float r5 = r5 * r7
            float r4 = r4 * r7
            float r4 = r4 + r5
            float r6 = r6 * r7
            float r6 = r6 + r5
            float r5 = r4 + r7
            r8 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 - r8
            float r5 = java.lang.Math.min(r6, r5)
            java.util.List r6 = com.bytedance.adsdk.lottie.j.j.j.C0183j.j(r18)
            int r6 = r6.size()
            int r6 = r6 + (-1)
            r10 = 0
            r11 = 0
        Lcd:
            if (r6 < 0) goto L151
            android.graphics.Path r12 = r0.f1777m
            java.util.List r13 = com.bytedance.adsdk.lottie.j.j.j.C0183j.j(r18)
            java.lang.Object r13 = r13.get(r6)
            com.bytedance.adsdk.lottie.j.j.jy r13 = (com.bytedance.adsdk.lottie.j.j.jy) r13
            android.graphics.Path r13 = r13.r()
            r12.set(r13)
            android.graphics.Path r12 = r0.f1777m
            r12.transform(r2)
            android.graphics.PathMeasure r12 = r0.f1778r
            android.graphics.Path r13 = r0.f1777m
            r12.setPath(r13, r9)
            android.graphics.PathMeasure r12 = r0.f1778r
            float r12 = r12.getLength()
            int r13 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r13 <= 0) goto L113
            float r13 = r5 - r7
            float r14 = r11 + r12
            int r14 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r14 >= 0) goto L113
            int r14 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r14 >= 0) goto L113
            int r14 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r14 <= 0) goto L10c
            float r14 = r4 - r7
            float r14 = r14 / r12
            goto L10d
        L10c:
            r14 = 0
        L10d:
            float r13 = r13 / r12
            float r13 = java.lang.Math.min(r13, r8)
            goto L140
        L113:
            float r13 = r11 + r12
            int r14 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r14 < 0) goto L14c
            int r14 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r14 > 0) goto L14c
            int r14 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r14 > 0) goto L12d
            int r14 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r14 >= 0) goto L12d
            android.graphics.Path r13 = r0.f1777m
            android.graphics.Paint r14 = r0.xt
            r1.drawPath(r13, r14)
            goto L14c
        L12d:
            int r14 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r14 >= 0) goto L133
            r14 = 0
            goto L136
        L133:
            float r14 = r4 - r11
            float r14 = r14 / r12
        L136:
            int r13 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r13 <= 0) goto L13d
            r13 = 1065353216(0x3f800000, float:1.0)
            goto L140
        L13d:
            float r13 = r5 - r11
            float r13 = r13 / r12
        L140:
            android.graphics.Path r15 = r0.f1777m
            com.bytedance.adsdk.lottie.up.g.j(r15, r14, r13, r10)
            android.graphics.Path r13 = r0.f1777m
            android.graphics.Paint r14 = r0.xt
            r1.drawPath(r13, r14)
        L14c:
            float r11 = r11 + r12
            int r6 = r6 + (-1)
            goto Lcd
        L151:
            com.bytedance.adsdk.lottie.up.xt(r3)
            return
    }

    private void j(android.graphics.Matrix r6) {
            r5 = this;
            java.lang.String r0 = "StrokeContent#applyDashPattern"
            com.bytedance.adsdk.lottie.up.j(r0)
            java.util.List<com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float>> r1 = r5.jy
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L11
            com.bytedance.adsdk.lottie.up.xt(r0)
            return
        L11:
            float r6 = com.bytedance.adsdk.lottie.up.g.j(r6)
            r1 = 0
        L16:
            java.util.List<com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float>> r2 = r5.jy
            int r2 = r2.size()
            if (r1 >= r2) goto L5d
            float[] r2 = r5.oq
            java.util.List<com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float>> r3 = r5.jy
            java.lang.Object r3 = r3.get(r1)
            com.bytedance.adsdk.lottie.j.xt.j r3 = (com.bytedance.adsdk.lottie.j.xt.j) r3
            java.lang.Object r3 = r3.ae()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r2[r1] = r3
            int r2 = r1 % 2
            if (r2 != 0) goto L45
            float[] r2 = r5.oq
            r3 = r2[r1]
            r4 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L52
            r2[r1] = r4
            goto L52
        L45:
            float[] r2 = r5.oq
            r3 = r2[r1]
            r4 = 1036831949(0x3dcccccd, float:0.1)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L52
            r2[r1] = r4
        L52:
            float[] r2 = r5.oq
            r3 = r2[r1]
            float r3 = r3 * r6
            r2[r1] = r3
            int r1 = r1 + 1
            goto L16
        L5d:
            com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float> r1 = r5.ws
            if (r1 != 0) goto L63
            r6 = 0
            goto L6f
        L63:
            java.lang.Object r1 = r1.ae()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r6 = r6 * r1
        L6f:
            android.graphics.Paint r1 = r5.xt
            android.graphics.DashPathEffect r2 = new android.graphics.DashPathEffect
            float[] r3 = r5.oq
            r2.<init>(r3, r6)
            r1.setPathEffect(r2)
            com.bytedance.adsdk.lottie.up.xt(r0)
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j
    public void j() {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.tl
            r0.invalidateSelf()
            return
    }

    public void j(android.graphics.Canvas r7, android.graphics.Matrix r8, int r9) {
            r6 = this;
            java.lang.String r0 = "StrokeContent#draw"
            com.bytedance.adsdk.lottie.up.j(r0)
            boolean r1 = com.bytedance.adsdk.lottie.up.g.xt(r8)
            if (r1 == 0) goto Lf
            com.bytedance.adsdk.lottie.up.xt(r0)
            return
        Lf:
            float r9 = (float) r9
            r1 = 1132396544(0x437f0000, float:255.0)
            float r9 = r9 / r1
            com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Integer> r2 = r6.vl
            com.bytedance.adsdk.lottie.j.xt.m r2 = (com.bytedance.adsdk.lottie.j.xt.m) r2
            int r2 = r2.g()
            float r2 = (float) r2
            float r9 = r9 * r2
            r2 = 1120403456(0x42c80000, float:100.0)
            float r9 = r9 / r2
            float r9 = r9 * r1
            int r9 = (int) r9
            android.graphics.Paint r1 = r6.xt
            r2 = 255(0xff, float:3.57E-43)
            r3 = 0
            int r9 = com.bytedance.adsdk.lottie.up.tl.j(r9, r3, r2)
            r1.setAlpha(r9)
            android.graphics.Paint r9 = r6.xt
            com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float> r1 = r6.qv
            com.bytedance.adsdk.lottie.j.xt.r r1 = (com.bytedance.adsdk.lottie.j.xt.r) r1
            float r1 = r1.g()
            float r2 = com.bytedance.adsdk.lottie.up.g.j(r8)
            float r1 = r1 * r2
            r9.setStrokeWidth(r1)
            android.graphics.Paint r9 = r6.xt
            float r9 = r9.getStrokeWidth()
            r1 = 0
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 > 0) goto L52
            com.bytedance.adsdk.lottie.up.xt(r0)
            return
        L52:
            r6.j(r8)
            com.bytedance.adsdk.lottie.j.xt.j<android.graphics.ColorFilter, android.graphics.ColorFilter> r9 = r6.az
            if (r9 == 0) goto L64
            android.graphics.Paint r2 = r6.xt
            java.lang.Object r9 = r9.ae()
            android.graphics.ColorFilter r9 = (android.graphics.ColorFilter) r9
            r2.setColorFilter(r9)
        L64:
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r9 = r6.av
            if (r9 == 0) goto L90
            java.lang.Object r9 = r9.ae()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 != 0) goto L7d
            android.graphics.Paint r1 = r6.xt
            r2 = 0
            r1.setMaskFilter(r2)
            goto L8e
        L7d:
            float r1 = r6.cw
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 == 0) goto L8e
            com.bytedance.adsdk.lottie.model.layer.cw r1 = r6.j
            android.graphics.BlurMaskFilter r1 = r1.xt(r9)
            android.graphics.Paint r2 = r6.xt
            r2.setMaskFilter(r1)
        L8e:
            r6.cw = r9
        L90:
            com.bytedance.adsdk.lottie.j.xt.cw r9 = r6.i
            if (r9 == 0) goto L99
            android.graphics.Paint r1 = r6.xt
            r9.j(r1)
        L99:
            java.util.List<com.bytedance.adsdk.lottie.j.j.j$j> r9 = r6.g
            int r9 = r9.size()
            if (r3 >= r9) goto Lf4
            java.util.List<com.bytedance.adsdk.lottie.j.j.j$j> r9 = r6.g
            java.lang.Object r9 = r9.get(r3)
            com.bytedance.adsdk.lottie.j.j.j$j r9 = (com.bytedance.adsdk.lottie.j.j.j.C0183j) r9
            com.bytedance.adsdk.lottie.j.j.tj r1 = com.bytedance.adsdk.lottie.j.j.j.C0183j.xt(r9)
            if (r1 == 0) goto Lb3
            r6.j(r7, r9, r8)
            goto Lf1
        Lb3:
            java.lang.String r1 = "StrokeContent#buildPath"
            com.bytedance.adsdk.lottie.up.j(r1)
            android.graphics.Path r2 = r6.up
            r2.reset()
            java.util.List r2 = com.bytedance.adsdk.lottie.j.j.j.C0183j.j(r9)
            int r2 = r2.size()
            int r2 = r2 + (-1)
        Lc7:
            if (r2 < 0) goto Ldf
            android.graphics.Path r4 = r6.up
            java.util.List r5 = com.bytedance.adsdk.lottie.j.j.j.C0183j.j(r9)
            java.lang.Object r5 = r5.get(r2)
            com.bytedance.adsdk.lottie.j.j.jy r5 = (com.bytedance.adsdk.lottie.j.j.jy) r5
            android.graphics.Path r5 = r5.r()
            r4.addPath(r5, r8)
            int r2 = r2 + (-1)
            goto Lc7
        Ldf:
            com.bytedance.adsdk.lottie.up.xt(r1)
            java.lang.String r9 = "StrokeContent#drawPath"
            com.bytedance.adsdk.lottie.up.j(r9)
            android.graphics.Path r1 = r6.up
            android.graphics.Paint r2 = r6.xt
            r7.drawPath(r1, r2)
            com.bytedance.adsdk.lottie.up.xt(r9)
        Lf1:
            int r3 = r3 + 1
            goto L99
        Lf4:
            com.bytedance.adsdk.lottie.up.xt(r0)
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.up
    public void j(android.graphics.RectF r7, android.graphics.Matrix r8, boolean r9) {
            r6 = this;
            java.lang.String r9 = "StrokeContent#getBounds"
            com.bytedance.adsdk.lottie.up.j(r9)
            android.graphics.Path r0 = r6.up
            r0.reset()
            r0 = 0
            r1 = 0
        Lc:
            java.util.List<com.bytedance.adsdk.lottie.j.j.j$j> r2 = r6.g
            int r2 = r2.size()
            if (r1 >= r2) goto L40
            java.util.List<com.bytedance.adsdk.lottie.j.j.j$j> r2 = r6.g
            java.lang.Object r2 = r2.get(r1)
            com.bytedance.adsdk.lottie.j.j.j$j r2 = (com.bytedance.adsdk.lottie.j.j.j.C0183j) r2
            r3 = 0
        L1d:
            java.util.List r4 = com.bytedance.adsdk.lottie.j.j.j.C0183j.j(r2)
            int r4 = r4.size()
            if (r3 >= r4) goto L3d
            android.graphics.Path r4 = r6.up
            java.util.List r5 = com.bytedance.adsdk.lottie.j.j.j.C0183j.j(r2)
            java.lang.Object r5 = r5.get(r3)
            com.bytedance.adsdk.lottie.j.j.jy r5 = (com.bytedance.adsdk.lottie.j.j.jy) r5
            android.graphics.Path r5 = r5.r()
            r4.addPath(r5, r8)
            int r3 = r3 + 1
            goto L1d
        L3d:
            int r1 = r1 + 1
            goto Lc
        L40:
            android.graphics.Path r8 = r6.up
            android.graphics.RectF r1 = r6.ae
            r8.computeBounds(r1, r0)
            com.bytedance.adsdk.lottie.j.xt.j<?, java.lang.Float> r8 = r6.qv
            com.bytedance.adsdk.lottie.j.xt.r r8 = (com.bytedance.adsdk.lottie.j.xt.r) r8
            float r8 = r8.g()
            android.graphics.RectF r0 = r6.ae
            float r1 = r0.left
            r2 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r2
            float r1 = r1 - r8
            float r2 = r0.top
            float r2 = r2 - r8
            float r3 = r0.right
            float r3 = r3 + r8
            float r4 = r0.bottom
            float r4 = r4 + r8
            r0.set(r1, r2, r3, r4)
            android.graphics.RectF r8 = r6.ae
            r7.set(r8)
            float r8 = r7.left
            r0 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 - r0
            float r1 = r7.top
            float r1 = r1 - r0
            float r2 = r7.right
            float r2 = r2 + r0
            float r3 = r7.bottom
            float r3 = r3 + r0
            r7.set(r8, r1, r2, r3)
            com.bytedance.adsdk.lottie.up.xt(r9)
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.cw
    public void j(java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r8, java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r9) {
            r7 = this;
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        L8:
            if (r0 < 0) goto L22
            java.lang.Object r3 = r8.get(r0)
            com.bytedance.adsdk.lottie.j.j.cw r3 = (com.bytedance.adsdk.lottie.j.j.cw) r3
            boolean r4 = r3 instanceof com.bytedance.adsdk.lottie.j.j.tj
            if (r4 == 0) goto L1f
            com.bytedance.adsdk.lottie.j.j.tj r3 = (com.bytedance.adsdk.lottie.j.j.tj) r3
            com.bytedance.adsdk.lottie.model.xt.mi$j r4 = r3.getType()
            com.bytedance.adsdk.lottie.model.xt.mi$j r5 = com.bytedance.adsdk.lottie.model.xt.mi.j.xt
            if (r4 != r5) goto L1f
            r2 = r3
        L1f:
            int r0 = r0 + (-1)
            goto L8
        L22:
            if (r2 == 0) goto L27
            r2.j(r7)
        L27:
            int r8 = r9.size()
            int r8 = r8 + (-1)
            r0 = r1
        L2e:
            if (r8 < 0) goto L6c
            java.lang.Object r3 = r9.get(r8)
            com.bytedance.adsdk.lottie.j.j.cw r3 = (com.bytedance.adsdk.lottie.j.j.cw) r3
            boolean r4 = r3 instanceof com.bytedance.adsdk.lottie.j.j.tj
            if (r4 == 0) goto L55
            r4 = r3
            com.bytedance.adsdk.lottie.j.j.tj r4 = (com.bytedance.adsdk.lottie.j.j.tj) r4
            com.bytedance.adsdk.lottie.model.xt.mi$j r5 = r4.getType()
            com.bytedance.adsdk.lottie.model.xt.mi$j r6 = com.bytedance.adsdk.lottie.model.xt.mi.j.xt
            if (r5 != r6) goto L55
            if (r0 == 0) goto L4c
            java.util.List<com.bytedance.adsdk.lottie.j.j.j$j> r3 = r7.g
            r3.add(r0)
        L4c:
            com.bytedance.adsdk.lottie.j.j.j$j r0 = new com.bytedance.adsdk.lottie.j.j.j$j
            r0.<init>(r4, r1)
            r4.j(r7)
            goto L69
        L55:
            boolean r4 = r3 instanceof com.bytedance.adsdk.lottie.j.j.jy
            if (r4 == 0) goto L69
            if (r0 != 0) goto L60
            com.bytedance.adsdk.lottie.j.j.j$j r0 = new com.bytedance.adsdk.lottie.j.j.j$j
            r0.<init>(r2, r1)
        L60:
            java.util.List r4 = com.bytedance.adsdk.lottie.j.j.j.C0183j.j(r0)
            com.bytedance.adsdk.lottie.j.j.jy r3 = (com.bytedance.adsdk.lottie.j.j.jy) r3
            r4.add(r3)
        L69:
            int r8 = r8 + (-1)
            goto L2e
        L6c:
            if (r0 == 0) goto L73
            java.util.List<com.bytedance.adsdk.lottie.j.j.j$j> r8 = r7.g
            r8.add(r0)
        L73:
            return
    }
}
