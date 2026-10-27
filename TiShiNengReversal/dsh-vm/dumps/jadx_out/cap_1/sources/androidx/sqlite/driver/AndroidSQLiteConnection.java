package androidx.sqlite.driver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AndroidSQLiteConnection implements androidx.sqlite.SQLiteConnection {

    @org.jetbrains.annotations.NotNull
    private final android.database.sqlite.SQLiteDatabase db;

    public AndroidSQLiteConnection(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteDatabase r2) {
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
            android.database.sqlite.SQLiteDatabase r0 = r1.db
            r0.close()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final android.database.sqlite.SQLiteDatabase getDb() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.db
            return r0
    }

    @Override // androidx.sqlite.SQLiteConnection
    @org.jetbrains.annotations.NotNull
    public androidx.sqlite.SQLiteStatement prepare(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "sql"
            kotlin.jvm.internal.g0.p(r3, r0)
            android.database.sqlite.SQLiteDatabase r0 = r2.db
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L16
            androidx.sqlite.driver.AndroidSQLiteStatement$Companion r0 = androidx.sqlite.driver.AndroidSQLiteStatement.Companion
            android.database.sqlite.SQLiteDatabase r1 = r2.db
            androidx.sqlite.driver.AndroidSQLiteStatement r3 = r0.create(r1, r3)
            return r3
        L16:
            r3 = 21
            java.lang.String r0 = "connection is closed"
            androidx.sqlite.SQLite.throwSQLiteException(r3, r0)
            kotlin.KotlinNothingValueException r3 = new kotlin.KotlinNothingValueException
            r3.<init>()
            throw r3
    }
}
