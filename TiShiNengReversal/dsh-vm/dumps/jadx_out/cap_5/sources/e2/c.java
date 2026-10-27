package e2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c {
    private final java.lang.String a;
    private final int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private char[] g;

    public c(javax.security.auth.x500.X500Principal r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "RFC2253"
            java.lang.String r2 = r2.getName(r0)
            r1.a = r2
            int r2 = r2.length()
            r1.b = r2
            return
    }

    private int a(int r10) {
            r9 = this;
            int r0 = r10 + 1
            int r1 = r9.b
            java.lang.String r2 = "Malformed DN: "
            if (r0 >= r1) goto L72
            char[] r1 = r9.g
            char r10 = r1[r10]
            r3 = 70
            r4 = 65
            r5 = 102(0x66, float:1.43E-43)
            r6 = 97
            r7 = 57
            r8 = 48
            if (r10 < r8) goto L1e
            if (r10 > r7) goto L1e
            int r10 = r10 - r8
            goto L2b
        L1e:
            if (r10 < r6) goto L25
            if (r10 > r5) goto L25
            int r10 = r10 + (-87)
            goto L2b
        L25:
            if (r10 < r4) goto L5b
            if (r10 > r3) goto L5b
            int r10 = r10 + (-55)
        L2b:
            char r0 = r1[r0]
            if (r0 < r8) goto L33
            if (r0 > r7) goto L33
            int r0 = r0 - r8
            goto L40
        L33:
            if (r0 < r6) goto L3a
            if (r0 > r5) goto L3a
            int r0 = r0 + (-87)
            goto L40
        L3a:
            if (r0 < r4) goto L44
            if (r0 > r3) goto L44
            int r0 = r0 + (-55)
        L40:
            int r10 = r10 << 4
            int r10 = r10 + r0
            return r10
        L44:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = r9.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L5b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = r9.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L72:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = r9.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
    }

    private java.lang.String b() {
            r8 = this;
            int r0 = r8.c
            r8.d = r0
            r8.e = r0
        L6:
            int r0 = r8.c
            int r1 = r8.b
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.g
            int r2 = r8.d
            int r3 = r8.e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L5c
            if (r2 == r5) goto L51
            r5 = 92
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L51
            if (r2 == r3) goto L51
            int r3 = r8.e
            int r4 = r3 + 1
            r8.e = r4
            r1[r3] = r2
            int r0 = r0 + 1
            r8.c = r0
            goto L6
        L3e:
            int r0 = r8.e
            int r2 = r0 + 1
            r8.e = r2
            char r2 = r8.d()
            r1[r0] = r2
            int r0 = r8.c
            int r0 = r0 + 1
            r8.c = r0
            goto L6
        L51:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.d
            int r3 = r8.e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L5c:
            int r2 = r8.e
            r8.f = r2
            int r0 = r0 + 1
            r8.c = r0
            int r0 = r2 + 1
            r8.e = r0
            r1[r2] = r6
        L6a:
            int r0 = r8.c
            int r1 = r8.b
            if (r0 >= r1) goto L83
            char[] r2 = r8.g
            char r7 = r2[r0]
            if (r7 != r6) goto L83
            int r1 = r8.e
            int r7 = r1 + 1
            r8.e = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.c = r0
            goto L6a
        L83:
            if (r0 == r1) goto L8f
            char[] r1 = r8.g
            char r0 = r1[r0]
            if (r0 == r3) goto L8f
            if (r0 == r4) goto L8f
            if (r0 != r5) goto L6
        L8f:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.g
            int r2 = r8.d
            int r3 = r8.f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
    }

    private char d() {
            r3 = this;
            int r0 = r3.c
            int r0 = r0 + 1
            r3.c = r0
            int r1 = r3.b
            if (r0 == r1) goto L31
            char[] r1 = r3.g
            char r0 = r1[r0]
            r1 = 32
            if (r0 == r1) goto L30
            r1 = 37
            if (r0 == r1) goto L30
            r1 = 92
            if (r0 == r1) goto L30
            r1 = 95
            if (r0 == r1) goto L30
            r1 = 34
            if (r0 == r1) goto L30
            r1 = 35
            if (r0 == r1) goto L30
            switch(r0) {
                case 42: goto L30;
                case 43: goto L30;
                case 44: goto L30;
                default: goto L29;
            }
        L29:
            switch(r0) {
                case 59: goto L30;
                case 60: goto L30;
                case 61: goto L30;
                case 62: goto L30;
                default: goto L2c;
            }
        L2c:
            char r0 = r3.f()
        L30:
            return r0
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected end of DN: "
            r1.append(r2)
            java.lang.String r2 = r3.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private char f() {
            r9 = this;
            int r0 = r9.c
            int r0 = r9.a(r0)
            int r1 = r9.c
            r2 = 1
            int r1 = r1 + r2
            r9.c = r1
            r1 = 128(0x80, float:1.8E-43)
            if (r0 >= r1) goto L12
            char r0 = (char) r0
            return r0
        L12:
            r3 = 192(0xc0, float:2.69E-43)
            r4 = 63
            if (r0 < r3) goto L62
            r3 = 247(0xf7, float:3.46E-43)
            if (r0 > r3) goto L62
            r3 = 223(0xdf, float:3.12E-43)
            if (r0 > r3) goto L24
            r0 = r0 & 31
            r3 = 1
            goto L2f
        L24:
            r3 = 239(0xef, float:3.35E-43)
            if (r0 > r3) goto L2c
            r0 = r0 & 15
            r3 = 2
            goto L2f
        L2c:
            r0 = r0 & 7
            r3 = 3
        L2f:
            r5 = 0
        L30:
            if (r5 >= r3) goto L60
            int r6 = r9.c
            int r7 = r6 + 1
            r9.c = r7
            int r8 = r9.b
            if (r7 == r8) goto L5f
            char[] r8 = r9.g
            char r7 = r8[r7]
            r8 = 92
            if (r7 == r8) goto L45
            goto L5f
        L45:
            int r6 = r6 + 2
            r9.c = r6
            int r6 = r9.a(r6)
            int r7 = r9.c
            int r7 = r7 + r2
            r9.c = r7
            r7 = r6 & 192(0xc0, float:2.69E-43)
            if (r7 == r1) goto L57
            return r4
        L57:
            int r0 = r0 << 6
            r6 = r6 & 63
            int r0 = r0 + r6
            int r5 = r5 + 1
            goto L30
        L5f:
            return r4
        L60:
            char r0 = (char) r0
            return r0
        L62:
            return r4
    }

    private java.lang.String g() {
            r6 = this;
            int r0 = r6.c
            int r1 = r0 + 4
            int r2 = r6.b
            java.lang.String r3 = "Unexpected end of DN: "
            if (r1 >= r2) goto L98
            r6.d = r0
            int r0 = r0 + 1
            r6.c = r0
        L10:
            int r0 = r6.c
            int r1 = r6.b
            if (r0 == r1) goto L54
            char[] r1 = r6.g
            char r2 = r1[r0]
            r4 = 43
            if (r2 == r4) goto L54
            r4 = 44
            if (r2 == r4) goto L54
            r4 = 59
            if (r2 != r4) goto L27
            goto L54
        L27:
            r4 = 32
            if (r2 != r4) goto L42
            r6.e = r0
            int r0 = r0 + 1
            r6.c = r0
        L31:
            int r0 = r6.c
            int r1 = r6.b
            if (r0 >= r1) goto L56
            char[] r1 = r6.g
            char r1 = r1[r0]
            if (r1 != r4) goto L56
            int r0 = r0 + 1
            r6.c = r0
            goto L31
        L42:
            r4 = 65
            if (r2 < r4) goto L4f
            r4 = 70
            if (r2 > r4) goto L4f
            int r2 = r2 + 32
            char r2 = (char) r2
            r1[r0] = r2
        L4f:
            int r0 = r0 + 1
            r6.c = r0
            goto L10
        L54:
            r6.e = r0
        L56:
            int r0 = r6.e
            int r1 = r6.d
            int r0 = r0 - r1
            r2 = 5
            if (r0 < r2) goto L81
            r2 = r0 & 1
            if (r2 == 0) goto L81
            int r2 = r0 / 2
            byte[] r3 = new byte[r2]
            int r1 = r1 + 1
            r4 = 0
        L69:
            if (r4 >= r2) goto L77
            int r5 = r6.a(r1)
            byte r5 = (byte) r5
            r3[r4] = r5
            int r1 = r1 + 2
            int r4 = r4 + 1
            goto L69
        L77:
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.g
            int r3 = r6.d
            r1.<init>(r2, r3, r0)
            return r1
        L81:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r6.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L98:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r6.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private java.lang.String h() {
            r6 = this;
        L0:
            int r0 = r6.c
            int r1 = r6.b
            r2 = 32
            if (r0 >= r1) goto L13
            char[] r3 = r6.g
            char r3 = r3[r0]
            if (r3 != r2) goto L13
            int r0 = r0 + 1
            r6.c = r0
            goto L0
        L13:
            if (r0 != r1) goto L17
            r0 = 0
            return r0
        L17:
            r6.d = r0
            int r0 = r0 + 1
            r6.c = r0
        L1d:
            int r0 = r6.c
            int r1 = r6.b
            r3 = 61
            if (r0 >= r1) goto L32
            char[] r4 = r6.g
            char r4 = r4[r0]
            if (r4 == r3) goto L32
            if (r4 == r2) goto L32
            int r0 = r0 + 1
            r6.c = r0
            goto L1d
        L32:
            java.lang.String r4 = "Unexpected end of DN: "
            if (r0 >= r1) goto Lcb
            r6.e = r0
            char[] r1 = r6.g
            char r0 = r1[r0]
            if (r0 != r2) goto L71
        L3e:
            int r0 = r6.c
            int r1 = r6.b
            if (r0 >= r1) goto L51
            char[] r5 = r6.g
            char r5 = r5[r0]
            if (r5 == r3) goto L51
            if (r5 != r2) goto L51
            int r0 = r0 + 1
            r6.c = r0
            goto L3e
        L51:
            char[] r5 = r6.g
            char r5 = r5[r0]
            if (r5 != r3) goto L5a
            if (r0 == r1) goto L5a
            goto L71
        L5a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = r6.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L71:
            int r0 = r6.c
            int r0 = r0 + 1
            r6.c = r0
        L77:
            int r0 = r6.c
            int r1 = r6.b
            if (r0 >= r1) goto L88
            char[] r1 = r6.g
            char r1 = r1[r0]
            if (r1 != r2) goto L88
            int r0 = r0 + 1
            r6.c = r0
            goto L77
        L88:
            int r0 = r6.e
            int r1 = r6.d
            int r2 = r0 - r1
            r3 = 4
            if (r2 <= r3) goto Lc0
            char[] r2 = r6.g
            int r4 = r1 + 3
            char r4 = r2[r4]
            r5 = 46
            if (r4 != r5) goto Lc0
            char r4 = r2[r1]
            r5 = 79
            if (r4 == r5) goto La5
            r5 = 111(0x6f, float:1.56E-43)
            if (r4 != r5) goto Lc0
        La5:
            int r4 = r1 + 1
            char r4 = r2[r4]
            r5 = 73
            if (r4 == r5) goto Lb1
            r5 = 105(0x69, float:1.47E-43)
            if (r4 != r5) goto Lc0
        Lb1:
            int r4 = r1 + 2
            char r2 = r2[r4]
            r4 = 68
            if (r2 == r4) goto Lbd
            r4 = 100
            if (r2 != r4) goto Lc0
        Lbd:
            int r1 = r1 + r3
            r6.d = r1
        Lc0:
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.g
            int r3 = r6.d
            int r0 = r0 - r3
            r1.<init>(r2, r3, r0)
            return r1
        Lcb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = r6.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private java.lang.String i() {
            r4 = this;
            int r0 = r4.c
            int r0 = r0 + 1
            r4.c = r0
            r4.d = r0
            r4.e = r0
        La:
            int r0 = r4.c
            int r1 = r4.b
            if (r0 == r1) goto L5a
            char[] r1 = r4.g
            char r2 = r1[r0]
            r3 = 34
            if (r2 != r3) goto L3c
            int r0 = r0 + 1
            r4.c = r0
        L1c:
            int r0 = r4.c
            int r1 = r4.b
            if (r0 >= r1) goto L2f
            char[] r1 = r4.g
            char r1 = r1[r0]
            r2 = 32
            if (r1 != r2) goto L2f
            int r0 = r0 + 1
            r4.c = r0
            goto L1c
        L2f:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r4.g
            int r2 = r4.d
            int r3 = r4.e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L3c:
            r0 = 92
            if (r2 != r0) goto L49
            int r0 = r4.e
            char r2 = r4.d()
            r1[r0] = r2
            goto L4d
        L49:
            int r0 = r4.e
            r1[r0] = r2
        L4d:
            int r0 = r4.c
            int r0 = r0 + 1
            r4.c = r0
            int r0 = r4.e
            int r0 = r0 + 1
            r4.e = r0
            goto La
        L5a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected end of DN: "
            r1.append(r2)
            java.lang.String r2 = r4.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String c(java.lang.String r8) {
            r7 = this;
            r0 = 0
            r7.c = r0
            r7.d = r0
            r7.e = r0
            r7.f = r0
            java.lang.String r0 = r7.a
            char[] r0 = r0.toCharArray()
            r7.g = r0
            java.lang.String r0 = r7.h()
            r1 = 0
            if (r0 != 0) goto L19
            return r1
        L19:
            int r2 = r7.c
            int r3 = r7.b
            if (r2 != r3) goto L20
            return r1
        L20:
            char[] r3 = r7.g
            char r2 = r3[r2]
            r3 = 34
            r4 = 59
            r5 = 44
            r6 = 43
            if (r2 == r3) goto L45
            r3 = 35
            if (r2 == r3) goto L40
            if (r2 == r6) goto L3d
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L3d
            java.lang.String r2 = r7.b()
            goto L49
        L3d:
            java.lang.String r2 = ""
            goto L49
        L40:
            java.lang.String r2 = r7.g()
            goto L49
        L45:
            java.lang.String r2 = r7.i()
        L49:
            boolean r0 = r8.equalsIgnoreCase(r0)
            if (r0 == 0) goto L50
            return r2
        L50:
            int r0 = r7.c
            int r2 = r7.b
            if (r0 < r2) goto L57
            return r1
        L57:
            char[] r2 = r7.g
            char r2 = r2[r0]
            java.lang.String r3 = "Malformed DN: "
            if (r2 == r5) goto L7c
            if (r2 != r4) goto L62
            goto L7c
        L62:
            if (r2 != r6) goto L65
            goto L7c
        L65:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = r7.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L7c:
            int r0 = r0 + 1
            r7.c = r0
            java.lang.String r0 = r7.h()
            if (r0 == 0) goto L87
            goto L19
        L87:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = r7.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
    }

    public java.util.List<java.lang.String> e(java.lang.String r8) {
            r7 = this;
            r0 = 0
            r7.c = r0
            r7.d = r0
            r7.e = r0
            r7.f = r0
            java.lang.String r0 = r7.a
            char[] r0 = r0.toCharArray()
            r7.g = r0
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            java.lang.String r1 = r7.h()
            if (r1 != 0) goto L1a
            return r0
        L1a:
            int r2 = r7.c
            int r3 = r7.b
            if (r2 >= r3) goto Lab
            char[] r3 = r7.g
            char r2 = r3[r2]
            r3 = 34
            r4 = 59
            r5 = 44
            r6 = 43
            if (r2 == r3) goto L45
            r3 = 35
            if (r2 == r3) goto L40
            if (r2 == r6) goto L3d
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L3d
            java.lang.String r2 = r7.b()
            goto L49
        L3d:
            java.lang.String r2 = ""
            goto L49
        L40:
            java.lang.String r2 = r7.g()
            goto L49
        L45:
            java.lang.String r2 = r7.i()
        L49:
            boolean r1 = r8.equalsIgnoreCase(r1)
            if (r1 == 0) goto L5d
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L5a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5a:
            r0.add(r2)
        L5d:
            int r1 = r7.c
            int r2 = r7.b
            if (r1 < r2) goto L64
            return r0
        L64:
            char[] r2 = r7.g
            char r2 = r2[r1]
            java.lang.String r3 = "Malformed DN: "
            if (r2 == r5) goto L89
            if (r2 != r4) goto L6f
            goto L89
        L6f:
            if (r2 != r6) goto L72
            goto L89
        L72:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = r7.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L89:
            int r1 = r1 + 1
            r7.c = r1
            java.lang.String r1 = r7.h()
            if (r1 == 0) goto L94
            goto L1a
        L94:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = r7.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        Lab:
            return r0
    }
}
