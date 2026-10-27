package com.google.gson.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class ConstructorConstructor {
    private final com.google.gson.internal.reflect.ReflectionAccessor accessor;
    private final java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> instanceCreators;















    public ConstructorConstructor(java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r2) {
            r1 = this;
            r1.<init>()
            com.google.gson.internal.reflect.ReflectionAccessor r0 = com.google.gson.internal.reflect.ReflectionAccessor.getInstance()
            r1.accessor = r0
            r1.instanceCreators = r2
            return
    }

    private <T> com.google.gson.internal.ObjectConstructor<T> newDefaultConstructor(java.lang.Class<? super T> r3) {
            r2 = this;
            r0 = 0
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L16
            boolean r1 = r3.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L16
            if (r1 != 0) goto L10
            com.google.gson.internal.reflect.ReflectionAccessor r1 = r2.accessor     // Catch: java.lang.NoSuchMethodException -> L16
            r1.makeAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> L16
        L10:
            com.google.gson.internal.ConstructorConstructor$3 r1 = new com.google.gson.internal.ConstructorConstructor$3     // Catch: java.lang.NoSuchMethodException -> L16
            r1.<init>(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L16
            return r1
        L16:
            return r0
    }

    private <T> com.google.gson.internal.ObjectConstructor<T> newDefaultImplementationConstructor(java.lang.reflect.Type r2, java.lang.Class<? super T> r3) {
            r1 = this;
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            boolean r0 = r0.isAssignableFrom(r3)
            if (r0 == 0) goto L46
            java.lang.Class<java.util.SortedSet> r0 = java.util.SortedSet.class
            boolean r0 = r0.isAssignableFrom(r3)
            if (r0 == 0) goto L16
            com.google.gson.internal.ConstructorConstructor$4 r2 = new com.google.gson.internal.ConstructorConstructor$4
            r2.<init>(r1)
            return r2
        L16:
            java.lang.Class<java.util.EnumSet> r0 = java.util.EnumSet.class
            boolean r0 = r0.isAssignableFrom(r3)
            if (r0 == 0) goto L24
            com.google.gson.internal.ConstructorConstructor$5 r3 = new com.google.gson.internal.ConstructorConstructor$5
            r3.<init>(r1, r2)
            return r3
        L24:
            java.lang.Class<java.util.Set> r2 = java.util.Set.class
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L32
            com.google.gson.internal.ConstructorConstructor$6 r2 = new com.google.gson.internal.ConstructorConstructor$6
            r2.<init>(r1)
            return r2
        L32:
            java.lang.Class<java.util.Queue> r2 = java.util.Queue.class
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L40
            com.google.gson.internal.ConstructorConstructor$7 r2 = new com.google.gson.internal.ConstructorConstructor$7
            r2.<init>(r1)
            return r2
        L40:
            com.google.gson.internal.ConstructorConstructor$8 r2 = new com.google.gson.internal.ConstructorConstructor$8
            r2.<init>(r1)
            return r2
        L46:
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r3)
            if (r0 == 0) goto La1
            java.lang.Class<java.util.concurrent.ConcurrentNavigableMap> r0 = java.util.concurrent.ConcurrentNavigableMap.class
            boolean r0 = r0.isAssignableFrom(r3)
            if (r0 == 0) goto L5c
            com.google.gson.internal.ConstructorConstructor$9 r2 = new com.google.gson.internal.ConstructorConstructor$9
            r2.<init>(r1)
            return r2
        L5c:
            java.lang.Class<java.util.concurrent.ConcurrentMap> r0 = java.util.concurrent.ConcurrentMap.class
            boolean r0 = r0.isAssignableFrom(r3)
            if (r0 == 0) goto L6a
            com.google.gson.internal.ConstructorConstructor$10 r2 = new com.google.gson.internal.ConstructorConstructor$10
            r2.<init>(r1)
            return r2
        L6a:
            java.lang.Class<java.util.SortedMap> r0 = java.util.SortedMap.class
            boolean r3 = r0.isAssignableFrom(r3)
            if (r3 == 0) goto L78
            com.google.gson.internal.ConstructorConstructor$11 r2 = new com.google.gson.internal.ConstructorConstructor$11
            r2.<init>(r1)
            return r2
        L78:
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L9b
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r2 = r2.getActualTypeArguments()
            r3 = 0
            r2 = r2[r3]
            com.google.gson.reflect.TypeToken r2 = com.google.gson.reflect.TypeToken.get(r2)
            java.lang.Class r2 = r2.getRawType()
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 != 0) goto L9b
            com.google.gson.internal.ConstructorConstructor$12 r2 = new com.google.gson.internal.ConstructorConstructor$12
            r2.<init>(r1)
            return r2
        L9b:
            com.google.gson.internal.ConstructorConstructor$13 r2 = new com.google.gson.internal.ConstructorConstructor$13
            r2.<init>(r1)
            return r2
        La1:
            r2 = 0
            return r2
    }

    private <T> com.google.gson.internal.ObjectConstructor<T> newUnsafeAllocator(java.lang.reflect.Type r2, java.lang.Class<? super T> r3) {
            r1 = this;
            com.google.gson.internal.ConstructorConstructor$14 r0 = new com.google.gson.internal.ConstructorConstructor$14
            r0.<init>(r1, r3, r2)
            return r0
    }

    public <T> com.google.gson.internal.ObjectConstructor<T> get(com.google.gson.reflect.TypeToken<T> r3) {
            r2 = this;
            java.lang.reflect.Type r0 = r3.getType()
            java.lang.Class r3 = r3.getRawType()
            java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r1 = r2.instanceCreators
            java.lang.Object r1 = r1.get(r0)
            com.google.gson.InstanceCreator r1 = (com.google.gson.InstanceCreator) r1
            if (r1 == 0) goto L18
            com.google.gson.internal.ConstructorConstructor$1 r3 = new com.google.gson.internal.ConstructorConstructor$1
            r3.<init>(r2, r1, r0)
            return r3
        L18:
            java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r1 = r2.instanceCreators
            java.lang.Object r1 = r1.get(r3)
            com.google.gson.InstanceCreator r1 = (com.google.gson.InstanceCreator) r1
            if (r1 == 0) goto L28
            com.google.gson.internal.ConstructorConstructor$2 r3 = new com.google.gson.internal.ConstructorConstructor$2
            r3.<init>(r2, r1, r0)
            return r3
        L28:
            com.google.gson.internal.ObjectConstructor r1 = r2.newDefaultConstructor(r3)
            if (r1 == 0) goto L2f
            return r1
        L2f:
            com.google.gson.internal.ObjectConstructor r1 = r2.newDefaultImplementationConstructor(r0, r3)
            if (r1 == 0) goto L36
            return r1
        L36:
            com.google.gson.internal.ObjectConstructor r3 = r2.newUnsafeAllocator(r0, r3)
            return r3
    }

    public java.lang.String toString() {
            r1 = this;
            java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r0 = r1.instanceCreators
            java.lang.String r0 = r0.toString()
            return r0
    }
}
