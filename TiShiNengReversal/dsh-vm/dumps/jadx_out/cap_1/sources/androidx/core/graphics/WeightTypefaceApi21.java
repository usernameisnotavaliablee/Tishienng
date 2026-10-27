package androidx.core.graphics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
@android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class WeightTypefaceApi21 {
    private static final java.lang.String NATIVE_CREATE_FROM_TYPEFACE_METHOD = "nativeCreateFromTypeface";
    private static final java.lang.String NATIVE_CREATE_WEIGHT_ALIAS_METHOD = "nativeCreateWeightAlias";
    private static final java.lang.String NATIVE_INSTANCE_FIELD = "native_instance";
    private static final java.lang.String TAG = "WeightTypeface";
    private static final java.lang.reflect.Constructor<android.graphics.Typeface> sConstructor = null;
    private static final java.lang.reflect.Method sNativeCreateFromTypeface = null;
    private static final java.lang.reflect.Method sNativeCreateWeightAlias = null;
    private static final java.lang.reflect.Field sNativeInstance = null;
    private static final java.lang.Object sWeightCacheLock = null;

    @androidx.annotation.GuardedBy("sWeightCacheLock")
    private static final androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> sWeightTypefaceCache = null;

    static {
            java.lang.Class<android.graphics.Typeface> r0 = android.graphics.Typeface.class
            java.lang.String r1 = "native_instance"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "nativeCreateFromTypeface"
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L39
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L39
            r5 = 2
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L39
            r7 = 0
            r6[r7] = r3     // Catch: java.lang.Throwable -> L39
            r8 = 1
            r6[r8] = r4     // Catch: java.lang.Throwable -> L39
            java.lang.reflect.Method r2 = r0.getDeclaredMethod(r2, r6)     // Catch: java.lang.Throwable -> L39
            r2.setAccessible(r8)     // Catch: java.lang.Throwable -> L39
            java.lang.String r6 = "nativeCreateWeightAlias"
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L39
            r5[r7] = r3     // Catch: java.lang.Throwable -> L39
            r5[r8] = r4     // Catch: java.lang.Throwable -> L39
            java.lang.reflect.Method r4 = r0.getDeclaredMethod(r6, r5)     // Catch: java.lang.Throwable -> L39
            r4.setAccessible(r8)     // Catch: java.lang.Throwable -> L39
            java.lang.Class[] r5 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> L39
            r5[r7] = r3     // Catch: java.lang.Throwable -> L39
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r5)     // Catch: java.lang.Throwable -> L39
            r0.setAccessible(r8)     // Catch: java.lang.Throwable -> L39
            goto L3d
        L39:
            r1 = 0
            r0 = r1
            r2 = r0
            r4 = r2
        L3d:
            androidx.core.graphics.WeightTypefaceApi21.sNativeInstance = r1
            androidx.core.graphics.WeightTypefaceApi21.sNativeCreateFromTypeface = r2
            androidx.core.graphics.WeightTypefaceApi21.sNativeCreateWeightAlias = r4
            androidx.core.graphics.WeightTypefaceApi21.sConstructor = r0
            androidx.collection.LongSparseArray r0 = new androidx.collection.LongSparseArray
            r1 = 3
            r0.<init>(r1)
            androidx.core.graphics.WeightTypefaceApi21.sWeightTypefaceCache = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.graphics.WeightTypefaceApi21.sWeightCacheLock = r0
            return
    }

    private WeightTypefaceApi21() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    private static android.graphics.Typeface create(long r3) {
            r0 = 0
            java.lang.reflect.Constructor<android.graphics.Typeface> r1 = androidx.core.graphics.WeightTypefaceApi21.sConstructor     // Catch: java.lang.Throwable -> L14
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
    static android.graphics.Typeface createWeightStyle(@androidx.annotation.NonNull android.graphics.Typeface r7, int r8, boolean r9) {
            boolean r0 = isPrivateApiAvailable()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            int r0 = r8 << 1
            r0 = r0 | r9
            java.lang.Object r1 = androidx.core.graphics.WeightTypefaceApi21.sWeightCacheLock
            monitor-enter(r1)
            long r2 = getNativeInstance(r7)     // Catch: java.lang.Throwable -> L26
            androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> r4 = androidx.core.graphics.WeightTypefaceApi21.sWeightTypefaceCache     // Catch: java.lang.Throwable -> L26
            java.lang.Object r5 = r4.get(r2)     // Catch: java.lang.Throwable -> L26
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L26
            if (r5 != 0) goto L28
            android.util.SparseArray r5 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L26
            r6 = 4
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L26
            r4.put(r2, r5)     // Catch: java.lang.Throwable -> L26
            goto L32
        L26:
            r7 = move-exception
            goto L4e
        L28:
            java.lang.Object r4 = r5.get(r0)     // Catch: java.lang.Throwable -> L26
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L32
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            return r4
        L32:
            boolean r7 = r7.isItalic()     // Catch: java.lang.Throwable -> L26
            if (r9 != r7) goto L41
            long r7 = nativeCreateWeightAlias(r2, r8)     // Catch: java.lang.Throwable -> L26
            android.graphics.Typeface r7 = create(r7)     // Catch: java.lang.Throwable -> L26
            goto L49
        L41:
            long r7 = nativeCreateFromTypefaceWithExactStyle(r2, r8, r9)     // Catch: java.lang.Throwable -> L26
            android.graphics.Typeface r7 = create(r7)     // Catch: java.lang.Throwable -> L26
        L49:
            r5.put(r0, r7)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            return r7
        L4e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            throw r7
    }

    private static long getNativeInstance(@androidx.annotation.NonNull android.graphics.Typeface r2) {
            java.lang.reflect.Field r0 = androidx.core.graphics.WeightTypefaceApi21.sNativeInstance     // Catch: java.lang.IllegalAccessException -> L7
            long r0 = r0.getLong(r2)     // Catch: java.lang.IllegalAccessException -> L7
            return r0
        L7:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
    }

    private static boolean isPrivateApiAvailable() {
            java.lang.reflect.Field r0 = androidx.core.graphics.WeightTypefaceApi21.sNativeInstance
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    private static long nativeCreateFromTypefaceWithExactStyle(long r3, int r5, boolean r6) {
            r0 = 0
            r1 = 2
            if (r6 == 0) goto L6
            r6 = 2
            goto L7
        L6:
            r6 = 0
        L7:
            java.lang.reflect.Method r2 = androidx.core.graphics.WeightTypefaceApi21.sNativeCreateFromTypeface     // Catch: java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L40
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L40
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L40
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L40
            r6[r0] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L40
            r3 = 1
            r6[r3] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L40
            r4 = 0
            java.lang.Object r6 = r2.invoke(r4, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L40
            java.lang.Long r6 = (java.lang.Long) r6     // Catch: java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L40
            r6.longValue()     // Catch: java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L40
            java.lang.reflect.Method r2 = androidx.core.graphics.WeightTypefaceApi21.sNativeCreateWeightAlias     // Catch: java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L40
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L40
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L40
            r1[r0] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L40
            r1[r3] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L40
            java.lang.Object r3 = r2.invoke(r4, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L40
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L40
            long r3 = r3.longValue()     // Catch: java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L40
            return r3
        L39:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
        L40:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }

    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    private static long nativeCreateWeightAlias(long r2, int r4) {
            java.lang.reflect.Method r0 = androidx.core.graphics.WeightTypefaceApi21.sNativeCreateWeightAlias     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L26
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L26
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L26
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L26
            r1 = 0
            r4[r1] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L26
            r2 = 1
            r4[r2] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L26
            r2 = 0
            java.lang.Object r2 = r0.invoke(r2, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L26
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L26
            long r2 = r2.longValue()     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L26
            return r2
        L1f:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
        L26:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }
}
