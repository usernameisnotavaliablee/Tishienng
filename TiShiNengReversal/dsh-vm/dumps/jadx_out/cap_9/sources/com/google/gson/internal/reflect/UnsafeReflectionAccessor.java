package com.google.gson.internal.reflect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class UnsafeReflectionAccessor extends com.google.gson.internal.reflect.ReflectionAccessor {
    private static java.lang.Class unsafeClass;
    private final java.lang.reflect.Field overrideField;
    private final java.lang.Object theUnsafe;

    UnsafeReflectionAccessor() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = getUnsafeInstance()
            r1.theUnsafe = r0
            java.lang.reflect.Field r0 = getOverrideField()
            r1.overrideField = r0
            return
    }

    private static java.lang.reflect.Field getOverrideField() {
            java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
            java.lang.String r1 = "override"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L9
            return r0
        L9:
            r0 = 0
            return r0
    }

    private static java.lang.Object getUnsafeInstance() {
            r0 = 0
            java.lang.String r1 = "sun.misc.Unsafe"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L17
            com.google.gson.internal.reflect.UnsafeReflectionAccessor.unsafeClass = r1     // Catch: java.lang.Exception -> L17
            java.lang.String r2 = "theUnsafe"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Exception -> L17
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Exception -> L17
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Exception -> L17
        L17:
            return r0
    }

    @Override // com.google.gson.internal.reflect.ReflectionAccessor
    public void makeAccessible(java.lang.reflect.AccessibleObject r5) {
            r4 = this;
            boolean r0 = r4.makeAccessibleWithUnsafe(r5)
            if (r0 != 0) goto L28
            r0 = 1
            r5.setAccessible(r0)     // Catch: java.lang.SecurityException -> Lb
            return
        Lb:
            r0 = move-exception
            com.google.gson.JsonIOException r1 = new com.google.gson.JsonIOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Gson couldn't modify fields for "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe."
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
        L28:
            return
    }

    boolean makeAccessibleWithUnsafe(java.lang.reflect.AccessibleObject r10) {
            r9 = this;
            java.lang.Object r0 = r9.theUnsafe
            r1 = 0
            if (r0 == 0) goto L51
            java.lang.reflect.Field r0 = r9.overrideField
            if (r0 == 0) goto L51
            java.lang.Class r0 = com.google.gson.internal.reflect.UnsafeReflectionAccessor.unsafeClass     // Catch: java.lang.Exception -> L51
            java.lang.String r2 = "objectFieldOffset"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L51
            java.lang.Class<java.lang.reflect.Field> r5 = java.lang.reflect.Field.class
            r4[r1] = r5     // Catch: java.lang.Exception -> L51
            java.lang.reflect.Method r0 = r0.getMethod(r2, r4)     // Catch: java.lang.Exception -> L51
            java.lang.Object r2 = r9.theUnsafe     // Catch: java.lang.Exception -> L51
            java.lang.reflect.Field r4 = r9.overrideField     // Catch: java.lang.Exception -> L51
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L51
            r5[r1] = r4     // Catch: java.lang.Exception -> L51
            java.lang.Object r0 = r0.invoke(r2, r5)     // Catch: java.lang.Exception -> L51
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Exception -> L51
            r0.longValue()     // Catch: java.lang.Exception -> L51
            java.lang.Class r2 = com.google.gson.internal.reflect.UnsafeReflectionAccessor.unsafeClass     // Catch: java.lang.Exception -> L51
            java.lang.String r4 = "putBoolean"
            r5 = 3
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L51
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r6[r1] = r7     // Catch: java.lang.Exception -> L51
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L51
            r6[r3] = r7     // Catch: java.lang.Exception -> L51
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L51
            r8 = 2
            r6[r8] = r7     // Catch: java.lang.Exception -> L51
            java.lang.reflect.Method r2 = r2.getMethod(r4, r6)     // Catch: java.lang.Exception -> L51
            java.lang.Object r4 = r9.theUnsafe     // Catch: java.lang.Exception -> L51
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L51
            r5[r1] = r10     // Catch: java.lang.Exception -> L51
            r5[r3] = r0     // Catch: java.lang.Exception -> L51
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L51
            r5[r8] = r10     // Catch: java.lang.Exception -> L51
            r2.invoke(r4, r5)     // Catch: java.lang.Exception -> L51
            return r3
        L51:
            return r1
    }
}
