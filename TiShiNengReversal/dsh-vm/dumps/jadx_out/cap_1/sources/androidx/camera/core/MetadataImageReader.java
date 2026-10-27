package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class MetadataImageReader implements androidx.camera.core.impl.ImageReaderProxy, androidx.camera.core.ForwardingImageProxy.OnImageCloseListener {
    private static final java.lang.String TAG = "MetadataImageReader";

    @androidx.annotation.GuardedBy("mLock")
    private final java.util.List<androidx.camera.core.ImageProxy> mAcquiredImageProxies;
    private androidx.camera.core.impl.CameraCaptureCallback mCameraCaptureCallback;

    @androidx.annotation.GuardedBy("mLock")
    private boolean mClosed;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    private java.util.concurrent.Executor mExecutor;

    @androidx.annotation.GuardedBy("mLock")
    private int mImageProxiesIndex;

    @androidx.annotation.GuardedBy("mLock")
    private final androidx.camera.core.impl.ImageReaderProxy mImageReaderProxy;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mLock")
    androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener mListener;
    private final java.lang.Object mLock;

    @androidx.annotation.GuardedBy("mLock")
    private final java.util.List<androidx.camera.core.ImageProxy> mMatchedImageProxies;

    @androidx.annotation.GuardedBy("mLock")
    private final android.util.LongSparseArray<androidx.camera.core.ImageInfo> mPendingImageInfos;

    @androidx.annotation.GuardedBy("mLock")
    private final android.util.LongSparseArray<androidx.camera.core.ImageProxy> mPendingImages;
    private androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener mTransformedListener;

    @androidx.annotation.GuardedBy("mLock")
    private int mUnAcquiredAvailableImageCount;


    public MetadataImageReader(int r1, int r2, int r3, int r4) {
            r0 = this;
            androidx.camera.core.impl.ImageReaderProxy r1 = createImageReaderProxy(r1, r2, r3, r4)
            r0.<init>(r1)
            return
    }

    MetadataImageReader(@androidx.annotation.NonNull androidx.camera.core.impl.ImageReaderProxy r3) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.mLock = r0
            androidx.camera.core.MetadataImageReader$1 r0 = new androidx.camera.core.MetadataImageReader$1
            r0.<init>(r2)
            r2.mCameraCaptureCallback = r0
            r0 = 0
            r2.mUnAcquiredAvailableImageCount = r0
            androidx.camera.core.j0 r1 = new androidx.camera.core.j0
            r1.<init>(r2)
            r2.mTransformedListener = r1
            r2.mClosed = r0
            android.util.LongSparseArray r1 = new android.util.LongSparseArray
            r1.<init>()
            r2.mPendingImageInfos = r1
            android.util.LongSparseArray r1 = new android.util.LongSparseArray
            r1.<init>()
            r2.mPendingImages = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.mAcquiredImageProxies = r1
            r2.mImageReaderProxy = r3
            r2.mImageProxiesIndex = r0
            java.util.ArrayList r3 = new java.util.ArrayList
            int r0 = r2.getMaxImages()
            r3.<init>(r0)
            r2.mMatchedImageProxies = r3
            return
    }

    public static /* synthetic */ void a(androidx.camera.core.MetadataImageReader r0, androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener r1) {
            r0.getClass()
            r1.onImageAvailable(r0)
            return
    }

    public static /* synthetic */ void b(androidx.camera.core.MetadataImageReader r2, androidx.camera.core.impl.ImageReaderProxy r3) {
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            int r1 = r2.mUnAcquiredAvailableImageCount     // Catch: java.lang.Throwable -> Le
            int r1 = r1 + 1
            r2.mUnAcquiredAvailableImageCount = r1     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            r2.imageIncoming(r3)
            return
        Le:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    private static androidx.camera.core.impl.ImageReaderProxy createImageReaderProxy(int r1, int r2, int r3, int r4) {
            androidx.camera.core.AndroidImageReaderProxy r0 = new androidx.camera.core.AndroidImageReaderProxy
            android.media.ImageReader r1 = android.media.ImageReader.newInstance(r1, r2, r3, r4)
            r0.<init>(r1)
            return r0
    }

    private void dequeImageProxy(androidx.camera.core.ImageProxy r4) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            java.util.List<androidx.camera.core.ImageProxy> r1 = r3.mMatchedImageProxies     // Catch: java.lang.Throwable -> L19
            int r1 = r1.indexOf(r4)     // Catch: java.lang.Throwable -> L19
            if (r1 < 0) goto L1b
            java.util.List<androidx.camera.core.ImageProxy> r2 = r3.mMatchedImageProxies     // Catch: java.lang.Throwable -> L19
            r2.remove(r1)     // Catch: java.lang.Throwable -> L19
            int r2 = r3.mImageProxiesIndex     // Catch: java.lang.Throwable -> L19
            if (r1 > r2) goto L1b
            int r2 = r2 + (-1)
            r3.mImageProxiesIndex = r2     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r4 = move-exception
            goto L2b
        L1b:
            java.util.List<androidx.camera.core.ImageProxy> r1 = r3.mAcquiredImageProxies     // Catch: java.lang.Throwable -> L19
            r1.remove(r4)     // Catch: java.lang.Throwable -> L19
            int r4 = r3.mUnAcquiredAvailableImageCount     // Catch: java.lang.Throwable -> L19
            if (r4 <= 0) goto L29
            androidx.camera.core.impl.ImageReaderProxy r4 = r3.mImageReaderProxy     // Catch: java.lang.Throwable -> L19
            r3.imageIncoming(r4)     // Catch: java.lang.Throwable -> L19
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r4
    }

    private void enqueueImageProxy(androidx.camera.core.SettableImageProxy r4) {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            java.util.List<androidx.camera.core.ImageProxy> r1 = r3.mMatchedImageProxies     // Catch: java.lang.Throwable -> L1c
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L1c
            int r2 = r3.getMaxImages()     // Catch: java.lang.Throwable -> L1c
            if (r1 >= r2) goto L1e
            r4.addOnImageCloseListener(r3)     // Catch: java.lang.Throwable -> L1c
            java.util.List<androidx.camera.core.ImageProxy> r1 = r3.mMatchedImageProxies     // Catch: java.lang.Throwable -> L1c
            r1.add(r4)     // Catch: java.lang.Throwable -> L1c
            androidx.camera.core.impl.ImageReaderProxy$OnImageAvailableListener r4 = r3.mListener     // Catch: java.lang.Throwable -> L1c
            java.util.concurrent.Executor r1 = r3.mExecutor     // Catch: java.lang.Throwable -> L1c
            goto L2a
        L1c:
            r4 = move-exception
            goto L3c
        L1e:
            java.lang.String r1 = "TAG"
            java.lang.String r2 = "Maximum image number reached."
            androidx.camera.core.Logger.d(r1, r2)     // Catch: java.lang.Throwable -> L1c
            r4.close()     // Catch: java.lang.Throwable -> L1c
            r4 = 0
            r1 = r4
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L3b
            if (r1 == 0) goto L38
            androidx.camera.core.k0 r0 = new androidx.camera.core.k0
            r0.<init>(r3, r4)
            r1.execute(r0)
            return
        L38:
            r4.onImageAvailable(r3)
        L3b:
            return
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r4
    }

    private void matchImages() {
            r7 = this;
            java.lang.Object r0 = r7.mLock
            monitor-enter(r0)
            android.util.LongSparseArray<androidx.camera.core.ImageInfo> r1 = r7.mPendingImageInfos     // Catch: java.lang.Throwable -> L36
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L36
            int r1 = r1 + (-1)
        Lb:
            if (r1 < 0) goto L3b
            android.util.LongSparseArray<androidx.camera.core.ImageInfo> r2 = r7.mPendingImageInfos     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r2.valueAt(r1)     // Catch: java.lang.Throwable -> L36
            androidx.camera.core.ImageInfo r2 = (androidx.camera.core.ImageInfo) r2     // Catch: java.lang.Throwable -> L36
            long r3 = r2.getTimestamp()     // Catch: java.lang.Throwable -> L36
            android.util.LongSparseArray<androidx.camera.core.ImageProxy> r5 = r7.mPendingImages     // Catch: java.lang.Throwable -> L36
            java.lang.Object r5 = r5.get(r3)     // Catch: java.lang.Throwable -> L36
            androidx.camera.core.ImageProxy r5 = (androidx.camera.core.ImageProxy) r5     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L38
            android.util.LongSparseArray<androidx.camera.core.ImageProxy> r6 = r7.mPendingImages     // Catch: java.lang.Throwable -> L36
            r6.remove(r3)     // Catch: java.lang.Throwable -> L36
            android.util.LongSparseArray<androidx.camera.core.ImageInfo> r3 = r7.mPendingImageInfos     // Catch: java.lang.Throwable -> L36
            r3.removeAt(r1)     // Catch: java.lang.Throwable -> L36
            androidx.camera.core.SettableImageProxy r3 = new androidx.camera.core.SettableImageProxy     // Catch: java.lang.Throwable -> L36
            r3.<init>(r5, r2)     // Catch: java.lang.Throwable -> L36
            r7.enqueueImageProxy(r3)     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            r1 = move-exception
            goto L40
        L38:
            int r1 = r1 + (-1)
            goto Lb
        L3b:
            r7.removeStaleData()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            return
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r1
    }

    private void removeStaleData() {
            r7 = this;
            java.lang.Object r0 = r7.mLock
            monitor-enter(r0)
            android.util.LongSparseArray<androidx.camera.core.ImageProxy> r1 = r7.mPendingImages     // Catch: java.lang.Throwable -> L5b
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L7e
            android.util.LongSparseArray<androidx.camera.core.ImageInfo> r1 = r7.mPendingImageInfos     // Catch: java.lang.Throwable -> L5b
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L14
            goto L7e
        L14:
            android.util.LongSparseArray<androidx.camera.core.ImageProxy> r1 = r7.mPendingImages     // Catch: java.lang.Throwable -> L5b
            r2 = 0
            long r3 = r1.keyAt(r2)     // Catch: java.lang.Throwable -> L5b
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L5b
            android.util.LongSparseArray<androidx.camera.core.ImageInfo> r5 = r7.mPendingImageInfos     // Catch: java.lang.Throwable -> L5b
            long r5 = r5.keyAt(r2)     // Catch: java.lang.Throwable -> L5b
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L5b
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L5b
            r1 = r1 ^ 1
            androidx.core.util.Preconditions.checkArgument(r1)     // Catch: java.lang.Throwable -> L5b
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L60
            android.util.LongSparseArray<androidx.camera.core.ImageProxy> r1 = r7.mPendingImages     // Catch: java.lang.Throwable -> L5b
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L5b
            int r1 = r1 + (-1)
        L3e:
            if (r1 < 0) goto L7c
            android.util.LongSparseArray<androidx.camera.core.ImageProxy> r2 = r7.mPendingImages     // Catch: java.lang.Throwable -> L5b
            long r2 = r2.keyAt(r1)     // Catch: java.lang.Throwable -> L5b
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 >= 0) goto L5d
            android.util.LongSparseArray<androidx.camera.core.ImageProxy> r2 = r7.mPendingImages     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r2 = r2.valueAt(r1)     // Catch: java.lang.Throwable -> L5b
            androidx.camera.core.ImageProxy r2 = (androidx.camera.core.ImageProxy) r2     // Catch: java.lang.Throwable -> L5b
            r2.close()     // Catch: java.lang.Throwable -> L5b
            android.util.LongSparseArray<androidx.camera.core.ImageProxy> r2 = r7.mPendingImages     // Catch: java.lang.Throwable -> L5b
            r2.removeAt(r1)     // Catch: java.lang.Throwable -> L5b
            goto L5d
        L5b:
            r1 = move-exception
            goto L80
        L5d:
            int r1 = r1 + (-1)
            goto L3e
        L60:
            android.util.LongSparseArray<androidx.camera.core.ImageInfo> r1 = r7.mPendingImageInfos     // Catch: java.lang.Throwable -> L5b
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L5b
            int r1 = r1 + (-1)
        L68:
            if (r1 < 0) goto L7c
            android.util.LongSparseArray<androidx.camera.core.ImageInfo> r2 = r7.mPendingImageInfos     // Catch: java.lang.Throwable -> L5b
            long r5 = r2.keyAt(r1)     // Catch: java.lang.Throwable -> L5b
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto L79
            android.util.LongSparseArray<androidx.camera.core.ImageInfo> r2 = r7.mPendingImageInfos     // Catch: java.lang.Throwable -> L5b
            r2.removeAt(r1)     // Catch: java.lang.Throwable -> L5b
        L79:
            int r1 = r1 + (-1)
            goto L68
        L7c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            return
        L7e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            return
        L80:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            throw r1
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @androidx.annotation.Nullable
    public androidx.camera.core.ImageProxy acquireLatestImage() {
            r5 = this;
            java.lang.Object r0 = r5.mLock
            monitor-enter(r0)
            java.util.List<androidx.camera.core.ImageProxy> r1 = r5.mMatchedImageProxies     // Catch: java.lang.Throwable -> Le
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            r1 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            goto L7b
        L10:
            int r1 = r5.mImageProxiesIndex     // Catch: java.lang.Throwable -> Le
            java.util.List<androidx.camera.core.ImageProxy> r2 = r5.mMatchedImageProxies     // Catch: java.lang.Throwable -> Le
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Le
            if (r1 >= r2) goto L73
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le
            r1.<init>()     // Catch: java.lang.Throwable -> Le
            r2 = 0
        L20:
            java.util.List<androidx.camera.core.ImageProxy> r3 = r5.mMatchedImageProxies     // Catch: java.lang.Throwable -> Le
            int r3 = r3.size()     // Catch: java.lang.Throwable -> Le
            int r3 = r3 + (-1)
            if (r2 >= r3) goto L46
            java.util.List<androidx.camera.core.ImageProxy> r3 = r5.mAcquiredImageProxies     // Catch: java.lang.Throwable -> Le
            java.util.List<androidx.camera.core.ImageProxy> r4 = r5.mMatchedImageProxies     // Catch: java.lang.Throwable -> Le
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> Le
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> Le
            if (r3 != 0) goto L43
            java.util.List<androidx.camera.core.ImageProxy> r3 = r5.mMatchedImageProxies     // Catch: java.lang.Throwable -> Le
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.ImageProxy r3 = (androidx.camera.core.ImageProxy) r3     // Catch: java.lang.Throwable -> Le
            r1.add(r3)     // Catch: java.lang.Throwable -> Le
        L43:
            int r2 = r2 + 1
            goto L20
        L46:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Le
        L4a:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L5a
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.ImageProxy r2 = (androidx.camera.core.ImageProxy) r2     // Catch: java.lang.Throwable -> Le
            r2.close()     // Catch: java.lang.Throwable -> Le
            goto L4a
        L5a:
            java.util.List<androidx.camera.core.ImageProxy> r1 = r5.mMatchedImageProxies     // Catch: java.lang.Throwable -> Le
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Le
            int r2 = r1 + (-1)
            java.util.List<androidx.camera.core.ImageProxy> r3 = r5.mMatchedImageProxies     // Catch: java.lang.Throwable -> Le
            r5.mImageProxiesIndex = r1     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = r3.get(r2)     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.ImageProxy r1 = (androidx.camera.core.ImageProxy) r1     // Catch: java.lang.Throwable -> Le
            java.util.List<androidx.camera.core.ImageProxy> r2 = r5.mAcquiredImageProxies     // Catch: java.lang.Throwable -> Le
            r2.add(r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        L73:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = "Maximum image number reached."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Le
            throw r1     // Catch: java.lang.Throwable -> Le
        L7b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @androidx.annotation.Nullable
    public androidx.camera.core.ImageProxy acquireNextImage() {
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            java.util.List<androidx.camera.core.ImageProxy> r1 = r4.mMatchedImageProxies     // Catch: java.lang.Throwable -> Le
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            r1 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            goto L37
        L10:
            int r1 = r4.mImageProxiesIndex     // Catch: java.lang.Throwable -> Le
            java.util.List<androidx.camera.core.ImageProxy> r2 = r4.mMatchedImageProxies     // Catch: java.lang.Throwable -> Le
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Le
            if (r1 >= r2) goto L2f
            java.util.List<androidx.camera.core.ImageProxy> r1 = r4.mMatchedImageProxies     // Catch: java.lang.Throwable -> Le
            int r2 = r4.mImageProxiesIndex     // Catch: java.lang.Throwable -> Le
            int r3 = r2 + 1
            r4.mImageProxiesIndex = r3     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> Le
            androidx.camera.core.ImageProxy r1 = (androidx.camera.core.ImageProxy) r1     // Catch: java.lang.Throwable -> Le
            java.util.List<androidx.camera.core.ImageProxy> r2 = r4.mAcquiredImageProxies     // Catch: java.lang.Throwable -> Le
            r2.add(r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = "Maximum image number reached."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Le
            throw r1     // Catch: java.lang.Throwable -> Le
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.camera.core.impl.ImageReaderProxy r1 = r2.mImageReaderProxy     // Catch: java.lang.Throwable -> L12
            r1.clearOnImageAvailableListener()     // Catch: java.lang.Throwable -> L12
            r1 = 0
            r2.mListener = r1     // Catch: java.lang.Throwable -> L12
            r2.mExecutor = r1     // Catch: java.lang.Throwable -> L12
            r1 = 0
            r2.mUnAcquiredAvailableImageCount = r1     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            boolean r1 = r3.mClosed     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r1 = move-exception
            goto L35
        Lb:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9
            java.util.List<androidx.camera.core.ImageProxy> r2 = r3.mMatchedImageProxies     // Catch: java.lang.Throwable -> L9
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L9
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L9
        L16:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L9
            if (r2 == 0) goto L26
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L9
            androidx.camera.core.ImageProxy r2 = (androidx.camera.core.ImageProxy) r2     // Catch: java.lang.Throwable -> L9
            r2.close()     // Catch: java.lang.Throwable -> L9
            goto L16
        L26:
            java.util.List<androidx.camera.core.ImageProxy> r1 = r3.mMatchedImageProxies     // Catch: java.lang.Throwable -> L9
            r1.clear()     // Catch: java.lang.Throwable -> L9
            androidx.camera.core.impl.ImageReaderProxy r1 = r3.mImageReaderProxy     // Catch: java.lang.Throwable -> L9
            r1.close()     // Catch: java.lang.Throwable -> L9
            r1 = 1
            r3.mClosed = r1     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    @androidx.annotation.NonNull
    public androidx.camera.core.impl.CameraCaptureCallback getCameraCaptureCallback() {
            r1 = this;
            androidx.camera.core.impl.CameraCaptureCallback r0 = r1.mCameraCaptureCallback
            return r0
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.camera.core.impl.ImageReaderProxy r1 = r2.mImageReaderProxy     // Catch: java.lang.Throwable -> Lb
            int r1 = r1.getHeight()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getImageFormat() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.camera.core.impl.ImageReaderProxy r1 = r2.mImageReaderProxy     // Catch: java.lang.Throwable -> Lb
            int r1 = r1.getImageFormat()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.camera.core.impl.ImageReaderProxy r1 = r2.mImageReaderProxy     // Catch: java.lang.Throwable -> Lb
            int r1 = r1.getMaxImages()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    @androidx.annotation.Nullable
    public android.view.Surface getSurface() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.camera.core.impl.ImageReaderProxy r1 = r2.mImageReaderProxy     // Catch: java.lang.Throwable -> Lb
            android.view.Surface r1 = r1.getSurface()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getWidth() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.camera.core.impl.ImageReaderProxy r1 = r2.mImageReaderProxy     // Catch: java.lang.Throwable -> Lb
            int r1 = r1.getWidth()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    void imageIncoming(androidx.camera.core.impl.ImageReaderProxy r7) {
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            boolean r1 = r6.mClosed     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r7 = move-exception
            goto L60
        Lb:
            android.util.LongSparseArray<androidx.camera.core.ImageProxy> r1 = r6.mPendingImages     // Catch: java.lang.Throwable -> L9
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L9
            java.util.List<androidx.camera.core.ImageProxy> r2 = r6.mMatchedImageProxies     // Catch: java.lang.Throwable -> L9
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L9
            int r1 = r1 + r2
            int r2 = r7.getMaxImages()     // Catch: java.lang.Throwable -> L9
            if (r1 < r2) goto L27
            java.lang.String r7 = "MetadataImageReader"
            java.lang.String r1 = "Skip to acquire the next image because the acquired image count has reached the max images count."
            androidx.camera.core.Logger.d(r7, r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L27:
            androidx.camera.core.ImageProxy r2 = r7.acquireNextImage()     // Catch: java.lang.Throwable -> L46 java.lang.IllegalStateException -> L48
            if (r2 == 0) goto L51
            int r3 = r6.mUnAcquiredAvailableImageCount     // Catch: java.lang.Throwable -> L9
            int r3 = r3 + (-1)
            r6.mUnAcquiredAvailableImageCount = r3     // Catch: java.lang.Throwable -> L9
            int r1 = r1 + 1
            android.util.LongSparseArray<androidx.camera.core.ImageProxy> r3 = r6.mPendingImages     // Catch: java.lang.Throwable -> L9
            androidx.camera.core.ImageInfo r4 = r2.getImageInfo()     // Catch: java.lang.Throwable -> L9
            long r4 = r4.getTimestamp()     // Catch: java.lang.Throwable -> L9
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> L9
            r6.matchImages()     // Catch: java.lang.Throwable -> L9
            goto L51
        L46:
            r7 = move-exception
            goto L5f
        L48:
            r2 = move-exception
            java.lang.String r3 = "MetadataImageReader"
            java.lang.String r4 = "Failed to acquire next image."
            androidx.camera.core.Logger.d(r3, r4, r2)     // Catch: java.lang.Throwable -> L46
            r2 = 0
        L51:
            if (r2 == 0) goto L5d
            int r2 = r6.mUnAcquiredAvailableImageCount     // Catch: java.lang.Throwable -> L9
            if (r2 <= 0) goto L5d
            int r2 = r7.getMaxImages()     // Catch: java.lang.Throwable -> L9
            if (r1 < r2) goto L27
        L5d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L5f:
            throw r7     // Catch: java.lang.Throwable -> L9
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r7
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public void onImageClose(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r2) {
            r1 = this;
            java.lang.Object r0 = r1.mLock
            monitor-enter(r0)
            r1.dequeImageProxy(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    void resultIncoming(androidx.camera.core.impl.CameraCaptureResult r6) {
            r5 = this;
            java.lang.Object r0 = r5.mLock
            monitor-enter(r0)
            boolean r1 = r5.mClosed     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r6 = move-exception
            goto L1e
        Lb:
            android.util.LongSparseArray<androidx.camera.core.ImageInfo> r1 = r5.mPendingImageInfos     // Catch: java.lang.Throwable -> L9
            long r2 = r6.getTimestamp()     // Catch: java.lang.Throwable -> L9
            androidx.camera.core.internal.CameraCaptureResultImageInfo r4 = new androidx.camera.core.internal.CameraCaptureResultImageInfo     // Catch: java.lang.Throwable -> L9
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L9
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L9
            r5.matchImages()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r6
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(@androidx.annotation.NonNull androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L1c
            androidx.camera.core.impl.ImageReaderProxy$OnImageAvailableListener r3 = (androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener) r3     // Catch: java.lang.Throwable -> L1c
            r2.mListener = r3     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L1c
            java.util.concurrent.Executor r3 = (java.util.concurrent.Executor) r3     // Catch: java.lang.Throwable -> L1c
            r2.mExecutor = r3     // Catch: java.lang.Throwable -> L1c
            androidx.camera.core.impl.ImageReaderProxy r3 = r2.mImageReaderProxy     // Catch: java.lang.Throwable -> L1c
            androidx.camera.core.impl.ImageReaderProxy$OnImageAvailableListener r1 = r2.mTransformedListener     // Catch: java.lang.Throwable -> L1c
            r3.setOnImageAvailableListener(r1, r4)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r3
    }
}
