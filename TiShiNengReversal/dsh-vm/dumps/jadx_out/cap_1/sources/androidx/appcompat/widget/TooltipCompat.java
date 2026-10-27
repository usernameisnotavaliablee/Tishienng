package androidx.appcompat.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class TooltipCompat {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(26)
    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void setTooltipText(android.view.View r0, java.lang.CharSequence r1) {
                r0.setTooltipText(r1)
                return
        }
    }

    private TooltipCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void setTooltipText(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable java.lang.CharSequence r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto La
            androidx.appcompat.widget.TooltipCompat.Api26Impl.setTooltipText(r2, r3)
            return
        La:
            androidx.appcompat.widget.TooltipCompatHandler.setTooltipText(r2, r3)
            return
    }
}
