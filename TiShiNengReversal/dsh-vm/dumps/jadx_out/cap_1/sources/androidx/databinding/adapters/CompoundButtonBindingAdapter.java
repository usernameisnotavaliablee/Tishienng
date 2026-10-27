package androidx.databinding.adapters;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.databinding.BindingMethods({@androidx.databinding.BindingMethod(attribute = "android:buttonTint", method = "setButtonTintList", type = android.widget.CompoundButton.class), @androidx.databinding.BindingMethod(attribute = "android:onCheckedChanged", method = "setOnCheckedChangeListener", type = android.widget.CompoundButton.class)})
@androidx.databinding.InverseBindingMethods({@androidx.databinding.InverseBindingMethod(attribute = "android:checked", type = android.widget.CompoundButton.class)})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class CompoundButtonBindingAdapter {


    public CompoundButtonBindingAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.databinding.BindingAdapter({"android:checked"})
    public static void setChecked(android.widget.CompoundButton r1, boolean r2) {
            boolean r0 = r1.isChecked()
            if (r0 == r2) goto L9
            r1.setChecked(r2)
        L9:
            return
    }

    @androidx.databinding.BindingAdapter(requireAll = false, value = {"android:onCheckedChanged", "android:checkedAttrChanged"})
    public static void setListeners(android.widget.CompoundButton r1, android.widget.CompoundButton.OnCheckedChangeListener r2, androidx.databinding.InverseBindingListener r3) {
            if (r3 != 0) goto L6
            r1.setOnCheckedChangeListener(r2)
            return
        L6:
            androidx.databinding.adapters.CompoundButtonBindingAdapter$1 r0 = new androidx.databinding.adapters.CompoundButtonBindingAdapter$1
            r0.<init>(r2, r3)
            r1.setOnCheckedChangeListener(r0)
            return
    }
}
