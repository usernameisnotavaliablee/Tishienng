package com.sun.activation.registries;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class a {
    private static final java.lang.String e = "=";
    private int a;
    private int b;
    private java.lang.String c;
    private java.util.Vector d;

    public a(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1.d = r0
            r0 = 0
            r1.a = r0
            r1.c = r2
            int r2 = r2.length()
            r1.b = r2
            return
    }

    private void d() {
            r2 = this;
        L0:
            int r0 = r2.a
            int r1 = r2.b
            if (r0 >= r1) goto L1a
            java.lang.String r1 = r2.c
            char r0 = r1.charAt(r0)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 != 0) goto L13
            goto L1a
        L13:
            int r0 = r2.a
            int r0 = r0 + 1
            r2.a = r0
            goto L0
        L1a:
            return
    }

    public boolean a() {
            r3 = this;
            java.util.Vector r0 = r3.d
            int r0 = r0.size()
            r1 = 1
            if (r0 <= 0) goto La
            return r1
        La:
            r3.d()
            int r0 = r3.a
            int r2 = r3.b
            if (r0 >= r2) goto L14
            return r1
        L14:
            r0 = 0
            return r0
    }

    public java.lang.String b() {
            r7 = this;
            java.util.Vector r0 = r7.d
            int r0 = r0.size()
            r1 = 1
            if (r0 <= 0) goto L18
            java.util.Vector r2 = r7.d
            int r0 = r0 - r1
            java.lang.Object r1 = r2.elementAt(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Vector r2 = r7.d
            r2.removeElementAt(r0)
            return r1
        L18:
            r7.d()
            int r0 = r7.a
            int r2 = r7.b
            if (r0 >= r2) goto Lb9
            java.lang.String r2 = r7.c
            char r2 = r2.charAt(r0)
            r3 = 34
            if (r2 != r3) goto L7b
            int r2 = r7.a
            int r2 = r2 + r1
            r7.a = r2
            r2 = 0
        L31:
            int r4 = r7.a
            int r5 = r7.b
            if (r4 < r5) goto L39
            goto Lb0
        L39:
            java.lang.String r5 = r7.c
            int r6 = r4 + 1
            r7.a = r6
            char r4 = r5.charAt(r4)
            r5 = 92
            if (r4 != r5) goto L4e
            int r2 = r7.a
            int r2 = r2 + r1
            r7.a = r2
            r2 = 1
            goto L31
        L4e:
            if (r4 != r3) goto L31
            if (r2 == 0) goto L70
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            int r0 = r0 + r1
        L58:
            int r3 = r7.a
            int r3 = r3 - r1
            if (r0 < r3) goto L62
            java.lang.String r0 = r2.toString()
            return r0
        L62:
            java.lang.String r3 = r7.c
            char r3 = r3.charAt(r0)
            if (r3 == r5) goto L6d
            r2.append(r3)
        L6d:
            int r0 = r0 + 1
            goto L58
        L70:
            java.lang.String r2 = r7.c
            int r0 = r0 + r1
            int r3 = r7.a
            int r3 = r3 - r1
            java.lang.String r0 = r2.substring(r0, r3)
            return r0
        L7b:
            java.lang.String r3 = "="
            int r2 = r3.indexOf(r2)
            if (r2 < 0) goto L89
            int r2 = r7.a
            int r2 = r2 + r1
            r7.a = r2
            goto Lb0
        L89:
            int r2 = r7.a
            int r4 = r7.b
            if (r2 >= r4) goto Lb0
            java.lang.String r4 = r7.c
            char r2 = r4.charAt(r2)
            int r2 = r3.indexOf(r2)
            if (r2 >= 0) goto Lb0
            java.lang.String r2 = r7.c
            int r4 = r7.a
            char r2 = r2.charAt(r4)
            boolean r2 = java.lang.Character.isWhitespace(r2)
            if (r2 == 0) goto Laa
            goto Lb0
        Laa:
            int r2 = r7.a
            int r2 = r2 + r1
            r7.a = r2
            goto L89
        Lb0:
            java.lang.String r1 = r7.c
            int r2 = r7.a
            java.lang.String r0 = r1.substring(r0, r2)
            return r0
        Lb9:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    public void c(java.lang.String r2) {
            r1 = this;
            java.util.Vector r0 = r1.d
            r0.addElement(r2)
            return
    }
}
