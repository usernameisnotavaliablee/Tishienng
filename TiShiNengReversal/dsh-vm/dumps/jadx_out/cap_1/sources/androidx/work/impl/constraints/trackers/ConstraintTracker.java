package androidx.work.impl.constraints.trackers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class ConstraintTracker<T> {
    private static final java.lang.String TAG = null;
    protected final android.content.Context mAppContext;
    T mCurrentState;
    private final java.util.Set<androidx.work.impl.constraints.ConstraintListener<T>> mListeners;
    private final java.lang.Object mLock;
    protected final androidx.work.impl.utils.taskexecutor.TaskExecutor mTaskExecutor;


    static {
            java.lang.String r0 = "ConstraintTracker"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.constraints.trackers.ConstraintTracker.TAG = r0
            return
    }

    ConstraintTracker(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull androidx.work.impl.utils.taskexecutor.TaskExecutor r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.mListeners = r0
            android.content.Context r2 = r2.getApplicationContext()
            r1.mAppContext = r2
            r1.mTaskExecutor = r3
            return
    }

    public void addListener(androidx.work.impl.constraints.ConstraintListener<T> r10) {
            r9 = this;
            java.lang.Object r0 = r9.mLock
            monitor-enter(r0)
            java.util.Set<androidx.work.impl.constraints.ConstraintListener<T>> r1 = r9.mListeners     // Catch: java.lang.Throwable -> L41
            boolean r1 = r1.add(r10)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L48
            java.util.Set<androidx.work.impl.constraints.ConstraintListener<T>> r1 = r9.mListeners     // Catch: java.lang.Throwable -> L41
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L41
            r2 = 1
            if (r1 != r2) goto L43
            java.lang.Object r1 = r9.getInitialState()     // Catch: java.lang.Throwable -> L41
            r9.mCurrentState = r1     // Catch: java.lang.Throwable -> L41
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = androidx.work.impl.constraints.trackers.ConstraintTracker.TAG     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = "%s: initial state = %s"
            java.lang.Class r5 = r9.getClass()     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = r5.getSimpleName()     // Catch: java.lang.Throwable -> L41
            T r6 = r9.mCurrentState     // Catch: java.lang.Throwable -> L41
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L41
            r8 = 0
            r7[r8] = r5     // Catch: java.lang.Throwable -> L41
            r7[r2] = r6     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = java.lang.String.format(r4, r7)     // Catch: java.lang.Throwable -> L41
            java.lang.Throwable[] r4 = new java.lang.Throwable[r8]     // Catch: java.lang.Throwable -> L41
            r1.debug(r3, r2, r4)     // Catch: java.lang.Throwable -> L41
            r9.startTracking()     // Catch: java.lang.Throwable -> L41
            goto L43
        L41:
            r10 = move-exception
            goto L4a
        L43:
            T r1 = r9.mCurrentState     // Catch: java.lang.Throwable -> L41
            r10.onConstraintChanged(r1)     // Catch: java.lang.Throwable -> L41
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            return
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            throw r10
    }

    public abstract T getInitialState();

    public void removeListener(androidx.work.impl.constraints.ConstraintListener<T> r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.util.Set<androidx.work.impl.constraints.ConstraintListener<T>> r1 = r2.mListeners     // Catch: java.lang.Throwable -> L17
            boolean r3 = r1.remove(r3)     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L19
            java.util.Set<androidx.work.impl.constraints.ConstraintListener<T>> r3 = r2.mListeners     // Catch: java.lang.Throwable -> L17
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L19
            r2.stopTracking()     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r3 = move-exception
            goto L1b
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r3
    }

    public void setState(T r4) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            T r1 = r3.mCurrentState     // Catch: java.lang.Throwable -> L10
            if (r1 == r4) goto L2b
            if (r1 == 0) goto L12
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L12
            goto L2b
        L10:
            r4 = move-exception
            goto L2d
        L12:
            r3.mCurrentState = r4     // Catch: java.lang.Throwable -> L10
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L10
            java.util.Set<androidx.work.impl.constraints.ConstraintListener<T>> r1 = r3.mListeners     // Catch: java.lang.Throwable -> L10
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L10
            androidx.work.impl.utils.taskexecutor.TaskExecutor r1 = r3.mTaskExecutor     // Catch: java.lang.Throwable -> L10
            java.util.concurrent.Executor r1 = r1.getMainThreadExecutor()     // Catch: java.lang.Throwable -> L10
            androidx.work.impl.constraints.trackers.ConstraintTracker$1 r2 = new androidx.work.impl.constraints.trackers.ConstraintTracker$1     // Catch: java.lang.Throwable -> L10
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L10
            r1.execute(r2)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r4
    }

    public abstract void startTracking();

    public abstract void stopTracking();
}
