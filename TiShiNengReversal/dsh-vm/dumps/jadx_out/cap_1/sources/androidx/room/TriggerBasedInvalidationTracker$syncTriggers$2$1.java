package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1", f = "InvalidationTracker.kt", i = {0}, l = {301, 309}, m = "invokeSuspend", n = {"connection"}, s = {"L$0"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class TriggerBasedInvalidationTracker$syncTriggers$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.room.Transactor, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ androidx.room.TriggerBasedInvalidationTracker this$0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1", f = "InvalidationTracker.kt", i = {0, 0, 1, 1}, l = {313, 314}, m = "invokeSuspend", n = {"$this$forEachIndexed$iv", "index$iv", "$this$forEachIndexed$iv", "index$iv"}, s = {"L$0", "I$0", "L$0", "I$0"})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,604:1\n13467#2,3:605\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1$1\n*L\n310#1:605,3\n*E\n"})
    /* renamed from: androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.room.TransactionScope<kotlin.n1>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        final /* synthetic */ androidx.room.Transactor $connection;
        final /* synthetic */ androidx.room.ObservedTableStates.ObserveOp[] $tablesToSync;
        int I$0;
        int I$1;
        int I$2;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        final /* synthetic */ androidx.room.TriggerBasedInvalidationTracker this$0;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                    androidx.room.ObservedTableStates$ObserveOp[] r0 = androidx.room.ObservedTableStates.ObserveOp.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.room.ObservedTableStates$ObserveOp r1 = androidx.room.ObservedTableStates.ObserveOp.NO_OP     // Catch: java.lang.NoSuchFieldError -> L10
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                    r2 = 1
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
                L10:
                    androidx.room.ObservedTableStates$ObserveOp r1 = androidx.room.ObservedTableStates.ObserveOp.ADD     // Catch: java.lang.NoSuchFieldError -> L19
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                    r2 = 2
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
                L19:
                    androidx.room.ObservedTableStates$ObserveOp r1 = androidx.room.ObservedTableStates.ObserveOp.REMOVE     // Catch: java.lang.NoSuchFieldError -> L22
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                    r2 = 3
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                L22:
                    androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0 = r0
                    return
            }
        }

        AnonymousClass1(androidx.room.ObservedTableStates.ObserveOp[] r1, androidx.room.TriggerBasedInvalidationTracker r2, androidx.room.Transactor r3, kotlin.coroutines.e<? super androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1.AnonymousClass1> r4) {
                r0 = this;
                r0.$tablesToSync = r1
                r0.this$0 = r2
                r0.$connection = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r4, kotlin.coroutines.e<?> r5) {
                r3 = this;
                androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1 r4 = new androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1
                androidx.room.ObservedTableStates$ObserveOp[] r0 = r3.$tablesToSync
                androidx.room.TriggerBasedInvalidationTracker r1 = r3.this$0
                androidx.room.Transactor r2 = r3.$connection
                r4.<init>(r0, r1, r2, r5)
                return r4
        }

        public final java.lang.Object invoke(androidx.room.TransactionScope<kotlin.n1> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1 r1 = (androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1.AnonymousClass1) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                androidx.room.TransactionScope r1 = (androidx.room.TransactionScope) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r11.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 == r3) goto Le
                if (r1 != r2) goto L24
            Le:
                int r1 = r11.I$2
                int r4 = r11.I$1
                int r5 = r11.I$0
                java.lang.Object r6 = r11.L$2
                androidx.room.Transactor r6 = (androidx.room.Transactor) r6
                java.lang.Object r7 = r11.L$1
                androidx.room.TriggerBasedInvalidationTracker r7 = (androidx.room.TriggerBasedInvalidationTracker) r7
                java.lang.Object r8 = r11.L$0
                androidx.room.ObservedTableStates$ObserveOp[] r8 = (androidx.room.ObservedTableStates.ObserveOp[]) r8
                kotlin.g0.n(r12)
                goto L68
            L24:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L2c:
                kotlin.g0.n(r12)
                androidx.room.ObservedTableStates$ObserveOp[] r12 = r11.$tablesToSync
                androidx.room.TriggerBasedInvalidationTracker r1 = r11.this$0
                androidx.room.Transactor r4 = r11.$connection
                int r5 = r12.length
                r6 = 0
                r8 = r12
                r7 = r1
                r12 = r4
                r1 = r5
                r4 = 0
            L3c:
                if (r4 >= r1) goto L89
                r5 = r8[r4]
                int r9 = r6 + 1
                int[] r10 = androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0
                int r5 = r5.ordinal()
                r5 = r10[r5]
                if (r5 == r3) goto L86
                if (r5 == r2) goto L71
                r10 = 3
                if (r5 != r10) goto L6b
                r11.L$0 = r8
                r11.L$1 = r7
                r11.L$2 = r12
                r11.I$0 = r9
                r11.I$1 = r4
                r11.I$2 = r1
                r11.label = r2
                java.lang.Object r5 = androidx.room.TriggerBasedInvalidationTracker.access$stopTrackingTable(r7, r12, r6, r11)
                if (r5 != r0) goto L66
                goto L85
            L66:
                r6 = r12
                r5 = r9
            L68:
                r12 = r6
                r6 = r5
                goto L87
            L6b:
                kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
                r12.<init>()
                throw r12
            L71:
                r11.L$0 = r8
                r11.L$1 = r7
                r11.L$2 = r12
                r11.I$0 = r9
                r11.I$1 = r4
                r11.I$2 = r1
                r11.label = r3
                java.lang.Object r5 = androidx.room.TriggerBasedInvalidationTracker.access$startTrackingTable(r7, r12, r6, r11)
                if (r5 != r0) goto L66
            L85:
                return r0
            L86:
                r6 = r9
            L87:
                int r4 = r4 + r3
                goto L3c
            L89:
                kotlin.n1 r12 = kotlin.n1.a
                return r12
        }
    }

    TriggerBasedInvalidationTracker$syncTriggers$2$1(androidx.room.TriggerBasedInvalidationTracker r1, kotlin.coroutines.e<? super androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
            r2 = this;
            androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1
            androidx.room.TriggerBasedInvalidationTracker r1 = r2.this$0
            r0.<init>(r1, r4)
            r0.L$0 = r3
            return r0
    }

    public final java.lang.Object invoke(androidx.room.Transactor r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1 r1 = (androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            androidx.room.Transactor r1 = (androidx.room.Transactor) r1
            kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.g0.n(r8)
            goto L61
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            java.lang.Object r1 = r7.L$0
            androidx.room.Transactor r1 = (androidx.room.Transactor) r1
            kotlin.g0.n(r8)
            goto L35
        L22:
            kotlin.g0.n(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            androidx.room.Transactor r1 = (androidx.room.Transactor) r1
            r7.L$0 = r1
            r7.label = r3
            java.lang.Object r8 = r1.inTransaction(r7)
            if (r8 != r0) goto L35
            goto L60
        L35:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L40
            kotlin.n1 r8 = kotlin.n1.a
            return r8
        L40:
            androidx.room.TriggerBasedInvalidationTracker r8 = r7.this$0
            androidx.room.ObservedTableStates r8 = androidx.room.TriggerBasedInvalidationTracker.access$getObservedTableStates$p(r8)
            androidx.room.ObservedTableStates$ObserveOp[] r8 = r8.getTablesToSync$room_runtime_release()
            if (r8 == 0) goto L61
            androidx.room.Transactor$SQLiteTransactionType r3 = androidx.room.Transactor.SQLiteTransactionType.IMMEDIATE
            androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1 r4 = new androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1
            androidx.room.TriggerBasedInvalidationTracker r5 = r7.this$0
            r6 = 0
            r4.<init>(r8, r5, r1, r6)
            r7.L$0 = r6
            r7.label = r2
            java.lang.Object r8 = r1.withTransaction(r3, r4, r7)
            if (r8 != r0) goto L61
        L60:
            return r0
        L61:
            kotlin.n1 r8 = kotlin.n1.a
            return r8
    }
}
