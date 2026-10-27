package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Result.kt\nkotlin/ResultKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n1#2:341\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class g0 {
    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull java.lang.Throwable r1) {
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.Result$Failure r0 = new kotlin.Result$Failure
            r0.<init>(r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <R, T> R b(java.lang.Object r1, kotlin.jvm.functions.Function1<? super T, ? extends R> r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends R> r3) {
            java.lang.String r0 = "onSuccess"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "onFailure"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Throwable r0 = kotlin.Result.m14exceptionOrNullimpl(r1)
            if (r0 != 0) goto L15
            java.lang.Object r1 = r2.invoke(r1)
            return r1
        L15:
            java.lang.Object r1 = r3.invoke(r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <R, T extends R> R c(java.lang.Object r1, R r2) {
            boolean r0 = kotlin.Result.m17isFailureimpl(r1)
            if (r0 == 0) goto L7
            return r2
        L7:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <R, T extends R> R d(java.lang.Object r1, kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends R> r2) {
            java.lang.String r0 = "onFailure"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Throwable r0 = kotlin.Result.m14exceptionOrNullimpl(r1)
            if (r0 != 0) goto Lc
            return r1
        Lc:
            java.lang.Object r1 = r2.invoke(r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <T> T e(java.lang.Object r0) {
            n(r0)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <R, T> java.lang.Object f(java.lang.Object r1, kotlin.jvm.functions.Function1<? super T, ? extends R> r2) {
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = kotlin.Result.m18isSuccessimpl(r1)
            if (r0 == 0) goto L16
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r1 = r2.invoke(r1)
            java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)
            return r1
        L16:
            java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <R, T> java.lang.Object g(java.lang.Object r1, kotlin.jvm.functions.Function1<? super T, ? extends R> r2) {
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = kotlin.Result.m18isSuccessimpl(r1)
            if (r0 == 0) goto L22
            kotlin.Result$a r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r2.invoke(r1)     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)     // Catch: java.lang.Throwable -> L16
            goto L21
        L16:
            r1 = move-exception
            kotlin.Result$a r2 = kotlin.Result.Companion
            java.lang.Object r1 = a(r1)
            java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)
        L21:
            return r1
        L22:
            java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <T> java.lang.Object h(java.lang.Object r1, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r2) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Throwable r0 = kotlin.Result.m14exceptionOrNullimpl(r1)
            if (r0 == 0) goto Le
            r2.invoke(r0)
        Le:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <T> java.lang.Object i(java.lang.Object r1, kotlin.jvm.functions.Function1<? super T, kotlin.n1> r2) {
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = kotlin.Result.m18isSuccessimpl(r1)
            if (r0 == 0) goto Le
            r2.invoke(r1)
        Le:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <R, T extends R> java.lang.Object j(java.lang.Object r1, kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends R> r2) {
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Throwable r0 = kotlin.Result.m14exceptionOrNullimpl(r1)
            if (r0 != 0) goto Lc
            return r1
        Lc:
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r1 = r2.invoke(r0)
            java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <R, T extends R> java.lang.Object k(java.lang.Object r1, kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends R> r2) {
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Throwable r0 = kotlin.Result.m14exceptionOrNullimpl(r1)
            if (r0 != 0) goto Lc
            return r1
        Lc:
            kotlin.Result$a r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r2.invoke(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)     // Catch: java.lang.Throwable -> L17
            goto L22
        L17:
            r1 = move-exception
            kotlin.Result$a r2 = kotlin.Result.Companion
            java.lang.Object r1 = a(r1)
            java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)
        L22:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <T, R> java.lang.Object l(T r1, kotlin.jvm.functions.Function1<? super T, ? extends R> r2) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.Result$a r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L10
            java.lang.Object r1 = r2.invoke(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            r1 = move-exception
            kotlin.Result$a r2 = kotlin.Result.Companion
            java.lang.Object r1 = a(r1)
            java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <R> java.lang.Object m(kotlin.jvm.functions.Function0<? extends R> r1) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.Result$a r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L10
            java.lang.Object r1 = r1.invoke()     // Catch: java.lang.Throwable -> L10
            java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            r1 = move-exception
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r1 = a(r1)
            java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.PublishedApi
    public static final void n(@org.jetbrains.annotations.NotNull java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlin.Result.Failure
            if (r0 != 0) goto L5
            return
        L5:
            kotlin.Result$Failure r1 = (kotlin.Result.Failure) r1
            java.lang.Throwable r1 = r1.exception
            throw r1
    }
}
