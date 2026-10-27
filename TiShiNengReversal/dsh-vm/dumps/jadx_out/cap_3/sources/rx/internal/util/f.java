package rx.internal.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class f {
    final int a;
    java.lang.Object[] b;
    java.lang.Object[] c;
    volatile int d;
    int e;

    public f(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    java.util.List<java.lang.Object> A() {
            r8 = this;
            int r0 = r8.a
            int r1 = r8.d
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1 + 1
            r2.<init>(r3)
            java.lang.Object[] r3 = r8.f()
            r4 = 0
            r5 = 0
        L11:
            r6 = 0
        L12:
            if (r5 >= r1) goto L24
            r7 = r3[r6]
            r2.add(r7)
            int r5 = r5 + 1
            int r6 = r6 + 1
            if (r6 != r0) goto L12
            r3 = r3[r0]
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            goto L11
        L24:
            return r2
    }

    public void d(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.d
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L16
            int r0 = r4.a
            int r0 = r0 + r2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r4.b = r0
            r4.c = r0
            r0[r1] = r5
            r4.e = r2
            r4.d = r2
            return
        L16:
            int r0 = r4.e
            int r3 = r4.a
            if (r0 != r3) goto L30
            int r0 = r3 + 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r5
            java.lang.Object[] r5 = r4.c
            r5[r3] = r0
            r4.c = r0
            r4.e = r2
            int r5 = r4.d
            int r5 = r5 + r2
            r4.d = r5
            return
        L30:
            java.lang.Object[] r1 = r4.c
            r1[r0] = r5
            int r0 = r0 + r2
            r4.e = r0
            int r5 = r4.d
            int r5 = r5 + r2
            r4.d = r5
            return
    }

    public int e() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public java.lang.Object[] f() {
            r1 = this;
            java.lang.Object[] r0 = r1.b
            return r0
    }

    public int g() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    public int j() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    public java.lang.Object[] s() {
            r1 = this;
            java.lang.Object[] r0 = r1.c
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.util.List r0 = r1.A()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
