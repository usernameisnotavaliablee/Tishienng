package androidx.room.driver;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SupportSQLiteConnectionPool implements androidx.room.coroutines.ConnectionPool {

    @org.jetbrains.annotations.NotNull
    private final androidx.room.driver.SupportSQLiteDriver supportDriver;

    public SupportSQLiteConnectionPool(@org.jetbrains.annotations.NotNull androidx.room.driver.SupportSQLiteDriver r2) {
            r1 = this;
            java.lang.String r0 = "supportDriver"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.supportDriver = r2
            return
    }

    private final androidx.room.driver.SupportSQLitePooledConnection getSupportConnection() {
            r3 = this;
            androidx.room.driver.SupportSQLiteDriver r0 = r3.supportDriver
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r0.getOpenHelper()
            java.lang.String r0 = r0.getDatabaseName()
            if (r0 != 0) goto Le
            java.lang.String r0 = ":memory:"
        Le:
            androidx.room.driver.SupportSQLitePooledConnection r1 = new androidx.room.driver.SupportSQLitePooledConnection
            androidx.room.driver.SupportSQLiteDriver r2 = r3.supportDriver
            androidx.room.driver.SupportSQLiteConnection r0 = r2.open(r0)
            r1.<init>(r0)
            return r1
    }

    @Override // androidx.room.coroutines.ConnectionPool, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            androidx.room.driver.SupportSQLiteDriver r0 = r1.supportDriver
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r0.getOpenHelper()
            r0.close()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.room.driver.SupportSQLiteDriver getSupportDriver$room_runtime_release() {
            r1 = this;
            androidx.room.driver.SupportSQLiteDriver r0 = r1.supportDriver
            return r0
    }

    @Override // androidx.room.coroutines.ConnectionPool
    @org.jetbrains.annotations.Nullable
    public <R> java.lang.Object useConnection(boolean r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.room.Transactor, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r3) {
            r0 = this;
            androidx.room.driver.SupportSQLitePooledConnection r1 = r0.getSupportConnection()
            java.lang.Object r1 = r2.invoke(r1, r3)
            return r1
    }
}
