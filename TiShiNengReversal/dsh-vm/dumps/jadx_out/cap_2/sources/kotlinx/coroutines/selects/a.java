package kotlinx.coroutines.selects;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nOnTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnTimeout.kt\nkotlinx/coroutines/selects/OnTimeout\n+ 2 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,66:1\n17#2:67\n*S KotlinDebug\n*F\n+ 1 OnTimeout.kt\nkotlinx/coroutines/selects/OnTimeout\n*L\n56#1:67\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class a {
    private final long a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 OnTimeout.kt\nkotlinx/coroutines/selects/OnTimeout\n*L\n1#1,18:1\n57#2,2:19\n*E\n"})
    /* renamed from: kotlinx.coroutines.selects.a$a, reason: collision with other inner class name */
    public static final class RunnableC0109a implements java.lang.Runnable {
        final /* synthetic */ kotlinx.coroutines.selects.m a;
        final /* synthetic */ kotlinx.coroutines.selects.a b;

        public RunnableC0109a(kotlinx.coroutines.selects.m r1, kotlinx.coroutines.selects.a r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                kotlinx.coroutines.selects.m r0 = r3.a
                kotlinx.coroutines.selects.a r1 = r3.b
                kotlin.n1 r2 = kotlin.n1.a
                r0.j(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* synthetic */ class b extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.a, kotlinx.coroutines.selects.m<?>, java.lang.Object, kotlin.n1> {
        public static final kotlinx.coroutines.selects.a.b a = null;

        static {
                kotlinx.coroutines.selects.a$b r0 = new kotlinx.coroutines.selects.a$b
                r0.<init>()
                kotlinx.coroutines.selects.a.b.a = r0
                return
        }

        b() {
                r6 = this;
                java.lang.String r4 = "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"
                r5 = 0
                r1 = 3
                java.lang.Class<kotlinx.coroutines.selects.a> r2 = kotlinx.coroutines.selects.a.class
                java.lang.String r3 = "register"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public final void c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.a r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.m<?> r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r0 = this;
                kotlinx.coroutines.selects.a.a(r1, r2, r3)
                return
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ kotlin.n1 invoke(kotlinx.coroutines.selects.a r1, kotlinx.coroutines.selects.m<?> r2, java.lang.Object r3) {
                r0 = this;
                kotlinx.coroutines.selects.a r1 = (kotlinx.coroutines.selects.a) r1
                kotlinx.coroutines.selects.m r2 = (kotlinx.coroutines.selects.m) r2
                r0.c(r1, r2, r3)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }
    }

    public a(long r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static final /* synthetic */ void a(kotlinx.coroutines.selects.a r0, kotlinx.coroutines.selects.m r1, java.lang.Object r2) {
            r0.d(r1, r2)
            return
    }

    public static /* synthetic */ void c() {
            return
    }

    private final void d(kotlinx.coroutines.selects.m<?> r5, java.lang.Object r6) {
            r4 = this;
            long r0 = r4.a
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto Le
            kotlin.n1 r6 = kotlin.n1.a
            r5.f(r6)
            return
        Le:
            kotlinx.coroutines.selects.a$a r6 = new kotlinx.coroutines.selects.a$a
            r6.<init>(r5, r4)
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>"
            kotlin.jvm.internal.g0.n(r5, r0)
            r0 = r5
            kotlinx.coroutines.selects.l r0 = (kotlinx.coroutines.selects.l) r0
            kotlin.coroutines.i r0 = r5.getContext()
            kotlinx.coroutines.z0 r1 = kotlinx.coroutines.a1.d(r0)
            long r2 = r4.a
            kotlinx.coroutines.j1 r6 = r1.m(r2, r6, r0)
            r5.h(r6)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.selects.e b() {
            r6 = this;
            kotlinx.coroutines.selects.f r0 = new kotlinx.coroutines.selects.f
            kotlinx.coroutines.selects.a$b r1 = kotlinx.coroutines.selects.a.b.a
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }"
            kotlin.jvm.internal.g0.n(r1, r2)
            r2 = 3
            java.lang.Object r1 = kotlin.jvm.internal.u0.q(r1, r2)
            r2 = r1
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            r4 = 4
            r5 = 0
            r3 = 0
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }
}
