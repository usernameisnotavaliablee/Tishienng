package androidx.databinding.adapters;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.databinding.InverseBindingMethods({@androidx.databinding.InverseBindingMethod(attribute = "android:rating", type = android.widget.RatingBar.class)})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class RatingBarBindingAdapter {


    public RatingBarBindingAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.databinding.BindingAdapter(requireAll = false, value = {"android:onRatingChanged", "android:ratingAttrChanged"})
    public static void setListeners(android.widget.RatingBar r1, android.widget.RatingBar.OnRatingBarChangeListener r2, androidx.databinding.InverseBindingListener r3) {
            if (r3 != 0) goto L6
            r1.setOnRatingBarChangeListener(r2)
            return
        L6:
            androidx.databinding.adapters.RatingBarBindingAdapter$1 r0 = new androidx.databinding.adapters.RatingBarBindingAdapter$1
            r0.<init>(r2, r3)
            r1.setOnRatingBarChangeListener(r0)
            return
    }

    @androidx.databinding.BindingAdapter({"android:rating"})
    public static void setRating(android.widget.RatingBar r1, float r2) {
            float r0 = r1.getRating()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.setRating(r2)
        Lb:
            return
    }
}
