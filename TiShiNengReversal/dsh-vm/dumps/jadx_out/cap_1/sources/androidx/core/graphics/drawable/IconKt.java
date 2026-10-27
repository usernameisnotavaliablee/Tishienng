package androidx.core.graphics.drawable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"ClassVerificationFailure"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class IconKt {
    @androidx.annotation.RequiresApi(26)
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.drawable.Icon toAdaptiveIcon(@org.jetbrains.annotations.NotNull android.graphics.Bitmap r0) {
            android.graphics.drawable.Icon r0 = androidx.core.graphics.drawable.b.a(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.drawable.Icon toIcon(@org.jetbrains.annotations.NotNull android.graphics.Bitmap r0) {
            android.graphics.drawable.Icon r0 = androidx.core.graphics.drawable.d.a(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.drawable.Icon toIcon(@org.jetbrains.annotations.NotNull android.net.Uri r0) {
            android.graphics.drawable.Icon r0 = androidx.core.graphics.drawable.c.a(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.drawable.Icon toIcon(@org.jetbrains.annotations.NotNull byte[] r2) {
            r0 = 0
            int r1 = r2.length
            android.graphics.drawable.Icon r2 = androidx.core.graphics.drawable.e.a(r2, r0, r1)
            return r2
    }
}
