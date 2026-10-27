package androidx.camera.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class TextureViewImplementation extends androidx.camera.view.PreviewViewImplementation {
    private static final java.lang.String TAG = "TextureViewImpl";
    android.graphics.SurfaceTexture mDetachedSurfaceTexture;

    @androidx.annotation.Nullable
    java.util.concurrent.Executor mFrameUpdateExecutor;
    boolean mIsSurfaceTextureDetachedFromView;
    java.util.concurrent.atomic.AtomicReference<androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void>> mNextFrameCompleter;

    @androidx.annotation.Nullable
    androidx.camera.view.PreviewView.OnFrameUpdateListener mOnFrameUpdateListener;

    @androidx.annotation.Nullable
    androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener mOnSurfaceNotInUseListener;
    com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.SurfaceRequest.Result> mSurfaceReleaseFuture;
    androidx.camera.core.SurfaceRequest mSurfaceRequest;
    android.graphics.SurfaceTexture mSurfaceTexture;
    android.view.TextureView mTextureView;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.view.TextureViewImplementation$1, reason: invalid class name */
    class AnonymousClass1 implements android.view.TextureView.SurfaceTextureListener {
        final /* synthetic */ androidx.camera.view.TextureViewImplementation this$0;


        AnonymousClass1(androidx.camera.view.TextureViewImplementation r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(androidx.camera.view.PreviewView.OnFrameUpdateListener r2, android.graphics.SurfaceTexture r3) {
                long r0 = r3.getTimestamp()
                r2.onFrameUpdate(r0)
                return
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(@androidx.annotation.NonNull android.graphics.SurfaceTexture r3, int r4, int r5) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "SurfaceTexture available. Size: "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = "x"
                r0.append(r4)
                r0.append(r5)
                java.lang.String r4 = r0.toString()
                java.lang.String r5 = "TextureViewImpl"
                androidx.camera.core.Logger.d(r5, r4)
                androidx.camera.view.TextureViewImplementation r4 = r2.this$0
                r4.mSurfaceTexture = r3
                com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.SurfaceRequest$Result> r3 = r4.mSurfaceReleaseFuture
                if (r3 == 0) goto L50
                androidx.camera.core.SurfaceRequest r3 = r4.mSurfaceRequest
                androidx.core.util.Preconditions.checkNotNull(r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Surface invalidated "
                r3.append(r4)
                androidx.camera.view.TextureViewImplementation r4 = r2.this$0
                androidx.camera.core.SurfaceRequest r4 = r4.mSurfaceRequest
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                androidx.camera.core.Logger.d(r5, r3)
                androidx.camera.view.TextureViewImplementation r3 = r2.this$0
                androidx.camera.core.SurfaceRequest r3 = r3.mSurfaceRequest
                androidx.camera.core.impl.DeferrableSurface r3 = r3.getDeferrableSurface()
                r3.close()
                return
            L50:
                r4.tryToProvidePreviewSurface()
                return
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(@androidx.annotation.NonNull android.graphics.SurfaceTexture r4) {
                r3 = this;
                androidx.camera.view.TextureViewImplementation r0 = r3.this$0
                r1 = 0
                r0.mSurfaceTexture = r1
                com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.SurfaceRequest$Result> r0 = r0.mSurfaceReleaseFuture
                if (r0 == 0) goto L23
                androidx.camera.view.TextureViewImplementation$1$1 r1 = new androidx.camera.view.TextureViewImplementation$1$1
                r1.<init>(r3, r4)
                androidx.camera.view.TextureViewImplementation r2 = r3.this$0
                android.view.TextureView r2 = r2.mTextureView
                android.content.Context r2 = r2.getContext()
                java.util.concurrent.Executor r2 = androidx.core.content.ContextCompat.getMainExecutor(r2)
                androidx.camera.core.impl.utils.futures.Futures.addCallback(r0, r1, r2)
                androidx.camera.view.TextureViewImplementation r0 = r3.this$0
                r0.mDetachedSurfaceTexture = r4
                r4 = 0
                return r4
            L23:
                java.lang.String r4 = "TextureViewImpl"
                java.lang.String r0 = "SurfaceTexture about to be destroyed"
                androidx.camera.core.Logger.d(r4, r0)
                r4 = 1
                return r4
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(@androidx.annotation.NonNull android.graphics.SurfaceTexture r2, int r3, int r4) {
                r1 = this;
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = "SurfaceTexture size changed: "
                r2.append(r0)
                r2.append(r3)
                java.lang.String r3 = "x"
                r2.append(r3)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "TextureViewImpl"
                androidx.camera.core.Logger.d(r3, r2)
                return
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(@androidx.annotation.NonNull android.graphics.SurfaceTexture r4) {
                r3 = this;
                androidx.camera.view.TextureViewImplementation r0 = r3.this$0
                java.util.concurrent.atomic.AtomicReference<androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void>> r0 = r0.mNextFrameCompleter
                r1 = 0
                java.lang.Object r0 = r0.getAndSet(r1)
                androidx.concurrent.futures.CallbackToFutureAdapter$Completer r0 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r0
                if (r0 == 0) goto L10
                r0.set(r1)
            L10:
                androidx.camera.view.TextureViewImplementation r0 = r3.this$0
                androidx.camera.view.PreviewView$OnFrameUpdateListener r1 = r0.mOnFrameUpdateListener
                java.util.concurrent.Executor r0 = r0.mFrameUpdateExecutor
                if (r1 == 0) goto L22
                if (r0 == 0) goto L22
                androidx.camera.view.f0 r2 = new androidx.camera.view.f0
                r2.<init>(r1, r4)
                r0.execute(r2)
            L22:
                return
        }
    }

    TextureViewImplementation(@androidx.annotation.NonNull android.widget.FrameLayout r1, @androidx.annotation.NonNull androidx.camera.view.PreviewTransformation r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.mIsSurfaceTextureDetachedFromView = r1
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            r0.mNextFrameCompleter = r1
            return
    }

    public static /* synthetic */ java.lang.Object a(androidx.camera.view.TextureViewImplementation r3, android.view.Surface r4, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r5) {
            r3.getClass()
            java.lang.String r0 = "TextureViewImpl"
            java.lang.String r1 = "Surface set on Preview."
            androidx.camera.core.Logger.d(r0, r1)
            androidx.camera.core.SurfaceRequest r0 = r3.mSurfaceRequest
            java.util.concurrent.Executor r1 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()
            java.util.Objects.requireNonNull(r5)
            androidx.camera.view.c0 r2 = new androidx.camera.view.c0
            r2.<init>(r5)
            r0.provideSurface(r4, r1, r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "provideSurface[request="
            r5.append(r0)
            androidx.camera.core.SurfaceRequest r3 = r3.mSurfaceRequest
            r5.append(r3)
            java.lang.String r3 = " surface="
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = "]"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            return r3
    }

    public static /* synthetic */ void b(androidx.camera.view.TextureViewImplementation r2, android.view.Surface r3, com.google.common.util.concurrent.ListenableFuture r4, androidx.camera.core.SurfaceRequest r5) {
            r2.getClass()
            java.lang.String r0 = "TextureViewImpl"
            java.lang.String r1 = "Safe to release surface."
            androidx.camera.core.Logger.d(r0, r1)
            r2.notifySurfaceNotInUse()
            r3.release()
            com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.SurfaceRequest$Result> r3 = r2.mSurfaceReleaseFuture
            r0 = 0
            if (r3 != r4) goto L17
            r2.mSurfaceReleaseFuture = r0
        L17:
            androidx.camera.core.SurfaceRequest r3 = r2.mSurfaceRequest
            if (r3 != r5) goto L1d
            r2.mSurfaceRequest = r0
        L1d:
            return
    }

    public static /* synthetic */ void c(androidx.camera.view.TextureViewImplementation r1, androidx.camera.core.SurfaceRequest r2) {
            androidx.camera.core.SurfaceRequest r0 = r1.mSurfaceRequest
            if (r0 == 0) goto Lb
            if (r0 != r2) goto Lb
            r2 = 0
            r1.mSurfaceRequest = r2
            r1.mSurfaceReleaseFuture = r2
        Lb:
            r1.notifySurfaceNotInUse()
            return
    }

    public static /* synthetic */ java.lang.Object d(androidx.camera.view.TextureViewImplementation r0, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r1) {
            java.util.concurrent.atomic.AtomicReference<androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void>> r0 = r0.mNextFrameCompleter
            r0.set(r1)
            java.lang.String r0 = "textureViewImpl_waitForNextFrame"
            return r0
    }

    private void notifySurfaceNotInUse() {
            r1 = this;
            androidx.camera.view.PreviewViewImplementation$OnSurfaceNotInUseListener r0 = r1.mOnSurfaceNotInUseListener
            if (r0 == 0) goto La
            r0.onSurfaceNotInUse()
            r0 = 0
            r1.mOnSurfaceNotInUseListener = r0
        La:
            return
    }

    private void reattachSurfaceTexture() {
            r2 = this;
            boolean r0 = r2.mIsSurfaceTextureDetachedFromView
            if (r0 == 0) goto L1d
            android.graphics.SurfaceTexture r0 = r2.mDetachedSurfaceTexture
            if (r0 == 0) goto L1d
            android.view.TextureView r0 = r2.mTextureView
            android.graphics.SurfaceTexture r0 = r0.getSurfaceTexture()
            android.graphics.SurfaceTexture r1 = r2.mDetachedSurfaceTexture
            if (r0 == r1) goto L1d
            android.view.TextureView r0 = r2.mTextureView
            r0.setSurfaceTexture(r1)
            r0 = 0
            r2.mDetachedSurfaceTexture = r0
            r0 = 0
            r2.mIsSurfaceTextureDetachedFromView = r0
        L1d:
            return
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    @androidx.annotation.Nullable
    android.view.View getPreview() {
            r1 = this;
            android.view.TextureView r0 = r1.mTextureView
            return r0
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    @androidx.annotation.Nullable
    android.graphics.Bitmap getPreviewBitmap() {
            r1 = this;
            android.view.TextureView r0 = r1.mTextureView
            if (r0 == 0) goto L12
            boolean r0 = r0.isAvailable()
            if (r0 != 0) goto Lb
            goto L12
        Lb:
            android.view.TextureView r0 = r1.mTextureView
            android.graphics.Bitmap r0 = r0.getBitmap()
            return r0
        L12:
            r0 = 0
            return r0
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public void initializePreview() {
            r4 = this;
            android.widget.FrameLayout r0 = r4.mParent
            androidx.core.util.Preconditions.checkNotNull(r0)
            android.util.Size r0 = r4.mResolution
            androidx.core.util.Preconditions.checkNotNull(r0)
            android.view.TextureView r0 = new android.view.TextureView
            android.widget.FrameLayout r1 = r4.mParent
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            r4.mTextureView = r0
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            android.util.Size r2 = r4.mResolution
            int r2 = r2.getWidth()
            android.util.Size r3 = r4.mResolution
            int r3 = r3.getHeight()
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            android.view.TextureView r0 = r4.mTextureView
            androidx.camera.view.TextureViewImplementation$1 r1 = new androidx.camera.view.TextureViewImplementation$1
            r1.<init>(r4)
            r0.setSurfaceTextureListener(r1)
            android.widget.FrameLayout r0 = r4.mParent
            r0.removeAllViews()
            android.widget.FrameLayout r0 = r4.mParent
            android.view.TextureView r1 = r4.mTextureView
            r0.addView(r1)
            return
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    void onAttachedToWindow() {
            r0 = this;
            r0.reattachSurfaceTexture()
            return
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    void onDetachedFromWindow() {
            r1 = this;
            r0 = 1
            r1.mIsSurfaceTextureDetachedFromView = r0
            return
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    void onSurfaceRequested(@androidx.annotation.NonNull androidx.camera.core.SurfaceRequest r2, @androidx.annotation.Nullable androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener r3) {
            r1 = this;
            android.util.Size r0 = r2.getResolution()
            r1.mResolution = r0
            r1.mOnSurfaceNotInUseListener = r3
            r1.initializePreview()
            androidx.camera.core.SurfaceRequest r3 = r1.mSurfaceRequest
            if (r3 == 0) goto L12
            r3.willNotProvideSurface()
        L12:
            r1.mSurfaceRequest = r2
            android.view.TextureView r3 = r1.mTextureView
            android.content.Context r3 = r3.getContext()
            java.util.concurrent.Executor r3 = androidx.core.content.ContextCompat.getMainExecutor(r3)
            androidx.camera.view.b0 r0 = new androidx.camera.view.b0
            r0.<init>(r1, r2)
            r2.addRequestCancellationListener(r3, r0)
            r1.tryToProvidePreviewSurface()
            return
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    void setFrameUpdateListener(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull androidx.camera.view.PreviewView.OnFrameUpdateListener r2) {
            r0 = this;
            r0.mOnFrameUpdateListener = r2
            r0.mFrameUpdateExecutor = r1
            return
    }

    void tryToProvidePreviewSurface() {
            r4 = this;
            android.util.Size r0 = r4.mResolution
            if (r0 == 0) goto L43
            android.graphics.SurfaceTexture r1 = r4.mSurfaceTexture
            if (r1 == 0) goto L43
            androidx.camera.core.SurfaceRequest r2 = r4.mSurfaceRequest
            if (r2 != 0) goto Ld
            goto L43
        Ld:
            int r0 = r0.getWidth()
            android.util.Size r2 = r4.mResolution
            int r2 = r2.getHeight()
            r1.setDefaultBufferSize(r0, r2)
            android.view.Surface r0 = new android.view.Surface
            android.graphics.SurfaceTexture r1 = r4.mSurfaceTexture
            r0.<init>(r1)
            androidx.camera.core.SurfaceRequest r1 = r4.mSurfaceRequest
            androidx.camera.view.d0 r2 = new androidx.camera.view.d0
            r2.<init>(r4, r0)
            com.google.common.util.concurrent.ListenableFuture r2 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r2)
            r4.mSurfaceReleaseFuture = r2
            androidx.camera.view.e0 r3 = new androidx.camera.view.e0
            r3.<init>(r4, r0, r2, r1)
            android.view.TextureView r0 = r4.mTextureView
            android.content.Context r0 = r0.getContext()
            java.util.concurrent.Executor r0 = androidx.core.content.ContextCompat.getMainExecutor(r0)
            r2.addListener(r3, r0)
            r4.onSurfaceProvided()
        L43:
            return
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> waitForNextFrame() {
            r1 = this;
            androidx.camera.view.a0 r0 = new androidx.camera.view.a0
            r0.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            return r0
    }
}
