package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class CameraBurstCaptureCallback extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
    final java.util.Map<android.hardware.camera2.CaptureRequest, java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback>> mCallbackMap;
    androidx.camera.camera2.internal.CameraBurstCaptureCallback.CaptureSequenceCallback mCaptureSequenceCallback;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface CaptureSequenceCallback {
        void onCaptureSequenceCompletedOrAborted(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r1, int r2, boolean r3);
    }

    CameraBurstCaptureCallback() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mCaptureSequenceCallback = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mCallbackMap = r0
            return
    }

    private java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> getCallbacks(android.hardware.camera2.CaptureRequest r2) {
            r1 = this;
            java.util.Map<android.hardware.camera2.CaptureRequest, java.util.List<android.hardware.camera2.CameraCaptureSession$CaptureCallback>> r0 = r1.mCallbackMap
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto Lb
            return r2
        Lb:
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            return r2
    }

    void addCamera2Callbacks(android.hardware.camera2.CaptureRequest r5, java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> r6) {
            r4 = this;
            java.util.Map<android.hardware.camera2.CaptureRequest, java.util.List<android.hardware.camera2.CameraCaptureSession$CaptureCallback>> r0 = r4.mCallbackMap
            java.lang.Object r0 = r0.get(r5)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L24
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r6.size()
            int r3 = r0.size()
            int r2 = r2 + r3
            r1.<init>(r2)
            r1.addAll(r6)
            r1.addAll(r0)
            java.util.Map<android.hardware.camera2.CaptureRequest, java.util.List<android.hardware.camera2.CameraCaptureSession$CaptureCallback>> r6 = r4.mCallbackMap
            r6.put(r5, r1)
            return
        L24:
            java.util.Map<android.hardware.camera2.CaptureRequest, java.util.List<android.hardware.camera2.CameraCaptureSession$CaptureCallback>> r0 = r4.mCallbackMap
            r0.put(r5, r6)
            return
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    @androidx.annotation.RequiresApi(api = 24)
    public void onCaptureBufferLost(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r9, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r10, @androidx.annotation.NonNull android.view.Surface r11, long r12) {
            r8 = this;
            java.util.List r0 = r8.getCallbacks(r10)
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            r2 = r1
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r2 = (android.hardware.camera2.CameraCaptureSession.CaptureCallback) r2
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            androidx.camera.camera2.internal.compat.ApiCompat.Api24Impl.onCaptureBufferLost(r2, r3, r4, r5, r6)
            goto L8
        L1d:
            return
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r4, @androidx.annotation.NonNull android.hardware.camera2.TotalCaptureResult r5) {
            r2 = this;
            java.util.List r0 = r2.getCallbacks(r4)
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r1 = (android.hardware.camera2.CameraCaptureSession.CaptureCallback) r1
            r1.onCaptureCompleted(r3, r4, r5)
            goto L8
        L18:
            return
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r4, @androidx.annotation.NonNull android.hardware.camera2.CaptureFailure r5) {
            r2 = this;
            java.util.List r0 = r2.getCallbacks(r4)
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r1 = (android.hardware.camera2.CameraCaptureSession.CaptureCallback) r1
            r1.onCaptureFailed(r3, r4, r5)
            goto L8
        L18:
            return
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r4, @androidx.annotation.NonNull android.hardware.camera2.CaptureResult r5) {
            r2 = this;
            java.util.List r0 = r2.getCallbacks(r4)
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r1 = (android.hardware.camera2.CameraCaptureSession.CaptureCallback) r1
            r1.onCaptureProgressed(r3, r4, r5)
            goto L8
        L18:
            return
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r4, int r5) {
            r3 = this;
            java.util.Map<android.hardware.camera2.CaptureRequest, java.util.List<android.hardware.camera2.CameraCaptureSession$CaptureCallback>> r0 = r3.mCallbackMap
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La
            java.lang.Object r2 = r1.next()
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r2 = (android.hardware.camera2.CameraCaptureSession.CaptureCallback) r2
            r2.onCaptureSequenceAborted(r4, r5)
            goto L1a
        L2a:
            androidx.camera.camera2.internal.CameraBurstCaptureCallback$CaptureSequenceCallback r0 = r3.mCaptureSequenceCallback
            if (r0 == 0) goto L32
            r1 = 1
            r0.onCaptureSequenceCompletedOrAborted(r4, r5, r1)
        L32:
            return
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r4, int r5, long r6) {
            r3 = this;
            java.util.Map<android.hardware.camera2.CaptureRequest, java.util.List<android.hardware.camera2.CameraCaptureSession$CaptureCallback>> r0 = r3.mCallbackMap
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La
            java.lang.Object r2 = r1.next()
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r2 = (android.hardware.camera2.CameraCaptureSession.CaptureCallback) r2
            r2.onCaptureSequenceCompleted(r4, r5, r6)
            goto L1a
        L2a:
            androidx.camera.camera2.internal.CameraBurstCaptureCallback$CaptureSequenceCallback r6 = r3.mCaptureSequenceCallback
            if (r6 == 0) goto L32
            r7 = 0
            r6.onCaptureSequenceCompletedOrAborted(r4, r5, r7)
        L32:
            return
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r10, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r11, long r12, long r14) {
            r9 = this;
            java.util.List r0 = r9.getCallbacks(r11)
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            r2 = r1
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r2 = (android.hardware.camera2.CameraCaptureSession.CaptureCallback) r2
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r14
            r2.onCaptureStarted(r3, r4, r5, r7)
            goto L8
        L1d:
            return
    }

    public void setCaptureSequenceCallback(@androidx.annotation.NonNull androidx.camera.camera2.internal.CameraBurstCaptureCallback.CaptureSequenceCallback r1) {
            r0 = this;
            r0.mCaptureSequenceCallback = r1
            return
    }
}
