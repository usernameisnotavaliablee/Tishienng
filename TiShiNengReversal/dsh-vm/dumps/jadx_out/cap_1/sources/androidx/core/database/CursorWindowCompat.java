package androidx.core.database;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CursorWindowCompat {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(28)
    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.database.CursorWindow createCursorWindow(java.lang.String r1, long r2) {
                android.database.CursorWindow r0 = new android.database.CursorWindow
                r0.<init>(r1, r2)
                return r0
        }
    }

    private CursorWindowCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static android.database.CursorWindow create(@androidx.annotation.Nullable java.lang.String r2, long r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.database.CursorWindow r2 = androidx.core.database.CursorWindowCompat.Api28Impl.createCursorWindow(r2, r3)
            return r2
        Lb:
            android.database.CursorWindow r3 = new android.database.CursorWindow
            r3.<init>(r2)
            return r3
    }
}
