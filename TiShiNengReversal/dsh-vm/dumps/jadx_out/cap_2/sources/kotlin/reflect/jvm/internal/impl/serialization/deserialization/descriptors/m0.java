package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDeserializedPackageMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedPackageMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedPackageMemberScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n1374#2:82\n1460#2,5:83\n1761#2,3:88\n*S KotlinDebug\n*F\n+ 1 DeserializedPackageMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedPackageMemberScope\n*L\n55#1:82\n55#1:83,5\n58#1:88,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class m0 extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.l0 g;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String h;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.c i;

    public m0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.l0 r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.d r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r13, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s r14, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r15, @org.jetbrains.annotations.NotNull java.lang.String r16, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends java.util.Collection<kotlin.reflect.jvm.internal.impl.name.f>> r17) {
            r9 = this;
            r7 = r16
            java.lang.String r0 = "packageDescriptor"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "metadataVersion"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "components"
            r3 = r15
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "debugName"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "classNames"
            r8 = r17
            kotlin.jvm.internal.g0.p(r8, r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r3 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.h
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r0 = r11.getTypeTable()
            java.lang.String r4 = "getTypeTable(...)"
            kotlin.jvm.internal.g0.o(r0, r4)
            r3.<init>(r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j$a r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.j.b
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r4 = r11.getVersionRequirementTable()
            java.lang.String r6 = "getVersionRequirementTable(...)"
            kotlin.jvm.internal.g0.o(r4, r6)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.j r4 = r0.a(r4)
            r1 = r10
            r2 = r12
            r5 = r13
            r6 = r14
            r0 = r15
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r0.a(r1, r2, r3, r4, r5, r6)
            java.util.List r2 = r11.getFunctionList()
            java.lang.String r1 = "getFunctionList(...)"
            kotlin.jvm.internal.g0.o(r2, r1)
            java.util.List r3 = r11.getPropertyList()
            java.lang.String r1 = "getPropertyList(...)"
            kotlin.jvm.internal.g0.o(r3, r1)
            java.util.List r4 = r11.getTypeAliasList()
            java.lang.String r1 = "getTypeAliasList(...)"
            kotlin.jvm.internal.g0.o(r4, r1)
            r1 = r0
            r5 = r8
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r9.g = r10
            r9.h = r7
            kotlin.reflect.jvm.internal.impl.name.c r1 = r10.d()
            r9.i = r1
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w
    protected boolean A(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r4) {
            r3 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = super.A(r4)
            if (r0 != 0) goto L40
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r3.t()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r0.c()
            java.lang.Iterable r0 = r0.l()
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L25
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L25
            goto L3e
        L25:
            java.util.Iterator r0 = r0.iterator()
        L29:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()
            q3.b r1 = (q3.b) r1
            kotlin.reflect.jvm.internal.impl.name.c r2 = r3.i
            boolean r1 = r1.a(r2, r4)
            if (r1 == 0) goto L29
            goto L40
        L3e:
            r4 = 0
            return r4
        L40:
            r4 = 1
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.k> C(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r5) {
            r3 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r0 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS
            java.util.Collection r4 = r3.n(r4, r5, r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r5 = r3.t()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r5 = r5.c()
            java.lang.Iterable r5 = r5.l()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L25:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r5.next()
            q3.b r1 = (q3.b) r1
            kotlin.reflect.jvm.internal.impl.name.c r2 = r3.i
            java.util.Collection r1 = r1.c(r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.collections.f0.s0(r0, r1)
            goto L25
        L3d:
            java.util.List r4 = kotlin.collections.f0.I4(r4, r0)
            return r4
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    public void e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3, @org.jetbrains.annotations.NotNull t3.b r4) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.o r0 = r2.t()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r0.c()
            t3.c r0 = r0.p()
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r1 = r2.g
            s3.a.b(r0, r4, r1, r3)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w, kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.f g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.e(r2, r3)
            kotlin.reflect.jvm.internal.impl.descriptors.f r2 = super.g(r2, r3)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    public /* bridge */ /* synthetic */ java.util.Collection h(kotlin.reflect.jvm.internal.impl.resolve.scopes.d r1, kotlin.jvm.functions.Function1 r2) {
            r0 = this;
            java.util.List r1 = r0.C(r1, r2)
            java.util.Collection r1 = (java.util.Collection) r1
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w
    protected void k(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r3) {
            r1 = this;
            java.lang.String r0 = "result"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "nameFilter"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w
    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.name.b q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.name.b r0 = new kotlin.reflect.jvm.internal.impl.name.b
            kotlin.reflect.jvm.internal.impl.name.c r1 = r2.i
            r0.<init>(r1, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.h
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w
    @org.jetbrains.annotations.Nullable
    protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> w() {
            r1 = this;
            java.util.Set r0 = kotlin.collections.u1.k()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w
    @org.jetbrains.annotations.NotNull
    protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> x() {
            r1 = this;
            java.util.Set r0 = kotlin.collections.u1.k()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w
    @org.jetbrains.annotations.NotNull
    protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> y() {
            r1 = this;
            java.util.Set r0 = kotlin.collections.u1.k()
            return r0
    }
}
