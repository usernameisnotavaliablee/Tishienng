package com.ss.android.socialbase.downloader.impls;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ws extends com.ss.android.socialbase.downloader.downloader.j implements android.content.ServiceConnection {
    private static final java.lang.String up = "ws";
    private com.ss.android.socialbase.downloader.downloader.av ae;
    private com.ss.android.socialbase.downloader.downloader.qv m;
    private int tl;

    static {
            return
    }

    public ws() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.tl = r0
            return
    }

    private void ae() {
            r5 = this;
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.r>> r0 = r5.j     // Catch: java.lang.Throwable -> L4a
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L4a
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.r>> r1 = r5.j     // Catch: java.lang.Throwable -> L55
            android.util.SparseArray r1 = r1.clone()     // Catch: java.lang.Throwable -> L55
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.r>> r2 = r5.j     // Catch: java.lang.Throwable -> L55
            r2.clear()     // Catch: java.lang.Throwable -> L55
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L54
            int r0 = r1.size()     // Catch: java.lang.Throwable -> L4a
            if (r0 <= 0) goto L54
            com.ss.android.socialbase.downloader.impls.j r0 = com.ss.android.socialbase.downloader.downloader.cw.p()     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L54
            r0 = 0
        L1e:
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L4a
            if (r0 >= r2) goto L54
            int r2 = r1.keyAt(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L4a
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L51
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L4a
        L34:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L51
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L4a
            com.ss.android.socialbase.downloader.ae.r r3 = (com.ss.android.socialbase.downloader.ae.r) r3     // Catch: java.lang.Throwable -> L4a
            com.ss.android.socialbase.downloader.downloader.qv r4 = r5.m     // Catch: java.lang.Throwable -> L4a android.os.RemoteException -> L4c
            com.ss.android.socialbase.downloader.ae.j r3 = com.ss.android.socialbase.downloader.az.ae.j(r3)     // Catch: java.lang.Throwable -> L4a android.os.RemoteException -> L4c
            r4.j(r3)     // Catch: java.lang.Throwable -> L4a android.os.RemoteException -> L4c
            goto L34
        L4a:
            r0 = move-exception
            goto L58
        L4c:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)     // Catch: java.lang.Throwable -> L4a
            goto L34
        L51:
            int r0 = r0 + 1
            goto L1e
        L54:
            return
        L55:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L55
            throw r1     // Catch: java.lang.Throwable -> L4a
        L58:
            java.lang.String r1 = com.ss.android.socialbase.downloader.impls.ws.up
            java.lang.String r2 = "resumePendingTaskForIndependent failed"
            com.ss.android.socialbase.downloader.m.j.xt(r1, r2, r0)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j, com.ss.android.socialbase.downloader.downloader.i
    public void cw(com.ss.android.socialbase.downloader.ae.r r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L18
        L3:
            com.ss.android.socialbase.downloader.downloader.r r0 = com.ss.android.socialbase.downloader.downloader.r.j()
            int r1 = r4.i()
            r2 = 1
            r0.j(r1, r2)
            com.ss.android.socialbase.downloader.impls.j r0 = com.ss.android.socialbase.downloader.downloader.cw.p()
            if (r0 == 0) goto L18
            r0.j(r4)
        L18:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j, com.ss.android.socialbase.downloader.downloader.i
    public android.os.IBinder j(android.content.Intent r3) {
            r2 = this;
            if (r3 == 0) goto L18
            java.lang.String r0 = "fix_downloader_db_sigbus"
            r1 = 0
            boolean r3 = r3.getBooleanExtra(r0, r1)
            if (r3 == 0) goto L18
            java.lang.String r3 = com.ss.android.socialbase.downloader.impls.ws.up
            java.lang.String r0 = "downloader process sync database on main process!"
            com.bytedance.sdk.component.utils.vl.xt(r3, r0)
            java.lang.String r3 = "fix_sigbus_downloader_db"
            r0 = 1
            com.ss.android.socialbase.downloader.jy.j.j(r3, r0)
        L18:
            java.lang.String r3 = com.ss.android.socialbase.downloader.impls.ws.up
            java.lang.String r0 = "onBind IndependentDownloadBinder"
            com.ss.android.socialbase.downloader.m.j.xt(r3, r0)
            com.ss.android.socialbase.downloader.impls.jy r3 = new com.ss.android.socialbase.downloader.impls.jy
            r3.<init>()
            return r3
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j, com.ss.android.socialbase.downloader.downloader.i
    public void j(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.m
            if (r0 != 0) goto L7
            r1.tl = r2
            return
        L7:
            r0.vl(r2)     // Catch: android.os.RemoteException -> Lb
            return
        Lb:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j, com.ss.android.socialbase.downloader.downloader.i
    public void j(com.ss.android.socialbase.downloader.downloader.av r1) {
            r0 = this;
            r0.ae = r1
            return
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(android.content.ComponentName r1) {
            r0 = this;
            r1 = 0
            r0.m = r1
            com.ss.android.socialbase.downloader.downloader.av r1 = r0.ae
            if (r1 == 0) goto La
            r1.tl()
        La:
            return
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
            r3 = this;
            java.lang.String r4 = com.ss.android.socialbase.downloader.impls.ws.up
            java.lang.String r0 = "onServiceConnected "
            com.ss.android.socialbase.downloader.m.j.xt(r4, r0)
            com.ss.android.socialbase.downloader.downloader.qv r0 = com.ss.android.socialbase.downloader.downloader.qv.j.j(r5)
            r3.m = r0
            com.ss.android.socialbase.downloader.downloader.av r0 = r3.ae
            if (r0 == 0) goto L14
            r0.j(r5)
        L14:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "onServiceConnected aidlService!=null"
            r5.<init>(r0)
            com.ss.android.socialbase.downloader.downloader.qv r0 = r3.m
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            r5.append(r0)
            java.lang.String r0 = " pendingTasks.size:"
            r5.append(r0)
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.ae.r>> r0 = r3.j
            int r0 = r0.size()
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r4, r5)
            com.ss.android.socialbase.downloader.downloader.qv r4 = r3.m
            if (r4 == 0) goto L61
            com.ss.android.socialbase.downloader.downloader.r r4 = com.ss.android.socialbase.downloader.downloader.r.j()
            r4.xt()
            r3.xt = r2
            r3.r = r1
            int r4 = r3.tl
            r5 = -1
            if (r4 == r5) goto L5a
            com.ss.android.socialbase.downloader.downloader.qv r5 = r3.m     // Catch: android.os.RemoteException -> L56
            r5.vl(r4)     // Catch: android.os.RemoteException -> L56
            goto L5a
        L56:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L5a:
            com.ss.android.socialbase.downloader.downloader.qv r4 = r3.m
            if (r4 == 0) goto L61
            r3.ae()
        L61:
            return
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName r2) {
            r1 = this;
            java.lang.String r2 = com.ss.android.socialbase.downloader.impls.ws.up
            java.lang.String r0 = "onServiceDisconnected "
            com.ss.android.socialbase.downloader.m.j.xt(r2, r0)
            r2 = 0
            r1.m = r2
            r2 = 0
            r1.xt = r2
            com.ss.android.socialbase.downloader.downloader.av r2 = r1.ae
            if (r2 == 0) goto L14
            r2.tl()
        L14:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j, com.ss.android.socialbase.downloader.downloader.i
    public void startService() {
            r1 = this;
            com.ss.android.socialbase.downloader.downloader.qv r0 = r1.m
            if (r0 != 0) goto Lb
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            r1.startService(r0, r1)
        Lb:
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void startService(android.content.Context r5, android.content.ServiceConnection r6) {
            r4 = this;
            java.lang.String r0 = com.ss.android.socialbase.downloader.impls.ws.up     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "bindService"
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)     // Catch: java.lang.Throwable -> L24
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L24
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.CSJIndependentProcessDownloadService> r1 = com.ss.android.socialbase.downloader.downloader.CSJIndependentProcessDownloadService.class
            r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> L24
            boolean r1 = com.ss.android.socialbase.downloader.az.m.j()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            java.lang.String r1 = "fix_downloader_db_sigbus"
            com.ss.android.socialbase.downloader.jy.j r2 = com.ss.android.socialbase.downloader.jy.j.cw()     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = "fix_sigbus_downloader_db"
            boolean r2 = r2.j(r3)     // Catch: java.lang.Throwable -> L24
            r0.putExtra(r1, r2)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r5 = move-exception
            goto L30
        L26:
            if (r6 == 0) goto L2c
            r1 = 1
            r5.bindService(r0, r6, r1)     // Catch: java.lang.Throwable -> L24
        L2c:
            r5.startService(r0)     // Catch: java.lang.Throwable -> L24
            return
        L30:
            com.bytedance.sdk.component.utils.vl.j(r5)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void stopService(android.content.Context r3, android.content.ServiceConnection r4) {
            r2 = this;
            java.lang.String r0 = com.ss.android.socialbase.downloader.impls.ws.up
            java.lang.String r1 = "stopService"
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            r0 = 0
            r2.xt = r0
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.ss.android.socialbase.downloader.downloader.CSJIndependentProcessDownloadService> r1 = com.ss.android.socialbase.downloader.downloader.CSJIndependentProcessDownloadService.class
            r0.<init>(r3, r1)
            if (r4 == 0) goto L16
            r3.unbindService(r4)
        L16:
            r3.stopService(r0)
            return
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j, com.ss.android.socialbase.downloader.downloader.i
    public void xt(com.ss.android.socialbase.downloader.ae.r r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.String r0 = com.ss.android.socialbase.downloader.impls.ws.up
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "tryDownload aidlService == null:"
            r1.<init>(r2)
            com.ss.android.socialbase.downloader.downloader.qv r2 = r3.m
            if (r2 != 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r1)
            com.ss.android.socialbase.downloader.downloader.qv r0 = r3.m
            if (r0 != 0) goto L2c
            r3.j(r4)
            android.content.Context r4 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            r3.startService(r4, r3)
            return
        L2c:
            r3.ae()
            com.ss.android.socialbase.downloader.downloader.qv r0 = r3.m     // Catch: android.os.RemoteException -> L39
            com.ss.android.socialbase.downloader.ae.j r4 = com.ss.android.socialbase.downloader.az.ae.j(r4)     // Catch: android.os.RemoteException -> L39
            r0.j(r4)     // Catch: android.os.RemoteException -> L39
            return
        L39:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
            return
    }
}
