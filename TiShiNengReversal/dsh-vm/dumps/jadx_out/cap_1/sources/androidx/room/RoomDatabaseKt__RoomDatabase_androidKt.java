package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRoomDatabase.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.android.kt\nandroidx/room/RoomDatabaseKt__RoomDatabase_androidKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,2151:1\n314#2,11:2152\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.android.kt\nandroidx/room/RoomDatabaseKt__RoomDatabase_androidKt\n*L\n2038#1:2152,11\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final /* synthetic */ class RoomDatabaseKt__RoomDatabase_androidKt {
    public static final /* synthetic */ kotlin.coroutines.i access$createTransactionContext(androidx.room.RoomDatabase r0, kotlin.coroutines.f r1) {
            kotlin.coroutines.i r0 = createTransactionContext$RoomDatabaseKt__RoomDatabase_androidKt(r0, r1)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$startTransactionCoroutine$RoomDatabaseKt__RoomDatabase_androidKt(androidx.room.RoomDatabase r0, kotlin.coroutines.i r1, kotlin.jvm.functions.Function2 r2, kotlin.coroutines.e r3) {
            java.lang.Object r0 = startTransactionCoroutine$RoomDatabaseKt__RoomDatabase_androidKt(r0, r1, r2, r3)
            return r0
    }

    private static final kotlin.coroutines.i createTransactionContext$RoomDatabaseKt__RoomDatabase_androidKt(androidx.room.RoomDatabase r2, kotlin.coroutines.f r3) {
            androidx.room.TransactionElement r0 = new androidx.room.TransactionElement
            r0.<init>(r3)
            java.lang.ThreadLocal r2 = r2.getSuspendingTransactionId()
            int r1 = java.lang.System.identityHashCode(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            kotlinx.coroutines.e3 r2 = kotlinx.coroutines.f3.a(r2, r1)
            kotlin.coroutines.i r3 = r3.plus(r0)
            kotlin.coroutines.i r2 = r3.plus(r2)
            return r2
    }

    @kotlin.Deprecated(message = "Replaced by equivalent API in InvalidationTracker.", replaceWith = @kotlin.ReplaceWith(expression = "this.invalidationTracker.createFlow(*tables)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.flow.i<java.util.Set<java.lang.String>> invalidationTrackerFlow(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r1, @org.jetbrains.annotations.NotNull java.lang.String[] r2, boolean r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "tables"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.room.InvalidationTracker r1 = r1.getInvalidationTracker()
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            kotlinx.coroutines.flow.i r1 = r1.createFlow(r2, r3)
            return r1
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i invalidationTrackerFlow$default(androidx.room.RoomDatabase r0, java.lang.String[] r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 1
        L5:
            kotlinx.coroutines.flow.i r0 = androidx.room.RoomDatabaseKt.invalidationTrackerFlow(r0, r1, r2)
            return r0
    }

    private static final <R> java.lang.Object startTransactionCoroutine$RoomDatabaseKt__RoomDatabase_androidKt(androidx.room.RoomDatabase r3, kotlin.coroutines.i r4, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r5, kotlin.coroutines.e<? super R> r6) {
            kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r0.Q()
            java.util.concurrent.Executor r1 = r3.getTransactionExecutor()     // Catch: java.util.concurrent.RejectedExecutionException -> L1a
            androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1 r2 = new androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1     // Catch: java.util.concurrent.RejectedExecutionException -> L1a
            r2.<init>(r4, r0, r3, r5)     // Catch: java.util.concurrent.RejectedExecutionException -> L1a
            r1.execute(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L1a
            goto L25
        L1a:
            r3 = move-exception
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Unable to acquire a thread to perform the database transaction."
            r4.<init>(r5, r3)
            r0.a(r4)
        L25:
            java.lang.Object r3 = r0.x()
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
            if (r3 != r4) goto L32
            kotlin.coroutines.jvm.internal.e.c(r6)
        L32:
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object withTransaction(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r4) {
            androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2 r0 = new androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2
            r1 = 0
            r0.<init>(r2, r3, r1)
            java.lang.Object r2 = androidx.room.RoomDatabaseKt.withTransactionContext(r2, r0, r4)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object withTransactionContext(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r5) {
            androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 r0 = new androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1
            r1 = 0
            r0.<init>(r4, r1)
            kotlin.coroutines.i r4 = r5.getContext()
            androidx.room.TransactionElement$Key r2 = androidx.room.TransactionElement.Key
            kotlin.coroutines.i$b r4 = r4.get(r2)
            androidx.room.TransactionElement r4 = (androidx.room.TransactionElement) r4
            if (r4 == 0) goto L18
            kotlin.coroutines.f r1 = r4.getTransactionDispatcher$room_runtime_release()
        L18:
            if (r1 == 0) goto L1f
            java.lang.Object r3 = kotlinx.coroutines.i.h(r1, r0, r5)
            return r3
        L1f:
            kotlin.coroutines.i r4 = r5.getContext()
            java.lang.Object r3 = startTransactionCoroutine$RoomDatabaseKt__RoomDatabase_androidKt(r3, r4, r0, r5)
            return r3
    }
}
