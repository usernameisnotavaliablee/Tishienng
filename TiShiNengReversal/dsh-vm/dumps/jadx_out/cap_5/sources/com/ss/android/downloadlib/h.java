package com.ss.android.downloadlib;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class h {
    private static volatile com.ss.android.downloadlib.h b;
    private v2.l a;

    static {
            return
    }

    private h() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            return
    }

    public static com.ss.android.downloadlib.h a() {
            com.ss.android.downloadlib.h r0 = com.ss.android.downloadlib.h.b
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.downloadlib.h> r0 = com.ss.android.downloadlib.h.class
            monitor-enter(r0)
            com.ss.android.downloadlib.h r1 = com.ss.android.downloadlib.h.b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.downloadlib.h r1 = new com.ss.android.downloadlib.h     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.downloadlib.h.b = r1     // Catch: java.lang.Throwable -> L13
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
            com.ss.android.downloadlib.h r0 = com.ss.android.downloadlib.h.b
            return r0
    }

    public v2.l b() {
            r1 = this;
            v2.l r0 = r1.a
            return r0
    }
}
