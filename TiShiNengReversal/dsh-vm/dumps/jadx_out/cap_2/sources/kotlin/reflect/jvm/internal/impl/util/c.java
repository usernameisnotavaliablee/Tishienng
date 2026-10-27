package kotlin.reflect.jvm.internal.impl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class c<T> implements java.lang.Iterable<T>, l3.a {
    private c() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* synthetic */ c(kotlin.jvm.internal.v r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract int a();

    public abstract void d(int r1, @org.jetbrains.annotations.NotNull T r2);

    @org.jetbrains.annotations.Nullable
    public abstract T get(int r1);

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
