package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class u1 {
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.t1 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "newAnnotations"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = kotlin.reflect.jvm.internal.impl.types.u.a(r1)
            if (r0 != r2) goto L11
            return r1
        L11:
            kotlin.reflect.jvm.internal.impl.types.t r0 = kotlin.reflect.jvm.internal.impl.types.u.b(r1)
            if (r0 == 0) goto L1f
            kotlin.reflect.jvm.internal.impl.types.t1 r0 = r1.q(r0)
            if (r0 != 0) goto L1e
            goto L1f
        L1e:
            r1 = r0
        L1f:
            java.util.Iterator r0 = r2.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L30
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L30
            return r1
        L30:
            kotlin.reflect.jvm.internal.impl.types.t r0 = new kotlin.reflect.jvm.internal.impl.types.t
            r0.<init>(r2)
            kotlin.reflect.jvm.internal.impl.types.t1 r1 = r1.p(r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.t1 b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            kotlin.reflect.jvm.internal.impl.types.y r1 = kotlin.reflect.jvm.internal.impl.types.y.a
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r2 = r7
            kotlin.reflect.jvm.internal.impl.types.t1 r7 = kotlin.reflect.jvm.internal.impl.types.s1.a.a(r1, r2, r3, r4, r5, r6)
            return r7
    }
}
