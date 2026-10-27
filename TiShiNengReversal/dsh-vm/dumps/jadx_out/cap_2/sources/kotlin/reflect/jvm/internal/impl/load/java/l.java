package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nClassicBuiltinSpecialProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicBuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/ClassicBuiltinSpecialProperties\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1#2:37\n1761#3,3:38\n*S KotlinDebug\n*F\n+ 1 ClassicBuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/ClassicBuiltinSpecialProperties\n*L\n33#1:38,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class l {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.java.l a = null;

    static {
            kotlin.reflect.jvm.internal.impl.load.java.l r0 = new kotlin.reflect.jvm.internal.impl.load.java.l
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.load.java.l.a = r0
            return
    }

    private l() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ boolean a(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0) {
            boolean r0 = c(r0)
            return r0
    }

    private static final boolean c(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.load.java.l r0 = kotlin.reflect.jvm.internal.impl.load.java.l.a
            boolean r1 = r0.d(r1)
            return r1
    }

    private final boolean e(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r5) {
            r4 = this;
            kotlin.reflect.jvm.internal.impl.load.java.i r0 = kotlin.reflect.jvm.internal.impl.load.java.i.a
            java.util.Set r0 = r0.c()
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.k(r5)
            boolean r0 = kotlin.collections.f0.a2(r0, r1)
            r1 = 1
            if (r0 == 0) goto L1c
            java.util.List r0 = r5.g()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1c
            return r1
        L1c:
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.j.h0(r5)
            r2 = 0
            if (r0 != 0) goto L24
            return r2
        L24:
            java.util.Collection r5 = r5.e()
            java.lang.String r0 = "getOverriddenDescriptors(...)"
            kotlin.jvm.internal.g0.o(r5, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L39
            return r2
        L39:
            java.util.Iterator r5 = r5.iterator()
        L3d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r0 = r5.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
            kotlin.reflect.jvm.internal.impl.load.java.l r3 = kotlin.reflect.jvm.internal.impl.load.java.l.a
            kotlin.jvm.internal.g0.m(r0)
            boolean r0 = r3.d(r0)
            if (r0 == 0) goto L3d
            return r1
        L55:
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r5) {
            r4 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.builtins.j.h0(r5)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.w(r5)
            kotlin.reflect.jvm.internal.impl.load.java.k r0 = kotlin.reflect.jvm.internal.impl.load.java.k.a
            r1 = 0
            r2 = 1
            r3 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.i(r5, r1, r0, r2, r3)
            if (r5 != 0) goto L18
            return r3
        L18:
            kotlin.reflect.jvm.internal.impl.load.java.i r0 = kotlin.reflect.jvm.internal.impl.load.java.i.a
            java.util.Map r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.name.c r5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.o(r5)
            java.lang.Object r5 = r0.get(r5)
            kotlin.reflect.jvm.internal.impl.name.f r5 = (kotlin.reflect.jvm.internal.impl.name.f) r5
            if (r5 == 0) goto L2f
            java.lang.String r5 = r5.b()
            return r5
        L2f:
            return r3
    }

    public final boolean d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3) {
            r2 = this;
            java.lang.String r0 = "callableMemberDescriptor"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.load.java.i r0 = kotlin.reflect.jvm.internal.impl.load.java.i.a
            java.util.Set r0 = r0.d()
            kotlin.reflect.jvm.internal.impl.name.f r1 = r3.getName()
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L17
            r3 = 0
            return r3
        L17:
            boolean r3 = r2.e(r3)
            return r3
    }
}
