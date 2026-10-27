package org.apache.commons.net.nntp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class m {
    private final java.lang.String a;
    private final java.lang.String b;
    private final java.lang.StringBuilder c;
    private final java.lang.StringBuilder d;
    private int e;

    public m(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.a = r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0.c = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0.d = r1
            r1 = 0
            r0.e = r1
            return
    }

    public void a(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.d
            r0.append(r2)
            java.lang.StringBuilder r2 = r1.d
            java.lang.String r0 = ": "
            r2.append(r0)
            java.lang.StringBuilder r2 = r1.d
            r2.append(r3)
            java.lang.StringBuilder r2 = r1.d
            r3 = 10
            r2.append(r3)
            return
    }

    public void b(java.lang.String r3) {
            r2 = this;
            int r0 = r2.e
            int r1 = r0 + 1
            r2.e = r1
            if (r0 <= 0) goto Lf
            java.lang.StringBuilder r0 = r2.c
            r1 = 44
            r0.append(r1)
        Lf:
            java.lang.StringBuilder r0 = r2.c
            r0.append(r3)
            return
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.StringBuilder r0 = r1.c
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "From: "
            r0.append(r1)
            java.lang.String r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = "\nNewsgroups: "
            r0.append(r1)
            java.lang.StringBuilder r1 = r3.c
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "\nSubject: "
            r0.append(r1)
            java.lang.String r1 = r3.a
            r0.append(r1)
            r1 = 10
            r0.append(r1)
            java.lang.StringBuilder r2 = r3.d
            int r2 = r2.length()
            if (r2 <= 0) goto L3d
            java.lang.StringBuilder r2 = r3.d
            java.lang.String r2 = r2.toString()
            r0.append(r2)
        L3d:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
