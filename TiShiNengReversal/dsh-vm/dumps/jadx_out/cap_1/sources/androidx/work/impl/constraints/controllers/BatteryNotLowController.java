package androidx.work.impl.constraints.controllers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class BatteryNotLowController extends androidx.work.impl.constraints.controllers.ConstraintController<java.lang.Boolean> {
    public BatteryNotLowController(android.content.Context r1, androidx.work.impl.utils.taskexecutor.TaskExecutor r2) {
            r0 = this;
            androidx.work.impl.constraints.trackers.Trackers r1 = androidx.work.impl.constraints.trackers.Trackers.getInstance(r1, r2)
            androidx.work.impl.constraints.trackers.BatteryNotLowTracker r1 = r1.getBatteryNotLowTracker()
            r0.<init>(r1)
            return
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    boolean hasConstraint(@androidx.annotation.NonNull androidx.work.impl.model.WorkSpec r1) {
            r0 = this;
            androidx.work.Constraints r1 = r1.constraints
            boolean r1 = r1.requiresBatteryNotLow()
            return r1
    }

    /* renamed from: isConstrained, reason: avoid collision after fix types in other method */
    boolean isConstrained2(@androidx.annotation.NonNull java.lang.Boolean r1) {
            r0 = this;
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ 1
            return r1
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    /* bridge */ /* synthetic */ boolean isConstrained(@androidx.annotation.NonNull java.lang.Boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r0.isConstrained2(r1)
            return r1
    }
}
