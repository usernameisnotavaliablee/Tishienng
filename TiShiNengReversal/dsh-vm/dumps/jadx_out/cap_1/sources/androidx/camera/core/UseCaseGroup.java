package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class UseCaseGroup {

    @androidx.annotation.NonNull
    private final java.util.List<androidx.camera.core.CameraEffect> mEffects;

    @androidx.annotation.NonNull
    private final java.util.List<androidx.camera.core.UseCase> mUseCases;

    @androidx.annotation.Nullable
    private final androidx.camera.core.ViewPort mViewPort;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {
        private static final java.util.List<java.lang.Integer> SUPPORTED_TARGETS = null;
        private final java.util.List<androidx.camera.core.CameraEffect> mEffects;
        private final java.util.List<androidx.camera.core.UseCase> mUseCases;
        private androidx.camera.core.ViewPort mViewPort;

        static {
                r0 = 1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                r2 = 2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                r4 = 4
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                r6 = 3
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                r8 = 7
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r9 = 5
                java.lang.Integer[] r9 = new java.lang.Integer[r9]
                r10 = 0
                r9[r10] = r1
                r9[r0] = r3
                r9[r2] = r5
                r9[r6] = r7
                r9[r4] = r8
                java.util.List r0 = java.util.Arrays.asList(r9)
                androidx.camera.core.UseCaseGroup.Builder.SUPPORTED_TARGETS = r0
                return
        }

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mUseCases = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mEffects = r0
                return
        }

        private void checkEffectTargets() {
                r5 = this;
                java.util.List<androidx.camera.core.CameraEffect> r0 = r5.mEffects
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
                r2 = 0
            L8:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L3a
                java.lang.Object r3 = r0.next()
                androidx.camera.core.CameraEffect r3 = (androidx.camera.core.CameraEffect) r3
                int r3 = r3.getTargets()
                java.util.List<java.lang.Integer> r4 = androidx.camera.core.UseCaseGroup.Builder.SUPPORTED_TARGETS
                androidx.camera.core.processing.TargetUtils.checkSupportedTargets(r4, r3)
                r4 = r2 & r3
                if (r4 > 0) goto L23
                r2 = r2 | r3
                goto L8
            L23:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.util.Locale r2 = java.util.Locale.US
                java.lang.String r3 = androidx.camera.core.processing.TargetUtils.getHumanReadableName(r4)
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r4[r1] = r3
                java.lang.String r1 = "More than one effects has targets %s."
                java.lang.String r1 = java.lang.String.format(r2, r1, r4)
                r0.<init>(r1)
                throw r0
            L3a:
                return
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.UseCaseGroup.Builder addEffect(@androidx.annotation.NonNull androidx.camera.core.CameraEffect r2) {
                r1 = this;
                java.util.List<androidx.camera.core.CameraEffect> r0 = r1.mEffects
                r0.add(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.UseCaseGroup.Builder addUseCase(@androidx.annotation.NonNull androidx.camera.core.UseCase r2) {
                r1 = this;
                java.util.List<androidx.camera.core.UseCase> r0 = r1.mUseCases
                r0.add(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.UseCaseGroup build() {
                r4 = this;
                java.util.List<androidx.camera.core.UseCase> r0 = r4.mUseCases
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ 1
                java.lang.String r1 = "UseCase must not be empty."
                androidx.core.util.Preconditions.checkArgument(r0, r1)
                r4.checkEffectTargets()
                androidx.camera.core.UseCaseGroup r0 = new androidx.camera.core.UseCaseGroup
                androidx.camera.core.ViewPort r1 = r4.mViewPort
                java.util.List<androidx.camera.core.UseCase> r2 = r4.mUseCases
                java.util.List<androidx.camera.core.CameraEffect> r3 = r4.mEffects
                r0.<init>(r1, r2, r3)
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.UseCaseGroup.Builder setViewPort(@androidx.annotation.NonNull androidx.camera.core.ViewPort r1) {
                r0 = this;
                r0.mViewPort = r1
                return r0
        }
    }

    UseCaseGroup(@androidx.annotation.Nullable androidx.camera.core.ViewPort r1, @androidx.annotation.NonNull java.util.List<androidx.camera.core.UseCase> r2, @androidx.annotation.NonNull java.util.List<androidx.camera.core.CameraEffect> r3) {
            r0 = this;
            r0.<init>()
            r0.mViewPort = r1
            r0.mUseCases = r2
            r0.mEffects = r3
            return
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.CameraEffect> getEffects() {
            r1 = this;
            java.util.List<androidx.camera.core.CameraEffect> r0 = r1.mEffects
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.UseCase> getUseCases() {
            r1 = this;
            java.util.List<androidx.camera.core.UseCase> r0 = r1.mUseCases
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.camera.core.ViewPort getViewPort() {
            r1 = this;
            androidx.camera.core.ViewPort r0 = r1.mViewPort
            return r0
    }
}
