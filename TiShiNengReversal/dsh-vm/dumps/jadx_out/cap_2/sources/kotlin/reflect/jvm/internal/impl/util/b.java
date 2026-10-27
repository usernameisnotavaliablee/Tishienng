package kotlin.reflect.jvm.internal.impl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class b {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.util.g a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r4) {
            r3 = this;
            java.lang.String r0 = "functionDescriptor"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.List r0 = r3.b()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.util.h r1 = (kotlin.reflect.jvm.internal.impl.util.h) r1
            boolean r2 = r1.b(r4)
            if (r2 == 0) goto Ld
            kotlin.reflect.jvm.internal.impl.util.g r4 = r1.a(r4)
            return r4
        L24:
            kotlin.reflect.jvm.internal.impl.util.g$a r4 = kotlin.reflect.jvm.internal.impl.util.g.a.b
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<kotlin.reflect.jvm.internal.impl.util.h> b();
}
