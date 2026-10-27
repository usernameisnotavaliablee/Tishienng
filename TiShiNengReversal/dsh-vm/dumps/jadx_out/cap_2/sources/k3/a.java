package k3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "JvmClassMappingKt")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.annotation.Annotation> kotlin.reflect.d<? extends T> a(@org.jetbrains.annotations.NotNull T r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Class r1 = r1.annotationType()
            java.lang.String r0 = "annotationType(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            kotlin.reflect.d r1 = i(r1)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>"
            kotlin.jvm.internal.g0.n(r1, r0)
            return r1
    }

    private static final <E extends java.lang.Enum<E>> java.lang.Class<E> b(java.lang.Enum<E> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Class r1 = r1.getDeclaringClass()
            java.lang.String r0 = "getDeclaringClass(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.7")
    @kotlin.internal.InlineOnly
    public static /* synthetic */ void c(java.lang.Enum r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.lang.Class<T> d(@org.jetbrains.annotations.NotNull T r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Class r1 = r1.getClass()
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>"
            kotlin.jvm.internal.g0.n(r1, r0)
            return r1
    }

    @kotlin.jvm.JvmName(name = "getJavaClass")
    @org.jetbrains.annotations.NotNull
    public static final <T> java.lang.Class<T> e(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.jvm.internal.s r1 = (kotlin.jvm.internal.s) r1
            java.lang.Class r1 = r1.c()
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>"
            kotlin.jvm.internal.g0.n(r1, r0)
            return r1
    }

    public static /* synthetic */ void f(kotlin.reflect.d r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> java.lang.Class<T> g(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.jvm.internal.s r3 = (kotlin.jvm.internal.s) r3
            java.lang.Class r3 = r3.c()
            boolean r0 = r3.isPrimitive()
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>"
            if (r0 != 0) goto L17
            kotlin.jvm.internal.g0.n(r3, r1)
            return r3
        L17:
            java.lang.String r0 = r3.getName()
            int r2 = r0.hashCode()
            switch(r2) {
                case -1325958191: goto L86;
                case 104431: goto L7a;
                case 3039496: goto L6e;
                case 3052374: goto L62;
                case 3327612: goto L56;
                case 3625364: goto L4a;
                case 64711720: goto L3e;
                case 97526364: goto L32;
                case 109413500: goto L24;
                default: goto L22;
            }
        L22:
            goto L91
        L24:
            java.lang.String r2 = "short"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L2e
            goto L91
        L2e:
            java.lang.Class<java.lang.Short> r3 = java.lang.Short.class
            goto L91
        L32:
            java.lang.String r2 = "float"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L3b
            goto L91
        L3b:
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            goto L91
        L3e:
            java.lang.String r2 = "boolean"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L47
            goto L91
        L47:
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            goto L91
        L4a:
            java.lang.String r2 = "void"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L53
            goto L91
        L53:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            goto L91
        L56:
            java.lang.String r2 = "long"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5f
            goto L91
        L5f:
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            goto L91
        L62:
            java.lang.String r2 = "char"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L6b
            goto L91
        L6b:
            java.lang.Class<java.lang.Character> r3 = java.lang.Character.class
            goto L91
        L6e:
            java.lang.String r2 = "byte"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L77
            goto L91
        L77:
            java.lang.Class<java.lang.Byte> r3 = java.lang.Byte.class
            goto L91
        L7a:
            java.lang.String r2 = "int"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L83
            goto L91
        L83:
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            goto L91
        L86:
            java.lang.String r2 = "double"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L8f
            goto L91
        L8f:
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
        L91:
            kotlin.jvm.internal.g0.n(r3, r1)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Class<T> h(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.jvm.internal.s r1 = (kotlin.jvm.internal.s) r1
            java.lang.Class r1 = r1.c()
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto L17
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>"
            kotlin.jvm.internal.g0.n(r1, r0)
            return r1
        L17:
            java.lang.String r1 = r1.getName()
            int r0 = r1.hashCode()
            switch(r0) {
                case -2056817302: goto L84;
                case -527879800: goto L78;
                case -515992664: goto L6c;
                case 155276373: goto L60;
                case 344809556: goto L54;
                case 398507100: goto L48;
                case 398795216: goto L3c;
                case 399092968: goto L30;
                case 761287205: goto L24;
                default: goto L22;
            }
        L22:
            goto L8c
        L24:
            java.lang.String r0 = "java.lang.Double"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2d
            goto L8c
        L2d:
            java.lang.Class r1 = java.lang.Double.TYPE
            return r1
        L30:
            java.lang.String r0 = "java.lang.Void"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L39
            goto L8c
        L39:
            java.lang.Class r1 = java.lang.Void.TYPE
            return r1
        L3c:
            java.lang.String r0 = "java.lang.Long"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L45
            goto L8c
        L45:
            java.lang.Class r1 = java.lang.Long.TYPE
            return r1
        L48:
            java.lang.String r0 = "java.lang.Byte"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L51
            goto L8c
        L51:
            java.lang.Class r1 = java.lang.Byte.TYPE
            return r1
        L54:
            java.lang.String r0 = "java.lang.Boolean"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L5d
            goto L8c
        L5d:
            java.lang.Class r1 = java.lang.Boolean.TYPE
            return r1
        L60:
            java.lang.String r0 = "java.lang.Character"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L69
            goto L8c
        L69:
            java.lang.Class r1 = java.lang.Character.TYPE
            return r1
        L6c:
            java.lang.String r0 = "java.lang.Short"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L75
            goto L8c
        L75:
            java.lang.Class r1 = java.lang.Short.TYPE
            return r1
        L78:
            java.lang.String r0 = "java.lang.Float"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L81
            goto L8c
        L81:
            java.lang.Class r1 = java.lang.Float.TYPE
            return r1
        L84:
            java.lang.String r0 = "java.lang.Integer"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L8e
        L8c:
            r1 = 0
            return r1
        L8e:
            java.lang.Class r1 = java.lang.Integer.TYPE
            return r1
    }

    @kotlin.jvm.JvmName(name = "getKotlinClass")
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.reflect.d<T> i(@org.jetbrains.annotations.NotNull java.lang.Class<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.d r1 = kotlin.jvm.internal.o0.d(r1)
            return r1
    }

    @kotlin.jvm.JvmName(name = "getRuntimeClassOfKClassInstance")
    @org.jetbrains.annotations.NotNull
    public static final <T> java.lang.Class<kotlin.reflect.d<T>> j(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Class r1 = r1.getClass()
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>"
            kotlin.jvm.internal.g0.n(r1, r0)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @kotlin.ReplaceWith(expression = "(this as Any).javaClass", imports = {}))
    public static /* synthetic */ void k(kotlin.reflect.d r0) {
            return
    }

    public static final /* synthetic */ boolean l(java.lang.Object[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 4
            java.lang.String r1 = "T"
            kotlin.jvm.internal.g0.y(r0, r1)
            java.lang.Class r2 = r2.getClass()
            java.lang.Class r2 = r2.getComponentType()
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r2 = r0.isAssignableFrom(r2)
            return r2
    }
}
