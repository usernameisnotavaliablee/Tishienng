package com.facebook.rebound;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class SynchronousLooper extends com.facebook.rebound.SpringLooper {
    public static double d = 16.6667d;
    private double b;
    private boolean c;

    static {
            return
    }

    public SynchronousLooper() {
            r2 = this;
            r2.<init>()
            double r0 = com.facebook.rebound.SynchronousLooper.d
            r2.b = r0
            return
    }

    @Override // com.facebook.rebound.SpringLooper
    public void b() {
            r3 = this;
            r0 = 1
            r3.c = r0
        L3:
            com.facebook.rebound.BaseSpringSystem r0 = r3.a
            boolean r0 = r0.g()
            if (r0 != 0) goto L18
            boolean r0 = r3.c
            if (r0 != 0) goto L10
            goto L18
        L10:
            com.facebook.rebound.BaseSpringSystem r0 = r3.a
            double r1 = r3.b
            r0.i(r1)
            goto L3
        L18:
            return
    }

    @Override // com.facebook.rebound.SpringLooper
    public void c() {
            r1 = this;
            r0 = 0
            r1.c = r0
            return
    }

    public double d() {
            r2 = this;
            double r0 = r2.b
            return r0
    }

    public void e(double r1) {
            r0 = this;
            r0.b = r1
            return
    }
}
