package androidx.core.graphics.drawable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class DrawableCompat {
    private static final java.lang.String TAG = "DrawableCompat";
    private static java.lang.reflect.Method sGetLayoutDirectionMethod;
    private static boolean sGetLayoutDirectionMethodFetched;
    private static java.lang.reflect.Method sSetLayoutDirectionMethod;
    private static boolean sSetLayoutDirectionMethodFetched;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void applyTheme(android.graphics.drawable.Drawable r0, android.content.res.Resources.Theme r1) {
                r0.applyTheme(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static boolean canApplyTheme(android.graphics.drawable.Drawable r0) {
                boolean r0 = r0.canApplyTheme()
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.graphics.ColorFilter getColorFilter(android.graphics.drawable.Drawable r0) {
                android.graphics.ColorFilter r0 = r0.getColorFilter()
                return r0
        }

        @androidx.annotation.DoNotInline
        static void inflate(android.graphics.drawable.Drawable r0, android.content.res.Resources r1, org.xmlpull.v1.XmlPullParser r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
                r0.inflate(r1, r2, r3, r4)
                return
        }

        @androidx.annotation.DoNotInline
        static void setHotspot(android.graphics.drawable.Drawable r0, float r1, float r2) {
                r0.setHotspot(r1, r2)
                return
        }

        @androidx.annotation.DoNotInline
        static void setHotspotBounds(android.graphics.drawable.Drawable r0, int r1, int r2, int r3, int r4) {
                r0.setHotspotBounds(r1, r2, r3, r4)
                return
        }

        @androidx.annotation.DoNotInline
        static void setTint(android.graphics.drawable.Drawable r0, int r1) {
                r0.setTint(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setTintList(android.graphics.drawable.Drawable r0, android.content.res.ColorStateList r1) {
                r0.setTintList(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setTintMode(android.graphics.drawable.Drawable r0, android.graphics.PorterDuff.Mode r1) {
                r0.setTintMode(r1)
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
        static int getLayoutDirection(android.graphics.drawable.Drawable r0) {
                int r0 = r0.getLayoutDirection()
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean setLayoutDirection(android.graphics.drawable.Drawable r0, int r1) {
                boolean r0 = r0.setLayoutDirection(r1)
                return r0
        }
    }

    private DrawableCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void applyTheme(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0, @androidx.annotation.NonNull android.content.res.Resources.Theme r1) {
            androidx.core.graphics.drawable.DrawableCompat.Api21Impl.applyTheme(r0, r1)
            return
    }

    public static boolean canApplyTheme(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0) {
            boolean r0 = androidx.core.graphics.drawable.DrawableCompat.Api21Impl.canApplyTheme(r0)
            return r0
    }

    public static void clearColorFilter(@androidx.annotation.NonNull android.graphics.drawable.Drawable r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            r3.clearColorFilter()
            return
        La:
            r3.clearColorFilter()
            boolean r0 = r3 instanceof android.graphics.drawable.InsetDrawable
            if (r0 == 0) goto L1b
            android.graphics.drawable.InsetDrawable r3 = (android.graphics.drawable.InsetDrawable) r3
            android.graphics.drawable.Drawable r3 = r3.getDrawable()
            clearColorFilter(r3)
            return
        L1b:
            boolean r0 = r3 instanceof androidx.core.graphics.drawable.WrappedDrawable
            if (r0 == 0) goto L29
            androidx.core.graphics.drawable.WrappedDrawable r3 = (androidx.core.graphics.drawable.WrappedDrawable) r3
            android.graphics.drawable.Drawable r3 = r3.getWrappedDrawable()
            clearColorFilter(r3)
            return
        L29:
            boolean r0 = r3 instanceof android.graphics.drawable.DrawableContainer
            if (r0 == 0) goto L4a
            android.graphics.drawable.DrawableContainer r3 = (android.graphics.drawable.DrawableContainer) r3
            android.graphics.drawable.Drawable$ConstantState r3 = r3.getConstantState()
            android.graphics.drawable.DrawableContainer$DrawableContainerState r3 = (android.graphics.drawable.DrawableContainer.DrawableContainerState) r3
            if (r3 == 0) goto L4a
            int r0 = r3.getChildCount()
            r1 = 0
        L3c:
            if (r1 >= r0) goto L4a
            android.graphics.drawable.Drawable r2 = r3.getChild(r1)
            if (r2 == 0) goto L47
            clearColorFilter(r2)
        L47:
            int r1 = r1 + 1
            goto L3c
        L4a:
            return
    }

    public static int getAlpha(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0) {
            int r0 = r0.getAlpha()
            return r0
    }

    @androidx.annotation.Nullable
    public static android.graphics.ColorFilter getColorFilter(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0) {
            android.graphics.ColorFilter r0 = androidx.core.graphics.drawable.DrawableCompat.Api21Impl.getColorFilter(r0)
            return r0
    }

    public static int getLayoutDirection(@androidx.annotation.NonNull android.graphics.drawable.Drawable r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            int r4 = androidx.core.graphics.drawable.DrawableCompat.Api23Impl.getLayoutDirection(r4)
            return r4
        Lb:
            boolean r0 = androidx.core.graphics.drawable.DrawableCompat.sGetLayoutDirectionMethodFetched
            r1 = 0
            if (r0 != 0) goto L20
            r0 = 1
            java.lang.Class<android.graphics.drawable.Drawable> r2 = android.graphics.drawable.Drawable.class
            java.lang.String r3 = "getLayoutDirection"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r1)     // Catch: java.lang.NoSuchMethodException -> L1e
            androidx.core.graphics.drawable.DrawableCompat.sGetLayoutDirectionMethod = r2     // Catch: java.lang.NoSuchMethodException -> L1e
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L1e
        L1e:
            androidx.core.graphics.drawable.DrawableCompat.sGetLayoutDirectionMethodFetched = r0
        L20:
            java.lang.reflect.Method r0 = androidx.core.graphics.drawable.DrawableCompat.sGetLayoutDirectionMethod
            if (r0 == 0) goto L31
            java.lang.Object r4 = r0.invoke(r4, r1)     // Catch: java.lang.Exception -> L2f
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Exception -> L2f
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> L2f
            return r4
        L2f:
            androidx.core.graphics.drawable.DrawableCompat.sGetLayoutDirectionMethod = r1
        L31:
            r4 = 0
            return r4
    }

    public static void inflate(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0, @androidx.annotation.NonNull android.content.res.Resources r1, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r2, @androidx.annotation.NonNull android.util.AttributeSet r3, @androidx.annotation.Nullable android.content.res.Resources.Theme r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            androidx.core.graphics.drawable.DrawableCompat.Api21Impl.inflate(r0, r1, r2, r3, r4)
            return
    }

    public static boolean isAutoMirrored(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0) {
            boolean r0 = r0.isAutoMirrored()
            return r0
    }

    @java.lang.Deprecated
    public static void jumpToCurrentState(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0) {
            r0.jumpToCurrentState()
            return
    }

    public static void setAutoMirrored(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0, boolean r1) {
            r0.setAutoMirrored(r1)
            return
    }

    public static void setHotspot(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0, float r1, float r2) {
            androidx.core.graphics.drawable.DrawableCompat.Api21Impl.setHotspot(r0, r1, r2)
            return
    }

    public static void setHotspotBounds(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0, int r1, int r2, int r3, int r4) {
            androidx.core.graphics.drawable.DrawableCompat.Api21Impl.setHotspotBounds(r0, r1, r2, r3, r4)
            return
    }

    public static boolean setLayoutDirection(@androidx.annotation.NonNull android.graphics.drawable.Drawable r6, int r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            boolean r6 = androidx.core.graphics.drawable.DrawableCompat.Api23Impl.setLayoutDirection(r6, r7)
            return r6
        Lb:
            boolean r0 = androidx.core.graphics.drawable.DrawableCompat.sSetLayoutDirectionMethodFetched
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L26
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            java.lang.String r3 = "setLayoutDirection"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L24
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L24
            r4[r1] = r5     // Catch: java.lang.NoSuchMethodException -> L24
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L24
            androidx.core.graphics.drawable.DrawableCompat.sSetLayoutDirectionMethod = r0     // Catch: java.lang.NoSuchMethodException -> L24
            r0.setAccessible(r2)     // Catch: java.lang.NoSuchMethodException -> L24
        L24:
            androidx.core.graphics.drawable.DrawableCompat.sSetLayoutDirectionMethodFetched = r2
        L26:
            java.lang.reflect.Method r0 = androidx.core.graphics.drawable.DrawableCompat.sSetLayoutDirectionMethod
            if (r0 == 0) goto L39
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L36
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L36
            r3[r1] = r7     // Catch: java.lang.Exception -> L36
            r0.invoke(r6, r3)     // Catch: java.lang.Exception -> L36
            return r2
        L36:
            r6 = 0
            androidx.core.graphics.drawable.DrawableCompat.sSetLayoutDirectionMethod = r6
        L39:
            return r1
    }

    public static void setTint(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0, @androidx.annotation.ColorInt int r1) {
            androidx.core.graphics.drawable.DrawableCompat.Api21Impl.setTint(r0, r1)
            return
    }

    public static void setTintList(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0, @androidx.annotation.Nullable android.content.res.ColorStateList r1) {
            androidx.core.graphics.drawable.DrawableCompat.Api21Impl.setTintList(r0, r1)
            return
    }

    public static void setTintMode(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0, @androidx.annotation.Nullable android.graphics.PorterDuff.Mode r1) {
            androidx.core.graphics.drawable.DrawableCompat.Api21Impl.setTintMode(r0, r1)
            return
    }

    public static <T extends android.graphics.drawable.Drawable> T unwrap(@androidx.annotation.NonNull android.graphics.drawable.Drawable r1) {
            boolean r0 = r1 instanceof androidx.core.graphics.drawable.WrappedDrawable
            if (r0 == 0) goto La
            androidx.core.graphics.drawable.WrappedDrawable r1 = (androidx.core.graphics.drawable.WrappedDrawable) r1
            android.graphics.drawable.Drawable r1 = r1.getWrappedDrawable()
        La:
            return r1
    }

    @androidx.annotation.NonNull
    public static android.graphics.drawable.Drawable wrap(@androidx.annotation.NonNull android.graphics.drawable.Drawable r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L7
            goto L11
        L7:
            boolean r0 = r2 instanceof androidx.core.graphics.drawable.TintAwareDrawable
            if (r0 != 0) goto L11
            androidx.core.graphics.drawable.WrappedDrawableApi21 r0 = new androidx.core.graphics.drawable.WrappedDrawableApi21
            r0.<init>(r2)
            return r0
        L11:
            return r2
    }
}
