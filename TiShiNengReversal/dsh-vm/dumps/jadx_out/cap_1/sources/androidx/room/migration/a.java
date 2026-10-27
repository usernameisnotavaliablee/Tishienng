package androidx.room.migration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final /* synthetic */ class a {
    public static void a(androidx.room.migration.AutoMigrationSpec r1, @org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2) {
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2 instanceof androidx.room.driver.SupportSQLiteConnection
            if (r0 == 0) goto L12
            androidx.room.driver.SupportSQLiteConnection r2 = (androidx.room.driver.SupportSQLiteConnection) r2
            androidx.sqlite.db.SupportSQLiteDatabase r2 = r2.getDb()
            r1.onPostMigrate(r2)
        L12:
            return
    }

    public static void b(androidx.room.migration.AutoMigrationSpec r0, @org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r1) {
            java.lang.String r0 = "db"
            kotlin.jvm.internal.g0.p(r1, r0)
            return
    }
}
