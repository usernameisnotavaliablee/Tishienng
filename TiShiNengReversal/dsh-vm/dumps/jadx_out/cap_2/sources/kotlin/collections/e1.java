package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class e1 implements java.util.Iterator<java.lang.Long>, l3.a {
    public e1() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @org.jetbrains.annotations.NotNull
    public final java.lang.Long next() {
            r2 = this;
            long r0 = r2.nextLong()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Long next() {
            r2 = this;
            long r0 = r2.nextLong()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    public abstract long nextLong();

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
