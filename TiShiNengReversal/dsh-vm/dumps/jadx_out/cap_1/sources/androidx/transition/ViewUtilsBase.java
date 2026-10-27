package androidx.transition;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ViewUtilsBase {
    private static final java.lang.String TAG = "ViewUtilsBase";
    private static final int VISIBILITY_MASK = 12;
    private static boolean sSetFrameFetched;
    private static java.lang.reflect.Method sSetFrameMethod;
    private static java.lang.reflect.Field sViewFlagsField;
    private static boolean sViewFlagsFieldFetched;
    private float[] mMatrixValues;

    ViewUtilsBase() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"PrivateApi"})
    private void fetchSetFrame() {
            r6 = this;
            boolean r0 = androidx.transition.ViewUtilsBase.sSetFrameFetched
            if (r0 != 0) goto L24
            r0 = 1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r2 = "setFrame"
            r3 = 4
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L22
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L22
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.NoSuchMethodException -> L22
            r3[r0] = r4     // Catch: java.lang.NoSuchMethodException -> L22
            r5 = 2
            r3[r5] = r4     // Catch: java.lang.NoSuchMethodException -> L22
            r5 = 3
            r3[r5] = r4     // Catch: java.lang.NoSuchMethodException -> L22
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L22
            androidx.transition.ViewUtilsBase.sSetFrameMethod = r1     // Catch: java.lang.NoSuchMethodException -> L22
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L22
        L22:
            androidx.transition.ViewUtilsBase.sSetFrameFetched = r0
        L24:
            return
    }

    public void clearNonTransitionAlpha(@androidx.annotation.NonNull android.view.View r3) {
            r2 = this;
            int r0 = r3.getVisibility()
            if (r0 != 0) goto Lc
            int r0 = androidx.transition.R.id.save_non_transition_alpha
            r1 = 0
            r3.setTag(r0, r1)
        Lc:
            return
    }

    public float getTransitionAlpha(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            int r0 = androidx.transition.R.id.save_non_transition_alpha
            java.lang.Object r0 = r2.getTag(r0)
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 == 0) goto L14
            float r2 = r2.getAlpha()
            float r0 = r0.floatValue()
            float r2 = r2 / r0
            return r2
        L14:
            float r2 = r2.getAlpha()
            return r2
    }

    public void saveNonTransitionAlpha(@androidx.annotation.NonNull android.view.View r3) {
            r2 = this;
            int r0 = androidx.transition.R.id.save_non_transition_alpha
            java.lang.Object r1 = r3.getTag(r0)
            if (r1 != 0) goto L13
            float r1 = r3.getAlpha()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r3.setTag(r0, r1)
        L13:
            return
    }

    public void setAnimationMatrix(@androidx.annotation.NonNull android.view.View r10, @androidx.annotation.Nullable android.graphics.Matrix r11) {
            r9 = this;
            r0 = 2
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            if (r11 == 0) goto L60
            boolean r3 = r11.isIdentity()
            if (r3 == 0) goto Ld
            goto L60
        Ld:
            float[] r3 = r9.mMatrixValues
            if (r3 != 0) goto L17
            r3 = 9
            float[] r3 = new float[r3]
            r9.mMatrixValues = r3
        L17:
            r11.getValues(r3)
            r11 = 3
            r11 = r3[r11]
            float r4 = r11 * r11
            float r1 = r1 - r4
            double r4 = (double) r1
            double r4 = java.lang.Math.sqrt(r4)
            float r1 = (float) r4
            r4 = 0
            r5 = r3[r4]
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto L2f
            r5 = -1
            goto L30
        L2f:
            r5 = 1
        L30:
            float r5 = (float) r5
            float r1 = r1 * r5
            double r5 = (double) r11
            double r7 = (double) r1
            double r5 = java.lang.Math.atan2(r5, r7)
            double r5 = java.lang.Math.toDegrees(r5)
            float r11 = (float) r5
            r4 = r3[r4]
            float r4 = r4 / r1
            r5 = 4
            r5 = r3[r5]
            float r5 = r5 / r1
            r0 = r3[r0]
            r1 = 5
            r1 = r3[r1]
            r10.setPivotX(r2)
            r10.setPivotY(r2)
            r10.setTranslationX(r0)
            r10.setTranslationY(r1)
            r10.setRotation(r11)
            r10.setScaleX(r4)
            r10.setScaleY(r5)
            return
        L60:
            int r11 = r10.getWidth()
            int r11 = r11 / r0
            float r11 = (float) r11
            r10.setPivotX(r11)
            int r11 = r10.getHeight()
            int r11 = r11 / r0
            float r11 = (float) r11
            r10.setPivotY(r11)
            r10.setTranslationX(r2)
            r10.setTranslationY(r2)
            r10.setScaleX(r1)
            r10.setScaleY(r1)
            r10.setRotation(r2)
            return
    }

    public void setLeftTopRightBottom(@androidx.annotation.NonNull android.view.View r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            r3.fetchSetFrame()
            java.lang.reflect.Method r0 = androidx.transition.ViewUtilsBase.sSetFrameMethod
            if (r0 == 0) goto L35
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L35
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L35
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L35
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L35
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L35
            r2 = 0
            r1[r2] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L35
            r5 = 1
            r1[r5] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L35
            r5 = 2
            r1[r5] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L35
            r5 = 3
            r1[r5] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L35
            r0.invoke(r4, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L2a java.lang.IllegalAccessException -> L35
            return
        L2a:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.Throwable r4 = r4.getCause()
            r5.<init>(r4)
            throw r5
        L35:
            return
    }

    public void setTransitionAlpha(@androidx.annotation.NonNull android.view.View r2, float r3) {
            r1 = this;
            int r0 = androidx.transition.R.id.save_non_transition_alpha
            java.lang.Object r0 = r2.getTag(r0)
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 == 0) goto L14
            float r0 = r0.floatValue()
            float r0 = r0 * r3
            r2.setAlpha(r0)
            return
        L14:
            r2.setAlpha(r3)
            return
    }

    public void setTransitionVisibility(@androidx.annotation.NonNull android.view.View r4, int r5) {
            r3 = this;
            boolean r0 = androidx.transition.ViewUtilsBase.sViewFlagsFieldFetched
            if (r0 != 0) goto L14
            r0 = 1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r2 = "mViewFlags"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L12
            androidx.transition.ViewUtilsBase.sViewFlagsField = r1     // Catch: java.lang.NoSuchFieldException -> L12
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L12
        L12:
            androidx.transition.ViewUtilsBase.sViewFlagsFieldFetched = r0
        L14:
            java.lang.reflect.Field r0 = androidx.transition.ViewUtilsBase.sViewFlagsField
            if (r0 == 0) goto L24
            int r0 = r0.getInt(r4)     // Catch: java.lang.IllegalAccessException -> L24
            java.lang.reflect.Field r1 = androidx.transition.ViewUtilsBase.sViewFlagsField     // Catch: java.lang.IllegalAccessException -> L24
            r0 = r0 & (-13)
            r5 = r5 | r0
            r1.setInt(r4, r5)     // Catch: java.lang.IllegalAccessException -> L24
        L24:
            return
    }

    public void transformMatrixToGlobal(@androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.graphics.Matrix r4) {
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L1c
            android.view.View r0 = (android.view.View) r0
            r2.transformMatrixToGlobal(r0, r4)
            int r1 = r0.getScrollX()
            int r1 = -r1
            float r1 = (float) r1
            int r0 = r0.getScrollY()
            int r0 = -r0
            float r0 = (float) r0
            r4.preTranslate(r1, r0)
        L1c:
            int r0 = r3.getLeft()
            float r0 = (float) r0
            int r1 = r3.getTop()
            float r1 = (float) r1
            r4.preTranslate(r0, r1)
            android.graphics.Matrix r3 = r3.getMatrix()
            boolean r0 = r3.isIdentity()
            if (r0 != 0) goto L36
            r4.preConcat(r3)
        L36:
            return
    }

    public void transformMatrixToLocal(@androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.graphics.Matrix r4) {
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L1a
            android.view.View r0 = (android.view.View) r0
            r2.transformMatrixToLocal(r0, r4)
            int r1 = r0.getScrollX()
            float r1 = (float) r1
            int r0 = r0.getScrollY()
            float r0 = (float) r0
            r4.postTranslate(r1, r0)
        L1a:
            int r0 = r3.getLeft()
            int r0 = -r0
            float r0 = (float) r0
            int r1 = r3.getTop()
            int r1 = -r1
            float r1 = (float) r1
            r4.postTranslate(r0, r1)
            android.graphics.Matrix r3 = r3.getMatrix()
            boolean r0 = r3.isIdentity()
            if (r0 != 0) goto L41
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            boolean r3 = r3.invert(r0)
            if (r3 == 0) goto L41
            r4.postConcat(r0)
        L41:
            return
    }
}
