package androidx.room.support;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class QueryInterceptorDatabase implements androidx.sqlite.db.SupportSQLiteDatabase {

    @org.jetbrains.annotations.NotNull
    private final androidx.sqlite.db.SupportSQLiteDatabase delegate;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.RoomDatabase.QueryCallback queryCallback;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.r0 queryCallbackScope;

    public QueryInterceptorDatabase(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r3, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.QueryCallback r4) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "queryCallbackScope"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "queryCallback"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.delegate = r2
            r1.queryCallbackScope = r3
            r1.queryCallback = r4
            return
    }

    public static final /* synthetic */ androidx.room.RoomDatabase.QueryCallback access$getQueryCallback$p(androidx.room.support.QueryInterceptorDatabase r0) {
            androidx.room.RoomDatabase$QueryCallback r0 = r0.queryCallback
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
            r6 = this;
            kotlinx.coroutines.r0 r0 = r6.queryCallbackScope
            androidx.room.support.QueryInterceptorDatabase$beginTransaction$1 r3 = new androidx.room.support.QueryInterceptorDatabase$beginTransaction$1
            r1 = 0
            r3.<init>(r6, r1)
            r4 = 3
            r5 = 0
            r2 = 0
            kotlinx.coroutines.i.e(r0, r1, r2, r3, r4, r5)
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r6.delegate
            r0.beginTransaction()
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
            r6 = this;
            kotlinx.coroutines.r0 r0 = r6.queryCallbackScope
            androidx.room.support.QueryInterceptorDatabase$beginTransactionNonExclusive$1 r3 = new androidx.room.support.QueryInterceptorDatabase$beginTransactionNonExclusive$1
            r1 = 0
            r3.<init>(r6, r1)
            r4 = 3
            r5 = 0
            r2 = 0
            kotlinx.coroutines.i.e(r0, r1, r2, r3, r4, r5)
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r6.delegate
            r0.beginTransactionNonExclusive()
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionReadOnly() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            r0.beginTransactionReadOnly()
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListener(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteTransactionListener r8) {
            r7 = this;
            java.lang.String r0 = "transactionListener"
            kotlin.jvm.internal.g0.p(r8, r0)
            kotlinx.coroutines.r0 r1 = r7.queryCallbackScope
            androidx.room.support.QueryInterceptorDatabase$beginTransactionWithListener$1 r4 = new androidx.room.support.QueryInterceptorDatabase$beginTransactionWithListener$1
            r0 = 0
            r4.<init>(r7, r0)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r7.delegate
            r0.beginTransactionWithListener(r8)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListenerNonExclusive(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteTransactionListener r8) {
            r7 = this;
            java.lang.String r0 = "transactionListener"
            kotlin.jvm.internal.g0.p(r8, r0)
            kotlinx.coroutines.r0 r1 = r7.queryCallbackScope
            androidx.room.support.QueryInterceptorDatabase$beginTransactionWithListenerNonExclusive$1 r4 = new androidx.room.support.QueryInterceptorDatabase$beginTransactionWithListenerNonExclusive$1
            r0 = 0
            r4.<init>(r7, r0)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r7.delegate
            r0.beginTransactionWithListenerNonExclusive(r8)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListenerReadOnly(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteTransactionListener r2) {
            r1 = this;
            java.lang.String r0 = "transactionListener"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            r0.beginTransactionWithListenerReadOnly(r2)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            r0.close()
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @org.jetbrains.annotations.NotNull
    public androidx.sqlite.db.SupportSQLiteStatement compileStatement(@org.jetbrains.annotations.NotNull java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "sql"
            kotlin.jvm.internal.g0.p(r5, r0)
            androidx.room.support.QueryInterceptorStatement r0 = new androidx.room.support.QueryInterceptorStatement
            androidx.sqlite.db.SupportSQLiteDatabase r1 = r4.delegate
            androidx.sqlite.db.SupportSQLiteStatement r1 = r1.compileStatement(r5)
            kotlinx.coroutines.r0 r2 = r4.queryCallbackScope
            androidx.room.RoomDatabase$QueryCallback r3 = r4.queryCallback
            r0.<init>(r1, r5, r2, r3)
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int delete(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.Nullable java.lang.Object[] r4) {
            r1 = this;
            java.lang.String r0 = "table"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            int r2 = r0.delete(r2, r3, r4)
            return r2
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void disableWriteAheadLogging() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            r0.disableWriteAheadLogging()
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean enableWriteAheadLogging() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            boolean r0 = r0.enableWriteAheadLogging()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void endTransaction() {
            r6 = this;
            kotlinx.coroutines.r0 r0 = r6.queryCallbackScope
            androidx.room.support.QueryInterceptorDatabase$endTransaction$1 r3 = new androidx.room.support.QueryInterceptorDatabase$endTransaction$1
            r1 = 0
            r3.<init>(r6, r1)
            r4 = 3
            r5 = 0
            r2 = 0
            kotlinx.coroutines.i.e(r0, r1, r2, r3, r4, r5)
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r6.delegate
            r0.endTransaction()
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execPerConnectionSQL(@org.jetbrains.annotations.NotNull java.lang.String r2, @android.annotation.SuppressLint({"ArrayReturn"}) @org.jetbrains.annotations.Nullable java.lang.Object[] r3) {
            r1 = this;
            java.lang.String r0 = "sql"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            r0.execPerConnectionSQL(r2, r3)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(@org.jetbrains.annotations.NotNull java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "sql"
            kotlin.jvm.internal.g0.p(r8, r0)
            kotlinx.coroutines.r0 r1 = r7.queryCallbackScope
            androidx.room.support.QueryInterceptorDatabase$execSQL$1 r4 = new androidx.room.support.QueryInterceptorDatabase$execSQL$1
            r0 = 0
            r4.<init>(r7, r8, r0)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r7.delegate
            r0.execSQL(r8)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.Object[] r9) {
            r7 = this;
            java.lang.String r0 = "sql"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "bindArgs"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.util.List r0 = kotlin.collections.n.dz(r9)
            kotlinx.coroutines.r0 r1 = r7.queryCallbackScope
            androidx.room.support.QueryInterceptorDatabase$execSQL$2 r4 = new androidx.room.support.QueryInterceptorDatabase$execSQL$2
            r2 = 0
            r4.<init>(r7, r8, r0, r2)
            r5 = 3
            r6 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r7.delegate
            r0.execSQL(r8, r9)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @org.jetbrains.annotations.Nullable
    public java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getAttachedDbs() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            java.util.List r0 = r0.getAttachedDbs()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getMaximumSize() {
            r2 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r2.delegate
            long r0 = r0.getMaximumSize()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getPageSize() {
            r2 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r2.delegate
            long r0 = r0.getPageSize()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @org.jetbrains.annotations.Nullable
    public java.lang.String getPath() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            java.lang.String r0 = r0.getPath()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int getVersion() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            int r0 = r0.getVersion()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean inTransaction() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            boolean r0 = r0.inTransaction()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long insert(@org.jetbrains.annotations.NotNull java.lang.String r2, int r3, @org.jetbrains.annotations.NotNull android.content.ContentValues r4) {
            r1 = this;
            java.lang.String r0 = "table"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "values"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            long r2 = r0.insert(r2, r3, r4)
            return r2
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            boolean r0 = r0.isDatabaseIntegrityOk()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            boolean r0 = r0.isDbLockedByCurrentThread()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isExecPerConnectionSQLSupported() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            boolean r0 = r0.isExecPerConnectionSQLSupported()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isOpen() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            boolean r0 = r0.isOpen()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isReadOnly() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            boolean r0 = r0.isReadOnly()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isWriteAheadLoggingEnabled() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            boolean r0 = r0.isWriteAheadLoggingEnabled()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean needUpgrade(int r2) {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            boolean r2 = r0.needUpgrade(r2)
            return r2
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @org.jetbrains.annotations.NotNull
    public android.database.Cursor query(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteQuery r8) {
            r7 = this;
            java.lang.String r0 = "query"
            kotlin.jvm.internal.g0.p(r8, r0)
            androidx.room.support.QueryInterceptorProgram r0 = new androidx.room.support.QueryInterceptorProgram
            r0.<init>()
            r8.bindTo(r0)
            kotlinx.coroutines.r0 r1 = r7.queryCallbackScope
            androidx.room.support.QueryInterceptorDatabase$query$3 r4 = new androidx.room.support.QueryInterceptorDatabase$query$3
            r2 = 0
            r4.<init>(r7, r8, r0, r2)
            r5 = 3
            r6 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r7.delegate
            android.database.Cursor r8 = r0.query(r8)
            return r8
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @org.jetbrains.annotations.NotNull
    public android.database.Cursor query(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteQuery r7, @org.jetbrains.annotations.Nullable android.os.CancellationSignal r8) {
            r6 = this;
            java.lang.String r8 = "query"
            kotlin.jvm.internal.g0.p(r7, r8)
            androidx.room.support.QueryInterceptorProgram r8 = new androidx.room.support.QueryInterceptorProgram
            r8.<init>()
            r7.bindTo(r8)
            kotlinx.coroutines.r0 r0 = r6.queryCallbackScope
            androidx.room.support.QueryInterceptorDatabase$query$4 r3 = new androidx.room.support.QueryInterceptorDatabase$query$4
            r1 = 0
            r3.<init>(r6, r7, r8, r1)
            r4 = 3
            r5 = 0
            r2 = 0
            kotlinx.coroutines.i.e(r0, r1, r2, r3, r4, r5)
            androidx.sqlite.db.SupportSQLiteDatabase r8 = r6.delegate
            android.database.Cursor r7 = r8.query(r7)
            return r7
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @org.jetbrains.annotations.NotNull
    public android.database.Cursor query(@org.jetbrains.annotations.NotNull java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "query"
            kotlin.jvm.internal.g0.p(r8, r0)
            kotlinx.coroutines.r0 r1 = r7.queryCallbackScope
            androidx.room.support.QueryInterceptorDatabase$query$1 r4 = new androidx.room.support.QueryInterceptorDatabase$query$1
            r0 = 0
            r4.<init>(r7, r8, r0)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r7.delegate
            android.database.Cursor r8 = r0.query(r8)
            return r8
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @org.jetbrains.annotations.NotNull
    public android.database.Cursor query(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.Object[] r9) {
            r7 = this;
            java.lang.String r0 = "query"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "bindArgs"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.util.List r0 = kotlin.collections.n.dz(r9)
            kotlinx.coroutines.r0 r1 = r7.queryCallbackScope
            androidx.room.support.QueryInterceptorDatabase$query$2 r4 = new androidx.room.support.QueryInterceptorDatabase$query$2
            r2 = 0
            r4.<init>(r7, r8, r0, r2)
            r5 = 3
            r6 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r7.delegate
            android.database.Cursor r8 = r0.query(r8, r9)
            return r8
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setForeignKeyConstraintsEnabled(boolean r2) {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            r0.setForeignKeyConstraintsEnabled(r2)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setLocale(@org.jetbrains.annotations.NotNull java.util.Locale r2) {
            r1 = this;
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            r0.setLocale(r2)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setMaxSqlCacheSize(int r2) {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            r0.setMaxSqlCacheSize(r2)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long setMaximumSize(long r2) {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            long r2 = r0.setMaximumSize(r2)
            return r2
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setPageSize(long r2) {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            r0.setPageSize(r2)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
            r6 = this;
            kotlinx.coroutines.r0 r0 = r6.queryCallbackScope
            androidx.room.support.QueryInterceptorDatabase$setTransactionSuccessful$1 r3 = new androidx.room.support.QueryInterceptorDatabase$setTransactionSuccessful$1
            r1 = 0
            r3.<init>(r6, r1)
            r4 = 3
            r5 = 0
            r2 = 0
            kotlinx.coroutines.i.e(r0, r1, r2, r3, r4, r5)
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r6.delegate
            r0.setTransactionSuccessful()
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setVersion(int r2) {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            r0.setVersion(r2)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int update(@org.jetbrains.annotations.NotNull java.lang.String r8, int r9, @org.jetbrains.annotations.NotNull android.content.ContentValues r10, @org.jetbrains.annotations.Nullable java.lang.String r11, @org.jetbrains.annotations.Nullable java.lang.Object[] r12) {
            r7 = this;
            java.lang.String r0 = "table"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "values"
            kotlin.jvm.internal.g0.p(r10, r0)
            androidx.sqlite.db.SupportSQLiteDatabase r1 = r7.delegate
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            int r8 = r1.update(r2, r3, r4, r5, r6)
            return r8
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            boolean r0 = r0.yieldIfContendedSafely()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely(long r2) {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegate
            boolean r2 = r0.yieldIfContendedSafely(r2)
            return r2
    }
}
