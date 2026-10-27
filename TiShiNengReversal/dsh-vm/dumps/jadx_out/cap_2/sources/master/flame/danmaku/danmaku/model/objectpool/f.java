package master.flame.danmaku.danmaku.model.objectpool;

import master.flame.danmaku.danmaku.model.objectpool.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class f<T extends master.flame.danmaku.danmaku.model.objectpool.c<T>> implements master.flame.danmaku.danmaku.model.objectpool.b<T> {
    private final master.flame.danmaku.danmaku.model.objectpool.b<T> a;
    private final java.lang.Object b;

    public f(master.flame.danmaku.danmaku.model.objectpool.b<T> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r0
            return
    }

    public f(master.flame.danmaku.danmaku.model.objectpool.b<T> r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // master.flame.danmaku.danmaku.model.objectpool.b
    public void a(T r3) {
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            master.flame.danmaku.danmaku.model.objectpool.b<T extends master.flame.danmaku.danmaku.model.objectpool.c<T>> r1 = r2.a     // Catch: java.lang.Throwable -> La
            r1.a(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    @Override // master.flame.danmaku.danmaku.model.objectpool.b
    public T acquire() {
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            master.flame.danmaku.danmaku.model.objectpool.b<T extends master.flame.danmaku.danmaku.model.objectpool.c<T>> r1 = r2.a     // Catch: java.lang.Throwable -> Lb
            master.flame.danmaku.danmaku.model.objectpool.c r1 = r1.acquire()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }
}
