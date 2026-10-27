package androidx.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ListChangeRegistry extends androidx.databinding.CallbackRegistry<androidx.databinding.ObservableList.OnListChangedCallback, androidx.databinding.ObservableList, androidx.databinding.ListChangeRegistry.ListChanges> {
    private static final int ALL = 0;
    private static final int CHANGED = 1;
    private static final int INSERTED = 2;
    private static final int MOVED = 3;
    private static final androidx.databinding.CallbackRegistry.NotifierCallback<androidx.databinding.ObservableList.OnListChangedCallback, androidx.databinding.ObservableList, androidx.databinding.ListChangeRegistry.ListChanges> NOTIFIER_CALLBACK = null;
    private static final int REMOVED = 4;
    private static final androidx.core.util.Pools.SynchronizedPool<androidx.databinding.ListChangeRegistry.ListChanges> sListChanges = null;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ListChanges {
        public int count;
        public int start;
        public int to;

        ListChanges() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            androidx.core.util.Pools$SynchronizedPool r0 = new androidx.core.util.Pools$SynchronizedPool
            r1 = 10
            r0.<init>(r1)
            androidx.databinding.ListChangeRegistry.sListChanges = r0
            androidx.databinding.ListChangeRegistry$1 r0 = new androidx.databinding.ListChangeRegistry$1
            r0.<init>()
            androidx.databinding.ListChangeRegistry.NOTIFIER_CALLBACK = r0
            return
    }

    public ListChangeRegistry() {
            r1 = this;
            androidx.databinding.CallbackRegistry$NotifierCallback<androidx.databinding.ObservableList$OnListChangedCallback, androidx.databinding.ObservableList, androidx.databinding.ListChangeRegistry$ListChanges> r0 = androidx.databinding.ListChangeRegistry.NOTIFIER_CALLBACK
            r1.<init>(r0)
            return
    }

    private static androidx.databinding.ListChangeRegistry.ListChanges acquire(int r1, int r2, int r3) {
            androidx.core.util.Pools$SynchronizedPool<androidx.databinding.ListChangeRegistry$ListChanges> r0 = androidx.databinding.ListChangeRegistry.sListChanges
            java.lang.Object r0 = r0.acquire()
            androidx.databinding.ListChangeRegistry$ListChanges r0 = (androidx.databinding.ListChangeRegistry.ListChanges) r0
            if (r0 != 0) goto Lf
            androidx.databinding.ListChangeRegistry$ListChanges r0 = new androidx.databinding.ListChangeRegistry$ListChanges
            r0.<init>()
        Lf:
            r0.start = r1
            r0.to = r2
            r0.count = r3
            return r0
    }

    /* renamed from: notifyCallbacks, reason: avoid collision after fix types in other method */
    public synchronized void notifyCallbacks2(@androidx.annotation.NonNull androidx.databinding.ObservableList r1, int r2, androidx.databinding.ListChangeRegistry.ListChanges r3) {
            r0 = this;
            monitor-enter(r0)
            super.notifyCallbacks(r1, r2, r3)     // Catch: java.lang.Throwable -> Lc
            if (r3 == 0) goto Le
            androidx.core.util.Pools$SynchronizedPool<androidx.databinding.ListChangeRegistry$ListChanges> r1 = androidx.databinding.ListChangeRegistry.sListChanges     // Catch: java.lang.Throwable -> Lc
            r1.release(r3)     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r1 = move-exception
            goto L10
        Le:
            monitor-exit(r0)
            return
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    @Override // androidx.databinding.CallbackRegistry
    public /* bridge */ /* synthetic */ void notifyCallbacks(@androidx.annotation.NonNull androidx.databinding.ObservableList r1, int r2, androidx.databinding.ListChangeRegistry.ListChanges r3) {
            r0 = this;
            androidx.databinding.ObservableList r1 = (androidx.databinding.ObservableList) r1
            androidx.databinding.ListChangeRegistry$ListChanges r3 = (androidx.databinding.ListChangeRegistry.ListChanges) r3
            r0.notifyCallbacks2(r1, r2, r3)
            return
    }

    public void notifyChanged(@androidx.annotation.NonNull androidx.databinding.ObservableList r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.notifyCallbacks2(r3, r0, r1)
            return
    }

    public void notifyChanged(@androidx.annotation.NonNull androidx.databinding.ObservableList r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            androidx.databinding.ListChangeRegistry$ListChanges r3 = acquire(r3, r0, r4)
            r4 = 1
            r1.notifyCallbacks2(r2, r4, r3)
            return
    }

    public void notifyInserted(@androidx.annotation.NonNull androidx.databinding.ObservableList r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            androidx.databinding.ListChangeRegistry$ListChanges r3 = acquire(r3, r0, r4)
            r4 = 2
            r1.notifyCallbacks2(r2, r4, r3)
            return
    }

    public void notifyMoved(@androidx.annotation.NonNull androidx.databinding.ObservableList r1, int r2, int r3, int r4) {
            r0 = this;
            androidx.databinding.ListChangeRegistry$ListChanges r2 = acquire(r2, r3, r4)
            r3 = 3
            r0.notifyCallbacks2(r1, r3, r2)
            return
    }

    public void notifyRemoved(@androidx.annotation.NonNull androidx.databinding.ObservableList r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            androidx.databinding.ListChangeRegistry$ListChanges r3 = acquire(r3, r0, r4)
            r4 = 4
            r1.notifyCallbacks2(r2, r4, r3)
            return
    }
}
