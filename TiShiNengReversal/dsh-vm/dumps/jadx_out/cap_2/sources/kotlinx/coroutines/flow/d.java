package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class d<T> implements kotlinx.coroutines.flow.c<T> {

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.i<T> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Context.kt\nkotlinx/coroutines/flow/CancellableFlowImpl$collect$2\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,285:1\n329#2:286\n*S KotlinDebug\n*F\n+ 1 Context.kt\nkotlinx/coroutines/flow/CancellableFlowImpl$collect$2\n*L\n274#1:286\n*E\n"})
    static final class a<T> implements kotlinx.coroutines.flow.j {
        final /* synthetic */ kotlinx.coroutines.flow.j<T> a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", f = "Context.kt", i = {}, l = {275}, m = "emit", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.d$a$a, reason: collision with other inner class name */
        static final class C0089a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            /* synthetic */ java.lang.Object a;
            final /* synthetic */ kotlinx.coroutines.flow.d.a<T> b;
            int c;

            C0089a(kotlinx.coroutines.flow.d.a<? super T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.d.a.C0089a> r2) {
                    r0 = this;
                    r0.b = r1
                    r0.<init>(r2)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                    r1 = this;
                    r1.a = r2
                    int r2 = r1.c
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r2 | r0
                    r1.c = r2
                    kotlinx.coroutines.flow.d$a<T> r2 = r1.b
                    r0 = 0
                    java.lang.Object r2 = r2.emit(r0, r1)
                    return r2
            }
        }

        a(kotlinx.coroutines.flow.j<? super T> r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.j
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object emit(T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r6) {
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.d.a.C0089a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.d$a$a r0 = (kotlinx.coroutines.flow.d.a.C0089a) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.d$a$a r0 = new kotlinx.coroutines.flow.d$a$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.g0.n(r6)
                goto L46
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.g0.n(r6)
                kotlin.coroutines.i r6 = r0.getContext()
                kotlinx.coroutines.h2.z(r6)
                kotlinx.coroutines.flow.j<T> r6 = r4.a
                r0.c = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L46
                return r1
            L46:
                kotlin.n1 r5 = kotlin.n1.a
                return r5
        }
    }

    public d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // kotlinx.coroutines.flow.i
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r4) {
            r2 = this;
            kotlinx.coroutines.flow.i<T> r0 = r2.a
            kotlinx.coroutines.flow.d$a r1 = new kotlinx.coroutines.flow.d$a
            r1.<init>(r3)
            java.lang.Object r3 = r0.collect(r1, r4)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
            if (r3 != r4) goto L12
            return r3
        L12:
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }
}
