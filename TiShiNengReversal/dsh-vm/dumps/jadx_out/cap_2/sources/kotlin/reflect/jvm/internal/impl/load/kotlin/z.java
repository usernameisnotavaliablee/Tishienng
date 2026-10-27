package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class z implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.x b;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.x<kotlin.reflect.jvm.internal.impl.metadata.deserialization.c> c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t0 d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability e;

    public z(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.x r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.serialization.deserialization.x<kotlin.reflect.jvm.internal.impl.metadata.deserialization.c> r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.t0 r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability r5) {
            r1 = this;
            java.lang.String r0 = "binaryClass"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "preReleaseInfo"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "abiStability"
            kotlin.jvm.internal.g0.p(r5, r0)
            r1.<init>()
            r1.b = r2
            r1.c = r3
            r1.d = r4
            r1.e = r5
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.s
    @org.jetbrains.annotations.NotNull
    public java.lang.String a() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Class '"
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.load.kotlin.x r1 = r2.b
            kotlin.reflect.jvm.internal.impl.name.b r1 = r1.c()
            kotlin.reflect.jvm.internal.impl.name.c r1 = r1.a()
            java.lang.String r1 = r1.a()
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.f1 b() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.f1 r0 = kotlin.reflect.jvm.internal.impl.descriptors.f1.a
            java.lang.String r1 = "NO_SOURCE_FILE"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.kotlin.x d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.kotlin.x r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<kotlin.reflect.jvm.internal.impl.load.kotlin.z> r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.z.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.load.kotlin.x r1 = r2.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
