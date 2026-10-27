package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class m3 {
    private static final java.lang.CharSequence a(java.lang.Class r0) {
            kotlin.jvm.internal.g0.m(r0)
            java.lang.String r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.f(r0)
            return r0
    }

    public static final /* synthetic */ java.lang.String b(java.lang.reflect.Method r0) {
            java.lang.String r0 = d(r0)
            return r0
    }

    static /* synthetic */ java.lang.CharSequence c(java.lang.Class r0) {
            java.lang.CharSequence r0 = a(r0)
            return r0
    }

    private static final java.lang.String d(java.lang.reflect.Method r11) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r11.getName()
            r0.append(r1)
            java.lang.Class[] r2 = r11.getParameterTypes()
            java.lang.String r1 = "getParameterTypes(...)"
            kotlin.jvm.internal.g0.o(r2, r1)
            kotlin.reflect.jvm.internal.l3 r8 = kotlin.reflect.jvm.internal.l3.a
            r9 = 24
            r10 = 0
            java.lang.String r3 = ""
            java.lang.String r4 = "("
            java.lang.String r5 = ")"
            r6 = 0
            r7 = 0
            java.lang.String r1 = kotlin.collections.n.Eh(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.append(r1)
            java.lang.Class r11 = r11.getReturnType()
            java.lang.String r1 = "getReturnType(...)"
            kotlin.jvm.internal.g0.o(r11, r1)
            java.lang.String r11 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.f(r11)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            return r11
    }
}
