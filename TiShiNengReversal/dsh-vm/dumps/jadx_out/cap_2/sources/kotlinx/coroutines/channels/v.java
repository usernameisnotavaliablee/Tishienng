package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class v<E> extends kotlinx.coroutines.channels.a<E> {

    @org.jetbrains.annotations.NotNull
    private kotlin.coroutines.e<? super kotlin.n1> e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* synthetic */ class a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.channels.v<?>, kotlinx.coroutines.selects.m<?>, java.lang.Object, kotlin.n1> {
        public static final kotlinx.coroutines.channels.v.a a = null;

        static {
                kotlinx.coroutines.channels.v$a r0 = new kotlinx.coroutines.channels.v$a
                r0.<init>()
                kotlinx.coroutines.channels.v.a.a = r0
                return
        }

        a() {
                r6 = this;
                java.lang.String r4 = "onSendRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"
                r5 = 0
                r1 = 3
                java.lang.Class<kotlinx.coroutines.channels.v> r2 = kotlinx.coroutines.channels.v.class
                java.lang.String r3 = "onSendRegFunction"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public final void c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.v<?> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.m<?> r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r0 = this;
                kotlinx.coroutines.channels.v.B1(r1, r2, r3)
                return
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ kotlin.n1 invoke(kotlinx.coroutines.channels.v<?> r1, kotlinx.coroutines.selects.m<?> r2, java.lang.Object r3) {
                r0 = this;
                kotlinx.coroutines.channels.v r1 = (kotlinx.coroutines.channels.v) r1
                kotlinx.coroutines.selects.m r2 = (kotlinx.coroutines.selects.m) r2
                r0.c(r1, r2, r3)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }
    }

    public v(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.j<E> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.c<E>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            kotlin.coroutines.e r2 = kotlin.coroutines.intrinsics.a.c(r4, r1, r1)
            r1.e = r2
            return
    }

    public static final /* synthetic */ void B1(kotlinx.coroutines.channels.v r0, kotlinx.coroutines.selects.m r1, java.lang.Object r2) {
            r0.D1(r1, r2)
            return
    }

    public static /* synthetic */ void C1() {
            return
    }

    private final void D1(kotlinx.coroutines.selects.m<?> r2, java.lang.Object r3) {
            r1 = this;
            r1.f1()
            kotlinx.coroutines.selects.i r0 = super.i()
            kotlin.jvm.functions.Function3 r0 = r0.c()
            r0.invoke(r1, r2, r3)
            return
    }

    @Override // kotlinx.coroutines.channels.k, kotlinx.coroutines.channels.c0
    public boolean S(@org.jetbrains.annotations.Nullable java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = super.S(r1)
            r0.start()
            return r1
    }

    @Override // kotlinx.coroutines.channels.k, kotlinx.coroutines.channels.c0
    @org.jetbrains.annotations.Nullable
    public java.lang.Object T(E r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            r0.start()
            java.lang.Object r1 = super.T(r1, r2)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
            if (r1 != r2) goto Le
            return r1
        Le:
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    @Override // kotlinx.coroutines.l2
    protected void f1() {
            r1 = this;
            kotlin.coroutines.e<? super kotlin.n1> r0 = r1.e
            n4.a.c(r0, r1)
            return
    }

    @Override // kotlinx.coroutines.channels.k, kotlinx.coroutines.channels.c0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.selects.i<E, kotlinx.coroutines.channels.c0<E>> i() {
            r7 = this;
            kotlinx.coroutines.selects.j r0 = new kotlinx.coroutines.selects.j
            kotlinx.coroutines.channels.v$a r1 = kotlinx.coroutines.channels.v.a.a
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }"
            kotlin.jvm.internal.g0.n(r1, r2)
            r2 = 3
            java.lang.Object r1 = kotlin.jvm.internal.u0.q(r1, r2)
            r2 = r1
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            kotlinx.coroutines.selects.i r1 = super.i()
            kotlin.jvm.functions.Function3 r3 = r1.b()
            r5 = 8
            r6 = 0
            r4 = 0
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // kotlinx.coroutines.channels.k, kotlinx.coroutines.channels.c0
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E r1) {
            r0 = this;
            r0.start()
            boolean r1 = super.offer(r1)
            return r1
    }

    @Override // kotlinx.coroutines.channels.k, kotlinx.coroutines.channels.c0
    @org.jetbrains.annotations.NotNull
    public java.lang.Object r(E r1) {
            r0 = this;
            r0.start()
            java.lang.Object r1 = super.r(r1)
            return r1
    }
}
