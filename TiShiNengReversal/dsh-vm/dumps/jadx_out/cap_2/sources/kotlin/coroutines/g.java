package kotlin.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class g {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n*L\n1#1,161:1\n*E\n"})
    public static final class a<T> implements kotlin.coroutines.e<T> {
        final /* synthetic */ kotlin.coroutines.i a;
        final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.Result<? extends T>, kotlin.n1> b;

        public a(kotlin.coroutines.i r1, kotlin.jvm.functions.Function1<? super kotlin.Result<? extends T>, kotlin.n1> r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // kotlin.coroutines.e
        public kotlin.coroutines.i getContext() {
                r1 = this;
                kotlin.coroutines.i r0 = r1.a
                return r0
        }

        @Override // kotlin.coroutines.e
        public void resumeWith(java.lang.Object r2) {
                r1 = this;
                kotlin.jvm.functions.Function1<kotlin.Result<? extends T>, kotlin.n1> r0 = r1.b
                kotlin.Result r2 = kotlin.Result.m10boximpl(r2)
                r0.invoke(r2)
                return
        }
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <T> kotlin.coroutines.e<T> a(kotlin.coroutines.i r1, kotlin.jvm.functions.Function1<? super kotlin.Result<? extends T>, kotlin.n1> r2) {
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "resumeWith"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.coroutines.g$a r0 = new kotlin.coroutines.g$a
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.coroutines.e<kotlin.n1> b(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.coroutines.k r0 = new kotlin.coroutines.k
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.b(r1, r2)
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r1)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @org.jetbrains.annotations.NotNull
    public static final <R, T> kotlin.coroutines.e<kotlin.n1> c(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r1, R r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.coroutines.k r0 = new kotlin.coroutines.k
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.c(r1, r2, r3)
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r1)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
            r0.<init>(r1, r2)
            return r0
    }

    private static final kotlin.coroutines.i d() {
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            java.lang.String r1 = "Implemented as intrinsic"
            r0.<init>(r1)
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    public static /* synthetic */ void e() {
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <T> void f(kotlin.coroutines.e<? super T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.Result.m11constructorimpl(r2)
            r1.resumeWith(r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <T> void g(kotlin.coroutines.e<? super T> r1, java.lang.Throwable r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.g0.a(r2)
            java.lang.Object r2 = kotlin.Result.m11constructorimpl(r2)
            r1.resumeWith(r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    public static final <T> void h(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.b(r1, r2)
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r1)
            kotlin.n1 r2 = kotlin.n1.a
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.Result.m11constructorimpl(r2)
            r1.resumeWith(r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    public static final <R, T> void i(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r1, R r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.c(r1, r2, r3)
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r1)
            kotlin.n1 r2 = kotlin.n1.a
            kotlin.Result$a r3 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.Result.m11constructorimpl(r2)
            r1.resumeWith(r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.internal.InlineOnly
    private static final <T> java.lang.Object j(kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super T>, kotlin.n1> r2, kotlin.coroutines.e<? super T> r3) {
            r0 = 0
            kotlin.jvm.internal.d0.e(r0)
            kotlin.coroutines.k r0 = new kotlin.coroutines.k
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r3)
            r0.<init>(r1)
            r2.invoke(r0)
            java.lang.Object r2 = r0.b()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r0) goto L1d
            kotlin.coroutines.jvm.internal.e.c(r3)
        L1d:
            r3 = 1
            kotlin.jvm.internal.d0.e(r3)
            return r2
    }
}
