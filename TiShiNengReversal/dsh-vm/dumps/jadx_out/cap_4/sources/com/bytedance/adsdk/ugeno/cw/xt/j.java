package com.bytedance.adsdk.ugeno.cw.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private java.util.Set<java.lang.String> cw;
    public java.lang.String j;
    private java.util.List<android.view.MotionEvent> xt;


    public j() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "GesThrough_"
            r1.j = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.xt = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            r1.cw = r0
            return
    }

    static /* synthetic */ java.util.List j(com.bytedance.adsdk.ugeno.cw.xt.j r0) {
            java.util.List<android.view.MotionEvent> r0 = r0.xt
            return r0
    }

    static /* synthetic */ java.util.Set xt(com.bytedance.adsdk.ugeno.cw.xt.j r0) {
            java.util.Set<java.lang.String> r0 = r0.cw
            return r0
    }

    public void j(com.bytedance.adsdk.ugeno.xt.cw r5) {
            r4 = this;
            java.util.List<android.view.MotionEvent> r0 = r4.xt
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L40
            java.util.Set<java.lang.String> r0 = r4.cw
            if (r0 != 0) goto Ld
            goto L40
        Ld:
            if (r5 == 0) goto L40
            android.view.View r0 = r5.g()
            if (r0 == 0) goto L40
            android.view.View r0 = r5.g()
            android.view.View r0 = r0.getRootView()
            if (r0 != 0) goto L20
            goto L40
        L20:
            android.view.View r5 = r5.g()
            android.view.View r5 = r5.getRootView()
            java.util.List<android.view.MotionEvent> r0 = r4.xt
            r0.size()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.bytedance.adsdk.ugeno.cw.xt.j$1 r1 = new com.bytedance.adsdk.ugeno.cw.xt.j$1
            r1.<init>(r4, r5)
            r2 = 300(0x12c, double:1.48E-321)
            r0.postDelayed(r1, r2)
        L40:
            return
    }

    public void j(com.bytedance.adsdk.ugeno.xt.cw r3, android.view.MotionEvent r4) {
            r2 = this;
            if (r3 == 0) goto L46
            if (r4 == 0) goto L46
            java.util.List<android.view.MotionEvent> r0 = r2.xt
            if (r0 != 0) goto L9
            goto L46
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GesThrough_"
            r0.<init>(r1)
            java.lang.String r1 = r3.la()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.j = r0
            android.view.View r3 = r3.g()
            r0 = 2
            int[] r0 = new int[r0]
            r3.getLocationInWindow(r0)
            r3 = 0
            r3 = r0[r3]
            r1 = 1
            r0 = r0[r1]
            int r1 = r4.getAction()
            if (r1 != 0) goto L38
            java.util.List<android.view.MotionEvent> r1 = r2.xt
            r1.clear()
        L38:
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r4)
            float r3 = (float) r3
            float r0 = (float) r0
            r4.offsetLocation(r3, r0)
            java.util.List<android.view.MotionEvent> r3 = r2.xt
            r3.add(r4)
        L46:
            return
    }

    public boolean j(android.view.MotionEvent r4) {
            r3 = this;
            if (r4 == 0) goto L2e
            java.util.Set<java.lang.String> r0 = r3.cw
            if (r0 != 0) goto L7
            goto L2e
        L7:
            int r0 = r4.getActionIndex()
            int r0 = r4.getPointerId(r0)
            long r1 = r4.getDownTime()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = "_"
            r4.append(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.util.Set<java.lang.String> r0 = r3.cw
            boolean r4 = r0.contains(r4)
            return r4
        L2e:
            r4 = 0
            return r4
    }
}
