package kotlin.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class MutablePropertyReference0 extends kotlin.jvm.internal.MutablePropertyReference implements kotlin.reflect.k {
    public MutablePropertyReference0() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    public MutablePropertyReference0(java.lang.Object r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    public MutablePropertyReference0(java.lang.Object r1, java.lang.Class r2, java.lang.String r3, java.lang.String r4, int r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.c computeReflected() {
            r1 = this;
            kotlin.reflect.k r0 = kotlin.jvm.internal.o0.j(r1)
            return r0
    }

    @Override // kotlin.reflect.o
    @kotlin.SinceKotlin(version = "1.1")
    public java.lang.Object getDelegate() {
            r1 = this;
            kotlin.reflect.n r0 = r1.getReflected()
            kotlin.reflect.k r0 = (kotlin.reflect.k) r0
            java.lang.Object r0 = r0.getDelegate()
            return r0
    }

    @Override // kotlin.reflect.n
    public /* bridge */ /* synthetic */ kotlin.reflect.n.c getGetter() {
            r1 = this;
            kotlin.reflect.o$a r0 = r1.getGetter()
            return r0
    }

    @Override // kotlin.reflect.n
    public kotlin.reflect.o.a getGetter() {
            r1 = this;
            kotlin.reflect.n r0 = r1.getReflected()
            kotlin.reflect.k r0 = (kotlin.reflect.k) r0
            kotlin.reflect.o$a r0 = r0.getGetter()
            return r0
    }

    @Override // kotlin.reflect.j
    public /* bridge */ /* synthetic */ kotlin.reflect.j.a getSetter() {
            r1 = this;
            kotlin.reflect.k$a r0 = r1.getSetter()
            return r0
    }

    @Override // kotlin.reflect.j
    public kotlin.reflect.k.a getSetter() {
            r1 = this;
            kotlin.reflect.n r0 = r1.getReflected()
            kotlin.reflect.k r0 = (kotlin.reflect.k) r0
            kotlin.reflect.k$a r0 = r0.getSetter()
            return r0
    }

    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
            r1 = this;
            java.lang.Object r0 = r1.get()
            return r0
    }
}
