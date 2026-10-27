package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CameraCaptureCallbacks {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class ComboCameraCaptureCallback extends androidx.camera.core.impl.CameraCaptureCallback {
        private final java.util.List<androidx.camera.core.impl.CameraCaptureCallback> mCallbacks;

        ComboCameraCaptureCallback(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r3) {
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
                androidx.camera.core.impl.CameraCaptureCallback r0 = (androidx.camera.core.impl.CameraCaptureCallback) r0
                boolean r1 = r0 instanceof androidx.camera.core.impl.CameraCaptureCallbacks.NoOpCameraCaptureCallback
                if (r1 != 0) goto Le
                java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r1 = r2.mCallbacks
                r1.add(r0)
                goto Le
            L24:
                return
        }

        @androidx.annotation.NonNull
        public java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getCallbacks() {
                r1 = this;
                java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r0 = r1.mCallbacks
                return r0
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCancelled() {
                r2 = this;
                java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r0 = r2.mCallbacks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                androidx.camera.core.impl.CameraCaptureCallback r1 = (androidx.camera.core.impl.CameraCaptureCallback) r1
                r1.onCaptureCancelled()
                goto L6
            L16:
                return
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureResult r3) {
                r2 = this;
                java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r0 = r2.mCallbacks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                androidx.camera.core.impl.CameraCaptureCallback r1 = (androidx.camera.core.impl.CameraCaptureCallback) r1
                r1.onCaptureCompleted(r3)
                goto L6
            L16:
                return
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureFailed(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureFailure r3) {
                r2 = this;
                java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r0 = r2.mCallbacks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                androidx.camera.core.impl.CameraCaptureCallback r1 = (androidx.camera.core.impl.CameraCaptureCallback) r1
                r1.onCaptureFailed(r3)
                goto L6
            L16:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class NoOpCameraCaptureCallback extends androidx.camera.core.impl.CameraCaptureCallback {
        NoOpCameraCaptureCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureResult r1) {
                r0 = this;
                return
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureFailed(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureFailure r1) {
                r0 = this;
                return
        }
    }

    private CameraCaptureCallbacks() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    static androidx.camera.core.impl.CameraCaptureCallback createComboCallback(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r2) {
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lb
            androidx.camera.core.impl.CameraCaptureCallback r2 = createNoOpCallback()
            return r2
        Lb:
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L1a
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            androidx.camera.core.impl.CameraCaptureCallback r2 = (androidx.camera.core.impl.CameraCaptureCallback) r2
            return r2
        L1a:
            androidx.camera.core.impl.CameraCaptureCallbacks$ComboCameraCaptureCallback r0 = new androidx.camera.core.impl.CameraCaptureCallbacks$ComboCameraCaptureCallback
            r0.<init>(r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.CameraCaptureCallback createComboCallback(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureCallback... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            androidx.camera.core.impl.CameraCaptureCallback r0 = createComboCallback(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.CameraCaptureCallback createNoOpCallback() {
            androidx.camera.core.impl.CameraCaptureCallbacks$NoOpCameraCaptureCallback r0 = new androidx.camera.core.impl.CameraCaptureCallbacks$NoOpCameraCaptureCallback
            r0.<init>()
            return r0
    }
}
