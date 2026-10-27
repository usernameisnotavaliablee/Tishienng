package androidx.core.os;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class HandlerCompat {
    private static final java.lang.String TAG = "HandlerCompat";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(28)
    private static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static android.os.Handler createAsync(android.os.Looper r0) {
                android.os.Handler r0 = android.os.Handler.createAsync(r0)
                return r0
        }

        public static android.os.Handler createAsync(android.os.Looper r0, android.os.Handler.Callback r1) {
                android.os.Handler r0 = android.os.Handler.createAsync(r0, r1)
                return r0
        }

        public static boolean postDelayed(android.os.Handler r0, java.lang.Runnable r1, java.lang.Object r2, long r3) {
                boolean r0 = r0.postDelayed(r1, r2, r3)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(29)
    private static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static boolean hasCallbacks(android.os.Handler r0, java.lang.Runnable r1) {
                boolean r0 = r0.hasCallbacks(r1)
                return r0
        }
    }

    private HandlerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static android.os.Handler createAsync(@androidx.annotation.NonNull android.os.Looper r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.os.Handler r7 = androidx.core.os.HandlerCompat.Api28Impl.createAsync(r7)
            return r7
        Lb:
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L4e
            java.lang.Class<android.os.Looper> r3 = android.os.Looper.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L4e
            java.lang.Class<android.os.Handler$Callback> r3 = android.os.Handler.Callback.class
            r5 = 1
            r2[r5] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L4e
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L4e
            r6 = 2
            r2[r6] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L4e
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L4e
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L4e
            r1[r4] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L4e
            r2 = 0
            r1[r5] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L4e
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L4e
            r1[r6] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L4e
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L4e
            android.os.Handler r0 = (android.os.Handler) r0     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.Throwable -> L4e
            return r0
        L35:
            r7 = move-exception
            java.lang.Throwable r7 = r7.getCause()
            boolean r0 = r7 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L4b
            boolean r0 = r7 instanceof java.lang.Error
            if (r0 == 0) goto L45
            java.lang.Error r7 = (java.lang.Error) r7
            throw r7
        L45:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r7)
            throw r0
        L4b:
            java.lang.RuntimeException r7 = (java.lang.RuntimeException) r7
            throw r7
        L4e:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r7)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.os.Handler createAsync(@androidx.annotation.NonNull android.os.Looper r7, @androidx.annotation.NonNull android.os.Handler.Callback r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.os.Handler r7 = androidx.core.os.HandlerCompat.Api28Impl.createAsync(r7, r8)
            return r7
        Lb:
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.Throwable -> L4d
            java.lang.Class<android.os.Looper> r3 = android.os.Looper.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.Throwable -> L4d
            java.lang.Class<android.os.Handler$Callback> r3 = android.os.Handler.Callback.class
            r5 = 1
            r2[r5] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.Throwable -> L4d
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.Throwable -> L4d
            r6 = 2
            r2[r6] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.Throwable -> L4d
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.Throwable -> L4d
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.Throwable -> L4d
            r1[r4] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.Throwable -> L4d
            r1[r5] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.Throwable -> L4d
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.Throwable -> L4d
            r1[r6] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.Throwable -> L4d
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.Throwable -> L4d
            android.os.Handler r0 = (android.os.Handler) r0     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.Throwable -> L4d
            return r0
        L34:
            r7 = move-exception
            java.lang.Throwable r7 = r7.getCause()
            boolean r8 = r7 instanceof java.lang.RuntimeException
            if (r8 != 0) goto L4a
            boolean r8 = r7 instanceof java.lang.Error
            if (r8 == 0) goto L44
            java.lang.Error r7 = (java.lang.Error) r7
            throw r7
        L44:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r8.<init>(r7)
            throw r8
        L4a:
            java.lang.RuntimeException r7 = (java.lang.RuntimeException) r7
            throw r7
        L4d:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r7, r8)
            return r0
    }

    public static boolean hasCallbacks(@androidx.annotation.NonNull android.os.Handler r6, @androidx.annotation.NonNull java.lang.Runnable r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            boolean r6 = androidx.core.os.HandlerCompat.Api29Impl.hasCallbacks(r6, r7)
            return r6
        Lb:
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            java.lang.String r1 = "hasCallbacks"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.NullPointerException -> L2a java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L37
            java.lang.Class<java.lang.Runnable> r4 = java.lang.Runnable.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.NullPointerException -> L2a java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L37
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.NullPointerException -> L2a java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L37
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.NullPointerException -> L2a java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L37
            r1[r5] = r7     // Catch: java.lang.NullPointerException -> L2a java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L37
            java.lang.Object r6 = r0.invoke(r6, r1)     // Catch: java.lang.NullPointerException -> L2a java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L37
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.NullPointerException -> L2a java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L37
            boolean r6 = r6.booleanValue()     // Catch: java.lang.NullPointerException -> L2a java.lang.NoSuchMethodException -> L2c java.lang.IllegalAccessException -> L2e java.lang.reflect.InvocationTargetException -> L37
            return r6
        L2a:
            r6 = move-exception
            goto L2f
        L2c:
            r6 = move-exception
            goto L2f
        L2e:
            r6 = move-exception
        L2f:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception."
            r7.<init>(r0, r6)
            throw r7
        L37:
            r6 = move-exception
            java.lang.Throwable r6 = r6.getCause()
            boolean r7 = r6 instanceof java.lang.RuntimeException
            if (r7 != 0) goto L4d
            boolean r7 = r6 instanceof java.lang.Error
            if (r7 == 0) goto L47
            java.lang.Error r6 = (java.lang.Error) r6
            throw r6
        L47:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            r7.<init>(r6)
            throw r7
        L4d:
            java.lang.RuntimeException r6 = (java.lang.RuntimeException) r6
            throw r6
    }

    public static boolean postDelayed(@androidx.annotation.NonNull android.os.Handler r2, @androidx.annotation.NonNull java.lang.Runnable r3, @androidx.annotation.Nullable java.lang.Object r4, long r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.os.HandlerCompat.Api28Impl.postDelayed(r2, r3, r4, r5)
            return r2
        Lb:
            android.os.Message r3 = android.os.Message.obtain(r2, r3)
            r3.obj = r4
            boolean r2 = r2.sendMessageDelayed(r3, r5)
            return r2
    }
}
