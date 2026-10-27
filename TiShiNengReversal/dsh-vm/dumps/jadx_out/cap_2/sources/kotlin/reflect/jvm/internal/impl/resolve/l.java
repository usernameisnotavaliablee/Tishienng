package kotlin.reflect.jvm.internal.impl.resolve;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class l extends kotlin.reflect.jvm.internal.impl.resolve.m {
    public l() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.m
    public void b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3) {
            r1 = this;
            java.lang.String r0 = "first"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "second"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.e(r2, r3)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.m
    public void c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3) {
            r1 = this;
            java.lang.String r0 = "fromSuper"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "fromCurrent"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.e(r2, r3)
            return
    }

    protected abstract void e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2);
}
