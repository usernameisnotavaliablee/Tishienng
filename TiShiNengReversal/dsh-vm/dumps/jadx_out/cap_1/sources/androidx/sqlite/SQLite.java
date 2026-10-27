package androidx.sqlite;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "SQLite")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSQLite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SQLite.kt\nandroidx/sqlite/SQLite\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SQLite {
    public static final int SQLITE_DATA_BLOB = 4;
    public static final int SQLITE_DATA_FLOAT = 2;
    public static final int SQLITE_DATA_INTEGER = 1;
    public static final int SQLITE_DATA_NULL = 5;
    public static final int SQLITE_DATA_TEXT = 3;

    public static final void execSQL(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "sql"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.sqlite.SQLiteStatement r1 = r1.prepare(r2)
            r1.step()     // Catch: java.lang.Throwable -> L16
            r2 = 0
            kotlin.jdk7.a.c(r1, r2)
            return
        L16:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L18
        L18:
            r0 = move-exception
            kotlin.jdk7.a.c(r1, r2)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Void throwSQLiteException(int r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error code: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.append(r3)
            if (r4 == 0) goto L2f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = ", message: "
            r3.append(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
        L2f:
            java.lang.String r3 = r0.toString()
            android.database.SQLException r4 = new android.database.SQLException
            r4.<init>(r3)
            throw r4
    }
}
