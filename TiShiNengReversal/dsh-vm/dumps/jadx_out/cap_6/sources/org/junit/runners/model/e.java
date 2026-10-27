package org.junit.runners.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class e {
    private final java.lang.reflect.Method a;

    e(java.lang.reflect.Method r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private void b(java.lang.reflect.GenericArrayType r1, java.util.List<java.lang.Throwable> r2) {
            r0 = this;
            java.lang.reflect.Type r1 = r1.getGenericComponentType()
            r0.d(r1, r2)
            return
    }

    private void c(java.lang.reflect.ParameterizedType r4, java.util.List<java.lang.Throwable> r5) {
            r3 = this;
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            int r0 = r4.length
            r1 = 0
        L6:
            if (r1 >= r0) goto L10
            r2 = r4[r1]
            r3.d(r2, r5)
            int r1 = r1 + 1
            goto L6
        L10:
            return
    }

    private void d(java.lang.reflect.Type r4, java.util.List<java.lang.Throwable> r5) {
            r3 = this;
            boolean r0 = r4 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L2c
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Method "
            r1.append(r2)
            java.lang.reflect.Method r2 = r3.a
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = "() contains unresolved type variable "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            r5.add(r0)
            return
        L2c:
            boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L36
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            r3.c(r4, r5)
            return
        L36:
            boolean r0 = r4 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L40
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            r3.e(r4, r5)
            return
        L40:
            boolean r0 = r4 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L49
            java.lang.reflect.GenericArrayType r4 = (java.lang.reflect.GenericArrayType) r4
            r3.b(r4, r5)
        L49:
            return
    }

    private void e(java.lang.reflect.WildcardType r6, java.util.List<java.lang.Throwable> r7) {
            r5 = this;
            java.lang.reflect.Type[] r0 = r6.getUpperBounds()
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L7:
            if (r3 >= r1) goto L11
            r4 = r0[r3]
            r5.d(r4, r7)
            int r3 = r3 + 1
            goto L7
        L11:
            java.lang.reflect.Type[] r6 = r6.getLowerBounds()
            int r0 = r6.length
        L16:
            if (r2 >= r0) goto L20
            r1 = r6[r2]
            r5.d(r1, r7)
            int r2 = r2 + 1
            goto L16
        L20:
            return
    }

    void a(java.util.List<java.lang.Throwable> r5) {
            r4 = this;
            java.lang.reflect.Method r0 = r4.a
            java.lang.reflect.Type[] r0 = r0.getGenericParameterTypes()
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r4.d(r3, r5)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }
}
