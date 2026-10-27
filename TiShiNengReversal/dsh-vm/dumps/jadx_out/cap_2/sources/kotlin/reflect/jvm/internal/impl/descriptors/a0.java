package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a0 {

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.descriptors.e0<kotlin.reflect.jvm.internal.impl.descriptors.b0> a = null;

    static {
            kotlin.reflect.jvm.internal.impl.descriptors.e0 r0 = new kotlin.reflect.jvm.internal.impl.descriptors.e0
            java.lang.String r1 = "InvalidModuleNotifier"
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.a0.a = r0
            return
    }

    public static final void a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.e0<kotlin.reflect.jvm.internal.impl.descriptors.b0> r0 = kotlin.reflect.jvm.internal.impl.descriptors.a0.a
            java.lang.Object r0 = r3.U(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.b0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.b0) r0
            if (r0 == 0) goto L13
            r0.a(r3)
            return
        L13:
            kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException r0 = new kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Accessing invalid module descriptor "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }
}
