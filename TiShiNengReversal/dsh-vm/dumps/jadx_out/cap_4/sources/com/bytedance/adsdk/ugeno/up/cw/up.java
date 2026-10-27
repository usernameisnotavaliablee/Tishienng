package com.bytedance.adsdk.ugeno.up.cw;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class up extends com.bytedance.adsdk.ugeno.up.cw.xt {
    private boolean jy;
    private float qv;
    private float vl;
    private com.bytedance.adsdk.ugeno.cw.xt.j ws;

    public up(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public boolean j(com.bytedance.adsdk.ugeno.xt.cw r7, android.view.MotionEvent r8) {
            r6 = this;
            com.bytedance.adsdk.ugeno.cw.xt.j r0 = r6.ws
            r1 = 0
            if (r0 == 0) goto L11
            boolean r0 = r0.j(r8)
            if (r0 == 0) goto Lc
            return r1
        Lc:
            com.bytedance.adsdk.ugeno.cw.xt.j r0 = r6.ws
            r0.j(r7, r8)
        L11:
            int r0 = r8.getAction()
            r2 = 1
            if (r0 == 0) goto L99
            r3 = 1097859072(0x41700000, float:15.0)
            if (r0 == r2) goto L49
            r7 = 2
            if (r0 == r7) goto L28
            r7 = 3
            if (r0 == r7) goto L24
            goto La5
        L24:
            r6.jy = r1
            goto La5
        L28:
            float r7 = r8.getRawX()
            float r8 = r8.getRawY()
            float r0 = r6.qv
            float r7 = r7 - r0
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 >= 0) goto L46
            float r7 = r6.vl
            float r8 = r8 - r7
            float r7 = java.lang.Math.abs(r8)
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 < 0) goto La5
        L46:
            r6.jy = r2
            goto La5
        L49:
            boolean r0 = r6.jy
            r4 = 0
            if (r0 == 0) goto L5c
            r6.jy = r1
            r6.qv = r4
            r6.vl = r4
            com.bytedance.adsdk.ugeno.cw.xt.j r8 = r6.ws
            if (r8 == 0) goto L5b
            r8.j(r7)
        L5b:
            return r1
        L5c:
            float r0 = r8.getRawX()
            float r8 = r8.getRawY()
            float r5 = r6.qv
            float r0 = r0 - r5
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L8f
            float r0 = r6.vl
            float r8 = r8 - r0
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 < 0) goto L7b
            goto L8f
        L7b:
            com.bytedance.adsdk.ugeno.up.qv r8 = r6.j
            if (r8 == 0) goto La5
            java.lang.String r0 = r6.f1985m
            com.bytedance.adsdk.ugeno.up.m r1 = r6.cw
            java.util.List r1 = r1.xt()
            r8.j(r7, r0, r1)
            r6.qv = r4
            r6.vl = r4
            return r2
        L8f:
            r6.jy = r1
            com.bytedance.adsdk.ugeno.cw.xt.j r8 = r6.ws
            if (r8 == 0) goto La5
            r8.j(r7)
            goto La5
        L99:
            float r7 = r8.getRawX()
            r6.qv = r7
            float r7 = r8.getRawY()
            r6.vl = r7
        La5:
            return r2
    }

    @Override // com.bytedance.adsdk.ugeno.up.cw.xt
    public boolean j(java.lang.Object... r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L27
            int r1 = r3.length
            if (r1 > 0) goto L7
            goto L27
        L7:
            com.bytedance.adsdk.ugeno.xt.cw r1 = r2.xt
            if (r1 == 0) goto L1c
            boolean r1 = r1.q()
            if (r1 == 0) goto L1c
            com.bytedance.adsdk.ugeno.cw.xt.j r1 = r2.ws
            if (r1 != 0) goto L1c
            com.bytedance.adsdk.ugeno.cw.xt.j r1 = new com.bytedance.adsdk.ugeno.cw.xt.j
            r1.<init>()
            r2.ws = r1
        L1c:
            r3 = r3[r0]
            android.view.MotionEvent r3 = (android.view.MotionEvent) r3
            com.bytedance.adsdk.ugeno.xt.cw r0 = r2.xt
            boolean r3 = r2.j(r0, r3)
            return r3
        L27:
            return r0
    }
}
