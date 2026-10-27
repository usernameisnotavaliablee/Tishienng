package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CaptureBundles {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class CaptureBundleImpl implements androidx.camera.core.impl.CaptureBundle {
        final java.util.List<androidx.camera.core.impl.CaptureStage> mCaptureStageList;

        CaptureBundleImpl(java.util.List<androidx.camera.core.impl.CaptureStage> r2) {
                r1 = this;
                r1.<init>()
                if (r2 == 0) goto L17
                boolean r0 = r2.isEmpty()
                if (r0 != 0) goto L17
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r2)
                java.util.List r2 = java.util.Collections.unmodifiableList(r0)
                r1.mCaptureStageList = r2
                return
            L17:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Cannot set an empty CaptureStage list."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.camera.core.impl.CaptureBundle
        public java.util.List<androidx.camera.core.impl.CaptureStage> getCaptureStages() {
                r1 = this;
                java.util.List<androidx.camera.core.impl.CaptureStage> r0 = r1.mCaptureStageList
                return r0
        }
    }

    private CaptureBundles() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    static androidx.camera.core.impl.CaptureBundle createCaptureBundle(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.CaptureStage> r1) {
            androidx.camera.core.CaptureBundles$CaptureBundleImpl r0 = new androidx.camera.core.CaptureBundles$CaptureBundleImpl
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    static androidx.camera.core.impl.CaptureBundle createCaptureBundle(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureStage... r1) {
            androidx.camera.core.CaptureBundles$CaptureBundleImpl r0 = new androidx.camera.core.CaptureBundles$CaptureBundleImpl
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.CaptureBundle singleDefaultCaptureBundle() {
            androidx.camera.core.impl.CaptureStage$DefaultCaptureStage r0 = new androidx.camera.core.impl.CaptureStage$DefaultCaptureStage
            r0.<init>()
            r1 = 1
            androidx.camera.core.impl.CaptureStage[] r1 = new androidx.camera.core.impl.CaptureStage[r1]
            r2 = 0
            r1[r2] = r0
            androidx.camera.core.impl.CaptureBundle r0 = createCaptureBundle(r1)
            return r0
    }
}
