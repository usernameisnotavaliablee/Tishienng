package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class WorkContinuation {
    public WorkContinuation() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.work.WorkContinuation combine(@androidx.annotation.NonNull java.util.List<androidx.work.WorkContinuation> r1) {
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            androidx.work.WorkContinuation r0 = (androidx.work.WorkContinuation) r0
            androidx.work.WorkContinuation r1 = r0.combineInternal(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected abstract androidx.work.WorkContinuation combineInternal(@androidx.annotation.NonNull java.util.List<androidx.work.WorkContinuation> r1);

    @androidx.annotation.NonNull
    public abstract androidx.work.Operation enqueue();

    @androidx.annotation.NonNull
    public abstract com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> getWorkInfos();

    @androidx.annotation.NonNull
    public abstract androidx.lifecycle.LiveData<java.util.List<androidx.work.WorkInfo>> getWorkInfosLiveData();

    @androidx.annotation.NonNull
    public final androidx.work.WorkContinuation then(@androidx.annotation.NonNull androidx.work.OneTimeWorkRequest r1) {
            r0 = this;
            java.util.List r1 = java.util.Collections.singletonList(r1)
            androidx.work.WorkContinuation r1 = r0.then(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public abstract androidx.work.WorkContinuation then(@androidx.annotation.NonNull java.util.List<androidx.work.OneTimeWorkRequest> r1);
}
