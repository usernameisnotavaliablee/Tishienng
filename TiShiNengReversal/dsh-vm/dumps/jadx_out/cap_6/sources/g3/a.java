package g3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "2.1")
    @kotlin.PublishedApi
    public static final int a(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicInteger r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
        L5:
            int r0 = r1.get()
            if (r2 != r0) goto L12
            boolean r0 = r1.compareAndSet(r2, r3)
            if (r0 == 0) goto L5
            return r2
        L12:
            return r0
    }

    @kotlin.SinceKotlin(version = "2.1")
    @kotlin.PublishedApi
    public static final int b(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicIntegerArray r1, int r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
        L5:
            int r0 = r1.get(r2)
            if (r3 != r0) goto L12
            boolean r0 = r1.compareAndSet(r2, r3, r4)
            if (r0 == 0) goto L5
            return r3
        L12:
            return r0
    }

    @kotlin.SinceKotlin(version = "2.1")
    @kotlin.PublishedApi
    public static final long c(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicLong r3, long r4, long r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
        L5:
            long r0 = r3.get()
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L14
            boolean r0 = r3.compareAndSet(r4, r6)
            if (r0 == 0) goto L5
            return r4
        L14:
            return r0
    }

    @kotlin.SinceKotlin(version = "2.1")
    @kotlin.PublishedApi
    public static final long d(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicLongArray r3, int r4, long r5, long r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
        L5:
            long r0 = r3.get(r4)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L14
            boolean r0 = r3.compareAndSet(r4, r5, r7)
            if (r0 == 0) goto L5
            return r5
        L14:
            return r0
    }

    @kotlin.SinceKotlin(version = "2.1")
    @kotlin.PublishedApi
    public static final <T> T e(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicReference<T> r1, T r2, T r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
        L5:
            java.lang.Object r0 = r1.get()
            if (r2 != r0) goto L12
            boolean r0 = androidx.camera.view.p.a(r1, r2, r3)
            if (r0 == 0) goto L5
            return r2
        L12:
            return r0
    }

    @kotlin.SinceKotlin(version = "2.1")
    @kotlin.PublishedApi
    public static final <T> T f(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicReferenceArray<T> r1, int r2, T r3, T r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
        L5:
            java.lang.Object r0 = r1.get(r2)
            if (r3 != r0) goto L12
            boolean r0 = com.google.common.util.concurrent.b.a(r1, r2, r3, r4)
            if (r0 == 0) goto L5
            return r3
        L12:
            return r0
    }

    @kotlin.SinceKotlin(version = "2.1")
    @kotlin.PublishedApi
    public static final boolean g(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicBoolean r1, boolean r2, boolean r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
        L5:
            boolean r0 = r1.get()
            if (r2 != r0) goto L12
            boolean r0 = r1.compareAndSet(r2, r3)
            if (r0 == 0) goto L5
            return r2
        L12:
            return r0
    }
}
