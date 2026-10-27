package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nChannels.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,141:1\n82#1,11:142\n105#1:153\n82#1,6:154\n106#1,2:160\n92#1:162\n88#1,3:163\n33#1,5:166\n*S KotlinDebug\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n105#1:142,11\n116#1:153\n116#1:154,6\n116#1:160,2\n116#1:162\n116#1:163,3\n129#1:166,5\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final /* synthetic */ class r {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {106}, m = "consumeEach", n = {"action", "$this$consume$iv"}, s = {"L$0", "L$1"})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nChannels.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$consumeEach$1\n*L\n1#1,141:1\n*E\n"})
    static final class a<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        /* synthetic */ java.lang.Object d;
        int e;

        a(kotlin.coroutines.e<? super kotlinx.coroutines.channels.r.a> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.d = r2
                int r2 = r1.e
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.e = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.channels.r.e(r2, r2, r1)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {130}, m = "consumeEach", n = {"action", "channel$iv"}, s = {"L$0", "L$1"})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nChannels.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$consumeEach$3\n*L\n1#1,141:1\n*E\n"})
    static final class b<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        /* synthetic */ java.lang.Object d;
        int e;

        b(kotlin.coroutines.e<? super kotlinx.coroutines.channels.r.b> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.d = r2
                int r2 = r1.e
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.e = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.channels.r.d(r2, r2, r1)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {149}, m = "toList", n = {"$this$toList_u24lambda_u243", "$this$consume$iv$iv"}, s = {"L$1", "L$2"})
    static final class c<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        java.lang.Object d;
        /* synthetic */ java.lang.Object e;
        int f;

        c(kotlin.coroutines.e<? super kotlinx.coroutines.channels.r.c> r1) {
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
                java.lang.Object r2 = kotlinx.coroutines.channels.p.g0(r2, r1)
                return r2
        }
    }

    @kotlin.PublishedApi
    public static final void a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.b0<?> r2, @org.jetbrains.annotations.Nullable java.lang.Throwable r3) {
            r0 = 0
            if (r3 == 0) goto L13
            boolean r1 = r3 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto La
            r0 = r3
            java.util.concurrent.CancellationException r0 = (java.util.concurrent.CancellationException) r0
        La:
            if (r0 != 0) goto L13
            java.lang.String r0 = "Channel was consumed, consumer had failed"
            java.util.concurrent.CancellationException r3 = kotlinx.coroutines.s1.a(r0, r3)
            r0 = r3
        L13:
            r2.b(r0)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @kotlinx.coroutines.ObsoleteCoroutinesApi
    public static final <E, R> R b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.d<E> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlinx.coroutines.channels.b0<? extends E>, ? extends R> r3) {
            kotlinx.coroutines.channels.b0 r2 = r2.m()
            r0 = 0
            r1 = 1
            java.lang.Object r3 = r3.invoke(r2)     // Catch: java.lang.Throwable -> L14
            kotlin.jvm.internal.d0.d(r1)
            kotlinx.coroutines.channels.b0.a.b(r2, r0, r1, r0)
            kotlin.jvm.internal.d0.c(r1)
            return r3
        L14:
            r3 = move-exception
            kotlin.jvm.internal.d0.d(r1)
            kotlinx.coroutines.channels.b0.a.b(r2, r0, r1, r0)
            kotlin.jvm.internal.d0.c(r1)
            throw r3
    }

    public static final <E, R> R c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.b0<? extends E> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlinx.coroutines.channels.b0<? extends E>, ? extends R> r3) {
            r0 = 1
            java.lang.Object r3 = r3.invoke(r2)     // Catch: java.lang.Throwable -> L10
            kotlin.jvm.internal.d0.d(r0)
            r1 = 0
            kotlinx.coroutines.channels.p.b(r2, r1)
            kotlin.jvm.internal.d0.c(r0)
            return r3
        L10:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L12
        L12:
            r1 = move-exception
            kotlin.jvm.internal.d0.d(r0)
            kotlinx.coroutines.channels.p.b(r2, r3)
            kotlin.jvm.internal.d0.c(r0)
            throw r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @org.jetbrains.annotations.Nullable
    public static final <E> java.lang.Object d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.d<E> r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, kotlin.n1> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r8) {
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.r.b
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.r$b r0 = (kotlinx.coroutines.channels.r.b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.r$b r0 = new kotlinx.coroutines.channels.r$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 != r4) goto L3c
            java.lang.Object r6 = r0.c
            kotlinx.coroutines.channels.l r6 = (kotlinx.coroutines.channels.l) r6
            java.lang.Object r7 = r0.b
            kotlinx.coroutines.channels.b0 r7 = (kotlinx.coroutines.channels.b0) r7
            java.lang.Object r2 = r0.a
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.g0.n(r8)     // Catch: java.lang.Throwable -> L3a
            r5 = r0
            r0 = r7
            r7 = r2
        L38:
            r2 = r5
            goto L65
        L3a:
            r6 = move-exception
            goto L8d
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L44:
            kotlin.g0.n(r8)
            kotlinx.coroutines.channels.b0 r6 = r6.m()
            kotlinx.coroutines.channels.l r8 = r6.iterator()     // Catch: java.lang.Throwable -> L89
            r5 = r8
            r8 = r6
            r6 = r5
        L52:
            r0.a = r7     // Catch: java.lang.Throwable -> L86
            r0.b = r8     // Catch: java.lang.Throwable -> L86
            r0.c = r6     // Catch: java.lang.Throwable -> L86
            r0.e = r4     // Catch: java.lang.Throwable -> L86
            java.lang.Object r2 = r6.c(r0)     // Catch: java.lang.Throwable -> L86
            if (r2 != r1) goto L61
            return r1
        L61:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L38
        L65:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L77
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L77
            if (r8 == 0) goto L7a
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L77
            r7.invoke(r8)     // Catch: java.lang.Throwable -> L77
            r8 = r0
            r0 = r2
            goto L52
        L77:
            r6 = move-exception
            r7 = r0
            goto L8d
        L7a:
            kotlin.n1 r6 = kotlin.n1.a     // Catch: java.lang.Throwable -> L77
            kotlin.jvm.internal.d0.d(r4)
            kotlinx.coroutines.channels.b0.a.b(r0, r3, r4, r3)
            kotlin.jvm.internal.d0.c(r4)
            return r6
        L86:
            r6 = move-exception
            r7 = r8
            goto L8d
        L89:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L8d:
            kotlin.jvm.internal.d0.d(r4)
            kotlinx.coroutines.channels.b0.a.b(r7, r3, r4, r3)
            kotlin.jvm.internal.d0.c(r4)
            throw r6
    }

    @org.jetbrains.annotations.Nullable
    public static final <E> java.lang.Object e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.b0<? extends E> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, kotlin.n1> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r7) {
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.r.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.r$a r0 = (kotlinx.coroutines.channels.r.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.r$a r0 = new kotlinx.coroutines.channels.r$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.c
            kotlinx.coroutines.channels.l r5 = (kotlinx.coroutines.channels.l) r5
            java.lang.Object r6 = r0.b
            kotlinx.coroutines.channels.b0 r6 = (kotlinx.coroutines.channels.b0) r6
            java.lang.Object r2 = r0.a
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.g0.n(r7)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r5 = move-exception
            goto L7e
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            kotlin.g0.n(r7)
            kotlinx.coroutines.channels.l r7 = r5.iterator()     // Catch: java.lang.Throwable -> L7a
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4a:
            r0.a = r7     // Catch: java.lang.Throwable -> L35
            r0.b = r6     // Catch: java.lang.Throwable -> L35
            r0.c = r5     // Catch: java.lang.Throwable -> L35
            r0.e = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r5.c(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r4 = r2
            r2 = r7
            r7 = r4
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L35
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L6d
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L35
            r2.invoke(r7)     // Catch: java.lang.Throwable -> L35
            r7 = r2
            goto L4a
        L6d:
            kotlin.n1 r5 = kotlin.n1.a     // Catch: java.lang.Throwable -> L35
            kotlin.jvm.internal.d0.d(r3)
            r7 = 0
            kotlinx.coroutines.channels.p.b(r6, r7)
            kotlin.jvm.internal.d0.c(r3)
            return r5
        L7a:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L7e:
            throw r5     // Catch: java.lang.Throwable -> L7f
        L7f:
            r7 = move-exception
            kotlin.jvm.internal.d0.d(r3)
            kotlinx.coroutines.channels.p.b(r6, r5)
            kotlin.jvm.internal.d0.c(r3)
            throw r7
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    private static final <E> java.lang.Object f(kotlinx.coroutines.channels.d<E> r3, kotlin.jvm.functions.Function1<? super E, kotlin.n1> r4, kotlin.coroutines.e<? super kotlin.n1> r5) {
            kotlinx.coroutines.channels.b0 r3 = r3.m()
            r5 = 0
            r0 = 1
            kotlinx.coroutines.channels.l r1 = r3.iterator()     // Catch: java.lang.Throwable -> L29
        La:
            r2 = 3
            kotlin.jvm.internal.d0.e(r2)     // Catch: java.lang.Throwable -> L29
            r2 = 0
            kotlin.jvm.internal.d0.e(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r2 = r1.c(r5)     // Catch: java.lang.Throwable -> L29
            kotlin.jvm.internal.d0.e(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L29
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L29
            r4.invoke(r2)     // Catch: java.lang.Throwable -> L29
            goto La
        L29:
            r4 = move-exception
            goto L37
        L2b:
            kotlin.n1 r4 = kotlin.n1.a     // Catch: java.lang.Throwable -> L29
            kotlin.jvm.internal.d0.d(r0)
            kotlinx.coroutines.channels.b0.a.b(r3, r5, r0, r5)
            kotlin.jvm.internal.d0.c(r0)
            return r4
        L37:
            kotlin.jvm.internal.d0.d(r0)
            kotlinx.coroutines.channels.b0.a.b(r3, r5, r0, r5)
            kotlin.jvm.internal.d0.c(r0)
            throw r4
    }

    private static final <E> java.lang.Object g(kotlinx.coroutines.channels.b0<? extends E> r3, kotlin.jvm.functions.Function1<? super E, kotlin.n1> r4, kotlin.coroutines.e<? super kotlin.n1> r5) {
            r5 = 1
            kotlinx.coroutines.channels.l r0 = r3.iterator()     // Catch: java.lang.Throwable -> L25
        L5:
            r1 = 3
            kotlin.jvm.internal.d0.e(r1)     // Catch: java.lang.Throwable -> L25
            r1 = 0
            kotlin.jvm.internal.d0.e(r1)     // Catch: java.lang.Throwable -> L25
            r1 = 0
            java.lang.Object r2 = r0.c(r1)     // Catch: java.lang.Throwable -> L25
            kotlin.jvm.internal.d0.e(r5)     // Catch: java.lang.Throwable -> L25
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L25
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L27
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L25
            r4.invoke(r1)     // Catch: java.lang.Throwable -> L25
            goto L5
        L25:
            r4 = move-exception
            goto L33
        L27:
            kotlin.n1 r4 = kotlin.n1.a     // Catch: java.lang.Throwable -> L25
            kotlin.jvm.internal.d0.d(r5)
            kotlinx.coroutines.channels.p.b(r3, r1)
            kotlin.jvm.internal.d0.c(r5)
            return r4
        L33:
            throw r4     // Catch: java.lang.Throwable -> L34
        L34:
            r0 = move-exception
            kotlin.jvm.internal.d0.d(r5)
            kotlinx.coroutines.channels.p.b(r3, r4)
            kotlin.jvm.internal.d0.c(r5)
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'onReceiveCatching'")
    public static final /* synthetic */ kotlinx.coroutines.selects.g h(kotlinx.coroutines.channels.b0 r1) {
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.onReceiveOrNull?>"
            kotlin.jvm.internal.g0.n(r1, r0)
            kotlinx.coroutines.selects.g r1 = r1.u()
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    public static final /* synthetic */ java.lang.Object i(kotlinx.coroutines.channels.b0 r1, kotlin.coroutines.e r2) {
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.receiveOrNull?>"
            kotlin.jvm.internal.g0.n(r1, r0)
            java.lang.Object r1 = r1.w(r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final <E> java.lang.Object j(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.b0<? extends E> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<? extends E>> r8) {
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.r.c
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.r$c r0 = (kotlinx.coroutines.channels.r.c) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.r$c r0 = new kotlinx.coroutines.channels.r$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r7 = r0.d
            kotlinx.coroutines.channels.l r7 = (kotlinx.coroutines.channels.l) r7
            java.lang.Object r2 = r0.c
            kotlinx.coroutines.channels.b0 r2 = (kotlinx.coroutines.channels.b0) r2
            java.lang.Object r4 = r0.b
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.a
            java.util.List r5 = (java.util.List) r5
            kotlin.g0.n(r8)     // Catch: java.lang.Throwable -> L39
            goto L67
        L39:
            r7 = move-exception
            r8 = r2
            goto L89
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L44:
            kotlin.g0.n(r8)
            java.util.List r8 = kotlin.collections.f0.j()
            kotlinx.coroutines.channels.l r2 = r7.iterator()     // Catch: java.lang.Throwable -> L85
            r4 = r8
            r5 = r4
            r8 = r7
            r7 = r2
        L53:
            r0.a = r5     // Catch: java.lang.Throwable -> L83
            r0.b = r4     // Catch: java.lang.Throwable -> L83
            r0.c = r8     // Catch: java.lang.Throwable -> L83
            r0.d = r7     // Catch: java.lang.Throwable -> L83
            r0.f = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r2 = r7.c(r0)     // Catch: java.lang.Throwable -> L83
            if (r2 != r1) goto L64
            return r1
        L64:
            r6 = r2
            r2 = r8
            r8 = r6
        L67:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L39
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r8 == 0) goto L78
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L39
            r4.add(r8)     // Catch: java.lang.Throwable -> L39
            r8 = r2
            goto L53
        L78:
            kotlin.n1 r7 = kotlin.n1.a     // Catch: java.lang.Throwable -> L39
            r7 = 0
            kotlinx.coroutines.channels.p.b(r2, r7)
            java.util.List r7 = kotlin.collections.f0.b(r5)
            return r7
        L83:
            r7 = move-exception
            goto L89
        L85:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L89:
            throw r7     // Catch: java.lang.Throwable -> L8a
        L8a:
            r0 = move-exception
            kotlinx.coroutines.channels.p.b(r8, r7)
            throw r0
    }
}
