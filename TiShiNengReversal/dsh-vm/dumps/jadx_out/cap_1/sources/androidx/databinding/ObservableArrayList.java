package androidx.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ObservableArrayList<T> extends java.util.ArrayList<T> implements androidx.databinding.ObservableList<T> {
    private transient androidx.databinding.ListChangeRegistry mListeners;

    public ObservableArrayList() {
            r1 = this;
            r1.<init>()
            androidx.databinding.ListChangeRegistry r0 = new androidx.databinding.ListChangeRegistry
            r0.<init>()
            r1.mListeners = r0
            return
    }

    private void notifyAdd(int r2, int r3) {
            r1 = this;
            androidx.databinding.ListChangeRegistry r0 = r1.mListeners
            if (r0 == 0) goto L7
            r0.notifyInserted(r1, r2, r3)
        L7:
            return
    }

    private void notifyRemove(int r2, int r3) {
            r1 = this;
            androidx.databinding.ListChangeRegistry r0 = r1.mListeners
            if (r0 == 0) goto L7
            r0.notifyRemoved(r1, r2, r3)
        L7:
            return
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int r1, T r2) {
            r0 = this;
            super.add(r1, r2)
            r2 = 1
            r0.notifyAdd(r1, r2)
            return
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(T r2) {
            r1 = this;
            super.add(r2)
            int r2 = r1.size()
            r0 = 1
            int r2 = r2 - r0
            r1.notifyAdd(r2, r0)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int r2, java.util.Collection<? extends T> r3) {
            r1 = this;
            boolean r0 = super.addAll(r2, r3)
            if (r0 == 0) goto Ld
            int r3 = r3.size()
            r1.notifyAdd(r2, r3)
        Ld:
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends T> r3) {
            r2 = this;
            int r0 = r2.size()
            boolean r3 = super.addAll(r3)
            if (r3 == 0) goto L12
            int r1 = r2.size()
            int r1 = r1 - r0
            r2.notifyAdd(r0, r1)
        L12:
            return r3
    }

    @Override // androidx.databinding.ObservableList
    public void addOnListChangedCallback(androidx.databinding.ObservableList.OnListChangedCallback r2) {
            r1 = this;
            androidx.databinding.ListChangeRegistry r0 = r1.mListeners
            if (r0 != 0) goto Lb
            androidx.databinding.ListChangeRegistry r0 = new androidx.databinding.ListChangeRegistry
            r0.<init>()
            r1.mListeners = r0
        Lb:
            androidx.databinding.ListChangeRegistry r0 = r1.mListeners
            r0.add(r2)
            return
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r2 = this;
            int r0 = r2.size()
            super.clear()
            if (r0 == 0) goto Ld
            r1 = 0
            r2.notifyRemove(r1, r0)
        Ld:
            return
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T remove(int r3) {
            r2 = this;
            java.lang.Object r0 = super.remove(r3)
            r1 = 1
            r2.notifyRemove(r3, r1)
            return r0
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Lb
            r0.remove(r1)
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @Override // androidx.databinding.ObservableList
    public void removeOnListChangedCallback(androidx.databinding.ObservableList.OnListChangedCallback r2) {
            r1 = this;
            androidx.databinding.ListChangeRegistry r0 = r1.mListeners
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    protected void removeRange(int r1, int r2) {
            r0 = this;
            super.removeRange(r1, r2)
            int r2 = r2 - r1
            r0.notifyRemove(r1, r2)
            return
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T set(int r3, T r4) {
            r2 = this;
            java.lang.Object r4 = super.set(r3, r4)
            androidx.databinding.ListChangeRegistry r0 = r2.mListeners
            if (r0 == 0) goto Lc
            r1 = 1
            r0.notifyChanged(r2, r3, r1)
        Lc:
            return r4
    }
}
