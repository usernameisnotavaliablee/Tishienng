package androidx.databinding.adapters;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.databinding.InverseBindingMethods({@androidx.databinding.InverseBindingMethod(attribute = "android:progress", type = android.widget.SeekBar.class)})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SeekBarBindingAdapter {


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnProgressChanged {
        void onProgressChanged(android.widget.SeekBar r1, int r2, boolean r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnStartTrackingTouch {
        void onStartTrackingTouch(android.widget.SeekBar r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnStopTrackingTouch {
        void onStopTrackingTouch(android.widget.SeekBar r1);
    }

    public SeekBarBindingAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.databinding.BindingAdapter(requireAll = false, value = {"android:onStartTrackingTouch", "android:onStopTrackingTouch", "android:onProgressChanged", "android:progressAttrChanged"})
    public static void setOnSeekBarChangeListener(android.widget.SeekBar r1, androidx.databinding.adapters.SeekBarBindingAdapter.OnStartTrackingTouch r2, androidx.databinding.adapters.SeekBarBindingAdapter.OnStopTrackingTouch r3, androidx.databinding.adapters.SeekBarBindingAdapter.OnProgressChanged r4, androidx.databinding.InverseBindingListener r5) {
            if (r2 != 0) goto Ld
            if (r3 != 0) goto Ld
            if (r4 != 0) goto Ld
            if (r5 != 0) goto Ld
            r2 = 0
            r1.setOnSeekBarChangeListener(r2)
            return
        Ld:
            androidx.databinding.adapters.SeekBarBindingAdapter$1 r0 = new androidx.databinding.adapters.SeekBarBindingAdapter$1
            r0.<init>(r4, r5, r2, r3)
            r1.setOnSeekBarChangeListener(r0)
            return
    }

    @androidx.databinding.BindingAdapter({"android:progress"})
    public static void setProgress(android.widget.SeekBar r1, int r2) {
            int r0 = r1.getProgress()
            if (r2 == r0) goto L9
            r1.setProgress(r2)
        L9:
            return
    }
}
