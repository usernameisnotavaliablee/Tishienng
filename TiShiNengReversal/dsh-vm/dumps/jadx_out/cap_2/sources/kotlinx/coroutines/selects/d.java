package kotlinx.coroutines.selects;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.PublishedApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d<R> extends kotlinx.coroutines.selects.l<R> {

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.q<R> g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1", f = "SelectOld.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ kotlinx.coroutines.selects.d<R> b;

        a(kotlinx.coroutines.selects.d<R> r1, kotlin.coroutines.e<? super kotlinx.coroutines.selects.d.a> r2) {
                r0 = this;
                r0.b = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r3) {
                r1 = this;
                kotlinx.coroutines.selects.d$a r2 = new kotlinx.coroutines.selects.d$a
                kotlinx.coroutines.selects.d<R> r0 = r1.b
                r2.<init>(r0, r3)
                return r2
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlinx.coroutines.selects.d$a r1 = (kotlinx.coroutines.selects.d.a) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r3.a
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                kotlin.g0.n(r4)     // Catch: java.lang.Throwable -> Lf
                goto L27
            Lf:
                r4 = move-exception
                goto L33
            L11:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L19:
                kotlin.g0.n(r4)
                kotlinx.coroutines.selects.d<R> r4 = r3.b     // Catch: java.lang.Throwable -> Lf
                r3.a = r2     // Catch: java.lang.Throwable -> Lf
                java.lang.Object r4 = r4.y(r3)     // Catch: java.lang.Throwable -> Lf
                if (r4 != r0) goto L27
                return r0
            L27:
                kotlinx.coroutines.selects.d<R> r0 = r3.b
                kotlinx.coroutines.q r0 = kotlinx.coroutines.selects.d.O(r0)
                kotlinx.coroutines.selects.p.a(r0, r4)
                kotlin.n1 r4 = kotlin.n1.a
                return r4
            L33:
                kotlinx.coroutines.selects.d<R> r0 = r3.b
                kotlinx.coroutines.q r0 = kotlinx.coroutines.selects.d.O(r0)
                kotlinx.coroutines.selects.p.b(r0, r4)
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }
    }

    public d(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r3) {
            r2 = this;
            kotlin.coroutines.i r0 = r3.getContext()
            r2.<init>(r0)
            kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
            kotlin.coroutines.e r3 = kotlin.coroutines.intrinsics.a.e(r3)
            r1 = 1
            r0.<init>(r3, r1)
            r2.g = r0
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.q O(kotlinx.coroutines.selects.d r0) {
            kotlinx.coroutines.q<R> r0 = r0.g
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object P() {
            r7 = this;
            kotlinx.coroutines.q<R> r0 = r7.g
            boolean r0 = r0.isCompleted()
            if (r0 == 0) goto Lf
            kotlinx.coroutines.q<R> r0 = r7.g
            java.lang.Object r0 = r0.x()
            return r0
        Lf:
            kotlin.coroutines.i r0 = r7.getContext()
            kotlinx.coroutines.r0 r1 = kotlinx.coroutines.s0.a(r0)
            kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
            kotlinx.coroutines.selects.d$a r4 = new kotlinx.coroutines.selects.d$a
            r0 = 0
            r4.<init>(r7, r0)
            r5 = 1
            r6 = 0
            r2 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.q<R> r0 = r7.g
            java.lang.Object r0 = r0.x()
            return r0
    }

    @kotlin.PublishedApi
    public final void Q(@org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
            r2 = this;
            kotlinx.coroutines.q<R> r0 = r2.g
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.g0.a(r3)
            java.lang.Object r3 = kotlin.Result.m11constructorimpl(r3)
            r0.resumeWith(r3)
            return
    }
}
