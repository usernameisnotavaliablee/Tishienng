package com.ss.android.socialbase.downloader.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class up extends com.ss.android.socialbase.downloader.up.j {
    private final long j;
    private final long xt;

    public up(long r5, long r7) {
            r4 = this;
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "space is not enough required space is : %s but available space is :%s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1 = 1006(0x3ee, float:1.41E-42)
            r4.<init>(r1, r0)
            r4.j = r5
            r4.xt = r7
            return
    }

    public long r() {
            r2 = this;
            long r0 = r2.j
            return r0
    }

    public long up() {
            r2 = this;
            long r0 = r2.xt
            return r0
    }
}
