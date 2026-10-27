package com.bytedance.msdk.ae.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private static volatile com.bytedance.msdk.ae.xt.j xt;
    private com.bytedance.msdk.tl.l cw;
    private final java.lang.String j;

    /* renamed from: m, reason: collision with root package name */
    private java.lang.String f2145m;

    /* renamed from: r, reason: collision with root package name */
    private long f2146r;
    private long up;

    private j() {
            r1 = this;
            r1.<init>()
            java.lang.Class<com.bytedance.msdk.ae.xt.j> r0 = com.bytedance.msdk.ae.xt.j.class
            java.lang.String r0 = r0.getSimpleName()
            r1.j = r0
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.ae.j.up()
            r1.cw = r0
            return
    }

    public static com.bytedance.msdk.ae.xt.j j() {
            com.bytedance.msdk.ae.xt.j r0 = com.bytedance.msdk.ae.xt.j.xt
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.msdk.ae.xt.j> r0 = com.bytedance.msdk.ae.xt.j.class
            monitor-enter(r0)
            com.bytedance.msdk.ae.xt.j r1 = com.bytedance.msdk.ae.xt.j.xt     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.msdk.ae.xt.j r1 = new com.bytedance.msdk.ae.xt.j     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.ae.xt.j.xt = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.bytedance.msdk.ae.xt.j r0 = com.bytedance.msdk.ae.xt.j.xt
            return r0
    }

    public void ae() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2.up = r0
            return
    }

    public synchronized void cw() {
            r3 = this;
            monitor-enter(r3)
            com.bytedance.msdk.tl.l r0 = r3.cw     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "discard_num"
            r2 = 0
            int r0 = r0.xt(r1, r2)     // Catch: java.lang.Throwable -> L15
            int r0 = r0 + 1
            com.bytedance.msdk.tl.l r1 = r3.cw     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "discard_num"
            r1.j(r2, r0)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r3)
            return
        L15:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    public long g() {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.f2146r
            long r0 = r0 - r2
            java.lang.String r2 = r5.j
            java.lang.String r3 = "SplashRequestDuration = "
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r3 = r3.concat(r4)
            com.bytedance.msdk.j.up.cw.xt(r2, r3)
            return r0
    }

    public void j(long r7) {
            r6 = this;
            java.lang.String r0 = "first_install_time"
            com.bytedance.msdk.tl.l r1 = r6.cw     // Catch: java.lang.Throwable -> L22
            r2 = -1
            long r4 = r1.xt(r0, r2)     // Catch: java.lang.Throwable -> L22
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L24
            com.bytedance.msdk.tl.l r1 = com.bytedance.msdk.ae.j.j()     // Catch: java.lang.Throwable -> L22
            long r4 = r1.xt(r0, r2)     // Catch: java.lang.Throwable -> L22
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L1b
            goto L1c
        L1b:
            r7 = r4
        L1c:
            com.bytedance.msdk.tl.l r1 = r6.cw     // Catch: java.lang.Throwable -> L22
            r1.j(r0, r7)     // Catch: java.lang.Throwable -> L22
            return
        L22:
            r7 = move-exception
            goto L25
        L24:
            return
        L25:
            com.bytedance.sdk.component.utils.vl.j(r7)
            return
    }

    public void j(java.lang.String r1) {
            r0 = this;
            r0.f2145m = r1
            return
    }

    public void m() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2.f2146r = r0
            return
    }

    public long oq() {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.f2146r
            long r0 = r0 - r2
            java.lang.String r2 = r5.j
            java.lang.String r3 = "SplashFillDuration = "
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r3 = r3.concat(r4)
            com.bytedance.msdk.j.up.cw.xt(r2, r3)
            return r0
    }

    public boolean qv() {
            r1 = this;
            java.lang.String r0 = r1.f2145m
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            return r0
    }

    public synchronized int r() {
            r3 = this;
            monitor-enter(r3)
            com.bytedance.msdk.tl.l r0 = r3.cw     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = "discard_num"
            r2 = 0
            int r0 = r0.xt(r1, r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r3)
            return r0
        Lc:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    public long tl() {
            r5 = this;
            long r0 = r5.up
            long r2 = r5.f2146r
            long r0 = r0 - r2
            java.lang.String r2 = r5.j
            java.lang.String r3 = "InitMethodDuration = "
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r3 = r3.concat(r4)
            com.bytedance.msdk.j.up.cw.xt(r2, r3)
            return r0
    }

    public synchronized void up() {
            r3 = this;
            monitor-enter(r3)
            com.bytedance.msdk.tl.l r0 = r3.cw     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = "discard_num"
            r2 = 0
            r0.j(r1, r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r3)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    public boolean vl() {
            r5 = this;
            java.lang.String r0 = r5.f2145m
            java.lang.String r1 = com.bytedance.msdk.up.j.cw
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            java.lang.String r2 = r5.j
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "canUploadInitDuration = "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = " 当sessionId = "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " 存储的sessionId = "
            r3.append(r1)
            java.lang.String r1 = r5.f2145m
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.bytedance.msdk.j.up.cw.xt(r2, r1)
            if (r0 != 0) goto L31
            r0 = 1
            return r0
        L31:
            r0 = 0
            return r0
    }

    public long xt() {
            r6 = this;
            java.lang.String r0 = "first_install_time"
            com.bytedance.msdk.tl.l r1 = r6.cw     // Catch: java.lang.Throwable -> L1f
            r2 = -1
            long r4 = r1.xt(r0, r2)     // Catch: java.lang.Throwable -> L1f
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L26
            com.bytedance.msdk.tl.l r1 = com.bytedance.msdk.ae.j.j()     // Catch: java.lang.Throwable -> L1f
            long r4 = r1.xt(r0, r2)     // Catch: java.lang.Throwable -> L1f
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L21
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r0 = move-exception
            goto L27
        L21:
            com.bytedance.msdk.tl.l r1 = r6.cw     // Catch: java.lang.Throwable -> L1f
            r1.j(r0, r4)     // Catch: java.lang.Throwable -> L1f
        L26:
            return r4
        L27:
            com.bytedance.sdk.component.utils.vl.j(r0)
            r0 = 0
            return r0
    }
}
