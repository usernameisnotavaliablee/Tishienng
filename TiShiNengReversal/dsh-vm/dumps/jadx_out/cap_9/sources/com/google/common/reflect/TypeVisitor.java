package com.google.common.reflect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class TypeVisitor {
    private final java.util.Set<java.lang.reflect.Type> visited;

    TypeVisitor() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = com.google.common.collect.Sets.newHashSet()
            r1.visited = r0
            return
    }

    public final void visit(java.lang.reflect.Type... r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L6a
            r2 = r5[r1]
            if (r2 == 0) goto L67
            java.util.Set<java.lang.reflect.Type> r3 = r4.visited
            boolean r3 = r3.add(r2)
            if (r3 != 0) goto L11
            goto L67
        L11:
            boolean r3 = r2 instanceof java.lang.reflect.TypeVariable     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L1e
            r3 = r2
            java.lang.reflect.TypeVariable r3 = (java.lang.reflect.TypeVariable) r3     // Catch: java.lang.Throwable -> L1c
            r4.visitTypeVariable(r3)     // Catch: java.lang.Throwable -> L1c
            goto L67
        L1c:
            r5 = move-exception
            goto L61
        L1e:
            boolean r3 = r2 instanceof java.lang.reflect.WildcardType     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L29
            r3 = r2
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3     // Catch: java.lang.Throwable -> L1c
            r4.visitWildcardType(r3)     // Catch: java.lang.Throwable -> L1c
            goto L67
        L29:
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L34
            r3 = r2
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3     // Catch: java.lang.Throwable -> L1c
            r4.visitParameterizedType(r3)     // Catch: java.lang.Throwable -> L1c
            goto L67
        L34:
            boolean r3 = r2 instanceof java.lang.Class     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L3f
            r3 = r2
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Throwable -> L1c
            r4.visitClass(r3)     // Catch: java.lang.Throwable -> L1c
            goto L67
        L3f:
            boolean r3 = r2 instanceof java.lang.reflect.GenericArrayType     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L4a
            r3 = r2
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3     // Catch: java.lang.Throwable -> L1c
            r4.visitGenericArrayType(r3)     // Catch: java.lang.Throwable -> L1c
            goto L67
        L4a:
            java.lang.AssertionError r5 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r0.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "Unknown type: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L1c
            r0.append(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1c
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L1c
            throw r5     // Catch: java.lang.Throwable -> L1c
        L61:
            java.util.Set<java.lang.reflect.Type> r0 = r4.visited
            r0.remove(r2)
            throw r5
        L67:
            int r1 = r1 + 1
            goto L2
        L6a:
            return
    }

    void visitClass(java.lang.Class<?> r1) {
            r0 = this;
            return
    }

    void visitGenericArrayType(java.lang.reflect.GenericArrayType r1) {
            r0 = this;
            return
    }

    void visitParameterizedType(java.lang.reflect.ParameterizedType r1) {
            r0 = this;
            return
    }

    void visitTypeVariable(java.lang.reflect.TypeVariable<?> r1) {
            r0 = this;
            return
    }

    void visitWildcardType(java.lang.reflect.WildcardType r1) {
            r0 = this;
            return
    }
}
