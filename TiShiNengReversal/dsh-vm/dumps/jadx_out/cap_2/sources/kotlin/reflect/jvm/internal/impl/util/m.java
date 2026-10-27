package kotlin.reflect.jvm.internal.impl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nmodifierChecks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/NoDefaultAndVarargsCheck\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,264:1\n1740#2,3:265\n*S KotlinDebug\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/NoDefaultAndVarargsCheck\n*L\n105#1:265,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class m implements kotlin.reflect.jvm.internal.impl.util.f {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.util.m a = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String b = null;

    static {
            kotlin.reflect.jvm.internal.impl.util.m r0 = new kotlin.reflect.jvm.internal.impl.util.m
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.util.m.a = r0
            java.lang.String r0 = "should not have varargs or parameters with default values"
            kotlin.reflect.jvm.internal.impl.util.m.b = r0
            return
    }

    private m() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @org.jetbrains.annotations.Nullable
    public java.lang.String a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r1) {
            r0 = this;
            java.lang.String r1 = kotlin.reflect.jvm.internal.impl.util.f.a.a(r0, r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    public boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r4) {
            r3 = this;
            java.lang.String r0 = "functionDescriptor"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.List r4 = r4.g()
            java.lang.String r0 = "getValueParameters(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r0 = r4 instanceof java.util.Collection
            r1 = 1
            if (r0 == 0) goto L1f
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1f
            return r1
        L1f:
            java.util.Iterator r4 = r4.iterator()
        L23:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r0 = r4.next()
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r0
            kotlin.jvm.internal.g0.m(r0)
            boolean r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.f(r0)
            if (r2 != 0) goto L3f
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.z0()
            if (r0 != 0) goto L3f
            goto L23
        L3f:
            r4 = 0
            return r4
        L41:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @org.jetbrains.annotations.NotNull
    public java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = kotlin.reflect.jvm.internal.impl.util.m.b
            return r0
    }
}
