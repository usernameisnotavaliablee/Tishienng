package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,414:1\n15#2:415\n15#2:416\n15#2:420\n15#2:423\n15#2:429\n15#2:430\n15#2:436\n15#2:439\n15#2:440\n15#2:441\n766#3:417\n857#3,2:418\n1855#3,2:421\n1747#3,3:424\n1855#3,2:427\n1855#3,2:431\n766#3:433\n857#3,2:434\n1855#3,2:437\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl\n*L\n166#1:415\n188#1:416\n213#1:420\n237#1:423\n279#1:429\n331#1:430\n343#1:436\n355#1:439\n382#1:440\n394#1:441\n189#1:417\n189#1:418,2\n226#1:421,2\n242#1:424,3\n251#1:427,2\n333#1:431,2\n338#1:433\n338#1:434,2\n346#1:437,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e<E> extends kotlinx.coroutines.channels.BufferedChannel<E> implements kotlinx.coroutines.channels.d<E> {
    private final int m;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.locks.ReentrantLock n;

    @org.jetbrains.annotations.NotNull
    private java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> o;

    @org.jetbrains.annotations.Nullable
    private java.lang.Object p;

    @org.jetbrains.annotations.NotNull
    private final java.util.HashMap<kotlinx.coroutines.selects.m<?>, java.lang.Object> q;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n*L\n1#1,414:1\n15#2:415\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered\n*L\n362#1:415\n*E\n"})
    private final class a extends kotlinx.coroutines.channels.BufferedChannel<E> {
        final /* synthetic */ kotlinx.coroutines.channels.e<E> m;

        public a(kotlinx.coroutines.channels.e r3) {
                r2 = this;
                r2.m = r3
                int r3 = r3.K1()
                r0 = 0
                r1 = 2
                r2.<init>(r3, r0, r1, r0)
                return
        }

        public boolean H1(@org.jetbrains.annotations.Nullable java.lang.Throwable r3) {
                r2 = this;
                kotlinx.coroutines.channels.e<E> r0 = r2.m
                java.util.concurrent.locks.ReentrantLock r0 = kotlinx.coroutines.channels.e.H1(r0)
                kotlinx.coroutines.channels.e<E> r1 = r2.m
                r0.lock()
                kotlinx.coroutines.channels.e.J1(r1, r2)     // Catch: java.lang.Throwable -> L16
                boolean r3 = super.M(r3)     // Catch: java.lang.Throwable -> L16
                r0.unlock()
                return r3
            L16:
                r3 = move-exception
                r0.unlock()
                throw r3
        }

        @Override // kotlinx.coroutines.channels.BufferedChannel
        public /* bridge */ /* synthetic */ boolean M(java.lang.Throwable r1) {
                r0 = this;
                boolean r1 = r0.H1(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class b extends kotlinx.coroutines.channels.u<E> {
        final /* synthetic */ kotlinx.coroutines.channels.e<E> o;

        public b(kotlinx.coroutines.channels.e r7) {
                r6 = this;
                r6.o = r7
                kotlinx.coroutines.channels.BufferOverflow r2 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
                r4 = 4
                r5 = 0
                r1 = 1
                r3 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // kotlinx.coroutines.channels.BufferedChannel
        public /* bridge */ /* synthetic */ boolean M(java.lang.Throwable r1) {
                r0 = this;
                boolean r1 = r0.M1(r1)
                return r1
        }

        public boolean M1(@org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
                r1 = this;
                kotlinx.coroutines.channels.e<E> r0 = r1.o
                kotlinx.coroutines.channels.e.J1(r0, r1)
                boolean r2 = super.M(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2", f = "BroadcastChannel.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$registerSelectForSend$2\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,414:1\n15#2:415\n1#3:416\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$registerSelectForSend$2\n*L\n304#1:415\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ kotlinx.coroutines.channels.e<E> b;
        final /* synthetic */ java.lang.Object c;
        final /* synthetic */ kotlinx.coroutines.selects.m<?> d;

        c(kotlinx.coroutines.channels.e<E> r1, java.lang.Object r2, kotlinx.coroutines.selects.m<?> r3, kotlin.coroutines.e<? super kotlinx.coroutines.channels.e.c> r4) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r0.d = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r5) {
                r3 = this;
                kotlinx.coroutines.channels.e$c r4 = new kotlinx.coroutines.channels.e$c
                kotlinx.coroutines.channels.e<E> r0 = r3.b
                java.lang.Object r1 = r3.c
                kotlinx.coroutines.selects.m<?> r2 = r3.d
                r4.<init>(r0, r1, r2, r5)
                return r4
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
                kotlinx.coroutines.channels.e$c r1 = (kotlinx.coroutines.channels.e.c) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r5.a
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                kotlin.g0.n(r6)     // Catch: java.lang.Throwable -> Lf
                goto L3e
            Lf:
                r6 = move-exception
                goto L29
            L11:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L19:
                kotlin.g0.n(r6)
                kotlinx.coroutines.channels.e<E> r6 = r5.b     // Catch: java.lang.Throwable -> Lf
                java.lang.Object r1 = r5.c     // Catch: java.lang.Throwable -> Lf
                r5.a = r2     // Catch: java.lang.Throwable -> Lf
                java.lang.Object r6 = r6.T(r1, r5)     // Catch: java.lang.Throwable -> Lf
                if (r6 != r0) goto L3e
                return r0
            L29:
                kotlinx.coroutines.channels.e<E> r0 = r5.b
                boolean r0 = r0.z()
                if (r0 == 0) goto L81
                boolean r0 = r6 instanceof kotlinx.coroutines.channels.ClosedSendChannelException
                if (r0 != 0) goto L3d
                kotlinx.coroutines.channels.e<E> r0 = r5.b
                java.lang.Throwable r0 = r0.n0()
                if (r0 != r6) goto L81
            L3d:
                r2 = 0
            L3e:
                kotlinx.coroutines.channels.e<E> r6 = r5.b
                java.util.concurrent.locks.ReentrantLock r6 = kotlinx.coroutines.channels.e.H1(r6)
                kotlinx.coroutines.channels.e<E> r0 = r5.b
                kotlinx.coroutines.selects.m<?> r1 = r5.d
                r6.lock()
                java.util.HashMap r3 = kotlinx.coroutines.channels.e.I1(r0)     // Catch: java.lang.Throwable -> L54
                if (r2 == 0) goto L56
                kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Throwable -> L54
                goto L5a
            L54:
                r0 = move-exception
                goto L7d
            L56:
                kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.i.z()     // Catch: java.lang.Throwable -> L54
            L5a:
                r3.put(r1, r2)     // Catch: java.lang.Throwable -> L54
                java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>"
                kotlin.jvm.internal.g0.n(r1, r2)     // Catch: java.lang.Throwable -> L54
                r2 = r1
                kotlinx.coroutines.selects.l r2 = (kotlinx.coroutines.selects.l) r2     // Catch: java.lang.Throwable -> L54
                r2 = r1
                kotlinx.coroutines.selects.l r2 = (kotlinx.coroutines.selects.l) r2     // Catch: java.lang.Throwable -> L54
                kotlin.n1 r3 = kotlin.n1.a     // Catch: java.lang.Throwable -> L54
                kotlinx.coroutines.selects.TrySelectDetailedResult r2 = r2.K(r0, r3)     // Catch: java.lang.Throwable -> L54
                kotlinx.coroutines.selects.TrySelectDetailedResult r4 = kotlinx.coroutines.selects.TrySelectDetailedResult.REREGISTER     // Catch: java.lang.Throwable -> L54
                if (r2 == r4) goto L79
                java.util.HashMap r0 = kotlinx.coroutines.channels.e.I1(r0)     // Catch: java.lang.Throwable -> L54
                r0.remove(r1)     // Catch: java.lang.Throwable -> L54
            L79:
                r6.unlock()
                return r3
            L7d:
                r6.unlock()
                throw r0
            L81:
                throw r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastChannelImpl", f = "BroadcastChannel.kt", i = {0, 0}, l = {230}, m = "send", n = {"this", "element"}, s = {"L$0", "L$1"})
    static final class d extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        /* synthetic */ java.lang.Object d;
        final /* synthetic */ kotlinx.coroutines.channels.e<E> e;
        int f;

        d(kotlinx.coroutines.channels.e<E> r1, kotlin.coroutines.e<? super kotlinx.coroutines.channels.e.d> r2) {
                r0 = this;
                r0.e = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.d = r2
                int r2 = r1.f
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f = r2
                kotlinx.coroutines.channels.e<E> r2 = r1.e
                r0 = 0
                java.lang.Object r2 = r2.T(r0, r1)
                return r2
        }
    }

    public e(int r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r0, r1)
            r2.m = r3
            r0 = 1
            if (r3 >= r0) goto L2e
            r0 = -1
            if (r3 != r0) goto Le
            goto L2e
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BroadcastChannel capacity must be positive or Channel.CONFLATED, but "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was specified"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L2e:
            java.util.concurrent.locks.ReentrantLock r3 = new java.util.concurrent.locks.ReentrantLock
            r3.<init>()
            r2.n = r3
            java.util.List r3 = kotlin.collections.f0.J()
            r2.o = r3
            kotlinx.coroutines.internal.s0 r3 = kotlinx.coroutines.channels.f.b()
            r2.p = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r2.q = r3
            return
    }

    public static final /* synthetic */ java.util.concurrent.locks.ReentrantLock H1(kotlinx.coroutines.channels.e r0) {
            java.util.concurrent.locks.ReentrantLock r0 = r0.n
            return r0
    }

    public static final /* synthetic */ java.util.HashMap I1(kotlinx.coroutines.channels.e r0) {
            java.util.HashMap<kotlinx.coroutines.selects.m<?>, java.lang.Object> r0 = r0.q
            return r0
    }

    public static final /* synthetic */ void J1(kotlinx.coroutines.channels.e r0, kotlinx.coroutines.channels.b0 r1) {
            r0.P1(r1)
            return
    }

    public static /* synthetic */ void M1() {
            return
    }

    public static /* synthetic */ void O1() {
            return
    }

    private final void P1(kotlinx.coroutines.channels.b0<? extends E> r6) {
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r5.n
            r0.lock()
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r1 = r5.o     // Catch: java.lang.Throwable -> L25
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L25
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L25
            r2.<init>()     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L25
        L12:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L27
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L25
            r4 = r3
            kotlinx.coroutines.channels.BufferedChannel r4 = (kotlinx.coroutines.channels.BufferedChannel) r4     // Catch: java.lang.Throwable -> L25
            if (r4 == r6) goto L12
            r2.add(r3)     // Catch: java.lang.Throwable -> L25
            goto L12
        L25:
            r6 = move-exception
            goto L2f
        L27:
            r5.o = r2     // Catch: java.lang.Throwable -> L25
            kotlin.n1 r6 = kotlin.n1.a     // Catch: java.lang.Throwable -> L25
            r0.unlock()
            return
        L2f:
            r0.unlock()
            throw r6
    }

    public final int K1() {
            r1 = this;
            int r0 = r1.m
            return r0
    }

    public final E L1() {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.n
            r0.lock()
            boolean r1 = r3.z()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1c
            java.lang.Throwable r1 = r3.f0()     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L1b
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = "This broadcast channel is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r1 = move-exception
            goto L32
        L1b:
            throw r1     // Catch: java.lang.Throwable -> L19
        L1c:
            java.lang.Object r1 = r3.p     // Catch: java.lang.Throwable -> L19
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.f.b()     // Catch: java.lang.Throwable -> L19
            if (r1 == r2) goto L2a
            java.lang.Object r1 = r3.p     // Catch: java.lang.Throwable -> L19
            r0.unlock()
            return r1
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = "No value"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L19
            throw r1     // Catch: java.lang.Throwable -> L19
        L32:
            r0.unlock()
            throw r1
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean M(@org.jetbrains.annotations.Nullable java.lang.Throwable r4) {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.n
            r0.lock()
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r1 = r3.o     // Catch: java.lang.Throwable -> L1d
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1d
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1d
            kotlinx.coroutines.channels.BufferedChannel r2 = (kotlinx.coroutines.channels.BufferedChannel) r2     // Catch: java.lang.Throwable -> L1d
            r2.M(r4)     // Catch: java.lang.Throwable -> L1d
            goto Ld
        L1d:
            r4 = move-exception
            goto L2d
        L1f:
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.channels.f.b()     // Catch: java.lang.Throwable -> L1d
            r3.p = r1     // Catch: java.lang.Throwable -> L1d
            boolean r4 = super.M(r4)     // Catch: java.lang.Throwable -> L1d
            r0.unlock()
            return r4
        L2d:
            r0.unlock()
            throw r4
    }

    @org.jetbrains.annotations.Nullable
    public final E N1() {
            r4 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r4.n
            r0.lock()
            boolean r1 = r4.D()     // Catch: java.lang.Throwable -> L1c
            r2 = 0
            if (r1 == 0) goto Ld
            goto L18
        Ld:
            java.lang.Object r1 = r4.p     // Catch: java.lang.Throwable -> L1c
            kotlinx.coroutines.internal.s0 r3 = kotlinx.coroutines.channels.f.b()     // Catch: java.lang.Throwable -> L1c
            if (r1 != r3) goto L16
            goto L18
        L16:
            java.lang.Object r2 = r4.p     // Catch: java.lang.Throwable -> L1c
        L18:
            r0.unlock()
            return r2
        L1c:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.c0
    public boolean S(@org.jetbrains.annotations.Nullable java.lang.Throwable r6) {
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r5.n
            r0.lock()
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r1 = r5.o     // Catch: java.lang.Throwable -> L1d
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1d
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1d
            kotlinx.coroutines.channels.BufferedChannel r2 = (kotlinx.coroutines.channels.BufferedChannel) r2     // Catch: java.lang.Throwable -> L1d
            r2.S(r6)     // Catch: java.lang.Throwable -> L1d
            goto Ld
        L1d:
            r6 = move-exception
            goto L4d
        L1f:
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r1 = r5.o     // Catch: java.lang.Throwable -> L1d
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L1d
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1d
            r2.<init>()     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1d
        L2c:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L43
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L1d
            r4 = r3
            kotlinx.coroutines.channels.BufferedChannel r4 = (kotlinx.coroutines.channels.BufferedChannel) r4     // Catch: java.lang.Throwable -> L1d
            boolean r4 = r4.p0()     // Catch: java.lang.Throwable -> L1d
            if (r4 == 0) goto L2c
            r2.add(r3)     // Catch: java.lang.Throwable -> L1d
            goto L2c
        L43:
            r5.o = r2     // Catch: java.lang.Throwable -> L1d
            boolean r6 = super.S(r6)     // Catch: java.lang.Throwable -> L1d
            r0.unlock()
            return r6
        L4d:
            r0.unlock()
            throw r6
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.c0
    @org.jetbrains.annotations.Nullable
    public java.lang.Object T(E r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r8) {
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.e.d
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.e$d r0 = (kotlinx.coroutines.channels.e.d) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.e$d r0 = new kotlinx.coroutines.channels.e$d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r7 = r0.c
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r0.b
            java.lang.Object r4 = r0.a
            kotlinx.coroutines.channels.e r4 = (kotlinx.coroutines.channels.e) r4
            kotlin.g0.n(r8)
            goto L80
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            kotlin.g0.n(r8)
            java.util.concurrent.locks.ReentrantLock r8 = r6.n
            r8.lock()
            boolean r2 = r6.z()     // Catch: java.lang.Throwable -> L51
            if (r2 != 0) goto L99
            int r2 = r6.m     // Catch: java.lang.Throwable -> L51
            r4 = -1
            if (r2 != r4) goto L53
            r6.p = r7     // Catch: java.lang.Throwable -> L51
            goto L53
        L51:
            r7 = move-exception
            goto L9e
        L53:
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r2 = r6.o     // Catch: java.lang.Throwable -> L51
            r8.unlock()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r8 = r2.iterator()
            r4 = r8
            r8 = r7
            r7 = r4
            r4 = r6
        L62:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L96
            java.lang.Object r2 = r7.next()
            kotlinx.coroutines.channels.BufferedChannel r2 = (kotlinx.coroutines.channels.BufferedChannel) r2
            r0.a = r4
            r0.b = r8
            r0.c = r7
            r0.f = r3
            java.lang.Object r2 = r2.m1(r8, r0)
            if (r2 != r1) goto L7d
            return r1
        L7d:
            r5 = r2
            r2 = r8
            r8 = r5
        L80:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L94
            boolean r8 = r4.z()
            if (r8 != 0) goto L8f
            goto L94
        L8f:
            java.lang.Throwable r7 = r4.n0()
            throw r7
        L94:
            r8 = r2
            goto L62
        L96:
            kotlin.n1 r7 = kotlin.n1.a
            return r7
        L99:
            java.lang.Throwable r7 = r6.n0()     // Catch: java.lang.Throwable -> L51
            throw r7     // Catch: java.lang.Throwable -> L51
        L9e:
            r8.unlock()
            throw r7
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected void g1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.m<?> r8, @org.jetbrains.annotations.Nullable java.lang.Object r9) {
            r7 = this;
            java.util.concurrent.locks.ReentrantLock r1 = r7.n
            r1.lock()
            java.util.HashMap<kotlinx.coroutines.selects.m<?>, java.lang.Object> r0 = r7.q     // Catch: java.lang.Throwable -> L14
            java.lang.Object r0 = r0.remove(r8)     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L17
            r8.f(r0)     // Catch: java.lang.Throwable -> L14
            r1.unlock()
            return
        L14:
            r0 = move-exception
            r8 = r0
            goto L33
        L17:
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L14
            r1.unlock()
            kotlin.coroutines.i r0 = r8.getContext()
            kotlinx.coroutines.r0 r1 = kotlinx.coroutines.s0.a(r0)
            kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
            kotlinx.coroutines.channels.e$c r4 = new kotlinx.coroutines.channels.e$c
            r0 = 0
            r4.<init>(r7, r9, r8, r0)
            r5 = 1
            r6 = 0
            r2 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            return
        L33:
            r1.unlock()
            throw r8
    }

    @Override // kotlinx.coroutines.channels.d
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.channels.b0<E> m() {
            r4 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r4.n
            r0.lock()
            int r1 = r4.m     // Catch: java.lang.Throwable -> L10
            r2 = -1
            if (r1 != r2) goto L12
            kotlinx.coroutines.channels.e$b r1 = new kotlinx.coroutines.channels.e$b     // Catch: java.lang.Throwable -> L10
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L10
            goto L17
        L10:
            r1 = move-exception
            goto L4d
        L12:
            kotlinx.coroutines.channels.e$a r1 = new kotlinx.coroutines.channels.e$a     // Catch: java.lang.Throwable -> L10
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L10
        L17:
            boolean r2 = r4.z()     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L30
            java.lang.Object r2 = r4.p     // Catch: java.lang.Throwable -> L10
            kotlinx.coroutines.internal.s0 r3 = kotlinx.coroutines.channels.f.b()     // Catch: java.lang.Throwable -> L10
            if (r2 != r3) goto L30
            java.lang.Throwable r2 = r4.f0()     // Catch: java.lang.Throwable -> L10
            r1.S(r2)     // Catch: java.lang.Throwable -> L10
            r0.unlock()
            return r1
        L30:
            java.lang.Object r2 = r4.p     // Catch: java.lang.Throwable -> L10
            kotlinx.coroutines.internal.s0 r3 = kotlinx.coroutines.channels.f.b()     // Catch: java.lang.Throwable -> L10
            if (r2 == r3) goto L3f
            java.lang.Object r2 = r4.L1()     // Catch: java.lang.Throwable -> L10
            r1.r(r2)     // Catch: java.lang.Throwable -> L10
        L3f:
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r2 = r4.o     // Catch: java.lang.Throwable -> L10
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L10
            java.util.List r2 = kotlin.collections.f0.J4(r2, r1)     // Catch: java.lang.Throwable -> L10
            r4.o = r2     // Catch: java.lang.Throwable -> L10
            r0.unlock()
            return r1
        L4d:
            r0.unlock()
            throw r1
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.c0
    @org.jetbrains.annotations.NotNull
    public java.lang.Object r(E r4) {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.n
            r0.lock()
            boolean r1 = r3.z()     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L15
            java.lang.Object r4 = super.r(r4)     // Catch: java.lang.Throwable -> L13
            r0.unlock()
            return r4
        L13:
            r4 = move-exception
            goto L72
        L15:
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r1 = r3.o     // Catch: java.lang.Throwable -> L13
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L13
            boolean r2 = r1 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L27
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L13
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L27
            goto L47
        L27:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L13
        L2b:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L13
            kotlinx.coroutines.channels.BufferedChannel r2 = (kotlinx.coroutines.channels.BufferedChannel) r2     // Catch: java.lang.Throwable -> L13
            boolean r2 = r2.t1()     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L2b
            kotlinx.coroutines.channels.n$b r4 = kotlinx.coroutines.channels.n.b     // Catch: java.lang.Throwable -> L13
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> L13
            r0.unlock()
            return r4
        L47:
            int r1 = r3.m     // Catch: java.lang.Throwable -> L13
            r2 = -1
            if (r1 != r2) goto L4e
            r3.p = r4     // Catch: java.lang.Throwable -> L13
        L4e:
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r1 = r3.o     // Catch: java.lang.Throwable -> L13
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L13
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L13
        L56:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L66
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L13
            kotlinx.coroutines.channels.BufferedChannel r2 = (kotlinx.coroutines.channels.BufferedChannel) r2     // Catch: java.lang.Throwable -> L13
            r2.r(r4)     // Catch: java.lang.Throwable -> L13
            goto L56
        L66:
            kotlinx.coroutines.channels.n$b r4 = kotlinx.coroutines.channels.n.b     // Catch: java.lang.Throwable -> L13
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L13
            java.lang.Object r4 = r4.c(r1)     // Catch: java.lang.Throwable -> L13
            r0.unlock()
            return r4
        L72:
            r0.unlock()
            throw r4
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r11.p
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.f.b()
            if (r1 == r2) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "CONFLATED_ELEMENT="
            r1.append(r2)
            java.lang.Object r2 = r11.p
            r1.append(r2)
            java.lang.String r2 = "; "
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L28
        L26:
            java.lang.String r1 = ""
        L28:
            r0.append(r1)
            java.lang.String r1 = "BROADCAST=<"
            r0.append(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ">; SUBSCRIBERS="
            r0.append(r1)
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r1 = r11.o
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r9 = 56
            r10 = 0
            java.lang.String r3 = ";"
            java.lang.String r4 = "<"
            java.lang.String r5 = ">"
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r1 = kotlin.collections.f0.r3(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.c0
    public boolean z() {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.n
            r0.lock()
            boolean r1 = super.z()     // Catch: java.lang.Throwable -> Ld
            r0.unlock()
            return r1
        Ld:
            r1 = move-exception
            r0.unlock()
            throw r1
    }
}
