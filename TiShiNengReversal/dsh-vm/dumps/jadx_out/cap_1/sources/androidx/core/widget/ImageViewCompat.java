package androidx.core.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ImageViewCompat {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.content.res.ColorStateList getImageTintList(android.widget.ImageView r0) {
                android.content.res.ColorStateList r0 = r0.getImageTintList()
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.graphics.PorterDuff.Mode getImageTintMode(android.widget.ImageView r0) {
                android.graphics.PorterDuff$Mode r0 = r0.getImageTintMode()
                return r0
        }

        @androidx.annotation.DoNotInline
        static void setImageTintList(android.widget.ImageView r0, android.content.res.ColorStateList r1) {
                r0.setImageTintList(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setImageTintMode(android.widget.ImageView r0, android.graphics.PorterDuff.Mode r1) {
                r0.setImageTintMode(r1)
                return
        }
    }

    private ImageViewCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.content.res.ColorStateList getImageTintList(@androidx.annotation.NonNull android.widget.ImageView r0) {
            android.content.res.ColorStateList r0 = androidx.core.widget.ImageViewCompat.Api21Impl.getImageTintList(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public static android.graphics.PorterDuff.Mode getImageTintMode(@androidx.annotation.NonNull android.widget.ImageView r0) {
            android.graphics.PorterDuff$Mode r0 = androidx.core.widget.ImageViewCompat.Api21Impl.getImageTintMode(r0)
            return r0
    }

    public static void setImageTintList(@androidx.annotation.NonNull android.widget.ImageView r1, @androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            androidx.core.widget.ImageViewCompat.Api21Impl.setImageTintList(r1, r2)
            r2 = 21
            if (r0 != r2) goto L25
            android.graphics.drawable.Drawable r2 = r1.getDrawable()
            if (r2 == 0) goto L25
            android.content.res.ColorStateList r0 = androidx.core.widget.ImageViewCompat.Api21Impl.getImageTintList(r1)
            if (r0 == 0) goto L25
            boolean r0 = r2.isStateful()
            if (r0 == 0) goto L22
            int[] r0 = r1.getDrawableState()
            r2.setState(r0)
        L22:
            r1.setImageDrawable(r2)
        L25:
            return
    }

    public static void setImageTintMode(@androidx.annotation.NonNull android.widget.ImageView r1, @androidx.annotation.Nullable android.graphics.PorterDuff.Mode r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            androidx.core.widget.ImageViewCompat.Api21Impl.setImageTintMode(r1, r2)
            r2 = 21
            if (r0 != r2) goto L25
            android.graphics.drawable.Drawable r2 = r1.getDrawable()
            if (r2 == 0) goto L25
            android.content.res.ColorStateList r0 = androidx.core.widget.ImageViewCompat.Api21Impl.getImageTintList(r1)
            if (r0 == 0) goto L25
            boolean r0 = r2.isStateful()
            if (r0 == 0) goto L22
            int[] r0 = r1.getDrawableState()
            r2.setState(r0)
        L22:
            r1.setImageDrawable(r2)
        L25:
            return
    }
}
