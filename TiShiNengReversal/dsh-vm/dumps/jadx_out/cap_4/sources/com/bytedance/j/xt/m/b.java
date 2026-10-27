package com.bytedance.j.xt.m;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class b implements java.lang.Runnable {
    private android.os.Handler a;
    private final long b;
    private final long c;

    b(android.os.Handler r1, long r2, long r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            return
    }

    long a() {
            r2 = this;
            long r0 = r2.c
            return r0
    }

    void b() {
            r5 = this;
            long r0 = r5.d()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L14
            android.os.Handler r0 = r5.a
            long r1 = r5.d()
            r0.postDelayed(r5, r1)
            return
        L14:
            android.os.Handler r0 = r5.a
            r0.post(r5)
            return
    }

    void c(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto Lc
            android.os.Handler r0 = r3.a
            r0.postDelayed(r3, r4)
            return
        Lc:
            android.os.Handler r4 = r3.a
            r4.post(r3)
            return
    }

    long d() {
            r2 = this;
            long r0 = r2.b
            return r0
    }
}
