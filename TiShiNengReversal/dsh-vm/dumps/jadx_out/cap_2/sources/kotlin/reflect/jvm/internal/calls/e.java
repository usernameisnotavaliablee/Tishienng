package kotlin.reflect.jvm.internal.calls;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAnnotationConstructorCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationConstructorCaller.kt\nkotlin/reflect/jvm/internal/calls/AnnotationConstructorCallerKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n11228#2:182\n11563#2,3:183\n37#3:186\n36#3,3:187\n18#3:197\n1563#4:190\n1634#4,3:191\n1740#4,3:194\n*S KotlinDebug\n*F\n+ 1 AnnotationConstructorCaller.kt\nkotlin/reflect/jvm/internal/calls/AnnotationConstructorCallerKt\n*L\n75#1:182\n75#1:183,3\n75#1:186\n75#1:187,3\n173#1:197\n102#1:190\n102#1:191,3\n106#1:194,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e {
    public static final /* synthetic */ java.lang.Void a(int r0, java.lang.String r1, java.lang.Class r2) {
            java.lang.Void r0 = p(r0, r1, r2)
            return r0
    }

    public static final /* synthetic */ java.lang.Object b(java.lang.Object r0, java.lang.Class r1) {
            java.lang.Object r0 = q(r0, r1)
            return r0
    }

    static /* synthetic */ int c(java.util.Map r0) {
            int r0 = j(r0)
            return r0
    }

    static /* synthetic */ java.lang.String d(java.lang.Class r0, java.util.Map r1) {
            java.lang.String r0 = l(r0, r1)
            return r0
    }

    static /* synthetic */ java.lang.Object e(java.lang.Class r0, java.util.Map r1, kotlin.s r2, kotlin.s r3, java.util.List r4, java.lang.Object r5, java.lang.reflect.Method r6, java.lang.Object[] r7) {
            java.lang.Object r0 = o(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    static /* synthetic */ java.lang.CharSequence f(java.util.Map.Entry r0) {
            java.lang.CharSequence r0 = m(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> T g(@org.jetbrains.annotations.NotNull java.lang.Class<T> r8, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> r9, @org.jetbrains.annotations.NotNull java.util.List<java.lang.reflect.Method> r10) {
            java.lang.String r0 = "annotationClass"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "values"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "methods"
            kotlin.jvm.internal.g0.p(r10, r0)
            kotlin.reflect.jvm.internal.calls.a r0 = new kotlin.reflect.jvm.internal.calls.a
            r0.<init>(r9)
            kotlin.s r5 = kotlin.t.c(r0)
            kotlin.reflect.jvm.internal.calls.b r0 = new kotlin.reflect.jvm.internal.calls.b
            r0.<init>(r8, r9)
            kotlin.s r4 = kotlin.t.c(r0)
            java.lang.ClassLoader r0 = r8.getClassLoader()
            r1 = 1
            java.lang.Class[] r7 = new java.lang.Class[r1]
            r1 = 0
            r7[r1] = r8
            kotlin.reflect.jvm.internal.calls.c r1 = new kotlin.reflect.jvm.internal.calls.c
            r2 = r8
            r3 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r8 = java.lang.reflect.Proxy.newProxyInstance(r0, r7, r1)
            java.lang.String r9 = "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance"
            kotlin.jvm.internal.g0.n(r8, r9)
            return r8
    }

    public static /* synthetic */ java.lang.Object h(java.lang.Class r1, java.util.Map r2, java.util.List r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L2d
            java.util.Set r3 = r2.keySet()
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.f0.d0(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L2c
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            r0 = 0
            java.lang.reflect.Method r5 = r1.getDeclaredMethod(r5, r0)
            r4.add(r5)
            goto L17
        L2c:
            r3 = r4
        L2d:
            java.lang.Object r1 = g(r1, r2, r3)
            return r1
    }

    private static final <T> boolean i(java.lang.Class<T> r5, java.util.List<java.lang.reflect.Method> r6, java.util.Map<java.lang.String, ? extends java.lang.Object> r7, java.lang.Object r8) {
            boolean r0 = r8 instanceof java.lang.annotation.Annotation
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r8
            java.lang.annotation.Annotation r0 = (java.lang.annotation.Annotation) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto L17
            kotlin.reflect.d r0 = k3.a.a(r0)
            if (r0 == 0) goto L17
            java.lang.Class r0 = k3.a.e(r0)
            goto L18
        L17:
            r0 = r1
        L18:
            boolean r5 = kotlin.jvm.internal.g0.g(r0, r5)
            r0 = 0
            if (r5 == 0) goto Lfd
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r5 = r6 instanceof java.util.Collection
            r2 = 1
            if (r5 == 0) goto L32
            r5 = r6
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L32
        L2f:
            r5 = 1
            goto Lfa
        L32:
            java.util.Iterator r5 = r6.iterator()
        L36:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L2f
            java.lang.Object r6 = r5.next()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.String r3 = r6.getName()
            java.lang.Object r3 = r7.get(r3)
            java.lang.Object r6 = r6.invoke(r8, r1)
            boolean r4 = r3 instanceof boolean[]
            if (r4 == 0) goto L61
            boolean[] r3 = (boolean[]) r3
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.BooleanArray"
            kotlin.jvm.internal.g0.n(r6, r4)
            boolean[] r6 = (boolean[]) r6
            boolean r6 = java.util.Arrays.equals(r3, r6)
            goto Lf7
        L61:
            boolean r4 = r3 instanceof char[]
            if (r4 == 0) goto L74
            char[] r3 = (char[]) r3
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.CharArray"
            kotlin.jvm.internal.g0.n(r6, r4)
            char[] r6 = (char[]) r6
            boolean r6 = java.util.Arrays.equals(r3, r6)
            goto Lf7
        L74:
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L87
            byte[] r3 = (byte[]) r3
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.ByteArray"
            kotlin.jvm.internal.g0.n(r6, r4)
            byte[] r6 = (byte[]) r6
            boolean r6 = java.util.Arrays.equals(r3, r6)
            goto Lf7
        L87:
            boolean r4 = r3 instanceof short[]
            if (r4 == 0) goto L99
            short[] r3 = (short[]) r3
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.ShortArray"
            kotlin.jvm.internal.g0.n(r6, r4)
            short[] r6 = (short[]) r6
            boolean r6 = java.util.Arrays.equals(r3, r6)
            goto Lf7
        L99:
            boolean r4 = r3 instanceof int[]
            if (r4 == 0) goto Lab
            int[] r3 = (int[]) r3
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.IntArray"
            kotlin.jvm.internal.g0.n(r6, r4)
            int[] r6 = (int[]) r6
            boolean r6 = java.util.Arrays.equals(r3, r6)
            goto Lf7
        Lab:
            boolean r4 = r3 instanceof float[]
            if (r4 == 0) goto Lbd
            float[] r3 = (float[]) r3
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.FloatArray"
            kotlin.jvm.internal.g0.n(r6, r4)
            float[] r6 = (float[]) r6
            boolean r6 = java.util.Arrays.equals(r3, r6)
            goto Lf7
        Lbd:
            boolean r4 = r3 instanceof long[]
            if (r4 == 0) goto Lcf
            long[] r3 = (long[]) r3
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.LongArray"
            kotlin.jvm.internal.g0.n(r6, r4)
            long[] r6 = (long[]) r6
            boolean r6 = java.util.Arrays.equals(r3, r6)
            goto Lf7
        Lcf:
            boolean r4 = r3 instanceof double[]
            if (r4 == 0) goto Le1
            double[] r3 = (double[]) r3
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.DoubleArray"
            kotlin.jvm.internal.g0.n(r6, r4)
            double[] r6 = (double[]) r6
            boolean r6 = java.util.Arrays.equals(r3, r6)
            goto Lf7
        Le1:
            boolean r4 = r3 instanceof java.lang.Object[]
            if (r4 == 0) goto Lf3
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<*>"
            kotlin.jvm.internal.g0.n(r6, r4)
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            boolean r6 = java.util.Arrays.equals(r3, r6)
            goto Lf7
        Lf3:
            boolean r6 = kotlin.jvm.internal.g0.g(r3, r6)
        Lf7:
            if (r6 != 0) goto L36
            r5 = 0
        Lfa:
            if (r5 == 0) goto Lfd
            return r2
        Lfd:
            return r0
    }

    private static final int j(java.util.Map r4) {
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L90
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            boolean r3 = r1 instanceof boolean[]
            if (r3 == 0) goto L2a
            boolean[] r1 = (boolean[]) r1
            int r1 = java.util.Arrays.hashCode(r1)
            goto L86
        L2a:
            boolean r3 = r1 instanceof char[]
            if (r3 == 0) goto L35
            char[] r1 = (char[]) r1
            int r1 = java.util.Arrays.hashCode(r1)
            goto L86
        L35:
            boolean r3 = r1 instanceof byte[]
            if (r3 == 0) goto L40
            byte[] r1 = (byte[]) r1
            int r1 = java.util.Arrays.hashCode(r1)
            goto L86
        L40:
            boolean r3 = r1 instanceof short[]
            if (r3 == 0) goto L4b
            short[] r1 = (short[]) r1
            int r1 = java.util.Arrays.hashCode(r1)
            goto L86
        L4b:
            boolean r3 = r1 instanceof int[]
            if (r3 == 0) goto L56
            int[] r1 = (int[]) r1
            int r1 = java.util.Arrays.hashCode(r1)
            goto L86
        L56:
            boolean r3 = r1 instanceof float[]
            if (r3 == 0) goto L61
            float[] r1 = (float[]) r1
            int r1 = java.util.Arrays.hashCode(r1)
            goto L86
        L61:
            boolean r3 = r1 instanceof long[]
            if (r3 == 0) goto L6c
            long[] r1 = (long[]) r1
            int r1 = java.util.Arrays.hashCode(r1)
            goto L86
        L6c:
            boolean r3 = r1 instanceof double[]
            if (r3 == 0) goto L77
            double[] r1 = (double[]) r1
            int r1 = java.util.Arrays.hashCode(r1)
            goto L86
        L77:
            boolean r3 = r1 instanceof java.lang.Object[]
            if (r3 == 0) goto L82
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r1 = java.util.Arrays.hashCode(r1)
            goto L86
        L82:
            int r1 = r1.hashCode()
        L86:
            int r2 = r2.hashCode()
            int r2 = r2 * 127
            r1 = r1 ^ r2
            int r0 = r0 + r1
            goto L9
        L90:
            return r0
    }

    private static final int k(kotlin.s<java.lang.Integer> r0) {
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
    }

    private static final java.lang.String l(java.lang.Class r10, java.util.Map r11) {
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 64
            r1.append(r0)
            java.lang.String r10 = r10.getCanonicalName()
            r1.append(r10)
            java.util.Set r0 = r11.entrySet()
            kotlin.reflect.jvm.internal.calls.d r7 = kotlin.reflect.jvm.internal.calls.d.a
            r8 = 48
            r9 = 0
            java.lang.String r2 = ", "
            java.lang.String r3 = "("
            java.lang.String r4 = ")"
            r5 = 0
            r6 = 0
            kotlin.collections.f0.p3(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r10 = r1.toString()
            return r10
    }

    private static final java.lang.CharSequence m(java.util.Map.Entry r3) {
            java.lang.String r0 = "entry"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Object r0 = r3.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r3 = r3.getValue()
            boolean r1 = r3 instanceof boolean[]
            java.lang.String r2 = "toString(...)"
            if (r1 == 0) goto L20
            boolean[] r3 = (boolean[]) r3
            java.lang.String r3 = java.util.Arrays.toString(r3)
            kotlin.jvm.internal.g0.o(r3, r2)
            goto L94
        L20:
            boolean r1 = r3 instanceof char[]
            if (r1 == 0) goto L2e
            char[] r3 = (char[]) r3
            java.lang.String r3 = java.util.Arrays.toString(r3)
            kotlin.jvm.internal.g0.o(r3, r2)
            goto L94
        L2e:
            boolean r1 = r3 instanceof byte[]
            if (r1 == 0) goto L3c
            byte[] r3 = (byte[]) r3
            java.lang.String r3 = java.util.Arrays.toString(r3)
            kotlin.jvm.internal.g0.o(r3, r2)
            goto L94
        L3c:
            boolean r1 = r3 instanceof short[]
            if (r1 == 0) goto L4a
            short[] r3 = (short[]) r3
            java.lang.String r3 = java.util.Arrays.toString(r3)
            kotlin.jvm.internal.g0.o(r3, r2)
            goto L94
        L4a:
            boolean r1 = r3 instanceof int[]
            if (r1 == 0) goto L58
            int[] r3 = (int[]) r3
            java.lang.String r3 = java.util.Arrays.toString(r3)
            kotlin.jvm.internal.g0.o(r3, r2)
            goto L94
        L58:
            boolean r1 = r3 instanceof float[]
            if (r1 == 0) goto L66
            float[] r3 = (float[]) r3
            java.lang.String r3 = java.util.Arrays.toString(r3)
            kotlin.jvm.internal.g0.o(r3, r2)
            goto L94
        L66:
            boolean r1 = r3 instanceof long[]
            if (r1 == 0) goto L74
            long[] r3 = (long[]) r3
            java.lang.String r3 = java.util.Arrays.toString(r3)
            kotlin.jvm.internal.g0.o(r3, r2)
            goto L94
        L74:
            boolean r1 = r3 instanceof double[]
            if (r1 == 0) goto L82
            double[] r3 = (double[]) r3
            java.lang.String r3 = java.util.Arrays.toString(r3)
            kotlin.jvm.internal.g0.o(r3, r2)
            goto L94
        L82:
            boolean r1 = r3 instanceof java.lang.Object[]
            if (r1 == 0) goto L90
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.lang.String r3 = java.util.Arrays.toString(r3)
            kotlin.jvm.internal.g0.o(r3, r2)
            goto L94
        L90:
            java.lang.String r3 = r3.toString()
        L94:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r0 = 61
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }

    private static final java.lang.String n(kotlin.s<java.lang.String> r0) {
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    private static final java.lang.Object o(java.lang.Class r2, java.util.Map r3, kotlin.s r4, kotlin.s r5, java.util.List r6, java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) {
            java.lang.String r7 = r8.getName()
            if (r7 == 0) goto L44
            int r0 = r7.hashCode()
            r1 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r0 == r1) goto L36
            r4 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r0 == r4) goto L24
            r4 = 1444986633(0x5620bf09, float:4.4185588E13)
            if (r0 == r4) goto L1a
            goto L44
        L1a:
            java.lang.String r4 = "annotationType"
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L23
            goto L44
        L23:
            return r2
        L24:
            java.lang.String r4 = "hashCode"
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L2d
            goto L44
        L2d:
            int r2 = k(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L36:
            java.lang.String r5 = "toString"
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L3f
            goto L44
        L3f:
            java.lang.String r2 = n(r4)
            return r2
        L44:
            java.lang.String r4 = "equals"
            boolean r4 = kotlin.jvm.internal.g0.g(r7, r4)
            if (r4 == 0) goto L5f
            if (r9 == 0) goto L5f
            int r4 = r9.length
            r5 = 1
            if (r4 != r5) goto L5f
            java.lang.Object r4 = kotlin.collections.n.At(r9)
            boolean r2 = i(r2, r6, r3, r4)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L5f:
            boolean r2 = r3.containsKey(r7)
            if (r2 == 0) goto L6a
            java.lang.Object r2 = r3.get(r7)
            return r2
        L6a:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r2 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Method is not supported: "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r4 = " (args: "
            r3.append(r4)
            if (r9 != 0) goto L83
            r4 = 0
            java.lang.Object[] r9 = new java.lang.Object[r4]
        L83:
            java.util.List r4 = kotlin.collections.n.dz(r9)
            r3.append(r4)
            r4 = 41
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    private static final java.lang.Void p(int r3, java.lang.String r4, java.lang.Class<?> r5) {
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            boolean r1 = kotlin.jvm.internal.g0.g(r5, r0)
            if (r1 == 0) goto Lf
            java.lang.Class<kotlin.reflect.d> r5 = kotlin.reflect.d.class
            kotlin.reflect.d r5 = kotlin.jvm.internal.o0.d(r5)
            goto L2a
        Lf:
            boolean r1 = r5.isArray()
            if (r1 == 0) goto L26
            java.lang.Class r1 = r5.getComponentType()
            boolean r0 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r0 == 0) goto L26
            java.lang.Class<kotlin.reflect.d[]> r5 = kotlin.reflect.d[].class
            kotlin.reflect.d r5 = kotlin.jvm.internal.o0.d(r5)
            goto L2a
        L26:
            kotlin.reflect.d r5 = k3.a.i(r5)
        L2a:
            java.lang.String r0 = r5.x()
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            kotlin.reflect.d r1 = kotlin.jvm.internal.o0.d(r1)
            java.lang.String r1 = r1.x()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.x()
            r0.append(r1)
            r1 = 60
            r0.append(r1)
            java.lang.Class r5 = k3.a.e(r5)
            java.lang.Class r5 = r5.getComponentType()
            java.lang.String r1 = "getComponentType(...)"
            kotlin.jvm.internal.g0.o(r5, r1)
            kotlin.reflect.d r5 = k3.a.i(r5)
            java.lang.String r5 = r5.x()
            r0.append(r5)
            r5 = 62
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            goto L75
        L71:
            java.lang.String r5 = r5.x()
        L75:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Argument #"
            r1.append(r2)
            r1.append(r3)
            r3 = 32
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = " is not of the required type "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static final java.lang.Object q(java.lang.Object r6, java.lang.Class<?> r7) {
            boolean r0 = r6 instanceof java.lang.Class
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r6 instanceof kotlin.reflect.d
            if (r0 == 0) goto L11
            kotlin.reflect.d r6 = (kotlin.reflect.d) r6
            java.lang.Class r6 = k3.a.e(r6)
            goto L47
        L11:
            boolean r0 = r6 instanceof java.lang.Object[]
            if (r0 == 0) goto L47
            r0 = r6
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            boolean r2 = r0 instanceof java.lang.Class[]
            if (r2 == 0) goto L1d
            return r1
        L1d:
            boolean r2 = r0 instanceof kotlin.reflect.d[]
            if (r2 == 0) goto L46
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>"
            kotlin.jvm.internal.g0.n(r6, r0)
            kotlin.reflect.d[] r6 = (kotlin.reflect.d[]) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r6.length
            r0.<init>(r2)
            int r2 = r6.length
            r3 = 0
            r4 = 0
        L31:
            if (r4 >= r2) goto L3f
            r5 = r6[r4]
            java.lang.Class r5 = k3.a.e(r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto L31
        L3f:
            java.lang.Class[] r6 = new java.lang.Class[r3]
            java.lang.Object[] r6 = r0.toArray(r6)
            goto L47
        L46:
            r6 = r0
        L47:
            boolean r7 = r7.isInstance(r6)
            if (r7 == 0) goto L4e
            return r6
        L4e:
            return r1
    }
}
