package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class TransactorKt {
    public static /* synthetic */ boolean a(androidx.sqlite.SQLiteStatement r0) {
            boolean r0 = execSQL$lambda$0(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object deferredTransaction(@org.jetbrains.annotations.NotNull androidx.room.Transactor r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.room.TransactionScope<R>, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r3) {
            androidx.room.Transactor$SQLiteTransactionType r0 = androidx.room.Transactor.SQLiteTransactionType.DEFERRED
            java.lang.Object r1 = r1.withTransaction(r0, r2, r3)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object exclusiveTransaction(@org.jetbrains.annotations.NotNull androidx.room.Transactor r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.room.TransactionScope<R>, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r3) {
            androidx.room.Transactor$SQLiteTransactionType r0 = androidx.room.Transactor.SQLiteTransactionType.EXCLUSIVE
            java.lang.Object r1 = r1.withTransaction(r0, r2, r3)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object execSQL(@org.jetbrains.annotations.NotNull androidx.room.PooledConnection r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            androidx.room.w r0 = new androidx.room.w
            r0.<init>()
            java.lang.Object r1 = r1.usePrepared(r2, r0, r3)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
            if (r1 != r2) goto L10
            return r1
        L10:
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    private static final boolean execSQL$lambda$0(androidx.sqlite.SQLiteStatement r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = r1.step()
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object immediateTransaction(@org.jetbrains.annotations.NotNull androidx.room.Transactor r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.room.TransactionScope<R>, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r3) {
            androidx.room.Transactor$SQLiteTransactionType r0 = androidx.room.Transactor.SQLiteTransactionType.IMMEDIATE
            java.lang.Object r1 = r1.withTransaction(r0, r2, r3)
            return r1
    }
}
