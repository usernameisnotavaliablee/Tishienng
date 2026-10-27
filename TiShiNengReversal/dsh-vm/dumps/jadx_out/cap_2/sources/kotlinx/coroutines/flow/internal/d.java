package kotlinx.coroutines.flow.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlinx.coroutines.InternalCoroutinesApi
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,245:1\n1#2:246\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class d<T> implements kotlinx.coroutines.flow.internal.p<T> {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.i a;

    @kotlin.jvm.JvmField
    public final int b;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.channels.BufferOverflow c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        private /* synthetic */ java.lang.Object b;
        final /* synthetic */ kotlinx.coroutines.flow.j<T> c;
        final /* synthetic */ kotlinx.coroutines.flow.internal.d<T> d;

        a(kotlinx.coroutines.flow.j<? super T> r1, kotlinx.coroutines.flow.internal.d<T> r2, kotlin.coroutines.e<? super kotlinx.coroutines.flow.internal.d.a> r3) {
                r0 = this;
                r0.c = r1
                r0.d = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r5) {
                r3 = this;
                kotlinx.coroutines.flow.internal.d$a r0 = new kotlinx.coroutines.flow.internal.d$a
                kotlinx.coroutines.flow.j<T> r1 = r3.c
                kotlinx.coroutines.flow.internal.d<T> r2 = r3.d
                r0.<init>(r1, r2, r5)
                r0.b = r4
                return r0
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
                kotlinx.coroutines.flow.internal.d$a r1 = (kotlinx.coroutines.flow.internal.d.a) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r4.a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.g0.n(r5)
                goto L2f
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.g0.n(r5)
                java.lang.Object r5 = r4.b
                kotlinx.coroutines.r0 r5 = (kotlinx.coroutines.r0) r5
                kotlinx.coroutines.flow.j<T> r1 = r4.c
                kotlinx.coroutines.flow.internal.d<T> r3 = r4.d
                kotlinx.coroutines.channels.b0 r5 = r3.m(r5)
                r4.a = r2
                java.lang.Object r5 = kotlinx.coroutines.flow.k.l0(r1, r5, r4)
                if (r5 != r0) goto L2f
                return r0
            L2f:
                kotlin.n1 r5 = kotlin.n1.a
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.z<? super T>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        /* synthetic */ java.lang.Object b;
        final /* synthetic */ kotlinx.coroutines.flow.internal.d<T> c;

        b(kotlinx.coroutines.flow.internal.d<T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.internal.d.b> r2) {
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
                kotlinx.coroutines.flow.internal.d$b r0 = new kotlinx.coroutines.flow.internal.d$b
                kotlinx.coroutines.flow.internal.d<T> r1 = r2.c
                r0.<init>(r1, r4)
                r0.b = r3
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlinx.coroutines.channels.z r1 = (kotlinx.coroutines.channels.z) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.z<? super T> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.internal.d$b r1 = (kotlinx.coroutines.flow.internal.d.b) r1
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
                kotlinx.coroutines.channels.z r4 = (kotlinx.coroutines.channels.z) r4
                kotlinx.coroutines.flow.internal.d<T> r1 = r3.c
                r3.a = r2
                java.lang.Object r4 = r1.h(r4, r3)
                if (r4 != r0) goto L29
                return r0
            L29:
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }
    }

    public d(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, int r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    static /* synthetic */ <T> java.lang.Object g(kotlinx.coroutines.flow.internal.d<T> r2, kotlinx.coroutines.flow.j<? super T> r3, kotlin.coroutines.e<? super kotlin.n1> r4) {
            kotlinx.coroutines.flow.internal.d$a r0 = new kotlinx.coroutines.flow.internal.d$a
            r1 = 0
            r0.<init>(r3, r2, r1)
            java.lang.Object r2 = kotlinx.coroutines.s0.g(r0, r4)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r3) goto L11
            return r2
        L11:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    @Override // kotlinx.coroutines.flow.i
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            java.lang.Object r1 = g(r0, r1, r2)
            return r1
    }

    @Override // kotlinx.coroutines.flow.internal.p
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.i<T> e(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, int r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r4) {
            r1 = this;
            kotlin.coroutines.i r0 = r1.a
            kotlin.coroutines.i r2 = r2.plus(r0)
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r4 == r0) goto Lb
            goto L25
        Lb:
            int r4 = r1.b
            r0 = -3
            if (r4 != r0) goto L11
            goto L23
        L11:
            if (r3 != r0) goto L15
        L13:
            r3 = r4
            goto L23
        L15:
            r0 = -2
            if (r4 != r0) goto L19
            goto L23
        L19:
            if (r3 != r0) goto L1c
            goto L13
        L1c:
            int r3 = r3 + r4
            if (r3 < 0) goto L20
            goto L23
        L20:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L23:
            kotlinx.coroutines.channels.BufferOverflow r4 = r1.c
        L25:
            kotlin.coroutines.i r0 = r1.a
            boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r0 == 0) goto L36
            int r0 = r1.b
            if (r3 != r0) goto L36
            kotlinx.coroutines.channels.BufferOverflow r0 = r1.c
            if (r4 != r0) goto L36
            return r1
        L36:
            kotlinx.coroutines.flow.internal.d r2 = r1.i(r2, r3, r4)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    protected java.lang.String f() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    protected abstract java.lang.Object h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.z<? super T> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2);

    @org.jetbrains.annotations.NotNull
    protected abstract kotlinx.coroutines.flow.internal.d<T> i(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, int r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r3);

    @org.jetbrains.annotations.Nullable
    public kotlinx.coroutines.flow.i<T> j() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.z<? super T>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> k() {
            r2 = this;
            kotlinx.coroutines.flow.internal.d$b r0 = new kotlinx.coroutines.flow.internal.d$b
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public final int l() {
            r2 = this;
            int r0 = r2.b
            r1 = -3
            if (r0 != r1) goto L6
            r0 = -2
        L6:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.channels.b0<T> m(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r10) {
            r9 = this;
            kotlin.coroutines.i r1 = r9.a
            int r2 = r9.l()
            kotlinx.coroutines.channels.BufferOverflow r3 = r9.c
            kotlinx.coroutines.CoroutineStart r4 = kotlinx.coroutines.CoroutineStart.ATOMIC
            kotlin.jvm.functions.Function2 r6 = r9.k()
            r7 = 16
            r8 = 0
            r5 = 0
            r0 = r10
            kotlinx.coroutines.channels.b0 r10 = kotlinx.coroutines.channels.x.h(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            java.lang.String r1 = r10.f()
            if (r1 == 0) goto Lf
            r0.add(r1)
        Lf:
            kotlin.coroutines.i r1 = r10.a
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            if (r1 == r2) goto L2b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "context="
            r1.append(r2)
            kotlin.coroutines.i r2 = r10.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L2b:
            int r1 = r10.b
            r2 = -3
            if (r1 == r2) goto L46
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "capacity="
            r1.append(r2)
            int r2 = r10.b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L46:
            kotlinx.coroutines.channels.BufferOverflow r1 = r10.c
            kotlinx.coroutines.channels.BufferOverflow r2 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r1 == r2) goto L62
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onBufferOverflow="
            r1.append(r2)
            kotlinx.coroutines.channels.BufferOverflow r2 = r10.c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L62:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = kotlinx.coroutines.u0.a(r10)
            r9.append(r1)
            r1 = 91
            r9.append(r1)
            r7 = 62
            r8 = 0
            java.lang.String r1 = ", "
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r0 = kotlin.collections.f0.r3(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r9.append(r0)
            r0 = 93
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            return r0
    }
}
