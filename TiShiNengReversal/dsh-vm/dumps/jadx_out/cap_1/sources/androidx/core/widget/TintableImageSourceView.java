package androidx.core.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface TintableImageSourceView {
    @androidx.annotation.Nullable
    android.content.res.ColorStateList getSupportImageTintList();

    @androidx.annotation.Nullable
    android.graphics.PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r1);

    void setSupportImageTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r1);
}
