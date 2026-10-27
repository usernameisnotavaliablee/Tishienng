package com.ss.android.socialbase.downloader.qv;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class az {
    public az() {
            r1 = this;
            r1.<init>()
            return
    }

    public static long j(@androidx.annotation.NonNull java.util.List<com.ss.android.socialbase.downloader.qv.g> r8) {
            int r0 = r8.size()
            r1 = 0
            r3 = 0
        L7:
            if (r3 >= r0) goto L26
            java.lang.Object r4 = r8.get(r3)
            com.ss.android.socialbase.downloader.qv.g r4 = (com.ss.android.socialbase.downloader.qv.g) r4
            long r5 = r4.cw()
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 > 0) goto L26
            long r5 = r4.up()
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 <= 0) goto L23
            long r1 = r4.up()
        L23:
            int r3 = r3 + 1
            goto L7
        L26:
            return r1
    }

    public static long xt(@androidx.annotation.NonNull java.util.List<com.ss.android.socialbase.downloader.qv.g> r14) {
            java.util.Iterator r14 = r14.iterator()
            r0 = 0
            r2 = -1
            r8 = r0
        L9:
            r4 = r2
            r6 = r4
        Lb:
            boolean r10 = r14.hasNext()
            if (r10 == 0) goto L54
            java.lang.Object r10 = r14.next()
            com.ss.android.socialbase.downloader.qv.g r10 = (com.ss.android.socialbase.downloader.qv.g) r10
            int r11 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r11 != 0) goto L2c
            long r11 = r10.j()
            int r13 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r13 <= 0) goto Lb
            long r4 = r10.cw()
            long r6 = r10.r()
            goto Lb
        L2c:
            long r11 = r10.cw()
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 > 0) goto L41
            long r11 = r10.r()
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 <= 0) goto Lb
            long r6 = r10.r()
            goto Lb
        L41:
            long r6 = r6 - r4
            long r8 = r8 + r6
            long r4 = r10.j()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L9
            long r4 = r10.cw()
            long r6 = r10.r()
            goto Lb
        L54:
            int r14 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r14 < 0) goto L5e
            int r14 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r14 <= 0) goto L5e
            long r6 = r6 - r4
            long r8 = r8 + r6
        L5e:
            return r8
    }
}
