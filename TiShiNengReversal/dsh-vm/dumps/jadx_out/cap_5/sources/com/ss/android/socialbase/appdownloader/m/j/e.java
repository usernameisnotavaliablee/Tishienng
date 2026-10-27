package com.ss.android.socialbase.appdownloader.m.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e {
    private java.io.InputStream a;
    private boolean b;
    private int c;

    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    public e(java.io.InputStream r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.e(r1, r2)
            return
    }

    public final void a() throws java.io.IOException {
            r1 = this;
            r0 = 4
            r1.b(r0)
            return
    }

    public final void b(int r8) throws java.io.IOException {
            r7 = this;
            if (r8 <= 0) goto L1b
            java.io.InputStream r0 = r7.a
            long r1 = (long) r8
            long r3 = r0.skip(r1)
            int r8 = r7.c
            long r5 = (long) r8
            long r5 = r5 + r3
            int r8 = (int) r5
            r7.c = r8
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L15
            goto L1b
        L15:
            java.io.EOFException r8 = new java.io.EOFException
            r8.<init>()
            throw r8
        L1b:
            return
    }

    public final int c(int r6) throws java.io.IOException {
            r5 = this;
            if (r6 < 0) goto L4a
            r0 = 4
            if (r6 > r0) goto L4a
            boolean r0 = r5.b
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L2b
            int r6 = r6 + (-1)
            int r6 = r6 * 8
        Lf:
            if (r6 < 0) goto L2a
            java.io.InputStream r0 = r5.a
            int r0 = r0.read()
            if (r0 == r1) goto L24
            int r3 = r5.c
            int r3 = r3 + 1
            r5.c = r3
            int r0 = r0 << r6
            r2 = r2 | r0
            int r6 = r6 + (-8)
            goto Lf
        L24:
            java.io.EOFException r6 = new java.io.EOFException
            r6.<init>()
            throw r6
        L2a:
            return r2
        L2b:
            int r6 = r6 * 8
            r0 = 0
        L2e:
            if (r2 == r6) goto L49
            java.io.InputStream r3 = r5.a
            int r3 = r3.read()
            if (r3 == r1) goto L43
            int r4 = r5.c
            int r4 = r4 + 1
            r5.c = r4
            int r3 = r3 << r2
            r0 = r0 | r3
            int r2 = r2 + 8
            goto L2e
        L43:
            java.io.EOFException r6 = new java.io.EOFException
            r6.<init>()
            throw r6
        L49:
            return r0
        L4a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
    }

    public final void d() {
            r2 = this;
            java.io.InputStream r0 = r2.a
            if (r0 == 0) goto Lc
            r0.close()     // Catch: java.io.IOException -> L7
        L7:
            r0 = 0
            r1 = 0
            r2.e(r0, r1)
        Lc:
            return
    }

    public final void e(java.io.InputStream r1, boolean r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r1 = 0
            r0.c = r1
            return
    }

    public final void f(int[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
        L0:
            if (r5 <= 0) goto Le
            int r0 = r4 + 1
            int r1 = r2.g()
            r3[r4] = r1
            int r5 = r5 + (-1)
            r4 = r0
            goto L0
        Le:
            return
    }

    public final int g() throws java.io.IOException {
            r1 = this;
            r0 = 4
            int r0 = r1.c(r0)
            return r0
    }

    public final int[] h(int r3) throws java.io.IOException {
            r2 = this;
            int[] r0 = new int[r3]
            r1 = 0
            r2.f(r0, r1, r3)
            return r0
    }
}
