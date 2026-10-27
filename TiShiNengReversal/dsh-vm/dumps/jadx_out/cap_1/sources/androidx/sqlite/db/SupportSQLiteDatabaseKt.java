package androidx.sqlite.db;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "SupportSQLiteDatabaseKt")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SupportSQLiteDatabaseKt {
    public static final <T> T transaction(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r0, boolean r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.sqlite.db.SupportSQLiteDatabase, ? extends T> r2) {
            if (r1 == 0) goto L6
            r0.beginTransaction()
            goto L9
        L6:
            r0.beginTransactionNonExclusive()
        L9:
            r1 = 1
            java.lang.Object r2 = r2.invoke(r0)     // Catch: java.lang.Throwable -> L1b
            kotlin.jvm.internal.d0.d(r1)
            r0.setTransactionSuccessful()
            r0.endTransaction()
            kotlin.jvm.internal.d0.c(r1)
            return r2
        L1b:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L1d
        L1d:
            r2 = move-exception
            kotlin.jvm.internal.d0.d(r1)
            r0.endTransaction()
            kotlin.jvm.internal.d0.c(r1)
            throw r2
    }

    public static /* synthetic */ java.lang.Object transaction$default(androidx.sqlite.db.SupportSQLiteDatabase r0, boolean r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L5
            r1 = 1
        L5:
            if (r1 == 0) goto Lb
            r0.beginTransaction()
            goto Le
        Lb:
            r0.beginTransactionNonExclusive()
        Le:
            java.lang.Object r1 = r2.invoke(r0)     // Catch: java.lang.Throwable -> L1f
            kotlin.jvm.internal.d0.d(r4)
            r0.setTransactionSuccessful()
            r0.endTransaction()
            kotlin.jvm.internal.d0.c(r4)
            return r1
        L1f:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L21
        L21:
            r1 = move-exception
            kotlin.jvm.internal.d0.d(r4)
            r0.endTransaction()
            kotlin.jvm.internal.d0.c(r4)
            throw r1
    }
}
