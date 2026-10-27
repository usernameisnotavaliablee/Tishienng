package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class AbstractSequentialIterator<T> extends com.google.common.collect.UnmodifiableIterator<T> {

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private T nextOrNull;

    protected AbstractSequentialIterator(@org.checkerframework.checker.nullness.compatqual.NullableDecl T r1) {
            r0 = this;
            r0.<init>()
            r0.nextOrNull = r1
            return
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    protected abstract T computeNext(T r1);

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            T r0 = r1.nextOrNull
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final T next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L19
            T r0 = r2.nextOrNull     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r1 = r2.computeNext(r0)
            r2.nextOrNull = r1
            return r0
        Lf:
            r0 = move-exception
            T r1 = r2.nextOrNull
            java.lang.Object r1 = r2.computeNext(r1)
            r2.nextOrNull = r1
            throw r0
        L19:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }
}
