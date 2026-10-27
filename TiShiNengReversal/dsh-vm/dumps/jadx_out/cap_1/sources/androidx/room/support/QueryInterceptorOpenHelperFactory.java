package androidx.room.support;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class QueryInterceptorOpenHelperFactory implements androidx.sqlite.db.SupportSQLiteOpenHelper.Factory {

    @org.jetbrains.annotations.NotNull
    private final androidx.sqlite.db.SupportSQLiteOpenHelper.Factory delegate;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.RoomDatabase.QueryCallback queryCallback;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.r0 queryCallbackScope;

    public QueryInterceptorOpenHelperFactory(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r3, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.QueryCallback r4) {
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

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    @org.jetbrains.annotations.NotNull
    public androidx.sqlite.db.SupportSQLiteOpenHelper create(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration r4) {
            r3 = this;
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.room.support.QueryInterceptorOpenHelper r0 = new androidx.room.support.QueryInterceptorOpenHelper
            androidx.sqlite.db.SupportSQLiteOpenHelper$Factory r1 = r3.delegate
            androidx.sqlite.db.SupportSQLiteOpenHelper r4 = r1.create(r4)
            kotlinx.coroutines.r0 r1 = r3.queryCallbackScope
            androidx.room.RoomDatabase$QueryCallback r2 = r3.queryCallback
            r0.<init>(r4, r1, r2)
            return r0
    }
}
