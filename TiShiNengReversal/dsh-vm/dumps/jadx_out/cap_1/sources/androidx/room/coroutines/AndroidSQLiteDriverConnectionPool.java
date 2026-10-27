package androidx.room.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AndroidSQLiteDriverConnectionPool implements androidx.room.coroutines.ConnectionPool {

    @org.jetbrains.annotations.NotNull
    private final kotlin.s androidConnection$delegate;

    @org.jetbrains.annotations.NotNull
    private final androidx.sqlite.SQLiteDriver driver;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String fileName;

    public AndroidSQLiteDriverConnectionPool(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteDriver r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "driver"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "fileName"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.driver = r2
            r1.fileName = r3
            androidx.room.coroutines.a r2 = new androidx.room.coroutines.a
            r2.<init>(r1)
            kotlin.s r2 = kotlin.t.c(r2)
            r1.androidConnection$delegate = r2
            return
    }

    public static /* synthetic */ androidx.room.coroutines.AndroidSQLiteDriverPooledConnection a(androidx.room.coroutines.AndroidSQLiteDriverConnectionPool r0) {
            androidx.room.coroutines.AndroidSQLiteDriverPooledConnection r0 = androidConnection_delegate$lambda$0(r0)
            return r0
    }

    private static final androidx.room.coroutines.AndroidSQLiteDriverPooledConnection androidConnection_delegate$lambda$0(androidx.room.coroutines.AndroidSQLiteDriverConnectionPool r2) {
            androidx.room.coroutines.AndroidSQLiteDriverPooledConnection r0 = new androidx.room.coroutines.AndroidSQLiteDriverPooledConnection
            androidx.sqlite.SQLiteDriver r1 = r2.driver
            java.lang.String r2 = r2.fileName
            androidx.sqlite.SQLiteConnection r2 = r1.open(r2)
            java.lang.String r1 = "null cannot be cast to non-null type androidx.sqlite.driver.AndroidSQLiteConnection"
            kotlin.jvm.internal.g0.n(r2, r1)
            androidx.sqlite.driver.AndroidSQLiteConnection r2 = (androidx.sqlite.driver.AndroidSQLiteConnection) r2
            r0.<init>(r2)
            return r0
    }

    private final androidx.room.coroutines.AndroidSQLiteDriverPooledConnection getAndroidConnection() {
            r1 = this;
            kotlin.s r0 = r1.androidConnection$delegate
            java.lang.Object r0 = r0.getValue()
            androidx.room.coroutines.AndroidSQLiteDriverPooledConnection r0 = (androidx.room.coroutines.AndroidSQLiteDriverPooledConnection) r0
            return r0
    }

    @Override // androidx.room.coroutines.ConnectionPool, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            androidx.room.coroutines.AndroidSQLiteDriverPooledConnection r0 = r1.getAndroidConnection()
            androidx.sqlite.driver.AndroidSQLiteConnection r0 = r0.getDelegate()
            r0.close()
            return
    }

    @Override // androidx.room.coroutines.ConnectionPool
    @org.jetbrains.annotations.Nullable
    public <R> java.lang.Object useConnection(boolean r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.room.Transactor, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r3) {
            r0 = this;
            androidx.room.coroutines.AndroidSQLiteDriverPooledConnection r1 = r0.getAndroidConnection()
            java.lang.Object r1 = r2.invoke(r1, r3)
            return r1
    }
}
