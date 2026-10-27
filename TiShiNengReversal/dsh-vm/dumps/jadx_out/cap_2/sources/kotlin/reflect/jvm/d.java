package kotlin.reflect.jvm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "ReflectJvmMapping")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nReflectJvmMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJvmMapping.kt\nkotlin/reflect/jvm/ReflectJvmMapping\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,179:1\n1#2:180\n295#3,2:181\n*S KotlinDebug\n*F\n+ 1 ReflectJvmMapping.kt\nkotlin/reflect/jvm/ReflectJvmMapping\n*L\n177#1:181,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;

        static {
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind[] r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.FILE_FACADE     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS_PART     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlin.reflect.jvm.d.a.a = r0
                return
        }
    }

    private static final kotlin.reflect.i<?> a(java.util.Collection<? extends kotlin.reflect.c<?>> r4, java.lang.reflect.Method r5) {
            java.util.Iterator r0 = r4.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            kotlin.reflect.c r1 = (kotlin.reflect.c) r1
            boolean r2 = r1 instanceof kotlin.reflect.i
            if (r2 == 0) goto L4
            kotlin.reflect.i r1 = (kotlin.reflect.i) r1
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = r5.getName()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 == 0) goto L4
            java.lang.reflect.Method r2 = g(r1)
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r5)
            if (r2 == 0) goto L4
            return r1
        L2f:
            java.util.Iterator r4 = r4.iterator()
        L33:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r4.next()
            kotlin.reflect.c r0 = (kotlin.reflect.c) r0
            boolean r1 = r0 instanceof kotlin.reflect.i
            if (r1 == 0) goto L33
            kotlin.reflect.i r0 = (kotlin.reflect.i) r0
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = r5.getName()
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 != 0) goto L33
            java.lang.reflect.Method r1 = g(r0)
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r1 == 0) goto L33
            return r0
        L5e:
            r4 = 0
            return r4
    }

    private static final kotlin.reflect.n<?> b(java.util.Collection<? extends kotlin.reflect.c<?>> r4, java.lang.reflect.Field r5) {
            java.util.Iterator r0 = r4.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            kotlin.reflect.c r1 = (kotlin.reflect.c) r1
            boolean r2 = r1 instanceof kotlin.reflect.n
            if (r2 == 0) goto L4
            kotlin.reflect.n r1 = (kotlin.reflect.n) r1
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = r5.getName()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 == 0) goto L4
            java.lang.reflect.Field r2 = e(r1)
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r5)
            if (r2 == 0) goto L4
            return r1
        L2f:
            java.util.Iterator r4 = r4.iterator()
        L33:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r4.next()
            kotlin.reflect.c r0 = (kotlin.reflect.c) r0
            boolean r1 = r0 instanceof kotlin.reflect.n
            if (r1 == 0) goto L33
            kotlin.reflect.n r0 = (kotlin.reflect.n) r0
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = r5.getName()
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 != 0) goto L33
            java.lang.reflect.Field r1 = e(r0)
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r1 == 0) goto L33
            return r0
        L5e:
            r4 = 0
            return r4
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.reflect.Constructor<T> c(@org.jetbrains.annotations.NotNull kotlin.reflect.i<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.e0 r2 = kotlin.reflect.jvm.internal.p3.b(r2)
            r0 = 0
            if (r2 == 0) goto L17
            kotlin.reflect.jvm.internal.calls.g r2 = r2.W()
            if (r2 == 0) goto L17
            java.lang.reflect.Member r2 = r2.c()
            goto L18
        L17:
            r2 = r0
        L18:
            boolean r1 = r2 instanceof java.lang.reflect.Constructor
            if (r1 == 0) goto L1f
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            return r2
        L1f:
            return r0
    }

    public static /* synthetic */ void d(kotlin.reflect.i r0) {
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.reflect.Field e(@org.jetbrains.annotations.NotNull kotlin.reflect.n<?> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.p2 r1 = kotlin.reflect.jvm.internal.p3.d(r1)
            if (r1 == 0) goto L10
            java.lang.reflect.Field r1 = r1.o0()
            return r1
        L10:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.reflect.Method f(@org.jetbrains.annotations.NotNull kotlin.reflect.n<?> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.n$c r1 = r1.getGetter()
            java.lang.reflect.Method r1 = g(r1)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.reflect.Method g(@org.jetbrains.annotations.NotNull kotlin.reflect.i<?> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.e0 r2 = kotlin.reflect.jvm.internal.p3.b(r2)
            r0 = 0
            if (r2 == 0) goto L17
            kotlin.reflect.jvm.internal.calls.g r2 = r2.W()
            if (r2 == 0) goto L17
            java.lang.reflect.Member r2 = r2.c()
            goto L18
        L17:
            r2 = r0
        L18:
            boolean r1 = r2 instanceof java.lang.reflect.Method
            if (r1 == 0) goto L1f
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            return r2
        L1f:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.reflect.Method h(@org.jetbrains.annotations.NotNull kotlin.reflect.j<?> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.j$a r1 = r1.getSetter()
            java.lang.reflect.Method r1 = g(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.reflect.Type i(@org.jetbrains.annotations.NotNull kotlin.reflect.r r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = r1
            kotlin.reflect.jvm.internal.z2 r0 = (kotlin.reflect.jvm.internal.z2) r0
            java.lang.reflect.Type r0 = r0.b()
            if (r0 != 0) goto L13
            java.lang.reflect.Type r1 = kotlin.reflect.y.f(r1)
            return r1
        L13:
            return r0
    }

    private static final kotlin.reflect.h j(java.lang.reflect.Member r4) {
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f.c
            java.lang.Class r1 = r4.getDeclaringClass()
            java.lang.String r2 = "getDeclaringClass(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f r0 = r0.a(r1)
            r1 = 0
            if (r0 == 0) goto L1d
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r0.e()
            if (r0 == 0) goto L1d
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r0 = r0.c()
            goto L1e
        L1d:
            r0 = r1
        L1e:
            if (r0 != 0) goto L22
            r0 = -1
            goto L2a
        L22:
            int[] r3 = kotlin.reflect.jvm.d.a.a
            int r0 = r0.ordinal()
            r0 = r3[r0]
        L2a:
            r3 = 1
            if (r0 == r3) goto L34
            r3 = 2
            if (r0 == r3) goto L34
            r3 = 3
            if (r0 == r3) goto L34
            return r1
        L34:
            kotlin.reflect.jvm.internal.a2 r0 = new kotlin.reflect.jvm.internal.a2
            java.lang.Class r4 = r4.getDeclaringClass()
            kotlin.jvm.internal.g0.o(r4, r2)
            r0.<init>(r4)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> kotlin.reflect.i<T> k(@org.jetbrains.annotations.NotNull java.lang.reflect.Constructor<T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Class r0 = r3.getDeclaringClass()
            java.lang.String r1 = "getDeclaringClass(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.d r0 = k3.a.i(r0)
            java.util.Collection r0 = r0.f()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            r2 = r1
            kotlin.reflect.i r2 = (kotlin.reflect.i) r2
            java.lang.reflect.Constructor r2 = c(r2)
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 == 0) goto L1c
            goto L35
        L34:
            r1 = 0
        L35:
            kotlin.reflect.i r1 = (kotlin.reflect.i) r1
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.i<?> l(@org.jetbrains.annotations.NotNull java.lang.reflect.Method r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r6.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            java.lang.String r1 = "getDeclaringClass(...)"
            if (r0 == 0) goto L5a
            kotlin.reflect.h r0 = j(r6)
            if (r0 == 0) goto L20
            java.util.Collection r0 = r0.o()
            kotlin.reflect.i r6 = a(r0, r6)
            return r6
        L20:
            java.lang.Class r0 = r6.getDeclaringClass()
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.d r0 = k3.a.i(r0)
            kotlin.reflect.d r0 = kotlin.reflect.full.h.m(r0)
            if (r0 == 0) goto L5a
            java.lang.Class r2 = k3.a.e(r0)
            java.lang.String r3 = r6.getName()
            java.lang.String r4 = "getName(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            java.lang.Class[] r4 = r6.getParameterTypes()
            int r5 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)
            java.lang.Class[] r4 = (java.lang.Class[]) r4
            java.lang.reflect.Method r2 = kotlin.reflect.jvm.internal.p3.j(r2, r3, r4)
            if (r2 == 0) goto L5a
            java.util.Collection r0 = kotlin.reflect.full.h.E(r0)
            kotlin.reflect.i r0 = a(r0, r2)
            if (r0 == 0) goto L5a
            return r0
        L5a:
            java.lang.Class r0 = r6.getDeclaringClass()
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.d r0 = k3.a.i(r0)
            java.util.Collection r0 = kotlin.reflect.full.h.E(r0)
            kotlin.reflect.i r6 = a(r0, r6)
            return r6
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.n<?> m(@org.jetbrains.annotations.NotNull java.lang.reflect.Field r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r5.isSynthetic()
            if (r0 == 0) goto Ld
            r5 = 0
            return r5
        Ld:
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            java.lang.String r1 = "getDeclaringClass(...)"
            if (r0 == 0) goto L5a
            kotlin.reflect.h r0 = j(r5)
            if (r0 == 0) goto L28
            java.util.Collection r0 = r0.o()
            kotlin.reflect.n r5 = b(r0, r5)
            return r5
        L28:
            java.lang.Class r0 = r5.getDeclaringClass()
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.d r0 = k3.a.i(r0)
            kotlin.reflect.d r0 = kotlin.reflect.full.h.m(r0)
            if (r0 == 0) goto L5a
            java.lang.Class r2 = r5.getDeclaringClass()
            kotlin.jvm.internal.g0.o(r2, r1)
            java.lang.String r3 = r5.getName()
            java.lang.String r4 = "getName(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            java.lang.reflect.Field r2 = kotlin.reflect.jvm.internal.p3.i(r2, r3)
            if (r2 == 0) goto L5a
            java.util.Collection r0 = kotlin.reflect.full.h.M(r0)
            kotlin.reflect.n r0 = b(r0, r2)
            if (r0 == 0) goto L5a
            return r0
        L5a:
            java.lang.Class r0 = r5.getDeclaringClass()
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.d r0 = k3.a.i(r0)
            java.util.Collection r0 = kotlin.reflect.full.h.M(r0)
            kotlin.reflect.n r5 = b(r0, r5)
            return r5
    }
}
