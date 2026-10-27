package androidx.appcompat.content.res;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"RestrictedAPI"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AppCompatResources {
    private AppCompatResources() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.res.ColorStateList getColorStateList(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.ColorRes int r1) {
            android.content.res.ColorStateList r0 = androidx.core.content.ContextCompat.getColorStateList(r0, r1)
            return r0
    }

    @androidx.annotation.Nullable
    public static android.graphics.drawable.Drawable getDrawable(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.DrawableRes int r2) {
            androidx.appcompat.widget.ResourceManagerInternal r0 = androidx.appcompat.widget.ResourceManagerInternal.get()
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r1, r2)
            return r1
    }
}
