package androidx.core.graphics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(26)
@android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class WeightTypefaceApi26 {
    private static final java.lang.String NATIVE_CREATE_FROM_TYPEFACE_WITH_EXACT_STYLE_METHOD = "nativeCreateFromTypefaceWithExactStyle";
    private static final java.lang.String NATIVE_INSTANCE_FIELD = "native_instance";
    private static final java.lang.String TAG = "WeightTypeface";
    private static final java.lang.reflect.Constructor<android.graphics.Typeface> sConstructor = null;
    private static final java.lang.reflect.Method sNativeCreateFromTypefaceWithExactStyle = null;
    private static final java.lang.reflect.Field sNativeInstance = null;
    private static final java.lang.Object sWeightCacheLock = null;

    @androidx.annotation.GuardedBy("sWeightCacheLock")
    private static final androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> sWeightTypefaceCache = null;

    static {
            java.lang.Class<android.graphics.Typeface> r0 = android.graphics.Typeface.class
            r1 = 3
            java.lang.String r2 = "native_instance"
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = "nativeCreateFromTypefaceWithExactStyle"
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L2f
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L2f
            r6 = 0
            r5[r6] = r4     // Catch: java.lang.Throwable -> L2f
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L2f
            r8 = 1
            r5[r8] = r7     // Catch: java.lang.Throwable -> L2f
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L2f
            r9 = 2
            r5[r9] = r7     // Catch: java.lang.Throwable -> L2f
            java.lang.reflect.Method r3 = r0.getDeclaredMethod(r3, r5)     // Catch: java.lang.Throwable -> L2f
            r3.setAccessible(r8)     // Catch: java.lang.Throwable -> L2f
            java.lang.Class[] r5 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> L2f
            r5[r6] = r4     // Catch: java.lang.Throwable -> L2f
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r5)     // Catch: java.lang.Throwable -> L2f
            r0.setAccessible(r8)     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r2 = 0
            r0 = r2
            r3 = r0
        L32:
            androidx.core.graphics.WeightTypefaceApi26.sNativeInstance = r2
            androidx.core.graphics.WeightTypefaceApi26.sNativeCreateFromTypefaceWithExactStyle = r3
            androidx.core.graphics.WeightTypefaceApi26.sConstructor = r0
            androidx.collection.LongSparseArray r0 = new androidx.collection.LongSparseArray
            r0.<init>(r1)
            androidx.core.graphics.WeightTypefaceApi26.sWeightTypefaceCache = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.graphics.WeightTypefaceApi26.sWeightCacheLock = r0
            return
    }

    private WeightTypefaceApi26() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    private static android.graphics.Typeface create(long r3) {
            r0 = 0
            java.lang.reflect.Constructor<android.graphics.Typeface> r1 = androidx.core.graphics.WeightTypefaceApi26.sConstructor     // Catch: java.lang.Throwable -> L14
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L14
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L14
            r2 = 0
            r4[r2] = r3     // Catch: java.lang.Throwable -> L14
            java.lang.Object r3 = r1.newInstance(r4)     // Catch: java.lang.Throwable -> L14
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3     // Catch: java.lang.Throwable -> L14
            return r3
        L14:
            return r0
    }

    @androidx.annotation.Nullable
    static android.graphics.Typeface createWeightStyle(@androidx.annotation.NonNull android.graphics.Typeface r6, int r7, boolean r8) {
            boolean r0 = isPrivateApiAvailable()
            if (r0 != 0) goto L8
            r6 = 0
            return r6
        L8:
            int r0 = r7 << 1
            r0 = r0 | r8
            java.lang.Object r1 = androidx.core.graphics.WeightTypefaceApi26.sWeightCacheLock
            monitor-enter(r1)
            long r2 = getNativeInstance(r6)     // Catch: java.lang.Throwable -> L26
            androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> r6 = androidx.core.graphics.WeightTypefaceApi26.sWeightTypefaceCache     // Catch: java.lang.Throwable -> L26
            java.lang.Object r4 = r6.get(r2)     // Catch: java.lang.Throwable -> L26
            android.util.SparseArray r4 = (android.util.SparseArray) r4     // Catch: java.lang.Throwable -> L26
            if (r4 != 0) goto L28
            android.util.SparseArray r4 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L26
            r5 = 4
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L26
            r6.put(r2, r4)     // Catch: java.lang.Throwable -> L26
            goto L32
        L26:
            r6 = move-exception
            goto L3f
        L28:
            java.lang.Object r6 = r4.get(r0)     // Catch: java.lang.Throwable -> L26
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6     // Catch: java.lang.Throwable -> L26
            if (r6 == 0) goto L32
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            return r6
        L32:
            long r6 = nativeCreateFromTypefaceWithExactStyle(r2, r7, r8)     // Catch: java.lang.Throwable -> L26
            android.graphics.Typeface r6 = create(r6)     // Catch: java.lang.Throwable -> L26
            r4.put(r0, r6)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            return r6
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            throw r6
    }

    private static long getNativeInstance(@androidx.annotation.NonNull android.graphics.Typeface r2) {
            java.lang.reflect.Field r0 = androidx.core.graphics.WeightTypefaceApi26.sNativeInstance     // Catch: java.lang.IllegalAccessException -> L7
            long r0 = r0.getLong(r2)     // Catch: java.lang.IllegalAccessException -> L7
            return r0
        L7:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
    }

    private static boolean isPrivateApiAvailable() {
            java.lang.reflect.Field r0 = androidx.core.graphics.WeightTypefaceApi26.sNativeInstance
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    private static long nativeCreateFromTypefaceWithExactStyle(long r2, int r4, boolean r5) {
            java.lang.reflect.Method r0 = androidx.core.graphics.WeightTypefaceApi26.sNativeCreateFromTypefaceWithExactStyle     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            r1 = 0
            r5[r1] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            r2 = 1
            r5[r2] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            r2 = 2
            r5[r2] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            r2 = 0
            java.lang.Object r2 = r0.invoke(r2, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            long r2 = r2.longValue()     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L2d
            return r2
        L26:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
        L2d:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }
}
