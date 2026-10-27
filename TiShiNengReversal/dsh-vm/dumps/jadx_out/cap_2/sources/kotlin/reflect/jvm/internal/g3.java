package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class g3 extends kotlin.jvm.internal.p0 {
    public g3() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void u() {
            kotlin.reflect.jvm.internal.h.k()
            kotlin.reflect.jvm.internal.e3.a()
            return
    }

    private static kotlin.reflect.jvm.internal.KDeclarationContainerImpl v(kotlin.jvm.internal.CallableReference r1) {
            kotlin.reflect.h r1 = r1.getOwner()
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.KDeclarationContainerImpl
            if (r0 == 0) goto Lb
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r1 = (kotlin.reflect.jvm.internal.KDeclarationContainerImpl) r1
            return r1
        Lb:
            kotlin.reflect.jvm.internal.o r1 = kotlin.reflect.jvm.internal.o.d
            return r1
    }

    @Override // kotlin.jvm.internal.p0
    public kotlin.reflect.d a(java.lang.Class r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.h0 r0 = new kotlin.reflect.jvm.internal.h0
            r0.<init>(r2)
            return r0
    }

    @Override // kotlin.jvm.internal.p0
    public kotlin.reflect.d b(java.lang.Class r1, java.lang.String r2) {
            r0 = this;
            kotlin.reflect.jvm.internal.h0 r2 = new kotlin.reflect.jvm.internal.h0
            r2.<init>(r1)
            return r2
    }

    @Override // kotlin.jvm.internal.p0
    public kotlin.reflect.i c(kotlin.jvm.internal.FunctionReference r5) {
            r4 = this;
            kotlin.reflect.jvm.internal.m1 r0 = new kotlin.reflect.jvm.internal.m1
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r1 = v(r5)
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = r5.getSignature()
            java.lang.Object r5 = r5.getBoundReceiver()
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    @Override // kotlin.jvm.internal.p0
    public kotlin.reflect.d d(java.lang.Class r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.h0 r1 = kotlin.reflect.jvm.internal.h.n(r1)
            return r1
    }

    @Override // kotlin.jvm.internal.p0
    public kotlin.reflect.d e(java.lang.Class r1, java.lang.String r2) {
            r0 = this;
            kotlin.reflect.jvm.internal.h0 r1 = kotlin.reflect.jvm.internal.h.n(r1)
            return r1
    }

    @Override // kotlin.jvm.internal.p0
    public kotlin.reflect.h f(java.lang.Class r1, java.lang.String r2) {
            r0 = this;
            kotlin.reflect.h r1 = kotlin.reflect.jvm.internal.h.o(r1)
            return r1
    }

    @Override // kotlin.jvm.internal.p0
    public kotlin.reflect.r g(kotlin.reflect.r r1) {
            r0 = this;
            kotlin.reflect.r r1 = kotlin.reflect.jvm.internal.n3.a(r1)
            return r1
    }

    @Override // kotlin.jvm.internal.p0
    public kotlin.reflect.k h(kotlin.jvm.internal.MutablePropertyReference0 r5) {
            r4 = this;
            kotlin.reflect.jvm.internal.o1 r0 = new kotlin.reflect.jvm.internal.o1
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r1 = v(r5)
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = r5.getSignature()
            java.lang.Object r5 = r5.getBoundReceiver()
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    @Override // kotlin.jvm.internal.p0
    public kotlin.reflect.l i(kotlin.jvm.internal.MutablePropertyReference1 r5) {
            r4 = this;
            kotlin.reflect.jvm.internal.q1 r0 = new kotlin.reflect.jvm.internal.q1
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r1 = v(r5)
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = r5.getSignature()
            java.lang.Object r5 = r5.getBoundReceiver()
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    @Override // kotlin.jvm.internal.p0
    public kotlin.reflect.m j(kotlin.jvm.internal.MutablePropertyReference2 r4) {
            r3 = this;
            kotlin.reflect.jvm.internal.s1 r0 = new kotlin.reflect.jvm.internal.s1
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r1 = v(r4)
            java.lang.String r2 = r4.getName()
            java.lang.String r4 = r4.getSignature()
            r0.<init>(r1, r2, r4)
            return r0
    }

    @Override // kotlin.jvm.internal.p0
    public kotlin.reflect.r k(kotlin.reflect.r r1) {
            r0 = this;
            kotlin.reflect.r r1 = kotlin.reflect.jvm.internal.n3.b(r1)
            return r1
    }

    @Override // kotlin.jvm.internal.p0
    public kotlin.reflect.r l(kotlin.reflect.r r1, kotlin.reflect.r r2) {
            r0 = this;
            kotlin.reflect.r r1 = kotlin.reflect.jvm.internal.n3.c(r1, r2)
            return r1
    }

    @Override // kotlin.jvm.internal.p0
    public kotlin.reflect.o m(kotlin.jvm.internal.PropertyReference0 r5) {
            r4 = this;
            kotlin.reflect.jvm.internal.g2 r0 = new kotlin.reflect.jvm.internal.g2
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r1 = v(r5)
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = r5.getSignature()
            java.lang.Object r5 = r5.getBoundReceiver()
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    @Override // kotlin.jvm.internal.p0
    public kotlin.reflect.p n(kotlin.jvm.internal.PropertyReference1 r5) {
            r4 = this;
            kotlin.reflect.jvm.internal.j2 r0 = new kotlin.reflect.jvm.internal.j2
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r1 = v(r5)
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = r5.getSignature()
            java.lang.Object r5 = r5.getBoundReceiver()
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    @Override // kotlin.jvm.internal.p0
    public kotlin.reflect.q o(kotlin.jvm.internal.PropertyReference2 r4) {
            r3 = this;
            kotlin.reflect.jvm.internal.m2 r0 = new kotlin.reflect.jvm.internal.m2
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r1 = v(r4)
            java.lang.String r2 = r4.getName()
            java.lang.String r4 = r4.getSignature()
            r0.<init>(r1, r2, r4)
            return r0
    }

    @Override // kotlin.jvm.internal.p0
    public java.lang.String p(kotlin.jvm.internal.c0 r2) {
            r1 = this;
            kotlin.reflect.i r0 = kotlin.reflect.jvm.e.a(r2)
            if (r0 == 0) goto L17
            kotlin.reflect.jvm.internal.m1 r0 = kotlin.reflect.jvm.internal.p3.c(r0)
            if (r0 == 0) goto L17
            kotlin.reflect.jvm.internal.j3 r2 = kotlin.reflect.jvm.internal.j3.a
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = r0.M0()
            java.lang.String r2 = r2.h(r0)
            return r2
        L17:
            java.lang.String r2 = super.p(r2)
            return r2
    }

    @Override // kotlin.jvm.internal.p0
    public java.lang.String q(kotlin.jvm.internal.Lambda r1) {
            r0 = this;
            java.lang.String r1 = r0.p(r1)
            return r1
    }

    @Override // kotlin.jvm.internal.p0
    public void r(kotlin.reflect.s r1, java.util.List<kotlin.reflect.r> r2) {
            r0 = this;
            return
    }

    @Override // kotlin.jvm.internal.p0
    public kotlin.reflect.r s(kotlin.reflect.g r2, java.util.List<kotlin.reflect.t> r3, boolean r4) {
            r1 = this;
            boolean r0 = r2 instanceof kotlin.jvm.internal.s
            if (r0 == 0) goto Lf
            kotlin.jvm.internal.s r2 = (kotlin.jvm.internal.s) r2
            java.lang.Class r2 = r2.c()
            kotlin.reflect.r r2 = kotlin.reflect.jvm.internal.h.l(r2, r3, r4)
            return r2
        Lf:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            kotlin.reflect.r r2 = kotlin.reflect.full.i.b(r2, r3, r4, r0)
            return r2
    }

    @Override // kotlin.jvm.internal.p0
    public kotlin.reflect.s t(java.lang.Object r2, java.lang.String r3, kotlin.reflect.KVariance r4, boolean r5) {
            r1 = this;
            boolean r4 = r2 instanceof kotlin.reflect.d
            if (r4 == 0) goto Lc
            r4 = r2
            kotlin.reflect.d r4 = (kotlin.reflect.d) r4
            java.util.List r4 = r4.getTypeParameters()
            goto L17
        Lc:
            boolean r4 = r2 instanceof kotlin.reflect.c
            if (r4 == 0) goto L51
            r4 = r2
            kotlin.reflect.c r4 = (kotlin.reflect.c) r4
            java.util.List r4 = r4.getTypeParameters()
        L17:
            java.util.Iterator r4 = r4.iterator()
        L1b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L32
            java.lang.Object r5 = r4.next()
            kotlin.reflect.s r5 = (kotlin.reflect.s) r5
            java.lang.String r0 = r5.getName()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1b
            return r5
        L32:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Type parameter "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = " is not found in container: "
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2)
            throw r4
        L51:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Type parameter container must be a class or a callable: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
    }
}
