package kotlin.concurrent.atomics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAtomicArrays.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicArrays.common.kt\nkotlin/concurrent/atomics/AtomicArraysKt__AtomicArrays_commonKt\n*L\n1#1,768:1\n666#1:769\n*S KotlinDebug\n*F\n+ 1 AtomicArrays.common.kt\nkotlin/concurrent/atomics/AtomicArraysKt__AtomicArrays_commonKt\n*L\n678#1:769\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class b {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    public static final /* synthetic */ <T> java.util.concurrent.atomic.AtomicReferenceArray<T> a(int r3, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T> r4) {
            java.lang.String r0 = "init"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "T"
            r1 = 0
            kotlin.jvm.internal.g0.y(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r3]
        Ld:
            if (r1 >= r3) goto L1c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r4.invoke(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto Ld
        L1c:
            java.util.concurrent.atomic.AtomicReferenceArray r3 = new java.util.concurrent.atomic.AtomicReferenceArray
            r3.<init>(r0)
            return r3
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    @org.jetbrains.annotations.NotNull
    public static final java.util.concurrent.atomic.AtomicIntegerArray b(int r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> r4) {
            java.lang.String r0 = "init"
            kotlin.jvm.internal.g0.p(r4, r0)
            int[] r0 = new int[r3]
            r1 = 0
        L8:
            if (r1 >= r3) goto L1d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r4.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L1d:
            java.util.concurrent.atomic.AtomicIntegerArray r3 = new java.util.concurrent.atomic.AtomicIntegerArray
            r3.<init>(r0)
            return r3
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    @org.jetbrains.annotations.NotNull
    public static final java.util.concurrent.atomic.AtomicLongArray c(int r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Long> r5) {
            java.lang.String r0 = "init"
            kotlin.jvm.internal.g0.p(r5, r0)
            long[] r0 = new long[r4]
            r1 = 0
        L8:
            if (r1 >= r4) goto L1d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L1d:
            java.util.concurrent.atomic.AtomicLongArray r4 = new java.util.concurrent.atomic.AtomicLongArray
            r4.<init>(r0)
            return r4
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.2")
    public static final /* synthetic */ <T> java.util.concurrent.atomic.AtomicReferenceArray<T> d(int r3) {
            java.lang.String r0 = "T?"
            r1 = 0
            kotlin.jvm.internal.g0.y(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r3]
        L8:
            if (r1 >= r3) goto L10
            r2 = 0
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L10:
            java.util.concurrent.atomic.AtomicReferenceArray r3 = new java.util.concurrent.atomic.AtomicReferenceArray
            r3.<init>(r0)
            return r3
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    public static final int e(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicIntegerArray r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = -1
            int r1 = r1.addAndGet(r2, r0)
            return r1
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    public static final long f(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicLongArray r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = -1
            long r2 = r2.addAndGet(r3, r0)
            return r2
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    public static final int g(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicIntegerArray r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = -1
            int r1 = r1.getAndAdd(r2, r0)
            return r1
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    public static final long h(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicLongArray r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = -1
            long r2 = r2.getAndAdd(r3, r0)
            return r2
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    public static final int i(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicIntegerArray r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 1
            int r1 = r1.getAndAdd(r2, r0)
            return r1
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    public static final long j(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicLongArray r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 1
            long r2 = r2.getAndAdd(r3, r0)
            return r2
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    public static final int k(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicIntegerArray r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 1
            int r1 = r1.addAndGet(r2, r0)
            return r1
    }

    @kotlin.concurrent.atomics.ExperimentalAtomicApi
    @kotlin.SinceKotlin(version = "2.1")
    public static final long l(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicLongArray r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 1
            long r2 = r2.addAndGet(r3, r0)
            return r2
    }
}
