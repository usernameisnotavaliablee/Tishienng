package kotlin.reflect.jvm.internal.impl.storage;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class l<T> {
    private final T a;
    private final java.lang.Thread b;

    l(T r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r0.b = r1
            return
    }

    public T a() {
            r2 = this;
            boolean r0 = r2.b()
            if (r0 == 0) goto L9
            T r0 = r2.a
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No value in this thread (hasValue should be checked before)"
            r0.<init>(r1)
            throw r0
    }

    public boolean b() {
            r2 = this;
            java.lang.Thread r0 = r2.b
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }
}
