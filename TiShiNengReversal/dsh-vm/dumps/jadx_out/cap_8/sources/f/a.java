package f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final /* synthetic */ class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(androidx.sqlite.SQLiteStatement r2, @androidx.annotation.IntRange(from = 1) int r3, boolean r4) {
            if (r4 == 0) goto L5
            r0 = 1
            goto L7
        L5:
            r0 = 0
        L7:
            r2.bindLong(r3, r0)
            return
    }

    public static void b(androidx.sqlite.SQLiteStatement r2, @androidx.annotation.IntRange(from = 1) int r3, float r4) {
            double r0 = (double) r4
            r2.bindDouble(r3, r0)
            return
    }

    public static void c(androidx.sqlite.SQLiteStatement r2, @androidx.annotation.IntRange(from = 1) int r3, int r4) {
            long r0 = (long) r4
            r2.bindLong(r3, r0)
            return
    }

    public static boolean d(androidx.sqlite.SQLiteStatement r3, @androidx.annotation.IntRange(from = 0) int r4) {
            long r3 = r3.getLong(r4)
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto Lc
            r3 = 1
            return r3
        Lc:
            r3 = 0
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static java.util.List e(androidx.sqlite.SQLiteStatement r4) {
            int r0 = r4.getColumnCount()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        La:
            if (r2 >= r0) goto L16
            java.lang.String r3 = r4.getColumnName(r2)
            r1.add(r3)
            int r2 = r2 + 1
            goto La
        L16:
            return r1
    }

    public static float f(androidx.sqlite.SQLiteStatement r0, @androidx.annotation.IntRange(from = 0) int r1) {
            double r0 = r0.getDouble(r1)
            float r0 = (float) r0
            return r0
    }

    public static int g(androidx.sqlite.SQLiteStatement r0, @androidx.annotation.IntRange(from = 0) int r1) {
            long r0 = r0.getLong(r1)
            int r1 = (int) r0
            return r1
    }
}
