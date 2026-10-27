package kotlinx.coroutines.flow.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSafeCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.kt\nkotlinx/coroutines/flow/internal/SafeCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n1#2:157\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SafeCollector<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl implements kotlinx.coroutines.flow.j<T>, kotlin.coroutines.jvm.internal.c {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.i collectContext;

    @kotlin.jvm.JvmField
    public final int collectContextSize;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.j<T> collector;

    @org.jetbrains.annotations.Nullable
    private kotlin.coroutines.e<? super kotlin.n1> completion;

    @org.jetbrains.annotations.Nullable
    private kotlin.coroutines.i lastEmissionContext;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<java.lang.Integer, kotlin.coroutines.i.b, java.lang.Integer> {
        public static final kotlinx.coroutines.flow.internal.SafeCollector.a a = null;

        static {
                kotlinx.coroutines.flow.internal.SafeCollector$a r0 = new kotlinx.coroutines.flow.internal.SafeCollector$a
                r0.<init>()
                kotlinx.coroutines.flow.internal.SafeCollector.a.a = r0
                return
        }

        a() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.Integer a(int r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i.b r2) {
                r0 = this;
                int r1 = r1 + 1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                return r1
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Integer r1, kotlin.coroutines.i.b r2) {
                r0 = this;
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                kotlin.coroutines.i$b r2 = (kotlin.coroutines.i.b) r2
                java.lang.Integer r1 = r0.a(r1, r2)
                return r1
        }
    }

    public SafeCollector(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r4) {
            r2 = this;
            kotlinx.coroutines.flow.internal.q r0 = kotlinx.coroutines.flow.internal.q.a
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            r2.<init>(r0, r1)
            r2.collector = r3
            r2.collectContext = r4
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            kotlinx.coroutines.flow.internal.SafeCollector$a r0 = kotlinx.coroutines.flow.internal.SafeCollector.a.a
            java.lang.Object r3 = r4.fold(r3, r0)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r2.collectContextSize = r3
            return
    }

    private final void checkContext(kotlin.coroutines.i r2, kotlin.coroutines.i r3, T r4) {
            r1 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.flow.internal.l
            if (r0 == 0) goto L9
            kotlinx.coroutines.flow.internal.l r3 = (kotlinx.coroutines.flow.internal.l) r3
            r1.exceptionTransparencyViolated(r3, r4)
        L9:
            kotlinx.coroutines.flow.internal.SafeCollector_commonKt.a(r1, r2)
            return
    }

    private final java.lang.Object emit(kotlin.coroutines.e<? super kotlin.n1> r3, T r4) {
            r2 = this;
            kotlin.coroutines.i r0 = r3.getContext()
            kotlinx.coroutines.h2.z(r0)
            kotlin.coroutines.i r1 = r2.lastEmissionContext
            if (r1 == r0) goto L10
            r2.checkContext(r0, r1, r4)
            r2.lastEmissionContext = r0
        L10:
            r2.completion = r3
            kotlin.jvm.functions.Function3 r3 = kotlinx.coroutines.flow.internal.t.a()
            kotlinx.coroutines.flow.j<T> r0 = r2.collector
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>"
            kotlin.jvm.internal.g0.n(r0, r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>"
            kotlin.jvm.internal.g0.n(r2, r1)
            java.lang.Object r3 = r3.invoke(r0, r4, r2)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
            boolean r4 = kotlin.jvm.internal.g0.g(r3, r4)
            if (r4 != 0) goto L33
            r4 = 0
            r2.completion = r4
        L33:
            return r3
    }

    private final void exceptionTransparencyViolated(kotlinx.coroutines.flow.internal.l r4, java.lang.Object r5) {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception "
            r1.append(r2)
            java.lang.Throwable r4 = r4.a
            r1.append(r4)
            java.lang.String r4 = ", but then emission attempt of value '"
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = kotlin.text.u.v(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // kotlinx.coroutines.flow.j
    @org.jetbrains.annotations.Nullable
    public java.lang.Object emit(T r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            r1 = this;
            java.lang.Object r2 = r1.emit(r3, r2)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r0) goto Ld
            kotlin.coroutines.jvm.internal.e.c(r3)
        Ld:
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r3) goto L14
            return r2
        L14:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
        L17:
            r2 = move-exception
            kotlinx.coroutines.flow.internal.l r0 = new kotlinx.coroutines.flow.internal.l
            kotlin.coroutines.i r3 = r3.getContext()
            r0.<init>(r2, r3)
            r1.lastEmissionContext = r0
            throw r2
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.c
    @org.jetbrains.annotations.Nullable
    public kotlin.coroutines.jvm.internal.c getCallerFrame() {
            r2 = this;
            kotlin.coroutines.e<? super kotlin.n1> r0 = r2.completion
            boolean r1 = r0 instanceof kotlin.coroutines.jvm.internal.c
            if (r1 == 0) goto L9
            kotlin.coroutines.jvm.internal.c r0 = (kotlin.coroutines.jvm.internal.c) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.e
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i getContext() {
            r1 = this;
            kotlin.coroutines.i r0 = r1.lastEmissionContext
            if (r0 != 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.c
    @org.jetbrains.annotations.Nullable
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.NotNull
    public java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
            r3 = this;
            java.lang.Throwable r0 = kotlin.Result.m14exceptionOrNullimpl(r4)
            if (r0 == 0) goto L11
            kotlinx.coroutines.flow.internal.l r1 = new kotlinx.coroutines.flow.internal.l
            kotlin.coroutines.i r2 = r3.getContext()
            r1.<init>(r0, r2)
            r3.lastEmissionContext = r1
        L11:
            kotlin.coroutines.e<? super kotlin.n1> r0 = r3.completion
            if (r0 == 0) goto L18
            r0.resumeWith(r4)
        L18:
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
            return r4
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
            r0 = this;
            super.releaseIntercepted()
            return
    }
}
