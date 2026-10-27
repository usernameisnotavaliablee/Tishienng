package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nutil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 util.kt\nkotlin/reflect/jvm/internal/CreateKCallableVisitor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class n extends kotlin.reflect.jvm.internal.impl.descriptors.impl.o<kotlin.reflect.jvm.internal.e0<?>, kotlin.n1> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.KDeclarationContainerImpl a;

    public n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.KDeclarationContainerImpl r2) {
            r1 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.m
    public /* bridge */ /* synthetic */ java.lang.Object c(kotlin.reflect.jvm.internal.impl.descriptors.w0 r1, java.lang.Object r2) {
            r0 = this;
            kotlin.n1 r2 = (kotlin.n1) r2
            kotlin.reflect.jvm.internal.e0 r1 = r0.q(r1, r2)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.m
    public /* bridge */ /* synthetic */ java.lang.Object l(kotlin.reflect.jvm.internal.impl.descriptors.y r1, java.lang.Object r2) {
            r0 = this;
            kotlin.n1 r2 = (kotlin.n1) r2
            kotlin.reflect.jvm.internal.e0 r1 = r0.p(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.e0<?> p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r2, @org.jetbrains.annotations.NotNull kotlin.n1 r3) {
            r1 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "data"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.m1 r3 = new kotlin.reflect.jvm.internal.m1
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r1.a
            r3.<init>(r0, r2)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.e0<?> q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.w0 r4, @org.jetbrains.annotations.NotNull kotlin.n1 r5) {
            r3 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "data"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r5 = r4.c0()
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L14
            r5 = 1
            goto L15
        L14:
            r5 = 0
        L15:
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r2 = r4.f0()
            if (r2 == 0) goto L1c
            r0 = 1
        L1c:
            int r5 = r5 + r0
            boolean r0 = r4.C()
            r2 = 2
            if (r0 == 0) goto L42
            if (r5 == 0) goto L3a
            if (r5 == r1) goto L32
            if (r5 != r2) goto L50
            kotlin.reflect.jvm.internal.s1 r5 = new kotlin.reflect.jvm.internal.s1
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r3.a
            r5.<init>(r0, r4)
            return r5
        L32:
            kotlin.reflect.jvm.internal.q1 r5 = new kotlin.reflect.jvm.internal.q1
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r3.a
            r5.<init>(r0, r4)
            return r5
        L3a:
            kotlin.reflect.jvm.internal.o1 r5 = new kotlin.reflect.jvm.internal.o1
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r3.a
            r5.<init>(r0, r4)
            return r5
        L42:
            if (r5 == 0) goto L6f
            if (r5 == r1) goto L67
            if (r5 != r2) goto L50
            kotlin.reflect.jvm.internal.m2 r5 = new kotlin.reflect.jvm.internal.m2
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r3.a
            r5.<init>(r0, r4)
            return r5
        L50:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r5 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported property: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L67:
            kotlin.reflect.jvm.internal.j2 r5 = new kotlin.reflect.jvm.internal.j2
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r3.a
            r5.<init>(r0, r4)
            return r5
        L6f:
            kotlin.reflect.jvm.internal.g2 r5 = new kotlin.reflect.jvm.internal.g2
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r3.a
            r5.<init>(r0, r4)
            return r5
    }
}
