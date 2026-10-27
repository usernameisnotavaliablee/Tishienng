package androidx.work.impl.workers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class CombineContinuationsWorker extends androidx.work.Worker {
    public CombineContinuationsWorker(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull androidx.work.WorkerParameters r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // androidx.work.Worker
    @androidx.annotation.NonNull
    public androidx.work.ListenableWorker.Result doWork() {
            r1 = this;
            androidx.work.Data r0 = r1.getInputData()
            androidx.work.ListenableWorker$Result r0 = androidx.work.ListenableWorker.Result.success(r0)
            return r0
    }
}
