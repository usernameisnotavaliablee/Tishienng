package com.ss.android.socialbase.appdownloader.m.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
class c implements com.ss.android.socialbase.appdownloader.m.j.b {
    private com.ss.android.socialbase.appdownloader.m.j.e b;
    private boolean c;
    private com.ss.android.socialbase.appdownloader.m.j.d d;
    private int[] e;
    private com.ss.android.socialbase.appdownloader.m.j.c.a f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int[] l;
    private int m;
    private int n;
    private int o;

    private static final class a {
        private int[] a;
        private int b;
        private int c;

        public a() {
                r1 = this;
                r1.<init>()
                r0 = 32
                int[] r0 = new int[r0]
                r1.a = r0
                return
        }

        private void c(int r4) {
                r3 = this;
                int[] r0 = r3.a
                int r1 = r0.length
                int r2 = r3.b
                int r1 = r1 - r2
                if (r1 > r4) goto L14
                int r4 = r0.length
                int r4 = r4 + r1
                int r4 = r4 * 2
                int[] r4 = new int[r4]
                r1 = 0
                java.lang.System.arraycopy(r0, r1, r4, r1, r2)
                r3.a = r4
            L14:
                return
        }

        public final boolean a() {
                r6 = this;
                int r0 = r6.b
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                int r2 = r0 + (-1)
                int[] r3 = r6.a
                r2 = r3[r2]
                if (r2 != 0) goto Lf
                return r1
            Lf:
                int r2 = r2 + (-1)
                int r1 = r0 + (-3)
                r3[r1] = r2
                int r4 = r2 * 2
                r5 = 1
                int r4 = r4 + r5
                int r1 = r1 - r4
                r3[r1] = r2
                int r0 = r0 + (-2)
                r6.b = r0
                return r5
        }

        public final void b() {
                r1 = this;
                r0 = 0
                r1.b = r0
                r1.c = r0
                return
        }

        public final void d(int r8, int r9) {
                r7 = this;
                int r0 = r7.c
                if (r0 != 0) goto L7
                r7.g()
            L7:
                r0 = 2
                r7.c(r0)
                int r1 = r7.b
                int r2 = r1 + (-1)
                int[] r3 = r7.a
                r4 = r3[r2]
                int r5 = r1 + (-2)
                int r6 = r4 * 2
                int r5 = r5 - r6
                int r4 = r4 + 1
                r3[r5] = r4
                r3[r2] = r8
                r3[r1] = r9
                int r8 = r1 + 1
                r3[r8] = r4
                int r1 = r1 + r0
                r7.b = r1
                return
        }

        public final void e() {
                r3 = this;
                int r0 = r3.b
                if (r0 == 0) goto L1c
                int r1 = r0 + (-1)
                int[] r2 = r3.a
                r1 = r2[r1]
                int r2 = r0 + (-2)
                int r1 = r1 * 2
                int r2 = r2 - r1
                if (r2 == 0) goto L1c
                int r1 = r1 + 2
                int r0 = r0 - r1
                r3.b = r0
                int r0 = r3.c
                int r0 = r0 + (-1)
                r3.c = r0
            L1c:
                return
        }

        public final int f() {
                r1 = this;
                int r0 = r1.c
                return r0
        }

        public final void g() {
                r5 = this;
                r0 = 2
                r5.c(r0)
                int r1 = r5.b
                int[] r2 = r5.a
                r3 = 0
                r2[r1] = r3
                int r4 = r1 + 1
                r2[r4] = r3
                int r1 = r1 + r0
                r5.b = r1
                int r0 = r5.c
                int r0 = r0 + 1
                r5.c = r0
                return
        }

        public final int h() {
                r2 = this;
                int r0 = r2.b
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                int r0 = r0 + (-1)
                int[] r1 = r2.a
                r0 = r1[r0]
                return r0
        }
    }

    public c() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            com.ss.android.socialbase.appdownloader.m.j.c$a r0 = new com.ss.android.socialbase.appdownloader.m.j.c$a
            r0.<init>()
            r1.f = r0
            r1.a()
            return
    }

    private final void a() {
            r2 = this;
            r0 = -1
            r2.h = r0
            r2.i = r0
            r2.j = r0
            r2.k = r0
            r1 = 0
            r2.l = r1
            r2.m = r0
            r2.n = r0
            r2.o = r0
            return
    }

    private final void g() throws java.io.IOException {
            r10 = this;
            com.ss.android.socialbase.appdownloader.m.j.d r0 = r10.d
            r1 = 1
            if (r0 != 0) goto L21
            com.ss.android.socialbase.appdownloader.m.j.e r0 = r10.b
            r2 = 524291(0x80003, float:7.34688E-40)
            com.ss.android.socialbase.appdownloader.m.j.g.a(r0, r2)
            com.ss.android.socialbase.appdownloader.m.j.e r0 = r10.b
            r0.a()
            com.ss.android.socialbase.appdownloader.m.j.e r0 = r10.b
            com.ss.android.socialbase.appdownloader.m.j.d r0 = com.ss.android.socialbase.appdownloader.m.j.d.b(r0)
            r10.d = r0
            com.ss.android.socialbase.appdownloader.m.j.c$a r0 = r10.f
            r0.g()
            r10.c = r1
        L21:
            int r0 = r10.h
            if (r0 == r1) goto L183
            r10.a()
        L28:
            boolean r2 = r10.g
            r3 = 0
            if (r2 == 0) goto L34
            r10.g = r3
            com.ss.android.socialbase.appdownloader.m.j.c$a r2 = r10.f
            r2.e()
        L34:
            r2 = 3
            if (r0 != r2) goto L4a
            com.ss.android.socialbase.appdownloader.m.j.c$a r4 = r10.f
            int r4 = r4.f()
            if (r4 != r1) goto L4a
            com.ss.android.socialbase.appdownloader.m.j.c$a r4 = r10.f
            int r4 = r4.h()
            if (r4 != 0) goto L4a
            r10.h = r1
            return
        L4a:
            r4 = 1048834(0x100102, float:1.46973E-39)
            if (r0 != 0) goto L53
            r5 = 1048834(0x100102, float:1.46973E-39)
            goto L59
        L53:
            com.ss.android.socialbase.appdownloader.m.j.e r5 = r10.b
            int r5 = r5.g()
        L59:
            r6 = 524672(0x80180, float:7.35222E-40)
            java.lang.String r7 = ")."
            r8 = 2
            if (r5 != r6) goto L92
            com.ss.android.socialbase.appdownloader.m.j.e r2 = r10.b
            int r2 = r2.g()
            r3 = 8
            if (r2 < r3) goto L7b
            int r3 = r2 % 4
            if (r3 != 0) goto L7b
            com.ss.android.socialbase.appdownloader.m.j.e r3 = r10.b
            int r2 = r2 / 4
            int r2 = r2 - r8
            int[] r2 = r3.h(r2)
            r10.e = r2
            goto L28
        L7b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid resource ids size ("
            r1.<init>(r3)
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L92:
            r6 = 1048832(0x100100, float:1.469727E-39)
            if (r5 < r6) goto L16c
            r9 = 1048836(0x100104, float:1.469732E-39)
            if (r5 > r9) goto L16c
            if (r5 != r4) goto La4
            r7 = -1
            if (r0 != r7) goto La4
            r10.h = r3
            return
        La4:
            com.ss.android.socialbase.appdownloader.m.j.e r3 = r10.b
            r3.a()
            com.ss.android.socialbase.appdownloader.m.j.e r3 = r10.b
            int r3 = r3.g()
            com.ss.android.socialbase.appdownloader.m.j.e r7 = r10.b
            r7.a()
            if (r5 == r6) goto L146
            r7 = 1048833(0x100101, float:1.469728E-39)
            if (r5 != r7) goto Lbd
            goto L146
        Lbd:
            r10.i = r3
            if (r5 != r4) goto L114
            com.ss.android.socialbase.appdownloader.m.j.e r0 = r10.b
            int r0 = r0.g()
            r10.k = r0
            com.ss.android.socialbase.appdownloader.m.j.e r0 = r10.b
            int r0 = r0.g()
            r10.j = r0
            com.ss.android.socialbase.appdownloader.m.j.e r0 = r10.b
            r0.a()
            com.ss.android.socialbase.appdownloader.m.j.e r0 = r10.b
            int r0 = r0.g()
            int r3 = r0 >>> 16
            int r3 = r3 - r1
            r10.m = r3
            r3 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r3
            com.ss.android.socialbase.appdownloader.m.j.e r4 = r10.b
            int r4 = r4.g()
            int r5 = r4 >>> 16
            int r5 = r5 - r1
            r10.o = r5
            r3 = r3 & r4
            int r3 = r3 - r1
            r10.n = r3
            com.ss.android.socialbase.appdownloader.m.j.e r1 = r10.b
            int r0 = r0 * 5
            int[] r0 = r1.h(r0)
            r10.l = r0
        Lfe:
            int[] r0 = r10.l
            int r1 = r0.length
            if (r2 >= r1) goto L10c
            r1 = r0[r2]
            int r1 = r1 >>> 24
            r0[r2] = r1
            int r2 = r2 + 5
            goto Lfe
        L10c:
            com.ss.android.socialbase.appdownloader.m.j.c$a r0 = r10.f
            r0.g()
            r10.h = r8
            return
        L114:
            r3 = 1048835(0x100103, float:1.469731E-39)
            if (r5 != r3) goto L12e
            com.ss.android.socialbase.appdownloader.m.j.e r0 = r10.b
            int r0 = r0.g()
            r10.k = r0
            com.ss.android.socialbase.appdownloader.m.j.e r0 = r10.b
            int r0 = r0.g()
            r10.j = r0
            r10.h = r2
            r10.g = r1
            return
        L12e:
            if (r5 != r9) goto L28
            com.ss.android.socialbase.appdownloader.m.j.e r0 = r10.b
            int r0 = r0.g()
            r10.j = r0
            com.ss.android.socialbase.appdownloader.m.j.e r0 = r10.b
            r0.a()
            com.ss.android.socialbase.appdownloader.m.j.e r0 = r10.b
            r0.a()
            r0 = 4
            r10.h = r0
            return
        L146:
            if (r5 != r6) goto L15b
            com.ss.android.socialbase.appdownloader.m.j.e r2 = r10.b
            int r2 = r2.g()
            com.ss.android.socialbase.appdownloader.m.j.e r3 = r10.b
            int r3 = r3.g()
            com.ss.android.socialbase.appdownloader.m.j.c$a r4 = r10.f
            r4.d(r2, r3)
            goto L28
        L15b:
            com.ss.android.socialbase.appdownloader.m.j.e r2 = r10.b
            r2.a()
            com.ss.android.socialbase.appdownloader.m.j.e r2 = r10.b
            r2.a()
            com.ss.android.socialbase.appdownloader.m.j.c$a r2 = r10.f
            r2.a()
            goto L28
        L16c:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid chunk type ("
            r1.<init>(r2)
            r1.append(r5)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L183:
            return
    }

    private final int i(int r4) {
            r3 = this;
            int r0 = r3.h
            r1 = 2
            if (r0 != r1) goto L26
            int r0 = r4 * 5
            int[] r1 = r3.l
            int r1 = r1.length
            if (r0 >= r1) goto Ld
            return r0
        Ld:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid attribute index ("
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = ")."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L26:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Current event is not START_TAG."
            r4.<init>(r0)
            throw r4
    }

    public int b(int r2) {
            r1 = this;
            int r2 = r1.i(r2)
            int[] r0 = r1.l
            int r2 = r2 + 4
            r2 = r0[r2]
            return r2
    }

    public java.lang.String c(int r2) {
            r1 = this;
            int r2 = r1.i(r2)
            int[] r0 = r1.l
            int r2 = r2 + 1
            r2 = r0[r2]
            r0 = -1
            if (r2 != r0) goto L10
            java.lang.String r2 = ""
            return r2
        L10:
            com.ss.android.socialbase.appdownloader.m.j.d r0 = r1.d
            java.lang.String r2 = r0.c(r2)
            return r2
    }

    @Override // com.ss.android.socialbase.appdownloader.m.j.a
    public int cw() {
            r1 = this;
            int r0 = r1.i
            return r0
    }

    public void d() {
            r1 = this;
            boolean r0 = r1.c
            if (r0 == 0) goto L1b
            r0 = 0
            r1.c = r0
            com.ss.android.socialbase.appdownloader.m.j.e r0 = r1.b
            r0.d()
            r0 = 0
            r1.b = r0
            r1.d = r0
            r1.e = r0
            com.ss.android.socialbase.appdownloader.m.j.c$a r0 = r1.f
            r0.b()
            r1.a()
        L1b:
            return
    }

    public void e(java.io.InputStream r3) {
            r2 = this;
            r2.d()
            if (r3 == 0) goto Ld
            com.ss.android.socialbase.appdownloader.m.j.e r0 = new com.ss.android.socialbase.appdownloader.m.j.e
            r1 = 0
            r0.<init>(r3, r1)
            r2.b = r0
        Ld:
            return
    }

    public java.lang.String f(int r4) {
            r3 = this;
            int r4 = r3.i(r4)
            int[] r0 = r3.l
            int r1 = r4 + 3
            r1 = r0[r1]
            r2 = 3
            if (r1 != r2) goto L18
            int r4 = r4 + 2
            r4 = r0[r4]
            com.ss.android.socialbase.appdownloader.m.j.d r0 = r3.d
            java.lang.String r4 = r0.c(r4)
            return r4
        L18:
            java.lang.String r4 = ""
            return r4
    }

    public int h() {
            r2 = this;
            int r0 = r2.h
            r1 = 2
            if (r0 == r1) goto L7
            r0 = -1
            return r0
        L7:
            int[] r0 = r2.l
            int r0 = r0.length
            int r0 = r0 / 5
            return r0
    }

    public int j() throws com.ss.android.socialbase.appdownloader.m.j.tl, java.io.IOException {
            r3 = this;
            com.ss.android.socialbase.appdownloader.m.j.e r0 = r3.b
            if (r0 == 0) goto Lf
            r3.g()     // Catch: java.io.IOException -> La
            int r0 = r3.h     // Catch: java.io.IOException -> La
            return r0
        La:
            r0 = move-exception
            r3.d()
            throw r0
        Lf:
            com.ss.android.socialbase.appdownloader.m.j.tl r0 = new com.ss.android.socialbase.appdownloader.m.j.tl
            java.lang.String r1 = "Parser is not opened."
            r2 = 0
            r0.<init>(r1, r3, r2)
            throw r0
    }

    public int k(int r2) {
            r1 = this;
            int r2 = r1.i(r2)
            int[] r0 = r1.l
            int r2 = r2 + 3
            r2 = r0[r2]
            return r2
    }

    @Override // com.ss.android.socialbase.appdownloader.m.j.a
    public int m() {
            r1 = this;
            r0 = -1
            return r0
    }

    @Override // com.ss.android.socialbase.appdownloader.m.j.a
    public java.lang.String r() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "XML line #"
            r0.<init>(r1)
            int r1 = r2.cw()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
