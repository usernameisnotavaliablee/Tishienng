package com.bytedance.adsdk.ugeno.flexbox;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw {
    int ae;
    int av;
    int az;
    int cw;
    int g;
    boolean i;
    int j;
    int jy;

    /* renamed from: m, reason: collision with root package name */
    int f1943m;
    float oq;
    float qv;

    /* renamed from: r, reason: collision with root package name */
    int f1944r;
    int tl;
    int up;
    int vl;

    /* renamed from: w, reason: collision with root package name */
    boolean f1945w;
    java.util.List<java.lang.Integer> ws;
    int xt;

    cw() {
            r1 = this;
            r1.<init>()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.j = r0
            r1.xt = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.cw = r0
            r1.f1944r = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.ws = r0
            return
    }

    public int j() {
            r1 = this;
            int r0 = r1.ae
            return r0
    }

    void j(android.view.View r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            com.bytedance.adsdk.ugeno.flexbox.xt r0 = (com.bytedance.adsdk.ugeno.flexbox.xt) r0
            int r1 = r4.j
            int r2 = r5.getLeft()
            int r3 = r0.jy()
            int r2 = r2 - r3
            int r2 = r2 - r6
            int r6 = java.lang.Math.min(r1, r2)
            r4.j = r6
            int r6 = r4.xt
            int r1 = r5.getTop()
            int r2 = r0.ws()
            int r1 = r1 - r2
            int r1 = r1 - r7
            int r6 = java.lang.Math.min(r6, r1)
            r4.xt = r6
            int r6 = r4.cw
            int r7 = r5.getRight()
            int r1 = r0.az()
            int r7 = r7 + r1
            int r7 = r7 + r8
            int r6 = java.lang.Math.max(r6, r7)
            r4.cw = r6
            int r6 = r4.f1944r
            int r5 = r5.getBottom()
            int r7 = r0.av()
            int r5 = r5 + r7
            int r5 = r5 + r9
            int r5 = java.lang.Math.max(r6, r5)
            r4.f1944r = r5
            return
    }

    public int xt() {
            r2 = this;
            int r0 = r2.tl
            int r1 = r2.g
            int r0 = r0 - r1
            return r0
    }
}
