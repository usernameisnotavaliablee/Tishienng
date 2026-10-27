package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class CaptureCallbackConverter {
    private CaptureCallbackConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.hardware.camera2.CameraCaptureSession.CaptureCallback toCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            toCaptureCallback(r2, r0)
            int r2 = r0.size()
            r1 = 1
            if (r2 != r1) goto L1b
            r2 = 0
            java.lang.Object r2 = r0.get(r2)
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r2 = (android.hardware.camera2.CameraCaptureSession.CaptureCallback) r2
            return r2
        L1b:
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r2 = androidx.camera.camera2.internal.Camera2CaptureCallbacks.createComboCallback(r0)
            return r2
    }

    static void toCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback r1, java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> r2) {
            boolean r0 = r1 instanceof androidx.camera.core.impl.CameraCaptureCallbacks.ComboCameraCaptureCallback
            if (r0 == 0) goto L1f
            androidx.camera.core.impl.CameraCaptureCallbacks$ComboCameraCaptureCallback r1 = (androidx.camera.core.impl.CameraCaptureCallbacks.ComboCameraCaptureCallback) r1
            java.util.List r1 = r1.getCallbacks()
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r1.next()
            androidx.camera.core.impl.CameraCaptureCallback r0 = (androidx.camera.core.impl.CameraCaptureCallback) r0
            toCaptureCallback(r0, r2)
            goto Le
        L1e:
            return
        L1f:
            boolean r0 = r1 instanceof androidx.camera.camera2.internal.CaptureCallbackContainer
            if (r0 == 0) goto L2d
            androidx.camera.camera2.internal.CaptureCallbackContainer r1 = (androidx.camera.camera2.internal.CaptureCallbackContainer) r1
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r1 = r1.getCaptureCallback()
            r2.add(r1)
            return
        L2d:
            androidx.camera.camera2.internal.CaptureCallbackAdapter r0 = new androidx.camera.camera2.internal.CaptureCallbackAdapter
            r0.<init>(r1)
            r2.add(r0)
            return
    }
}
