package com.bytedance.adsdk.ugeno.cw.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class up {
    private com.bytedance.adsdk.ugeno.cw.av ae;
    private int cw;
    private java.lang.String g;
    private float j;
    private com.bytedance.adsdk.ugeno.cw.xt.j jy;

    /* renamed from: m, reason: collision with root package name */
    private java.util.concurrent.atomic.AtomicBoolean f1934m;
    private android.content.Context oq;
    private boolean qv;

    /* renamed from: r, reason: collision with root package name */
    private int f1935r;
    private com.bytedance.adsdk.ugeno.cw.av tl;
    private int up;
    private boolean vl;
    private float xt;


    public up(android.content.Context r3, com.bytedance.adsdk.ugeno.cw.av r4, com.bytedance.adsdk.ugeno.cw.av r5, boolean r6, boolean r7) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.j = r0
            r2.xt = r0
            r0 = 0
            r2.cw = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.f1935r = r0
            r2.up = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 1
            r0.<init>(r1)
            r2.f1934m = r0
            r2.oq = r3
            r2.ae = r4
            r2.tl = r5
            r2.qv = r6
            r2.vl = r7
            r2.cw()
            return
    }

    public up(android.content.Context r3, com.bytedance.adsdk.ugeno.cw.av r4, boolean r5, boolean r6) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.j = r0
            r2.xt = r0
            r0 = 0
            r2.cw = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.f1935r = r0
            r2.up = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 1
            r0.<init>(r1)
            r2.f1934m = r0
            r2.oq = r3
            r2.ae = r4
            r2.qv = r5
            r2.vl = r6
            r2.cw()
            return
    }

    private void cw() {
            r3 = this;
            boolean r0 = r3.vl
            if (r0 == 0) goto Lb
            com.bytedance.adsdk.ugeno.cw.xt.j r0 = new com.bytedance.adsdk.ugeno.cw.xt.j
            r0.<init>()
            r3.jy = r0
        Lb:
            com.bytedance.adsdk.ugeno.cw.av r0 = r3.ae
            if (r0 != 0) goto L10
            return
        L10:
            org.json.JSONObject r0 = r0.cw()
            java.lang.String r1 = "slideThreshold"
            int r0 = r0.optInt(r1)
            r3.cw = r0
            com.bytedance.adsdk.ugeno.cw.av r0 = r3.ae
            org.json.JSONObject r0 = r0.cw()
            java.lang.String r1 = "slideDirection"
            java.lang.String r0 = r0.optString(r1)
            r3.g = r0
            com.bytedance.adsdk.ugeno.cw.av r0 = r3.ae
            org.json.JSONObject r0 = r0.cw()
            java.lang.String r1 = "frequency"
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r0 = r0.optInt(r1, r2)
            r3.f1935r = r0
            com.bytedance.adsdk.ugeno.cw.av r0 = r3.ae
            org.json.JSONObject r0 = r0.cw()
            java.lang.String r1 = "effectiveDuration"
            int r0 = r0.optInt(r1, r2)
            r3.up = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f1934m
            r0.get()
            return
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean j(com.bytedance.adsdk.ugeno.cw.xt.up r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f1934m
            return r0
    }

    private void j(com.bytedance.adsdk.ugeno.cw.w r2, com.bytedance.adsdk.ugeno.cw.av r3, com.bytedance.adsdk.ugeno.xt.cw r4) {
            r1 = this;
            int r0 = r1.f1935r
            if (r0 > 0) goto L8
            r1.j(r4)
            return
        L8:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f1934m
            boolean r0 = r0.get()
            if (r0 != 0) goto L14
            r1.j(r4)
            return
        L14:
            r2.j(r3, r4, r4)
            int r2 = r1.f1935r
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r3) goto L22
            int r2 = r2 + (-1)
            r1.f1935r = r2
        L22:
            return
    }

    private void j(com.bytedance.adsdk.ugeno.xt.cw r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.cw.xt.j r0 = r1.jy
            if (r0 == 0) goto L7
            r0.j(r2)
        L7:
            return
    }

    public void j() {
            r4 = this;
            int r0 = r4.up
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L8
            return
        L8:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.bytedance.adsdk.ugeno.cw.xt.up$1 r1 = new com.bytedance.adsdk.ugeno.cw.xt.up$1
            r1.<init>(r4)
            int r2 = r4.up
            long r2 = (long) r2
            r0.postDelayed(r1, r2)
            return
    }

    public boolean j(com.bytedance.adsdk.ugeno.cw.w r7, com.bytedance.adsdk.ugeno.xt.cw r8, android.view.MotionEvent r9, boolean r10) {
            r6 = this;
            com.bytedance.adsdk.ugeno.cw.xt.j r10 = r6.jy
            r0 = 0
            if (r10 == 0) goto L11
            boolean r10 = r10.j(r9)
            if (r10 == 0) goto Lc
            return r0
        Lc:
            com.bytedance.adsdk.ugeno.cw.xt.j r10 = r6.jy
            r10.j(r8, r9)
        L11:
            int r10 = r9.getAction()
            r1 = 1
            if (r10 == 0) goto Lde
            if (r10 == r1) goto L2d
            r2 = 3
            if (r10 == r2) goto L1f
            goto Lea
        L1f:
            float r10 = r6.j
            r2 = 1
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 == 0) goto L2c
            float r10 = r6.xt
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 != 0) goto L2d
        L2c:
            return r0
        L2d:
            float r10 = r9.getX()
            float r9 = r9.getY()
            boolean r2 = r6.qv
            if (r2 == 0) goto L5e
            float r2 = r6.j
            float r2 = r10 - r2
            float r2 = java.lang.Math.abs(r2)
            r3 = 1092616192(0x41200000, float:10.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L5e
            float r2 = r6.xt
            float r2 = r9 - r2
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L5e
            if (r7 == 0) goto L5e
            r6.xt()
            com.bytedance.adsdk.ugeno.cw.av r9 = r6.tl
            r7.j(r9, r8, r8)
            return r1
        L5e:
            int r2 = r6.cw
            if (r2 != 0) goto L6d
            if (r7 == 0) goto L6d
            r6.xt()
            com.bytedance.adsdk.ugeno.cw.av r9 = r6.ae
            r6.j(r7, r9, r8)
            return r1
        L6d:
            android.content.Context r2 = r6.oq
            float r3 = r6.j
            float r10 = r10 - r3
            int r10 = com.bytedance.adsdk.ugeno.m.tl.xt(r2, r10)
            android.content.Context r2 = r6.oq
            float r3 = r6.xt
            float r9 = r9 - r3
            int r9 = com.bytedance.adsdk.ugeno.m.tl.xt(r2, r9)
            java.lang.String r2 = r6.g
            java.lang.String r3 = "up"
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L8b
            int r10 = -r9
            goto Lc4
        L8b:
            java.lang.String r2 = r6.g
            java.lang.String r3 = "down"
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 != 0) goto Lc3
            java.lang.String r2 = r6.g
            java.lang.String r3 = "left"
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto La1
            int r10 = -r10
            goto Lc4
        La1:
            java.lang.String r2 = r6.g
            java.lang.String r3 = "right"
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto Lac
            goto Lc4
        Lac:
            double r2 = (double) r10
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = java.lang.Math.pow(r2, r4)
            double r9 = (double) r9
            double r9 = java.lang.Math.pow(r9, r4)
            double r2 = r2 + r9
            double r9 = java.lang.Math.sqrt(r2)
            double r9 = java.lang.Math.abs(r9)
            int r10 = (int) r9
            goto Lc4
        Lc3:
            r10 = r9
        Lc4:
            int r9 = r6.cw
            if (r10 < r9) goto Ld7
            if (r7 == 0) goto Ld3
            r6.xt()
            com.bytedance.adsdk.ugeno.cw.av r9 = r6.ae
            r6.j(r7, r9, r8)
            return r1
        Ld3:
            r6.xt()
            goto Lea
        Ld7:
            r6.xt()
            r6.j(r8)
            return r0
        Lde:
            float r7 = r9.getX()
            r6.j = r7
            float r7 = r9.getY()
            r6.xt = r7
        Lea:
            return r1
    }

    public void xt() {
            r1 = this;
            r0 = 1
            r1.j = r0
            r1.xt = r0
            return
    }
}
