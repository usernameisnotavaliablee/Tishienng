package com.umeng.commonsdk.config;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a(int r2, int r3) {
            r0 = 0
            if (r3 < 0) goto Lf
            r1 = 31
            if (r3 <= r1) goto L8
            goto Lf
        L8:
            r1 = 1
            int r3 = r1 << r3
            r2 = r2 & r3
            if (r2 == 0) goto Lf
            return r1
        Lf:
            return r0
    }

    public static boolean a(long r3, int r5) {
            r0 = 0
            if (r5 < 0) goto L14
            r1 = 63
            if (r5 <= r1) goto L8
            goto L14
        L8:
            r1 = 1
            long r1 = r1 << r5
            long r3 = r3 & r1
            r1 = 0
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 == 0) goto L14
            r3 = 1
            return r3
        L14:
            return r0
    }

    public static int b(int r1, int r2) {
            r0 = 1
            int r2 = r0 << r2
            r1 = r1 | r2
            return r1
    }

    public static long b(long r2, int r4) {
            if (r4 < 0) goto Lb
            r0 = 63
            if (r4 <= r0) goto L7
            goto Lb
        L7:
            r0 = 1
            long r0 = r0 << r4
            long r2 = r2 | r0
        Lb:
            return r2
    }

    public static int c(int r1, int r2) {
            r0 = 1
            int r2 = r0 << r2
            int r2 = ~r2
            r1 = r1 & r2
            return r1
    }

    public static long c(long r2, int r4) {
            if (r4 < 0) goto Lc
            r0 = 63
            if (r4 <= r0) goto L7
            goto Lc
        L7:
            r0 = 1
            long r0 = r0 << r4
            long r0 = ~r0
            long r2 = r2 & r0
        Lc:
            return r2
    }
}
