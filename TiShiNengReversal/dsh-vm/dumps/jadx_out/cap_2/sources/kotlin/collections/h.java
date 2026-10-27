package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.1")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class h<E> extends java.util.AbstractList<E> implements java.util.List<E>, l3.e {
    protected h() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int r1, E r2);

    public abstract int getSize();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.removeAt(r1)
            return r1
    }

    public abstract E removeAt(int r1);

    @Override // java.util.AbstractList, java.util.List
    public abstract E set(int r1, E r2);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }
}
