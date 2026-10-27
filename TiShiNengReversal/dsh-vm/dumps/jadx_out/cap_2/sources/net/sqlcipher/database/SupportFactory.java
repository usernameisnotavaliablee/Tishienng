package net.sqlcipher.database;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class SupportFactory implements androidx.sqlite.db.SupportSQLiteOpenHelper.Factory {
    private final boolean clearPassphrase;
    private final net.sqlcipher.database.SQLiteDatabaseHook hook;
    private final byte[] passphrase;

    public SupportFactory(byte[] r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SupportFactory(byte[] r2, net.sqlcipher.database.SQLiteDatabaseHook r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    public SupportFactory(byte[] r1, net.sqlcipher.database.SQLiteDatabaseHook r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.passphrase = r1
            r0.hook = r2
            r0.clearPassphrase = r3
            return
    }

    public androidx.sqlite.db.SupportSQLiteOpenHelper create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration r5) {
            r4 = this;
            net.sqlcipher.database.SupportHelper r0 = new net.sqlcipher.database.SupportHelper
            byte[] r1 = r4.passphrase
            net.sqlcipher.database.SQLiteDatabaseHook r2 = r4.hook
            boolean r3 = r4.clearPassphrase
            r0.<init>(r5, r1, r2, r3)
            return r0
    }
}
