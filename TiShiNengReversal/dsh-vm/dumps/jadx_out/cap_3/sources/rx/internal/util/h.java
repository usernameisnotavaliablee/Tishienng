package rx.internal.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class h<T> {
    private static final int f = -1640531527;
    final float a;
    int b;
    int c;
    int d;
    T[] e;

    public h() {
            r2 = this;
            r0 = 16
            r1 = 1061158912(0x3f400000, float:0.75)
            r2.<init>(r0, r1)
            return
    }

    public h(int r2) {
            r1 = this;
            r0 = 1061158912(0x3f400000, float:0.75)
            r1.<init>(r2, r0)
            return
    }

    public h(int r2, float r3) {
            r1 = this;
            r1.<init>()
            r1.a = r3
            int r2 = rx.internal.util.unsafe.p.b(r2)
            int r0 = r2 + (-1)
            r1.b = r0
            float r0 = (float) r2
            float r3 = r3 * r0
            int r3 = (int) r3
            r1.d = r3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.e = r2
            return
    }

    static int d(int r1) {
            r0 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r1 = r1 * r0
            int r0 = r1 >>> 16
            r1 = r1 ^ r0
            return r1
    }

    public boolean a(T r7) {
            r6 = this;
            T[] r0 = r6.e
            int r1 = r6.b
            int r2 = r7.hashCode()
            int r2 = d(r2)
            r2 = r2 & r1
            r3 = r0[r2]
            r4 = 1
            if (r3 == 0) goto L28
            boolean r3 = r3.equals(r7)
            r5 = 0
            if (r3 == 0) goto L1a
            return r5
        L1a:
            int r2 = r2 + r4
            r2 = r2 & r1
            r3 = r0[r2]
            if (r3 != 0) goto L21
            goto L28
        L21:
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L1a
            return r5
        L28:
            r0[r2] = r7
            int r7 = r6.c
            int r7 = r7 + r4
            r6.c = r7
            int r0 = r6.d
            if (r7 < r0) goto L36
            r6.e()
        L36:
            return r4
    }

    public void b(rx.functions.b<? super T> r6) {
            r5 = this;
            int r0 = r5.c
            if (r0 != 0) goto L5
            return
        L5:
            T[] r0 = r5.e
            int r1 = r0.length
            r2 = 0
            r3 = 0
        La:
            if (r3 >= r1) goto L16
            r4 = r0[r3]
            if (r4 == 0) goto L13
            r6.call(r4)
        L13:
            int r3 = r3 + 1
            goto La
        L16:
            r6 = 0
            java.util.Arrays.fill(r0, r6)
            r5.c = r2
            return
    }

    public boolean c() {
            r1 = this;
            int r0 = r1.c
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    void e() {
            r8 = this;
            T[] r0 = r8.e
            int r1 = r0.length
            int r2 = r1 << 1
            int r3 = r2 + (-1)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            int r5 = r8.c
        Lb:
            int r6 = r5 + (-1)
            if (r5 == 0) goto L30
        Lf:
            int r1 = r1 + (-1)
            r5 = r0[r1]
            if (r5 != 0) goto L16
            goto Lf
        L16:
            int r5 = r5.hashCode()
            int r5 = d(r5)
            r5 = r5 & r3
            r7 = r4[r5]
            if (r7 == 0) goto L2a
        L23:
            int r5 = r5 + 1
            r5 = r5 & r3
            r7 = r4[r5]
            if (r7 != 0) goto L23
        L2a:
            r7 = r0[r1]
            r4[r5] = r7
            r5 = r6
            goto Lb
        L30:
            r8.b = r3
            float r0 = (float) r2
            float r1 = r8.a
            float r0 = r0 * r1
            int r0 = (int) r0
            r8.d = r0
            r8.e = r4
            return
    }

    public boolean f(T r6) {
            r5 = this;
            T[] r0 = r5.e
            int r1 = r5.b
            int r2 = r6.hashCode()
            int r2 = d(r2)
            r2 = r2 & r1
            r3 = r0[r2]
            r4 = 0
            if (r3 != 0) goto L13
            return r4
        L13:
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L1e
            boolean r6 = r5.g(r2, r0, r1)
            return r6
        L1e:
            int r2 = r2 + 1
            r2 = r2 & r1
            r3 = r0[r2]
            if (r3 != 0) goto L26
            return r4
        L26:
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L1e
            boolean r6 = r5.g(r2, r0, r1)
            return r6
    }

    boolean g(int r5, T[] r6, int r7) {
            r4 = this;
            int r0 = r4.c
            r1 = 1
            int r0 = r0 - r1
            r4.c = r0
        L6:
            int r0 = r5 + 1
        L8:
            r0 = r0 & r7
            r2 = r6[r0]
            if (r2 != 0) goto L11
            r7 = 0
            r6[r5] = r7
            return r1
        L11:
            int r3 = r2.hashCode()
            int r3 = d(r3)
            r3 = r3 & r7
            if (r5 > r0) goto L21
            if (r5 >= r3) goto L25
            if (r3 <= r0) goto L29
            goto L25
        L21:
            if (r5 < r3) goto L29
            if (r3 <= r0) goto L29
        L25:
            r6[r5] = r2
            r5 = r0
            goto L6
        L29:
            int r0 = r0 + 1
            goto L8
    }

    public void h() {
            r1 = this;
            r0 = 0
            r1.c = r0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.e = r0
            return
    }

    public T[] i() {
            r1 = this;
            T[] r0 = r1.e
            return r0
    }
}
