package com.hp.hpl.sparta.xpath;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class c0 {
    private static final int d = 0;
    private static java.util.Hashtable e;
    private java.util.Stack a;
    private boolean b;
    private java.lang.String c;

    static {
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            com.hp.hpl.sparta.xpath.c0.e = r0
            return
    }

    private c0(java.lang.String r4) throws com.hp.hpl.sparta.xpath.XPathException {
            r3 = this;
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            byte[] r2 = r4.getBytes()
            r1.<init>(r2)
            r0.<init>(r1)
            r3.<init>(r4, r0)
            return
    }

    private c0(java.lang.String r6, java.io.Reader r7) throws com.hp.hpl.sparta.xpath.XPathException {
            r5 = this;
            r5.<init>()
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r5.a = r0
            r5.c = r6     // Catch: java.io.IOException -> L3a
            com.hp.hpl.sparta.xpath.s r6 = new com.hp.hpl.sparta.xpath.s     // Catch: java.io.IOException -> L3a
            r6.<init>(r7)     // Catch: java.io.IOException -> L3a
            r7 = 47
            r6.b(r7)     // Catch: java.io.IOException -> L3a
            r0 = 46
            r6.b(r0)     // Catch: java.io.IOException -> L3a
            r0 = 58
            r6.d(r0, r0)     // Catch: java.io.IOException -> L3a
            r0 = 95
            r6.d(r0, r0)     // Catch: java.io.IOException -> L3a
            int r0 = r6.a()     // Catch: java.io.IOException -> L3a
            r1 = 1
            r2 = 0
            if (r0 != r7) goto L3e
            r5.b = r1     // Catch: java.io.IOException -> L3a
            int r0 = r6.a()     // Catch: java.io.IOException -> L3a
            if (r0 != r7) goto L3c
            r6.a()     // Catch: java.io.IOException -> L3a
            r0 = 1
            goto L41
        L3a:
            r6 = move-exception
            goto L74
        L3c:
            r0 = 0
            goto L41
        L3e:
            r5.b = r2     // Catch: java.io.IOException -> L3a
            goto L3c
        L41:
            java.util.Stack r3 = r5.a     // Catch: java.io.IOException -> L3a
            com.hp.hpl.sparta.xpath.t r4 = new com.hp.hpl.sparta.xpath.t     // Catch: java.io.IOException -> L3a
            r4.<init>(r5, r0, r6)     // Catch: java.io.IOException -> L3a
            r3.push(r4)     // Catch: java.io.IOException -> L3a
        L4b:
            int r0 = r6.a     // Catch: java.io.IOException -> L3a
            if (r0 != r7) goto L66
            int r0 = r6.a()     // Catch: java.io.IOException -> L3a
            if (r0 != r7) goto L5a
            r6.a()     // Catch: java.io.IOException -> L3a
            r0 = 1
            goto L5b
        L5a:
            r0 = 0
        L5b:
            java.util.Stack r3 = r5.a     // Catch: java.io.IOException -> L3a
            com.hp.hpl.sparta.xpath.t r4 = new com.hp.hpl.sparta.xpath.t     // Catch: java.io.IOException -> L3a
            r4.<init>(r5, r0, r6)     // Catch: java.io.IOException -> L3a
            r3.push(r4)     // Catch: java.io.IOException -> L3a
            goto L4b
        L66:
            r7 = -1
            if (r0 != r7) goto L6a
            return
        L6a:
            com.hp.hpl.sparta.xpath.XPathException r7 = new com.hp.hpl.sparta.xpath.XPathException     // Catch: java.io.IOException -> L3a
            java.lang.String r0 = "at end of XPATH expression"
            java.lang.String r1 = "end of expression"
            r7.<init>(r5, r0, r6, r1)     // Catch: java.io.IOException -> L3a
            throw r7     // Catch: java.io.IOException -> L3a
        L74:
            com.hp.hpl.sparta.xpath.XPathException r7 = new com.hp.hpl.sparta.xpath.XPathException
            r7.<init>(r5, r6)
            throw r7
    }

    private c0(boolean r4, com.hp.hpl.sparta.xpath.t[] r5) {
            r3 = this;
            r3.<init>()
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r3.a = r0
            r0 = 0
        Lb:
            int r1 = r5.length
            if (r0 >= r1) goto L18
            java.util.Stack r1 = r3.a
            r2 = r5[r0]
            r1.addElement(r2)
            int r0 = r0 + 1
            goto Lb
        L18:
            r3.b = r4
            r4 = 0
            r3.c = r4
            return
    }

    private java.lang.String a() {
            r5 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.util.Stack r1 = r5.a
            java.util.Enumeration r1 = r1.elements()
            r2 = 1
        Lc:
            boolean r3 = r1.hasMoreElements()
            if (r3 == 0) goto L35
            java.lang.Object r3 = r1.nextElement()
            com.hp.hpl.sparta.xpath.t r3 = (com.hp.hpl.sparta.xpath.t) r3
            if (r2 == 0) goto L1e
            boolean r2 = r5.b
            if (r2 == 0) goto L2c
        L1e:
            r2 = 47
            r0.append(r2)
            boolean r4 = r3.c()
            if (r4 == 0) goto L2c
            r0.append(r2)
        L2c:
            java.lang.String r2 = r3.toString()
            r0.append(r2)
            r2 = 0
            goto Lc
        L35:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static com.hp.hpl.sparta.xpath.c0 b(java.lang.String r3) throws com.hp.hpl.sparta.xpath.XPathException {
            java.util.Hashtable r0 = com.hp.hpl.sparta.xpath.c0.e
            monitor-enter(r0)
            java.util.Hashtable r1 = com.hp.hpl.sparta.xpath.c0.e     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L18
            com.hp.hpl.sparta.xpath.c0 r1 = (com.hp.hpl.sparta.xpath.c0) r1     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            com.hp.hpl.sparta.xpath.c0 r1 = new com.hp.hpl.sparta.xpath.c0     // Catch: java.lang.Throwable -> L18
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L18
            java.util.Hashtable r2 = com.hp.hpl.sparta.xpath.c0.e     // Catch: java.lang.Throwable -> L18
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r3 = move-exception
            goto L1c
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r3
    }

    public static com.hp.hpl.sparta.xpath.c0 c(boolean r2, com.hp.hpl.sparta.xpath.t[] r3) {
            com.hp.hpl.sparta.xpath.c0 r0 = new com.hp.hpl.sparta.xpath.c0
            r0.<init>(r2, r3)
            java.lang.String r2 = r0.toString()
            java.util.Hashtable r3 = com.hp.hpl.sparta.xpath.c0.e
            monitor-enter(r3)
            java.util.Hashtable r1 = com.hp.hpl.sparta.xpath.c0.e     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L1d
            com.hp.hpl.sparta.xpath.c0 r1 = (com.hp.hpl.sparta.xpath.c0) r1     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L1f
            java.util.Hashtable r1 = com.hp.hpl.sparta.xpath.c0.e     // Catch: java.lang.Throwable -> L1d
            r1.put(r2, r0)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            return r0
        L1d:
            r2 = move-exception
            goto L21
        L1f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            return r1
        L21:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r2
    }

    public static boolean i(java.lang.String r0) throws com.hp.hpl.sparta.xpath.XPathException, java.io.IOException {
            com.hp.hpl.sparta.xpath.c0 r0 = b(r0)
            boolean r0 = r0.h()
            return r0
    }

    public java.lang.Object clone() {
            r5 = this;
            java.util.Stack r0 = r5.a
            int r0 = r0.size()
            com.hp.hpl.sparta.xpath.t[] r1 = new com.hp.hpl.sparta.xpath.t[r0]
            java.util.Stack r2 = r5.a
            java.util.Enumeration r2 = r2.elements()
            r3 = 0
        Lf:
            if (r3 >= r0) goto L1c
            java.lang.Object r4 = r2.nextElement()
            com.hp.hpl.sparta.xpath.t r4 = (com.hp.hpl.sparta.xpath.t) r4
            r1[r3] = r4
            int r3 = r3 + 1
            goto Lf
        L1c:
            com.hp.hpl.sparta.xpath.c0 r0 = new com.hp.hpl.sparta.xpath.c0
            boolean r2 = r5.b
            r0.<init>(r2, r1)
            return r0
    }

    public java.lang.String d() throws com.hp.hpl.sparta.xpath.XPathException {
            r2 = this;
            java.util.Stack r0 = r2.a
            java.lang.Object r0 = r0.peek()
            com.hp.hpl.sparta.xpath.t r0 = (com.hp.hpl.sparta.xpath.t) r0
            com.hp.hpl.sparta.xpath.k r0 = r0.b()
            boolean r1 = r0 instanceof com.hp.hpl.sparta.xpath.d
            if (r1 == 0) goto L17
            com.hp.hpl.sparta.xpath.d r0 = (com.hp.hpl.sparta.xpath.d) r0
            java.lang.String r0 = r0.b()
            return r0
        L17:
            com.hp.hpl.sparta.xpath.XPathException r0 = new com.hp.hpl.sparta.xpath.XPathException
            java.lang.String r1 = "has no indexing attribute name (must end with predicate of the form [@attrName]"
            r0.<init>(r2, r1)
            throw r0
    }

    public java.lang.String e() throws com.hp.hpl.sparta.xpath.XPathException {
            r2 = this;
            java.util.Stack r0 = r2.a
            java.lang.Object r0 = r0.peek()
            com.hp.hpl.sparta.xpath.t r0 = (com.hp.hpl.sparta.xpath.t) r0
            com.hp.hpl.sparta.xpath.k r0 = r0.b()
            boolean r1 = r0 instanceof com.hp.hpl.sparta.xpath.c
            if (r1 == 0) goto L17
            com.hp.hpl.sparta.xpath.c r0 = (com.hp.hpl.sparta.xpath.c) r0
            java.lang.String r0 = r0.b()
            return r0
        L17:
            r0 = 0
            return r0
    }

    public java.util.Enumeration f() {
            r1 = this;
            java.util.Stack r0 = r1.a
            java.util.Enumeration r0 = r0.elements()
            return r0
    }

    public boolean g() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }

    public boolean h() {
            r1 = this;
            java.util.Stack r0 = r1.a
            java.lang.Object r0 = r0.peek()
            com.hp.hpl.sparta.xpath.t r0 = (com.hp.hpl.sparta.xpath.t) r0
            boolean r0 = r0.d()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.c
            if (r0 != 0) goto La
            java.lang.String r0 = r1.a()
            r1.c = r0
        La:
            java.lang.String r0 = r1.c
            return r0
    }
}
