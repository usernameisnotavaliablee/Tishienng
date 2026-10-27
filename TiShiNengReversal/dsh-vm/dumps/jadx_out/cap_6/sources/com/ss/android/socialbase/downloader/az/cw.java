package com.ss.android.socialbase.downloader.az;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class cw {
    public cw() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void j(int r2, android.util.SparseArray<com.ss.android.socialbase.downloader.r.a> r3, boolean r4, com.ss.android.socialbase.downloader.ae.cw r5, com.ss.android.socialbase.downloader.up.j r6) {
            if (r4 == 0) goto L88
            if (r3 == 0) goto L88
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L84
            if (r4 > 0) goto Lc
            goto L88
        Lc:
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L84
            android.util.SparseArray r4 = r3.clone()     // Catch: java.lang.Throwable -> L81
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L81
            r3 = 0
        L13:
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L84
            if (r3 >= r0) goto L88
            int r0 = r4.keyAt(r3)     // Catch: java.lang.Throwable -> L84
            java.lang.Object r0 = r4.get(r0)     // Catch: java.lang.Throwable -> L84
            com.ss.android.socialbase.downloader.r.a r0 = (com.ss.android.socialbase.downloader.r.a) r0     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L7e
            r1 = 1
            if (r2 == r1) goto L7b
            r1 = 2
            if (r2 == r1) goto L77
            r1 = 4
            if (r2 == r1) goto L73
            r1 = 5
            if (r2 == r1) goto L6f
            r1 = 6
            if (r2 == r1) goto L6b
            r1 = 7
            if (r2 == r1) goto L67
            r1 = 11
            if (r2 == r1) goto L5d
            switch(r2) {
                case -7: goto L53;
                case -6: goto L4f;
                case -5: goto L4b;
                case -4: goto L47;
                case -3: goto L43;
                case -2: goto L4b;
                case -1: goto L3f;
                default: goto L3e;
            }     // Catch: java.lang.Throwable -> L84
        L3e:
            goto L7e
        L3f:
            r0.j(r5, r6)     // Catch: java.lang.Throwable -> L84
            goto L7e
        L43:
            r0.up(r5)     // Catch: java.lang.Throwable -> L84
            goto L7e
        L47:
            r0.m(r5)     // Catch: java.lang.Throwable -> L84
            goto L7e
        L4b:
            r0.r(r5)     // Catch: java.lang.Throwable -> L84
            goto L7e
        L4f:
            r0.g(r5)     // Catch: java.lang.Throwable -> L84
            goto L7e
        L53:
            boolean r1 = r0 instanceof com.ss.android.socialbase.downloader.r.cw     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L7e
            com.ss.android.socialbase.downloader.r.cw r0 = (com.ss.android.socialbase.downloader.r.cw) r0     // Catch: java.lang.Throwable -> L84
            r0.oq(r5)     // Catch: java.lang.Throwable -> L84
            goto L7e
        L5d:
            boolean r1 = r0 instanceof com.ss.android.socialbase.downloader.r.kt     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L7e
            com.ss.android.socialbase.downloader.r.kt r0 = (com.ss.android.socialbase.downloader.r.kt) r0     // Catch: java.lang.Throwable -> L84
            r0.ae(r5)     // Catch: java.lang.Throwable -> L84
            goto L7e
        L67:
            r0.cw(r5, r6)     // Catch: java.lang.Throwable -> L84
            goto L7e
        L6b:
            r0.tl(r5)     // Catch: java.lang.Throwable -> L84
            goto L7e
        L6f:
            r0.xt(r5, r6)     // Catch: java.lang.Throwable -> L84
            goto L7e
        L73:
            r0.cw(r5)     // Catch: java.lang.Throwable -> L84
            goto L7e
        L77:
            r0.xt(r5)     // Catch: java.lang.Throwable -> L84
            goto L7e
        L7b:
            r0.j(r5)     // Catch: java.lang.Throwable -> L84
        L7e:
            int r3 = r3 + 1
            goto L13
        L81:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L81
            throw r2     // Catch: java.lang.Throwable -> L84
        L84:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        L88:
            return
    }
}
