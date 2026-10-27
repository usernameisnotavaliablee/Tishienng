package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class SharedSQLiteStatement {

    @org.jetbrains.annotations.NotNull
    private final androidx.room.RoomDatabase database;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicBoolean lock;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s stmt$delegate;

    public SharedSQLiteStatement(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r2) {
            r1 = this;
            java.lang.String r0 = "database"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.database = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r2.<init>(r0)
            r1.lock = r2
            androidx.room.u r2 = new androidx.room.u
            r2.<init>(r1)
            kotlin.s r2 = kotlin.t.c(r2)
            r1.stmt$delegate = r2
            return
    }

    public static /* synthetic */ androidx.sqlite.db.SupportSQLiteStatement a(androidx.room.SharedSQLiteStatement r0) {
            androidx.sqlite.db.SupportSQLiteStatement r0 = stmt_delegate$lambda$0(r0)
            return r0
    }

    private final androidx.sqlite.db.SupportSQLiteStatement createNewStatement() {
            r2 = this;
            java.lang.String r0 = r2.createQuery()
            androidx.room.RoomDatabase r1 = r2.database
            androidx.sqlite.db.SupportSQLiteStatement r0 = r1.compileStatement(r0)
            return r0
    }

    private final androidx.sqlite.db.SupportSQLiteStatement getStmt() {
            r1 = this;
            kotlin.s r0 = r1.stmt$delegate
            java.lang.Object r0 = r0.getValue()
            androidx.sqlite.db.SupportSQLiteStatement r0 = (androidx.sqlite.db.SupportSQLiteStatement) r0
            return r0
    }

    private final androidx.sqlite.db.SupportSQLiteStatement getStmt(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L7
            androidx.sqlite.db.SupportSQLiteStatement r1 = r0.getStmt()
            return r1
        L7:
            androidx.sqlite.db.SupportSQLiteStatement r1 = r0.createNewStatement()
            return r1
    }

    private static final androidx.sqlite.db.SupportSQLiteStatement stmt_delegate$lambda$0(androidx.room.SharedSQLiteStatement r0) {
            androidx.sqlite.db.SupportSQLiteStatement r0 = r0.createNewStatement()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public androidx.sqlite.db.SupportSQLiteStatement acquire() {
            r3 = this;
            r3.assertNotMainThread()
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.lock
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            androidx.sqlite.db.SupportSQLiteStatement r0 = r3.getStmt(r0)
            return r0
    }

    protected void assertNotMainThread() {
            r1 = this;
            androidx.room.RoomDatabase r0 = r1.database
            r0.assertNotMainThread()
            return
    }

    @org.jetbrains.annotations.NotNull
    protected abstract java.lang.String createQuery();

    public void release(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteStatement r2) {
            r1 = this;
            java.lang.String r0 = "statement"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.sqlite.db.SupportSQLiteStatement r0 = r1.getStmt()
            if (r2 != r0) goto L11
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.lock
            r0 = 0
            r2.set(r0)
        L11:
            return
    }
}
