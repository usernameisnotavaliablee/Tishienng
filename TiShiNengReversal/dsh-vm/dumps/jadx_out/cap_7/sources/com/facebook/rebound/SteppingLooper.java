package com.facebook.rebound;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class SteppingLooper extends com.facebook.rebound.SpringLooper {
    private boolean b;
    private long c;

    public SteppingLooper() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.facebook.rebound.SpringLooper
    public void b() {
            r2 = this;
            r0 = 1
            r2.b = r0
            r0 = 0
            r2.c = r0
            return
    }

    @Override // com.facebook.rebound.SpringLooper
    public void c() {
            r1 = this;
            r0 = 0
            r1.b = r0
            return
    }

    public boolean d(long r4) {
            r3 = this;
            com.facebook.rebound.BaseSpringSystem r0 = r3.a
            if (r0 == 0) goto L19
            boolean r1 = r3.b
            if (r1 != 0) goto L9
            goto L19
        L9:
            long r1 = r3.c
            long r1 = r1 + r4
            double r4 = (double) r1
            r0.i(r4)
            r3.c = r1
            com.facebook.rebound.BaseSpringSystem r4 = r3.a
            boolean r4 = r4.g()
            return r4
        L19:
            r4 = 0
            return r4
    }
}
