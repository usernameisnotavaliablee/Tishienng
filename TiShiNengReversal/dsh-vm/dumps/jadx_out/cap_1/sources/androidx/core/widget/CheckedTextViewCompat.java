package androidx.core.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CheckedTextViewCompat {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    private static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.Nullable
        static android.content.res.ColorStateList getCheckMarkTintList(@androidx.annotation.NonNull android.widget.CheckedTextView r0) {
                android.content.res.ColorStateList r0 = r0.getCheckMarkTintList()
                return r0
        }

        @androidx.annotation.Nullable
        static android.graphics.PorterDuff.Mode getCheckMarkTintMode(@androidx.annotation.NonNull android.widget.CheckedTextView r0) {
                android.graphics.PorterDuff$Mode r0 = r0.getCheckMarkTintMode()
                return r0
        }

        static void setCheckMarkTintList(@androidx.annotation.NonNull android.widget.CheckedTextView r0, @androidx.annotation.Nullable android.content.res.ColorStateList r1) {
                r0.setCheckMarkTintList(r1)
                return
        }

        static void setCheckMarkTintMode(@androidx.annotation.NonNull android.widget.CheckedTextView r0, @androidx.annotation.Nullable android.graphics.PorterDuff.Mode r1) {
                r0.setCheckMarkTintMode(r1)
                return
        }
    }

    private CheckedTextViewCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.graphics.drawable.Drawable getCheckMarkDrawable(@androidx.annotation.NonNull android.widget.CheckedTextView r0) {
            android.graphics.drawable.Drawable r0 = r0.getCheckMarkDrawable()
            return r0
    }

    @androidx.annotation.Nullable
    public static android.content.res.ColorStateList getCheckMarkTintList(@androidx.annotation.NonNull android.widget.CheckedTextView r0) {
            android.content.res.ColorStateList r0 = androidx.core.widget.CheckedTextViewCompat.Api21Impl.getCheckMarkTintList(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public static android.graphics.PorterDuff.Mode getCheckMarkTintMode(@androidx.annotation.NonNull android.widget.CheckedTextView r0) {
            android.graphics.PorterDuff$Mode r0 = androidx.core.widget.CheckedTextViewCompat.Api21Impl.getCheckMarkTintMode(r0)
            return r0
    }

    public static void setCheckMarkTintList(@androidx.annotation.NonNull android.widget.CheckedTextView r0, @androidx.annotation.Nullable android.content.res.ColorStateList r1) {
            androidx.core.widget.CheckedTextViewCompat.Api21Impl.setCheckMarkTintList(r0, r1)
            return
    }

    public static void setCheckMarkTintMode(@androidx.annotation.NonNull android.widget.CheckedTextView r0, @androidx.annotation.Nullable android.graphics.PorterDuff.Mode r1) {
            androidx.core.widget.CheckedTextViewCompat.Api21Impl.setCheckMarkTintMode(r0, r1)
            return
    }
}
