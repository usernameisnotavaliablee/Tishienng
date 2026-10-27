package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\ntypeOfImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeOfImpl.kt\nkotlin/reflect/jvm/internal/TypeOfImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class n3 {
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.r a(@org.jetbrains.annotations.NotNull kotlin.reflect.r r11) {
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r11, r0)
            r0 = r11
            kotlin.reflect.jvm.internal.z2 r0 = (kotlin.reflect.jvm.internal.z2) r0
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.getType()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.e1
            if (r1 == 0) goto L5b
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r0.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r1.c()
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            r3 = 0
            if (r2 == 0) goto L20
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
            goto L21
        L20:
            r1 = r3
        L21:
            if (r1 == 0) goto L44
            kotlin.reflect.jvm.internal.z2 r11 = new kotlin.reflect.jvm.internal.z2
            r4 = r0
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = (kotlin.reflect.jvm.internal.impl.types.e1) r4
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = d(r1)
            kotlin.reflect.jvm.internal.impl.types.w1 r6 = r0.o()
            java.lang.String r0 = "getTypeConstructor(...)"
            kotlin.jvm.internal.g0.o(r6, r0)
            r9 = 26
            r10 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = kotlin.reflect.jvm.internal.impl.types.w0.l(r4, r5, r6, r7, r8, r9, r10)
            r1 = 2
            r11.<init>(r0, r3, r1, r3)
            return r11
        L44:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Non-class type cannot be a mutable collection type: "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        L5b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Non-simple type cannot be a mutable collection type: "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r0.<init>(r11)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.r b(@org.jetbrains.annotations.NotNull kotlin.reflect.r r8) {
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r8, r0)
            r0 = r8
            kotlin.reflect.jvm.internal.z2 r0 = (kotlin.reflect.jvm.internal.z2) r0
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.getType()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.e1
            if (r1 == 0) goto L35
            kotlin.reflect.jvm.internal.z2 r8 = new kotlin.reflect.jvm.internal.z2
            r1 = r0
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = (kotlin.reflect.jvm.internal.impl.types.e1) r1
            kotlin.reflect.jvm.internal.impl.builtins.j r0 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.o(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r0.H()
            kotlin.reflect.jvm.internal.impl.types.w1 r3 = r0.o()
            java.lang.String r0 = "getTypeConstructor(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            r6 = 26
            r7 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = kotlin.reflect.jvm.internal.impl.types.w0.l(r1, r2, r3, r4, r5, r6, r7)
            r1 = 2
            r8.<init>(r0, r2, r1, r2)
            return r8
        L35:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Non-simple type cannot be a Nothing type: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.r c(@org.jetbrains.annotations.NotNull kotlin.reflect.r r2, @org.jetbrains.annotations.NotNull kotlin.reflect.r r3) {
            java.lang.String r0 = "lowerBound"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "upperBound"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.z2 r0 = new kotlin.reflect.jvm.internal.z2
            kotlin.reflect.jvm.internal.z2 r2 = (kotlin.reflect.jvm.internal.z2) r2
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.getType()
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"
            kotlin.jvm.internal.g0.n(r2, r1)
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = (kotlin.reflect.jvm.internal.impl.types.e1) r2
            kotlin.reflect.jvm.internal.z2 r3 = (kotlin.reflect.jvm.internal.z2) r3
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r3.getType()
            kotlin.jvm.internal.g0.n(r3, r1)
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = (kotlin.reflect.jvm.internal.impl.types.e1) r3
            kotlin.reflect.jvm.internal.impl.types.m2 r2 = kotlin.reflect.jvm.internal.impl.types.w0.e(r2, r3)
            r3 = 0
            r1 = 2
            r0.<init>(r2, r3, r1, r3)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.d d(kotlin.reflect.jvm.internal.impl.descriptors.d r3) {
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c r0 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a
            kotlin.reflect.jvm.internal.impl.name.d r1 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.p(r3)
            kotlin.reflect.jvm.internal.impl.name.c r0 = r0.p(r1)
            if (r0 == 0) goto L1a
            kotlin.reflect.jvm.internal.impl.builtins.j r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.m(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = r3.p(r0)
            java.lang.String r0 = "getBuiltInClassByFqName(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            return r3
        L1a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Not a readonly collection: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }
}
