package androidx.core.graphics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(28)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class TypefaceCompatApi28Impl extends androidx.core.graphics.TypefaceCompatApi26Impl {
    private static final java.lang.String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
    private static final java.lang.String DEFAULT_FAMILY = "sans-serif";
    private static final int RESOLVE_BY_FONT_TABLE = -1;

    public TypefaceCompatApi28Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.core.graphics.TypefaceCompatApi26Impl
    protected android.graphics.Typeface createFromFamiliesWithDefault(java.lang.Object r6) {
            r5 = this;
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Class<?> r1 = r5.mFontFamily     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalAccessException -> L2b
            r2 = 1
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalAccessException -> L2b
            r3 = 0
            java.lang.reflect.Array.set(r1, r3, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalAccessException -> L2b
            java.lang.reflect.Method r6 = r5.mCreateFromFamiliesWithDefault     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalAccessException -> L2b
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalAccessException -> L2b
            r4[r3] = r1     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalAccessException -> L2b
            java.lang.String r1 = "sans-serif"
            r4[r2] = r1     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalAccessException -> L2b
            r1 = 2
            r4[r1] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalAccessException -> L2b
            r1 = 3
            r4[r1] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalAccessException -> L2b
            r0 = 0
            java.lang.Object r6 = r6.invoke(r0, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalAccessException -> L2b
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.IllegalAccessException -> L2b
            return r6
        L29:
            r6 = move-exception
            goto L2c
        L2b:
            r6 = move-exception
        L2c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r6)
            throw r0
    }

    @Override // androidx.core.graphics.TypefaceCompatApi26Impl, androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    @androidx.annotation.NonNull
    android.graphics.Typeface createWeightStyle(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.graphics.Typeface r2, int r3, boolean r4) {
            r0 = this;
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r2, r3, r4)
            return r1
    }

    @Override // androidx.core.graphics.TypefaceCompatApi26Impl
    protected java.lang.reflect.Method obtainCreateFromFamiliesWithDefaultMethod(java.lang.Class<?> r4) throws java.lang.NoSuchMethodException {
            r3 = this;
            r0 = 1
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
            java.lang.Class r4 = r4.getClass()
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r1[r0] = r4
            r4 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r4] = r2
            r4 = 3
            r1[r4] = r2
            java.lang.Class<android.graphics.Typeface> r4 = android.graphics.Typeface.class
            java.lang.String r2 = "createFromFamiliesWithDefault"
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r2, r1)
            r4.setAccessible(r0)
            return r4
    }
}
