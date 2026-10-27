package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b extends kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.a implements kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.f {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.d c;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.name.f d;

    public b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r4, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r5) {
            r1 = this;
            java.lang.String r0 = "classDescriptor"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "receiverType"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r3, r5)
            r1.c = r2
            r1.d = r4
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.f
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.name.f a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.f r0 = r1.d
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r2.getType()
            r0.append(r1)
            java.lang.String r1 = ": Ctx { "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = " }"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
