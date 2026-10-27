package androidx.room.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nConnectionPoolImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/PooledConnectionImpl\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,556:1\n481#1,11:557\n481#1,11:578\n481#1,11:589\n120#2,8:568\n129#2:577\n120#2,10:600\n120#2,10:610\n1#3:576\n*S KotlinDebug\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/PooledConnectionImpl\n*L\n360#1:557,11\n369#1:578,11\n371#1:589,11\n361#1:568,8\n361#1:577\n420#1:600,10\n437#1:610,10\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class PooledConnectionImpl implements androidx.room.Transactor, androidx.room.coroutines.RawConnectionAccessor {

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicBoolean _isRecycled;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.coroutines.ConnectionWithLock delegate;
    private final boolean isReadOnly;

    @org.jetbrains.annotations.NotNull
    private final kotlin.collections.m<androidx.room.coroutines.PooledConnectionImpl.TransactionItem> transactionStack;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nConnectionPoolImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/PooledConnectionImpl$StatementWrapper\n*L\n1#1,556:1\n543#1,10:557\n543#1,10:567\n543#1,10:577\n543#1,10:587\n543#1,10:597\n543#1,10:607\n543#1,10:617\n543#1,10:627\n543#1,10:637\n543#1,10:647\n543#1,10:657\n543#1,10:667\n543#1,10:677\n543#1,10:687\n543#1,10:697\n543#1,10:707\n543#1,10:717\n*S KotlinDebug\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/PooledConnectionImpl$StatementWrapper\n*L\n500#1:557,10\n504#1:567,10\n508#1:577,10\n512#1:587,10\n516#1:597,10\n518#1:607,10\n520#1:617,10\n522#1:627,10\n524#1:637,10\n526#1:647,10\n528#1:657,10\n530#1:667,10\n532#1:677,10\n534#1:687,10\n536#1:697,10\n538#1:707,10\n540#1:717,10\n*E\n"})
    private final class StatementWrapper implements androidx.sqlite.SQLiteStatement {

        @org.jetbrains.annotations.NotNull
        private final androidx.sqlite.SQLiteStatement delegate;
        final /* synthetic */ androidx.room.coroutines.PooledConnectionImpl this$0;
        private final long threadId;

        public StatementWrapper(@org.jetbrains.annotations.NotNull androidx.room.coroutines.PooledConnectionImpl r2, androidx.sqlite.SQLiteStatement r3) {
                r1 = this;
                java.lang.String r0 = "delegate"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.this$0 = r2
                r1.<init>()
                r1.delegate = r3
                long r2 = androidx.room.concurrent.ThreadLocal_jvmAndroidKt.currentThreadId()
                r1.threadId = r2
                return
        }

        private final <R> R withStateCheck(kotlin.jvm.functions.Function0<? extends R> r7) {
                r6 = this;
                androidx.room.coroutines.PooledConnectionImpl r0 = r6.this$0
                boolean r0 = androidx.room.coroutines.PooledConnectionImpl.access$isRecycled(r0)
                r1 = 21
                if (r0 != 0) goto L24
                long r2 = r6.threadId
                long r4 = androidx.room.concurrent.ThreadLocal_jvmAndroidKt.currentThreadId()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L19
                java.lang.Object r7 = r7.invoke()
                return r7
            L19:
                java.lang.String r7 = "Attempted to use statement on a different thread"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
            L24:
                java.lang.String r7 = "Statement is recycled"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindBlob */
        public void mo84bindBlob(int r7, @org.jetbrains.annotations.NotNull byte[] r8) {
                r6 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r8, r0)
                androidx.room.coroutines.PooledConnectionImpl r0 = r6.this$0
                boolean r0 = androidx.room.coroutines.PooledConnectionImpl.access$isRecycled(r0)
                r1 = 21
                if (r0 != 0) goto L2b
                long r2 = r6.threadId
                long r4 = androidx.room.concurrent.ThreadLocal_jvmAndroidKt.currentThreadId()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L20
                androidx.sqlite.SQLiteStatement r0 = r6.delegate
                r0.mo84bindBlob(r7, r8)
                return
            L20:
                java.lang.String r7 = "Attempted to use statement on a different thread"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
            L2b:
                java.lang.String r7 = "Statement is recycled"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
        }

        @Override // androidx.sqlite.SQLiteStatement
        public /* synthetic */ void bindBoolean(int r1, boolean r2) {
                r0 = this;
                f.a.a(r0, r1, r2)
                return
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindDouble */
        public void mo85bindDouble(int r7, double r8) {
                r6 = this;
                androidx.room.coroutines.PooledConnectionImpl r0 = r6.this$0
                boolean r0 = androidx.room.coroutines.PooledConnectionImpl.access$isRecycled(r0)
                r1 = 21
                if (r0 != 0) goto L25
                long r2 = r6.threadId
                long r4 = androidx.room.concurrent.ThreadLocal_jvmAndroidKt.currentThreadId()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L1a
                androidx.sqlite.SQLiteStatement r0 = r6.delegate
                r0.mo85bindDouble(r7, r8)
                return
            L1a:
                java.lang.String r7 = "Attempted to use statement on a different thread"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
            L25:
                java.lang.String r7 = "Statement is recycled"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
        }

        @Override // androidx.sqlite.SQLiteStatement
        public /* synthetic */ void bindFloat(int r1, float r2) {
                r0 = this;
                f.a.b(r0, r1, r2)
                return
        }

        @Override // androidx.sqlite.SQLiteStatement
        public /* synthetic */ void bindInt(int r1, int r2) {
                r0 = this;
                f.a.c(r0, r1, r2)
                return
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindLong */
        public void mo86bindLong(int r7, long r8) {
                r6 = this;
                androidx.room.coroutines.PooledConnectionImpl r0 = r6.this$0
                boolean r0 = androidx.room.coroutines.PooledConnectionImpl.access$isRecycled(r0)
                r1 = 21
                if (r0 != 0) goto L25
                long r2 = r6.threadId
                long r4 = androidx.room.concurrent.ThreadLocal_jvmAndroidKt.currentThreadId()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L1a
                androidx.sqlite.SQLiteStatement r0 = r6.delegate
                r0.mo86bindLong(r7, r8)
                return
            L1a:
                java.lang.String r7 = "Attempted to use statement on a different thread"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
            L25:
                java.lang.String r7 = "Statement is recycled"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindNull */
        public void mo87bindNull(int r7) {
                r6 = this;
                androidx.room.coroutines.PooledConnectionImpl r0 = r6.this$0
                boolean r0 = androidx.room.coroutines.PooledConnectionImpl.access$isRecycled(r0)
                r1 = 21
                if (r0 != 0) goto L25
                long r2 = r6.threadId
                long r4 = androidx.room.concurrent.ThreadLocal_jvmAndroidKt.currentThreadId()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L1a
                androidx.sqlite.SQLiteStatement r0 = r6.delegate
                r0.mo87bindNull(r7)
                return
            L1a:
                java.lang.String r7 = "Attempted to use statement on a different thread"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
            L25:
                java.lang.String r7 = "Statement is recycled"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindText */
        public void mo88bindText(int r7, @org.jetbrains.annotations.NotNull java.lang.String r8) {
                r6 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r8, r0)
                androidx.room.coroutines.PooledConnectionImpl r0 = r6.this$0
                boolean r0 = androidx.room.coroutines.PooledConnectionImpl.access$isRecycled(r0)
                r1 = 21
                if (r0 != 0) goto L2b
                long r2 = r6.threadId
                long r4 = androidx.room.concurrent.ThreadLocal_jvmAndroidKt.currentThreadId()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L20
                androidx.sqlite.SQLiteStatement r0 = r6.delegate
                r0.mo88bindText(r7, r8)
                return
            L20:
                java.lang.String r7 = "Attempted to use statement on a different thread"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
            L2b:
                java.lang.String r7 = "Statement is recycled"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: clearBindings */
        public void mo89clearBindings() {
                r6 = this;
                androidx.room.coroutines.PooledConnectionImpl r0 = r6.this$0
                boolean r0 = androidx.room.coroutines.PooledConnectionImpl.access$isRecycled(r0)
                r1 = 21
                if (r0 != 0) goto L25
                long r2 = r6.threadId
                long r4 = androidx.room.concurrent.ThreadLocal_jvmAndroidKt.currentThreadId()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L1a
                androidx.sqlite.SQLiteStatement r0 = r6.delegate
                r0.mo89clearBindings()
                return
            L1a:
                java.lang.String r0 = "Attempted to use statement on a different thread"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r0)
                kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
                r0.<init>()
                throw r0
            L25:
                java.lang.String r0 = "Statement is recycled"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r0)
                kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
                r0.<init>()
                throw r0
        }

        @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
        public void close() {
                r6 = this;
                androidx.room.coroutines.PooledConnectionImpl r0 = r6.this$0
                boolean r0 = androidx.room.coroutines.PooledConnectionImpl.access$isRecycled(r0)
                r1 = 21
                if (r0 != 0) goto L25
                long r2 = r6.threadId
                long r4 = androidx.room.concurrent.ThreadLocal_jvmAndroidKt.currentThreadId()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L1a
                androidx.sqlite.SQLiteStatement r0 = r6.delegate
                r0.close()
                return
            L1a:
                java.lang.String r0 = "Attempted to use statement on a different thread"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r0)
                kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
                r0.<init>()
                throw r0
            L25:
                java.lang.String r0 = "Statement is recycled"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r0)
                kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
                r0.<init>()
                throw r0
        }

        @Override // androidx.sqlite.SQLiteStatement
        @org.jetbrains.annotations.NotNull
        public byte[] getBlob(int r7) {
                r6 = this;
                androidx.room.coroutines.PooledConnectionImpl r0 = r6.this$0
                boolean r0 = androidx.room.coroutines.PooledConnectionImpl.access$isRecycled(r0)
                r1 = 21
                if (r0 != 0) goto L26
                long r2 = r6.threadId
                long r4 = androidx.room.concurrent.ThreadLocal_jvmAndroidKt.currentThreadId()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L1b
                androidx.sqlite.SQLiteStatement r0 = r6.delegate
                byte[] r7 = r0.getBlob(r7)
                return r7
            L1b:
                java.lang.String r7 = "Attempted to use statement on a different thread"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
            L26:
                java.lang.String r7 = "Statement is recycled"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
        }

        @Override // androidx.sqlite.SQLiteStatement
        public /* synthetic */ boolean getBoolean(int r1) {
                r0 = this;
                boolean r1 = f.a.d(r0, r1)
                return r1
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnCount() {
                r6 = this;
                androidx.room.coroutines.PooledConnectionImpl r0 = r6.this$0
                boolean r0 = androidx.room.coroutines.PooledConnectionImpl.access$isRecycled(r0)
                r1 = 21
                if (r0 != 0) goto L26
                long r2 = r6.threadId
                long r4 = androidx.room.concurrent.ThreadLocal_jvmAndroidKt.currentThreadId()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L1b
                androidx.sqlite.SQLiteStatement r0 = r6.delegate
                int r0 = r0.getColumnCount()
                return r0
            L1b:
                java.lang.String r0 = "Attempted to use statement on a different thread"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r0)
                kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
                r0.<init>()
                throw r0
            L26:
                java.lang.String r0 = "Statement is recycled"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r0)
                kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
                r0.<init>()
                throw r0
        }

        @Override // androidx.sqlite.SQLiteStatement
        @org.jetbrains.annotations.NotNull
        public java.lang.String getColumnName(int r7) {
                r6 = this;
                androidx.room.coroutines.PooledConnectionImpl r0 = r6.this$0
                boolean r0 = androidx.room.coroutines.PooledConnectionImpl.access$isRecycled(r0)
                r1 = 21
                if (r0 != 0) goto L26
                long r2 = r6.threadId
                long r4 = androidx.room.concurrent.ThreadLocal_jvmAndroidKt.currentThreadId()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L1b
                androidx.sqlite.SQLiteStatement r0 = r6.delegate
                java.lang.String r7 = r0.getColumnName(r7)
                return r7
            L1b:
                java.lang.String r7 = "Attempted to use statement on a different thread"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
            L26:
                java.lang.String r7 = "Statement is recycled"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
        }

        @Override // androidx.sqlite.SQLiteStatement
        public /* synthetic */ java.util.List getColumnNames() {
                r1 = this;
                java.util.List r0 = f.a.e(r1)
                return r0
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnType(int r7) {
                r6 = this;
                androidx.room.coroutines.PooledConnectionImpl r0 = r6.this$0
                boolean r0 = androidx.room.coroutines.PooledConnectionImpl.access$isRecycled(r0)
                r1 = 21
                if (r0 != 0) goto L26
                long r2 = r6.threadId
                long r4 = androidx.room.concurrent.ThreadLocal_jvmAndroidKt.currentThreadId()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L1b
                androidx.sqlite.SQLiteStatement r0 = r6.delegate
                int r7 = r0.getColumnType(r7)
                return r7
            L1b:
                java.lang.String r7 = "Attempted to use statement on a different thread"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
            L26:
                java.lang.String r7 = "Statement is recycled"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
        }

        @Override // androidx.sqlite.SQLiteStatement
        public double getDouble(int r7) {
                r6 = this;
                androidx.room.coroutines.PooledConnectionImpl r0 = r6.this$0
                boolean r0 = androidx.room.coroutines.PooledConnectionImpl.access$isRecycled(r0)
                r1 = 21
                if (r0 != 0) goto L26
                long r2 = r6.threadId
                long r4 = androidx.room.concurrent.ThreadLocal_jvmAndroidKt.currentThreadId()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L1b
                androidx.sqlite.SQLiteStatement r0 = r6.delegate
                double r0 = r0.getDouble(r7)
                return r0
            L1b:
                java.lang.String r7 = "Attempted to use statement on a different thread"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
            L26:
                java.lang.String r7 = "Statement is recycled"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
        }

        @Override // androidx.sqlite.SQLiteStatement
        public /* synthetic */ float getFloat(int r1) {
                r0 = this;
                float r1 = f.a.f(r0, r1)
                return r1
        }

        @Override // androidx.sqlite.SQLiteStatement
        public /* synthetic */ int getInt(int r1) {
                r0 = this;
                int r1 = f.a.g(r0, r1)
                return r1
        }

        @Override // androidx.sqlite.SQLiteStatement
        public long getLong(int r7) {
                r6 = this;
                androidx.room.coroutines.PooledConnectionImpl r0 = r6.this$0
                boolean r0 = androidx.room.coroutines.PooledConnectionImpl.access$isRecycled(r0)
                r1 = 21
                if (r0 != 0) goto L26
                long r2 = r6.threadId
                long r4 = androidx.room.concurrent.ThreadLocal_jvmAndroidKt.currentThreadId()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L1b
                androidx.sqlite.SQLiteStatement r0 = r6.delegate
                long r0 = r0.getLong(r7)
                return r0
            L1b:
                java.lang.String r7 = "Attempted to use statement on a different thread"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
            L26:
                java.lang.String r7 = "Statement is recycled"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
        }

        @Override // androidx.sqlite.SQLiteStatement
        @org.jetbrains.annotations.NotNull
        public java.lang.String getText(int r7) {
                r6 = this;
                androidx.room.coroutines.PooledConnectionImpl r0 = r6.this$0
                boolean r0 = androidx.room.coroutines.PooledConnectionImpl.access$isRecycled(r0)
                r1 = 21
                if (r0 != 0) goto L26
                long r2 = r6.threadId
                long r4 = androidx.room.concurrent.ThreadLocal_jvmAndroidKt.currentThreadId()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L1b
                androidx.sqlite.SQLiteStatement r0 = r6.delegate
                java.lang.String r7 = r0.getText(r7)
                return r7
            L1b:
                java.lang.String r7 = "Attempted to use statement on a different thread"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
            L26:
                java.lang.String r7 = "Statement is recycled"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean isNull(int r7) {
                r6 = this;
                androidx.room.coroutines.PooledConnectionImpl r0 = r6.this$0
                boolean r0 = androidx.room.coroutines.PooledConnectionImpl.access$isRecycled(r0)
                r1 = 21
                if (r0 != 0) goto L26
                long r2 = r6.threadId
                long r4 = androidx.room.concurrent.ThreadLocal_jvmAndroidKt.currentThreadId()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L1b
                androidx.sqlite.SQLiteStatement r0 = r6.delegate
                boolean r7 = r0.isNull(r7)
                return r7
            L1b:
                java.lang.String r7 = "Attempted to use statement on a different thread"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
            L26:
                java.lang.String r7 = "Statement is recycled"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r7)
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void reset() {
                r6 = this;
                androidx.room.coroutines.PooledConnectionImpl r0 = r6.this$0
                boolean r0 = androidx.room.coroutines.PooledConnectionImpl.access$isRecycled(r0)
                r1 = 21
                if (r0 != 0) goto L25
                long r2 = r6.threadId
                long r4 = androidx.room.concurrent.ThreadLocal_jvmAndroidKt.currentThreadId()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L1a
                androidx.sqlite.SQLiteStatement r0 = r6.delegate
                r0.reset()
                return
            L1a:
                java.lang.String r0 = "Attempted to use statement on a different thread"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r0)
                kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
                r0.<init>()
                throw r0
            L25:
                java.lang.String r0 = "Statement is recycled"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r0)
                kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
                r0.<init>()
                throw r0
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean step() {
                r6 = this;
                androidx.room.coroutines.PooledConnectionImpl r0 = r6.this$0
                boolean r0 = androidx.room.coroutines.PooledConnectionImpl.access$isRecycled(r0)
                r1 = 21
                if (r0 != 0) goto L26
                long r2 = r6.threadId
                long r4 = androidx.room.concurrent.ThreadLocal_jvmAndroidKt.currentThreadId()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L1b
                androidx.sqlite.SQLiteStatement r0 = r6.delegate
                boolean r0 = r0.step()
                return r0
            L1b:
                java.lang.String r0 = "Attempted to use statement on a different thread"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r0)
                kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
                r0.<init>()
                throw r0
            L26:
                java.lang.String r0 = "Statement is recycled"
                androidx.sqlite.SQLite.throwSQLiteException(r1, r0)
                kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
                r0.<init>()
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nConnectionPoolImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/PooledConnectionImpl$TransactionImpl\n+ 2 ConnectionPoolImpl.kt\nandroidx/room/coroutines/PooledConnectionImpl\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,556:1\n481#2,11:557\n481#2,11:568\n120#3,10:579\n*S KotlinDebug\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/PooledConnectionImpl$TransactionImpl\n*L\n469#1:557,11\n471#1:568,11\n475#1:579,10\n*E\n"})
    private final class TransactionImpl<T> implements androidx.room.TransactionScope<T>, androidx.room.coroutines.RawConnectionAccessor {
        final /* synthetic */ androidx.room.coroutines.PooledConnectionImpl this$0;

        public TransactionImpl(androidx.room.coroutines.PooledConnectionImpl r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.room.coroutines.RawConnectionAccessor
        @org.jetbrains.annotations.NotNull
        public androidx.sqlite.SQLiteConnection getRawConnection() {
                r1 = this;
                androidx.room.coroutines.PooledConnectionImpl r0 = r1.this$0
                androidx.sqlite.SQLiteConnection r0 = r0.getRawConnection()
                return r0
        }

        @Override // androidx.room.TransactionScope
        @org.jetbrains.annotations.Nullable
        public java.lang.Object rollback(T r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r9) {
                r7 = this;
                boolean r0 = r9 instanceof androidx.room.coroutines.PooledConnectionImpl$TransactionImpl$rollback$1
                if (r0 == 0) goto L13
                r0 = r9
                androidx.room.coroutines.PooledConnectionImpl$TransactionImpl$rollback$1 r0 = (androidx.room.coroutines.PooledConnectionImpl$TransactionImpl$rollback$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.room.coroutines.PooledConnectionImpl$TransactionImpl$rollback$1 r0 = new androidx.room.coroutines.PooledConnectionImpl$TransactionImpl$rollback$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L3c
                if (r2 == r3) goto L2e
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L2e:
                java.lang.Object r8 = r0.L$2
                kotlinx.coroutines.sync.a r8 = (kotlinx.coroutines.sync.a) r8
                java.lang.Object r1 = r0.L$1
                androidx.room.coroutines.PooledConnectionImpl r1 = (androidx.room.coroutines.PooledConnectionImpl) r1
                java.lang.Object r0 = r0.L$0
                kotlin.g0.n(r9)
                goto L7d
            L3c:
                kotlin.g0.n(r9)
                androidx.room.coroutines.PooledConnectionImpl r9 = r7.this$0
                boolean r2 = androidx.room.coroutines.PooledConnectionImpl.access$isRecycled(r9)
                r5 = 21
                if (r2 != 0) goto Lad
                kotlin.coroutines.i r2 = r0.getContext()
                androidx.room.coroutines.ConnectionElement$Key r6 = androidx.room.coroutines.ConnectionElement.Key
                kotlin.coroutines.i$b r2 = r2.get(r6)
                androidx.room.coroutines.ConnectionElement r2 = (androidx.room.coroutines.ConnectionElement) r2
                if (r2 == 0) goto La2
                androidx.room.coroutines.PooledConnectionImpl r2 = r2.getConnectionWrapper()
                if (r2 != r9) goto La2
                kotlin.collections.m r2 = androidx.room.coroutines.PooledConnectionImpl.access$getTransactionStack$p(r9)
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L9a
                androidx.room.coroutines.ConnectionWithLock r2 = r9.getDelegate()
                r0.L$0 = r8
                r0.L$1 = r9
                r0.L$2 = r2
                r0.label = r3
                java.lang.Object r0 = r2.lock(r4, r0)
                if (r0 != r1) goto L7a
                return r1
            L7a:
                r0 = r8
                r1 = r9
                r8 = r2
            L7d:
                kotlin.collections.m r9 = androidx.room.coroutines.PooledConnectionImpl.access$getTransactionStack$p(r1)     // Catch: java.lang.Throwable -> L95
                java.lang.Object r9 = r9.last()     // Catch: java.lang.Throwable -> L95
                androidx.room.coroutines.PooledConnectionImpl$TransactionItem r9 = (androidx.room.coroutines.PooledConnectionImpl.TransactionItem) r9     // Catch: java.lang.Throwable -> L95
                r9.setShouldRollback(r3)     // Catch: java.lang.Throwable -> L95
                kotlin.n1 r9 = kotlin.n1.a     // Catch: java.lang.Throwable -> L95
                r8.unlock(r4)
                androidx.room.coroutines.ConnectionPool$RollbackException r8 = new androidx.room.coroutines.ConnectionPool$RollbackException
                r8.<init>(r0)
                throw r8
            L95:
                r9 = move-exception
                r8.unlock(r4)
                throw r9
            L9a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "Not in a transaction"
                r8.<init>(r9)
                throw r8
            La2:
                java.lang.String r8 = "Attempted to use connection on a different coroutine"
                androidx.sqlite.SQLite.throwSQLiteException(r5, r8)
                kotlin.KotlinNothingValueException r8 = new kotlin.KotlinNothingValueException
                r8.<init>()
                throw r8
            Lad:
                java.lang.String r8 = "Connection is recycled"
                androidx.sqlite.SQLite.throwSQLiteException(r5, r8)
                kotlin.KotlinNothingValueException r8 = new kotlin.KotlinNothingValueException
                r8.<init>()
                throw r8
        }

        @Override // androidx.room.PooledConnection
        @org.jetbrains.annotations.Nullable
        public <R> java.lang.Object usePrepared(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.sqlite.SQLiteStatement, ? extends R> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r4) {
                r1 = this;
                androidx.room.coroutines.PooledConnectionImpl r0 = r1.this$0
                java.lang.Object r2 = r0.usePrepared(r2, r3, r4)
                return r2
        }

        @Override // androidx.room.TransactionScope
        @org.jetbrains.annotations.Nullable
        public <R> java.lang.Object withNestedTransaction(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.room.TransactionScope<R>, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r6) {
                r4 = this;
                androidx.room.coroutines.PooledConnectionImpl r0 = r4.this$0
                boolean r1 = androidx.room.coroutines.PooledConnectionImpl.access$isRecycled(r0)
                r2 = 21
                if (r1 != 0) goto L2f
                kotlin.coroutines.i r1 = r6.getContext()
                androidx.room.coroutines.ConnectionElement$Key r3 = androidx.room.coroutines.ConnectionElement.Key
                kotlin.coroutines.i$b r1 = r1.get(r3)
                androidx.room.coroutines.ConnectionElement r1 = (androidx.room.coroutines.ConnectionElement) r1
                if (r1 == 0) goto L24
                androidx.room.coroutines.PooledConnectionImpl r1 = r1.getConnectionWrapper()
                if (r1 != r0) goto L24
                r1 = 0
                java.lang.Object r5 = androidx.room.coroutines.PooledConnectionImpl.access$transaction(r0, r1, r5, r6)
                return r5
            L24:
                java.lang.String r5 = "Attempted to use connection on a different coroutine"
                androidx.sqlite.SQLite.throwSQLiteException(r2, r5)
                kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
                r5.<init>()
                throw r5
            L2f:
                java.lang.String r5 = "Connection is recycled"
                androidx.sqlite.SQLite.throwSQLiteException(r2, r5)
                kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
                r5.<init>()
                throw r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class TransactionItem {
        private final int id;
        private boolean shouldRollback;

        public TransactionItem(int r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.id = r1
                r0.shouldRollback = r2
                return
        }

        public final int getId() {
                r1 = this;
                int r0 = r1.id
                return r0
        }

        public final boolean getShouldRollback() {
                r1 = this;
                boolean r0 = r1.shouldRollback
                return r0
        }

        public final void setShouldRollback(boolean r1) {
                r0 = this;
                r0.shouldRollback = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                androidx.room.Transactor$SQLiteTransactionType[] r0 = androidx.room.Transactor.SQLiteTransactionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.room.Transactor$SQLiteTransactionType r1 = androidx.room.Transactor.SQLiteTransactionType.DEFERRED     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                androidx.room.Transactor$SQLiteTransactionType r1 = androidx.room.Transactor.SQLiteTransactionType.IMMEDIATE     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                androidx.room.Transactor$SQLiteTransactionType r1 = androidx.room.Transactor.SQLiteTransactionType.EXCLUSIVE     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                androidx.room.coroutines.PooledConnectionImpl.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    public PooledConnectionImpl(@org.jetbrains.annotations.NotNull androidx.room.coroutines.ConnectionWithLock r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.delegate = r2
            r1.isReadOnly = r3
            kotlin.collections.m r2 = new kotlin.collections.m
            r2.<init>()
            r1.transactionStack = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r2.<init>(r3)
            r1._isRecycled = r2
            return
    }

    public static final /* synthetic */ java.lang.Object access$beginTransaction(androidx.room.coroutines.PooledConnectionImpl r0, androidx.room.Transactor.SQLiteTransactionType r1, kotlin.coroutines.e r2) {
            java.lang.Object r0 = r0.beginTransaction(r1, r2)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$endTransaction(androidx.room.coroutines.PooledConnectionImpl r0, boolean r1, kotlin.coroutines.e r2) {
            java.lang.Object r0 = r0.endTransaction(r1, r2)
            return r0
    }

    public static final /* synthetic */ kotlin.collections.m access$getTransactionStack$p(androidx.room.coroutines.PooledConnectionImpl r0) {
            kotlin.collections.m<androidx.room.coroutines.PooledConnectionImpl$TransactionItem> r0 = r0.transactionStack
            return r0
    }

    public static final /* synthetic */ boolean access$isRecycled(androidx.room.coroutines.PooledConnectionImpl r0) {
            boolean r0 = r0.isRecycled()
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$transaction(androidx.room.coroutines.PooledConnectionImpl r0, androidx.room.Transactor.SQLiteTransactionType r1, kotlin.jvm.functions.Function2 r2, kotlin.coroutines.e r3) {
            java.lang.Object r0 = r0.transaction(r1, r2, r3)
            return r0
    }

    private final java.lang.Object beginTransaction(androidx.room.Transactor.SQLiteTransactionType r6, kotlin.coroutines.e<? super kotlin.n1> r7) {
            r5 = this;
            boolean r0 = r7 instanceof androidx.room.coroutines.PooledConnectionImpl$beginTransaction$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.room.coroutines.PooledConnectionImpl$beginTransaction$1 r0 = (androidx.room.coroutines.PooledConnectionImpl$beginTransaction$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.coroutines.PooledConnectionImpl$beginTransaction$1 r0 = new androidx.room.coroutines.PooledConnectionImpl$beginTransaction$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.sync.a r6 = (kotlinx.coroutines.sync.a) r6
            java.lang.Object r1 = r0.L$1
            androidx.room.Transactor$SQLiteTransactionType r1 = (androidx.room.Transactor.SQLiteTransactionType) r1
            java.lang.Object r0 = r0.L$0
            androidx.room.coroutines.PooledConnectionImpl r0 = (androidx.room.coroutines.PooledConnectionImpl) r0
            kotlin.g0.n(r7)
            r7 = r6
            r6 = r1
            goto L55
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            kotlin.g0.n(r7)
            androidx.room.coroutines.ConnectionWithLock r7 = r5.delegate
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r0 = r7.lock(r4, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r5
        L55:
            kotlin.collections.m<androidx.room.coroutines.PooledConnectionImpl$TransactionItem> r1 = r0.transactionStack     // Catch: java.lang.Throwable -> L7b
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L7b
            kotlin.collections.m<androidx.room.coroutines.PooledConnectionImpl$TransactionItem> r2 = r0.transactionStack     // Catch: java.lang.Throwable -> L7b
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L7b
            if (r2 == 0) goto L93
            int[] r2 = androidx.room.coroutines.PooledConnectionImpl.WhenMappings.$EnumSwitchMapping$0     // Catch: java.lang.Throwable -> L7b
            int r6 = r6.ordinal()     // Catch: java.lang.Throwable -> L7b
            r6 = r2[r6]     // Catch: java.lang.Throwable -> L7b
            if (r6 == r3) goto L8b
            r2 = 2
            if (r6 == r2) goto L83
            r2 = 3
            if (r6 != r2) goto L7d
            androidx.room.coroutines.ConnectionWithLock r6 = r0.delegate     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = "BEGIN EXCLUSIVE TRANSACTION"
            androidx.sqlite.SQLite.execSQL(r6, r2)     // Catch: java.lang.Throwable -> L7b
            goto Lae
        L7b:
            r6 = move-exception
            goto Lbf
        L7d:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L7b
            r6.<init>()     // Catch: java.lang.Throwable -> L7b
            throw r6     // Catch: java.lang.Throwable -> L7b
        L83:
            androidx.room.coroutines.ConnectionWithLock r6 = r0.delegate     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = "BEGIN IMMEDIATE TRANSACTION"
            androidx.sqlite.SQLite.execSQL(r6, r2)     // Catch: java.lang.Throwable -> L7b
            goto Lae
        L8b:
            androidx.room.coroutines.ConnectionWithLock r6 = r0.delegate     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = "BEGIN DEFERRED TRANSACTION"
            androidx.sqlite.SQLite.execSQL(r6, r2)     // Catch: java.lang.Throwable -> L7b
            goto Lae
        L93:
            androidx.room.coroutines.ConnectionWithLock r6 = r0.delegate     // Catch: java.lang.Throwable -> L7b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r2.<init>()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "SAVEPOINT '"
            r2.append(r3)     // Catch: java.lang.Throwable -> L7b
            r2.append(r1)     // Catch: java.lang.Throwable -> L7b
            r3 = 39
            r2.append(r3)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7b
            androidx.sqlite.SQLite.execSQL(r6, r2)     // Catch: java.lang.Throwable -> L7b
        Lae:
            kotlin.collections.m<androidx.room.coroutines.PooledConnectionImpl$TransactionItem> r6 = r0.transactionStack     // Catch: java.lang.Throwable -> L7b
            androidx.room.coroutines.PooledConnectionImpl$TransactionItem r0 = new androidx.room.coroutines.PooledConnectionImpl$TransactionItem     // Catch: java.lang.Throwable -> L7b
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L7b
            r6.addLast(r0)     // Catch: java.lang.Throwable -> L7b
            kotlin.n1 r6 = kotlin.n1.a     // Catch: java.lang.Throwable -> L7b
            r7.unlock(r4)
            return r6
        Lbf:
            r7.unlock(r4)
            throw r6
    }

    private final java.lang.Object endTransaction(boolean r6, kotlin.coroutines.e<? super kotlin.n1> r7) {
            r5 = this;
            boolean r0 = r7 instanceof androidx.room.coroutines.PooledConnectionImpl$endTransaction$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.room.coroutines.PooledConnectionImpl$endTransaction$1 r0 = (androidx.room.coroutines.PooledConnectionImpl$endTransaction$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.coroutines.PooledConnectionImpl$endTransaction$1 r0 = new androidx.room.coroutines.PooledConnectionImpl$endTransaction$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            boolean r6 = r0.Z$0
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.sync.a r1 = (kotlinx.coroutines.sync.a) r1
            java.lang.Object r0 = r0.L$0
            androidx.room.coroutines.PooledConnectionImpl r0 = (androidx.room.coroutines.PooledConnectionImpl) r0
            kotlin.g0.n(r7)
            goto L52
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            kotlin.g0.n(r7)
            androidx.room.coroutines.ConnectionWithLock r7 = r5.delegate
            r0.L$0 = r5
            r0.L$1 = r7
            r0.Z$0 = r6
            r0.label = r3
            java.lang.Object r0 = r7.lock(r4, r0)
            if (r0 != r1) goto L50
            return r1
        L50:
            r0 = r5
            r1 = r7
        L52:
            kotlin.collections.m<androidx.room.coroutines.PooledConnectionImpl$TransactionItem> r7 = r0.transactionStack     // Catch: java.lang.Throwable -> L7c
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L7c
            if (r7 != 0) goto Lcf
            kotlin.collections.m<androidx.room.coroutines.PooledConnectionImpl$TransactionItem> r7 = r0.transactionStack     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r7 = kotlin.collections.f0.Q0(r7)     // Catch: java.lang.Throwable -> L7c
            androidx.room.coroutines.PooledConnectionImpl$TransactionItem r7 = (androidx.room.coroutines.PooledConnectionImpl.TransactionItem) r7     // Catch: java.lang.Throwable -> L7c
            r2 = 39
            if (r6 == 0) goto L9c
            boolean r6 = r7.getShouldRollback()     // Catch: java.lang.Throwable -> L7c
            if (r6 != 0) goto L9c
            kotlin.collections.m<androidx.room.coroutines.PooledConnectionImpl$TransactionItem> r6 = r0.transactionStack     // Catch: java.lang.Throwable -> L7c
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L7c
            if (r6 == 0) goto L7e
            androidx.room.coroutines.ConnectionWithLock r6 = r0.delegate     // Catch: java.lang.Throwable -> L7c
            java.lang.String r7 = "END TRANSACTION"
            androidx.sqlite.SQLite.execSQL(r6, r7)     // Catch: java.lang.Throwable -> L7c
            goto Lc9
        L7c:
            r6 = move-exception
            goto Ld7
        L7e:
            androidx.room.coroutines.ConnectionWithLock r6 = r0.delegate     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r0.<init>()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = "RELEASE SAVEPOINT '"
            r0.append(r3)     // Catch: java.lang.Throwable -> L7c
            int r7 = r7.getId()     // Catch: java.lang.Throwable -> L7c
            r0.append(r7)     // Catch: java.lang.Throwable -> L7c
            r0.append(r2)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> L7c
            androidx.sqlite.SQLite.execSQL(r6, r7)     // Catch: java.lang.Throwable -> L7c
            goto Lc9
        L9c:
            kotlin.collections.m<androidx.room.coroutines.PooledConnectionImpl$TransactionItem> r6 = r0.transactionStack     // Catch: java.lang.Throwable -> L7c
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L7c
            if (r6 == 0) goto Lac
            androidx.room.coroutines.ConnectionWithLock r6 = r0.delegate     // Catch: java.lang.Throwable -> L7c
            java.lang.String r7 = "ROLLBACK TRANSACTION"
            androidx.sqlite.SQLite.execSQL(r6, r7)     // Catch: java.lang.Throwable -> L7c
            goto Lc9
        Lac:
            androidx.room.coroutines.ConnectionWithLock r6 = r0.delegate     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r0.<init>()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            r0.append(r3)     // Catch: java.lang.Throwable -> L7c
            int r7 = r7.getId()     // Catch: java.lang.Throwable -> L7c
            r0.append(r7)     // Catch: java.lang.Throwable -> L7c
            r0.append(r2)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> L7c
            androidx.sqlite.SQLite.execSQL(r6, r7)     // Catch: java.lang.Throwable -> L7c
        Lc9:
            kotlin.n1 r6 = kotlin.n1.a     // Catch: java.lang.Throwable -> L7c
            r1.unlock(r4)
            return r6
        Lcf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7c
            java.lang.String r7 = "Not in a transaction"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L7c
            throw r6     // Catch: java.lang.Throwable -> L7c
        Ld7:
            r1.unlock(r4)
            throw r6
    }

    private final boolean isRecycled() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1._isRecycled
            boolean r0 = r0.get()
            return r0
    }

    private final <R> java.lang.Object transaction(androidx.room.Transactor.SQLiteTransactionType r12, kotlin.jvm.functions.Function2<? super androidx.room.TransactionScope<R>, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r13, kotlin.coroutines.e<? super R> r14) {
            r11 = this;
            boolean r0 = r14 instanceof androidx.room.coroutines.PooledConnectionImpl$transaction$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.room.coroutines.PooledConnectionImpl$transaction$1 r0 = (androidx.room.coroutines.PooledConnectionImpl$transaction$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.coroutines.PooledConnectionImpl$transaction$1 r0 = new androidx.room.coroutines.PooledConnectionImpl$transaction$1
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.label
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L6a
            if (r2 == r8) goto L5d
            if (r2 == r6) goto L51
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L4b
            if (r2 == r3) goto L3b
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3b:
            java.lang.Object r12 = r0.L$1
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r13 = r0.L$0
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            kotlin.g0.n(r14)     // Catch: android.database.SQLException -> L48
            goto Lda
        L48:
            r14 = move-exception
            goto Ld5
        L4b:
            java.lang.Object r12 = r0.L$0
            kotlin.g0.n(r14)
            return r12
        L51:
            int r12 = r0.I$0
            java.lang.Object r13 = r0.L$0
            androidx.room.coroutines.PooledConnectionImpl r13 = (androidx.room.coroutines.PooledConnectionImpl) r13
            kotlin.g0.n(r14)     // Catch: java.lang.Throwable -> L5b
            goto L95
        L5b:
            r12 = move-exception
            goto La8
        L5d:
            java.lang.Object r12 = r0.L$1
            r13 = r12
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            java.lang.Object r12 = r0.L$0
            androidx.room.coroutines.PooledConnectionImpl r12 = (androidx.room.coroutines.PooledConnectionImpl) r12
            kotlin.g0.n(r14)
            goto L7f
        L6a:
            kotlin.g0.n(r14)
            if (r12 != 0) goto L71
            androidx.room.Transactor$SQLiteTransactionType r12 = androidx.room.Transactor.SQLiteTransactionType.DEFERRED
        L71:
            r0.L$0 = r11
            r0.L$1 = r13
            r0.label = r8
            java.lang.Object r12 = r11.beginTransaction(r12, r0)
            if (r12 != r1) goto L7e
            goto Ld2
        L7e:
            r12 = r11
        L7f:
            androidx.room.coroutines.PooledConnectionImpl$TransactionImpl r14 = new androidx.room.coroutines.PooledConnectionImpl$TransactionImpl     // Catch: java.lang.Throwable -> La4
            r14.<init>(r12)     // Catch: java.lang.Throwable -> La4
            r0.L$0 = r12     // Catch: java.lang.Throwable -> La4
            r0.L$1 = r9     // Catch: java.lang.Throwable -> La4
            r0.I$0 = r8     // Catch: java.lang.Throwable -> La4
            r0.label = r6     // Catch: java.lang.Throwable -> La4
            java.lang.Object r14 = r13.invoke(r14, r0)     // Catch: java.lang.Throwable -> La4
            if (r14 != r1) goto L93
            goto Ld2
        L93:
            r13 = r12
            r12 = 1
        L95:
            if (r12 == 0) goto L98
            r7 = 1
        L98:
            r0.L$0 = r14
            r0.label = r5
            java.lang.Object r12 = r13.endTransaction(r7, r0)
            if (r12 != r1) goto La3
            goto Ld2
        La3:
            return r14
        La4:
            r13 = move-exception
            r10 = r13
            r13 = r12
            r12 = r10
        La8:
            boolean r14 = r12 instanceof androidx.room.coroutines.ConnectionPool.RollbackException     // Catch: java.lang.Throwable -> Lc0
            if (r14 == 0) goto Lc2
            androidx.room.coroutines.ConnectionPool$RollbackException r12 = (androidx.room.coroutines.ConnectionPool.RollbackException) r12     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r12 = r12.getResult()     // Catch: java.lang.Throwable -> Lc0
            r0.L$0 = r12
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r13 = r13.endTransaction(r7, r0)
            if (r13 != r1) goto Lbf
            goto Ld2
        Lbf:
            return r12
        Lc0:
            r12 = move-exception
            goto Lc6
        Lc2:
            throw r12     // Catch: java.lang.Throwable -> Lc3
        Lc3:
            r14 = move-exception
            r9 = r12
            r12 = r14
        Lc6:
            r0.L$0 = r9     // Catch: android.database.SQLException -> Ld3
            r0.L$1 = r12     // Catch: android.database.SQLException -> Ld3
            r0.label = r3     // Catch: android.database.SQLException -> Ld3
            java.lang.Object r13 = r13.endTransaction(r7, r0)     // Catch: android.database.SQLException -> Ld3
            if (r13 != r1) goto Lda
        Ld2:
            return r1
        Ld3:
            r14 = move-exception
            r13 = r9
        Ld5:
            if (r13 == 0) goto Ldb
            kotlin.l.a(r13, r14)
        Lda:
            throw r12
        Ldb:
            throw r14
    }

    private final <R> java.lang.Object withStateCheck(kotlin.jvm.functions.Function0<? extends R> r1, kotlin.coroutines.e<? super R> r2) {
            r0 = this;
            boolean r1 = access$isRecycled(r0)
            if (r1 == 0) goto L13
            r1 = 21
            java.lang.String r2 = "Connection is recycled"
            androidx.sqlite.SQLite.throwSQLiteException(r1, r2)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
        L13:
            r1 = 3
            kotlin.jvm.internal.d0.e(r1)
            r1 = 0
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.room.coroutines.ConnectionWithLock getDelegate() {
            r1 = this;
            androidx.room.coroutines.ConnectionWithLock r0 = r1.delegate
            return r0
    }

    @Override // androidx.room.coroutines.RawConnectionAccessor
    @org.jetbrains.annotations.NotNull
    public androidx.sqlite.SQLiteConnection getRawConnection() {
            r1 = this;
            androidx.room.coroutines.ConnectionWithLock r0 = r1.delegate
            return r0
    }

    @Override // androidx.room.Transactor
    @org.jetbrains.annotations.Nullable
    public java.lang.Object inTransaction(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Boolean> r3) {
            r2 = this;
            boolean r0 = access$isRecycled(r2)
            r1 = 21
            if (r0 != 0) goto L34
            kotlin.coroutines.i r3 = r3.getContext()
            androidx.room.coroutines.ConnectionElement$Key r0 = androidx.room.coroutines.ConnectionElement.Key
            kotlin.coroutines.i$b r3 = r3.get(r0)
            androidx.room.coroutines.ConnectionElement r3 = (androidx.room.coroutines.ConnectionElement) r3
            if (r3 == 0) goto L29
            androidx.room.coroutines.PooledConnectionImpl r3 = r3.getConnectionWrapper()
            if (r3 != r2) goto L29
            kotlin.collections.m<androidx.room.coroutines.PooledConnectionImpl$TransactionItem> r3 = r2.transactionStack
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ 1
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r3
        L29:
            java.lang.String r3 = "Attempted to use connection on a different coroutine"
            androidx.sqlite.SQLite.throwSQLiteException(r1, r3)
            kotlin.KotlinNothingValueException r3 = new kotlin.KotlinNothingValueException
            r3.<init>()
            throw r3
        L34:
            java.lang.String r3 = "Connection is recycled"
            androidx.sqlite.SQLite.throwSQLiteException(r1, r3)
            kotlin.KotlinNothingValueException r3 = new kotlin.KotlinNothingValueException
            r3.<init>()
            throw r3
    }

    public final boolean isReadOnly() {
            r1 = this;
            boolean r0 = r1.isReadOnly
            return r0
    }

    public final void markRecycled() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3._isRecycled
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L11
            androidx.room.coroutines.ConnectionWithLock r0 = r3.delegate     // Catch: android.database.SQLException -> L11
            java.lang.String r1 = "ROLLBACK TRANSACTION"
            androidx.sqlite.SQLite.execSQL(r0, r1)     // Catch: android.database.SQLException -> L11
        L11:
            return
    }

    @Override // androidx.room.PooledConnection
    @org.jetbrains.annotations.Nullable
    public <R> java.lang.Object usePrepared(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.sqlite.SQLiteStatement, ? extends R> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r9) {
            r6 = this;
            boolean r0 = r9 instanceof androidx.room.coroutines.PooledConnectionImpl$usePrepared$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.room.coroutines.PooledConnectionImpl$usePrepared$1 r0 = (androidx.room.coroutines.PooledConnectionImpl$usePrepared$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.coroutines.PooledConnectionImpl$usePrepared$1 r0 = new androidx.room.coroutines.PooledConnectionImpl$usePrepared$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r7 = r0.L$3
            kotlinx.coroutines.sync.a r7 = (kotlinx.coroutines.sync.a) r7
            java.lang.Object r8 = r0.L$2
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            java.lang.Object r1 = r0.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.L$0
            androidx.room.coroutines.PooledConnectionImpl r0 = (androidx.room.coroutines.PooledConnectionImpl) r0
            kotlin.g0.n(r9)
            r9 = r7
            r7 = r1
            goto L77
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L44:
            kotlin.g0.n(r9)
            boolean r9 = access$isRecycled(r6)
            r2 = 21
            if (r9 != 0) goto La5
            kotlin.coroutines.i r9 = r0.getContext()
            androidx.room.coroutines.ConnectionElement$Key r5 = androidx.room.coroutines.ConnectionElement.Key
            kotlin.coroutines.i$b r9 = r9.get(r5)
            androidx.room.coroutines.ConnectionElement r9 = (androidx.room.coroutines.ConnectionElement) r9
            if (r9 == 0) goto L9a
            androidx.room.coroutines.PooledConnectionImpl r9 = r9.getConnectionWrapper()
            if (r9 != r6) goto L9a
            androidx.room.coroutines.ConnectionWithLock r9 = r6.delegate
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.L$3 = r9
            r0.label = r3
            java.lang.Object r0 = r9.lock(r4, r0)
            if (r0 != r1) goto L76
            return r1
        L76:
            r0 = r6
        L77:
            androidx.room.coroutines.PooledConnectionImpl$StatementWrapper r1 = new androidx.room.coroutines.PooledConnectionImpl$StatementWrapper     // Catch: java.lang.Throwable -> L8d
            androidx.room.coroutines.ConnectionWithLock r2 = r0.delegate     // Catch: java.lang.Throwable -> L8d
            androidx.sqlite.SQLiteStatement r7 = r2.prepare(r7)     // Catch: java.lang.Throwable -> L8d
            r1.<init>(r0, r7)     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r7 = r8.invoke(r1)     // Catch: java.lang.Throwable -> L8f
            kotlin.jdk7.a.c(r1, r4)     // Catch: java.lang.Throwable -> L8d
            r9.unlock(r4)
            return r7
        L8d:
            r7 = move-exception
            goto L96
        L8f:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L91
        L91:
            r8 = move-exception
            kotlin.jdk7.a.c(r1, r7)     // Catch: java.lang.Throwable -> L8d
            throw r8     // Catch: java.lang.Throwable -> L8d
        L96:
            r9.unlock(r4)
            throw r7
        L9a:
            java.lang.String r7 = "Attempted to use connection on a different coroutine"
            androidx.sqlite.SQLite.throwSQLiteException(r2, r7)
            kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
            r7.<init>()
            throw r7
        La5:
            java.lang.String r7 = "Connection is recycled"
            androidx.sqlite.SQLite.throwSQLiteException(r2, r7)
            kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
            r7.<init>()
            throw r7
    }

    @Override // androidx.room.Transactor
    @org.jetbrains.annotations.Nullable
    public <R> java.lang.Object withTransaction(@org.jetbrains.annotations.NotNull androidx.room.Transactor.SQLiteTransactionType r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.room.TransactionScope<R>, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r6) {
            r3 = this;
            boolean r0 = access$isRecycled(r3)
            r1 = 21
            if (r0 != 0) goto L2c
            kotlin.coroutines.i r0 = r6.getContext()
            androidx.room.coroutines.ConnectionElement$Key r2 = androidx.room.coroutines.ConnectionElement.Key
            kotlin.coroutines.i$b r0 = r0.get(r2)
            androidx.room.coroutines.ConnectionElement r0 = (androidx.room.coroutines.ConnectionElement) r0
            if (r0 == 0) goto L21
            androidx.room.coroutines.PooledConnectionImpl r0 = r0.getConnectionWrapper()
            if (r0 != r3) goto L21
            java.lang.Object r4 = r3.transaction(r4, r5, r6)
            return r4
        L21:
            java.lang.String r4 = "Attempted to use connection on a different coroutine"
            androidx.sqlite.SQLite.throwSQLiteException(r1, r4)
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        L2c:
            java.lang.String r4 = "Connection is recycled"
            androidx.sqlite.SQLite.throwSQLiteException(r1, r4)
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
    }
}
