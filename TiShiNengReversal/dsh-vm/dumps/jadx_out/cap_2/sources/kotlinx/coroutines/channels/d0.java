package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTickerChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TickerChannels.kt\nkotlinx/coroutines/channels/TickerChannelsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d0 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 1, 1, 2, 2}, l = {106, 108, 109}, m = "fixedDelayTicker", n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        long a;
        java.lang.Object b;
        /* synthetic */ java.lang.Object c;
        int d;

        a(kotlin.coroutines.e<? super kotlinx.coroutines.channels.d0.a> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                r6 = this;
                r6.c = r7
                int r7 = r6.d
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r7 = r7 | r0
                r6.d = r7
                r2 = 0
                r4 = 0
                r0 = 0
                r5 = r6
                java.lang.Object r7 = kotlinx.coroutines.channels.d0.a(r0, r2, r4, r5)
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {84, 88, 94, 96}, m = "fixedPeriodTicker", n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
    static final class b extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        long a;
        long b;
        java.lang.Object c;
        /* synthetic */ java.lang.Object d;
        int e;

        b(kotlin.coroutines.e<? super kotlinx.coroutines.channels.d0.b> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                r6 = this;
                r6.d = r7
                int r7 = r6.e
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r7 = r7 | r0
                r6.e = r7
                r2 = 0
                r4 = 0
                r0 = 0
                r5 = r6
                java.lang.Object r7 = kotlinx.coroutines.channels.d0.b(r0, r2, r4, r5)
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", i = {}, l = {72, 73}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.z<? super kotlin.n1>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        private /* synthetic */ java.lang.Object b;
        final /* synthetic */ kotlinx.coroutines.channels.TickerMode c;
        final /* synthetic */ long d;
        final /* synthetic */ long e;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a = null;

            static {
                    kotlinx.coroutines.channels.TickerMode[] r0 = kotlinx.coroutines.channels.TickerMode.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    kotlinx.coroutines.channels.TickerMode r1 = kotlinx.coroutines.channels.TickerMode.FIXED_PERIOD     // Catch: java.lang.NoSuchFieldError -> L10
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                    r2 = 1
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
                L10:
                    kotlinx.coroutines.channels.TickerMode r1 = kotlinx.coroutines.channels.TickerMode.FIXED_DELAY     // Catch: java.lang.NoSuchFieldError -> L19
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                    r2 = 2
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
                L19:
                    kotlinx.coroutines.channels.d0.c.a.a = r0
                    return
            }
        }

        c(kotlinx.coroutines.channels.TickerMode r1, long r2, long r4, kotlin.coroutines.e<? super kotlinx.coroutines.channels.d0.c> r6) {
                r0 = this;
                r0.c = r1
                r0.d = r2
                r0.e = r4
                r1 = 2
                r0.<init>(r1, r6)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r9) {
                r7 = this;
                kotlinx.coroutines.channels.d0$c r0 = new kotlinx.coroutines.channels.d0$c
                kotlinx.coroutines.channels.TickerMode r1 = r7.c
                long r2 = r7.d
                long r4 = r7.e
                r6 = r9
                r0.<init>(r1, r2, r4, r6)
                r0.b = r8
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.z<? super kotlin.n1> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlinx.coroutines.channels.z r1 = (kotlinx.coroutines.channels.z) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.z<? super kotlin.n1> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlinx.coroutines.channels.d0$c r1 = (kotlinx.coroutines.channels.d0.c) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r10.a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.g0.n(r11)
                r6 = r10
                goto L5c
            L13:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1b:
                kotlin.g0.n(r11)
                goto L5c
            L1f:
                kotlin.g0.n(r11)
                java.lang.Object r11 = r10.b
                kotlinx.coroutines.channels.z r11 = (kotlinx.coroutines.channels.z) r11
                kotlinx.coroutines.channels.TickerMode r1 = r10.c
                int[] r4 = kotlinx.coroutines.channels.d0.c.a.a
                int r1 = r1.ordinal()
                r1 = r4[r1]
                if (r1 == r3) goto L48
                if (r1 == r2) goto L35
                goto L5c
            L35:
                long r4 = r10.d
                long r6 = r10.e
                kotlinx.coroutines.channels.c0 r8 = r11.getChannel()
                r10.a = r2
                r9 = r10
                java.lang.Object r11 = kotlinx.coroutines.channels.d0.a(r4, r6, r8, r9)
                r6 = r9
                if (r11 != r0) goto L5c
                goto L5b
            L48:
                r6 = r10
                long r1 = r6.d
                r5 = 1
                long r3 = r6.e
                kotlinx.coroutines.channels.c0 r11 = r11.getChannel()
                r6.a = r5
                r5 = r11
                java.lang.Object r11 = kotlinx.coroutines.channels.d0.b(r1, r3, r5, r6)
                if (r11 != r0) goto L5c
            L5b:
                return r0
            L5c:
                kotlin.n1 r11 = kotlin.n1.a
                return r11
        }
    }

    public static final /* synthetic */ java.lang.Object a(long r0, long r2, kotlinx.coroutines.channels.c0 r4, kotlin.coroutines.e r5) {
            java.lang.Object r0 = c(r0, r2, r4, r5)
            return r0
    }

    public static final /* synthetic */ java.lang.Object b(long r0, long r2, kotlinx.coroutines.channels.c0 r4, kotlin.coroutines.e r5) {
            java.lang.Object r0 = d(r0, r2, r4, r5)
            return r0
    }

    private static final java.lang.Object c(long r6, long r8, kotlinx.coroutines.channels.c0<? super kotlin.n1> r10, kotlin.coroutines.e<? super kotlin.n1> r11) {
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.d0.a
            if (r0 == 0) goto L13
            r0 = r11
            kotlinx.coroutines.channels.d0$a r0 = (kotlinx.coroutines.channels.d0.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.d0$a r0 = new kotlinx.coroutines.channels.d0$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L48
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            long r6 = r0.a
            java.lang.Object r8 = r0.b
            kotlinx.coroutines.channels.c0 r8 = (kotlinx.coroutines.channels.c0) r8
            kotlin.g0.n(r11)
        L34:
            r10 = r8
            goto L63
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            long r6 = r0.a
            java.lang.Object r8 = r0.b
            kotlinx.coroutines.channels.c0 r8 = (kotlinx.coroutines.channels.c0) r8
            kotlin.g0.n(r11)
            goto L73
        L48:
            long r6 = r0.a
            java.lang.Object r8 = r0.b
            r10 = r8
            kotlinx.coroutines.channels.c0 r10 = (kotlinx.coroutines.channels.c0) r10
            kotlin.g0.n(r11)
            goto L63
        L53:
            kotlin.g0.n(r11)
            r0.b = r10
            r0.a = r6
            r0.d = r5
            java.lang.Object r8 = kotlinx.coroutines.a1.b(r8, r0)
            if (r8 != r1) goto L63
            goto L7f
        L63:
            kotlin.n1 r8 = kotlin.n1.a
            r0.b = r10
            r0.a = r6
            r0.d = r4
            java.lang.Object r8 = r10.T(r8, r0)
            if (r8 != r1) goto L72
            goto L7f
        L72:
            r8 = r10
        L73:
            r0.b = r8
            r0.a = r6
            r0.d = r3
            java.lang.Object r9 = kotlinx.coroutines.a1.b(r6, r0)
            if (r9 != r1) goto L34
        L7f:
            return r1
    }

    private static final java.lang.Object d(long r18, long r20, kotlinx.coroutines.channels.c0<? super kotlin.n1> r22, kotlin.coroutines.e<? super kotlin.n1> r23) {
            r0 = r23
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.d0.b
            if (r1 == 0) goto L15
            r1 = r0
            kotlinx.coroutines.channels.d0$b r1 = (kotlinx.coroutines.channels.d0.b) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.e = r2
            goto L1a
        L15:
            kotlinx.coroutines.channels.d0$b r1 = new kotlinx.coroutines.channels.d0$b
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.d
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
            int r3 = r1.e
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L73
            if (r3 == r7) goto L65
            if (r3 == r6) goto L59
            if (r3 == r5) goto L46
            if (r3 != r4) goto L3e
            long r7 = r1.b
            long r9 = r1.a
            java.lang.Object r3 = r1.c
            kotlinx.coroutines.channels.c0 r3 = (kotlinx.coroutines.channels.c0) r3
            kotlin.g0.n(r0)
            r0 = 3
            r11 = 4
            goto L52
        L3e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L46:
            long r7 = r1.b
            long r9 = r1.a
            java.lang.Object r3 = r1.c
            kotlinx.coroutines.channels.c0 r3 = (kotlinx.coroutines.channels.c0) r3
            kotlin.g0.n(r0)
            r0 = 3
        L52:
            r16 = r9
            r9 = r7
            r7 = r16
            goto Lf7
        L59:
            long r7 = r1.b
            long r9 = r1.a
            java.lang.Object r3 = r1.c
            kotlinx.coroutines.channels.c0 r3 = (kotlinx.coroutines.channels.c0) r3
            kotlin.g0.n(r0)
            goto Lbd
        L65:
            long r7 = r1.b
            long r9 = r1.a
            java.lang.Object r3 = r1.c
            kotlinx.coroutines.channels.c0 r3 = (kotlinx.coroutines.channels.c0) r3
            kotlin.g0.n(r0)
            r0 = r3
            r10 = r9
            goto La1
        L73:
            kotlin.g0.n(r0)
            kotlinx.coroutines.b r0 = kotlinx.coroutines.c.b()
            if (r0 == 0) goto L81
            long r8 = r0.b()
            goto L85
        L81:
            long r8 = java.lang.System.nanoTime()
        L85:
            long r10 = kotlinx.coroutines.r1.d(r20)
            long r8 = r8 + r10
            r0 = r22
            r1.c = r0
            r10 = r18
            r1.a = r10
            r1.b = r8
            r1.e = r7
            r12 = r20
            java.lang.Object r3 = kotlinx.coroutines.a1.b(r12, r1)
            if (r3 != r2) goto La0
            goto L10f
        La0:
            r7 = r8
        La1:
            long r9 = kotlinx.coroutines.r1.d(r10)
        La5:
            long r7 = r7 + r9
            kotlin.n1 r3 = kotlin.n1.a
            r1.c = r0
            r1.a = r7
            r1.b = r9
            r1.e = r6
            java.lang.Object r3 = r0.T(r3, r1)
            if (r3 != r2) goto Lb7
            goto L10f
        Lb7:
            r16 = r9
            r9 = r7
            r7 = r16
            r3 = r0
        Lbd:
            kotlinx.coroutines.b r0 = kotlinx.coroutines.c.b()
            if (r0 == 0) goto Lc8
            long r11 = r0.b()
            goto Lcc
        Lc8:
            long r11 = java.lang.System.nanoTime()
        Lcc:
            long r13 = r9 - r11
            r4 = 0
            long r13 = kotlin.ranges.t.v(r13, r4)
            int r15 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r15 != 0) goto Lfb
            int r15 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r15 == 0) goto Lfb
            long r4 = r11 - r9
            long r4 = r4 % r7
            long r4 = r7 - r4
            long r9 = r11 + r4
            long r4 = kotlinx.coroutines.r1.c(r4)
            r1.c = r3
            r1.a = r9
            r1.b = r7
            r0 = 3
            r1.e = r0
            java.lang.Object r4 = kotlinx.coroutines.a1.b(r4, r1)
            if (r4 != r2) goto L52
            goto L10f
        Lf7:
            r0 = r3
            r4 = 4
            r5 = 3
            goto La5
        Lfb:
            r0 = 3
            long r4 = kotlinx.coroutines.r1.c(r13)
            r1.c = r3
            r1.a = r9
            r1.b = r7
            r11 = 4
            r1.e = r11
            java.lang.Object r4 = kotlinx.coroutines.a1.b(r4, r1)
            if (r4 != r2) goto L52
        L10f:
            return r2
    }

    @kotlinx.coroutines.ObsoleteCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.channels.b0<kotlin.n1> e(long r8, long r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r12, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.TickerMode r13) {
            java.lang.String r0 = " ms"
            r1 = 0
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 < 0) goto L44
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 < 0) goto L25
            kotlinx.coroutines.w1 r0 = kotlinx.coroutines.w1.a
            kotlinx.coroutines.m0 r1 = kotlinx.coroutines.g1.g()
            kotlin.coroutines.i r12 = r1.plus(r12)
            kotlinx.coroutines.channels.d0$c r1 = new kotlinx.coroutines.channels.d0$c
            r7 = 0
            r3 = r8
            r5 = r10
            r2 = r13
            r1.<init>(r2, r3, r5, r7)
            r8 = 0
            kotlinx.coroutines.channels.b0 r8 = kotlinx.coroutines.channels.x.c(r0, r12, r8, r1)
            return r8
        L25:
            r5 = r10
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Expected non-negative initial delay, but has "
            r8.append(r9)
            r8.append(r5)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        L44:
            r3 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Expected non-negative delay, but has "
            r8.append(r9)
            r8.append(r3)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
    }

    public static /* synthetic */ kotlinx.coroutines.channels.b0 f(long r0, long r2, kotlin.coroutines.i r4, kotlinx.coroutines.channels.TickerMode r5, int r6, java.lang.Object r7) {
            r7 = r6 & 2
            if (r7 == 0) goto L5
            r2 = r0
        L5:
            r7 = r6 & 4
            if (r7 == 0) goto Lb
            kotlin.coroutines.EmptyCoroutineContext r4 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L11
            kotlinx.coroutines.channels.TickerMode r5 = kotlinx.coroutines.channels.TickerMode.FIXED_PERIOD
        L11:
            kotlinx.coroutines.channels.b0 r0 = e(r0, r2, r4, r5)
            return r0
    }
}
