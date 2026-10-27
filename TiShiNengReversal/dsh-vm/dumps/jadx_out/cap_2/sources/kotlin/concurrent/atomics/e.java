package kotlin.concurrent.atomics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class e {
    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    public static final int a(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicInteger r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = -1
            int r1 = r1.addAndGet(r0)
            return r1
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    public static final long b(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicLong r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = -1
            long r0 = r2.addAndGet(r0)
            return r0
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    public static final int c(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicInteger r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = -1
            int r1 = r1.getAndAdd(r0)
            return r1
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    public static final long d(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicLong r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = -1
            long r0 = r2.getAndAdd(r0)
            return r0
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    public static final int e(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicInteger r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 1
            int r1 = r1.getAndAdd(r0)
            return r1
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    public static final long f(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicLong r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 1
            long r0 = r2.getAndAdd(r0)
            return r0
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    public static final int g(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicInteger r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 1
            int r1 = r1.addAndGet(r0)
            return r1
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    public static final long h(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicLong r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 1
            long r0 = r2.addAndGet(r0)
            return r0
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    public static final void i(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicInteger r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r2 = -r2
            r1.addAndGet(r2)
            return
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    public static final void j(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicLong r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            long r2 = -r2
            r1.addAndGet(r2)
            return
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    public static final void k(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicInteger r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.addAndGet(r2)
            return
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    public static final void l(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicLong r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.addAndGet(r2)
            return
    }
}
