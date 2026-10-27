package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class g<T> implements kotlinx.coroutines.flow.i<T> {

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.i<T> a;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<T, java.lang.Object> b;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> implements kotlinx.coroutines.flow.j {
        final /* synthetic */ kotlinx.coroutines.flow.g<T> a;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> b;
        final /* synthetic */ kotlinx.coroutines.flow.j<T> c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", i = {}, l = {77}, m = "emit", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.g$a$a, reason: collision with other inner class name */
        static final class C0092a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            /* synthetic */ java.lang.Object a;
            final /* synthetic */ kotlinx.coroutines.flow.g.a<T> b;
            int c;

            C0092a(kotlinx.coroutines.flow.g.a<? super T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.g.a.C0092a> r2) {
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
                    kotlinx.coroutines.flow.g$a<T> r2 = r1.b
                    r0 = 0
                    java.lang.Object r2 = r2.emit(r0, r1)
                    return r2
            }
        }

        a(kotlinx.coroutines.flow.g<T> r1, kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> r2, kotlinx.coroutines.flow.j<? super T> r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.j
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r7) {
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.g.a.C0092a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.g$a$a r0 = (kotlinx.coroutines.flow.g.a.C0092a) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.g$a$a r0 = new kotlinx.coroutines.flow.g$a$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.g0.n(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.g0.n(r7)
                kotlinx.coroutines.flow.g<T> r7 = r5.a
                kotlin.jvm.functions.Function1<T, java.lang.Object> r7 = r7.b
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r5.b
                T r2 = r2.element
                kotlinx.coroutines.internal.s0 r4 = kotlinx.coroutines.flow.internal.s.a
                if (r2 == r4) goto L58
                kotlinx.coroutines.flow.g<T> r4 = r5.a
                kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.c
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                kotlin.n1 r6 = kotlin.n1.a
                return r6
            L58:
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r5.b
                r2.element = r7
                kotlinx.coroutines.flow.j<T> r7 = r5.c
                r0.c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                kotlin.n1 r6 = kotlin.n1.a
                return r6
        }
    }

    public g(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // kotlinx.coroutines.flow.i
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r5) {
            r3 = this;
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.flow.internal.s.a
            r0.element = r1
            kotlinx.coroutines.flow.i<T> r1 = r3.a
            kotlinx.coroutines.flow.g$a r2 = new kotlinx.coroutines.flow.g$a
            r2.<init>(r3, r0, r4)
            java.lang.Object r4 = r1.collect(r2, r5)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r5) goto L1b
            return r4
        L1b:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }
}
