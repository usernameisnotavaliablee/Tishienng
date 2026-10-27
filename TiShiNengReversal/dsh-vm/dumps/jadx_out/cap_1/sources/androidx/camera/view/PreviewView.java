package androidx.camera.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class PreviewView extends android.widget.FrameLayout {

    @androidx.annotation.ColorRes
    static final int DEFAULT_BACKGROUND_COLOR = 17170444;
    private static final androidx.camera.view.PreviewView.ImplementationMode DEFAULT_IMPL_MODE = null;
    private static final java.lang.String TAG = "PreviewView";

    @androidx.annotation.Nullable
    final java.util.concurrent.atomic.AtomicReference<androidx.camera.view.PreviewStreamStateObserver> mActiveStreamStateObserver;
    androidx.camera.view.CameraController mCameraController;

    @androidx.annotation.Nullable
    androidx.camera.core.impl.CameraInfoInternal mCameraInfoInternal;

    @androidx.annotation.NonNull
    private final androidx.camera.view.PreviewView.DisplayRotationListener mDisplayRotationListener;

    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    androidx.camera.view.PreviewViewImplementation mImplementation;

    @androidx.annotation.NonNull
    androidx.camera.view.PreviewView.ImplementationMode mImplementationMode;

    @androidx.annotation.Nullable
    androidx.camera.view.PreviewView.OnFrameUpdateListener mOnFrameUpdateListener;

    @androidx.annotation.Nullable
    java.util.concurrent.Executor mOnFrameUpdateListenerExecutor;
    private final android.view.View.OnLayoutChangeListener mOnLayoutChangeListener;

    @androidx.annotation.NonNull
    final androidx.lifecycle.MutableLiveData<androidx.camera.view.PreviewView.StreamState> mPreviewStreamStateLiveData;

    @androidx.annotation.NonNull
    final androidx.camera.view.PreviewTransformation mPreviewTransform;

    @androidx.annotation.NonNull
    androidx.camera.view.PreviewViewMeteringPointFactory mPreviewViewMeteringPointFactory;

    @androidx.annotation.NonNull
    private final android.view.ScaleGestureDetector mScaleGestureDetector;
    final androidx.camera.core.Preview.SurfaceProvider mSurfaceProvider;

    @androidx.annotation.Nullable
    private android.view.MotionEvent mTouchUpEvent;
    boolean mUseDisplayRotation;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.view.PreviewView$1, reason: invalid class name */
    class AnonymousClass1 implements androidx.camera.core.Preview.SurfaceProvider {
        final /* synthetic */ androidx.camera.view.PreviewView this$0;

        AnonymousClass1(androidx.camera.view.PreviewView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ void a(androidx.camera.view.PreviewView.AnonymousClass1 r0, androidx.camera.core.SurfaceRequest r1) {
                androidx.camera.view.PreviewView r0 = r0.this$0
                androidx.camera.core.Preview$SurfaceProvider r0 = r0.mSurfaceProvider
                r0.onSurfaceRequested(r1)
                return
        }

        public static /* synthetic */ void b(androidx.camera.view.PreviewView.AnonymousClass1 r1, androidx.camera.view.PreviewStreamStateObserver r2, androidx.camera.core.impl.CameraInternal r3) {
                androidx.camera.view.PreviewView r1 = r1.this$0
                java.util.concurrent.atomic.AtomicReference<androidx.camera.view.PreviewStreamStateObserver> r1 = r1.mActiveStreamStateObserver
                r0 = 0
                boolean r1 = androidx.camera.view.p.a(r1, r2, r0)
                if (r1 == 0) goto L10
                androidx.camera.view.PreviewView$StreamState r1 = androidx.camera.view.PreviewView.StreamState.IDLE
                r2.updatePreviewStreamState(r1)
            L10:
                r2.clear()
                androidx.camera.core.impl.Observable r1 = r3.getCameraState()
                r1.removeObserver(r2)
                return
        }

        public static /* synthetic */ void c(androidx.camera.view.PreviewView.AnonymousClass1 r3, androidx.camera.core.impl.CameraInternal r4, androidx.camera.core.SurfaceRequest r5, androidx.camera.core.SurfaceRequest.TransformationInfo r6) {
                r3.getClass()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Preview transformation info updated. "
                r0.append(r1)
                r0.append(r6)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "PreviewView"
                androidx.camera.core.Logger.d(r1, r0)
                androidx.camera.core.impl.CameraInfoInternal r4 = r4.getCameraInfoInternal()
                int r4 = r4.getLensFacing()
                r0 = 0
                r1 = 1
                if (r4 != 0) goto L27
                r4 = 1
                goto L28
            L27:
                r4 = 0
            L28:
                androidx.camera.view.PreviewView r2 = r3.this$0
                androidx.camera.view.PreviewTransformation r2 = r2.mPreviewTransform
                android.util.Size r5 = r5.getResolution()
                r2.setTransformationInfo(r6, r5, r4)
                int r4 = r6.getTargetRotation()
                r5 = -1
                if (r4 == r5) goto L48
                androidx.camera.view.PreviewView r4 = r3.this$0
                androidx.camera.view.PreviewViewImplementation r5 = r4.mImplementation
                if (r5 == 0) goto L45
                boolean r5 = r5 instanceof androidx.camera.view.SurfaceViewImplementation
                if (r5 == 0) goto L45
                goto L48
            L45:
                r4.mUseDisplayRotation = r0
                goto L4c
            L48:
                androidx.camera.view.PreviewView r4 = r3.this$0
                r4.mUseDisplayRotation = r1
            L4c:
                androidx.camera.view.PreviewView r3 = r3.this$0
                r3.redrawPreview()
                return
        }

        @Override // androidx.camera.core.Preview.SurfaceProvider
        @androidx.annotation.AnyThread
        public void onSurfaceRequested(@androidx.annotation.NonNull androidx.camera.core.SurfaceRequest r6) {
                r5 = this;
                boolean r0 = androidx.camera.core.impl.utils.Threads.isMainThread()
                if (r0 != 0) goto L19
                androidx.camera.view.PreviewView r0 = r5.this$0
                android.content.Context r0 = r0.getContext()
                java.util.concurrent.Executor r0 = androidx.core.content.ContextCompat.getMainExecutor(r0)
                androidx.camera.view.q r1 = new androidx.camera.view.q
                r1.<init>(r5, r6)
                r0.execute(r1)
                return
            L19:
                java.lang.String r0 = "PreviewView"
                java.lang.String r1 = "Surface requested by Preview."
                androidx.camera.core.Logger.d(r0, r1)
                androidx.camera.core.impl.CameraInternal r0 = r6.getCamera()
                androidx.camera.view.PreviewView r1 = r5.this$0
                androidx.camera.core.impl.CameraInfoInternal r2 = r0.getCameraInfoInternal()
                r1.mCameraInfoInternal = r2
                androidx.camera.view.PreviewView r1 = r5.this$0
                android.content.Context r1 = r1.getContext()
                java.util.concurrent.Executor r1 = androidx.core.content.ContextCompat.getMainExecutor(r1)
                androidx.camera.view.s r2 = new androidx.camera.view.s
                r2.<init>(r5, r0, r6)
                r6.setTransformationInfoListener(r1, r2)
                androidx.camera.view.PreviewView r1 = r5.this$0
                androidx.camera.view.PreviewViewImplementation r2 = r1.mImplementation
                androidx.camera.view.PreviewView$ImplementationMode r1 = r1.mImplementationMode
                boolean r1 = androidx.camera.view.PreviewView.shouldReuseImplementation(r2, r6, r1)
                if (r1 != 0) goto L69
                androidx.camera.view.PreviewView r1 = r5.this$0
                androidx.camera.view.PreviewView$ImplementationMode r2 = r1.mImplementationMode
                boolean r2 = androidx.camera.view.PreviewView.shouldUseTextureView(r6, r2)
                if (r2 == 0) goto L5e
                androidx.camera.view.TextureViewImplementation r2 = new androidx.camera.view.TextureViewImplementation
                androidx.camera.view.PreviewView r3 = r5.this$0
                androidx.camera.view.PreviewTransformation r4 = r3.mPreviewTransform
                r2.<init>(r3, r4)
                goto L67
            L5e:
                androidx.camera.view.SurfaceViewImplementation r2 = new androidx.camera.view.SurfaceViewImplementation
                androidx.camera.view.PreviewView r3 = r5.this$0
                androidx.camera.view.PreviewTransformation r4 = r3.mPreviewTransform
                r2.<init>(r3, r4)
            L67:
                r1.mImplementation = r2
            L69:
                androidx.camera.view.PreviewStreamStateObserver r1 = new androidx.camera.view.PreviewStreamStateObserver
                androidx.camera.core.impl.CameraInfoInternal r2 = r0.getCameraInfoInternal()
                androidx.camera.view.PreviewView r3 = r5.this$0
                androidx.lifecycle.MutableLiveData<androidx.camera.view.PreviewView$StreamState> r4 = r3.mPreviewStreamStateLiveData
                androidx.camera.view.PreviewViewImplementation r3 = r3.mImplementation
                r1.<init>(r2, r4, r3)
                androidx.camera.view.PreviewView r2 = r5.this$0
                java.util.concurrent.atomic.AtomicReference<androidx.camera.view.PreviewStreamStateObserver> r2 = r2.mActiveStreamStateObserver
                r2.set(r1)
                androidx.camera.core.impl.Observable r2 = r0.getCameraState()
                androidx.camera.view.PreviewView r3 = r5.this$0
                android.content.Context r3 = r3.getContext()
                java.util.concurrent.Executor r3 = androidx.core.content.ContextCompat.getMainExecutor(r3)
                r2.addObserver(r3, r1)
                androidx.camera.view.PreviewView r2 = r5.this$0
                androidx.camera.view.PreviewViewImplementation r2 = r2.mImplementation
                androidx.camera.view.t r3 = new androidx.camera.view.t
                r3.<init>(r5, r1, r0)
                r2.onSurfaceRequested(r6, r3)
                androidx.camera.view.PreviewView r6 = r5.this$0
                androidx.camera.view.PreviewView$OnFrameUpdateListener r0 = r6.mOnFrameUpdateListener
                if (r0 == 0) goto Lab
                java.util.concurrent.Executor r1 = r6.mOnFrameUpdateListenerExecutor
                if (r1 == 0) goto Lab
                androidx.camera.view.PreviewViewImplementation r6 = r6.mImplementation
                r6.setFrameUpdateListener(r1, r0)
            Lab:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.view.PreviewView$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$view$PreviewView$ImplementationMode = null;
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$view$PreviewView$ScaleType = null;

        static {
                androidx.camera.view.PreviewView$ImplementationMode[] r0 = androidx.camera.view.PreviewView.ImplementationMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.camera.view.PreviewView.AnonymousClass2.$SwitchMap$androidx$camera$view$PreviewView$ImplementationMode = r0
                r1 = 1
                androidx.camera.view.PreviewView$ImplementationMode r2 = androidx.camera.view.PreviewView.ImplementationMode.COMPATIBLE     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = androidx.camera.view.PreviewView.AnonymousClass2.$SwitchMap$androidx$camera$view$PreviewView$ImplementationMode     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.camera.view.PreviewView$ImplementationMode r3 = androidx.camera.view.PreviewView.ImplementationMode.PERFORMANCE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                androidx.camera.view.PreviewView$ScaleType[] r2 = androidx.camera.view.PreviewView.ScaleType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                androidx.camera.view.PreviewView.AnonymousClass2.$SwitchMap$androidx$camera$view$PreviewView$ScaleType = r2
                androidx.camera.view.PreviewView$ScaleType r3 = androidx.camera.view.PreviewView.ScaleType.FILL_END     // Catch: java.lang.NoSuchFieldError -> L2e
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2e
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L2e
            L2e:
                int[] r1 = androidx.camera.view.PreviewView.AnonymousClass2.$SwitchMap$androidx$camera$view$PreviewView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L38
                androidx.camera.view.PreviewView$ScaleType r2 = androidx.camera.view.PreviewView.ScaleType.FILL_CENTER     // Catch: java.lang.NoSuchFieldError -> L38
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L38
                r1[r2] = r0     // Catch: java.lang.NoSuchFieldError -> L38
            L38:
                int[] r0 = androidx.camera.view.PreviewView.AnonymousClass2.$SwitchMap$androidx$camera$view$PreviewView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L43
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FILL_START     // Catch: java.lang.NoSuchFieldError -> L43
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                int[] r0 = androidx.camera.view.PreviewView.AnonymousClass2.$SwitchMap$androidx$camera$view$PreviewView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L4e
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_END     // Catch: java.lang.NoSuchFieldError -> L4e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4e
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4e
            L4e:
                int[] r0 = androidx.camera.view.PreviewView.AnonymousClass2.$SwitchMap$androidx$camera$view$PreviewView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L59
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_CENTER     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L59:
                int[] r0 = androidx.camera.view.PreviewView.AnonymousClass2.$SwitchMap$androidx$camera$view$PreviewView$ScaleType     // Catch: java.lang.NoSuchFieldError -> L64
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_START     // Catch: java.lang.NoSuchFieldError -> L64
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L64
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L64
            L64:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class DisplayRotationListener implements android.hardware.display.DisplayManager.DisplayListener {
        final /* synthetic */ androidx.camera.view.PreviewView this$0;

        DisplayRotationListener(androidx.camera.view.PreviewView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int r1) {
                r0 = this;
                return
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int r2) {
                r1 = this;
                androidx.camera.view.PreviewView r0 = r1.this$0
                android.view.Display r0 = r0.getDisplay()
                if (r0 == 0) goto L13
                int r0 = r0.getDisplayId()
                if (r0 != r2) goto L13
                androidx.camera.view.PreviewView r2 = r1.this$0
                r2.redrawPreview()
            L13:
                return
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    public enum ImplementationMode extends java.lang.Enum<androidx.camera.view.PreviewView.ImplementationMode> {
        private static final /* synthetic */ androidx.camera.view.PreviewView.ImplementationMode[] $VALUES = null;
        public static final androidx.camera.view.PreviewView.ImplementationMode COMPATIBLE = null;
        public static final androidx.camera.view.PreviewView.ImplementationMode PERFORMANCE = null;
        private final int mId;

        private static /* synthetic */ androidx.camera.view.PreviewView.ImplementationMode[] $values() {
                r0 = 2
                androidx.camera.view.PreviewView$ImplementationMode[] r0 = new androidx.camera.view.PreviewView.ImplementationMode[r0]
                androidx.camera.view.PreviewView$ImplementationMode r1 = androidx.camera.view.PreviewView.ImplementationMode.PERFORMANCE
                r2 = 0
                r0[r2] = r1
                androidx.camera.view.PreviewView$ImplementationMode r1 = androidx.camera.view.PreviewView.ImplementationMode.COMPATIBLE
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.view.PreviewView$ImplementationMode r0 = new androidx.camera.view.PreviewView$ImplementationMode
                java.lang.String r1 = "PERFORMANCE"
                r2 = 0
                r0.<init>(r1, r2, r2)
                androidx.camera.view.PreviewView.ImplementationMode.PERFORMANCE = r0
                androidx.camera.view.PreviewView$ImplementationMode r0 = new androidx.camera.view.PreviewView$ImplementationMode
                java.lang.String r1 = "COMPATIBLE"
                r2 = 1
                r0.<init>(r1, r2, r2)
                androidx.camera.view.PreviewView.ImplementationMode.COMPATIBLE = r0
                androidx.camera.view.PreviewView$ImplementationMode[] r0 = $values()
                androidx.camera.view.PreviewView.ImplementationMode.$VALUES = r0
                return
        }

        ImplementationMode(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.mId = r3
                return
        }

        static androidx.camera.view.PreviewView.ImplementationMode fromId(int r5) {
                androidx.camera.view.PreviewView$ImplementationMode[] r0 = values()
                int r1 = r0.length
                r2 = 0
            L6:
                if (r2 >= r1) goto L12
                r3 = r0[r2]
                int r4 = r3.mId
                if (r4 != r5) goto Lf
                return r3
            Lf:
                int r2 = r2 + 1
                goto L6
            L12:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unknown implementation mode id "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
        }

        public static androidx.camera.view.PreviewView.ImplementationMode valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.view.PreviewView$ImplementationMode> r0 = androidx.camera.view.PreviewView.ImplementationMode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.view.PreviewView$ImplementationMode r1 = (androidx.camera.view.PreviewView.ImplementationMode) r1
                return r1
        }

        public static androidx.camera.view.PreviewView.ImplementationMode[] values() {
                androidx.camera.view.PreviewView$ImplementationMode[] r0 = androidx.camera.view.PreviewView.ImplementationMode.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.view.PreviewView$ImplementationMode[] r0 = (androidx.camera.view.PreviewView.ImplementationMode[]) r0
                return r0
        }

        int getId() {
                r1 = this;
                int r0 = r1.mId
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public interface OnFrameUpdateListener {
        void onFrameUpdate(long r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class PinchToZoomOnScaleGestureListener extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener {
        final /* synthetic */ androidx.camera.view.PreviewView this$0;

        PinchToZoomOnScaleGestureListener(androidx.camera.view.PreviewView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(android.view.ScaleGestureDetector r2) {
                r1 = this;
                androidx.camera.view.PreviewView r0 = r1.this$0
                androidx.camera.view.CameraController r0 = r0.mCameraController
                if (r0 == 0) goto Ld
                float r2 = r2.getScaleFactor()
                r0.onPinchToZoom(r2)
            Ld:
                r2 = 1
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    public enum ScaleType extends java.lang.Enum<androidx.camera.view.PreviewView.ScaleType> {
        private static final /* synthetic */ androidx.camera.view.PreviewView.ScaleType[] $VALUES = null;
        public static final androidx.camera.view.PreviewView.ScaleType FILL_CENTER = null;
        public static final androidx.camera.view.PreviewView.ScaleType FILL_END = null;
        public static final androidx.camera.view.PreviewView.ScaleType FILL_START = null;
        public static final androidx.camera.view.PreviewView.ScaleType FIT_CENTER = null;
        public static final androidx.camera.view.PreviewView.ScaleType FIT_END = null;
        public static final androidx.camera.view.PreviewView.ScaleType FIT_START = null;
        private final int mId;

        private static /* synthetic */ androidx.camera.view.PreviewView.ScaleType[] $values() {
                r0 = 6
                androidx.camera.view.PreviewView$ScaleType[] r0 = new androidx.camera.view.PreviewView.ScaleType[r0]
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FILL_START
                r2 = 0
                r0[r2] = r1
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FILL_CENTER
                r2 = 1
                r0[r2] = r1
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FILL_END
                r2 = 2
                r0[r2] = r1
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_START
                r2 = 3
                r0[r2] = r1
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_CENTER
                r2 = 4
                r0[r2] = r1
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_END
                r2 = 5
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.view.PreviewView$ScaleType r0 = new androidx.camera.view.PreviewView$ScaleType
                java.lang.String r1 = "FILL_START"
                r2 = 0
                r0.<init>(r1, r2, r2)
                androidx.camera.view.PreviewView.ScaleType.FILL_START = r0
                androidx.camera.view.PreviewView$ScaleType r0 = new androidx.camera.view.PreviewView$ScaleType
                java.lang.String r1 = "FILL_CENTER"
                r2 = 1
                r0.<init>(r1, r2, r2)
                androidx.camera.view.PreviewView.ScaleType.FILL_CENTER = r0
                androidx.camera.view.PreviewView$ScaleType r0 = new androidx.camera.view.PreviewView$ScaleType
                java.lang.String r1 = "FILL_END"
                r2 = 2
                r0.<init>(r1, r2, r2)
                androidx.camera.view.PreviewView.ScaleType.FILL_END = r0
                androidx.camera.view.PreviewView$ScaleType r0 = new androidx.camera.view.PreviewView$ScaleType
                java.lang.String r1 = "FIT_START"
                r2 = 3
                r0.<init>(r1, r2, r2)
                androidx.camera.view.PreviewView.ScaleType.FIT_START = r0
                androidx.camera.view.PreviewView$ScaleType r0 = new androidx.camera.view.PreviewView$ScaleType
                java.lang.String r1 = "FIT_CENTER"
                r2 = 4
                r0.<init>(r1, r2, r2)
                androidx.camera.view.PreviewView.ScaleType.FIT_CENTER = r0
                androidx.camera.view.PreviewView$ScaleType r0 = new androidx.camera.view.PreviewView$ScaleType
                java.lang.String r1 = "FIT_END"
                r2 = 5
                r0.<init>(r1, r2, r2)
                androidx.camera.view.PreviewView.ScaleType.FIT_END = r0
                androidx.camera.view.PreviewView$ScaleType[] r0 = $values()
                androidx.camera.view.PreviewView.ScaleType.$VALUES = r0
                return
        }

        ScaleType(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.mId = r3
                return
        }

        static androidx.camera.view.PreviewView.ScaleType fromId(int r5) {
                androidx.camera.view.PreviewView$ScaleType[] r0 = values()
                int r1 = r0.length
                r2 = 0
            L6:
                if (r2 >= r1) goto L12
                r3 = r0[r2]
                int r4 = r3.mId
                if (r4 != r5) goto Lf
                return r3
            Lf:
                int r2 = r2 + 1
                goto L6
            L12:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unknown scale type id "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
        }

        public static androidx.camera.view.PreviewView.ScaleType valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.view.PreviewView$ScaleType> r0 = androidx.camera.view.PreviewView.ScaleType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.view.PreviewView$ScaleType r1 = (androidx.camera.view.PreviewView.ScaleType) r1
                return r1
        }

        public static androidx.camera.view.PreviewView.ScaleType[] values() {
                androidx.camera.view.PreviewView$ScaleType[] r0 = androidx.camera.view.PreviewView.ScaleType.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.view.PreviewView$ScaleType[] r0 = (androidx.camera.view.PreviewView.ScaleType[]) r0
                return r0
        }

        int getId() {
                r1 = this;
                int r0 = r1.mId
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum StreamState extends java.lang.Enum<androidx.camera.view.PreviewView.StreamState> {
        private static final /* synthetic */ androidx.camera.view.PreviewView.StreamState[] $VALUES = null;
        public static final androidx.camera.view.PreviewView.StreamState IDLE = null;
        public static final androidx.camera.view.PreviewView.StreamState STREAMING = null;

        private static /* synthetic */ androidx.camera.view.PreviewView.StreamState[] $values() {
                r0 = 2
                androidx.camera.view.PreviewView$StreamState[] r0 = new androidx.camera.view.PreviewView.StreamState[r0]
                androidx.camera.view.PreviewView$StreamState r1 = androidx.camera.view.PreviewView.StreamState.IDLE
                r2 = 0
                r0[r2] = r1
                androidx.camera.view.PreviewView$StreamState r1 = androidx.camera.view.PreviewView.StreamState.STREAMING
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.view.PreviewView$StreamState r0 = new androidx.camera.view.PreviewView$StreamState
                java.lang.String r1 = "IDLE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.view.PreviewView.StreamState.IDLE = r0
                androidx.camera.view.PreviewView$StreamState r0 = new androidx.camera.view.PreviewView$StreamState
                java.lang.String r1 = "STREAMING"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.view.PreviewView.StreamState.STREAMING = r0
                androidx.camera.view.PreviewView$StreamState[] r0 = $values()
                androidx.camera.view.PreviewView.StreamState.$VALUES = r0
                return
        }

        StreamState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.view.PreviewView.StreamState valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.view.PreviewView$StreamState> r0 = androidx.camera.view.PreviewView.StreamState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.view.PreviewView$StreamState r1 = (androidx.camera.view.PreviewView.StreamState) r1
                return r1
        }

        public static androidx.camera.view.PreviewView.StreamState[] values() {
                androidx.camera.view.PreviewView$StreamState[] r0 = androidx.camera.view.PreviewView.StreamState.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.view.PreviewView$StreamState[] r0 = (androidx.camera.view.PreviewView.StreamState[]) r0
                return r0
        }
    }

    static {
            androidx.camera.view.PreviewView$ImplementationMode r0 = androidx.camera.view.PreviewView.ImplementationMode.PERFORMANCE
            androidx.camera.view.PreviewView.DEFAULT_IMPL_MODE = r0
            return
    }

    @androidx.annotation.UiThread
    public PreviewView(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    @androidx.annotation.UiThread
    public PreviewView(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    @androidx.annotation.UiThread
    public PreviewView(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    @androidx.annotation.UiThread
    public PreviewView(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.Nullable android.util.AttributeSet r12, int r13, int r14) {
            r10 = this;
            r10.<init>(r11, r12, r13, r14)
            androidx.camera.view.PreviewView$ImplementationMode r0 = androidx.camera.view.PreviewView.DEFAULT_IMPL_MODE
            r10.mImplementationMode = r0
            androidx.camera.view.PreviewTransformation r1 = new androidx.camera.view.PreviewTransformation
            r1.<init>()
            r10.mPreviewTransform = r1
            r2 = 1
            r10.mUseDisplayRotation = r2
            androidx.lifecycle.MutableLiveData r2 = new androidx.lifecycle.MutableLiveData
            androidx.camera.view.PreviewView$StreamState r3 = androidx.camera.view.PreviewView.StreamState.IDLE
            r2.<init>(r3)
            r10.mPreviewStreamStateLiveData = r2
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r10.mActiveStreamStateObserver = r2
            androidx.camera.view.PreviewViewMeteringPointFactory r2 = new androidx.camera.view.PreviewViewMeteringPointFactory
            r2.<init>(r1)
            r10.mPreviewViewMeteringPointFactory = r2
            androidx.camera.view.PreviewView$DisplayRotationListener r2 = new androidx.camera.view.PreviewView$DisplayRotationListener
            r2.<init>(r10)
            r10.mDisplayRotationListener = r2
            androidx.camera.view.o r2 = new androidx.camera.view.o
            r2.<init>(r10)
            r10.mOnLayoutChangeListener = r2
            androidx.camera.view.PreviewView$1 r2 = new androidx.camera.view.PreviewView$1
            r2.<init>(r10)
            r10.mSurfaceProvider = r2
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            android.content.res.Resources$Theme r2 = r11.getTheme()
            int[] r5 = androidx.camera.view.R.styleable.PreviewView
            android.content.res.TypedArray r7 = r2.obtainStyledAttributes(r12, r5, r13, r14)
            r3 = r10
            r4 = r11
            r6 = r12
            r8 = r13
            r9 = r14
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r3, r4, r5, r6, r7, r8, r9)
            int r11 = androidx.camera.view.R.styleable.PreviewView_scaleType     // Catch: java.lang.Throwable -> L9c
            androidx.camera.view.PreviewView$ScaleType r12 = r1.getScaleType()     // Catch: java.lang.Throwable -> L9c
            int r12 = r12.getId()     // Catch: java.lang.Throwable -> L9c
            int r11 = r7.getInteger(r11, r12)     // Catch: java.lang.Throwable -> L9c
            androidx.camera.view.PreviewView$ScaleType r11 = androidx.camera.view.PreviewView.ScaleType.fromId(r11)     // Catch: java.lang.Throwable -> L9c
            r10.setScaleType(r11)     // Catch: java.lang.Throwable -> L9c
            int r11 = androidx.camera.view.R.styleable.PreviewView_implementationMode     // Catch: java.lang.Throwable -> L9c
            int r12 = r0.getId()     // Catch: java.lang.Throwable -> L9c
            int r11 = r7.getInteger(r11, r12)     // Catch: java.lang.Throwable -> L9c
            androidx.camera.view.PreviewView$ImplementationMode r11 = androidx.camera.view.PreviewView.ImplementationMode.fromId(r11)     // Catch: java.lang.Throwable -> L9c
            r10.setImplementationMode(r11)     // Catch: java.lang.Throwable -> L9c
            r7.recycle()
            android.view.ScaleGestureDetector r11 = new android.view.ScaleGestureDetector
            androidx.camera.view.PreviewView$PinchToZoomOnScaleGestureListener r12 = new androidx.camera.view.PreviewView$PinchToZoomOnScaleGestureListener
            r12.<init>(r10)
            r11.<init>(r4, r12)
            r3.mScaleGestureDetector = r11
            android.graphics.drawable.Drawable r11 = r10.getBackground()
            if (r11 != 0) goto L9b
            android.content.Context r11 = r10.getContext()
            r12 = 17170444(0x106000c, float:2.4611947E-38)
            int r11 = androidx.core.content.ContextCompat.getColor(r11, r12)
            r10.setBackgroundColor(r11)
        L9b:
            return
        L9c:
            r0 = move-exception
            r11 = r0
            r7.recycle()
            throw r11
    }

    public static /* synthetic */ void a(androidx.camera.view.PreviewView r0, android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0.getClass()
            int r4 = r4 - r2
            int r8 = r8 - r6
            if (r4 != r8) goto Ld
            int r5 = r5 - r3
            int r9 = r9 - r7
            if (r5 == r9) goto Lc
            goto Ld
        Lc:
            return
        Ld:
            r0.redrawPreview()
            r1 = 1
            r0.attachToControllerIfReady(r1)
            return
    }

    @androidx.annotation.MainThread
    private void attachToControllerIfReady(boolean r4) {
            r3 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.ViewPort r0 = r3.getViewPort()
            androidx.camera.view.CameraController r1 = r3.mCameraController
            if (r1 == 0) goto L2b
            if (r0 == 0) goto L2b
            boolean r1 = r3.isAttachedToWindow()
            if (r1 == 0) goto L2b
            androidx.camera.view.CameraController r1 = r3.mCameraController     // Catch: java.lang.IllegalStateException -> L1d
            androidx.camera.core.Preview$SurfaceProvider r2 = r3.getSurfaceProvider()     // Catch: java.lang.IllegalStateException -> L1d
            r1.attachPreviewSurface(r2, r0)     // Catch: java.lang.IllegalStateException -> L1d
            return
        L1d:
            r0 = move-exception
            if (r4 == 0) goto L2a
            java.lang.String r4 = "PreviewView"
            java.lang.String r1 = r0.toString()
            androidx.camera.core.Logger.e(r4, r1, r0)
            return
        L2a:
            throw r0
        L2b:
            return
    }

    @androidx.annotation.Nullable
    private android.hardware.display.DisplayManager getDisplayManager() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = "display"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            return r0
    }

    private int getViewPortScaleType() {
            r3 = this;
            int[] r0 = androidx.camera.view.PreviewView.AnonymousClass2.$SwitchMap$androidx$camera$view$PreviewView$ScaleType
            androidx.camera.view.PreviewView$ScaleType r1 = r3.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L30;
                case 2: goto L2e;
                case 3: goto L2c;
                case 4: goto L2a;
                case 5: goto L2a;
                case 6: goto L2a;
                default: goto Lf;
            }
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected scale type: "
            r1.append(r2)
            androidx.camera.view.PreviewView$ScaleType r2 = r3.getScaleType()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2a:
            r0 = 3
            return r0
        L2c:
            r0 = 0
            return r0
        L2e:
            r0 = 1
            return r0
        L30:
            r0 = 2
            return r0
    }

    @androidx.annotation.VisibleForTesting
    static boolean shouldReuseImplementation(@androidx.annotation.Nullable androidx.camera.view.PreviewViewImplementation r0, @androidx.annotation.NonNull androidx.camera.core.SurfaceRequest r1, @androidx.annotation.NonNull androidx.camera.view.PreviewView.ImplementationMode r2) {
            boolean r0 = r0 instanceof androidx.camera.view.SurfaceViewImplementation
            if (r0 == 0) goto Lc
            boolean r0 = shouldUseTextureView(r1, r2)
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    static boolean shouldUseTextureView(@androidx.annotation.NonNull androidx.camera.core.SurfaceRequest r5, @androidx.annotation.NonNull androidx.camera.view.PreviewView.ImplementationMode r6) {
            androidx.camera.core.impl.CameraInternal r5 = r5.getCamera()
            androidx.camera.core.impl.CameraInfoInternal r5 = r5.getCameraInfoInternal()
            java.lang.String r5 = r5.getImplementationType()
            java.lang.String r0 = "androidx.camera.camera2.legacy"
            boolean r5 = r5.equals(r0)
            java.lang.Class<androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk> r0 = androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.view.internal.compat.quirk.DeviceQuirks.get(r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L27
            java.lang.Class<androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk> r0 = androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.view.internal.compat.quirk.DeviceQuirks.get(r0)
            if (r0 == 0) goto L25
            goto L27
        L25:
            r0 = 0
            goto L28
        L27:
            r0 = 1
        L28:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 <= r4) goto L58
            if (r5 != 0) goto L58
            if (r0 == 0) goto L33
            goto L58
        L33:
            int[] r5 = androidx.camera.view.PreviewView.AnonymousClass2.$SwitchMap$androidx$camera$view$PreviewView$ImplementationMode
            int r0 = r6.ordinal()
            r5 = r5[r0]
            if (r5 == r2) goto L58
            r0 = 2
            if (r5 != r0) goto L41
            return r1
        L41:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid implementation mode: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L58:
            return r2
    }

    private void startListeningToDisplayChange() {
            r4 = this;
            android.hardware.display.DisplayManager r0 = r4.getDisplayManager()
            if (r0 != 0) goto L7
            return
        L7:
            androidx.camera.view.PreviewView$DisplayRotationListener r1 = r4.mDisplayRotationListener
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            r0.registerDisplayListener(r1, r2)
            return
    }

    private void stopListeningToDisplayChange() {
            r2 = this;
            android.hardware.display.DisplayManager r0 = r2.getDisplayManager()
            if (r0 != 0) goto L7
            return
        L7:
            androidx.camera.view.PreviewView$DisplayRotationListener r1 = r2.mDisplayRotationListener
            r0.unregisterDisplayListener(r1)
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.UiThread
    public android.graphics.Bitmap getBitmap() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.view.PreviewViewImplementation r0 = r1.mImplementation
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            android.graphics.Bitmap r0 = r0.getBitmap()
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.UiThread
    public androidx.camera.view.CameraController getController() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.view.CameraController r0 = r1.mCameraController
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.UiThread
    public androidx.camera.view.PreviewView.ImplementationMode getImplementationMode() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.view.PreviewView$ImplementationMode r0 = r1.mImplementationMode
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.UiThread
    public androidx.camera.core.MeteringPointFactory getMeteringPointFactory() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.view.PreviewViewMeteringPointFactory r0 = r1.mPreviewViewMeteringPointFactory
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.camera.view.TransformExperimental
    public androidx.camera.view.transform.OutputTransform getOutputTransform() {
            r5 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r0 = 0
            androidx.camera.view.PreviewTransformation r1 = r5.mPreviewTransform     // Catch: java.lang.IllegalStateException -> L1c
            android.util.Size r2 = new android.util.Size     // Catch: java.lang.IllegalStateException -> L1c
            int r3 = r5.getWidth()     // Catch: java.lang.IllegalStateException -> L1c
            int r4 = r5.getHeight()     // Catch: java.lang.IllegalStateException -> L1c
            r2.<init>(r3, r4)     // Catch: java.lang.IllegalStateException -> L1c
            int r3 = r5.getLayoutDirection()     // Catch: java.lang.IllegalStateException -> L1c
            android.graphics.Matrix r1 = r1.getSurfaceToPreviewViewMatrix(r2, r3)     // Catch: java.lang.IllegalStateException -> L1c
            goto L1e
        L1c:
            r1 = r0
        L1e:
            androidx.camera.view.PreviewTransformation r2 = r5.mPreviewTransform
            android.graphics.Rect r2 = r2.getSurfaceCropRect()
            java.lang.String r3 = "PreviewView"
            if (r1 == 0) goto L62
            if (r2 != 0) goto L2b
            goto L62
        L2b:
            android.graphics.Matrix r0 = androidx.camera.core.impl.utils.TransformUtils.getNormalizedToBuffer(r2)
            r1.preConcat(r0)
            androidx.camera.view.PreviewViewImplementation r0 = r5.mImplementation
            boolean r0 = r0 instanceof androidx.camera.view.TextureViewImplementation
            if (r0 == 0) goto L40
            android.graphics.Matrix r0 = r5.getMatrix()
            r1.postConcat(r0)
            goto L4f
        L40:
            android.graphics.Matrix r0 = r5.getMatrix()
            boolean r0 = r0.isIdentity()
            if (r0 != 0) goto L4f
            java.lang.String r0 = "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly."
            androidx.camera.core.Logger.w(r3, r0)
        L4f:
            androidx.camera.view.transform.OutputTransform r0 = new androidx.camera.view.transform.OutputTransform
            android.util.Size r3 = new android.util.Size
            int r4 = r2.width()
            int r2 = r2.height()
            r3.<init>(r4, r2)
            r0.<init>(r1, r3)
            return r0
        L62:
            java.lang.String r1 = "Transform info is not ready"
            androidx.camera.core.Logger.d(r3, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.lifecycle.LiveData<androidx.camera.view.PreviewView.StreamState> getPreviewStreamState() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<androidx.camera.view.PreviewView$StreamState> r0 = r1.mPreviewStreamStateLiveData
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.UiThread
    public androidx.camera.view.PreviewView.ScaleType getScaleType() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.view.PreviewTransformation r0 = r1.mPreviewTransform
            androidx.camera.view.PreviewView$ScaleType r0 = r0.getScaleType()
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public android.graphics.Matrix getSensorToViewTransform() {
            r4 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.view.PreviewTransformation r0 = r4.mPreviewTransform
            android.util.Size r1 = new android.util.Size
            int r2 = r4.getWidth()
            int r3 = r4.getHeight()
            r1.<init>(r2, r3)
            int r2 = r4.getLayoutDirection()
            android.graphics.Matrix r0 = r0.getSensorToViewTransform(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.UiThread
    public androidx.camera.core.Preview.SurfaceProvider getSurfaceProvider() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.Preview$SurfaceProvider r0 = r1.mSurfaceProvider
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.UiThread
    public androidx.camera.core.ViewPort getViewPort() {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            android.view.Display r0 = r1.getDisplay()
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            android.view.Display r0 = r1.getDisplay()
            int r0 = r0.getRotation()
            androidx.camera.core.ViewPort r0 = r1.getViewPort(r0)
            return r0
    }

    @androidx.annotation.Nullable
    @android.annotation.SuppressLint({"WrongConstant"})
    @androidx.annotation.UiThread
    public androidx.camera.core.ViewPort getViewPort(int r5) {
            r4 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            int r0 = r4.getWidth()
            if (r0 == 0) goto L37
            int r0 = r4.getHeight()
            if (r0 != 0) goto L10
            goto L37
        L10:
            androidx.camera.core.ViewPort$Builder r0 = new androidx.camera.core.ViewPort$Builder
            android.util.Rational r1 = new android.util.Rational
            int r2 = r4.getWidth()
            int r3 = r4.getHeight()
            r1.<init>(r2, r3)
            r0.<init>(r1, r5)
            int r5 = r4.getViewPortScaleType()
            androidx.camera.core.ViewPort$Builder r5 = r0.setScaleType(r5)
            int r0 = r4.getLayoutDirection()
            androidx.camera.core.ViewPort$Builder r5 = r5.setLayoutDirection(r0)
            androidx.camera.core.ViewPort r5 = r5.build()
            return r5
        L37:
            r5 = 0
            return r5
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r1.startListeningToDisplayChange()
            android.view.View$OnLayoutChangeListener r0 = r1.mOnLayoutChangeListener
            r1.addOnLayoutChangeListener(r0)
            androidx.camera.view.PreviewViewImplementation r0 = r1.mImplementation
            if (r0 == 0) goto L12
            r0.onAttachedToWindow()
        L12:
            r0 = 1
            r1.attachToControllerIfReady(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            android.view.View$OnLayoutChangeListener r0 = r1.mOnLayoutChangeListener
            r1.removeOnLayoutChangeListener(r0)
            androidx.camera.view.PreviewViewImplementation r0 = r1.mImplementation
            if (r0 == 0) goto Lf
            r0.onDetachedFromWindow()
        Lf:
            androidx.camera.view.CameraController r0 = r1.mCameraController
            if (r0 == 0) goto L16
            r0.clearPreviewSurface()
        L16:
            r1.stopListeningToDisplayChange()
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r10) {
            r9 = this;
            androidx.camera.view.CameraController r0 = r9.mCameraController
            if (r0 != 0) goto L9
            boolean r10 = super.onTouchEvent(r10)
            return r10
        L9:
            int r0 = r10.getPointerCount()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            int r3 = r10.getAction()
            if (r3 != r2) goto L1c
            r3 = 1
            goto L1d
        L1c:
            r3 = 0
        L1d:
            long r4 = r10.getEventTime()
            long r6 = r10.getDownTime()
            long r4 = r4 - r6
            int r6 = android.view.ViewConfiguration.getLongPressTimeout()
            long r6 = (long) r6
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L31
            r4 = 1
            goto L32
        L31:
            r4 = 0
        L32:
            if (r0 == 0) goto L3e
            if (r3 == 0) goto L3e
            if (r4 == 0) goto L3e
            r9.mTouchUpEvent = r10
            r9.performClick()
            return r2
        L3e:
            android.view.ScaleGestureDetector r0 = r9.mScaleGestureDetector
            boolean r0 = r0.onTouchEvent(r10)
            if (r0 != 0) goto L4e
            boolean r10 = super.onTouchEvent(r10)
            if (r10 == 0) goto L4d
            goto L4e
        L4d:
            return r1
        L4e:
            return r2
    }

    @Override // android.view.View
    public boolean performClick() {
            r4 = this;
            androidx.camera.view.CameraController r0 = r4.mCameraController
            if (r0 == 0) goto L2c
            android.view.MotionEvent r0 = r4.mTouchUpEvent
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto Lf
            float r0 = r0.getX()
            goto L15
        Lf:
            int r0 = r4.getWidth()
            float r0 = (float) r0
            float r0 = r0 / r1
        L15:
            android.view.MotionEvent r2 = r4.mTouchUpEvent
            if (r2 == 0) goto L1e
            float r1 = r2.getY()
            goto L25
        L1e:
            int r2 = r4.getHeight()
            float r2 = (float) r2
            float r1 = r2 / r1
        L25:
            androidx.camera.view.CameraController r2 = r4.mCameraController
            androidx.camera.view.PreviewViewMeteringPointFactory r3 = r4.mPreviewViewMeteringPointFactory
            r2.onTapToFocus(r3, r0, r1)
        L2c:
            r0 = 0
            r4.mTouchUpEvent = r0
            boolean r0 = super.performClick()
            return r0
    }

    @androidx.annotation.OptIn(markerClass = {androidx.camera.view.TransformExperimental.class})
    @androidx.annotation.MainThread
    void redrawPreview() {
            r4 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.view.PreviewViewImplementation r0 = r4.mImplementation
            if (r0 == 0) goto Lf
            r4.updateDisplayRotationIfNeeded()
            androidx.camera.view.PreviewViewImplementation r0 = r4.mImplementation
            r0.redrawPreview()
        Lf:
            androidx.camera.view.PreviewViewMeteringPointFactory r0 = r4.mPreviewViewMeteringPointFactory
            android.util.Size r1 = new android.util.Size
            int r2 = r4.getWidth()
            int r3 = r4.getHeight()
            r1.<init>(r2, r3)
            int r2 = r4.getLayoutDirection()
            r0.recalculate(r1, r2)
            androidx.camera.view.CameraController r0 = r4.mCameraController
            if (r0 == 0) goto L30
            android.graphics.Matrix r1 = r4.getSensorToViewTransform()
            r0.updatePreviewViewTransform(r1)
        L30:
            return
    }

    @androidx.annotation.UiThread
    public void setController(@androidx.annotation.Nullable androidx.camera.view.CameraController r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.view.CameraController r0 = r1.mCameraController
            if (r0 == 0) goto Lc
            if (r0 == r2) goto Lc
            r0.clearPreviewSurface()
        Lc:
            r1.mCameraController = r2
            r2 = 0
            r1.attachToControllerIfReady(r2)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setFrameUpdateListener(@androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull androidx.camera.view.PreviewView.OnFrameUpdateListener r4) {
            r2 = this;
            androidx.camera.view.PreviewView$ImplementationMode r0 = r2.mImplementationMode
            androidx.camera.view.PreviewView$ImplementationMode r1 = androidx.camera.view.PreviewView.ImplementationMode.PERFORMANCE
            if (r0 == r1) goto L12
            r2.mOnFrameUpdateListener = r4
            r2.mOnFrameUpdateListenerExecutor = r3
            androidx.camera.view.PreviewViewImplementation r0 = r2.mImplementation
            if (r0 == 0) goto L11
            r0.setFrameUpdateListener(r3, r4)
        L11:
            return
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "PERFORMANCE mode doesn't support frame update listener"
            r3.<init>(r4)
            throw r3
    }

    @androidx.annotation.UiThread
    public void setImplementationMode(@androidx.annotation.NonNull androidx.camera.view.PreviewView.ImplementationMode r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            r1.mImplementationMode = r2
            androidx.camera.view.PreviewView$ImplementationMode r0 = androidx.camera.view.PreviewView.ImplementationMode.PERFORMANCE
            if (r2 != r0) goto L16
            androidx.camera.view.PreviewView$OnFrameUpdateListener r2 = r1.mOnFrameUpdateListener
            if (r2 != 0) goto Le
            goto L16
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "PERFORMANCE mode doesn't support frame update listener"
            r2.<init>(r0)
            throw r2
        L16:
            return
    }

    @androidx.annotation.UiThread
    public void setScaleType(@androidx.annotation.NonNull androidx.camera.view.PreviewView.ScaleType r2) {
            r1 = this;
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.view.PreviewTransformation r0 = r1.mPreviewTransform
            r0.setScaleType(r2)
            r1.redrawPreview()
            r2 = 0
            r1.attachToControllerIfReady(r2)
            return
    }

    void updateDisplayRotationIfNeeded() {
            r4 = this;
            boolean r0 = r4.mUseDisplayRotation
            if (r0 == 0) goto L1f
            android.view.Display r0 = r4.getDisplay()
            if (r0 == 0) goto L1f
            androidx.camera.core.impl.CameraInfoInternal r1 = r4.mCameraInfoInternal
            if (r1 == 0) goto L1f
            androidx.camera.view.PreviewTransformation r2 = r4.mPreviewTransform
            int r3 = r0.getRotation()
            int r1 = r1.getSensorRotationDegrees(r3)
            int r0 = r0.getRotation()
            r2.overrideWithDisplayRotation(r1, r0)
        L1f:
            return
    }
}
