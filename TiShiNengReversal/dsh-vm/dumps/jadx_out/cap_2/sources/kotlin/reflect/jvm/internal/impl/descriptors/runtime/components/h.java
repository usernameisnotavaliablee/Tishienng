package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h {
    public static final /* synthetic */ java.lang.String a(kotlin.reflect.jvm.internal.impl.name.b r0) {
            java.lang.String r0 = b(r0)
            return r0
    }

    private static final java.lang.String b(kotlin.reflect.jvm.internal.impl.name.b r7) {
            kotlin.reflect.jvm.internal.impl.name.c r0 = r7.g()
            java.lang.String r1 = r0.a()
            r5 = 4
            r6 = 0
            r2 = 46
            r3 = 36
            r4 = 0
            java.lang.String r0 = kotlin.text.u.w2(r1, r2, r3, r4, r5, r6)
            kotlin.reflect.jvm.internal.impl.name.c r1 = r7.f()
            boolean r1 = r1.c()
            if (r1 == 0) goto L1e
            return r0
        L1e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            kotlin.reflect.jvm.internal.impl.name.c r7 = r7.f()
            r1.append(r7)
            r7 = 46
            r1.append(r7)
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            return r7
    }
}
