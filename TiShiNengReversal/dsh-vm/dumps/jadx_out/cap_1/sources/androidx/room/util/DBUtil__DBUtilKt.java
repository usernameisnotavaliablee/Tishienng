package androidx.room.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDBUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n1863#2,2:169\n*S KotlinDebug\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt\n*L\n106#1:169,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final /* synthetic */ class DBUtil__DBUtilKt {
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void dropFtsSyncTriggers(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r6) {
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.List r0 = kotlin.collections.f0.j()
            java.lang.String r1 = "SELECT name FROM sqlite_master WHERE type = 'trigger'"
            androidx.sqlite.SQLiteStatement r1 = r6.prepare(r1)
        Lf:
            boolean r2 = r1.step()     // Catch: java.lang.Throwable -> L1e
            r3 = 0
            if (r2 == 0) goto L20
            java.lang.String r2 = r1.getText(r3)     // Catch: java.lang.Throwable -> L1e
            r0.add(r2)     // Catch: java.lang.Throwable -> L1e
            goto Lf
        L1e:
            r6 = move-exception
            goto L5b
        L20:
            kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            kotlin.jdk7.a.c(r1, r2)
            java.util.List r0 = kotlin.collections.f0.b(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r4 = "room_fts_content_sync_"
            r5 = 2
            boolean r4 = kotlin.text.u.H2(r1, r4, r3, r5, r2)
            if (r4 == 0) goto L30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "DROP TRIGGER IF EXISTS "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            androidx.sqlite.SQLite.execSQL(r6, r1)
            goto L30
        L5a:
            return
        L5b:
            throw r6     // Catch: java.lang.Throwable -> L5c
        L5c:
            r0 = move-exception
            kotlin.jdk7.a.c(r1, r6)
            throw r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void foreignKeyCheck(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            java.lang.String r0 = "db"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "tableName"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PRAGMA foreign_key_check(`"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "`)"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            androidx.sqlite.SQLiteStatement r2 = r2.prepare(r3)
            boolean r3 = r2.step()     // Catch: java.lang.Throwable -> L31
            if (r3 != 0) goto L33
            kotlin.n1 r3 = kotlin.n1.a     // Catch: java.lang.Throwable -> L31
            r3 = 0
            kotlin.jdk7.a.c(r2, r3)
            return
        L31:
            r3 = move-exception
            goto L3d
        L33:
            java.lang.String r3 = processForeignKeyCheckFailure$DBUtil__DBUtilKt(r2)     // Catch: java.lang.Throwable -> L31
            android.database.SQLException r0 = new android.database.SQLException     // Catch: java.lang.Throwable -> L31
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L31
            throw r0     // Catch: java.lang.Throwable -> L31
        L3d:
            throw r3     // Catch: java.lang.Throwable -> L3e
        L3e:
            r0 = move-exception
            kotlin.jdk7.a.c(r2, r3)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object internalPerform(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r6, boolean r7, boolean r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.room.PooledConnection, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r10) {
            androidx.room.util.DBUtil__DBUtilKt$internalPerform$2 r0 = new androidx.room.util.DBUtil__DBUtilKt$internalPerform$2
            r5 = 0
            r3 = r6
            r2 = r7
            r1 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r6 = r3.useConnection$room_runtime_release(r2, r0, r10)
            return r6
    }

    private static final <R> java.lang.Object internalPerform$$forInline(androidx.room.RoomDatabase r6, boolean r7, boolean r8, kotlin.jvm.functions.Function2<? super androidx.room.PooledConnection, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r9, kotlin.coroutines.e<? super R> r10) {
            androidx.room.util.DBUtil__DBUtilKt$internalPerform$2 r0 = new androidx.room.util.DBUtil__DBUtilKt$internalPerform$2
            r5 = 0
            r3 = r6
            r2 = r7
            r1 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6 = 0
            kotlin.jvm.internal.d0.e(r6)
            java.lang.Object r6 = r3.useConnection$room_runtime_release(r2, r0, r10)
            r7 = 1
            kotlin.jvm.internal.d0.e(r7)
            return r6
    }

    private static final java.lang.String processForeignKeyCheckFailure$DBUtil__DBUtilKt(androidx.sqlite.SQLiteStatement r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r2 = 0
            r3 = 0
        Lc:
            if (r3 != 0) goto L1f
            java.lang.String r4 = "Foreign key violation(s) detected in '"
            r0.append(r4)
            java.lang.String r4 = r6.getText(r2)
            r0.append(r4)
            java.lang.String r4 = "'.\n"
            r0.append(r4)
        L1f:
            r4 = 3
            java.lang.String r4 = r6.getText(r4)
            boolean r5 = r1.containsKey(r4)
            if (r5 != 0) goto L32
            r5 = 2
            java.lang.String r5 = r6.getText(r5)
            r1.put(r4, r5)
        L32:
            int r3 = r3 + 1
            boolean r4 = r6.step()
            if (r4 != 0) goto Lc
            java.lang.String r6 = "Number of different violations discovered: "
            r0.append(r6)
            java.util.Set r6 = r1.keySet()
            int r6 = r6.size()
            r0.append(r6)
            java.lang.String r6 = "\n"
            r0.append(r6)
            java.lang.String r2 = "Number of rows in violation: "
            r0.append(r2)
            r0.append(r3)
            r0.append(r6)
            java.lang.String r2 = "Violation(s) detected in the following constraint(s):\n"
            r0.append(r2)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L67:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L93
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = "\tParent Table = "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r2 = ", Foreign Key Constraint Index = "
            r0.append(r2)
            r0.append(r3)
            r0.append(r6)
            goto L67
        L93:
            java.lang.String r6 = r0.toString()
            return r6
    }
}
