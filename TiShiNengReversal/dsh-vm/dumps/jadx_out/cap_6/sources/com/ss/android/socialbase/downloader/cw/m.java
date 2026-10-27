package com.ss.android.socialbase.downloader.cw;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class m implements android.content.ServiceConnection, com.ss.android.socialbase.downloader.downloader.tj {
    private static int cw;
    private static long r;
    private static boolean xt;
    private com.ss.android.socialbase.downloader.downloader.cw.j.InterfaceC0002j ae;
    private java.util.concurrent.Future<?> g;

    @androidx.annotation.Nullable
    private com.ss.android.socialbase.downloader.cw.cw j;
    private com.ss.android.socialbase.downloader.cw.xt m;
    private java.util.concurrent.CountDownLatch oq;
    private java.lang.Runnable tl;
    private android.os.Handler up;





    static {
            return
    }

    public m() {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.up = r0
            r0 = 0
            r2.m = r0
            com.ss.android.socialbase.downloader.cw.m$1 r0 = new com.ss.android.socialbase.downloader.cw.m$1
            r0.<init>(r2)
            r2.tl = r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            r2.oq = r0
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            com.ss.android.socialbase.downloader.downloader.SqlDownloadCacheService.j(r0, r2)
            return
    }

    static /* synthetic */ android.os.Handler ae(com.ss.android.socialbase.downloader.cw.m r0) {
            android.os.Handler r0 = r0.up
            return r0
    }

    private boolean ae() {
            r9 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 0
            if (r0 < r1) goto L8
            return r2
        L8:
            boolean r0 = com.ss.android.socialbase.downloader.cw.m.xt
            if (r0 == 0) goto Ld
            return r2
        Ld:
            int r0 = com.ss.android.socialbase.downloader.cw.m.cw
            r1 = 5
            java.lang.String r3 = "SqlDownloadCacheAidlWra"
            if (r0 <= r1) goto L1a
            java.lang.String r0 = "bindMainProcess: bind too many times!!! "
            com.ss.android.socialbase.downloader.m.j.r(r3, r0)
            return r2
        L1a:
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = com.ss.android.socialbase.downloader.cw.m.r
            long r4 = r0 - r4
            r6 = 15000(0x3a98, double:7.411E-320)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L2e
            java.lang.String r0 = "bindMainProcess: time too short since last bind!!! "
            com.ss.android.socialbase.downloader.m.j.r(r3, r0)
            return r2
        L2e:
            int r2 = com.ss.android.socialbase.downloader.cw.m.cw
            r3 = 1
            int r2 = r2 + r3
            com.ss.android.socialbase.downloader.cw.m.cw = r2
            com.ss.android.socialbase.downloader.cw.m.r = r0
            android.os.Handler r0 = r9.up
            com.ss.android.socialbase.downloader.cw.m$3 r1 = new com.ss.android.socialbase.downloader.cw.m$3
            r1.<init>(r9)
            r4 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r1, r4)
            return r3
    }

    static /* synthetic */ com.ss.android.socialbase.downloader.cw.cw cw(com.ss.android.socialbase.downloader.cw.m r0) {
            com.ss.android.socialbase.downloader.cw.cw r0 = r0.j
            return r0
    }

    static /* synthetic */ com.ss.android.socialbase.downloader.downloader.cw.j.InterfaceC0002j j(com.ss.android.socialbase.downloader.cw.m r0) {
            com.ss.android.socialbase.downloader.downloader.cw$j$j r0 = r0.ae
            return r0
    }

    static /* synthetic */ boolean j(boolean r0) {
            com.ss.android.socialbase.downloader.cw.m.xt = r0
            return r0
    }

    static /* synthetic */ java.lang.Runnable m(com.ss.android.socialbase.downloader.cw.m r0) {
            java.lang.Runnable r0 = r0.tl
            return r0
    }

    static /* synthetic */ boolean m() {
            boolean r0 = com.ss.android.socialbase.downloader.cw.m.xt
            return r0
    }

    static /* synthetic */ java.util.concurrent.CountDownLatch r(com.ss.android.socialbase.downloader.cw.m r0) {
            java.util.concurrent.CountDownLatch r0 = r0.oq
            return r0
    }

    static /* synthetic */ java.util.concurrent.Future tl(com.ss.android.socialbase.downloader.cw.m r0) {
            java.util.concurrent.Future<?> r0 = r0.g
            return r0
    }

    static /* synthetic */ boolean up(com.ss.android.socialbase.downloader.cw.m r0) {
            boolean r0 = r0.ae()
            return r0
    }

    static /* synthetic */ com.ss.android.socialbase.downloader.cw.xt xt(com.ss.android.socialbase.downloader.cw.m r0) {
            com.ss.android.socialbase.downloader.cw.xt r0 = r0.m
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw ae(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Ld
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.ae(r2)     // Catch: android.os.RemoteException -> L9
            return r2
        L9:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        Ld:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw cw(int r2, long r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Ld
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.cw(r2, r3)     // Catch: android.os.RemoteException -> L9
            return r2
        L9:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        Ld:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public java.util.List<com.ss.android.socialbase.downloader.ae.xt> cw(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Ld
            java.util.List r2 = r0.cw(r2)     // Catch: android.os.RemoteException -> L9
            return r2
        L9:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        Ld:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> cw(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Ld
            java.util.List r2 = r0.cw(r2)     // Catch: android.os.RemoteException -> L9
            return r2
        L9:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        Ld:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void cw() {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L8
            if (r0 == 0) goto La
            r0.cw()     // Catch: android.os.RemoteException -> L8
            return
        L8:
            r0 = move-exception
            goto Lb
        La:
            return
        Lb:
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw g(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Ld
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.g(r2)     // Catch: android.os.RemoteException -> L9
            return r2
        L9:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        Ld:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw j(int r2, int r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Ld
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.j(r2, r3)     // Catch: android.os.RemoteException -> L9
            return r2
        L9:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        Ld:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw j(int r2, long r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Ld
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.j(r2, r3)     // Catch: android.os.RemoteException -> L9
            return r2
        L9:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        Ld:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw j(int r7, long r8, java.lang.String r10, java.lang.String r11) {
            r6 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r6.j     // Catch: android.os.RemoteException -> Ld
            if (r0 == 0) goto L12
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            com.ss.android.socialbase.downloader.ae.cw r7 = r0.j(r1, r2, r4, r5)     // Catch: android.os.RemoteException -> Ld
            return r7
        Ld:
            r0 = move-exception
            r7 = r0
            com.bytedance.sdk.component.utils.vl.j(r7)
        L12:
            r7 = 0
            return r7
    }

    public java.util.ArrayList<com.ss.android.socialbase.downloader.qv.g> j(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> j(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Ld
            java.util.List r2 = r0.j(r2)     // Catch: android.os.RemoteException -> L9
            return r2
        L9:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        Ld:
            r2 = 0
            return r2
    }

    public void j() {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L8
            if (r0 == 0) goto La
            r0.j()     // Catch: android.os.RemoteException -> L8
            return
        L8:
            r0 = move-exception
            goto Lb
        La:
            return
        Lb:
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void j(int r2, int r3, int r4, int r5) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L8
            if (r0 == 0) goto La
            r0.j(r2, r3, r4, r5)     // Catch: android.os.RemoteException -> L8
            return
        L8:
            r2 = move-exception
            goto Lb
        La:
            return
        Lb:
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void j(int r7, int r8, int r9, long r10) {
            r6 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r6.j     // Catch: android.os.RemoteException -> Lc
            if (r0 == 0) goto Lf
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.j(r1, r2, r3, r4)     // Catch: android.os.RemoteException -> Lc
            return
        Lc:
            r0 = move-exception
            r7 = r0
            goto L10
        Lf:
            return
        L10:
            com.bytedance.sdk.component.utils.vl.j(r7)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void j(int r2, int r3, long r4) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L8
            if (r0 == 0) goto La
            r0.j(r2, r3, r4)     // Catch: android.os.RemoteException -> L8
            return
        L8:
            r2 = move-exception
            goto Lb
        La:
            return
        Lb:
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void j(int r2, java.util.List<com.ss.android.socialbase.downloader.ae.xt> r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L8
            if (r0 == 0) goto La
            r0.j(r2, r3)     // Catch: android.os.RemoteException -> L8
            return
        L8:
            r2 = move-exception
            goto Lb
        La:
            return
        Lb:
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.tj
    public void j(android.util.SparseArray<com.ss.android.socialbase.downloader.ae.cw> r3, android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.xt>> r4, com.ss.android.socialbase.downloader.cw.r r5) {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.qv()
            com.ss.android.socialbase.downloader.cw.m$4 r1 = new com.ss.android.socialbase.downloader.cw.m$4
            r1.<init>(r2, r3, r4, r5)
            r0.submit(r1)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void j(com.ss.android.socialbase.downloader.ae.xt r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L8
            if (r0 == 0) goto La
            r0.j(r2)     // Catch: android.os.RemoteException -> L8
            return
        L8:
            r2 = move-exception
            goto Lb
        La:
            return
        Lb:
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    public void j(com.ss.android.socialbase.downloader.cw.xt r2) {
            r1 = this;
            monitor-enter(r1)
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L10
            r0.j(r2)     // Catch: java.lang.Throwable -> L9 android.os.RemoteException -> Lb
            goto L12
        L9:
            r2 = move-exception
            goto L14
        Lb:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)     // Catch: java.lang.Throwable -> L9
            goto L12
        L10:
            r1.m = r2     // Catch: java.lang.Throwable -> L9
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            return
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public void j(com.ss.android.socialbase.downloader.downloader.cw.j.InterfaceC0002j r1) {
            r0 = this;
            r0.ae = r1
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public boolean j(int r1, java.util.Map<java.lang.Long, com.ss.android.socialbase.downloader.qv.g> r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public boolean j(com.ss.android.socialbase.downloader.ae.cw r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Ld
            boolean r2 = r0.j(r2)     // Catch: android.os.RemoteException -> L9
            return r2
        L9:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        Ld:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void jy(int r1) {
            r0 = this;
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public boolean m(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Ld
            boolean r2 = r0.m(r2)     // Catch: android.os.RemoteException -> L9
            return r2
        L9:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        Ld:
            r2 = 0
            return r2
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName r2, android.os.IBinder r3) {
            r1 = this;
            r2 = 1
            com.ss.android.socialbase.downloader.cw.m.xt = r2
            android.os.Handler r2 = r1.up
            java.lang.Runnable r0 = r1.tl
            r2.removeCallbacks(r0)
            com.ss.android.socialbase.downloader.cw.cw r2 = com.ss.android.socialbase.downloader.cw.cw.j.j(r3)     // Catch: java.lang.Throwable -> L11
            r1.j = r2     // Catch: java.lang.Throwable -> L11
            goto L15
        L11:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        L15:
            java.util.concurrent.ExecutorService r2 = com.ss.android.socialbase.downloader.downloader.cw.qv()
            com.ss.android.socialbase.downloader.cw.m$2 r0 = new com.ss.android.socialbase.downloader.cw.m$2
            r0.<init>(r1, r3)
            java.util.concurrent.Future r2 = r2.submit(r0)
            r1.g = r2
            return
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName r1) {
            r0 = this;
            r1 = 0
            r0.j = r1
            r1 = 0
            com.ss.android.socialbase.downloader.cw.m.xt = r1
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw oq(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Ld
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.oq(r2)     // Catch: android.os.RemoteException -> L9
            return r2
        L9:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        Ld:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw r(int r2, long r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Ld
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.r(r2, r3)     // Catch: android.os.RemoteException -> L9
            return r2
        L9:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        Ld:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> r(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Ld
            java.util.List r2 = r0.r(r2)     // Catch: android.os.RemoteException -> L9
            return r2
        L9:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        Ld:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void r(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L8
            if (r0 == 0) goto La
            r0.r(r2)     // Catch: android.os.RemoteException -> L8
            return
        L8:
            r2 = move-exception
            goto Lb
        La:
            return
        Lb:
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public boolean r() {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Ld
            boolean r0 = r0.r()     // Catch: android.os.RemoteException -> L9
            return r0
        L9:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        Ld:
            r0 = 0
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw tl(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Ld
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.tl(r2)     // Catch: android.os.RemoteException -> L9
            return r2
        L9:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        Ld:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public boolean up() {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Ld
            boolean r0 = r0.up()     // Catch: android.os.RemoteException -> L9
            return r0
        L9:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        Ld:
            r0 = 0
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public boolean up(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Ld
            boolean r2 = r0.up(r2)     // Catch: android.os.RemoteException -> L9
            return r2
        L9:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        Ld:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public java.util.Map<java.lang.Long, com.ss.android.socialbase.downloader.qv.g> vl(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public /* synthetic */ java.util.List ws(int r1) {
            r0 = this;
            java.util.ArrayList r1 = r0.j(r1)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw xt(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Ld
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.xt(r2)     // Catch: android.os.RemoteException -> L9
            return r2
        L9:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        Ld:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public com.ss.android.socialbase.downloader.ae.cw xt(int r2, long r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Ld
            com.ss.android.socialbase.downloader.ae.cw r2 = r0.xt(r2, r3)     // Catch: android.os.RemoteException -> L9
            return r2
        L9:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        Ld:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> xt() {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Ld
            java.util.List r0 = r0.xt()     // Catch: android.os.RemoteException -> L9
            return r0
        L9:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        Ld:
            r0 = 0
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public java.util.List<com.ss.android.socialbase.downloader.ae.cw> xt(java.lang.String r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L9
            if (r0 == 0) goto Ld
            java.util.List r2 = r0.xt(r2)     // Catch: android.os.RemoteException -> L9
            return r2
        L9:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        Ld:
            r2 = 0
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void xt(int r2, java.util.List<com.ss.android.socialbase.downloader.ae.xt> r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L8
            if (r0 == 0) goto La
            r0.xt(r2, r3)     // Catch: android.os.RemoteException -> L8
            return
        L8:
            r2 = move-exception
            goto Lb
        La:
            return
        Lb:
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void xt(com.ss.android.socialbase.downloader.ae.cw r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L8
            if (r0 == 0) goto La
            r0.xt(r2)     // Catch: android.os.RemoteException -> L8
            return
        L8:
            r2 = move-exception
            goto Lb
        La:
            return
        Lb:
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.vl
    public void xt(com.ss.android.socialbase.downloader.ae.xt r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.cw.cw r0 = r1.j     // Catch: android.os.RemoteException -> L8
            if (r0 == 0) goto La
            r0.xt(r2)     // Catch: android.os.RemoteException -> L8
            return
        L8:
            r2 = move-exception
            goto Lb
        La:
            return
        Lb:
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }
}
