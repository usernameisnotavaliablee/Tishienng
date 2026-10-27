package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.RoomDatabase$performClear$1", f = "RoomDatabase.android.kt", i = {}, l = {507}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class RoomDatabase$performClear$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
    final /* synthetic */ boolean $hasForeignKeys;
    final /* synthetic */ java.lang.String[] $tableNames;
    int label;
    final /* synthetic */ androidx.room.RoomDatabase this$0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.RoomDatabase$performClear$1$1", f = "RoomDatabase.android.kt", i = {0, 1, 2, 3, 4}, l = {508, 509, 511, 517, 518, 519}, m = "invokeSuspend", n = {"connection", "connection", "connection", "connection", "connection"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
    /* renamed from: androidx.room.RoomDatabase$performClear$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.room.Transactor, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
        final /* synthetic */ boolean $hasForeignKeys;
        final /* synthetic */ java.lang.String[] $tableNames;
        /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ androidx.room.RoomDatabase this$0;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.RoomDatabase$performClear$1$1$1", f = "RoomDatabase.android.kt", i = {0, 1, 1}, l = {513, 515}, m = "invokeSuspend", n = {"$this$withTransaction", "$this$withTransaction", "$this$forEach$iv"}, s = {"L$0", "L$0", "L$1"})
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRoomDatabase.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.android.kt\nandroidx/room/RoomDatabase$performClear$1$1$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,2151:1\n13402#2,2:2152\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.android.kt\nandroidx/room/RoomDatabase$performClear$1$1$1\n*L\n515#1:2152,2\n*E\n"})
        /* renamed from: androidx.room.RoomDatabase$performClear$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00101 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.room.TransactionScope<kotlin.n1>, kotlin.coroutines.e<? super kotlin.n1>, java.lang.Object> {
            final /* synthetic */ boolean $hasForeignKeys;
            final /* synthetic */ java.lang.String[] $tableNames;
            int I$0;
            int I$1;
            private /* synthetic */ java.lang.Object L$0;
            java.lang.Object L$1;
            int label;

            C00101(boolean r1, java.lang.String[] r2, kotlin.coroutines.e<? super androidx.room.RoomDatabase$performClear$1.AnonymousClass1.C00101> r3) {
                    r0 = this;
                    r0.$hasForeignKeys = r1
                    r0.$tableNames = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r4, kotlin.coroutines.e<?> r5) {
                    r3 = this;
                    androidx.room.RoomDatabase$performClear$1$1$1 r0 = new androidx.room.RoomDatabase$performClear$1$1$1
                    boolean r1 = r3.$hasForeignKeys
                    java.lang.String[] r2 = r3.$tableNames
                    r0.<init>(r1, r2, r5)
                    r0.L$0 = r4
                    return r0
            }

            public final java.lang.Object invoke(androidx.room.TransactionScope<kotlin.n1> r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                    r0 = this;
                    kotlin.coroutines.e r1 = r0.create(r1, r2)
                    androidx.room.RoomDatabase$performClear$1$1$1 r1 = (androidx.room.RoomDatabase$performClear$1.AnonymousClass1.C00101) r1
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

            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                    r9 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                    int r1 = r9.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L2e
                    if (r1 == r3) goto L26
                    if (r1 != r2) goto L1e
                    int r1 = r9.I$1
                    int r4 = r9.I$0
                    java.lang.Object r5 = r9.L$1
                    java.lang.String[] r5 = (java.lang.String[]) r5
                    java.lang.Object r6 = r9.L$0
                    androidx.room.TransactionScope r6 = (androidx.room.TransactionScope) r6
                    kotlin.g0.n(r10)
                    goto L7a
                L1e:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L26:
                    java.lang.Object r1 = r9.L$0
                    androidx.room.TransactionScope r1 = (androidx.room.TransactionScope) r1
                    kotlin.g0.n(r10)
                    goto L47
                L2e:
                    kotlin.g0.n(r10)
                    java.lang.Object r10 = r9.L$0
                    r1 = r10
                    androidx.room.TransactionScope r1 = (androidx.room.TransactionScope) r1
                    boolean r10 = r9.$hasForeignKeys
                    if (r10 == 0) goto L47
                    r9.L$0 = r1
                    r9.label = r3
                    java.lang.String r10 = "PRAGMA defer_foreign_keys = TRUE"
                    java.lang.Object r10 = androidx.room.TransactorKt.execSQL(r1, r10, r9)
                    if (r10 != r0) goto L47
                    goto L79
                L47:
                    java.lang.String[] r10 = r9.$tableNames
                    int r4 = r10.length
                    r5 = 0
                    r5 = r10
                    r6 = r1
                    r1 = r4
                    r4 = 0
                L4f:
                    if (r4 >= r1) goto L7c
                    r10 = r5[r4]
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    java.lang.String r8 = "DELETE FROM `"
                    r7.append(r8)
                    r7.append(r10)
                    r10 = 96
                    r7.append(r10)
                    java.lang.String r10 = r7.toString()
                    r9.L$0 = r6
                    r9.L$1 = r5
                    r9.I$0 = r4
                    r9.I$1 = r1
                    r9.label = r2
                    java.lang.Object r10 = androidx.room.TransactorKt.execSQL(r6, r10, r9)
                    if (r10 != r0) goto L7a
                L79:
                    return r0
                L7a:
                    int r4 = r4 + r3
                    goto L4f
                L7c:
                    kotlin.n1 r10 = kotlin.n1.a
                    return r10
            }
        }

        AnonymousClass1(androidx.room.RoomDatabase r1, boolean r2, java.lang.String[] r3, kotlin.coroutines.e<? super androidx.room.RoomDatabase$performClear$1.AnonymousClass1> r4) {
                r0 = this;
                r0.this$0 = r1
                r0.$hasForeignKeys = r2
                r0.$tableNames = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r5, kotlin.coroutines.e<?> r6) {
                r4 = this;
                androidx.room.RoomDatabase$performClear$1$1 r0 = new androidx.room.RoomDatabase$performClear$1$1
                androidx.room.RoomDatabase r1 = r4.this$0
                boolean r2 = r4.$hasForeignKeys
                java.lang.String[] r3 = r4.$tableNames
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                return r0
        }

        public final java.lang.Object invoke(androidx.room.Transactor r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                androidx.room.RoomDatabase$performClear$1$1 r1 = (androidx.room.RoomDatabase$performClear$1.AnonymousClass1) r1
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
                r2 = 0
                switch(r1) {
                    case 0: goto L41;
                    case 1: goto L39;
                    case 2: goto L31;
                    case 3: goto L29;
                    case 4: goto L20;
                    case 5: goto L17;
                    case 6: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L12:
                kotlin.g0.n(r8)
                goto Lb8
            L17:
                java.lang.Object r1 = r7.L$0
                androidx.room.Transactor r1 = (androidx.room.Transactor) r1
                kotlin.g0.n(r8)
                goto Laa
            L20:
                java.lang.Object r1 = r7.L$0
                androidx.room.Transactor r1 = (androidx.room.Transactor) r1
                kotlin.g0.n(r8)
                goto L94
            L29:
                java.lang.Object r1 = r7.L$0
                androidx.room.Transactor r1 = (androidx.room.Transactor) r1
                kotlin.g0.n(r8)
                goto L88
            L31:
                java.lang.Object r1 = r7.L$0
                androidx.room.Transactor r1 = (androidx.room.Transactor) r1
                kotlin.g0.n(r8)
                goto L71
            L39:
                java.lang.Object r1 = r7.L$0
                androidx.room.Transactor r1 = (androidx.room.Transactor) r1
                kotlin.g0.n(r8)
                goto L57
            L41:
                kotlin.g0.n(r8)
                java.lang.Object r8 = r7.L$0
                androidx.room.Transactor r8 = (androidx.room.Transactor) r8
                r7.L$0 = r8
                r1 = 1
                r7.label = r1
                java.lang.Object r1 = r8.inTransaction(r7)
                if (r1 != r0) goto L54
                goto Lb7
            L54:
                r6 = r1
                r1 = r8
                r8 = r6
            L57:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L71
                androidx.room.RoomDatabase r8 = r7.this$0
                androidx.room.InvalidationTracker r8 = r8.getInvalidationTracker()
                r7.L$0 = r1
                r3 = 2
                r7.label = r3
                java.lang.Object r8 = r8.sync$room_runtime_release(r7)
                if (r8 != r0) goto L71
                goto Lb7
            L71:
                androidx.room.Transactor$SQLiteTransactionType r8 = androidx.room.Transactor.SQLiteTransactionType.IMMEDIATE
                androidx.room.RoomDatabase$performClear$1$1$1 r3 = new androidx.room.RoomDatabase$performClear$1$1$1
                boolean r4 = r7.$hasForeignKeys
                java.lang.String[] r5 = r7.$tableNames
                r3.<init>(r4, r5, r2)
                r7.L$0 = r1
                r4 = 3
                r7.label = r4
                java.lang.Object r8 = r1.withTransaction(r8, r3, r7)
                if (r8 != r0) goto L88
                goto Lb7
            L88:
                r7.L$0 = r1
                r8 = 4
                r7.label = r8
                java.lang.Object r8 = r1.inTransaction(r7)
                if (r8 != r0) goto L94
                goto Lb7
            L94:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto Lc1
                r7.L$0 = r1
                r8 = 5
                r7.label = r8
                java.lang.String r8 = "PRAGMA wal_checkpoint(FULL)"
                java.lang.Object r8 = androidx.room.TransactorKt.execSQL(r1, r8, r7)
                if (r8 != r0) goto Laa
                goto Lb7
            Laa:
                r7.L$0 = r2
                r8 = 6
                r7.label = r8
                java.lang.String r8 = "VACUUM"
                java.lang.Object r8 = androidx.room.TransactorKt.execSQL(r1, r8, r7)
                if (r8 != r0) goto Lb8
            Lb7:
                return r0
            Lb8:
                androidx.room.RoomDatabase r8 = r7.this$0
                androidx.room.InvalidationTracker r8 = r8.getInvalidationTracker()
                r8.refreshAsync()
            Lc1:
                kotlin.n1 r8 = kotlin.n1.a
                return r8
        }
    }

    RoomDatabase$performClear$1(androidx.room.RoomDatabase r1, boolean r2, java.lang.String[] r3, kotlin.coroutines.e<? super androidx.room.RoomDatabase$performClear$1> r4) {
            r0 = this;
            r0.this$0 = r1
            r0.$hasForeignKeys = r2
            r0.$tableNames = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r4, kotlin.coroutines.e<?> r5) {
            r3 = this;
            androidx.room.RoomDatabase$performClear$1 r4 = new androidx.room.RoomDatabase$performClear$1
            androidx.room.RoomDatabase r0 = r3.this$0
            boolean r1 = r3.$hasForeignKeys
            java.lang.String[] r2 = r3.$tableNames
            r4.<init>(r0, r1, r2, r5)
            return r4
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
            kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    public final java.lang.Object invoke(kotlinx.coroutines.r0 r1, kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            androidx.room.RoomDatabase$performClear$1 r1 = (androidx.room.RoomDatabase$performClear$1) r1
            kotlin.n1 r2 = kotlin.n1.a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.g0.n(r8)
            goto L3e
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            kotlin.g0.n(r8)
            androidx.room.RoomDatabase r8 = r7.this$0
            androidx.room.RoomConnectionManager r8 = androidx.room.RoomDatabase.access$getConnectionManager$p(r8)
            r1 = 0
            if (r8 != 0) goto L29
            java.lang.String r8 = "connectionManager"
            kotlin.jvm.internal.g0.S(r8)
            r8 = r1
        L29:
            androidx.room.RoomDatabase$performClear$1$1 r3 = new androidx.room.RoomDatabase$performClear$1$1
            androidx.room.RoomDatabase r4 = r7.this$0
            boolean r5 = r7.$hasForeignKeys
            java.lang.String[] r6 = r7.$tableNames
            r3.<init>(r4, r5, r6, r1)
            r7.label = r2
            r1 = 0
            java.lang.Object r8 = r8.useConnection(r1, r3, r7)
            if (r8 != r0) goto L3e
            return r0
        L3e:
            kotlin.n1 r8 = kotlin.n1.a
            return r8
    }
}
