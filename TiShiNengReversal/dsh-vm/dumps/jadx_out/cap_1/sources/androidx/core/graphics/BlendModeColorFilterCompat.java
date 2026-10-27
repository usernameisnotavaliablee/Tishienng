package androidx.core.graphics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class BlendModeColorFilterCompat {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(29)
    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.graphics.ColorFilter createBlendModeColorFilter(int r1, java.lang.Object r2) {
                android.graphics.BlendModeColorFilter r0 = new android.graphics.BlendModeColorFilter
                android.graphics.BlendMode r2 = (android.graphics.BlendMode) r2
                r0.<init>(r1, r2)
                return r0
        }
    }

    private BlendModeColorFilterCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.graphics.ColorFilter createBlendModeColorFilterCompat(int r3, @androidx.annotation.NonNull androidx.core.graphics.BlendModeCompat r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 0
            if (r0 < r1) goto L13
            java.lang.Object r4 = androidx.core.graphics.BlendModeUtils.Api29Impl.obtainBlendModeFromCompat(r4)
            if (r4 == 0) goto L12
            android.graphics.ColorFilter r3 = androidx.core.graphics.BlendModeColorFilterCompat.Api29Impl.createBlendModeColorFilter(r3, r4)
            return r3
        L12:
            return r2
        L13:
            android.graphics.PorterDuff$Mode r4 = androidx.core.graphics.BlendModeUtils.obtainPorterDuffFromCompat(r4)
            if (r4 == 0) goto L1f
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r3, r4)
            return r0
        L1f:
            return r2
    }
}
