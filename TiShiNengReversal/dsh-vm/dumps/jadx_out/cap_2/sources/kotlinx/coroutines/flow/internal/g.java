package kotlinx.coroutines.flow.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class g<S, T> extends kotlinx.coroutines.flow.internal.d<T> {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    protected final kotlinx.coroutines.flow.i<S> d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        /* synthetic */ java.lang.Object b;
        final /* synthetic */ kotlinx.coroutines.flow.internal.g<S, T> c;

        a(kotlinx.coroutines.flow.internal.g<S, T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.internal.g.a> r2) {
                r0 = this;
                r0.c = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
                r2 = this;
                kotlinx.coroutines.flow.internal.g$a r0 = new kotlinx.coroutines.flow.internal.g$a
                kotlinx.coroutines.flow.internal.g<S, T> r1 = r2.c
                r0.<init>(r1, r4)
                r0.b = r3
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.internal.g$a r1 = (kotlinx.coroutines.flow.internal.g.a) r1
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
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.g0.n(r4)
                goto L29
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.g0.n(r4)
                java.lang.Object r4 = r3.b
                kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
                kotlinx.coroutines.flow.internal.g<S, T> r1 = r3.c
                r3.a = r2
                java.lang.Object r4 = r1.r(r4, r3)
                if (r4 != r0) goto L29
                return r0
            L29:
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }
    }

    public g(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends S> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, int r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            r0.d = r1
            return
    }

    public static final /* synthetic */ java.lang.Object n(kotlinx.coroutines.flow.internal.g r0, kotlinx.coroutines.flow.j r1, kotlin.coroutines.i r2, kotlin.coroutines.e r3) {
            java.lang.Object r0 = r0.q(r1, r2, r3)
            return r0
    }

    static /* synthetic */ <S, T> java.lang.Object o(kotlinx.coroutines.flow.internal.g<S, T> r4, kotlinx.coroutines.flow.j<? super T> r5, kotlin.coroutines.e<? super kotlin.n1> r6) {
            int r0 = r4.b
            r1 = -3
            if (r0 != r1) goto L41
            kotlin.coroutines.i r0 = r6.getContext()
            kotlin.coroutines.i r1 = r4.a
            kotlin.coroutines.i r1 = kotlinx.coroutines.l0.d(r0, r1)
            boolean r2 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r2 == 0) goto L23
            java.lang.Object r4 = r4.r(r5, r6)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r5) goto L20
            return r4
        L20:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
        L23:
            kotlin.coroutines.f$b r2 = kotlin.coroutines.f.o0
            kotlin.coroutines.i$b r3 = r1.get(r2)
            kotlin.coroutines.i$b r0 = r0.get(r2)
            boolean r0 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r0 == 0) goto L41
            java.lang.Object r4 = r4.q(r5, r1, r6)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r5) goto L3e
            return r4
        L3e:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
        L41:
            java.lang.Object r4 = super.collect(r5, r6)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r5) goto L4c
            return r4
        L4c:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    static /* synthetic */ <S, T> java.lang.Object p(kotlinx.coroutines.flow.internal.g<S, T> r1, kotlinx.coroutines.channels.z<? super T> r2, kotlin.coroutines.e<? super kotlin.n1> r3) {
            kotlinx.coroutines.flow.internal.u r0 = new kotlinx.coroutines.flow.internal.u
            r0.<init>(r2)
            java.lang.Object r1 = r1.r(r0, r3)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
            if (r1 != r2) goto L10
            return r1
        L10:
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private final java.lang.Object q(kotlinx.coroutines.flow.j<? super T> r9, kotlin.coroutines.i r10, kotlin.coroutines.e<? super kotlin.n1> r11) {
            r8 = this;
            kotlin.coroutines.i r0 = r11.getContext()
            kotlinx.coroutines.flow.j r2 = kotlinx.coroutines.flow.internal.e.a(r9, r0)
            kotlinx.coroutines.flow.internal.g$a r4 = new kotlinx.coroutines.flow.internal.g$a
            r9 = 0
            r4.<init>(r8, r9)
            r6 = 4
            r7 = 0
            r3 = 0
            r1 = r10
            r5 = r11
            java.lang.Object r9 = kotlinx.coroutines.flow.internal.e.d(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r10 = kotlin.coroutines.intrinsics.a.l()
            if (r9 != r10) goto L1e
            return r9
        L1e:
            kotlin.n1 r9 = kotlin.n1.a
            return r9
    }

    @Override // kotlinx.coroutines.flow.internal.d, kotlinx.coroutines.flow.i
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            java.lang.Object r1 = o(r0, r1, r2)
            return r1
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @org.jetbrains.annotations.Nullable
    protected java.lang.Object h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.z<? super T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            java.lang.Object r1 = p(r0, r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    protected abstract java.lang.Object r(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2);

    @Override // kotlinx.coroutines.flow.internal.d
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlinx.coroutines.flow.i<S> r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = " -> "
            r0.append(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
