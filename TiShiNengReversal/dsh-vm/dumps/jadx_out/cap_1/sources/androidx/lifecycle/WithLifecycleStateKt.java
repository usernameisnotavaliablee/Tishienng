package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,206:1\n154#1,8:207\n154#1,8:215\n154#1,8:223\n154#1,8:231\n43#1,5:239\n154#1,8:244\n43#1,5:252\n154#1,8:257\n154#1,8:265\n154#1,8:273\n154#1,8:281\n314#2,11:289\n*S KotlinDebug\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n*L\n47#1:207,8\n58#1:215,8\n71#1:223,8\n84#1:231,8\n98#1:239,5\n98#1:244,8\n98#1:252,5\n98#1:257,8\n111#1:265,8\n124#1:273,8\n137#1:281,8\n177#1:289,11\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class WithLifecycleStateKt {
    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object suspendWithStateAtLeastUnchecked(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle r3, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.State r4, boolean r5, @org.jetbrains.annotations.NotNull kotlinx.coroutines.m0 r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends R> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r8) {
            kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r8)
            r2 = 1
            r0.<init>(r1, r2)
            r0.Q()
            androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 r1 = new androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            r1.<init>(r4, r3, r0, r7)
            if (r5 == 0) goto L1f
            kotlin.coroutines.EmptyCoroutineContext r4 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1 r5 = new androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1
            r5.<init>(r3, r1)
            r6.dispatch(r4, r5)
            goto L22
        L1f:
            r3.addObserver(r1)
        L22:
            androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2 r4 = new androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2
            r4.<init>(r6, r3, r1)
            r0.I(r4)
            java.lang.Object r3 = r0.x()
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
            if (r3 != r4) goto L37
            kotlin.coroutines.jvm.internal.e.c(r8)
        L37:
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object withCreated(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends R> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r8) {
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.g1.e()
            kotlinx.coroutines.p2 r3 = r0.t()
            kotlin.coroutines.i r0 = r8.getContext()
            boolean r2 = r3.isDispatchNeeded(r0)
            if (r2 != 0) goto L31
            androidx.lifecycle.Lifecycle$State r0 = r6.getCurrentState()
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 == r4) goto L2b
            androidx.lifecycle.Lifecycle$State r0 = r6.getCurrentState()
            int r0 = r0.compareTo(r1)
            if (r0 < 0) goto L31
            java.lang.Object r6 = r7.invoke()
            return r6
        L2b:
            androidx.lifecycle.LifecycleDestroyedException r6 = new androidx.lifecycle.LifecycleDestroyedException
            r6.<init>()
            throw r6
        L31:
            androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2 r4 = new androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2
            r4.<init>(r7)
            r0 = r6
            r5 = r8
            java.lang.Object r6 = suspendWithStateAtLeastUnchecked(r0, r1, r2, r3, r4, r5)
            return r6
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object withCreated(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends R> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r8) {
            androidx.lifecycle.Lifecycle r0 = r6.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED
            kotlinx.coroutines.p2 r6 = kotlinx.coroutines.g1.e()
            kotlinx.coroutines.p2 r3 = r6.t()
            kotlin.coroutines.i r6 = r8.getContext()
            boolean r2 = r3.isDispatchNeeded(r6)
            if (r2 != 0) goto L35
            androidx.lifecycle.Lifecycle$State r6 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r6 == r4) goto L2f
            androidx.lifecycle.Lifecycle$State r6 = r0.getCurrentState()
            int r6 = r6.compareTo(r1)
            if (r6 < 0) goto L35
            java.lang.Object r6 = r7.invoke()
            return r6
        L2f:
            androidx.lifecycle.LifecycleDestroyedException r6 = new androidx.lifecycle.LifecycleDestroyedException
            r6.<init>()
            throw r6
        L35:
            androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2 r4 = new androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2
            r4.<init>(r7)
            r5 = r8
            java.lang.Object r6 = suspendWithStateAtLeastUnchecked(r0, r1, r2, r3, r4, r5)
            return r6
    }

    private static final <R> java.lang.Object withCreated$$forInline(androidx.lifecycle.Lifecycle r0, kotlin.jvm.functions.Function0<? extends R> r1, kotlin.coroutines.e<? super R> r2) {
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.CREATED
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.g1.e()
            r0.t()
            r0 = 3
            kotlin.jvm.internal.d0.e(r0)
            r0 = 0
            throw r0
    }

    private static final <R> java.lang.Object withCreated$$forInline(androidx.lifecycle.LifecycleOwner r0, kotlin.jvm.functions.Function0<? extends R> r1, kotlin.coroutines.e<? super R> r2) {
            r0.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.CREATED
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.g1.e()
            r0.t()
            r0 = 3
            kotlin.jvm.internal.d0.e(r0)
            r0 = 0
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object withResumed(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends R> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r8) {
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.g1.e()
            kotlinx.coroutines.p2 r3 = r0.t()
            kotlin.coroutines.i r0 = r8.getContext()
            boolean r2 = r3.isDispatchNeeded(r0)
            if (r2 != 0) goto L31
            androidx.lifecycle.Lifecycle$State r0 = r6.getCurrentState()
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 == r4) goto L2b
            androidx.lifecycle.Lifecycle$State r0 = r6.getCurrentState()
            int r0 = r0.compareTo(r1)
            if (r0 < 0) goto L31
            java.lang.Object r6 = r7.invoke()
            return r6
        L2b:
            androidx.lifecycle.LifecycleDestroyedException r6 = new androidx.lifecycle.LifecycleDestroyedException
            r6.<init>()
            throw r6
        L31:
            androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2 r4 = new androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2
            r4.<init>(r7)
            r0 = r6
            r5 = r8
            java.lang.Object r6 = suspendWithStateAtLeastUnchecked(r0, r1, r2, r3, r4, r5)
            return r6
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object withResumed(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends R> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r8) {
            androidx.lifecycle.Lifecycle r0 = r6.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED
            kotlinx.coroutines.p2 r6 = kotlinx.coroutines.g1.e()
            kotlinx.coroutines.p2 r3 = r6.t()
            kotlin.coroutines.i r6 = r8.getContext()
            boolean r2 = r3.isDispatchNeeded(r6)
            if (r2 != 0) goto L35
            androidx.lifecycle.Lifecycle$State r6 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r6 == r4) goto L2f
            androidx.lifecycle.Lifecycle$State r6 = r0.getCurrentState()
            int r6 = r6.compareTo(r1)
            if (r6 < 0) goto L35
            java.lang.Object r6 = r7.invoke()
            return r6
        L2f:
            androidx.lifecycle.LifecycleDestroyedException r6 = new androidx.lifecycle.LifecycleDestroyedException
            r6.<init>()
            throw r6
        L35:
            androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2 r4 = new androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2
            r4.<init>(r7)
            r5 = r8
            java.lang.Object r6 = suspendWithStateAtLeastUnchecked(r0, r1, r2, r3, r4, r5)
            return r6
    }

    private static final <R> java.lang.Object withResumed$$forInline(androidx.lifecycle.Lifecycle r0, kotlin.jvm.functions.Function0<? extends R> r1, kotlin.coroutines.e<? super R> r2) {
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.RESUMED
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.g1.e()
            r0.t()
            r0 = 3
            kotlin.jvm.internal.d0.e(r0)
            r0 = 0
            throw r0
    }

    private static final <R> java.lang.Object withResumed$$forInline(androidx.lifecycle.LifecycleOwner r0, kotlin.jvm.functions.Function0<? extends R> r1, kotlin.coroutines.e<? super R> r2) {
            r0.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.RESUMED
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.g1.e()
            r0.t()
            r0 = 3
            kotlin.jvm.internal.d0.e(r0)
            r0 = 0
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object withStarted(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends R> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r8) {
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.g1.e()
            kotlinx.coroutines.p2 r3 = r0.t()
            kotlin.coroutines.i r0 = r8.getContext()
            boolean r2 = r3.isDispatchNeeded(r0)
            if (r2 != 0) goto L31
            androidx.lifecycle.Lifecycle$State r0 = r6.getCurrentState()
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 == r4) goto L2b
            androidx.lifecycle.Lifecycle$State r0 = r6.getCurrentState()
            int r0 = r0.compareTo(r1)
            if (r0 < 0) goto L31
            java.lang.Object r6 = r7.invoke()
            return r6
        L2b:
            androidx.lifecycle.LifecycleDestroyedException r6 = new androidx.lifecycle.LifecycleDestroyedException
            r6.<init>()
            throw r6
        L31:
            androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2 r4 = new androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2
            r4.<init>(r7)
            r0 = r6
            r5 = r8
            java.lang.Object r6 = suspendWithStateAtLeastUnchecked(r0, r1, r2, r3, r4, r5)
            return r6
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object withStarted(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends R> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r8) {
            androidx.lifecycle.Lifecycle r0 = r6.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            kotlinx.coroutines.p2 r6 = kotlinx.coroutines.g1.e()
            kotlinx.coroutines.p2 r3 = r6.t()
            kotlin.coroutines.i r6 = r8.getContext()
            boolean r2 = r3.isDispatchNeeded(r6)
            if (r2 != 0) goto L35
            androidx.lifecycle.Lifecycle$State r6 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r6 == r4) goto L2f
            androidx.lifecycle.Lifecycle$State r6 = r0.getCurrentState()
            int r6 = r6.compareTo(r1)
            if (r6 < 0) goto L35
            java.lang.Object r6 = r7.invoke()
            return r6
        L2f:
            androidx.lifecycle.LifecycleDestroyedException r6 = new androidx.lifecycle.LifecycleDestroyedException
            r6.<init>()
            throw r6
        L35:
            androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2 r4 = new androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2
            r4.<init>(r7)
            r5 = r8
            java.lang.Object r6 = suspendWithStateAtLeastUnchecked(r0, r1, r2, r3, r4, r5)
            return r6
    }

    private static final <R> java.lang.Object withStarted$$forInline(androidx.lifecycle.Lifecycle r0, kotlin.jvm.functions.Function0<? extends R> r1, kotlin.coroutines.e<? super R> r2) {
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.STARTED
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.g1.e()
            r0.t()
            r0 = 3
            kotlin.jvm.internal.d0.e(r0)
            r0 = 0
            throw r0
    }

    private static final <R> java.lang.Object withStarted$$forInline(androidx.lifecycle.LifecycleOwner r0, kotlin.jvm.functions.Function0<? extends R> r1, kotlin.coroutines.e<? super R> r2) {
            r0.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.STARTED
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.g1.e()
            r0.t()
            r0 = 3
            kotlin.jvm.internal.d0.e(r0)
            r0 = 0
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object withStateAtLeast(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle r7, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.State r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends R> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r10) {
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.CREATED
            int r0 = r8.compareTo(r0)
            if (r0 < 0) goto L44
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.g1.e()
            kotlinx.coroutines.p2 r4 = r0.t()
            kotlin.coroutines.i r0 = r10.getContext()
            boolean r3 = r4.isDispatchNeeded(r0)
            if (r3 != 0) goto L37
            androidx.lifecycle.Lifecycle$State r0 = r7.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 == r1) goto L31
            androidx.lifecycle.Lifecycle$State r0 = r7.getCurrentState()
            int r0 = r0.compareTo(r8)
            if (r0 < 0) goto L37
            java.lang.Object r7 = r9.invoke()
            return r7
        L31:
            androidx.lifecycle.LifecycleDestroyedException r7 = new androidx.lifecycle.LifecycleDestroyedException
            r7.<init>()
            throw r7
        L37:
            androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2 r5 = new androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2
            r5.<init>(r9)
            r1 = r7
            r2 = r8
            r6 = r10
            java.lang.Object r7 = suspendWithStateAtLeastUnchecked(r1, r2, r3, r4, r5, r6)
            return r7
        L44:
            r2 = r8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "target state must be CREATED or greater, found "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object withStateAtLeast(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r6, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.State r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends R> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r9) {
            androidx.lifecycle.Lifecycle r0 = r6.getLifecycle()
            androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.CREATED
            int r6 = r7.compareTo(r6)
            if (r6 < 0) goto L47
            kotlinx.coroutines.p2 r6 = kotlinx.coroutines.g1.e()
            kotlinx.coroutines.p2 r3 = r6.t()
            kotlin.coroutines.i r6 = r9.getContext()
            boolean r2 = r3.isDispatchNeeded(r6)
            if (r2 != 0) goto L3b
            androidx.lifecycle.Lifecycle$State r6 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r6 == r1) goto L35
            androidx.lifecycle.Lifecycle$State r6 = r0.getCurrentState()
            int r6 = r6.compareTo(r7)
            if (r6 < 0) goto L3b
            java.lang.Object r6 = r8.invoke()
            return r6
        L35:
            androidx.lifecycle.LifecycleDestroyedException r6 = new androidx.lifecycle.LifecycleDestroyedException
            r6.<init>()
            throw r6
        L3b:
            androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2 r4 = new androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2
            r4.<init>(r8)
            r1 = r7
            r5 = r9
            java.lang.Object r6 = suspendWithStateAtLeastUnchecked(r0, r1, r2, r3, r4, r5)
            return r6
        L47:
            r1 = r7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "target state must be CREATED or greater, found "
            r6.append(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    private static final <R> java.lang.Object withStateAtLeast$$forInline(androidx.lifecycle.Lifecycle r0, androidx.lifecycle.Lifecycle.State r1, kotlin.jvm.functions.Function0<? extends R> r2, kotlin.coroutines.e<? super R> r3) {
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.CREATED
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto L15
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.g1.e()
            r0.t()
            r0 = 3
            kotlin.jvm.internal.d0.e(r0)
            r0 = 0
            throw r0
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "target state must be CREATED or greater, found "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    private static final <R> java.lang.Object withStateAtLeast$$forInline(androidx.lifecycle.LifecycleOwner r0, androidx.lifecycle.Lifecycle.State r1, kotlin.jvm.functions.Function0<? extends R> r2, kotlin.coroutines.e<? super R> r3) {
            r0.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.CREATED
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto L18
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.g1.e()
            r0.t()
            r0 = 3
            kotlin.jvm.internal.d0.e(r0)
            r0 = 0
            throw r0
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "target state must be CREATED or greater, found "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object withStateAtLeastUnchecked(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle r7, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.State r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends R> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r10) {
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.g1.e()
            kotlinx.coroutines.p2 r4 = r0.t()
            kotlin.coroutines.i r0 = r10.getContext()
            boolean r3 = r4.isDispatchNeeded(r0)
            if (r3 != 0) goto L2f
            androidx.lifecycle.Lifecycle$State r0 = r7.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 == r1) goto L29
            androidx.lifecycle.Lifecycle$State r0 = r7.getCurrentState()
            int r0 = r0.compareTo(r8)
            if (r0 < 0) goto L2f
            java.lang.Object r7 = r9.invoke()
            return r7
        L29:
            androidx.lifecycle.LifecycleDestroyedException r7 = new androidx.lifecycle.LifecycleDestroyedException
            r7.<init>()
            throw r7
        L2f:
            androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2 r5 = new androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2
            r5.<init>(r9)
            r1 = r7
            r2 = r8
            r6 = r10
            java.lang.Object r7 = suspendWithStateAtLeastUnchecked(r1, r2, r3, r4, r5, r6)
            return r7
    }

    @kotlin.PublishedApi
    private static final <R> java.lang.Object withStateAtLeastUnchecked$$forInline(androidx.lifecycle.Lifecycle r0, androidx.lifecycle.Lifecycle.State r1, kotlin.jvm.functions.Function0<? extends R> r2, kotlin.coroutines.e<? super R> r3) {
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.g1.e()
            r0.t()
            r0 = 3
            kotlin.jvm.internal.d0.e(r0)
            r0 = 0
            throw r0
    }
}
