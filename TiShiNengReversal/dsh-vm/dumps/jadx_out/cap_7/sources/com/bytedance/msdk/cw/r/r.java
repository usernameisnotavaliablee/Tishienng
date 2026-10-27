package com.bytedance.msdk.cw.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class r extends com.bytedance.msdk.cw.r.oq {
    private com.bytedance.msdk.xt.cw a;
    protected boolean av;
    private int ch;
    private android.os.Handler f;
    private final android.app.Application.ActivityLifecycleCallbacks h;
    private boolean j;
    private java.lang.ref.SoftReference<android.app.Activity> kt;
    private java.lang.Object l;
    private java.lang.String p;
    private int s;
    private java.lang.ref.SoftReference<android.app.Activity> tj;
    private int v;
    private int x;
    private volatile boolean xt;




    private static class j implements java.lang.Runnable {
        private final android.os.Handler cw;
        private android.widget.Toast j;
        private final int xt;

        private j(android.widget.Toast r1, int r2, android.os.Handler r3) {
                r0 = this;
                r0.<init>()
                r0.j = r1
                r0.xt = r2
                r0.cw = r3
                return
        }

        /* synthetic */ j(android.widget.Toast r1, int r2, android.os.Handler r3, com.bytedance.msdk.cw.r.r.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                int r0 = r4.xt
                if (r0 <= 0) goto L3d
                android.widget.Toast r0 = r4.j
                r0.cancel()
                android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                int r2 = r4.xt
                r1.append(r2)
                java.lang.String r2 = "秒后播放下一个广告"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r2 = 0
                android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
                r4.j = r0
                r0.show()
                android.os.Handler r0 = r4.cw
                com.bytedance.msdk.cw.r.r$j r1 = new com.bytedance.msdk.cw.r.r$j
                android.widget.Toast r2 = r4.j
                int r3 = r4.xt
                int r3 = r3 + (-1)
                r1.<init>(r2, r3, r0)
                r2 = 1000(0x3e8, double:4.94E-321)
                r0.postDelayed(r1, r2)
                return
            L3d:
                android.widget.Toast r0 = r4.j
                r0.cancel()
                return
        }
    }

    public r(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r3 = 0
            r2.j = r3
            r0 = 1
            r2.av = r0
            r2.xt = r3
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r1 = 0
            r0.<init>(r1)
            r2.kt = r0
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r0.<init>(r1)
            r2.tj = r0
            r2.v = r3
            r0 = 2
            r2.x = r0
            r2.ch = r3
            r3 = 15000(0x3a98, float:2.102E-41)
            r2.s = r3
            com.bytedance.msdk.cw.r.r$1 r3 = new com.bytedance.msdk.cw.r.r$1
            r3.<init>(r2)
            r2.h = r3
            return
    }

    static /* synthetic */ java.lang.Object cw(com.bytedance.msdk.cw.r.r r0) {
            java.lang.Object r0 = r0.l
            return r0
    }

    private boolean cw() {
            r1 = this;
            int r0 = r1.ch
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    static /* synthetic */ java.lang.ref.SoftReference j(com.bytedance.msdk.cw.r.r r0) {
            java.lang.ref.SoftReference<android.app.Activity> r0 = r0.tj
            return r0
    }

    static /* synthetic */ java.lang.ref.SoftReference j(com.bytedance.msdk.cw.r.r r0, java.lang.ref.SoftReference r1) {
            r0.tj = r1
            return r1
    }

    private void j(android.os.Handler r5, android.app.Activity r6) {
            r4 = this;
            int r0 = r4.s
            int r0 = r0 + (-2000)
            if (r0 > 0) goto L7
            return
        L7:
            com.bytedance.msdk.cw.r.r$2 r1 = new com.bytedance.msdk.cw.r.r$2
            r1.<init>(r4, r6, r5)
            long r2 = (long) r0
            r5.postDelayed(r1, r2)
            return
    }

    static /* synthetic */ void j(com.bytedance.msdk.cw.r.r r0, com.bytedance.msdk.xt.cw r1, android.app.Activity r2, java.lang.Object r3, java.lang.String r4) {
            r0.xt(r1, r2, r3, r4)
            return
    }

    private boolean j(android.app.Activity r4) {
            r3 = this;
            r0 = 0
            java.lang.String r1 = "TTMediationSDK"
            if (r4 == 0) goto L4c
            boolean r2 = r4.isFinishing()
            if (r2 != 0) goto L4c
            boolean r4 = r4.isDestroyed()
            if (r4 == 0) goto L12
            goto L4c
        L12:
            int r4 = r3.m()
            r2 = 2
            if (r4 != r2) goto L27
            java.lang.String r4 = "--==--- 插全屏轮播，无任何广告可用，停止轮播"
            com.bytedance.msdk.j.up.cw.xt(r1, r4)
            com.bytedance.msdk.api.j.xt r4 = r3.m
            r1 = 81008(0x13c70, float:1.13516E-40)
            com.bytedance.msdk.up.m.j(r4, r1)
            return r0
        L27:
            r2 = 1
            if (r4 != r2) goto L38
            java.lang.String r4 = "--==--- 插全屏轮播，仅有自定义adn广告可用，停止轮播"
            com.bytedance.msdk.j.up.cw.xt(r1, r4)
            com.bytedance.msdk.api.j.xt r4 = r3.m
            r1 = 81009(0x13c71, float:1.13518E-40)
            com.bytedance.msdk.up.m.j(r4, r1)
            return r0
        L38:
            java.lang.String r4 = r3.up
            int r4 = com.bytedance.msdk.cw.r.xt.xt(r4)
            if (r4 == 0) goto L4b
            java.lang.String r2 = "--==--- 插全屏轮播，命中了展示频控，停止轮播"
            com.bytedance.msdk.j.up.cw.xt(r1, r2)
            com.bytedance.msdk.api.j.xt r1 = r3.m
            com.bytedance.msdk.up.m.j(r1, r4)
            return r0
        L4b:
            return r2
        L4c:
            java.lang.String r4 = "--==--- 插全屏轮播，showingActivity正在finish或已经destroy，停止轮播"
            com.bytedance.msdk.j.up.cw.xt(r1, r4)
            return r0
    }

    private boolean j(android.app.Activity r5, android.app.Activity r6, com.bytedance.msdk.xt.cw r7) {
            r4 = this;
            int r0 = r4.v
            int r1 = r4.x
            r2 = 0
            java.lang.String r3 = "TTMediationSDK"
            if (r0 < r1) goto L1d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "--==--- 插全屏轮播，轮播次数已达上限: "
            r5.<init>(r6)
            int r6 = r4.x
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.bytedance.msdk.j.up.cw.xt(r3, r5)
            return r2
        L1d:
            if (r6 != 0) goto L25
            java.lang.String r5 = "--==--- 插全屏轮播 停止轮播 developerActivity为null"
            com.bytedance.msdk.j.up.cw.xt(r3, r5)
            return r2
        L25:
            if (r7 != 0) goto L2d
            java.lang.String r5 = "--==--- 插全屏轮播，ttBaseAd为null，不轮播"
            com.bytedance.msdk.j.up.cw.xt(r3, r5)
            return r2
        L2d:
            boolean r6 = r4.r(r7)
            if (r6 == 0) goto L39
            java.lang.String r5 = "--==--- 插全屏轮播，展示的是自定义adn，则不轮播"
            com.bytedance.msdk.j.up.cw.xt(r3, r5)
            return r2
        L39:
            java.lang.String r6 = r7.ff()
            int r0 = r7.om()
            int r1 = r7.rh()
            boolean r6 = com.bytedance.msdk.core.admanager.j.j(r6, r0, r1)
            if (r6 == 0) goto L81
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "--==--- 插全屏轮播，当前展示的广告不支持轮播: "
            r5.<init>(r6)
            java.lang.String r6 = r7.ff()
            r5.append(r6)
            java.lang.String r6 = ", adtype: "
            r5.append(r6)
            int r6 = r7.om()
            r5.append(r6)
            java.lang.String r6 = ", subType: "
            r5.append(r6)
            int r6 = r7.rh()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.bytedance.msdk.j.up.cw.xt(r3, r5)
            com.bytedance.msdk.api.j.xt r5 = r4.m
            r6 = 81011(0x13c73, float:1.1352E-40)
            com.bytedance.msdk.up.m.j(r5, r6)
            return r2
        L81:
            if (r5 != 0) goto L91
            java.lang.String r5 = "--==--- 插全屏轮播，showingActivity是null，停止轮播"
            com.bytedance.msdk.j.up.cw.xt(r3, r5)
            com.bytedance.msdk.api.j.xt r5 = r4.m
            r6 = 81010(0x13c72, float:1.13519E-40)
            com.bytedance.msdk.up.m.j(r5, r6)
            return r2
        L91:
            r5 = 1
            return r5
    }

    private boolean j(com.bytedance.msdk.core.oq.oq r2) {
            r1 = this;
            boolean r0 = r2.c()
            if (r0 == 0) goto Le
            int r2 = r2.j()
            r0 = 1
            if (r2 == r0) goto Le
            return r0
        Le:
            r2 = 0
            return r2
    }

    static /* synthetic */ boolean j(com.bytedance.msdk.cw.r.r r0, android.app.Activity r1) {
            boolean r0 = r0.j(r1)
            return r0
    }

    static /* synthetic */ boolean j(com.bytedance.msdk.cw.r.r r0, boolean r1) {
            r0.j = r1
            return r1
    }

    private int m() {
            r9 = this;
            com.bytedance.msdk.cw.m.j.xt r0 = r9.cw
            r1 = 0
            if (r0 == 0) goto L16
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.ae()
            com.bytedance.msdk.cw.m.j.xt r2 = r9.cw
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.oq()
            com.bytedance.msdk.cw.m.j.xt r3 = r9.cw
            java.util.concurrent.CopyOnWriteArrayList r3 = r3.tl()
            goto L19
        L16:
            r0 = r1
            r2 = r0
            r3 = r2
        L19:
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L60
            int r6 = r0.size()
            if (r6 <= 0) goto L60
            java.util.Iterator r0 = r0.iterator()
            r6 = 0
        L28:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L61
            java.lang.Object r7 = r0.next()
            com.bytedance.msdk.xt.cw r7 = (com.bytedance.msdk.xt.cw) r7
            if (r7 == 0) goto L28
            java.lang.String r8 = r9.up
            boolean r8 = r7.wq(r8)
            if (r8 == 0) goto L28
            boolean r8 = r7.qb()
            if (r8 != 0) goto L28
            boolean r6 = r9.r(r7)
            if (r6 != 0) goto L5e
            java.lang.String r6 = r7.ff()
            int r8 = r7.om()
            int r7 = r7.rh()
            boolean r6 = com.bytedance.msdk.core.admanager.j.j(r6, r8, r7)
            if (r6 == 0) goto L5d
            goto L5e
        L5d:
            return r5
        L5e:
            r6 = 1
            goto L28
        L60:
            r6 = 0
        L61:
            if (r3 == 0) goto La5
            int r0 = r3.size()
            if (r0 <= 0) goto La5
            java.util.Iterator r0 = r3.iterator()
        L6d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto La5
            java.lang.Object r3 = r0.next()
            com.bytedance.msdk.xt.cw r3 = (com.bytedance.msdk.xt.cw) r3
            if (r3 == 0) goto L6d
            java.lang.String r7 = r9.up
            boolean r7 = r3.wq(r7)
            if (r7 == 0) goto L6d
            boolean r7 = r3.qb()
            if (r7 != 0) goto L6d
            boolean r6 = r9.r(r3)
            if (r6 != 0) goto La3
            java.lang.String r6 = r3.ff()
            int r7 = r3.om()
            int r3 = r3.rh()
            boolean r3 = com.bytedance.msdk.core.admanager.j.j(r6, r7, r3)
            if (r3 == 0) goto La2
            goto La3
        La2:
            return r5
        La3:
            r6 = 1
            goto L6d
        La5:
            if (r2 == 0) goto Le9
            int r0 = r2.size()
            if (r0 <= 0) goto Le9
            java.util.Iterator r0 = r2.iterator()
        Lb1:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Le9
            java.lang.Object r2 = r0.next()
            com.bytedance.msdk.xt.cw r2 = (com.bytedance.msdk.xt.cw) r2
            if (r2 == 0) goto Lb1
            java.lang.String r3 = r9.up
            boolean r3 = r2.wq(r3)
            if (r3 == 0) goto Lb1
            boolean r3 = r2.qb()
            if (r3 != 0) goto Lb1
            boolean r3 = r9.r(r2)
            if (r3 != 0) goto Le7
            java.lang.String r3 = r2.ff()
            int r6 = r2.om()
            int r2 = r2.rh()
            boolean r2 = com.bytedance.msdk.core.admanager.j.j(r3, r6, r2)
            if (r2 == 0) goto Le6
            goto Le7
        Le6:
            return r5
        Le7:
            r6 = 1
            goto Lb1
        Le9:
            java.util.List r1 = r9.xt()     // Catch: java.lang.Throwable -> Lee
            goto Lf2
        Lee:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        Lf2:
            if (r1 == 0) goto L14d
            int r0 = r1.size()
            if (r0 <= 0) goto L14d
            java.util.Iterator r0 = r1.iterator()
        Lfe:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14d
            java.lang.Object r1 = r0.next()
            com.bytedance.msdk.core.oq.oq r1 = (com.bytedance.msdk.core.oq.oq) r1
            java.lang.String r2 = r1.w()
            boolean r3 = r1.kt()
            if (r3 == 0) goto Lfe
            com.bytedance.msdk.core.up.j.j r3 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r7 = r9.up
            int r8 = r9.mi()
            boolean r3 = r3.r(r7, r2, r8)
            if (r3 == 0) goto Lfe
            com.bytedance.msdk.core.up.j.j r3 = com.bytedance.msdk.core.up.j.j.j()
            com.bytedance.msdk.api.j.xt r7 = r9.m
            int r2 = r3.j(r2, r7, r5)
            r3 = 3
            if (r2 != r3) goto Lfe
            boolean r2 = r9.j(r1)
            if (r2 != 0) goto L14b
            java.lang.String r2 = r1.az()
            int r3 = r1.jy()
            int r1 = r1.m()
            boolean r1 = com.bytedance.msdk.core.admanager.j.j(r2, r3, r1)
            if (r1 == 0) goto L14a
            goto L14b
        L14a:
            return r5
        L14b:
            r6 = 1
            goto Lfe
        L14d:
            if (r6 == 0) goto L150
            return r4
        L150:
            r0 = 2
            return r0
    }

    static /* synthetic */ java.lang.String r(com.bytedance.msdk.cw.r.r r0) {
            java.lang.String r0 = r0.p
            return r0
    }

    private void r() {
            r2 = this;
            boolean r0 = r2.xt
            if (r0 == 0) goto L5
            return
        L5:
            android.app.Application r0 = com.bytedance.msdk.core.xt.j.j()
            if (r0 != 0) goto L13
            java.lang.String r0 = "TTMediationSDK"
            java.lang.String r1 = "--==--- app is null, 插全屏轮播直接return"
            com.bytedance.msdk.j.up.cw.xt(r0, r1)
            return
        L13:
            android.app.Application$ActivityLifecycleCallbacks r1 = r2.h
            r0.unregisterActivityLifecycleCallbacks(r1)
            android.app.Application$ActivityLifecycleCallbacks r1 = r2.h
            r0.registerActivityLifecycleCallbacks(r1)
            r0 = 1
            r2.xt = r0
            return
    }

    private boolean r(com.bytedance.msdk.xt.cw r2) {
            r1 = this;
            boolean r0 = r2.dj()
            if (r0 == 0) goto Le
            int r2 = r2.x()
            r0 = 1
            if (r2 == r0) goto Le
            return r0
        Le:
            r2 = 0
            return r2
    }

    private void up() {
            r2 = this;
            android.os.Handler r0 = r2.f
            if (r0 == 0) goto L8
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
        L8:
            android.app.Application r0 = com.bytedance.msdk.core.xt.j.j()
            if (r0 == 0) goto L13
            android.app.Application$ActivityLifecycleCallbacks r1 = r2.h
            r0.unregisterActivityLifecycleCallbacks(r1)
        L13:
            return
    }

    static /* synthetic */ void up(com.bytedance.msdk.cw.r.r r0) {
            r0.up()
            return
    }

    static /* synthetic */ com.bytedance.msdk.xt.cw xt(com.bytedance.msdk.cw.r.r r0) {
            com.bytedance.msdk.xt.cw r0 = r0.a
            return r0
    }

    private void xt(com.bytedance.msdk.xt.cw r1, android.app.Activity r2, java.lang.Object r3, java.lang.String r4) {
            r0 = this;
            super.j(r1, r2, r3, r4)
            return
    }

    protected final void f() {
            r5 = this;
            boolean r0 = r5.cw()
            if (r0 != 0) goto L7
            goto L45
        L7:
            r0 = 1
            r5.av = r0
            int r1 = r5.v
            int r1 = r1 + r0
            r5.v = r1
            java.lang.ref.SoftReference<android.app.Activity> r0 = r5.kt
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.ref.SoftReference<android.app.Activity> r1 = r5.tj
            java.lang.Object r1 = r1.get()
            android.app.Activity r1 = (android.app.Activity) r1
            com.bytedance.msdk.xt.cw r2 = r5.a
            boolean r3 = r5.j(r1, r0, r2)
            if (r3 != 0) goto L2b
            r5.up()
            return
        L2b:
            android.os.Handler r3 = r5.f
            if (r3 == 0) goto L45
            r4 = 0
            r3.removeCallbacksAndMessages(r4)
            android.os.Handler r3 = r5.f
            r5.j(r3, r1)
            android.os.Handler r3 = r5.f
            com.bytedance.msdk.cw.r.r$3 r4 = new com.bytedance.msdk.cw.r.r$3
            r4.<init>(r5, r1, r2, r0)
            int r0 = r5.s
            long r0 = (long) r0
            r3.postDelayed(r4, r0)
        L45:
            return
    }

    protected void j(android.app.Activity r1, java.lang.Object r2, java.lang.String r3) {
            r0 = this;
            return
    }

    @Override // com.bytedance.msdk.cw.r.oq
    public void j(com.bytedance.msdk.xt.cw r2, android.app.Activity r3, java.lang.Object r4, java.lang.String r5) {
            r1 = this;
            boolean r0 = r1.cw()
            if (r0 == 0) goto L30
            r1.r()
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r0.<init>(r3)
            r1.kt = r0
            r1.a = r2
            r1.r = r2
            r1.l = r4
            r1.p = r5
            android.content.Intent r2 = new android.content.Intent
            android.content.Context r3 = com.bytedance.msdk.core.xt.getContext()
            java.lang.Class<com.bytedance.msdk.api.activity.TTTransparentActivity> r4 = com.bytedance.msdk.api.activity.TTTransparentActivity.class
            r2.<init>(r3, r4)
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r2.addFlags(r3)
            android.content.Context r3 = com.bytedance.msdk.core.xt.getContext()
            r3.startActivity(r2)
            return
        L30:
            super.j(r2, r3, r4, r5)
            return
    }

    @Override // com.bytedance.msdk.cw.r.oq
    protected boolean tj() {
            r1 = this;
            boolean r0 = r1.j
            return r0
    }

    protected final void v() {
            r3 = this;
            boolean r0 = r3.cw()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r3.av
            java.lang.String r1 = "TTMediationSDK"
            if (r0 == 0) goto L32
            java.lang.String r0 = "--==--- 用户关闭了广告，停止轮播"
            com.bytedance.msdk.j.up.cw.xt(r1, r0)
            java.lang.ref.SoftReference<android.app.Activity> r0 = r3.tj
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r0 instanceof com.bytedance.msdk.api.activity.TTTransparentActivity
            if (r2 == 0) goto L2e
            java.lang.String r2 = "--==--- 用户关闭了广告，finish showingActivity"
            com.bytedance.msdk.j.up.cw.xt(r1, r2)
            r0.finish()
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r1 = 0
            r0.<init>(r1)
            r3.tj = r0
        L2e:
            r3.up()
            return
        L32:
            java.lang.String r0 = "--==--- 调用finish触发了close回调"
            com.bytedance.msdk.j.up.cw.xt(r1, r0)
            return
    }

    protected final void x() {
            r2 = this;
            boolean r0 = r2.cw()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "TTMediationSDK"
            java.lang.String r1 = "--==--- 用户点击了广告，停止轮播"
            com.bytedance.msdk.j.up.cw.xt(r0, r1)
            r2.up()
            return
    }

    public void xt(com.bytedance.msdk.api.j.xt r2) {
            r1 = this;
            r1.j(r2)
            com.bytedance.msdk.core.oq.xt r2 = r1.ae
            if (r2 == 0) goto L40
            int r2 = r2.jy()
            r1.ch = r2
            boolean r2 = r1.cw()
            if (r2 == 0) goto L39
            com.bytedance.msdk.core.oq.xt r2 = r1.ae
            int r2 = r2.ws()
            r1.x = r2
            com.bytedance.msdk.core.oq.xt r2 = r1.ae
            int r0 = r2.wq()
            int r2 = r2.g(r0)
            r1.s = r2
            if (r2 > 0) goto L2d
            r2 = 15000(0x3a98, float:2.102E-41)
            r1.s = r2
        L2d:
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r2.<init>(r0)
            r1.f = r2
            return
        L39:
            java.lang.String r2 = "TTMediationSDK"
            java.lang.String r0 = "--==--- inter full refresh is not enabled"
            com.bytedance.msdk.j.up.cw.xt(r2, r0)
        L40:
            return
    }
}
