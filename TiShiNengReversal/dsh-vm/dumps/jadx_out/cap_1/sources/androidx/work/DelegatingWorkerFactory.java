package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class DelegatingWorkerFactory extends androidx.work.WorkerFactory {
    private static final java.lang.String TAG = null;
    private final java.util.List<androidx.work.WorkerFactory> mFactories;

    static {
            java.lang.String r0 = "DelegatingWkrFctry"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.DelegatingWorkerFactory.TAG = r0
            return
    }

    public DelegatingWorkerFactory() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.mFactories = r0
            return
    }

    public final void addFactory(@androidx.annotation.NonNull androidx.work.WorkerFactory r2) {
            r1 = this;
            java.util.List<androidx.work.WorkerFactory> r0 = r1.mFactories
            r0.add(r2)
            return
    }

    @Override // androidx.work.WorkerFactory
    @androidx.annotation.Nullable
    public final androidx.work.ListenableWorker createWorker(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.NonNull androidx.work.WorkerParameters r6) {
            r3 = this;
            java.util.List<androidx.work.WorkerFactory> r0 = r3.mFactories
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.work.WorkerFactory r1 = (androidx.work.WorkerFactory) r1
            androidx.work.ListenableWorker r1 = r1.createWorker(r4, r5, r6)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L6
            return r1
        L19:
            r4 = move-exception
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r1 = 0
            r0[r1] = r5
            java.lang.String r5 = "Unable to instantiate a ListenableWorker (%s)"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r2 = androidx.work.DelegatingWorkerFactory.TAG
            java.lang.Throwable[] r6 = new java.lang.Throwable[r6]
            r6[r1] = r4
            r0.error(r2, r5, r6)
            throw r4
        L34:
            r4 = 0
            return r4
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    java.util.List<androidx.work.WorkerFactory> getFactories() {
            r1 = this;
            java.util.List<androidx.work.WorkerFactory> r0 = r1.mFactories
            return r0
    }
}
