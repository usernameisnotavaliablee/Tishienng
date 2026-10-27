package com.ss.android.socialbase.downloader.ws;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ae {
    private com.ss.android.socialbase.downloader.ws.ae.j cw;
    private java.lang.Object j;
    private android.os.Handler r;
    private java.util.Queue<com.ss.android.socialbase.downloader.ws.ae.xt> xt;

    private class j extends android.os.HandlerThread {
        final /* synthetic */ com.ss.android.socialbase.downloader.ws.ae j;

        j(com.ss.android.socialbase.downloader.ws.ae r1, java.lang.String r2) {
                r0 = this;
                r0.j = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.HandlerThread
        protected void onLooperPrepared() {
                r5 = this;
                super.onLooperPrepared()
                android.os.Looper r0 = r5.getLooper()
                com.ss.android.socialbase.downloader.ws.ae r1 = r5.j
                java.lang.Object r1 = com.ss.android.socialbase.downloader.ws.ae.j(r1)
                monitor-enter(r1)
                com.ss.android.socialbase.downloader.ws.ae r2 = r5.j     // Catch: java.lang.Throwable -> L42
                android.os.Handler r3 = new android.os.Handler     // Catch: java.lang.Throwable -> L42
                r3.<init>(r0)     // Catch: java.lang.Throwable -> L42
                com.ss.android.socialbase.downloader.ws.ae.j(r2, r3)     // Catch: java.lang.Throwable -> L42
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L42
            L19:
                com.ss.android.socialbase.downloader.ws.ae r0 = r5.j
                java.util.Queue r0 = com.ss.android.socialbase.downloader.ws.ae.xt(r0)
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L41
                com.ss.android.socialbase.downloader.ws.ae r0 = r5.j
                java.util.Queue r0 = com.ss.android.socialbase.downloader.ws.ae.xt(r0)
                java.lang.Object r0 = r0.poll()
                com.ss.android.socialbase.downloader.ws.ae$xt r0 = (com.ss.android.socialbase.downloader.ws.ae.xt) r0
                if (r0 == 0) goto L19
                com.ss.android.socialbase.downloader.ws.ae r1 = r5.j
                android.os.Handler r1 = com.ss.android.socialbase.downloader.ws.ae.cw(r1)
                java.lang.Runnable r2 = r0.j
                long r3 = r0.xt
                r1.postDelayed(r2, r3)
                goto L19
            L41:
                return
            L42:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L42
                throw r0
        }
    }

    private class xt {
        final /* synthetic */ com.ss.android.socialbase.downloader.ws.ae cw;
        public java.lang.Runnable j;
        public long xt;

        public xt(com.ss.android.socialbase.downloader.ws.ae r1, java.lang.Runnable r2, long r3) {
                r0 = this;
                r0.cw = r1
                r0.<init>()
                r0.j = r2
                r0.xt = r3
                return
        }
    }

    public ae(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.j = r0
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            r1.xt = r0
            com.ss.android.socialbase.downloader.ws.ae$j r0 = new com.ss.android.socialbase.downloader.ws.ae$j
            r0.<init>(r1, r2)
            r1.cw = r0
            return
    }

    static /* synthetic */ android.os.Handler cw(com.ss.android.socialbase.downloader.ws.ae r0) {
            android.os.Handler r0 = r0.r
            return r0
    }

    static /* synthetic */ android.os.Handler j(com.ss.android.socialbase.downloader.ws.ae r0, android.os.Handler r1) {
            r0.r = r1
            return r1
    }

    static /* synthetic */ java.lang.Object j(com.ss.android.socialbase.downloader.ws.ae r0) {
            java.lang.Object r0 = r0.j
            return r0
    }

    static /* synthetic */ java.util.Queue xt(com.ss.android.socialbase.downloader.ws.ae r0) {
            java.util.Queue<com.ss.android.socialbase.downloader.ws.ae$xt> r0 = r0.xt
            return r0
    }

    public void j() {
            r1 = this;
            com.ss.android.socialbase.downloader.ws.ae$j r0 = r1.cw
            r0.start()
            return
    }

    public void j(java.lang.Runnable r3) {
            r2 = this;
            r0 = 0
            r2.j(r3, r0)
            return
    }

    public void j(java.lang.Runnable r4, long r5) {
            r3 = this;
            android.os.Handler r0 = r3.r
            if (r0 != 0) goto L1d
            java.lang.Object r0 = r3.j
            monitor-enter(r0)
            android.os.Handler r1 = r3.r     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            java.util.Queue<com.ss.android.socialbase.downloader.ws.ae$xt> r1 = r3.xt     // Catch: java.lang.Throwable -> L17
            com.ss.android.socialbase.downloader.ws.ae$xt r2 = new com.ss.android.socialbase.downloader.ws.ae$xt     // Catch: java.lang.Throwable -> L17
            r2.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L17
            r1.add(r2)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r4 = move-exception
            goto L1b
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            goto L1d
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r4
        L1d:
            android.os.Handler r0 = r3.r
            r0.postDelayed(r4, r5)
            return
    }

    public void xt() {
            r1 = this;
            com.ss.android.socialbase.downloader.ws.ae$j r0 = r1.cw
            r0.quit()
            return
    }
}
