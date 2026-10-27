package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nreflectClassUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 reflectClassUtil.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectClassUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n1563#2:100\n1634#2,3:101\n1563#2:104\n1634#2,3:105\n1573#2:108\n1604#2,4:109\n*S KotlinDebug\n*F\n+ 1 reflectClassUtil.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectClassUtilKt\n*L\n34#1:100\n34#1:101,3\n35#1:104\n35#1:105,3\n50#1:108\n50#1:109,4\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f {

    @org.jetbrains.annotations.NotNull
    private static final java.util.List<kotlin.reflect.d<? extends java.lang.Object>> a = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.Class<? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>> b = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.Class<? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>> c = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.Class<? extends kotlin.n<?>>, java.lang.Integer> d = null;

    static {
            java.lang.Class r0 = java.lang.Boolean.TYPE
            kotlin.reflect.d r0 = kotlin.jvm.internal.o0.d(r0)
            java.lang.Class r1 = java.lang.Byte.TYPE
            kotlin.reflect.d r1 = kotlin.jvm.internal.o0.d(r1)
            java.lang.Class r2 = java.lang.Character.TYPE
            kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
            java.lang.Class r3 = java.lang.Double.TYPE
            kotlin.reflect.d r3 = kotlin.jvm.internal.o0.d(r3)
            java.lang.Class r4 = java.lang.Float.TYPE
            kotlin.reflect.d r4 = kotlin.jvm.internal.o0.d(r4)
            java.lang.Class r5 = java.lang.Integer.TYPE
            kotlin.reflect.d r5 = kotlin.jvm.internal.o0.d(r5)
            java.lang.Class r6 = java.lang.Long.TYPE
            kotlin.reflect.d r6 = kotlin.jvm.internal.o0.d(r6)
            java.lang.Class r7 = java.lang.Short.TYPE
            kotlin.reflect.d r7 = kotlin.jvm.internal.o0.d(r7)
            r8 = 8
            kotlin.reflect.d[] r9 = new kotlin.reflect.d[r8]
            r10 = 0
            r9[r10] = r0
            r0 = 1
            r9[r0] = r1
            r1 = 2
            r9[r1] = r2
            r2 = 3
            r9[r2] = r3
            r3 = 4
            r9[r3] = r4
            r4 = 5
            r9[r4] = r5
            r5 = 6
            r9[r5] = r6
            r6 = 7
            r9[r6] = r7
            java.util.List r7 = kotlin.collections.f0.Q(r9)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.a = r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r9 = new java.util.ArrayList
            r11 = 10
            int r12 = kotlin.collections.f0.d0(r7, r11)
            r9.<init>(r12)
            java.util.Iterator r7 = r7.iterator()
        L63:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L7f
            java.lang.Object r12 = r7.next()
            kotlin.reflect.d r12 = (kotlin.reflect.d) r12
            java.lang.Class r13 = k3.a.g(r12)
            java.lang.Class r12 = k3.a.h(r12)
            kotlin.Pair r12 = kotlin.o0.a(r13, r12)
            r9.add(r12)
            goto L63
        L7f:
            java.util.Map r7 = kotlin.collections.i1.B0(r9)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.b = r7
            java.util.List<kotlin.reflect.d<? extends java.lang.Object>> r7 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.a
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r9 = new java.util.ArrayList
            int r12 = kotlin.collections.f0.d0(r7, r11)
            r9.<init>(r12)
            java.util.Iterator r7 = r7.iterator()
        L96:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto Lb2
            java.lang.Object r12 = r7.next()
            kotlin.reflect.d r12 = (kotlin.reflect.d) r12
            java.lang.Class r13 = k3.a.h(r12)
            java.lang.Class r12 = k3.a.g(r12)
            kotlin.Pair r12 = kotlin.o0.a(r13, r12)
            r9.add(r12)
            goto L96
        Lb2:
            java.util.Map r7 = kotlin.collections.i1.B0(r9)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.c = r7
            r7 = 23
            java.lang.Class[] r7 = new java.lang.Class[r7]
            java.lang.Class<kotlin.jvm.functions.Function0> r9 = kotlin.jvm.functions.Function0.class
            r7[r10] = r9
            java.lang.Class<kotlin.jvm.functions.Function1> r9 = kotlin.jvm.functions.Function1.class
            r7[r0] = r9
            java.lang.Class<kotlin.jvm.functions.Function2> r0 = kotlin.jvm.functions.Function2.class
            r7[r1] = r0
            java.lang.Class<kotlin.jvm.functions.Function3> r0 = kotlin.jvm.functions.Function3.class
            r7[r2] = r0
            java.lang.Class<kotlin.jvm.functions.Function4> r0 = kotlin.jvm.functions.Function4.class
            r7[r3] = r0
            java.lang.Class<kotlin.jvm.functions.Function5> r0 = kotlin.jvm.functions.Function5.class
            r7[r4] = r0
            java.lang.Class<kotlin.jvm.functions.Function6> r0 = kotlin.jvm.functions.Function6.class
            r7[r5] = r0
            java.lang.Class<kotlin.jvm.functions.Function7> r0 = kotlin.jvm.functions.Function7.class
            r7[r6] = r0
            java.lang.Class<kotlin.jvm.functions.Function8> r0 = kotlin.jvm.functions.Function8.class
            r7[r8] = r0
            java.lang.Class<kotlin.jvm.functions.Function9> r0 = kotlin.jvm.functions.Function9.class
            r1 = 9
            r7[r1] = r0
            java.lang.Class<kotlin.jvm.functions.Function10> r0 = kotlin.jvm.functions.Function10.class
            r7[r11] = r0
            java.lang.Class<kotlin.jvm.functions.Function11> r0 = kotlin.jvm.functions.Function11.class
            r1 = 11
            r7[r1] = r0
            java.lang.Class<kotlin.jvm.functions.Function12> r0 = kotlin.jvm.functions.Function12.class
            r1 = 12
            r7[r1] = r0
            java.lang.Class<kotlin.jvm.functions.Function13> r0 = kotlin.jvm.functions.Function13.class
            r1 = 13
            r7[r1] = r0
            java.lang.Class<kotlin.jvm.functions.Function14> r0 = kotlin.jvm.functions.Function14.class
            r1 = 14
            r7[r1] = r0
            java.lang.Class<kotlin.jvm.functions.Function15> r0 = kotlin.jvm.functions.Function15.class
            r1 = 15
            r7[r1] = r0
            java.lang.Class<kotlin.jvm.functions.Function16> r0 = kotlin.jvm.functions.Function16.class
            r1 = 16
            r7[r1] = r0
            java.lang.Class<kotlin.jvm.functions.Function17> r0 = kotlin.jvm.functions.Function17.class
            r1 = 17
            r7[r1] = r0
            java.lang.Class<kotlin.jvm.functions.Function18> r0 = kotlin.jvm.functions.Function18.class
            r1 = 18
            r7[r1] = r0
            java.lang.Class<kotlin.jvm.functions.Function19> r0 = kotlin.jvm.functions.Function19.class
            r1 = 19
            r7[r1] = r0
            java.lang.Class<kotlin.jvm.functions.Function20> r0 = kotlin.jvm.functions.Function20.class
            r1 = 20
            r7[r1] = r0
            java.lang.Class<kotlin.jvm.functions.Function21> r0 = kotlin.jvm.functions.Function21.class
            r1 = 21
            r7[r1] = r0
            java.lang.Class<kotlin.jvm.functions.Function22> r0 = kotlin.jvm.functions.Function22.class
            r1 = 22
            r7[r1] = r0
            java.util.List r0 = kotlin.collections.f0.Q(r7)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.f0.d0(r0, r11)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L145:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L165
            java.lang.Object r2 = r0.next()
            int r3 = r10 + 1
            if (r10 >= 0) goto L156
            kotlin.collections.f0.b0()
        L156:
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            kotlin.Pair r2 = kotlin.o0.a(r2, r4)
            r1.add(r2)
            r10 = r3
            goto L145
        L165:
            java.util.Map r0 = kotlin.collections.i1.B0(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.d = r0
            return
    }

    private static final java.lang.reflect.ParameterizedType a(java.lang.reflect.ParameterizedType r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.reflect.Type r1 = r1.getOwnerType()
            boolean r0 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L10
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            return r1
        L10:
            r1 = 0
            return r1
    }

    private static final kotlin.sequences.m b(java.lang.reflect.ParameterizedType r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()
            java.lang.String r0 = "getActualTypeArguments(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            kotlin.sequences.m r1 = kotlin.collections.n.T5(r1)
            return r1
    }

    static /* synthetic */ java.lang.reflect.ParameterizedType c(java.lang.reflect.ParameterizedType r0) {
            java.lang.reflect.ParameterizedType r0 = a(r0)
            return r0
    }

    static /* synthetic */ kotlin.sequences.m d(java.lang.reflect.ParameterizedType r0) {
            kotlin.sequences.m r0 = b(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.name.b e(@org.jetbrains.annotations.NotNull java.lang.Class<?> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = r4.isPrimitive()
            if (r0 != 0) goto L9b
            boolean r0 = r4.isArray()
            if (r0 != 0) goto L84
            java.lang.reflect.Method r0 = r4.getEnclosingMethod()
            java.lang.String r1 = "getName(...)"
            if (r0 != 0) goto L63
            java.lang.reflect.Constructor r0 = r4.getEnclosingConstructor()
            if (r0 != 0) goto L63
            java.lang.String r0 = r4.getSimpleName()
            java.lang.String r2 = "getSimpleName(...)"
            kotlin.jvm.internal.g0.o(r0, r2)
            int r0 = r0.length()
            if (r0 != 0) goto L2f
            goto L63
        L2f:
            java.lang.Class r0 = r4.getDeclaringClass()
            if (r0 == 0) goto L50
            kotlin.reflect.jvm.internal.impl.name.b r0 = e(r0)
            if (r0 == 0) goto L50
            java.lang.String r2 = r4.getSimpleName()
            kotlin.reflect.jvm.internal.impl.name.f r2 = kotlin.reflect.jvm.internal.impl.name.f.h(r2)
            java.lang.String r3 = "identifier(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            kotlin.reflect.jvm.internal.impl.name.b r0 = r0.d(r2)
            if (r0 != 0) goto L4f
            goto L50
        L4f:
            return r0
        L50:
            kotlin.reflect.jvm.internal.impl.name.b$a r0 = kotlin.reflect.jvm.internal.impl.name.b.d
            kotlin.reflect.jvm.internal.impl.name.c r2 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r4 = r4.getName()
            kotlin.jvm.internal.g0.o(r4, r1)
            r2.<init>(r4)
            kotlin.reflect.jvm.internal.impl.name.b r4 = r0.c(r2)
            return r4
        L63:
            kotlin.reflect.jvm.internal.impl.name.c r0 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r4 = r4.getName()
            kotlin.jvm.internal.g0.o(r4, r1)
            r0.<init>(r4)
            kotlin.reflect.jvm.internal.impl.name.b r4 = new kotlin.reflect.jvm.internal.impl.name.b
            kotlin.reflect.jvm.internal.impl.name.c r1 = r0.d()
            kotlin.reflect.jvm.internal.impl.name.c$a r2 = kotlin.reflect.jvm.internal.impl.name.c.c
            kotlin.reflect.jvm.internal.impl.name.f r0 = r0.f()
            kotlin.reflect.jvm.internal.impl.name.c r0 = r2.a(r0)
            r2 = 1
            r4.<init>(r1, r0, r2)
            return r4
        L84:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can't compute ClassId for array type: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L9b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can't compute ClassId for primitive type: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String f(@org.jetbrains.annotations.NotNull java.lang.Class<?> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            boolean r0 = r9.isPrimitive()
            if (r0 == 0) goto L91
            java.lang.String r0 = r9.getName()
            int r1 = r0.hashCode()
            switch(r1) {
                case -1325958191: goto L6f;
                case 104431: goto L64;
                case 3039496: goto L59;
                case 3052374: goto L4e;
                case 3327612: goto L43;
                case 3625364: goto L38;
                case 64711720: goto L2d;
                case 97526364: goto L22;
                case 109413500: goto L17;
                default: goto L16;
            }
        L16:
            goto L7a
        L17:
            java.lang.String r1 = "short"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7a
            java.lang.String r9 = "S"
            return r9
        L22:
            java.lang.String r1 = "float"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7a
            java.lang.String r9 = "F"
            return r9
        L2d:
            java.lang.String r1 = "boolean"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7a
            java.lang.String r9 = "Z"
            return r9
        L38:
            java.lang.String r1 = "void"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7a
            java.lang.String r9 = "V"
            return r9
        L43:
            java.lang.String r1 = "long"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7a
            java.lang.String r9 = "J"
            return r9
        L4e:
            java.lang.String r1 = "char"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7a
            java.lang.String r9 = "C"
            return r9
        L59:
            java.lang.String r1 = "byte"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7a
            java.lang.String r9 = "B"
            return r9
        L64:
            java.lang.String r1 = "int"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7a
            java.lang.String r9 = "I"
            return r9
        L6f:
            java.lang.String r1 = "double"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7a
            java.lang.String r9 = "D"
            return r9
        L7a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported primitive type: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        L91:
            boolean r0 = r9.isArray()
            java.lang.String r1 = "getName(...)"
            if (r0 == 0) goto Lac
            java.lang.String r2 = r9.getName()
            kotlin.jvm.internal.g0.o(r2, r1)
            r6 = 4
            r7 = 0
            r3 = 46
            r4 = 47
            r5 = 0
            java.lang.String r9 = kotlin.text.u.w2(r2, r3, r4, r5, r6, r7)
            return r9
        Lac:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 76
            r0.append(r2)
            java.lang.String r3 = r9.getName()
            kotlin.jvm.internal.g0.o(r3, r1)
            r7 = 4
            r8 = 0
            r4 = 46
            r5 = 47
            r6 = 0
            java.lang.String r9 = kotlin.text.u.w2(r3, r4, r5, r6, r7, r8)
            r0.append(r9)
            r9 = 59
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            return r9
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Integer g(@org.jetbrains.annotations.NotNull java.lang.Class<?> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Map<java.lang.Class<? extends kotlin.n<?>>, java.lang.Integer> r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.d
            java.lang.Object r1 = r0.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.reflect.Type> h(@org.jetbrains.annotations.NotNull java.lang.reflect.Type r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r0 != 0) goto Le
            java.util.List r2 = kotlin.collections.f0.J()
            return r2
        Le:
            r0 = r2
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type r1 = r0.getOwnerType()
            if (r1 != 0) goto L25
            java.lang.reflect.Type[] r2 = r0.getActualTypeArguments()
            java.lang.String r0 = "getActualTypeArguments(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            java.util.List r2 = kotlin.collections.n.dz(r2)
            return r2
        L25:
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.a
            kotlin.sequences.m r2 = kotlin.sequences.p.t(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e.a
            kotlin.sequences.m r2 = kotlin.sequences.p.k1(r2, r0)
            java.util.List r2 = kotlin.sequences.p.I3(r2)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Class<?> i(@org.jetbrains.annotations.NotNull java.lang.Class<?> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Map<java.lang.Class<? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>> r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.b
            java.lang.Object r1 = r0.get(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.ClassLoader j(@org.jetbrains.annotations.NotNull java.lang.Class<?> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.ClassLoader r1 = r1.getClassLoader()
            if (r1 != 0) goto L14
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()
            java.lang.String r0 = "getSystemClassLoader(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
        L14:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Class<?> k(@org.jetbrains.annotations.NotNull java.lang.Class<?> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.Map<java.lang.Class<? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>> r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.c
            java.lang.Object r1 = r0.get(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            return r1
    }

    public static final boolean l(@org.jetbrains.annotations.NotNull java.lang.Class<?> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r1 = r0.isAssignableFrom(r1)
            return r1
    }
}
