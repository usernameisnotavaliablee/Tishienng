package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> $block;
    final /* synthetic */ androidx.lifecycle.Lifecycle.State $state;
    final /* synthetic */ androidx.lifecycle.Lifecycle $this_repeatOnLifecycle;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", i = {0, 0}, l = {166}, m = "invokeSuspend", n = {"launchedJob", "observer"}, s = {"L$0", "L$1"})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,165:1\n314#2,11:166\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n*L\n97#1:166,11\n*E\n"})
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.r0 $$this$coroutineScope;
        final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> $block;
        final /* synthetic */ androidx.lifecycle.Lifecycle.State $state;
        final /* synthetic */ androidx.lifecycle.Lifecycle $this_repeatOnLifecycle;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        int label;

        AnonymousClass1(androidx.lifecycle.Lifecycle r1, androidx.lifecycle.Lifecycle.State r2, kotlinx.coroutines.r0 r3, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r4, kotlin.coroutines.e<? super androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1> r5) {
                r0 = this;
                r0.$this_repeatOnLifecycle = r1
                r0.$state = r2
                r0.$$this$coroutineScope = r3
                r0.$block = r4
                r1 = 2
                r0.<init>(r1, r5)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r8) {
                r6 = this;
                androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1 r0 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1
                androidx.lifecycle.Lifecycle r1 = r6.$this_repeatOnLifecycle
                androidx.lifecycle.Lifecycle$State r2 = r6.$state
                kotlinx.coroutines.r0 r3 = r6.$$this$coroutineScope
                kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r4 = r6.$block
                r5 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1 r1 = (androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) {
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r13.label
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L37
                if (r1 != r3) goto L2f
                java.lang.Object r0 = r13.L$5
                kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
                java.lang.Object r0 = r13.L$4
                kotlinx.coroutines.r0 r0 = (kotlinx.coroutines.r0) r0
                java.lang.Object r0 = r13.L$3
                androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
                java.lang.Object r0 = r13.L$2
                androidx.lifecycle.Lifecycle$State r0 = (androidx.lifecycle.Lifecycle.State) r0
                java.lang.Object r0 = r13.L$1
                r1 = r0
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                java.lang.Object r0 = r13.L$0
                r4 = r0
                kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
                kotlin.g0.n(r14)     // Catch: java.lang.Throwable -> L2b
                goto La9
            L2b:
                r0 = move-exception
                r14 = r0
                goto Lc0
            L2f:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L37:
                kotlin.g0.n(r14)
                androidx.lifecycle.Lifecycle r14 = r13.$this_repeatOnLifecycle
                androidx.lifecycle.Lifecycle$State r14 = r14.getCurrentState()
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
                if (r14 != r1) goto L47
                kotlin.n1 r14 = kotlin.n1.a
                return r14
            L47:
                kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
                r6.<init>()
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                androidx.lifecycle.Lifecycle$State r14 = r13.$state     // Catch: java.lang.Throwable -> La1
                androidx.lifecycle.Lifecycle r12 = r13.$this_repeatOnLifecycle     // Catch: java.lang.Throwable -> La1
                kotlinx.coroutines.r0 r7 = r13.$$this$coroutineScope     // Catch: java.lang.Throwable -> La1
                kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r11 = r13.$block     // Catch: java.lang.Throwable -> La1
                r13.L$0 = r6     // Catch: java.lang.Throwable -> La1
                r13.L$1 = r1     // Catch: java.lang.Throwable -> La1
                r13.L$2 = r14     // Catch: java.lang.Throwable -> La1
                r13.L$3 = r12     // Catch: java.lang.Throwable -> La1
                r13.L$4 = r7     // Catch: java.lang.Throwable -> La1
                r13.L$5 = r11     // Catch: java.lang.Throwable -> La1
                r13.label = r3     // Catch: java.lang.Throwable -> La1
                kotlinx.coroutines.q r9 = new kotlinx.coroutines.q     // Catch: java.lang.Throwable -> La1
                kotlin.coroutines.e r4 = kotlin.coroutines.intrinsics.a.e(r13)     // Catch: java.lang.Throwable -> La1
                r9.<init>(r4, r3)     // Catch: java.lang.Throwable -> La1
                r9.Q()     // Catch: java.lang.Throwable -> La1
                androidx.lifecycle.Lifecycle$Event$Companion r4 = androidx.lifecycle.Lifecycle.Event.Companion     // Catch: java.lang.Throwable -> La1
                androidx.lifecycle.Lifecycle$Event r5 = r4.upTo(r14)     // Catch: java.lang.Throwable -> La1
                androidx.lifecycle.Lifecycle$Event r8 = r4.downFrom(r14)     // Catch: java.lang.Throwable -> La1
                r14 = 0
                kotlinx.coroutines.sync.a r10 = kotlinx.coroutines.sync.c.b(r14, r3, r2)     // Catch: java.lang.Throwable -> La1
                androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r4 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch: java.lang.Throwable -> La1
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> La1
                r1.element = r4     // Catch: java.lang.Throwable -> La1
                java.lang.String r14 = "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver"
                kotlin.jvm.internal.g0.n(r4, r14)     // Catch: java.lang.Throwable -> La1
                androidx.lifecycle.LifecycleEventObserver r4 = (androidx.lifecycle.LifecycleEventObserver) r4     // Catch: java.lang.Throwable -> La1
                r12.addObserver(r4)     // Catch: java.lang.Throwable -> La1
                java.lang.Object r14 = r9.x()     // Catch: java.lang.Throwable -> La1
                java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()     // Catch: java.lang.Throwable -> La1
                if (r14 != r4) goto La5
                kotlin.coroutines.jvm.internal.e.c(r13)     // Catch: java.lang.Throwable -> La1
                goto La5
            La1:
                r0 = move-exception
                r14 = r0
                r4 = r6
                goto Lc0
            La5:
                if (r14 != r0) goto La8
                return r0
            La8:
                r4 = r6
            La9:
                java.lang.Object r14 = r4.element
                kotlinx.coroutines.e2 r14 = (kotlinx.coroutines.e2) r14
                if (r14 == 0) goto Lb2
                kotlinx.coroutines.e2.a.b(r14, r2, r3, r2)
            Lb2:
                java.lang.Object r14 = r1.element
                androidx.lifecycle.LifecycleEventObserver r14 = (androidx.lifecycle.LifecycleEventObserver) r14
                if (r14 == 0) goto Lbd
                androidx.lifecycle.Lifecycle r0 = r13.$this_repeatOnLifecycle
                r0.removeObserver(r14)
            Lbd:
                kotlin.n1 r14 = kotlin.n1.a
                return r14
            Lc0:
                java.lang.Object r0 = r4.element
                kotlinx.coroutines.e2 r0 = (kotlinx.coroutines.e2) r0
                if (r0 == 0) goto Lc9
                kotlinx.coroutines.e2.a.b(r0, r2, r3, r2)
            Lc9:
                java.lang.Object r0 = r1.element
                androidx.lifecycle.LifecycleEventObserver r0 = (androidx.lifecycle.LifecycleEventObserver) r0
                if (r0 == 0) goto Ld4
                androidx.lifecycle.Lifecycle r1 = r13.$this_repeatOnLifecycle
                r1.removeObserver(r0)
            Ld4:
                throw r14
        }
    }

    RepeatOnLifecycleKt$repeatOnLifecycle$3(androidx.lifecycle.Lifecycle r1, androidx.lifecycle.Lifecycle.State r2, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super kotlin.n1>, ? extends java.lang.Object> r3, kotlin.coroutines.e<? super androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3> r4) {
            r0 = this;
            r0.$this_repeatOnLifecycle = r1
            r0.$state = r2
            r0.$block = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r6) {
            r4 = this;
            androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3 r0 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3
            androidx.lifecycle.Lifecycle r1 = r4.$this_repeatOnLifecycle
            androidx.lifecycle.Lifecycle$State r2 = r4.$state
            kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r3 = r4.$block
            r0.<init>(r1, r2, r3, r6)
            r0.L$0 = r5
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
            kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3 r1 = (androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r9.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.g0.n(r10)
            goto L3c
        Lf:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L17:
            kotlin.g0.n(r10)
            java.lang.Object r10 = r9.L$0
            r6 = r10
            kotlinx.coroutines.r0 r6 = (kotlinx.coroutines.r0) r6
            kotlinx.coroutines.p2 r10 = kotlinx.coroutines.g1.e()
            kotlinx.coroutines.p2 r10 = r10.t()
            androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1 r3 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1
            androidx.lifecycle.Lifecycle r4 = r9.$this_repeatOnLifecycle
            androidx.lifecycle.Lifecycle$State r5 = r9.$state
            kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> r7 = r9.$block
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            r9.label = r2
            java.lang.Object r10 = kotlinx.coroutines.i.h(r10, r3, r9)
            if (r10 != r0) goto L3c
            return r0
        L3c:
            kotlin.n1 r10 = kotlin.n1.a
            return r10
    }
}
