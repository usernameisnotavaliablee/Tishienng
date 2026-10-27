package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class w implements android.app.Application.ActivityLifecycleCallbacks {
    private static int ae = -1;
    private static long cw;
    private static final java.util.HashSet<java.lang.Integer> g = null;
    private static int j;

    /* renamed from: m, reason: collision with root package name */
    private static java.lang.String f2115m;

    /* renamed from: r, reason: collision with root package name */
    private static java.lang.String f2116r;
    private static long up;
    private static com.bytedance.embedapplog.kc xt;
    private final com.bytedance.embedapplog.m tl;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 8
            r0.<init>(r1)
            com.bytedance.embedapplog.w.g = r0
            return
    }

    public w(com.bytedance.embedapplog.m r1) {
            r0 = this;
            r0.<init>()
            r0.tl = r1
            return
    }

    public static com.bytedance.embedapplog.kc j(com.bytedance.embedapplog.kc r3, long r4) {
            com.bytedance.embedapplog.ya r0 = r3.ae()
            com.bytedance.embedapplog.kc r0 = (com.bytedance.embedapplog.kc) r0
            r0.xt = r4
            long r1 = r3.xt
            long r4 = r4 - r1
            r1 = 0
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 < 0) goto L14
            r0.vl = r4
            goto L18
        L14:
            r3 = 0
            com.bytedance.embedapplog.uc.xt(r3)
        L18:
            com.bytedance.embedapplog.f.j(r0)
            return r0
    }

    public static com.bytedance.embedapplog.kc j(java.lang.String r2, java.lang.String r3, long r4, java.lang.String r6) {
            com.bytedance.embedapplog.kc r0 = new com.bytedance.embedapplog.kc
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L22
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = r1.toString()
            r0.ws = r2
            goto L24
        L22:
            r0.ws = r2
        L24:
            r0.xt = r4
            r2 = -1
            r0.vl = r2
            if (r6 == 0) goto L2d
            goto L2f
        L2d:
            java.lang.String r6 = ""
        L2f:
            r0.jy = r6
            com.bytedance.embedapplog.f.j(r0)
            return r0
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            java.util.HashSet<java.lang.Integer> r2 = com.bytedance.embedapplog.w.g
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity r2) {
            r1 = this;
            java.util.HashSet<java.lang.Integer> r0 = com.bytedance.embedapplog.w.g
            int r2 = r2.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.remove(r2)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity r4) {
            r3 = this;
            com.bytedance.embedapplog.kc r0 = com.bytedance.embedapplog.w.xt
            if (r0 == 0) goto L1f
            java.lang.String r0 = r0.ws
            com.bytedance.embedapplog.w.f2116r = r0
            long r0 = java.lang.System.currentTimeMillis()
            com.bytedance.embedapplog.w.cw = r0
            com.bytedance.embedapplog.kc r2 = com.bytedance.embedapplog.w.xt
            j(r2, r0)
            r0 = 0
            com.bytedance.embedapplog.w.xt = r0
            boolean r4 = r4.isChild()
            if (r4 != 0) goto L1f
            r4 = -1
            com.bytedance.embedapplog.w.ae = r4
        L1f:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity r6) {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Class r2 = r6.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = ""
            java.lang.String r4 = com.bytedance.embedapplog.w.f2116r
            com.bytedance.embedapplog.kc r0 = j(r2, r3, r0, r4)
            com.bytedance.embedapplog.w.xt = r0
            java.util.HashSet<java.lang.Integer> r1 = com.bytedance.embedapplog.w.g
            int r2 = r6.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r1 = r1.remove(r2)
            r1 = r1 ^ 1
            r0.mi = r1
            boolean r0 = r6.isChild()
            if (r0 != 0) goto L41
            android.view.Window r6 = r6.getWindow()     // Catch: java.lang.Exception -> L3d
            android.view.View r6 = r6.getDecorView()     // Catch: java.lang.Exception -> L3d
            int r6 = r6.hashCode()     // Catch: java.lang.Exception -> L3d
            com.bytedance.embedapplog.w.ae = r6     // Catch: java.lang.Exception -> L3d
            return
        L3d:
            r6 = move-exception
            com.bytedance.embedapplog.uc.xt(r6)
        L41:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity r1) {
            r0 = this;
            int r1 = com.bytedance.embedapplog.w.j
            int r1 = r1 + 1
            com.bytedance.embedapplog.w.j = r1
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity r3) {
            r2 = this;
            java.lang.String r3 = com.bytedance.embedapplog.w.f2116r
            if (r3 == 0) goto L17
            int r3 = com.bytedance.embedapplog.w.j
            int r3 = r3 + (-1)
            com.bytedance.embedapplog.w.j = r3
            if (r3 > 0) goto L17
            r3 = 0
            com.bytedance.embedapplog.w.f2116r = r3
            com.bytedance.embedapplog.w.f2115m = r3
            r0 = 0
            com.bytedance.embedapplog.w.up = r0
            com.bytedance.embedapplog.w.cw = r0
        L17:
            return
    }
}
