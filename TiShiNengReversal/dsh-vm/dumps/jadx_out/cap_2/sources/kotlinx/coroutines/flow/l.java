package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/FlowKt__ChannelsKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,176:1\n107#2:177\n*S KotlinDebug\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/FlowKt__ChannelsKt\n*L\n153#1:177\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final /* synthetic */ class l {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Channels.kt\nkotlinx/coroutines/flow/FlowKt__ChannelsKt\n*L\n1#1,113:1\n154#2,2:114\n*E\n"})
    public static final class a<T> implements kotlinx.coroutines.flow.i<T> {
        final /* synthetic */ kotlinx.coroutines.channels.d a;

        public a(kotlinx.coroutines.channels.d r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.i
        @org.jetbrains.annotations.Nullable
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
                r1 = this;
                kotlinx.coroutines.channels.d r0 = r1.a
                kotlinx.coroutines.channels.b0 r0 = r0.m()
                java.lang.Object r2 = kotlinx.coroutines.flow.k.l0(r2, r0, r3)
                java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
                if (r2 != r3) goto L11
                return r2
            L11:
                kotlin.n1 r2 = kotlin.n1.a
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", i = {0, 0, 0, 1, 1, 1}, l = {36, 37}, m = "emitAllImpl$FlowKt__ChannelsKt", n = {"$this$emitAllImpl", "channel", "consume", "$this$emitAllImpl", "channel", "consume"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
    static final class b<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        boolean d;
        /* synthetic */ java.lang.Object e;
        int f;

        b(kotlin.coroutines.e<? super kotlinx.coroutines.flow.l.b> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.e = r2
                int r2 = r1.f
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f = r2
                r2 = 0
                r0 = 0
                java.lang.Object r2 = kotlinx.coroutines.flow.l.a(r2, r2, r0, r1)
                return r2
        }
    }

    public static final /* synthetic */ java.lang.Object a(kotlinx.coroutines.flow.j r0, kotlinx.coroutines.channels.b0 r1, boolean r2, kotlin.coroutines.e r3) {
            java.lang.Object r0 = e(r0, r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.d<T> r1) {
            kotlinx.coroutines.flow.l$a r0 = new kotlinx.coroutines.flow.l$a
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.b0<? extends T> r8) {
            kotlinx.coroutines.flow.e r0 = new kotlinx.coroutines.flow.e
            r6 = 28
            r7 = 0
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.b0<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            r0 = 1
            java.lang.Object r1 = e(r1, r2, r0, r3)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
            if (r1 != r2) goto Lc
            return r1
        Lc:
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final <T> java.lang.Object e(kotlinx.coroutines.flow.j<? super T> r6, kotlinx.coroutines.channels.b0<? extends T> r7, boolean r8, kotlin.coroutines.e<? super kotlin.n1> r9) {
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.l.b
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.l$b r0 = (kotlinx.coroutines.flow.l.b) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.l$b r0 = new kotlinx.coroutines.flow.l$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.d
            java.lang.Object r6 = r0.c
            kotlinx.coroutines.channels.l r6 = (kotlinx.coroutines.channels.l) r6
            java.lang.Object r7 = r0.b
            kotlinx.coroutines.channels.b0 r7 = (kotlinx.coroutines.channels.b0) r7
            java.lang.Object r2 = r0.a
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
            kotlin.g0.n(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.d
            java.lang.Object r6 = r0.c
            kotlinx.coroutines.channels.l r6 = (kotlinx.coroutines.channels.l) r6
            java.lang.Object r7 = r0.b
            kotlinx.coroutines.channels.b0 r7 = (kotlinx.coroutines.channels.b0) r7
            java.lang.Object r2 = r0.a
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
            kotlin.g0.n(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            kotlin.g0.n(r9)
            kotlinx.coroutines.flow.k.o0(r6)
            kotlinx.coroutines.channels.l r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.a = r6     // Catch: java.lang.Throwable -> L3c
            r0.b = r7     // Catch: java.lang.Throwable -> L3c
            r0.c = r9     // Catch: java.lang.Throwable -> L3c
            r0.d = r8     // Catch: java.lang.Throwable -> L3c
            r0.f = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.c(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            goto L93
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.a = r2     // Catch: java.lang.Throwable -> L3c
            r0.b = r7     // Catch: java.lang.Throwable -> L3c
            r0.c = r6     // Catch: java.lang.Throwable -> L3c
            r0.d = r8     // Catch: java.lang.Throwable -> L3c
            r0.f = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
        L93:
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            kotlinx.coroutines.channels.p.b(r7, r6)
        L9a:
            kotlin.n1 r6 = kotlin.n1.a
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            kotlinx.coroutines.channels.p.b(r7, r6)
        La4:
            throw r9
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.channels.b0<T> f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1) {
            kotlinx.coroutines.flow.internal.d r0 = kotlinx.coroutines.flow.internal.e.b(r0)
            kotlinx.coroutines.channels.b0 r0 = r0.m(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> g(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.b0<? extends T> r8) {
            kotlinx.coroutines.flow.e r0 = new kotlinx.coroutines.flow.e
            r6 = 28
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }
}
