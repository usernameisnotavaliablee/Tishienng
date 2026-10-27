package com.sun.activation.registries;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d {
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 5;
    public static final int l = 47;
    public static final int m = 59;
    public static final int n = 61;
    private java.lang.String a;
    private int b;
    private int c;
    private int d;
    private java.lang.String e;
    private boolean f;
    private char g;

    public d(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            r0 = 0
            r1.b = r0
            int r2 = r2.length()
            r1.c = r2
            r2 = 1
            r1.d = r2
            java.lang.String r2 = ""
            r1.e = r2
            r1.f = r0
            r2 = 59
            r1.g = r2
            return
    }

    private static java.lang.String a(java.lang.String r5) {
            int r0 = r5.length()
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            r1.ensureCapacity(r0)
            r2 = 0
        Ld:
            if (r2 < r0) goto L14
            java.lang.String r5 = r1.toString()
            return r5
        L14:
            char r3 = r5.charAt(r2)
            r4 = 92
            if (r3 == r4) goto L20
            r1.append(r3)
            goto L31
        L20:
            int r4 = r0 + (-1)
            if (r2 >= r4) goto L2e
            int r2 = r2 + 1
            char r3 = r5.charAt(r2)
            r1.append(r3)
            goto L31
        L2e:
            r1.append(r3)
        L31:
            int r2 = r2 + 1
            goto Ld
    }

    private static boolean d(char r0) {
            boolean r0 = java.lang.Character.isISOControl(r0)
            return r0
    }

    private static boolean e(char r1) {
            r0 = 34
            if (r1 == r0) goto L1c
            r0 = 44
            if (r1 == r0) goto L1c
            r0 = 47
            if (r1 == r0) goto L1c
            r0 = 40
            if (r1 == r0) goto L1c
            r0 = 41
            if (r1 == r0) goto L1c
            switch(r1) {
                case 58: goto L1c;
                case 59: goto L1c;
                case 60: goto L1c;
                case 61: goto L1c;
                case 62: goto L1c;
                case 63: goto L1c;
                case 64: goto L1c;
                default: goto L17;
            }
        L17:
            switch(r1) {
                case 91: goto L1c;
                case 92: goto L1c;
                case 93: goto L1c;
                default: goto L1a;
            }
        L1a:
            r1 = 0
            return r1
        L1c:
            r1 = 1
            return r1
    }

    private static boolean f(char r1) {
            boolean r0 = e(r1)
            if (r0 != 0) goto L14
            boolean r0 = d(r1)
            if (r0 != 0) goto L14
            boolean r1 = g(r1)
            if (r1 != 0) goto L14
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
    }

    private static boolean g(char r0) {
            boolean r0 = java.lang.Character.isWhitespace(r0)
            return r0
    }

    public static java.lang.String h(int r1) {
            if (r1 == 0) goto L2c
            r0 = 1
            if (r1 == r0) goto L29
            r0 = 2
            if (r1 == r0) goto L26
            r0 = 5
            if (r1 == r0) goto L23
            r0 = 47
            if (r1 == r0) goto L20
            r0 = 59
            if (r1 == r0) goto L1d
            r0 = 61
            if (r1 == r0) goto L1a
            java.lang.String r1 = "really unknown"
            return r1
        L1a:
            java.lang.String r1 = "'='"
            return r1
        L1d:
            java.lang.String r1 = "';'"
            return r1
        L20:
            java.lang.String r1 = "'/'"
            return r1
        L23:
            java.lang.String r1 = "EOI"
            return r1
        L26:
            java.lang.String r1 = "string"
            return r1
        L29:
            java.lang.String r1 = "start"
            return r1
        L2c:
            java.lang.String r1 = "unknown"
            return r1
    }

    private void j() {
            r5 = this;
            int r0 = r5.b
            r1 = 0
        L3:
            int r2 = r5.b
            int r3 = r5.c
            if (r2 >= r3) goto L1f
            if (r1 == 0) goto Lc
            goto L1f
        Lc:
            java.lang.String r3 = r5.a
            char r2 = r3.charAt(r2)
            char r3 = r5.g
            r4 = 1
            if (r2 == r3) goto L1d
            int r2 = r5.b
            int r2 = r2 + r4
            r5.b = r2
            goto L3
        L1d:
            r1 = 1
            goto L3
        L1f:
            r1 = 2
            r5.d = r1
            java.lang.String r1 = r5.a
            java.lang.String r0 = r1.substring(r0, r2)
            java.lang.String r0 = a(r0)
            r5.e = r0
            return
    }

    private void k() {
            r3 = this;
            int r0 = r3.b
        L2:
            int r1 = r3.b
            int r2 = r3.c
            if (r1 >= r2) goto L1c
            java.lang.String r2 = r3.a
            char r1 = r2.charAt(r1)
            boolean r1 = f(r1)
            if (r1 != 0) goto L15
            goto L1c
        L15:
            int r1 = r3.b
            int r1 = r1 + 1
            r3.b = r1
            goto L2
        L1c:
            r1 = 2
            r3.d = r1
            java.lang.String r1 = r3.a
            int r2 = r3.b
            java.lang.String r0 = r1.substring(r0, r2)
            r3.e = r0
            return
    }

    public int b() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    public int i() {
            r4 = this;
            int r0 = r4.b
            int r1 = r4.c
            r2 = 0
            r3 = 5
            if (r0 >= r1) goto L94
        L8:
            int r0 = r4.b
            int r1 = r4.c
            if (r0 >= r1) goto L22
            java.lang.String r1 = r4.a
            char r0 = r1.charAt(r0)
            boolean r0 = g(r0)
            if (r0 != 0) goto L1b
            goto L22
        L1b:
            int r0 = r4.b
            int r0 = r0 + 1
            r4.b = r0
            goto L8
        L22:
            int r0 = r4.b
            int r1 = r4.c
            if (r0 >= r1) goto L8f
            java.lang.String r1 = r4.a
            char r0 = r1.charAt(r0)
            boolean r1 = r4.f
            r2 = 61
            r3 = 59
            if (r1 == 0) goto L53
            if (r0 == r3) goto L3f
            if (r0 != r2) goto L3b
            goto L3f
        L3b:
            r4.j()
            goto L98
        L3f:
            r4.d = r0
            java.lang.Character r1 = new java.lang.Character
            r1.<init>(r0)
            java.lang.String r0 = r1.toString()
            r4.e = r0
            int r0 = r4.b
            int r0 = r0 + 1
            r4.b = r0
            goto L98
        L53:
            boolean r1 = f(r0)
            if (r1 == 0) goto L5d
            r4.k()
            goto L98
        L5d:
            r1 = 47
            if (r0 == r1) goto L7b
            if (r0 == r3) goto L7b
            if (r0 != r2) goto L66
            goto L7b
        L66:
            r1 = 0
            r4.d = r1
            java.lang.Character r1 = new java.lang.Character
            r1.<init>(r0)
            java.lang.String r0 = r1.toString()
            r4.e = r0
            int r0 = r4.b
            int r0 = r0 + 1
            r4.b = r0
            goto L98
        L7b:
            r4.d = r0
            java.lang.Character r1 = new java.lang.Character
            r1.<init>(r0)
            java.lang.String r0 = r1.toString()
            r4.e = r0
            int r0 = r4.b
            int r0 = r0 + 1
            r4.b = r0
            goto L98
        L8f:
            r4.d = r3
            r4.e = r2
            goto L98
        L94:
            r4.d = r3
            r4.e = r2
        L98:
            int r0 = r4.d
            return r0
    }

    public void l(boolean r1) {
            r0 = this;
            r0.f = r1
            return
    }
}
