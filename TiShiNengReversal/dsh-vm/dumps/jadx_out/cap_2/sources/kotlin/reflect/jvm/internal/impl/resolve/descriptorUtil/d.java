package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class d implements kotlin.jvm.functions.Function1 {
    private final boolean a;

    public d(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.a
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r2
            kotlin.sequences.m r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.e(r0, r2)
            return r2
    }
}
