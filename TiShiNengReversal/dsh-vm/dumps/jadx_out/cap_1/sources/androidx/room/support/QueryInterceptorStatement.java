package androidx.room.support;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nQueryInterceptorStatement.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueryInterceptorStatement.android.kt\nandroidx/room/support/QueryInterceptorStatement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class QueryInterceptorStatement implements androidx.sqlite.db.SupportSQLiteStatement {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Object> bindArgsCache;

    @org.jetbrains.annotations.NotNull
    private final androidx.sqlite.db.SupportSQLiteStatement delegate;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.RoomDatabase.QueryCallback queryCallback;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.r0 queryCallbackScope;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String sqlStatement;

    public QueryInterceptorStatement(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteStatement r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r4, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.QueryCallback r5) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "sqlStatement"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "queryCallbackScope"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "queryCallback"
            kotlin.jvm.internal.g0.p(r5, r0)
            r1.<init>()
            r1.delegate = r2
            r1.sqlStatement = r3
            r1.queryCallbackScope = r4
            r1.queryCallback = r5
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.bindArgsCache = r2
            return
    }

    public static final /* synthetic */ androidx.room.RoomDatabase.QueryCallback access$getQueryCallback$p(androidx.room.support.QueryInterceptorStatement r0) {
            androidx.room.RoomDatabase$QueryCallback r0 = r0.queryCallback
            return r0
    }

    public static final /* synthetic */ java.lang.String access$getSqlStatement$p(androidx.room.support.QueryInterceptorStatement r0) {
            java.lang.String r0 = r0.sqlStatement
            return r0
    }

    private final void saveArgsToCache(int r5, java.lang.Object r6) {
            r4 = this;
            int r5 = r5 + (-1)
            java.util.List<java.lang.Object> r0 = r4.bindArgsCache
            int r0 = r0.size()
            if (r5 < r0) goto L20
            java.util.List<java.lang.Object> r0 = r4.bindArgsCache
            int r0 = r0.size()
            int r0 = r5 - r0
            int r0 = r0 + 1
            r1 = 0
        L15:
            if (r1 >= r0) goto L20
            java.util.List<java.lang.Object> r2 = r4.bindArgsCache
            r3 = 0
            r2.add(r3)
            int r1 = r1 + 1
            goto L15
        L20:
            java.util.List<java.lang.Object> r0 = r4.bindArgsCache
            r0.set(r5, r6)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int r2, @org.jetbrains.annotations.NotNull byte[] r3) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.saveArgsToCache(r2, r3)
            androidx.sqlite.db.SupportSQLiteStatement r0 = r1.delegate
            r0.bindBlob(r2, r3)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int r2, double r3) {
            r1 = this;
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            r1.saveArgsToCache(r2, r0)
            androidx.sqlite.db.SupportSQLiteStatement r0 = r1.delegate
            r0.bindDouble(r2, r3)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int r2, long r3) {
            r1 = this;
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r1.saveArgsToCache(r2, r0)
            androidx.sqlite.db.SupportSQLiteStatement r0 = r1.delegate
            r0.bindLong(r2, r3)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int r2) {
            r1 = this;
            r0 = 0
            r1.saveArgsToCache(r2, r0)
            androidx.sqlite.db.SupportSQLiteStatement r0 = r1.delegate
            r0.bindNull(r2)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.saveArgsToCache(r2, r3)
            androidx.sqlite.db.SupportSQLiteStatement r0 = r1.delegate
            r0.bindString(r2, r3)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.bindArgsCache
            r0.clear()
            androidx.sqlite.db.SupportSQLiteStatement r0 = r1.delegate
            r0.clearBindings()
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteStatement r0 = r1.delegate
            r0.close()
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public void execute() {
            r7 = this;
            java.util.List<java.lang.Object> r0 = r7.bindArgsCache
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.f0.a6(r0)
            kotlinx.coroutines.r0 r1 = r7.queryCallbackScope
            androidx.room.support.QueryInterceptorStatement$execute$1 r4 = new androidx.room.support.QueryInterceptorStatement$execute$1
            r2 = 0
            r4.<init>(r7, r0, r2)
            r5 = 3
            r6 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            androidx.sqlite.db.SupportSQLiteStatement r0 = r7.delegate
            r0.execute()
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long executeInsert() {
            r7 = this;
            java.util.List<java.lang.Object> r0 = r7.bindArgsCache
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.f0.a6(r0)
            kotlinx.coroutines.r0 r1 = r7.queryCallbackScope
            androidx.room.support.QueryInterceptorStatement$executeInsert$1 r4 = new androidx.room.support.QueryInterceptorStatement$executeInsert$1
            r2 = 0
            r4.<init>(r7, r0, r2)
            r5 = 3
            r6 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            androidx.sqlite.db.SupportSQLiteStatement r0 = r7.delegate
            long r0 = r0.executeInsert()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public int executeUpdateDelete() {
            r7 = this;
            java.util.List<java.lang.Object> r0 = r7.bindArgsCache
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.f0.a6(r0)
            kotlinx.coroutines.r0 r1 = r7.queryCallbackScope
            androidx.room.support.QueryInterceptorStatement$executeUpdateDelete$1 r4 = new androidx.room.support.QueryInterceptorStatement$executeUpdateDelete$1
            r2 = 0
            r4.<init>(r7, r0, r2)
            r5 = 3
            r6 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            androidx.sqlite.db.SupportSQLiteStatement r0 = r7.delegate
            int r0 = r0.executeUpdateDelete()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long simpleQueryForLong() {
            r7 = this;
            java.util.List<java.lang.Object> r0 = r7.bindArgsCache
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.f0.a6(r0)
            kotlinx.coroutines.r0 r1 = r7.queryCallbackScope
            androidx.room.support.QueryInterceptorStatement$simpleQueryForLong$1 r4 = new androidx.room.support.QueryInterceptorStatement$simpleQueryForLong$1
            r2 = 0
            r4.<init>(r7, r0, r2)
            r5 = 3
            r6 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            androidx.sqlite.db.SupportSQLiteStatement r0 = r7.delegate
            long r0 = r0.simpleQueryForLong()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    @org.jetbrains.annotations.Nullable
    public java.lang.String simpleQueryForString() {
            r7 = this;
            java.util.List<java.lang.Object> r0 = r7.bindArgsCache
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.f0.a6(r0)
            kotlinx.coroutines.r0 r1 = r7.queryCallbackScope
            androidx.room.support.QueryInterceptorStatement$simpleQueryForString$1 r4 = new androidx.room.support.QueryInterceptorStatement$simpleQueryForString$1
            r2 = 0
            r4.<init>(r7, r0, r2)
            r5 = 3
            r6 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            androidx.sqlite.db.SupportSQLiteStatement r0 = r7.delegate
            java.lang.String r0 = r0.simpleQueryForString()
            return r0
    }
}
