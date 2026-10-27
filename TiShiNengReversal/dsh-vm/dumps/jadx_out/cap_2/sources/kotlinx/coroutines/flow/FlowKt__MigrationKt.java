package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMigration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Migration.kt\nkotlinx/coroutines/flow/FlowKt__MigrationKt\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,496:1\n193#2:497\n*S KotlinDebug\n*F\n+ 1 Migration.kt\nkotlinx/coroutines/flow/FlowKt__MigrationKt\n*L\n435#1:497\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final /* synthetic */ class FlowKt__MigrationKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", f = "Migration.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {})
    static final class a<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<T, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ long b;

        a(long r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.FlowKt__MigrationKt.a> r3) {
                r0 = this;
                r0.b = r1
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
                r2 = this;
                kotlinx.coroutines.flow.FlowKt__MigrationKt$a r3 = new kotlinx.coroutines.flow.FlowKt__MigrationKt$a
                long r0 = r2.b
                r3.<init>(r0, r4)
                return r3
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object f(T r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.FlowKt__MigrationKt$a r1 = (kotlinx.coroutines.flow.FlowKt__MigrationKt.a) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.f(r1, r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r5.a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.g0.n(r6)
                goto L25
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.g0.n(r6)
                long r3 = r5.b
                r5.a = r2
                java.lang.Object r6 = kotlinx.coroutines.a1.b(r3, r5)
                if (r6 != r0) goto L25
                return r0
            L25:
                kotlin.n1 r6 = kotlin.n1.a
                return r6
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", f = "Migration.kt", i = {}, l = {415}, m = "invokeSuspend", n = {}, s = {})
    static final class b<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        final /* synthetic */ long b;

        b(long r1, kotlin.coroutines.e<? super kotlinx.coroutines.flow.FlowKt__MigrationKt.b> r3) {
                r0 = this;
                r0.b = r1
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
                r2 = this;
                kotlinx.coroutines.flow.FlowKt__MigrationKt$b r3 = new kotlinx.coroutines.flow.FlowKt__MigrationKt$b
                long r0 = r2.b
                r3.<init>(r0, r4)
                return r3
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.FlowKt__MigrationKt$b r1 = (kotlinx.coroutines.flow.FlowKt__MigrationKt.b) r1
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
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.g0.n(r6)
                goto L25
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.g0.n(r6)
                long r3 = r5.b
                r5.a = r2
                java.lang.Object r6 = kotlinx.coroutines.a1.b(r3, r5)
                if (r6 != r0) goto L25
                return r0
            L25:
                kotlin.n1 r6 = kotlin.n1.a
                return r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Boolean> {
        public static final kotlinx.coroutines.flow.FlowKt__MigrationKt.c a = null;

        static {
                kotlinx.coroutines.flow.FlowKt__MigrationKt$c r0 = new kotlinx.coroutines.flow.FlowKt__MigrationKt$c
                r0.<init>()
                kotlinx.coroutines.flow.FlowKt__MigrationKt.c.a = r0
                return
        }

        c() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.Boolean a(@org.jetbrains.annotations.NotNull java.lang.Throwable r1) {
                r0 = this;
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                return r1
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Boolean r1 = r0.a(r1)
                return r1
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", f = "Migration.kt", i = {}, l = {306}, m = "invokeSuspend", n = {}, s = {})
    static final class d<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.j<? super T>, java.lang.Throwable, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        int a;
        private /* synthetic */ java.lang.Object b;
        /* synthetic */ java.lang.Object c;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Boolean> d;
        final /* synthetic */ T e;

        d(kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> r1, T r2, kotlin.coroutines.e<? super kotlinx.coroutines.flow.FlowKt__MigrationKt.d> r3) {
                r0 = this;
                r0.d = r1
                r0.e = r2
                r1 = 3
                r0.<init>(r1, r3)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r4, @org.jetbrains.annotations.NotNull java.lang.Throwable r5, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r6) {
                r3 = this;
                kotlinx.coroutines.flow.FlowKt__MigrationKt$d r0 = new kotlinx.coroutines.flow.FlowKt__MigrationKt$d
                kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Boolean> r1 = r3.d
                T r2 = r3.e
                r0.<init>(r1, r2, r6)
                r0.b = r4
                r0.c = r5
                kotlin.n1 r4 = kotlin.n1.a
                java.lang.Object r4 = r0.invokeSuspend(r4)
                return r4
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Throwable r2, kotlin.coroutines.e<? super kotlin.n1> r3) {
                r0 = this;
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                kotlin.coroutines.e r3 = (kotlin.coroutines.e) r3
                java.lang.Object r1 = r0.f(r1, r2, r3)
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
                goto L3e
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.g0.n(r5)
                java.lang.Object r5 = r4.b
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
                java.lang.Object r1 = r4.c
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Boolean> r3 = r4.d
                java.lang.Object r3 = r3.invoke(r1)
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto L41
                T r1 = r4.e
                r3 = 0
                r4.b = r3
                r4.a = r2
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L3e
                return r0
            L3e:
                kotlin.n1 r5 = kotlin.n1.a
                return r5
            L41:
                throw r1
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.ReplaceWith(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> A(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, int r1) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @kotlin.ReplaceWith(expression = "scan(initial, operation)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> B(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, R r1, @kotlin.BuilderInference @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @kotlin.ReplaceWith(expression = "runningReduce(operation)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> C(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super T, ? super T, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.k.A1(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @kotlin.ReplaceWith(expression = "drop(count)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> D(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, int r1) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @kotlin.ReplaceWith(expression = "onStart { emit(value) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> E(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, T r1) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @kotlin.ReplaceWith(expression = "onStart { emitAll(other) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> F(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void G(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void H(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void I(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'flowOn' instead")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> J(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r1) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @kotlin.ReplaceWith(expression = "this.flatMapLatest(transform)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> K(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super kotlinx.coroutines.flow.i<? extends R>>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 r0 = new kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1
            r1 = 0
            r0.<init>(r3, r1)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.d2(r2, r0)
            return r2
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @kotlin.ReplaceWith(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.ReplaceWith(expression = "this.combine(other, transform)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.k.D(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.ReplaceWith(expression = "combine(this, other, other2, transform)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.i<R> c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T3> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function4<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.k.E(r0, r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.ReplaceWith(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.i<R> d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T3> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T4> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r4) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.k.F(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.ReplaceWith(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.i<R> e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T1> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T2> r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T3> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T4> r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T5> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r5) {
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.k.G(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @kotlin.ReplaceWith(expression = "let(transformer)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlinx.coroutines.flow.i<? extends T>, ? extends kotlinx.coroutines.flow.i<? extends R>> r1) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @kotlin.ReplaceWith(expression = "flatMapConcat(mapper)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> g(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends kotlinx.coroutines.flow.i<? extends R>> r1) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @kotlin.ReplaceWith(expression = "onCompletion { emit(value) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, T r1) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @kotlin.ReplaceWith(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> i(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @kotlin.ReplaceWith(expression = "onEach { delay(timeMillis) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> j(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r2, long r3) {
            kotlinx.coroutines.flow.FlowKt__MigrationKt$a r0 = new kotlinx.coroutines.flow.FlowKt__MigrationKt$a
            r1 = 0
            r0.<init>(r3, r1)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.f1(r2, r0)
            return r2
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @kotlin.ReplaceWith(expression = "onStart { delay(timeMillis) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> k(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r2, long r3) {
            kotlinx.coroutines.flow.FlowKt__MigrationKt$b r0 = new kotlinx.coroutines.flow.FlowKt__MigrationKt$b
            r1 = 0
            r0.<init>(r3, r1)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.m1(r2, r0)
            return r2
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @kotlin.ReplaceWith(expression = "flatMapConcat(mapper)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> l(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super kotlinx.coroutines.flow.i<? extends R>>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @kotlin.ReplaceWith(expression = "flattenConcat()", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> m(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends kotlinx.coroutines.flow.i<? extends T>> r0) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @kotlin.ReplaceWith(expression = "collect(action)", imports = {}))
    public static final <T> void n(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @kotlin.ReplaceWith(expression = "flattenConcat()", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> o(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends kotlinx.coroutines.flow.i<? extends T>> r0) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Void p() {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Not implemented, should not be called"
            r0.<init>(r1)
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> q(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r1) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @kotlin.ReplaceWith(expression = "catch { emitAll(fallback) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> r(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @kotlin.ReplaceWith(expression = "catch { emitAll(fallback) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> s(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r1) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @kotlin.ReplaceWith(expression = "catch { emit(fallback) }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> t(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, T r1) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @kotlin.ReplaceWith(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> u(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r2, T r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> r4) {
            kotlinx.coroutines.flow.FlowKt__MigrationKt$d r0 = new kotlinx.coroutines.flow.FlowKt__MigrationKt$d
            r1 = 0
            r0.<init>(r4, r3, r1)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.u(r2, r0)
            return r2
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i v(kotlinx.coroutines.flow.i r0, java.lang.Object r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            kotlinx.coroutines.flow.FlowKt__MigrationKt$c r2 = kotlinx.coroutines.flow.FlowKt__MigrationKt.c.a
        L6:
            kotlinx.coroutines.flow.i r0 = kotlinx.coroutines.flow.k.k1(r0, r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.ReplaceWith(expression = "this.shareIn(scope, 0)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> w(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.ReplaceWith(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> x(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, int r1) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> y(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r1) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @kotlin.ReplaceWith(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> z(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r0) {
            kotlinx.coroutines.flow.k.c1()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }
}
