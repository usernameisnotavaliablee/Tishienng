package org.apache.commons.net.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class f {
    private static final java.lang.String f = "(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})";
    private static final java.lang.String g = "(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})/(\\d{1,3})";
    private static final java.util.regex.Pattern h = null;
    private static final java.util.regex.Pattern i = null;
    private static final int j = 32;
    private int a;
    private int b;
    private int c;
    private int d;
    private boolean e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public final class b {
        private static final long b = 4294967295L;
        final /* synthetic */ org.apache.commons.net.util.f a;

        private b(org.apache.commons.net.util.f r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ b(org.apache.commons.net.util.f r1, org.apache.commons.net.util.f.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private int a() {
                r1 = this;
                org.apache.commons.net.util.f r0 = r1.a
                int r0 = org.apache.commons.net.util.f.c(r0)
                return r0
        }

        private int c() {
                r1 = this;
                org.apache.commons.net.util.f r0 = r1.a
                int r0 = org.apache.commons.net.util.f.d(r0)
                return r0
        }

        private long d() {
                r4 = this;
                org.apache.commons.net.util.f r0 = r4.a
                int r0 = org.apache.commons.net.util.f.d(r0)
                long r0 = (long) r0
                r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r0 = r0 & r2
                return r0
        }

        private int o() {
                r5 = this;
                org.apache.commons.net.util.f r0 = r5.a
                boolean r0 = r0.l()
                if (r0 == 0) goto Ld
                int r0 = r5.c()
                return r0
            Ld:
                long r0 = r5.d()
                long r2 = r5.u()
                long r0 = r0 - r2
                r2 = 1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L23
                int r0 = r5.c()
                int r0 = r0 + (-1)
                return r0
            L23:
                r0 = 0
                return r0
        }

        private int r() {
                r5 = this;
                org.apache.commons.net.util.f r0 = r5.a
                boolean r0 = r0.l()
                if (r0 == 0) goto Ld
                int r0 = r5.t()
                return r0
            Ld:
                long r0 = r5.d()
                long r2 = r5.u()
                long r0 = r0 - r2
                r2 = 1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L23
                int r0 = r5.t()
                int r0 = r0 + 1
                return r0
            L23:
                r0 = 0
                return r0
        }

        private int s() {
                r1 = this;
                org.apache.commons.net.util.f r0 = r1.a
                int r0 = org.apache.commons.net.util.f.a(r0)
                return r0
        }

        private int t() {
                r1 = this;
                org.apache.commons.net.util.f r0 = r1.a
                int r0 = org.apache.commons.net.util.f.b(r0)
                return r0
        }

        private long u() {
                r4 = this;
                org.apache.commons.net.util.f r0 = r4.a
                int r0 = org.apache.commons.net.util.f.b(r0)
                long r0 = (long) r0
                r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r0 = r0 & r2
                return r0
        }

        public int b(java.lang.String r2) {
                r1 = this;
                org.apache.commons.net.util.f r0 = r1.a
                int r2 = org.apache.commons.net.util.f.e(r0, r2)
                return r2
        }

        public java.lang.String e() {
                r2 = this;
                org.apache.commons.net.util.f r0 = r2.a
                int r1 = r2.a()
                int[] r1 = org.apache.commons.net.util.f.f(r0, r1)
                java.lang.String r0 = org.apache.commons.net.util.f.g(r0, r1)
                return r0
        }

        @java.lang.Deprecated
        public int f() {
                r5 = this;
                long r0 = r5.g()
                r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 > 0) goto Ld
                int r1 = (int) r0
                return r1
            Ld:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Count is larger than an integer: "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r2.<init>(r0)
                throw r2
        }

        public long g() {
                r5 = this;
                long r0 = r5.d()
                long r2 = r5.u()
                long r0 = r0 - r2
                org.apache.commons.net.util.f r2 = r5.a
                boolean r2 = r2.l()
                if (r2 == 0) goto L13
                r2 = 1
                goto L14
            L13:
                r2 = -1
            L14:
                long r2 = (long) r2
                long r0 = r0 + r2
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 >= 0) goto L1d
                return r2
            L1d:
                return r0
        }

        public java.lang.String[] h() {
                r5 = this;
                int r0 = r5.f()
                java.lang.String[] r1 = new java.lang.String[r0]
                if (r0 != 0) goto L9
                goto L25
            L9:
                int r0 = r5.r()
                r2 = 0
            Le:
                int r3 = r5.o()
                if (r0 > r3) goto L25
                org.apache.commons.net.util.f r3 = r5.a
                int[] r4 = org.apache.commons.net.util.f.f(r3, r0)
                java.lang.String r3 = org.apache.commons.net.util.f.g(r3, r4)
                r1[r2] = r3
                int r0 = r0 + 1
                int r2 = r2 + 1
                goto Le
            L25:
                return r1
        }

        public java.lang.String i() {
                r2 = this;
                org.apache.commons.net.util.f r0 = r2.a
                int r1 = r2.c()
                int[] r1 = org.apache.commons.net.util.f.f(r0, r1)
                java.lang.String r0 = org.apache.commons.net.util.f.g(r0, r1)
                return r0
        }

        public java.lang.String j() {
                r4 = this;
                org.apache.commons.net.util.f r0 = r4.a
                int r1 = r4.a()
                int[] r1 = org.apache.commons.net.util.f.f(r0, r1)
                java.lang.String r1 = org.apache.commons.net.util.f.g(r0, r1)
                org.apache.commons.net.util.f r2 = r4.a
                int r3 = r4.s()
                int[] r3 = org.apache.commons.net.util.f.f(r2, r3)
                java.lang.String r2 = org.apache.commons.net.util.f.g(r2, r3)
                java.lang.String r0 = org.apache.commons.net.util.f.h(r0, r1, r2)
                return r0
        }

        public java.lang.String k() {
                r2 = this;
                org.apache.commons.net.util.f r0 = r2.a
                int r1 = r2.o()
                int[] r1 = org.apache.commons.net.util.f.f(r0, r1)
                java.lang.String r0 = org.apache.commons.net.util.f.g(r0, r1)
                return r0
        }

        public java.lang.String l() {
                r2 = this;
                org.apache.commons.net.util.f r0 = r2.a
                int r1 = r2.r()
                int[] r1 = org.apache.commons.net.util.f.f(r0, r1)
                java.lang.String r0 = org.apache.commons.net.util.f.g(r0, r1)
                return r0
        }

        public java.lang.String m() {
                r2 = this;
                org.apache.commons.net.util.f r0 = r2.a
                int r1 = r2.s()
                int[] r1 = org.apache.commons.net.util.f.f(r0, r1)
                java.lang.String r0 = org.apache.commons.net.util.f.g(r0, r1)
                return r0
        }

        public java.lang.String n() {
                r2 = this;
                org.apache.commons.net.util.f r0 = r2.a
                int r1 = r2.t()
                int[] r1 = org.apache.commons.net.util.f.f(r0, r1)
                java.lang.String r0 = org.apache.commons.net.util.f.g(r0, r1)
                return r0
        }

        public boolean p(int r9) {
                r8 = this;
                long r0 = (long) r9
                r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r0 = r0 & r2
                int r9 = r8.r()
                long r4 = (long) r9
                long r4 = r4 & r2
                int r9 = r8.o()
                long r6 = (long) r9
                long r2 = r2 & r6
                int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r9 < 0) goto L1d
                int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r9 > 0) goto L1d
                r9 = 1
                return r9
            L1d:
                r9 = 0
                return r9
        }

        public boolean q(java.lang.String r2) {
                r1 = this;
                org.apache.commons.net.util.f r0 = r1.a
                int r2 = org.apache.commons.net.util.f.e(r0, r2)
                boolean r2 = r1.p(r2)
                return r2
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "CIDR Signature:\t["
                r0.append(r1)
                java.lang.String r1 = r3.j()
                r0.append(r1)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r1 = " Netmask: ["
                r0.append(r1)
                java.lang.String r1 = r3.m()
                r0.append(r1)
                java.lang.String r1 = "]\n"
                r0.append(r1)
                java.lang.String r2 = "Network:\t["
                r0.append(r2)
                java.lang.String r2 = r3.n()
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = "Broadcast:\t["
                r0.append(r2)
                java.lang.String r2 = r3.i()
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = "First Address:\t["
                r0.append(r2)
                java.lang.String r2 = r3.l()
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = "Last Address:\t["
                r0.append(r2)
                java.lang.String r2 = r3.k()
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = "# Addresses:\t["
                r0.append(r2)
                int r2 = r3.f()
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.String r0 = "(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.apache.commons.net.util.f.h = r0
            java.lang.String r0 = "(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})/(\\d{1,3})"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.apache.commons.net.util.f.i = r0
            return
    }

    public f(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.b = r0
            r1.c = r0
            r1.d = r0
            r1.e = r0
            r1.i(r2)
            return
    }

    public f(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.b = r0
            r1.c = r0
            r1.d = r0
            r1.e = r0
            java.lang.String r2 = r1.r(r2, r3)
            r1.i(r2)
            return
    }

    static /* synthetic */ int a(org.apache.commons.net.util.f r0) {
            int r0 = r0.a
            return r0
    }

    static /* synthetic */ int b(org.apache.commons.net.util.f r0) {
            int r0 = r0.c
            return r0
    }

    static /* synthetic */ int c(org.apache.commons.net.util.f r0) {
            int r0 = r0.b
            return r0
    }

    static /* synthetic */ int d(org.apache.commons.net.util.f r0) {
            int r0 = r0.d
            return r0
    }

    static /* synthetic */ int e(org.apache.commons.net.util.f r0, java.lang.String r1) {
            int r0 = r0.s(r1)
            return r0
    }

    static /* synthetic */ int[] f(org.apache.commons.net.util.f r0, int r1) {
            int[] r0 = r0.q(r1)
            return r0
    }

    static /* synthetic */ java.lang.String g(org.apache.commons.net.util.f r0, int[] r1) {
            java.lang.String r0 = r0.j(r1)
            return r0
    }

    static /* synthetic */ java.lang.String h(org.apache.commons.net.util.f r0, java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = r0.r(r1, r2)
            return r0
    }

    private void i(java.lang.String r5) {
            r4 = this;
            java.util.regex.Pattern r0 = org.apache.commons.net.util.f.i
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L3d
            int r5 = r4.m(r0)
            r4.b = r5
            r5 = 5
            java.lang.String r5 = r0.group(r5)
            int r5 = java.lang.Integer.parseInt(r5)
            r0 = 32
            r1 = 0
            int r5 = r4.o(r5, r1, r0)
        L22:
            if (r1 >= r5) goto L31
            int r0 = r4.a
            int r2 = 31 - r1
            r3 = 1
            int r2 = r3 << r2
            r0 = r0 | r2
            r4.a = r0
            int r1 = r1 + 1
            goto L22
        L31:
            int r5 = r4.b
            int r0 = r4.a
            r5 = r5 & r0
            r4.c = r5
            int r0 = ~r0
            r5 = r5 | r0
            r4.d = r5
            return
        L3d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not parse ["
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = "]"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    private java.lang.String j(int[] r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.length
            if (r1 >= r2) goto L1b
            r2 = r4[r1]
            r0.append(r2)
            int r2 = r4.length
            int r2 = r2 + (-1)
            if (r1 == r2) goto L18
            java.lang.String r2 = "."
            r0.append(r2)
        L18:
            int r1 = r1 + 1
            goto L6
        L1b:
            java.lang.String r4 = r0.toString()
            return r4
    }

    private int m(java.util.regex.Matcher r6) {
            r5 = this;
            r0 = 0
            r1 = 1
            r2 = 0
        L3:
            r3 = 4
            if (r1 > r3) goto L1e
            java.lang.String r3 = r6.group(r1)
            int r3 = java.lang.Integer.parseInt(r3)
            r4 = 255(0xff, float:3.57E-43)
            int r3 = r5.o(r3, r0, r4)
            r3 = r3 & r4
            int r4 = 4 - r1
            int r4 = r4 * 8
            int r3 = r3 << r4
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L3
        L1e:
            return r2
    }

    private int o(int r4, int r5, int r6) {
            r3 = this;
            if (r4 < r5) goto L5
            if (r4 > r6) goto L5
            return r4
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Value ["
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "] not in range ["
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = ","
            r1.append(r4)
            r1.append(r6)
            java.lang.String r4 = "]"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private int[] q(int r5) {
            r4 = this;
            r0 = 4
            int[] r0 = new int[r0]
            r1 = 3
        L4:
            if (r1 < 0) goto L16
            r2 = r0[r1]
            int r3 = 3 - r1
            int r3 = r3 * 8
            int r3 = r5 >>> r3
            r3 = r3 & 255(0xff, float:3.57E-43)
            r2 = r2 | r3
            r0[r1] = r2
            int r1 = r1 + (-1)
            goto L4
        L16:
            return r0
    }

    private java.lang.String r(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "/"
            r0.append(r2)
            int r2 = r1.s(r3)
            int r2 = r1.n(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private int s(java.lang.String r4) {
            r3 = this;
            java.util.regex.Pattern r0 = org.apache.commons.net.util.f.h
            java.util.regex.Matcher r0 = r0.matcher(r4)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L11
            int r4 = r3.m(r0)
            return r4
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not parse ["
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "]"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public final org.apache.commons.net.util.f.b k() {
            r2 = this;
            org.apache.commons.net.util.f$b r0 = new org.apache.commons.net.util.f$b
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public boolean l() {
            r1 = this;
            boolean r0 = r1.e
            return r0
    }

    int n(int r3) {
            r2 = this;
            int r0 = r3 >>> 1
            r1 = 1431655765(0x55555555, float:1.4660155E13)
            r0 = r0 & r1
            int r3 = r3 - r0
            r0 = 858993459(0x33333333, float:4.172325E-8)
            r1 = r3 & r0
            int r3 = r3 >>> 2
            r3 = r3 & r0
            int r1 = r1 + r3
            int r3 = r1 >>> 4
            int r1 = r1 + r3
            r3 = 252645135(0xf0f0f0f, float:7.0533445E-30)
            r3 = r3 & r1
            int r0 = r3 >>> 8
            int r3 = r3 + r0
            int r0 = r3 >>> 16
            int r3 = r3 + r0
            r3 = r3 & 63
            return r3
    }

    public void p(boolean r1) {
            r0 = this;
            r0.e = r1
            return
    }
}
