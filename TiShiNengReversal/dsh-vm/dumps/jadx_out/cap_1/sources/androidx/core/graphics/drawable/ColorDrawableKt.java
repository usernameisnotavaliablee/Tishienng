package androidx.core.graphics.drawable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ColorDrawableKt {
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.drawable.ColorDrawable toDrawable(@androidx.annotation.ColorInt int r1) {
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.drawable.ColorDrawable toDrawable(@org.jetbrains.annotations.NotNull android.graphics.Color r1) {
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            int r1 = androidx.core.graphics.drawable.a.a(r1)
            r0.<init>(r1)
            return r0
    }
}
