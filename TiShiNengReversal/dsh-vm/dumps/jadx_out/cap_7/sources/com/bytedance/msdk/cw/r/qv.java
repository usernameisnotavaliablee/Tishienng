package com.bytedance.msdk.cw.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class qv {
    private final android.os.Handler ae;
    private final java.lang.Runnable av;
    private final com.bytedance.msdk.api.r.j.j.j az;
    private com.bytedance.msdk.api.j.xt cw;
    private com.bytedance.msdk.api.r.j.j.j g;
    private int j;
    private java.lang.ref.SoftReference<java.util.Map<java.lang.String, java.lang.Object>> jy;
    private com.bytedance.msdk.core.views.RefreshableBannerView m;
    private com.bytedance.msdk.api.r.j.j.r oq;
    private java.lang.ref.SoftReference<android.app.Activity> qv;
    private com.bytedance.msdk.cw.r.m r;
    private final android.os.Handler tl;
    private com.bytedance.msdk.cw.r.m up;
    private java.lang.ref.SoftReference<com.bytedance.sdk.openadsdk.kt.j.xt.j.j> vl;
    private final android.view.View.OnAttachStateChangeListener ws;
    private final java.lang.ref.SoftReference<android.content.Context> xt;



    /* renamed from: com.bytedance.msdk.cw.r.qv$3, reason: invalid class name */
    class AnonymousClass3 implements java.lang.Runnable {
        final /* synthetic */ com.bytedance.msdk.cw.r.qv j;


        AnonymousClass3(com.bytedance.msdk.cw.r.qv r1) {
                r0 = this;
                r0.j = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.bytedance.msdk.cw.r.qv r0 = r2.j
                android.os.Handler r0 = com.bytedance.msdk.cw.r.qv.oq(r0)
                com.bytedance.msdk.cw.r.qv$3$1 r1 = new com.bytedance.msdk.cw.r.qv$3$1
                r1.<init>(r2)
                r0.post(r1)
                return
        }
    }



    public qv(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.j = r0
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r1 = 0
            r0.<init>(r1)
            r2.qv = r0
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r0.<init>(r1)
            r2.vl = r0
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r0.<init>(r1)
            r2.jy = r0
            com.bytedance.msdk.cw.r.qv$1 r0 = new com.bytedance.msdk.cw.r.qv$1
            r0.<init>(r2)
            r2.ws = r0
            com.bytedance.msdk.cw.r.qv$2 r1 = new com.bytedance.msdk.cw.r.qv$2
            r1.<init>(r2)
            r2.az = r1
            com.bytedance.msdk.cw.r.qv$3 r1 = new com.bytedance.msdk.cw.r.qv$3
            r1.<init>(r2)
            r2.av = r1
            java.lang.ref.SoftReference r1 = new java.lang.ref.SoftReference
            r1.<init>(r3)
            r2.xt = r1
            com.bytedance.msdk.cw.r.m r1 = new com.bytedance.msdk.cw.r.m
            r1.<init>(r3)
            r2.r = r1
            if (r3 == 0) goto L55
            com.bytedance.msdk.core.views.RefreshableBannerView r1 = new com.bytedance.msdk.core.views.RefreshableBannerView
            r1.<init>(r3)
            r2.m = r1
            r1.addOnAttachStateChangeListener(r0)
            com.bytedance.msdk.core.views.RefreshableBannerView r3 = r2.m
            com.bytedance.msdk.cw.r.qv$4 r0 = new com.bytedance.msdk.cw.r.qv$4
            r0.<init>(r2)
            r3.setVisibilityChangeListener(r0)
        L55:
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r0 = com.bytedance.msdk.j.up.m.xt()
            r3.<init>(r0)
            r2.ae = r3
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r3.<init>(r0)
            r2.tl = r3
            return
    }

    static /* synthetic */ java.lang.ref.SoftReference ae(com.bytedance.msdk.cw.r.qv r0) {
            java.lang.ref.SoftReference<android.content.Context> r0 = r0.xt
            return r0
    }

    private void av() {
            r2 = this;
            android.os.Handler r0 = r2.ae
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            return
    }

    private void az() {
            r4 = this;
            android.os.Handler r0 = r4.ae
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            android.os.Handler r0 = r4.ae
            java.lang.Runnable r1 = r4.av
            int r2 = r4.j
            long r2 = (long) r2
            r0.postDelayed(r1, r2)
            return
    }

    static /* synthetic */ void cw(com.bytedance.msdk.cw.r.qv r0) {
            r0.az()
            return
    }

    static /* synthetic */ com.bytedance.msdk.cw.r.m g(com.bytedance.msdk.cw.r.qv r0) {
            com.bytedance.msdk.cw.r.m r0 = r0.r
            return r0
    }

    private void i() {
            r3 = this;
            java.lang.ref.SoftReference<android.content.Context> r0 = r3.xt
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 == 0) goto L2c
            com.bytedance.msdk.cw.r.m r1 = new com.bytedance.msdk.cw.r.m
            r1.<init>(r0)
            r3.up = r1
            com.bytedance.msdk.api.r.j.j.j r0 = r3.az
            r1.j(r0)
            com.bytedance.msdk.cw.r.m r0 = r3.up
            com.bytedance.msdk.api.r.j.j.r r1 = r3.oq
            r0.j(r1)
            com.bytedance.msdk.api.j.xt r0 = r3.cw
            r3.j(r0)
            com.bytedance.msdk.cw.r.m r0 = r3.up
            com.bytedance.msdk.api.j.xt r1 = r3.cw
            r2 = 0
            r0.j(r1, r2)
        L2c:
            return
    }

    static /* synthetic */ int j(com.bytedance.msdk.cw.r.qv r0) {
            int r0 = r0.j
            return r0
    }

    private void j(com.bytedance.msdk.api.j.xt r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L4f
        L3:
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            java.lang.String r4 = r4.v()
            r1 = 100
            r2 = 1
            com.bytedance.msdk.core.oq.xt r4 = r0.j(r4, r2, r1)
            if (r4 == 0) goto L4f
            int r4 = r4.g(r2)
            r0 = 10000(0x2710, float:1.4013E-41)
            java.lang.String r1 = "TMe"
            if (r4 < r0) goto L39
            r0 = 180000(0x2bf20, float:2.52234E-40)
            if (r4 > r0) goto L39
            r3.j = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "---==-----banner轮播时间："
            r4.<init>(r0)
            int r0 = r3.j
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.bytedance.msdk.j.up.cw.j(r1, r4)
            return
        L39:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "---==-----banner轮播时间下发不在10*1000～180*1000范围内："
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r4 = "，禁止banner轮播"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r1, r4)
        L4f:
            return
    }

    private void j(@androidx.annotation.NonNull com.bytedance.msdk.cw.r.m r4) {
            r3 = this;
            java.lang.ref.SoftReference<java.util.Map<java.lang.String, java.lang.Object>> r0 = r3.jy
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L21
            java.lang.String r1 = "dislike_dialog"
            java.lang.Object r1 = r0.get(r1)
            android.app.Dialog r1 = (android.app.Dialog) r1
            java.lang.String r2 = "dislike_ids"
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer[] r0 = (java.lang.Integer[]) r0
            if (r1 == 0) goto L21
            if (r0 == 0) goto L21
            r4.j(r1, r0)
        L21:
            java.lang.ref.SoftReference<android.app.Activity> r0 = r3.qv
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.ref.SoftReference<com.bytedance.sdk.openadsdk.kt.j.xt.j.j> r1 = r3.vl
            java.lang.Object r1 = r1.get()
            com.bytedance.sdk.openadsdk.kt.j.xt.j.j r1 = (com.bytedance.sdk.openadsdk.kt.j.xt.j.j) r1
            if (r0 == 0) goto L38
            if (r1 == 0) goto L38
            r4.j(r0, r1)
        L38:
            return
    }

    static /* synthetic */ void j(com.bytedance.msdk.cw.r.qv r0, com.bytedance.msdk.cw.r.m r1) {
            r0.j(r1)
            return
    }

    static /* synthetic */ com.bytedance.msdk.cw.r.m m(com.bytedance.msdk.cw.r.qv r0) {
            com.bytedance.msdk.cw.r.m r0 = r0.up
            return r0
    }

    static /* synthetic */ android.os.Handler oq(com.bytedance.msdk.cw.r.qv r0) {
            android.os.Handler r0 = r0.tl
            return r0
    }

    static /* synthetic */ void r(com.bytedance.msdk.cw.r.qv r0) {
            r0.av()
            return
    }

    static /* synthetic */ com.bytedance.msdk.core.views.RefreshableBannerView tl(com.bytedance.msdk.cw.r.qv r0) {
            com.bytedance.msdk.core.views.RefreshableBannerView r0 = r0.m
            return r0
    }

    static /* synthetic */ com.bytedance.msdk.api.r.j.j.j up(com.bytedance.msdk.cw.r.qv r0) {
            com.bytedance.msdk.api.r.j.j.j r0 = r0.g
            return r0
    }

    static /* synthetic */ com.bytedance.msdk.cw.r.m xt(com.bytedance.msdk.cw.r.qv r0, com.bytedance.msdk.cw.r.m r1) {
            r0.r = r1
            return r1
    }

    static /* synthetic */ void xt(com.bytedance.msdk.cw.r.qv r0) {
            r0.i()
            return
    }

    public java.util.Map<java.lang.String, java.lang.Object> ae() {
            r1 = this;
            com.bytedance.msdk.cw.r.m r0 = r1.r
            if (r0 == 0) goto L9
            java.util.Map r0 = r0.w()
            return r0
        L9:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            return r0
    }

    public void cw() {
            r2 = this;
            android.os.Handler r0 = r2.tl
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            r2.av()
            com.bytedance.msdk.core.views.RefreshableBannerView r0 = r2.m
            if (r0 == 0) goto L12
            android.view.View$OnAttachStateChangeListener r1 = r2.ws
            r0.removeOnAttachStateChangeListener(r1)
        L12:
            com.bytedance.msdk.cw.r.m r0 = r2.r
            if (r0 == 0) goto L19
            r0.j()
        L19:
            com.bytedance.msdk.cw.r.m r0 = r2.up
            if (r0 == 0) goto L20
            r0.j()
        L20:
            return
    }

    public java.util.List<com.bytedance.msdk.api.cw> g() {
            r1 = this;
            com.bytedance.msdk.cw.r.m r0 = r1.r
            if (r0 == 0) goto L9
            java.util.List r0 = r0.qv()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public com.bytedance.sdk.openadsdk.i.cw.xt.ae j(android.app.Activity r2) {
            r1 = this;
            com.bytedance.msdk.cw.r.m r0 = r1.r
            if (r0 == 0) goto L9
            com.bytedance.sdk.openadsdk.i.cw.xt.ae r2 = r0.j(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void j() {
            r1 = this;
            com.bytedance.msdk.cw.r.m r0 = r1.r
            if (r0 == 0) goto L7
            r0.up()
        L7:
            return
    }

    public void j(android.app.Activity r2, com.bytedance.sdk.openadsdk.kt.j.xt.j.j r3) {
            r1 = this;
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r0.<init>(r2)
            r1.qv = r0
            java.lang.ref.SoftReference r2 = new java.lang.ref.SoftReference
            r2.<init>(r3)
            r1.vl = r2
            return
    }

    public void j(android.app.Dialog r3, java.lang.Integer[] r4) {
            r2 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "dislike_dialog"
            r0.put(r1, r3)
            java.lang.String r3 = "dislike_ids"
            r0.put(r3, r4)
            java.lang.ref.SoftReference r3 = new java.lang.ref.SoftReference
            r3.<init>(r0)
            r2.jy = r3
            return
    }

    public void j(com.bytedance.msdk.api.j.xt r3, com.bytedance.msdk.api.r.j.j.xt r4) {
            r2 = this;
            com.bytedance.msdk.cw.r.m r0 = r2.r
            if (r0 == 0) goto L57
            java.lang.ref.SoftReference<android.content.Context> r0 = r2.xt
            if (r0 == 0) goto L57
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L57
            r2.cw = r3
            r2.j(r3)
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            java.lang.String r3 = r3.v()
            r1 = 1
            boolean r3 = r0.j(r3, r1)
            if (r3 != 0) goto L34
            if (r4 == 0) goto L34
            com.bytedance.msdk.api.j r3 = new com.bytedance.msdk.api.j
            r0 = 840031(0xcd15f, float:1.177134E-39)
            java.lang.String r1 = com.bytedance.msdk.api.j.j(r0)
            r3.<init>(r0, r1)
            r4.j(r3)
            return
        L34:
            com.bytedance.msdk.core.ws.cw r3 = com.bytedance.msdk.core.xt.xt()
            boolean r3 = r3.az()
            if (r3 != 0) goto L50
            if (r4 == 0) goto L57
            com.bytedance.msdk.api.j r3 = new com.bytedance.msdk.api.j
            r0 = 840032(0xcd160, float:1.177136E-39)
            java.lang.String r1 = com.bytedance.msdk.api.j.j(r0)
            r3.<init>(r0, r1)
            r4.j(r3)
            return
        L50:
            com.bytedance.msdk.cw.r.m r3 = r2.r
            com.bytedance.msdk.api.j.xt r0 = r2.cw
            r3.j(r0, r4)
        L57:
            return
    }

    public void j(com.bytedance.msdk.api.r.j.j.j r2) {
            r1 = this;
            r1.g = r2
            com.bytedance.msdk.cw.r.m r2 = r1.r
            if (r2 == 0) goto Lb
            com.bytedance.msdk.api.r.j.j.j r0 = r1.az
            r2.j(r0)
        Lb:
            return
    }

    public void j(com.bytedance.msdk.api.r.j.j.r r2) {
            r1 = this;
            r1.oq = r2
            com.bytedance.msdk.cw.r.m r0 = r1.r
            if (r0 == 0) goto L9
            r0.j(r2)
        L9:
            return
    }

    public void j(com.bytedance.sdk.openadsdk.i.cw.j.cw r2) {
            r1 = this;
            com.bytedance.msdk.cw.r.m r0 = r1.r
            if (r0 == 0) goto L7
            r0.j(r2)
        L7:
            return
    }

    public void j(com.bytedance.sdk.openadsdk.i.cw.j.xt r2) {
            r1 = this;
            com.bytedance.msdk.cw.r.m r0 = r1.r
            if (r0 == 0) goto L7
            r0.xt(r2)
        L7:
            return
    }

    public void j(com.bytedance.sdk.openadsdk.s.j.xt.j.cw r2) {
            r1 = this;
            com.bytedance.msdk.cw.r.m r0 = r1.r
            if (r0 == 0) goto L7
            r0.j(r2)
        L7:
            return
    }

    public void j(java.lang.String r2) {
            r1 = this;
            com.bytedance.msdk.cw.r.m r0 = r1.r
            if (r0 == 0) goto L7
            r0.r(r2)
        L7:
            return
    }

    public int jy() {
            r1 = this;
            com.bytedance.msdk.cw.r.m r0 = r1.r
            if (r0 == 0) goto L9
            int r0 = r0.i()
            return r0
        L9:
            r0 = -1
            return r0
    }

    public int m() {
            r1 = this;
            com.bytedance.msdk.cw.r.m r0 = r1.r
            if (r0 == 0) goto L9
            int r0 = r0.r()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public com.bytedance.msdk.api.cw oq() {
            r1 = this;
            com.bytedance.msdk.cw.r.m r0 = r1.r
            if (r0 == 0) goto L9
            com.bytedance.msdk.api.cw r0 = r0.av()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.util.List<com.bytedance.msdk.api.cw> qv() {
            r1 = this;
            com.bytedance.msdk.cw.r.m r0 = r1.r
            if (r0 == 0) goto L9
            java.util.List r0 = r0.vl()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean r() {
            r1 = this;
            com.bytedance.msdk.cw.r.m r0 = r1.r
            if (r0 == 0) goto L9
            boolean r0 = r0.cw()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.util.List<com.bytedance.msdk.api.xt> tl() {
            r1 = this;
            com.bytedance.msdk.cw.r.m r0 = r1.r
            if (r0 == 0) goto L9
            java.util.List r0 = r0.oq()
            return r0
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    @androidx.annotation.Nullable
    public android.view.View up() {
            r3 = this;
            com.bytedance.msdk.cw.r.m r0 = r3.r
            if (r0 == 0) goto L41
            java.lang.ref.SoftReference<android.content.Context> r1 = r3.xt
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            android.view.View r0 = r0.j(r1)
            com.bytedance.msdk.cw.r.m r1 = r3.r
            com.bytedance.msdk.xt.cw r2 = r1.r
            r1.j(r2)
            if (r0 == 0) goto L41
            com.bytedance.msdk.core.views.RefreshableBannerView r1 = r3.m
            if (r1 == 0) goto L41
            com.bytedance.msdk.cw.r.qv$5 r1 = new com.bytedance.msdk.cw.r.qv$5
            r1.<init>(r3)
            r0.addOnLayoutChangeListener(r1)
            com.bytedance.msdk.core.views.RefreshableBannerView r1 = r3.m
            r1.removeAllViews()
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L39
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L39
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.removeView(r0)
        L39:
            com.bytedance.msdk.core.views.RefreshableBannerView r1 = r3.m
            r1.addView(r0)
            com.bytedance.msdk.core.views.RefreshableBannerView r0 = r3.m
            return r0
        L41:
            r0 = 0
            return r0
    }

    public com.bytedance.msdk.api.cw vl() {
            r1 = this;
            com.bytedance.msdk.cw.r.m r0 = r1.r
            if (r0 == 0) goto L9
            com.bytedance.msdk.api.cw r0 = r0.az()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public com.bytedance.sdk.openadsdk.i.cw.xt.r ws() {
            r1 = this;
            com.bytedance.msdk.cw.r.m r0 = r1.r
            if (r0 == 0) goto L9
            com.bytedance.sdk.openadsdk.i.cw.xt.r r0 = r0.tj()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void xt() {
            r1 = this;
            com.bytedance.msdk.cw.r.m r0 = r1.r
            if (r0 == 0) goto L7
            r0.m()
        L7:
            return
    }
}
