package com.ss.android.socialbase.downloader.downloader;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class j implements com.ss.android.socialbase.downloader.downloader.i {
    private static final java.lang.String up = "j";
    private android.os.Handler ae;
    protected volatile boolean cw;
    protected final android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.r>> j;
    private java.lang.ref.WeakReference<android.app.Service> m;
    protected volatile boolean r;
    private java.lang.Runnable tl;
    protected volatile boolean xt;


    static {
            return
    }

    public j() {
            r2 = this;
            r2.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.j = r0
            r0 = 0
            r2.xt = r0
            r2.r = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.ae = r0
            com.ss.android.socialbase.downloader.downloader.j$1 r0 = new com.ss.android.socialbase.downloader.downloader.j$1
            r0.<init>(r2)
            r2.tl = r0
            return
    }

    static /* synthetic */ java.lang.String m() {
            java.lang.String r0 = com.ss.android.socialbase.downloader.downloader.j.up
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void cw() {
            r0 = this;
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void cw(com.ss.android.socialbase.downloader.ae.r r1) {
            r0 = this;
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public android.os.IBinder j(android.content.Intent r2) {
            r1 = this;
            java.lang.String r2 = com.ss.android.socialbase.downloader.downloader.j.up
            java.lang.String r0 = "onBind Abs"
            com.ss.android.socialbase.downloader.m.j.xt(r2, r0)
            android.os.Binder r2 = new android.os.Binder
            r2.<init>()
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void j(int r1) {
            r0 = this;
            com.ss.android.socialbase.downloader.m.j.j(r1)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void j(int r4, android.app.Notification r5) {
            r3 = this;
            java.lang.ref.WeakReference<android.app.Service> r0 = r3.m
            if (r0 == 0) goto L49
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L49
            java.lang.String r0 = com.ss.android.socialbase.downloader.downloader.j.up
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "startForeground  id = "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = ", service = "
            r1.append(r2)
            java.lang.ref.WeakReference<android.app.Service> r2 = r3.m
            java.lang.Object r2 = r2.get()
            r1.append(r2)
            java.lang.String r2 = ",  isServiceAlive = "
            r1.append(r2)
            boolean r2 = r3.xt
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.cw(r0, r1)
            java.lang.ref.WeakReference<android.app.Service> r0 = r3.m     // Catch: java.lang.Exception -> L44
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L44
            android.app.Service r0 = (android.app.Service) r0     // Catch: java.lang.Exception -> L44
            r0.startForeground(r4, r5)     // Catch: java.lang.Exception -> L44
            r4 = 1
            r3.cw = r4     // Catch: java.lang.Exception -> L44
            return
        L44:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
            return
        L49:
            java.lang.String r4 = com.ss.android.socialbase.downloader.downloader.j.up
            java.lang.String r5 = "startForeground: downloadService is null, do nothing!"
            com.ss.android.socialbase.downloader.m.j.r(r4, r5)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void j(android.content.Intent r1, int r2, int r3) {
            r0 = this;
            return
    }

    public void j(com.ss.android.socialbase.downloader.ae.r r6) {
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            int r0 = r6.i()
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.r>> r1 = r5.j
            monitor-enter(r1)
            java.lang.String r2 = com.ss.android.socialbase.downloader.downloader.j.up     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = "pendDownloadTask pendingTasks.size:"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L40
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.r>> r4 = r5.j     // Catch: java.lang.Throwable -> L40
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L40
            r3.append(r4)     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = " downloadId:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L40
            r3.append(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L40
            com.ss.android.socialbase.downloader.m.j.xt(r2, r3)     // Catch: java.lang.Throwable -> L40
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.r>> r3 = r5.j     // Catch: java.lang.Throwable -> L40
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L40
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L40
            if (r3 != 0) goto L42
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L40
            r3.<init>()     // Catch: java.lang.Throwable -> L40
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.r>> r4 = r5.j     // Catch: java.lang.Throwable -> L40
            r4.put(r0, r3)     // Catch: java.lang.Throwable -> L40
            goto L42
        L40:
            r6 = move-exception
            goto L73
        L42:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = "before pendDownloadTask taskArray.size:"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L40
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L40
            r0.append(r4)     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L40
            com.ss.android.socialbase.downloader.m.j.xt(r2, r0)     // Catch: java.lang.Throwable -> L40
            r3.add(r6)     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = "after pendDownloadTask pendingTasks.size:"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L40
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.r>> r0 = r5.j     // Catch: java.lang.Throwable -> L40
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L40
            r6.append(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L40
            com.ss.android.socialbase.downloader.m.j.xt(r2, r6)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L40
            return
        L73:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L40
            throw r6
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void j(com.ss.android.socialbase.downloader.downloader.av r1) {
            r0 = this;
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void j(java.lang.ref.WeakReference r1) {
            r0 = this;
            r0.m = r1
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void j(boolean r4) {
            r3 = this;
            java.lang.ref.WeakReference<android.app.Service> r0 = r3.m
            if (r0 == 0) goto L40
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L40
            java.lang.String r0 = com.ss.android.socialbase.downloader.downloader.j.up
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "stopForeground  service = "
            r1.<init>(r2)
            java.lang.ref.WeakReference<android.app.Service> r2 = r3.m
            java.lang.Object r2 = r2.get()
            r1.append(r2)
            java.lang.String r2 = ",  isServiceAlive = "
            r1.append(r2)
            boolean r2 = r3.xt
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.cw(r0, r1)
            r0 = 0
            r3.cw = r0     // Catch: java.lang.Exception -> L3c
            java.lang.ref.WeakReference<android.app.Service> r0 = r3.m     // Catch: java.lang.Exception -> L3c
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L3c
            android.app.Service r0 = (android.app.Service) r0     // Catch: java.lang.Exception -> L3c
            r0.stopForeground(r4)     // Catch: java.lang.Exception -> L3c
            return
        L3c:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L40:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public boolean j() {
            r1 = this;
            boolean r0 = r1.xt
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void r() {
            r1 = this;
            r0 = 0
            r1.xt = r0
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void startService() {
            r2 = this;
            boolean r0 = r2.xt
            if (r0 != 0) goto L19
            boolean r0 = com.ss.android.socialbase.downloader.m.j.j()
            if (r0 == 0) goto L11
            java.lang.String r0 = com.ss.android.socialbase.downloader.downloader.j.up
            java.lang.String r1 = "startService"
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
        L11:
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            r1 = 0
            r2.startService(r0, r1)
        L19:
            return
    }

    protected void startService(android.content.Context r1, android.content.ServiceConnection r2) {
            r0 = this;
            return
    }

    protected void stopService(android.content.Context r1, android.content.ServiceConnection r2) {
            r0 = this;
            return
    }

    protected void up() {
            r8 = this;
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.r>> r0 = r8.j
            monitor-enter(r0)
            java.lang.String r1 = com.ss.android.socialbase.downloader.downloader.j.up     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            java.lang.String r3 = "resumePendingTask pendingTasks.size:"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L70
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.r>> r3 = r8.j     // Catch: java.lang.Throwable -> L70
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L70
            r2.append(r3)     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L70
            com.ss.android.socialbase.downloader.m.j.xt(r1, r2)     // Catch: java.lang.Throwable -> L70
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.r>> r1 = r8.j     // Catch: java.lang.Throwable -> L70
            android.util.SparseArray r1 = r1.clone()     // Catch: java.lang.Throwable -> L70
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.r>> r2 = r8.j     // Catch: java.lang.Throwable -> L70
            r2.clear()     // Catch: java.lang.Throwable -> L70
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L70
            com.ss.android.socialbase.downloader.impls.j r0 = com.ss.android.socialbase.downloader.downloader.cw.p()
            if (r0 == 0) goto L6f
            r2 = 0
        L2f:
            int r3 = r1.size()
            if (r2 >= r3) goto L6f
            int r3 = r1.keyAt(r2)
            java.lang.Object r3 = r1.get(r3)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L6c
            java.util.Iterator r3 = r3.iterator()
        L45:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6c
            java.lang.Object r4 = r3.next()
            com.ss.android.socialbase.downloader.ae.r r4 = (com.ss.android.socialbase.downloader.ae.r) r4
            java.lang.String r5 = com.ss.android.socialbase.downloader.downloader.j.up
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "resumePendingTask key:"
            r6.<init>(r7)
            int r7 = r4.i()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r5, r6)
            r0.j(r4)
            goto L45
        L6c:
            int r2 = r2 + 1
            goto L2f
        L6f:
            return
        L70:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L70
            throw r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void xt(com.ss.android.socialbase.downloader.ae.r r5) {
            r4 = this;
            if (r5 != 0) goto L4
            goto L81
        L4:
            boolean r0 = r4.xt
            if (r0 != 0) goto L59
            boolean r0 = com.ss.android.socialbase.downloader.m.j.j()
            if (r0 == 0) goto L15
            java.lang.String r0 = com.ss.android.socialbase.downloader.downloader.j.up
            java.lang.String r1 = "tryDownload but service is not alive"
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
        L15:
            r0 = 262144(0x40000, float:3.67342E-40)
            boolean r0 = com.ss.android.socialbase.downloader.az.j.j(r0)
            r1 = 0
            if (r0 == 0) goto L4e
            r4.j(r5)
            boolean r5 = r4.r
            if (r5 != 0) goto L3d
            boolean r5 = com.ss.android.socialbase.downloader.m.j.j()
            if (r5 == 0) goto L32
            java.lang.String r5 = com.ss.android.socialbase.downloader.downloader.j.up
            java.lang.String r0 = "tryDownload: 1"
            com.ss.android.socialbase.downloader.m.j.xt(r5, r0)
        L32:
            android.content.Context r5 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            r4.startService(r5, r1)
            r5 = 1
            r4.r = r5
            return
        L3d:
            android.os.Handler r5 = r4.ae
            java.lang.Runnable r0 = r4.tl
            r5.removeCallbacks(r0)
            android.os.Handler r5 = r4.ae
            java.lang.Runnable r0 = r4.tl
            r1 = 10
            r5.postDelayed(r0, r1)
            return
        L4e:
            r4.j(r5)
            android.content.Context r5 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            r4.startService(r5, r1)
            return
        L59:
            java.lang.String r0 = com.ss.android.socialbase.downloader.downloader.j.up
            java.lang.String r1 = "tryDownload when isServiceAlive"
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            r4.up()
            com.ss.android.socialbase.downloader.impls.j r1 = com.ss.android.socialbase.downloader.downloader.cw.p()
            if (r1 == 0) goto L81
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "tryDownload current task: "
            r2.<init>(r3)
            int r3 = r5.i()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r2)
            r1.j(r5)
        L81:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public boolean xt() {
            r3 = this;
            java.lang.String r0 = com.ss.android.socialbase.downloader.downloader.j.up
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "isServiceForeground = "
            r1.<init>(r2)
            boolean r2 = r3.cw
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.cw(r0, r1)
            boolean r0 = r3.cw
            return r0
    }
}
