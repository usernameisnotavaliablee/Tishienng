package androidx.camera.camera2.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CameraEventCallbacks extends androidx.camera.core.impl.MultiValueSet<androidx.camera.camera2.impl.CameraEventCallback> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class ComboCameraEventCallback {
        private final java.util.List<androidx.camera.camera2.impl.CameraEventCallback> mCallbacks;

        ComboCameraEventCallback(java.util.List<androidx.camera.camera2.impl.CameraEventCallback> r3) {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.mCallbacks = r0
                java.util.Iterator r3 = r3.iterator()
            Le:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L20
                java.lang.Object r0 = r3.next()
                androidx.camera.camera2.impl.CameraEventCallback r0 = (androidx.camera.camera2.impl.CameraEventCallback) r0
                java.util.List<androidx.camera.camera2.impl.CameraEventCallback> r1 = r2.mCallbacks
                r1.add(r0)
                goto Le
            L20:
                return
        }

        @androidx.annotation.NonNull
        public java.util.List<androidx.camera.camera2.impl.CameraEventCallback> getCallbacks() {
                r1 = this;
                java.util.List<androidx.camera.camera2.impl.CameraEventCallback> r0 = r1.mCallbacks
                return r0
        }

        public void onDeInitSession() {
                r2 = this;
                java.util.List<androidx.camera.camera2.impl.CameraEventCallback> r0 = r2.mCallbacks
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                androidx.camera.camera2.impl.CameraEventCallback r1 = (androidx.camera.camera2.impl.CameraEventCallback) r1
                r1.onDeInitSession()
                goto L6
            L16:
                return
        }

        @androidx.annotation.NonNull
        public java.util.List<androidx.camera.core.impl.CaptureConfig> onDisableSession() {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List<androidx.camera.camera2.impl.CameraEventCallback> r1 = r3.mCallbacks
                java.util.Iterator r1 = r1.iterator()
            Lb:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L21
                java.lang.Object r2 = r1.next()
                androidx.camera.camera2.impl.CameraEventCallback r2 = (androidx.camera.camera2.impl.CameraEventCallback) r2
                androidx.camera.core.impl.CaptureConfig r2 = r2.onDisableSession()
                if (r2 == 0) goto Lb
                r0.add(r2)
                goto Lb
            L21:
                return r0
        }

        @androidx.annotation.NonNull
        public java.util.List<androidx.camera.core.impl.CaptureConfig> onEnableSession() {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List<androidx.camera.camera2.impl.CameraEventCallback> r1 = r3.mCallbacks
                java.util.Iterator r1 = r1.iterator()
            Lb:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L21
                java.lang.Object r2 = r1.next()
                androidx.camera.camera2.impl.CameraEventCallback r2 = (androidx.camera.camera2.impl.CameraEventCallback) r2
                androidx.camera.core.impl.CaptureConfig r2 = r2.onEnableSession()
                if (r2 == 0) goto Lb
                r0.add(r2)
                goto Lb
            L21:
                return r0
        }

        @androidx.annotation.NonNull
        public java.util.List<androidx.camera.core.impl.CaptureConfig> onInitSession() {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List<androidx.camera.camera2.impl.CameraEventCallback> r1 = r3.mCallbacks
                java.util.Iterator r1 = r1.iterator()
            Lb:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L21
                java.lang.Object r2 = r1.next()
                androidx.camera.camera2.impl.CameraEventCallback r2 = (androidx.camera.camera2.impl.CameraEventCallback) r2
                androidx.camera.core.impl.CaptureConfig r2 = r2.onInitSession()
                if (r2 == 0) goto Lb
                r0.add(r2)
                goto Lb
            L21:
                return r0
        }

        @androidx.annotation.NonNull
        public java.util.List<androidx.camera.core.impl.CaptureConfig> onRepeating() {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List<androidx.camera.camera2.impl.CameraEventCallback> r1 = r3.mCallbacks
                java.util.Iterator r1 = r1.iterator()
            Lb:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L21
                java.lang.Object r2 = r1.next()
                androidx.camera.camera2.impl.CameraEventCallback r2 = (androidx.camera.camera2.impl.CameraEventCallback) r2
                androidx.camera.core.impl.CaptureConfig r2 = r2.onRepeating()
                if (r2 == 0) goto Lb
                r0.add(r2)
                goto Lb
            L21:
                return r0
        }
    }

    public CameraEventCallbacks(@androidx.annotation.NonNull androidx.camera.camera2.impl.CameraEventCallback... r1) {
            r0 = this;
            r0.<init>()
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.addAll(r1)
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.camera2.impl.CameraEventCallbacks createEmptyCallback() {
            androidx.camera.camera2.impl.CameraEventCallbacks r0 = new androidx.camera.camera2.impl.CameraEventCallbacks
            r1 = 0
            androidx.camera.camera2.impl.CameraEventCallback[] r1 = new androidx.camera.camera2.impl.CameraEventCallback[r1]
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.MultiValueSet
    @androidx.annotation.NonNull
    public androidx.camera.core.impl.MultiValueSet<androidx.camera.camera2.impl.CameraEventCallback> clone() {
            r2 = this;
            androidx.camera.camera2.impl.CameraEventCallbacks r0 = createEmptyCallback()
            java.util.List r1 = r2.getAllItems()
            r0.addAll(r1)
            return r0
    }

    @Override // androidx.camera.core.impl.MultiValueSet
    @androidx.annotation.NonNull
    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object mo13clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            androidx.camera.core.impl.MultiValueSet r0 = r1.clone()
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.camera.camera2.impl.CameraEventCallbacks.ComboCameraEventCallback createComboCallback() {
            r2 = this;
            androidx.camera.camera2.impl.CameraEventCallbacks$ComboCameraEventCallback r0 = new androidx.camera.camera2.impl.CameraEventCallbacks$ComboCameraEventCallback
            java.util.List r1 = r2.getAllItems()
            r0.<init>(r1)
            return r0
    }
}
