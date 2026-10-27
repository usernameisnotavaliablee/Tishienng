package com.bykv.vk.openvk.component.video.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
abstract class j implements com.bykv.vk.openvk.component.video.j.xt.qv {
    private static final java.util.concurrent.atomic.AtomicLong jy = null;
    protected volatile java.lang.String ae;
    private int az;
    protected final java.util.concurrent.atomic.AtomicInteger cw;
    protected volatile com.bykv.vk.openvk.component.video.j.xt.g g;
    protected volatile com.bykv.vk.openvk.component.video.j.xt.j.j j;

    /* renamed from: m, reason: collision with root package name */
    protected volatile java.util.List<com.bykv.vk.openvk.component.video.j.xt.g.xt> f1711m;
    protected volatile com.bykv.vk.openvk.component.video.j.xt.vl oq;
    protected volatile boolean qv;

    /* renamed from: r, reason: collision with root package name */
    protected final java.util.concurrent.atomic.AtomicLong f1712r;
    protected volatile java.lang.String tl;
    protected com.bykv.vk.openvk.component.video.j.xt.r.j up;
    public final long vl;
    private final java.util.concurrent.atomic.AtomicInteger ws;
    protected final com.bykv.vk.openvk.component.video.j.xt.xt.cw xt;


    static {
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            com.bykv.vk.openvk.component.video.j.xt.j.jy = r0
            return
    }

    public j(com.bykv.vk.openvk.component.video.j.xt.j.j r4, com.bykv.vk.openvk.component.video.j.xt.xt.cw r5) {
            r3 = this;
            r3.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r3.cw = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r3.f1712r = r0
            r0 = 0
            r3.qv = r0
            java.util.concurrent.atomic.AtomicLong r1 = com.bykv.vk.openvk.component.video.j.xt.j.jy
            long r1 = r1.incrementAndGet()
            r3.vl = r1
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>(r0)
            r3.ws = r1
            r0 = -1
            r3.az = r0
            r3.j = r4
            r3.xt = r5
            return
    }

    static /* synthetic */ int j(com.bykv.vk.openvk.component.video.j.xt.j r0) {
            int r0 = r0.az
            return r0
    }

    protected boolean ae() {
            r2 = this;
            int r0 = r2.m()
            r1 = 1
            if (r0 != r1) goto L8
            return r1
        L8:
            r0 = 0
            return r0
    }

    protected void cw() {
            r3 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r3.ws
            r1 = 0
            r2 = 2
            r0.compareAndSet(r1, r2)
            return
    }

    protected com.bykv.vk.openvk.component.video.j.xt.up.j j(com.bykv.vk.openvk.component.video.j.xt.vl.j r9, int r10, int r11, java.lang.String r12) throws java.io.IOException {
            r8 = this;
            com.bykv.vk.openvk.component.video.j.xt.up.cw r0 = com.bykv.vk.openvk.component.video.j.xt.up.cw.j()
            com.bykv.vk.openvk.component.video.j.xt.up.xt r0 = r0.xt()
            com.bykv.vk.openvk.component.video.j.xt.up.up r1 = new com.bykv.vk.openvk.component.video.j.xt.up.up
            r1.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = r9.j
            r1.xt = r3
            r3 = 0
            r1.j = r3
            java.lang.String r4 = "HEAD"
            boolean r12 = r4.equalsIgnoreCase(r12)
            if (r12 == 0) goto L24
            r12 = 4
            r1.j = r12
        L24:
            java.util.List<com.bykv.vk.openvk.component.video.j.xt.g$xt> r12 = r8.f1711m
            java.lang.String r4 = "Range"
            if (r12 == 0) goto L6e
            boolean r5 = r12.isEmpty()
            if (r5 != 0) goto L6e
            java.util.Iterator r12 = r12.iterator()
        L34:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L6e
            java.lang.Object r5 = r12.next()
            com.bykv.vk.openvk.component.video.j.xt.g$xt r5 = (com.bykv.vk.openvk.component.video.j.xt.g.xt) r5
            java.lang.String r6 = r5.j
            boolean r6 = r4.equalsIgnoreCase(r6)
            if (r6 != 0) goto L34
            java.lang.String r6 = "Connection"
            java.lang.String r7 = r5.j
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 != 0) goto L34
            java.lang.String r6 = "Proxy-Connection"
            java.lang.String r7 = r5.j
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 != 0) goto L34
            java.lang.String r6 = "Host"
            java.lang.String r7 = r5.j
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 != 0) goto L34
            java.lang.String r6 = r5.j
            java.lang.String r5 = r5.xt
            r2.put(r6, r5)
            goto L34
        L6e:
            java.lang.String r10 = com.bykv.vk.openvk.component.video.j.cw.j.j(r10, r11)
            if (r10 == 0) goto L77
            r2.put(r4, r10)
        L77:
            boolean r10 = com.bykv.vk.openvk.component.video.j.xt.up.f1726m
            if (r10 == 0) goto L82
            java.lang.String r10 = "Cache-Control"
            java.lang.String r11 = "no-cache"
            r2.put(r10, r11)
        L82:
            com.bykv.vk.openvk.component.video.j.xt.r r10 = com.bykv.vk.openvk.component.video.j.xt.r.cw()
            com.bykv.vk.openvk.component.video.j.xt.m r11 = com.bykv.vk.openvk.component.video.j.xt.m.j()
            com.bykv.vk.openvk.component.video.j.xt.g r12 = r8.g
            if (r12 != 0) goto L90
            r12 = 1
            goto L91
        L90:
            r12 = 0
        L91:
            if (r12 == 0) goto L98
            com.bykv.vk.openvk.component.video.j.xt.cw r4 = r10.j()
            goto L9c
        L98:
            com.bykv.vk.openvk.component.video.j.xt.cw r4 = r11.xt()
        L9c:
            if (r12 == 0) goto La3
            com.bykv.vk.openvk.component.video.j.xt.cw r10 = r10.xt()
            goto La7
        La3:
            com.bykv.vk.openvk.component.video.j.xt.cw r10 = r11.cw()
        La7:
            if (r4 != 0) goto Lab
            if (r10 == 0) goto Lbf
        Lab:
            if (r4 == 0) goto Lb5
            int r11 = r9.xt
            long r11 = r4.j(r11)
            r1.cw = r11
        Lb5:
            if (r10 == 0) goto Lbf
            int r9 = r9.xt
            long r9 = r10.j(r9)
            r1.f1728r = r9
        Lbf:
            r1.up = r2
            boolean r9 = r8.qv
            if (r9 == 0) goto Lc9
            r8.qv = r3
            r9 = 0
            return r9
        Lc9:
            com.bykv.vk.openvk.component.video.j.xt.up.j r9 = r0.j(r1)
            return r9
    }

    public void j() {
            r3 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r3.ws
            r1 = 0
            r2 = 1
            r0.compareAndSet(r1, r2)
            return
    }

    protected void j(int r5, int r6) {
            r4 = this;
            if (r5 <= 0) goto L38
            if (r6 >= 0) goto L5
            goto L38
        L5:
            int r0 = com.bykv.vk.openvk.component.video.j.xt.up.ae
            int r1 = r4.m()
            r2 = 1
            if (r0 == r2) goto L13
            r3 = 2
            if (r0 != r3) goto L38
            if (r1 != r2) goto L38
        L13:
            float r6 = (float) r6
            float r5 = (float) r5
            float r6 = r6 / r5
            r5 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 * r5
            int r5 = (int) r6
            r6 = 100
            if (r5 <= r6) goto L21
            r5 = 100
        L21:
            monitor-enter(r4)
            int r6 = r4.az     // Catch: java.lang.Throwable -> L28
            if (r5 > r6) goto L2a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L28
            return
        L28:
            r5 = move-exception
            goto L36
        L2a:
            r4.az = r5     // Catch: java.lang.Throwable -> L28
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L28
            com.bykv.vk.openvk.component.video.j.xt.j$1 r5 = new com.bykv.vk.openvk.component.video.j.xt.j$1
            r5.<init>(r4)
            com.bykv.vk.openvk.component.video.j.cw.j.j(r5)
            return
        L36:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L28
            throw r5
        L38:
            return
    }

    protected int m() {
            r1 = this;
            com.bykv.vk.openvk.component.video.j.xt.g r0 = r1.g
            if (r0 == 0) goto Lb
            com.bykv.vk.openvk.component.video.j.xt.g r0 = r1.g
            com.bykv.vk.openvk.component.video.j.xt.g$j r0 = r0.cw
            int r0 = r0.j
            return r0
        Lb:
            com.bykv.vk.openvk.component.video.j.xt.j.j r0 = r1.j
            boolean r0 = r0 instanceof com.bykv.vk.openvk.component.video.j.xt.j.xt
            if (r0 == 0) goto L13
            r0 = 1
            return r0
        L13:
            r0 = 0
            return r0
    }

    public boolean r() {
            r2 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r2.ws
            int r0 = r0.get()
            r1 = 2
            if (r0 != r1) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    protected void up() throws com.bykv.vk.openvk.component.video.j.xt.cw.j {
            r1 = this;
            boolean r0 = r1.xt()
            if (r0 != 0) goto L7
            return
        L7:
            com.bykv.vk.openvk.component.video.j.xt.cw.j r0 = new com.bykv.vk.openvk.component.video.j.xt.cw.j
            r0.<init>()
            throw r0
    }

    public boolean xt() {
            r2 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r2.ws
            int r0 = r0.get()
            r1 = 1
            if (r0 != r1) goto La
            return r1
        La:
            r0 = 0
            return r0
    }
}
