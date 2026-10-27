package n4;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCancellable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n1#1,68:1\n49#1,6:69\n49#1,6:75\n49#1,6:81\n*S KotlinDebug\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n17#1:69,6\n29#1:75,6\n38#1:81,6\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    private static final void a(kotlin.coroutines.e<?> r1, java.lang.Throwable r2) {
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.g0.a(r2)
            java.lang.Object r0 = kotlin.Result.m11constructorimpl(r0)
            r1.resumeWith(r0)
            throw r2
    }

    private static final void b(kotlin.coroutines.e<?> r0, kotlin.jvm.functions.Function0<kotlin.n1> r1) {
            r1.invoke()     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r1 = move-exception
            a(r0, r1)
            return
    }

    public static final void c(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
            kotlin.coroutines.e r3 = kotlin.coroutines.intrinsics.a.e(r3)     // Catch: java.lang.Throwable -> L12
            kotlin.Result$a r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L12
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = kotlin.Result.m11constructorimpl(r0)     // Catch: java.lang.Throwable -> L12
            r1 = 2
            r2 = 0
            kotlinx.coroutines.internal.m.e(r3, r0, r2, r1, r2)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r3 = move-exception
            a(r4, r3)
            return
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    public static final <T> void d(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r4) {
            kotlin.coroutines.e r3 = kotlin.coroutines.intrinsics.a.b(r3, r4)     // Catch: java.lang.Throwable -> L16
            kotlin.coroutines.e r3 = kotlin.coroutines.intrinsics.a.e(r3)     // Catch: java.lang.Throwable -> L16
            kotlin.Result$a r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L16
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L16
            java.lang.Object r0 = kotlin.Result.m11constructorimpl(r0)     // Catch: java.lang.Throwable -> L16
            r1 = 2
            r2 = 0
            kotlinx.coroutines.internal.m.e(r3, r0, r2, r1, r2)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r3 = move-exception
            a(r4, r3)
            return
    }

    public static final <R, T> void e(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r0, R r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r2, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r3) {
            kotlin.coroutines.e r0 = kotlin.coroutines.intrinsics.a.c(r0, r1, r2)     // Catch: java.lang.Throwable -> L14
            kotlin.coroutines.e r0 = kotlin.coroutines.intrinsics.a.e(r0)     // Catch: java.lang.Throwable -> L14
            kotlin.Result$a r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L14
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)     // Catch: java.lang.Throwable -> L14
            kotlinx.coroutines.internal.m.d(r0, r1, r3)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r0 = move-exception
            a(r2, r0)
            return
    }

    public static /* synthetic */ void f(kotlin.jvm.functions.Function2 r0, java.lang.Object r1, kotlin.coroutines.e r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            e(r0, r1, r2, r3)
            return
    }
}
