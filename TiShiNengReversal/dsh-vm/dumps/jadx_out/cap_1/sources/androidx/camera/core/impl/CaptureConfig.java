package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CaptureConfig {
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_JPEG_QUALITY = null;
    private static final androidx.camera.core.impl.Config.Option<android.util.Range<java.lang.Integer>> OPTION_RESOLVED_FRAME_RATE = null;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_ROTATION = null;
    public static final int TEMPLATE_TYPE_NONE = -1;
    final java.util.List<androidx.camera.core.impl.CameraCaptureCallback> mCameraCaptureCallbacks;

    @androidx.annotation.Nullable
    private final androidx.camera.core.impl.CameraCaptureResult mCameraCaptureResult;
    final android.util.Range<java.lang.Integer> mExpectedFrameRateRange;
    final androidx.camera.core.impl.Config mImplementationOptions;
    final java.util.List<androidx.camera.core.impl.DeferrableSurface> mSurfaces;

    @androidx.annotation.NonNull
    private final androidx.camera.core.impl.TagBundle mTagBundle;
    final int mTemplateType;
    private final boolean mUseRepeatingSurface;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {
        private java.util.List<androidx.camera.core.impl.CameraCaptureCallback> mCameraCaptureCallbacks;

        @androidx.annotation.Nullable
        private androidx.camera.core.impl.CameraCaptureResult mCameraCaptureResult;
        private android.util.Range<java.lang.Integer> mExpectedFrameRateRange;
        private androidx.camera.core.impl.MutableConfig mImplementationOptions;
        private androidx.camera.core.impl.MutableTagBundle mMutableTagBundle;
        private final java.util.Set<androidx.camera.core.impl.DeferrableSurface> mSurfaces;
        private int mTemplateType;
        private boolean mUseRepeatingSurface;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.mSurfaces = r0
                androidx.camera.core.impl.MutableOptionsBundle r0 = androidx.camera.core.impl.MutableOptionsBundle.create()
                r1.mImplementationOptions = r0
                r0 = -1
                r1.mTemplateType = r0
                android.util.Range<java.lang.Integer> r0 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED
                r1.mExpectedFrameRateRange = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mCameraCaptureCallbacks = r0
                r0 = 0
                r1.mUseRepeatingSurface = r0
                androidx.camera.core.impl.MutableTagBundle r0 = androidx.camera.core.impl.MutableTagBundle.create()
                r1.mMutableTagBundle = r0
                return
        }

        private Builder(androidx.camera.core.impl.CaptureConfig r3) {
                r2 = this;
                r2.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r2.mSurfaces = r0
                androidx.camera.core.impl.MutableOptionsBundle r1 = androidx.camera.core.impl.MutableOptionsBundle.create()
                r2.mImplementationOptions = r1
                r1 = -1
                r2.mTemplateType = r1
                android.util.Range<java.lang.Integer> r1 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED
                r2.mExpectedFrameRateRange = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r2.mCameraCaptureCallbacks = r1
                r1 = 0
                r2.mUseRepeatingSurface = r1
                androidx.camera.core.impl.MutableTagBundle r1 = androidx.camera.core.impl.MutableTagBundle.create()
                r2.mMutableTagBundle = r1
                java.util.List<androidx.camera.core.impl.DeferrableSurface> r1 = r3.mSurfaces
                r0.addAll(r1)
                androidx.camera.core.impl.Config r0 = r3.mImplementationOptions
                androidx.camera.core.impl.MutableOptionsBundle r0 = androidx.camera.core.impl.MutableOptionsBundle.from(r0)
                r2.mImplementationOptions = r0
                int r0 = r3.mTemplateType
                r2.mTemplateType = r0
                android.util.Range<java.lang.Integer> r0 = r3.mExpectedFrameRateRange
                r2.mExpectedFrameRateRange = r0
                java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r0 = r2.mCameraCaptureCallbacks
                java.util.List r1 = r3.getCameraCaptureCallbacks()
                r0.addAll(r1)
                boolean r0 = r3.isUseRepeatingSurface()
                r2.mUseRepeatingSurface = r0
                androidx.camera.core.impl.TagBundle r3 = r3.getTagBundle()
                androidx.camera.core.impl.MutableTagBundle r3 = androidx.camera.core.impl.MutableTagBundle.from(r3)
                r2.mMutableTagBundle = r3
                return
        }

        @androidx.annotation.NonNull
        public static androidx.camera.core.impl.CaptureConfig.Builder createFrom(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig<?> r3) {
                r0 = 0
                androidx.camera.core.impl.CaptureConfig$OptionUnpacker r0 = r3.getCaptureOptionUnpacker(r0)
                if (r0 == 0) goto L10
                androidx.camera.core.impl.CaptureConfig$Builder r1 = new androidx.camera.core.impl.CaptureConfig$Builder
                r1.<init>()
                r0.unpack(r3, r1)
                return r1
            L10:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Implementation is missing option unpacker for "
                r1.append(r2)
                java.lang.String r2 = r3.toString()
                java.lang.String r3 = r3.getTargetName(r2)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        @androidx.annotation.NonNull
        public static androidx.camera.core.impl.CaptureConfig.Builder from(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig r1) {
                androidx.camera.core.impl.CaptureConfig$Builder r0 = new androidx.camera.core.impl.CaptureConfig$Builder
                r0.<init>(r1)
                return r0
        }

        public void addAllCameraCaptureCallbacks(@androidx.annotation.NonNull java.util.Collection<androidx.camera.core.impl.CameraCaptureCallback> r2) {
                r1 = this;
                java.util.Iterator r2 = r2.iterator()
            L4:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L14
                java.lang.Object r0 = r2.next()
                androidx.camera.core.impl.CameraCaptureCallback r0 = (androidx.camera.core.impl.CameraCaptureCallback) r0
                r1.addCameraCaptureCallback(r0)
                goto L4
            L14:
                return
        }

        public void addAllTags(@androidx.annotation.NonNull androidx.camera.core.impl.TagBundle r2) {
                r1 = this;
                androidx.camera.core.impl.MutableTagBundle r0 = r1.mMutableTagBundle
                r0.addTagBundle(r2)
                return
        }

        public void addCameraCaptureCallback(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureCallback r2) {
                r1 = this;
                java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r0 = r1.mCameraCaptureCallbacks
                boolean r0 = r0.contains(r2)
                if (r0 == 0) goto L9
                return
            L9:
                java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r0 = r1.mCameraCaptureCallbacks
                r0.add(r2)
                return
        }

        public <T> void addImplementationOption(@androidx.annotation.NonNull androidx.camera.core.impl.Config.Option<T> r2, @androidx.annotation.NonNull T r3) {
                r1 = this;
                androidx.camera.core.impl.MutableConfig r0 = r1.mImplementationOptions
                r0.insertOption(r2, r3)
                return
        }

        public void addImplementationOptions(@androidx.annotation.NonNull androidx.camera.core.impl.Config r6) {
                r5 = this;
                java.util.Set r0 = r6.listOptions()
                java.util.Iterator r0 = r0.iterator()
            L8:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L43
                java.lang.Object r1 = r0.next()
                androidx.camera.core.impl.Config$Option r1 = (androidx.camera.core.impl.Config.Option) r1
                androidx.camera.core.impl.MutableConfig r2 = r5.mImplementationOptions
                r3 = 0
                java.lang.Object r2 = r2.retrieveOption(r1, r3)
                java.lang.Object r3 = r6.retrieveOption(r1)
                boolean r4 = r2 instanceof androidx.camera.core.impl.MultiValueSet
                if (r4 == 0) goto L2f
                androidx.camera.core.impl.MultiValueSet r2 = (androidx.camera.core.impl.MultiValueSet) r2
                androidx.camera.core.impl.MultiValueSet r3 = (androidx.camera.core.impl.MultiValueSet) r3
                java.util.List r1 = r3.getAllItems()
                r2.addAll(r1)
                goto L8
            L2f:
                boolean r2 = r3 instanceof androidx.camera.core.impl.MultiValueSet
                if (r2 == 0) goto L39
                androidx.camera.core.impl.MultiValueSet r3 = (androidx.camera.core.impl.MultiValueSet) r3
                androidx.camera.core.impl.MultiValueSet r3 = r3.clone()
            L39:
                androidx.camera.core.impl.MutableConfig r2 = r5.mImplementationOptions
                androidx.camera.core.impl.Config$OptionPriority r4 = r6.getOptionPriority(r1)
                r2.insertOption(r1, r4, r3)
                goto L8
            L43:
                return
        }

        public void addSurface(@androidx.annotation.NonNull androidx.camera.core.impl.DeferrableSurface r2) {
                r1 = this;
                java.util.Set<androidx.camera.core.impl.DeferrableSurface> r0 = r1.mSurfaces
                r0.add(r2)
                return
        }

        public void addTag(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Object r3) {
                r1 = this;
                androidx.camera.core.impl.MutableTagBundle r0 = r1.mMutableTagBundle
                r0.putTag(r2, r3)
                return
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.CaptureConfig build() {
                r9 = this;
                androidx.camera.core.impl.CaptureConfig r0 = new androidx.camera.core.impl.CaptureConfig
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.Set<androidx.camera.core.impl.DeferrableSurface> r2 = r9.mSurfaces
                r1.<init>(r2)
                androidx.camera.core.impl.MutableConfig r2 = r9.mImplementationOptions
                androidx.camera.core.impl.OptionsBundle r2 = androidx.camera.core.impl.OptionsBundle.from(r2)
                int r3 = r9.mTemplateType
                android.util.Range<java.lang.Integer> r4 = r9.mExpectedFrameRateRange
                java.util.ArrayList r5 = new java.util.ArrayList
                java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r6 = r9.mCameraCaptureCallbacks
                r5.<init>(r6)
                boolean r6 = r9.mUseRepeatingSurface
                androidx.camera.core.impl.MutableTagBundle r7 = r9.mMutableTagBundle
                androidx.camera.core.impl.TagBundle r7 = androidx.camera.core.impl.TagBundle.from(r7)
                androidx.camera.core.impl.CameraCaptureResult r8 = r9.mCameraCaptureResult
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r0
        }

        public void clearSurfaces() {
                r1 = this;
                java.util.Set<androidx.camera.core.impl.DeferrableSurface> r0 = r1.mSurfaces
                r0.clear()
                return
        }

        @androidx.annotation.Nullable
        public android.util.Range<java.lang.Integer> getExpectedFrameRateRange() {
                r3 = this;
                androidx.camera.core.impl.MutableConfig r0 = r3.mImplementationOptions
                androidx.camera.core.impl.Config$Option r1 = androidx.camera.core.impl.CaptureConfig.access$000()
                android.util.Range<java.lang.Integer> r2 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED
                java.lang.Object r0 = r0.retrieveOption(r1, r2)
                android.util.Range r0 = (android.util.Range) r0
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.impl.Config getImplementationOptions() {
                r1 = this;
                androidx.camera.core.impl.MutableConfig r0 = r1.mImplementationOptions
                return r0
        }

        @androidx.annotation.NonNull
        public java.util.Set<androidx.camera.core.impl.DeferrableSurface> getSurfaces() {
                r1 = this;
                java.util.Set<androidx.camera.core.impl.DeferrableSurface> r0 = r1.mSurfaces
                return r0
        }

        @androidx.annotation.Nullable
        public java.lang.Object getTag(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                androidx.camera.core.impl.MutableTagBundle r0 = r1.mMutableTagBundle
                java.lang.Object r2 = r0.getTag(r2)
                return r2
        }

        public int getTemplateType() {
                r1 = this;
                int r0 = r1.mTemplateType
                return r0
        }

        public boolean isUseRepeatingSurface() {
                r1 = this;
                boolean r0 = r1.mUseRepeatingSurface
                return r0
        }

        public boolean removeCameraCaptureCallback(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureCallback r2) {
                r1 = this;
                java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r0 = r1.mCameraCaptureCallbacks
                boolean r2 = r0.remove(r2)
                return r2
        }

        public void removeSurface(@androidx.annotation.NonNull androidx.camera.core.impl.DeferrableSurface r2) {
                r1 = this;
                java.util.Set<androidx.camera.core.impl.DeferrableSurface> r0 = r1.mSurfaces
                r0.remove(r2)
                return
        }

        public void setCameraCaptureResult(@androidx.annotation.NonNull androidx.camera.core.impl.CameraCaptureResult r1) {
                r0 = this;
                r0.mCameraCaptureResult = r1
                return
        }

        public void setExpectedFrameRateRange(@androidx.annotation.NonNull android.util.Range<java.lang.Integer> r2) {
                r1 = this;
                androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.CaptureConfig.access$000()
                r1.addImplementationOption(r0, r2)
                return
        }

        public void setImplementationOptions(@androidx.annotation.NonNull androidx.camera.core.impl.Config r1) {
                r0 = this;
                androidx.camera.core.impl.MutableOptionsBundle r1 = androidx.camera.core.impl.MutableOptionsBundle.from(r1)
                r0.mImplementationOptions = r1
                return
        }

        public void setTemplateType(int r1) {
                r0 = this;
                r0.mTemplateType = r1
                return
        }

        public void setUseRepeatingSurface(boolean r1) {
                r0 = this;
                r0.mUseRepeatingSurface = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OptionUnpacker {
        void unpack(@androidx.annotation.NonNull androidx.camera.core.impl.UseCaseConfig<?> r1, @androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig.Builder r2);
    }

    static {
            java.lang.String r0 = "camerax.core.captureConfig.rotation"
            java.lang.Class r1 = java.lang.Integer.TYPE
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.CaptureConfig.OPTION_ROTATION = r0
            java.lang.String r0 = "camerax.core.captureConfig.jpegQuality"
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.CaptureConfig.OPTION_JPEG_QUALITY = r0
            java.lang.String r0 = "camerax.core.captureConfig.resolvedFrameRate"
            java.lang.Class<android.util.Range> r1 = android.util.Range.class
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.Config.Option.create(r0, r1)
            androidx.camera.core.impl.CaptureConfig.OPTION_RESOLVED_FRAME_RATE = r0
            return
    }

    CaptureConfig(java.util.List<androidx.camera.core.impl.DeferrableSurface> r1, androidx.camera.core.impl.Config r2, int r3, @androidx.annotation.NonNull android.util.Range<java.lang.Integer> r4, java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r5, boolean r6, @androidx.annotation.NonNull androidx.camera.core.impl.TagBundle r7, @androidx.annotation.Nullable androidx.camera.core.impl.CameraCaptureResult r8) {
            r0 = this;
            r0.<init>()
            r0.mSurfaces = r1
            r0.mImplementationOptions = r2
            r0.mTemplateType = r3
            r0.mExpectedFrameRateRange = r4
            java.util.List r1 = java.util.Collections.unmodifiableList(r5)
            r0.mCameraCaptureCallbacks = r1
            r0.mUseRepeatingSurface = r6
            r0.mTagBundle = r7
            r0.mCameraCaptureResult = r8
            return
    }

    static /* synthetic */ androidx.camera.core.impl.Config.Option access$000() {
            androidx.camera.core.impl.Config$Option<android.util.Range<java.lang.Integer>> r0 = androidx.camera.core.impl.CaptureConfig.OPTION_RESOLVED_FRAME_RATE
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.CaptureConfig defaultEmptyCaptureConfig() {
            androidx.camera.core.impl.CaptureConfig$Builder r0 = new androidx.camera.core.impl.CaptureConfig$Builder
            r0.<init>()
            androidx.camera.core.impl.CaptureConfig r0 = r0.build()
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getCameraCaptureCallbacks() {
            r1 = this;
            java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r0 = r1.mCameraCaptureCallbacks
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.camera.core.impl.CameraCaptureResult getCameraCaptureResult() {
            r1 = this;
            androidx.camera.core.impl.CameraCaptureResult r0 = r1.mCameraCaptureResult
            return r0
    }

    @androidx.annotation.NonNull
    public android.util.Range<java.lang.Integer> getExpectedFrameRateRange() {
            r3 = this;
            androidx.camera.core.impl.Config r0 = r3.mImplementationOptions
            androidx.camera.core.impl.Config$Option<android.util.Range<java.lang.Integer>> r1 = androidx.camera.core.impl.CaptureConfig.OPTION_RESOLVED_FRAME_RATE
            android.util.Range<java.lang.Integer> r2 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED
            java.lang.Object r0 = r0.retrieveOption(r1, r2)
            android.util.Range r0 = (android.util.Range) r0
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.camera.core.impl.Config getImplementationOptions() {
            r1 = this;
            androidx.camera.core.impl.Config r0 = r1.mImplementationOptions
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.impl.DeferrableSurface> getSurfaces() {
            r1 = this;
            java.util.List<androidx.camera.core.impl.DeferrableSurface> r0 = r1.mSurfaces
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.camera.core.impl.TagBundle getTagBundle() {
            r1 = this;
            androidx.camera.core.impl.TagBundle r0 = r1.mTagBundle
            return r0
    }

    public int getTemplateType() {
            r1 = this;
            int r0 = r1.mTemplateType
            return r0
    }

    public boolean isUseRepeatingSurface() {
            r1 = this;
            boolean r0 = r1.mUseRepeatingSurface
            return r0
    }
}
