package com.kwad.framework.filedownloader.services;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class h {
    private android.util.SparseArray<com.kwad.framework.filedownloader.download.DownloadLaunchRunnable> apt;
    private java.util.concurrent.ThreadPoolExecutor apu;
    private final java.lang.String apv;
    private int apw;
    private int apx;

    h(int r3) {
            r2 = this;
            r2.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.apt = r0
            java.lang.String r0 = "Network"
            r2.apv = r0
            r1 = 0
            r2.apx = r1
            java.util.concurrent.ThreadPoolExecutor r0 = com.kwad.framework.filedownloader.f.b.r(r3, r0)
            r2.apu = r0
            r2.apw = r3
            return
    }

    private synchronized void zt() {
            r6 = this;
            monitor-enter(r6)
            android.util.SparseArray r0 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L27
            r0.<init>()     // Catch: java.lang.Throwable -> L27
            android.util.SparseArray<com.kwad.framework.filedownloader.download.DownloadLaunchRunnable> r1 = r6.apt     // Catch: java.lang.Throwable -> L27
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L27
            r2 = 0
        Ld:
            if (r2 >= r1) goto L2c
            android.util.SparseArray<com.kwad.framework.filedownloader.download.DownloadLaunchRunnable> r3 = r6.apt     // Catch: java.lang.Throwable -> L27
            int r3 = r3.keyAt(r2)     // Catch: java.lang.Throwable -> L27
            android.util.SparseArray<com.kwad.framework.filedownloader.download.DownloadLaunchRunnable> r4 = r6.apt     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L27
            com.kwad.framework.filedownloader.download.DownloadLaunchRunnable r4 = (com.kwad.framework.filedownloader.download.DownloadLaunchRunnable) r4     // Catch: java.lang.Throwable -> L27
            boolean r5 = r4.isAlive()     // Catch: java.lang.Throwable -> L27
            if (r5 == 0) goto L29
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r0 = move-exception
            goto L30
        L29:
            int r2 = r2 + 1
            goto Ld
        L2c:
            r6.apt = r0     // Catch: java.lang.Throwable -> L27
            monitor-exit(r6)
            return
        L30:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L27
            throw r0
    }

    public final void a(com.kwad.framework.filedownloader.download.DownloadLaunchRunnable r3) {
            r2 = this;
            r3.ym()
            monitor-enter(r2)
            android.util.SparseArray<com.kwad.framework.filedownloader.download.DownloadLaunchRunnable> r0 = r2.apt     // Catch: java.lang.Throwable -> L25
            int r1 = r3.getId()     // Catch: java.lang.Throwable -> L25
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            java.util.concurrent.ThreadPoolExecutor r0 = r2.apu
            r0.execute(r3)
            int r3 = r2.apx
            r0 = 600(0x258, float:8.41E-43)
            if (r3 < r0) goto L20
            r2.zt()
            r3 = 0
            r2.apx = r3
            return
        L20:
            int r3 = r3 + 1
            r2.apx = r3
            return
        L25:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            throw r3
    }

    public final synchronized boolean bQ(int r7) {
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.zu()     // Catch: java.lang.Throwable -> L11
            r1 = 0
            if (r0 <= 0) goto L13
            java.lang.String r7 = "Can't change the max network thread count, because the  network thread pool isn't in IDLE, please try again after all running tasks are completed or invoking FileDownloader#pauseAll directly."
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L11
            com.kwad.framework.filedownloader.f.d.d(r6, r7, r0)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r6)
            return r1
        L11:
            r7 = move-exception
            goto L5b
        L13:
            int r7 = com.kwad.framework.filedownloader.f.e.ce(r7)     // Catch: java.lang.Throwable -> L11
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD     // Catch: java.lang.Throwable -> L11
            r2 = 1
            if (r0 == 0) goto L32
            java.lang.String r0 = "change the max network thread count, from %d to %d"
            int r3 = r6.apw     // Catch: java.lang.Throwable -> L11
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L11
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L11
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L11
            r5[r1] = r3     // Catch: java.lang.Throwable -> L11
            r5[r2] = r4     // Catch: java.lang.Throwable -> L11
            com.kwad.framework.filedownloader.f.d.c(r6, r0, r5)     // Catch: java.lang.Throwable -> L11
        L32:
            java.util.concurrent.ThreadPoolExecutor r0 = r6.apu     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r0.shutdownNow()     // Catch: java.lang.Throwable -> L11
            java.lang.String r3 = "Network"
            java.util.concurrent.ThreadPoolExecutor r3 = com.kwad.framework.filedownloader.f.b.r(r7, r3)     // Catch: java.lang.Throwable -> L11
            r6.apu = r3     // Catch: java.lang.Throwable -> L11
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L11
            if (r3 <= 0) goto L57
            java.lang.String r3 = "recreate the network thread pool and discard %d tasks"
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L11
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L11
            r4[r1] = r0     // Catch: java.lang.Throwable -> L11
            com.kwad.framework.filedownloader.f.d.d(r6, r3, r4)     // Catch: java.lang.Throwable -> L11
        L57:
            r6.apw = r7     // Catch: java.lang.Throwable -> L11
            monitor-exit(r6)
            return r2
        L5b:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L11
            throw r7
    }

    public final void cancel(int r6) {
            r5 = this;
            r5.zt()
            monitor-enter(r5)
            android.util.SparseArray<com.kwad.framework.filedownloader.download.DownloadLaunchRunnable> r0 = r5.apt     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L32
            com.kwad.framework.filedownloader.download.DownloadLaunchRunnable r0 = (com.kwad.framework.filedownloader.download.DownloadLaunchRunnable) r0     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L34
            r0.pause()     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.ThreadPoolExecutor r1 = r5.apu     // Catch: java.lang.Throwable -> L32
            boolean r0 = r1.remove(r0)     // Catch: java.lang.Throwable -> L32
            boolean r1 = com.kwad.framework.filedownloader.f.d.apD     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L34
            java.lang.String r1 = "successful cancel %d %B"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L32
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L32
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L32
            r4 = 0
            r3[r4] = r2     // Catch: java.lang.Throwable -> L32
            r2 = 1
            r3[r2] = r0     // Catch: java.lang.Throwable -> L32
            com.kwad.framework.filedownloader.f.d.c(r5, r1, r3)     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r6 = move-exception
            goto L3b
        L34:
            android.util.SparseArray<com.kwad.framework.filedownloader.download.DownloadLaunchRunnable> r0 = r5.apt     // Catch: java.lang.Throwable -> L32
            r0.remove(r6)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L32
            return
        L3b:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L32
            throw r6
    }

    public final boolean cd(int r2) {
            r1 = this;
            android.util.SparseArray<com.kwad.framework.filedownloader.download.DownloadLaunchRunnable> r0 = r1.apt
            java.lang.Object r2 = r0.get(r2)
            com.kwad.framework.filedownloader.download.DownloadLaunchRunnable r2 = (com.kwad.framework.filedownloader.download.DownloadLaunchRunnable) r2
            if (r2 == 0) goto L12
            boolean r2 = r2.isAlive()
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final int o(java.lang.String r6, int r7) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            android.util.SparseArray<com.kwad.framework.filedownloader.download.DownloadLaunchRunnable> r1 = r5.apt
            int r1 = r1.size()
            r2 = 0
        Lb:
            if (r2 >= r1) goto L35
            android.util.SparseArray<com.kwad.framework.filedownloader.download.DownloadLaunchRunnable> r3 = r5.apt
            java.lang.Object r3 = r3.valueAt(r2)
            com.kwad.framework.filedownloader.download.DownloadLaunchRunnable r3 = (com.kwad.framework.filedownloader.download.DownloadLaunchRunnable) r3
            if (r3 == 0) goto L32
            boolean r4 = r3.isAlive()
            if (r4 == 0) goto L32
            int r4 = r3.getId()
            if (r4 == r7) goto L32
            java.lang.String r4 = r3.yr()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L32
            int r6 = r3.getId()
            return r6
        L32:
            int r2 = r2 + 1
            goto Lb
        L35:
            return r0
    }

    public final synchronized int zu() {
            r1 = this;
            monitor-enter(r1)
            r1.zt()     // Catch: java.lang.Throwable -> Lc
            android.util.SparseArray<com.kwad.framework.filedownloader.download.DownloadLaunchRunnable> r0 = r1.apt     // Catch: java.lang.Throwable -> Lc
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return r0
        Lc:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    public final synchronized java.util.List<java.lang.Integer> zv() {
            r4 = this;
            monitor-enter(r4)
            r4.zt()     // Catch: java.lang.Throwable -> L2c
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2c
            r0.<init>()     // Catch: java.lang.Throwable -> L2c
            r1 = 0
        La:
            android.util.SparseArray<com.kwad.framework.filedownloader.download.DownloadLaunchRunnable> r2 = r4.apt     // Catch: java.lang.Throwable -> L2c
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L2c
            if (r1 >= r2) goto L2e
            android.util.SparseArray<com.kwad.framework.filedownloader.download.DownloadLaunchRunnable> r2 = r4.apt     // Catch: java.lang.Throwable -> L2c
            int r3 = r2.keyAt(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L2c
            com.kwad.framework.filedownloader.download.DownloadLaunchRunnable r2 = (com.kwad.framework.filedownloader.download.DownloadLaunchRunnable) r2     // Catch: java.lang.Throwable -> L2c
            int r2 = r2.getId()     // Catch: java.lang.Throwable -> L2c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L2c
            r0.add(r2)     // Catch: java.lang.Throwable -> L2c
            int r1 = r1 + 1
            goto La
        L2c:
            r0 = move-exception
            goto L30
        L2e:
            monitor-exit(r4)
            return r0
        L30:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2c
            throw r0
    }
}
