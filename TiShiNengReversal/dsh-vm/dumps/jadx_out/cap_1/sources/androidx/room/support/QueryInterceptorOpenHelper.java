package androidx.room.support;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class QueryInterceptorOpenHelper implements androidx.sqlite.db.SupportSQLiteOpenHelper, androidx.room.DelegatingOpenHelper {

    @org.jetbrains.annotations.NotNull
    private final androidx.sqlite.db.SupportSQLiteOpenHelper delegate;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.RoomDatabase.QueryCallback queryCallback;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.r0 queryCallbackScope;

    public QueryInterceptorOpenHelper(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r3, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.QueryCallback r4) {
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

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.delegate
            r0.close()
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @org.jetbrains.annotations.Nullable
    public java.lang.String getDatabaseName() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.delegate
            java.lang.String r0 = r0.getDatabaseName()
            return r0
    }

    @Override // androidx.room.DelegatingOpenHelper
    @org.jetbrains.annotations.NotNull
    public androidx.sqlite.db.SupportSQLiteOpenHelper getDelegate() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.delegate
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @org.jetbrains.annotations.NotNull
    public androidx.sqlite.db.SupportSQLiteDatabase getReadableDatabase() {
            r4 = this;
            androidx.room.support.QueryInterceptorDatabase r0 = new androidx.room.support.QueryInterceptorDatabase
            androidx.sqlite.db.SupportSQLiteOpenHelper r1 = r4.getDelegate()
            androidx.sqlite.db.SupportSQLiteDatabase r1 = r1.getReadableDatabase()
            kotlinx.coroutines.r0 r2 = r4.queryCallbackScope
            androidx.room.RoomDatabase$QueryCallback r3 = r4.queryCallback
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @org.jetbrains.annotations.NotNull
    public androidx.sqlite.db.SupportSQLiteDatabase getWritableDatabase() {
            r4 = this;
            androidx.room.support.QueryInterceptorDatabase r0 = new androidx.room.support.QueryInterceptorDatabase
            androidx.sqlite.db.SupportSQLiteOpenHelper r1 = r4.getDelegate()
            androidx.sqlite.db.SupportSQLiteDatabase r1 = r1.getWritableDatabase()
            kotlinx.coroutines.r0 r2 = r4.queryCallbackScope
            androidx.room.RoomDatabase$QueryCallback r3 = r4.queryCallback
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean r2) {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.delegate
            r0.setWriteAheadLoggingEnabled(r2)
            return
    }
}
