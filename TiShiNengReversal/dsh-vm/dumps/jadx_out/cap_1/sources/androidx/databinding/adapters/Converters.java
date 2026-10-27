package androidx.databinding.adapters;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class Converters {
    public Converters() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.databinding.BindingConversion
    public static android.content.res.ColorStateList convertColorToColorStateList(int r0) {
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            return r0
    }

    @androidx.databinding.BindingConversion
    public static android.graphics.drawable.ColorDrawable convertColorToDrawable(int r1) {
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            return r0
    }
}
