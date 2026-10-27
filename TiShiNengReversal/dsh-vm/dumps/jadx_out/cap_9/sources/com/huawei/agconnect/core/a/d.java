package com.huawei.agconnect.core.a;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class d {
    private static java.util.Map<java.lang.Class<?>, com.huawei.agconnect.core.b> c;
    private static java.util.Map<java.lang.Class<?>, java.lang.Object> d;
    private java.util.Map<java.lang.Class<?>, com.huawei.agconnect.core.b> a;
    private java.util.Map<java.lang.Class<?>, java.lang.Object> b;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.huawei.agconnect.core.a.d.c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.huawei.agconnect.core.a.d.d = r0
            return
    }

    d(java.util.List<com.huawei.agconnect.core.b> r2, android.content.Context r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b = r0
            r1.e(r2, r3)
            return
    }

    private java.lang.Object a(com.huawei.agconnect.d r8, com.huawei.agconnect.core.b r9) {
            r7 = this;
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Object r1 = r9.g()
            if (r1 == 0) goto Ld
            java.lang.Object r8 = r9.g()
            return r8
        Ld:
            java.lang.Class r9 = r9.getType()
            r1 = 0
            if (r9 != 0) goto L15
            return r1
        L15:
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L37 java.lang.InstantiationException -> L39
            r4 = 0
            r3[r4] = r0     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L37 java.lang.InstantiationException -> L39
            java.lang.Class<com.huawei.agconnect.d> r5 = com.huawei.agconnect.d.class
            r6 = 1
            r3[r6] = r5     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L37 java.lang.InstantiationException -> L39
            java.lang.reflect.Constructor r3 = c(r9, r3)     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L37 java.lang.InstantiationException -> L39
            if (r3 == 0) goto L3b
            android.content.Context r9 = r8.getContext()     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L37 java.lang.InstantiationException -> L39
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L37 java.lang.InstantiationException -> L39
            r0[r4] = r9     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L37 java.lang.InstantiationException -> L39
            r0[r6] = r8     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L37 java.lang.InstantiationException -> L39
            java.lang.Object r8 = r3.newInstance(r0)     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L37 java.lang.InstantiationException -> L39
            return r8
        L35:
            r8 = move-exception
            goto L57
        L37:
            r8 = move-exception
            goto L57
        L39:
            r8 = move-exception
            goto L57
        L3b:
            java.lang.Class[] r2 = new java.lang.Class[r6]     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L37 java.lang.InstantiationException -> L39
            r2[r4] = r0     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L37 java.lang.InstantiationException -> L39
            java.lang.reflect.Constructor r0 = c(r9, r2)     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L37 java.lang.InstantiationException -> L39
            if (r0 == 0) goto L52
            android.content.Context r8 = r8.getContext()     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L37 java.lang.InstantiationException -> L39
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L37 java.lang.InstantiationException -> L39
            r9[r4] = r8     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L37 java.lang.InstantiationException -> L39
            java.lang.Object r8 = r0.newInstance(r9)     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L37 java.lang.InstantiationException -> L39
            return r8
        L52:
            java.lang.Object r8 = r9.newInstance()     // Catch: java.lang.IllegalAccessException -> L35 java.lang.reflect.InvocationTargetException -> L37 java.lang.InstantiationException -> L39
            return r8
        L57:
            r8.getLocalizedMessage()
            return r1
    }

    private static java.lang.reflect.Constructor c(java.lang.Class r8, java.lang.Class... r9) {
            java.lang.reflect.Constructor[] r8 = r8.getDeclaredConstructors()
            int r0 = r8.length
            r1 = 0
            r2 = 0
            r3 = 0
        L8:
            if (r2 >= r0) goto L2a
            r4 = r8[r2]
            java.lang.Class[] r5 = r4.getParameterTypes()
            int r6 = r5.length
            int r7 = r9.length
            if (r6 != r7) goto L27
            r6 = 0
        L15:
            int r7 = r9.length
            if (r6 >= r7) goto L24
            r3 = r5[r6]
            r7 = r9[r6]
            if (r3 != r7) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            int r6 = r6 + 1
            goto L15
        L24:
            if (r3 == 0) goto L27
            return r4
        L27:
            int r2 = r2 + 1
            goto L8
        L2a:
            r8 = 0
            return r8
    }

    private void d(java.lang.String r1, java.lang.Exception r2) {
            r0 = this;
            r2.getLocalizedMessage()
            java.lang.Throwable r1 = r2.getCause()
            if (r1 == 0) goto L10
            java.lang.Throwable r1 = r2.getCause()
            r1.getMessage()
        L10:
            return
    }

    public <T> T b(com.huawei.agconnect.d r3, java.lang.Class<?> r4) {
            r2 = this;
            java.util.Map<java.lang.Class<?>, com.huawei.agconnect.core.b> r0 = r2.a
            java.lang.Object r0 = r0.get(r4)
            com.huawei.agconnect.core.b r0 = (com.huawei.agconnect.core.b) r0
            if (r0 != 0) goto L1b
            java.util.Map<java.lang.Class<?>, com.huawei.agconnect.core.b> r0 = com.huawei.agconnect.core.a.d.c
            java.lang.Object r0 = r0.get(r4)
            com.huawei.agconnect.core.b r0 = (com.huawei.agconnect.core.b) r0
            if (r0 == 0) goto L1b
            java.util.Map<java.lang.Class<?>, java.lang.Object> r3 = com.huawei.agconnect.core.a.d.d
            java.lang.Object r3 = r3.get(r4)
            return r3
        L1b:
            if (r0 != 0) goto L1f
            r3 = 0
            return r3
        L1f:
            boolean r1 = r0.k()
            if (r1 == 0) goto L2e
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r2.b
            java.lang.Object r1 = r1.get(r4)
            if (r1 == 0) goto L2e
            return r1
        L2e:
            java.lang.Object r3 = r2.a(r3, r0)
            if (r3 == 0) goto L3f
            boolean r0 = r0.k()
            if (r0 == 0) goto L3f
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r2.b
            r0.put(r4, r3)
        L3f:
            return r3
    }

    public void e(java.util.List<com.huawei.agconnect.core.b> r7, android.content.Context r8) {
            r6 = this;
            if (r7 != 0) goto L4
            goto L8a
        L4:
            java.util.Iterator r7 = r7.iterator()
        L8:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r7.next()
            com.huawei.agconnect.core.b r0 = (com.huawei.agconnect.core.b) r0
            boolean r1 = r0.j()
            if (r1 == 0) goto L30
            java.util.Map<java.lang.Class<?>, com.huawei.agconnect.core.b> r1 = com.huawei.agconnect.core.a.d.c
            java.lang.Class r2 = r0.h()
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L33
            java.util.Map<java.lang.Class<?>, com.huawei.agconnect.core.b> r1 = com.huawei.agconnect.core.a.d.c
        L28:
            java.lang.Class r2 = r0.h()
            r1.put(r2, r0)
            goto L33
        L30:
            java.util.Map<java.lang.Class<?>, com.huawei.agconnect.core.b> r1 = r6.a
            goto L28
        L33:
            boolean r1 = r0.i()
            if (r1 == 0) goto L8
            java.lang.Class r1 = r0.getType()
            if (r1 == 0) goto L8
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = com.huawei.agconnect.core.a.d.d
            java.lang.Class r2 = r0.h()
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L8
            java.lang.Class r1 = r0.getType()     // Catch: java.lang.reflect.InvocationTargetException -> L66 java.lang.InstantiationException -> L68 java.lang.IllegalAccessException -> L6a
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L66 java.lang.InstantiationException -> L68 java.lang.IllegalAccessException -> L6a
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L66 java.lang.InstantiationException -> L68 java.lang.IllegalAccessException -> L6a
            java.lang.reflect.Constructor r1 = c(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L66 java.lang.InstantiationException -> L68 java.lang.IllegalAccessException -> L6a
            if (r1 == 0) goto L6c
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L66 java.lang.InstantiationException -> L68 java.lang.IllegalAccessException -> L6a
            r2[r5] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L66 java.lang.InstantiationException -> L68 java.lang.IllegalAccessException -> L6a
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L66 java.lang.InstantiationException -> L68 java.lang.IllegalAccessException -> L6a
            goto L74
        L66:
            r0 = move-exception
            goto L7e
        L68:
            r0 = move-exception
            goto L84
        L6a:
            r0 = move-exception
            goto L87
        L6c:
            java.lang.Class r1 = r0.getType()     // Catch: java.lang.reflect.InvocationTargetException -> L66 java.lang.InstantiationException -> L68 java.lang.IllegalAccessException -> L6a
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.reflect.InvocationTargetException -> L66 java.lang.InstantiationException -> L68 java.lang.IllegalAccessException -> L6a
        L74:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r2 = com.huawei.agconnect.core.a.d.d     // Catch: java.lang.reflect.InvocationTargetException -> L66 java.lang.InstantiationException -> L68 java.lang.IllegalAccessException -> L6a
            java.lang.Class r0 = r0.h()     // Catch: java.lang.reflect.InvocationTargetException -> L66 java.lang.InstantiationException -> L68 java.lang.IllegalAccessException -> L6a
            r2.put(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L66 java.lang.InstantiationException -> L68 java.lang.IllegalAccessException -> L6a
            goto L8
        L7e:
            java.lang.String r1 = "TargetException"
        L80:
            r6.d(r1, r0)
            goto L8
        L84:
            java.lang.String r1 = "InstantiationException"
            goto L80
        L87:
            java.lang.String r1 = "AccessException"
            goto L80
        L8a:
            return
    }
}
