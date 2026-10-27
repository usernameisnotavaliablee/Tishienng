package androidx.work.impl.constraints.controllers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class NetworkConnectedController extends androidx.work.impl.constraints.controllers.ConstraintController<androidx.work.impl.constraints.NetworkState> {
    public NetworkConnectedController(android.content.Context r1, androidx.work.impl.utils.taskexecutor.TaskExecutor r2) {
            r0 = this;
            androidx.work.impl.constraints.trackers.Trackers r1 = androidx.work.impl.constraints.trackers.Trackers.getInstance(r1, r2)
            androidx.work.impl.constraints.trackers.NetworkStateTracker r1 = r1.getNetworkStateTracker()
            r0.<init>(r1)
            return
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    boolean hasConstraint(@androidx.annotation.NonNull androidx.work.impl.model.WorkSpec r2) {
            r1 = this;
            androidx.work.Constraints r2 = r2.constraints
            androidx.work.NetworkType r2 = r2.getRequiredNetworkType()
            androidx.work.NetworkType r0 = androidx.work.NetworkType.CONNECTED
            if (r2 != r0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    /* renamed from: isConstrained, reason: avoid collision after fix types in other method */
    boolean isConstrained2(@androidx.annotation.NonNull androidx.work.impl.constraints.NetworkState r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 1
            if (r0 < r1) goto L17
            boolean r0 = r4.isConnected()
            if (r0 == 0) goto L16
            boolean r4 = r4.isValidated()
            if (r4 != 0) goto L14
            goto L16
        L14:
            r4 = 0
            return r4
        L16:
            return r2
        L17:
            boolean r4 = r4.isConnected()
            r4 = r4 ^ r2
            return r4
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    /* bridge */ /* synthetic */ boolean isConstrained(@androidx.annotation.NonNull androidx.work.impl.constraints.NetworkState r1) {
            r0 = this;
            androidx.work.impl.constraints.NetworkState r1 = (androidx.work.impl.constraints.NetworkState) r1
            boolean r1 = r0.isConstrained2(r1)
            return r1
    }
}
