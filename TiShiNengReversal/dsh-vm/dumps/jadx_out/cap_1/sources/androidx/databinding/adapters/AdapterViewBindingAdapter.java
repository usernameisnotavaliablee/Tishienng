package androidx.databinding.adapters;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.databinding.BindingMethods({@androidx.databinding.BindingMethod(attribute = "android:onItemClick", method = "setOnItemClickListener", type = android.widget.AdapterView.class), @androidx.databinding.BindingMethod(attribute = "android:onItemLongClick", method = "setOnItemLongClickListener", type = android.widget.AdapterView.class)})
@androidx.databinding.InverseBindingMethods({@androidx.databinding.InverseBindingMethod(attribute = "android:selectedItemPosition", type = android.widget.AdapterView.class), @androidx.databinding.InverseBindingMethod(attribute = "android:selection", event = "android:selectedItemPositionAttrChanged", method = "getSelectedItemPosition", type = android.widget.AdapterView.class)})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class AdapterViewBindingAdapter {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnItemSelected {
        void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class OnItemSelectedComponentListener implements android.widget.AdapterView.OnItemSelectedListener {
        private final androidx.databinding.InverseBindingListener mAttrChanged;
        private final androidx.databinding.adapters.AdapterViewBindingAdapter.OnNothingSelected mNothingSelected;
        private final androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelected mSelected;

        public OnItemSelectedComponentListener(androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelected r1, androidx.databinding.adapters.AdapterViewBindingAdapter.OnNothingSelected r2, androidx.databinding.InverseBindingListener r3) {
                r0 = this;
                r0.<init>()
                r0.mSelected = r1
                r0.mNothingSelected = r2
                r0.mAttrChanged = r3
                return
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(android.widget.AdapterView<?> r7, android.view.View r8, int r9, long r10) {
                r6 = this;
                androidx.databinding.adapters.AdapterViewBindingAdapter$OnItemSelected r0 = r6.mSelected
                if (r0 == 0) goto Lb
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r0.onItemSelected(r1, r2, r3, r4)
            Lb:
                androidx.databinding.InverseBindingListener r7 = r6.mAttrChanged
                if (r7 == 0) goto L12
                r7.onChange()
            L12:
                return
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(android.widget.AdapterView<?> r2) {
                r1 = this;
                androidx.databinding.adapters.AdapterViewBindingAdapter$OnNothingSelected r0 = r1.mNothingSelected
                if (r0 == 0) goto L7
                r0.onNothingSelected(r2)
            L7:
                androidx.databinding.InverseBindingListener r2 = r1.mAttrChanged
                if (r2 == 0) goto Le
                r2.onChange()
            Le:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnNothingSelected {
        void onNothingSelected(android.widget.AdapterView<?> r1);
    }

    public AdapterViewBindingAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.databinding.BindingAdapter(requireAll = false, value = {"android:onItemSelected", "android:onNothingSelected", "android:selectedItemPositionAttrChanged"})
    public static void setOnItemSelectedListener(android.widget.AdapterView r1, androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelected r2, androidx.databinding.adapters.AdapterViewBindingAdapter.OnNothingSelected r3, androidx.databinding.InverseBindingListener r4) {
            if (r2 != 0) goto Lb
            if (r3 != 0) goto Lb
            if (r4 != 0) goto Lb
            r2 = 0
            r1.setOnItemSelectedListener(r2)
            return
        Lb:
            androidx.databinding.adapters.AdapterViewBindingAdapter$OnItemSelectedComponentListener r0 = new androidx.databinding.adapters.AdapterViewBindingAdapter$OnItemSelectedComponentListener
            r0.<init>(r2, r3, r4)
            r1.setOnItemSelectedListener(r0)
            return
    }

    @androidx.databinding.BindingAdapter({"android:selectedItemPosition"})
    public static void setSelectedItemPosition(android.widget.AdapterView r1, int r2) {
            int r0 = r1.getSelectedItemPosition()
            if (r0 == r2) goto L9
            r1.setSelection(r2)
        L9:
            return
    }

    @androidx.databinding.BindingAdapter({"android:selectedItemPosition", "android:adapter"})
    public static void setSelectedItemPosition(android.widget.AdapterView r1, int r2, android.widget.Adapter r3) {
            android.widget.Adapter r0 = r1.getAdapter()
            if (r3 == r0) goto Ld
            r1.setAdapter(r3)
            r1.setSelection(r2)
            return
        Ld:
            int r3 = r1.getSelectedItemPosition()
            if (r3 == r2) goto L16
            r1.setSelection(r2)
        L16:
            return
    }

    @androidx.databinding.BindingAdapter({"android:selection"})
    public static void setSelection(android.widget.AdapterView r0, int r1) {
            setSelectedItemPosition(r0, r1)
            return
    }

    @androidx.databinding.BindingAdapter({"android:selection", "android:adapter"})
    public static void setSelection(android.widget.AdapterView r0, int r1, android.widget.Adapter r2) {
            setSelectedItemPosition(r0, r1, r2)
            return
    }
}
