package androidx.appcompat.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class DrawableUtils {
    private static final int[] CHECKED_STATE_SET = null;
    private static final int[] EMPTY_STATE_SET = null;
    public static final android.graphics.Rect INSETS_NONE = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(18)
    static class Api18Impl {
        private static final java.lang.reflect.Field sBottom = null;
        private static final java.lang.reflect.Method sGetOpticalInsets = null;
        private static final java.lang.reflect.Field sLeft = null;
        private static final boolean sReflectionSuccessful = false;
        private static final java.lang.reflect.Field sRight = null;
        private static final java.lang.reflect.Field sTop = null;

        static {
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L46 java.lang.ClassNotFoundException -> L4a java.lang.NoSuchMethodException -> L4e
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.reflect.Method r4 = r4.getMethod(r5, r1)     // Catch: java.lang.NoSuchFieldException -> L46 java.lang.ClassNotFoundException -> L4a java.lang.NoSuchMethodException -> L4e
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L3a java.lang.ClassNotFoundException -> L3e java.lang.NoSuchMethodException -> L42
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L30 java.lang.ClassNotFoundException -> L34 java.lang.NoSuchMethodException -> L37
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2d
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L2b
                r8 = 1
                goto L54
            L2b:
                goto L52
            L2d:
                r7 = r1
                goto L52
            L30:
                r6 = r1
            L32:
                r7 = r6
                goto L52
            L34:
                r6 = r1
                goto L32
            L37:
                r6 = r1
                goto L32
            L3a:
                r5 = r1
            L3c:
                r6 = r5
                goto L32
            L3e:
                r5 = r1
            L40:
                r6 = r5
                goto L32
            L42:
                r5 = r1
            L44:
                r6 = r5
                goto L32
            L46:
                r4 = r1
                r5 = r4
                goto L3c
            L4a:
                r4 = r1
                r5 = r4
                goto L40
            L4e:
                r4 = r1
                r5 = r4
                goto L44
            L52:
                r3 = r1
                r8 = 0
            L54:
                if (r8 == 0) goto L63
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sGetOpticalInsets = r4
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sLeft = r5
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sTop = r6
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sRight = r7
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sBottom = r3
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sReflectionSuccessful = r0
                goto L6f
            L63:
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sGetOpticalInsets = r1
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sLeft = r1
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sTop = r1
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sRight = r1
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sBottom = r1
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sReflectionSuccessful = r2
            L6f:
                return
        }

        private Api18Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        static android.graphics.Rect getOpticalInsets(@androidx.annotation.NonNull android.graphics.drawable.Drawable r5) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 >= r1) goto L31
                boolean r0 = androidx.appcompat.widget.DrawableUtils.Api18Impl.sReflectionSuccessful
                if (r0 == 0) goto L31
                java.lang.reflect.Method r0 = androidx.appcompat.widget.DrawableUtils.Api18Impl.sGetOpticalInsets     // Catch: java.lang.Throwable -> L31
                r1 = 0
                java.lang.Object r5 = r0.invoke(r5, r1)     // Catch: java.lang.Throwable -> L31
                if (r5 == 0) goto L31
                android.graphics.Rect r0 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L31
                java.lang.reflect.Field r1 = androidx.appcompat.widget.DrawableUtils.Api18Impl.sLeft     // Catch: java.lang.Throwable -> L31
                int r1 = r1.getInt(r5)     // Catch: java.lang.Throwable -> L31
                java.lang.reflect.Field r2 = androidx.appcompat.widget.DrawableUtils.Api18Impl.sTop     // Catch: java.lang.Throwable -> L31
                int r2 = r2.getInt(r5)     // Catch: java.lang.Throwable -> L31
                java.lang.reflect.Field r3 = androidx.appcompat.widget.DrawableUtils.Api18Impl.sRight     // Catch: java.lang.Throwable -> L31
                int r3 = r3.getInt(r5)     // Catch: java.lang.Throwable -> L31
                java.lang.reflect.Field r4 = androidx.appcompat.widget.DrawableUtils.Api18Impl.sBottom     // Catch: java.lang.Throwable -> L31
                int r5 = r4.getInt(r5)     // Catch: java.lang.Throwable -> L31
                r0.<init>(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L31
                return r0
            L31:
                android.graphics.Rect r5 = androidx.appcompat.widget.DrawableUtils.INSETS_NONE
                return r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(29)
    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.graphics.Insets getOpticalInsets(android.graphics.drawable.Drawable r0) {
                android.graphics.Insets r0 = r0.getOpticalInsets()
                return r0
        }
    }

    static {
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            androidx.appcompat.widget.DrawableUtils.CHECKED_STATE_SET = r0
            r0 = 0
            int[] r0 = new int[r0]
            androidx.appcompat.widget.DrawableUtils.EMPTY_STATE_SET = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            androidx.appcompat.widget.DrawableUtils.INSETS_NONE = r0
            return
    }

    private DrawableUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean canSafelyMutateDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r0) {
            r0 = 1
            return r0
    }

    static void fixDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r3) {
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 != r2) goto L1a
            java.lang.String r2 = "android.graphics.drawable.VectorDrawable"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L1a
            forceDrawableStateChange(r3)
            return
        L1a:
            r2 = 29
            if (r1 < r2) goto L2d
            r2 = 31
            if (r1 >= r2) goto L2d
            java.lang.String r1 = "android.graphics.drawable.ColorStateListDrawable"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2d
            forceDrawableStateChange(r3)
        L2d:
            return
    }

    private static void forceDrawableStateChange(android.graphics.drawable.Drawable r2) {
            int[] r0 = r2.getState()
            if (r0 == 0) goto L10
            int r1 = r0.length
            if (r1 != 0) goto La
            goto L10
        La:
            int[] r1 = androidx.appcompat.widget.DrawableUtils.EMPTY_STATE_SET
            r2.setState(r1)
            goto L15
        L10:
            int[] r1 = androidx.appcompat.widget.DrawableUtils.CHECKED_STATE_SET
            r2.setState(r1)
        L15:
            r2.setState(r0)
            return
    }

    @androidx.annotation.NonNull
    public static android.graphics.Rect getOpticalBounds(@androidx.annotation.NonNull android.graphics.drawable.Drawable r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L20
            android.graphics.Insets r4 = androidx.appcompat.widget.DrawableUtils.Api29Impl.getOpticalInsets(r4)
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = androidx.appcompat.widget.f.a(r4)
            int r2 = androidx.appcompat.widget.g.a(r4)
            int r3 = androidx.appcompat.widget.h.a(r4)
            int r4 = androidx.appcompat.widget.i.a(r4)
            r0.<init>(r1, r2, r3, r4)
            return r0
        L20:
            android.graphics.drawable.Drawable r4 = androidx.core.graphics.drawable.DrawableCompat.unwrap(r4)
            android.graphics.Rect r4 = androidx.appcompat.widget.DrawableUtils.Api18Impl.getOpticalInsets(r4)
            return r4
    }

    public static android.graphics.PorterDuff.Mode parseTintMode(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = 3
            if (r1 == r0) goto L1d
            r0 = 5
            if (r1 == r0) goto L1a
            r0 = 9
            if (r1 == r0) goto L17
            switch(r1) {
                case 14: goto L14;
                case 15: goto L11;
                case 16: goto Le;
                default: goto Ld;
            }
        Ld:
            return r2
        Le:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.ADD
            return r1
        L11:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SCREEN
            return r1
        L14:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            return r1
        L17:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            return r1
        L1a:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            return r1
        L1d:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OVER
            return r1
    }
}
