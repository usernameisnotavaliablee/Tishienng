package com.hp.hpl.sparta;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class l implements com.hp.hpl.sparta.o {
    private static final char[] A = null;
    private static final char[] B = null;
    private static final char[] C = null;
    private static final char[] D = null;
    private static final char[] E = null;
    private static final char[] F = null;
    private static final char[] G = null;
    private static final char[] H = null;
    private static final char[] I = null;
    private static final char[] J = null;
    private static final char[] K = null;
    private static final char[] L = null;
    private static final char[] M = null;
    private static final char[] N = null;
    private static final char[] O = null;
    private static final char[] P = null;
    private static final char[] Q = null;
    private static final char[] R = null;
    private static final int S = 255;
    public static final int T = 100;
    private static final boolean u = true;
    private static final boolean v = false;
    private static final char[] w = null;
    private static final int x = 128;
    private static final boolean[] y = null;
    private static final char[] z = null;
    private java.lang.String c;
    private java.lang.String d;
    private final java.io.Reader e;
    private final java.util.Hashtable f;
    private final java.util.Hashtable g;
    private final com.hp.hpl.sparta.n h;
    private final java.lang.String i;
    private int j;
    private boolean k;
    private final int l;
    private final char[] m;
    private int n;
    private int o;
    private boolean p;
    private final char[] q;
    private int r;
    private final com.hp.hpl.sparta.b s;
    private final com.hp.hpl.sparta.m t;

    static {
            r0 = 4
            char[] r1 = new char[r0]
            r1 = {x00b6: FILL_ARRAY_DATA , data: [46, 45, 95, 58} // fill-array
            com.hp.hpl.sparta.l.w = r1
            r1 = 128(0x80, float:1.8E-43)
            boolean[] r2 = new boolean[r1]
            com.hp.hpl.sparta.l.y = r2
            r2 = 0
        Lf:
            if (r2 >= r1) goto L1d
            boolean[] r3 = com.hp.hpl.sparta.l.y
            boolean r4 = x(r2)
            r3[r2] = r4
            int r2 = r2 + 1
            char r2 = (char) r2
            goto Lf
        L1d:
            java.lang.String r1 = "<!--"
            char[] r1 = r1.toCharArray()
            com.hp.hpl.sparta.l.z = r1
            java.lang.String r1 = "-->"
            char[] r1 = r1.toCharArray()
            com.hp.hpl.sparta.l.A = r1
            java.lang.String r1 = "<?"
            char[] r1 = r1.toCharArray()
            com.hp.hpl.sparta.l.B = r1
            java.lang.String r1 = "?>"
            char[] r1 = r1.toCharArray()
            com.hp.hpl.sparta.l.C = r1
            java.lang.String r1 = "<!DOCTYPE"
            char[] r1 = r1.toCharArray()
            com.hp.hpl.sparta.l.D = r1
            java.lang.String r1 = "<?xml"
            char[] r1 = r1.toCharArray()
            com.hp.hpl.sparta.l.E = r1
            java.lang.String r1 = "encoding"
            char[] r1 = r1.toCharArray()
            com.hp.hpl.sparta.l.F = r1
            java.lang.String r1 = "version"
            char[] r1 = r1.toCharArray()
            com.hp.hpl.sparta.l.G = r1
            char[] r0 = new char[r0]
            r0 = {x00be: FILL_ARRAY_DATA , data: [95, 46, 58, 45} // fill-array
            com.hp.hpl.sparta.l.H = r0
            java.lang.String r0 = "<!"
            char[] r0 = r0.toCharArray()
            com.hp.hpl.sparta.l.I = r0
            java.lang.String r0 = "&#"
            char[] r0 = r0.toCharArray()
            com.hp.hpl.sparta.l.J = r0
            java.lang.String r0 = "<!ENTITY"
            char[] r0 = r0.toCharArray()
            com.hp.hpl.sparta.l.K = r0
            java.lang.String r0 = "NDATA"
            char[] r0 = r0.toCharArray()
            com.hp.hpl.sparta.l.L = r0
            java.lang.String r0 = "SYSTEM"
            char[] r0 = r0.toCharArray()
            com.hp.hpl.sparta.l.M = r0
            java.lang.String r0 = "PUBLIC"
            char[] r0 = r0.toCharArray()
            com.hp.hpl.sparta.l.N = r0
            java.lang.String r0 = "<![CDATA["
            char[] r0 = r0.toCharArray()
            com.hp.hpl.sparta.l.O = r0
            java.lang.String r0 = "]]>"
            char[] r0 = r0.toCharArray()
            com.hp.hpl.sparta.l.P = r0
            java.lang.String r0 = "/>"
            char[] r0 = r0.toCharArray()
            com.hp.hpl.sparta.l.Q = r0
            java.lang.String r0 = "</"
            char[] r0 = r0.toCharArray()
            com.hp.hpl.sparta.l.R = r0
            return
    }

    public l(java.lang.String r8, java.io.Reader r9, com.hp.hpl.sparta.n r10, java.lang.String r11, com.hp.hpl.sparta.m r12) throws com.hp.hpl.sparta.ParseException, com.hp.hpl.sparta.EncodingMismatchException, java.io.IOException {
            r7 = this;
            r3 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public l(java.lang.String r7, java.io.Reader r8, char[] r9, com.hp.hpl.sparta.n r10, java.lang.String r11, com.hp.hpl.sparta.m r12) throws com.hp.hpl.sparta.ParseException, com.hp.hpl.sparta.EncodingMismatchException, java.io.IOException {
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.d = r0
            java.util.Hashtable r1 = new java.util.Hashtable
            r1.<init>()
            r6.f = r1
            java.util.Hashtable r2 = new java.util.Hashtable
            r2.<init>()
            r6.g = r2
            r2 = -2
            r6.j = r2
            r2 = 0
            r6.k = r2
            r3 = 1024(0x400, float:1.435E-42)
            r6.l = r3
            r6.n = r2
            r6.o = r2
            r6.p = r2
            r4 = 255(0xff, float:3.57E-43)
            char[] r4 = new char[r4]
            r6.q = r4
            r4 = 1
            r6.r = r4
            r6.s = r0
            if (r10 != 0) goto L33
            com.hp.hpl.sparta.n r10 = com.hp.hpl.sparta.o.a
        L33:
            r6.h = r10
            if (r11 != 0) goto L39
            r11 = r0
            goto L3d
        L39:
            java.lang.String r11 = r11.toLowerCase()
        L3d:
            r6.i = r11
            java.lang.String r11 = "lt"
            java.lang.String r5 = "<"
            r1.put(r11, r5)
            java.lang.String r11 = "gt"
            java.lang.String r5 = ">"
            r1.put(r11, r5)
            java.lang.String r11 = "amp"
            java.lang.String r5 = "&"
            r1.put(r11, r5)
            java.lang.String r11 = "apos"
            java.lang.String r5 = "'"
            r1.put(r11, r5)
            java.lang.String r11 = "quot"
            java.lang.String r5 = "\""
            r1.put(r11, r5)
            if (r9 == 0) goto L70
            r6.m = r9
            r6.n = r2
            int r8 = r9.length
            r6.o = r8
            r6.p = r4
            r6.e = r0
            goto L79
        L70:
            r6.e = r8
            char[] r8 = new char[r3]
            r6.m = r8
            r6.a()
        L79:
            r6.c = r7
            r6.t = r12
            r12.c(r6)
            r6.i0()
            r12.startDocument()
            com.hp.hpl.sparta.g r7 = r6.T()
            java.lang.String r8 = r6.d
            if (r8 == 0) goto Lc5
            java.lang.String r9 = r7.H()
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto Lc5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "DOCTYPE name \""
            r8.append(r9)
            java.lang.String r9 = r6.d
            r8.append(r9)
            java.lang.String r9 = "\" not same as tag name, \""
            r8.append(r9)
            java.lang.String r7 = r7.H()
            r8.append(r7)
            java.lang.String r7 = "\" of root element"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = r6.c
            int r9 = r6.getLineNumber()
            r10.b(r7, r8, r9)
        Lc5:
            boolean r7 = r6.v()
            if (r7 == 0) goto Lcf
            r6.c0()
            goto Lc5
        Lcf:
            java.io.Reader r7 = r6.e
            if (r7 == 0) goto Ld6
            r7.close()
        Ld6:
            com.hp.hpl.sparta.m r7 = r6.t
            r7.endDocument()
            return
    }

    public l(java.lang.String r8, char[] r9, com.hp.hpl.sparta.n r10, java.lang.String r11, com.hp.hpl.sparta.m r12) throws com.hp.hpl.sparta.ParseException, com.hp.hpl.sparta.EncodingMismatchException, java.io.IOException {
            r7 = this;
            r2 = 0
            r0 = r7
            r1 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    private final boolean A() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r1 = this;
            r0 = 38
            boolean r0 = r1.h(r0)
            return r0
    }

    private final boolean B() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r4 = this;
            r0 = 13
            r1 = 10
            r2 = 32
            r3 = 9
            boolean r0 = r4.j(r2, r3, r0, r1)
            return r0
    }

    private final boolean C(char[] r6) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r5 = this;
            int r0 = r6.length
            int r1 = r5.o
            int r2 = r5.n
            int r1 = r1 - r2
            r2 = 0
            if (r1 >= r0) goto L13
            int r1 = r5.c(r0)
            if (r1 > 0) goto L13
            r6 = -1
            r5.j = r6
            return r2
        L13:
            char[] r1 = r5.m
            int r3 = r5.o
            int r4 = r3 + (-1)
            char r1 = r1[r4]
            r5.j = r1
            int r1 = r5.n
            int r3 = r3 - r1
            if (r3 >= r0) goto L23
            return r2
        L23:
            r1 = 0
        L24:
            if (r1 >= r0) goto L35
            char[] r3 = r5.m
            int r4 = r5.n
            int r4 = r4 + r1
            char r3 = r3[r4]
            char r4 = r6[r1]
            if (r3 == r4) goto L32
            return r2
        L32:
            int r1 = r1 + 1
            goto L24
        L35:
            r6 = 1
            return r6
    }

    private boolean D() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r2 = this;
            char r0 = r2.F()
            boolean r1 = java.lang.Character.isDigit(r0)
            if (r1 != 0) goto L23
            r1 = 97
            if (r1 > r0) goto L12
            r1 = 122(0x7a, float:1.71E-43)
            if (r0 <= r1) goto L23
        L12:
            r1 = 90
            if (r1 > r0) goto L18
            if (r0 <= r1) goto L23
        L18:
            char[] r1 = com.hp.hpl.sparta.l.H
            boolean r0 = t(r0, r1)
            if (r0 == 0) goto L21
            goto L23
        L21:
            r0 = 0
            return r0
        L23:
            r0 = 1
            return r0
    }

    private boolean E() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r1 = this;
            char[] r0 = com.hp.hpl.sparta.l.E
            boolean r0 = r1.C(r0)
            return r0
    }

    private final char F() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r2 = this;
            int r0 = r2.n
            int r1 = r2.o
            if (r0 < r1) goto L16
            int r0 = r2.a()
            r1 = -1
            if (r0 == r1) goto Le
            goto L16
        Le:
            com.hp.hpl.sparta.ParseException r0 = new com.hp.hpl.sparta.ParseException
            java.lang.String r1 = "unexpected end of expression."
            r0.<init>(r2, r1)
            throw r0
        L16:
            char[] r0 = r2.m
            int r1 = r2.n
            char r0 = r0[r1]
            return r0
    }

    private java.lang.String G() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r3 = this;
            r0 = 39
            r1 = 34
            char r0 = r3.K(r0, r1)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
        Ld:
            boolean r2 = r3.h(r0)
            if (r2 != 0) goto L29
            boolean r2 = r3.A()
            if (r2 == 0) goto L21
            char[] r2 = r3.k0()
            r1.append(r2)
            goto Ld
        L21:
            char r2 = r3.J()
            r1.append(r2)
            goto Ld
        L29:
            r3.M(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    private void H(com.hp.hpl.sparta.g r7) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r6 = this;
            java.lang.String r0 = r6.d0()
            r6.Z()
            java.lang.String r1 = r6.G()
            java.lang.String r2 = r7.D(r0)
            if (r2 == 0) goto L3a
            com.hp.hpl.sparta.n r2 = r6.h
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Element "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " contains attribute "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = "more than once"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r6.c
            int r5 = r6.getLineNumber()
            r2.b(r3, r4, r5)
        L3a:
            r7.O(r0, r1)
            return
    }

    private void I() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r6 = this;
            char[] r0 = com.hp.hpl.sparta.l.O
            r6.m0(r0)
            r0 = 0
            r1 = 0
            r2 = 0
        L8:
            char[] r3 = com.hp.hpl.sparta.l.P
            boolean r4 = r6.C(r3)
            if (r4 != 0) goto L33
            r3 = 255(0xff, float:3.57E-43)
            if (r2 < r3) goto L27
            if (r0 != 0) goto L21
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>(r2)
            char[] r3 = r6.q
            r0.append(r3, r1, r2)
            goto L26
        L21:
            char[] r3 = r6.q
            r0.append(r3, r1, r2)
        L26:
            r2 = 0
        L27:
            char[] r3 = r6.q
            int r4 = r2 + 1
            char r5 = r6.J()
            r3[r2] = r5
            r2 = r4
            goto L8
        L33:
            r6.m0(r3)
            if (r0 == 0) goto L4c
            char[] r3 = r6.q
            r0.append(r3, r1, r2)
            java.lang.String r0 = r0.toString()
            char[] r0 = r0.toCharArray()
            com.hp.hpl.sparta.m r2 = r6.t
            int r3 = r0.length
            r2.characters(r0, r1, r3)
            return
        L4c:
            com.hp.hpl.sparta.m r0 = r6.t
            char[] r3 = r6.q
            r0.characters(r3, r1, r2)
            return
    }

    private final char J() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r3 = this;
            int r0 = r3.n
            int r1 = r3.o
            if (r0 < r1) goto L16
            int r0 = r3.a()
            r1 = -1
            if (r0 == r1) goto Le
            goto L16
        Le:
            com.hp.hpl.sparta.ParseException r0 = new com.hp.hpl.sparta.ParseException
            java.lang.String r1 = "unexpected end of expression."
            r0.<init>(r3, r1)
            throw r0
        L16:
            char[] r0 = r3.m
            int r1 = r3.n
            char r0 = r0[r1]
            r2 = 10
            if (r0 != r2) goto L26
            int r2 = r3.r
            int r2 = r2 + 1
            r3.r = r2
        L26:
            int r1 = r1 + 1
            r3.n = r1
            return r0
    }

    private final char K(char r5, char r6) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r4 = this;
            char r0 = r4.J()
            if (r0 == r5) goto L18
            if (r0 != r6) goto L9
            goto L18
        L9:
            com.hp.hpl.sparta.ParseException r1 = new com.hp.hpl.sparta.ParseException
            r2 = 2
            char[] r2 = new char[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r6
            r1.<init>(r4, r0, r2)
            throw r1
        L18:
            return r0
    }

    private final char L(char r5, char r6, char r7, char r8) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r4 = this;
            char r0 = r4.J()
            if (r0 == r5) goto L22
            if (r0 == r6) goto L22
            if (r0 == r7) goto L22
            if (r0 != r8) goto Ld
            goto L22
        Ld:
            com.hp.hpl.sparta.ParseException r1 = new com.hp.hpl.sparta.ParseException
            r2 = 4
            char[] r2 = new char[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r6
            r5 = 2
            r2[r5] = r7
            r5 = 3
            r2[r5] = r8
            r1.<init>(r4, r0, r2)
            throw r1
        L22:
            return r0
    }

    private final void M(char r3) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r2 = this;
            char r0 = r2.J()
            if (r0 != r3) goto L7
            return
        L7:
            com.hp.hpl.sparta.ParseException r1 = new com.hp.hpl.sparta.ParseException
            r1.<init>(r2, r0, r3)
            throw r1
    }

    private char N() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r8 = this;
            char[] r0 = com.hp.hpl.sparta.l.J
            r8.m0(r0)
            r0 = 120(0x78, float:1.68E-43)
            boolean r0 = r8.h(r0)
            r1 = 16
            if (r0 == 0) goto L15
            r8.J()
            r0 = 16
            goto L17
        L15:
            r0 = 10
        L17:
            r2 = 0
            r3 = 0
        L19:
            r4 = 59
            boolean r5 = r8.h(r4)
            r6 = 32
            if (r5 != 0) goto L41
            char[] r4 = r8.q
            int r5 = r3 + 1
            char r7 = r8.J()
            r4[r3] = r7
            r3 = 255(0xff, float:3.57E-43)
            if (r5 < r3) goto L3f
            com.hp.hpl.sparta.n r0 = r8.h
            java.lang.String r1 = r8.c
            int r2 = r8.getLineNumber()
            java.lang.String r3 = "Tmp buffer overflow on readCharRef"
            r0.b(r3, r1, r2)
            return r6
        L3f:
            r3 = r5
            goto L19
        L41:
            r8.M(r4)
            java.lang.String r4 = new java.lang.String
            char[] r5 = r8.q
            r4.<init>(r5, r2, r3)
            int r0 = java.lang.Integer.parseInt(r4, r0)     // Catch: java.lang.NumberFormatException -> L51
            char r0 = (char) r0
            return r0
        L51:
            com.hp.hpl.sparta.n r2 = r8.h
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "\""
            r3.append(r5)
            r3.append(r4)
            java.lang.String r4 = "\" is not a valid "
            r3.append(r4)
            if (r0 != r1) goto L6a
            java.lang.String r0 = "hexadecimal"
            goto L6c
        L6a:
            java.lang.String r0 = "decimal"
        L6c:
            r3.append(r0)
            java.lang.String r0 = " number"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = r8.c
            int r3 = r8.getLineNumber()
            r2.b(r0, r1, r3)
            return r6
    }

    private final void O() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r2 = this;
            char[] r0 = com.hp.hpl.sparta.l.z
            r2.m0(r0)
        L5:
            char[] r0 = com.hp.hpl.sparta.l.A
            boolean r1 = r2.C(r0)
            if (r1 != 0) goto L11
            r2.J()
            goto L5
        L11:
            r2.m0(r0)
            return
    }

    private void P() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r5 = this;
            r5.h0()
            r0 = 1
        L4:
            if (r0 == 0) goto L4d
            boolean r1 = r5.n()
            r2 = 0
            if (r1 == 0) goto Lf
        Ld:
            r0 = 0
            goto L49
        Lf:
            boolean r1 = r5.A()
            if (r1 == 0) goto L20
            char[] r1 = r5.k0()
            com.hp.hpl.sparta.m r3 = r5.t
            int r4 = r1.length
            r3.characters(r1, r2, r4)
            goto L49
        L20:
            boolean r1 = r5.g()
            if (r1 == 0) goto L2a
            r5.I()
            goto L49
        L2a:
            boolean r1 = r5.z()
            if (r1 == 0) goto L34
            r5.g0()
            goto L49
        L34:
            boolean r1 = r5.k()
            if (r1 == 0) goto L3e
            r5.O()
            goto L49
        L3e:
            r1 = 60
            boolean r1 = r5.h(r1)
            if (r1 == 0) goto Ld
            r5.T()
        L49:
            r5.h0()
            goto L4
        L4d:
            return
    }

    private void Q() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r1 = this;
            boolean r0 = r1.y()
            if (r0 == 0) goto La
            r1.f0()
            return
        La:
            r1.l0()
            return
    }

    private void R() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r3 = this;
            char[] r0 = com.hp.hpl.sparta.l.D
            r3.m0(r0)
            r3.l0()
            java.lang.String r0 = r3.d0()
            r3.d = r0
            boolean r0 = r3.B()
            r1 = 91
            r2 = 62
            if (r0 == 0) goto L36
            r3.l0()
            boolean r0 = r3.h(r2)
            if (r0 != 0) goto L36
            boolean r0 = r3.h(r1)
            if (r0 != 0) goto L36
            r0 = 1
            r3.k = r0
            r3.a0()
            boolean r0 = r3.B()
            if (r0 == 0) goto L36
            r3.l0()
        L36:
            boolean r0 = r3.h(r1)
            if (r0 == 0) goto L61
            r3.J()
        L3f:
            r0 = 93
            boolean r1 = r3.h(r0)
            if (r1 != 0) goto L55
            boolean r0 = r3.l()
            if (r0 == 0) goto L51
            r3.Q()
            goto L3f
        L51:
            r3.b0()
            goto L3f
        L55:
            r3.M(r0)
            boolean r0 = r3.B()
            if (r0 == 0) goto L61
            r3.l0()
        L61:
            r3.M(r2)
            return
    }

    private void S(com.hp.hpl.sparta.g r5) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r4 = this;
            char[] r0 = com.hp.hpl.sparta.l.R
            r4.m0(r0)
            java.lang.String r0 = r4.d0()
            java.lang.String r1 = r5.H()
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L40
            com.hp.hpl.sparta.n r1 = r4.h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "end tag ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") does not match begin tag ("
            r2.append(r0)
            java.lang.String r5 = r5.H()
            r2.append(r5)
            java.lang.String r5 = ")"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            java.lang.String r0 = r4.c
            int r2 = r4.getLineNumber()
            r1.b(r5, r0, r2)
        L40:
            boolean r5 = r4.B()
            if (r5 == 0) goto L49
            r4.l0()
        L49:
            r5 = 62
            r4.M(r5)
            return
    }

    private final com.hp.hpl.sparta.g T() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r3 = this;
            com.hp.hpl.sparta.g r0 = new com.hp.hpl.sparta.g
            r0.<init>()
            boolean r1 = r3.U(r0)
            com.hp.hpl.sparta.m r2 = r3.t
            r2.e(r0)
            if (r1 == 0) goto L16
            r3.P()
            r3.S(r0)
        L16:
            com.hp.hpl.sparta.m r1 = r3.t
            r1.a(r0)
            return r0
    }

    private boolean U(com.hp.hpl.sparta.g r3) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r2 = this;
            r0 = 60
            r2.M(r0)
            java.lang.String r0 = r2.d0()
            r3.P(r0)
        Lc:
            boolean r0 = r2.B()
            r1 = 62
            if (r0 == 0) goto L23
            r2.l0()
            r0 = 47
            boolean r0 = r2.i(r0, r1)
            if (r0 != 0) goto Lc
            r2.H(r3)
            goto Lc
        L23:
            boolean r3 = r2.B()
            if (r3 == 0) goto L2c
            r2.l0()
        L2c:
            boolean r3 = r2.h(r1)
            if (r3 == 0) goto L36
            r2.M(r1)
            return r3
        L36:
            char[] r0 = com.hp.hpl.sparta.l.Q
            r2.m0(r0)
            return r3
    }

    private java.lang.String V() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r3 = this;
            char[] r0 = com.hp.hpl.sparta.l.F
            r3.m0(r0)
            r3.Z()
            r0 = 39
            r1 = 34
            char r0 = r3.K(r0, r1)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
        L15:
            boolean r2 = r3.h(r0)
            if (r2 != 0) goto L23
            char r2 = r3.J()
            r1.append(r2)
            goto L15
        L23:
            r3.M(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    private void W() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r4 = this;
            char[] r0 = com.hp.hpl.sparta.l.K
            r4.m0(r0)
            r4.l0()
            r0 = 37
            boolean r1 = r4.h(r0)
            if (r1 == 0) goto L32
            r4.M(r0)
            r4.l0()
            java.lang.String r0 = r4.d0()
            r4.l0()
            boolean r1 = r4.q()
            if (r1 == 0) goto L28
            java.lang.String r1 = r4.Y()
            goto L2c
        L28:
            java.lang.String r1 = r4.a0()
        L2c:
            java.util.Hashtable r2 = r4.g
            r2.put(r0, r1)
            goto L6d
        L32:
            java.lang.String r0 = r4.d0()
            r4.l0()
            boolean r1 = r4.q()
            if (r1 == 0) goto L44
            java.lang.String r1 = r4.Y()
            goto L68
        L44:
            boolean r1 = r4.s()
            if (r1 == 0) goto L7c
            java.lang.String r1 = r4.a0()
            boolean r2 = r4.B()
            if (r2 == 0) goto L57
            r4.l0()
        L57:
            char[] r2 = com.hp.hpl.sparta.l.L
            boolean r3 = r4.C(r2)
            if (r3 == 0) goto L68
            r4.m0(r2)
            r4.l0()
            r4.d0()
        L68:
            java.util.Hashtable r2 = r4.f
            r2.put(r0, r1)
        L6d:
            boolean r0 = r4.B()
            if (r0 == 0) goto L76
            r4.l0()
        L76:
            r0 = 62
            r4.M(r0)
            return
        L7c:
            com.hp.hpl.sparta.ParseException r0 = new com.hp.hpl.sparta.ParseException
            java.lang.String r1 = "expecting double-quote, \"PUBLIC\" or \"SYSTEM\" while reading entity declaration"
            r0.<init>(r4, r1)
            throw r0
    }

    private java.lang.String X() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r4 = this;
            r0 = 38
            r4.M(r0)
            java.lang.String r0 = r4.d0()
            java.util.Hashtable r1 = r4.f
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L5c
            boolean r1 = r4.k
            if (r1 == 0) goto L39
            com.hp.hpl.sparta.n r1 = r4.h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "&"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "; not found -- possibly defined in external DTD)"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = r4.c
            int r3 = r4.getLineNumber()
            r1.b(r0, r2, r3)
            goto L5a
        L39:
            com.hp.hpl.sparta.n r1 = r4.h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No declaration of &"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ";"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = r4.c
            int r3 = r4.getLineNumber()
            r1.b(r0, r2, r3)
        L5a:
            java.lang.String r1 = ""
        L5c:
            r0 = 59
            r4.M(r0)
            return r1
    }

    private final java.lang.String Y() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r3 = this;
            r0 = 39
            r1 = 34
            char r0 = r3.K(r0, r1)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
        Ld:
            boolean r2 = r3.h(r0)
            if (r2 != 0) goto L37
            boolean r2 = r3.y()
            if (r2 == 0) goto L21
            java.lang.String r2 = r3.f0()
            r1.append(r2)
            goto Ld
        L21:
            boolean r2 = r3.A()
            if (r2 == 0) goto L2f
            char[] r2 = r3.k0()
            r1.append(r2)
            goto Ld
        L2f:
            char r2 = r3.J()
            r1.append(r2)
            goto Ld
        L37:
            r3.M(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    private final void Z() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r1 = this;
            boolean r0 = r1.B()
            if (r0 == 0) goto L9
            r1.l0()
        L9:
            r0 = 61
            r1.M(r0)
            boolean r0 = r1.B()
            if (r0 == 0) goto L17
            r1.l0()
        L17:
            return
    }

    private int a() throws java.io.IOException {
            r5 = this;
            boolean r0 = r5.p
            r1 = -1
            if (r0 == 0) goto L6
            return r1
        L6:
            int r0 = r5.o
            char[] r2 = r5.m
            int r3 = r2.length
            if (r0 != r3) goto L12
            r0 = 0
            r5.o = r0
            r5.n = r0
        L12:
            java.io.Reader r0 = r5.e
            int r3 = r5.o
            int r4 = r2.length
            int r4 = r4 - r3
            int r0 = r0.read(r2, r3, r4)
            if (r0 > 0) goto L22
            r0 = 1
            r5.p = r0
            return r1
        L22:
            int r1 = r5.o
            int r1 = r1 + r0
            r5.o = r1
            return r0
    }

    private java.lang.String a0() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r2 = this;
            char[] r0 = com.hp.hpl.sparta.l.M
            boolean r1 = r2.C(r0)
            if (r1 == 0) goto Lc
            r2.m0(r0)
            goto L1d
        Lc:
            char[] r0 = com.hp.hpl.sparta.l.N
            boolean r1 = r2.C(r0)
            if (r1 == 0) goto L26
            r2.m0(r0)
            r2.l0()
            r2.j0()
        L1d:
            r2.l0()
            r2.n0()
            java.lang.String r0 = "(WARNING: external ID not read)"
            return r0
        L26:
            com.hp.hpl.sparta.ParseException r0 = new com.hp.hpl.sparta.ParseException
            java.lang.String r1 = "expecting \"SYSTEM\" or \"PUBLIC\" while reading external ID"
            r0.<init>(r2, r1)
            throw r0
    }

    private void b0() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r2 = this;
            boolean r0 = r2.z()
            if (r0 == 0) goto La
            r2.g0()
            return
        La:
            boolean r0 = r2.k()
            if (r0 == 0) goto L14
            r2.O()
            return
        L14:
            boolean r0 = r2.p()
            if (r0 == 0) goto L1e
            r2.W()
            return
        L1e:
            char[] r0 = com.hp.hpl.sparta.l.I
            boolean r0 = r2.C(r0)
            if (r0 == 0) goto L52
        L26:
            r0 = 62
            boolean r1 = r2.h(r0)
            if (r1 != 0) goto L4e
            r0 = 39
            r1 = 34
            boolean r0 = r2.i(r0, r1)
            if (r0 == 0) goto L4a
            char r0 = r2.J()
        L3c:
            boolean r1 = r2.h(r0)
            if (r1 != 0) goto L46
            r2.J()
            goto L3c
        L46:
            r2.M(r0)
            goto L26
        L4a:
            r2.J()
            goto L26
        L4e:
            r2.M(r0)
            return
        L52:
            com.hp.hpl.sparta.ParseException r0 = new com.hp.hpl.sparta.ParseException
            java.lang.String r1 = "expecting processing instruction, comment, or \"<!\""
            r0.<init>(r2, r1)
            throw r0
    }

    private int c(int r6) throws java.io.IOException {
            r5 = this;
            boolean r0 = r5.p
            r1 = -1
            if (r0 == 0) goto L6
            return r1
        L6:
            char[] r0 = r5.m
            int r0 = r0.length
            int r2 = r5.n
            int r0 = r0 - r2
            r2 = 0
            if (r0 >= r6) goto L28
            r6 = 0
        L10:
            int r0 = r5.n
            int r3 = r0 + r6
            int r4 = r5.o
            if (r3 >= r4) goto L22
            char[] r3 = r5.m
            int r0 = r0 + r6
            char r0 = r3[r0]
            r3[r6] = r0
            int r6 = r6 + 1
            goto L10
        L22:
            int r4 = r4 - r0
            r5.o = r4
            r5.n = r2
            r2 = r4
        L28:
            int r6 = r5.a()
            if (r6 != r1) goto L32
            if (r2 != 0) goto L31
            return r1
        L31:
            return r2
        L32:
            int r2 = r2 + r6
            return r2
    }

    private void c0() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r2 = this;
            boolean r0 = r2.k()
            if (r0 == 0) goto La
            r2.O()
            return
        La:
            boolean r0 = r2.z()
            if (r0 == 0) goto L14
            r2.g0()
            return
        L14:
            boolean r0 = r2.B()
            if (r0 == 0) goto L1e
            r2.l0()
            return
        L1e:
            com.hp.hpl.sparta.ParseException r0 = new com.hp.hpl.sparta.ParseException
            java.lang.String r1 = "expecting comment or processing instruction or space"
            r0.<init>(r2, r1)
            throw r0
    }

    private final java.lang.String d0() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r6 = this;
            char[] r0 = r6.q
            char r1 = r6.e0()
            r2 = 0
            r0[r2] = r1
            r0 = 0
            r1 = 1
        Lb:
            boolean r3 = r6.w()
            if (r3 == 0) goto L34
            r3 = 255(0xff, float:3.57E-43)
            if (r1 < r3) goto L28
            if (r0 != 0) goto L22
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>(r1)
            char[] r3 = r6.q
            r0.append(r3, r2, r1)
            goto L27
        L22:
            char[] r3 = r6.q
            r0.append(r3, r2, r1)
        L27:
            r1 = 0
        L28:
            char[] r3 = r6.q
            int r4 = r1 + 1
            char r5 = r6.J()
            r3[r1] = r5
            r1 = r4
            goto Lb
        L34:
            if (r0 != 0) goto L42
            java.lang.String r0 = new java.lang.String
            char[] r3 = r6.q
            r0.<init>(r3, r2, r1)
            java.lang.String r0 = com.hp.hpl.sparta.q.a(r0)
            return r0
        L42:
            char[] r3 = r6.q
            r0.append(r3, r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private char e0() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r3 = this;
            char r0 = r3.J()
            boolean r1 = u(r0)
            if (r1 != 0) goto L1b
            r1 = 95
            if (r0 == r1) goto L1b
            r1 = 58
            if (r0 != r1) goto L13
            goto L1b
        L13:
            com.hp.hpl.sparta.ParseException r1 = new com.hp.hpl.sparta.ParseException
            java.lang.String r2 = "letter, underscore, colon"
            r1.<init>(r3, r0, r2)
            throw r1
        L1b:
            return r0
    }

    private java.lang.String f0() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r4 = this;
            r0 = 37
            r4.M(r0)
            java.lang.String r0 = r4.d0()
            java.util.Hashtable r1 = r4.g
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L36
            com.hp.hpl.sparta.n r1 = r4.h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No declaration of %"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ";"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = r4.c
            int r3 = r4.getLineNumber()
            r1.b(r0, r2, r3)
            java.lang.String r1 = ""
        L36:
            r0 = 59
            r4.M(r0)
            return r1
    }

    private boolean g() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r1 = this;
            char[] r0 = com.hp.hpl.sparta.l.O
            boolean r0 = r1.C(r0)
            return r0
    }

    private final void g0() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r2 = this;
            char[] r0 = com.hp.hpl.sparta.l.B
            r2.m0(r0)
        L5:
            char[] r0 = com.hp.hpl.sparta.l.C
            boolean r1 = r2.C(r0)
            if (r1 != 0) goto L11
            r2.J()
            goto L5
        L11:
            r2.m0(r0)
            return
    }

    private final boolean h(char r3) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r2 = this;
            int r0 = r2.n
            int r1 = r2.o
            if (r0 < r1) goto L16
            int r0 = r2.a()
            r1 = -1
            if (r0 == r1) goto Le
            goto L16
        Le:
            com.hp.hpl.sparta.ParseException r3 = new com.hp.hpl.sparta.ParseException
            java.lang.String r0 = "unexpected end of expression."
            r3.<init>(r2, r0)
            throw r3
        L16:
            char[] r0 = r2.m
            int r1 = r2.n
            char r0 = r0[r1]
            if (r0 != r3) goto L20
            r3 = 1
            return r3
        L20:
            r3 = 0
            return r3
    }

    private void h0() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r4 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            r2 = 60
            boolean r2 = r4.h(r2)
            if (r2 != 0) goto L48
            r2 = 38
            boolean r2 = r4.h(r2)
            if (r2 != 0) goto L48
            char[] r2 = com.hp.hpl.sparta.l.P
            boolean r2 = r4.C(r2)
            if (r2 != 0) goto L48
            char[] r2 = r4.q
            char r3 = r4.J()
            r2[r1] = r3
            char[] r2 = r4.q
            char r2 = r2[r1]
            r3 = 13
            if (r2 != r3) goto L3a
            char r2 = r4.F()
            r3 = 10
            if (r2 != r3) goto L3a
            char[] r2 = r4.q
            char r3 = r4.J()
            r2[r1] = r3
        L3a:
            int r1 = r1 + 1
            r2 = 255(0xff, float:3.57E-43)
            if (r1 != r2) goto L2
            com.hp.hpl.sparta.m r1 = r4.t
            char[] r3 = r4.q
            r1.characters(r3, r0, r2)
            goto L1
        L48:
            if (r1 <= 0) goto L51
            com.hp.hpl.sparta.m r2 = r4.t
            char[] r3 = r4.q
            r2.characters(r3, r0, r1)
        L51:
            return
    }

    private final boolean i(char r4, char r5) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r3 = this;
            int r0 = r3.n
            int r1 = r3.o
            r2 = 0
            if (r0 < r1) goto Lf
            int r0 = r3.a()
            r1 = -1
            if (r0 != r1) goto Lf
            return r2
        Lf:
            char[] r0 = r3.m
            int r1 = r3.n
            char r0 = r0[r1]
            if (r0 == r4) goto L1b
            if (r0 != r5) goto L1a
            goto L1b
        L1a:
            return r2
        L1b:
            r4 = 1
            return r4
    }

    private void i0() throws com.hp.hpl.sparta.ParseException, com.hp.hpl.sparta.EncodingMismatchException, java.io.IOException {
            r1 = this;
            boolean r0 = r1.E()
            if (r0 == 0) goto L9
            r1.q0()
        L9:
            boolean r0 = r1.v()
            if (r0 == 0) goto L13
            r1.c0()
            goto L9
        L13:
            boolean r0 = r1.m()
            if (r0 == 0) goto L26
            r1.R()
        L1c:
            boolean r0 = r1.v()
            if (r0 == 0) goto L26
            r1.c0()
            goto L1c
        L26:
            return
    }

    private final boolean j(char r4, char r5, char r6, char r7) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r3 = this;
            int r0 = r3.n
            int r1 = r3.o
            r2 = 0
            if (r0 < r1) goto Lf
            int r0 = r3.a()
            r1 = -1
            if (r0 != r1) goto Lf
            return r2
        Lf:
            char[] r0 = r3.m
            int r1 = r3.n
            char r0 = r0[r1]
            if (r0 == r4) goto L1f
            if (r0 == r5) goto L1f
            if (r0 == r6) goto L1f
            if (r0 != r7) goto L1e
            goto L1f
        L1e:
            return r2
        L1f:
            r4 = 1
            return r4
    }

    private final void j0() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r0 = this;
            r0.n0()
            return
    }

    private final boolean k() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r1 = this;
            char[] r0 = com.hp.hpl.sparta.l.z
            boolean r0 = r1.C(r0)
            return r0
    }

    private final char[] k0() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r3 = this;
            char[] r0 = com.hp.hpl.sparta.l.J
            boolean r0 = r3.C(r0)
            if (r0 == 0) goto L13
            char r0 = r3.N()
            r1 = 1
            char[] r1 = new char[r1]
            r2 = 0
            r1[r2] = r0
            return r1
        L13:
            java.lang.String r0 = r3.X()
            char[] r0 = r0.toCharArray()
            return r0
    }

    private boolean l() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r1 = this;
            boolean r0 = r1.y()
            if (r0 != 0) goto Lf
            boolean r0 = r1.B()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    private final void l0() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r5 = this;
            r0 = 32
            r1 = 9
            r2 = 13
            r3 = 10
            r5.L(r0, r1, r2, r3)
        Lb:
            boolean r4 = r5.j(r0, r1, r2, r3)
            if (r4 == 0) goto L15
            r5.J()
            goto Lb
        L15:
            return
    }

    private boolean m() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r1 = this;
            char[] r0 = com.hp.hpl.sparta.l.D
            boolean r0 = r1.C(r0)
            return r0
    }

    private final void m0(char[] r6) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r5 = this;
            int r0 = r6.length
            int r1 = r5.o
            int r2 = r5.n
            int r1 = r1 - r2
            java.lang.String r2 = "end of XML file"
            if (r1 >= r0) goto L1a
            int r1 = r5.c(r0)
            if (r1 <= 0) goto L11
            goto L1a
        L11:
            r0 = -1
            r5.j = r0
            com.hp.hpl.sparta.ParseException r0 = new com.hp.hpl.sparta.ParseException
            r0.<init>(r5, r2, r6)
            throw r0
        L1a:
            char[] r1 = r5.m
            int r3 = r5.o
            int r4 = r3 + (-1)
            char r1 = r1[r4]
            r5.j = r1
            int r1 = r5.n
            int r3 = r3 - r1
            if (r3 < r0) goto L4f
            r1 = 0
        L2a:
            if (r1 >= r0) goto L49
            char[] r2 = r5.m
            int r3 = r5.n
            int r3 = r3 + r1
            char r2 = r2[r3]
            char r3 = r6[r1]
            if (r2 != r3) goto L3a
            int r1 = r1 + 1
            goto L2a
        L3a:
            com.hp.hpl.sparta.ParseException r1 = new com.hp.hpl.sparta.ParseException
            java.lang.String r2 = new java.lang.String
            char[] r3 = r5.m
            int r4 = r5.n
            r2.<init>(r3, r4, r0)
            r1.<init>(r5, r2, r6)
            throw r1
        L49:
            int r6 = r5.n
            int r6 = r6 + r0
            r5.n = r6
            return
        L4f:
            com.hp.hpl.sparta.ParseException r0 = new com.hp.hpl.sparta.ParseException
            r0.<init>(r5, r2, r6)
            throw r0
    }

    private boolean n() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r1 = this;
            char[] r0 = com.hp.hpl.sparta.l.R
            boolean r0 = r1.C(r0)
            return r0
    }

    private final void n0() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r2 = this;
            char r0 = r2.J()
        L4:
            char r1 = r2.F()
            if (r1 == r0) goto Le
            r2.J()
            goto L4
        Le:
            r2.M(r0)
            return
    }

    private boolean o() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r1 = this;
            char[] r0 = com.hp.hpl.sparta.l.F
            boolean r0 = r1.C(r0)
            return r0
    }

    private void o0() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r2 = this;
            r2.l0()
            char[] r0 = com.hp.hpl.sparta.l.G
            r2.m0(r0)
            r2.Z()
            r0 = 39
            r1 = 34
            char r0 = r2.K(r0, r1)
            r2.p0()
            r2.M(r0)
            return
    }

    private boolean p() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r1 = this;
            char[] r0 = com.hp.hpl.sparta.l.K
            boolean r0 = r1.C(r0)
            return r0
    }

    private void p0() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r1 = this;
            r1.J()
        L3:
            boolean r0 = r1.D()
            if (r0 == 0) goto Ld
            r1.J()
            goto L3
        Ld:
            return
    }

    private final boolean q() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r2 = this;
            r0 = 39
            r1 = 34
            boolean r0 = r2.i(r0, r1)
            return r0
    }

    private void q0() throws com.hp.hpl.sparta.ParseException, com.hp.hpl.sparta.EncodingMismatchException, java.io.IOException {
            r4 = this;
            char[] r0 = com.hp.hpl.sparta.l.E
            r4.m0(r0)
            r4.o0()
            boolean r0 = r4.B()
            if (r0 == 0) goto L11
            r4.l0()
        L11:
            boolean r0 = r4.o()
            if (r0 == 0) goto L36
            java.lang.String r0 = r4.V()
            java.lang.String r1 = r4.i
            if (r1 == 0) goto L36
            java.lang.String r1 = r0.toLowerCase()
            java.lang.String r2 = r4.i
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2c
            goto L36
        L2c:
            com.hp.hpl.sparta.EncodingMismatchException r1 = new com.hp.hpl.sparta.EncodingMismatchException
            java.lang.String r2 = r4.c
            java.lang.String r3 = r4.i
            r1.<init>(r2, r0, r3)
            throw r1
        L36:
            char[] r0 = com.hp.hpl.sparta.l.C
            boolean r1 = r4.C(r0)
            if (r1 != 0) goto L42
            r4.J()
            goto L36
        L42:
            r4.m0(r0)
            return
    }

    private static boolean r(char r1) {
            r0 = 183(0xb7, float:2.56E-43)
            if (r1 == r0) goto L30
            r0 = 903(0x387, float:1.265E-42)
            if (r1 == r0) goto L30
            r0 = 1600(0x640, float:2.242E-42)
            if (r1 == r0) goto L30
            r0 = 3654(0xe46, float:5.12E-42)
            if (r1 == r0) goto L30
            r0 = 3782(0xec6, float:5.3E-42)
            if (r1 == r0) goto L30
            r0 = 12293(0x3005, float:1.7226E-41)
            if (r1 == r0) goto L30
            r0 = 720(0x2d0, float:1.009E-42)
            if (r1 == r0) goto L30
            r0 = 721(0x2d1, float:1.01E-42)
            if (r1 == r0) goto L30
            r0 = 12445(0x309d, float:1.7439E-41)
            if (r1 == r0) goto L30
            r0 = 12446(0x309e, float:1.744E-41)
            if (r1 == r0) goto L30
            switch(r1) {
                case 12337: goto L30;
                case 12338: goto L30;
                case 12339: goto L30;
                case 12340: goto L30;
                case 12341: goto L30;
                default: goto L2b;
            }
        L2b:
            switch(r1) {
                case 12540: goto L30;
                case 12541: goto L30;
                case 12542: goto L30;
                default: goto L2e;
            }
        L2e:
            r1 = 0
            return r1
        L30:
            r1 = 1
            return r1
    }

    private boolean s() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r1 = this;
            char[] r0 = com.hp.hpl.sparta.l.M
            boolean r0 = r1.C(r0)
            if (r0 != 0) goto L13
            char[] r0 = com.hp.hpl.sparta.l.N
            boolean r0 = r1.C(r0)
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            r0 = 1
            return r0
    }

    private static final boolean t(char r3, char[] r4) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r4.length
            if (r1 >= r2) goto Le
            char r2 = r4[r1]
            if (r3 != r2) goto Lb
            r3 = 1
            return r3
        Lb:
            int r1 = r1 + 1
            goto L2
        Le:
            return r0
    }

    private static boolean u(char r1) {
            java.lang.String r0 = "abcdefghijklmnopqrstuvwxyz"
            char r1 = java.lang.Character.toLowerCase(r1)
            int r1 = r0.indexOf(r1)
            r0 = -1
            if (r1 == r0) goto Lf
            r1 = 1
            return r1
        Lf:
            r1 = 0
            return r1
    }

    private boolean v() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r1 = this;
            boolean r0 = r1.k()
            if (r0 != 0) goto L15
            boolean r0 = r1.z()
            if (r0 != 0) goto L15
            boolean r0 = r1.B()
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    private boolean w() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r2 = this;
            char r0 = r2.F()
            r1 = 128(0x80, float:1.8E-43)
            if (r0 >= r1) goto Ld
            boolean[] r1 = com.hp.hpl.sparta.l.y
            boolean r0 = r1[r0]
            return r0
        Ld:
            boolean r0 = x(r0)
            return r0
    }

    private static boolean x(char r1) {
            boolean r0 = java.lang.Character.isDigit(r1)
            if (r0 != 0) goto L1d
            boolean r0 = u(r1)
            if (r0 != 0) goto L1d
            char[] r0 = com.hp.hpl.sparta.l.w
            boolean r0 = t(r1, r0)
            if (r0 != 0) goto L1d
            boolean r1 = r(r1)
            if (r1 == 0) goto L1b
            goto L1d
        L1b:
            r1 = 0
            return r1
        L1d:
            r1 = 1
            return r1
    }

    private boolean y() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r1 = this;
            r0 = 37
            boolean r0 = r1.h(r0)
            return r0
    }

    private final boolean z() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
            r1 = this;
            char[] r0 = com.hp.hpl.sparta.l.B
            boolean r0 = r1.C(r0)
            return r0
    }

    final java.lang.String d() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    int e() {
            r1 = this;
            int r0 = r1.j
            return r0
    }

    com.hp.hpl.sparta.n f() {
            r1 = this;
            com.hp.hpl.sparta.n r0 = r1.h
            return r0
    }

    @Override // com.hp.hpl.sparta.o
    public int getLineNumber() {
            r1 = this;
            int r0 = r1.r
            return r0
    }

    @Override // com.hp.hpl.sparta.o
    public java.lang.String getSystemId() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    @Override // com.hp.hpl.sparta.o
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }
}
