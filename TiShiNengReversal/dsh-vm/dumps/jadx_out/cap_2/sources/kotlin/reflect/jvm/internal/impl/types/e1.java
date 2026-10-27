package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class e1 extends kotlin.reflect.jvm.internal.impl.types.m2 implements d4.i, d4.k {
    public e1() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.impl.types.e1 P0(boolean r1);

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.impl.types.e1 Q0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r1);

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r10 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r10.getAnnotations()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r2 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) r2
            kotlin.reflect.jvm.internal.impl.renderer.m r3 = kotlin.reflect.jvm.internal.impl.renderer.m.k
            r4 = 2
            r5 = 0
            java.lang.String r2 = kotlin.reflect.jvm.internal.impl.renderer.m.P(r3, r2, r5, r4, r5)
            java.lang.String r3 = "] "
            java.lang.String r4 = "["
            java.lang.String[] r2 = new java.lang.String[]{r4, r2, r3}
            kotlin.text.u.s0(r1, r2)
            goto Ld
        L2d:
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r10.I0()
            r1.append(r0)
            java.util.List r0 = r10.G0()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L55
            java.util.List r0 = r10.G0()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r8 = 112(0x70, float:1.57E-43)
            r9 = 0
            java.lang.String r2 = ", "
            java.lang.String r3 = "<"
            java.lang.String r4 = ">"
            r5 = 0
            r6 = 0
            r7 = 0
            kotlin.collections.f0.p3(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L55:
            boolean r0 = r10.J0()
            if (r0 == 0) goto L60
            java.lang.String r0 = "?"
            r1.append(r0)
        L60:
            java.lang.String r0 = r1.toString()
            return r0
    }
}
