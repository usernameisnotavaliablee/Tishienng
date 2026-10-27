package androidx.camera.camera2.internal.compat.params;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SessionConfigurationCompat {
    public static final int SESSION_HIGH_SPEED = 1;
    public static final int SESSION_REGULAR = 0;
    private final androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl mImpl;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(28)
    private static final class SessionConfigurationCompatApi28Impl implements androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl {
        private final android.hardware.camera2.params.SessionConfiguration mObject;
        private final java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> mOutputConfigurations;

        SessionConfigurationCompatApi28Impl(int r2, @androidx.annotation.NonNull java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.StateCallback r5) {
                r1 = this;
                android.hardware.camera2.params.SessionConfiguration r0 = new android.hardware.camera2.params.SessionConfiguration
                java.util.List r3 = androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.transformFromCompat(r3)
                r0.<init>(r2, r3, r4, r5)
                r1.<init>(r0)
                return
        }

        SessionConfigurationCompatApi28Impl(@androidx.annotation.NonNull java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                android.hardware.camera2.params.SessionConfiguration r1 = (android.hardware.camera2.params.SessionConfiguration) r1
                r0.mObject = r1
                java.util.List r1 = r1.getOutputConfigurations()
                java.util.List r1 = androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.transformToCompat(r1)
                java.util.List r1 = java.util.Collections.unmodifiableList(r1)
                r0.mOutputConfigurations = r1
                return
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatApi28Impl
                if (r0 != 0) goto L6
                r2 = 0
                return r2
            L6:
                android.hardware.camera2.params.SessionConfiguration r0 = r1.mObject
                androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatApi28Impl r2 = (androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatApi28Impl) r2
                android.hardware.camera2.params.SessionConfiguration r2 = r2.mObject
                boolean r2 = java.util.Objects.equals(r0, r2)
                return r2
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        @androidx.annotation.NonNull
        public java.util.concurrent.Executor getExecutor() {
                r1 = this;
                android.hardware.camera2.params.SessionConfiguration r0 = r1.mObject
                java.util.concurrent.Executor r0 = r0.getExecutor()
                return r0
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public androidx.camera.camera2.internal.compat.params.InputConfigurationCompat getInputConfiguration() {
                r1 = this;
                android.hardware.camera2.params.SessionConfiguration r0 = r1.mObject
                android.hardware.camera2.params.InputConfiguration r0 = r0.getInputConfiguration()
                androidx.camera.camera2.internal.compat.params.InputConfigurationCompat r0 = androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.wrap(r0)
                return r0
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        @androidx.annotation.NonNull
        public java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> getOutputConfigurations() {
                r1 = this;
                java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> r0 = r1.mOutputConfigurations
                return r0
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        @androidx.annotation.Nullable
        public java.lang.Object getSessionConfiguration() {
                r1 = this;
                android.hardware.camera2.params.SessionConfiguration r0 = r1.mObject
                return r0
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public android.hardware.camera2.CaptureRequest getSessionParameters() {
                r1 = this;
                android.hardware.camera2.params.SessionConfiguration r0 = r1.mObject
                android.hardware.camera2.CaptureRequest r0 = r0.getSessionParameters()
                return r0
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public int getSessionType() {
                r1 = this;
                android.hardware.camera2.params.SessionConfiguration r0 = r1.mObject
                int r0 = r0.getSessionType()
                return r0
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        @androidx.annotation.NonNull
        public android.hardware.camera2.CameraCaptureSession.StateCallback getStateCallback() {
                r1 = this;
                android.hardware.camera2.params.SessionConfiguration r0 = r1.mObject
                android.hardware.camera2.CameraCaptureSession$StateCallback r0 = r0.getStateCallback()
                return r0
        }

        public int hashCode() {
                r1 = this;
                android.hardware.camera2.params.SessionConfiguration r0 = r1.mObject
                int r0 = r0.hashCode()
                return r0
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public void setInputConfiguration(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.params.InputConfigurationCompat r2) {
                r1 = this;
                android.hardware.camera2.params.SessionConfiguration r0 = r1.mObject
                java.lang.Object r2 = r2.unwrap()
                android.hardware.camera2.params.InputConfiguration r2 = (android.hardware.camera2.params.InputConfiguration) r2
                r0.setInputConfiguration(r2)
                return
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public void setSessionParameters(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r2) {
                r1 = this;
                android.hardware.camera2.params.SessionConfiguration r0 = r1.mObject
                r0.setSessionParameters(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    private static final class SessionConfigurationCompatBaseImpl implements androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl {
        private final java.util.concurrent.Executor mExecutor;
        private androidx.camera.camera2.internal.compat.params.InputConfigurationCompat mInputConfig;
        private final java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> mOutputConfigurations;
        private android.hardware.camera2.CaptureRequest mSessionParameters;
        private final int mSessionType;
        private final android.hardware.camera2.CameraCaptureSession.StateCallback mStateCallback;

        SessionConfigurationCompatBaseImpl(int r2, @androidx.annotation.NonNull java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.StateCallback r5) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mInputConfig = r0
                r1.mSessionParameters = r0
                r1.mSessionType = r2
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r3)
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.mOutputConfigurations = r2
                r1.mStateCallback = r5
                r1.mExecutor = r4
                return
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r6) {
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L4
                return r0
            L4:
                boolean r1 = r6 instanceof androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatBaseImpl
                r2 = 0
                if (r1 == 0) goto L4c
                androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatBaseImpl r6 = (androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatBaseImpl) r6
                androidx.camera.camera2.internal.compat.params.InputConfigurationCompat r1 = r5.mInputConfig
                androidx.camera.camera2.internal.compat.params.InputConfigurationCompat r3 = r6.mInputConfig
                boolean r1 = java.util.Objects.equals(r1, r3)
                if (r1 == 0) goto L4c
                int r1 = r5.mSessionType
                int r3 = r6.mSessionType
                if (r1 != r3) goto L4c
                java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> r1 = r5.mOutputConfigurations
                int r1 = r1.size()
                java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> r3 = r6.mOutputConfigurations
                int r3 = r3.size()
                if (r1 == r3) goto L2a
                goto L4c
            L2a:
                r1 = 0
            L2b:
                java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> r3 = r5.mOutputConfigurations
                int r3 = r3.size()
                if (r1 >= r3) goto L4b
                java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> r3 = r5.mOutputConfigurations
                java.lang.Object r3 = r3.get(r1)
                androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat r3 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat) r3
                java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> r4 = r6.mOutputConfigurations
                java.lang.Object r4 = r4.get(r1)
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L48
                return r2
            L48:
                int r1 = r1 + 1
                goto L2b
            L4b:
                return r0
            L4c:
                return r2
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        @androidx.annotation.NonNull
        public java.util.concurrent.Executor getExecutor() {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                return r0
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        @androidx.annotation.Nullable
        public androidx.camera.camera2.internal.compat.params.InputConfigurationCompat getInputConfiguration() {
                r1 = this;
                androidx.camera.camera2.internal.compat.params.InputConfigurationCompat r0 = r1.mInputConfig
                return r0
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        @androidx.annotation.NonNull
        public java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> getOutputConfigurations() {
                r1 = this;
                java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> r0 = r1.mOutputConfigurations
                return r0
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        @androidx.annotation.Nullable
        public java.lang.Object getSessionConfiguration() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public android.hardware.camera2.CaptureRequest getSessionParameters() {
                r1 = this;
                android.hardware.camera2.CaptureRequest r0 = r1.mSessionParameters
                return r0
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public int getSessionType() {
                r1 = this;
                int r0 = r1.mSessionType
                return r0
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        @androidx.annotation.NonNull
        public android.hardware.camera2.CameraCaptureSession.StateCallback getStateCallback() {
                r1 = this;
                android.hardware.camera2.CameraCaptureSession$StateCallback r0 = r1.mStateCallback
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> r0 = r2.mOutputConfigurations
                int r0 = r0.hashCode()
                r1 = 31
                r0 = r0 ^ r1
                int r1 = r0 << 5
                int r1 = r1 - r0
                androidx.camera.camera2.internal.compat.params.InputConfigurationCompat r0 = r2.mInputConfig
                if (r0 != 0) goto L12
                r0 = 0
                goto L16
            L12:
                int r0 = r0.hashCode()
            L16:
                r0 = r0 ^ r1
                int r1 = r0 << 5
                int r1 = r1 - r0
                int r0 = r2.mSessionType
                r0 = r0 ^ r1
                return r0
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public void setInputConfiguration(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.params.InputConfigurationCompat r3) {
                r2 = this;
                int r0 = r2.mSessionType
                r1 = 1
                if (r0 == r1) goto L8
                r2.mInputConfig = r3
                return
            L8:
                java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Method not supported for high speed session types"
                r3.<init>(r0)
                throw r3
        }

        @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl
        public void setSessionParameters(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r1) {
                r0 = this;
                r0.mSessionParameters = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface SessionConfigurationCompatImpl {
        @androidx.annotation.NonNull
        java.util.concurrent.Executor getExecutor();

        @androidx.annotation.Nullable
        androidx.camera.camera2.internal.compat.params.InputConfigurationCompat getInputConfiguration();

        @androidx.annotation.NonNull
        java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> getOutputConfigurations();

        @androidx.annotation.Nullable
        java.lang.Object getSessionConfiguration();

        @androidx.annotation.Nullable
        android.hardware.camera2.CaptureRequest getSessionParameters();

        int getSessionType();

        @androidx.annotation.NonNull
        android.hardware.camera2.CameraCaptureSession.StateCallback getStateCallback();

        void setInputConfiguration(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.params.InputConfigurationCompat r1);

        void setSessionParameters(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface SessionMode {
    }

    public SessionConfigurationCompat(int r3, @androidx.annotation.NonNull java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> r4, @androidx.annotation.NonNull java.util.concurrent.Executor r5, @androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.StateCallback r6) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L11
            androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatBaseImpl r0 = new androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatBaseImpl
            r0.<init>(r3, r4, r5, r6)
            r2.mImpl = r0
            return
        L11:
            androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatApi28Impl r0 = new androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatApi28Impl
            r0.<init>(r3, r4, r5, r6)
            r2.mImpl = r0
            return
    }

    private SessionConfigurationCompat(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.SessionConfigurationCompatImpl r1) {
            r0 = this;
            r0.<init>()
            r0.mImpl = r1
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(24)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static java.util.List<android.hardware.camera2.params.OutputConfiguration> transformFromCompat(@androidx.annotation.NonNull java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        Ld:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r2.next()
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat r1 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat) r1
            java.lang.Object r1 = r1.unwrap()
            android.hardware.camera2.params.OutputConfiguration r1 = androidx.camera.camera2.internal.compat.params.d.a(r1)
            r0.add(r1)
            goto Ld
        L25:
            return r0
    }

    @androidx.annotation.RequiresApi(24)
    static java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> transformToCompat(@androidx.annotation.NonNull java.util.List<android.hardware.camera2.params.OutputConfiguration> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        Ld:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r2.next()
            android.hardware.camera2.params.OutputConfiguration r1 = androidx.camera.camera2.internal.compat.params.d.a(r1)
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat r1 = androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.wrap(r1)
            r0.add(r1)
            goto Ld
        L23:
            return r0
    }

    @androidx.annotation.Nullable
    public static androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat wrap(@androidx.annotation.Nullable java.lang.Object r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 >= r2) goto Lb
            return r0
        Lb:
            androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat r0 = new androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat
            androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatApi28Impl r1 = new androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatApi28Impl
            r1.<init>(r3)
            r0.<init>(r1)
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl r0 = r1.mImpl
            androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat r2 = (androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat) r2
            androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl r2 = r2.mImpl
            boolean r2 = r0.equals(r2)
            return r2
    }

    @androidx.annotation.NonNull
    public java.util.concurrent.Executor getExecutor() {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl r0 = r1.mImpl
            java.util.concurrent.Executor r0 = r0.getExecutor()
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.camera.camera2.internal.compat.params.InputConfigurationCompat getInputConfiguration() {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl r0 = r1.mImpl
            androidx.camera.camera2.internal.compat.params.InputConfigurationCompat r0 = r0.getInputConfiguration()
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> getOutputConfigurations() {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl r0 = r1.mImpl
            java.util.List r0 = r0.getOutputConfigurations()
            return r0
    }

    @androidx.annotation.Nullable
    public android.hardware.camera2.CaptureRequest getSessionParameters() {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl r0 = r1.mImpl
            android.hardware.camera2.CaptureRequest r0 = r0.getSessionParameters()
            return r0
    }

    public int getSessionType() {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl r0 = r1.mImpl
            int r0 = r0.getSessionType()
            return r0
    }

    @androidx.annotation.NonNull
    public android.hardware.camera2.CameraCaptureSession.StateCallback getStateCallback() {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl r0 = r1.mImpl
            android.hardware.camera2.CameraCaptureSession$StateCallback r0 = r0.getStateCallback()
            return r0
    }

    public int hashCode() {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl r0 = r1.mImpl
            int r0 = r0.hashCode()
            return r0
    }

    public void setInputConfiguration(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.params.InputConfigurationCompat r2) {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl r0 = r1.mImpl
            r0.setInputConfiguration(r2)
            return
    }

    public void setSessionParameters(@androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r2) {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl r0 = r1.mImpl
            r0.setSessionParameters(r2)
            return
    }

    @androidx.annotation.Nullable
    public java.lang.Object unwrap() {
            r1 = this;
            androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl r0 = r1.mImpl
            java.lang.Object r0 = r0.getSessionConfiguration()
            return r0
    }
}
