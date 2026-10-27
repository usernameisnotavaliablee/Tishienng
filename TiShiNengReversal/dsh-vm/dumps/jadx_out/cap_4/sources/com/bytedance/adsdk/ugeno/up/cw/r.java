package com.bytedance.adsdk.ugeno.up.cw;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r extends com.bytedance.adsdk.ugeno.up.cw.xt {
    private java.util.concurrent.atomic.AtomicBoolean av;
    private int az;
    private java.lang.String i;
    private int jy;
    private float qv;
    private float vl;

    /* renamed from: w, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.cw.xt.j f1984w;
    private int ws;

    public r(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 0
            r1.jy = r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.ws = r2
            r1.az = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r2.<init>(r0)
            r1.av = r2
            java.lang.String r2 = "up"
            r1.i = r2
            return
    }

    private void cw(com.bytedance.adsdk.ugeno.xt.cw r4) {
            r3 = this;
            int r0 = r3.ws
            if (r0 > 0) goto L8
            r3.xt(r4)
            return
        L8:
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.av
            boolean r0 = r0.get()
            if (r0 != 0) goto L14
            r3.xt(r4)
            return
        L14:
            com.bytedance.adsdk.ugeno.up.qv r0 = r3.j
            java.lang.String r1 = r3.f1985m
            com.bytedance.adsdk.ugeno.up.m r2 = r3.cw
            java.util.List r2 = r2.xt()
            r0.j(r4, r1, r2)
            int r4 = r3.ws
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r0) goto L2c
            int r4 = r4 + (-1)
            r3.ws = r4
        L2c:
            return
    }

    private void j() {
            r5 = this;
            int r0 = r5.az
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L24
            com.bytedance.adsdk.ugeno.xt.cw r0 = r5.xt
            if (r0 != 0) goto Lc
            goto L24
        Lc:
            long r0 = java.lang.System.currentTimeMillis()
            com.bytedance.adsdk.ugeno.xt.cw r2 = r5.xt
            long r2 = r2.v()
            long r0 = r0 - r2
            int r2 = r5.az
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L24
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.av
            r1 = 0
            r0.set(r1)
        L24:
            return
    }

    private boolean j(com.bytedance.adsdk.ugeno.xt.cw r10, android.view.MotionEvent r11) {
            r9 = this;
            com.bytedance.adsdk.ugeno.cw.xt.j r0 = r9.f1984w
            r1 = 0
            if (r0 == 0) goto L11
            boolean r0 = r0.j(r11)
            if (r0 == 0) goto Lc
            return r1
        Lc:
            com.bytedance.adsdk.ugeno.cw.xt.j r0 = r9.f1984w
            r0.j(r10, r11)
        L11:
            int r0 = r11.getAction()
            r2 = 1
            if (r0 == 0) goto La8
            if (r0 == r2) goto L1f
            r3 = 3
            if (r0 == r3) goto L1f
            goto Lb4
        L1f:
            float r0 = r11.getX()
            float r11 = r11.getY()
            int r3 = r9.jy
            if (r3 != 0) goto L33
            com.bytedance.adsdk.ugeno.up.qv r3 = r9.j
            if (r3 == 0) goto L33
            r9.cw(r10)
            return r2
        L33:
            android.content.Context r3 = r9.oq
            float r4 = r9.qv
            float r0 = r0 - r4
            int r0 = com.bytedance.adsdk.ugeno.m.tl.xt(r3, r0)
            android.content.Context r3 = r9.oq
            float r4 = r9.vl
            float r11 = r11 - r4
            int r11 = com.bytedance.adsdk.ugeno.m.tl.xt(r3, r11)
            java.lang.String r3 = r9.i
            int r4 = r3.hashCode()
            switch(r4) {
                case 3739: goto L73;
                case 96673: goto L6c;
                case 3089570: goto L62;
                case 3317767: goto L58;
                case 108511772: goto L4f;
                default: goto L4e;
            }
        L4e:
            goto L7d
        L4f:
            java.lang.String r4 = "right"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L7d
            goto L93
        L58:
            java.lang.String r4 = "left"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L7d
            int r0 = -r0
            goto L93
        L62:
            java.lang.String r4 = "down"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L7d
            r0 = r11
            goto L93
        L6c:
            java.lang.String r4 = "all"
            boolean r3 = r3.equals(r4)
            goto L7d
        L73:
            java.lang.String r4 = "up"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L7d
            int r0 = -r11
            goto L93
        L7d:
            double r3 = (double) r0
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.pow(r3, r5)
            double r7 = (double) r11
            double r5 = java.lang.Math.pow(r7, r5)
            double r3 = r3 + r5
            double r3 = java.lang.Math.sqrt(r3)
            double r3 = java.lang.Math.abs(r3)
            int r0 = (int) r3
        L93:
            int r11 = r9.jy
            if (r0 < r11) goto La4
            com.bytedance.adsdk.ugeno.up.qv r11 = r9.j
            if (r11 == 0) goto Lb4
            r11 = 0
            r9.qv = r11
            r9.vl = r11
            r9.cw(r10)
            return r2
        La4:
            r9.xt(r10)
            return r1
        La8:
            float r10 = r11.getX()
            r9.qv = r10
            float r10 = r11.getY()
            r9.vl = r10
        Lb4:
            return r2
    }

    private void xt(com.bytedance.adsdk.ugeno.xt.cw r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.cw.xt.j r0 = r1.f1984w
            if (r0 == 0) goto L7
            r0.j(r2)
        L7:
            return
    }

    @Override // com.bytedance.adsdk.ugeno.up.cw.xt
    public boolean j(java.lang.Object... r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L8a
            int r1 = r5.length
            if (r1 > 0) goto L8
            goto L8a
        L8:
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.up
            if (r1 == 0) goto L67
            java.lang.String r2 = "direction"
            java.lang.Object r1 = r1.get(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L1d
            java.lang.String r1 = "all"
            goto L25
        L1d:
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.up
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
        L25:
            r4.i = r1
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.up
            java.lang.String r2 = "distance"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.bytedance.adsdk.ugeno.m.cw.j(r1, r0)
            r4.jy = r1
            int r1 = r4.ws
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L4e
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.up
            java.lang.String r3 = "frequency"
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.bytedance.adsdk.ugeno.m.cw.j(r1, r2)
            r4.ws = r1
        L4e:
            int r1 = r4.az
            if (r1 != r2) goto L62
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.up
            java.lang.String r3 = "effectiveDuration"
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.bytedance.adsdk.ugeno.m.cw.j(r1, r2)
            r4.az = r1
        L62:
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.av
            r1.get()
        L67:
            com.bytedance.adsdk.ugeno.xt.cw r1 = r4.xt
            if (r1 == 0) goto L7c
            boolean r1 = r1.q()
            if (r1 == 0) goto L7c
            com.bytedance.adsdk.ugeno.cw.xt.j r1 = r4.f1984w
            if (r1 != 0) goto L7c
            com.bytedance.adsdk.ugeno.cw.xt.j r1 = new com.bytedance.adsdk.ugeno.cw.xt.j
            r1.<init>()
            r4.f1984w = r1
        L7c:
            r5 = r5[r0]
            android.view.MotionEvent r5 = (android.view.MotionEvent) r5
            r4.j()
            com.bytedance.adsdk.ugeno.xt.cw r0 = r4.xt
            boolean r5 = r4.j(r0, r5)
            return r5
        L8a:
            return r0
    }
}
