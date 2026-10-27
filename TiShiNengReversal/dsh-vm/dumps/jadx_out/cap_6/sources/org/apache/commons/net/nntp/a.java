package org.apache.commons.net.nntp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a implements org.apache.commons.net.nntp.o {
    private long a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;
    private java.lang.String f;
    private java.util.ArrayList<java.lang.String> g;
    private boolean h;
    public org.apache.commons.net.nntp.a i;
    public org.apache.commons.net.nntp.a j;

    public a() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.h = r0
            r0 = -1
            r2.a = r0
            return
    }

    private void C() {
            r9 = this;
            java.lang.String r0 = r9.r()
            int r1 = r0.length()
            r2 = 0
            r3 = 0
            r4 = 0
        Lb:
            if (r3 != 0) goto Lc4
        Ld:
            r3 = 32
            if (r4 >= r1) goto L1a
            char r5 = r0.charAt(r4)
            if (r5 != r3) goto L1a
            int r4 = r4 + 1
            goto Ld
        L1a:
            int r5 = r1 + (-2)
            if (r4 >= r5) goto L97
            char r6 = r0.charAt(r4)
            r7 = 114(0x72, float:1.6E-43)
            if (r6 == r7) goto L2e
            char r6 = r0.charAt(r4)
            r7 = 82
            if (r6 != r7) goto L97
        L2e:
            int r6 = r4 + 1
            char r7 = r0.charAt(r6)
            r8 = 101(0x65, float:1.42E-43)
            if (r7 == r8) goto L40
            char r6 = r0.charAt(r6)
            r7 = 69
            if (r6 != r7) goto L97
        L40:
            int r6 = r4 + 2
            char r7 = r0.charAt(r6)
            r8 = 58
            if (r7 != r8) goto L4e
            int r4 = r4 + 3
        L4c:
            r5 = 0
            goto L98
        L4e:
            if (r4 >= r5) goto L97
            char r5 = r0.charAt(r6)
            r7 = 91
            if (r5 == r7) goto L60
            char r5 = r0.charAt(r6)
            r6 = 40
            if (r5 != r6) goto L97
        L60:
            int r5 = r4 + 3
        L62:
            if (r5 >= r1) goto L77
            char r6 = r0.charAt(r5)
            r7 = 48
            if (r6 < r7) goto L77
            char r6 = r0.charAt(r5)
            r7 = 57
            if (r6 > r7) goto L77
            int r5 = r5 + 1
            goto L62
        L77:
            int r6 = r1 + (-1)
            if (r5 >= r6) goto L97
            char r6 = r0.charAt(r5)
            r7 = 93
            if (r6 == r7) goto L8b
            char r6 = r0.charAt(r5)
            r7 = 41
            if (r6 != r7) goto L97
        L8b:
            int r6 = r5 + 1
            char r6 = r0.charAt(r6)
            if (r6 != r8) goto L97
            int r5 = r5 + 2
            r4 = r5
            goto L4c
        L97:
            r5 = 1
        L98:
            java.lang.String r6 = "(no subject)"
            java.lang.String r7 = r9.e
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto La6
            java.lang.String r6 = ""
            r9.e = r6
        La6:
            r6 = r1
        La7:
            if (r6 <= r4) goto Lb4
            int r7 = r6 + (-1)
            char r7 = r0.charAt(r7)
            if (r7 >= r3) goto Lb4
            int r6 = r6 + (-1)
            goto La7
        Lb4:
            if (r4 != 0) goto Lbb
            if (r6 != r1) goto Lbb
            r9.e = r0
            goto Lc1
        Lbb:
            java.lang.String r3 = r0.substring(r4, r6)
            r9.e = r3
        Lc1:
            r3 = r5
            goto Lb
        Lc4:
            return
    }

    private void k() {
            r1 = this;
            r0 = 0
            r1.e = r0
            return
    }

    public static void s(org.apache.commons.net.nntp.a r2) {
            r0 = 0
            java.io.PrintStream r1 = java.lang.System.out
            u(r2, r0, r1)
            return
    }

    public static void t(org.apache.commons.net.nntp.a r1, int r2) {
            java.io.PrintStream r0 = java.lang.System.out
            u(r1, r2, r0)
            return
    }

    public static void u(org.apache.commons.net.nntp.a r1, int r2, java.io.PrintStream r3) {
            r0 = 0
        L1:
            if (r0 >= r2) goto L9
            r3.getClass()
            int r0 = r0 + 1
            goto L1
        L9:
            r1.r()
            r1.p()
            r1.l()
            r3.getClass()
            org.apache.commons.net.nntp.a r3 = r1.i
            if (r3 == 0) goto L1e
            int r0 = r2 + 1
            t(r3, r0)
        L1e:
            org.apache.commons.net.nntp.a r1 = r1.j
            if (r1 == 0) goto L25
            t(r1, r2)
        L25:
            return
    }

    public static void v(org.apache.commons.net.nntp.a r1, java.io.PrintStream r2) {
            r0 = 0
            u(r1, r0, r2)
            return
    }

    public void A(java.lang.String r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void B(java.lang.String r1) {
            r0 = this;
            r0.b = r1
            return
    }

    @Override // org.apache.commons.net.nntp.o
    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    @Override // org.apache.commons.net.nntp.o
    public org.apache.commons.net.nntp.o b() {
            r1 = this;
            org.apache.commons.net.nntp.a r0 = new org.apache.commons.net.nntp.a
            r0.<init>()
            return r0
    }

    @Override // org.apache.commons.net.nntp.o
    public void c(org.apache.commons.net.nntp.o r1) {
            r0 = this;
            org.apache.commons.net.nntp.a r1 = (org.apache.commons.net.nntp.a) r1
            r0.j = r1
            r0.k()
            return
    }

    @Override // org.apache.commons.net.nntp.o
    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.e
            if (r0 != 0) goto L7
            r1.C()
        L7:
            java.lang.String r0 = r1.e
            return r0
    }

    @Override // org.apache.commons.net.nntp.o
    public boolean e() {
            r1 = this;
            boolean r0 = r1.h
            return r0
    }

    @Override // org.apache.commons.net.nntp.o
    public boolean f() {
            r5 = this;
            long r0 = r5.a
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // org.apache.commons.net.nntp.o
    public java.lang.String[] g() {
            r1 = this;
            java.lang.String[] r0 = r1.q()
            return r0
    }

    @Override // org.apache.commons.net.nntp.o
    public void h(org.apache.commons.net.nntp.o r1) {
            r0 = this;
            org.apache.commons.net.nntp.a r1 = (org.apache.commons.net.nntp.a) r1
            r0.i = r1
            r0.k()
            return
    }

    @java.lang.Deprecated
    public void i(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            return
    }

    public void j(java.lang.String r5) {
            r4 = this;
            if (r5 == 0) goto L2b
            int r0 = r5.length()
            if (r0 != 0) goto L9
            goto L2b
        L9:
            java.util.ArrayList<java.lang.String> r0 = r4.g
            if (r0 != 0) goto L14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.g = r0
        L14:
            r0 = 1
            r4.h = r0
            java.lang.String r0 = " "
            java.lang.String[] r5 = r5.split(r0)
            int r0 = r5.length
            r1 = 0
        L1f:
            if (r1 >= r0) goto L2b
            r2 = r5[r1]
            java.util.ArrayList<java.lang.String> r3 = r4.g
            r3.add(r2)
            int r1 = r1 + 1
            goto L1f
        L2b:
            return
    }

    public java.lang.String l() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    @java.lang.Deprecated
    public int m() {
            r2 = this;
            long r0 = r2.a
            int r1 = (int) r0
            return r1
    }

    public long n() {
            r2 = this;
            long r0 = r2.a
            return r0
    }

    public java.lang.String o() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public java.lang.String p() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }

    public java.lang.String[] q() {
            r2 = this;
            java.util.ArrayList<java.lang.String> r0 = r2.g
            if (r0 != 0) goto L8
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
        L8:
            int r1 = r0.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public java.lang.String r() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r2 = r3.d
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r3.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void w(java.lang.String r1) {
            r0 = this;
            r0.d = r1
            return
    }

    @java.lang.Deprecated
    public void x(int r3) {
            r2 = this;
            long r0 = (long) r3
            r2.a = r0
            return
    }

    public void y(long r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void z(java.lang.String r1) {
            r0 = this;
            r0.c = r1
            return
    }
}
