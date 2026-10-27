package androidx.work.impl.constraints;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class WorkConstraintsTracker implements androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback {
    private static final java.lang.String TAG = null;

    @androidx.annotation.Nullable
    private final androidx.work.impl.constraints.WorkConstraintsCallback mCallback;
    private final androidx.work.impl.constraints.controllers.ConstraintController<?>[] mConstraintControllers;
    private final java.lang.Object mLock;

    static {
            java.lang.String r0 = "WorkConstraintsTracker"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.constraints.WorkConstraintsTracker.TAG = r0
            return
    }

    public WorkConstraintsTracker(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.NonNull androidx.work.impl.utils.taskexecutor.TaskExecutor r8, @androidx.annotation.Nullable androidx.work.impl.constraints.WorkConstraintsCallback r9) {
            r6 = this;
            r6.<init>()
            android.content.Context r7 = r7.getApplicationContext()
            r6.mCallback = r9
            androidx.work.impl.constraints.controllers.BatteryChargingController r9 = new androidx.work.impl.constraints.controllers.BatteryChargingController
            r9.<init>(r7, r8)
            androidx.work.impl.constraints.controllers.BatteryNotLowController r0 = new androidx.work.impl.constraints.controllers.BatteryNotLowController
            r0.<init>(r7, r8)
            androidx.work.impl.constraints.controllers.StorageNotLowController r1 = new androidx.work.impl.constraints.controllers.StorageNotLowController
            r1.<init>(r7, r8)
            androidx.work.impl.constraints.controllers.NetworkConnectedController r2 = new androidx.work.impl.constraints.controllers.NetworkConnectedController
            r2.<init>(r7, r8)
            androidx.work.impl.constraints.controllers.NetworkUnmeteredController r3 = new androidx.work.impl.constraints.controllers.NetworkUnmeteredController
            r3.<init>(r7, r8)
            androidx.work.impl.constraints.controllers.NetworkNotRoamingController r4 = new androidx.work.impl.constraints.controllers.NetworkNotRoamingController
            r4.<init>(r7, r8)
            androidx.work.impl.constraints.controllers.NetworkMeteredController r5 = new androidx.work.impl.constraints.controllers.NetworkMeteredController
            r5.<init>(r7, r8)
            r7 = 7
            androidx.work.impl.constraints.controllers.ConstraintController[] r7 = new androidx.work.impl.constraints.controllers.ConstraintController[r7]
            r8 = 0
            r7[r8] = r9
            r8 = 1
            r7[r8] = r0
            r8 = 2
            r7[r8] = r1
            r8 = 3
            r7[r8] = r2
            r8 = 4
            r7[r8] = r3
            r8 = 5
            r7[r8] = r4
            r8 = 6
            r7[r8] = r5
            r6.mConstraintControllers = r7
            java.lang.Object r7 = new java.lang.Object
            r7.<init>()
            r6.mLock = r7
            return
    }

    @androidx.annotation.VisibleForTesting
    WorkConstraintsTracker(@androidx.annotation.Nullable androidx.work.impl.constraints.WorkConstraintsCallback r1, androidx.work.impl.constraints.controllers.ConstraintController<?>[] r2) {
            r0 = this;
            r0.<init>()
            r0.mCallback = r1
            r0.mConstraintControllers = r2
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.mLock = r1
            return
    }

    public boolean areAllConstraintsMet(@androidx.annotation.NonNull java.lang.String r9) {
            r8 = this;
            java.lang.Object r0 = r8.mLock
            monitor-enter(r0)
            androidx.work.impl.constraints.controllers.ConstraintController<?>[] r1 = r8.mConstraintControllers     // Catch: java.lang.Throwable -> L35
            int r2 = r1.length     // Catch: java.lang.Throwable -> L35
            r3 = 0
            r4 = 0
        L8:
            r5 = 1
            if (r4 >= r2) goto L3a
            r6 = r1[r4]     // Catch: java.lang.Throwable -> L35
            boolean r7 = r6.isWorkSpecConstrained(r9)     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L37
            androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = androidx.work.impl.constraints.WorkConstraintsTracker.TAG     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "Work %s constrained by %s"
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L35
            java.lang.String r6 = r6.getSimpleName()     // Catch: java.lang.Throwable -> L35
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L35
            r7[r3] = r9     // Catch: java.lang.Throwable -> L35
            r7[r5] = r6     // Catch: java.lang.Throwable -> L35
            java.lang.String r9 = java.lang.String.format(r4, r7)     // Catch: java.lang.Throwable -> L35
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]     // Catch: java.lang.Throwable -> L35
            r1.debug(r2, r9, r4)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            return r3
        L35:
            r9 = move-exception
            goto L3c
        L37:
            int r4 = r4 + 1
            goto L8
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            return r5
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            throw r9
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback
    public void onConstraintMet(@androidx.annotation.NonNull java.util.List<java.lang.String> r9) {
            r8 = this;
            java.lang.Object r0 = r8.mLock
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L39
            r1.<init>()     // Catch: java.lang.Throwable -> L39
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L39
        Lc:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L39
            boolean r3 = r8.areAllConstraintsMet(r2)     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto Lc
            androidx.work.Logger r3 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = androidx.work.impl.constraints.WorkConstraintsTracker.TAG     // Catch: java.lang.Throwable -> L39
            java.lang.String r5 = "Constraints met for %s"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L39
            r7 = 0
            r6[r7] = r2     // Catch: java.lang.Throwable -> L39
            java.lang.String r5 = java.lang.String.format(r5, r6)     // Catch: java.lang.Throwable -> L39
            java.lang.Throwable[] r6 = new java.lang.Throwable[r7]     // Catch: java.lang.Throwable -> L39
            r3.debug(r4, r5, r6)     // Catch: java.lang.Throwable -> L39
            r1.add(r2)     // Catch: java.lang.Throwable -> L39
            goto Lc
        L39:
            r9 = move-exception
            goto L44
        L3b:
            androidx.work.impl.constraints.WorkConstraintsCallback r9 = r8.mCallback     // Catch: java.lang.Throwable -> L39
            if (r9 == 0) goto L42
            r9.onAllConstraintsMet(r1)     // Catch: java.lang.Throwable -> L39
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            return
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r9
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback
    public void onConstraintNotMet(@androidx.annotation.NonNull java.util.List<java.lang.String> r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.work.impl.constraints.WorkConstraintsCallback r1 = r2.mCallback     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Ld
            r1.onAllConstraintsNotMet(r3)     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r3 = move-exception
            goto Lf
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r3
    }

    public void replace(@androidx.annotation.NonNull java.lang.Iterable<androidx.work.impl.model.WorkSpec> r8) {
            r7 = this;
            java.lang.Object r0 = r7.mLock
            monitor-enter(r0)
            androidx.work.impl.constraints.controllers.ConstraintController<?>[] r1 = r7.mConstraintControllers     // Catch: java.lang.Throwable -> L13
            int r2 = r1.length     // Catch: java.lang.Throwable -> L13
            r3 = 0
            r4 = 0
        L8:
            if (r4 >= r2) goto L15
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L13
            r6 = 0
            r5.setCallback(r6)     // Catch: java.lang.Throwable -> L13
            int r4 = r4 + 1
            goto L8
        L13:
            r8 = move-exception
            goto L32
        L15:
            androidx.work.impl.constraints.controllers.ConstraintController<?>[] r1 = r7.mConstraintControllers     // Catch: java.lang.Throwable -> L13
            int r2 = r1.length     // Catch: java.lang.Throwable -> L13
            r4 = 0
        L19:
            if (r4 >= r2) goto L23
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L13
            r5.replace(r8)     // Catch: java.lang.Throwable -> L13
            int r4 = r4 + 1
            goto L19
        L23:
            androidx.work.impl.constraints.controllers.ConstraintController<?>[] r8 = r7.mConstraintControllers     // Catch: java.lang.Throwable -> L13
            int r1 = r8.length     // Catch: java.lang.Throwable -> L13
        L26:
            if (r3 >= r1) goto L30
            r2 = r8[r3]     // Catch: java.lang.Throwable -> L13
            r2.setCallback(r7)     // Catch: java.lang.Throwable -> L13
            int r3 = r3 + 1
            goto L26
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r8
    }

    public void reset() {
            r5 = this;
            java.lang.Object r0 = r5.mLock
            monitor-enter(r0)
            androidx.work.impl.constraints.controllers.ConstraintController<?>[] r1 = r5.mConstraintControllers     // Catch: java.lang.Throwable -> L11
            int r2 = r1.length     // Catch: java.lang.Throwable -> L11
            r3 = 0
        L7:
            if (r3 >= r2) goto L13
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L11
            r4.reset()     // Catch: java.lang.Throwable -> L11
            int r3 = r3 + 1
            goto L7
        L11:
            r1 = move-exception
            goto L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }
}
