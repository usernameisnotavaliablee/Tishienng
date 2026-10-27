package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDeserializedClassDataFinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedClassDataFinder.kt\norg/jetbrains/kotlin/serialization/deserialization/DeserializedClassDataFinder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class p implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.i {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.m0 a;

    public p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.m0 r2) {
            r1 = this;
            java.lang.String r0 = "packageFragmentProvider"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.i
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.h a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r4) {
            r3 = this;
            java.lang.String r0 = "classId"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.m0 r0 = r3.a
            kotlin.reflect.jvm.internal.impl.name.c r1 = r4.f()
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.descriptors.q0.c(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.l0) r1
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.q
            if (r2 == 0) goto L13
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.q r1 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.q) r1
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.i r1 = r1.E0()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.h r1 = r1.a(r4)
            if (r1 == 0) goto L13
            return r1
        L30:
            r4 = 0
            return r4
    }
}
