package com.ss.android.socialbase.downloader.g.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class xt {
    private static final android.os.HandlerThread cw = null;
    static long j;
    private static final android.os.Handler r = null;
    static long xt;



    static {
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "Downloader-preconnecter"
            r0.<init>(r1)
            com.ss.android.socialbase.downloader.g.j.xt.cw = r0
            xt()
            r0.start()
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r0 = r0.getLooper()
            r1.<init>(r0)
            com.ss.android.socialbase.downloader.g.j.xt.r = r1
            com.ss.android.socialbase.downloader.g.j.xt$1 r0 = new com.ss.android.socialbase.downloader.g.j.xt$1
            r0.<init>()
            r1.post(r0)
            return
    }

    public xt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.os.Looper j() {
            android.os.HandlerThread r0 = com.ss.android.socialbase.downloader.g.j.xt.cw
            android.os.Looper r0 = r0.getLooper()
            return r0
    }

    static /* synthetic */ java.util.List j(long r0, com.ss.android.socialbase.downloader.ae.cw r2, java.util.List r3) {
            java.util.List r0 = xt(r0, r2, r3)
            return r0
    }

    public static void j(java.lang.String r2, com.ss.android.socialbase.downloader.g.qv r3) {
            android.os.Handler r0 = com.ss.android.socialbase.downloader.g.j.xt.r
            com.ss.android.socialbase.downloader.g.j.xt$2 r1 = new com.ss.android.socialbase.downloader.g.j.xt$2
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }

    private static java.util.List<com.ss.android.socialbase.downloader.ae.up> xt(long r6, com.ss.android.socialbase.downloader.ae.cw r8, java.util.List<com.ss.android.socialbase.downloader.ae.up> r9) {
            if (r8 != 0) goto L5
            r8 = 0
        L3:
            r1 = r8
            goto La
        L5:
            java.lang.String r8 = r8.u()
            goto L3
        La:
            r4 = 0
            r2 = r6
            r0 = r9
            java.util.List r6 = com.ss.android.socialbase.downloader.az.m.j(r0, r1, r2, r4)
            return r6
    }

    private static void xt() {
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r1 = "preconnect_connection_outdate_time"
            r2 = 300000(0x493e0, double:1.482197E-318)
            long r0 = r0.j(r1, r2)
            com.ss.android.socialbase.downloader.g.j.xt.j = r0
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r1 = "preconnect_head_info_outdate_time"
            long r0 = r0.j(r1, r2)
            com.ss.android.socialbase.downloader.g.j.xt.xt = r0
            com.ss.android.socialbase.downloader.g.j.j r0 = com.ss.android.socialbase.downloader.g.j.j.j()
            com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r2 = "preconnect_max_cache_size"
            r3 = 3
            int r1 = r1.j(r2, r3)
            r0.j(r1)
            return
    }
}
