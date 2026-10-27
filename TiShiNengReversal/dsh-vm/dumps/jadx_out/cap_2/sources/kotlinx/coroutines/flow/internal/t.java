package kotlinx.coroutines.flow.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class t {

    @org.jetbrains.annotations.NotNull
    private static final kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<java.lang.Object>, java.lang.Object, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* synthetic */ class a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super java.lang.Object>, java.lang.Object, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object>, kotlin.coroutines.jvm.internal.k {
        public static final kotlinx.coroutines.flow.internal.t.a a = null;

        static {
                kotlinx.coroutines.flow.internal.t$a r0 = new kotlinx.coroutines.flow.internal.t$a
                r0.<init>()
                kotlinx.coroutines.flow.internal.t.a.a = r0
                return
        }

        a() {
                r6 = this;
                java.lang.String r4 = "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
                r5 = 0
                r1 = 3
                java.lang.Class<kotlinx.coroutines.flow.j> r2 = kotlinx.coroutines.flow.j.class
                java.lang.String r3 = "emit"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<java.lang.Object> r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
                r0 = this;
                java.lang.Object r1 = r1.emit(r2, r3)
                return r1
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.j<? super java.lang.Object> r1, java.lang.Object r2, kotlin.coroutines.e<? super kotlin.n1> r3) {
                r0 = this;
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.coroutines.e r3 = (kotlin.coroutines.e) r3
                java.lang.Object r1 = r0.c(r1, r2, r3)
                return r1
        }
    }

    static {
            kotlinx.coroutines.flow.internal.t$a r0 = kotlinx.coroutines.flow.internal.t.a.a
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>"
            kotlin.jvm.internal.g0.n(r0, r1)
            r1 = 3
            java.lang.Object r0 = kotlin.jvm.internal.u0.q(r0, r1)
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0
            kotlinx.coroutines.flow.internal.t.a = r0
            return
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function3 a() {
            kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<java.lang.Object>, java.lang.Object, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r0 = kotlinx.coroutines.flow.internal.t.a
            return r0
    }

    private static /* synthetic */ void b() {
            return
    }
}
