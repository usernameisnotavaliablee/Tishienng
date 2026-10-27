package androidx.work.multiprocess;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class RemoteWorkContinuation {
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected RemoteWorkContinuation() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.work.multiprocess.RemoteWorkContinuation combine(@androidx.annotation.NonNull java.util.List<androidx.work.multiprocess.RemoteWorkContinuation> r1) {
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            androidx.work.multiprocess.RemoteWorkContinuation r0 = (androidx.work.multiprocess.RemoteWorkContinuation) r0
            androidx.work.multiprocess.RemoteWorkContinuation r1 = r0.combineInternal(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected abstract androidx.work.multiprocess.RemoteWorkContinuation combineInternal(@androidx.annotation.NonNull java.util.List<androidx.work.multiprocess.RemoteWorkContinuation> r1);

    @androidx.annotation.NonNull
    public abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enqueue();

    @androidx.annotation.NonNull
    public final androidx.work.multiprocess.RemoteWorkContinuation then(@androidx.annotation.NonNull androidx.work.OneTimeWorkRequest r1) {
            r0 = this;
            java.util.List r1 = java.util.Collections.singletonList(r1)
            androidx.work.multiprocess.RemoteWorkContinuation r1 = r0.then(r1)
            return r1
    }

    @androidx.annotation.NonNull
    public abstract androidx.work.multiprocess.RemoteWorkContinuation then(@androidx.annotation.NonNull java.util.List<androidx.work.OneTimeWorkRequest> r1);
}
