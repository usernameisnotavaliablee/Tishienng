package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CameraDeviceStateCallbacks {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ComboDeviceStateCallback extends android.hardware.camera2.CameraDevice.StateCallback {
        private final java.util.List<android.hardware.camera2.CameraDevice.StateCallback> mCallbacks;

        ComboDeviceStateCallback(@androidx.annotation.NonNull java.util.List<android.hardware.camera2.CameraDevice.StateCallback> r3) {
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
                android.hardware.camera2.CameraDevice$StateCallback r0 = (android.hardware.camera2.CameraDevice.StateCallback) r0
                boolean r1 = r0 instanceof androidx.camera.camera2.internal.CameraDeviceStateCallbacks.NoOpDeviceStateCallback
                if (r1 != 0) goto Le
                java.util.List<android.hardware.camera2.CameraDevice$StateCallback> r1 = r2.mCallbacks
                r1.add(r0)
                goto Le
            L24:
                return
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r3) {
                r2 = this;
                java.util.List<android.hardware.camera2.CameraDevice$StateCallback> r0 = r2.mCallbacks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                android.hardware.camera2.CameraDevice$StateCallback r1 = (android.hardware.camera2.CameraDevice.StateCallback) r1
                r1.onClosed(r3)
                goto L6
            L16:
                return
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r3) {
                r2 = this;
                java.util.List<android.hardware.camera2.CameraDevice$StateCallback> r0 = r2.mCallbacks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                android.hardware.camera2.CameraDevice$StateCallback r1 = (android.hardware.camera2.CameraDevice.StateCallback) r1
                r1.onDisconnected(r3)
                goto L6
            L16:
                return
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r3, int r4) {
                r2 = this;
                java.util.List<android.hardware.camera2.CameraDevice$StateCallback> r0 = r2.mCallbacks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                android.hardware.camera2.CameraDevice$StateCallback r1 = (android.hardware.camera2.CameraDevice.StateCallback) r1
                r1.onError(r3, r4)
                goto L6
            L16:
                return
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r3) {
                r2 = this;
                java.util.List<android.hardware.camera2.CameraDevice$StateCallback> r0 = r2.mCallbacks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                android.hardware.camera2.CameraDevice$StateCallback r1 = (android.hardware.camera2.CameraDevice.StateCallback) r1
                r1.onOpened(r3)
                goto L6
            L16:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class NoOpDeviceStateCallback extends android.hardware.camera2.CameraDevice.StateCallback {
        NoOpDeviceStateCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r1) {
                r0 = this;
                return
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r1) {
                r0 = this;
                return
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r1, int r2) {
                r0 = this;
                return
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r1) {
                r0 = this;
                return
        }
    }

    private CameraDeviceStateCallbacks() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static android.hardware.camera2.CameraDevice.StateCallback createComboCallback(@androidx.annotation.NonNull java.util.List<android.hardware.camera2.CameraDevice.StateCallback> r2) {
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lb
            android.hardware.camera2.CameraDevice$StateCallback r2 = createNoOpCallback()
            return r2
        Lb:
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L1a
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            android.hardware.camera2.CameraDevice$StateCallback r2 = (android.hardware.camera2.CameraDevice.StateCallback) r2
            return r2
        L1a:
            androidx.camera.camera2.internal.CameraDeviceStateCallbacks$ComboDeviceStateCallback r0 = new androidx.camera.camera2.internal.CameraDeviceStateCallbacks$ComboDeviceStateCallback
            r0.<init>(r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.hardware.camera2.CameraDevice.StateCallback createComboCallback(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice.StateCallback... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            android.hardware.camera2.CameraDevice$StateCallback r0 = createComboCallback(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.hardware.camera2.CameraDevice.StateCallback createNoOpCallback() {
            androidx.camera.camera2.internal.CameraDeviceStateCallbacks$NoOpDeviceStateCallback r0 = new androidx.camera.camera2.internal.CameraDeviceStateCallbacks$NoOpDeviceStateCallback
            r0.<init>()
            return r0
    }
}
