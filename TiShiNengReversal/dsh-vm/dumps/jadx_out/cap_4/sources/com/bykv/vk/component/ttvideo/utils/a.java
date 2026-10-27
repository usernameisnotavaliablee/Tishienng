package com.bykv.vk.component.ttvideo.utils;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    private int a;
    private int b;
    private int c;
    private int d;
    private long e;

    public a() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.a = r0
            r0 = 2
            r2.b = r0
            r2.c = r0
            r0 = 0
            r2.d = r0
            r0 = 0
            r2.e = r0
            return
    }

    public void a() {
            r2 = this;
            r0 = 0
            r2.d = r0
            int r0 = r2.c
            int r1 = r2.a
            if (r0 != r1) goto Lf
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.e = r0
        Lf:
            return
    }

    public int b() {
            r4 = this;
            int r0 = r4.c
            int r1 = r4.a
            if (r0 != r1) goto L18
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r4.e
            long r2 = r0 - r2
            int r3 = (int) r2
            if (r3 < 0) goto L16
            int r2 = r4.d
            int r2 = r2 + r3
            r4.d = r2
        L16:
            r4.e = r0
        L18:
            int r0 = r4.d
            return r0
    }

    public void c() {
            r2 = this;
            int r0 = r2.b
            r2.c = r0
            r0 = 0
            r2.d = r0
            r0 = 0
            r2.e = r0
            return
    }

    public void d() {
            r2 = this;
            int r0 = r2.c
            int r1 = r2.b
            if (r0 != r1) goto L10
            int r0 = r2.a
            r2.c = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.e = r0
        L10:
            return
    }

    public void e() {
            r4 = this;
            int r0 = r4.c
            int r1 = r4.a
            if (r0 != r1) goto L19
            int r0 = r4.b
            r4.c = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r4.e
            long r0 = r0 - r2
            int r1 = (int) r0
            if (r1 < 0) goto L19
            int r0 = r4.d
            int r0 = r0 + r1
            r4.d = r0
        L19:
            return
    }
}
