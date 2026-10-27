package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class j implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.v {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.j b = null;

    static {
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.j r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.j
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.j.b = r0
            return
    }

    private j() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.v
    public void a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4) {
            r3 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot infer visibility for "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.v
    public void b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r4, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r5) {
            r3 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "unresolvedSuperClasses"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Incomplete hierarchy for class "
            r1.append(r2)
            kotlin.reflect.jvm.internal.impl.name.f r4 = r4.getName()
            r1.append(r4)
            java.lang.String r4 = ", unresolved classes "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
