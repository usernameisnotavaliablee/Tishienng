package com.hp.hpl.sparta.xpath;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class t {
    public static com.hp.hpl.sparta.xpath.t d;
    private final com.hp.hpl.sparta.xpath.o a;
    private final com.hp.hpl.sparta.xpath.k b;
    private final boolean c;

    static {
            com.hp.hpl.sparta.xpath.t r0 = new com.hp.hpl.sparta.xpath.t
            com.hp.hpl.sparta.xpath.z r1 = com.hp.hpl.sparta.xpath.z.a
            com.hp.hpl.sparta.xpath.a0 r2 = com.hp.hpl.sparta.xpath.a0.a
            r0.<init>(r1, r2)
            com.hp.hpl.sparta.xpath.t.d = r0
            return
    }

    t(com.hp.hpl.sparta.xpath.c0 r3, boolean r4, com.hp.hpl.sparta.xpath.s r5) throws com.hp.hpl.sparta.xpath.XPathException, java.io.IOException {
            r2 = this;
            r2.<init>()
            r2.c = r4
            int r4 = r5.a
            r0 = -3
            if (r4 == r0) goto L52
            r1 = 42
            if (r4 == r1) goto L4d
            r1 = 46
            if (r4 == r1) goto L3a
            r1 = 64
            if (r4 != r1) goto L30
            int r4 = r5.a()
            if (r4 != r0) goto L26
            com.hp.hpl.sparta.xpath.j r4 = new com.hp.hpl.sparta.xpath.j
            java.lang.String r0 = r5.c
            r4.<init>(r0)
            r2.a = r4
            goto L84
        L26:
            com.hp.hpl.sparta.xpath.XPathException r4 = new com.hp.hpl.sparta.xpath.XPathException
            java.lang.String r0 = "after @ in node test"
            java.lang.String r1 = "name"
            r4.<init>(r3, r0, r5, r1)
            throw r4
        L30:
            com.hp.hpl.sparta.xpath.XPathException r4 = new com.hp.hpl.sparta.xpath.XPathException
            java.lang.String r0 = "at begininning of step"
            java.lang.String r1 = "'.' or '*' or name"
            r4.<init>(r3, r0, r5, r1)
            throw r4
        L3a:
            int r4 = r5.a()
            if (r4 != r1) goto L45
            com.hp.hpl.sparta.xpath.q r4 = com.hp.hpl.sparta.xpath.q.a
            r2.a = r4
            goto L84
        L45:
            r5.c()
            com.hp.hpl.sparta.xpath.z r4 = com.hp.hpl.sparta.xpath.z.a
            r2.a = r4
            goto L84
        L4d:
            com.hp.hpl.sparta.xpath.a r4 = com.hp.hpl.sparta.xpath.a.a
            r2.a = r4
            goto L84
        L52:
            java.lang.String r4 = r5.c
            java.lang.String r0 = "text"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L7b
            int r4 = r5.a()
            r0 = 40
            if (r4 != r0) goto L71
            int r4 = r5.a()
            r0 = 41
            if (r4 != r0) goto L71
            com.hp.hpl.sparta.xpath.y r4 = com.hp.hpl.sparta.xpath.y.a
            r2.a = r4
            goto L84
        L71:
            com.hp.hpl.sparta.xpath.XPathException r4 = new com.hp.hpl.sparta.xpath.XPathException
            java.lang.String r0 = "after text"
            java.lang.String r1 = "()"
            r4.<init>(r3, r0, r5, r1)
            throw r4
        L7b:
            com.hp.hpl.sparta.xpath.m r4 = new com.hp.hpl.sparta.xpath.m
            java.lang.String r0 = r5.c
            r4.<init>(r0)
            r2.a = r4
        L84:
            int r4 = r5.a()
            r0 = 91
            if (r4 != r0) goto La9
            r5.a()
            com.hp.hpl.sparta.xpath.k r4 = com.hp.hpl.sparta.xpath.n.a(r3, r5)
            r2.b = r4
            int r4 = r5.a
            r0 = 93
            if (r4 != r0) goto L9f
            r5.a()
            return
        L9f:
            com.hp.hpl.sparta.xpath.XPathException r4 = new com.hp.hpl.sparta.xpath.XPathException
            java.lang.String r0 = "after predicate expression"
            java.lang.String r1 = "]"
            r4.<init>(r3, r0, r5, r1)
            throw r4
        La9:
            com.hp.hpl.sparta.xpath.a0 r3 = com.hp.hpl.sparta.xpath.a0.a
            r2.b = r3
            return
    }

    t(com.hp.hpl.sparta.xpath.o r1, com.hp.hpl.sparta.xpath.k r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r1 = 0
            r0.c = r1
            return
    }

    public com.hp.hpl.sparta.xpath.o a() {
            r1 = this;
            com.hp.hpl.sparta.xpath.o r0 = r1.a
            return r0
    }

    public com.hp.hpl.sparta.xpath.k b() {
            r1 = this;
            com.hp.hpl.sparta.xpath.k r0 = r1.b
            return r0
    }

    public boolean c() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }

    public boolean d() {
            r1 = this;
            com.hp.hpl.sparta.xpath.o r0 = r1.a
            boolean r0 = r0.b()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.hp.hpl.sparta.xpath.o r1 = r2.a
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            com.hp.hpl.sparta.xpath.k r1 = r2.b
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
