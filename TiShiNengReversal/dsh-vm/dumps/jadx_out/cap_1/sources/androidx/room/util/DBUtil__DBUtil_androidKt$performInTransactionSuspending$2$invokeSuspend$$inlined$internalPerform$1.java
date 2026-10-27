package androidx.room.util;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1", f = "DBUtil.android.kt", i = {0, 0, 1, 1, 2, 3}, l = {56, 57, 59, 60, 67}, m = "invokeSuspend", n = {"transactor", "type", "transactor", "type", "transactor", "result"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0"})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDBUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt$internalPerform$2\n+ 2 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$performInTransactionSuspending$2\n*L\n1#1,66:1\n91#2:67\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.room.Transactor, kotlin.coroutines.e<? super R>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1 $block$inlined;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ boolean $isReadOnly;
    final /* synthetic */ androidx.room.RoomDatabase $this_internalPerform;
    /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDBUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt$internalPerform$2$result$1\n+ 2 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$performInTransactionSuspending$2\n*L\n1#1,59:1\n91#2:60\n*E\n"})
    /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.room.TransactionScope<R>, kotlin.coroutines.e<? super R>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function1 $block$inlined;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        public AnonymousClass1(kotlin.coroutines.e r1, kotlin.jvm.functions.Function1 r2) {
                r0 = this;
                r0.$block$inlined = r2
                r2 = 2
                r0.<init>(r2, r1)
                return
        }

        public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r3, kotlin.coroutines.e<?> r4) {
                r2 = this;
                androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1$1 r0 = new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1$1
                kotlin.jvm.functions.Function1 r1 = r2.$block$inlined
                r0.<init>(r4, r1)
                r0.L$0 = r3
                return r0
        }

        public final java.lang.Object invoke(androidx.room.TransactionScope<R> r1, kotlin.coroutines.e<? super R> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1$1 r1 = (androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1.AnonymousClass1) r1
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

        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.g0.n(r4)
                return r4
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.g0.n(r4)
                java.lang.Object r4 = r3.L$0
                androidx.room.TransactionScope r4 = (androidx.room.TransactionScope) r4
                kotlin.jvm.functions.Function1 r4 = r3.$block$inlined
                r3.label = r2
                r1 = 6
                kotlin.jvm.internal.d0.e(r1)
                java.lang.Object r4 = r4.invoke(r3)
                r1 = 7
                kotlin.jvm.internal.d0.e(r1)
                if (r4 != r0) goto L31
                return r0
            L31:
                return r4
        }
    }

    public DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1(boolean r1, boolean r2, androidx.room.RoomDatabase r3, kotlin.coroutines.e r4, kotlin.jvm.functions.Function1 r5) {
            r0 = this;
            r0.$inTransaction = r1
            r0.$isReadOnly = r2
            r0.$this_internalPerform = r3
            r0.$block$inlined = r5
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r7, kotlin.coroutines.e<?> r8) {
            r6 = this;
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1 r0 = new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1
            boolean r1 = r6.$inTransaction
            boolean r2 = r6.$isReadOnly
            androidx.room.RoomDatabase r3 = r6.$this_internalPerform
            kotlin.jvm.functions.Function1 r5 = r6.$block$inlined
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r0.L$0 = r7
            return r0
    }

    public final java.lang.Object invoke(androidx.room.Transactor r1, kotlin.coroutines.e<? super R> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1 r1 = (androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1) r1
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

    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r8.label
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L4b
            if (r1 == r6) goto L3f
            if (r1 == r5) goto L33
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            kotlin.g0.n(r9)
            return r9
        L1b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L23:
            java.lang.Object r0 = r8.L$0
            kotlin.g0.n(r9)
            goto Lb9
        L2a:
            java.lang.Object r1 = r8.L$0
            androidx.room.Transactor r1 = (androidx.room.Transactor) r1
            kotlin.g0.n(r9)
            goto La8
        L33:
            java.lang.Object r1 = r8.L$1
            androidx.room.Transactor$SQLiteTransactionType r1 = (androidx.room.Transactor.SQLiteTransactionType) r1
            java.lang.Object r2 = r8.L$0
            androidx.room.Transactor r2 = (androidx.room.Transactor) r2
            kotlin.g0.n(r9)
            goto L8e
        L3f:
            java.lang.Object r1 = r8.L$1
            androidx.room.Transactor$SQLiteTransactionType r1 = (androidx.room.Transactor.SQLiteTransactionType) r1
            java.lang.Object r2 = r8.L$0
            androidx.room.Transactor r2 = (androidx.room.Transactor) r2
            kotlin.g0.n(r9)
            goto L73
        L4b:
            kotlin.g0.n(r9)
            java.lang.Object r9 = r8.L$0
            androidx.room.Transactor r9 = (androidx.room.Transactor) r9
            boolean r1 = r8.$inTransaction
            if (r1 == 0) goto Lcc
            boolean r1 = r8.$isReadOnly
            if (r1 == 0) goto L5d
            androidx.room.Transactor$SQLiteTransactionType r2 = androidx.room.Transactor.SQLiteTransactionType.DEFERRED
            goto L5f
        L5d:
            androidx.room.Transactor$SQLiteTransactionType r2 = androidx.room.Transactor.SQLiteTransactionType.IMMEDIATE
        L5f:
            if (r1 != 0) goto L92
            r8.L$0 = r9
            r8.L$1 = r2
            r8.label = r6
            java.lang.Object r1 = r9.inTransaction(r8)
            if (r1 != r0) goto L6f
            goto Lde
        L6f:
            r7 = r2
            r2 = r9
            r9 = r1
            r1 = r7
        L73:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L8e
            androidx.room.RoomDatabase r9 = r8.$this_internalPerform
            androidx.room.InvalidationTracker r9 = r9.getInvalidationTracker()
            r8.L$0 = r2
            r8.L$1 = r1
            r8.label = r5
            java.lang.Object r9 = r9.sync$room_runtime_release(r8)
            if (r9 != r0) goto L8e
            goto Lde
        L8e:
            r7 = r2
            r2 = r1
            r1 = r7
            goto L93
        L92:
            r1 = r9
        L93:
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1$1 r9 = new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1$1
            kotlin.jvm.functions.Function1 r5 = r8.$block$inlined
            r6 = 0
            r9.<init>(r6, r5)
            r8.L$0 = r1
            r8.L$1 = r6
            r8.label = r4
            java.lang.Object r9 = r1.withTransaction(r2, r9, r8)
            if (r9 != r0) goto La8
            goto Lde
        La8:
            boolean r2 = r8.$isReadOnly
            if (r2 != 0) goto Lcb
            r8.L$0 = r9
            r8.label = r3
            java.lang.Object r1 = r1.inTransaction(r8)
            if (r1 != r0) goto Lb7
            goto Lde
        Lb7:
            r0 = r9
            r9 = r1
        Lb9:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto Lca
            androidx.room.RoomDatabase r9 = r8.$this_internalPerform
            androidx.room.InvalidationTracker r9 = r9.getInvalidationTracker()
            r9.refreshAsync()
        Lca:
            return r0
        Lcb:
            return r9
        Lcc:
            kotlin.jvm.functions.Function1 r9 = r8.$block$inlined
            r8.label = r2
            r1 = 6
            kotlin.jvm.internal.d0.e(r1)
            java.lang.Object r9 = r9.invoke(r8)
            r1 = 7
            kotlin.jvm.internal.d0.e(r1)
            if (r9 != r0) goto Ldf
        Lde:
            return r0
        Ldf:
            return r9
    }
}
