package io.netty.channel.group;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class CombinedIterator<E> implements java.util.Iterator<E> {
    private java.util.Iterator<E> currentIterator;
    private final java.util.Iterator<E> i1;

    /* renamed from: i2, reason: collision with root package name */
    private final java.util.Iterator<E> f48i2;

    CombinedIterator(java.util.Iterator<E> r1, java.util.Iterator<E> r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L16
            if (r2 == 0) goto Le
            r0.i1 = r1
            r0.f48i2 = r2
            r0.currentIterator = r1
            return
        Le:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "i2"
            r1.<init>(r2)
            throw r1
        L16:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "i1"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r2 = this;
        L0:
            java.util.Iterator<E> r0 = r2.currentIterator
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            java.util.Iterator<E> r0 = r2.currentIterator
            java.util.Iterator<E> r1 = r2.i1
            if (r0 != r1) goto L15
            java.util.Iterator<E> r0 = r2.f48i2
            r2.currentIterator = r0
            goto L0
        L15:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public E next() {
            r3 = this;
        L0:
            java.util.Iterator<E> r0 = r3.currentIterator     // Catch: java.util.NoSuchElementException -> L7
            java.lang.Object r0 = r0.next()     // Catch: java.util.NoSuchElementException -> L7
            return r0
        L7:
            r0 = move-exception
            java.util.Iterator<E> r1 = r3.currentIterator
            java.util.Iterator<E> r2 = r3.i1
            if (r1 != r2) goto L13
            java.util.Iterator<E> r0 = r3.f48i2
            r3.currentIterator = r0
            goto L0
        L13:
            throw r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r1 = this;
            java.util.Iterator<E> r0 = r1.currentIterator
            r0.remove()
            return
    }
}
