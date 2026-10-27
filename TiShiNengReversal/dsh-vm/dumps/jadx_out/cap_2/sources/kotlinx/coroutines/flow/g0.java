package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSharingStarted.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharingStarted.kt\nkotlinx/coroutines/flow/StartedWhileSubscribed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,209:1\n1#2:210\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class g0 implements kotlinx.coroutines.flow.c0 {
    private final long b;
    private final long c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {178, 180, 182, 183, 185}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super kotlinx.coroutines.flow.SharingCommand>, java.lang.Integer, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        private /* synthetic */ java.lang.Object b;
        /* synthetic */ int c;
        final /* synthetic */ kotlinx.coroutines.flow.g0 d;

        a(kotlinx.coroutines.flow.g0 r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.g0.a> r2) {
                r0 = this;
                r0.d = r1
                r1 = 3
                r0.<init>(r1, r2)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super kotlinx.coroutines.flow.SharingCommand> r3, int r4, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r5) {
                r2 = this;
                kotlinx.coroutines.flow.g0$a r0 = new kotlinx.coroutines.flow.g0$a
                kotlinx.coroutines.flow.g0 r1 = r2.d
                r0.<init>(r1, r5)
                r0.b = r3
                r0.c = r4
                kotlin.n1 r3 = kotlin.n1.a
                java.lang.Object r3 = r0.invokeSuspend(r3)
                return r3
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.j<? super kotlinx.coroutines.flow.SharingCommand> r1, java.lang.Integer r2, kotlin.coroutines.e<? super kotlin.n1> r3) {
                r0 = this;
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                kotlin.coroutines.e r3 = (kotlin.coroutines.e) r3
                java.lang.Object r1 = r0.f(r1, r2, r3)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r9.a
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L38
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                java.lang.Object r1 = r9.b
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.g0.n(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.b
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.g0.n(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.b
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.g0.n(r10)
                goto L64
            L38:
                kotlin.g0.n(r10)
                goto L9c
            L3c:
                kotlin.g0.n(r10)
                java.lang.Object r10 = r9.b
                r1 = r10
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                int r10 = r9.c
                if (r10 <= 0) goto L53
                kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.START
                r9.a = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                goto L9b
            L53:
                kotlinx.coroutines.flow.g0 r10 = r9.d
                long r6 = kotlinx.coroutines.flow.g0.c(r10)
                r9.b = r1
                r9.a = r5
                java.lang.Object r10 = kotlinx.coroutines.a1.b(r6, r9)
                if (r10 != r0) goto L64
                goto L9b
            L64:
                kotlinx.coroutines.flow.g0 r10 = r9.d
                long r5 = kotlinx.coroutines.flow.g0.b(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.STOP
                r9.b = r1
                r9.a = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L7d
                goto L9b
            L7d:
                kotlinx.coroutines.flow.g0 r10 = r9.d
                long r4 = kotlinx.coroutines.flow.g0.b(r10)
                r9.b = r1
                r9.a = r3
                java.lang.Object r10 = kotlinx.coroutines.a1.b(r4, r9)
                if (r10 != r0) goto L8e
                goto L9b
            L8e:
                kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.b = r3
                r9.a = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
            L9b:
                return r0
            L9c:
                kotlin.n1 r10 = kotlin.n1.a
                return r10
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.SharingCommand, kotlin.coroutines.e<? super java.lang.Boolean>, java.lang.Object> {
        int a;
        /* synthetic */ java.lang.Object b;

        b(kotlin.coroutines.e<? super kotlinx.coroutines.flow.g0.b> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r3) {
                r1 = this;
                kotlinx.coroutines.flow.g0$b r0 = new kotlinx.coroutines.flow.g0$b
                r0.<init>(r3)
                r0.b = r2
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.SharingCommand r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super java.lang.Boolean> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.g0$b r1 = (kotlinx.coroutines.flow.g0.b) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.SharingCommand r1, kotlin.coroutines.e<? super java.lang.Boolean> r2) {
                r0 = this;
                kotlinx.coroutines.flow.SharingCommand r1 = (kotlinx.coroutines.flow.SharingCommand) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.f(r1, r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r1.a
                if (r0 != 0) goto L1a
                kotlin.g0.n(r2)
                java.lang.Object r2 = r1.b
                kotlinx.coroutines.flow.SharingCommand r2 = (kotlinx.coroutines.flow.SharingCommand) r2
                kotlinx.coroutines.flow.SharingCommand r0 = kotlinx.coroutines.flow.SharingCommand.START
                if (r2 == r0) goto L14
                r2 = 1
                goto L15
            L14:
                r2 = 0
            L15:
                java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.a.a(r2)
                return r2
            L1a:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r2.<init>(r0)
                throw r2
        }
    }

    public g0(long r5, long r7) {
            r4 = this;
            r4.<init>()
            r4.b = r5
            r4.c = r7
            java.lang.String r0 = " ms) cannot be negative"
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 < 0) goto L32
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 < 0) goto L14
            return
        L14:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "replayExpiration("
            r5.append(r6)
            r5.append(r7)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L32:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "stopTimeout("
            r7.append(r8)
            r7.append(r5)
            r7.append(r0)
            java.lang.String r5 = r7.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    public static final /* synthetic */ long b(kotlinx.coroutines.flow.g0 r2) {
            long r0 = r2.c
            return r0
    }

    public static final /* synthetic */ long c(kotlinx.coroutines.flow.g0 r2) {
            long r0 = r2.b
            return r0
    }

    @Override // kotlinx.coroutines.flow.c0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.i<kotlinx.coroutines.flow.SharingCommand> a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.h0<java.lang.Integer> r3) {
            r2 = this;
            kotlinx.coroutines.flow.g0$a r0 = new kotlinx.coroutines.flow.g0$a
            r1 = 0
            r0.<init>(r2, r1)
            kotlinx.coroutines.flow.i r3 = kotlinx.coroutines.flow.k.d2(r3, r0)
            kotlinx.coroutines.flow.g0$b r0 = new kotlinx.coroutines.flow.g0$b
            r0.<init>(r1)
            kotlinx.coroutines.flow.i r3 = kotlinx.coroutines.flow.k.k0(r3, r0)
            kotlinx.coroutines.flow.i r3 = kotlinx.coroutines.flow.k.g0(r3)
            return r3
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.g0
            if (r0 == 0) goto L18
            long r0 = r5.b
            kotlinx.coroutines.flow.g0 r6 = (kotlinx.coroutines.flow.g0) r6
            long r2 = r6.b
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L18
            long r0 = r5.c
            long r2 = r6.c
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L18
            r6 = 1
            return r6
        L18:
            r6 = 0
            return r6
    }

    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    public int hashCode() {
            r3 = this;
            long r0 = r3.b
            int r0 = androidx.camera.camera2.internal.compat.params.e.a(r0)
            int r0 = r0 * 31
            long r1 = r3.c
            int r1 = androidx.camera.camera2.internal.compat.params.e.a(r1)
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r12 = this;
            r0 = 2
            java.util.List r0 = kotlin.collections.f0.k(r0)
            long r1 = r12.b
            r3 = 0
            java.lang.String r5 = "ms"
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "stopTimeout="
            r1.append(r2)
            long r2 = r12.b
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L28:
            long r1 = r12.c
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 >= 0) goto L4c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "replayExpiration="
            r1.append(r2)
            long r2 = r12.c
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L4c:
            java.util.List r0 = kotlin.collections.f0.b(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SharingStarted.WhileSubscribed("
            r1.append(r2)
            r3 = r0
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r10 = 63
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r0 = kotlin.collections.f0.r3(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
