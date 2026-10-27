package com.bytedance.adsdk.ugeno;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r {
    private static volatile com.bytedance.adsdk.ugeno.r j;
    private com.bytedance.adsdk.ugeno.cw.j.j ae;
    private com.bytedance.adsdk.ugeno.cw.cw cw;

    /* renamed from: m, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.cw.xt.r f1972m;

    /* renamed from: r, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.j f1973r;
    private com.bytedance.adsdk.ugeno.r.j up;
    private java.util.List<com.bytedance.adsdk.ugeno.cw.xt> xt;

    static {
            return
    }

    private r() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.bytedance.adsdk.ugeno.r j() {
            com.bytedance.adsdk.ugeno.r r0 = com.bytedance.adsdk.ugeno.r.j
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.adsdk.ugeno.r> r0 = com.bytedance.adsdk.ugeno.r.class
            monitor-enter(r0)
            com.bytedance.adsdk.ugeno.r r1 = com.bytedance.adsdk.ugeno.r.j     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.adsdk.ugeno.r r1 = new com.bytedance.adsdk.ugeno.r     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.adsdk.ugeno.r.j = r1     // Catch: java.lang.Throwable -> L13
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
            com.bytedance.adsdk.ugeno.r r0 = com.bytedance.adsdk.ugeno.r.j
            return r0
    }

    private void m() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.xt = r0
            com.bytedance.adsdk.ugeno.cw.cw r1 = r2.cw
            if (r1 == 0) goto L12
            java.util.List r1 = r1.j()
            r0.addAll(r1)
        L12:
            java.util.List<com.bytedance.adsdk.ugeno.cw.xt> r0 = r2.xt
            com.bytedance.adsdk.ugeno.cw.r.j(r0)
            return
    }

    public com.bytedance.adsdk.ugeno.r.j cw() {
            r1 = this;
            com.bytedance.adsdk.ugeno.r.j r0 = r1.up
            return r0
    }

    public void j(android.content.Context r1, com.bytedance.adsdk.ugeno.cw.cw r2, com.bytedance.adsdk.ugeno.j r3) {
            r0 = this;
            r0.cw = r2
            r0.f1973r = r3
            r0.m()
            return
    }

    public void j(com.bytedance.adsdk.ugeno.cw.j.j r1) {
            r0 = this;
            r0.ae = r1
            return
    }

    public void j(com.bytedance.adsdk.ugeno.cw.xt.r r1) {
            r0 = this;
            r0.f1972m = r1
            return
    }

    public void j(com.bytedance.adsdk.ugeno.r.j r1) {
            r0 = this;
            r0.up = r1
            return
    }

    public void j(com.bytedance.adsdk.ugeno.up.cw r3) {
            r2 = this;
            com.bytedance.adsdk.ugeno.up.up r0 = new com.bytedance.adsdk.ugeno.up.up
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List r0 = r0.j()
            r1.<init>(r0)
            if (r3 == 0) goto L17
            java.util.List r3 = r3.j()
            r1.addAll(r3)
        L17:
            com.bytedance.adsdk.ugeno.up.r.j(r1)
            return
    }

    public void j(com.bytedance.adsdk.ugeno.up.tl r3) {
            r2 = this;
            com.bytedance.adsdk.ugeno.up.j r0 = new com.bytedance.adsdk.ugeno.up.j
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List r0 = r0.j()
            r1.<init>(r0)
            if (r3 == 0) goto L17
            java.util.List r3 = r3.j()
            r1.addAll(r3)
        L17:
            com.bytedance.adsdk.ugeno.up.oq.j(r1)
            return
    }

    public com.bytedance.adsdk.ugeno.cw.xt.r r() {
            r1 = this;
            com.bytedance.adsdk.ugeno.cw.xt.r r0 = r1.f1972m
            return r0
    }

    public com.bytedance.adsdk.ugeno.cw.j.j up() {
            r1 = this;
            com.bytedance.adsdk.ugeno.cw.j.j r0 = r1.ae
            return r0
    }

    public com.bytedance.adsdk.ugeno.j xt() {
            r1 = this;
            com.bytedance.adsdk.ugeno.j r0 = r1.f1973r
            return r0
    }
}
