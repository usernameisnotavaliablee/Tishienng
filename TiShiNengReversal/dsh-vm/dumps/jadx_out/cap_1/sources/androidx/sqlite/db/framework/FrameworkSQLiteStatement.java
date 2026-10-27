package androidx.sqlite.db.framework;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FrameworkSQLiteStatement extends androidx.sqlite.db.framework.FrameworkSQLiteProgram implements androidx.sqlite.db.SupportSQLiteStatement {

    @org.jetbrains.annotations.NotNull
    private final android.database.sqlite.SQLiteStatement delegate;

    public FrameworkSQLiteStatement(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteStatement r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>(r2)
            r1.delegate = r2
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public void execute() {
            r1 = this;
            android.database.sqlite.SQLiteStatement r0 = r1.delegate
            r0.execute()
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long executeInsert() {
            r2 = this;
            android.database.sqlite.SQLiteStatement r0 = r2.delegate
            long r0 = r0.executeInsert()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public int executeUpdateDelete() {
            r1 = this;
            android.database.sqlite.SQLiteStatement r0 = r1.delegate
            int r0 = r0.executeUpdateDelete()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long simpleQueryForLong() {
            r2 = this;
            android.database.sqlite.SQLiteStatement r0 = r2.delegate
            long r0 = r0.simpleQueryForLong()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    @org.jetbrains.annotations.Nullable
    public java.lang.String simpleQueryForString() {
            r1 = this;
            android.database.sqlite.SQLiteStatement r0 = r1.delegate
            java.lang.String r0 = r0.simpleQueryForString()
            return r0
    }
}
