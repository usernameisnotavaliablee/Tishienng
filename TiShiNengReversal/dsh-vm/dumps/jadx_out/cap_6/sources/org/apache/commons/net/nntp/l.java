package org.apache.commons.net.nntp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class l implements java.util.Iterator<java.lang.String>, java.lang.Iterable<java.lang.String> {
    private final java.io.BufferedReader a;
    private java.lang.String b;
    private java.lang.Exception c;

    l(java.io.BufferedReader r2) throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    l(java.io.BufferedReader r1, boolean r2) throws java.io.IOException {
            r0 = this;
            r0.<init>()
            if (r2 == 0) goto Lb
            org.apache.commons.net.io.d r2 = new org.apache.commons.net.io.d
            r2.<init>(r1)
            r1 = r2
        Lb:
            r0.a = r1
            java.lang.String r2 = r1.readLine()
            r0.b = r2
            if (r2 != 0) goto L18
            org.apache.commons.net.io.l.a(r1)
        L18:
            return
    }

    public java.lang.String a() throws java.util.NoSuchElementException {
            r2 = this;
            java.lang.Exception r0 = r2.c
            if (r0 != 0) goto L29
            java.lang.String r0 = r2.b
            if (r0 == 0) goto L23
            java.io.BufferedReader r1 = r2.a     // Catch: java.io.IOException -> L18
            java.lang.String r1 = r1.readLine()     // Catch: java.io.IOException -> L18
            r2.b = r1     // Catch: java.io.IOException -> L18
            if (r1 != 0) goto L1a
            java.io.BufferedReader r1 = r2.a     // Catch: java.io.IOException -> L18
            org.apache.commons.net.io.l.a(r1)     // Catch: java.io.IOException -> L18
            return r0
        L18:
            r1 = move-exception
            goto L1b
        L1a:
            return r0
        L1b:
            r2.c = r1
            java.io.BufferedReader r1 = r2.a
            org.apache.commons.net.io.l.a(r1)
            return r0
        L23:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L29:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.Exception r1 = r2.c
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r2 = this;
            java.lang.Exception r0 = r2.c
            if (r0 != 0) goto Lc
            java.lang.String r0 = r2.b
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
        Lc:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.Exception r1 = r2.c
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.lang.String> iterator() {
            r0 = this;
            return r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.String next() {
            r1 = this;
            java.lang.String r0 = r1.a()
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
