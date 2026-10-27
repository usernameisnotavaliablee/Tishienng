package master.flame.danmaku.danmaku.model.objectpool;

import master.flame.danmaku.danmaku.model.objectpool.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class a<T extends master.flame.danmaku.danmaku.model.objectpool.c<T>> implements master.flame.danmaku.danmaku.model.objectpool.b<T> {
    private final master.flame.danmaku.danmaku.model.objectpool.d<T> a;
    private final int b;
    private final boolean c;
    private T d;
    private int e;

    a(master.flame.danmaku.danmaku.model.objectpool.d<T> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r1 = 0
            r0.b = r1
            r1 = 1
            r0.c = r1
            return
    }

    a(master.flame.danmaku.danmaku.model.objectpool.d<T> r1, int r2) {
            r0 = this;
            r0.<init>()
            if (r2 <= 0) goto Ld
            r0.a = r1
            r0.b = r2
            r1 = 0
            r0.c = r1
            return
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The pool limit must be > 0"
            r1.<init>(r2)
            throw r1
    }

    @Override // master.flame.danmaku.danmaku.model.objectpool.b
    public void a(T r3) {
            r2 = this;
            boolean r0 = r3.i()
            if (r0 != 0) goto L26
            boolean r0 = r2.c
            if (r0 != 0) goto L10
            int r0 = r2.e
            int r1 = r2.b
            if (r0 >= r1) goto L20
        L10:
            int r0 = r2.e
            r1 = 1
            int r0 = r0 + r1
            r2.e = r0
            T extends master.flame.danmaku.danmaku.model.objectpool.c<T> r0 = r2.d
            r3.g(r0)
            r3.h(r1)
            r2.d = r3
        L20:
            master.flame.danmaku.danmaku.model.objectpool.d<T extends master.flame.danmaku.danmaku.model.objectpool.c<T>> r0 = r2.a
            r0.a(r3)
            return
        L26:
            java.io.PrintStream r0 = java.lang.System.out
            r3.toString()
            r0.getClass()
            return
    }

    @Override // master.flame.danmaku.danmaku.model.objectpool.b
    public T acquire() {
            r2 = this;
            T extends master.flame.danmaku.danmaku.model.objectpool.c<T> r0 = r2.d
            if (r0 == 0) goto L13
            java.lang.Object r1 = r0.b()
            master.flame.danmaku.danmaku.model.objectpool.c r1 = (master.flame.danmaku.danmaku.model.objectpool.c) r1
            r2.d = r1
            int r1 = r2.e
            int r1 = r1 + (-1)
            r2.e = r1
            goto L19
        L13:
            master.flame.danmaku.danmaku.model.objectpool.d<T extends master.flame.danmaku.danmaku.model.objectpool.c<T>> r0 = r2.a
            master.flame.danmaku.danmaku.model.objectpool.c r0 = r0.b()
        L19:
            if (r0 == 0) goto L28
            r1 = 0
            r0.g(r1)
            r1 = 0
            r0.h(r1)
            master.flame.danmaku.danmaku.model.objectpool.d<T extends master.flame.danmaku.danmaku.model.objectpool.c<T>> r1 = r2.a
            r1.c(r0)
        L28:
            return r0
    }
}
