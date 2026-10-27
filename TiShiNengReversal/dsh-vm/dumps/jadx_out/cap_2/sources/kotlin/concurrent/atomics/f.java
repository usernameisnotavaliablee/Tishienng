package kotlin.concurrent.atomics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class f extends kotlin.concurrent.atomics.e {
    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    @org.jetbrains.annotations.NotNull
    public static final java.util.concurrent.atomic.AtomicBoolean m(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicBoolean r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    @org.jetbrains.annotations.NotNull
    public static final java.util.concurrent.atomic.AtomicInteger n(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicInteger r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    @org.jetbrains.annotations.NotNull
    public static final java.util.concurrent.atomic.AtomicLong o(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicLong r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.concurrent.atomic.AtomicReference<T> p(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicReference<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    @org.jetbrains.annotations.NotNull
    public static final java.util.concurrent.atomic.AtomicBoolean q(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicBoolean r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    @org.jetbrains.annotations.NotNull
    public static final java.util.concurrent.atomic.AtomicInteger r(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicInteger r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    @org.jetbrains.annotations.NotNull
    public static final java.util.concurrent.atomic.AtomicLong s(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicLong r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.concurrent.atomic.AtomicReference<T> t(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicReference<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.internal.InlineOnly
    private static final int u(java.util.concurrent.atomic.AtomicInteger r2, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
        La:
            int r0 = r2.get()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            boolean r1 = r2.compareAndSet(r0, r1)
            if (r1 == 0) goto La
            return r0
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.internal.InlineOnly
    private static final void update(java.util.concurrent.atomic.AtomicInteger r2, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
        La:
            int r0 = r2.get()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto La
            return
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.internal.InlineOnly
    private static final void update(java.util.concurrent.atomic.AtomicLong r4, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Long> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r5, r0)
        La:
            long r0 = r4.get()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            boolean r0 = r4.compareAndSet(r0, r2)
            if (r0 == 0) goto La
            return
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.internal.InlineOnly
    private static final <T> void update(java.util.concurrent.atomic.AtomicReference<T> r2, kotlin.jvm.functions.Function1<? super T, ? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
        La:
            java.lang.Object r0 = r2.get()
            java.lang.Object r1 = r3.invoke(r0)
            boolean r0 = androidx.camera.view.p.a(r2, r0, r1)
            if (r0 == 0) goto La
            return
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.internal.InlineOnly
    private static final long v(java.util.concurrent.atomic.AtomicLong r4, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Long> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r5, r0)
        La:
            long r0 = r4.get()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            boolean r2 = r4.compareAndSet(r0, r2)
            if (r2 == 0) goto La
            return r0
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.internal.InlineOnly
    private static final <T> T w(java.util.concurrent.atomic.AtomicReference<T> r2, kotlin.jvm.functions.Function1<? super T, ? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
        La:
            java.lang.Object r0 = r2.get()
            java.lang.Object r1 = r3.invoke(r0)
            boolean r1 = androidx.camera.view.p.a(r2, r0, r1)
            if (r1 == 0) goto La
            return r0
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.internal.InlineOnly
    private static final int x(java.util.concurrent.atomic.AtomicInteger r2, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
        La:
            int r0 = r2.get()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto La
            return r1
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.internal.InlineOnly
    private static final long y(java.util.concurrent.atomic.AtomicLong r4, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Long> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r5, r0)
        La:
            long r0 = r4.get()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            boolean r0 = r4.compareAndSet(r0, r2)
            if (r0 == 0) goto La
            return r2
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.internal.InlineOnly
    private static final <T> T z(java.util.concurrent.atomic.AtomicReference<T> r2, kotlin.jvm.functions.Function1<? super T, ? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r3, r0)
        La:
            java.lang.Object r0 = r2.get()
            java.lang.Object r1 = r3.invoke(r0)
            boolean r0 = androidx.camera.view.p.a(r2, r0, r1)
            if (r0 == 0) goto La
            return r1
    }
}
