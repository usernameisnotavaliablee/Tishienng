package androidx.databinding.adapters;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.databinding.InverseBindingMethods({@androidx.databinding.InverseBindingMethod(attribute = "android:checkedButton", method = "getCheckedRadioButtonId", type = android.widget.RadioGroup.class)})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class RadioGroupBindingAdapter {


    public RadioGroupBindingAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.databinding.BindingAdapter({"android:checkedButton"})
    public static void setCheckedButton(android.widget.RadioGroup r1, int r2) {
            int r0 = r1.getCheckedRadioButtonId()
            if (r2 == r0) goto L9
            r1.check(r2)
        L9:
            return
    }

    @androidx.databinding.BindingAdapter(requireAll = false, value = {"android:onCheckedChanged", "android:checkedButtonAttrChanged"})
    public static void setListeners(android.widget.RadioGroup r1, android.widget.RadioGroup.OnCheckedChangeListener r2, androidx.databinding.InverseBindingListener r3) {
            if (r3 != 0) goto L6
            r1.setOnCheckedChangeListener(r2)
            return
        L6:
            androidx.databinding.adapters.RadioGroupBindingAdapter$1 r0 = new androidx.databinding.adapters.RadioGroupBindingAdapter$1
            r0.<init>(r2, r3)
            r1.setOnCheckedChangeListener(r0)
            return
    }
}
