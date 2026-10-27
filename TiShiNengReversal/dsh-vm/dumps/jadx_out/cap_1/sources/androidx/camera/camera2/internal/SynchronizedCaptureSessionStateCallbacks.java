package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class SynchronizedCaptureSessionStateCallbacks extends androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback {
    private final java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback> mCallbacks;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static class Adapter extends androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback {

        @androidx.annotation.NonNull
        private final android.hardware.camera2.CameraCaptureSession.StateCallback mCameraCaptureSessionStateCallback;

        Adapter(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.StateCallback r1) {
                r0 = this;
                r0.<init>()
                r0.mCameraCaptureSessionStateCallback = r1
                return
        }

        Adapter(@androidx.annotation.NonNull java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> r1) {
                r0 = this;
                android.hardware.camera2.CameraCaptureSession$StateCallback r1 = androidx.camera.camera2.internal.CameraCaptureSessionStateCallbacks.createComboCallback(r1)
                r0.<init>(r1)
                return
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onActive(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r2) {
                r1 = this;
                android.hardware.camera2.CameraCaptureSession$StateCallback r0 = r1.mCameraCaptureSessionStateCallback
                androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r2 = r2.toCameraCaptureSessionCompat()
                android.hardware.camera2.CameraCaptureSession r2 = r2.toCameraCaptureSession()
                r0.onActive(r2)
                return
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        @androidx.annotation.RequiresApi(api = 26)
        public void onCaptureQueueEmpty(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r2) {
                r1 = this;
                android.hardware.camera2.CameraCaptureSession$StateCallback r0 = r1.mCameraCaptureSessionStateCallback
                androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r2 = r2.toCameraCaptureSessionCompat()
                android.hardware.camera2.CameraCaptureSession r2 = r2.toCameraCaptureSession()
                androidx.camera.camera2.internal.compat.ApiCompat.Api26Impl.onCaptureQueueEmpty(r0, r2)
                return
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onClosed(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r2) {
                r1 = this;
                android.hardware.camera2.CameraCaptureSession$StateCallback r0 = r1.mCameraCaptureSessionStateCallback
                androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r2 = r2.toCameraCaptureSessionCompat()
                android.hardware.camera2.CameraCaptureSession r2 = r2.toCameraCaptureSession()
                r0.onClosed(r2)
                return
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onConfigureFailed(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r2) {
                r1 = this;
                android.hardware.camera2.CameraCaptureSession$StateCallback r0 = r1.mCameraCaptureSessionStateCallback
                androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r2 = r2.toCameraCaptureSessionCompat()
                android.hardware.camera2.CameraCaptureSession r2 = r2.toCameraCaptureSession()
                r0.onConfigureFailed(r2)
                return
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onConfigured(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r2) {
                r1 = this;
                android.hardware.camera2.CameraCaptureSession$StateCallback r0 = r1.mCameraCaptureSessionStateCallback
                androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r2 = r2.toCameraCaptureSessionCompat()
                android.hardware.camera2.CameraCaptureSession r2 = r2.toCameraCaptureSession()
                r0.onConfigured(r2)
                return
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onReady(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r2) {
                r1 = this;
                android.hardware.camera2.CameraCaptureSession$StateCallback r0 = r1.mCameraCaptureSessionStateCallback
                androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r2 = r2.toCameraCaptureSessionCompat()
                android.hardware.camera2.CameraCaptureSession r2 = r2.toCameraCaptureSession()
                r0.onReady(r2)
                return
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        void onSessionFinished(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r1) {
                r0 = this;
                return
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        @androidx.annotation.RequiresApi(api = 23)
        public void onSurfacePrepared(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r2, @androidx.annotation.NonNull android.view.Surface r3) {
                r1 = this;
                android.hardware.camera2.CameraCaptureSession$StateCallback r0 = r1.mCameraCaptureSessionStateCallback
                androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat r2 = r2.toCameraCaptureSessionCompat()
                android.hardware.camera2.CameraCaptureSession r2 = r2.toCameraCaptureSession()
                androidx.camera.camera2.internal.compat.ApiCompat.Api23Impl.onSurfacePrepared(r0, r2, r3)
                return
        }
    }

    SynchronizedCaptureSessionStateCallbacks(@androidx.annotation.NonNull java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback> r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mCallbacks = r0
            r0.addAll(r2)
            return
    }

    @androidx.annotation.NonNull
    static androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback createComboCallback(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback... r1) {
            androidx.camera.camera2.internal.SynchronizedCaptureSessionStateCallbacks r0 = new androidx.camera.camera2.internal.SynchronizedCaptureSessionStateCallbacks
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onActive(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r3) {
            r2 = this;
            java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback> r0 = r2.mCallbacks
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r1 = (androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback) r1
            r1.onActive(r3)
            goto L6
        L16:
            return
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    @androidx.annotation.RequiresApi(api = 26)
    public void onCaptureQueueEmpty(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r3) {
            r2 = this;
            java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback> r0 = r2.mCallbacks
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r1 = (androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback) r1
            r1.onCaptureQueueEmpty(r3)
            goto L6
        L16:
            return
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onClosed(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r3) {
            r2 = this;
            java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback> r0 = r2.mCallbacks
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r1 = (androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback) r1
            r1.onClosed(r3)
            goto L6
        L16:
            return
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onConfigureFailed(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r3) {
            r2 = this;
            java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback> r0 = r2.mCallbacks
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r1 = (androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback) r1
            r1.onConfigureFailed(r3)
            goto L6
        L16:
            return
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onConfigured(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r3) {
            r2 = this;
            java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback> r0 = r2.mCallbacks
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r1 = (androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback) r1
            r1.onConfigured(r3)
            goto L6
        L16:
            return
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onReady(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r3) {
            r2 = this;
            java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback> r0 = r2.mCallbacks
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r1 = (androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback) r1
            r1.onReady(r3)
            goto L6
        L16:
            return
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    void onSessionFinished(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r3) {
            r2 = this;
            java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback> r0 = r2.mCallbacks
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r1 = (androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback) r1
            r1.onSessionFinished(r3)
            goto L6
        L16:
            return
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    @androidx.annotation.RequiresApi(api = 23)
    public void onSurfacePrepared(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r3, @androidx.annotation.NonNull android.view.Surface r4) {
            r2 = this;
            java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback> r0 = r2.mCallbacks
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r1 = (androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback) r1
            r1.onSurfacePrepared(r3, r4)
            goto L6
        L16:
            return
    }
}
