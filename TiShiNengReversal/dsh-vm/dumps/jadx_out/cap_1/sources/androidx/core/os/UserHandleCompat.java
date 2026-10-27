package androidx.core.os;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class UserHandleCompat {

    @androidx.annotation.Nullable
    private static java.lang.reflect.Method sGetUserIdMethod;

    @androidx.annotation.Nullable
    private static java.lang.reflect.Constructor<android.os.UserHandle> sUserHandleConstructor;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(24)
    private static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        static android.os.UserHandle getUserHandleForUid(int r0) {
                android.os.UserHandle r0 = android.os.UserHandle.getUserHandleForUid(r0)
                return r0
        }
    }

    private UserHandleCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.reflect.Method getGetUserIdMethod() throws java.lang.NoSuchMethodException {
            java.lang.reflect.Method r0 = androidx.core.os.UserHandleCompat.sGetUserIdMethod
            if (r0 != 0) goto L19
            r0 = 1
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r3 = 0
            r1[r3] = r2
            java.lang.Class<android.os.UserHandle> r2 = android.os.UserHandle.class
            java.lang.String r3 = "getUserId"
            java.lang.reflect.Method r1 = r2.getDeclaredMethod(r3, r1)
            androidx.core.os.UserHandleCompat.sGetUserIdMethod = r1
            r1.setAccessible(r0)
        L19:
            java.lang.reflect.Method r0 = androidx.core.os.UserHandleCompat.sGetUserIdMethod
            return r0
    }

    private static java.lang.reflect.Constructor<android.os.UserHandle> getUserHandleConstructor() throws java.lang.NoSuchMethodException {
            java.lang.reflect.Constructor<android.os.UserHandle> r0 = androidx.core.os.UserHandleCompat.sUserHandleConstructor
            if (r0 != 0) goto L17
            r0 = 1
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r3 = 0
            r1[r3] = r2
            java.lang.Class<android.os.UserHandle> r2 = android.os.UserHandle.class
            java.lang.reflect.Constructor r1 = r2.getDeclaredConstructor(r1)
            androidx.core.os.UserHandleCompat.sUserHandleConstructor = r1
            r1.setAccessible(r0)
        L17:
            java.lang.reflect.Constructor<android.os.UserHandle> r0 = androidx.core.os.UserHandleCompat.sUserHandleConstructor
            return r0
    }

    @androidx.annotation.NonNull
    public static android.os.UserHandle getUserHandleForUid(int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            android.os.UserHandle r4 = androidx.core.os.UserHandleCompat.Api24Impl.getUserHandleForUid(r4)
            return r4
        Lb:
            java.lang.reflect.Method r0 = getGetUserIdMethod()     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.InstantiationException -> L36 java.lang.IllegalAccessException -> L40 java.lang.NoSuchMethodException -> L4a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.InstantiationException -> L36 java.lang.IllegalAccessException -> L40 java.lang.NoSuchMethodException -> L4a
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.InstantiationException -> L36 java.lang.IllegalAccessException -> L40 java.lang.NoSuchMethodException -> L4a
            r3 = 0
            r2[r3] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.InstantiationException -> L36 java.lang.IllegalAccessException -> L40 java.lang.NoSuchMethodException -> L4a
            r4 = 0
            java.lang.Object r4 = r0.invoke(r4, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.InstantiationException -> L36 java.lang.IllegalAccessException -> L40 java.lang.NoSuchMethodException -> L4a
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.InstantiationException -> L36 java.lang.IllegalAccessException -> L40 java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Constructor r0 = getUserHandleConstructor()     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.InstantiationException -> L36 java.lang.IllegalAccessException -> L40 java.lang.NoSuchMethodException -> L4a
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.InstantiationException -> L36 java.lang.IllegalAccessException -> L40 java.lang.NoSuchMethodException -> L4a
            r1[r3] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.InstantiationException -> L36 java.lang.IllegalAccessException -> L40 java.lang.NoSuchMethodException -> L4a
            java.lang.Object r4 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.InstantiationException -> L36 java.lang.IllegalAccessException -> L40 java.lang.NoSuchMethodException -> L4a
            android.os.UserHandle r4 = (android.os.UserHandle) r4     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.InstantiationException -> L36 java.lang.IllegalAccessException -> L40 java.lang.NoSuchMethodException -> L4a
            return r4
        L2f:
            r4 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r4)
            throw r0
        L36:
            r4 = move-exception
            java.lang.InstantiationError r0 = new java.lang.InstantiationError
            r0.<init>()
            r0.initCause(r4)
            throw r0
        L40:
            r4 = move-exception
            java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError
            r0.<init>()
            r0.initCause(r4)
            throw r0
        L4a:
            r4 = move-exception
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            r0.initCause(r4)
            throw r0
    }
}
