package androidx.room.util;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1", f = "DBUtil.android.kt", i = {0, 0, 1, 1, 2, 3}, l = {56, 57, 59, 60}, m = "invokeSuspend", n = {"transactor", "type", "transactor", "type", "transactor", "result"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0"})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDBUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt$internalPerform$2\n+ 2 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1\n*L\n1#1,66:1\n75#2,2:67\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.room.Transactor, kotlin.coroutines.e<? super R>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1 $block$inlined;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ boolean $isReadOnly;
    final /* synthetic */ androidx.room.RoomDatabase $this_internalPerform;
    /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDBUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt$internalPerform$2$result$1\n+ 2 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1\n*L\n1#1,59:1\n75#2,2:60\n*E\n"})
    /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1$1, reason: invalid class name */
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
                androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1$1 r0 = new androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1$1
                kotlin.jvm.functions.Function1 r1 = r2.$block$inlined
                r0.<init>(r4, r1)
                r0.L$0 = r3
                return r0
        }

        public final java.lang.Object invoke(androidx.room.TransactionScope<R> r1, kotlin.coroutines.e<? super R> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1$1 r1 = (androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1.AnonymousClass1) r1
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

        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                r1 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r1.label
                if (r0 != 0) goto L20
                kotlin.g0.n(r2)
                java.lang.Object r2 = r1.L$0
                androidx.room.TransactionScope r2 = (androidx.room.TransactionScope) r2
                java.lang.String r0 = "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor"
                kotlin.jvm.internal.g0.n(r2, r0)
                androidx.room.coroutines.RawConnectionAccessor r2 = (androidx.room.coroutines.RawConnectionAccessor) r2
                androidx.sqlite.SQLiteConnection r2 = r2.getRawConnection()
                kotlin.jvm.functions.Function1 r0 = r1.$block$inlined
                java.lang.Object r2 = r0.invoke(r2)
                return r2
            L20:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r2.<init>(r0)
                throw r2
        }
    }

    public DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1(boolean r1, boolean r2, androidx.room.RoomDatabase r3, kotlin.coroutines.e r4, kotlin.jvm.functions.Function1 r5) {
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
            androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1 r0 = new androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1
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
            androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1 r1 = (androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1) r1
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
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L44
            if (r1 == r5) goto L38
            if (r1 == r4) goto L2c
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r0 = r7.L$0
            kotlin.g0.n(r8)
            goto Lb3
        L1b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L23:
            java.lang.Object r1 = r7.L$0
            androidx.room.Transactor r1 = (androidx.room.Transactor) r1
            kotlin.g0.n(r8)
            goto La2
        L2c:
            java.lang.Object r1 = r7.L$1
            androidx.room.Transactor$SQLiteTransactionType r1 = (androidx.room.Transactor.SQLiteTransactionType) r1
            java.lang.Object r4 = r7.L$0
            androidx.room.Transactor r4 = (androidx.room.Transactor) r4
            kotlin.g0.n(r8)
            goto L86
        L38:
            java.lang.Object r1 = r7.L$1
            androidx.room.Transactor$SQLiteTransactionType r1 = (androidx.room.Transactor.SQLiteTransactionType) r1
            java.lang.Object r5 = r7.L$0
            androidx.room.Transactor r5 = (androidx.room.Transactor) r5
            kotlin.g0.n(r8)
            goto L6a
        L44:
            kotlin.g0.n(r8)
            java.lang.Object r8 = r7.L$0
            androidx.room.Transactor r8 = (androidx.room.Transactor) r8
            boolean r1 = r7.$inTransaction
            if (r1 == 0) goto Lc6
            boolean r1 = r7.$isReadOnly
            if (r1 == 0) goto L56
            androidx.room.Transactor$SQLiteTransactionType r6 = androidx.room.Transactor.SQLiteTransactionType.DEFERRED
            goto L58
        L56:
            androidx.room.Transactor$SQLiteTransactionType r6 = androidx.room.Transactor.SQLiteTransactionType.IMMEDIATE
        L58:
            if (r1 != 0) goto L8c
            r7.L$0 = r8
            r7.L$1 = r6
            r7.label = r5
            java.lang.Object r1 = r8.inTransaction(r7)
            if (r1 != r0) goto L67
            goto Lb0
        L67:
            r5 = r8
            r8 = r1
            r1 = r6
        L6a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L89
            androidx.room.RoomDatabase r8 = r7.$this_internalPerform
            androidx.room.InvalidationTracker r8 = r8.getInvalidationTracker()
            r7.L$0 = r5
            r7.L$1 = r1
            r7.label = r4
            java.lang.Object r8 = r8.sync$room_runtime_release(r7)
            if (r8 != r0) goto L85
            goto Lb0
        L85:
            r4 = r5
        L86:
            r6 = r1
            r1 = r4
            goto L8d
        L89:
            r6 = r1
            r1 = r5
            goto L8d
        L8c:
            r1 = r8
        L8d:
            androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1$1 r8 = new androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1$1
            kotlin.jvm.functions.Function1 r4 = r7.$block$inlined
            r5 = 0
            r8.<init>(r5, r4)
            r7.L$0 = r1
            r7.L$1 = r5
            r7.label = r3
            java.lang.Object r8 = r1.withTransaction(r6, r8, r7)
            if (r8 != r0) goto La2
            goto Lb0
        La2:
            boolean r3 = r7.$isReadOnly
            if (r3 != 0) goto Lc5
            r7.L$0 = r8
            r7.label = r2
            java.lang.Object r1 = r1.inTransaction(r7)
            if (r1 != r0) goto Lb1
        Lb0:
            return r0
        Lb1:
            r0 = r8
            r8 = r1
        Lb3:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto Lc4
            androidx.room.RoomDatabase r8 = r7.$this_internalPerform
            androidx.room.InvalidationTracker r8 = r8.getInvalidationTracker()
            r8.refreshAsync()
        Lc4:
            return r0
        Lc5:
            return r8
        Lc6:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor"
            kotlin.jvm.internal.g0.n(r8, r0)
            androidx.room.coroutines.RawConnectionAccessor r8 = (androidx.room.coroutines.RawConnectionAccessor) r8
            androidx.sqlite.SQLiteConnection r8 = r8.getRawConnection()
            kotlin.jvm.functions.Function1 r0 = r7.$block$inlined
            java.lang.Object r8 = r0.invoke(r8)
            return r8
    }
}
