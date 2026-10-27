package androidx.databinding.adapters;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.databinding.BindingMethods({@androidx.databinding.BindingMethod(attribute = "android:tint", method = "setImageTintList", type = android.widget.ImageView.class), @androidx.databinding.BindingMethod(attribute = "android:tintMode", method = "setImageTintMode", type = android.widget.ImageView.class)})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ImageViewBindingAdapter {
    public ImageViewBindingAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.databinding.BindingAdapter({"android:src"})
    public static void setImageDrawable(android.widget.ImageView r0, android.graphics.drawable.Drawable r1) {
            r0.setImageDrawable(r1)
            return
    }

    @androidx.databinding.BindingAdapter({"android:src"})
    public static void setImageUri(android.widget.ImageView r0, android.net.Uri r1) {
            r0.setImageURI(r1)
            return
    }

    @androidx.databinding.BindingAdapter({"android:src"})
    public static void setImageUri(android.widget.ImageView r0, java.lang.String r1) {
            if (r1 != 0) goto L7
            r1 = 0
            r0.setImageURI(r1)
            return
        L7:
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.setImageURI(r1)
            return
    }
}
