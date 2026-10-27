package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ViewPort {
    public static final int FILL_CENTER = 1;
    public static final int FILL_END = 2;
    public static final int FILL_START = 0;
    public static final int FIT = 3;

    @androidx.annotation.NonNull
    private android.util.Rational mAspectRatio;
    private int mLayoutDirection;
    private int mRotation;
    private int mScaleType;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {
        private static final int DEFAULT_LAYOUT_DIRECTION = 0;
        private static final int DEFAULT_SCALE_TYPE = 1;
        private final android.util.Rational mAspectRatio;
        private int mLayoutDirection;
        private final int mRotation;
        private int mScaleType;

        public Builder(@androidx.annotation.NonNull android.util.Rational r2, int r3) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.mScaleType = r0
                r0 = 0
                r1.mLayoutDirection = r0
                r1.mAspectRatio = r2
                r1.mRotation = r3
                return
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.ViewPort build() {
                r5 = this;
                android.util.Rational r0 = r5.mAspectRatio
                java.lang.String r1 = "The crop aspect ratio must be set."
                androidx.core.util.Preconditions.checkNotNull(r0, r1)
                androidx.camera.core.ViewPort r0 = new androidx.camera.core.ViewPort
                int r1 = r5.mScaleType
                android.util.Rational r2 = r5.mAspectRatio
                int r3 = r5.mRotation
                int r4 = r5.mLayoutDirection
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.ViewPort.Builder setLayoutDirection(int r1) {
                r0 = this;
                r0.mLayoutDirection = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.ViewPort.Builder setScaleType(int r1) {
                r0 = this;
                r0.mScaleType = r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface LayoutDirection {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ScaleType {
    }

    ViewPort(int r1, @androidx.annotation.NonNull android.util.Rational r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.mScaleType = r1
            r0.mAspectRatio = r2
            r0.mRotation = r3
            r0.mLayoutDirection = r4
            return
    }

    @androidx.annotation.NonNull
    public android.util.Rational getAspectRatio() {
            r1 = this;
            android.util.Rational r0 = r1.mAspectRatio
            return r0
    }

    public int getLayoutDirection() {
            r1 = this;
            int r0 = r1.mLayoutDirection
            return r0
    }

    public int getRotation() {
            r1 = this;
            int r0 = r1.mRotation
            return r0
    }

    public int getScaleType() {
            r1 = this;
            int r0 = r1.mScaleType
            return r0
    }
}
