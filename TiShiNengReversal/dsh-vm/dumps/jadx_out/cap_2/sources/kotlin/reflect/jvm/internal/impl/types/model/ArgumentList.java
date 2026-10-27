package kotlin.reflect.jvm.internal.impl.types.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ArgumentList extends java.util.ArrayList<d4.l> implements d4.k {
    public ArgumentList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public /* bridge */ boolean contains(d4.l r1) {
            r0 = this;
            boolean r1 = super.contains(r1)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof d4.l
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            d4.l r2 = (d4.l) r2
            boolean r2 = r1.contains(r2)
            return r2
    }

    public /* bridge */ int getSize() {
            r1 = this;
            int r0 = super.size()
            return r0
    }

    public /* bridge */ int indexOf(d4.l r1) {
            r0 = this;
            int r1 = super.indexOf(r1)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof d4.l
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            d4.l r2 = (d4.l) r2
            int r2 = r1.indexOf(r2)
            return r2
    }

    public /* bridge */ int lastIndexOf(d4.l r1) {
            r0 = this;
            int r1 = super.lastIndexOf(r1)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof d4.l
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            d4.l r2 = (d4.l) r2
            int r2 = r1.lastIndexOf(r2)
            return r2
    }

    public /* bridge */ boolean remove(d4.l r1) {
            r0 = this;
            boolean r1 = super.remove(r1)
            return r1
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof d4.l
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            d4.l r2 = (d4.l) r2
            boolean r2 = r1.remove(r2)
            return r2
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }
}
