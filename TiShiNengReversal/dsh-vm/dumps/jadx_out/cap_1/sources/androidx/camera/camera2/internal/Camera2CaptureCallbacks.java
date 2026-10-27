package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Camera2CaptureCallbacks {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    private static final class ComboSessionCaptureCallback extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        private final java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> mCallbacks;

        ComboSessionCaptureCallback(java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> r3) {
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
                android.hardware.camera2.CameraCaptureSession$CaptureCallback r0 = (android.hardware.camera2.CameraCaptureSession.CaptureCallback) r0
                boolean r1 = r0 instanceof androidx.camera.camera2.internal.Camera2CaptureCallbacks.NoOpSessionCaptureCallback
                if (r1 != 0) goto Le
                java.util.List<android.hardware.camera2.CameraCaptureSession$CaptureCallback> r1 = r2.mCallbacks
                r1.add(r0)
                goto Le
            L24:
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        @androidx.annotation.RequiresApi(api = 24)
        public void onCaptureBufferLost(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r9, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r10, @androidx.annotation.NonNull android.view.Surface r11, long r12) {
                r8 = this;
                java.util.List<android.hardware.camera2.CameraCaptureSession$CaptureCallback> r0 = r8.mCallbacks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1b
                java.lang.Object r1 = r0.next()
                r2 = r1
                android.hardware.camera2.CameraCaptureSession$CaptureCallback r2 = (android.hardware.camera2.CameraCaptureSession.CaptureCallback) r2
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                androidx.camera.camera2.internal.compat.ApiCompat.Api24Impl.onCaptureBufferLost(r2, r3, r4, r5, r6)
                goto L6
            L1b:
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r4, @androidx.annotation.NonNull android.hardware.camera2.TotalCaptureResult r5) {
                r2 = this;
                java.util.List<android.hardware.camera2.CameraCaptureSession$CaptureCallback> r0 = r2.mCallbacks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                android.hardware.camera2.CameraCaptureSession$CaptureCallback r1 = (android.hardware.camera2.CameraCaptureSession.CaptureCallback) r1
                r1.onCaptureCompleted(r3, r4, r5)
                goto L6
            L16:
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r4, @androidx.annotation.NonNull android.hardware.camera2.CaptureFailure r5) {
                r2 = this;
                java.util.List<android.hardware.camera2.CameraCaptureSession$CaptureCallback> r0 = r2.mCallbacks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                android.hardware.camera2.CameraCaptureSession$CaptureCallback r1 = (android.hardware.camera2.CameraCaptureSession.CaptureCallback) r1
                r1.onCaptureFailed(r3, r4, r5)
                goto L6
            L16:
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r4, @androidx.annotation.NonNull android.hardware.camera2.CaptureResult r5) {
                r2 = this;
                java.util.List<android.hardware.camera2.CameraCaptureSession$CaptureCallback> r0 = r2.mCallbacks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                android.hardware.camera2.CameraCaptureSession$CaptureCallback r1 = (android.hardware.camera2.CameraCaptureSession.CaptureCallback) r1
                r1.onCaptureProgressed(r3, r4, r5)
                goto L6
            L16:
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3, int r4) {
                r2 = this;
                java.util.List<android.hardware.camera2.CameraCaptureSession$CaptureCallback> r0 = r2.mCallbacks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                android.hardware.camera2.CameraCaptureSession$CaptureCallback r1 = (android.hardware.camera2.CameraCaptureSession.CaptureCallback) r1
                r1.onCaptureSequenceAborted(r3, r4)
                goto L6
            L16:
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3, int r4, long r5) {
                r2 = this;
                java.util.List<android.hardware.camera2.CameraCaptureSession$CaptureCallback> r0 = r2.mCallbacks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                android.hardware.camera2.CameraCaptureSession$CaptureCallback r1 = (android.hardware.camera2.CameraCaptureSession.CaptureCallback) r1
                r1.onCaptureSequenceCompleted(r3, r4, r5)
                goto L6
            L16:
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r10, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r11, long r12, long r14) {
                r9 = this;
                java.util.List<android.hardware.camera2.CameraCaptureSession$CaptureCallback> r0 = r9.mCallbacks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1b
                java.lang.Object r1 = r0.next()
                r2 = r1
                android.hardware.camera2.CameraCaptureSession$CaptureCallback r2 = (android.hardware.camera2.CameraCaptureSession.CaptureCallback) r2
                r3 = r10
                r4 = r11
                r5 = r12
                r7 = r14
                r2.onCaptureStarted(r3, r4, r5, r7)
                goto L6
            L1b:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class NoOpSessionCaptureCallback extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        NoOpSessionCaptureCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r1, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r2, @androidx.annotation.NonNull android.view.Surface r3, long r4) {
                r0 = this;
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r1, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r2, @androidx.annotation.NonNull android.hardware.camera2.TotalCaptureResult r3) {
                r0 = this;
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r1, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r2, @androidx.annotation.NonNull android.hardware.camera2.CaptureFailure r3) {
                r0 = this;
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r1, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r2, @androidx.annotation.NonNull android.hardware.camera2.CaptureResult r3) {
                r0 = this;
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r1, int r2) {
                r0 = this;
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r1, int r2, long r3) {
                r0 = this;
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r1, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r2, long r3, long r5) {
                r0 = this;
                return
        }
    }

    private Camera2CaptureCallbacks() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.hardware.camera2.CameraCaptureSession.CaptureCallback createComboCallback(java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> r1) {
            androidx.camera.camera2.internal.Camera2CaptureCallbacks$ComboSessionCaptureCallback r0 = new androidx.camera.camera2.internal.Camera2CaptureCallbacks$ComboSessionCaptureCallback
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.hardware.camera2.CameraCaptureSession.CaptureCallback createComboCallback(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.CaptureCallback... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r0 = createComboCallback(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.hardware.camera2.CameraCaptureSession.CaptureCallback createNoOpCallback() {
            androidx.camera.camera2.internal.Camera2CaptureCallbacks$NoOpSessionCaptureCallback r0 = new androidx.camera.camera2.internal.Camera2CaptureCallbacks$NoOpSessionCaptureCallback
            r0.<init>()
            return r0
    }
}
