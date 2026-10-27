package com.yalantis.ucrop.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    private int a;
    private int b;
    private int c;

    public b(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public int a() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public int b() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public int c() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public void d(int r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void e(int r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L29
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L29
        L12:
            com.yalantis.ucrop.model.b r5 = (com.yalantis.ucrop.model.b) r5
            int r2 = r4.a
            int r3 = r5.a
            if (r2 == r3) goto L1b
            return r1
        L1b:
            int r2 = r4.b
            int r3 = r5.b
            if (r2 == r3) goto L22
            return r1
        L22:
            int r2 = r4.c
            int r5 = r5.c
            if (r2 != r5) goto L29
            return r0
        L29:
            return r1
    }

    public void f(int r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.a
            int r0 = r0 * 31
            int r1 = r2.b
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.c
            int r0 = r0 + r1
            return r0
    }
}
