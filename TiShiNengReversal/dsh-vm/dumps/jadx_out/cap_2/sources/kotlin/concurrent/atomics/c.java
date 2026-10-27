package kotlin.concurrent.atomics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class c extends kotlin.concurrent.atomics.b {
    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.internal.InlineOnly
    private static final <T> void A(java.util.concurrent.atomic.AtomicReferenceArray<T> r2, int r3, kotlin.jvm.functions.Function1<? super T, ? extends T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r4, r0)
        La:
            java.lang.Object r0 = r2.get(r3)
            java.lang.Object r1 = r4.invoke(r0)
            boolean r0 = com.google.common.util.concurrent.b.a(r2, r3, r0, r1)
            if (r0 == 0) goto La
            return
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    @org.jetbrains.annotations.NotNull
    public static final java.util.concurrent.atomic.AtomicIntegerArray m(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicIntegerArray r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    @org.jetbrains.annotations.NotNull
    public static final java.util.concurrent.atomic.AtomicLongArray n(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicLongArray r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.concurrent.atomic.AtomicReferenceArray<T> o(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicReferenceArray<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    @org.jetbrains.annotations.NotNull
    public static final java.util.concurrent.atomic.AtomicIntegerArray p(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicIntegerArray r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    @org.jetbrains.annotations.NotNull
    public static final java.util.concurrent.atomic.AtomicLongArray q(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicLongArray r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.concurrent.atomic.AtomicReferenceArray<T> r(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicReferenceArray<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            return r1
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.internal.InlineOnly
    private static final int s(java.util.concurrent.atomic.AtomicIntegerArray r2, int r3, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r4, r0)
        La:
            int r0 = r2.get(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            boolean r1 = r2.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto La
            return r0
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.internal.InlineOnly
    private static final long t(java.util.concurrent.atomic.AtomicLongArray r7, int r8, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Long> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r9, r0)
        La:
            long r3 = r7.get(r8)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.Object r0 = r9.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r5 = r0.longValue()
            r1 = r7
            r2 = r8
            boolean r7 = r1.compareAndSet(r2, r3, r5)
            if (r7 == 0) goto L25
            return r3
        L25:
            r7 = r1
            r8 = r2
            goto La
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.internal.InlineOnly
    private static final <T> T u(java.util.concurrent.atomic.AtomicReferenceArray<T> r2, int r3, kotlin.jvm.functions.Function1<? super T, ? extends T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r4, r0)
        La:
            java.lang.Object r0 = r2.get(r3)
            java.lang.Object r1 = r4.invoke(r0)
            boolean r1 = com.google.common.util.concurrent.b.a(r2, r3, r0, r1)
            if (r1 == 0) goto La
            return r0
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.internal.InlineOnly
    private static final int v(java.util.concurrent.atomic.AtomicIntegerArray r2, int r3, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r4, r0)
        La:
            int r0 = r2.get(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            boolean r0 = r2.compareAndSet(r3, r0, r1)
            if (r0 == 0) goto La
            return r1
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.internal.InlineOnly
    private static final long w(java.util.concurrent.atomic.AtomicLongArray r7, int r8, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Long> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r9, r0)
        La:
            long r3 = r7.get(r8)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.Object r0 = r9.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r5 = r0.longValue()
            r1 = r7
            r2 = r8
            boolean r7 = r1.compareAndSet(r2, r3, r5)
            if (r7 == 0) goto L25
            return r5
        L25:
            r7 = r1
            r8 = r2
            goto La
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.internal.InlineOnly
    private static final <T> T x(java.util.concurrent.atomic.AtomicReferenceArray<T> r2, int r3, kotlin.jvm.functions.Function1<? super T, ? extends T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r4, r0)
        La:
            java.lang.Object r0 = r2.get(r3)
            java.lang.Object r1 = r4.invoke(r0)
            boolean r0 = com.google.common.util.concurrent.b.a(r2, r3, r0, r1)
            if (r0 == 0) goto La
            return r1
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.internal.InlineOnly
    private static final void y(java.util.concurrent.atomic.AtomicIntegerArray r2, int r3, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r4, r0)
        La:
            int r0 = r2.get(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            boolean r0 = r2.compareAndSet(r3, r0, r1)
            if (r0 == 0) goto La
            return
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.2")
    @kotlin.internal.InlineOnly
    private static final void z(java.util.concurrent.atomic.AtomicLongArray r7, int r8, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Long> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r9, r0)
        La:
            long r3 = r7.get(r8)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.Object r0 = r9.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r5 = r0.longValue()
            r1 = r7
            r2 = r8
            boolean r7 = r1.compareAndSet(r2, r3, r5)
            if (r7 == 0) goto L25
            return
        L25:
            r7 = r1
            r8 = r2
            goto La
    }
}
