package kotlin.reflect.jvm.internal.impl.resolve;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class v {
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor a(@org.jetbrains.annotations.NotNull java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r4) {
            java.lang.String r0 = "descriptors"
            kotlin.jvm.internal.g0.p(r4, r0)
            r4.isEmpty()
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r4.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r1
            if (r0 != 0) goto L1c
            goto L30
        L1c:
            kotlin.reflect.jvm.internal.impl.descriptors.s r2 = r0.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.s r3 = r1.getVisibility()
            java.lang.Integer r2 = kotlin.reflect.jvm.internal.impl.descriptors.r.d(r2, r3)
            if (r2 == 0) goto Ld
            int r2 = r2.intValue()
            if (r2 >= 0) goto Ld
        L30:
            r0 = r1
            goto Ld
        L32:
            kotlin.jvm.internal.g0.m(r0)
            return r0
    }
}
