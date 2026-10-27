package kotlin.reflect.jvm.internal.impl.builtins;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nUnsignedType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnsignedType.kt\norg/jetbrains/kotlin/builtins/UnsignedTypes\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,122:1\n11228#2:123\n11563#2,3:124\n11228#2:127\n11563#2,3:128\n11563#2,3:131\n*S KotlinDebug\n*F\n+ 1 UnsignedType.kt\norg/jetbrains/kotlin/builtins/UnsignedTypes\n*L\n36#1:123\n36#1:124,3\n37#1:127\n37#1:128,3\n47#1:131,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class q {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.builtins.q a = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> b = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> c = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> d = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> e = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.HashMap<kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType, kotlin.reflect.jvm.internal.impl.name.f> f = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> g = null;

    static {
            kotlin.reflect.jvm.internal.impl.builtins.q r0 = new kotlin.reflect.jvm.internal.impl.builtins.q
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.builtins.q.a = r0
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedType[] r0 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedType.values()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
            r4 = 0
        L14:
            if (r4 >= r2) goto L22
            r5 = r0[r4]
            kotlin.reflect.jvm.internal.impl.name.f r5 = r5.getTypeName()
            r1.add(r5)
            int r4 = r4 + 1
            goto L14
        L22:
            java.util.Set r0 = kotlin.collections.f0.f6(r1)
            kotlin.reflect.jvm.internal.impl.builtins.q.b = r0
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType[] r0 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType.values()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r4 = 0
        L34:
            if (r4 >= r2) goto L42
            r5 = r0[r4]
            kotlin.reflect.jvm.internal.impl.name.f r5 = r5.getTypeName()
            r1.add(r5)
            int r4 = r4 + 1
            goto L34
        L42:
            java.util.Set r0 = kotlin.collections.f0.f6(r1)
            kotlin.reflect.jvm.internal.impl.builtins.q.c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.builtins.q.d = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.builtins.q.e = r0
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType r0 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType.UBYTEARRAY
            java.lang.String r1 = "ubyteArrayOf"
            kotlin.reflect.jvm.internal.impl.name.f r1 = kotlin.reflect.jvm.internal.impl.name.f.h(r1)
            kotlin.Pair r0 = kotlin.o0.a(r0, r1)
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType r1 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType.USHORTARRAY
            java.lang.String r2 = "ushortArrayOf"
            kotlin.reflect.jvm.internal.impl.name.f r2 = kotlin.reflect.jvm.internal.impl.name.f.h(r2)
            kotlin.Pair r1 = kotlin.o0.a(r1, r2)
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType r2 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType.UINTARRAY
            java.lang.String r4 = "uintArrayOf"
            kotlin.reflect.jvm.internal.impl.name.f r4 = kotlin.reflect.jvm.internal.impl.name.f.h(r4)
            kotlin.Pair r2 = kotlin.o0.a(r2, r4)
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType r4 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType.ULONGARRAY
            java.lang.String r5 = "ulongArrayOf"
            kotlin.reflect.jvm.internal.impl.name.f r5 = kotlin.reflect.jvm.internal.impl.name.f.h(r5)
            kotlin.Pair r4 = kotlin.o0.a(r4, r5)
            r5 = 4
            kotlin.Pair[] r5 = new kotlin.Pair[r5]
            r5[r3] = r0
            r0 = 1
            r5[r0] = r1
            r0 = 2
            r5[r0] = r2
            r0 = 3
            r5[r0] = r4
            java.util.HashMap r0 = kotlin.collections.i1.M(r5)
            kotlin.reflect.jvm.internal.impl.builtins.q.f = r0
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedType[] r0 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedType.values()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            int r2 = r0.length
            r4 = 0
        La5:
            if (r4 >= r2) goto Lb7
            r5 = r0[r4]
            kotlin.reflect.jvm.internal.impl.name.b r5 = r5.getArrayClassId()
            kotlin.reflect.jvm.internal.impl.name.f r5 = r5.h()
            r1.add(r5)
            int r4 = r4 + 1
            goto La5
        Lb7:
            kotlin.reflect.jvm.internal.impl.builtins.q.g = r1
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedType[] r0 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedType.values()
            int r1 = r0.length
        Lbe:
            if (r3 >= r1) goto Ldf
            r2 = r0[r3]
            java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> r4 = kotlin.reflect.jvm.internal.impl.builtins.q.d
            kotlin.reflect.jvm.internal.impl.name.b r5 = r2.getArrayClassId()
            kotlin.reflect.jvm.internal.impl.name.b r6 = r2.getClassId()
            r4.put(r5, r6)
            java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> r4 = kotlin.reflect.jvm.internal.impl.builtins.q.e
            kotlin.reflect.jvm.internal.impl.name.b r5 = r2.getClassId()
            kotlin.reflect.jvm.internal.impl.name.b r2 = r2.getArrayClassId()
            r4.put(r5, r2)
            int r3 = r3 + 1
            goto Lbe
        Ldf:
            return
    }

    private q() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    public static final boolean d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.j2.w(r2)
            r1 = 0
            if (r0 == 0) goto Ld
            return r1
        Ld:
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r2.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r2 = r2.c()
            if (r2 != 0) goto L18
            return r1
        L18:
            kotlin.reflect.jvm.internal.impl.builtins.q r0 = kotlin.reflect.jvm.internal.impl.builtins.q.a
            boolean r2 = r0.c(r2)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.name.b a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r2) {
            r1 = this;
            java.lang.String r0 = "arrayClassId"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> r0 = kotlin.reflect.jvm.internal.impl.builtins.q.d
            java.lang.Object r2 = r0.get(r2)
            kotlin.reflect.jvm.internal.impl.name.b r2 = (kotlin.reflect.jvm.internal.impl.name.b) r2
            return r2
    }

    public final boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> r0 = kotlin.reflect.jvm.internal.impl.builtins.q.g
            boolean r2 = r0.contains(r2)
            return r2
    }

    public final boolean c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r3) {
            r2 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r3.b()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0
            if (r1 == 0) goto L29
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.l0) r0
            kotlin.reflect.jvm.internal.impl.name.c r0 = r0.d()
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.builtins.o.B
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L29
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> r0 = kotlin.reflect.jvm.internal.impl.builtins.q.b
            kotlin.reflect.jvm.internal.impl.name.f r3 = r3.getName()
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L29
            r3 = 1
            return r3
        L29:
            r3 = 0
            return r3
    }
}
