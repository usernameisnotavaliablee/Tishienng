package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class s0 {
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.r0 a(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r3) {
            kotlinx.coroutines.internal.h r0 = new kotlinx.coroutines.internal.h
            kotlinx.coroutines.e2$b r1 = kotlinx.coroutines.e2.s0
            kotlin.coroutines.i$b r1 = r3.get(r1)
            if (r1 == 0) goto Lb
            goto L15
        Lb:
            r1 = 1
            r2 = 0
            kotlinx.coroutines.b0 r1 = kotlinx.coroutines.h2.c(r2, r1, r2)
            kotlin.coroutines.i r3 = r3.plus(r1)
        L15:
            r0.<init>(r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.r0 b() {
            kotlinx.coroutines.internal.h r0 = new kotlinx.coroutines.internal.h
            r1 = 0
            r2 = 1
            kotlinx.coroutines.b0 r1 = kotlinx.coroutines.d3.c(r1, r2, r1)
            kotlinx.coroutines.p2 r2 = kotlinx.coroutines.g1.e()
            kotlin.coroutines.i r1 = r1.plus(r2)
            r0.<init>(r1)
            return r0
    }

    public static final void c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r0, @org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
            java.util.concurrent.CancellationException r1 = kotlinx.coroutines.s1.a(r1, r2)
            d(r0, r1)
            return
    }

    public static final void d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r2, @org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r3) {
            kotlin.coroutines.i r0 = r2.getCoroutineContext()
            kotlinx.coroutines.e2$b r1 = kotlinx.coroutines.e2.s0
            kotlin.coroutines.i$b r0 = r0.get(r1)
            kotlinx.coroutines.e2 r0 = (kotlinx.coroutines.e2) r0
            if (r0 == 0) goto L12
            r0.b(r3)
            return
        L12:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Scope cannot be cancelled because it does not have a job: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static /* synthetic */ void e(kotlinx.coroutines.r0 r0, java.lang.String r1, java.lang.Throwable r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            c(r0, r1, r2)
            return
    }

    public static /* synthetic */ void f(kotlinx.coroutines.r0 r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            d(r0, r1)
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object g(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r3) {
            kotlinx.coroutines.internal.o0 r0 = new kotlinx.coroutines.internal.o0
            kotlin.coroutines.i r1 = r3.getContext()
            r0.<init>(r1, r3)
            java.lang.Object r2 = n4.b.e(r0, r0, r2)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r0) goto L16
            kotlin.coroutines.jvm.internal.e.c(r3)
        L16:
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object h(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.coroutines.i> r0) {
            kotlin.coroutines.i r0 = r0.getContext()
            return r0
    }

    private static final java.lang.Object i(kotlin.coroutines.e<? super kotlin.coroutines.i> r0) {
            r0 = 3
            kotlin.jvm.internal.d0.e(r0)
            r0 = 0
            throw r0
    }

    public static final void j(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r0) {
            kotlin.coroutines.i r0 = r0.getCoroutineContext()
            kotlinx.coroutines.h2.z(r0)
            return
    }

    public static final boolean k(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1) {
            kotlin.coroutines.i r1 = r1.getCoroutineContext()
            kotlinx.coroutines.e2$b r0 = kotlinx.coroutines.e2.s0
            kotlin.coroutines.i$b r1 = r1.get(r0)
            kotlinx.coroutines.e2 r1 = (kotlinx.coroutines.e2) r1
            if (r1 == 0) goto L13
            boolean r1 = r1.isActive()
            return r1
        L13:
            r1 = 1
            return r1
    }

    public static /* synthetic */ void l(kotlinx.coroutines.r0 r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.r0 m(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r2) {
            kotlinx.coroutines.internal.h r0 = new kotlinx.coroutines.internal.h
            kotlin.coroutines.i r1 = r1.getCoroutineContext()
            kotlin.coroutines.i r1 = r1.plus(r2)
            r0.<init>(r1)
            return r0
    }
}
