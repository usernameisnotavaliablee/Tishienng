package com.ss.android.socialbase.downloader.g;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class xt {
    private static long ae = -1;
    public static volatile boolean j = false;
    private static volatile com.ss.android.socialbase.downloader.g.xt tl = null;
    private static final java.lang.String xt = "xt";
    private final com.ss.android.socialbase.downloader.g.vl cw;
    private long m;
    private final java.util.concurrent.atomic.AtomicInteger r;
    private final com.ss.android.socialbase.downloader.g.xt.j up;

    private class j extends android.os.Handler {
        final /* synthetic */ com.ss.android.socialbase.downloader.g.xt j;

        public j(com.ss.android.socialbase.downloader.g.xt r1, android.os.Looper r2) {
                r0 = this;
                r0.j = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r4) {
                r3 = this;
                int r4 = r4.what
                r0 = 1
                if (r4 == r0) goto L6
                return
            L6:
                com.ss.android.socialbase.downloader.g.xt r4 = r3.j
                r4.m()
                r1 = 1000(0x3e8, double:4.94E-321)
                r3.sendEmptyMessageDelayed(r0, r1)
                return
        }

        public void j() {
                r1 = this;
                r0 = 1
                r1.sendEmptyMessage(r0)
                return
        }

        public void xt() {
                r1 = this;
                r0 = 1
                r1.removeMessages(r0)
                return
        }
    }

    static {
            return
    }

    private xt() {
            r2 = this;
            r2.<init>()
            com.ss.android.socialbase.downloader.g.vl r0 = com.ss.android.socialbase.downloader.g.vl.j()
            r2.cw = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r2.r = r0
            com.ss.android.socialbase.downloader.g.xt$j r0 = new com.ss.android.socialbase.downloader.g.xt$j
            android.os.Looper r1 = com.ss.android.socialbase.downloader.ws.up.j()
            r0.<init>(r2, r1)
            r2.up = r0
            return
    }

    public static com.ss.android.socialbase.downloader.g.xt j() {
            com.ss.android.socialbase.downloader.g.xt r0 = com.ss.android.socialbase.downloader.g.xt.tl
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.socialbase.downloader.g.xt> r0 = com.ss.android.socialbase.downloader.g.xt.class
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.g.xt r1 = com.ss.android.socialbase.downloader.g.xt.tl     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.socialbase.downloader.g.xt r1 = new com.ss.android.socialbase.downloader.g.xt     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.socialbase.downloader.g.xt.tl = r1     // Catch: java.lang.Throwable -> L13
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
            com.ss.android.socialbase.downloader.g.xt r0 = com.ss.android.socialbase.downloader.g.xt.tl
            return r0
    }

    public static long r() {
            long r0 = android.net.TrafficStats.getTotalRxBytes()
            long r2 = android.net.TrafficStats.getMobileRxBytes()
            long r0 = r0 - r2
            return r0
    }

    public static void up() {
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            boolean r0 = com.ss.android.socialbase.downloader.az.m.xt(r0)
            com.ss.android.socialbase.downloader.g.xt.j = r0
            return
    }

    protected void ae() {
            r2 = this;
            r2.m()
            r0 = -1
            com.ss.android.socialbase.downloader.g.xt.ae = r0
            return
    }

    public void cw() {
            r3 = this;
            java.lang.String r0 = com.ss.android.socialbase.downloader.g.xt.xt     // Catch: java.lang.Throwable -> L25
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "stopSampling: mSamplingCounter = "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L25
            java.util.concurrent.atomic.AtomicInteger r2 = r3.r     // Catch: java.lang.Throwable -> L25
            r1.append(r2)     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L25
            com.ss.android.socialbase.downloader.m.j.cw(r0, r1)     // Catch: java.lang.Throwable -> L25
            java.util.concurrent.atomic.AtomicInteger r0 = r3.r     // Catch: java.lang.Throwable -> L25
            int r0 = r0.decrementAndGet()     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L25
            com.ss.android.socialbase.downloader.g.xt$j r0 = r3.up     // Catch: java.lang.Throwable -> L25
            r0.xt()     // Catch: java.lang.Throwable -> L25
            r3.ae()     // Catch: java.lang.Throwable -> L25
        L25:
            return
    }

    protected void m() {
            r9 = this;
            up()     // Catch: java.lang.Exception -> Lc
            boolean r0 = com.ss.android.socialbase.downloader.g.xt.j     // Catch: java.lang.Exception -> Lc
            if (r0 == 0) goto Le
            long r0 = r()     // Catch: java.lang.Exception -> Lc
            goto L12
        Lc:
            r0 = move-exception
            goto L34
        Le:
            long r0 = android.net.TrafficStats.getMobileRxBytes()     // Catch: java.lang.Exception -> Lc
        L12:
            long r2 = com.ss.android.socialbase.downloader.g.xt.ae     // Catch: java.lang.Exception -> Lc
            long r4 = r0 - r2
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 < 0) goto L31
            monitor-enter(r9)     // Catch: java.lang.Exception -> Lc
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L2e
            com.ss.android.socialbase.downloader.g.vl r6 = r9.cw     // Catch: java.lang.Throwable -> L2e
            long r7 = r9.m     // Catch: java.lang.Throwable -> L2e
            long r7 = r2 - r7
            r6.j(r4, r7)     // Catch: java.lang.Throwable -> L2e
            r9.m = r2     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L2e
            goto L31
        L2e:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L2e
            throw r0     // Catch: java.lang.Exception -> Lc
        L31:
            com.ss.android.socialbase.downloader.g.xt.ae = r0     // Catch: java.lang.Exception -> Lc
            return
        L34:
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    public void xt() {
            r3 = this;
            java.lang.String r0 = com.ss.android.socialbase.downloader.g.xt.xt     // Catch: java.lang.Throwable -> L28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "startSampling: mSamplingCounter = "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L28
            java.util.concurrent.atomic.AtomicInteger r2 = r3.r     // Catch: java.lang.Throwable -> L28
            r1.append(r2)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L28
            com.ss.android.socialbase.downloader.m.j.cw(r0, r1)     // Catch: java.lang.Throwable -> L28
            java.util.concurrent.atomic.AtomicInteger r0 = r3.r     // Catch: java.lang.Throwable -> L28
            int r0 = r0.getAndIncrement()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L28
            com.ss.android.socialbase.downloader.g.xt$j r0 = r3.up     // Catch: java.lang.Throwable -> L28
            r0.j()     // Catch: java.lang.Throwable -> L28
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L28
            r3.m = r0     // Catch: java.lang.Throwable -> L28
        L28:
            return
    }
}
