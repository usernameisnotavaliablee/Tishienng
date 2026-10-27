package com.bykv.vk.openvk.component.video.j.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt {
    private volatile boolean ae;
    private volatile boolean cw;
    private android.content.Context j;

    /* renamed from: m, reason: collision with root package name */
    private final java.util.List<com.bykv.vk.openvk.component.video.api.up.j.InterfaceC0175j> f1693m;

    /* renamed from: r, reason: collision with root package name */
    private java.io.File f1694r;
    private java.io.File up;
    private com.bykv.vk.openvk.component.video.api.cw.r xt;


    public xt(android.content.Context r3, com.bykv.vk.openvk.component.video.api.cw.r r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.cw = r0
            r1 = 0
            r2.f1694r = r1
            r2.up = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.f1693m = r1
            r2.ae = r0
            r2.j = r3
            r2.xt = r4
            java.lang.String r3 = r4.up()
            java.lang.String r0 = r4.i()
            java.io.File r3 = com.bykv.vk.openvk.component.video.j.up.cw.xt(r3, r0)
            r2.f1694r = r3
            java.lang.String r3 = r4.up()
            java.lang.String r4 = r4.i()
            java.io.File r3 = com.bykv.vk.openvk.component.video.j.up.cw.cw(r3, r4)
            r2.up = r3
            return
    }

    private void cw() {
            r12 = this;
            com.bytedance.sdk.component.xt.j.vl r0 = com.bykv.vk.openvk.component.video.api.cw.cw()
            if (r0 == 0) goto Lf
            com.bytedance.sdk.component.xt.j.vl r0 = com.bykv.vk.openvk.component.video.api.cw.cw()
            com.bytedance.sdk.component.xt.j.vl$j r0 = r0.xt()
            goto L16
        Lf:
            com.bytedance.sdk.component.xt.j.vl$j r0 = new com.bytedance.sdk.component.xt.j.vl$j
            java.lang.String r1 = "v_preload"
            r0.<init>(r1)
        L16:
            com.bykv.vk.openvk.component.video.api.cw.r r1 = r12.xt
            int r1 = r1.mi()
            long r1 = (long) r1
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.bytedance.sdk.component.xt.j.vl$j r1 = r0.j(r1, r3)
            com.bykv.vk.openvk.component.video.api.cw.r r2 = r12.xt
            int r2 = r2.kt()
            long r4 = (long) r2
            com.bytedance.sdk.component.xt.j.vl$j r1 = r1.xt(r4, r3)
            com.bykv.vk.openvk.component.video.api.cw.r r2 = r12.xt
            int r2 = r2.tj()
            long r4 = (long) r2
            r1.cw(r4, r3)
            com.bytedance.sdk.component.xt.j.vl r0 = r0.j()
            com.bytedance.sdk.component.xt.j.ws$j r1 = new com.bytedance.sdk.component.xt.j.ws$j
            r1.<init>()
            java.io.File r2 = r12.f1694r
            long r2 = r2.length()
            com.bykv.vk.openvk.component.video.api.cw.r r4 = r12.xt
            int r4 = r4.m()
            com.bykv.vk.openvk.component.video.api.cw.r r5 = r12.xt
            boolean r5 = r5.jy()
            com.bykv.vk.openvk.component.video.api.cw.r r6 = r12.xt
            int r6 = r6.xt()
            if (r6 <= 0) goto L69
            long r7 = (long) r6
            com.bykv.vk.openvk.component.video.api.cw.r r9 = r12.xt
            long r9 = r9.vl()
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L68
            r5 = 1
            goto L69
        L68:
            r4 = r6
        L69:
            java.lang.String r6 = "-"
            java.lang.String r7 = "bytes="
            java.lang.String r8 = "RANGE"
            if (r5 == 0) goto L96
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r7)
            r4.append(r2)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.bytedance.sdk.component.xt.j.ws$j r4 = r1.j(r8, r4)
            com.bykv.vk.openvk.component.video.api.cw.r r5 = r12.xt
            java.lang.String r5 = r5.av()
            com.bytedance.sdk.component.xt.j.ws$j r4 = r4.j(r5)
            com.bytedance.sdk.component.xt.j.ws$j r4 = r4.j()
            r4.xt()
            goto Lbd
        L96:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r7)
            r5.append(r2)
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.bytedance.sdk.component.xt.j.ws$j r4 = r1.j(r8, r4)
            com.bykv.vk.openvk.component.video.api.cw.r r5 = r12.xt
            java.lang.String r5 = r5.av()
            com.bytedance.sdk.component.xt.j.ws$j r4 = r4.j(r5)
            com.bytedance.sdk.component.xt.j.ws$j r4 = r4.j()
            r4.xt()
        Lbd:
            com.bytedance.sdk.component.xt.j.ws r1 = r1.xt()
            com.bytedance.sdk.component.xt.j.xt r0 = r0.j(r1)
            com.bykv.vk.openvk.component.video.j.j.xt.xt$1 r1 = new com.bykv.vk.openvk.component.video.j.j.xt.xt$1
            r1.<init>(r12, r2)
            r0.j(r1)
            return
    }

    static /* synthetic */ boolean cw(com.bykv.vk.openvk.component.video.j.j.xt.xt r0) {
            boolean r0 = r0.cw
            return r0
    }

    static /* synthetic */ com.bykv.vk.openvk.component.video.api.cw.r j(com.bykv.vk.openvk.component.video.j.j.xt.xt r0) {
            com.bykv.vk.openvk.component.video.api.cw.r r0 = r0.xt
            return r0
    }

    private void j(com.bykv.vk.openvk.component.video.api.cw.r r4, int r5) {
            r3 = this;
            java.lang.Class<com.bykv.vk.openvk.component.video.api.up.j$j> r0 = com.bykv.vk.openvk.component.video.api.up.j.InterfaceC0175j.class
            monitor-enter(r0)
            java.util.List<com.bykv.vk.openvk.component.video.api.up.j$j> r1 = r3.f1693m     // Catch: java.lang.Throwable -> L1b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1b
            com.bykv.vk.openvk.component.video.api.up.j$j r2 = (com.bykv.vk.openvk.component.video.api.up.j.InterfaceC0175j) r2     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L9
            r2.j(r4, r5)     // Catch: java.lang.Throwable -> L1b
            goto L9
        L1b:
            r4 = move-exception
            goto L1f
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r4
    }

    private void j(com.bykv.vk.openvk.component.video.api.cw.r r4, int r5, java.lang.String r6) {
            r3 = this;
            java.lang.Class<com.bykv.vk.openvk.component.video.api.up.j$j> r0 = com.bykv.vk.openvk.component.video.api.up.j.InterfaceC0175j.class
            monitor-enter(r0)
            java.util.List<com.bykv.vk.openvk.component.video.api.up.j$j> r1 = r3.f1693m     // Catch: java.lang.Throwable -> L1b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1b
            com.bykv.vk.openvk.component.video.api.up.j$j r2 = (com.bykv.vk.openvk.component.video.api.up.j.InterfaceC0175j) r2     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L9
            r2.j(r4, r5, r6)     // Catch: java.lang.Throwable -> L1b
            goto L9
        L1b:
            r4 = move-exception
            goto L1f
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r4
    }

    static /* synthetic */ void j(com.bykv.vk.openvk.component.video.j.j.xt.xt r0, com.bykv.vk.openvk.component.video.api.cw.r r1, int r2) {
            r0.xt(r1, r2)
            return
    }

    static /* synthetic */ void j(com.bykv.vk.openvk.component.video.j.j.xt.xt r0, com.bykv.vk.openvk.component.video.api.cw.r r1, int r2, java.lang.String r3) {
            r0.j(r1, r2, r3)
            return
    }

    static /* synthetic */ void j(com.bykv.vk.openvk.component.video.j.j.xt.xt r0, java.io.Closeable r1) {
            r0.j(r1)
            return
    }

    private void j(java.io.Closeable r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.close()     // Catch: java.lang.Exception -> L5
        L5:
            return
    }

    private void r() {
            r1 = this;
            java.io.File r0 = r1.up     // Catch: java.lang.Throwable -> Lb
            r0.delete()     // Catch: java.lang.Throwable -> Lb
            java.io.File r0 = r1.f1694r     // Catch: java.lang.Throwable -> Lb
            r0.delete()     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    static /* synthetic */ void r(com.bykv.vk.openvk.component.video.j.j.xt.xt r0) {
            r0.up()
            return
    }

    private void up() {
            r3 = this;
            java.io.File r0 = r3.f1694r     // Catch: java.lang.Throwable -> L30
            java.io.File r1 = r3.up     // Catch: java.lang.Throwable -> L30
            boolean r0 = r0.renameTo(r1)     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto Lb
            goto L3d
        Lb:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "Error renaming file "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L30
            java.io.File r2 = r3.f1694r     // Catch: java.lang.Throwable -> L30
            r1.append(r2)     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = " to "
            r1.append(r2)     // Catch: java.lang.Throwable -> L30
            java.io.File r2 = r3.up     // Catch: java.lang.Throwable -> L30
            r1.append(r2)     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = " for completion!"
            r1.append(r2)     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L30
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L30
            throw r0     // Catch: java.lang.Throwable -> L30
        L30:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            java.lang.String r1 = "VideoPreload"
            java.lang.String r0 = r0.getMessage()
            com.bykv.vk.openvk.component.video.api.m.cw.j(r1, r0)
        L3d:
            return
    }

    static /* synthetic */ void up(com.bykv.vk.openvk.component.video.j.j.xt.xt r0) {
            r0.r()
            return
    }

    static /* synthetic */ java.io.File xt(com.bykv.vk.openvk.component.video.j.j.xt.xt r0) {
            java.io.File r0 = r0.f1694r
            return r0
    }

    private void xt(com.bykv.vk.openvk.component.video.api.cw.r r4, int r5) {
            r3 = this;
            java.lang.Class<com.bykv.vk.openvk.component.video.api.up.j$j> r0 = com.bykv.vk.openvk.component.video.api.up.j.InterfaceC0175j.class
            monitor-enter(r0)
            java.util.List<com.bykv.vk.openvk.component.video.api.up.j$j> r1 = r3.f1693m     // Catch: java.lang.Throwable -> L1b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1b
            com.bykv.vk.openvk.component.video.api.up.j$j r2 = (com.bykv.vk.openvk.component.video.api.up.j.InterfaceC0175j) r2     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L9
            r2.xt(r4, r5)     // Catch: java.lang.Throwable -> L1b
            goto L9
        L1b:
            r4 = move-exception
            goto L1f
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r4
    }

    static /* synthetic */ void xt(com.bykv.vk.openvk.component.video.j.j.xt.xt r0, com.bykv.vk.openvk.component.video.api.cw.r r1, int r2) {
            r0.j(r1, r2)
            return
    }

    private boolean xt() {
            r7 = this;
            java.io.File r0 = r7.up
            boolean r0 = r0.exists()
            r1 = 1
            if (r0 == 0) goto La
            return r1
        La:
            com.bykv.vk.openvk.component.video.api.cw.r r0 = r7.xt
            boolean r0 = r0.jy()
            r2 = 0
            if (r0 != 0) goto L3f
            java.io.File r0 = r7.f1694r
            long r3 = r0.length()
            com.bykv.vk.openvk.component.video.api.cw.r r0 = r7.xt
            int r0 = r0.m()
            long r5 = (long) r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L25
            return r1
        L25:
            com.bykv.vk.openvk.component.video.api.cw.r r0 = r7.xt
            int r0 = r0.xt()
            if (r0 <= 0) goto L3f
            java.io.File r0 = r7.f1694r
            long r3 = r0.length()
            com.bykv.vk.openvk.component.video.api.cw.r r0 = r7.xt
            int r0 = r0.xt()
            long r5 = (long) r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L3f
            return r1
        L3f:
            return r2
    }

    public com.bykv.vk.openvk.component.video.api.cw.r j() {
            r1 = this;
            com.bykv.vk.openvk.component.video.api.cw.r r0 = r1.xt
            return r0
    }

    public void j(com.bykv.vk.openvk.component.video.api.up.j.InterfaceC0175j r3) {
            r2 = this;
            boolean r0 = r2.ae
            if (r0 == 0) goto L11
            java.lang.Class<com.bykv.vk.openvk.component.video.api.up.j$j> r0 = com.bykv.vk.openvk.component.video.api.up.j.InterfaceC0175j.class
            monitor-enter(r0)
            java.util.List<com.bykv.vk.openvk.component.video.api.up.j$j> r1 = r2.f1693m     // Catch: java.lang.Throwable -> Le
            r1.add(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
        L11:
            java.util.List<com.bykv.vk.openvk.component.video.api.up.j$j> r0 = r2.f1693m
            r0.add(r3)
            boolean r3 = r2.xt()
            r0 = 1
            if (r3 == 0) goto L36
            java.lang.String r3 = "VideoPreload"
            java.lang.String r1 = "Cache file is exist"
            com.bykv.vk.openvk.component.video.api.m.cw.j(r3, r1)
            com.bykv.vk.openvk.component.video.api.cw.r r3 = r2.xt
            r3.g(r0)
            com.bykv.vk.openvk.component.video.api.cw.r r3 = r2.xt
            r0 = 200(0xc8, float:2.8E-43)
            r2.j(r3, r0)
            com.bykv.vk.openvk.component.video.api.cw.r r3 = r2.xt
            com.bykv.vk.openvk.component.video.j.j.xt.cw.j(r3)
            return
        L36:
            r2.ae = r0
            com.bykv.vk.openvk.component.video.api.cw.r r3 = r2.xt
            r0 = 0
            r3.g(r0)
            r2.cw()
            return
    }

    public void j(boolean r1) {
            r0 = this;
            r0.cw = r1
            return
    }
}
