package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
abstract class a<E> extends com.bumptech.glide.repackaged.com.google.common.collect.v0<E> {
    private final int a;
    private int b;

    protected a(int r1, int r2) {
            r0 = this;
            r0.<init>()
            com.bumptech.glide.repackaged.com.google.common.base.d.k(r2, r1)
            r0.a = r1
            r0.b = r2
            return
    }

    protected abstract E a(int r1);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.b
            int r1 = r2.a
            if (r0 >= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            int r0 = r1.b
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L11
            int r0 = r2.b
            int r1 = r0 + 1
            r2.b = r1
            java.lang.Object r0 = r2.a(r0)
            return r0
        L11:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @Override // java.util.ListIterator
    public final E previous() {
            r1 = this;
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L11
            int r0 = r1.b
            int r0 = r0 + (-1)
            r1.b = r0
            java.lang.Object r0 = r1.a(r0)
            return r0
        L11:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            int r0 = r1.b
            int r0 = r0 + (-1)
            return r0
    }
}
