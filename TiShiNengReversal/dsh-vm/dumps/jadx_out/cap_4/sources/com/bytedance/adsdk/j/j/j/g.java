package com.bytedance.adsdk.j.j.j;

import com.bytedance.adsdk.j.j.xt.ae;
import com.bytedance.adsdk.j.j.xt.m;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class g<R extends com.bytedance.adsdk.j.j.xt.m, W extends com.bytedance.adsdk.j.j.xt.ae> {
    private static final java.lang.String ae = "g";
    private static final android.graphics.Rect ws = null;
    private final java.util.Set<android.graphics.Bitmap> av;
    private final java.lang.Runnable az;
    protected int cw;
    private final android.os.Handler g;
    private final java.lang.Object i;
    protected java.util.List<com.bytedance.adsdk.j.j.j.tl<R, W>> j;
    private final java.util.concurrent.atomic.AtomicBoolean jy;
    private boolean kt;

    /* renamed from: m, reason: collision with root package name */
    protected volatile android.graphics.Rect f1740m;
    private R mi;
    private int oq;
    private java.lang.Integer qv;

    /* renamed from: r, reason: collision with root package name */
    protected java.util.Map<android.graphics.Bitmap, android.graphics.Canvas> f1741r;
    private volatile com.bytedance.adsdk.j.j.j.g.xt tj;
    private final com.bytedance.adsdk.j.j.cw.xt tl;
    protected java.nio.ByteBuffer up;
    private final java.util.Set<com.bytedance.adsdk.j.j.j.g.j> vl;

    /* renamed from: w, reason: collision with root package name */
    private W f1742w;
    protected int xt;










    public interface j {
        void j();

        void xt();

        void xt(java.nio.ByteBuffer r1);
    }

    private enum xt extends java.lang.Enum<com.bytedance.adsdk.j.j.j.g.xt> {
        public static final com.bytedance.adsdk.j.j.j.g.xt cw = null;
        public static final com.bytedance.adsdk.j.j.j.g.xt j = null;

        /* renamed from: r, reason: collision with root package name */
        public static final com.bytedance.adsdk.j.j.j.g.xt f1743r = null;
        private static final /* synthetic */ com.bytedance.adsdk.j.j.j.g.xt[] up = null;
        public static final com.bytedance.adsdk.j.j.j.g.xt xt = null;

        static {
                com.bytedance.adsdk.j.j.j.g$xt r0 = new com.bytedance.adsdk.j.j.j.g$xt
                java.lang.String r1 = "IDLE"
                r2 = 0
                r0.<init>(r1, r2)
                com.bytedance.adsdk.j.j.j.g.xt.j = r0
                com.bytedance.adsdk.j.j.j.g$xt r1 = new com.bytedance.adsdk.j.j.j.g$xt
                java.lang.String r3 = "RUNNING"
                r4 = 1
                r1.<init>(r3, r4)
                com.bytedance.adsdk.j.j.j.g.xt.xt = r1
                com.bytedance.adsdk.j.j.j.g$xt r3 = new com.bytedance.adsdk.j.j.j.g$xt
                java.lang.String r5 = "INITIALIZING"
                r6 = 2
                r3.<init>(r5, r6)
                com.bytedance.adsdk.j.j.j.g.xt.cw = r3
                com.bytedance.adsdk.j.j.j.g$xt r5 = new com.bytedance.adsdk.j.j.j.g$xt
                java.lang.String r7 = "FINISHING"
                r8 = 3
                r5.<init>(r7, r8)
                com.bytedance.adsdk.j.j.j.g.xt.f1743r = r5
                r7 = 4
                com.bytedance.adsdk.j.j.j.g$xt[] r7 = new com.bytedance.adsdk.j.j.j.g.xt[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.bytedance.adsdk.j.j.j.g.xt.up = r7
                return
        }

        xt(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.bytedance.adsdk.j.j.j.g.xt valueOf(java.lang.String r1) {
                java.lang.Class<com.bytedance.adsdk.j.j.j.g$xt> r0 = com.bytedance.adsdk.j.j.j.g.xt.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bytedance.adsdk.j.j.j.g$xt r1 = (com.bytedance.adsdk.j.j.j.g.xt) r1
                return r1
        }

        public static com.bytedance.adsdk.j.j.j.g.xt[] values() {
                com.bytedance.adsdk.j.j.j.g$xt[] r0 = com.bytedance.adsdk.j.j.j.g.xt.up
                java.lang.Object r0 = r0.clone()
                com.bytedance.adsdk.j.j.j.g$xt[] r0 = (com.bytedance.adsdk.j.j.j.g.xt[]) r0
                return r0
        }
    }

    static {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            com.bytedance.adsdk.j.j.j.g.ws = r0
            return
    }

    public g(com.bytedance.adsdk.j.j.cw.xt r5, com.bytedance.adsdk.j.j.j.g.j r6) {
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.j = r0
            r0 = -1
            r4.xt = r0
            r0 = 0
            r4.qv = r0
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r4.vl = r1
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 1
            r2.<init>(r3)
            r4.jy = r2
            com.bytedance.adsdk.j.j.j.g$1 r2 = new com.bytedance.adsdk.j.j.j.g$1
            r2.<init>(r4)
            r4.az = r2
            r4.cw = r3
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r4.av = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r4.i = r2
            java.util.WeakHashMap r2 = new java.util.WeakHashMap
            r2.<init>()
            r4.f1741r = r2
            com.bytedance.adsdk.j.j.xt.ae r2 = r4.r()
            r4.f1742w = r2
            r4.mi = r0
            r0 = 0
            r4.kt = r0
            com.bytedance.adsdk.j.j.j.g$xt r0 = com.bytedance.adsdk.j.j.j.g.xt.j
            r4.tj = r0
            r4.tl = r5
            if (r6 == 0) goto L53
            r1.add(r6)
        L53:
            com.bytedance.sdk.component.oq.xt.j r5 = com.bytedance.sdk.component.oq.xt.j.j()
            android.os.Handler r5 = r5.xt()
            r4.g = r5
            return
    }

    static /* synthetic */ com.bytedance.adsdk.j.j.cw.xt ae(com.bytedance.adsdk.j.j.j.g r0) {
            com.bytedance.adsdk.j.j.cw.xt r0 = r0.tl
            return r0
    }

    private int av() {
            r1 = this;
            java.lang.Integer r0 = r1.qv
            if (r0 == 0) goto L9
            int r0 = r0.intValue()
            return r0
        L9:
            int r0 = r1.xt()
            return r0
    }

    private java.lang.String az() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    static /* synthetic */ long cw(com.bytedance.adsdk.j.j.j.g r2) {
            long r0 = r2.w()
            return r0
    }

    static /* synthetic */ void g(com.bytedance.adsdk.j.j.j.g r0) {
            r0.ws()
            return
    }

    private boolean i() {
            r4 = this;
            boolean r0 = r4.oq()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.util.List<com.bytedance.adsdk.j.j.j.tl<R extends com.bytedance.adsdk.j.j.xt.m, W extends com.bytedance.adsdk.j.j.xt.ae>> r0 = r4.j
            int r0 = r0.size()
            if (r0 != 0) goto L11
            return r1
        L11:
            int r0 = r4.av()
            r2 = 1
            if (r0 > 0) goto L19
            return r2
        L19:
            int r0 = r4.oq
            int r3 = r4.av()
            int r3 = r3 - r2
            if (r0 >= r3) goto L23
            return r2
        L23:
            int r0 = r4.oq
            int r3 = r4.av()
            int r3 = r3 - r2
            if (r0 != r3) goto L36
            int r0 = r4.xt
            int r3 = r4.ae()
            int r3 = r3 - r2
            if (r0 >= r3) goto L36
            return r2
        L36:
            r4.kt = r2
            return r1
    }

    static /* synthetic */ int j(com.bytedance.adsdk.j.j.j.g r0, int r1) {
            r0.oq = r1
            return r1
    }

    static /* synthetic */ com.bytedance.adsdk.j.j.xt.m j(com.bytedance.adsdk.j.j.j.g r0, com.bytedance.adsdk.j.j.xt.m r1) {
            r0.mi = r1
            return r1
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean j(com.bytedance.adsdk.j.j.j.g r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.jy
            return r0
    }

    @com.bytedance.component.sdk.annotation.WorkerThread
    private void j() {
            r8 = this;
            java.lang.String r0 = " Set state to RUNNING,cost "
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.jy
            r2 = 1
            r3 = 0
            r1.compareAndSet(r2, r3)
            long r1 = java.lang.System.currentTimeMillis()
            java.util.List<com.bytedance.adsdk.j.j.j.tl<R extends com.bytedance.adsdk.j.j.xt.m, W extends com.bytedance.adsdk.j.j.xt.ae>> r3 = r8.j     // Catch: java.lang.Throwable -> L39
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L39
            if (r3 != 0) goto L3b
            R extends com.bytedance.adsdk.j.j.xt.m r3 = r8.mi     // Catch: java.lang.Throwable -> L26
            if (r3 != 0) goto L28
            com.bytedance.adsdk.j.j.cw.xt r3 = r8.tl     // Catch: java.lang.Throwable -> L26
            com.bytedance.adsdk.j.j.xt.m r3 = r3.xt()     // Catch: java.lang.Throwable -> L26
            com.bytedance.adsdk.j.j.xt.m r3 = r8.cw(r3)     // Catch: java.lang.Throwable -> L26
            r8.mi = r3     // Catch: java.lang.Throwable -> L26
            goto L2b
        L26:
            r3 = move-exception
            goto L35
        L28:
            r3.d_()     // Catch: java.lang.Throwable -> L26
        L2b:
            R extends com.bytedance.adsdk.j.j.xt.m r3 = r8.mi     // Catch: java.lang.Throwable -> L26
            android.graphics.Rect r3 = r8.xt(r3)     // Catch: java.lang.Throwable -> L26
            r8.j(r3)     // Catch: java.lang.Throwable -> L26
            goto L3b
        L35:
            com.bytedance.sdk.component.utils.vl.j(r3)     // Catch: java.lang.Throwable -> L39
            goto L3b
        L39:
            r3 = move-exception
            goto La2
        L3b:
            java.lang.String r3 = com.bytedance.adsdk.j.j.j.g.ae
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r8.az()
            r4.append(r5)
            r4.append(r0)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r1
            r4.append(r5)
            java.lang.String r0 = r4.toString()
            com.bytedance.sdk.component.utils.vl.j(r3, r0)
            com.bytedance.adsdk.j.j.j.g$xt r0 = com.bytedance.adsdk.j.j.j.g.xt.xt
            r8.tj = r0
            int r0 = r8.av()
            if (r0 == 0) goto L83
            boolean r0 = r8.kt
            if (r0 != 0) goto L6a
            goto L83
        L6a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.az()
            r0.append(r1)
            java.lang.String r1 = " No need to started"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.sdk.component.utils.vl.j(r3, r0)
            return
        L83:
            r0 = -1
            r8.xt = r0
            java.lang.Runnable r0 = r8.az
            r0.run()
            java.util.Set<com.bytedance.adsdk.j.j.j.g$j> r0 = r8.vl
            java.util.Iterator r0 = r0.iterator()
        L91:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La1
            java.lang.Object r1 = r0.next()
            com.bytedance.adsdk.j.j.j.g$j r1 = (com.bytedance.adsdk.j.j.j.g.j) r1
            r1.j()
            goto L91
        La1:
            return
        La2:
            java.lang.String r4 = com.bytedance.adsdk.j.j.j.g.ae
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r8.az()
            r5.append(r6)
            r5.append(r0)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r1
            r5.append(r6)
            java.lang.String r0 = r5.toString()
            com.bytedance.sdk.component.utils.vl.j(r4, r0)
            com.bytedance.adsdk.j.j.j.g$xt r0 = com.bytedance.adsdk.j.j.j.g.xt.xt
            r8.tj = r0
            throw r3
    }

    private void j(android.graphics.Rect r2) {
            r1 = this;
            r1.f1740m = r2
            int r0 = r2.width()
            int r2 = r2.height()
            int r0 = r0 * r2
            int r2 = r1.cw
            int r2 = r2 * r2
            int r0 = r0 / r2
            int r0 = r0 + 1
            int r0 = r0 * 4
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r0)
            r1.up = r2
            W extends com.bytedance.adsdk.j.j.xt.ae r2 = r1.f1742w
            if (r2 != 0) goto L25
            com.bytedance.adsdk.j.j.xt.ae r2 = r1.r()
            r1.f1742w = r2
        L25:
            return
    }

    static /* synthetic */ void j(com.bytedance.adsdk.j.j.j.g r0, android.graphics.Rect r1) {
            r0.j(r1)
            return
    }

    static /* synthetic */ boolean j(com.bytedance.adsdk.j.j.j.g r0, boolean r1) {
            r0.kt = r1
            return r1
    }

    static /* synthetic */ android.graphics.Rect jy() {
            android.graphics.Rect r0 = com.bytedance.adsdk.j.j.j.g.ws
            return r0
    }

    static /* synthetic */ com.bytedance.adsdk.j.j.xt.m m(com.bytedance.adsdk.j.j.j.g r0) {
            R extends com.bytedance.adsdk.j.j.xt.m r0 = r0.mi
            return r0
    }

    static /* synthetic */ android.os.Handler r(com.bytedance.adsdk.j.j.j.g r0) {
            android.os.Handler r0 = r0.g
            return r0
    }

    static /* synthetic */ void tl(com.bytedance.adsdk.j.j.j.g r0) {
            r0.j()
            return
    }

    static /* synthetic */ java.util.Set up(com.bytedance.adsdk.j.j.j.g r0) {
            java.util.Set<com.bytedance.adsdk.j.j.j.g$j> r0 = r0.vl
            return r0
    }

    @com.bytedance.component.sdk.annotation.WorkerThread
    private long w() {
            r2 = this;
            int r0 = r2.xt
            int r0 = r0 + 1
            r2.xt = r0
            int r1 = r2.ae()
            if (r0 < r1) goto L15
            r0 = 0
            r2.xt = r0
            int r0 = r2.oq
            int r0 = r0 + 1
            r2.oq = r0
        L15:
            int r0 = r2.xt
            com.bytedance.adsdk.j.j.j.tl r0 = r2.j(r0)
            if (r0 != 0) goto L20
            r0 = 0
            return r0
        L20:
            r2.j(r0)
            int r0 = r0.vl
            long r0 = (long) r0
            return r0
    }

    @com.bytedance.component.sdk.annotation.WorkerThread
    private void ws() {
            r4 = this;
            android.os.Handler r0 = r4.g
            java.lang.Runnable r1 = r4.az
            r0.removeCallbacks(r1)
            java.util.List<com.bytedance.adsdk.j.j.j.tl<R extends com.bytedance.adsdk.j.j.xt.m, W extends com.bytedance.adsdk.j.j.xt.ae>> r0 = r4.j
            r0.clear()
            java.lang.Object r0 = r4.i
            monitor-enter(r0)
            java.util.Set<android.graphics.Bitmap> r1 = r4.av     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2d
        L15:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2d
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L15
            boolean r3 = r2.isRecycled()     // Catch: java.lang.Throwable -> L2d
            if (r3 != 0) goto L15
            r2.recycle()     // Catch: java.lang.Throwable -> L2d
            goto L15
        L2d:
            r1 = move-exception
            goto L6a
        L2f:
            java.util.Set<android.graphics.Bitmap> r1 = r4.av     // Catch: java.lang.Throwable -> L2d
            r1.clear()     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            java.nio.ByteBuffer r0 = r4.up
            r1 = 0
            if (r0 == 0) goto L3c
            r4.up = r1
        L3c:
            java.util.Map<android.graphics.Bitmap, android.graphics.Canvas> r0 = r4.f1741r
            r0.clear()
            R extends com.bytedance.adsdk.j.j.xt.m r0 = r4.mi     // Catch: java.io.IOException -> L48
            if (r0 == 0) goto L4c
            r4.mi = r1     // Catch: java.io.IOException -> L48
            goto L4c
        L48:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L4c:
            r4.cw()
            com.bytedance.adsdk.j.j.j.g$xt r0 = com.bytedance.adsdk.j.j.j.g.xt.j
            r4.tj = r0
            java.util.Set<com.bytedance.adsdk.j.j.j.g$j> r0 = r4.vl
            java.util.Iterator r0 = r0.iterator()
        L59:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L69
            java.lang.Object r1 = r0.next()
            com.bytedance.adsdk.j.j.j.g$j r1 = (com.bytedance.adsdk.j.j.j.g.j) r1
            r1.xt()
            goto L59
        L69:
            return
        L6a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            throw r1
    }

    static /* synthetic */ boolean xt(com.bytedance.adsdk.j.j.j.g r0) {
            boolean r0 = r0.i()
            return r0
    }

    public int ae() {
            r1 = this;
            java.util.List<com.bytedance.adsdk.j.j.j.tl<R extends com.bytedance.adsdk.j.j.xt.m, W extends com.bytedance.adsdk.j.j.xt.ae>> r0 = r1.j
            int r0 = r0.size()
            return r0
    }

    protected int cw(int r3, int r4) {
            r2 = this;
            r0 = 1
            if (r3 == 0) goto L22
            if (r4 != 0) goto L6
            goto L22
        L6:
            android.graphics.Rect r1 = r2.m()
            int r1 = r1.width()
            int r1 = r1 / r3
            android.graphics.Rect r3 = r2.m()
            int r3 = r3.height()
            int r3 = r3 / r4
            int r3 = java.lang.Math.min(r1, r3)
        L1c:
            int r4 = r0 * 2
            if (r4 > r3) goto L22
            r0 = r4
            goto L1c
        L22:
            return r0
    }

    protected abstract R cw(com.bytedance.adsdk.j.j.xt.m r1);

    protected abstract void cw();

    public void g() {
            r4 = this;
            android.graphics.Rect r0 = r4.f1740m
            android.graphics.Rect r1 = com.bytedance.adsdk.j.j.j.g.ws
            if (r0 != r1) goto L7
            return
        L7:
            com.bytedance.adsdk.j.j.j.g$xt r0 = r4.tj
            com.bytedance.adsdk.j.j.j.g$xt r1 = com.bytedance.adsdk.j.j.j.g.xt.f1743r
            if (r0 == r1) goto L56
            com.bytedance.adsdk.j.j.j.g$xt r0 = r4.tj
            com.bytedance.adsdk.j.j.j.g$xt r2 = com.bytedance.adsdk.j.j.j.g.xt.j
            if (r0 != r2) goto L14
            goto L56
        L14:
            com.bytedance.adsdk.j.j.j.g$xt r0 = r4.tj
            com.bytedance.adsdk.j.j.j.g$xt r2 = com.bytedance.adsdk.j.j.j.g.xt.cw
            if (r0 != r2) goto L39
            java.lang.String r0 = com.bytedance.adsdk.j.j.j.g.ae
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.az()
            r2.append(r3)
            java.lang.String r3 = "Processing,wait for finish at "
            r2.append(r3)
            com.bytedance.adsdk.j.j.j.g$xt r3 = r4.tj
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.bytedance.sdk.component.utils.vl.r(r0, r2)
        L39:
            r4.tj = r1
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Handler r1 = r4.g
            android.os.Looper r1 = r1.getLooper()
            if (r0 != r1) goto L4b
            r4.ws()
            return
        L4b:
            android.os.Handler r0 = r4.g
            com.bytedance.adsdk.j.j.j.g$7 r1 = new com.bytedance.adsdk.j.j.j.g$7
            r1.<init>(r4)
            r0.post(r1)
            return
        L56:
            java.lang.String r0 = com.bytedance.adsdk.j.j.j.g.ae
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.az()
            r1.append(r2)
            java.lang.String r2 = "No need to stop"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.sdk.component.utils.vl.j(r0, r1)
            return
    }

    protected android.graphics.Bitmap j(int r7, int r8) {
            r6 = this;
            java.lang.Object r0 = r6.i
            monitor-enter(r0)
            java.util.Set<android.graphics.Bitmap> r1 = r6.av     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L33
            r2 = 0
            r3 = r2
        Lb:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L46
            int r3 = r7 * r8
            int r3 = r3 * 4
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L33
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L44
            int r5 = r4.getAllocationByteCount()     // Catch: java.lang.Throwable -> L33
            if (r5 < r3) goto L44
            r1.remove()     // Catch: java.lang.Throwable -> L33
            int r1 = r4.getWidth()     // Catch: java.lang.Throwable -> L33
            if (r1 != r7) goto L35
            int r1 = r4.getHeight()     // Catch: java.lang.Throwable -> L33
            if (r1 == r8) goto L3e
            goto L35
        L33:
            r7 = move-exception
            goto L61
        L35:
            if (r7 <= 0) goto L3e
            if (r8 <= 0) goto L3e
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch: java.lang.Throwable -> L33
            r4.reconfigure(r7, r8, r1)     // Catch: java.lang.Throwable -> L33
        L3e:
            r7 = 0
            r4.eraseColor(r7)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return r4
        L44:
            r3 = r4
            goto Lb
        L46:
            if (r7 <= 0) goto L5f
            if (r8 > 0) goto L4b
            goto L5f
        L4b:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch: java.lang.Throwable -> L33 java.lang.OutOfMemoryError -> L52 java.lang.Exception -> L54
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r7, r8, r1)     // Catch: java.lang.Throwable -> L33 java.lang.OutOfMemoryError -> L52 java.lang.Exception -> L54
            goto L5d
        L52:
            r7 = move-exception
            goto L56
        L54:
            r7 = move-exception
            goto L5a
        L56:
            com.bytedance.sdk.component.utils.vl.j(r7)     // Catch: java.lang.Throwable -> L33
            goto L5d
        L5a:
            com.bytedance.sdk.component.utils.vl.j(r7)     // Catch: java.lang.Throwable -> L33
        L5d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return r3
        L5f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return r2
        L61:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r7
    }

    public com.bytedance.adsdk.j.j.j.tl<R, W> j(int r2) {
            r1 = this;
            if (r2 < 0) goto L14
            java.util.List<com.bytedance.adsdk.j.j.j.tl<R extends com.bytedance.adsdk.j.j.xt.m, W extends com.bytedance.adsdk.j.j.xt.ae>> r0 = r1.j
            int r0 = r0.size()
            if (r2 < r0) goto Lb
            goto L14
        Lb:
            java.util.List<com.bytedance.adsdk.j.j.j.tl<R extends com.bytedance.adsdk.j.j.xt.m, W extends com.bytedance.adsdk.j.j.xt.ae>> r0 = r1.j
            java.lang.Object r2 = r0.get(r2)
            com.bytedance.adsdk.j.j.j.tl r2 = (com.bytedance.adsdk.j.j.j.tl) r2
            return r2
        L14:
            r2 = 0
            return r2
    }

    protected void j(android.graphics.Bitmap r3) {
            r2 = this;
            java.lang.Object r0 = r2.i
            monitor-enter(r0)
            if (r3 == 0) goto Ld
            java.util.Set<android.graphics.Bitmap> r1 = r2.av     // Catch: java.lang.Throwable -> Lb
            r1.add(r3)     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r3 = move-exception
            goto Lf
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r3
    }

    public void j(com.bytedance.adsdk.j.j.j.g.j r3) {
            r2 = this;
            android.os.Handler r0 = r2.g
            com.bytedance.adsdk.j.j.j.g$2 r1 = new com.bytedance.adsdk.j.j.j.g$2
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    protected abstract void j(com.bytedance.adsdk.j.j.j.tl<R, W> r1);

    public android.graphics.Rect m() {
            r3 = this;
            android.graphics.Rect r0 = r3.f1740m
            if (r0 != 0) goto L22
            com.bytedance.adsdk.j.j.j.g$xt r0 = r3.tj
            com.bytedance.adsdk.j.j.j.g$xt r1 = com.bytedance.adsdk.j.j.j.g.xt.f1743r
            if (r0 != r1) goto L11
            java.lang.String r0 = com.bytedance.adsdk.j.j.j.g.ae
            java.lang.String r1 = "In finishing,do not interrupt"
            com.bytedance.sdk.component.utils.vl.r(r0, r1)
        L11:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            android.os.Handler r1 = r3.g
            com.bytedance.adsdk.j.j.j.g$5 r2 = new com.bytedance.adsdk.j.j.j.g$5
            r2.<init>(r3, r0)
            r1.post(r2)
            java.util.concurrent.locks.LockSupport.park(r0)
        L22:
            android.graphics.Rect r0 = r3.f1740m
            if (r0 != 0) goto L29
            android.graphics.Rect r0 = com.bytedance.adsdk.j.j.j.g.ws
            return r0
        L29:
            android.graphics.Rect r0 = r3.f1740m
            return r0
    }

    public boolean oq() {
            r2 = this;
            com.bytedance.adsdk.j.j.j.g$xt r0 = r2.tj
            com.bytedance.adsdk.j.j.j.g$xt r1 = com.bytedance.adsdk.j.j.j.g.xt.xt
            if (r0 == r1) goto Lf
            com.bytedance.adsdk.j.j.j.g$xt r0 = r2.tj
            com.bytedance.adsdk.j.j.j.g$xt r1 = com.bytedance.adsdk.j.j.j.g.xt.cw
            if (r0 != r1) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    public void qv() {
            r2 = this;
            android.os.Handler r0 = r2.g
            com.bytedance.adsdk.j.j.j.g$8 r1 = new com.bytedance.adsdk.j.j.j.g$8
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    protected abstract W r();

    public void tl() {
            r4 = this;
            android.graphics.Rect r0 = r4.f1740m
            android.graphics.Rect r1 = com.bytedance.adsdk.j.j.j.g.ws
            if (r0 != r1) goto L7
            return
        L7:
            com.bytedance.adsdk.j.j.j.g$xt r0 = r4.tj
            com.bytedance.adsdk.j.j.j.g$xt r1 = com.bytedance.adsdk.j.j.j.g.xt.xt
            if (r0 == r1) goto L56
            com.bytedance.adsdk.j.j.j.g$xt r0 = r4.tj
            com.bytedance.adsdk.j.j.j.g$xt r1 = com.bytedance.adsdk.j.j.j.g.xt.cw
            if (r0 != r1) goto L14
            goto L56
        L14:
            com.bytedance.adsdk.j.j.j.g$xt r0 = r4.tj
            com.bytedance.adsdk.j.j.j.g$xt r2 = com.bytedance.adsdk.j.j.j.g.xt.f1743r
            if (r0 != r2) goto L39
            java.lang.String r0 = com.bytedance.adsdk.j.j.j.g.ae
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.az()
            r2.append(r3)
            java.lang.String r3 = " Processing,wait for finish at "
            r2.append(r3)
            com.bytedance.adsdk.j.j.j.g$xt r3 = r4.tj
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.bytedance.sdk.component.utils.vl.r(r0, r2)
        L39:
            r4.tj = r1
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Handler r1 = r4.g
            android.os.Looper r1 = r1.getLooper()
            if (r0 != r1) goto L4b
            r4.j()
            return
        L4b:
            android.os.Handler r0 = r4.g
            com.bytedance.adsdk.j.j.j.g$6 r1 = new com.bytedance.adsdk.j.j.j.g$6
            r1.<init>(r4)
            r0.post(r1)
            return
        L56:
            java.lang.String r0 = com.bytedance.adsdk.j.j.j.g.ae
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.az()
            r1.append(r2)
            java.lang.String r2 = " Already started"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.sdk.component.utils.vl.j(r0, r1)
            return
    }

    public void up() {
            r2 = this;
            android.os.Handler r0 = r2.g
            com.bytedance.adsdk.j.j.j.g$4 r1 = new com.bytedance.adsdk.j.j.j.g$4
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    public int vl() {
            r1 = this;
            int r0 = r1.cw
            return r0
    }

    protected abstract int xt();

    protected abstract android.graphics.Rect xt(R r1) throws java.io.IOException;

    public void xt(com.bytedance.adsdk.j.j.j.g.j r3) {
            r2 = this;
            android.os.Handler r0 = r2.g
            com.bytedance.adsdk.j.j.j.g$3 r1 = new com.bytedance.adsdk.j.j.j.g$3
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    public boolean xt(int r3, int r4) {
            r2 = this;
            int r3 = r2.cw(r3, r4)
            int r4 = r2.cw
            if (r3 == r4) goto L1f
            boolean r4 = r2.oq()
            android.os.Handler r0 = r2.g
            java.lang.Runnable r1 = r2.az
            r0.removeCallbacks(r1)
            android.os.Handler r0 = r2.g
            com.bytedance.adsdk.j.j.j.g$9 r1 = new com.bytedance.adsdk.j.j.j.g$9
            r1.<init>(r2, r3, r4)
            r0.post(r1)
            r3 = 1
            return r3
        L1f:
            r3 = 0
            return r3
    }
}
