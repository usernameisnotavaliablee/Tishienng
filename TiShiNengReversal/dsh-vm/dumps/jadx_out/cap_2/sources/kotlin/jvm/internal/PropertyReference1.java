package kotlin.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class PropertyReference1 extends kotlin.jvm.internal.PropertyReference implements kotlin.reflect.p {
    public PropertyReference1() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    public PropertyReference1(java.lang.Object r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    public PropertyReference1(java.lang.Object r1, java.lang.Class r2, java.lang.String r3, java.lang.String r4, int r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.c computeReflected() {
            r1 = this;
            kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r1)
            return r0
    }

    @Override // kotlin.reflect.p
    @kotlin.SinceKotlin(version = "1.1")
    public java.lang.Object getDelegate(java.lang.Object r2) {
            r1 = this;
            kotlin.reflect.n r0 = r1.getReflected()
            kotlin.reflect.p r0 = (kotlin.reflect.p) r0
            java.lang.Object r2 = r0.getDelegate(r2)
            return r2
    }

    @Override // kotlin.reflect.n
    public /* bridge */ /* synthetic */ kotlin.reflect.n.c getGetter() {
            r1 = this;
            kotlin.reflect.p$a r0 = r1.getGetter()
            return r0
    }

    @Override // kotlin.reflect.n
    public kotlin.reflect.p.a getGetter() {
            r1 = this;
            kotlin.reflect.n r0 = r1.getReflected()
            kotlin.reflect.p r0 = (kotlin.reflect.p) r0
            kotlin.reflect.p$a r0 = r0.getGetter()
            return r0
    }

    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            return r1
    }
}
