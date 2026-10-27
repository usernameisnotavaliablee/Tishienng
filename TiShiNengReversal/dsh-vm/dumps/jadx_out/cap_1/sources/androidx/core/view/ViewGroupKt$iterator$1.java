package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ViewGroupKt$iterator$1 implements java.util.Iterator<android.view.View>, l3.d {
    final /* synthetic */ android.view.ViewGroup $this_iterator;
    private int index;

    ViewGroupKt$iterator$1(android.view.ViewGroup r1) {
            r0 = this;
            r0.$this_iterator = r1
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r2 = this;
            int r0 = r2.index
            android.view.ViewGroup r1 = r2.$this_iterator
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @org.jetbrains.annotations.NotNull
    public android.view.View next() {
            r3 = this;
            android.view.ViewGroup r0 = r3.$this_iterator
            int r1 = r3.index
            int r2 = r1 + 1
            r3.index = r2
            android.view.View r0 = r0.getChildAt(r1)
            if (r0 == 0) goto Lf
            return r0
        Lf:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ android.view.View next() {
            r1 = this;
            android.view.View r0 = r1.next()
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            android.view.ViewGroup r0 = r2.$this_iterator
            int r1 = r2.index
            int r1 = r1 + (-1)
            r2.index = r1
            r0.removeViewAt(r1)
            return
    }
}
