package com.ss.android.socialbase.downloader.impls;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class vl {
    private static volatile com.ss.android.socialbase.downloader.downloader.az j;
    private static volatile com.ss.android.socialbase.downloader.downloader.az xt;

    public vl() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.ss.android.socialbase.downloader.downloader.az j(boolean r1) {
            if (r1 == 0) goto L27
            boolean r1 = com.ss.android.socialbase.downloader.downloader.cw.hl()
            if (r1 == 0) goto L27
            com.ss.android.socialbase.downloader.downloader.az r1 = com.ss.android.socialbase.downloader.impls.vl.xt
            if (r1 != 0) goto L24
            java.lang.Class<com.ss.android.socialbase.downloader.impls.vl> r1 = com.ss.android.socialbase.downloader.impls.vl.class
            monitor-enter(r1)
            com.ss.android.socialbase.downloader.downloader.az r0 = com.ss.android.socialbase.downloader.impls.vl.xt     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L20
            com.ss.android.socialbase.downloader.downloader.cw$j r0 = com.ss.android.socialbase.downloader.downloader.cw.b()     // Catch: java.lang.Throwable -> L1e
            com.ss.android.socialbase.downloader.downloader.az r0 = r0.xt()     // Catch: java.lang.Throwable -> L1e
            com.ss.android.socialbase.downloader.impls.vl.xt = r0     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r0 = move-exception
            goto L22
        L20:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            goto L24
        L22:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            throw r0
        L24:
            com.ss.android.socialbase.downloader.downloader.az r1 = com.ss.android.socialbase.downloader.impls.vl.xt
            return r1
        L27:
            com.ss.android.socialbase.downloader.downloader.az r1 = com.ss.android.socialbase.downloader.impls.vl.j
            if (r1 != 0) goto L40
            java.lang.Class<com.ss.android.socialbase.downloader.impls.vl> r1 = com.ss.android.socialbase.downloader.impls.vl.class
            monitor-enter(r1)
            com.ss.android.socialbase.downloader.downloader.az r0 = com.ss.android.socialbase.downloader.impls.vl.j     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L3c
            com.ss.android.socialbase.downloader.impls.av r0 = new com.ss.android.socialbase.downloader.impls.av     // Catch: java.lang.Throwable -> L3a
            r0.<init>()     // Catch: java.lang.Throwable -> L3a
            com.ss.android.socialbase.downloader.impls.vl.j = r0     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            r0 = move-exception
            goto L3e
        L3c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3a
            goto L40
        L3e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3a
            throw r0
        L40:
            com.ss.android.socialbase.downloader.downloader.az r1 = com.ss.android.socialbase.downloader.impls.vl.j
            return r1
    }
}
