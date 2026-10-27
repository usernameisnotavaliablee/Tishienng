package androidx.room.migration;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class MigrationImpl extends androidx.room.migration.Migration {

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, kotlin.n1> migrateCallback;

    public MigrationImpl(int r2, int r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.sqlite.db.SupportSQLiteDatabase, kotlin.n1> r4) {
            r1 = this;
            java.lang.String r0 = "migrateCallback"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>(r2, r3)
            r1.migrateCallback = r4
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, kotlin.n1> getMigrateCallback() {
            r1 = this;
            kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, kotlin.n1> r0 = r1.migrateCallback
            return r0
    }

    @Override // androidx.room.migration.Migration
    public void migrate(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "db"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, kotlin.n1> r0 = r1.migrateCallback
            r0.invoke(r2)
            return
    }
}
