package com.bxkj.student.v2.ai.fitness.camera;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class k implements java.util.concurrent.Executor {
    private final java.util.concurrent.Executor a;
    private final java.util.concurrent.atomic.AtomicBoolean b;

    public k(@androidx.annotation.NonNull java.util.concurrent.Executor r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.b = r0
            r1.a = r2
            return
    }

    public static /* synthetic */ void a(com.bxkj.student.v2.ai.fitness.camera.k r0, java.lang.Runnable r1) {
            r0.b(r1)
            return
    }

    private /* synthetic */ void b(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.b
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            return
        L9:
            r2.run()
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(@androidx.annotation.NonNull java.lang.Runnable r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.b
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            return
        L9:
            java.util.concurrent.Executor r0 = r2.a
            com.bxkj.student.v2.ai.fitness.camera.j r1 = new com.bxkj.student.v2.ai.fitness.camera.j
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    public void shutdown() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.b
            r1 = 1
            r0.set(r1)
            return
    }
}
