package androidx.camera.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class PreviewStreamStateObserver implements androidx.camera.core.impl.Observable.Observer<androidx.camera.core.impl.CameraInternal.State> {
    private static final java.lang.String TAG = "StreamStateObserver";
    private final androidx.camera.core.impl.CameraInfoInternal mCameraInfoInternal;
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mFlowFuture;
    private boolean mHasStartedPreviewStreamFlow;

    @androidx.annotation.GuardedBy("this")
    private androidx.camera.view.PreviewView.StreamState mPreviewStreamState;
    private final androidx.lifecycle.MutableLiveData<androidx.camera.view.PreviewView.StreamState> mPreviewStreamStateLiveData;
    private final androidx.camera.view.PreviewViewImplementation mPreviewViewImplementation;



    PreviewStreamStateObserver(androidx.camera.core.impl.CameraInfoInternal r2, androidx.lifecycle.MutableLiveData<androidx.camera.view.PreviewView.StreamState> r3, androidx.camera.view.PreviewViewImplementation r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mHasStartedPreviewStreamFlow = r0
            r1.mCameraInfoInternal = r2
            r1.mPreviewStreamStateLiveData = r3
            r1.mPreviewViewImplementation = r4
            monitor-enter(r1)
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> L17
            androidx.camera.view.PreviewView$StreamState r2 = (androidx.camera.view.PreviewView.StreamState) r2     // Catch: java.lang.Throwable -> L17
            r1.mPreviewStreamState = r2     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r2
    }

    public static /* synthetic */ java.lang.Object a(androidx.camera.view.PreviewStreamStateObserver r1, androidx.camera.core.CameraInfo r2, java.util.List r3, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r4) {
            r1.getClass()
            androidx.camera.view.PreviewStreamStateObserver$2 r0 = new androidx.camera.view.PreviewStreamStateObserver$2
            r0.<init>(r1, r4, r2)
            r3.add(r0)
            androidx.camera.core.impl.CameraInfoInternal r2 = (androidx.camera.core.impl.CameraInfoInternal) r2
            java.util.concurrent.Executor r1 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            r2.addSessionCaptureCallback(r1, r0)
            java.lang.String r1 = "waitForCaptureResult"
            return r1
    }

    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture b(androidx.camera.view.PreviewStreamStateObserver r0, java.lang.Void r1) {
            androidx.camera.view.PreviewViewImplementation r0 = r0.mPreviewViewImplementation
            com.google.common.util.concurrent.ListenableFuture r0 = r0.waitForNextFrame()
            return r0
    }

    public static /* synthetic */ java.lang.Void c(androidx.camera.view.PreviewStreamStateObserver r0, java.lang.Void r1) {
            r0.getClass()
            androidx.camera.view.PreviewView$StreamState r1 = androidx.camera.view.PreviewView.StreamState.STREAMING
            r0.updatePreviewStreamState(r1)
            r0 = 0
            return r0
    }

    private void cancelFlow() {
            r2 = this;
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r0 = r2.mFlowFuture
            if (r0 == 0) goto Lb
            r1 = 0
            r0.cancel(r1)
            r0 = 0
            r2.mFlowFuture = r0
        Lb:
            return
    }

    @androidx.annotation.MainThread
    private void startPreviewStreamStateFlow(androidx.camera.core.CameraInfo r5) {
            r4 = this;
            androidx.camera.view.PreviewView$StreamState r0 = androidx.camera.view.PreviewView.StreamState.IDLE
            r4.updatePreviewStreamState(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.common.util.concurrent.ListenableFuture r1 = r4.waitForCaptureResult(r5, r0)
            androidx.camera.core.impl.utils.futures.FutureChain r1 = androidx.camera.core.impl.utils.futures.FutureChain.from(r1)
            androidx.camera.view.m r2 = new androidx.camera.view.m
            r2.<init>(r4)
            java.util.concurrent.Executor r3 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            androidx.camera.core.impl.utils.futures.FutureChain r1 = r1.transformAsync(r2, r3)
            androidx.camera.view.n r2 = new androidx.camera.view.n
            r2.<init>(r4)
            java.util.concurrent.Executor r3 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            androidx.camera.core.impl.utils.futures.FutureChain r1 = r1.transform(r2, r3)
            r4.mFlowFuture = r1
            androidx.camera.view.PreviewStreamStateObserver$1 r2 = new androidx.camera.view.PreviewStreamStateObserver$1
            r2.<init>(r4, r0, r5)
            java.util.concurrent.Executor r5 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r1, r2, r5)
            return
    }

    private com.google.common.util.concurrent.ListenableFuture<java.lang.Void> waitForCaptureResult(androidx.camera.core.CameraInfo r2, java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r3) {
            r1 = this;
            androidx.camera.view.l r0 = new androidx.camera.view.l
            r0.<init>(r1, r2, r3)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            return r2
    }

    void clear() {
            r0 = this;
            r0.cancelFlow()
            return
    }

    @Override // androidx.camera.core.impl.Observable.Observer
    @androidx.annotation.MainThread
    public void onError(@androidx.annotation.NonNull java.lang.Throwable r1) {
            r0 = this;
            r0.clear()
            androidx.camera.view.PreviewView$StreamState r1 = androidx.camera.view.PreviewView.StreamState.IDLE
            r0.updatePreviewStreamState(r1)
            return
    }

    @androidx.annotation.MainThread
    /* renamed from: onNewData, reason: avoid collision after fix types in other method */
    public void onNewData2(@androidx.annotation.Nullable androidx.camera.core.impl.CameraInternal.State r2) {
            r1 = this;
            androidx.camera.core.impl.CameraInternal$State r0 = androidx.camera.core.impl.CameraInternal.State.CLOSING
            if (r2 == r0) goto L2a
            androidx.camera.core.impl.CameraInternal$State r0 = androidx.camera.core.impl.CameraInternal.State.CLOSED
            if (r2 == r0) goto L2a
            androidx.camera.core.impl.CameraInternal$State r0 = androidx.camera.core.impl.CameraInternal.State.RELEASING
            if (r2 == r0) goto L2a
            androidx.camera.core.impl.CameraInternal$State r0 = androidx.camera.core.impl.CameraInternal.State.RELEASED
            if (r2 != r0) goto L11
            goto L2a
        L11:
            androidx.camera.core.impl.CameraInternal$State r0 = androidx.camera.core.impl.CameraInternal.State.OPENING
            if (r2 == r0) goto L1d
            androidx.camera.core.impl.CameraInternal$State r0 = androidx.camera.core.impl.CameraInternal.State.OPEN
            if (r2 == r0) goto L1d
            androidx.camera.core.impl.CameraInternal$State r0 = androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN
            if (r2 != r0) goto L39
        L1d:
            boolean r2 = r1.mHasStartedPreviewStreamFlow
            if (r2 != 0) goto L39
            androidx.camera.core.impl.CameraInfoInternal r2 = r1.mCameraInfoInternal
            r1.startPreviewStreamStateFlow(r2)
            r2 = 1
            r1.mHasStartedPreviewStreamFlow = r2
            return
        L2a:
            androidx.camera.view.PreviewView$StreamState r2 = androidx.camera.view.PreviewView.StreamState.IDLE
            r1.updatePreviewStreamState(r2)
            boolean r2 = r1.mHasStartedPreviewStreamFlow
            if (r2 == 0) goto L39
            r2 = 0
            r1.mHasStartedPreviewStreamFlow = r2
            r1.cancelFlow()
        L39:
            return
    }

    @Override // androidx.camera.core.impl.Observable.Observer
    @androidx.annotation.MainThread
    public /* bridge */ /* synthetic */ void onNewData(@androidx.annotation.Nullable androidx.camera.core.impl.CameraInternal.State r1) {
            r0 = this;
            androidx.camera.core.impl.CameraInternal$State r1 = (androidx.camera.core.impl.CameraInternal.State) r1
            r0.onNewData2(r1)
            return
    }

    void updatePreviewStreamState(androidx.camera.view.PreviewView.StreamState r4) {
            r3 = this;
            monitor-enter(r3)
            androidx.camera.view.PreviewView$StreamState r0 = r3.mPreviewStreamState     // Catch: java.lang.Throwable -> Lb
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r4 = move-exception
            goto L2c
        Ld:
            r3.mPreviewStreamState = r4     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = "StreamStateObserver"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Update Preview stream state to "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            androidx.camera.core.Logger.d(r0, r1)
            androidx.lifecycle.MutableLiveData<androidx.camera.view.PreviewView$StreamState> r0 = r3.mPreviewStreamStateLiveData
            r0.postValue(r4)
            return
        L2c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb
            throw r4
    }
}
