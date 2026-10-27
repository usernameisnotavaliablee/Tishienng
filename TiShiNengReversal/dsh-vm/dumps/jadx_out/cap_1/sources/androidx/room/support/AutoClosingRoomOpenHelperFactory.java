package androidx.room.support;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AutoClosingRoomOpenHelperFactory implements androidx.sqlite.db.SupportSQLiteOpenHelper.Factory {

    @org.jetbrains.annotations.NotNull
    private final androidx.room.support.AutoCloser autoCloser;

    @org.jetbrains.annotations.NotNull
    private final androidx.sqlite.db.SupportSQLiteOpenHelper.Factory delegate;

    public AutoClosingRoomOpenHelperFactory(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r2, @org.jetbrains.annotations.NotNull androidx.room.support.AutoCloser r3) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "autoCloser"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.delegate = r2
            r1.autoCloser = r3
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    @org.jetbrains.annotations.NotNull
    public androidx.room.support.AutoClosingRoomOpenHelper create(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration r3) {
            r2 = this;
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.room.support.AutoClosingRoomOpenHelper r0 = new androidx.room.support.AutoClosingRoomOpenHelper
            androidx.sqlite.db.SupportSQLiteOpenHelper$Factory r1 = r2.delegate
            androidx.sqlite.db.SupportSQLiteOpenHelper r3 = r1.create(r3)
            androidx.room.support.AutoCloser r1 = r2.autoCloser
            r0.<init>(r3, r1)
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public /* bridge */ /* synthetic */ androidx.sqlite.db.SupportSQLiteOpenHelper create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration r1) {
            r0 = this;
            androidx.room.support.AutoClosingRoomOpenHelper r1 = r0.create(r1)
            return r1
    }
}
