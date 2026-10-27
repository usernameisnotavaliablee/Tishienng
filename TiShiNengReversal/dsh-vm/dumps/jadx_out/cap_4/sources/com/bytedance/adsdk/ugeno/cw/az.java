package com.bytedance.adsdk.ugeno.cw;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class az {
    private com.bytedance.adsdk.ugeno.cw.kt ae;
    private boolean av;
    private com.bytedance.adsdk.ugeno.up.j.j az;
    private com.bytedance.adsdk.ugeno.xt.cw<android.view.View> cw;
    private com.bytedance.adsdk.ugeno.cw.qv f;
    private com.bytedance.adsdk.ugeno.cw.g g;
    private java.util.List<java.lang.String> i;
    private android.content.Context j;
    private boolean jy;
    private float kt;

    /* renamed from: m, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.cw.f f1909m;
    private com.bytedance.adsdk.ugeno.cw.m mi;
    private java.lang.String oq;
    private com.bytedance.adsdk.ugeno.cw.ws qv;

    /* renamed from: r, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.cw.oq f1910r;
    private float tj;
    private com.bytedance.adsdk.ugeno.cw.mi tl;
    private com.bytedance.adsdk.ugeno.cw.w up;
    private org.json.JSONObject vl;

    /* renamed from: w, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.cw.tl f1911w;
    private boolean ws;
    private org.json.JSONObject xt;


    public az(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.jy = r0
            r0 = 0
            r1.ws = r0
            r1.j = r2
            return
    }

    private void cw(com.bytedance.adsdk.ugeno.xt.cw r3) {
            r2 = this;
            boolean r0 = r3.p()     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L2f
            com.bytedance.adsdk.ugeno.cw.g$j r0 = r3.l()     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L2f
            com.bytedance.adsdk.ugeno.cw.g$j r0 = r3.l()     // Catch: java.lang.Exception -> L2f
            org.json.JSONObject r0 = r0.m()     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L2f
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2f
            r0.<init>()     // Catch: java.lang.Exception -> L2f
            java.lang.String r1 = "i18n"
            com.bytedance.adsdk.ugeno.cw.g$j r3 = r3.l()     // Catch: java.lang.Exception -> L2f
            org.json.JSONObject r3 = r3.m()     // Catch: java.lang.Exception -> L2f
            r0.put(r1, r3)     // Catch: java.lang.Exception -> L2f
            org.json.JSONObject r3 = r2.xt     // Catch: java.lang.Exception -> L2f
            java.lang.String r1 = "xNode"
            r3.put(r1, r0)     // Catch: java.lang.Exception -> L2f
        L2f:
            return
    }

    private void xt(com.bytedance.adsdk.ugeno.xt.cw<android.view.View> r7) {
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            org.json.JSONObject r0 = r7.x()
            java.util.Iterator r1 = r0.keys()
            com.bytedance.adsdk.ugeno.xt.j r2 = r7.h()
            if (r2 == 0) goto L16
            com.bytedance.adsdk.ugeno.xt.j$j r2 = r2.tl()
            goto L17
        L16:
            r2 = 0
        L17:
            r6.cw(r7)
        L1a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = r0.optString(r3)
            org.json.JSONObject r5 = r6.xt
            java.lang.String r4 = com.bytedance.adsdk.ugeno.r.xt.j(r4, r5)
            r7.j(r3, r4)
            if (r2 == 0) goto L1a
            android.content.Context r5 = r6.j
            r2.j(r5, r3, r4)
            goto L1a
        L3b:
            com.bytedance.adsdk.ugeno.cw.oq r0 = r6.f1910r
            r7.j(r0)
            com.bytedance.adsdk.ugeno.cw.w r0 = r6.up
            r7.j(r0)
            com.bytedance.adsdk.ugeno.cw.kt r0 = r6.ae
            r7.j(r0)
            com.bytedance.adsdk.ugeno.cw.qv r0 = r6.f
            if (r0 == 0) goto L51
            r7.j(r0)
        L51:
            com.bytedance.adsdk.ugeno.cw.m r0 = r6.mi
            if (r0 == 0) goto L58
            r7.j(r0)
        L58:
            boolean r0 = r7 instanceof com.bytedance.adsdk.ugeno.xt.j
            if (r0 == 0) goto L7f
            r0 = r7
            com.bytedance.adsdk.ugeno.xt.j r0 = (com.bytedance.adsdk.ugeno.xt.j) r0
            java.util.List r0 = r0.ae()
            if (r0 == 0) goto L7f
            int r1 = r0.size()
            if (r1 <= 0) goto L7f
            java.util.Iterator r0 = r0.iterator()
        L6f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r0.next()
            com.bytedance.adsdk.ugeno.xt.cw r1 = (com.bytedance.adsdk.ugeno.xt.cw) r1
            r6.xt(r1)
            goto L6f
        L7f:
            if (r2 == 0) goto L88
            android.view.ViewGroup$LayoutParams r0 = r2.j()
            r7.j(r0)
        L88:
            r7.xt()
            return
    }

    public com.bytedance.adsdk.ugeno.xt.cw<android.view.View> j(com.bytedance.adsdk.ugeno.cw.g.j r2) {
            r1 = this;
            r0 = 0
            com.bytedance.adsdk.ugeno.xt.cw r2 = r1.xt(r2, r0)
            r1.cw = r2
            return r2
    }

    public com.bytedance.adsdk.ugeno.xt.cw<android.view.View> j(com.bytedance.adsdk.ugeno.cw.g.j r8, com.bytedance.adsdk.ugeno.xt.cw<android.view.View> r9) {
            r7 = this;
            boolean r0 = com.bytedance.adsdk.ugeno.cw.g.r(r8)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.bytedance.adsdk.ugeno.cw.tl r0 = r7.f1911w
            if (r0 == 0) goto Lf
            r0.j(r8)
        Lf:
            java.lang.String r0 = r8.cw()
            com.bytedance.adsdk.ugeno.cw.xt r2 = com.bytedance.adsdk.ugeno.cw.r.j(r0)
            r3 = 1
            if (r2 != 0) goto L38
            r7.av = r3
            java.util.List<java.lang.String> r2 = r7.i
            if (r2 != 0) goto L27
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r7.i = r2
        L27:
            java.util.List<java.lang.String> r2 = r7.i
            r2.add(r0)
            java.lang.String r0 = "View"
            r8.j(r0)
            com.bytedance.adsdk.ugeno.cw.xt r2 = com.bytedance.adsdk.ugeno.cw.r.j(r0)
            if (r2 != 0) goto L38
            return r1
        L38:
            android.content.Context r4 = r7.j
            com.bytedance.adsdk.ugeno.xt.cw r2 = r2.j(r4)
            if (r2 != 0) goto L41
            return r1
        L41:
            org.json.JSONObject r4 = r8.r()
            java.lang.String r5 = r8.j()
            org.json.JSONObject r6 = r7.xt
            java.lang.String r5 = com.bytedance.adsdk.ugeno.r.xt.j(r5, r6)
            r2.ae(r5)
            r2.tl(r0)
            r2.cw(r4)
            r2.j(r8)
            org.json.JSONObject r0 = r7.xt
            r2.xt(r0)
            com.bytedance.adsdk.ugeno.cw.g r0 = r7.g
            if (r0 != 0) goto L68
            r2.cw(r3)
            goto L6f
        L68:
            boolean r0 = r0.r()
            r2.cw(r0)
        L6f:
            com.bytedance.adsdk.ugeno.cw.ws r0 = r7.qv
            r2.j(r0)
            com.bytedance.adsdk.ugeno.up.j.j r0 = r7.az
            r2.j(r0)
            java.util.Iterator r0 = r4.keys()
            boolean r5 = r9 instanceof com.bytedance.adsdk.ugeno.xt.j
            if (r5 == 0) goto L8a
            com.bytedance.adsdk.ugeno.xt.j r9 = (com.bytedance.adsdk.ugeno.xt.j) r9
            com.bytedance.adsdk.ugeno.xt.j$j r1 = r9.tl()
            r2.j(r9)
        L8a:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto Lb2
            java.lang.Object r9 = r0.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r5 = r4.optString(r9)
            org.json.JSONObject r6 = r7.xt
            java.lang.String r5 = com.bytedance.adsdk.ugeno.r.xt.j(r5, r6)
            r2.j(r9, r5)
            com.bytedance.adsdk.ugeno.cw.qv r6 = r7.f
            if (r6 == 0) goto Laa
            r6.j(r9, r5)
        Laa:
            if (r1 == 0) goto L8a
            android.content.Context r6 = r7.j
            r1.j(r6, r9, r5)
            goto L8a
        Lb2:
            if (r1 == 0) goto Lbb
            android.view.ViewGroup$LayoutParams r9 = r1.j()
            r2.j(r9)
        Lbb:
            boolean r9 = r2 instanceof com.bytedance.adsdk.ugeno.xt.j
            if (r9 == 0) goto L152
            java.util.List r8 = r8.up()
            if (r8 == 0) goto L114
            int r9 = r8.size()
            if (r9 > 0) goto Lcc
            goto L114
        Lcc:
            java.lang.String r9 = r2.gq()
            java.lang.String r0 = "Swiper"
            boolean r9 = android.text.TextUtils.equals(r9, r0)
            if (r9 == 0) goto Le5
            int r9 = r8.size()
            if (r9 == r3) goto Le5
            java.lang.String r9 = "UGTemplateEngine"
            java.lang.String r0 = "Swiper must be only one widget"
            com.bytedance.sdk.component.utils.vl.r(r9, r0)
        Le5:
            com.bytedance.adsdk.ugeno.cw.az$1 r9 = new com.bytedance.adsdk.ugeno.cw.az$1     // Catch: java.lang.Throwable -> Led
            r9.<init>(r7)     // Catch: java.lang.Throwable -> Led
            java.util.Collections.sort(r8, r9)     // Catch: java.lang.Throwable -> Led
        Led:
            java.util.Iterator r8 = r8.iterator()
        Lf1:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L152
            java.lang.Object r9 = r8.next()
            com.bytedance.adsdk.ugeno.cw.g$j r9 = (com.bytedance.adsdk.ugeno.cw.g.j) r9
            com.bytedance.adsdk.ugeno.xt.cw r9 = r7.j(r9, r2)
            if (r9 == 0) goto Lf1
            boolean r0 = r9.e()
            if (r0 != 0) goto Lf1
            r0 = r2
            com.bytedance.adsdk.ugeno.xt.j r0 = (com.bytedance.adsdk.ugeno.xt.j) r0
            android.view.ViewGroup$LayoutParams r1 = r9.a()
            r0.j(r9, r1)
            goto Lf1
        L114:
            java.lang.String r8 = r2.gq()
            java.lang.String r9 = "RecyclerLayout"
            boolean r8 = android.text.TextUtils.equals(r8, r9)
            if (r8 == 0) goto L151
            com.bytedance.adsdk.ugeno.cw.g r8 = r7.g
            java.util.List r8 = r8.cw()
            if (r8 == 0) goto L151
            int r9 = r8.size()
            if (r9 <= 0) goto L151
            java.util.Iterator r8 = r8.iterator()
        L132:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L151
            java.lang.Object r9 = r8.next()
            com.bytedance.adsdk.ugeno.cw.g$j r9 = (com.bytedance.adsdk.ugeno.cw.g.j) r9
            com.bytedance.adsdk.ugeno.xt.cw r9 = r7.j(r9, r2)
            if (r9 == 0) goto L132
            boolean r0 = r9.ed()
            if (r0 == 0) goto L132
            r0 = r2
            com.bytedance.adsdk.ugeno.xt.j r0 = (com.bytedance.adsdk.ugeno.xt.j) r0
            r0.j(r9)
            goto L132
        L151:
            return r2
        L152:
            r7.cw = r2
            return r2
    }

    public com.bytedance.adsdk.ugeno.xt.cw<android.view.View> j(org.json.JSONObject r3) {
            r2 = this;
            com.bytedance.adsdk.ugeno.cw.f r0 = r2.f1909m
            if (r0 == 0) goto L7
            r0.j()
        L7:
            com.bytedance.adsdk.ugeno.cw.g r0 = new com.bytedance.adsdk.ugeno.cw.g
            org.json.JSONObject r1 = r2.xt
            r0.<init>(r3, r1)
            r2.g = r0
            com.bytedance.adsdk.ugeno.cw.w r3 = r2.up
            boolean r1 = r3 instanceof com.bytedance.adsdk.ugeno.cw.j.xt
            if (r1 == 0) goto L1f
            com.bytedance.adsdk.ugeno.cw.j.xt r3 = (com.bytedance.adsdk.ugeno.cw.j.xt) r3
            java.lang.String r0 = r0.xt()
            r3.j(r0)
        L1f:
            com.bytedance.adsdk.ugeno.cw.g r3 = r2.g
            com.bytedance.adsdk.ugeno.cw.g$j r3 = r3.j()
            r0 = 0
            com.bytedance.adsdk.ugeno.xt.cw r3 = r2.xt(r3, r0)
            r2.cw = r3
            com.bytedance.adsdk.ugeno.cw.f r3 = r2.f1909m
            if (r3 == 0) goto L3a
            r3.xt()
            com.bytedance.adsdk.ugeno.xt.cw<android.view.View> r3 = r2.cw
            com.bytedance.adsdk.ugeno.cw.f r0 = r2.f1909m
            r3.j(r0)
        L3a:
            com.bytedance.adsdk.ugeno.xt.cw<android.view.View> r3 = r2.cw
            return r3
    }

    public com.bytedance.adsdk.ugeno.xt.cw<android.view.View> j(org.json.JSONObject r2, org.json.JSONObject r3, org.json.JSONObject r4) {
            r1 = this;
            r1.xt = r3
            com.bytedance.adsdk.ugeno.cw.f r0 = r1.f1909m
            if (r0 == 0) goto L9
            r0.j()
        L9:
            com.bytedance.adsdk.ugeno.cw.g r0 = new com.bytedance.adsdk.ugeno.cw.g
            r0.<init>(r2, r3, r4)
            r1.g = r0
            float r2 = r1.kt
            float r3 = r1.tj
            r0.j(r2, r3)
            com.bytedance.adsdk.ugeno.up.j.j r2 = new com.bytedance.adsdk.ugeno.up.j.j
            r2.<init>()
            r1.az = r2
            com.bytedance.adsdk.ugeno.cw.w r2 = r1.up
            boolean r3 = r2 instanceof com.bytedance.adsdk.ugeno.cw.j.xt
            if (r3 == 0) goto L2f
            com.bytedance.adsdk.ugeno.cw.j.xt r2 = (com.bytedance.adsdk.ugeno.cw.j.xt) r2
            com.bytedance.adsdk.ugeno.cw.g r3 = r1.g
            java.lang.String r3 = r3.xt()
            r2.j(r3)
        L2f:
            com.bytedance.adsdk.ugeno.cw.g r2 = r1.g
            com.bytedance.adsdk.ugeno.cw.g$j r2 = r2.j()
            r3 = 0
            com.bytedance.adsdk.ugeno.xt.cw r2 = r1.j(r2, r3)
            r1.cw = r2
            com.bytedance.adsdk.ugeno.cw.qv r2 = r1.f
            if (r2 == 0) goto L59
            r2.xt()
            com.bytedance.adsdk.ugeno.cw.qv r2 = r1.f
            boolean r2 = r2.cw()
            if (r2 == 0) goto L52
            com.bytedance.adsdk.ugeno.cw.qv r2 = r1.f
            com.bytedance.adsdk.ugeno.cw.mi r3 = r1.tl
            r2.j(r3)
        L52:
            com.bytedance.adsdk.ugeno.cw.qv r2 = r1.f
            com.bytedance.adsdk.ugeno.cw.f r3 = r1.f1909m
            r2.j(r3)
        L59:
            com.bytedance.adsdk.ugeno.cw.f r2 = r1.f1909m
            if (r2 == 0) goto L6c
            r2.xt()
            com.bytedance.adsdk.ugeno.xt.cw<android.view.View> r2 = r1.cw
            com.bytedance.adsdk.ugeno.cw.f r3 = r1.f1909m
            r2.j(r3)
            com.bytedance.adsdk.ugeno.cw.f r2 = r1.f1909m
            r2.cw()
        L6c:
            com.bytedance.adsdk.ugeno.xt.cw<android.view.View> r2 = r1.cw
            r1.xt(r2)
            com.bytedance.adsdk.ugeno.cw.f r2 = r1.f1909m
            if (r2 == 0) goto L88
            com.bytedance.adsdk.ugeno.cw.tj r2 = new com.bytedance.adsdk.ugeno.cw.tj
            r2.<init>()
            r3 = 0
            r2.j(r3)
            com.bytedance.adsdk.ugeno.xt.cw<android.view.View> r3 = r1.cw
            r2.j(r3)
            com.bytedance.adsdk.ugeno.cw.f r3 = r1.f1909m
            r3.j(r2)
        L88:
            com.bytedance.adsdk.ugeno.xt.cw<android.view.View> r2 = r1.cw
            return r2
    }

    public void j(com.bytedance.adsdk.ugeno.cw.kt r1) {
            r0 = this;
            r0.ae = r1
            return
    }

    public void j(com.bytedance.adsdk.ugeno.cw.oq r1) {
            r0 = this;
            r0.f1910r = r1
            return
    }

    public void j(com.bytedance.adsdk.ugeno.cw.tl r1) {
            r0 = this;
            r0.f1911w = r1
            return
    }

    public void j(com.bytedance.adsdk.ugeno.cw.w r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.r r0 = com.bytedance.adsdk.ugeno.r.j()
            com.bytedance.adsdk.ugeno.cw.j.j r0 = r0.up()
            if (r0 != 0) goto Ld
            r1.up = r2
            return
        Ld:
            com.bytedance.adsdk.ugeno.cw.j.xt r0 = r0.j(r2)
            if (r0 != 0) goto L16
            r1.up = r2
            return
        L16:
            org.json.JSONObject r2 = r1.vl
            r0.j(r2)
            boolean r2 = r1.jy
            r0.j(r2)
            boolean r2 = r1.ws
            r0.xt(r2)
            com.bytedance.adsdk.ugeno.cw.g r2 = r1.g
            if (r2 == 0) goto L30
            java.lang.String r2 = r2.xt()
            r0.j(r2)
        L30:
            r1.up = r0
            return
    }

    public void j(com.bytedance.adsdk.ugeno.xt.cw r6) {
            r5 = this;
            if (r6 != 0) goto L3
            goto L66
        L3:
            com.bytedance.adsdk.ugeno.xt.j r0 = r6.h()
            if (r0 == 0) goto L3f
            com.bytedance.adsdk.ugeno.xt.j$j r0 = r0.tl()
            org.json.JSONObject r1 = r6.x()
            java.util.Iterator r1 = r1.keys()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            org.json.JSONObject r3 = r6.x()
            java.lang.String r3 = r3.optString(r2)
            org.json.JSONObject r4 = r5.xt
            java.lang.String r3 = com.bytedance.adsdk.ugeno.r.xt.j(r3, r4)
            r6.j(r2, r3)
            android.content.Context r4 = r5.j
            r0.j(r4, r2, r3)
            goto L15
        L38:
            android.view.ViewGroup$LayoutParams r0 = r0.j()
            r6.j(r0)
        L3f:
            boolean r0 = r6 instanceof com.bytedance.adsdk.ugeno.xt.j
            if (r0 == 0) goto L66
            com.bytedance.adsdk.ugeno.xt.j r6 = (com.bytedance.adsdk.ugeno.xt.j) r6
            java.util.List r6 = r6.ae()
            if (r6 == 0) goto L66
            int r0 = r6.size()
            if (r0 > 0) goto L52
            goto L66
        L52:
            java.util.Iterator r6 = r6.iterator()
        L56:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r0 = r6.next()
            com.bytedance.adsdk.ugeno.xt.cw r0 = (com.bytedance.adsdk.ugeno.xt.cw) r0
            r5.j(r0)
            goto L56
        L66:
            return
    }

    public void j(com.bytedance.adsdk.ugeno.xt.cw r2, java.lang.String r3, java.lang.Object... r4) {
            r1 = this;
            if (r2 != 0) goto L3
            goto L2d
        L3:
            r2.j(r3, r4)
            boolean r0 = r2 instanceof com.bytedance.adsdk.ugeno.xt.j
            if (r0 == 0) goto L2d
            com.bytedance.adsdk.ugeno.xt.j r2 = (com.bytedance.adsdk.ugeno.xt.j) r2
            java.util.List r2 = r2.ae()
            if (r2 == 0) goto L2d
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L19
            goto L2d
        L19:
            java.util.Iterator r2 = r2.iterator()
        L1d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r2.next()
            com.bytedance.adsdk.ugeno.xt.cw r0 = (com.bytedance.adsdk.ugeno.xt.cw) r0
            r1.j(r0, r3, r4)
            goto L1d
        L2d:
            return
    }

    public void j(com.bytedance.adsdk.ugeno.xt.cw r2, org.json.JSONObject r3) {
            r1 = this;
            if (r2 != 0) goto L3
            goto L2d
        L3:
            boolean r0 = r2 instanceof com.bytedance.adsdk.ugeno.xt.j
            if (r0 == 0) goto L2e
            r2.j(r3)
            com.bytedance.adsdk.ugeno.xt.j r2 = (com.bytedance.adsdk.ugeno.xt.j) r2
            java.util.List r2 = r2.ae()
            if (r2 == 0) goto L2d
            int r0 = r2.size()
            if (r0 > 0) goto L19
            goto L2d
        L19:
            java.util.Iterator r2 = r2.iterator()
        L1d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r2.next()
            com.bytedance.adsdk.ugeno.xt.cw r0 = (com.bytedance.adsdk.ugeno.xt.cw) r0
            r1.j(r0, r3)
            goto L1d
        L2d:
            return
        L2e:
            r2.j(r3)
            return
    }

    public void j(java.lang.String r1, com.bytedance.adsdk.ugeno.cw.ws r2) {
            r0 = this;
            r0.qv = r2
            r0.oq = r1
            if (r2 == 0) goto Lc
            org.json.JSONObject r1 = r2.j()
            r0.xt = r1
        Lc:
            return
    }

    public boolean j() {
            r1 = this;
            boolean r0 = r1.av
            return r0
    }

    public com.bytedance.adsdk.ugeno.xt.cw<android.view.View> xt(com.bytedance.adsdk.ugeno.cw.g.j r7, com.bytedance.adsdk.ugeno.xt.cw<android.view.View> r8) {
            r6 = this;
            boolean r0 = com.bytedance.adsdk.ugeno.cw.g.r(r7)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.bytedance.adsdk.ugeno.cw.tl r0 = r6.f1911w
            if (r0 == 0) goto Lf
            r0.xt(r7)
        Lf:
            java.lang.String r0 = r7.cw()
            com.bytedance.adsdk.ugeno.cw.xt r2 = com.bytedance.adsdk.ugeno.cw.r.j(r0)
            r3 = 1
            if (r2 != 0) goto L2d
            r6.av = r3
            java.util.List<java.lang.String> r7 = r6.i
            if (r7 != 0) goto L27
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.i = r7
        L27:
            java.util.List<java.lang.String> r7 = r6.i
            r7.add(r0)
            return r1
        L2d:
            android.content.Context r4 = r6.j
            com.bytedance.adsdk.ugeno.xt.cw r2 = r2.j(r4)
            if (r2 != 0) goto L36
            return r1
        L36:
            java.lang.String r4 = r7.j()
            org.json.JSONObject r5 = r6.xt
            java.lang.String r4 = com.bytedance.adsdk.ugeno.r.xt.j(r4, r5)
            r2.ae(r4)
            r2.tl(r0)
            org.json.JSONObject r0 = r7.r()
            r2.cw(r0)
            r2.j(r7)
            com.bytedance.adsdk.ugeno.cw.ws r0 = r6.qv
            r2.j(r0)
            boolean r0 = r8 instanceof com.bytedance.adsdk.ugeno.xt.j
            if (r0 == 0) goto L62
            com.bytedance.adsdk.ugeno.xt.j r8 = (com.bytedance.adsdk.ugeno.xt.j) r8
            r2.j(r8)
            com.bytedance.adsdk.ugeno.xt.j$j r1 = r8.tl()
        L62:
            org.json.JSONObject r8 = r7.r()
            java.util.Iterator r8 = r8.keys()
        L6a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            org.json.JSONObject r4 = r7.r()
            java.lang.String r4 = r4.optString(r0)
            org.json.JSONObject r5 = r6.xt
            java.lang.String r4 = com.bytedance.adsdk.ugeno.r.xt.j(r4, r5)
            r2.j(r0, r4)
            if (r1 == 0) goto L6a
            android.content.Context r5 = r6.j
            r1.j(r5, r0, r4)
            goto L6a
        L8f:
            boolean r8 = r2 instanceof com.bytedance.adsdk.ugeno.xt.j
            if (r8 == 0) goto L11a
            java.util.List r7 = r7.up()
            if (r7 == 0) goto Ldc
            int r8 = r7.size()
            if (r8 > 0) goto La0
            goto Ldc
        La0:
            java.lang.String r8 = r2.gq()
            java.lang.String r0 = "Swiper"
            boolean r8 = android.text.TextUtils.equals(r8, r0)
            if (r8 == 0) goto Lb9
            int r8 = r7.size()
            if (r8 == r3) goto Lb9
            java.lang.String r8 = "UGTemplateEngine"
            java.lang.String r0 = "Swiper must be only one widget"
            com.bytedance.sdk.component.utils.vl.r(r8, r0)
        Lb9:
            java.util.Iterator r7 = r7.iterator()
        Lbd:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L11a
            java.lang.Object r8 = r7.next()
            com.bytedance.adsdk.ugeno.cw.g$j r8 = (com.bytedance.adsdk.ugeno.cw.g.j) r8
            com.bytedance.adsdk.ugeno.xt.cw r8 = r6.xt(r8, r2)
            if (r8 == 0) goto Lbd
            boolean r0 = r8.ed()
            if (r0 == 0) goto Lbd
            r0 = r2
            com.bytedance.adsdk.ugeno.xt.j r0 = (com.bytedance.adsdk.ugeno.xt.j) r0
            r0.j(r8)
            goto Lbd
        Ldc:
            java.lang.String r7 = r2.gq()
            java.lang.String r8 = "RecyclerLayout"
            boolean r7 = android.text.TextUtils.equals(r7, r8)
            if (r7 == 0) goto L119
            com.bytedance.adsdk.ugeno.cw.g r7 = r6.g
            java.util.List r7 = r7.cw()
            if (r7 == 0) goto L119
            int r8 = r7.size()
            if (r8 <= 0) goto L119
            java.util.Iterator r7 = r7.iterator()
        Lfa:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L119
            java.lang.Object r8 = r7.next()
            com.bytedance.adsdk.ugeno.cw.g$j r8 = (com.bytedance.adsdk.ugeno.cw.g.j) r8
            com.bytedance.adsdk.ugeno.xt.cw r8 = r6.xt(r8, r2)
            if (r8 == 0) goto Lfa
            boolean r0 = r8.ed()
            if (r0 == 0) goto Lfa
            r0 = r2
            com.bytedance.adsdk.ugeno.xt.j r0 = (com.bytedance.adsdk.ugeno.xt.j) r0
            r0.j(r8)
            goto Lfa
        L119:
            return r2
        L11a:
            if (r1 == 0) goto L123
            android.view.ViewGroup$LayoutParams r7 = r1.j()
            r2.j(r7)
        L123:
            r6.cw = r2
            return r2
    }

    public java.util.List<java.lang.String> xt() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.i
            return r0
    }

    public void xt(org.json.JSONObject r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.cw.f r0 = r1.f1909m
            if (r0 == 0) goto L7
            r0.cw()
        L7:
            r1.xt = r2
            com.bytedance.adsdk.ugeno.xt.cw<android.view.View> r0 = r1.cw
            r1.j(r0, r2)
            com.bytedance.adsdk.ugeno.xt.cw<android.view.View> r2 = r1.cw
            r1.xt(r2)
            com.bytedance.adsdk.ugeno.cw.f r2 = r1.f1909m
            if (r2 == 0) goto L2a
            com.bytedance.adsdk.ugeno.cw.tj r2 = new com.bytedance.adsdk.ugeno.cw.tj
            r2.<init>()
            r0 = 0
            r2.j(r0)
            com.bytedance.adsdk.ugeno.xt.cw<android.view.View> r0 = r1.cw
            r2.j(r0)
            com.bytedance.adsdk.ugeno.cw.f r0 = r1.f1909m
            r0.j(r2)
        L2a:
            return
    }
}
