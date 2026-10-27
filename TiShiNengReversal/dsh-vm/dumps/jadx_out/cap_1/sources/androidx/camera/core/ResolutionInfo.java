package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ResolutionInfo {
    private final androidx.camera.core.ResolutionInfo.ResolutionInfoInternal mResolutionInfoInternal;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    static abstract class ResolutionInfoInternal {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @com.google.auto.value.AutoValue.Builder
        static abstract class Builder {
            Builder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @androidx.annotation.NonNull
            abstract androidx.camera.core.ResolutionInfo.ResolutionInfoInternal build();

            @androidx.annotation.NonNull
            abstract androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder setCropRect(@androidx.annotation.NonNull android.graphics.Rect r1);

            @androidx.annotation.NonNull
            abstract androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder setResolution(@androidx.annotation.NonNull android.util.Size r1);

            @androidx.annotation.NonNull
            abstract androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder setRotationDegrees(int r1);
        }

        ResolutionInfoInternal() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        abstract android.graphics.Rect getCropRect();

        @androidx.annotation.NonNull
        abstract android.util.Size getResolution();

        abstract int getRotationDegrees();
    }

    public ResolutionInfo(@androidx.annotation.NonNull android.util.Size r2, @androidx.annotation.NonNull android.graphics.Rect r3, int r4) {
            r1 = this;
            r1.<init>()
            androidx.camera.core.AutoValue_ResolutionInfo_ResolutionInfoInternal$Builder r0 = new androidx.camera.core.AutoValue_ResolutionInfo_ResolutionInfoInternal$Builder
            r0.<init>()
            androidx.camera.core.ResolutionInfo$ResolutionInfoInternal$Builder r2 = r0.setResolution(r2)
            androidx.camera.core.ResolutionInfo$ResolutionInfoInternal$Builder r2 = r2.setCropRect(r3)
            androidx.camera.core.ResolutionInfo$ResolutionInfoInternal$Builder r2 = r2.setRotationDegrees(r4)
            androidx.camera.core.ResolutionInfo$ResolutionInfoInternal r2 = r2.build()
            r1.mResolutionInfoInternal = r2
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            androidx.camera.core.ResolutionInfo$ResolutionInfoInternal r0 = r1.mResolutionInfoInternal
            boolean r2 = r0.equals(r2)
            return r2
    }

    @androidx.annotation.NonNull
    public android.graphics.Rect getCropRect() {
            r1 = this;
            androidx.camera.core.ResolutionInfo$ResolutionInfoInternal r0 = r1.mResolutionInfoInternal
            android.graphics.Rect r0 = r0.getCropRect()
            return r0
    }

    @androidx.annotation.NonNull
    public android.util.Size getResolution() {
            r1 = this;
            androidx.camera.core.ResolutionInfo$ResolutionInfoInternal r0 = r1.mResolutionInfoInternal
            android.util.Size r0 = r0.getResolution()
            return r0
    }

    public int getRotationDegrees() {
            r1 = this;
            androidx.camera.core.ResolutionInfo$ResolutionInfoInternal r0 = r1.mResolutionInfoInternal
            int r0 = r0.getRotationDegrees()
            return r0
    }

    public int hashCode() {
            r1 = this;
            androidx.camera.core.ResolutionInfo$ResolutionInfoInternal r0 = r1.mResolutionInfoInternal
            int r0 = r0.hashCode()
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r1 = this;
            androidx.camera.core.ResolutionInfo$ResolutionInfoInternal r0 = r1.mResolutionInfoInternal
            java.lang.String r0 = r0.toString()
            return r0
    }
}
