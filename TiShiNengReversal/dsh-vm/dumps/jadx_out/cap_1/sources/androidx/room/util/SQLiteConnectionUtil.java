package androidx.room.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "SQLiteConnectionUtil")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SQLiteConnectionUtil {
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final long getLastInsertedRowId(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r3) {
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = getTotalChangedRows(r3)
            if (r0 != 0) goto Le
            r0 = -1
            return r0
        Le:
            java.lang.String r0 = "SELECT last_insert_rowid()"
            androidx.sqlite.SQLiteStatement r3 = r3.prepare(r0)
            r3.step()     // Catch: java.lang.Throwable -> L21
            r0 = 0
            long r0 = r3.getLong(r0)     // Catch: java.lang.Throwable -> L21
            r2 = 0
            kotlin.jdk7.a.c(r3, r2)
            return r0
        L21:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L23
        L23:
            r1 = move-exception
            kotlin.jdk7.a.c(r3, r0)
            throw r1
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int getTotalChangedRows(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2) {
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "SELECT changes()"
            androidx.sqlite.SQLiteStatement r2 = r2.prepare(r0)
            r2.step()     // Catch: java.lang.Throwable -> L19
            r0 = 0
            long r0 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L19
            int r1 = (int) r0
            r0 = 0
            kotlin.jdk7.a.c(r2, r0)
            return r1
        L19:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L1b
        L1b:
            r1 = move-exception
            kotlin.jdk7.a.c(r2, r0)
            throw r1
    }
}
