package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class d implements kotlin.jvm.functions.Function1 {
    private final kotlin.reflect.jvm.internal.impl.descriptors.d1 a;

    public d(kotlin.reflect.jvm.internal.impl.descriptors.d1 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r0 = r1.a
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r2
            boolean r2 = kotlin.reflect.jvm.internal.impl.load.java.e.i(r0, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }
}
