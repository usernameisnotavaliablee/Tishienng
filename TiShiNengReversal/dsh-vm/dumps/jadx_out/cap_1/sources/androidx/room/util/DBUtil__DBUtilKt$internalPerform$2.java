package androidx.room.util;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.util.DBUtil__DBUtilKt$internalPerform$2", f = "DBUtil.kt", i = {0, 0, 1, 1, 2, 3}, l = {56, 57, 59, 60, 65}, m = "invokeSuspend", n = {"transactor", "type", "transactor", "type", "transactor", "result"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class DBUtil__DBUtilKt$internalPerform$2<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.room.Transactor, kotlin.coroutines.e<? super R>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.room.PooledConnection, kotlin.coroutines.e<? super R>, java.lang.Object> $block;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ boolean $isReadOnly;
    final /* synthetic */ androidx.room.RoomDatabase $this_internalPerform;
    /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;

    public DBUtil__DBUtilKt$internalPerform$2(boolean r1, boolean r2, androidx.room.RoomDatabase r3, kotlin.jvm.functions.Function2<? super androidx.room.PooledConnection, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r4, kotlin.coroutines.e<? super androidx.room.util.DBUtil__DBUtilKt$internalPerform$2> r5) {
            r0 = this;
            r0.$inTransaction = r1
            r0.$isReadOnly = r2
            r0.$this_internalPerform = r3
            r0.$block = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    public final kotlin.coroutines.e<kotlin.n1> create(java.lang.Object r7, kotlin.coroutines.e<?> r8) {
            r6 = this;
            androidx.room.util.DBUtil__DBUtilKt$internalPerform$2 r0 = new androidx.room.util.DBUtil__DBUtilKt$internalPerform$2
            boolean r1 = r6.$inTransaction
            boolean r2 = r6.$isReadOnly
            androidx.room.RoomDatabase r3 = r6.$this_internalPerform
            kotlin.jvm.functions.Function2<androidx.room.PooledConnection, kotlin.coroutines.e<? super R>, java.lang.Object> r4 = r6.$block
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r0.L$0 = r7
            return r0
    }

    public final java.lang.Object invoke(androidx.room.Transactor r1, kotlin.coroutines.e<? super R> r2) {
            r0 = this;
            kotlin.coroutines.e r1 = r0.create(r1, r2)
            androidx.room.util.DBUtil__DBUtilKt$internalPerform$2 r1 = (androidx.room.util.DBUtil__DBUtilKt$internalPerform$2) r1
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
            goto Ld6
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
            goto Ld6
        L8e:
            r7 = r2
            r2 = r1
            r1 = r7
            goto L93
        L92:
            r1 = r9
        L93:
            androidx.room.util.DBUtil__DBUtilKt$internalPerform$2$result$1 r9 = new androidx.room.util.DBUtil__DBUtilKt$internalPerform$2$result$1
            kotlin.jvm.functions.Function2<androidx.room.PooledConnection, kotlin.coroutines.e<? super R>, java.lang.Object> r5 = r8.$block
            r6 = 0
            r9.<init>(r5, r6)
            r8.L$0 = r1
            r8.L$1 = r6
            r8.label = r4
            java.lang.Object r9 = r1.withTransaction(r2, r9, r8)
            if (r9 != r0) goto La8
            goto Ld6
        La8:
            boolean r2 = r8.$isReadOnly
            if (r2 != 0) goto Lcb
            r8.L$0 = r9
            r8.label = r3
            java.lang.Object r1 = r1.inTransaction(r8)
            if (r1 != r0) goto Lb7
            goto Ld6
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
            kotlin.jvm.functions.Function2<androidx.room.PooledConnection, kotlin.coroutines.e<? super R>, java.lang.Object> r1 = r8.$block
            r8.label = r2
            java.lang.Object r9 = r1.invoke(r9, r8)
            if (r9 != r0) goto Ld7
        Ld6:
            return r0
        Ld7:
            return r9
    }

    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r7) {
            r6 = this;
            java.lang.Object r7 = r6.L$0
            androidx.room.Transactor r7 = (androidx.room.Transactor) r7
            boolean r0 = r6.$inTransaction
            if (r0 == 0) goto L68
            boolean r0 = r6.$isReadOnly
            if (r0 == 0) goto Lf
            androidx.room.Transactor$SQLiteTransactionType r1 = androidx.room.Transactor.SQLiteTransactionType.DEFERRED
            goto L11
        Lf:
            androidx.room.Transactor$SQLiteTransactionType r1 = androidx.room.Transactor.SQLiteTransactionType.IMMEDIATE
        L11:
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L36
            kotlin.jvm.internal.d0.e(r3)
            java.lang.Object r0 = r7.inTransaction(r6)
            kotlin.jvm.internal.d0.e(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L36
            androidx.room.RoomDatabase r0 = r6.$this_internalPerform
            androidx.room.InvalidationTracker r0 = r0.getInvalidationTracker()
            kotlin.jvm.internal.d0.e(r3)
            r0.sync$room_runtime_release(r6)
            kotlin.jvm.internal.d0.e(r2)
        L36:
            androidx.room.util.DBUtil__DBUtilKt$internalPerform$2$result$1 r0 = new androidx.room.util.DBUtil__DBUtilKt$internalPerform$2$result$1
            kotlin.jvm.functions.Function2<androidx.room.PooledConnection, kotlin.coroutines.e<? super R>, java.lang.Object> r4 = r6.$block
            r5 = 0
            r0.<init>(r4, r5)
            kotlin.jvm.internal.d0.e(r3)
            java.lang.Object r0 = r7.withTransaction(r1, r0, r6)
            kotlin.jvm.internal.d0.e(r2)
            boolean r1 = r6.$isReadOnly
            if (r1 != 0) goto L67
            kotlin.jvm.internal.d0.e(r3)
            java.lang.Object r7 = r7.inTransaction(r6)
            kotlin.jvm.internal.d0.e(r2)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L67
            androidx.room.RoomDatabase r7 = r6.$this_internalPerform
            androidx.room.InvalidationTracker r7 = r7.getInvalidationTracker()
            r7.refreshAsync()
        L67:
            return r0
        L68:
            kotlin.jvm.functions.Function2<androidx.room.PooledConnection, kotlin.coroutines.e<? super R>, java.lang.Object> r0 = r6.$block
            java.lang.Object r7 = r0.invoke(r7, r6)
            return r7
    }
}
