package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class z0<T> implements kotlinx.coroutines.e3<T> {
    private final T a;

    @org.jetbrains.annotations.NotNull
    private final java.lang.ThreadLocal<T> b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.i.c<?> c;

    public z0(T r1, @org.jetbrains.annotations.NotNull java.lang.ThreadLocal<T> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            kotlinx.coroutines.internal.a1 r1 = new kotlinx.coroutines.internal.a1
            r1.<init>(r2)
            r0.c = r1
            return
    }

    @Override // kotlinx.coroutines.e3
    public T U(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r3) {
            r2 = this;
            java.lang.ThreadLocal<T> r3 = r2.b
            java.lang.Object r3 = r3.get()
            java.lang.ThreadLocal<T> r0 = r2.b
            T r1 = r2.a
            r0.set(r1)
            return r3
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    public <R> R fold(R r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.i.b, ? extends R> r2) {
            r0 = this;
            java.lang.Object r1 = kotlinx.coroutines.e3.a.a(r0, r1, r2)
            return r1
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @org.jetbrains.annotations.Nullable
    public <E extends kotlin.coroutines.i.b> E get(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<E> r2) {
            r1 = this;
            kotlin.coroutines.i$c r0 = r1.getKey()
            boolean r2 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r2 == 0) goto L10
            java.lang.String r2 = "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get"
            kotlin.jvm.internal.g0.n(r1, r2)
            return r1
        L10:
            r2 = 0
            return r2
    }

    @Override // kotlin.coroutines.i.b
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i.c<?> getKey() {
            r1 = this;
            kotlin.coroutines.i$c<?> r0 = r1.c
            return r0
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i minusKey(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<?> r2) {
            r1 = this;
            kotlin.coroutines.i$c r0 = r1.getKey()
            boolean r2 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r2 == 0) goto Ld
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            return r2
        Ld:
            return r1
    }

    @Override // kotlinx.coroutines.e3
    public void n(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, T r2) {
            r0 = this;
            java.lang.ThreadLocal<T> r1 = r0.b
            r1.set(r2)
            return
    }

    @Override // kotlin.coroutines.i
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i plus(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1) {
            r0 = this;
            kotlin.coroutines.i r1 = kotlinx.coroutines.e3.a.d(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ThreadLocal(value="
            r0.append(r1)
            T r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", threadLocal = "
            r0.append(r1)
            java.lang.ThreadLocal<T> r1 = r2.b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
