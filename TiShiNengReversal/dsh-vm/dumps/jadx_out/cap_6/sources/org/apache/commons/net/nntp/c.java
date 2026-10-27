package org.apache.commons.net.nntp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class c implements java.util.Iterator<org.apache.commons.net.nntp.a>, java.lang.Iterable<org.apache.commons.net.nntp.a> {
    private final java.util.Iterator<java.lang.String> a;

    public c(java.lang.Iterable<java.lang.String> r1) {
            r0 = this;
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
            r0.a = r1
            return
    }

    public org.apache.commons.net.nntp.a a() {
            r1 = this;
            java.util.Iterator<java.lang.String> r0 = r1.a
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            org.apache.commons.net.nntp.a r0 = org.apache.commons.net.nntp.f.P0(r0)
            return r0
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            java.util.Iterator<java.lang.String> r0 = r1.a
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<org.apache.commons.net.nntp.a> iterator() {
            r0 = this;
            return r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ org.apache.commons.net.nntp.a next() {
            r1 = this;
            org.apache.commons.net.nntp.a r0 = r1.a()
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r1 = this;
            java.util.Iterator<java.lang.String> r0 = r1.a
            r0.remove()
            return
    }
}
