package androidx.room.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nStatementUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatementUtil.kt\nandroidx/room/util/SQLiteStatementUtil__StatementUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final /* synthetic */ class SQLiteStatementUtil__StatementUtilKt {
    public static final int columnIndexOfCommon(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteStatement r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = r3 instanceof androidx.room.util.MappedColumnsSQLiteStatementWrapper
            if (r0 == 0) goto L15
            androidx.room.util.MappedColumnsSQLiteStatementWrapper r3 = (androidx.room.util.MappedColumnsSQLiteStatementWrapper) r3
            int r3 = r3.getColumnIndex(r4)
            return r3
        L15:
            int r0 = r3.getColumnCount()
            r1 = 0
        L1a:
            if (r1 >= r0) goto L2a
            java.lang.String r2 = r3.getColumnName(r1)
            boolean r2 = kotlin.jvm.internal.g0.g(r4, r2)
            if (r2 == 0) goto L27
            return r1
        L27:
            int r1 = r1 + 1
            goto L1a
        L2a:
            r3 = -1
            return r3
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int getColumnIndex(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteStatement r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "stmt"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r1 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(r1, r2)
            return r1
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int getColumnIndexOrThrow(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteStatement r10, @org.jetbrains.annotations.NotNull java.lang.String r11) {
            java.lang.String r0 = "stmt"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r11, r0)
            int r0 = androidx.room.util.SQLiteStatementUtil.columnIndexOf(r10, r11)
            if (r0 < 0) goto L11
            return r0
        L11:
            int r0 = r10.getColumnCount()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        L1b:
            if (r2 >= r0) goto L27
            java.lang.String r3 = r10.getColumnName(r2)
            r1.add(r3)
            int r2 = r2 + 1
            goto L1b
        L27:
            r8 = 63
            r9 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r10 = kotlin.collections.f0.r3(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Column '"
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = "' does not exist. Available columns: ["
            r1.append(r11)
            r1.append(r10)
            r10 = 93
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.NotNull
    public static final androidx.sqlite.SQLiteStatement wrapMappedColumns(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteStatement r1, @org.jetbrains.annotations.NotNull java.lang.String[] r2, @org.jetbrains.annotations.NotNull int[] r3) {
            java.lang.String r0 = "statement"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "columnNames"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "mapping"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.room.util.MappedColumnsSQLiteStatementWrapper r0 = new androidx.room.util.MappedColumnsSQLiteStatementWrapper
            r0.<init>(r1, r2, r3)
            return r0
    }
}
