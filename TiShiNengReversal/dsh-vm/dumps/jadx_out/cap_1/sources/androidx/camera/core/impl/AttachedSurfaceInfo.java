package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class AttachedSurfaceInfo {
    AttachedSurfaceInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.AttachedSurfaceInfo create(@androidx.annotation.NonNull androidx.camera.core.impl.SurfaceConfig r8, int r9, @androidx.annotation.NonNull android.util.Size r10, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r11, @androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> r12, @androidx.annotation.Nullable androidx.camera.core.impl.Config r13, @androidx.annotation.Nullable android.util.Range<java.lang.Integer> r14) {
            androidx.camera.core.impl.AutoValue_AttachedSurfaceInfo r0 = new androidx.camera.core.impl.AutoValue_AttachedSurfaceInfo
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @androidx.annotation.NonNull
    public abstract java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> getCaptureTypes();

    @androidx.annotation.NonNull
    public abstract androidx.camera.core.DynamicRange getDynamicRange();

    public abstract int getImageFormat();

    @androidx.annotation.Nullable
    public abstract androidx.camera.core.impl.Config getImplementationOptions();

    @androidx.annotation.NonNull
    public abstract android.util.Size getSize();

    @androidx.annotation.NonNull
    public abstract androidx.camera.core.impl.SurfaceConfig getSurfaceConfig();

    @androidx.annotation.Nullable
    public abstract android.util.Range<java.lang.Integer> getTargetFrameRate();

    @androidx.annotation.NonNull
    public androidx.camera.core.impl.StreamSpec toStreamSpec(@androidx.annotation.NonNull androidx.camera.core.impl.Config r3) {
            r2 = this;
            android.util.Size r0 = r2.getSize()
            androidx.camera.core.impl.StreamSpec$Builder r0 = androidx.camera.core.impl.StreamSpec.builder(r0)
            androidx.camera.core.DynamicRange r1 = r2.getDynamicRange()
            androidx.camera.core.impl.StreamSpec$Builder r0 = r0.setDynamicRange(r1)
            androidx.camera.core.impl.StreamSpec$Builder r3 = r0.setImplementationOptions(r3)
            android.util.Range r0 = r2.getTargetFrameRate()
            if (r0 == 0) goto L21
            android.util.Range r0 = r2.getTargetFrameRate()
            r3.setExpectedFrameRateRange(r0)
        L21:
            androidx.camera.core.impl.StreamSpec r3 = r3.build()
            return r3
    }
}
