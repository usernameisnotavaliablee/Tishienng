package g;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final /* synthetic */ class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(androidx.sqlite.db.SupportSQLiteDatabase r0) {
            r0.beginTransaction()
            return
    }

    public static void b(androidx.sqlite.db.SupportSQLiteDatabase r1, @org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteTransactionListener r2) {
            java.lang.String r0 = "transactionListener"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.beginTransactionWithListener(r2)
            return
    }

    public static void c(androidx.sqlite.db.SupportSQLiteDatabase r0, @org.jetbrains.annotations.NotNull java.lang.String r1, @android.annotation.SuppressLint({"ArrayReturn"}) @org.jetbrains.annotations.Nullable java.lang.Object[] r2) {
            java.lang.String r0 = "sql"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public static boolean d(androidx.sqlite.db.SupportSQLiteDatabase r0) {
            r0 = 0
            return r0
    }
}
