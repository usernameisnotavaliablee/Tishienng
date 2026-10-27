package androidx.work.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class OperationImpl implements androidx.work.Operation {
    private final androidx.work.impl.utils.futures.SettableFuture<androidx.work.Operation.State.SUCCESS> mOperationFuture;
    private final androidx.lifecycle.MutableLiveData<androidx.work.Operation.State> mOperationState;

    public OperationImpl() {
            r1 = this;
            r1.<init>()
            androidx.lifecycle.MutableLiveData r0 = new androidx.lifecycle.MutableLiveData
            r0.<init>()
            r1.mOperationState = r0
            androidx.work.impl.utils.futures.SettableFuture r0 = androidx.work.impl.utils.futures.SettableFuture.create()
            r1.mOperationFuture = r0
            androidx.work.Operation$State$IN_PROGRESS r0 = androidx.work.Operation.IN_PROGRESS
            r1.setState(r0)
            return
    }

    @Override // androidx.work.Operation
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<androidx.work.Operation.State.SUCCESS> getResult() {
            r1 = this;
            androidx.work.impl.utils.futures.SettableFuture<androidx.work.Operation$State$SUCCESS> r0 = r1.mOperationFuture
            return r0
    }

    @Override // androidx.work.Operation
    @androidx.annotation.NonNull
    public androidx.lifecycle.LiveData<androidx.work.Operation.State> getState() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<androidx.work.Operation$State> r0 = r1.mOperationState
            return r0
    }

    public void setState(@androidx.annotation.NonNull androidx.work.Operation.State r2) {
            r1 = this;
            androidx.lifecycle.MutableLiveData<androidx.work.Operation$State> r0 = r1.mOperationState
            r0.postValue(r2)
            boolean r0 = r2 instanceof androidx.work.Operation.State.SUCCESS
            if (r0 == 0) goto L11
            androidx.work.impl.utils.futures.SettableFuture<androidx.work.Operation$State$SUCCESS> r0 = r1.mOperationFuture
            androidx.work.Operation$State$SUCCESS r2 = (androidx.work.Operation.State.SUCCESS) r2
            r0.set(r2)
            return
        L11:
            boolean r0 = r2 instanceof androidx.work.Operation.State.FAILURE
            if (r0 == 0) goto L20
            androidx.work.Operation$State$FAILURE r2 = (androidx.work.Operation.State.FAILURE) r2
            androidx.work.impl.utils.futures.SettableFuture<androidx.work.Operation$State$SUCCESS> r0 = r1.mOperationFuture
            java.lang.Throwable r2 = r2.getThrowable()
            r0.setException(r2)
        L20:
            return
    }
}
