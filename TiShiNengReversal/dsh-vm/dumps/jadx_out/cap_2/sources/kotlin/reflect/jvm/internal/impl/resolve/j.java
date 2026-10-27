package kotlin.reflect.jvm.internal.impl.resolve;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\ninlineClassesUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 inlineClassesUtils.kt\norg/jetbrains/kotlin/resolve/InlineClassesUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1563#2:91\n1634#2,3:92\n1563#2:96\n1634#2,3:97\n1761#2,3:100\n1#3:95\n*S KotlinDebug\n*F\n+ 1 inlineClassesUtils.kt\norg/jetbrains/kotlin/resolve/InlineClassesUtilsKt\n*L\n40#1:91\n40#1:92,3\n56#1:96\n56#1:97,3\n67#1:100,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class j {

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.name.c a = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.name.b b = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.name.c c = null;

    static {
            kotlin.reflect.jvm.internal.impl.name.c r0 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r1 = "kotlin.jvm.JvmInline"
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.resolve.j.a = r0
            kotlin.reflect.jvm.internal.impl.name.b$a r1 = kotlin.reflect.jvm.internal.impl.name.b.d
            kotlin.reflect.jvm.internal.impl.name.b r0 = r1.c(r0)
            kotlin.reflect.jvm.internal.impl.resolve.j.b = r0
            kotlin.reflect.jvm.internal.impl.name.c r0 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r1 = "kotlin.jvm.JvmName"
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.resolve.j.c = r0
            return
    }

    public static final boolean a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.x0
            if (r0 == 0) goto L1c
            kotlin.reflect.jvm.internal.impl.descriptors.x0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.x0) r1
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r1 = r1.h0()
            java.lang.String r0 = "getCorrespondingProperty(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            boolean r1 = f(r1)
            if (r1 == 0) goto L1c
            r1 = 1
            return r1
        L1c:
            r1 = 0
            return r1
    }

    public static final boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r0 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
            kotlin.reflect.jvm.internal.impl.descriptors.o1 r1 = r1.g0()
            boolean r1 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.z
            if (r1 == 0) goto L15
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public static final boolean c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r1.c()
            if (r1 == 0) goto L14
            boolean r1 = b(r1)
            return r1
        L14:
            r1 = 0
            return r1
    }

    public static final boolean d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r0 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
            kotlin.reflect.jvm.internal.impl.descriptors.o1 r1 = r1.g0()
            boolean r1 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.g0
            if (r1 == 0) goto L15
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public static final boolean e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s1 r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r3.f0()
            if (r0 != 0) goto L30
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r3.b()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            r2 = 0
            if (r1 == 0) goto L17
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
            goto L18
        L17:
            r0 = r2
        L18:
            if (r0 == 0) goto L24
            kotlin.reflect.jvm.internal.impl.descriptors.z r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.q(r0)
            if (r0 == 0) goto L24
            kotlin.reflect.jvm.internal.impl.name.f r2 = r0.c()
        L24:
            kotlin.reflect.jvm.internal.impl.name.f r3 = r3.getName()
            boolean r3 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r3 == 0) goto L30
            r3 = 1
            return r3
        L30:
            r3 = 0
            return r3
    }

    public static final boolean f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s1 r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r2.f0()
            if (r0 != 0) goto L30
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r2.b()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r1 == 0) goto L16
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L30
            kotlin.reflect.jvm.internal.impl.descriptors.o1 r0 = r0.g0()
            if (r0 == 0) goto L30
            kotlin.reflect.jvm.internal.impl.name.f r2 = r2.getName()
            java.lang.String r1 = "getName(...)"
            kotlin.jvm.internal.g0.o(r2, r1)
            boolean r2 = r0.a(r2)
            r0 = 1
            if (r2 != r0) goto L30
            return r0
        L30:
            r2 = 0
            return r2
    }

    public static final boolean g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = b(r1)
            if (r0 != 0) goto L14
            boolean r1 = d(r1)
            if (r1 == 0) goto L12
            goto L14
        L12:
            r1 = 0
            return r1
        L14:
            r1 = 1
            return r1
    }

    public static final boolean h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r1.c()
            if (r1 == 0) goto L14
            boolean r1 = g(r1)
            return r1
        L14:
            r1 = 0
            return r1
    }

    public static final boolean i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r2.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.c()
            r1 = 0
            if (r0 == 0) goto L20
            boolean r0 = d(r0)
            if (r0 == 0) goto L20
            kotlin.reflect.jvm.internal.impl.types.checker.u r0 = kotlin.reflect.jvm.internal.impl.types.checker.u.a
            boolean r2 = r0.i0(r2)
            if (r2 != 0) goto L20
            r2 = 1
            return r2
        L20:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.types.t0 j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = k(r2)
            if (r0 == 0) goto L16
            kotlin.reflect.jvm.internal.impl.types.h2 r2 = kotlin.reflect.jvm.internal.impl.types.h2.f(r2)
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.p(r0, r1)
            return r2
        L16:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.types.t0 k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r2.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r2 = r2.c()
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            r1 = 0
            if (r0 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r2
            goto L16
        L15:
            r2 = r1
        L16:
            if (r2 == 0) goto L25
            kotlin.reflect.jvm.internal.impl.descriptors.z r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.q(r2)
            if (r2 == 0) goto L25
            d4.h r2 = r2.d()
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = (kotlin.reflect.jvm.internal.impl.types.e1) r2
            return r2
        L25:
            return r1
    }
}
