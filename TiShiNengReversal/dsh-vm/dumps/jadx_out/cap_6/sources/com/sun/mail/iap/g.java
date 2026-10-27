package com.sun.mail.iap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class g {
    private static final int g = 100;
    public static final int h = 3;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;
    public static final int l = 28;
    public static final int m = 4;
    public static final int n = 8;
    public static final int o = 12;
    public static final int p = 16;

    /* renamed from: q, reason: collision with root package name */
    public static final int f4q = 32;
    protected int a;
    protected int b;
    protected int c;
    protected byte[] d;
    protected int e;
    protected java.lang.String f;

    public g(com.sun.mail.iap.f r3) throws java.io.IOException, com.sun.mail.iap.ProtocolException {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.d = r0
            r1 = 0
            r2.e = r1
            r2.f = r0
            com.sun.mail.iap.d r0 = r3.f()
            com.sun.mail.iap.i r3 = r3.d()
            com.sun.mail.iap.d r3 = r3.b(r0)
            byte[] r0 = r3.a()
            r2.d = r0
            int r3 = r3.b()
            int r3 = r3 + (-2)
            r2.c = r3
            r2.l()
            return
    }

    public g(com.sun.mail.iap.g r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.d = r0
            r1 = 0
            r2.e = r1
            r2.f = r0
            int r0 = r3.a
            r2.a = r0
            int r0 = r3.c
            r2.c = r0
            byte[] r0 = r3.d
            r2.d = r0
            int r0 = r3.e
            r2.e = r0
            java.lang.String r3 = r3.f
            r2.f = r3
            return
    }

    public g(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.d = r0
            r1 = 0
            r2.e = r1
            r2.f = r0
            byte[] r3 = com.sun.mail.util.ASCIIUtility.getBytes(r3)
            r2.d = r3
            int r3 = r3.length
            r2.c = r3
            r2.l()
            return
    }

    public static com.sun.mail.iap.g a(java.lang.Exception r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "* BYE JavaMail Exception: "
            r0.<init>(r1)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r0 = 13
            r1 = 32
            java.lang.String r2 = r2.replace(r0, r1)
            r0 = 10
            java.lang.String r2 = r2.replace(r0, r1)
            com.sun.mail.iap.g r0 = new com.sun.mail.iap.g
            r0.<init>(r2)
            int r2 = r0.e
            r2 = r2 | r1
            r0.e = r2
            return r0
    }

    private void l() {
            r3 = this;
            r0 = 0
            r3.a = r0
            byte[] r1 = r3.d
            r0 = r1[r0]
            r1 = 43
            r2 = 1
            if (r0 != r1) goto L14
            int r0 = r3.e
            r0 = r0 | r2
            r3.e = r0
            r3.a = r2
            return
        L14:
            r1 = 42
            if (r0 != r1) goto L21
            int r0 = r3.e
            r0 = r0 | 3
            r3.e = r0
            r3.a = r2
            goto L2d
        L21:
            int r0 = r3.e
            r0 = r0 | 2
            r3.e = r0
            java.lang.String r0 = r3.o()
            r3.f = r0
        L2d:
            int r0 = r3.a
            java.lang.String r1 = r3.o()
            if (r1 != 0) goto L37
            java.lang.String r1 = ""
        L37:
            java.lang.String r2 = "OK"
            boolean r2 = r1.equalsIgnoreCase(r2)
            if (r2 == 0) goto L46
            int r0 = r3.e
            r0 = r0 | 4
            r3.e = r0
            goto L75
        L46:
            java.lang.String r2 = "NO"
            boolean r2 = r1.equalsIgnoreCase(r2)
            if (r2 == 0) goto L55
            int r0 = r3.e
            r0 = r0 | 8
            r3.e = r0
            goto L75
        L55:
            java.lang.String r2 = "BAD"
            boolean r2 = r1.equalsIgnoreCase(r2)
            if (r2 == 0) goto L64
            int r0 = r3.e
            r0 = r0 | 12
            r3.e = r0
            goto L75
        L64:
            java.lang.String r2 = "BYE"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L73
            int r0 = r3.e
            r0 = r0 | 16
            r3.e = r0
            goto L75
        L73:
            r3.a = r0
        L75:
            int r0 = r3.a
            r3.b = r0
            return
    }

    private java.lang.Object m(boolean r7, boolean r8) {
            r6 = this;
            r6.B()
            byte[] r0 = r6.d
            int r1 = r6.a
            r0 = r0[r1]
            r2 = 34
            if (r0 != r2) goto L43
            int r3 = r1 + 1
            r6.a = r3
            r7 = r3
        L12:
            byte[] r0 = r6.d
            int r1 = r6.a
            r4 = r0[r1]
            if (r4 != r2) goto L2c
            int r1 = r1 + 1
            r6.a = r1
            if (r8 == 0) goto L25
            java.lang.String r7 = com.sun.mail.util.ASCIIUtility.toString(r0, r3, r7)
            return r7
        L25:
            com.sun.mail.iap.d r8 = new com.sun.mail.iap.d
            int r7 = r7 - r3
            r8.<init>(r0, r3, r7)
            return r8
        L2c:
            r5 = 92
            if (r4 != r5) goto L34
            int r1 = r1 + 1
            r6.a = r1
        L34:
            int r1 = r6.a
            if (r1 == r7) goto L3c
            r4 = r0[r1]
            r0[r7] = r4
        L3c:
            int r7 = r7 + 1
            int r1 = r1 + 1
            r6.a = r1
            goto L12
        L43:
            r2 = 123(0x7b, float:1.72E-43)
            r3 = 0
            if (r0 != r2) goto L79
            int r2 = r1 + 1
            r6.a = r2
        L4c:
            byte[] r7 = r6.d
            int r0 = r6.a
            r1 = r7[r0]
            r4 = 125(0x7d, float:1.75E-43)
            if (r1 != r4) goto L74
            int r7 = com.sun.mail.util.ASCIIUtility.parseInt(r7, r2, r0)     // Catch: java.lang.NumberFormatException -> L73
            int r0 = r6.a
            int r0 = r0 + 3
            int r1 = r0 + r7
            r6.a = r1
            if (r8 == 0) goto L6b
            byte[] r7 = r6.d
            java.lang.String r7 = com.sun.mail.util.ASCIIUtility.toString(r7, r0, r1)
            return r7
        L6b:
            com.sun.mail.iap.d r8 = new com.sun.mail.iap.d
            byte[] r1 = r6.d
            r8.<init>(r1, r0, r7)
            return r8
        L73:
            return r3
        L74:
            int r0 = r0 + 1
            r6.a = r0
            goto L4c
        L79:
            if (r7 == 0) goto L8c
            java.lang.String r7 = r6.o()
            if (r8 == 0) goto L82
            return r7
        L82:
            com.sun.mail.iap.d r7 = new com.sun.mail.iap.d
            byte[] r8 = r6.d
            int r0 = r6.a
            r7.<init>(r8, r1, r0)
            return r7
        L8c:
            r7 = 78
            if (r0 == r7) goto L96
            r7 = 110(0x6e, float:1.54E-43)
            if (r0 != r7) goto L95
            goto L96
        L95:
            return r3
        L96:
            int r1 = r1 + 3
            r6.a = r1
            return r3
    }

    public void A(int r2) {
            r1 = this;
            int r0 = r1.a
            int r0 = r0 + r2
            r1.a = r0
            return
    }

    public void B() {
            r3 = this;
        L0:
            int r0 = r3.a
            int r1 = r3.c
            if (r0 >= r1) goto L14
            byte[] r1 = r3.d
            r1 = r1[r0]
            r2 = 32
            if (r1 == r2) goto Lf
            goto L14
        Lf:
            int r0 = r0 + 1
            r3.a = r0
            goto L0
        L14:
            return
    }

    public void C() {
            r3 = this;
        L0:
            int r0 = r3.a
            int r1 = r3.c
            if (r0 >= r1) goto L14
            byte[] r1 = r3.d
            r1 = r1[r0]
            r2 = 32
            if (r1 != r2) goto Lf
            goto L14
        Lf:
            int r0 = r0 + 1
            r3.a = r0
            goto L0
        L14:
            return
    }

    public java.lang.String b() {
            r3 = this;
            r3.B()
            byte[] r0 = r3.d
            int r1 = r3.a
            int r2 = r3.c
            java.lang.String r0 = com.sun.mail.util.ASCIIUtility.toString(r0, r1, r2)
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }

    public boolean d() {
            r2 = this;
            int r0 = r2.e
            r0 = r0 & 28
            r1 = 12
            if (r0 != r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public boolean e() {
            r2 = this;
            int r0 = r2.e
            r0 = r0 & 28
            r1 = 16
            if (r0 != r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public boolean f() {
            r2 = this;
            int r0 = r2.e
            r0 = r0 & 3
            r1 = 1
            if (r0 != r1) goto L8
            return r1
        L8:
            r0 = 0
            return r0
    }

    public boolean g() {
            r2 = this;
            int r0 = r2.e
            r0 = r0 & 28
            r1 = 8
            if (r0 != r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public int getType() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    public boolean h() {
            r2 = this;
            int r0 = r2.e
            r0 = r0 & 28
            r1 = 4
            if (r0 != r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean i() {
            r2 = this;
            int r0 = r2.e
            r1 = 32
            r0 = r0 & r1
            if (r0 != r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean j() {
            r2 = this;
            int r0 = r2.e
            r0 = r0 & 3
            r1 = 2
            if (r0 != r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean k() {
            r2 = this;
            int r0 = r2.e
            r1 = 3
            r0 = r0 & r1
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public byte n() {
            r2 = this;
            int r0 = r2.a
            int r1 = r2.c
            if (r0 >= r1) goto Lb
            byte[] r1 = r2.d
            r0 = r1[r0]
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public java.lang.String o() {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.p(r0)
            return r0
    }

    public java.lang.String p(char r5) {
            r4 = this;
            r4.B()
            int r0 = r4.a
            int r1 = r4.c
            if (r0 < r1) goto Lb
            r5 = 0
            return r5
        Lb:
            int r1 = r4.a
            int r2 = r4.c
            if (r1 >= r2) goto L3f
            byte[] r2 = r4.d
            r2 = r2[r1]
            r3 = 32
            if (r2 <= r3) goto L3f
            r3 = 40
            if (r2 == r3) goto L3f
            r3 = 41
            if (r2 == r3) goto L3f
            r3 = 37
            if (r2 == r3) goto L3f
            r3 = 42
            if (r2 == r3) goto L3f
            r3 = 34
            if (r2 == r3) goto L3f
            r3 = 92
            if (r2 == r3) goto L3f
            r3 = 127(0x7f, float:1.78E-43)
            if (r2 == r3) goto L3f
            if (r5 == 0) goto L3a
            if (r2 != r5) goto L3a
            goto L3f
        L3a:
            int r1 = r1 + 1
            r4.a = r1
            goto Lb
        L3f:
            byte[] r5 = r4.d
            java.lang.String r5 = com.sun.mail.util.ASCIIUtility.toString(r5, r0, r1)
            return r5
    }

    public java.lang.String q() {
            r1 = this;
            r0 = 1
            java.lang.Object r0 = r1.m(r0, r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public byte r() {
            r3 = this;
            int r0 = r3.a
            int r1 = r3.c
            if (r0 >= r1) goto Lf
            byte[] r1 = r3.d
            int r2 = r0 + 1
            r3.a = r2
            r0 = r1[r0]
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public com.sun.mail.iap.d s() {
            r4 = this;
            boolean r0 = r4.f()
            if (r0 == 0) goto L16
            r4.B()
            com.sun.mail.iap.d r0 = new com.sun.mail.iap.d
            byte[] r1 = r4.d
            int r2 = r4.a
            int r3 = r4.c
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L16:
            r0 = 0
            java.lang.Object r0 = r4.m(r0, r0)
            com.sun.mail.iap.d r0 = (com.sun.mail.iap.d) r0
            return r0
    }

    public java.io.ByteArrayInputStream t() {
            r1 = this;
            com.sun.mail.iap.d r0 = r1.s()
            if (r0 == 0) goto Lb
            java.io.ByteArrayInputStream r0 = r0.g()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            byte[] r0 = r3.d
            r1 = 0
            int r2 = r3.c
            java.lang.String r0 = com.sun.mail.util.ASCIIUtility.toString(r0, r1, r2)
            return r0
    }

    public long u() {
            r3 = this;
            r3.B()
            int r0 = r3.a
        L5:
            int r1 = r3.a
            int r2 = r3.c
            if (r1 >= r2) goto L1e
            byte[] r2 = r3.d
            r1 = r2[r1]
            char r1 = (char) r1
            boolean r1 = java.lang.Character.isDigit(r1)
            if (r1 != 0) goto L17
            goto L1e
        L17:
            int r1 = r3.a
            int r1 = r1 + 1
            r3.a = r1
            goto L5
        L1e:
            int r1 = r3.a
            if (r1 <= r0) goto L29
            byte[] r2 = r3.d     // Catch: java.lang.NumberFormatException -> L29
            long r0 = com.sun.mail.util.ASCIIUtility.parseLong(r2, r0, r1)     // Catch: java.lang.NumberFormatException -> L29
            return r0
        L29:
            r0 = -1
            return r0
    }

    public int v() {
            r3 = this;
            r3.B()
            int r0 = r3.a
        L5:
            int r1 = r3.a
            int r2 = r3.c
            if (r1 >= r2) goto L1e
            byte[] r2 = r3.d
            r1 = r2[r1]
            char r1 = (char) r1
            boolean r1 = java.lang.Character.isDigit(r1)
            if (r1 != 0) goto L17
            goto L1e
        L17:
            int r1 = r3.a
            int r1 = r1 + 1
            r3.a = r1
            goto L5
        L1e:
            int r1 = r3.a
            if (r1 <= r0) goto L29
            byte[] r2 = r3.d     // Catch: java.lang.NumberFormatException -> L29
            int r0 = com.sun.mail.util.ASCIIUtility.parseInt(r2, r0, r1)     // Catch: java.lang.NumberFormatException -> L29
            return r0
        L29:
            r0 = -1
            return r0
    }

    public java.lang.String w() {
            r2 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r0 = r2.m(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public java.lang.String x(char r4) {
            r3 = this;
            r3.B()
            int r0 = r3.a
            int r1 = r3.c
            if (r0 < r1) goto Lb
            r4 = 0
            return r4
        Lb:
            int r1 = r3.a
            int r2 = r3.c
            if (r1 >= r2) goto L1d
            byte[] r2 = r3.d
            r2 = r2[r1]
            if (r2 != r4) goto L18
            goto L1d
        L18:
            int r1 = r1 + 1
            r3.a = r1
            goto Lb
        L1d:
            byte[] r4 = r3.d
            java.lang.String r4 = com.sun.mail.util.ASCIIUtility.toString(r4, r0, r1)
            return r4
    }

    public java.lang.String[] y() {
            r5 = this;
            r5.B()
            byte[] r0 = r5.d
            int r1 = r5.a
            r0 = r0[r1]
            r2 = 40
            r3 = 0
            if (r0 == r2) goto Lf
            return r3
        Lf:
            int r1 = r1 + 1
            r5.a = r1
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
        L18:
            java.lang.String r1 = r5.w()
            r0.addElement(r1)
            byte[] r1 = r5.d
            int r2 = r5.a
            int r4 = r2 + 1
            r5.a = r4
            r1 = r1[r2]
            r2 = 41
            if (r1 != r2) goto L18
            int r1 = r0.size()
            if (r1 <= 0) goto L39
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.copyInto(r1)
            return r1
        L39:
            return r3
    }

    public void z() {
            r1 = this;
            int r0 = r1.b
            r1.a = r0
            return
    }
}
