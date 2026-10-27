package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class p3<T, V> extends com.acse.ottn.k3<T, V> {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f2576f = "get";

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f2577g = "is";

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f2578h = "set";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.reflect.Method f2579c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.reflect.Method f2580d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.reflect.Field f2581e;

    public p3(java.lang.Class<T> r10, java.lang.Class<V> r11, java.lang.String r12) {
            r9 = this;
            java.lang.String r0 = ")"
            java.lang.String r1 = ") does not match Property type ("
            java.lang.String r2 = "Underlying type ("
            r9.<init>(r11, r12)
            r3 = 0
            char r4 = r12.charAt(r3)
            char r4 = java.lang.Character.toUpperCase(r4)
            r5 = 1
            java.lang.String r6 = r12.substring(r5)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "get"
            r6.append(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            r7 = 0
            java.lang.reflect.Method r8 = r10.getMethod(r6, r7)     // Catch: java.lang.NoSuchMethodException -> L3f
            r9.f2580d = r8     // Catch: java.lang.NoSuchMethodException -> L3f
            goto L6a
        L3f:
            java.lang.reflect.Method r6 = r10.getDeclaredMethod(r6, r7)     // Catch: java.lang.NoSuchMethodException -> L49
            r9.f2580d = r6     // Catch: java.lang.NoSuchMethodException -> L49
            r6.setAccessible(r5)     // Catch: java.lang.NoSuchMethodException -> L49
            goto L6a
        L49:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "is"
            r6.append(r8)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            java.lang.reflect.Method r8 = r10.getMethod(r6, r7)     // Catch: java.lang.NoSuchMethodException -> L61
            r9.f2580d = r8     // Catch: java.lang.NoSuchMethodException -> L61
            goto L6a
        L61:
            java.lang.reflect.Method r6 = r10.getDeclaredMethod(r6, r7)     // Catch: java.lang.NoSuchMethodException -> Lb3
            r9.f2580d = r6     // Catch: java.lang.NoSuchMethodException -> Lb3
            r6.setAccessible(r5)     // Catch: java.lang.NoSuchMethodException -> Lb3
        L6a:
            java.lang.reflect.Method r12 = r9.f2580d
            java.lang.Class r12 = r12.getReturnType()
            boolean r6 = r9.a(r11, r12)
            if (r6 == 0) goto L95
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "set"
            r11.append(r0)
            r11.append(r4)
            java.lang.String r11 = r11.toString()
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> Lc3
            r0[r3] = r12     // Catch: java.lang.NoSuchMethodException -> Lc3
            java.lang.reflect.Method r10 = r10.getDeclaredMethod(r11, r0)     // Catch: java.lang.NoSuchMethodException -> Lc3
            r9.f2579c = r10     // Catch: java.lang.NoSuchMethodException -> Lc3
            r10.setAccessible(r5)     // Catch: java.lang.NoSuchMethodException -> Lc3
            goto Lc3
        L95:
            com.acse.ottn.v2 r10 = new com.acse.ottn.v2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r12)
            r3.append(r1)
            r3.append(r11)
            r3.append(r0)
            java.lang.String r11 = r3.toString()
            r10.<init>(r11)
            throw r10
        Lb3:
            java.lang.reflect.Field r10 = r10.getField(r12)     // Catch: java.lang.NoSuchFieldException -> Le2
            r9.f2581e = r10     // Catch: java.lang.NoSuchFieldException -> Le2
            java.lang.Class r10 = r10.getType()     // Catch: java.lang.NoSuchFieldException -> Le2
            boolean r3 = r9.a(r11, r10)     // Catch: java.lang.NoSuchFieldException -> Le2
            if (r3 == 0) goto Lc4
        Lc3:
            return
        Lc4:
            com.acse.ottn.v2 r3 = new com.acse.ottn.v2     // Catch: java.lang.NoSuchFieldException -> Le2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchFieldException -> Le2
            r4.<init>()     // Catch: java.lang.NoSuchFieldException -> Le2
            r4.append(r2)     // Catch: java.lang.NoSuchFieldException -> Le2
            r4.append(r10)     // Catch: java.lang.NoSuchFieldException -> Le2
            r4.append(r1)     // Catch: java.lang.NoSuchFieldException -> Le2
            r4.append(r11)     // Catch: java.lang.NoSuchFieldException -> Le2
            r4.append(r0)     // Catch: java.lang.NoSuchFieldException -> Le2
            java.lang.String r10 = r4.toString()     // Catch: java.lang.NoSuchFieldException -> Le2
            r3.<init>(r10)     // Catch: java.lang.NoSuchFieldException -> Le2
            throw r3     // Catch: java.lang.NoSuchFieldException -> Le2
        Le2:
            com.acse.ottn.v2 r10 = new com.acse.ottn.v2
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "No accessor method or field found for property with name "
            r11.append(r0)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
    }

    @Override // com.acse.ottn.k3
    public V a(T r3) {
            r2 = this;
            java.lang.reflect.Method r0 = r2.f2580d
            if (r0 == 0) goto L1b
            r1 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> La java.lang.IllegalAccessException -> L15
            return r3
        La:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.Throwable r3 = r3.getCause()
            r0.<init>(r3)
            throw r0
        L15:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L1b:
            java.lang.reflect.Field r0 = r2.f2581e
            if (r0 == 0) goto L2a
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.IllegalAccessException -> L24
            return r3
        L24:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L2a:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
    }

    @Override // com.acse.ottn.k3
    public void a(T r4, V r5) {
            r3 = this;
            java.lang.reflect.Method r0 = r3.f2579c
            if (r0 == 0) goto L1f
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> Le java.lang.IllegalAccessException -> L19
            r2 = 0
            r1[r2] = r5     // Catch: java.lang.reflect.InvocationTargetException -> Le java.lang.IllegalAccessException -> L19
            r0.invoke(r4, r1)     // Catch: java.lang.reflect.InvocationTargetException -> Le java.lang.IllegalAccessException -> L19
            return
        Le:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.Throwable r4 = r4.getCause()
            r5.<init>(r4)
            throw r5
        L19:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L1f:
            java.lang.reflect.Field r0 = r3.f2581e
            if (r0 == 0) goto L2d
            r0.set(r4, r5)     // Catch: java.lang.IllegalAccessException -> L27
            return
        L27:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L2d:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Property "
            r5.append(r0)
            java.lang.String r0 = r3.a()
            r5.append(r0)
            java.lang.String r0 = " is read-only"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public final boolean a(java.lang.Class<V> r4, java.lang.Class r5) {
            r3 = this;
            r0 = 1
            if (r5 == r4) goto L4c
            boolean r1 = r5.isPrimitive()
            r2 = 0
            if (r1 == 0) goto L4b
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r5 != r1) goto L12
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            if (r4 == r1) goto L4a
        L12:
            java.lang.Class r1 = java.lang.Integer.TYPE
            if (r5 != r1) goto L1a
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            if (r4 == r1) goto L4a
        L1a:
            java.lang.Class r1 = java.lang.Boolean.TYPE
            if (r5 != r1) goto L22
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            if (r4 == r1) goto L4a
        L22:
            java.lang.Class r1 = java.lang.Long.TYPE
            if (r5 != r1) goto L2a
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            if (r4 == r1) goto L4a
        L2a:
            java.lang.Class r1 = java.lang.Double.TYPE
            if (r5 != r1) goto L32
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            if (r4 == r1) goto L4a
        L32:
            java.lang.Class r1 = java.lang.Short.TYPE
            if (r5 != r1) goto L3a
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            if (r4 == r1) goto L4a
        L3a:
            java.lang.Class r1 = java.lang.Byte.TYPE
            if (r5 != r1) goto L42
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            if (r4 == r1) goto L4a
        L42:
            java.lang.Class r1 = java.lang.Character.TYPE
            if (r5 != r1) goto L4b
            java.lang.Class<java.lang.Character> r5 = java.lang.Character.class
            if (r4 != r5) goto L4b
        L4a:
            return r0
        L4b:
            return r2
        L4c:
            return r0
    }

    @Override // com.acse.ottn.k3
    public boolean c() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.f2579c
            if (r0 != 0) goto La
            java.lang.reflect.Field r0 = r1.f2581e
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }
}
