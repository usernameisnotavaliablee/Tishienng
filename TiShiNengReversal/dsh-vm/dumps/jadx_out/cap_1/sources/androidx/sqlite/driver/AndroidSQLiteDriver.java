package androidx.sqlite.driver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AndroidSQLiteDriver implements androidx.sqlite.SQLiteDriver {
    public AndroidSQLiteDriver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.sqlite.SQLiteDriver
    @org.jetbrains.annotations.NotNull
    public androidx.sqlite.SQLiteConnection open(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "fileName"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r2 = android.database.sqlite.SQLiteDatabase.openOrCreateDatabase(r2, r0)
            androidx.sqlite.driver.AndroidSQLiteConnection r0 = new androidx.sqlite.driver.AndroidSQLiteConnection
            kotlin.jvm.internal.g0.m(r2)
            r0.<init>(r2)
            return r0
    }
}
