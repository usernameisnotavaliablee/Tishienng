package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface CaptureStage {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class DefaultCaptureStage implements androidx.camera.core.impl.CaptureStage {
        private final androidx.camera.core.impl.CaptureConfig mCaptureConfig;

        public DefaultCaptureStage() {
                r1 = this;
                r1.<init>()
                androidx.camera.core.impl.CaptureConfig$Builder r0 = new androidx.camera.core.impl.CaptureConfig$Builder
                r0.<init>()
                androidx.camera.core.impl.CaptureConfig r0 = r0.build()
                r1.mCaptureConfig = r0
                return
        }

        @Override // androidx.camera.core.impl.CaptureStage
        @androidx.annotation.NonNull
        public androidx.camera.core.impl.CaptureConfig getCaptureConfig() {
                r1 = this;
                androidx.camera.core.impl.CaptureConfig r0 = r1.mCaptureConfig
                return r0
        }

        @Override // androidx.camera.core.impl.CaptureStage
        public int getId() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    @androidx.annotation.NonNull
    androidx.camera.core.impl.CaptureConfig getCaptureConfig();

    int getId();
}
