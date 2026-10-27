package kotlin.reflect.jvm.internal.impl.load.java.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJavaAnnotationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaAnnotationTargetMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n808#2,11:183\n1374#2:194\n1460#2,5:195\n1563#2:200\n1634#2,3:201\n*S KotlinDebug\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaAnnotationTargetMapper\n*L\n153#1:183,11\n154#1:194\n154#1:195,5\n155#1:200\n155#1:201,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.java.components.f a = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.String, java.util.EnumSet<kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget>> b = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention> c = null;

    static {
            kotlin.reflect.jvm.internal.impl.load.java.components.f r0 = new kotlin.reflect.jvm.internal.impl.load.java.components.f
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.load.java.components.f.a = r0
            java.lang.Class<kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget> r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.class
            java.util.EnumSet r0 = java.util.EnumSet.noneOf(r0)
            java.lang.String r1 = "PACKAGE"
            kotlin.Pair r0 = kotlin.o0.a(r1, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.CLASS
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget r2 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.FILE
            java.util.EnumSet r1 = java.util.EnumSet.of(r1, r2)
            java.lang.String r2 = "TYPE"
            kotlin.Pair r1 = kotlin.o0.a(r2, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget r2 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.ANNOTATION_CLASS
            java.util.EnumSet r2 = java.util.EnumSet.of(r2)
            java.lang.String r3 = "ANNOTATION_TYPE"
            kotlin.Pair r2 = kotlin.o0.a(r3, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget r3 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.TYPE_PARAMETER
            java.util.EnumSet r3 = java.util.EnumSet.of(r3)
            java.lang.String r4 = "TYPE_PARAMETER"
            kotlin.Pair r3 = kotlin.o0.a(r4, r3)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget r4 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.FIELD
            java.util.EnumSet r4 = java.util.EnumSet.of(r4)
            java.lang.String r5 = "FIELD"
            kotlin.Pair r4 = kotlin.o0.a(r5, r4)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget r5 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.LOCAL_VARIABLE
            java.util.EnumSet r5 = java.util.EnumSet.of(r5)
            java.lang.String r6 = "LOCAL_VARIABLE"
            kotlin.Pair r5 = kotlin.o0.a(r6, r5)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget r6 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.VALUE_PARAMETER
            java.util.EnumSet r6 = java.util.EnumSet.of(r6)
            java.lang.String r7 = "PARAMETER"
            kotlin.Pair r6 = kotlin.o0.a(r7, r6)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget r7 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.CONSTRUCTOR
            java.util.EnumSet r7 = java.util.EnumSet.of(r7)
            java.lang.String r8 = "CONSTRUCTOR"
            kotlin.Pair r7 = kotlin.o0.a(r8, r7)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget r8 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.FUNCTION
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget r9 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.PROPERTY_GETTER
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget r10 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.PROPERTY_SETTER
            java.util.EnumSet r8 = java.util.EnumSet.of(r8, r9, r10)
            java.lang.String r9 = "METHOD"
            kotlin.Pair r8 = kotlin.o0.a(r9, r8)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget r9 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.TYPE
            java.util.EnumSet r9 = java.util.EnumSet.of(r9)
            java.lang.String r10 = "TYPE_USE"
            kotlin.Pair r9 = kotlin.o0.a(r10, r9)
            r10 = 10
            kotlin.Pair[] r10 = new kotlin.Pair[r10]
            r11 = 0
            r10[r11] = r0
            r0 = 1
            r10[r0] = r1
            r1 = 2
            r10[r1] = r2
            r2 = 3
            r10[r2] = r3
            r3 = 4
            r10[r3] = r4
            r3 = 5
            r10[r3] = r5
            r3 = 6
            r10[r3] = r6
            r3 = 7
            r10[r3] = r7
            r3 = 8
            r10[r3] = r8
            r3 = 9
            r10[r3] = r9
            java.util.Map r3 = kotlin.collections.i1.W(r10)
            kotlin.reflect.jvm.internal.impl.load.java.components.f.b = r3
            java.lang.String r3 = "RUNTIME"
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention r4 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention.RUNTIME
            kotlin.Pair r3 = kotlin.o0.a(r3, r4)
            java.lang.String r4 = "CLASS"
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention r5 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention.BINARY
            kotlin.Pair r4 = kotlin.o0.a(r4, r5)
            java.lang.String r5 = "SOURCE"
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention r6 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention.SOURCE
            kotlin.Pair r5 = kotlin.o0.a(r5, r6)
            kotlin.Pair[] r2 = new kotlin.Pair[r2]
            r2[r11] = r3
            r2[r0] = r4
            r2[r1] = r5
            java.util.Map r0 = kotlin.collections.i1.W(r2)
            kotlin.reflect.jvm.internal.impl.load.java.components.f.c = r0
            return
    }

    private f() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 a(kotlin.reflect.jvm.internal.impl.descriptors.f0 r0) {
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = e(r0)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.types.t0 e(kotlin.reflect.jvm.internal.impl.descriptors.f0 r2) {
            java.lang.String r0 = "module"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.load.java.components.d r0 = kotlin.reflect.jvm.internal.impl.load.java.components.d.a
            kotlin.reflect.jvm.internal.impl.name.f r0 = r0.d()
            kotlin.reflect.jvm.internal.impl.builtins.j r2 = r2.p()
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.builtins.o.a.H
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = r2.p(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r2 = kotlin.reflect.jvm.internal.impl.load.java.components.a.b(r0, r2)
            if (r2 == 0) goto L23
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.getType()
            if (r2 != 0) goto L22
            goto L23
        L22:
            return r2
        L23:
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r2 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.UNMAPPED_ANNOTATION_TARGET_TYPE
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            kotlin.reflect.jvm.internal.impl.types.error.g r2 = kotlin.reflect.jvm.internal.impl.types.error.i.d(r2, r0)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> b(@org.jetbrains.annotations.Nullable x3.b r4) {
            r3 = this;
            boolean r0 = r4 instanceof x3.m
            r1 = 0
            if (r0 == 0) goto L8
            x3.m r4 = (x3.m) r4
            goto L9
        L8:
            r4 = r1
        L9:
            if (r4 == 0) goto L3c
            java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention> r0 = kotlin.reflect.jvm.internal.impl.load.java.components.f.c
            kotlin.reflect.jvm.internal.impl.name.f r4 = r4.d()
            if (r4 == 0) goto L18
            java.lang.String r4 = r4.b()
            goto L19
        L18:
            r4 = r1
        L19:
            java.lang.Object r4 = r0.get(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention r4 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention) r4
            if (r4 == 0) goto L3c
            kotlin.reflect.jvm.internal.impl.resolve.constants.k r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.k
            kotlin.reflect.jvm.internal.impl.name.b$a r1 = kotlin.reflect.jvm.internal.impl.name.b.d
            kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.builtins.o.a.K
            kotlin.reflect.jvm.internal.impl.name.b r1 = r1.c(r2)
            java.lang.String r4 = r4.name()
            kotlin.reflect.jvm.internal.impl.name.f r4 = kotlin.reflect.jvm.internal.impl.name.f.h(r4)
            java.lang.String r2 = "identifier(...)"
            kotlin.jvm.internal.g0.o(r4, r2)
            r0.<init>(r1, r4)
            return r0
        L3c:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget> c(@org.jetbrains.annotations.Nullable java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.util.EnumSet<kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget>> r0 = kotlin.reflect.jvm.internal.impl.load.java.components.f.b
            java.lang.Object r2 = r0.get(r2)
            java.util.EnumSet r2 = (java.util.EnumSet) r2
            if (r2 == 0) goto Lb
            return r2
        Lb:
            java.util.Set r2 = kotlin.collections.u1.k()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> d(@org.jetbrains.annotations.NotNull java.util.List<? extends x3.b> r6) {
            r5 = this;
            java.lang.String r0 = "arguments"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L10:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r6.next()
            boolean r2 = r1 instanceof x3.m
            if (r2 == 0) goto L10
            r0.add(r1)
            goto L10
        L22:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r0.next()
            x3.m r1 = (x3.m) r1
            kotlin.reflect.jvm.internal.impl.load.java.components.f r2 = kotlin.reflect.jvm.internal.impl.load.java.components.f.a
            kotlin.reflect.jvm.internal.impl.name.f r1 = r1.d()
            if (r1 == 0) goto L44
            java.lang.String r1 = r1.b()
            goto L45
        L44:
            r1 = 0
        L45:
            java.util.Set r1 = r2.c(r1)
            kotlin.collections.f0.s0(r6, r1)
            goto L2b
        L4d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L5c:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L86
            java.lang.Object r1 = r6.next()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget r1 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget) r1
            kotlin.reflect.jvm.internal.impl.resolve.constants.k r2 = new kotlin.reflect.jvm.internal.impl.resolve.constants.k
            kotlin.reflect.jvm.internal.impl.name.b$a r3 = kotlin.reflect.jvm.internal.impl.name.b.d
            kotlin.reflect.jvm.internal.impl.name.c r4 = kotlin.reflect.jvm.internal.impl.builtins.o.a.J
            kotlin.reflect.jvm.internal.impl.name.b r3 = r3.c(r4)
            java.lang.String r1 = r1.name()
            kotlin.reflect.jvm.internal.impl.name.f r1 = kotlin.reflect.jvm.internal.impl.name.f.h(r1)
            java.lang.String r4 = "identifier(...)"
            kotlin.jvm.internal.g0.o(r1, r4)
            r2.<init>(r3, r1)
            r0.add(r2)
            goto L5c
        L86:
            kotlin.reflect.jvm.internal.impl.resolve.constants.b r6 = new kotlin.reflect.jvm.internal.impl.resolve.constants.b
            kotlin.reflect.jvm.internal.impl.load.java.components.e r1 = kotlin.reflect.jvm.internal.impl.load.java.components.e.a
            r6.<init>(r0, r1)
            return r6
    }
}
