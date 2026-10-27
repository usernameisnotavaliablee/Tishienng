package androidx.room.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAndroidSQLiteDriverConnectionPool.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSQLiteDriverConnectionPool.android.kt\nandroidx/room/coroutines/AndroidSQLiteDriverPooledConnection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AndroidSQLiteDriverPooledConnection implements androidx.room.Transactor, androidx.room.coroutines.RawConnectionAccessor {

    @org.jetbrains.annotations.Nullable
    private androidx.room.Transactor.SQLiteTransactionType currentTransactionType;

    @org.jetbrains.annotations.NotNull
    private final androidx.sqlite.driver.AndroidSQLiteConnection delegate;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class AndroidSQLiteDriverTransactor<T> implements androidx.room.TransactionScope<T>, androidx.room.coroutines.RawConnectionAccessor {
        final /* synthetic */ androidx.room.coroutines.AndroidSQLiteDriverPooledConnection this$0;

        public AndroidSQLiteDriverTransactor(androidx.room.coroutines.AndroidSQLiteDriverPooledConnection r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.room.coroutines.RawConnectionAccessor
        @org.jetbrains.annotations.NotNull
        public androidx.sqlite.SQLiteConnection getRawConnection() {
                r1 = this;
                androidx.room.coroutines.AndroidSQLiteDriverPooledConnection r0 = r1.this$0
                androidx.sqlite.SQLiteConnection r0 = r0.getRawConnection()
                return r0
        }

        @Override // androidx.room.TransactionScope
        @org.jetbrains.annotations.Nullable
        public java.lang.Object rollback(T r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r2) {
                r0 = this;
                androidx.room.coroutines.ConnectionPool$RollbackException r2 = new androidx.room.coroutines.ConnectionPool$RollbackException
                r2.<init>(r1)
                throw r2
        }

        @Override // androidx.room.PooledConnection
        @org.jetbrains.annotations.Nullable
        public <R> java.lang.Object usePrepared(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.sqlite.SQLiteStatement, ? extends R> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r4) {
                r1 = this;
                androidx.room.coroutines.AndroidSQLiteDriverPooledConnection r0 = r1.this$0
                java.lang.Object r2 = r0.usePrepared(r2, r3, r4)
                return r2
        }

        @Override // androidx.room.TransactionScope
        @org.jetbrains.annotations.Nullable
        public <R> java.lang.Object withNestedTransaction(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.room.TransactionScope<R>, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r4) {
                r2 = this;
                androidx.room.coroutines.AndroidSQLiteDriverPooledConnection r0 = r2.this$0
                androidx.room.Transactor$SQLiteTransactionType r1 = androidx.room.coroutines.AndroidSQLiteDriverPooledConnection.access$getCurrentTransactionType$p(r0)
                if (r1 == 0) goto Ld
                java.lang.Object r3 = androidx.room.coroutines.AndroidSQLiteDriverPooledConnection.access$transaction(r0, r1, r3, r4)
                return r3
            Ld:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "Required value was null."
                r3.<init>(r4)
                throw r3
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
                androidx.room.coroutines.AndroidSQLiteDriverPooledConnection.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    public AndroidSQLiteDriverPooledConnection(@org.jetbrains.annotations.NotNull androidx.sqlite.driver.AndroidSQLiteConnection r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.delegate = r2
            return
    }

    public static final /* synthetic */ androidx.room.Transactor.SQLiteTransactionType access$getCurrentTransactionType$p(androidx.room.coroutines.AndroidSQLiteDriverPooledConnection r0) {
            androidx.room.Transactor$SQLiteTransactionType r0 = r0.currentTransactionType
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$transaction(androidx.room.coroutines.AndroidSQLiteDriverPooledConnection r0, androidx.room.Transactor.SQLiteTransactionType r1, kotlin.jvm.functions.Function2 r2, kotlin.coroutines.e r3) {
            java.lang.Object r0 = r0.transaction(r1, r2, r3)
            return r0
    }

    private final <R> java.lang.Object transaction(androidx.room.Transactor.SQLiteTransactionType r6, kotlin.jvm.functions.Function2<? super androidx.room.TransactionScope<R>, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r7, kotlin.coroutines.e<? super R> r8) {
            r5 = this;
            boolean r0 = r8 instanceof androidx.room.coroutines.AndroidSQLiteDriverPooledConnection$transaction$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.room.coroutines.AndroidSQLiteDriverPooledConnection$transaction$1 r0 = (androidx.room.coroutines.AndroidSQLiteDriverPooledConnection$transaction$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.coroutines.AndroidSQLiteDriverPooledConnection$transaction$1 r0 = new androidx.room.coroutines.AndroidSQLiteDriverPooledConnection$transaction$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r6 = r0.L$1
            android.database.sqlite.SQLiteDatabase r6 = (android.database.sqlite.SQLiteDatabase) r6
            java.lang.Object r7 = r0.L$0
            androidx.room.coroutines.AndroidSQLiteDriverPooledConnection r7 = (androidx.room.coroutines.AndroidSQLiteDriverPooledConnection) r7
            kotlin.g0.n(r8)     // Catch: java.lang.Throwable -> L32 androidx.room.coroutines.ConnectionPool.RollbackException -> L35
            goto L88
        L32:
            r8 = move-exception
            goto Lb2
        L35:
            r8 = move-exception
            goto La2
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            kotlin.g0.n(r8)
            androidx.sqlite.driver.AndroidSQLiteConnection r8 = r5.delegate
            android.database.sqlite.SQLiteDatabase r8 = r8.getDb()
            boolean r2 = r8.inTransaction()
            if (r2 != 0) goto L51
            r5.currentTransactionType = r6
        L51:
            int[] r2 = androidx.room.coroutines.AndroidSQLiteDriverPooledConnection.WhenMappings.$EnumSwitchMapping$0
            int r6 = r6.ordinal()
            r6 = r2[r6]
            if (r6 == r4) goto L6f
            r2 = 2
            if (r6 == r2) goto L6b
            r2 = 3
            if (r6 != r2) goto L65
            r8.beginTransaction()
            goto L72
        L65:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L6b:
            r8.beginTransactionNonExclusive()
            goto L72
        L6f:
            r8.beginTransactionNonExclusive()
        L72:
            androidx.room.coroutines.AndroidSQLiteDriverPooledConnection$AndroidSQLiteDriverTransactor r6 = new androidx.room.coroutines.AndroidSQLiteDriverPooledConnection$AndroidSQLiteDriverTransactor     // Catch: java.lang.Throwable -> L97 androidx.room.coroutines.ConnectionPool.RollbackException -> L9d
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L97 androidx.room.coroutines.ConnectionPool.RollbackException -> L9d
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L97 androidx.room.coroutines.ConnectionPool.RollbackException -> L9d
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L97 androidx.room.coroutines.ConnectionPool.RollbackException -> L9d
            r0.label = r4     // Catch: java.lang.Throwable -> L97 androidx.room.coroutines.ConnectionPool.RollbackException -> L9d
            java.lang.Object r6 = r7.invoke(r6, r0)     // Catch: java.lang.Throwable -> L97 androidx.room.coroutines.ConnectionPool.RollbackException -> L9d
            if (r6 != r1) goto L84
            return r1
        L84:
            r7 = r8
            r8 = r6
            r6 = r7
            r7 = r5
        L88:
            r6.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L32 androidx.room.coroutines.ConnectionPool.RollbackException -> L35
            r6.endTransaction()
            boolean r6 = r6.inTransaction()
            if (r6 != 0) goto L96
            r7.currentTransactionType = r3
        L96:
            return r8
        L97:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto Lb2
        L9d:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r7
            r7 = r5
        La2:
            java.lang.Object r8 = r8.getResult()     // Catch: java.lang.Throwable -> L32
            r6.endTransaction()
            boolean r6 = r6.inTransaction()
            if (r6 != 0) goto Lb1
            r7.currentTransactionType = r3
        Lb1:
            return r8
        Lb2:
            r6.endTransaction()
            boolean r6 = r6.inTransaction()
            if (r6 != 0) goto Lbd
            r7.currentTransactionType = r3
        Lbd:
            throw r8
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.sqlite.driver.AndroidSQLiteConnection getDelegate() {
            r1 = this;
            androidx.sqlite.driver.AndroidSQLiteConnection r0 = r1.delegate
            return r0
    }

    @Override // androidx.room.coroutines.RawConnectionAccessor
    @org.jetbrains.annotations.NotNull
    public androidx.sqlite.SQLiteConnection getRawConnection() {
            r1 = this;
            androidx.sqlite.driver.AndroidSQLiteConnection r0 = r1.delegate
            return r0
    }

    @Override // androidx.room.Transactor
    @org.jetbrains.annotations.Nullable
    public java.lang.Object inTransaction(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Boolean> r1) {
            r0 = this;
            androidx.sqlite.driver.AndroidSQLiteConnection r1 = r0.delegate
            android.database.sqlite.SQLiteDatabase r1 = r1.getDb()
            boolean r1 = r1.inTransaction()
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r1)
            return r1
    }

    @Override // androidx.room.PooledConnection
    @org.jetbrains.annotations.Nullable
    public <R> java.lang.Object usePrepared(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.sqlite.SQLiteStatement, ? extends R> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r3) {
            r0 = this;
            androidx.sqlite.driver.AndroidSQLiteConnection r3 = r0.delegate
            androidx.sqlite.SQLiteStatement r1 = r3.prepare(r1)
            java.lang.Object r2 = r2.invoke(r1)     // Catch: java.lang.Throwable -> Lf
            r3 = 0
            kotlin.jdk7.a.c(r1, r3)
            return r2
        Lf:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L11
        L11:
            r3 = move-exception
            kotlin.jdk7.a.c(r1, r2)
            throw r3
    }

    @Override // androidx.room.Transactor
    @org.jetbrains.annotations.Nullable
    public <R> java.lang.Object withTransaction(@org.jetbrains.annotations.NotNull androidx.room.Transactor.SQLiteTransactionType r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.room.TransactionScope<R>, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r3) {
            r0 = this;
            java.lang.Object r1 = r0.transaction(r1, r2, r3)
            return r1
    }
}
