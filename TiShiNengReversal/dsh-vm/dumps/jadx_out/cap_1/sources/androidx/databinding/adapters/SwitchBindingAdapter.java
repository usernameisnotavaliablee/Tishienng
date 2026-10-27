package androidx.databinding.adapters;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.databinding.BindingMethods({@androidx.databinding.BindingMethod(attribute = "android:thumb", method = "setThumbDrawable", type = android.widget.Switch.class), @androidx.databinding.BindingMethod(attribute = "android:track", method = "setTrackDrawable", type = android.widget.Switch.class)})
@android.annotation.TargetApi(14)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SwitchBindingAdapter {
    public SwitchBindingAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.databinding.BindingAdapter({"android:switchTextAppearance"})
    public static void setSwitchTextAppearance(android.widget.Switch r1, int r2) {
            r0 = 0
            r1.setSwitchTextAppearance(r0, r2)
            return
    }
}
