package com.bytedance.adsdk.ugeno.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j extends android.animation.AnimatorListenerAdapter {
    private com.bytedance.adsdk.ugeno.j.j.j ae;
    private android.animation.ValueAnimator cw;
    private com.bytedance.adsdk.ugeno.j.xt g;
    private com.bytedance.adsdk.ugeno.xt.cw j;

    /* renamed from: m, reason: collision with root package name */
    private int f1953m;

    /* renamed from: r, reason: collision with root package name */
    private android.content.Context f1954r;
    private java.lang.String tl;
    private int up;
    private com.bytedance.adsdk.ugeno.j.cw xt;


    public j(android.content.Context r2, com.bytedance.adsdk.ugeno.xt.cw r3, com.bytedance.adsdk.ugeno.j.cw r4) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f1953m = r0
            r1.j = r3
            r1.xt = r4
            r1.f1954r = r2
            return
    }

    public void cw() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.cw
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }

    public void j() {
            r3 = this;
            android.animation.ValueAnimator r0 = r3.cw
            if (r0 == 0) goto L10
            int r1 = r3.up
            r2 = -2
            if (r1 == r2) goto L10
            int r1 = r3.f1953m
            if (r1 == 0) goto L10
            r0.start()
        L10:
            return
    }

    public void j(int r2, int r3) {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.j.j r0 = r1.ae
            if (r0 == 0) goto L7
            r0.j(r2, r3)
        L7:
            return
    }

    public void j(android.graphics.Canvas r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.j.j r0 = r1.ae
            if (r0 == 0) goto L7
            r0.j(r2)
        L7:
            return
    }

    public void j(com.bytedance.adsdk.ugeno.j.xt r1) {
            r0 = this;
            r0.g = r1
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r1) {
            r0 = this;
            super.onAnimationEnd(r1)
            com.bytedance.adsdk.ugeno.j.xt r1 = r0.g
            if (r1 == 0) goto La
            r1.xt()
        La:
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            super.onAnimationStart(r1)
            com.bytedance.adsdk.ugeno.j.xt r1 = r0.g
            if (r1 == 0) goto La
            r1.j()
        La:
            return
    }

    public android.animation.ValueAnimator r() {
            r9 = this;
            com.bytedance.adsdk.ugeno.j.cw r0 = r9.xt
            r1 = 0
            if (r0 == 0) goto L140
            com.bytedance.adsdk.ugeno.xt.cw r2 = r9.j
            if (r2 != 0) goto Lb
            goto L140
        Lb:
            java.util.Map r0 = r0.xt()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            if (r0 == 0) goto Lac
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto Lac
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L25:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lac
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            if (r4 == 0) goto L25
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            com.bytedance.adsdk.ugeno.j.up r6 = com.bytedance.adsdk.ugeno.j.up.j(r5)
            java.lang.String r6 = r6.cw()
            r6.getClass()
            int r7 = r6.hashCode()
            r8 = -1
            switch(r7) {
                case 104431: goto L63;
                case 97526364: goto L58;
                case 106845584: goto L4d;
                default: goto L4c;
            }
        L4c:
            goto L6d
        L4d:
            java.lang.String r7 = "point"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L56
            goto L6d
        L56:
            r8 = 2
            goto L6d
        L58:
            java.lang.String r7 = "float"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L61
            goto L6d
        L61:
            r8 = 1
            goto L6d
        L63:
            java.lang.String r7 = "int"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L6c
            goto L6d
        L6c:
            r8 = 0
        L6d:
            switch(r8) {
                case 0: goto L92;
                case 1: goto L82;
                case 2: goto L72;
                default: goto L70;
            }
        L70:
            r6 = r1
            goto La1
        L72:
            com.bytedance.adsdk.ugeno.j.xt.r r6 = new com.bytedance.adsdk.ugeno.j.xt.r
            android.content.Context r7 = r9.f1954r
            com.bytedance.adsdk.ugeno.xt.cw r8 = r9.j
            java.lang.Object r4 = r4.getValue()
            java.util.Map r4 = (java.util.Map) r4
            r6.<init>(r7, r8, r5, r4)
            goto La1
        L82:
            com.bytedance.adsdk.ugeno.j.xt.xt r6 = new com.bytedance.adsdk.ugeno.j.xt.xt
            android.content.Context r7 = r9.f1954r
            com.bytedance.adsdk.ugeno.xt.cw r8 = r9.j
            java.lang.Object r4 = r4.getValue()
            java.util.TreeMap r4 = (java.util.TreeMap) r4
            r6.<init>(r7, r8, r5, r4)
            goto La1
        L92:
            com.bytedance.adsdk.ugeno.j.xt.cw r6 = new com.bytedance.adsdk.ugeno.j.xt.cw
            android.content.Context r7 = r9.f1954r
            com.bytedance.adsdk.ugeno.xt.cw r8 = r9.j
            java.lang.Object r4 = r4.getValue()
            java.util.TreeMap r4 = (java.util.TreeMap) r4
            r6.<init>(r7, r8, r5, r4)
        La1:
            if (r6 == 0) goto L25
            java.util.List r4 = r6.up()
            r2.addAll(r4)
            goto L25
        Lac:
            com.bytedance.adsdk.ugeno.j.cw r0 = r9.xt
            org.json.JSONObject r0 = r0.j()
            if (r0 == 0) goto Lc5
            com.bytedance.adsdk.ugeno.xt.cw r4 = r9.j
            com.bytedance.adsdk.ugeno.j.j.j r0 = com.bytedance.adsdk.ugeno.j.j.j.C0189j.j(r4, r0)
            r9.ae = r0
            if (r0 == 0) goto Lc5
            java.util.List r0 = r0.cw()
            r2.addAll(r0)
        Lc5:
            com.bytedance.adsdk.ugeno.xt.cw r0 = r9.j
            android.view.View r0 = r0.g()
            if (r0 != 0) goto Lce
            return r1
        Lce:
            com.bytedance.adsdk.ugeno.j.cw r1 = r9.xt
            com.bytedance.adsdk.ugeno.j.cw$j r1 = r1.ae()
            if (r1 == 0) goto Lde
            com.bytedance.adsdk.ugeno.j.j$1 r4 = new com.bytedance.adsdk.ugeno.j.j$1
            r4.<init>(r9, r0, r1)
            r0.post(r4)
        Lde:
            android.animation.PropertyValuesHolder[] r1 = new android.animation.PropertyValuesHolder[r3]
            java.lang.Object[] r1 = r2.toArray(r1)
            android.animation.PropertyValuesHolder[] r1 = (android.animation.PropertyValuesHolder[]) r1
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r0, r1)
            com.bytedance.adsdk.ugeno.j.cw r1 = r9.xt
            int r1 = r1.r()
            int r1 = com.bytedance.adsdk.ugeno.j.r.j(r1)
            r9.up = r1
            com.bytedance.adsdk.ugeno.j.cw r1 = r9.xt
            long r1 = r1.cw()
            r0.setDuration(r1)
            int r1 = r9.up
            r2 = -2
            if (r1 == r2) goto L107
            r0.setRepeatCount(r1)
        L107:
            com.bytedance.adsdk.ugeno.j.cw r1 = r9.xt
            int r1 = r1.oq()
            r9.f1953m = r1
            com.bytedance.adsdk.ugeno.j.cw r1 = r9.xt
            java.lang.String r1 = r1.g()
            r9.tl = r1
            com.bytedance.adsdk.ugeno.j.cw r1 = r9.xt
            long r1 = r1.m()
            r0.setStartDelay(r1)
            com.bytedance.adsdk.ugeno.j.cw r1 = r9.xt
            java.lang.String r1 = r1.up()
            int r1 = com.bytedance.adsdk.ugeno.j.r.j(r1)
            r0.setRepeatMode(r1)
            com.bytedance.adsdk.ugeno.j.cw r1 = r9.xt
            java.lang.String r1 = r1.tl()
            android.view.animation.Interpolator r1 = com.bytedance.adsdk.ugeno.j.r.xt(r1)
            r0.setInterpolator(r1)
            r0.addListener(r9)
            r9.cw = r0
            return r0
        L140:
            return r1
    }

    public java.lang.String up() {
            r1 = this;
            java.lang.String r0 = r1.tl
            return r0
    }

    public void xt() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.cw
            if (r0 == 0) goto L7
            r0.start()
        L7:
            return
    }
}
