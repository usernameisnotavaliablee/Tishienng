package androidx.room.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDBUtil.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt\n+ 2 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n108#1,2:247\n111#1:251\n48#2:249\n67#2:250\n1#3:252\n*S KotlinDebug\n*F\n+ 1 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt\n*L\n52#1:247,2\n52#1:251\n53#1:249\n53#1:250\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final /* synthetic */ class DBUtil__DBUtil_androidKt {
    private static final <R> java.lang.Object compatCoroutineExecute$DBUtil__DBUtil_androidKt(androidx.room.RoomDatabase r3, boolean r4, kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r5, kotlin.coroutines.e<? super R> r6) {
            boolean r0 = r3.inCompatibilityMode$room_runtime_release()
            if (r0 == 0) goto L17
            boolean r0 = r3.isOpenInternal()
            if (r0 == 0) goto L17
            boolean r0 = r3.inTransaction()
            if (r0 == 0) goto L17
            java.lang.Object r3 = r5.invoke(r6)
            return r3
        L17:
            r0 = 0
            kotlin.jvm.internal.d0.e(r0)
            java.lang.Object r3 = androidx.room.util.DBUtil.getCoroutineContext(r3, r4, r6)
            r4 = 1
            kotlin.jvm.internal.d0.e(r4)
            kotlin.coroutines.i r3 = (kotlin.coroutines.i) r3
            androidx.room.util.DBUtil__DBUtil_androidKt$compatCoroutineExecute$2 r1 = new androidx.room.util.DBUtil__DBUtil_androidKt$compatCoroutineExecute$2
            r2 = 0
            r1.<init>(r5, r2)
            kotlin.jvm.internal.d0.e(r0)
            java.lang.Object r3 = kotlinx.coroutines.i.h(r3, r1, r6)
            kotlin.jvm.internal.d0.e(r4)
            return r3
    }

    @kotlin.Deprecated(message = "Use constructor", replaceWith = @kotlin.ReplaceWith(expression = "CancellationSignal()", imports = {"android.os.CancellationSignal"}))
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.NotNull
    public static final android.os.CancellationSignal createCancellationSignal() {
            android.os.CancellationSignal r0 = new android.os.CancellationSignal
            r0.<init>()
            return r0
    }

    @kotlin.Deprecated(message = "Replaced by dropFtsSyncTriggers(connection: SQLiteConnection)")
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void dropFtsSyncTriggers(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r1) {
            java.lang.String r0 = "db"
            kotlin.jvm.internal.g0.p(r1, r0)
            androidx.room.driver.SupportSQLiteConnection r0 = new androidx.room.driver.SupportSQLiteConnection
            r0.<init>(r1)
            androidx.room.util.DBUtil.dropFtsSyncTriggers(r0)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void foreignKeyCheck(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "db"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "tableName"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.room.driver.SupportSQLiteConnection r0 = new androidx.room.driver.SupportSQLiteConnection
            r0.<init>(r1)
            androidx.room.util.DBUtil.foreignKeyCheck(r0, r2)
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object getCoroutineContext(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r1, boolean r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.coroutines.i> r3) {
            boolean r0 = r1.inCompatibilityMode$room_runtime_release()
            if (r0 == 0) goto L32
            kotlin.coroutines.i r3 = r3.getContext()
            androidx.room.TransactionElement$Key r0 = androidx.room.TransactionElement.Key
            kotlin.coroutines.i$b r3 = r3.get(r0)
            androidx.room.TransactionElement r3 = (androidx.room.TransactionElement) r3
            if (r3 == 0) goto L26
            kotlin.coroutines.f r3 = r3.getTransactionDispatcher$room_runtime_release()
            if (r3 == 0) goto L26
            kotlin.coroutines.i r0 = r1.getQueryContext()
            kotlin.coroutines.i r3 = r0.plus(r3)
            if (r3 != 0) goto L25
            goto L26
        L25:
            return r3
        L26:
            if (r2 == 0) goto L2d
            kotlin.coroutines.i r1 = r1.getTransactionContext$room_runtime_release()
            return r1
        L2d:
            kotlin.coroutines.i r1 = r1.getQueryContext()
            return r1
        L32:
            kotlinx.coroutines.r0 r1 = r1.getCoroutineScope()
            kotlin.coroutines.i r1 = r1.getCoroutineContext()
            return r1
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <R> R performBlocking(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r7, boolean r8, boolean r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.sqlite.SQLiteConnection, ? extends R> r10) {
            java.lang.String r0 = "db"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r10, r0)
            r7.assertNotMainThread()
            r7.assertNotSuspendingTransaction()
            androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1 r1 = new androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1
            r6 = 0
            r2 = r7
            r4 = r8
            r3 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r7 = androidx.room.coroutines.RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(r1)
            return r7
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object performInTransactionSuspending(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r5) {
            boolean r0 = r3.inCompatibilityMode$room_runtime_release()
            r1 = 0
            if (r0 == 0) goto L11
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2 r0 = new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2
            r0.<init>(r3, r4, r1)
            java.lang.Object r3 = androidx.room.RoomDatabaseKt.withTransactionContext(r3, r0, r5)
            return r3
        L11:
            kotlinx.coroutines.r0 r0 = r3.getCoroutineScope()
            kotlin.coroutines.i r0 = r0.getCoroutineContext()
            androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$3 r2 = new androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$3
            r2.<init>(r3, r4, r1)
            java.lang.Object r3 = kotlinx.coroutines.i.h(r0, r2, r5)
            return r3
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object performSuspending(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r14, boolean r15, boolean r16, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.sqlite.SQLiteConnection, ? extends R> r17, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r18) {
            r0 = r18
            boolean r1 = r0 instanceof androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1
            if (r1 == 0) goto L16
            r1 = r0
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1 r1 = (androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.label = r2
        L14:
            r6 = r1
            goto L1c
        L16:
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1 r1 = new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r6.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.a.l()
            int r1 = r6.label
            r2 = 3
            r3 = 2
            r8 = 1
            if (r1 == 0) goto L53
            if (r1 == r8) goto L4f
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L33
            kotlin.g0.n(r0)
            return r0
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            boolean r14 = r6.Z$1
            boolean r15 = r6.Z$0
            java.lang.Object r1 = r6.L$1
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.lang.Object r3 = r6.L$0
            androidx.room.RoomDatabase r3 = (androidx.room.RoomDatabase) r3
            kotlin.g0.n(r0)
            r12 = r14
            r13 = r1
            r10 = r3
        L4d:
            r11 = r15
            goto L99
        L4f:
            kotlin.g0.n(r0)
            return r0
        L53:
            kotlin.g0.n(r0)
            boolean r0 = r14.inCompatibilityMode$room_runtime_release()
            if (r0 == 0) goto L7f
            boolean r0 = r14.isOpenInternal()
            if (r0 == 0) goto L7f
            boolean r0 = r14.inTransaction()
            if (r0 == 0) goto L7f
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 r0 = new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1
            r4 = 0
            r3 = r14
            r2 = r15
            r1 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r2 = r0
            r6.label = r8
            java.lang.Object r14 = r14.useConnection$room_runtime_release(r15, r2, r6)
            if (r14 != r7) goto L7e
            goto Lae
        L7e:
            return r14
        L7f:
            r4 = r16
            r6.L$0 = r14
            r5 = r17
            r6.L$1 = r5
            r6.Z$0 = r15
            r6.Z$1 = r4
            r6.label = r3
            java.lang.Object r3 = androidx.room.util.DBUtil.getCoroutineContext(r14, r4, r6)
            if (r3 != r7) goto L94
            goto Lae
        L94:
            r10 = r14
            r0 = r3
            r12 = r4
            r13 = r5
            goto L4d
        L99:
            kotlin.coroutines.i r0 = (kotlin.coroutines.i) r0
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 r8 = new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1
            r9 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r14 = 0
            r6.L$0 = r14
            r6.L$1 = r14
            r6.label = r2
            java.lang.Object r14 = kotlinx.coroutines.i.h(r0, r8, r6)
            if (r14 != r7) goto Laf
        Lae:
            return r7
        Laf:
            return r14
    }

    @kotlin.Deprecated(message = "This is only used in the generated code and shouldn't be called directly.")
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.NotNull
    public static final android.database.Cursor query(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r1, @org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteQuery r2, boolean r3) {
            java.lang.String r0 = "db"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "sqLiteQuery"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            android.database.Cursor r1 = androidx.room.util.DBUtil.query(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.NotNull
    public static final android.database.Cursor query(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r1, @org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteQuery r2, boolean r3, @org.jetbrains.annotations.Nullable android.os.CancellationSignal r4) {
            java.lang.String r0 = "db"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "sqLiteQuery"
            kotlin.jvm.internal.g0.p(r2, r0)
            android.database.Cursor r1 = r1.query(r2, r4)
            if (r3 == 0) goto L37
            boolean r2 = r1 instanceof android.database.AbstractWindowedCursor
            if (r2 == 0) goto L37
            r2 = r1
            android.database.AbstractWindowedCursor r2 = (android.database.AbstractWindowedCursor) r2
            int r3 = r2.getCount()
            boolean r4 = r2.hasWindow()
            if (r4 == 0) goto L2a
            android.database.CursorWindow r2 = r2.getWindow()
            int r2 = r2.getNumRows()
            goto L2b
        L2a:
            r2 = r3
        L2b:
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r4 < r0) goto L33
            if (r2 >= r3) goto L37
        L33:
            android.database.Cursor r1 = androidx.room.util.CursorUtil.copyAndClose(r1)
        L37:
            return r1
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int readVersion(@org.jetbrains.annotations.NotNull java.io.File r7) throws java.io.IOException {
            java.lang.String r0 = "databaseFile"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r7)
            java.nio.channels.FileChannel r1 = r0.getChannel()
            r7 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r7)     // Catch: java.lang.Throwable -> L32
            r4 = 4
            r6 = 1
            r2 = 60
            r1.tryLock(r2, r4, r6)     // Catch: java.lang.Throwable -> L32
            r2 = 60
            r1.position(r2)     // Catch: java.lang.Throwable -> L32
            int r2 = r1.read(r0)     // Catch: java.lang.Throwable -> L32
            if (r2 != r7) goto L35
            r0.rewind()     // Catch: java.lang.Throwable -> L32
            int r7 = r0.getInt()     // Catch: java.lang.Throwable -> L32
            r0 = 0
            kotlin.io.b.a(r1, r0)
            return r7
        L32:
            r0 = move-exception
            r7 = r0
            goto L3d
        L35:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "Bad database header, unable to read 4 bytes at offset 60"
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L32
            throw r7     // Catch: java.lang.Throwable -> L32
        L3d:
            throw r7     // Catch: java.lang.Throwable -> L3e
        L3e:
            r0 = move-exception
            kotlin.io.b.a(r1, r7)
            throw r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.NotNull
    public static final androidx.sqlite.SQLiteConnection toSQLiteConnection(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r1) {
            java.lang.String r0 = "db"
            kotlin.jvm.internal.g0.p(r1, r0)
            androidx.room.driver.SupportSQLiteConnection r0 = new androidx.room.driver.SupportSQLiteConnection
            r0.<init>(r1)
            return r0
    }
}
