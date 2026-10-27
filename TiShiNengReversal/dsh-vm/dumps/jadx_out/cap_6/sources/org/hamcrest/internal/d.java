package org.hamcrest.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d<T> implements java.util.Iterator<org.hamcrest.l> {
    private java.util.Iterator<T> a;

    public d(java.util.Iterator<T> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public org.hamcrest.l a() {
            r2 = this;
            org.hamcrest.internal.c r0 = new org.hamcrest.internal.c
            java.util.Iterator<T> r1 = r2.a
            java.lang.Object r1 = r1.next()
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            java.util.Iterator<T> r0 = r1.a
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ org.hamcrest.l next() {
            r1 = this;
            org.hamcrest.l r0 = r1.a()
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r1 = this;
            java.util.Iterator<T> r0 = r1.a
            r0.remove()
            return
    }
}
