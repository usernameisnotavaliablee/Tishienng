package com.bytedance.adsdk.ugeno.cw;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class qv implements com.bytedance.adsdk.ugeno.cw.ae {
    private com.bytedance.adsdk.ugeno.cw.vl ae;
    private java.util.concurrent.atomic.AtomicInteger cw;
    private com.bytedance.adsdk.ugeno.cw.mi g;
    private java.util.concurrent.atomic.AtomicInteger j;

    /* renamed from: m, reason: collision with root package name */
    private float f1927m;

    /* renamed from: r, reason: collision with root package name */
    private java.util.concurrent.atomic.AtomicInteger f1928r;
    private com.bytedance.adsdk.ugeno.cw.f tl;
    private java.util.concurrent.atomic.AtomicInteger up;
    private java.util.concurrent.atomic.AtomicInteger xt;

    public qv() {
            r1 = this;
            r1.<init>()
            return
    }

    public boolean cw() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.j
            int r0 = r0.get()
            if (r0 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.cw.ae
    public void j() {
            r2 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r2.f1928r
            r0.incrementAndGet()
            java.util.concurrent.atomic.AtomicInteger r0 = r2.f1928r
            int r0 = r0.get()
            r1 = 1
            if (r0 != r1) goto L19
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicInteger r0 = r2.f1928r     // Catch: java.lang.Throwable -> L16
            r0.get()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r0
        L19:
            return
    }

    public void j(com.bytedance.adsdk.ugeno.cw.f r1) {
            r0 = this;
            r0.tl = r1
            return
    }

    public void j(com.bytedance.adsdk.ugeno.cw.mi r1) {
            r0 = this;
            r0.g = r1
            return
    }

    @Override // com.bytedance.adsdk.ugeno.cw.ae
    public void j(com.bytedance.adsdk.ugeno.xt.cw r2, java.lang.String r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r3 = r1.cw
            int r3 = r3.incrementAndGet()
            java.util.concurrent.atomic.AtomicInteger r0 = r1.j
            int r0 = r0.get()
            if (r3 != r0) goto L41
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicInteger r3 = r1.cw     // Catch: java.lang.Throwable -> L27
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L27
            java.util.concurrent.atomic.AtomicInteger r0 = r1.j     // Catch: java.lang.Throwable -> L27
            int r0 = r0.get()     // Catch: java.lang.Throwable -> L27
            if (r3 != r0) goto L3d
            com.bytedance.adsdk.ugeno.cw.vl r3 = r1.ae     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L29
            java.util.concurrent.atomic.AtomicInteger r3 = r1.xt     // Catch: java.lang.Throwable -> L27
            r3.get()     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r2 = move-exception
            goto L3f
        L29:
            com.bytedance.adsdk.ugeno.cw.mi r3 = r1.g     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L3d
            com.bytedance.adsdk.ugeno.cw.tj r3 = new com.bytedance.adsdk.ugeno.cw.tj     // Catch: java.lang.Throwable -> L27
            r3.<init>()     // Catch: java.lang.Throwable -> L27
            r0 = 0
            r3.j(r0)     // Catch: java.lang.Throwable -> L27
            com.bytedance.adsdk.ugeno.xt.cw r2 = r2.xt(r2)     // Catch: java.lang.Throwable -> L27
            r3.j(r2)     // Catch: java.lang.Throwable -> L27
        L3d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            return
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r2
        L41:
            return
    }

    public void j(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L2a
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Ld
            goto L2a
        Ld:
            java.lang.String r0 = "src"
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 != 0) goto L1d
            java.lang.String r0 = "backgroundImage"
            boolean r2 = android.text.TextUtils.equals(r2, r0)
            if (r2 == 0) goto L2a
        L1d:
            java.lang.String r2 = "http"
            boolean r2 = r3.startsWith(r2)
            if (r2 == 0) goto L2a
            java.util.concurrent.atomic.AtomicInteger r2 = r1.xt
            r2.incrementAndGet()
        L2a:
            return
    }

    public int xt() {
            r2 = this;
            float r0 = r2.f1927m
            java.util.concurrent.atomic.AtomicInteger r1 = r2.xt
            int r1 = r1.get()
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = (int) r0
            java.util.concurrent.atomic.AtomicInteger r1 = r2.j
            r1.set(r0)
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.cw.ae
    public void xt(com.bytedance.adsdk.ugeno.xt.cw r3, java.lang.String r4) {
            r2 = this;
            java.util.concurrent.atomic.AtomicInteger r4 = r2.up
            int r4 = r4.incrementAndGet()
            java.util.concurrent.atomic.AtomicInteger r0 = r2.xt
            int r0 = r0.get()
            java.util.concurrent.atomic.AtomicInteger r1 = r2.j
            int r1 = r1.get()
            int r0 = r0 - r1
            if (r4 <= r0) goto L45
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicInteger r0 = r2.xt     // Catch: java.lang.Throwable -> L3f
            int r0 = r0.get()     // Catch: java.lang.Throwable -> L3f
            java.util.concurrent.atomic.AtomicInteger r1 = r2.j     // Catch: java.lang.Throwable -> L3f
            int r1 = r1.get()     // Catch: java.lang.Throwable -> L3f
            int r0 = r0 - r1
            if (r4 <= r0) goto L41
            com.bytedance.adsdk.ugeno.cw.mi r4 = r2.g     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L41
            com.bytedance.adsdk.ugeno.cw.tj r4 = new com.bytedance.adsdk.ugeno.cw.tj     // Catch: java.lang.Throwable -> L3f
            r4.<init>()     // Catch: java.lang.Throwable -> L3f
            r0 = -3
            r4.j(r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = "image download fail"
            r4.j(r0)     // Catch: java.lang.Throwable -> L3f
            com.bytedance.adsdk.ugeno.xt.cw r3 = r3.xt(r3)     // Catch: java.lang.Throwable -> L3f
            r4.j(r3)     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r3 = move-exception
            goto L43
        L41:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3f
            return
        L43:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3f
            throw r3
        L45:
            return
    }
}
