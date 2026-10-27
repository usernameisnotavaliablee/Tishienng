package androidx.core.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CompoundButtonCompat {
    private static final java.lang.String TAG = "CompoundButtonCompat";
    private static java.lang.reflect.Field sButtonDrawableField;
    private static boolean sButtonDrawableFieldFetched;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.content.res.ColorStateList getButtonTintList(android.widget.CompoundButton r0) {
                android.content.res.ColorStateList r0 = r0.getButtonTintList()
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.graphics.PorterDuff.Mode getButtonTintMode(android.widget.CompoundButton r0) {
                android.graphics.PorterDuff$Mode r0 = r0.getButtonTintMode()
                return r0
        }

        @androidx.annotation.DoNotInline
        static void setButtonTintList(android.widget.CompoundButton r0, android.content.res.ColorStateList r1) {
                r0.setButtonTintList(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setButtonTintMode(android.widget.CompoundButton r0, android.graphics.PorterDuff.Mode r1) {
                r0.setButtonTintMode(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.graphics.drawable.Drawable getButtonDrawable(android.widget.CompoundButton r0) {
                android.graphics.drawable.Drawable r0 = r0.getButtonDrawable()
                return r0
        }
    }

    private CompoundButtonCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.graphics.drawable.Drawable getButtonDrawable(@androidx.annotation.NonNull android.widget.CompoundButton r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            android.graphics.drawable.Drawable r3 = androidx.core.widget.CompoundButtonCompat.Api23Impl.getButtonDrawable(r3)
            return r3
        Lb:
            boolean r0 = androidx.core.widget.CompoundButtonCompat.sButtonDrawableFieldFetched
            if (r0 != 0) goto L1f
            r0 = 1
            java.lang.Class<android.widget.CompoundButton> r1 = android.widget.CompoundButton.class
            java.lang.String r2 = "mButtonDrawable"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L1d
            androidx.core.widget.CompoundButtonCompat.sButtonDrawableField = r1     // Catch: java.lang.NoSuchFieldException -> L1d
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L1d
        L1d:
            androidx.core.widget.CompoundButtonCompat.sButtonDrawableFieldFetched = r0
        L1f:
            java.lang.reflect.Field r0 = androidx.core.widget.CompoundButtonCompat.sButtonDrawableField
            r1 = 0
            if (r0 == 0) goto L2d
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.IllegalAccessException -> L2b
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3     // Catch: java.lang.IllegalAccessException -> L2b
            return r3
        L2b:
            androidx.core.widget.CompoundButtonCompat.sButtonDrawableField = r1
        L2d:
            return r1
    }

    @androidx.annotation.Nullable
    public static android.content.res.ColorStateList getButtonTintList(@androidx.annotation.NonNull android.widget.CompoundButton r0) {
            android.content.res.ColorStateList r0 = androidx.core.widget.CompoundButtonCompat.Api21Impl.getButtonTintList(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public static android.graphics.PorterDuff.Mode getButtonTintMode(@androidx.annotation.NonNull android.widget.CompoundButton r0) {
            android.graphics.PorterDuff$Mode r0 = androidx.core.widget.CompoundButtonCompat.Api21Impl.getButtonTintMode(r0)
            return r0
    }

    public static void setButtonTintList(@androidx.annotation.NonNull android.widget.CompoundButton r0, @androidx.annotation.Nullable android.content.res.ColorStateList r1) {
            androidx.core.widget.CompoundButtonCompat.Api21Impl.setButtonTintList(r0, r1)
            return
    }

    public static void setButtonTintMode(@androidx.annotation.NonNull android.widget.CompoundButton r0, @androidx.annotation.Nullable android.graphics.PorterDuff.Mode r1) {
            androidx.core.widget.CompoundButtonCompat.Api21Impl.setButtonTintMode(r0, r1)
            return
    }
}
