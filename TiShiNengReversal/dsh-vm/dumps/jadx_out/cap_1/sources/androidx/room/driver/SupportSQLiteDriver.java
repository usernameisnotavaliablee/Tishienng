package androidx.room.driver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SupportSQLiteDriver implements androidx.sqlite.SQLiteDriver {

    @org.jetbrains.annotations.NotNull
    private final androidx.sqlite.db.SupportSQLiteOpenHelper openHelper;

    public SupportSQLiteDriver(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper r2) {
            r1 = this;
            java.lang.String r0 = "openHelper"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.openHelper = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.sqlite.db.SupportSQLiteOpenHelper getOpenHelper() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.openHelper
            return r0
    }

    @Override // androidx.sqlite.SQLiteDriver
    @org.jetbrains.annotations.NotNull
    public androidx.room.driver.SupportSQLiteConnection open(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "fileName"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.room.driver.SupportSQLiteConnection r2 = new androidx.room.driver.SupportSQLiteConnection
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.openHelper
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getWritableDatabase()
            r2.<init>(r0)
            return r2
    }

    @Override // androidx.sqlite.SQLiteDriver
    public /* bridge */ /* synthetic */ androidx.sqlite.SQLiteConnection open(java.lang.String r1) {
            r0 = this;
            androidx.room.driver.SupportSQLiteConnection r1 = r0.open(r1)
            return r1
    }
}
