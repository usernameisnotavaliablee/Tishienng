package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class TypeParameterMatcher {
    private static final io.netty.util.internal.TypeParameterMatcher NOOP = null;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ReflectiveMatcher extends io.netty.util.internal.TypeParameterMatcher {
        private final java.lang.Class<?> type;

        ReflectiveMatcher(java.lang.Class<?> r1) {
                r0 = this;
                r0.<init>()
                r0.type = r1
                return
        }

        @Override // io.netty.util.internal.TypeParameterMatcher
        public boolean match(java.lang.Object r2) {
                r1 = this;
                java.lang.Class<?> r0 = r1.type
                boolean r2 = r0.isInstance(r2)
                return r2
        }
    }

    static {
            io.netty.util.internal.TypeParameterMatcher$1 r0 = new io.netty.util.internal.TypeParameterMatcher$1
            r0.<init>()
            io.netty.util.internal.TypeParameterMatcher.NOOP = r0
            return
    }

    TypeParameterMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.Class<?> fail(java.lang.Class<?> r3, java.lang.String r4) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cannot determine the type of the type parameter '"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "': "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static io.netty.util.internal.TypeParameterMatcher find(java.lang.Object r3, java.lang.Class<?> r4, java.lang.String r5) {
            io.netty.util.internal.InternalThreadLocalMap r0 = io.netty.util.internal.InternalThreadLocalMap.get()
            java.util.Map r0 = r0.typeParameterMatcherFindCache()
            java.lang.Class r1 = r3.getClass()
            java.lang.Object r2 = r0.get(r1)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 != 0) goto L1c
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.put(r1, r2)
        L1c:
            java.lang.Object r0 = r2.get(r5)
            io.netty.util.internal.TypeParameterMatcher r0 = (io.netty.util.internal.TypeParameterMatcher) r0
            if (r0 != 0) goto L30
            java.lang.Class r3 = find0(r3, r4, r5)
            io.netty.util.internal.TypeParameterMatcher r3 = get(r3)
            r2.put(r5, r3)
            return r3
        L30:
            return r0
    }

    private static java.lang.Class<?> find0(java.lang.Object r5, java.lang.Class<?> r6, java.lang.String r7) {
            java.lang.Class r5 = r5.getClass()
        L4:
            r0 = r5
        L5:
            java.lang.Class r1 = r0.getSuperclass()
            if (r1 != r6) goto Lbc
            java.lang.Class r1 = r0.getSuperclass()
            java.lang.reflect.TypeVariable[] r1 = r1.getTypeParameters()
            r2 = 0
            r3 = 0
        L15:
            int r4 = r1.length
            if (r3 >= r4) goto L28
            r4 = r1[r3]
            java.lang.String r4 = r4.getName()
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L25
            goto L29
        L25:
            int r3 = r3 + 1
            goto L15
        L28:
            r3 = -1
        L29:
            if (r3 < 0) goto L9d
            java.lang.reflect.Type r6 = r0.getGenericSuperclass()
            boolean r0 = r6 instanceof java.lang.reflect.ParameterizedType
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != 0) goto L36
            return r1
        L36:
            java.lang.reflect.ParameterizedType r6 = (java.lang.reflect.ParameterizedType) r6
            java.lang.reflect.Type[] r6 = r6.getActualTypeArguments()
            r6 = r6[r3]
            boolean r0 = r6 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L48
            java.lang.reflect.ParameterizedType r6 = (java.lang.reflect.ParameterizedType) r6
            java.lang.reflect.Type r6 = r6.getRawType()
        L48:
            boolean r0 = r6 instanceof java.lang.Class
            if (r0 == 0) goto L4f
            java.lang.Class r6 = (java.lang.Class) r6
            return r6
        L4f:
            boolean r0 = r6 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L73
            r0 = r6
            java.lang.reflect.GenericArrayType r0 = (java.lang.reflect.GenericArrayType) r0
            java.lang.reflect.Type r0 = r0.getGenericComponentType()
            boolean r3 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L64
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type r0 = r0.getRawType()
        L64:
            boolean r3 = r0 instanceof java.lang.Class
            if (r3 == 0) goto L73
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r0, r2)
            java.lang.Class r5 = r5.getClass()
            return r5
        L73:
            boolean r0 = r6 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L98
            java.lang.reflect.TypeVariable r6 = (java.lang.reflect.TypeVariable) r6
            java.lang.reflect.GenericDeclaration r7 = r6.getGenericDeclaration()
            boolean r7 = r7 instanceof java.lang.Class
            if (r7 != 0) goto L82
            return r1
        L82:
            java.lang.reflect.GenericDeclaration r7 = r6.getGenericDeclaration()
            java.lang.Class r7 = (java.lang.Class) r7
            java.lang.String r6 = r6.getName()
            boolean r0 = r7.isAssignableFrom(r5)
            if (r0 == 0) goto L97
            r0 = r7
            r7 = r6
            r6 = r0
            goto L4
        L97:
            return r1
        L98:
            java.lang.Class r5 = fail(r5, r7)
            return r5
        L9d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unknown type parameter '"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = "': "
            r0.append(r7)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        Lbc:
            java.lang.Class r0 = r0.getSuperclass()
            if (r0 != 0) goto L5
            java.lang.Class r5 = fail(r5, r7)
            return r5
    }

    public static io.netty.util.internal.TypeParameterMatcher get(java.lang.Class<?> r2) {
            io.netty.util.internal.InternalThreadLocalMap r0 = io.netty.util.internal.InternalThreadLocalMap.get()
            java.util.Map r0 = r0.typeParameterMatcherGetCache()
            java.lang.Object r1 = r0.get(r2)
            io.netty.util.internal.TypeParameterMatcher r1 = (io.netty.util.internal.TypeParameterMatcher) r1
            if (r1 != 0) goto L1f
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r2 != r1) goto L17
            io.netty.util.internal.TypeParameterMatcher r1 = io.netty.util.internal.TypeParameterMatcher.NOOP
            goto L1c
        L17:
            io.netty.util.internal.TypeParameterMatcher$ReflectiveMatcher r1 = new io.netty.util.internal.TypeParameterMatcher$ReflectiveMatcher
            r1.<init>(r2)
        L1c:
            r0.put(r2, r1)
        L1f:
            return r1
    }

    public abstract boolean match(java.lang.Object r1);
}
