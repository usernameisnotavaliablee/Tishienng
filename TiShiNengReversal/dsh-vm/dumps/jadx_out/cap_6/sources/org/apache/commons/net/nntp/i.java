package org.apache.commons.net.nntp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class i {
    private final java.lang.String a;
    private final java.lang.String b;
    private java.lang.StringBuffer c;
    private java.lang.StringBuffer d;
    private final boolean e;

    public i(java.util.Calendar r8, boolean r9) {
            r7 = this;
            r7.<init>()
            r0 = 0
            r7.c = r0
            r7.d = r0
            r7.e = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r0 = 1
            int r1 = r8.get(r0)
            java.lang.String r1 = java.lang.Integer.toString(r1)
            int r2 = r1.length()
            java.lang.String r3 = "00"
            r4 = 2
            if (r2 < r4) goto L2a
            int r2 = r2 - r4
            java.lang.String r1 = r1.substring(r2)
            r9.append(r1)
            goto L2d
        L2a:
            r9.append(r3)
        L2d:
            int r1 = r8.get(r4)
            int r1 = r1 + r0
            java.lang.String r1 = java.lang.Integer.toString(r1)
            int r2 = r1.length()
            java.lang.String r5 = "01"
            r6 = 48
            if (r2 != r0) goto L47
            r9.append(r6)
            r9.append(r1)
            goto L50
        L47:
            if (r2 != r4) goto L4d
            r9.append(r1)
            goto L50
        L4d:
            r9.append(r5)
        L50:
            r1 = 5
            int r1 = r8.get(r1)
            java.lang.String r1 = java.lang.Integer.toString(r1)
            int r2 = r1.length()
            if (r2 != r0) goto L66
            r9.append(r6)
            r9.append(r1)
            goto L6f
        L66:
            if (r2 != r4) goto L6c
            r9.append(r1)
            goto L6f
        L6c:
            r9.append(r5)
        L6f:
            java.lang.String r1 = r9.toString()
            r7.a = r1
            r1 = 0
            r9.setLength(r1)
            r1 = 11
            int r1 = r8.get(r1)
            java.lang.String r1 = java.lang.Integer.toString(r1)
            int r2 = r1.length()
            if (r2 != r0) goto L90
            r9.append(r6)
            r9.append(r1)
            goto L99
        L90:
            if (r2 != r4) goto L96
            r9.append(r1)
            goto L99
        L96:
            r9.append(r3)
        L99:
            r1 = 12
            int r1 = r8.get(r1)
            java.lang.String r1 = java.lang.Integer.toString(r1)
            int r2 = r1.length()
            if (r2 != r0) goto Lb0
            r9.append(r6)
            r9.append(r1)
            goto Lb9
        Lb0:
            if (r2 != r4) goto Lb6
            r9.append(r1)
            goto Lb9
        Lb6:
            r9.append(r3)
        Lb9:
            r1 = 13
            int r8 = r8.get(r1)
            java.lang.String r8 = java.lang.Integer.toString(r8)
            int r1 = r8.length()
            if (r1 != r0) goto Ld0
            r9.append(r6)
            r9.append(r8)
            goto Ld9
        Ld0:
            if (r1 != r4) goto Ld6
            r9.append(r8)
            goto Ld9
        Ld6:
            r9.append(r3)
        Ld9:
            java.lang.String r8 = r9.toString()
            r7.b = r8
            return
    }

    public void a(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuffer r0 = r2.c
            if (r0 == 0) goto La
            r1 = 44
            r0.append(r1)
            goto L11
        La:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r2.c = r0
        L11:
            java.lang.StringBuffer r0 = r2.c
            r0.append(r3)
            return
    }

    public void b(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuffer r0 = r2.d
            if (r0 == 0) goto La
            r1 = 44
            r0.append(r1)
            goto L11
        La:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r2.d = r0
        L11:
            java.lang.StringBuffer r0 = r2.d
            r0.append(r3)
            return
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.StringBuffer r0 = r1.c
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String e() {
            r1 = this;
            java.lang.StringBuffer r0 = r1.d
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public boolean g() {
            r1 = this;
            boolean r0 = r1.e
            return r0
    }

    public void h(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "!"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.b(r3)
            return
    }
}
