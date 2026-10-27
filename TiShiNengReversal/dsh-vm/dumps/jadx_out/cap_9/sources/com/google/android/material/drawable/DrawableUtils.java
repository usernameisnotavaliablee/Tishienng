package com.google.android.material.drawable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class DrawableUtils {
    public static final int INTRINSIC_SIZE = -1;
    private static final int UNSPECIFIED_HEIGHT = -1;
    private static final int UNSPECIFIED_WIDTH = -1;

    private DrawableUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.graphics.drawable.Drawable compositeTwoLayeredDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1, @androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r0 = -1
            android.graphics.drawable.Drawable r1 = compositeTwoLayeredDrawable(r1, r2, r0, r0)
            return r1
    }

    @androidx.annotation.Nullable
    public static android.graphics.drawable.Drawable compositeTwoLayeredDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r12, @androidx.annotation.Nullable android.graphics.drawable.Drawable r13, @androidx.annotation.Px int r14, @androidx.annotation.Px int r15) {
            if (r12 != 0) goto L3
            return r13
        L3:
            if (r13 != 0) goto L6
            return r12
        L6:
            r0 = -1
            if (r14 != r0) goto Ld
            int r14 = getTopLayerIntrinsicWidth(r12, r13)
        Ld:
            if (r15 != r0) goto L13
            int r15 = getTopLayerIntrinsicHeight(r12, r13)
        L13:
            int r0 = r12.getIntrinsicWidth()
            if (r14 > r0) goto L20
            int r0 = r12.getIntrinsicHeight()
            if (r15 > r0) goto L20
            goto L45
        L20:
            float r14 = (float) r14
            float r15 = (float) r15
            float r14 = r14 / r15
            int r15 = r12.getIntrinsicWidth()
            float r15 = (float) r15
            int r0 = r12.getIntrinsicHeight()
            float r0 = (float) r0
            float r15 = r15 / r0
            int r15 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r15 < 0) goto L3d
            int r15 = r12.getIntrinsicWidth()
            float r0 = (float) r15
            float r0 = r0 / r14
            int r14 = (int) r0
            r11 = r15
            r15 = r14
            r14 = r11
            goto L45
        L3d:
            int r15 = r12.getIntrinsicHeight()
            float r0 = (float) r15
            float r14 = r14 * r0
            int r14 = (int) r14
        L45:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 < r1) goto L62
            android.graphics.drawable.LayerDrawable r0 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r3]
            r1[r2] = r12
            r1[r4] = r13
            r0.<init>(r1)
            h1.a.a(r0, r4, r14, r15)
            r12 = 17
            h1.b.a(r0, r4, r12)
            return r0
        L62:
            com.google.android.material.drawable.ScaledDrawableWrapper r0 = new com.google.android.material.drawable.ScaledDrawableWrapper
            r0.<init>(r13, r14, r15)
            android.graphics.drawable.Drawable r13 = r0.getDrawable()
            android.graphics.drawable.LayerDrawable r5 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r3]
            r0[r2] = r12
            r0[r4] = r13
            r5.<init>(r0)
            int r13 = r12.getIntrinsicWidth()
            int r13 = r13 - r14
            int r13 = r13 / r3
            int r7 = java.lang.Math.max(r13, r2)
            int r12 = r12.getIntrinsicHeight()
            int r12 = r12 - r15
            int r12 = r12 / r3
            int r8 = java.lang.Math.max(r12, r2)
            r6 = 1
            r9 = r7
            r10 = r8
            r5.setLayerInset(r6, r7, r8, r9, r10)
            return r5
    }

    @androidx.annotation.Nullable
    public static android.graphics.drawable.Drawable createTintableDrawableIfNeeded(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1, @androidx.annotation.Nullable android.content.res.ColorStateList r2, @androidx.annotation.Nullable android.graphics.PorterDuff.Mode r3) {
            r0 = 0
            android.graphics.drawable.Drawable r1 = createTintableMutatedDrawableIfNeeded(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.Nullable
    public static android.graphics.drawable.Drawable createTintableMutatedDrawableIfNeeded(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2, @androidx.annotation.Nullable android.content.res.ColorStateList r3, @androidx.annotation.Nullable android.graphics.PorterDuff.Mode r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 >= r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            android.graphics.drawable.Drawable r2 = createTintableMutatedDrawableIfNeeded(r2, r3, r4, r0)
            return r2
    }

    @androidx.annotation.Nullable
    private static android.graphics.drawable.Drawable createTintableMutatedDrawableIfNeeded(@androidx.annotation.Nullable android.graphics.drawable.Drawable r0, @androidx.annotation.Nullable android.content.res.ColorStateList r1, @androidx.annotation.Nullable android.graphics.PorterDuff.Mode r2, boolean r3) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            if (r1 == 0) goto L14
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            if (r2 == 0) goto L13
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r2)
        L13:
            return r0
        L14:
            if (r3 == 0) goto L19
            r0.mutate()
        L19:
            return r0
    }

    @androidx.annotation.NonNull
    public static int[] getCheckedState(@androidx.annotation.NonNull int[] r3) {
            r0 = 0
        L1:
            int r1 = r3.length
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r0 >= r1) goto L1a
            r1 = r3[r0]
            if (r1 != r2) goto Lc
            return r3
        Lc:
            if (r1 != 0) goto L17
            java.lang.Object r3 = r3.clone()
            int[] r3 = (int[]) r3
            r3[r0] = r2
            return r3
        L17:
            int r0 = r0 + 1
            goto L1
        L1a:
            int r0 = r3.length
            int r0 = r0 + 1
            int[] r0 = java.util.Arrays.copyOf(r3, r0)
            int r3 = r3.length
            r0[r3] = r2
            return r0
    }

    private static int getTopLayerIntrinsicHeight(@androidx.annotation.NonNull android.graphics.drawable.Drawable r1, @androidx.annotation.NonNull android.graphics.drawable.Drawable r2) {
            int r2 = r2.getIntrinsicHeight()
            r0 = -1
            if (r2 == r0) goto L8
            return r2
        L8:
            int r1 = r1.getIntrinsicHeight()
            return r1
    }

    private static int getTopLayerIntrinsicWidth(@androidx.annotation.NonNull android.graphics.drawable.Drawable r1, @androidx.annotation.NonNull android.graphics.drawable.Drawable r2) {
            int r2 = r2.getIntrinsicWidth()
            r0 = -1
            if (r2 == r0) goto L8
            return r2
        L8:
            int r1 = r1.getIntrinsicWidth()
            return r1
    }

    @androidx.annotation.NonNull
    public static int[] getUncheckedState(@androidx.annotation.NonNull int[] r6) {
            int r0 = r6.length
            int[] r0 = new int[r0]
            int r1 = r6.length
            r2 = 0
            r3 = 0
        L6:
            if (r2 >= r1) goto L17
            r4 = r6[r2]
            r5 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r4 == r5) goto L14
            int r5 = r3 + 1
            r0[r3] = r4
            r3 = r5
        L14:
            int r2 = r2 + 1
            goto L6
        L17:
            return r0
    }

    @androidx.annotation.NonNull
    public static android.util.AttributeSet parseDrawableXml(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.XmlRes int r4, @androidx.annotation.NonNull java.lang.CharSequence r5) {
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            android.content.res.XmlResourceParser r3 = r3.getXml(r4)     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
        L8:
            int r0 = r3.next()     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            r1 = 2
            if (r0 == r1) goto L12
            r2 = 1
            if (r0 != r2) goto L8
        L12:
            if (r0 != r1) goto L43
            java.lang.String r0 = r3.getName()     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            boolean r0 = android.text.TextUtils.equals(r0, r5)     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            if (r0 == 0) goto L27
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r3)     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            return r3
        L23:
            r3 = move-exception
            goto L4b
        L25:
            r3 = move-exception
            goto L4b
        L27:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            r0.<init>()     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            java.lang.String r1 = "Must have a <"
            r0.append(r1)     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            r0.append(r5)     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            java.lang.String r5 = "> start tag"
            r0.append(r5)     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            java.lang.String r5 = r0.toString()     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            r3.<init>(r5)     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            throw r3     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
        L43:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            java.lang.String r5 = "No start tag found"
            r3.<init>(r5)     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            throw r3     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
        L4b:
            android.content.res.Resources$NotFoundException r5 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can't load badge resource ID #0x"
            r0.append(r1)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            r5.initCause(r3)
            throw r5
    }

    public static void setOutlineToPath(@androidx.annotation.NonNull android.graphics.Outline r2, @androidx.annotation.NonNull android.graphics.Path r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto La
            h1.c.a(r2, r3)
            return
        La:
            r1 = 29
            if (r0 < r1) goto L12
            r2.setConvexPath(r3)     // Catch: java.lang.IllegalArgumentException -> L11
        L11:
            return
        L12:
            boolean r0 = r3.isConvex()
            if (r0 == 0) goto L1b
            r2.setConvexPath(r3)
        L1b:
            return
    }

    @android.annotation.TargetApi(21)
    public static void setRippleDrawableRadius(@androidx.annotation.Nullable android.graphics.drawable.RippleDrawable r6, int r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            h1.d.a(r6, r7)
            return
        La:
            java.lang.Class<android.graphics.drawable.RippleDrawable> r0 = android.graphics.drawable.RippleDrawable.class
            java.lang.String r1 = "setMaxRadius"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.IllegalAccessException -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.Throwable -> L2a
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.IllegalAccessException -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.Throwable -> L2a
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.IllegalAccessException -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.Throwable -> L2a
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L2a java.lang.Throwable -> L2a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L2a java.lang.Throwable -> L2a
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.Throwable -> L2a
            r1[r5] = r7     // Catch: java.lang.IllegalAccessException -> L26 java.lang.reflect.InvocationTargetException -> L28 java.lang.Throwable -> L2a
            r0.invoke(r6, r1)     // Catch: java.lang.Throwable -> L2a java.lang.Throwable -> L2a java.lang.Throwable -> L2a
            return
        L26:
            r6 = move-exception
            goto L2b
        L28:
            r6 = move-exception
            goto L2b
        L2a:
            r6 = move-exception
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Couldn't set RippleDrawable radius"
            r7.<init>(r0, r6)
            throw r7
    }

    public static void setTint(@androidx.annotation.NonNull android.graphics.drawable.Drawable r4, @androidx.annotation.ColorInt int r5) {
            if (r5 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            r3 = 0
            if (r1 != r2) goto L18
            if (r0 == 0) goto L14
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r4.setColorFilter(r5, r0)
            return
        L14:
            r4.setColorFilter(r3)
            return
        L18:
            if (r0 == 0) goto L1e
            androidx.core.graphics.drawable.DrawableCompat.setTint(r4, r5)
            return
        L1e:
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r4, r3)
            return
    }

    @androidx.annotation.Nullable
    public static android.graphics.PorterDuffColorFilter updateTintFilter(@androidx.annotation.NonNull android.graphics.drawable.Drawable r1, @androidx.annotation.Nullable android.content.res.ColorStateList r2, @androidx.annotation.Nullable android.graphics.PorterDuff.Mode r3) {
            if (r2 == 0) goto L14
            if (r3 != 0) goto L5
            goto L14
        L5:
            int[] r1 = r1.getState()
            r0 = 0
            int r1 = r2.getColorForState(r1, r0)
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            r2.<init>(r1, r3)
            return r2
        L14:
            r1 = 0
            return r1
    }
}
