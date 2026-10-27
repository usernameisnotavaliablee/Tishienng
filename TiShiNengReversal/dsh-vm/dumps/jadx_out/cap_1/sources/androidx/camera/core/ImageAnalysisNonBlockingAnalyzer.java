package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ImageAnalysisNonBlockingAnalyzer extends androidx.camera.core.ImageAnalysisAbstractAnalyzer {
    final java.util.concurrent.Executor mBackgroundExecutor;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    @androidx.annotation.VisibleForTesting
    androidx.camera.core.ImageProxy mCachedImage;
    private final java.lang.Object mLock;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private androidx.camera.core.ImageAnalysisNonBlockingAnalyzer.CacheAnalyzingImageProxy mPostedImage;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class CacheAnalyzingImageProxy extends androidx.camera.core.ForwardingImageProxy {
        final java.lang.ref.WeakReference<androidx.camera.core.ImageAnalysisNonBlockingAnalyzer> mNonBlockingAnalyzerWeakReference;

        CacheAnalyzingImageProxy(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r1, @androidx.annotation.NonNull androidx.camera.core.ImageAnalysisNonBlockingAnalyzer r2) {
                r0 = this;
                r0.<init>(r1)
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r1.<init>(r2)
                r0.mNonBlockingAnalyzerWeakReference = r1
                androidx.camera.core.t r1 = new androidx.camera.core.t
                r1.<init>(r0)
                r0.addOnImageCloseListener(r1)
                return
        }

        public static /* synthetic */ void a(androidx.camera.core.ImageAnalysisNonBlockingAnalyzer.CacheAnalyzingImageProxy r1, androidx.camera.core.ImageProxy r2) {
                java.lang.ref.WeakReference<androidx.camera.core.ImageAnalysisNonBlockingAnalyzer> r1 = r1.mNonBlockingAnalyzerWeakReference
                java.lang.Object r1 = r1.get()
                androidx.camera.core.ImageAnalysisNonBlockingAnalyzer r1 = (androidx.camera.core.ImageAnalysisNonBlockingAnalyzer) r1
                if (r1 == 0) goto L14
                java.util.concurrent.Executor r2 = r1.mBackgroundExecutor
                androidx.camera.core.u r0 = new androidx.camera.core.u
                r0.<init>(r1)
                r2.execute(r0)
            L14:
                return
        }

        public static /* synthetic */ void b(androidx.camera.core.ImageAnalysisNonBlockingAnalyzer r0) {
                r0.analyzeCachedImage()
                return
        }
    }

    ImageAnalysisNonBlockingAnalyzer(java.util.concurrent.Executor r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            r1.mBackgroundExecutor = r2
            return
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    @androidx.annotation.Nullable
    androidx.camera.core.ImageProxy acquireImage(@androidx.annotation.NonNull androidx.camera.core.impl.ImageReaderProxy r1) {
            r0 = this;
            androidx.camera.core.ImageProxy r1 = r1.acquireLatestImage()
            return r1
    }

    void analyzeCachedImage() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            r1 = 0
            r3.mPostedImage = r1     // Catch: java.lang.Throwable -> L10
            androidx.camera.core.ImageProxy r2 = r3.mCachedImage     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L12
            r3.mCachedImage = r1     // Catch: java.lang.Throwable -> L10
            r3.onValidImageAvailable(r2)     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r1 = move-exception
            goto L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    void clearCache() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.camera.core.ImageProxy r1 = r2.mCachedImage     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            r1.close()     // Catch: java.lang.Throwable -> Le
            r1 = 0
            r2.mCachedImage = r1     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r1 = move-exception
            goto L12
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    void onValidImageAvailable(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r7) {
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            boolean r1 = r6.mIsAttached     // Catch: java.lang.Throwable -> Lc
            if (r1 != 0) goto Le
            r7.close()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r7 = move-exception
            goto L50
        Le:
            androidx.camera.core.ImageAnalysisNonBlockingAnalyzer$CacheAnalyzingImageProxy r1 = r6.mPostedImage     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L37
            androidx.camera.core.ImageInfo r1 = r7.getImageInfo()     // Catch: java.lang.Throwable -> Lc
            long r1 = r1.getTimestamp()     // Catch: java.lang.Throwable -> Lc
            androidx.camera.core.ImageAnalysisNonBlockingAnalyzer$CacheAnalyzingImageProxy r3 = r6.mPostedImage     // Catch: java.lang.Throwable -> Lc
            androidx.camera.core.ImageInfo r3 = r3.getImageInfo()     // Catch: java.lang.Throwable -> Lc
            long r3 = r3.getTimestamp()     // Catch: java.lang.Throwable -> Lc
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L2c
            r7.close()     // Catch: java.lang.Throwable -> Lc
            goto L35
        L2c:
            androidx.camera.core.ImageProxy r1 = r6.mCachedImage     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L33
            r1.close()     // Catch: java.lang.Throwable -> Lc
        L33:
            r6.mCachedImage = r7     // Catch: java.lang.Throwable -> Lc
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        L37:
            androidx.camera.core.ImageAnalysisNonBlockingAnalyzer$CacheAnalyzingImageProxy r1 = new androidx.camera.core.ImageAnalysisNonBlockingAnalyzer$CacheAnalyzingImageProxy     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r7, r6)     // Catch: java.lang.Throwable -> Lc
            r6.mPostedImage = r1     // Catch: java.lang.Throwable -> Lc
            com.google.common.util.concurrent.ListenableFuture r7 = r6.analyzeImage(r1)     // Catch: java.lang.Throwable -> Lc
            androidx.camera.core.ImageAnalysisNonBlockingAnalyzer$1 r2 = new androidx.camera.core.ImageAnalysisNonBlockingAnalyzer$1     // Catch: java.lang.Throwable -> Lc
            r2.<init>(r6, r1)     // Catch: java.lang.Throwable -> Lc
            java.util.concurrent.Executor r1 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()     // Catch: java.lang.Throwable -> Lc
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r7, r2, r1)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r7
    }
}
