package com.ss.android.socialbase.downloader.impls;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class up extends com.ss.android.socialbase.downloader.impls.j {
    private static com.ss.android.socialbase.downloader.ws.r xt;

    public up() {
            r1 = this;
            r1.<init>()
            com.ss.android.socialbase.downloader.ws.r r0 = new com.ss.android.socialbase.downloader.ws.r
            r0.<init>()
            com.ss.android.socialbase.downloader.impls.up.xt = r0
            return
    }

    public static void cw(java.util.List<java.util.concurrent.Callable<java.lang.Object>> r1) throws java.lang.InterruptedException {
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.av()
            if (r0 == 0) goto L9
            r0.invokeAll(r1)
        L9:
            return
    }

    public static java.util.List<java.util.concurrent.Future> r(java.util.List<java.lang.Runnable> r3) {
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.av()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r3.size()
            r1.<init>(r2)
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r3.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            java.util.concurrent.Future r2 = r0.submit(r2)
            r1.add(r2)
            goto L11
        L25:
            return r1
    }

    public static java.lang.Runnable up(java.util.List<java.util.concurrent.Future> r5) {
            r0 = 0
            if (r5 == 0) goto L5d
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto La
            goto L5d
        La:
            java.util.concurrent.ExecutorService r1 = com.ss.android.socialbase.downloader.downloader.cw.av()     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r1 instanceof java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L5d
            java.util.concurrent.ThreadPoolExecutor r1 = (java.util.concurrent.ThreadPoolExecutor) r1     // Catch: java.lang.Throwable -> L3d
            java.util.concurrent.BlockingQueue r1 = r1.getQueue()     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L5d
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L5d
            java.util.Iterator r2 = r5.iterator()     // Catch: java.lang.Throwable -> L3d
        L24:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3d
            if (r3 == 0) goto L3f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3d
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3     // Catch: java.lang.Throwable -> L3d
            boolean r4 = r3 instanceof java.lang.Runnable     // Catch: java.lang.Throwable -> L3d
            if (r4 == 0) goto L24
            boolean r4 = r1.remove(r3)     // Catch: java.lang.Throwable -> L3d
            if (r4 == 0) goto L24
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L3d
            goto L40
        L3d:
            r5 = move-exception
            goto L46
        L3f:
            r3 = r0
        L40:
            if (r3 == 0) goto L5d
            r5.remove(r3)     // Catch: java.lang.Throwable -> L3d
            return r3
        L46:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getUnstartedTask() error: "
            r1.<init>(r2)
            java.lang.String r5 = r5.toString()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "DefaultDownloadEngine"
            com.ss.android.socialbase.downloader.m.j.r(r1, r5)
        L5d:
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.impls.j
    protected com.ss.android.socialbase.downloader.ws.cw cw(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ws.r r0 = com.ss.android.socialbase.downloader.impls.up.xt
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            com.ss.android.socialbase.downloader.ws.cw r2 = r0.xt(r2)
            return r2
    }

    @Override // com.ss.android.socialbase.downloader.impls.j
    public java.util.List<java.lang.Integer> j() {
            r1 = this;
            com.ss.android.socialbase.downloader.ws.r r0 = com.ss.android.socialbase.downloader.impls.up.xt
            java.util.List r0 = r0.j()
            return r0
    }

    @Override // com.ss.android.socialbase.downloader.impls.j
    public void j(int r2, long r3) {
            r1 = this;
            com.ss.android.socialbase.downloader.ws.r r0 = com.ss.android.socialbase.downloader.impls.up.xt
            if (r0 != 0) goto L5
            return
        L5:
            r0.j(r2, r3)
            return
    }

    @Override // com.ss.android.socialbase.downloader.impls.j
    public void j(int r2, com.ss.android.socialbase.downloader.ae.r r3) {
            r1 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "start doDownload for task : "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r0.concat(r2)
            java.lang.String r0 = "DownloadTask"
            com.ss.android.socialbase.downloader.m.j.xt(r0, r2)
            com.ss.android.socialbase.downloader.ws.cw r2 = new com.ss.android.socialbase.downloader.ws.cw
            com.ss.android.socialbase.downloader.ws.tl r0 = r1.j
            r2.<init>(r3, r0)
            com.ss.android.socialbase.downloader.ws.r r3 = com.ss.android.socialbase.downloader.impls.up.xt
            r3.j(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.impls.j
    public void j(com.ss.android.socialbase.downloader.ws.cw r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ws.r r0 = com.ss.android.socialbase.downloader.impls.up.xt
            if (r0 != 0) goto L5
            return
        L5:
            r0.xt(r2)
            return
    }

    @Override // com.ss.android.socialbase.downloader.impls.j
    public boolean j(int r3) {
            r2 = this;
            com.ss.android.socialbase.downloader.ws.r r0 = com.ss.android.socialbase.downloader.impls.up.xt
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.j(r3)
            if (r0 != 0) goto Ld
            return r1
        Ld:
            com.ss.android.socialbase.downloader.ae.cw r0 = r2.r(r3)
            if (r0 != 0) goto L14
            return r1
        L14:
            int r0 = r0.i()
            boolean r0 = com.ss.android.socialbase.downloader.xt.m.xt(r0)
            if (r0 != 0) goto L22
            r2.xt(r3)
            return r1
        L22:
            r3 = 1
            return r3
    }

    @Override // com.ss.android.socialbase.downloader.impls.j
    public void xt(int r2) {
            r1 = this;
            com.ss.android.socialbase.downloader.ws.r r0 = com.ss.android.socialbase.downloader.impls.up.xt
            if (r0 != 0) goto L5
            return
        L5:
            r0.cw(r2)
            return
    }
}
