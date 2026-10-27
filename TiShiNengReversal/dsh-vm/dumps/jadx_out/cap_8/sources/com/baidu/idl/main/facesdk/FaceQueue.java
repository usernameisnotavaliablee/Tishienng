package com.baidu.idl.main.facesdk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FaceQueue {
    private int nThreads;
    private java.util.LinkedList queue;
    private com.baidu.idl.main.facesdk.FaceQueue.PoolWorker[] threads;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.baidu.idl.main.facesdk.FaceQueue$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class HolderClass {
        private static final com.baidu.idl.main.facesdk.FaceQueue instance = null;

        static {
                com.baidu.idl.main.facesdk.FaceQueue r0 = new com.baidu.idl.main.facesdk.FaceQueue
                r1 = 1
                r0.<init>(r1)
                com.baidu.idl.main.facesdk.FaceQueue.HolderClass.instance = r0
                return
        }

        private HolderClass() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.baidu.idl.main.facesdk.FaceQueue access$000() {
                com.baidu.idl.main.facesdk.FaceQueue r0 = com.baidu.idl.main.facesdk.FaceQueue.HolderClass.instance
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class PoolWorker extends java.lang.Thread {
        final /* synthetic */ com.baidu.idl.main.facesdk.FaceQueue this$0;

        private PoolWorker(com.baidu.idl.main.facesdk.FaceQueue r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ PoolWorker(com.baidu.idl.main.facesdk.FaceQueue r1, com.baidu.idl.main.facesdk.FaceQueue.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r2 = this;
            L0:
                com.baidu.idl.main.facesdk.FaceQueue r0 = r2.this$0
                java.util.LinkedList r0 = com.baidu.idl.main.facesdk.FaceQueue.access$200(r0)
                monitor-enter(r0)
            L7:
                com.baidu.idl.main.facesdk.FaceQueue r1 = r2.this$0     // Catch: java.lang.Throwable -> L1d
                java.util.LinkedList r1 = com.baidu.idl.main.facesdk.FaceQueue.access$200(r1)     // Catch: java.lang.Throwable -> L1d
                boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1d
                if (r1 == 0) goto L1f
                com.baidu.idl.main.facesdk.FaceQueue r1 = r2.this$0     // Catch: java.lang.InterruptedException -> L7 java.lang.Throwable -> L1d
                java.util.LinkedList r1 = com.baidu.idl.main.facesdk.FaceQueue.access$200(r1)     // Catch: java.lang.InterruptedException -> L7 java.lang.Throwable -> L1d
                r1.wait()     // Catch: java.lang.InterruptedException -> L7 java.lang.Throwable -> L1d
                goto L7
            L1d:
                r1 = move-exception
                goto L30
            L1f:
                com.baidu.idl.main.facesdk.FaceQueue r1 = r2.this$0     // Catch: java.lang.Throwable -> L1d
                java.util.LinkedList r1 = com.baidu.idl.main.facesdk.FaceQueue.access$200(r1)     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L1d
                java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L1d
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
                r1.run()     // Catch: java.lang.RuntimeException -> L0
                goto L0
            L30:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
                throw r1
        }
    }

    public FaceQueue(int r5) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.queue = r0
            r4.nThreads = r5
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r4.queue = r1
            com.baidu.idl.main.facesdk.FaceQueue$PoolWorker[] r1 = new com.baidu.idl.main.facesdk.FaceQueue.PoolWorker[r5]
            r4.threads = r1
            r1 = 0
        L14:
            if (r1 >= r5) goto L29
            com.baidu.idl.main.facesdk.FaceQueue$PoolWorker[] r2 = r4.threads
            com.baidu.idl.main.facesdk.FaceQueue$PoolWorker r3 = new com.baidu.idl.main.facesdk.FaceQueue$PoolWorker
            r3.<init>(r4, r0)
            r2[r1] = r3
            com.baidu.idl.main.facesdk.FaceQueue$PoolWorker[] r2 = r4.threads
            r2 = r2[r1]
            r2.start()
            int r1 = r1 + 1
            goto L14
        L29:
            return
    }

    static /* synthetic */ java.util.LinkedList access$200(com.baidu.idl.main.facesdk.FaceQueue r0) {
            java.util.LinkedList r0 = r0.queue
            return r0
    }

    public static com.baidu.idl.main.facesdk.FaceQueue getInstance() {
            com.baidu.idl.main.facesdk.FaceQueue r0 = com.baidu.idl.main.facesdk.FaceQueue.HolderClass.access$000()
            return r0
    }

    public void execute(java.lang.Runnable r3) {
            r2 = this;
            java.util.LinkedList r0 = r2.queue
            monitor-enter(r0)
            java.util.LinkedList r1 = r2.queue     // Catch: java.lang.Throwable -> Lf
            r1.addLast(r3)     // Catch: java.lang.Throwable -> Lf
            java.util.LinkedList r3 = r2.queue     // Catch: java.lang.Throwable -> Lf
            r3.notify()     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }
}
