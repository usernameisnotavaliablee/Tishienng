package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface TintableBackgroundView {
    @androidx.annotation.Nullable
    android.content.res.ColorStateList getSupportBackgroundTintList();

    @androidx.annotation.Nullable
    android.graphics.PorterDuff.Mode getSupportBackgroundTintMode();

    void setSupportBackgroundTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r1);

    void setSupportBackgroundTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r1);
}
