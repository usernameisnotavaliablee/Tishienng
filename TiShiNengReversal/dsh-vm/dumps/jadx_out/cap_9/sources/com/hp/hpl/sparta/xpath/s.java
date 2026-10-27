package com.hp.hpl.sparta.xpath;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class s {
    public static final int j = -1;
    public static final int k = -2;
    public static final int l = -3;
    private static final int m = -5;
    private static final int n = -6;
    public int a;
    public int b;
    public java.lang.String c;
    private final java.lang.StringBuffer d;
    private int e;
    private final java.io.Reader f;
    private final int[] g;
    private boolean h;
    private char i;

    public s(java.io.Reader r3) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.a = r0
            r2.b = r0
            java.lang.String r0 = ""
            r2.c = r0
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r2.d = r0
            r0 = 256(0x100, float:3.59E-43)
            int[] r0 = new int[r0]
            r2.g = r0
            r0 = 0
            r2.h = r0
            r2.i = r0
            r2.f = r3
        L21:
            int[] r3 = r2.g
            int r1 = r3.length
            if (r0 >= r1) goto L5a
            r1 = 65
            if (r1 > r0) goto L2e
            r1 = 90
            if (r0 <= r1) goto L3a
        L2e:
            r1 = 97
            if (r1 > r0) goto L36
            r1 = 122(0x7a, float:1.71E-43)
            if (r0 <= r1) goto L3a
        L36:
            r1 = 45
            if (r0 != r1) goto L3e
        L3a:
            r1 = -3
            r3[r0] = r1
            goto L56
        L3e:
            r1 = 48
            if (r1 > r0) goto L4a
            r1 = 57
            if (r0 > r1) goto L4a
            r1 = -2
            r3[r0] = r1
            goto L56
        L4a:
            if (r0 < 0) goto L54
            r1 = 32
            if (r0 > r1) goto L54
            r1 = -5
            r3[r0] = r1
            goto L56
        L54:
            r3[r0] = r0
        L56:
            int r0 = r0 + 1
            char r0 = (char) r0
            goto L21
        L5a:
            r2.a()
            return
    }

    public int a() throws java.io.IOException {
            r12 = this;
            boolean r0 = r12.h
            r1 = 0
            if (r0 == 0) goto La
            r12.h = r1
            int r0 = r12.a
            return r0
        La:
            int r0 = r12.e
            r12.a = r0
        Le:
            r0 = 0
        Lf:
            java.io.Reader r2 = r12.f
            int r2 = r2.read()
            r3 = -1
            if (r2 != r3) goto L26
            char r4 = r12.i
            if (r4 != 0) goto L1e
            r4 = -1
            goto L2a
        L1e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Unterminated quote"
            r0.<init>(r1)
            throw r0
        L26:
            int[] r4 = r12.g
            r4 = r4[r2]
        L2a:
            char r5 = r12.i
            r6 = -5
            r7 = 1
            if (r5 != 0) goto L34
            if (r4 != r6) goto L34
            r8 = 1
            goto L35
        L34:
            r8 = 0
        L35:
            if (r0 != 0) goto L3c
            if (r8 == 0) goto L3a
            goto L3c
        L3a:
            r0 = 0
            goto L3d
        L3c:
            r0 = 1
        L3d:
            if (r8 != 0) goto Lf
            r8 = 34
            r9 = 39
            if (r4 == r9) goto L47
            if (r4 != r8) goto L51
        L47:
            if (r5 != 0) goto L4d
            char r5 = (char) r4
            r12.i = r5
            goto L51
        L4d:
            if (r5 != r4) goto L51
            r12.i = r1
        L51:
            char r5 = r12.i
            if (r5 == 0) goto L56
            r4 = r5
        L56:
            if (r0 != 0) goto L65
            int r0 = r12.a
            if (r0 < r3) goto L60
            if (r0 == r9) goto L60
            if (r0 != r8) goto L65
        L60:
            if (r0 == r4) goto L63
            goto L65
        L63:
            r0 = 0
            goto L66
        L65:
            r0 = 1
        L66:
            r3 = -2
            r5 = -3
            if (r0 == 0) goto Lb7
            int r10 = r12.a
            if (r10 == r5) goto La0
            if (r10 == r3) goto L8e
            if (r10 == r8) goto L75
            if (r10 == r9) goto L75
            goto Lad
        L75:
            java.lang.StringBuffer r10 = r12.d
            java.lang.String r10 = r10.toString()
            java.lang.StringBuffer r11 = r12.d
            int r11 = r11.length()
            int r11 = r11 - r7
            java.lang.String r7 = r10.substring(r7, r11)
            r12.c = r7
            java.lang.StringBuffer r7 = r12.d
            r7.setLength(r1)
            goto Lad
        L8e:
            java.lang.StringBuffer r7 = r12.d
            java.lang.String r7 = r7.toString()
            int r7 = java.lang.Integer.parseInt(r7)
            r12.b = r7
            java.lang.StringBuffer r7 = r12.d
            r7.setLength(r1)
            goto Lad
        La0:
            java.lang.StringBuffer r7 = r12.d
            java.lang.String r7 = r7.toString()
            r12.c = r7
            java.lang.StringBuffer r7 = r12.d
            r7.setLength(r1)
        Lad:
            if (r4 == r6) goto Lb7
            r6 = -6
            if (r4 != r6) goto Lb4
            r6 = r2
            goto Lb5
        Lb4:
            r6 = r4
        Lb5:
            r12.e = r6
        Lb7:
            if (r4 == r5) goto Lc0
            if (r4 == r3) goto Lc0
            if (r4 == r8) goto Lc0
            if (r4 == r9) goto Lc0
            goto Lc6
        Lc0:
            java.lang.StringBuffer r3 = r12.d
            char r2 = (char) r2
            r3.append(r2)
        Lc6:
            if (r0 == 0) goto Le
            int r0 = r12.a
            return r0
    }

    public void b(char r2) {
            r1 = this;
            int[] r0 = r1.g
            r0[r2] = r2
            return
    }

    public void c() {
            r1 = this;
            r0 = 1
            r1.h = r0
            return
    }

    public void d(char r3, char r4) {
            r2 = this;
        L0:
            if (r3 > r4) goto Lb
            int[] r0 = r2.g
            r1 = -3
            r0[r3] = r1
            int r3 = r3 + 1
            char r3 = (char) r3
            goto L0
        Lb:
            return
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.a
            r1 = -3
            if (r0 == r1) goto L4a
            r1 = -2
            if (r0 == r1) goto L43
            r1 = -1
            if (r0 == r1) goto L40
            r1 = 34
            if (r0 == r1) goto L4a
            r1 = 39
            java.lang.String r2 = "'"
            if (r0 == r1) goto L2b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            int r1 = r3.a
            char r1 = (char) r1
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        L2b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = r3.c
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        L40:
            java.lang.String r0 = "(EOF)"
            return r0
        L43:
            int r0 = r3.b
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
        L4a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "\""
            r0.append(r1)
            java.lang.String r2 = r3.c
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
