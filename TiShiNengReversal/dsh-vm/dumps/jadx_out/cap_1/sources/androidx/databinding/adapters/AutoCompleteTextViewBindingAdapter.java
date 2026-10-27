package androidx.databinding.adapters;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.databinding.BindingMethods({@androidx.databinding.BindingMethod(attribute = "android:completionThreshold", method = "setThreshold", type = android.widget.AutoCompleteTextView.class), @androidx.databinding.BindingMethod(attribute = "android:popupBackground", method = "setDropDownBackgroundDrawable", type = android.widget.AutoCompleteTextView.class), @androidx.databinding.BindingMethod(attribute = "android:onDismiss", method = "setOnDismissListener", type = android.widget.AutoCompleteTextView.class), @androidx.databinding.BindingMethod(attribute = "android:onItemClick", method = "setOnItemClickListener", type = android.widget.AutoCompleteTextView.class)})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class AutoCompleteTextViewBindingAdapter {


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface FixText {
        java.lang.CharSequence fixText(java.lang.CharSequence r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface IsValid {
        boolean isValid(java.lang.CharSequence r1);
    }

    public AutoCompleteTextViewBindingAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.databinding.BindingAdapter(requireAll = false, value = {"android:onItemSelected", "android:onNothingSelected"})
    public static void setOnItemSelectedListener(android.widget.AutoCompleteTextView r2, androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelected r3, androidx.databinding.adapters.AdapterViewBindingAdapter.OnNothingSelected r4) {
            r0 = 0
            if (r3 != 0) goto L9
            if (r4 != 0) goto L9
            r2.setOnItemSelectedListener(r0)
            return
        L9:
            androidx.databinding.adapters.AdapterViewBindingAdapter$OnItemSelectedComponentListener r1 = new androidx.databinding.adapters.AdapterViewBindingAdapter$OnItemSelectedComponentListener
            r1.<init>(r3, r4, r0)
            r2.setOnItemSelectedListener(r1)
            return
    }

    @androidx.databinding.BindingAdapter(requireAll = false, value = {"android:fixText", "android:isValid"})
    public static void setValidator(android.widget.AutoCompleteTextView r1, androidx.databinding.adapters.AutoCompleteTextViewBindingAdapter.FixText r2, androidx.databinding.adapters.AutoCompleteTextViewBindingAdapter.IsValid r3) {
            if (r2 != 0) goto L9
            if (r3 != 0) goto L9
            r2 = 0
            r1.setValidator(r2)
            return
        L9:
            androidx.databinding.adapters.AutoCompleteTextViewBindingAdapter$1 r0 = new androidx.databinding.adapters.AutoCompleteTextViewBindingAdapter$1
            r0.<init>(r3, r2)
            r1.setValidator(r0)
            return
    }
}
