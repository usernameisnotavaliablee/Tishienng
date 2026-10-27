package androidx.room.util;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class DBUtil {
    @kotlin.Deprecated(message = "Use constructor", replaceWith = @kotlin.ReplaceWith(expression = "CancellationSignal()", imports = {"android.os.CancellationSignal"}))
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.NotNull
    public static final android.os.CancellationSignal createCancellationSignal() {
            android.os.CancellationSignal r0 = androidx.room.util.DBUtil__DBUtil_androidKt.createCancellationSignal()
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void dropFtsSyncTriggers(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r0) {
            androidx.room.util.DBUtil__DBUtilKt.dropFtsSyncTriggers(r0)
            return
    }

    @kotlin.Deprecated(message = "Replaced by dropFtsSyncTriggers(connection: SQLiteConnection)")
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void dropFtsSyncTriggers(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r0) {
            androidx.room.util.DBUtil__DBUtil_androidKt.dropFtsSyncTriggers(r0)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void foreignKeyCheck(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r0, @org.jetbrains.annotations.NotNull java.lang.String r1) {
            androidx.room.util.DBUtil__DBUtilKt.foreignKeyCheck(r0, r1)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void foreignKeyCheck(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r0, @org.jetbrains.annotations.NotNull java.lang.String r1) {
            androidx.room.util.DBUtil__DBUtil_androidKt.foreignKeyCheck(r0, r1)
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object getCoroutineContext(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r0, boolean r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.coroutines.i> r2) {
            java.lang.Object r0 = androidx.room.util.DBUtil__DBUtil_androidKt.getCoroutineContext(r0, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object internalPerform(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r0, boolean r1, boolean r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.room.PooledConnection, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r4) {
            java.lang.Object r0 = androidx.room.util.DBUtil__DBUtilKt.internalPerform(r0, r1, r2, r3, r4)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <R> R performBlocking(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r0, boolean r1, boolean r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.sqlite.SQLiteConnection, ? extends R> r3) {
            java.lang.Object r0 = androidx.room.util.DBUtil__DBUtil_androidKt.performBlocking(r0, r1, r2, r3)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object performInTransactionSuspending(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r2) {
            java.lang.Object r0 = androidx.room.util.DBUtil__DBUtil_androidKt.performInTransactionSuspending(r0, r1, r2)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object performSuspending(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r0, boolean r1, boolean r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.sqlite.SQLiteConnection, ? extends R> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r4) {
            java.lang.Object r0 = androidx.room.util.DBUtil__DBUtil_androidKt.performSuspending(r0, r1, r2, r3, r4)
            return r0
    }

    @kotlin.Deprecated(message = "This is only used in the generated code and shouldn't be called directly.")
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.NotNull
    public static final android.database.Cursor query(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r0, @org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteQuery r1, boolean r2) {
            android.database.Cursor r0 = androidx.room.util.DBUtil__DBUtil_androidKt.query(r0, r1, r2)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.NotNull
    public static final android.database.Cursor query(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r0, @org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteQuery r1, boolean r2, @org.jetbrains.annotations.Nullable android.os.CancellationSignal r3) {
            android.database.Cursor r0 = androidx.room.util.DBUtil__DBUtil_androidKt.query(r0, r1, r2, r3)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int readVersion(@org.jetbrains.annotations.NotNull java.io.File r0) throws java.io.IOException {
            int r0 = androidx.room.util.DBUtil__DBUtil_androidKt.readVersion(r0)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.NotNull
    public static final androidx.sqlite.SQLiteConnection toSQLiteConnection(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r0) {
            androidx.sqlite.SQLiteConnection r0 = androidx.room.util.DBUtil__DBUtil_androidKt.toSQLiteConnection(r0)
            return r0
    }
}
