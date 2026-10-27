package com.ss.android.socialbase.downloader.impls;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class i implements com.ss.android.socialbase.downloader.downloader.kt {
    private final long[] j;

    public i(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            long[] r1 = r0.j(r1)
            r0.j = r1
            return
    }

    private long[] j(java.lang.String r6) {
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = ","
            java.lang.String[] r6 = r6.split(r0)     // Catch: java.lang.Throwable -> L24
            int r0 = r6.length     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L12
            return r1
        L12:
            int r0 = r6.length     // Catch: java.lang.Throwable -> L24
            long[] r0 = new long[r0]     // Catch: java.lang.Throwable -> L24
            r2 = 0
        L16:
            int r3 = r6.length     // Catch: java.lang.Throwable -> L24
            if (r2 >= r3) goto L26
            r3 = r6[r2]     // Catch: java.lang.Throwable -> L24
            long r3 = java.lang.Long.parseLong(r3)     // Catch: java.lang.Throwable -> L24
            r0[r2] = r3     // Catch: java.lang.Throwable -> L24
            int r2 = r2 + 1
            goto L16
        L24:
            r6 = move-exception
            goto L27
        L26:
            return r0
        L27:
            com.bytedance.sdk.component.utils.vl.j(r6)
            return r1
    }

    @Override // com.ss.android.socialbase.downloader.downloader.kt
    public long j(int r2, int r3) {
            r1 = this;
            long[] r3 = r1.j
            if (r3 == 0) goto L17
            int r0 = r3.length
            if (r0 <= 0) goto L17
            int r2 = r2 + (-1)
            if (r2 >= 0) goto Lc
            r2 = 0
        Lc:
            int r0 = r3.length
            int r0 = r0 + (-1)
            if (r2 <= r0) goto L14
            int r2 = r3.length
            int r2 = r2 + (-1)
        L14:
            r2 = r3[r2]
            return r2
        L17:
            r2 = 0
            return r2
    }
}
