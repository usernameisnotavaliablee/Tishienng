package kotlinx.coroutines.flow.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1855#2,2:101\n*S KotlinDebug\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge\n*L\n95#1:101,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class j<T> extends kotlinx.coroutines.flow.internal.d<T> {

    @org.jetbrains.annotations.NotNull
    private final java.lang.Iterable<kotlinx.coroutines.flow.i<T>> d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ kotlinx.coroutines.flow.i<T> b;
        final /* synthetic */ kotlinx.coroutines.flow.internal.u<T> c;

        a(kotlinx.coroutines.flow.i<? extends T> r1, kotlinx.coroutines.flow.internal.u<T> r2, kotlin.coroutines.e<? super kotlinx.coroutines.flow.internal.j.a> r3) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
                r2 = this;
                kotlinx.coroutines.flow.internal.j$a r3 = new kotlinx.coroutines.flow.internal.j$a
                kotlinx.coroutines.flow.i<T> r0 = r2.b
                kotlinx.coroutines.flow.internal.u<T> r1 = r2.c
                r3.<init>(r0, r1, r4)
                return r3
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
                kotlinx.coroutines.flow.internal.j$a r1 = (kotlinx.coroutines.flow.internal.j.a) r1
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
                goto L27
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.g0.n(r4)
                kotlinx.coroutines.flow.i<T> r4 = r3.b
                kotlinx.coroutines.flow.internal.u<T> r1 = r3.c
                r3.a = r2
                java.lang.Object r4 = r4.collect(r1, r3)
                if (r4 != r0) goto L27
                return r0
            L27:
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }
    }

    public j(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends kotlinx.coroutines.flow.i<? extends T>> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, int r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            r0.d = r1
            return
    }

    public /* synthetic */ j(java.lang.Iterable r1, kotlin.coroutines.i r2, int r3, kotlinx.coroutines.channels.BufferOverflow r4, int r5, kotlin.jvm.internal.v r6) {
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r6 = r5 & 4
            if (r6 == 0) goto Lb
            r3 = -2
        Lb:
            r5 = r5 & 8
            if (r5 == 0) goto L11
            kotlinx.coroutines.channels.BufferOverflow r4 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
        L11:
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @org.jetbrains.annotations.Nullable
    protected java.lang.Object h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.z<? super T> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r10) {
            r8 = this;
            kotlinx.coroutines.flow.internal.u r10 = new kotlinx.coroutines.flow.internal.u
            r10.<init>(r9)
            java.lang.Iterable<kotlinx.coroutines.flow.i<T>> r0 = r8.d
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            kotlinx.coroutines.flow.i r1 = (kotlinx.coroutines.flow.i) r1
            kotlinx.coroutines.flow.internal.j$a r5 = new kotlinx.coroutines.flow.internal.j$a
            r2 = 0
            r5.<init>(r1, r10, r2)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            r2 = r9
            kotlinx.coroutines.i.e(r2, r3, r4, r5, r6, r7)
            goto Lb
        L26:
            kotlin.n1 r9 = kotlin.n1.a
            return r9
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @org.jetbrains.annotations.NotNull
    protected kotlinx.coroutines.flow.internal.d<T> i(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r3, int r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r5) {
            r2 = this;
            kotlinx.coroutines.flow.internal.j r0 = new kotlinx.coroutines.flow.internal.j
            java.lang.Iterable<kotlinx.coroutines.flow.i<T>> r1 = r2.d
            r0.<init>(r1, r3, r4, r5)
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.channels.b0<T> m(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r4) {
            r3 = this;
            kotlin.coroutines.i r0 = r3.a
            int r1 = r3.b
            kotlin.jvm.functions.Function2 r2 = r3.k()
            kotlinx.coroutines.channels.b0 r4 = kotlinx.coroutines.channels.x.c(r4, r0, r1, r2)
            return r4
    }
}
