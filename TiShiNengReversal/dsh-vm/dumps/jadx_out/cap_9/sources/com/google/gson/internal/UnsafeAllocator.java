package com.google.gson.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class UnsafeAllocator {





    public UnsafeAllocator() {
            r0 = this;
            r0.<init>()
            return
    }

    static void assertInstantiable(java.lang.Class<?> r3) {
            int r0 = r3.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isInterface(r0)
            if (r1 != 0) goto L2c
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 != 0) goto L11
            return
        L11:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Abstract class can't be instantiated! Class name: "
            r1.append(r2)
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L2c:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Interface can't be instantiated! Interface name: "
            r1.append(r2)
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static com.google.gson.internal.UnsafeAllocator create() {
            java.lang.String r0 = "newInstance"
            java.lang.Class<java.io.ObjectStreamClass> r1 = java.io.ObjectStreamClass.class
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            r3 = 0
            r4 = 0
            r5 = 1
            java.lang.String r6 = "sun.misc.Unsafe"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Exception -> L2c
            java.lang.String r7 = "theUnsafe"
            java.lang.reflect.Field r7 = r6.getDeclaredField(r7)     // Catch: java.lang.Exception -> L2c
            r7.setAccessible(r5)     // Catch: java.lang.Exception -> L2c
            java.lang.Object r7 = r7.get(r4)     // Catch: java.lang.Exception -> L2c
            java.lang.String r8 = "allocateInstance"
            java.lang.Class[] r9 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L2c
            r9[r3] = r2     // Catch: java.lang.Exception -> L2c
            java.lang.reflect.Method r6 = r6.getMethod(r8, r9)     // Catch: java.lang.Exception -> L2c
            com.google.gson.internal.UnsafeAllocator$1 r8 = new com.google.gson.internal.UnsafeAllocator$1     // Catch: java.lang.Exception -> L2c
            r8.<init>(r6, r7)     // Catch: java.lang.Exception -> L2c
            return r8
        L2c:
            r6 = 2
            java.lang.String r7 = "getConstructorId"
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L5f
            r8[r3] = r2     // Catch: java.lang.Exception -> L5f
            java.lang.reflect.Method r7 = r1.getDeclaredMethod(r7, r8)     // Catch: java.lang.Exception -> L5f
            r7.setAccessible(r5)     // Catch: java.lang.Exception -> L5f
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L5f
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            r8[r3] = r9     // Catch: java.lang.Exception -> L5f
            java.lang.Object r4 = r7.invoke(r4, r8)     // Catch: java.lang.Exception -> L5f
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Exception -> L5f
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> L5f
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L5f
            r7[r3] = r2     // Catch: java.lang.Exception -> L5f
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L5f
            r7[r5] = r8     // Catch: java.lang.Exception -> L5f
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r0, r7)     // Catch: java.lang.Exception -> L5f
            r1.setAccessible(r5)     // Catch: java.lang.Exception -> L5f
            com.google.gson.internal.UnsafeAllocator$2 r7 = new com.google.gson.internal.UnsafeAllocator$2     // Catch: java.lang.Exception -> L5f
            r7.<init>(r1, r4)     // Catch: java.lang.Exception -> L5f
            return r7
        L5f:
            java.lang.Class<java.io.ObjectInputStream> r1 = java.io.ObjectInputStream.class
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L74
            r4[r3] = r2     // Catch: java.lang.Exception -> L74
            r4[r5] = r2     // Catch: java.lang.Exception -> L74
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r0, r4)     // Catch: java.lang.Exception -> L74
            r0.setAccessible(r5)     // Catch: java.lang.Exception -> L74
            com.google.gson.internal.UnsafeAllocator$3 r1 = new com.google.gson.internal.UnsafeAllocator$3     // Catch: java.lang.Exception -> L74
            r1.<init>(r0)     // Catch: java.lang.Exception -> L74
            return r1
        L74:
            com.google.gson.internal.UnsafeAllocator$4 r0 = new com.google.gson.internal.UnsafeAllocator$4
            r0.<init>()
            return r0
    }

    public abstract <T> T newInstance(java.lang.Class<T> r1) throws java.lang.Exception;
}
