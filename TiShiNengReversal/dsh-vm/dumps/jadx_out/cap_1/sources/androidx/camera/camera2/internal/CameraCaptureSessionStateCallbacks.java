package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CameraCaptureSessionStateCallbacks {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static final class ComboSessionStateCallback extends android.hardware.camera2.CameraCaptureSession.StateCallback {
        private final java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> mCallbacks;

        ComboSessionStateCallback(@androidx.annotation.NonNull java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> r3) {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.mCallbacks = r0
                java.util.Iterator r3 = r3.iterator()
            Le:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L24
                java.lang.Object r0 = r3.next()
                android.hardware.camera2.CameraCaptureSession$StateCallback r0 = (android.hardware.camera2.CameraCaptureSession.StateCallback) r0
                boolean r1 = r0 instanceof androidx.camera.camera2.internal.CameraCaptureSessionStateCallbacks.NoOpSessionStateCallback
                if (r1 != 0) goto Le
                java.util.List<android.hardware.camera2.CameraCaptureSession$StateCallback> r1 = r2.mCallbacks
                r1.add(r0)
                goto Le
            L24:
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3) {
                r2 = this;
                java.util.List<android.hardware.camera2.CameraCaptureSession$StateCallback> r0 = r2.mCallbacks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                android.hardware.camera2.CameraCaptureSession$StateCallback r1 = (android.hardware.camera2.CameraCaptureSession.StateCallback) r1
                r1.onActive(r3)
                goto L6
            L16:
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        @androidx.annotation.RequiresApi(api = 26)
        public void onCaptureQueueEmpty(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3) {
                r2 = this;
                java.util.List<android.hardware.camera2.CameraCaptureSession$StateCallback> r0 = r2.mCallbacks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                android.hardware.camera2.CameraCaptureSession$StateCallback r1 = (android.hardware.camera2.CameraCaptureSession.StateCallback) r1
                androidx.camera.camera2.internal.compat.ApiCompat.Api26Impl.onCaptureQueueEmpty(r1, r3)
                goto L6
            L16:
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3) {
                r2 = this;
                java.util.List<android.hardware.camera2.CameraCaptureSession$StateCallback> r0 = r2.mCallbacks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                android.hardware.camera2.CameraCaptureSession$StateCallback r1 = (android.hardware.camera2.CameraCaptureSession.StateCallback) r1
                r1.onClosed(r3)
                goto L6
            L16:
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3) {
                r2 = this;
                java.util.List<android.hardware.camera2.CameraCaptureSession$StateCallback> r0 = r2.mCallbacks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                android.hardware.camera2.CameraCaptureSession$StateCallback r1 = (android.hardware.camera2.CameraCaptureSession.StateCallback) r1
                r1.onConfigureFailed(r3)
                goto L6
            L16:
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3) {
                r2 = this;
                java.util.List<android.hardware.camera2.CameraCaptureSession$StateCallback> r0 = r2.mCallbacks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                android.hardware.camera2.CameraCaptureSession$StateCallback r1 = (android.hardware.camera2.CameraCaptureSession.StateCallback) r1
                r1.onConfigured(r3)
                goto L6
            L16:
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3) {
                r2 = this;
                java.util.List<android.hardware.camera2.CameraCaptureSession$StateCallback> r0 = r2.mCallbacks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                android.hardware.camera2.CameraCaptureSession$StateCallback r1 = (android.hardware.camera2.CameraCaptureSession.StateCallback) r1
                r1.onReady(r3)
                goto L6
            L16:
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        @androidx.annotation.RequiresApi(api = 23)
        public void onSurfacePrepared(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3, @androidx.annotation.NonNull android.view.Surface r4) {
                r2 = this;
                java.util.List<android.hardware.camera2.CameraCaptureSession$StateCallback> r0 = r2.mCallbacks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                android.hardware.camera2.CameraCaptureSession$StateCallback r1 = (android.hardware.camera2.CameraCaptureSession.StateCallback) r1
                androidx.camera.camera2.internal.compat.ApiCompat.Api23Impl.onSurfacePrepared(r1, r3, r4)
                goto L6
            L16:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class NoOpSessionStateCallback extends android.hardware.camera2.CameraCaptureSession.StateCallback {
        NoOpSessionStateCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r1) {
                r0 = this;
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r1) {
                r0 = this;
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r1) {
                r0 = this;
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r1) {
                r0 = this;
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r1) {
                r0 = this;
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r1) {
                r0 = this;
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r1, @androidx.annotation.NonNull android.view.Surface r2) {
                r0 = this;
                return
        }
    }

    private CameraCaptureSessionStateCallbacks() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static android.hardware.camera2.CameraCaptureSession.StateCallback createComboCallback(@androidx.annotation.NonNull java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> r2) {
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lb
            android.hardware.camera2.CameraCaptureSession$StateCallback r2 = createNoOpCallback()
            return r2
        Lb:
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L1a
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            android.hardware.camera2.CameraCaptureSession$StateCallback r2 = (android.hardware.camera2.CameraCaptureSession.StateCallback) r2
            return r2
        L1a:
            androidx.camera.camera2.internal.CameraCaptureSessionStateCallbacks$ComboSessionStateCallback r0 = new androidx.camera.camera2.internal.CameraCaptureSessionStateCallbacks$ComboSessionStateCallback
            r0.<init>(r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.hardware.camera2.CameraCaptureSession.StateCallback createComboCallback(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.StateCallback... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            android.hardware.camera2.CameraCaptureSession$StateCallback r0 = createComboCallback(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.hardware.camera2.CameraCaptureSession.StateCallback createNoOpCallback() {
            androidx.camera.camera2.internal.CameraCaptureSessionStateCallbacks$NoOpSessionStateCallback r0 = new androidx.camera.camera2.internal.CameraCaptureSessionStateCallbacks$NoOpSessionStateCallback
            r0.<init>()
            return r0
    }
}
