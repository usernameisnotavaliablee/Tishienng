package androidx.camera.camera2.internal.compat.params;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class InputConfigurationCompat {
    private final androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl mImpl;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    private static class InputConfigurationCompatApi23Impl implements androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl {
        private final android.hardware.camera2.params.InputConfiguration mObject;

        InputConfigurationCompatApi23Impl(int r2, int r3, int r4) {
                r1 = this;
                android.hardware.camera2.params.InputConfiguration r0 = new android.hardware.camera2.params.InputConfiguration
                r0.<init>(r2, r3, r4)
                r1.<init>(r0)
                return
        }

        InputConfigurationCompatApi23Impl(@androidx.annotation.NonNull java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                android.hardware.camera2.params.InputConfiguration r1 = (android.hardware.camera2.params.InputConfiguration) r1
                r0.mObject = r1
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
                if (r0 != 0) goto L6
                r2 = 0
                return r2
            L6:
                android.hardware.camera2.params.InputConfiguration r0 = r1.mObject
                androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatImpl r2 = (androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl) r2
                java.lang.Object r2 = r2.getInputConfiguration()
                boolean r2 = java.util.Objects.equals(r0, r2)
                return r2
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getFormat() {
                r1 = this;
                android.hardware.camera2.params.InputConfiguration r0 = r1.mObject
                int r0 = r0.getFormat()
                return r0
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getHeight() {
                r1 = this;
                android.hardware.camera2.params.InputConfiguration r0 = r1.mObject
                int r0 = r0.getHeight()
                return r0
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        @androidx.annotation.Nullable
        public java.lang.Object getInputConfiguration() {
                r1 = this;
                android.hardware.camera2.params.InputConfiguration r0 = r1.mObject
                return r0
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getWidth() {
                r1 = this;
                android.hardware.camera2.params.InputConfiguration r0 = r1.mObject
                int r0 = r0.getWidth()
                return r0
        }

        public int hashCode() {
                r1 = this;
                android.hardware.camera2.params.InputConfiguration r0 = r1.mObject
                int r0 = r0.hashCode()
                return r0
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public boolean isMultiResolution() {
                r1 = this;
                r0 = 0
                return r0
        }

        @androidx.annotation.NonNull
        public java.lang.String toString() {
                r1 = this;
                android.hardware.camera2.params.InputConfiguration r0 = r1.mObject
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(31)
    private static final class InputConfigurationCompatApi31Impl extends androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatApi23Impl {
        InputConfigurationCompatApi31Impl(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        InputConfigurationCompatApi31Impl(@androidx.annotation.NonNull java.lang.Object r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatApi23Impl, androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public boolean isMultiResolution() {
                r1 = this;
                java.lang.Object r0 = r1.getInputConfiguration()
                android.hardware.camera2.params.InputConfiguration r0 = (android.hardware.camera2.params.InputConfiguration) r0
                boolean r0 = r0.isMultiResolution()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.VisibleForTesting
    static final class InputConfigurationCompatBaseImpl implements androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl {
        private final int mFormat;
        private final int mHeight;
        private final int mWidth;

        InputConfigurationCompatBaseImpl(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.mWidth = r1
                r0.mHeight = r2
                r0.mFormat = r3
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatBaseImpl
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatBaseImpl r4 = (androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatBaseImpl) r4
                int r0 = r4.getWidth()
                int r2 = r3.mWidth
                if (r0 != r2) goto L22
                int r0 = r4.getHeight()
                int r2 = r3.mHeight
                if (r0 != r2) goto L22
                int r4 = r4.getFormat()
                int r0 = r3.mFormat
                if (r4 != r0) goto L22
                r4 = 1
                return r4
            L22:
                return r1
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getFormat() {
                r1 = this;
                int r0 = r1.mFormat
                return r0
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getHeight() {
                r1 = this;
                int r0 = r1.mHeight
                return r0
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public java.lang.Object getInputConfiguration() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getWidth() {
                r1 = this;
                int r0 = r1.mWidth
                return r0
        }

        public int hashCode() {
                r2 = this;
                r0 = 31
                int r1 = r2.mWidth
                r0 = r0 ^ r1
                int r1 = r0 << 5
                int r1 = r1 - r0
                int r0 = r2.mHeight
                r0 = r0 ^ r1
                int r1 = r0 << 5
                int r1 = r1 - r0
                int r0 = r2.mFormat
                r0 = r0 ^ r1
                return r0
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public boolean isMultiResolution() {
                r1 = this;
                r0 = 0
                return r0
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"DefaultLocale"})
        public java.lang.String toString() {
                r5 = this;
                int r0 = r5.mWidth
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                int r1 = r5.mHeight
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                int r2 = r5.mFormat
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 3
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r4 = 0
                r3[r4] = r0
                r0 = 1
                r3[r0] = r1
                r0 = 2
                r3[r0] = r2
                java.lang.String r0 = "InputConfiguration(w:%d, h:%d, format:%d)"
                java.lang.String r0 = java.lang.String.format(r0, r3)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface InputConfigurationCompatImpl {
        int getFormat();

        int getHeight();

        @androidx.annotation.Nullable
        java.lang.Object getInputConfiguration();

        int getWidth();

        boolean isMultiResolution();
    }

    public InputConfigurationCompat(int r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L11
            androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatApi31Impl r0 = new androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatApi31Impl
            r0.<init>(r3, r4, r5)
            r2.mImpl = r0
            return
        L11:
            r1 = 23
            if (r0 < r1) goto L1d
            androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatApi23Impl r0 = new androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatApi23Impl
            r0.<init>(r3, r4, r5)
            r2.mImpl = r0
            return
        L1d:
            androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatBaseImpl r0 = new androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatBaseImpl
            r0.<init>(r3, r4, r5)
            r2.mImpl = r0
            return
    }

    private InputConfigurationCompat(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl r1) {
            r0 = this;
            r0.<init>()
            r0.mImpl = r1
            return
    }

    @androidx.annotation.Nullable
    public static androidx.camera.camera2.internal.compat.params.InputConfigurationCompat wrap(@androidx.annotation.Nullable java.lang.Object r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 >= r2) goto Lb
            return r0
        Lb:
            r0 = 31
            if (r1 < r0) goto L1a
            androidx.camera.camera2.internal.compat.params.InputConfigurationCompat r0 = new androidx.camera.camera2.internal.compat.params.InputConfigurationCompat
            androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatApi31Impl r1 = new androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatApi31Impl
            r1.<init>(r3)
            r0.<init>(r1)
            return r0
        L1a:
            androidx.camera.camera2.internal.compat.params.InputConfigurationCompat r0 = new androidx.camera.camera2.internal.compat.params.InputConfigurationCompat
            androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatApi23Impl r1 = new androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatApi23Impl
            r1.<init>(r3)
            r0.<init>(r1)
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.camera.camera2.internal.compat.params.InputConfigurationCompat
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatImpl r0 = r1.mImpl
            androidx.camera.camera2.internal.compat.params.InputConfigurationCompat r2 = (androidx.camera.camera2.internal.compat.params.InputConfigurationCompat) r2
            androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatImpl r2 = r2.mImpl
            boolean r2 = r0.equals(r2)
            return r2
    }

    public int getFormat() {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatImpl r0 = r1.mImpl
            int r0 = r0.getFormat()
            return r0
    }

    public int getHeight() {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatImpl r0 = r1.mImpl
            int r0 = r0.getHeight()
            return r0
    }

    public int getWidth() {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatImpl r0 = r1.mImpl
            int r0 = r0.getWidth()
            return r0
    }

    public int hashCode() {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatImpl r0 = r1.mImpl
            int r0 = r0.hashCode()
            return r0
    }

    public boolean isMultiResolution() {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatImpl r0 = r1.mImpl
            boolean r0 = r0.isMultiResolution()
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatImpl r0 = r1.mImpl
            java.lang.String r0 = r0.toString()
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.Object unwrap() {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatImpl r0 = r1.mImpl
            java.lang.Object r0 = r0.getInputConfiguration()
            return r0
    }
}
