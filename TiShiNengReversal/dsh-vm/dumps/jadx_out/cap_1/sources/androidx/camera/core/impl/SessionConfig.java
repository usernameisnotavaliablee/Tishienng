package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SessionConfig {
    private final java.util.List<android.hardware.camera2.CameraDevice.StateCallback> mDeviceStateCallbacks;
    private final java.util.List<androidx.camera.core.impl.SessionConfig.ErrorListener> mErrorListeners;

    @androidx.annotation.Nullable
    private android.hardware.camera2.params.InputConfiguration mInputConfiguration;
    private final java.util.List<androidx.camera.core.impl.SessionConfig.OutputConfig> mOutputConfigs;
    private final androidx.camera.core.impl.CaptureConfig mRepeatingCaptureConfig;
    private final java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> mSessionStateCallbacks;
    private final java.util.List<androidx.camera.core.impl.CameraCaptureCallback> mSingleCameraCaptureCallbacks;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class BaseBuilder {
        final androidx.camera.core.impl.CaptureConfig.Builder mCaptureConfigBuilder;
        final java.util.List<android.hardware.camera2.CameraDevice.StateCallback> mDeviceStateCallbacks;
        final java.util.List<androidx.camera.core.impl.SessionConfig.ErrorListener> mErrorListeners;

        @androidx.annotation.Nullable
        android.hardware.camera2.params.InputConfiguration mInputConfiguration;
        final java.util.Set<androidx.camera.core.impl.SessionConfig.OutputConfig> mOutputConfigs;
        final java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> mSessionStateCallbacks;
        final java.util.List<androidx.camera.core.impl.CameraCaptureCallback> mSingleCameraCaptureCallbacks;

        BaseBuilder() {
                r1 = this;
                r1.<init>()
                java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                r0.<init>()
                r1.mOutputConfigs = r0
                androidx.camera.core.impl.CaptureConfig$Builder r0 = new androidx.camera.core.impl.CaptureConfig$Builder
                r0.<init>()
                r1.mCaptureConfigBuilder = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mDeviceStateCallbacks = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mSessionStateCallbacks = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mErrorListeners = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mSingleCameraCaptureCallbacks = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder extends androidx.camera.core.impl.SessionConfig.BaseBuilder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public static androidx.camera.core.impl.SessionConfig.Builder createFrom(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig<?> r2, @androidx.annotation.NonNull android.util.Size r3) {
                r0 = 0
                androidx.camera.core.impl.SessionConfig$OptionUnpacker r0 = r2.getSessionOptionUnpacker(r0)
                if (r0 == 0) goto L10
                androidx.camera.core.impl.SessionConfig$Builder r1 = new androidx.camera.core.impl.SessionConfig$Builder
                r1.<init>()
                r0.unpack(r3, r2, r1)
                return r1
            L10:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Implementation is missing option unpacker for "
                r0.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = r2.getTargetName(r1)
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r3.<init>(r2)
                throw r3
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.SessionConfig.Builder addAllCameraCaptureCallbacks(@androidx.annotation.NonNull java.util.Collection<androidx.camera.core.impl.CameraCaptureCallback> r3) {
                r2 = this;
                java.util.Iterator r3 = r3.iterator()
            L4:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L23
                java.lang.Object r0 = r3.next()
                androidx.camera.core.impl.CameraCaptureCallback r0 = (androidx.camera.core.impl.CameraCaptureCallback) r0
                androidx.camera.core.impl.CaptureConfig$Builder r1 = r2.mCaptureConfigBuilder
                r1.addCameraCaptureCallback(r0)
                java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r1 = r2.mSingleCameraCaptureCallbacks
                boolean r1 = r1.contains(r0)
                if (r1 != 0) goto L4
                java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r1 = r2.mSingleCameraCaptureCallbacks
                r1.add(r0)
                goto L4
            L23:
                return r2
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.SessionConfig.Builder addAllDeviceStateCallbacks(@androidx.annotation.NonNull java.util.Collection<android.hardware.camera2.CameraDevice.StateCallback> r2) {
                r1 = this;
                java.util.Iterator r2 = r2.iterator()
            L4:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L14
                java.lang.Object r0 = r2.next()
                android.hardware.camera2.CameraDevice$StateCallback r0 = (android.hardware.camera2.CameraDevice.StateCallback) r0
                r1.addDeviceStateCallback(r0)
                goto L4
            L14:
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.SessionConfig.Builder addAllRepeatingCameraCaptureCallbacks(@androidx.annotation.NonNull java.util.Collection<androidx.camera.core.impl.CameraCaptureCallback> r2) {
                r1 = this;
                androidx.camera.core.impl.CaptureConfig$Builder r0 = r1.mCaptureConfigBuilder
                r0.addAllCameraCaptureCallbacks(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.SessionConfig.Builder addAllSessionStateCallbacks(@androidx.annotation.NonNull java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> r2) {
                r1 = this;
                java.util.Iterator r2 = r2.iterator()
            L4:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L14
                java.lang.Object r0 = r2.next()
                android.hardware.camera2.CameraCaptureSession$StateCallback r0 = (android.hardware.camera2.CameraCaptureSession.StateCallback) r0
                r1.addSessionStateCallback(r0)
                goto L4
            L14:
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.SessionConfig.Builder addCameraCaptureCallback(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureCallback r2) {
                r1 = this;
                androidx.camera.core.impl.CaptureConfig$Builder r0 = r1.mCaptureConfigBuilder
                r0.addCameraCaptureCallback(r2)
                java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r0 = r1.mSingleCameraCaptureCallbacks
                boolean r0 = r0.contains(r2)
                if (r0 != 0) goto L12
                java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r0 = r1.mSingleCameraCaptureCallbacks
                r0.add(r2)
            L12:
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.SessionConfig.Builder addDeviceStateCallback(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice.StateCallback r2) {
                r1 = this;
                java.util.List<android.hardware.camera2.CameraDevice$StateCallback> r0 = r1.mDeviceStateCallbacks
                boolean r0 = r0.contains(r2)
                if (r0 == 0) goto L9
                return r1
            L9:
                java.util.List<android.hardware.camera2.CameraDevice$StateCallback> r0 = r1.mDeviceStateCallbacks
                r0.add(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.SessionConfig.Builder addErrorListener(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.ErrorListener r2) {
                r1 = this;
                java.util.List<androidx.camera.core.impl.SessionConfig$ErrorListener> r0 = r1.mErrorListeners
                r0.add(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.SessionConfig.Builder addImplementationOptions(@androidx.annotation.NonNull androidx.camera.core.impl.Config r2) {
                r1 = this;
                androidx.camera.core.impl.CaptureConfig$Builder r0 = r1.mCaptureConfigBuilder
                r0.addImplementationOptions(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.SessionConfig.Builder addNonRepeatingSurface(@androidx.annotation.NonNull androidx.camera.core.impl.DeferrableSurface r2) {
                r1 = this;
                androidx.camera.core.DynamicRange r0 = androidx.camera.core.DynamicRange.SDR
                androidx.camera.core.impl.SessionConfig$Builder r2 = r1.addNonRepeatingSurface(r2, r0)
                return r2
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.SessionConfig.Builder addNonRepeatingSurface(@androidx.annotation.NonNull androidx.camera.core.impl.DeferrableSurface r1, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r2) {
                r0 = this;
                androidx.camera.core.impl.SessionConfig$OutputConfig$Builder r1 = androidx.camera.core.impl.SessionConfig.OutputConfig.builder(r1)
                androidx.camera.core.impl.SessionConfig$OutputConfig$Builder r1 = r1.setDynamicRange(r2)
                androidx.camera.core.impl.SessionConfig$OutputConfig r1 = r1.build()
                java.util.Set<androidx.camera.core.impl.SessionConfig$OutputConfig> r2 = r0.mOutputConfigs
                r2.add(r1)
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.SessionConfig.Builder addOutputConfig(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.OutputConfig r3) {
                r2 = this;
                java.util.Set<androidx.camera.core.impl.SessionConfig$OutputConfig> r0 = r2.mOutputConfigs
                r0.add(r3)
                androidx.camera.core.impl.CaptureConfig$Builder r0 = r2.mCaptureConfigBuilder
                androidx.camera.core.impl.DeferrableSurface r1 = r3.getSurface()
                r0.addSurface(r1)
                java.util.List r3 = r3.getSharedSurfaces()
                java.util.Iterator r3 = r3.iterator()
            L16:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L28
                java.lang.Object r0 = r3.next()
                androidx.camera.core.impl.DeferrableSurface r0 = (androidx.camera.core.impl.DeferrableSurface) r0
                androidx.camera.core.impl.CaptureConfig$Builder r1 = r2.mCaptureConfigBuilder
                r1.addSurface(r0)
                goto L16
            L28:
                return r2
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.SessionConfig.Builder addRepeatingCameraCaptureCallback(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureCallback r2) {
                r1 = this;
                androidx.camera.core.impl.CaptureConfig$Builder r0 = r1.mCaptureConfigBuilder
                r0.addCameraCaptureCallback(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.SessionConfig.Builder addSessionStateCallback(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession.StateCallback r2) {
                r1 = this;
                java.util.List<android.hardware.camera2.CameraCaptureSession$StateCallback> r0 = r1.mSessionStateCallbacks
                boolean r0 = r0.contains(r2)
                if (r0 == 0) goto L9
                return r1
            L9:
                java.util.List<android.hardware.camera2.CameraCaptureSession$StateCallback> r0 = r1.mSessionStateCallbacks
                r0.add(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.SessionConfig.Builder addSurface(@androidx.annotation.NonNull androidx.camera.core.impl.DeferrableSurface r2) {
                r1 = this;
                androidx.camera.core.DynamicRange r0 = androidx.camera.core.DynamicRange.SDR
                androidx.camera.core.impl.SessionConfig$Builder r2 = r1.addSurface(r2, r0)
                return r2
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.SessionConfig.Builder addSurface(@androidx.annotation.NonNull androidx.camera.core.impl.DeferrableSurface r2, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r3) {
                r1 = this;
                androidx.camera.core.impl.SessionConfig$OutputConfig$Builder r0 = androidx.camera.core.impl.SessionConfig.OutputConfig.builder(r2)
                androidx.camera.core.impl.SessionConfig$OutputConfig$Builder r3 = r0.setDynamicRange(r3)
                androidx.camera.core.impl.SessionConfig$OutputConfig r3 = r3.build()
                java.util.Set<androidx.camera.core.impl.SessionConfig$OutputConfig> r0 = r1.mOutputConfigs
                r0.add(r3)
                androidx.camera.core.impl.CaptureConfig$Builder r3 = r1.mCaptureConfigBuilder
                r3.addSurface(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.SessionConfig.Builder addTag(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Object r3) {
                r1 = this;
                androidx.camera.core.impl.CaptureConfig$Builder r0 = r1.mCaptureConfigBuilder
                r0.addTag(r2, r3)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.SessionConfig build() {
                r8 = this;
                androidx.camera.core.impl.SessionConfig r0 = new androidx.camera.core.impl.SessionConfig
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.Set<androidx.camera.core.impl.SessionConfig$OutputConfig> r2 = r8.mOutputConfigs
                r1.<init>(r2)
                java.util.ArrayList r2 = new java.util.ArrayList
                java.util.List<android.hardware.camera2.CameraDevice$StateCallback> r3 = r8.mDeviceStateCallbacks
                r2.<init>(r3)
                java.util.ArrayList r3 = new java.util.ArrayList
                java.util.List<android.hardware.camera2.CameraCaptureSession$StateCallback> r4 = r8.mSessionStateCallbacks
                r3.<init>(r4)
                java.util.ArrayList r4 = new java.util.ArrayList
                java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r5 = r8.mSingleCameraCaptureCallbacks
                r4.<init>(r5)
                java.util.ArrayList r5 = new java.util.ArrayList
                java.util.List<androidx.camera.core.impl.SessionConfig$ErrorListener> r6 = r8.mErrorListeners
                r5.<init>(r6)
                androidx.camera.core.impl.CaptureConfig$Builder r6 = r8.mCaptureConfigBuilder
                androidx.camera.core.impl.CaptureConfig r6 = r6.build()
                android.hardware.camera2.params.InputConfiguration r7 = r8.mInputConfiguration
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.SessionConfig.Builder clearSurfaces() {
                r1 = this;
                java.util.Set<androidx.camera.core.impl.SessionConfig$OutputConfig> r0 = r1.mOutputConfigs
                r0.clear()
                androidx.camera.core.impl.CaptureConfig$Builder r0 = r1.mCaptureConfigBuilder
                r0.clearSurfaces()
                return r1
        }

        @androidx.annotation.NonNull
        public java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getSingleCameraCaptureCallbacks() {
                r1 = this;
                java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r0 = r1.mSingleCameraCaptureCallbacks
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                return r0
        }

        public boolean removeCameraCaptureCallback(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureCallback r3) {
                r2 = this;
                androidx.camera.core.impl.CaptureConfig$Builder r0 = r2.mCaptureConfigBuilder
                boolean r0 = r0.removeCameraCaptureCallback(r3)
                java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r1 = r2.mSingleCameraCaptureCallbacks
                boolean r3 = r1.remove(r3)
                if (r0 != 0) goto L13
                if (r3 == 0) goto L11
                goto L13
            L11:
                r3 = 0
                return r3
            L13:
                r3 = 1
                return r3
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.SessionConfig.Builder removeSurface(@androidx.annotation.NonNull androidx.camera.core.impl.DeferrableSurface r4) {
                r3 = this;
                java.util.Set<androidx.camera.core.impl.SessionConfig$OutputConfig> r0 = r3.mOutputConfigs
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1d
                java.lang.Object r1 = r0.next()
                androidx.camera.core.impl.SessionConfig$OutputConfig r1 = (androidx.camera.core.impl.SessionConfig.OutputConfig) r1
                androidx.camera.core.impl.DeferrableSurface r2 = r1.getSurface()
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L6
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 == 0) goto L25
                java.util.Set<androidx.camera.core.impl.SessionConfig$OutputConfig> r0 = r3.mOutputConfigs
                r0.remove(r1)
            L25:
                androidx.camera.core.impl.CaptureConfig$Builder r0 = r3.mCaptureConfigBuilder
                r0.removeSurface(r4)
                return r3
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.SessionConfig.Builder setExpectedFrameRateRange(@androidx.annotation.NonNull android.util.Range<java.lang.Integer> r2) {
                r1 = this;
                androidx.camera.core.impl.CaptureConfig$Builder r0 = r1.mCaptureConfigBuilder
                r0.setExpectedFrameRateRange(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.SessionConfig.Builder setImplementationOptions(@androidx.annotation.NonNull androidx.camera.core.impl.Config r2) {
                r1 = this;
                androidx.camera.core.impl.CaptureConfig$Builder r0 = r1.mCaptureConfigBuilder
                r0.setImplementationOptions(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.SessionConfig.Builder setInputConfiguration(@androidx.annotation.Nullable android.hardware.camera2.params.InputConfiguration r1) {
                r0 = this;
                r0.mInputConfiguration = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.SessionConfig.Builder setTemplateType(int r2) {
                r1 = this;
                androidx.camera.core.impl.CaptureConfig$Builder r0 = r1.mCaptureConfigBuilder
                r0.setTemplateType(r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ErrorListener {
        void onError(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r1, @androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.SessionError r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OptionUnpacker {
        void unpack(@androidx.annotation.NonNull android.util.Size r1, @androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig<?> r2, @androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.Builder r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    public static abstract class OutputConfig {
        public static final int SURFACE_GROUP_ID_NONE = -1;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @com.google.auto.value.AutoValue.Builder
        public static abstract class Builder {
            public Builder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @androidx.annotation.NonNull
            public abstract androidx.camera.core.impl.SessionConfig.OutputConfig build();

            @androidx.annotation.NonNull
            public abstract androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setDynamicRange(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r1);

            @androidx.annotation.NonNull
            public abstract androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setPhysicalCameraId(@androidx.annotation.Nullable java.lang.String r1);

            @androidx.annotation.NonNull
            public abstract androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setSharedSurfaces(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.DeferrableSurface> r1);

            @androidx.annotation.NonNull
            public abstract androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setSurface(@androidx.annotation.NonNull androidx.camera.core.impl.DeferrableSurface r1);

            @androidx.annotation.NonNull
            public abstract androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setSurfaceGroupId(int r1);
        }

        public OutputConfig() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public static androidx.camera.core.impl.SessionConfig.OutputConfig.Builder builder(@androidx.annotation.NonNull androidx.camera.core.impl.DeferrableSurface r1) {
                androidx.camera.core.impl.AutoValue_SessionConfig_OutputConfig$Builder r0 = new androidx.camera.core.impl.AutoValue_SessionConfig_OutputConfig$Builder
                r0.<init>()
                androidx.camera.core.impl.SessionConfig$OutputConfig$Builder r1 = r0.setSurface(r1)
                java.util.List r0 = java.util.Collections.EMPTY_LIST
                androidx.camera.core.impl.SessionConfig$OutputConfig$Builder r1 = r1.setSharedSurfaces(r0)
                r0 = 0
                androidx.camera.core.impl.SessionConfig$OutputConfig$Builder r1 = r1.setPhysicalCameraId(r0)
                r0 = -1
                androidx.camera.core.impl.SessionConfig$OutputConfig$Builder r1 = r1.setSurfaceGroupId(r0)
                androidx.camera.core.DynamicRange r0 = androidx.camera.core.DynamicRange.SDR
                androidx.camera.core.impl.SessionConfig$OutputConfig$Builder r1 = r1.setDynamicRange(r0)
                return r1
        }

        @androidx.annotation.NonNull
        public abstract androidx.camera.core.DynamicRange getDynamicRange();

        @androidx.annotation.Nullable
        public abstract java.lang.String getPhysicalCameraId();

        @androidx.annotation.NonNull
        public abstract java.util.List<androidx.camera.core.impl.DeferrableSurface> getSharedSurfaces();

        @androidx.annotation.NonNull
        public abstract androidx.camera.core.impl.DeferrableSurface getSurface();

        public abstract int getSurfaceGroupId();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum SessionError extends java.lang.Enum<androidx.camera.core.impl.SessionConfig.SessionError> {
        private static final /* synthetic */ androidx.camera.core.impl.SessionConfig.SessionError[] $VALUES = null;
        public static final androidx.camera.core.impl.SessionConfig.SessionError SESSION_ERROR_SURFACE_NEEDS_RESET = null;
        public static final androidx.camera.core.impl.SessionConfig.SessionError SESSION_ERROR_UNKNOWN = null;

        private static /* synthetic */ androidx.camera.core.impl.SessionConfig.SessionError[] $values() {
                r0 = 2
                androidx.camera.core.impl.SessionConfig$SessionError[] r0 = new androidx.camera.core.impl.SessionConfig.SessionError[r0]
                androidx.camera.core.impl.SessionConfig$SessionError r1 = androidx.camera.core.impl.SessionConfig.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET
                r2 = 0
                r0[r2] = r1
                androidx.camera.core.impl.SessionConfig$SessionError r1 = androidx.camera.core.impl.SessionConfig.SessionError.SESSION_ERROR_UNKNOWN
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.core.impl.SessionConfig$SessionError r0 = new androidx.camera.core.impl.SessionConfig$SessionError
                java.lang.String r1 = "SESSION_ERROR_SURFACE_NEEDS_RESET"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.core.impl.SessionConfig.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET = r0
                androidx.camera.core.impl.SessionConfig$SessionError r0 = new androidx.camera.core.impl.SessionConfig$SessionError
                java.lang.String r1 = "SESSION_ERROR_UNKNOWN"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.core.impl.SessionConfig.SessionError.SESSION_ERROR_UNKNOWN = r0
                androidx.camera.core.impl.SessionConfig$SessionError[] r0 = $values()
                androidx.camera.core.impl.SessionConfig.SessionError.$VALUES = r0
                return
        }

        SessionError(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.core.impl.SessionConfig.SessionError valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.core.impl.SessionConfig$SessionError> r0 = androidx.camera.core.impl.SessionConfig.SessionError.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.core.impl.SessionConfig$SessionError r1 = (androidx.camera.core.impl.SessionConfig.SessionError) r1
                return r1
        }

        public static androidx.camera.core.impl.SessionConfig.SessionError[] values() {
                androidx.camera.core.impl.SessionConfig$SessionError[] r0 = androidx.camera.core.impl.SessionConfig.SessionError.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.core.impl.SessionConfig$SessionError[] r0 = (androidx.camera.core.impl.SessionConfig.SessionError[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class ValidatingBuilder extends androidx.camera.core.impl.SessionConfig.BaseBuilder {
        private static final java.util.List<java.lang.Integer> SUPPORTED_TEMPLATE_PRIORITY = null;
        private static final java.lang.String TAG = "ValidatingBuilder";
        private final androidx.camera.core.internal.compat.workaround.SurfaceSorter mSurfaceSorter;
        private boolean mTemplateSet;
        private boolean mValid;

        static {
                r0 = 1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                r2 = 5
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 3
                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                java.lang.Integer[] r3 = new java.lang.Integer[r3]
                r5 = 0
                r3[r5] = r1
                r3[r0] = r2
                r0 = 2
                r3[r0] = r4
                java.util.List r0 = java.util.Arrays.asList(r3)
                androidx.camera.core.impl.SessionConfig.ValidatingBuilder.SUPPORTED_TEMPLATE_PRIORITY = r0
                return
        }

        public ValidatingBuilder() {
                r1 = this;
                r1.<init>()
                androidx.camera.core.internal.compat.workaround.SurfaceSorter r0 = new androidx.camera.core.internal.compat.workaround.SurfaceSorter
                r0.<init>()
                r1.mSurfaceSorter = r0
                r0 = 1
                r1.mValid = r0
                r0 = 0
                r1.mTemplateSet = r0
                return
        }

        private java.util.List<androidx.camera.core.impl.DeferrableSurface> getSurfaces() {
                r4 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Set<androidx.camera.core.impl.SessionConfig$OutputConfig> r1 = r4.mOutputConfigs
                java.util.Iterator r1 = r1.iterator()
            Lb:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L36
                java.lang.Object r2 = r1.next()
                androidx.camera.core.impl.SessionConfig$OutputConfig r2 = (androidx.camera.core.impl.SessionConfig.OutputConfig) r2
                androidx.camera.core.impl.DeferrableSurface r3 = r2.getSurface()
                r0.add(r3)
                java.util.List r2 = r2.getSharedSurfaces()
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto Lb
                java.lang.Object r3 = r2.next()
                androidx.camera.core.impl.DeferrableSurface r3 = (androidx.camera.core.impl.DeferrableSurface) r3
                r0.add(r3)
                goto L26
            L36:
                return r0
        }

        private int selectTemplateType(int r4, int r5) {
                r3 = this;
                java.util.List<java.lang.Integer> r0 = androidx.camera.core.impl.SessionConfig.ValidatingBuilder.SUPPORTED_TEMPLATE_PRIORITY
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
                int r1 = r0.indexOf(r1)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
                int r0 = r0.indexOf(r2)
                if (r1 < r0) goto L15
                return r4
            L15:
                return r5
        }

        private void setOrVerifyExpectFrameRateRange(@androidx.annotation.NonNull android.util.Range<java.lang.Integer> r3) {
                r2 = this;
                android.util.Range<java.lang.Integer> r0 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED
                boolean r1 = r3.equals(r0)
                if (r1 == 0) goto L9
                goto L31
            L9:
                androidx.camera.core.impl.CaptureConfig$Builder r1 = r2.mCaptureConfigBuilder
                android.util.Range r1 = r1.getExpectedFrameRateRange()
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L1b
                androidx.camera.core.impl.CaptureConfig$Builder r0 = r2.mCaptureConfigBuilder
                r0.setExpectedFrameRateRange(r3)
                return
            L1b:
                androidx.camera.core.impl.CaptureConfig$Builder r0 = r2.mCaptureConfigBuilder
                android.util.Range r0 = r0.getExpectedFrameRateRange()
                boolean r3 = r0.equals(r3)
                if (r3 != 0) goto L31
                r3 = 0
                r2.mValid = r3
                java.lang.String r3 = "ValidatingBuilder"
                java.lang.String r0 = "Different ExpectedFrameRateRange values"
                androidx.camera.core.Logger.d(r3, r0)
            L31:
                return
        }

        public void add(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r5) {
                r4 = this;
                androidx.camera.core.impl.CaptureConfig r0 = r5.getRepeatingCaptureConfig()
                int r1 = r0.getTemplateType()
                r2 = -1
                if (r1 == r2) goto L21
                r1 = 1
                r4.mTemplateSet = r1
                androidx.camera.core.impl.CaptureConfig$Builder r1 = r4.mCaptureConfigBuilder
                int r2 = r0.getTemplateType()
                androidx.camera.core.impl.CaptureConfig$Builder r3 = r4.mCaptureConfigBuilder
                int r3 = r3.getTemplateType()
                int r2 = r4.selectTemplateType(r2, r3)
                r1.setTemplateType(r2)
            L21:
                android.util.Range r1 = r0.getExpectedFrameRateRange()
                r4.setOrVerifyExpectFrameRateRange(r1)
                androidx.camera.core.impl.CaptureConfig r1 = r5.getRepeatingCaptureConfig()
                androidx.camera.core.impl.TagBundle r1 = r1.getTagBundle()
                androidx.camera.core.impl.CaptureConfig$Builder r2 = r4.mCaptureConfigBuilder
                r2.addAllTags(r1)
                java.util.List<android.hardware.camera2.CameraDevice$StateCallback> r1 = r4.mDeviceStateCallbacks
                java.util.List r2 = r5.getDeviceStateCallbacks()
                r1.addAll(r2)
                java.util.List<android.hardware.camera2.CameraCaptureSession$StateCallback> r1 = r4.mSessionStateCallbacks
                java.util.List r2 = r5.getSessionStateCallbacks()
                r1.addAll(r2)
                androidx.camera.core.impl.CaptureConfig$Builder r1 = r4.mCaptureConfigBuilder
                java.util.List r2 = r5.getRepeatingCameraCaptureCallbacks()
                r1.addAllCameraCaptureCallbacks(r2)
                java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r1 = r4.mSingleCameraCaptureCallbacks
                java.util.List r2 = r5.getSingleCameraCaptureCallbacks()
                r1.addAll(r2)
                java.util.List<androidx.camera.core.impl.SessionConfig$ErrorListener> r1 = r4.mErrorListeners
                java.util.List r2 = r5.getErrorListeners()
                r1.addAll(r2)
                android.hardware.camera2.params.InputConfiguration r1 = r5.getInputConfiguration()
                if (r1 == 0) goto L6e
                android.hardware.camera2.params.InputConfiguration r1 = r5.getInputConfiguration()
                r4.mInputConfiguration = r1
            L6e:
                java.util.Set<androidx.camera.core.impl.SessionConfig$OutputConfig> r1 = r4.mOutputConfigs
                java.util.List r5 = r5.getOutputConfigs()
                r1.addAll(r5)
                androidx.camera.core.impl.CaptureConfig$Builder r5 = r4.mCaptureConfigBuilder
                java.util.Set r5 = r5.getSurfaces()
                java.util.List r1 = r0.getSurfaces()
                r5.addAll(r1)
                java.util.List r5 = r4.getSurfaces()
                androidx.camera.core.impl.CaptureConfig$Builder r1 = r4.mCaptureConfigBuilder
                java.util.Set r1 = r1.getSurfaces()
                boolean r5 = r5.containsAll(r1)
                if (r5 != 0) goto L9e
                java.lang.String r5 = "Invalid configuration due to capture request surfaces are not a subset of surfaces"
                java.lang.String r1 = "ValidatingBuilder"
                androidx.camera.core.Logger.d(r1, r5)
                r5 = 0
                r4.mValid = r5
            L9e:
                androidx.camera.core.impl.CaptureConfig$Builder r5 = r4.mCaptureConfigBuilder
                androidx.camera.core.impl.Config r0 = r0.getImplementationOptions()
                r5.addImplementationOptions(r0)
                return
        }

        public <T> void addImplementationOption(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<T> r2, @androidx.annotation.NonNull T r3) {
                r1 = this;
                androidx.camera.core.impl.CaptureConfig$Builder r0 = r1.mCaptureConfigBuilder
                r0.addImplementationOption(r2, r3)
                return
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.SessionConfig build() {
                r9 = this;
                boolean r0 = r9.mValid
                if (r0 == 0) goto L3a
                java.util.ArrayList r2 = new java.util.ArrayList
                java.util.Set<androidx.camera.core.impl.SessionConfig$OutputConfig> r0 = r9.mOutputConfigs
                r2.<init>(r0)
                androidx.camera.core.internal.compat.workaround.SurfaceSorter r0 = r9.mSurfaceSorter
                r0.sort(r2)
                androidx.camera.core.impl.SessionConfig r1 = new androidx.camera.core.impl.SessionConfig
                java.util.ArrayList r3 = new java.util.ArrayList
                java.util.List<android.hardware.camera2.CameraDevice$StateCallback> r0 = r9.mDeviceStateCallbacks
                r3.<init>(r0)
                java.util.ArrayList r4 = new java.util.ArrayList
                java.util.List<android.hardware.camera2.CameraCaptureSession$StateCallback> r0 = r9.mSessionStateCallbacks
                r4.<init>(r0)
                java.util.ArrayList r5 = new java.util.ArrayList
                java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r0 = r9.mSingleCameraCaptureCallbacks
                r5.<init>(r0)
                java.util.ArrayList r6 = new java.util.ArrayList
                java.util.List<androidx.camera.core.impl.SessionConfig$ErrorListener> r0 = r9.mErrorListeners
                r6.<init>(r0)
                androidx.camera.core.impl.CaptureConfig$Builder r0 = r9.mCaptureConfigBuilder
                androidx.camera.core.impl.CaptureConfig r7 = r0.build()
                android.hardware.camera2.params.InputConfiguration r8 = r9.mInputConfiguration
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return r1
            L3a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Unsupported session configuration combination"
                r0.<init>(r1)
                throw r0
        }

        public void clearSurfaces() {
                r1 = this;
                java.util.Set<androidx.camera.core.impl.SessionConfig$OutputConfig> r0 = r1.mOutputConfigs
                r0.clear()
                androidx.camera.core.impl.CaptureConfig$Builder r0 = r1.mCaptureConfigBuilder
                r0.clearSurfaces()
                return
        }

        public boolean isValid() {
                r1 = this;
                boolean r0 = r1.mTemplateSet
                if (r0 == 0) goto La
                boolean r0 = r1.mValid
                if (r0 == 0) goto La
                r0 = 1
                return r0
            La:
                r0 = 0
                return r0
        }
    }

    SessionConfig(java.util.List<androidx.camera.core.impl.SessionConfig.OutputConfig> r1, java.util.List<android.hardware.camera2.CameraDevice.StateCallback> r2, java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> r3, java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r4, java.util.List<androidx.camera.core.impl.SessionConfig.ErrorListener> r5, androidx.camera.core.impl.CaptureConfig r6, @androidx.annotation.Nullable android.hardware.camera2.params.InputConfiguration r7) {
            r0 = this;
            r0.<init>()
            r0.mOutputConfigs = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            r0.mDeviceStateCallbacks = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r3)
            r0.mSessionStateCallbacks = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r4)
            r0.mSingleCameraCaptureCallbacks = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r5)
            r0.mErrorListeners = r1
            r0.mRepeatingCaptureConfig = r6
            r0.mInputConfiguration = r7
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.SessionConfig defaultEmptySessionConfig() {
            androidx.camera.core.impl.SessionConfig r0 = new androidx.camera.core.impl.SessionConfig
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 0
            r2.<init>(r3)
            r4 = 0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            r5 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r5)
            r6 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r6)
            androidx.camera.core.impl.CaptureConfig$Builder r6 = new androidx.camera.core.impl.CaptureConfig$Builder
            r6.<init>()
            androidx.camera.core.impl.CaptureConfig r6 = r6.build()
            r7 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<android.hardware.camera2.CameraDevice.StateCallback> getDeviceStateCallbacks() {
            r1 = this;
            java.util.List<android.hardware.camera2.CameraDevice$StateCallback> r0 = r1.mDeviceStateCallbacks
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.impl.SessionConfig.ErrorListener> getErrorListeners() {
            r1 = this;
            java.util.List<androidx.camera.core.impl.SessionConfig$ErrorListener> r0 = r1.mErrorListeners
            return r0
    }

    @androidx.annotation.NonNull
    public android.util.Range<java.lang.Integer> getExpectedFrameRateRange() {
            r1 = this;
            androidx.camera.core.impl.CaptureConfig r0 = r1.mRepeatingCaptureConfig
            android.util.Range r0 = r0.getExpectedFrameRateRange()
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.camera.core.impl.Config getImplementationOptions() {
            r1 = this;
            androidx.camera.core.impl.CaptureConfig r0 = r1.mRepeatingCaptureConfig
            androidx.camera.core.impl.Config r0 = r0.getImplementationOptions()
            return r0
    }

    @androidx.annotation.Nullable
    public android.hardware.camera2.params.InputConfiguration getInputConfiguration() {
            r1 = this;
            android.hardware.camera2.params.InputConfiguration r0 = r1.mInputConfiguration
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.impl.SessionConfig.OutputConfig> getOutputConfigs() {
            r1 = this;
            java.util.List<androidx.camera.core.impl.SessionConfig$OutputConfig> r0 = r1.mOutputConfigs
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getRepeatingCameraCaptureCallbacks() {
            r1 = this;
            androidx.camera.core.impl.CaptureConfig r0 = r1.mRepeatingCaptureConfig
            java.util.List r0 = r0.getCameraCaptureCallbacks()
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CaptureConfig getRepeatingCaptureConfig() {
            r1 = this;
            androidx.camera.core.impl.CaptureConfig r0 = r1.mRepeatingCaptureConfig
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> getSessionStateCallbacks() {
            r1 = this;
            java.util.List<android.hardware.camera2.CameraCaptureSession$StateCallback> r0 = r1.mSessionStateCallbacks
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getSingleCameraCaptureCallbacks() {
            r1 = this;
            java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r0 = r1.mSingleCameraCaptureCallbacks
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.impl.DeferrableSurface> getSurfaces() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<androidx.camera.core.impl.SessionConfig$OutputConfig> r1 = r4.mOutputConfigs
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r1.next()
            androidx.camera.core.impl.SessionConfig$OutputConfig r2 = (androidx.camera.core.impl.SessionConfig.OutputConfig) r2
            androidx.camera.core.impl.DeferrableSurface r3 = r2.getSurface()
            r0.add(r3)
            java.util.List r2 = r2.getSharedSurfaces()
            java.util.Iterator r2 = r2.iterator()
        L26:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb
            java.lang.Object r3 = r2.next()
            androidx.camera.core.impl.DeferrableSurface r3 = (androidx.camera.core.impl.DeferrableSurface) r3
            r0.add(r3)
            goto L26
        L36:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public int getTemplateType() {
            r1 = this;
            androidx.camera.core.impl.CaptureConfig r0 = r1.mRepeatingCaptureConfig
            int r0 = r0.getTemplateType()
            return r0
    }
}
