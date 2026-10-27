package com.ss.android.downloadlib.addownload;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class h {
    public h() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(int r2, int r3) {
            if (r3 <= 0) goto L18
            r0 = 100
            if (r3 >= r0) goto L18
            boolean r2 = d(r2)
            if (r2 != 0) goto Ld
            goto L18
        Ld:
            double r2 = (double) r3
            double r2 = java.lang.Math.sqrt(r2)
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r2 = r2 * r0
            int r2 = (int) r2
            return r2
        L18:
            return r3
    }

    public static long b(int r3, long r4, long r6) {
            boolean r0 = d(r3)
            if (r0 != 0) goto L7
            goto L12
        L7:
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto Le
            return r0
        Le:
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto L13
        L12:
            return r4
        L13:
            r0 = 100
            long r4 = r4 * r0
            long r4 = r4 / r6
            int r5 = (int) r4
            int r3 = a(r3, r5)
            long r3 = (long) r3
            long r6 = r6 * r3
            long r6 = r6 / r0
            return r6
    }

    public static com.ss.android.j.j.up.e c(com.ss.android.j.j.up.e r6) {
            if (r6 == 0) goto L19
            long r0 = r6.a
            int r1 = (int) r0
            boolean r0 = d(r1)
            if (r0 != 0) goto Lc
            goto L19
        Lc:
            long r0 = r6.a
            int r1 = (int) r0
            long r2 = r6.d
            long r4 = r6.c
            long r0 = b(r1, r2, r4)
            r6.d = r0
        L19:
            return r6
    }

    private static boolean d(int r3) {
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r3)
            java.lang.String r1 = "pause_optimise_pretend_download_percent_switch"
            r2 = 0
            int r0 = r0.j(r1, r2)
            r1 = 1
            if (r0 != r1) goto L1b
            com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.socialbase.downloader.jy.j.j(r3)
            java.lang.String r0 = "pause_optimise_switch"
            int r3 = r3.j(r0, r2)
            if (r3 != r1) goto L1b
            return r1
        L1b:
            return r2
    }
}
