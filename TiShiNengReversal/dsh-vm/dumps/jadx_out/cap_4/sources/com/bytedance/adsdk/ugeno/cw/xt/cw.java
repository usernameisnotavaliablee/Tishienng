package com.bytedance.adsdk.ugeno.cw.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw {
    private com.bytedance.adsdk.ugeno.cw.av cw;
    private float j;

    /* renamed from: m, reason: collision with root package name */
    private final int f1930m;

    /* renamed from: r, reason: collision with root package name */
    private android.content.Context f1931r;
    private boolean up;
    private float xt;

    public cw(android.content.Context r1, com.bytedance.adsdk.ugeno.cw.av r2) {
            r0 = this;
            r0.<init>()
            r0.f1931r = r1
            r0.cw = r2
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            int r1 = r1.getScaledTouchSlop()
            r0.f1930m = r1
            return
    }

    public boolean j(com.bytedance.adsdk.ugeno.cw.w r5, com.bytedance.adsdk.ugeno.xt.cw r6, android.view.MotionEvent r7) {
            r4 = this;
            int r0 = r7.getAction()
            r1 = 1
            if (r0 == 0) goto L72
            r2 = 0
            if (r0 == r1) goto L3b
            r5 = 2
            if (r0 == r5) goto L14
            r5 = 3
            if (r0 == r5) goto L11
            goto L7e
        L11:
            r4.up = r2
            goto L7e
        L14:
            float r5 = r7.getX()
            float r6 = r7.getY()
            float r7 = r4.j
            float r5 = r5 - r7
            float r5 = java.lang.Math.abs(r5)
            int r7 = r4.f1930m
            float r7 = (float) r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L38
            float r5 = r4.xt
            float r6 = r6 - r5
            float r5 = java.lang.Math.abs(r6)
            int r6 = r4.f1930m
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 < 0) goto L7e
        L38:
            r4.up = r1
            goto L7e
        L3b:
            boolean r0 = r4.up
            if (r0 == 0) goto L42
            r4.up = r2
            return r2
        L42:
            float r0 = r7.getX()
            float r7 = r7.getY()
            float r3 = r4.j
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            int r3 = r4.f1930m
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L6f
            float r0 = r4.xt
            float r7 = r7 - r0
            float r7 = java.lang.Math.abs(r7)
            int r0 = r4.f1930m
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 < 0) goto L67
            goto L6f
        L67:
            if (r5 == 0) goto L7e
            com.bytedance.adsdk.ugeno.cw.av r7 = r4.cw
            r5.j(r7, r6, r6)
            return r1
        L6f:
            r4.up = r2
            goto L7e
        L72:
            float r5 = r7.getX()
            r4.j = r5
            float r5 = r7.getY()
            r4.xt = r5
        L7e:
            return r1
    }
}
