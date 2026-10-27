package org.apache.commons.net.nntp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class n {
    org.apache.commons.net.nntp.o a;
    org.apache.commons.net.nntp.n b;
    org.apache.commons.net.nntp.n c;
    org.apache.commons.net.nntp.n d;

    n() {
            r0 = this;
            r0.<init>()
            return
    }

    boolean a(org.apache.commons.net.nntp.n r2) {
            r1 = this;
            org.apache.commons.net.nntp.n r0 = r1.d
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            if (r0 != r2) goto La
            r2 = 1
            return r2
        La:
            boolean r2 = r0.a(r2)
            return r2
    }

    void b() {
            r3 = this;
            org.apache.commons.net.nntp.n r0 = r3.b
            if (r0 == 0) goto L24
            org.apache.commons.net.nntp.o r0 = r3.a
            if (r0 == 0) goto L9
            goto L24
        L9:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no threadable in "
            r1.append(r2)
            java.lang.String r2 = r3.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L24:
            r0 = 0
            r3.b = r0
            org.apache.commons.net.nntp.o r1 = r3.a
            if (r1 == 0) goto L36
            org.apache.commons.net.nntp.n r2 = r3.d
            if (r2 != 0) goto L31
            r2 = r0
            goto L33
        L31:
            org.apache.commons.net.nntp.o r2 = r2.a
        L33:
            r1.h(r2)
        L36:
            org.apache.commons.net.nntp.n r1 = r3.d
            if (r1 == 0) goto L3f
            r1.b()
            r3.d = r0
        L3f:
            org.apache.commons.net.nntp.o r1 = r3.a
            if (r1 == 0) goto L4e
            org.apache.commons.net.nntp.n r2 = r3.c
            if (r2 != 0) goto L49
            r2 = r0
            goto L4b
        L49:
            org.apache.commons.net.nntp.o r2 = r2.a
        L4b:
            r1.c(r2)
        L4e:
            org.apache.commons.net.nntp.n r1 = r3.c
            if (r1 == 0) goto L57
            r1.b()
            r3.c = r0
        L57:
            r3.a = r0
            return
    }

    void c() {
            r5 = this;
            org.apache.commons.net.nntp.n r0 = r5.d
            if (r0 == 0) goto L21
            org.apache.commons.net.nntp.n r1 = r0.c
            r2 = 0
            r3 = r2
        L8:
            if (r0 == 0) goto L17
            r0.c = r3
            if (r1 != 0) goto L10
            r3 = r2
            goto L12
        L10:
            org.apache.commons.net.nntp.n r3 = r1.c
        L12:
            r4 = r3
            r3 = r0
            r0 = r1
            r1 = r4
            goto L8
        L17:
            r5.d = r3
        L19:
            if (r3 == 0) goto L21
            r3.c()
            org.apache.commons.net.nntp.n r3 = r3.c
            goto L19
        L21:
            return
    }
}
