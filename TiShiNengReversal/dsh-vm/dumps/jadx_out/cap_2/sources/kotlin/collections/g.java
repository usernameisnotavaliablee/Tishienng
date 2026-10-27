package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.1")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class g<E> extends java.util.AbstractCollection<E> implements java.util.Collection<E>, l3.b {
    protected g() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(E r1);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.a()
            return r0
    }
}
