package androidx.sqlite.db.framework;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class FrameworkSQLiteProgram implements androidx.sqlite.db.SupportSQLiteProgram {

    @org.jetbrains.annotations.NotNull
    private final android.database.sqlite.SQLiteProgram delegate;

    public FrameworkSQLiteProgram(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteProgram r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.delegate = r2
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int r2, @org.jetbrains.annotations.NotNull byte[] r3) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r3, r0)
            android.database.sqlite.SQLiteProgram r0 = r1.delegate
            r0.bindBlob(r2, r3)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int r2, double r3) {
            r1 = this;
            android.database.sqlite.SQLiteProgram r0 = r1.delegate
            r0.bindDouble(r2, r3)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int r2, long r3) {
            r1 = this;
            android.database.sqlite.SQLiteProgram r0 = r1.delegate
            r0.bindLong(r2, r3)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int r2) {
            r1 = this;
            android.database.sqlite.SQLiteProgram r0 = r1.delegate
            r0.bindNull(r2)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r3, r0)
            android.database.sqlite.SQLiteProgram r0 = r1.delegate
            r0.bindString(r2, r3)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
            r1 = this;
            android.database.sqlite.SQLiteProgram r0 = r1.delegate
            r0.clearBindings()
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            android.database.sqlite.SQLiteProgram r0 = r1.delegate
            r0.close()
            return
    }
}
