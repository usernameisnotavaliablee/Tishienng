package xyz.adscope.common;

import xyz.adscope.common.v2.persistent.db.IBaseDatabaseModel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
final class p<E extends xyz.adscope.common.v2.persistent.db.IBaseDatabaseModel> extends java.util.concurrent.CopyOnWriteArrayList<E> {
    private final int a;
    private final xyz.adscope.common.p<E>.b b;
    private xyz.adscope.common.p.a<E> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a<E extends xyz.adscope.common.v2.persistent.db.IBaseDatabaseModel> {
        void a(java.util.List<E> r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b extends xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask {
        final /* synthetic */ xyz.adscope.common.p a;

        public b(xyz.adscope.common.p r1, long r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // xyz.adscope.common.v2.thread.timer.task.ICommonTimeoutTask
        protected void onScheduleTimeout() {
                r2 = this;
                xyz.adscope.common.p r0 = r2.a
                monitor-enter(r0)
                xyz.adscope.common.p r1 = r2.a     // Catch: java.lang.Throwable -> La
                xyz.adscope.common.p.a(r1)     // Catch: java.lang.Throwable -> La
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La
                return
            La:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La
                throw r1
        }
    }

    p(int r1, long r2) {
            r0 = this;
            r0.<init>()
            if (r1 <= 0) goto L6
            goto L7
        L6:
            r1 = 1
        L7:
            r0.a = r1
            xyz.adscope.common.p$b r1 = new xyz.adscope.common.p$b
            r1.<init>(r0, r2)
            r0.b = r1
            return
    }

    private java.util.List<E> a() {
            r1 = this;
            monitor-enter(r1)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb
            r1.clear()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            return r0
        Lb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    private void a(java.util.List<E> r2) {
            r1 = this;
            xyz.adscope.common.p$a<E extends xyz.adscope.common.v2.persistent.db.IBaseDatabaseModel> r0 = r1.c
            if (r0 == 0) goto L7
            r0.a(r2)
        L7:
            return
    }

    static /* synthetic */ void a(xyz.adscope.common.p r0) {
            r0.b()
            return
    }

    private void b() {
            r1 = this;
            xyz.adscope.common.p<E>$b r0 = r1.b
            r0.cancelCountDown()
            java.util.List r0 = r1.a()
            r1.a(r0)
            return
    }

    void a(xyz.adscope.common.p.a<E> r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public boolean a(E r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r3 = super.add(r3)     // Catch: java.lang.Throwable -> L14
            if (r3 == 0) goto L16
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L14
            r1 = 1
            if (r0 != r1) goto L16
            xyz.adscope.common.p<E>$b r0 = r2.b     // Catch: java.lang.Throwable -> L14
            r0.startCountDown()     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r3 = move-exception
            goto L25
        L16:
            if (r3 == 0) goto L23
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L14
            int r1 = r2.a     // Catch: java.lang.Throwable -> L14
            if (r0 != r1) goto L23
            r2.b()     // Catch: java.lang.Throwable -> L14
        L23:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            return r3
        L25:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            xyz.adscope.common.v2.persistent.db.IBaseDatabaseModel r1 = (xyz.adscope.common.v2.persistent.db.IBaseDatabaseModel) r1
            boolean r1 = r0.a(r1)
            return r1
    }
}
