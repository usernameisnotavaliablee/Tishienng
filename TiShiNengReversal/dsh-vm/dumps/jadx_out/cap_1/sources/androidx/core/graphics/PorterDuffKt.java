package androidx.core.graphics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class PorterDuffKt {
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.PorterDuffColorFilter toColorFilter(@org.jetbrains.annotations.NotNull android.graphics.PorterDuff.Mode r1, int r2) {
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.PorterDuffXfermode toXfermode(@org.jetbrains.annotations.NotNull android.graphics.PorterDuff.Mode r1) {
            android.graphics.PorterDuffXfermode r0 = new android.graphics.PorterDuffXfermode
            r0.<init>(r1)
            return r0
    }
}
