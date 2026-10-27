package kotlin.reflect.jvm.internal.impl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class z<K, V> {

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> a;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicInteger b;

    public z() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2.a = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r2.b = r0
            return
    }

    static /* synthetic */ int a(kotlin.reflect.jvm.internal.impl.util.z r0, java.lang.String r1) {
            int r0 = g(r0, r1)
            return r0
    }

    private static final int g(kotlin.reflect.jvm.internal.impl.util.z r1, java.lang.String r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.concurrent.atomic.AtomicInteger r1 = r1.b
            int r1 = r1.getAndIncrement()
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.lang.Integer> b() {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r0 = r1.a
            return r0
    }

    public abstract int c(@org.jetbrains.annotations.NotNull java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Integer> r3);

    @org.jetbrains.annotations.NotNull
    public final <T extends V, KK extends K> kotlin.reflect.jvm.internal.impl.util.n<K, V, T> d(@org.jetbrains.annotations.NotNull kotlin.reflect.d<KK> r2) {
            r1 = this;
            java.lang.String r0 = "kClass"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.util.n r0 = new kotlin.reflect.jvm.internal.impl.util.n
            int r2 = r1.f(r2)
            r0.<init>(r2)
            return r0
    }

    public final int e(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "keyQualifiedName"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r0 = r2.a
            kotlin.reflect.jvm.internal.impl.util.y r1 = new kotlin.reflect.jvm.internal.impl.util.y
            r1.<init>(r2)
            int r3 = r2.c(r0, r3, r1)
            return r3
    }

    public final <T extends K> int f(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r2) {
            r1 = this;
            java.lang.String r0 = "kClass"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = r2.x()
            kotlin.jvm.internal.g0.m(r2)
            int r2 = r1.e(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    protected final java.util.Collection<java.lang.Integer> h() {
            r2 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r0 = r2.a
            java.util.Collection r0 = r0.values()
            java.lang.String r1 = "<get-values>(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }
}
