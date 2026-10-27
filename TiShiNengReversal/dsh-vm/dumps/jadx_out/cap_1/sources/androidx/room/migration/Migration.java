package androidx.room.migration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class Migration {

    @kotlin.jvm.JvmField
    public final int endVersion;

    @kotlin.jvm.JvmField
    public final int startVersion;

    public Migration(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.startVersion = r1
            r0.endVersion = r2
            return
    }

    public void migrate(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2) {
            r1 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2 instanceof androidx.room.driver.SupportSQLiteConnection
            if (r0 == 0) goto L13
            androidx.room.driver.SupportSQLiteConnection r2 = (androidx.room.driver.SupportSQLiteConnection) r2
            androidx.sqlite.db.SupportSQLiteDatabase r2 = r2.getDb()
            r1.migrate(r2)
            return
        L13:
            kotlin.NotImplementedError r2 = new kotlin.NotImplementedError
            java.lang.String r0 = "Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function."
            r2.<init>(r0)
            throw r2
    }

    public void migrate(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "db"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.NotImplementedError r2 = new kotlin.NotImplementedError
            java.lang.String r0 = "Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function."
            r2.<init>(r0)
            throw r2
    }
}
