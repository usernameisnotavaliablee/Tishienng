package androidx.sqlite.db;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface SupportSQLiteDatabase extends java.io.Closeable {
    void beginTransaction();

    void beginTransactionNonExclusive();

    void beginTransactionReadOnly();

    void beginTransactionWithListener(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteTransactionListener r1);

    void beginTransactionWithListenerNonExclusive(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteTransactionListener r1);

    void beginTransactionWithListenerReadOnly(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteTransactionListener r1);

    @org.jetbrains.annotations.NotNull
    androidx.sqlite.db.SupportSQLiteStatement compileStatement(@org.jetbrains.annotations.NotNull java.lang.String r1);

    int delete(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.Object[] r3);

    void disableWriteAheadLogging();

    boolean enableWriteAheadLogging();

    void endTransaction();

    void execPerConnectionSQL(@org.jetbrains.annotations.NotNull java.lang.String r1, @android.annotation.SuppressLint({"ArrayReturn"}) @org.jetbrains.annotations.Nullable java.lang.Object[] r2);

    void execSQL(@org.jetbrains.annotations.NotNull java.lang.String r1) throws android.database.SQLException;

    void execSQL(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.Object[] r2) throws android.database.SQLException;

    @org.jetbrains.annotations.Nullable
    java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getAttachedDbs();

    long getMaximumSize();

    long getPageSize();

    @org.jetbrains.annotations.Nullable
    java.lang.String getPath();

    int getVersion();

    boolean inTransaction();

    long insert(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2, @org.jetbrains.annotations.NotNull android.content.ContentValues r3) throws android.database.SQLException;

    boolean isDatabaseIntegrityOk();

    boolean isDbLockedByCurrentThread();

    boolean isExecPerConnectionSQLSupported();

    boolean isOpen();

    boolean isReadOnly();

    boolean isWriteAheadLoggingEnabled();

    boolean needUpgrade(int r1);

    @org.jetbrains.annotations.NotNull
    android.database.Cursor query(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteQuery r1);

    @org.jetbrains.annotations.NotNull
    android.database.Cursor query(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteQuery r1, @org.jetbrains.annotations.Nullable android.os.CancellationSignal r2);

    @org.jetbrains.annotations.NotNull
    android.database.Cursor query(@org.jetbrains.annotations.NotNull java.lang.String r1);

    @org.jetbrains.annotations.NotNull
    android.database.Cursor query(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.Object[] r2);

    void setForeignKeyConstraintsEnabled(boolean r1);

    void setLocale(@org.jetbrains.annotations.NotNull java.util.Locale r1);

    void setMaxSqlCacheSize(int r1);

    long setMaximumSize(long r1);

    void setPageSize(long r1);

    void setTransactionSuccessful();

    void setVersion(int r1);

    int update(@org.jetbrains.annotations.NotNull java.lang.String r1, int r2, @org.jetbrains.annotations.NotNull android.content.ContentValues r3, @org.jetbrains.annotations.Nullable java.lang.String r4, @org.jetbrains.annotations.Nullable java.lang.Object[] r5);

    boolean yieldIfContendedSafely();

    boolean yieldIfContendedSafely(long r1);
}
