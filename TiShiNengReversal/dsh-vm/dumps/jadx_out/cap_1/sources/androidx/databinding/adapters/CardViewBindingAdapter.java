package androidx.databinding.adapters;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.databinding.BindingMethods({@androidx.databinding.BindingMethod(attribute = "cardCornerRadius", method = "setRadius", type = androidx.cardview.widget.CardView.class), @androidx.databinding.BindingMethod(attribute = "cardMaxElevation", method = "setMaxCardElevation", type = androidx.cardview.widget.CardView.class), @androidx.databinding.BindingMethod(attribute = "cardPreventCornerOverlap", method = "setPreventCornerOverlap", type = androidx.cardview.widget.CardView.class), @androidx.databinding.BindingMethod(attribute = "cardUseCompatPadding", method = "setUseCompatPadding", type = androidx.cardview.widget.CardView.class)})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class CardViewBindingAdapter {
    public CardViewBindingAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.databinding.BindingAdapter({"contentPadding"})
    public static void setContentPadding(androidx.cardview.widget.CardView r0, int r1) {
            r0.setContentPadding(r1, r1, r1, r1)
            return
    }

    @androidx.databinding.BindingAdapter({"contentPaddingBottom"})
    public static void setContentPaddingBottom(androidx.cardview.widget.CardView r3, int r4) {
            int r0 = r3.getContentPaddingLeft()
            int r1 = r3.getContentPaddingTop()
            int r2 = r3.getContentPaddingRight()
            r3.setContentPadding(r0, r1, r2, r4)
            return
    }

    @androidx.databinding.BindingAdapter({"contentPaddingLeft"})
    public static void setContentPaddingLeft(androidx.cardview.widget.CardView r3, int r4) {
            int r0 = r3.getContentPaddingTop()
            int r1 = r3.getContentPaddingRight()
            int r2 = r3.getContentPaddingBottom()
            r3.setContentPadding(r4, r0, r1, r2)
            return
    }

    @androidx.databinding.BindingAdapter({"contentPaddingRight"})
    public static void setContentPaddingRight(androidx.cardview.widget.CardView r3, int r4) {
            int r0 = r3.getContentPaddingLeft()
            int r1 = r3.getContentPaddingTop()
            int r2 = r3.getContentPaddingBottom()
            r3.setContentPadding(r0, r1, r4, r2)
            return
    }

    @androidx.databinding.BindingAdapter({"contentPaddingTop"})
    public static void setContentPaddingTop(androidx.cardview.widget.CardView r3, int r4) {
            int r0 = r3.getContentPaddingLeft()
            int r1 = r3.getContentPaddingRight()
            int r2 = r3.getContentPaddingBottom()
            r3.setContentPadding(r0, r4, r1, r2)
            return
    }
}
