package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,426:1\n329#2:427\n*S KotlinDebug\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n*L\n417#1:427\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class l0<T> implements kotlinx.coroutines.flow.j<T> {

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.j<T> a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", i = {0, 0}, l = {419, 423}, m = "onSubscription", n = {"this", "safeCollector"}, s = {"L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        java.lang.Object b;
        /* synthetic */ java.lang.Object c;
        final /* synthetic */ kotlinx.coroutines.flow.l0<T> d;
        int e;

        a(kotlinx.coroutines.flow.l0<T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.l0.a> r2) {
                r0 = this;
                r0.d = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.c = r2
                int r2 = r1.e
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.e = r2
                kotlinx.coroutines.flow.l0<T> r2 = r1.d
                java.lang.Object r2 = r2.a(r1)
                return r2
        }
    }

    public l0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.j<? super T>, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r7) {
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.l0.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.l0$a r0 = (kotlinx.coroutines.flow.l0.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.l0$a r0 = new kotlinx.coroutines.flow.l0$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.g0.n(r7)
            goto L79
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.b
            kotlinx.coroutines.flow.internal.SafeCollector r2 = (kotlinx.coroutines.flow.internal.SafeCollector) r2
            java.lang.Object r4 = r0.a
            kotlinx.coroutines.flow.l0 r4 = (kotlinx.coroutines.flow.l0) r4
            kotlin.g0.n(r7)     // Catch: java.lang.Throwable -> L40
            goto L60
        L40:
            r7 = move-exception
            goto L7f
        L42:
            kotlin.g0.n(r7)
            kotlinx.coroutines.flow.internal.SafeCollector r2 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlinx.coroutines.flow.j<T> r7 = r6.a
            kotlin.coroutines.i r5 = r0.getContext()
            r2.<init>(r7, r5)
            kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r7 = r6.b     // Catch: java.lang.Throwable -> L40
            r0.a = r6     // Catch: java.lang.Throwable -> L40
            r0.b = r2     // Catch: java.lang.Throwable -> L40
            r0.e = r4     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L40
            if (r7 != r1) goto L5f
            goto L78
        L5f:
            r4 = r6
        L60:
            r2.releaseIntercepted()
            kotlinx.coroutines.flow.j<T> r7 = r4.a
            boolean r2 = r7 instanceof kotlinx.coroutines.flow.l0
            if (r2 == 0) goto L7c
            kotlinx.coroutines.flow.l0 r7 = (kotlinx.coroutines.flow.l0) r7
            r2 = 0
            r0.a = r2
            r0.b = r2
            r0.e = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L79
        L78:
            return r1
        L79:
            kotlin.n1 r7 = kotlin.n1.a
            return r7
        L7c:
            kotlin.n1 r7 = kotlin.n1.a
            return r7
        L7f:
            r2.releaseIntercepted()
            throw r7
    }

    @Override // kotlinx.coroutines.flow.j
    @org.jetbrains.annotations.Nullable
    public java.lang.Object emit(T r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            r1 = this;
            kotlinx.coroutines.flow.j<T> r0 = r1.a
            java.lang.Object r2 = r0.emit(r2, r3)
            return r2
    }
}
