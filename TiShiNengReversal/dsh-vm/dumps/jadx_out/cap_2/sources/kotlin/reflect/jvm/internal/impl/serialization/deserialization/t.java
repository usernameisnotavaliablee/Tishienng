package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDeserializedPackageFragmentImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedPackageFragmentImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/DeserializedPackageFragmentImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n774#2:64\n865#2,2:65\n1563#2:67\n1634#2,3:68\n*S KotlinDebug\n*F\n+ 1 DeserializedPackageFragmentImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/DeserializedPackageFragmentImpl\n*L\n54#1:64\n54#1:65,2\n56#1:67\n56#1:68,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class t extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.q {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a h;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s i;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.e j;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.l0 k;

    @org.jetbrains.annotations.Nullable
    private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment l;
    private kotlin.reflect.jvm.internal.impl.resolve.scopes.k m;

    public t(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r6, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s r7) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "module"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "metadataVersion"
            kotlin.jvm.internal.g0.p(r6, r0)
            r1.<init>(r2, r3, r4)
            r1.h = r6
            r1.i = r7
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.e r2 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.e
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r3 = r5.getStrings()
            java.lang.String r4 = "getStrings(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r4 = r5.getQualifiedNames()
            java.lang.String r7 = "getQualifiedNames(...)"
            kotlin.jvm.internal.g0.o(r4, r7)
            r2.<init>(r3, r4)
            r1.j = r2
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.l0 r3 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.l0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.r r4 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.r
            r4.<init>(r1)
            r3.<init>(r5, r2, r6, r4)
            r1.k = r3
            r1.l = r5
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e1 H0(kotlin.reflect.jvm.internal.impl.serialization.deserialization.t r0, kotlin.reflect.jvm.internal.impl.name.b r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r0 = J0(r0, r1)
            return r0
    }

    static /* synthetic */ java.util.Collection I0(kotlin.reflect.jvm.internal.impl.serialization.deserialization.t r0) {
            java.util.Collection r0 = L0(r0)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.e1 J0(kotlin.reflect.jvm.internal.impl.serialization.deserialization.t r1, kotlin.reflect.jvm.internal.impl.name.b r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s r1 = r1.i
            if (r1 == 0) goto La
            return r1
        La:
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r1 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            java.lang.String r2 = "NO_SOURCE"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    private static final java.util.Collection L0(kotlin.reflect.jvm.internal.impl.serialization.deserialization.t r4) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.l0 r4 = r4.K0()
            java.util.Collection r4 = r4.b()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L13:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r4.next()
            r2 = r1
            kotlin.reflect.jvm.internal.impl.name.b r2 = (kotlin.reflect.jvm.internal.impl.name.b) r2
            boolean r3 = r2.j()
            if (r3 != 0) goto L13
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.k$b r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.k.c
            java.util.Set r3 = r3.a()
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L13
            r0.add(r1)
            goto L13
        L36:
            java.util.ArrayList r4 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r0, r1)
            r4.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L45:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.name.b r1 = (kotlin.reflect.jvm.internal.impl.name.b) r1
            kotlin.reflect.jvm.internal.impl.name.f r1 = r1.h()
            r4.add(r1)
            goto L45
        L59:
            return r4
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.q
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.i E0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.l0 r0 = r1.K0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.q
    public void G0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r12) {
            r11 = this;
            java.lang.String r0 = "components"
            kotlin.jvm.internal.g0.p(r12, r0)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment r0 = r11.l
            if (r0 == 0) goto L3b
            r1 = 0
            r11.l = r1
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.m0 r2 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.m0
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r4 = r0.getPackage()
            java.lang.String r0 = "getPackage(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.e r5 = r11.j
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r6 = r11.h
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s r7 = r11.i
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "scope of "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r9 = r0.toString()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.s r10 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.s
            r10.<init>(r11)
            r3 = r11
            r8 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r3.m = r2
            return
        L3b:
            r3 = r11
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "Repeated call to DeserializedPackageFragmentImpl::initialize"
            r12.<init>(r0)
            throw r12
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.l0 K0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.l0 r0 = r1.k
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k r() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.m
            if (r0 != 0) goto La
            java.lang.String r0 = "_memberScope"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        La:
            return r0
    }
}
