package androidx.room;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class RoomDatabaseKt {
    @kotlin.Deprecated(message = "Replaced by equivalent API in InvalidationTracker.", replaceWith = @kotlin.ReplaceWith(expression = "this.invalidationTracker.createFlow(*tables)", imports = {}))
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.flow.i<java.util.Set<java.lang.String>> invalidationTrackerFlow(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r0, @org.jetbrains.annotations.NotNull java.lang.String[] r1, boolean r2) {
            kotlinx.coroutines.flow.i r0 = androidx.room.RoomDatabaseKt__RoomDatabase_androidKt.invalidationTrackerFlow(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i invalidationTrackerFlow$default(androidx.room.RoomDatabase r0, java.lang.String[] r1, boolean r2, int r3, java.lang.Object r4) {
            kotlinx.coroutines.flow.i r0 = androidx.room.RoomDatabaseKt__RoomDatabase_androidKt.invalidationTrackerFlow$default(r0, r1, r2, r3, r4)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object useReaderConnection(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.room.Transactor, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r2) {
            java.lang.Object r0 = androidx.room.RoomDatabaseKt__RoomDatabaseKt.useReaderConnection(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object useWriterConnection(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.room.Transactor, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r2) {
            java.lang.Object r0 = androidx.room.RoomDatabaseKt__RoomDatabaseKt.useWriterConnection(r0, r1, r2)
            return r0
    }

    public static final void validateAutoMigrations(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r0, @org.jetbrains.annotations.NotNull androidx.room.DatabaseConfiguration r1) {
            androidx.room.RoomDatabaseKt__RoomDatabaseKt.validateAutoMigrations(r0, r1)
            return
    }

    public static final void validateMigrationsNotRequired(@org.jetbrains.annotations.NotNull java.util.Set<java.lang.Integer> r0, @org.jetbrains.annotations.NotNull java.util.Set<java.lang.Integer> r1) {
            androidx.room.RoomDatabaseKt__RoomDatabaseKt.validateMigrationsNotRequired(r0, r1)
            return
    }

    public static final void validateTypeConverters(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r0, @org.jetbrains.annotations.NotNull androidx.room.DatabaseConfiguration r1) {
            androidx.room.RoomDatabaseKt__RoomDatabaseKt.validateTypeConverters(r0, r1)
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object withTransaction(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r2) {
            java.lang.Object r0 = androidx.room.RoomDatabaseKt__RoomDatabase_androidKt.withTransaction(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object withTransactionContext(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r2) {
            java.lang.Object r0 = androidx.room.RoomDatabaseKt__RoomDatabase_androidKt.withTransactionContext(r0, r1, r2)
            return r0
    }
}
