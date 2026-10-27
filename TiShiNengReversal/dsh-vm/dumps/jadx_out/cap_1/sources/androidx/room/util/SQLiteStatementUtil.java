package androidx.room.util;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SQLiteStatementUtil {
    public static final int columnIndexOf(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteStatement r0, @org.jetbrains.annotations.NotNull java.lang.String r1) {
            int r0 = androidx.room.util.SQLiteStatementUtil__StatementUtil_androidKt.columnIndexOf(r0, r1)
            return r0
    }

    public static final int columnIndexOfCommon(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteStatement r0, @org.jetbrains.annotations.NotNull java.lang.String r1) {
            int r0 = androidx.room.util.SQLiteStatementUtil__StatementUtilKt.columnIndexOfCommon(r0, r1)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int getColumnIndex(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteStatement r0, @org.jetbrains.annotations.NotNull java.lang.String r1) {
            int r0 = androidx.room.util.SQLiteStatementUtil__StatementUtilKt.getColumnIndex(r0, r1)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int getColumnIndexOrThrow(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteStatement r0, @org.jetbrains.annotations.NotNull java.lang.String r1) {
            int r0 = androidx.room.util.SQLiteStatementUtil__StatementUtilKt.getColumnIndexOrThrow(r0, r1)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.NotNull
    public static final androidx.sqlite.SQLiteStatement wrapMappedColumns(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteStatement r0, @org.jetbrains.annotations.NotNull java.lang.String[] r1, @org.jetbrains.annotations.NotNull int[] r2) {
            androidx.sqlite.SQLiteStatement r0 = androidx.room.util.SQLiteStatementUtil__StatementUtilKt.wrapMappedColumns(r0, r1, r2)
            return r0
    }
}
