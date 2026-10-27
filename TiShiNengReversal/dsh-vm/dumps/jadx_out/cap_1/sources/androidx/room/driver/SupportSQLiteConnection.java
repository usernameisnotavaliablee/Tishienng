package androidx.room.driver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SupportSQLiteConnection implements androidx.sqlite.SQLiteConnection {

    @org.jetbrains.annotations.NotNull
    private final androidx.sqlite.db.SupportSQLiteDatabase db;

    public SupportSQLiteConnection(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "db"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.db = r2
            return
    }

    @Override // androidx.sqlite.SQLiteConnection, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.db
            r0.close()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.sqlite.db.SupportSQLiteDatabase getDb() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.db
            return r0
    }

    @Override // androidx.sqlite.SQLiteConnection
    @org.jetbrains.annotations.NotNull
    public androidx.room.driver.SupportSQLiteStatement prepare(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "sql"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.room.driver.SupportSQLiteStatement$Companion r0 = androidx.room.driver.SupportSQLiteStatement.Companion
            androidx.sqlite.db.SupportSQLiteDatabase r1 = r2.db
            androidx.room.driver.SupportSQLiteStatement r3 = r0.create(r1, r3)
            return r3
    }

    @Override // androidx.sqlite.SQLiteConnection
    public /* bridge */ /* synthetic */ androidx.sqlite.SQLiteStatement prepare(java.lang.String r1) {
            r0 = this;
            androidx.room.driver.SupportSQLiteStatement r1 = r0.prepare(r1)
            return r1
    }
}
