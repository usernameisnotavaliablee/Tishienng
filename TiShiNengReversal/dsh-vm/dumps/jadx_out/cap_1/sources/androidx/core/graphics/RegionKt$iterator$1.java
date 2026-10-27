package androidx.core.graphics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class RegionKt$iterator$1 implements java.util.Iterator<android.graphics.Rect>, l3.a {
    private boolean hasMore;

    @org.jetbrains.annotations.NotNull
    private final android.graphics.RegionIterator iterator;

    @org.jetbrains.annotations.NotNull
    private final android.graphics.Rect rect;

    RegionKt$iterator$1(android.graphics.Region r2) {
            r1 = this;
            r1.<init>()
            android.graphics.RegionIterator r0 = new android.graphics.RegionIterator
            r0.<init>(r2)
            r1.iterator = r0
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.rect = r2
            boolean r2 = r0.next(r2)
            r1.hasMore = r2
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            boolean r0 = r1.hasMore
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @org.jetbrains.annotations.NotNull
    public android.graphics.Rect next() {
            r3 = this;
            boolean r0 = r3.hasMore
            if (r0 == 0) goto L16
            android.graphics.Rect r0 = new android.graphics.Rect
            android.graphics.Rect r1 = r3.rect
            r0.<init>(r1)
            android.graphics.RegionIterator r1 = r3.iterator
            android.graphics.Rect r2 = r3.rect
            boolean r1 = r1.next(r2)
            r3.hasMore = r1
            return r0
        L16:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ android.graphics.Rect next() {
            r1 = this;
            android.graphics.Rect r0 = r1.next()
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
