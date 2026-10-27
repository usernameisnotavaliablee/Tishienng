package androidx.core.database.sqlite;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SQLiteCursorCompat {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(28)
    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void setFillWindowForwardOnly(android.database.sqlite.SQLiteCursor r0, boolean r1) {
                r0.setFillWindowForwardOnly(r1)
                return
        }
    }

    private SQLiteCursorCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void setFillWindowForwardOnly(@androidx.annotation.NonNull android.database.sqlite.SQLiteCursor r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L9
            androidx.core.database.sqlite.SQLiteCursorCompat.Api28Impl.setFillWindowForwardOnly(r2, r3)
        L9:
            return
    }
}
