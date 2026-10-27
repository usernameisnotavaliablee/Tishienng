package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ReadOnlyIterator<T> implements java.util.Iterator<T> {
    private final java.util.Iterator<? extends T> iterator;

    public ReadOnlyIterator(java.util.Iterator<? extends T> r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.iterator = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "iterator"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            java.util.Iterator<? extends T> r0 = r1.iterator
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public T next() {
            r1 = this;
            java.util.Iterator<? extends T> r0 = r1.iterator
            java.lang.Object r0 = r0.next()
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "read-only"
            r0.<init>(r1)
            throw r0
    }
}
