package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class SurfaceSizeDefinition {
    SurfaceSizeDefinition() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.SurfaceSizeDefinition create(@androidx.annotation.NonNull android.util.Size r8, @androidx.annotation.NonNull java.util.Map<java.lang.Integer, android.util.Size> r9, @androidx.annotation.NonNull android.util.Size r10, @androidx.annotation.NonNull java.util.Map<java.lang.Integer, android.util.Size> r11, @androidx.annotation.NonNull android.util.Size r12, @androidx.annotation.NonNull java.util.Map<java.lang.Integer, android.util.Size> r13, @androidx.annotation.NonNull java.util.Map<java.lang.Integer, android.util.Size> r14) {
            androidx.camera.core.impl.AutoValue_SurfaceSizeDefinition r0 = new androidx.camera.core.impl.AutoValue_SurfaceSizeDefinition
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
    public abstract android.util.Size getAnalysisSize();

    @androidx.annotation.NonNull
    public android.util.Size getMaximumSize(int r2) {
            r1 = this;
            java.util.Map r0 = r1.getMaximumSizeMap()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            android.util.Size r2 = (android.util.Size) r2
            return r2
    }

    @androidx.annotation.NonNull
    public abstract java.util.Map<java.lang.Integer, android.util.Size> getMaximumSizeMap();

    @androidx.annotation.NonNull
    public abstract android.util.Size getPreviewSize();

    @androidx.annotation.NonNull
    public abstract android.util.Size getRecordSize();

    @androidx.annotation.NonNull
    public android.util.Size getS1440pSize(int r2) {
            r1 = this;
            java.util.Map r0 = r1.getS1440pSizeMap()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            android.util.Size r2 = (android.util.Size) r2
            return r2
    }

    @androidx.annotation.NonNull
    public abstract java.util.Map<java.lang.Integer, android.util.Size> getS1440pSizeMap();

    @androidx.annotation.NonNull
    public android.util.Size getS720pSize(int r2) {
            r1 = this;
            java.util.Map r0 = r1.getS720pSizeMap()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            android.util.Size r2 = (android.util.Size) r2
            return r2
    }

    @androidx.annotation.NonNull
    public abstract java.util.Map<java.lang.Integer, android.util.Size> getS720pSizeMap();

    @androidx.annotation.Nullable
    public android.util.Size getUltraMaximumSize(int r2) {
            r1 = this;
            java.util.Map r0 = r1.getUltraMaximumSizeMap()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            android.util.Size r2 = (android.util.Size) r2
            return r2
    }

    @androidx.annotation.NonNull
    public abstract java.util.Map<java.lang.Integer, android.util.Size> getUltraMaximumSizeMap();
}
