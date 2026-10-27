package io.netty.channel.nio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class SelectedSelectionKeySet extends java.util.AbstractSet<java.nio.channels.SelectionKey> {
    java.nio.channels.SelectionKey[] keys;
    int size;


    SelectedSelectionKeySet() {
            r1 = this;
            r1.<init>()
            r0 = 1024(0x400, float:1.435E-42)
            java.nio.channels.SelectionKey[] r0 = new java.nio.channels.SelectionKey[r0]
            r1.keys = r0
            return
    }

    private void increaseCapacity() {
            r4 = this;
            java.nio.channels.SelectionKey[] r0 = r4.keys
            int r1 = r0.length
            int r1 = r1 << 1
            java.nio.channels.SelectionKey[] r1 = new java.nio.channels.SelectionKey[r1]
            r2 = 0
            int r3 = r4.size
            java.lang.System.arraycopy(r0, r2, r1, r2, r3)
            r4.keys = r1
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            java.nio.channels.SelectionKey r1 = (java.nio.channels.SelectionKey) r1
            boolean r1 = r0.add(r1)
            return r1
    }

    public boolean add(java.nio.channels.SelectionKey r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            java.nio.channels.SelectionKey[] r0 = r3.keys
            int r1 = r3.size
            int r2 = r1 + 1
            r3.size = r2
            r0[r1] = r4
            int r4 = r0.length
            if (r2 != r4) goto L14
            r3.increaseCapacity()
        L14:
            r4 = 1
            return r4
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<java.nio.channels.SelectionKey> iterator() {
            r1 = this;
            io.netty.channel.nio.SelectedSelectionKeySet$1 r0 = new io.netty.channel.nio.SelectedSelectionKeySet$1
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    void reset() {
            r1 = this;
            r0 = 0
            r1.reset(r0)
            return
    }

    void reset(int r4) {
            r3 = this;
            java.nio.channels.SelectionKey[] r0 = r3.keys
            int r1 = r3.size
            r2 = 0
            java.util.Arrays.fill(r0, r4, r1, r2)
            r4 = 0
            r3.size = r4
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}
