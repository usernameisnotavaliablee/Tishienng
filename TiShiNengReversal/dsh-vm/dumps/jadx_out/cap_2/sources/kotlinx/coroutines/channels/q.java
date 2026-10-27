package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,61:1\n514#2,6:62\n*S KotlinDebug\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt\n*L\n37#1:62,6\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final /* synthetic */ class q {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", f = "Channels.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ kotlinx.coroutines.channels.c0<java.lang.Object> b;
        final /* synthetic */ java.lang.Object c;

        a(kotlinx.coroutines.channels.c0<java.lang.Object> r1, java.lang.Object r2, kotlin.coroutines.e<? super kotlinx.coroutines.channels.q.a> r3) {
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
                kotlinx.coroutines.channels.q$a r3 = new kotlinx.coroutines.channels.q$a
                kotlinx.coroutines.channels.c0<java.lang.Object> r0 = r2.b
                java.lang.Object r1 = r2.c
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
                kotlinx.coroutines.channels.q$a r1 = (kotlinx.coroutines.channels.q.a) r1
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
                kotlinx.coroutines.channels.c0<java.lang.Object> r4 = r3.b
                java.lang.Object r1 = r3.c
                r3.a = r2
                java.lang.Object r4 = r4.T(r1, r3)
                if (r4 != r0) goto L27
                return r0
            L27:
                kotlin.n1 r4 = kotlin.n1.a
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt$trySendBlocking$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlinx.coroutines.channels.n<? extends kotlin.n1>>, java.lang.Object> {
        int a;
        private /* synthetic */ java.lang.Object b;
        final /* synthetic */ kotlinx.coroutines.channels.c0<E> c;
        final /* synthetic */ E d;

        b(kotlinx.coroutines.channels.c0<? super E> r1, E r2, kotlin.coroutines.e<? super kotlinx.coroutines.channels.q.b> r3) {
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
                kotlinx.coroutines.channels.q$b r0 = new kotlinx.coroutines.channels.q$b
                kotlinx.coroutines.channels.c0<E> r1 = r3.c
                E r2 = r3.d
                r0.<init>(r1, r2, r5)
                r0.b = r4
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlinx.coroutines.channels.n<? extends kotlin.n1>> r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlinx.coroutines.channels.n<kotlin.n1>> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlinx.coroutines.channels.q$b r1 = (kotlinx.coroutines.channels.q.b) r1
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
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                kotlin.g0.n(r5)     // Catch: java.lang.Throwable -> Lf
                goto L2f
            Lf:
                r5 = move-exception
                goto L36
            L11:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L19:
                kotlin.g0.n(r5)
                java.lang.Object r5 = r4.b
                kotlinx.coroutines.r0 r5 = (kotlinx.coroutines.r0) r5
                kotlinx.coroutines.channels.c0<E> r5 = r4.c
                E r1 = r4.d
                kotlin.Result$a r3 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> Lf
                r4.a = r2     // Catch: java.lang.Throwable -> Lf
                java.lang.Object r5 = r5.T(r1, r4)     // Catch: java.lang.Throwable -> Lf
                if (r5 != r0) goto L2f
                return r0
            L2f:
                kotlin.n1 r5 = kotlin.n1.a     // Catch: java.lang.Throwable -> Lf
                java.lang.Object r5 = kotlin.Result.m11constructorimpl(r5)     // Catch: java.lang.Throwable -> Lf
                goto L40
            L36:
                kotlin.Result$a r0 = kotlin.Result.Companion
                java.lang.Object r5 = kotlin.g0.a(r5)
                java.lang.Object r5 = kotlin.Result.m11constructorimpl(r5)
            L40:
                boolean r0 = kotlin.Result.m18isSuccessimpl(r5)
                if (r0 == 0) goto L4f
                kotlinx.coroutines.channels.n$b r5 = kotlinx.coroutines.channels.n.b
                kotlin.n1 r0 = kotlin.n1.a
                java.lang.Object r5 = r5.c(r0)
                goto L59
            L4f:
                kotlinx.coroutines.channels.n$b r0 = kotlinx.coroutines.channels.n.b
                java.lang.Throwable r5 = kotlin.Result.m14exceptionOrNullimpl(r5)
                java.lang.Object r5 = r0.a(r5)
            L59:
                kotlinx.coroutines.channels.n r5 = kotlinx.coroutines.channels.n.b(r5)
                return r5
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @kotlin.ReplaceWith(expression = "trySendBlocking(element)", imports = {}))
    public static final /* synthetic */ void a(kotlinx.coroutines.channels.c0 r2, java.lang.Object r3) {
            java.lang.Object r0 = r2.r(r3)
            boolean r0 = kotlinx.coroutines.channels.n.m(r0)
            if (r0 == 0) goto Lb
            return
        Lb:
            kotlinx.coroutines.channels.q$a r0 = new kotlinx.coroutines.channels.q$a
            r1 = 0
            r0.<init>(r2, r3, r1)
            r2 = 1
            kotlinx.coroutines.i.g(r1, r0, r2, r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> java.lang.Object b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.c0<? super E> r2, E r3) {
            java.lang.Object r0 = r2.r(r3)
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.n.c
            if (r1 != 0) goto L13
            kotlin.n1 r0 = (kotlin.n1) r0
            kotlinx.coroutines.channels.n$b r2 = kotlinx.coroutines.channels.n.b
            kotlin.n1 r3 = kotlin.n1.a
            java.lang.Object r2 = r2.c(r3)
            return r2
        L13:
            kotlinx.coroutines.channels.q$b r0 = new kotlinx.coroutines.channels.q$b
            r1 = 0
            r0.<init>(r2, r3, r1)
            r2 = 1
            java.lang.Object r2 = kotlinx.coroutines.i.g(r1, r0, r2, r1)
            kotlinx.coroutines.channels.n r2 = (kotlinx.coroutines.channels.n) r2
            java.lang.Object r2 = r2.o()
            return r2
    }
}
