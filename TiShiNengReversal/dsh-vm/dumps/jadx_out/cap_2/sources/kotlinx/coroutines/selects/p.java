package kotlinx.coroutines.selects;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class p {
    public static final /* synthetic */ void a(kotlinx.coroutines.p r0, java.lang.Object r1) {
            c(r0, r1)
            return
    }

    public static final /* synthetic */ void b(kotlinx.coroutines.p r0, java.lang.Throwable r1) {
            d(r0, r1)
            return
    }

    private static final <T> void c(kotlinx.coroutines.p<? super T> r2, T r3) {
            kotlin.coroutines.i r0 = r2.getContext()
            kotlinx.coroutines.m0$a r1 = kotlinx.coroutines.m0.Key
            kotlin.coroutines.i$b r0 = r0.get(r1)
            kotlinx.coroutines.m0 r0 = (kotlinx.coroutines.m0) r0
            if (r0 == 0) goto L12
            r2.P(r0, r3)
            return
        L12:
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.Result.m11constructorimpl(r3)
            r2.resumeWith(r3)
            return
    }

    private static final void d(kotlinx.coroutines.p<?> r2, java.lang.Throwable r3) {
            kotlin.coroutines.i r0 = r2.getContext()
            kotlinx.coroutines.m0$a r1 = kotlinx.coroutines.m0.Key
            kotlin.coroutines.i$b r0 = r0.get(r1)
            kotlinx.coroutines.m0 r0 = (kotlinx.coroutines.m0) r0
            if (r0 == 0) goto L12
            r2.h(r0, r3)
            return
        L12:
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.g0.a(r3)
            java.lang.Object r3 = kotlin.Result.m11constructorimpl(r3)
            r2.resumeWith(r3)
            return
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object e(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.c<? super R>, kotlin.n1> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r2) {
            kotlinx.coroutines.selects.d r0 = new kotlinx.coroutines.selects.d
            r0.<init>(r2)
            r1.invoke(r0)     // Catch: java.lang.Throwable -> L9
            goto Ld
        L9:
            r1 = move-exception
            r0.Q(r1)
        Ld:
            java.lang.Object r1 = r0.P()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r1 != r0) goto L1a
            kotlin.coroutines.jvm.internal.e.c(r2)
        L1a:
            return r1
    }

    @kotlin.PublishedApi
    private static final <R> java.lang.Object f(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.c<? super R>, kotlin.n1> r1, kotlin.coroutines.e<? super R> r2) {
            r0 = 0
            kotlin.jvm.internal.d0.e(r0)
            kotlinx.coroutines.selects.d r0 = new kotlinx.coroutines.selects.d
            r0.<init>(r2)
            r1.invoke(r0)     // Catch: java.lang.Throwable -> Ld
            goto L11
        Ld:
            r1 = move-exception
            r0.Q(r1)
        L11:
            java.lang.Object r1 = r0.P()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r1 != r0) goto L1e
            kotlin.coroutines.jvm.internal.e.c(r2)
        L1e:
            r2 = 1
            kotlin.jvm.internal.d0.e(r2)
            return r1
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object g(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.c<? super R>, kotlin.n1> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r2) {
            kotlinx.coroutines.selects.r r0 = new kotlinx.coroutines.selects.r
            r0.<init>(r2)
            r1.invoke(r0)     // Catch: java.lang.Throwable -> L9
            goto Ld
        L9:
            r1 = move-exception
            r0.R(r1)
        Ld:
            java.lang.Object r1 = r0.S()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r1 != r0) goto L1a
            kotlin.coroutines.jvm.internal.e.c(r2)
        L1a:
            return r1
    }

    @kotlin.PublishedApi
    private static final <R> java.lang.Object h(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.c<? super R>, kotlin.n1> r1, kotlin.coroutines.e<? super R> r2) {
            r0 = 0
            kotlin.jvm.internal.d0.e(r0)
            kotlinx.coroutines.selects.r r0 = new kotlinx.coroutines.selects.r
            r0.<init>(r2)
            r1.invoke(r0)     // Catch: java.lang.Throwable -> Ld
            goto L11
        Ld:
            r1 = move-exception
            r0.R(r1)
        L11:
            java.lang.Object r1 = r0.S()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r1 != r0) goto L1e
            kotlin.coroutines.jvm.internal.e.c(r2)
        L1e:
            r2 = 1
            kotlin.jvm.internal.d0.e(r2)
            return r1
    }
}
