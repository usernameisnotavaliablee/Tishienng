package com.bytedance.adsdk.lottie.model.layer;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r extends com.bytedance.adsdk.lottie.model.layer.cw {
    private com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> ae;
    private final android.graphics.RectF g;
    private final android.graphics.RectF oq;
    private final android.graphics.Paint qv;
    private final java.util.List<com.bytedance.adsdk.lottie.model.layer.cw> tl;
    private boolean vl;

    /* renamed from: com.bytedance.adsdk.lottie.model.layer.r$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] j = null;

        static {
                com.bytedance.adsdk.lottie.model.layer.tl$xt[] r0 = com.bytedance.adsdk.lottie.model.layer.tl.xt.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.adsdk.lottie.model.layer.r.AnonymousClass1.j = r0
                com.bytedance.adsdk.lottie.model.layer.tl$xt r1 = com.bytedance.adsdk.lottie.model.layer.tl.xt.xt     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.bytedance.adsdk.lottie.model.layer.r.AnonymousClass1.j     // Catch: java.lang.NoSuchFieldError -> L1d
                com.bytedance.adsdk.lottie.model.layer.tl$xt r1 = com.bytedance.adsdk.lottie.model.layer.tl.xt.cw     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public r(com.bytedance.adsdk.lottie.tl r10, com.bytedance.adsdk.lottie.model.layer.tl r11, java.util.List<com.bytedance.adsdk.lottie.model.layer.tl> r12, com.bytedance.adsdk.lottie.m r13, android.content.Context r14) {
            r9 = this;
            r9.<init>(r10, r11)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.tl = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r9.g = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r9.oq = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r9.qv = r0
            r0 = 1
            r9.vl = r0
            com.bytedance.adsdk.lottie.model.j.xt r11 = r11.tj()
            r1 = 0
            if (r11 == 0) goto L38
            com.bytedance.adsdk.lottie.j.xt.j r11 = r11.j()
            r9.ae = r11
            r9.j(r11)
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r11 = r9.ae
            r11.j(r9)
            goto L3a
        L38:
            r9.ae = r1
        L3a:
            android.util.LongSparseArray r11 = new android.util.LongSparseArray
            java.util.List r2 = r13.ws()
            int r2 = r2.size()
            r11.<init>(r2)
            int r2 = r12.size()
            int r2 = r2 - r0
            r3 = r1
        L4d:
            r4 = 0
            if (r2 < 0) goto L8d
            java.lang.Object r5 = r12.get(r2)
            com.bytedance.adsdk.lottie.model.layer.tl r5 = (com.bytedance.adsdk.lottie.model.layer.tl) r5
            com.bytedance.adsdk.lottie.model.layer.cw r6 = com.bytedance.adsdk.lottie.model.layer.cw.j(r9, r5, r10, r13, r14)
            if (r6 == 0) goto L8a
            com.bytedance.adsdk.lottie.model.layer.tl r7 = r6.r()
            long r7 = r7.up()
            r11.put(r7, r6)
            if (r3 == 0) goto L6e
            r3.j(r6)
            r3 = r1
            goto L8a
        L6e:
            java.util.List<com.bytedance.adsdk.lottie.model.layer.cw> r7 = r9.tl
            r7.add(r4, r6)
            if (r5 == 0) goto L8a
            com.bytedance.adsdk.lottie.model.layer.tl$xt r4 = r5.vl()
            if (r4 == 0) goto L8a
            int[] r5 = com.bytedance.adsdk.lottie.model.layer.r.AnonymousClass1.j
            int r4 = r4.ordinal()
            r4 = r5[r4]
            if (r4 == r0) goto L89
            r5 = 2
            if (r4 == r5) goto L89
            goto L8a
        L89:
            r3 = r6
        L8a:
            int r2 = r2 + (-1)
            goto L4d
        L8d:
            int r10 = r11.size()
            if (r4 >= r10) goto Lb5
            long r12 = r11.keyAt(r4)
            java.lang.Object r10 = r11.get(r12)
            com.bytedance.adsdk.lottie.model.layer.cw r10 = (com.bytedance.adsdk.lottie.model.layer.cw) r10
            if (r10 == 0) goto Lb2
            com.bytedance.adsdk.lottie.model.layer.tl r12 = r10.r()
            long r12 = r12.jy()
            java.lang.Object r12 = r11.get(r12)
            com.bytedance.adsdk.lottie.model.layer.cw r12 = (com.bytedance.adsdk.lottie.model.layer.cw) r12
            if (r12 == 0) goto Lb2
            r10.xt(r12)
        Lb2:
            int r4 = r4 + 1
            goto L8d
        Lb5:
            return
    }

    @Override // com.bytedance.adsdk.lottie.model.layer.cw
    public void j(@com.bytedance.component.sdk.annotation.FloatRange(from = 0.0d, to = 1.0d) float r4) {
            r3 = this;
            super.j(r4)
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r0 = r3.ae
            if (r0 == 0) goto L3a
            com.bytedance.adsdk.lottie.tl r4 = r3.xt
            com.bytedance.adsdk.lottie.m r4 = r4.a()
            float r4 = r4.w()
            r0 = 1008981770(0x3c23d70a, float:0.01)
            float r4 = r4 + r0
            com.bytedance.adsdk.lottie.model.layer.tl r0 = r3.cw
            com.bytedance.adsdk.lottie.m r0 = r0.j()
            float r0 = r0.m()
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r1 = r3.ae
            java.lang.Object r1 = r1.ae()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            com.bytedance.adsdk.lottie.model.layer.tl r2 = r3.cw
            com.bytedance.adsdk.lottie.m r2 = r2.j()
            float r2 = r2.jy()
            float r1 = r1 * r2
            float r1 = r1 - r0
            float r4 = r1 / r4
        L3a:
            com.bytedance.adsdk.lottie.j.xt.j<java.lang.Float, java.lang.Float> r0 = r3.ae
            if (r0 != 0) goto L45
            com.bytedance.adsdk.lottie.model.layer.tl r0 = r3.cw
            float r0 = r0.cw()
            float r4 = r4 - r0
        L45:
            com.bytedance.adsdk.lottie.model.layer.tl r0 = r3.cw
            float r0 = r0.xt()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L65
            com.bytedance.adsdk.lottie.model.layer.tl r0 = r3.cw
            java.lang.String r0 = r0.m()
            java.lang.String r1 = "__container"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L65
            com.bytedance.adsdk.lottie.model.layer.tl r0 = r3.cw
            float r0 = r0.xt()
            float r4 = r4 / r0
        L65:
            java.util.List<com.bytedance.adsdk.lottie.model.layer.cw> r0 = r3.tl
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L6d:
            if (r0 < 0) goto L7d
            java.util.List<com.bytedance.adsdk.lottie.model.layer.cw> r1 = r3.tl
            java.lang.Object r1 = r1.get(r0)
            com.bytedance.adsdk.lottie.model.layer.cw r1 = (com.bytedance.adsdk.lottie.model.layer.cw) r1
            r1.j(r4)
            int r0 = r0 + (-1)
            goto L6d
        L7d:
            return
    }

    @Override // com.bytedance.adsdk.lottie.model.layer.cw, com.bytedance.adsdk.lottie.j.j.up
    public void j(android.graphics.RectF r4, android.graphics.Matrix r5, boolean r6) {
            r3 = this;
            super.j(r4, r5, r6)
            java.util.List<com.bytedance.adsdk.lottie.model.layer.cw> r5 = r3.tl
            int r5 = r5.size()
            r6 = 1
            int r5 = r5 - r6
        Lb:
            if (r5 < 0) goto L2a
            android.graphics.RectF r0 = r3.g
            r1 = 0
            r0.set(r1, r1, r1, r1)
            java.util.List<com.bytedance.adsdk.lottie.model.layer.cw> r0 = r3.tl
            java.lang.Object r0 = r0.get(r5)
            com.bytedance.adsdk.lottie.model.layer.cw r0 = (com.bytedance.adsdk.lottie.model.layer.cw) r0
            android.graphics.RectF r1 = r3.g
            android.graphics.Matrix r2 = r3.j
            r0.j(r1, r2, r6)
            android.graphics.RectF r0 = r3.g
            r4.union(r0)
            int r5 = r5 + (-1)
            goto Lb
        L2a:
            return
    }

    @Override // com.bytedance.adsdk.lottie.model.layer.cw
    public void j(boolean r3) {
            r2 = this;
            super.j(r3)
            java.util.List<com.bytedance.adsdk.lottie.model.layer.cw> r0 = r2.tl
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            com.bytedance.adsdk.lottie.model.layer.cw r1 = (com.bytedance.adsdk.lottie.model.layer.cw) r1
            r1.j(r3)
            goto L9
        L19:
            return
    }

    public java.util.List<com.bytedance.adsdk.lottie.model.layer.cw> ws() {
            r1 = this;
            java.util.List<com.bytedance.adsdk.lottie.model.layer.cw> r0 = r1.tl
            return r0
    }

    @Override // com.bytedance.adsdk.lottie.model.layer.cw
    public void xt(android.graphics.Canvas r7, android.graphics.Matrix r8, int r9) {
            r6 = this;
            super.xt(r7, r8, r9)
            java.lang.String r0 = "CompositionLayer#draw"
            com.bytedance.adsdk.lottie.up.j(r0)
            android.graphics.RectF r1 = r6.oq
            com.bytedance.adsdk.lottie.model.layer.tl r2 = r6.cw
            float r2 = r2.tl()
            com.bytedance.adsdk.lottie.model.layer.tl r3 = r6.cw
            float r3 = r3.g()
            r4 = 0
            r1.set(r4, r4, r2, r3)
            android.graphics.RectF r1 = r6.oq
            r8.mapRect(r1)
            com.bytedance.adsdk.lottie.tl r1 = r6.xt
            boolean r1 = r1.oq()
            r2 = 255(0xff, float:3.57E-43)
            r3 = 1
            if (r1 == 0) goto L36
            java.util.List<com.bytedance.adsdk.lottie.model.layer.cw> r1 = r6.tl
            int r1 = r1.size()
            if (r1 <= r3) goto L36
            if (r9 == r2) goto L36
            r1 = 1
            goto L37
        L36:
            r1 = 0
        L37:
            if (r1 == 0) goto L46
            android.graphics.Paint r4 = r6.qv
            r4.setAlpha(r9)
            android.graphics.RectF r4 = r6.oq
            android.graphics.Paint r5 = r6.qv
            com.bytedance.adsdk.lottie.up.g.j(r7, r4, r5)
            goto L49
        L46:
            r7.save()
        L49:
            if (r1 == 0) goto L4d
            r9 = 255(0xff, float:3.57E-43)
        L4d:
            java.util.List<com.bytedance.adsdk.lottie.model.layer.cw> r1 = r6.tl
            int r1 = r1.size()
            int r1 = r1 - r3
        L54:
            if (r1 < 0) goto L89
            boolean r2 = r6.vl
            if (r2 != 0) goto L69
            com.bytedance.adsdk.lottie.model.layer.tl r2 = r6.cw
            java.lang.String r2 = r2.m()
            java.lang.String r4 = "__container"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L69
            goto L78
        L69:
            android.graphics.RectF r2 = r6.oq
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L78
            android.graphics.RectF r2 = r6.oq
            boolean r2 = r7.clipRect(r2)
            goto L79
        L78:
            r2 = 1
        L79:
            if (r2 == 0) goto L86
            java.util.List<com.bytedance.adsdk.lottie.model.layer.cw> r2 = r6.tl
            java.lang.Object r2 = r2.get(r1)
            com.bytedance.adsdk.lottie.model.layer.cw r2 = (com.bytedance.adsdk.lottie.model.layer.cw) r2
            r2.j(r7, r8, r9)
        L86:
            int r1 = r1 + (-1)
            goto L54
        L89:
            r7.restore()
            com.bytedance.adsdk.lottie.up.xt(r0)
            return
    }

    public void xt(boolean r1) {
            r0 = this;
            r0.vl = r1
            return
    }
}
