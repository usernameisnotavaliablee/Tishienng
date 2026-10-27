package kotlin.sequences;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class n<T> extends kotlin.sequences.o<T> implements java.util.Iterator<T>, kotlin.coroutines.e<kotlin.n1>, l3.a {
    private int a;

    @org.jetbrains.annotations.Nullable
    private T b;

    @org.jetbrains.annotations.Nullable
    private java.util.Iterator<? extends T> c;

    @org.jetbrains.annotations.Nullable
    private kotlin.coroutines.e<? super kotlin.n1> d;

    public n() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.lang.Throwable i() {
            r3 = this;
            int r0 = r3.a
            r1 = 4
            if (r0 == r1) goto L29
            r1 = 5
            if (r0 == r1) goto L21
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected state of the iterator: "
            r1.append(r2)
            int r2 = r3.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            return r0
        L21:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Iterator has failed."
            r0.<init>(r1)
            return r0
        L29:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            return r0
    }

    private final T k() {
            r1 = this;
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r1.next()
            return r0
        Lb:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // kotlin.sequences.o
    @org.jetbrains.annotations.Nullable
    public java.lang.Object c(T r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            r1 = this;
            r1.b = r2
            r2 = 3
            r1.a = r2
            r1.d = r3
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r0) goto L14
            kotlin.coroutines.jvm.internal.e.c(r3)
        L14:
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r3) goto L1b
            return r2
        L1b:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    @Override // kotlin.sequences.o
    @org.jetbrains.annotations.Nullable
    public java.lang.Object f(@org.jetbrains.annotations.NotNull java.util.Iterator<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            r1 = this;
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L9
            kotlin.n1 r2 = kotlin.n1.a
            return r2
        L9:
            r1.c = r2
            r2 = 2
            r1.a = r2
            r1.d = r3
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r0) goto L1d
            kotlin.coroutines.jvm.internal.e.c(r3)
        L1d:
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r3) goto L24
            return r2
        L24:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    @Override // kotlin.coroutines.e
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i getContext() {
            r1 = this;
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            return r0
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r4 = this;
        L0:
            int r0 = r4.a
            r1 = 0
            if (r0 == 0) goto L29
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L19
            if (r0 == r2) goto L18
            r1 = 3
            if (r0 == r1) goto L18
            r1 = 4
            if (r0 != r1) goto L13
            r0 = 0
            return r0
        L13:
            java.lang.Throwable r0 = r4.i()
            throw r0
        L18:
            return r3
        L19:
            java.util.Iterator<? extends T> r0 = r4.c
            kotlin.jvm.internal.g0.m(r0)
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L27
            r4.a = r2
            return r3
        L27:
            r4.c = r1
        L29:
            r0 = 5
            r4.a = r0
            kotlin.coroutines.e<? super kotlin.n1> r0 = r4.d
            kotlin.jvm.internal.g0.m(r0)
            r4.d = r1
            kotlin.n1 r1 = kotlin.n1.a
            kotlin.Result$a r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)
            r0.resumeWith(r1)
            goto L0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.coroutines.e<kotlin.n1> j() {
            r1 = this;
            kotlin.coroutines.e<? super kotlin.n1> r0 = r1.d
            return r0
    }

    public final void m(@org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r1) {
            r0 = this;
            r0.d = r1
            return
    }

    @Override // java.util.Iterator
    public T next() {
            r3 = this;
            int r0 = r3.a
            if (r0 == 0) goto L27
            r1 = 1
            if (r0 == r1) goto L27
            r2 = 2
            if (r0 == r2) goto L1b
            r1 = 3
            if (r0 != r1) goto L16
            r0 = 0
            r3.a = r0
            T r0 = r3.b
            r1 = 0
            r3.b = r1
            return r0
        L16:
            java.lang.Throwable r0 = r3.i()
            throw r0
        L1b:
            r3.a = r1
            java.util.Iterator<? extends T> r0 = r3.c
            kotlin.jvm.internal.g0.m(r0)
            java.lang.Object r0 = r0.next()
            return r0
        L27:
            java.lang.Object r0 = r3.k()
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlin.coroutines.e
    public void resumeWith(@org.jetbrains.annotations.NotNull java.lang.Object r1) {
            r0 = this;
            kotlin.g0.n(r1)
            r1 = 4
            r0.a = r1
            return
    }
}
