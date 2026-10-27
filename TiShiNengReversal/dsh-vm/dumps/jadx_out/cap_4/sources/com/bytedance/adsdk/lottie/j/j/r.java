package com.bytedance.adsdk.lottie.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r implements com.bytedance.adsdk.lottie.j.j.jy, com.bytedance.adsdk.lottie.j.j.up, com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j {
    private final boolean ae;
    private final android.graphics.Matrix cw;
    private final com.bytedance.adsdk.lottie.tl g;
    private final android.graphics.Paint j;

    /* renamed from: m, reason: collision with root package name */
    private final java.lang.String f1783m;
    private java.util.List<com.bytedance.adsdk.lottie.j.j.jy> oq;
    private com.bytedance.adsdk.lottie.j.xt.av qv;

    /* renamed from: r, reason: collision with root package name */
    private final android.graphics.Path f1784r;
    private final java.util.List<com.bytedance.adsdk.lottie.j.j.cw> tl;
    private final android.graphics.RectF up;
    private final android.graphics.RectF xt;

    public r(com.bytedance.adsdk.lottie.tl r8, com.bytedance.adsdk.lottie.model.layer.cw r9, com.bytedance.adsdk.lottie.model.xt.av r10, com.bytedance.adsdk.lottie.m r11) {
            r7 = this;
            java.lang.String r3 = r10.j()
            boolean r4 = r10.cw()
            java.util.List r0 = r10.xt()
            java.util.List r5 = j(r8, r11, r9, r0)
            java.util.List r10 = r10.xt()
            com.bytedance.adsdk.lottie.model.j.vl r6 = j(r10)
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    r(com.bytedance.adsdk.lottie.tl r2, com.bytedance.adsdk.lottie.model.layer.cw r3, java.lang.String r4, boolean r5, java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r6, com.bytedance.adsdk.lottie.model.j.vl r7) {
            r1 = this;
            r1.<init>()
            com.bytedance.adsdk.lottie.j.j r0 = new com.bytedance.adsdk.lottie.j.j
            r0.<init>()
            r1.j = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.xt = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.cw = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1.f1784r = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.up = r0
            r1.f1783m = r4
            r1.g = r2
            r1.ae = r5
            r1.tl = r6
            if (r7 == 0) goto L3e
            com.bytedance.adsdk.lottie.j.xt.av r2 = r7.oq()
            r1.qv = r2
            r2.j(r3)
            com.bytedance.adsdk.lottie.j.xt.av r2 = r1.qv
            r2.j(r1)
        L3e:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r6.size()
            int r3 = r3 + (-1)
        L49:
            if (r3 < 0) goto L5d
            java.lang.Object r4 = r6.get(r3)
            com.bytedance.adsdk.lottie.j.j.cw r4 = (com.bytedance.adsdk.lottie.j.j.cw) r4
            boolean r5 = r4 instanceof com.bytedance.adsdk.lottie.j.j.oq
            if (r5 == 0) goto L5a
            com.bytedance.adsdk.lottie.j.j.oq r4 = (com.bytedance.adsdk.lottie.j.j.oq) r4
            r2.add(r4)
        L5a:
            int r3 = r3 + (-1)
            goto L49
        L5d:
            int r3 = r2.size()
            int r3 = r3 + (-1)
        L63:
            if (r3 < 0) goto L79
            java.lang.Object r4 = r2.get(r3)
            com.bytedance.adsdk.lottie.j.j.oq r4 = (com.bytedance.adsdk.lottie.j.j.oq) r4
            int r5 = r6.size()
            java.util.ListIterator r5 = r6.listIterator(r5)
            r4.j(r5)
            int r3 = r3 + (-1)
            goto L63
        L79:
            return
    }

    static com.bytedance.adsdk.lottie.model.j.vl j(java.util.List<com.bytedance.adsdk.lottie.model.xt.cw> r3) {
            r0 = 0
        L1:
            int r1 = r3.size()
            if (r0 >= r1) goto L17
            java.lang.Object r1 = r3.get(r0)
            com.bytedance.adsdk.lottie.model.xt.cw r1 = (com.bytedance.adsdk.lottie.model.xt.cw) r1
            boolean r2 = r1 instanceof com.bytedance.adsdk.lottie.model.j.vl
            if (r2 == 0) goto L14
            com.bytedance.adsdk.lottie.model.j.vl r1 = (com.bytedance.adsdk.lottie.model.j.vl) r1
            return r1
        L14:
            int r0 = r0 + 1
            goto L1
        L17:
            r3 = 0
            return r3
    }

    private static java.util.List<com.bytedance.adsdk.lottie.j.j.cw> j(com.bytedance.adsdk.lottie.tl r3, com.bytedance.adsdk.lottie.m r4, com.bytedance.adsdk.lottie.model.layer.cw r5, java.util.List<com.bytedance.adsdk.lottie.model.xt.cw> r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            r1 = 0
        La:
            int r2 = r6.size()
            if (r1 >= r2) goto L22
            java.lang.Object r2 = r6.get(r1)
            com.bytedance.adsdk.lottie.model.xt.cw r2 = (com.bytedance.adsdk.lottie.model.xt.cw) r2
            com.bytedance.adsdk.lottie.j.j.cw r2 = r2.j(r3, r4, r5)
            if (r2 == 0) goto L1f
            r0.add(r2)
        L1f:
            int r1 = r1 + 1
            goto La
        L22:
            return r0
    }

    private boolean up() {
            r4 = this;
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r3 = r4.tl
            int r3 = r3.size()
            if (r1 >= r3) goto L1f
            java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r3 = r4.tl
            java.lang.Object r3 = r3.get(r1)
            boolean r3 = r3 instanceof com.bytedance.adsdk.lottie.j.j.up
            if (r3 == 0) goto L1c
            int r2 = r2 + 1
            r3 = 2
            if (r2 < r3) goto L1c
            r0 = 1
            return r0
        L1c:
            int r1 = r1 + 1
            goto L3
        L1f:
            return r0
    }

    android.graphics.Matrix cw() {
            r1 = this;
            com.bytedance.adsdk.lottie.j.xt.av r0 = r1.qv
            if (r0 == 0) goto L9
            android.graphics.Matrix r0 = r0.r()
            return r0
        L9:
            android.graphics.Matrix r0 = r1.cw
            r0.reset()
            android.graphics.Matrix r0 = r1.cw
            return r0
    }

    @Override // com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j
    public void j() {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.g
            r0.invalidateSelf()
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.up
    public void j(android.graphics.Canvas r5, android.graphics.Matrix r6, int r7) {
            r4 = this;
            boolean r0 = r4.ae
            if (r0 == 0) goto L6
            goto L97
        L6:
            android.graphics.Matrix r0 = r4.cw
            r0.set(r6)
            com.bytedance.adsdk.lottie.j.xt.av r6 = r4.qv
            if (r6 == 0) goto L40
            android.graphics.Matrix r0 = r4.cw
            android.graphics.Matrix r6 = r6.r()
            r0.preConcat(r6)
            com.bytedance.adsdk.lottie.j.xt.av r6 = r4.qv
            com.bytedance.adsdk.lottie.j.xt.j r6 = r6.j()
            if (r6 != 0) goto L23
            r6 = 100
            goto L33
        L23:
            com.bytedance.adsdk.lottie.j.xt.av r6 = r4.qv
            com.bytedance.adsdk.lottie.j.xt.j r6 = r6.j()
            java.lang.Object r6 = r6.ae()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
        L33:
            float r6 = (float) r6
            r0 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 / r0
            float r7 = (float) r7
            float r6 = r6 * r7
            r7 = 1132396544(0x437f0000, float:255.0)
            float r6 = r6 / r7
            float r6 = r6 * r7
            int r7 = (int) r6
        L40:
            com.bytedance.adsdk.lottie.tl r6 = r4.g
            boolean r6 = r6.oq()
            r0 = 255(0xff, float:3.57E-43)
            r1 = 1
            if (r6 == 0) goto L55
            boolean r6 = r4.up()
            if (r6 == 0) goto L55
            if (r7 == r0) goto L55
            r6 = 1
            goto L56
        L55:
            r6 = 0
        L56:
            if (r6 == 0) goto L71
            android.graphics.RectF r2 = r4.xt
            r3 = 0
            r2.set(r3, r3, r3, r3)
            android.graphics.RectF r2 = r4.xt
            android.graphics.Matrix r3 = r4.cw
            r4.j(r2, r3, r1)
            android.graphics.Paint r2 = r4.j
            r2.setAlpha(r7)
            android.graphics.RectF r2 = r4.xt
            android.graphics.Paint r3 = r4.j
            com.bytedance.adsdk.lottie.up.g.j(r5, r2, r3)
        L71:
            if (r6 == 0) goto L75
            r7 = 255(0xff, float:3.57E-43)
        L75:
            java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r0 = r4.tl
            int r0 = r0.size()
            int r0 = r0 - r1
        L7c:
            if (r0 < 0) goto L92
            java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r1 = r4.tl
            java.lang.Object r1 = r1.get(r0)
            boolean r2 = r1 instanceof com.bytedance.adsdk.lottie.j.j.up
            if (r2 == 0) goto L8f
            com.bytedance.adsdk.lottie.j.j.up r1 = (com.bytedance.adsdk.lottie.j.j.up) r1
            android.graphics.Matrix r2 = r4.cw
            r1.j(r5, r2, r7)
        L8f:
            int r0 = r0 + (-1)
            goto L7c
        L92:
            if (r6 == 0) goto L97
            r5.restore()
        L97:
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.up
    public void j(android.graphics.RectF r4, android.graphics.Matrix r5, boolean r6) {
            r3 = this;
            android.graphics.Matrix r0 = r3.cw
            r0.set(r5)
            com.bytedance.adsdk.lottie.j.xt.av r5 = r3.qv
            if (r5 == 0) goto L12
            android.graphics.Matrix r0 = r3.cw
            android.graphics.Matrix r5 = r5.r()
            r0.preConcat(r5)
        L12:
            android.graphics.RectF r5 = r3.up
            r0 = 0
            r5.set(r0, r0, r0, r0)
            java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r5 = r3.tl
            int r5 = r5.size()
            int r5 = r5 + (-1)
        L20:
            if (r5 < 0) goto L3f
            java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r0 = r3.tl
            java.lang.Object r0 = r0.get(r5)
            com.bytedance.adsdk.lottie.j.j.cw r0 = (com.bytedance.adsdk.lottie.j.j.cw) r0
            boolean r1 = r0 instanceof com.bytedance.adsdk.lottie.j.j.up
            if (r1 == 0) goto L3c
            com.bytedance.adsdk.lottie.j.j.up r0 = (com.bytedance.adsdk.lottie.j.j.up) r0
            android.graphics.RectF r1 = r3.up
            android.graphics.Matrix r2 = r3.cw
            r0.j(r1, r2, r6)
            android.graphics.RectF r0 = r3.up
            r4.union(r0)
        L3c:
            int r5 = r5 + (-1)
            goto L20
        L3f:
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.cw
    public void j(java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r4, java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r5) {
            r3 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            int r0 = r4.size()
            java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r1 = r3.tl
            int r1 = r1.size()
            int r0 = r0 + r1
            r5.<init>(r0)
            r5.addAll(r4)
            java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r4 = r3.tl
            int r4 = r4.size()
            int r4 = r4 + (-1)
        L1b:
            if (r4 < 0) goto L35
            java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r0 = r3.tl
            java.lang.Object r0 = r0.get(r4)
            com.bytedance.adsdk.lottie.j.j.cw r0 = (com.bytedance.adsdk.lottie.j.j.cw) r0
            java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r1 = r3.tl
            r2 = 0
            java.util.List r1 = r1.subList(r2, r4)
            r0.j(r5, r1)
            r5.add(r0)
            int r4 = r4 + (-1)
            goto L1b
        L35:
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.jy
    public android.graphics.Path r() {
            r4 = this;
            android.graphics.Matrix r0 = r4.cw
            r0.reset()
            com.bytedance.adsdk.lottie.j.xt.av r0 = r4.qv
            if (r0 == 0) goto L12
            android.graphics.Matrix r1 = r4.cw
            android.graphics.Matrix r0 = r0.r()
            r1.set(r0)
        L12:
            android.graphics.Path r0 = r4.f1784r
            r0.reset()
            boolean r0 = r4.ae
            if (r0 == 0) goto L1e
            android.graphics.Path r0 = r4.f1784r
            return r0
        L1e:
            java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r0 = r4.tl
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L26:
            if (r0 < 0) goto L44
            java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r1 = r4.tl
            java.lang.Object r1 = r1.get(r0)
            com.bytedance.adsdk.lottie.j.j.cw r1 = (com.bytedance.adsdk.lottie.j.j.cw) r1
            boolean r2 = r1 instanceof com.bytedance.adsdk.lottie.j.j.jy
            if (r2 == 0) goto L41
            android.graphics.Path r2 = r4.f1784r
            com.bytedance.adsdk.lottie.j.j.jy r1 = (com.bytedance.adsdk.lottie.j.j.jy) r1
            android.graphics.Path r1 = r1.r()
            android.graphics.Matrix r3 = r4.cw
            r2.addPath(r1, r3)
        L41:
            int r0 = r0 + (-1)
            goto L26
        L44:
            android.graphics.Path r0 = r4.f1784r
            return r0
    }

    java.util.List<com.bytedance.adsdk.lottie.j.j.jy> xt() {
            r3 = this;
            java.util.List<com.bytedance.adsdk.lottie.j.j.jy> r0 = r3.oq
            if (r0 != 0) goto L2a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.oq = r0
            r0 = 0
        Lc:
            java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r1 = r3.tl
            int r1 = r1.size()
            if (r0 >= r1) goto L2a
            java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r1 = r3.tl
            java.lang.Object r1 = r1.get(r0)
            com.bytedance.adsdk.lottie.j.j.cw r1 = (com.bytedance.adsdk.lottie.j.j.cw) r1
            boolean r2 = r1 instanceof com.bytedance.adsdk.lottie.j.j.jy
            if (r2 == 0) goto L27
            java.util.List<com.bytedance.adsdk.lottie.j.j.jy> r2 = r3.oq
            com.bytedance.adsdk.lottie.j.j.jy r1 = (com.bytedance.adsdk.lottie.j.j.jy) r1
            r2.add(r1)
        L27:
            int r0 = r0 + 1
            goto Lc
        L2a:
            java.util.List<com.bytedance.adsdk.lottie.j.j.jy> r0 = r3.oq
            return r0
    }
}
