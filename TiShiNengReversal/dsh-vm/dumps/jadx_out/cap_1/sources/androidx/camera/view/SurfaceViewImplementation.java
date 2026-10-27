package androidx.camera.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class SurfaceViewImplementation extends androidx.camera.view.PreviewViewImplementation {
    private static final int SCREENSHOT_TIMEOUT_MILLIS = 100;
    private static final java.lang.String TAG = "SurfaceViewImpl";
    final androidx.camera.view.SurfaceViewImplementation.SurfaceRequestCallback mSurfaceRequestCallback;
    android.view.SurfaceView mSurfaceView;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(24)
    private static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void pixelCopyRequest(@androidx.annotation.NonNull android.view.SurfaceView r0, @androidx.annotation.NonNull android.graphics.Bitmap r1, @androidx.annotation.NonNull android.view.PixelCopy.OnPixelCopyFinishedListener r2, @androidx.annotation.NonNull android.os.Handler r3) {
                androidx.camera.view.y.a(r0, r1, r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    class SurfaceRequestCallback implements android.view.SurfaceHolder.Callback {

        @androidx.annotation.Nullable
        private android.util.Size mCurrentSurfaceSize;
        private boolean mNeedToInvalidate;

        @androidx.annotation.Nullable
        private androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener mOnSurfaceNotInUseListener;

        @androidx.annotation.Nullable
        private androidx.camera.core.SurfaceRequest mSurfaceRequest;

        @androidx.annotation.Nullable
        private androidx.camera.core.SurfaceRequest mSurfaceRequestToBeInvalidated;

        @androidx.annotation.Nullable
        private android.util.Size mTargetSize;
        private boolean mWasSurfaceProvided;
        final /* synthetic */ androidx.camera.view.SurfaceViewImplementation this$0;

        SurfaceRequestCallback(androidx.camera.view.SurfaceViewImplementation r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 0
                r0.mWasSurfaceProvided = r1
                r0.mNeedToInvalidate = r1
                return
        }

        public static /* synthetic */ void a(androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener r1, androidx.camera.core.SurfaceRequest.Result r2) {
                java.lang.String r2 = "SurfaceViewImpl"
                java.lang.String r0 = "Safe to release surface."
                androidx.camera.core.Logger.d(r2, r0)
                if (r1 == 0) goto Lc
                r1.onSurfaceNotInUse()
            Lc:
                return
        }

        private boolean canProvideSurface() {
                r2 = this;
                boolean r0 = r2.mWasSurfaceProvided
                if (r0 != 0) goto L14
                androidx.camera.core.SurfaceRequest r0 = r2.mSurfaceRequest
                if (r0 == 0) goto L14
                android.util.Size r0 = r2.mTargetSize
                android.util.Size r1 = r2.mCurrentSurfaceSize
                boolean r0 = java.util.Objects.equals(r0, r1)
                if (r0 == 0) goto L14
                r0 = 1
                return r0
            L14:
                r0 = 0
                return r0
        }

        @androidx.annotation.UiThread
        private void cancelPreviousRequest() {
                r2 = this;
                androidx.camera.core.SurfaceRequest r0 = r2.mSurfaceRequest
                if (r0 == 0) goto L21
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Request canceled: "
                r0.append(r1)
                androidx.camera.core.SurfaceRequest r1 = r2.mSurfaceRequest
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "SurfaceViewImpl"
                androidx.camera.core.Logger.d(r1, r0)
                androidx.camera.core.SurfaceRequest r0 = r2.mSurfaceRequest
                r0.willNotProvideSurface()
            L21:
                return
        }

        @androidx.annotation.UiThread
        private void closeSurface() {
                r2 = this;
                androidx.camera.core.SurfaceRequest r0 = r2.mSurfaceRequest
                if (r0 == 0) goto L25
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Surface closed "
                r0.append(r1)
                androidx.camera.core.SurfaceRequest r1 = r2.mSurfaceRequest
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "SurfaceViewImpl"
                androidx.camera.core.Logger.d(r1, r0)
                androidx.camera.core.SurfaceRequest r0 = r2.mSurfaceRequest
                androidx.camera.core.impl.DeferrableSurface r0 = r0.getDeferrableSurface()
                r0.close()
            L25:
                return
        }

        @androidx.annotation.UiThread
        private boolean tryToComplete() {
                r5 = this;
                androidx.camera.view.SurfaceViewImplementation r0 = r5.this$0
                android.view.SurfaceView r0 = r0.mSurfaceView
                android.view.SurfaceHolder r0 = r0.getHolder()
                android.view.Surface r0 = r0.getSurface()
                boolean r1 = r5.canProvideSurface()
                if (r1 == 0) goto L3d
                java.lang.String r1 = "SurfaceViewImpl"
                java.lang.String r2 = "Surface set on Preview."
                androidx.camera.core.Logger.d(r1, r2)
                androidx.camera.view.PreviewViewImplementation$OnSurfaceNotInUseListener r1 = r5.mOnSurfaceNotInUseListener
                androidx.camera.core.SurfaceRequest r2 = r5.mSurfaceRequest
                java.util.Objects.requireNonNull(r2)
                androidx.camera.view.SurfaceViewImplementation r3 = r5.this$0
                android.view.SurfaceView r3 = r3.mSurfaceView
                android.content.Context r3 = r3.getContext()
                java.util.concurrent.Executor r3 = androidx.core.content.ContextCompat.getMainExecutor(r3)
                androidx.camera.view.z r4 = new androidx.camera.view.z
                r4.<init>(r1)
                r2.provideSurface(r0, r3, r4)
                r0 = 1
                r5.mWasSurfaceProvided = r0
                androidx.camera.view.SurfaceViewImplementation r1 = r5.this$0
                r1.onSurfaceProvided()
                return r0
            L3d:
                r0 = 0
                return r0
        }

        @androidx.annotation.UiThread
        void setSurfaceRequest(@androidx.annotation.NonNull androidx.camera.core.SurfaceRequest r3, @androidx.annotation.Nullable androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener r4) {
                r2 = this;
                r2.cancelPreviousRequest()
                boolean r0 = r2.mNeedToInvalidate
                r1 = 0
                if (r0 == 0) goto Le
                r2.mNeedToInvalidate = r1
                r3.invalidate()
                return
            Le:
                r2.mSurfaceRequest = r3
                r2.mOnSurfaceNotInUseListener = r4
                android.util.Size r3 = r3.getResolution()
                r2.mTargetSize = r3
                r2.mWasSurfaceProvided = r1
                boolean r4 = r2.tryToComplete()
                if (r4 != 0) goto L3a
                java.lang.String r4 = "SurfaceViewImpl"
                java.lang.String r0 = "Wait for new Surface creation."
                androidx.camera.core.Logger.d(r4, r0)
                androidx.camera.view.SurfaceViewImplementation r4 = r2.this$0
                android.view.SurfaceView r4 = r4.mSurfaceView
                android.view.SurfaceHolder r4 = r4.getHolder()
                int r0 = r3.getWidth()
                int r3 = r3.getHeight()
                r4.setFixedSize(r0, r3)
            L3a:
                return
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(@androidx.annotation.NonNull android.view.SurfaceHolder r1, int r2, int r3, int r4) {
                r0 = this;
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Surface changed. Size: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "x"
                r1.append(r2)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "SurfaceViewImpl"
                androidx.camera.core.Logger.d(r2, r1)
                android.util.Size r1 = new android.util.Size
                r1.<init>(r3, r4)
                r0.mCurrentSurfaceSize = r1
                r0.tryToComplete()
                return
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(@androidx.annotation.NonNull android.view.SurfaceHolder r2) {
                r1 = this;
                java.lang.String r2 = "SurfaceViewImpl"
                java.lang.String r0 = "Surface created."
                androidx.camera.core.Logger.d(r2, r0)
                boolean r2 = r1.mNeedToInvalidate
                if (r2 == 0) goto L18
                androidx.camera.core.SurfaceRequest r2 = r1.mSurfaceRequestToBeInvalidated
                if (r2 == 0) goto L18
                r2.invalidate()
                r2 = 0
                r1.mSurfaceRequestToBeInvalidated = r2
                r2 = 0
                r1.mNeedToInvalidate = r2
            L18:
                return
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(@androidx.annotation.NonNull android.view.SurfaceHolder r2) {
                r1 = this;
                java.lang.String r2 = "SurfaceViewImpl"
                java.lang.String r0 = "Surface destroyed."
                androidx.camera.core.Logger.d(r2, r0)
                boolean r2 = r1.mWasSurfaceProvided
                if (r2 == 0) goto Lf
                r1.closeSurface()
                goto L12
            Lf:
                r1.cancelPreviousRequest()
            L12:
                r2 = 1
                r1.mNeedToInvalidate = r2
                androidx.camera.core.SurfaceRequest r2 = r1.mSurfaceRequest
                if (r2 == 0) goto L1b
                r1.mSurfaceRequestToBeInvalidated = r2
            L1b:
                r2 = 0
                r1.mWasSurfaceProvided = r2
                r2 = 0
                r1.mSurfaceRequest = r2
                r1.mOnSurfaceNotInUseListener = r2
                r1.mCurrentSurfaceSize = r2
                r1.mTargetSize = r2
                return
        }
    }

    SurfaceViewImplementation(@androidx.annotation.NonNull android.widget.FrameLayout r1, @androidx.annotation.NonNull androidx.camera.view.PreviewTransformation r2) {
            r0 = this;
            r0.<init>(r1, r2)
            androidx.camera.view.SurfaceViewImplementation$SurfaceRequestCallback r1 = new androidx.camera.view.SurfaceViewImplementation$SurfaceRequestCallback
            r1.<init>(r0)
            r0.mSurfaceRequestCallback = r1
            return
    }

    public static /* synthetic */ void a(androidx.camera.view.SurfaceViewImplementation r0, androidx.camera.core.SurfaceRequest r1, androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener r2) {
            androidx.camera.view.SurfaceViewImplementation$SurfaceRequestCallback r0 = r0.mSurfaceRequestCallback
            r0.setSurfaceRequest(r1, r2)
            return
    }

    public static /* synthetic */ void b(java.util.concurrent.Semaphore r3, int r4) {
            java.lang.String r0 = "SurfaceViewImpl"
            if (r4 != 0) goto La
            java.lang.String r4 = "PreviewView.SurfaceViewImplementation.getBitmap() succeeded"
            androidx.camera.core.Logger.d(r0, r4)
            goto L1e
        La:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "PreviewView.SurfaceViewImplementation.getBitmap() failed with error "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            androidx.camera.core.Logger.e(r0, r4)
        L1e:
            r3.release()
            return
    }

    private static boolean shouldReusePreview(@androidx.annotation.Nullable android.view.SurfaceView r0, @androidx.annotation.Nullable android.util.Size r1, @androidx.annotation.NonNull androidx.camera.core.SurfaceRequest r2) {
            android.util.Size r2 = r2.getResolution()
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r0 == 0) goto Le
            if (r1 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    @androidx.annotation.Nullable
    android.view.View getPreview() {
            r1 = this;
            android.view.SurfaceView r0 = r1.mSurfaceView
            return r0
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(24)
    android.graphics.Bitmap getPreviewBitmap() {
            r8 = this;
            java.lang.String r0 = "SurfaceViewImpl"
            android.view.SurfaceView r1 = r8.mSurfaceView
            if (r1 == 0) goto L7c
            android.view.SurfaceHolder r1 = r1.getHolder()
            android.view.Surface r1 = r1.getSurface()
            if (r1 == 0) goto L7c
            android.view.SurfaceView r1 = r8.mSurfaceView
            android.view.SurfaceHolder r1 = r1.getHolder()
            android.view.Surface r1 = r1.getSurface()
            boolean r1 = r1.isValid()
            if (r1 != 0) goto L21
            goto L7c
        L21:
            java.util.concurrent.Semaphore r1 = new java.util.concurrent.Semaphore
            r2 = 0
            r1.<init>(r2)
            android.view.SurfaceView r2 = r8.mSurfaceView
            int r2 = r2.getWidth()
            android.view.SurfaceView r3 = r8.mSurfaceView
            int r3 = r3.getHeight()
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r4)
            android.os.HandlerThread r3 = new android.os.HandlerThread
            java.lang.String r4 = "pixelCopyRequest Thread"
            r3.<init>(r4)
            r3.start()
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r5 = r3.getLooper()
            r4.<init>(r5)
            android.view.SurfaceView r5 = r8.mSurfaceView
            androidx.camera.view.x r6 = new androidx.camera.view.x
            r6.<init>(r1)
            androidx.camera.view.SurfaceViewImplementation.Api24Impl.pixelCopyRequest(r5, r2, r6, r4)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L67 java.lang.InterruptedException -> L69
            r5 = 1
            r6 = 100
            boolean r1 = r1.tryAcquire(r5, r6, r4)     // Catch: java.lang.Throwable -> L67 java.lang.InterruptedException -> L69
            if (r1 != 0) goto L6b
            java.lang.String r1 = "Timed out while trying to acquire screenshot."
            androidx.camera.core.Logger.e(r0, r1)     // Catch: java.lang.Throwable -> L67 java.lang.InterruptedException -> L69
            goto L6b
        L67:
            r0 = move-exception
            goto L78
        L69:
            r1 = move-exception
            goto L6f
        L6b:
            r3.quitSafely()
            return r2
        L6f:
            java.lang.String r4 = "Interrupted while trying to acquire screenshot."
            androidx.camera.core.Logger.e(r0, r4, r1)     // Catch: java.lang.Throwable -> L67
            r3.quitSafely()
            return r2
        L78:
            r3.quitSafely()
            throw r0
        L7c:
            r0 = 0
            return r0
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    void initializePreview() {
            r4 = this;
            android.widget.FrameLayout r0 = r4.mParent
            androidx.core.util.Preconditions.checkNotNull(r0)
            android.util.Size r0 = r4.mResolution
            androidx.core.util.Preconditions.checkNotNull(r0)
            android.view.SurfaceView r0 = new android.view.SurfaceView
            android.widget.FrameLayout r1 = r4.mParent
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            r4.mSurfaceView = r0
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            android.util.Size r2 = r4.mResolution
            int r2 = r2.getWidth()
            android.util.Size r3 = r4.mResolution
            int r3 = r3.getHeight()
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            android.widget.FrameLayout r0 = r4.mParent
            r0.removeAllViews()
            android.widget.FrameLayout r0 = r4.mParent
            android.view.SurfaceView r1 = r4.mSurfaceView
            r0.addView(r1)
            android.view.SurfaceView r0 = r4.mSurfaceView
            android.view.SurfaceHolder r0 = r0.getHolder()
            androidx.camera.view.SurfaceViewImplementation$SurfaceRequestCallback r1 = r4.mSurfaceRequestCallback
            r0.addCallback(r1)
            return
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    void onAttachedToWindow() {
            r0 = this;
            return
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    void onDetachedFromWindow() {
            r0 = this;
            return
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    void onSurfaceRequested(@androidx.annotation.NonNull androidx.camera.core.SurfaceRequest r3, @androidx.annotation.Nullable androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener r4) {
            r2 = this;
            android.view.SurfaceView r0 = r2.mSurfaceView
            android.util.Size r1 = r2.mResolution
            boolean r0 = shouldReusePreview(r0, r1, r3)
            if (r0 != 0) goto L13
            android.util.Size r0 = r3.getResolution()
            r2.mResolution = r0
            r2.initializePreview()
        L13:
            if (r4 == 0) goto L27
            android.view.SurfaceView r0 = r2.mSurfaceView
            android.content.Context r0 = r0.getContext()
            java.util.concurrent.Executor r0 = androidx.core.content.ContextCompat.getMainExecutor(r0)
            androidx.camera.view.v r1 = new androidx.camera.view.v
            r1.<init>(r4)
            r3.addRequestCancellationListener(r0, r1)
        L27:
            android.view.SurfaceView r0 = r2.mSurfaceView
            androidx.camera.view.w r1 = new androidx.camera.view.w
            r1.<init>(r2, r3, r4)
            r0.post(r1)
            return
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    void setFrameUpdateListener(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull androidx.camera.view.PreviewView.OnFrameUpdateListener r2) {
            r0 = this;
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "SurfaceView doesn't support frame update listener"
            r1.<init>(r2)
            throw r1
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    @androidx.annotation.NonNull
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> waitForNextFrame() {
            r1 = this;
            r0 = 0
            com.google.common.util.concurrent.ListenableFuture r0 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r0)
            return r0
    }
}
