package com.ss.android.socialbase.downloader.az;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class up {
    private int cw;
    private com.ss.android.socialbase.downloader.az.up.j j;
    private int r;
    private com.ss.android.socialbase.downloader.az.up.j xt;

    /* renamed from: com.ss.android.socialbase.downloader.az.up$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class j {
        com.ss.android.socialbase.downloader.az.up.j cw;
        long j;
        com.ss.android.socialbase.downloader.az.up.j r;
        long xt;

        private j() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ j(com.ss.android.socialbase.downloader.az.up.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public up() {
            r1 = this;
            r1.<init>()
            r0 = 10
            r1.r = r0
            return
    }

    private com.ss.android.socialbase.downloader.az.up.j j() {
            r3 = this;
            int r0 = r3.cw
            int r1 = r3.r
            r2 = 0
            if (r0 < r1) goto L16
            com.ss.android.socialbase.downloader.az.up$j r1 = r3.xt
            if (r1 == 0) goto L16
            com.ss.android.socialbase.downloader.az.up$j r0 = r1.r
            r1.r = r2
            r3.xt = r0
            if (r0 == 0) goto L15
            r0.cw = r2
        L15:
            return r1
        L16:
            int r0 = r0 + 1
            r3.cw = r0
            com.ss.android.socialbase.downloader.az.up$j r0 = new com.ss.android.socialbase.downloader.az.up$j
            r0.<init>(r2)
            return r0
    }

    private com.ss.android.socialbase.downloader.az.up.j j(long r8) {
            r7 = this;
            com.ss.android.socialbase.downloader.az.up$j r0 = r7.j
            r1 = 0
        L3:
            if (r0 == 0) goto L11
            long r2 = r0.xt
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 <= 0) goto L11
            com.ss.android.socialbase.downloader.az.up$j r1 = r0.cw
            r6 = r1
            r1 = r0
            r0 = r6
            goto L3
        L11:
            if (r0 == 0) goto L23
            if (r1 == 0) goto L23
            if (r0 == r1) goto L23
            long r2 = r0.xt
            long r2 = r8 - r2
            long r4 = r1.xt
            long r4 = r4 - r8
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 >= 0) goto L23
            return r0
        L23:
            return r1
    }

    public boolean j(long r8, long r10) {
            r7 = this;
            monitor-enter(r7)
            com.ss.android.socialbase.downloader.az.up$j r0 = r7.j     // Catch: java.lang.Throwable -> L27
            r1 = 1
            if (r0 == 0) goto L2c
            long r2 = r0.j     // Catch: java.lang.Throwable -> L27
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 < 0) goto L29
            long r2 = r0.xt     // Catch: java.lang.Throwable -> L27
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 >= 0) goto L13
            goto L29
        L13:
            com.ss.android.socialbase.downloader.az.up$j r2 = r0.cw     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2c
            long r2 = r2.xt     // Catch: java.lang.Throwable -> L27
            long r2 = r10 - r2
            r4 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L2c
            r0.j = r8     // Catch: java.lang.Throwable -> L27
            r0.xt = r10     // Catch: java.lang.Throwable -> L27
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L27
            return r1
        L27:
            r8 = move-exception
            goto L3e
        L29:
            r8 = 0
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L27
            return r8
        L2c:
            com.ss.android.socialbase.downloader.az.up$j r2 = r7.j()     // Catch: java.lang.Throwable -> L27
            r2.j = r8     // Catch: java.lang.Throwable -> L27
            r2.xt = r10     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L3a
            r2.cw = r0     // Catch: java.lang.Throwable -> L27
            r0.r = r2     // Catch: java.lang.Throwable -> L27
        L3a:
            r7.j = r2     // Catch: java.lang.Throwable -> L27
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L27
            return r1
        L3e:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L27
            throw r8
    }

    public long xt(long r8, long r10) {
            r7 = this;
            monitor-enter(r7)
            com.ss.android.socialbase.downloader.az.up$j r0 = r7.j     // Catch: java.lang.Throwable -> L9
            r1 = -1
            if (r0 != 0) goto Lb
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r8 = move-exception
            goto L2a
        Lb:
            com.ss.android.socialbase.downloader.az.up$j r8 = r7.j(r8)     // Catch: java.lang.Throwable -> L9
            if (r8 != 0) goto L13
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9
            return r1
        L13:
            long r3 = r0.j     // Catch: java.lang.Throwable -> L9
            long r5 = r8.j     // Catch: java.lang.Throwable -> L9
            long r3 = r3 - r5
            long r8 = r8.xt     // Catch: java.lang.Throwable -> L9
            long r10 = r10 - r8
            r8 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L28
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto L28
            long r3 = r3 / r10
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9
            return r3
        L28:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9
            return r1
        L2a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9
            throw r8
    }
}
