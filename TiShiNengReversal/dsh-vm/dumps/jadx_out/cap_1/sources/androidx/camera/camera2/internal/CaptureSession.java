package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class CaptureSession implements androidx.camera.camera2.internal.CaptureSessionInterface {
    private static final java.lang.String TAG = "CaptureSession";
    private static final long TIMEOUT_GET_SURFACE_IN_MS = 5000;

    @androidx.annotation.NonNull
    @androidx.annotation.GuardedBy("mSessionLock")
    androidx.camera.camera2.impl.CameraEventCallbacks mCameraEventCallbacks;

    @androidx.annotation.NonNull
    @androidx.annotation.GuardedBy("mSessionLock")
    androidx.camera.core.impl.Config mCameraEventOnRepeatingOptions;
    private final android.hardware.camera2.CameraCaptureSession.CaptureCallback mCaptureCallback;

    @androidx.annotation.GuardedBy("mSessionLock")
    private final java.util.List<androidx.camera.core.impl.CaptureConfig> mCaptureConfigs;

    @androidx.annotation.GuardedBy("mSessionLock")
    private final androidx.camera.camera2.internal.CaptureSession.StateCallback mCaptureSessionStateCallback;

    @androidx.annotation.GuardedBy("mSessionLock")
    java.util.List<androidx.camera.core.impl.DeferrableSurface> mConfiguredDeferrableSurfaces;

    @androidx.annotation.GuardedBy("mSessionLock")
    private final java.util.Map<androidx.camera.core.impl.DeferrableSurface, android.view.Surface> mConfiguredSurfaceMap;
    private final androidx.camera.camera2.internal.compat.params.DynamicRangesCompat mDynamicRangesCompat;

    @androidx.annotation.GuardedBy("mSessionLock")
    androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> mReleaseCompleter;

    @androidx.annotation.GuardedBy("mSessionLock")
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> mReleaseFuture;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mSessionLock")
    androidx.camera.core.impl.SessionConfig mSessionConfig;
    final java.lang.Object mSessionLock;

    @androidx.annotation.GuardedBy("mSessionLock")
    androidx.camera.camera2.internal.CaptureSession.State mState;
    final androidx.camera.camera2.internal.compat.workaround.StillCaptureFlow mStillCaptureFlow;

    @androidx.annotation.NonNull
    @androidx.annotation.GuardedBy("mSessionLock")
    java.util.Map<androidx.camera.core.impl.DeferrableSurface, java.lang.Long> mStreamUseCaseMap;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mSessionLock")
    androidx.camera.camera2.internal.SynchronizedCaptureSession mSynchronizedCaptureSession;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("mSessionLock")
    androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener mSynchronizedCaptureSessionOpener;
    final androidx.camera.camera2.internal.compat.workaround.TorchStateReset mTorchStateReset;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.camera2.internal.CaptureSession$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State = null;

        static {
                androidx.camera.camera2.internal.CaptureSession$State[] r0 = androidx.camera.camera2.internal.CaptureSession.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.camera.camera2.internal.CaptureSession.AnonymousClass4.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State = r0
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.UNINITIALIZED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.camera.camera2.internal.CaptureSession.AnonymousClass4.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.camera.camera2.internal.CaptureSession.AnonymousClass4.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.GET_SURFACE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.camera.camera2.internal.CaptureSession.AnonymousClass4.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.OPENING     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.camera.camera2.internal.CaptureSession.AnonymousClass4.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.OPENED     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.camera.camera2.internal.CaptureSession.AnonymousClass4.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.CLOSED     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = androidx.camera.camera2.internal.CaptureSession.AnonymousClass4.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch: java.lang.NoSuchFieldError -> L54
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.RELEASING     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = androidx.camera.camera2.internal.CaptureSession.AnonymousClass4.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch: java.lang.NoSuchFieldError -> L60
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.RELEASED     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum State extends java.lang.Enum<androidx.camera.camera2.internal.CaptureSession.State> {
        private static final /* synthetic */ androidx.camera.camera2.internal.CaptureSession.State[] $VALUES = null;
        public static final androidx.camera.camera2.internal.CaptureSession.State CLOSED = null;
        public static final androidx.camera.camera2.internal.CaptureSession.State GET_SURFACE = null;
        public static final androidx.camera.camera2.internal.CaptureSession.State INITIALIZED = null;
        public static final androidx.camera.camera2.internal.CaptureSession.State OPENED = null;
        public static final androidx.camera.camera2.internal.CaptureSession.State OPENING = null;
        public static final androidx.camera.camera2.internal.CaptureSession.State RELEASED = null;
        public static final androidx.camera.camera2.internal.CaptureSession.State RELEASING = null;
        public static final androidx.camera.camera2.internal.CaptureSession.State UNINITIALIZED = null;

        private static /* synthetic */ androidx.camera.camera2.internal.CaptureSession.State[] $values() {
                r0 = 8
                androidx.camera.camera2.internal.CaptureSession$State[] r0 = new androidx.camera.camera2.internal.CaptureSession.State[r0]
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.UNINITIALIZED
                r2 = 0
                r0[r2] = r1
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.INITIALIZED
                r2 = 1
                r0[r2] = r1
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.GET_SURFACE
                r2 = 2
                r0[r2] = r1
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.OPENING
                r2 = 3
                r0[r2] = r1
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.OPENED
                r2 = 4
                r0[r2] = r1
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.CLOSED
                r2 = 5
                r0[r2] = r1
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.RELEASING
                r2 = 6
                r0[r2] = r1
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.RELEASED
                r2 = 7
                r0[r2] = r1
                return r0
        }

        static {
                androidx.camera.camera2.internal.CaptureSession$State r0 = new androidx.camera.camera2.internal.CaptureSession$State
                java.lang.String r1 = "UNINITIALIZED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.camera.camera2.internal.CaptureSession.State.UNINITIALIZED = r0
                androidx.camera.camera2.internal.CaptureSession$State r0 = new androidx.camera.camera2.internal.CaptureSession$State
                java.lang.String r1 = "INITIALIZED"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.camera.camera2.internal.CaptureSession.State.INITIALIZED = r0
                androidx.camera.camera2.internal.CaptureSession$State r0 = new androidx.camera.camera2.internal.CaptureSession$State
                java.lang.String r1 = "GET_SURFACE"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.camera.camera2.internal.CaptureSession.State.GET_SURFACE = r0
                androidx.camera.camera2.internal.CaptureSession$State r0 = new androidx.camera.camera2.internal.CaptureSession$State
                java.lang.String r1 = "OPENING"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.camera.camera2.internal.CaptureSession.State.OPENING = r0
                androidx.camera.camera2.internal.CaptureSession$State r0 = new androidx.camera.camera2.internal.CaptureSession$State
                java.lang.String r1 = "OPENED"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.camera.camera2.internal.CaptureSession.State.OPENED = r0
                androidx.camera.camera2.internal.CaptureSession$State r0 = new androidx.camera.camera2.internal.CaptureSession$State
                java.lang.String r1 = "CLOSED"
                r2 = 5
                r0.<init>(r1, r2)
                androidx.camera.camera2.internal.CaptureSession.State.CLOSED = r0
                androidx.camera.camera2.internal.CaptureSession$State r0 = new androidx.camera.camera2.internal.CaptureSession$State
                java.lang.String r1 = "RELEASING"
                r2 = 6
                r0.<init>(r1, r2)
                androidx.camera.camera2.internal.CaptureSession.State.RELEASING = r0
                androidx.camera.camera2.internal.CaptureSession$State r0 = new androidx.camera.camera2.internal.CaptureSession$State
                java.lang.String r1 = "RELEASED"
                r2 = 7
                r0.<init>(r1, r2)
                androidx.camera.camera2.internal.CaptureSession.State.RELEASED = r0
                androidx.camera.camera2.internal.CaptureSession$State[] r0 = $values()
                androidx.camera.camera2.internal.CaptureSession.State.$VALUES = r0
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.camera.camera2.internal.CaptureSession.State valueOf(java.lang.String r1) {
                java.lang.Class<androidx.camera.camera2.internal.CaptureSession$State> r0 = androidx.camera.camera2.internal.CaptureSession.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.camera.camera2.internal.CaptureSession$State r1 = (androidx.camera.camera2.internal.CaptureSession.State) r1
                return r1
        }

        public static androidx.camera.camera2.internal.CaptureSession.State[] values() {
                androidx.camera.camera2.internal.CaptureSession$State[] r0 = androidx.camera.camera2.internal.CaptureSession.State.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.camera.camera2.internal.CaptureSession$State[] r0 = (androidx.camera.camera2.internal.CaptureSession.State[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class StateCallback extends androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback {
        final /* synthetic */ androidx.camera.camera2.internal.CaptureSession this$0;

        StateCallback(androidx.camera.camera2.internal.CaptureSession r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onConfigureFailed(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r4) {
                r3 = this;
                androidx.camera.camera2.internal.CaptureSession r4 = r3.this$0
                java.lang.Object r4 = r4.mSessionLock
                monitor-enter(r4)
                int[] r0 = androidx.camera.camera2.internal.CaptureSession.AnonymousClass4.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch: java.lang.Throwable -> L1d
                androidx.camera.camera2.internal.CaptureSession r1 = r3.this$0     // Catch: java.lang.Throwable -> L1d
                androidx.camera.camera2.internal.CaptureSession$State r1 = r1.mState     // Catch: java.lang.Throwable -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.Throwable -> L1d
                r0 = r0[r1]     // Catch: java.lang.Throwable -> L1d
                switch(r0) {
                    case 1: goto L40;
                    case 2: goto L40;
                    case 3: goto L40;
                    case 4: goto L1f;
                    case 5: goto L40;
                    case 6: goto L1f;
                    case 7: goto L1f;
                    case 8: goto L15;
                    default: goto L14;
                }     // Catch: java.lang.Throwable -> L1d
            L14:
                goto L24
            L15:
                java.lang.String r0 = "CaptureSession"
                java.lang.String r1 = "ConfigureFailed callback after change to RELEASED state"
                androidx.camera.core.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L1d
                goto L24
            L1d:
                r0 = move-exception
                goto L5b
            L1f:
                androidx.camera.camera2.internal.CaptureSession r0 = r3.this$0     // Catch: java.lang.Throwable -> L1d
                r0.finishClose()     // Catch: java.lang.Throwable -> L1d
            L24:
                java.lang.String r0 = "CaptureSession"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
                r1.<init>()     // Catch: java.lang.Throwable -> L1d
                java.lang.String r2 = "CameraCaptureSession.onConfigureFailed() "
                r1.append(r2)     // Catch: java.lang.Throwable -> L1d
                androidx.camera.camera2.internal.CaptureSession r2 = r3.this$0     // Catch: java.lang.Throwable -> L1d
                androidx.camera.camera2.internal.CaptureSession$State r2 = r2.mState     // Catch: java.lang.Throwable -> L1d
                r1.append(r2)     // Catch: java.lang.Throwable -> L1d
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1d
                androidx.camera.core.Logger.e(r0, r1)     // Catch: java.lang.Throwable -> L1d
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
                return
            L40:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
                r1.<init>()     // Catch: java.lang.Throwable -> L1d
                java.lang.String r2 = "onConfigureFailed() should not be possible in state: "
                r1.append(r2)     // Catch: java.lang.Throwable -> L1d
                androidx.camera.camera2.internal.CaptureSession r2 = r3.this$0     // Catch: java.lang.Throwable -> L1d
                androidx.camera.camera2.internal.CaptureSession$State r2 = r2.mState     // Catch: java.lang.Throwable -> L1d
                r1.append(r2)     // Catch: java.lang.Throwable -> L1d
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1d
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d
                throw r0     // Catch: java.lang.Throwable -> L1d
            L5b:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
                throw r0
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onConfigured(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r4) {
                r3 = this;
                androidx.camera.camera2.internal.CaptureSession r0 = r3.this$0
                java.lang.Object r0 = r0.mSessionLock
                monitor-enter(r0)
                int[] r1 = androidx.camera.camera2.internal.CaptureSession.AnonymousClass4.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch: java.lang.Throwable -> L19
                androidx.camera.camera2.internal.CaptureSession r2 = r3.this$0     // Catch: java.lang.Throwable -> L19
                androidx.camera.camera2.internal.CaptureSession$State r2 = r2.mState     // Catch: java.lang.Throwable -> L19
                int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L19
                r1 = r1[r2]     // Catch: java.lang.Throwable -> L19
                switch(r1) {
                    case 1: goto L74;
                    case 2: goto L74;
                    case 3: goto L74;
                    case 4: goto L20;
                    case 5: goto L74;
                    case 6: goto L1b;
                    case 7: goto L15;
                    case 8: goto L74;
                    default: goto L14;
                }     // Catch: java.lang.Throwable -> L19
            L14:
                goto L58
            L15:
                r4.close()     // Catch: java.lang.Throwable -> L19
                goto L58
            L19:
                r4 = move-exception
                goto L8f
            L1b:
                androidx.camera.camera2.internal.CaptureSession r1 = r3.this$0     // Catch: java.lang.Throwable -> L19
                r1.mSynchronizedCaptureSession = r4     // Catch: java.lang.Throwable -> L19
                goto L58
            L20:
                androidx.camera.camera2.internal.CaptureSession r1 = r3.this$0     // Catch: java.lang.Throwable -> L19
                androidx.camera.camera2.internal.CaptureSession$State r2 = androidx.camera.camera2.internal.CaptureSession.State.OPENED     // Catch: java.lang.Throwable -> L19
                r1.mState = r2     // Catch: java.lang.Throwable -> L19
                r1.mSynchronizedCaptureSession = r4     // Catch: java.lang.Throwable -> L19
                androidx.camera.core.impl.SessionConfig r4 = r1.mSessionConfig     // Catch: java.lang.Throwable -> L19
                if (r4 == 0) goto L45
                androidx.camera.camera2.impl.CameraEventCallbacks r4 = r1.mCameraEventCallbacks     // Catch: java.lang.Throwable -> L19
                androidx.camera.camera2.impl.CameraEventCallbacks$ComboCameraEventCallback r4 = r4.createComboCallback()     // Catch: java.lang.Throwable -> L19
                java.util.List r4 = r4.onEnableSession()     // Catch: java.lang.Throwable -> L19
                boolean r1 = r4.isEmpty()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto L45
                androidx.camera.camera2.internal.CaptureSession r1 = r3.this$0     // Catch: java.lang.Throwable -> L19
                java.util.List r4 = r1.setupConfiguredSurface(r4)     // Catch: java.lang.Throwable -> L19
                r1.issueBurstCaptureRequest(r4)     // Catch: java.lang.Throwable -> L19
            L45:
                java.lang.String r4 = "CaptureSession"
                java.lang.String r1 = "Attempting to send capture request onConfigured"
                androidx.camera.core.Logger.d(r4, r1)     // Catch: java.lang.Throwable -> L19
                androidx.camera.camera2.internal.CaptureSession r4 = r3.this$0     // Catch: java.lang.Throwable -> L19
                androidx.camera.core.impl.SessionConfig r1 = r4.mSessionConfig     // Catch: java.lang.Throwable -> L19
                r4.issueRepeatingCaptureRequests(r1)     // Catch: java.lang.Throwable -> L19
                androidx.camera.camera2.internal.CaptureSession r4 = r3.this$0     // Catch: java.lang.Throwable -> L19
                r4.issuePendingCaptureRequest()     // Catch: java.lang.Throwable -> L19
            L58:
                java.lang.String r4 = "CaptureSession"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
                r1.<init>()     // Catch: java.lang.Throwable -> L19
                java.lang.String r2 = "CameraCaptureSession.onConfigured() mState="
                r1.append(r2)     // Catch: java.lang.Throwable -> L19
                androidx.camera.camera2.internal.CaptureSession r2 = r3.this$0     // Catch: java.lang.Throwable -> L19
                androidx.camera.camera2.internal.CaptureSession$State r2 = r2.mState     // Catch: java.lang.Throwable -> L19
                r1.append(r2)     // Catch: java.lang.Throwable -> L19
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L19
                androidx.camera.core.Logger.d(r4, r1)     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L74:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L19
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
                r1.<init>()     // Catch: java.lang.Throwable -> L19
                java.lang.String r2 = "onConfigured() should not be possible in state: "
                r1.append(r2)     // Catch: java.lang.Throwable -> L19
                androidx.camera.camera2.internal.CaptureSession r2 = r3.this$0     // Catch: java.lang.Throwable -> L19
                androidx.camera.camera2.internal.CaptureSession$State r2 = r2.mState     // Catch: java.lang.Throwable -> L19
                r1.append(r2)     // Catch: java.lang.Throwable -> L19
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L19
                r4.<init>(r1)     // Catch: java.lang.Throwable -> L19
                throw r4     // Catch: java.lang.Throwable -> L19
            L8f:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r4
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onReady(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r4) {
                r3 = this;
                androidx.camera.camera2.internal.CaptureSession r4 = r3.this$0
                java.lang.Object r4 = r4.mSessionLock
                monitor-enter(r4)
                int[] r0 = androidx.camera.camera2.internal.CaptureSession.AnonymousClass4.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch: java.lang.Throwable -> L30
                androidx.camera.camera2.internal.CaptureSession r1 = r3.this$0     // Catch: java.lang.Throwable -> L30
                androidx.camera.camera2.internal.CaptureSession$State r1 = r1.mState     // Catch: java.lang.Throwable -> L30
                int r1 = r1.ordinal()     // Catch: java.lang.Throwable -> L30
                r0 = r0[r1]     // Catch: java.lang.Throwable -> L30
                r1 = 1
                if (r0 == r1) goto L32
                java.lang.String r0 = "CaptureSession"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
                r1.<init>()     // Catch: java.lang.Throwable -> L30
                java.lang.String r2 = "CameraCaptureSession.onReady() "
                r1.append(r2)     // Catch: java.lang.Throwable -> L30
                androidx.camera.camera2.internal.CaptureSession r2 = r3.this$0     // Catch: java.lang.Throwable -> L30
                androidx.camera.camera2.internal.CaptureSession$State r2 = r2.mState     // Catch: java.lang.Throwable -> L30
                r1.append(r2)     // Catch: java.lang.Throwable -> L30
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L30
                androidx.camera.core.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L30
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L30
                return
            L30:
                r0 = move-exception
                goto L4d
            L32:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
                r1.<init>()     // Catch: java.lang.Throwable -> L30
                java.lang.String r2 = "onReady() should not be possible in state: "
                r1.append(r2)     // Catch: java.lang.Throwable -> L30
                androidx.camera.camera2.internal.CaptureSession r2 = r3.this$0     // Catch: java.lang.Throwable -> L30
                androidx.camera.camera2.internal.CaptureSession$State r2 = r2.mState     // Catch: java.lang.Throwable -> L30
                r1.append(r2)     // Catch: java.lang.Throwable -> L30
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L30
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L30
                throw r0     // Catch: java.lang.Throwable -> L30
            L4d:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L30
                throw r0
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onSessionFinished(@androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSession r4) {
                r3 = this;
                androidx.camera.camera2.internal.CaptureSession r4 = r3.this$0
                java.lang.Object r4 = r4.mSessionLock
                monitor-enter(r4)
                androidx.camera.camera2.internal.CaptureSession r0 = r3.this$0     // Catch: java.lang.Throwable -> L1b
                androidx.camera.camera2.internal.CaptureSession$State r0 = r0.mState     // Catch: java.lang.Throwable -> L1b
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.UNINITIALIZED     // Catch: java.lang.Throwable -> L1b
                if (r0 == r1) goto L1d
                java.lang.String r0 = "CaptureSession"
                java.lang.String r1 = "onSessionFinished()"
                androidx.camera.core.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L1b
                androidx.camera.camera2.internal.CaptureSession r0 = r3.this$0     // Catch: java.lang.Throwable -> L1b
                r0.finishClose()     // Catch: java.lang.Throwable -> L1b
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L1b
                return
            L1b:
                r0 = move-exception
                goto L38
            L1d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
                r1.<init>()     // Catch: java.lang.Throwable -> L1b
                java.lang.String r2 = "onSessionFinished() should not be possible in state: "
                r1.append(r2)     // Catch: java.lang.Throwable -> L1b
                androidx.camera.camera2.internal.CaptureSession r2 = r3.this$0     // Catch: java.lang.Throwable -> L1b
                androidx.camera.camera2.internal.CaptureSession$State r2 = r2.mState     // Catch: java.lang.Throwable -> L1b
                r1.append(r2)     // Catch: java.lang.Throwable -> L1b
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1b
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L1b
                throw r0     // Catch: java.lang.Throwable -> L1b
            L38:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L1b
                throw r0
        }
    }

    CaptureSession(@androidx.annotation.NonNull androidx.camera.camera2.internal.compat.params.DynamicRangesCompat r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mSessionLock = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mCaptureConfigs = r0
            androidx.camera.camera2.internal.CaptureSession$1 r0 = new androidx.camera.camera2.internal.CaptureSession$1
            r0.<init>(r1)
            r1.mCaptureCallback = r0
            androidx.camera.core.impl.OptionsBundle r0 = androidx.camera.core.impl.OptionsBundle.emptyBundle()
            r1.mCameraEventOnRepeatingOptions = r0
            androidx.camera.camera2.impl.CameraEventCallbacks r0 = androidx.camera.camera2.impl.CameraEventCallbacks.createEmptyCallback()
            r1.mCameraEventCallbacks = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mConfiguredSurfaceMap = r0
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r1.mConfiguredDeferrableSurfaces = r0
            androidx.camera.camera2.internal.CaptureSession$State r0 = androidx.camera.camera2.internal.CaptureSession.State.UNINITIALIZED
            r1.mState = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mStreamUseCaseMap = r0
            androidx.camera.camera2.internal.compat.workaround.StillCaptureFlow r0 = new androidx.camera.camera2.internal.compat.workaround.StillCaptureFlow
            r0.<init>()
            r1.mStillCaptureFlow = r0
            androidx.camera.camera2.internal.compat.workaround.TorchStateReset r0 = new androidx.camera.camera2.internal.compat.workaround.TorchStateReset
            r0.<init>()
            r1.mTorchStateReset = r0
            androidx.camera.camera2.internal.CaptureSession$State r0 = androidx.camera.camera2.internal.CaptureSession.State.INITIALIZED
            r1.mState = r0
            r1.mDynamicRangesCompat = r2
            androidx.camera.camera2.internal.CaptureSession$StateCallback r2 = new androidx.camera.camera2.internal.CaptureSession$StateCallback
            r2.<init>(r1)
            r1.mCaptureSessionStateCallback = r2
            return
    }

    public static /* synthetic */ java.lang.Object a(androidx.camera.camera2.internal.CaptureSession r3, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r4) {
            java.lang.Object r0 = r3.mSessionLock
            monitor-enter(r0)
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r1 = r3.mReleaseCompleter     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            java.lang.String r2 = "Release completer expected to be null"
            androidx.core.util.Preconditions.checkState(r1, r2)     // Catch: java.lang.Throwable -> L29
            r3.mReleaseCompleter = r4     // Catch: java.lang.Throwable -> L29
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r4.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "Release[session="
            r4.append(r1)     // Catch: java.lang.Throwable -> L29
            r4.append(r3)     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "]"
            r4.append(r3)     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return r3
        L29:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r3
    }

    public static /* synthetic */ void b(androidx.camera.camera2.internal.CaptureSession r0, android.hardware.camera2.CameraCaptureSession r1, int r2, boolean r3) {
            java.lang.Object r1 = r0.mSessionLock
            monitor-enter(r1)
            androidx.camera.camera2.internal.CaptureSession$State r2 = r0.mState     // Catch: java.lang.Throwable -> Lf
            androidx.camera.camera2.internal.CaptureSession$State r3 = androidx.camera.camera2.internal.CaptureSession.State.OPENED     // Catch: java.lang.Throwable -> Lf
            if (r2 != r3) goto L11
            androidx.camera.core.impl.SessionConfig r2 = r0.mSessionConfig     // Catch: java.lang.Throwable -> Lf
            r0.issueRepeatingCaptureRequests(r2)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r0 = move-exception
            goto L13
        L11:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            return
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture c(androidx.camera.camera2.internal.CaptureSession r0, androidx.camera.core.impl.SessionConfig r1, android.hardware.camera2.CameraDevice r2, java.util.List r3) {
            com.google.common.util.concurrent.ListenableFuture r0 = r0.openCaptureSession(r3, r1, r2)
            return r0
    }

    @androidx.annotation.GuardedBy("mSessionLock")
    private android.hardware.camera2.CameraCaptureSession.CaptureCallback createCamera2CaptureCallback(java.util.List<androidx.camera.core.impl.CameraCaptureCallback> r4, android.hardware.camera2.CameraCaptureSession.CaptureCallback... r5) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            int r2 = r5.length
            int r1 = r1 + r2
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        Lf:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r4.next()
            androidx.camera.core.impl.CameraCaptureCallback r1 = (androidx.camera.core.impl.CameraCaptureCallback) r1
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r1 = androidx.camera.camera2.internal.CaptureCallbackConverter.toCaptureCallback(r1)
            r0.add(r1)
            goto Lf
        L23:
            java.util.Collections.addAll(r0, r5)
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r4 = androidx.camera.camera2.internal.Camera2CaptureCallbacks.createComboCallback(r0)
            return r4
    }

    @androidx.annotation.NonNull
    private androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat getOutputConfigurationCompat(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig.OutputConfig r5, @androidx.annotation.NonNull java.util.Map<androidx.camera.core.impl.DeferrableSurface, android.view.Surface> r6, @androidx.annotation.Nullable java.lang.String r7) {
            r4 = this;
            androidx.camera.core.impl.DeferrableSurface r0 = r5.getSurface()
            java.lang.Object r0 = r6.get(r0)
            android.view.Surface r0 = (android.view.Surface) r0
            java.lang.String r1 = "Surface in OutputConfig not found in configuredSurfaceMap."
            androidx.core.util.Preconditions.checkNotNull(r0, r1)
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat r2 = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat
            int r3 = r5.getSurfaceGroupId()
            r2.<init>(r3, r0)
            if (r7 == 0) goto L1e
            r2.setPhysicalCameraId(r7)
            goto L25
        L1e:
            java.lang.String r7 = r5.getPhysicalCameraId()
            r2.setPhysicalCameraId(r7)
        L25:
            java.util.List r7 = r5.getSharedSurfaces()
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L53
            r2.enableSurfaceSharing()
            java.util.List r7 = r5.getSharedSurfaces()
            java.util.Iterator r7 = r7.iterator()
        L3a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r7.next()
            androidx.camera.core.impl.DeferrableSurface r0 = (androidx.camera.core.impl.DeferrableSurface) r0
            java.lang.Object r0 = r6.get(r0)
            android.view.Surface r0 = (android.view.Surface) r0
            androidx.core.util.Preconditions.checkNotNull(r0, r1)
            r2.addSurface(r0)
            goto L3a
        L53:
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 33
            if (r6 < r7) goto L87
            androidx.camera.camera2.internal.compat.params.DynamicRangesCompat r6 = r4.mDynamicRangesCompat
            android.hardware.camera2.params.DynamicRangeProfiles r6 = r6.toDynamicRangeProfiles()
            if (r6 == 0) goto L87
            androidx.camera.core.DynamicRange r5 = r5.getDynamicRange()
            java.lang.Long r6 = androidx.camera.camera2.internal.compat.params.DynamicRangeConversions.dynamicRangeToFirstSupportedProfile(r5, r6)
            if (r6 != 0) goto L82
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "CaptureSession"
            androidx.camera.core.Logger.e(r6, r5)
            goto L87
        L82:
            long r5 = r6.longValue()
            goto L89
        L87:
            r5 = 1
        L89:
            r2.setDynamicRangeProfile(r5)
            return r2
    }

    @androidx.annotation.NonNull
    private java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> getUniqueOutputConfigurations(@androidx.annotation.NonNull java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        Le:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r5.next()
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat r2 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat) r2
            android.view.Surface r3 = r2.getSurface()
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L25
            goto Le
        L25:
            android.view.Surface r3 = r2.getSurface()
            r0.add(r3)
            r1.add(r2)
            goto Le
        L30:
            return r1
    }

    @androidx.annotation.NonNull
    private static androidx.camera.core.impl.Config mergeOptions(java.util.List<androidx.camera.core.impl.CaptureConfig> r8) {
            androidx.camera.core.impl.MutableOptionsBundle r0 = androidx.camera.core.impl.MutableOptionsBundle.create()
            java.util.Iterator r8 = r8.iterator()
        L8:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L70
            java.lang.Object r1 = r8.next()
            androidx.camera.core.impl.CaptureConfig r1 = (androidx.camera.core.impl.CaptureConfig) r1
            androidx.camera.core.impl.Config r1 = r1.getImplementationOptions()
            java.util.Set r2 = r1.listOptions()
            java.util.Iterator r2 = r2.iterator()
        L20:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8
            java.lang.Object r3 = r2.next()
            androidx.camera.core.impl.Config$Option r3 = (androidx.camera.core.impl.Config.Option) r3
            r4 = 0
            java.lang.Object r5 = r1.retrieveOption(r3, r4)
            boolean r6 = r0.containsOption(r3)
            if (r6 == 0) goto L6c
            java.lang.Object r4 = r0.retrieveOption(r3, r4)
            boolean r6 = java.util.Objects.equals(r4, r5)
            if (r6 != 0) goto L20
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Detect conflicting option "
            r6.append(r7)
            java.lang.String r3 = r3.getId()
            r6.append(r3)
            java.lang.String r3 = " : "
            r6.append(r3)
            r6.append(r5)
            java.lang.String r3 = " != "
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = r6.toString()
            java.lang.String r4 = "CaptureSession"
            androidx.camera.core.Logger.d(r4, r3)
            goto L20
        L6c:
            r0.insertOption(r3, r5)
            goto L20
        L70:
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
    private com.google.common.util.concurrent.ListenableFuture<java.lang.Void> openCaptureSession(@androidx.annotation.NonNull java.util.List<android.view.Surface> r12, @androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r13, @androidx.annotation.NonNull android.hardware.camera2.CameraDevice r14) {
            r11 = this;
            java.lang.Object r0 = r11.mSessionLock
            monitor-enter(r0)
            int[] r1 = androidx.camera.camera2.internal.CaptureSession.AnonymousClass4.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch: java.lang.Throwable -> L37
            androidx.camera.camera2.internal.CaptureSession$State r2 = r11.mState     // Catch: java.lang.Throwable -> L37
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L37
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L37
            r2 = 1
            if (r1 == r2) goto L140
            r3 = 2
            if (r1 == r3) goto L140
            r4 = 3
            r5 = 5
            if (r1 == r4) goto L3a
            if (r1 == r5) goto L140
            java.util.concurrent.CancellationException r12 = new java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L37
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r13.<init>()     // Catch: java.lang.Throwable -> L37
            java.lang.String r14 = "openCaptureSession() not execute in state: "
            r13.append(r14)     // Catch: java.lang.Throwable -> L37
            androidx.camera.camera2.internal.CaptureSession$State r14 = r11.mState     // Catch: java.lang.Throwable -> L37
            r13.append(r14)     // Catch: java.lang.Throwable -> L37
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L37
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L37
            com.google.common.util.concurrent.ListenableFuture r12 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r12)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            return r12
        L37:
            r12 = move-exception
            goto L15e
        L3a:
            java.util.Map<androidx.camera.core.impl.DeferrableSurface, android.view.Surface> r1 = r11.mConfiguredSurfaceMap     // Catch: java.lang.Throwable -> L37
            r1.clear()     // Catch: java.lang.Throwable -> L37
            r1 = 0
            r4 = 0
        L41:
            int r6 = r12.size()     // Catch: java.lang.Throwable -> L37
            if (r4 >= r6) goto L5d
            java.util.Map<androidx.camera.core.impl.DeferrableSurface, android.view.Surface> r6 = r11.mConfiguredSurfaceMap     // Catch: java.lang.Throwable -> L37
            java.util.List<androidx.camera.core.impl.DeferrableSurface> r7 = r11.mConfiguredDeferrableSurfaces     // Catch: java.lang.Throwable -> L37
            java.lang.Object r7 = r7.get(r4)     // Catch: java.lang.Throwable -> L37
            androidx.camera.core.impl.DeferrableSurface r7 = (androidx.camera.core.impl.DeferrableSurface) r7     // Catch: java.lang.Throwable -> L37
            java.lang.Object r8 = r12.get(r4)     // Catch: java.lang.Throwable -> L37
            android.view.Surface r8 = (android.view.Surface) r8     // Catch: java.lang.Throwable -> L37
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> L37
            int r4 = r4 + 1
            goto L41
        L5d:
            androidx.camera.camera2.internal.CaptureSession$State r12 = androidx.camera.camera2.internal.CaptureSession.State.OPENING     // Catch: java.lang.Throwable -> L37
            r11.mState = r12     // Catch: java.lang.Throwable -> L37
            java.lang.String r12 = "CaptureSession"
            java.lang.String r4 = "Opening capture session."
            androidx.camera.core.Logger.d(r12, r4)     // Catch: java.lang.Throwable -> L37
            androidx.camera.camera2.internal.CaptureSession$StateCallback r12 = r11.mCaptureSessionStateCallback     // Catch: java.lang.Throwable -> L37
            androidx.camera.camera2.internal.SynchronizedCaptureSessionStateCallbacks$Adapter r4 = new androidx.camera.camera2.internal.SynchronizedCaptureSessionStateCallbacks$Adapter     // Catch: java.lang.Throwable -> L37
            java.util.List r6 = r13.getSessionStateCallbacks()     // Catch: java.lang.Throwable -> L37
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L37
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback[] r3 = new androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback[r3]     // Catch: java.lang.Throwable -> L37
            r3[r1] = r12     // Catch: java.lang.Throwable -> L37
            r3[r2] = r4     // Catch: java.lang.Throwable -> L37
            androidx.camera.camera2.internal.SynchronizedCaptureSession$StateCallback r12 = androidx.camera.camera2.internal.SynchronizedCaptureSessionStateCallbacks.createComboCallback(r3)     // Catch: java.lang.Throwable -> L37
            androidx.camera.camera2.impl.Camera2ImplConfig r2 = new androidx.camera.camera2.impl.Camera2ImplConfig     // Catch: java.lang.Throwable -> L37
            androidx.camera.core.impl.Config r3 = r13.getImplementationOptions()     // Catch: java.lang.Throwable -> L37
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L37
            androidx.camera.camera2.impl.CameraEventCallbacks r3 = androidx.camera.camera2.impl.CameraEventCallbacks.createEmptyCallback()     // Catch: java.lang.Throwable -> L37
            androidx.camera.camera2.impl.CameraEventCallbacks r3 = r2.getCameraEventCallback(r3)     // Catch: java.lang.Throwable -> L37
            r11.mCameraEventCallbacks = r3     // Catch: java.lang.Throwable -> L37
            androidx.camera.camera2.impl.CameraEventCallbacks$ComboCameraEventCallback r3 = r3.createComboCallback()     // Catch: java.lang.Throwable -> L37
            java.util.List r3 = r3.onInitSession()     // Catch: java.lang.Throwable -> L37
            androidx.camera.core.impl.CaptureConfig r4 = r13.getRepeatingCaptureConfig()     // Catch: java.lang.Throwable -> L37
            androidx.camera.core.impl.CaptureConfig$Builder r4 = androidx.camera.core.impl.CaptureConfig.Builder.from(r4)     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L37
        La4:
            boolean r6 = r3.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r6 == 0) goto Lb8
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Throwable -> L37
            androidx.camera.core.impl.CaptureConfig r6 = (androidx.camera.core.impl.CaptureConfig) r6     // Catch: java.lang.Throwable -> L37
            androidx.camera.core.impl.Config r6 = r6.getImplementationOptions()     // Catch: java.lang.Throwable -> L37
            r4.addImplementationOptions(r6)     // Catch: java.lang.Throwable -> L37
            goto La4
        Lb8:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L37
            r3.<init>()     // Catch: java.lang.Throwable -> L37
            r6 = 0
            java.lang.String r2 = r2.getPhysicalCameraId(r6)     // Catch: java.lang.Throwable -> L37
            java.util.List r6 = r13.getOutputConfigs()     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L37
        Lca:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto Lff
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L37
            androidx.camera.core.impl.SessionConfig$OutputConfig r7 = (androidx.camera.core.impl.SessionConfig.OutputConfig) r7     // Catch: java.lang.Throwable -> L37
            java.util.Map<androidx.camera.core.impl.DeferrableSurface, android.view.Surface> r8 = r11.mConfiguredSurfaceMap     // Catch: java.lang.Throwable -> L37
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat r8 = r11.getOutputConfigurationCompat(r7, r8, r2)     // Catch: java.lang.Throwable -> L37
            java.util.Map<androidx.camera.core.impl.DeferrableSurface, java.lang.Long> r9 = r11.mStreamUseCaseMap     // Catch: java.lang.Throwable -> L37
            androidx.camera.core.impl.DeferrableSurface r10 = r7.getSurface()     // Catch: java.lang.Throwable -> L37
            boolean r9 = r9.containsKey(r10)     // Catch: java.lang.Throwable -> L37
            if (r9 == 0) goto Lfb
            java.util.Map<androidx.camera.core.impl.DeferrableSurface, java.lang.Long> r9 = r11.mStreamUseCaseMap     // Catch: java.lang.Throwable -> L37
            androidx.camera.core.impl.DeferrableSurface r7 = r7.getSurface()     // Catch: java.lang.Throwable -> L37
            java.lang.Object r7 = r9.get(r7)     // Catch: java.lang.Throwable -> L37
            java.lang.Long r7 = (java.lang.Long) r7     // Catch: java.lang.Throwable -> L37
            long r9 = r7.longValue()     // Catch: java.lang.Throwable -> L37
            r8.setStreamUseCase(r9)     // Catch: java.lang.Throwable -> L37
        Lfb:
            r3.add(r8)     // Catch: java.lang.Throwable -> L37
            goto Lca
        Lff:
            java.util.List r2 = r11.getUniqueOutputConfigurations(r3)     // Catch: java.lang.Throwable -> L37
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r3 = r11.mSynchronizedCaptureSessionOpener     // Catch: java.lang.Throwable -> L37
            androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat r12 = r3.createSessionConfigurationCompat(r1, r2, r12)     // Catch: java.lang.Throwable -> L37
            int r1 = r13.getTemplateType()     // Catch: java.lang.Throwable -> L37
            if (r1 != r5) goto L120
            android.hardware.camera2.params.InputConfiguration r1 = r13.getInputConfiguration()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L120
            android.hardware.camera2.params.InputConfiguration r13 = r13.getInputConfiguration()     // Catch: java.lang.Throwable -> L37
            androidx.camera.camera2.internal.compat.params.InputConfigurationCompat r13 = androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.wrap(r13)     // Catch: java.lang.Throwable -> L37
            r12.setInputConfiguration(r13)     // Catch: java.lang.Throwable -> L37
        L120:
            androidx.camera.core.impl.CaptureConfig r13 = r4.build()     // Catch: java.lang.Throwable -> L37 android.hardware.camera2.CameraAccessException -> L12e
            android.hardware.camera2.CaptureRequest r13 = androidx.camera.camera2.internal.Camera2CaptureRequestBuilder.buildWithoutTarget(r13, r14)     // Catch: java.lang.Throwable -> L37 android.hardware.camera2.CameraAccessException -> L12e
            if (r13 == 0) goto L130
            r12.setSessionParameters(r13)     // Catch: java.lang.Throwable -> L37 android.hardware.camera2.CameraAccessException -> L12e
            goto L130
        L12e:
            r12 = move-exception
            goto L13a
        L130:
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r13 = r11.mSynchronizedCaptureSessionOpener     // Catch: java.lang.Throwable -> L37
            java.util.List<androidx.camera.core.impl.DeferrableSurface> r1 = r11.mConfiguredDeferrableSurfaces     // Catch: java.lang.Throwable -> L37
            com.google.common.util.concurrent.ListenableFuture r12 = r13.openCaptureSession(r14, r12, r1)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            return r12
        L13a:
            com.google.common.util.concurrent.ListenableFuture r12 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r12)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            return r12
        L140:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L37
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r13.<init>()     // Catch: java.lang.Throwable -> L37
            java.lang.String r14 = "openCaptureSession() should not be possible in state: "
            r13.append(r14)     // Catch: java.lang.Throwable -> L37
            androidx.camera.camera2.internal.CaptureSession$State r14 = r11.mState     // Catch: java.lang.Throwable -> L37
            r13.append(r14)     // Catch: java.lang.Throwable -> L37
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L37
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L37
            com.google.common.util.concurrent.ListenableFuture r12 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r12)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            return r12
        L15e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r12
    }

    void abortCaptures() {
            r4 = this;
            java.lang.Object r0 = r4.mSessionLock
            monitor-enter(r0)
            androidx.camera.camera2.internal.CaptureSession$State r1 = r4.mState     // Catch: java.lang.Throwable -> L23
            androidx.camera.camera2.internal.CaptureSession$State r2 = androidx.camera.camera2.internal.CaptureSession.State.OPENED     // Catch: java.lang.Throwable -> L23
            if (r1 == r2) goto L25
            java.lang.String r1 = "CaptureSession"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r2.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = "Unable to abort captures. Incorrect state:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L23
            androidx.camera.camera2.internal.CaptureSession$State r3 = r4.mState     // Catch: java.lang.Throwable -> L23
            r2.append(r3)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L23
            androidx.camera.core.Logger.e(r1, r2)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r1 = move-exception
            goto L35
        L25:
            androidx.camera.camera2.internal.SynchronizedCaptureSession r1 = r4.mSynchronizedCaptureSession     // Catch: java.lang.Throwable -> L23 android.hardware.camera2.CameraAccessException -> L2b
            r1.abortCaptures()     // Catch: java.lang.Throwable -> L23 android.hardware.camera2.CameraAccessException -> L2b
            goto L33
        L2b:
            r1 = move-exception
            java.lang.String r2 = "CaptureSession"
            java.lang.String r3 = "Unable to abort captures."
            androidx.camera.core.Logger.e(r2, r3, r1)     // Catch: java.lang.Throwable -> L23
        L33:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r1
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void cancelIssuedCaptureRequests() {
            r3 = this;
            java.lang.Object r0 = r3.mSessionLock
            monitor-enter(r0)
            java.util.List<androidx.camera.core.impl.CaptureConfig> r1 = r3.mCaptureConfigs     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L18
            java.util.List<androidx.camera.core.impl.CaptureConfig> r2 = r3.mCaptureConfigs     // Catch: java.lang.Throwable -> L18
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L18
            java.util.List<androidx.camera.core.impl.CaptureConfig> r2 = r3.mCaptureConfigs     // Catch: java.lang.Throwable -> L18
            r2.clear()     // Catch: java.lang.Throwable -> L18
            goto L1b
        L18:
            r1 = move-exception
            goto L47
        L1a:
            r1 = 0
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L46
            java.util.Iterator r0 = r1.iterator()
        L22:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()
            androidx.camera.core.impl.CaptureConfig r1 = (androidx.camera.core.impl.CaptureConfig) r1
            java.util.List r1 = r1.getCameraCaptureCallbacks()
            java.util.Iterator r1 = r1.iterator()
        L36:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r1.next()
            androidx.camera.core.impl.CameraCaptureCallback r2 = (androidx.camera.core.impl.CameraCaptureCallback) r2
            r2.onCaptureCancelled()
            goto L36
        L46:
            return
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void close() {
            r4 = this;
            java.lang.Object r0 = r4.mSessionLock
            monitor-enter(r0)
            int[] r1 = androidx.camera.camera2.internal.CaptureSession.AnonymousClass4.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch: java.lang.Throwable -> L39
            androidx.camera.camera2.internal.CaptureSession$State r2 = r4.mState     // Catch: java.lang.Throwable -> L39
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L39
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L39
            r2 = 1
            if (r1 == r2) goto L8b
            r2 = 2
            if (r1 == r2) goto L85
            r2 = 3
            if (r1 == r2) goto L68
            r2 = 4
            if (r1 == r2) goto L43
            r2 = 5
            if (r1 == r2) goto L1d
            goto L89
        L1d:
            androidx.camera.core.impl.SessionConfig r1 = r4.mSessionConfig     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L43
            androidx.camera.camera2.impl.CameraEventCallbacks r1 = r4.mCameraEventCallbacks     // Catch: java.lang.Throwable -> L39
            androidx.camera.camera2.impl.CameraEventCallbacks$ComboCameraEventCallback r1 = r1.createComboCallback()     // Catch: java.lang.Throwable -> L39
            java.util.List r1 = r1.onDisableSession()     // Catch: java.lang.Throwable -> L39
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L39
            if (r2 != 0) goto L43
            java.util.List r1 = r4.setupConfiguredSurface(r1)     // Catch: java.lang.Throwable -> L39 java.lang.IllegalStateException -> L3b
            r4.issueCaptureRequests(r1)     // Catch: java.lang.Throwable -> L39 java.lang.IllegalStateException -> L3b
            goto L43
        L39:
            r1 = move-exception
            goto La4
        L3b:
            r1 = move-exception
            java.lang.String r2 = "CaptureSession"
            java.lang.String r3 = "Unable to issue the request before close the capture session"
            androidx.camera.core.Logger.e(r2, r3, r1)     // Catch: java.lang.Throwable -> L39
        L43:
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r1 = r4.mSynchronizedCaptureSessionOpener     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r2.<init>()     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "The Opener shouldn't null in state:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L39
            androidx.camera.camera2.internal.CaptureSession$State r3 = r4.mState     // Catch: java.lang.Throwable -> L39
            r2.append(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L39
            androidx.core.util.Preconditions.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> L39
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r1 = r4.mSynchronizedCaptureSessionOpener     // Catch: java.lang.Throwable -> L39
            r1.stop()     // Catch: java.lang.Throwable -> L39
            androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.CLOSED     // Catch: java.lang.Throwable -> L39
            r4.mState = r1     // Catch: java.lang.Throwable -> L39
            r1 = 0
            r4.mSessionConfig = r1     // Catch: java.lang.Throwable -> L39
            goto L89
        L68:
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r1 = r4.mSynchronizedCaptureSessionOpener     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r2.<init>()     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "The Opener shouldn't null in state:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L39
            androidx.camera.camera2.internal.CaptureSession$State r3 = r4.mState     // Catch: java.lang.Throwable -> L39
            r2.append(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L39
            androidx.core.util.Preconditions.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> L39
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r1 = r4.mSynchronizedCaptureSessionOpener     // Catch: java.lang.Throwable -> L39
            r1.stop()     // Catch: java.lang.Throwable -> L39
        L85:
            androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.RELEASED     // Catch: java.lang.Throwable -> L39
            r4.mState = r1     // Catch: java.lang.Throwable -> L39
        L89:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            return
        L8b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r2.<init>()     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "close() should not be possible in state: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L39
            androidx.camera.camera2.internal.CaptureSession$State r3 = r4.mState     // Catch: java.lang.Throwable -> L39
            r2.append(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L39
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L39
            throw r1     // Catch: java.lang.Throwable -> L39
        La4:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r1
    }

    @androidx.annotation.GuardedBy("mSessionLock")
    void finishClose() {
            r2 = this;
            androidx.camera.camera2.internal.CaptureSession$State r0 = r2.mState
            androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.RELEASED
            if (r0 != r1) goto Le
            java.lang.String r0 = "CaptureSession"
            java.lang.String r1 = "Skipping finishClose due to being state RELEASED."
            androidx.camera.core.Logger.d(r0, r1)
            return
        Le:
            r2.mState = r1
            r0 = 0
            r2.mSynchronizedCaptureSession = r0
            androidx.concurrent.futures.CallbackToFutureAdapter$Completer<java.lang.Void> r1 = r2.mReleaseCompleter
            if (r1 == 0) goto L1c
            r1.set(r0)
            r2.mReleaseCompleter = r0
        L1c:
            return
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.impl.CaptureConfig> getCaptureConfigs() {
            r2 = this;
            java.lang.Object r0 = r2.mSessionLock
            monitor-enter(r0)
            java.util.List<androidx.camera.core.impl.CaptureConfig> r1 = r2.mCaptureConfigs     // Catch: java.lang.Throwable -> Lb
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    @androidx.annotation.Nullable
    public androidx.camera.core.impl.SessionConfig getSessionConfig() {
            r2 = this;
            java.lang.Object r0 = r2.mSessionLock
            monitor-enter(r0)
            androidx.camera.core.impl.SessionConfig r1 = r2.mSessionConfig     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    androidx.camera.camera2.internal.CaptureSession.State getState() {
            r2 = this;
            java.lang.Object r0 = r2.mSessionLock
            monitor-enter(r0)
            androidx.camera.camera2.internal.CaptureSession$State r1 = r2.mState     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    int issueBurstCaptureRequest(java.util.List<androidx.camera.core.impl.CaptureConfig> r11) {
            r10 = this;
            java.lang.Object r0 = r10.mSessionLock
            monitor-enter(r0)
            androidx.camera.camera2.internal.CaptureSession$State r1 = r10.mState     // Catch: java.lang.Throwable -> L13
            androidx.camera.camera2.internal.CaptureSession$State r2 = androidx.camera.camera2.internal.CaptureSession.State.OPENED     // Catch: java.lang.Throwable -> L13
            r3 = -1
            if (r1 == r2) goto L16
            java.lang.String r11 = "CaptureSession"
            java.lang.String r1 = "Skipping issueBurstCaptureRequest due to session closed"
            androidx.camera.core.Logger.d(r11, r1)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r3
        L13:
            r11 = move-exception
            goto L16d
        L16:
            boolean r1 = r11.isEmpty()     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r3
        L1e:
            androidx.camera.camera2.internal.CameraBurstCaptureCallback r1 = new androidx.camera.camera2.internal.CameraBurstCaptureCallback     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            r1.<init>()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            r2.<init>()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            java.lang.String r4 = "CaptureSession"
            java.lang.String r5 = "Issuing capture request."
            androidx.camera.core.Logger.d(r4, r5)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            r4 = 0
        L34:
            boolean r5 = r11.hasNext()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            r6 = 1
            if (r5 == 0) goto L104
            java.lang.Object r5 = r11.next()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            androidx.camera.core.impl.CaptureConfig r5 = (androidx.camera.core.impl.CaptureConfig) r5     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            java.util.List r7 = r5.getSurfaces()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            if (r7 == 0) goto L56
            java.lang.String r5 = "CaptureSession"
            java.lang.String r6 = "Skipping issuing empty capture request."
            androidx.camera.core.Logger.d(r5, r6)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            goto L34
        L53:
            r11 = move-exception
            goto L14e
        L56:
            java.util.List r7 = r5.getSurfaces()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
        L5e:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            if (r8 == 0) goto L89
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            androidx.camera.core.impl.DeferrableSurface r8 = (androidx.camera.core.impl.DeferrableSurface) r8     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            java.util.Map<androidx.camera.core.impl.DeferrableSurface, android.view.Surface> r9 = r10.mConfiguredSurfaceMap     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            boolean r9 = r9.containsKey(r8)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            if (r9 != 0) goto L5e
            java.lang.String r5 = "CaptureSession"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            r6.<init>()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            java.lang.String r7 = "Skipping capture request with invalid surface: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            r6.append(r8)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            androidx.camera.core.Logger.d(r5, r6)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            goto L34
        L89:
            int r7 = r5.getTemplateType()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            r8 = 2
            if (r7 != r8) goto L91
            r4 = 1
        L91:
            androidx.camera.core.impl.CaptureConfig$Builder r6 = androidx.camera.core.impl.CaptureConfig.Builder.from(r5)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            int r7 = r5.getTemplateType()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            r8 = 5
            if (r7 != r8) goto La9
            androidx.camera.core.impl.CameraCaptureResult r7 = r5.getCameraCaptureResult()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            if (r7 == 0) goto La9
            androidx.camera.core.impl.CameraCaptureResult r7 = r5.getCameraCaptureResult()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            r6.setCameraCaptureResult(r7)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
        La9:
            androidx.camera.core.impl.SessionConfig r7 = r10.mSessionConfig     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            if (r7 == 0) goto Lb8
            androidx.camera.core.impl.CaptureConfig r7 = r7.getRepeatingCaptureConfig()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            androidx.camera.core.impl.Config r7 = r7.getImplementationOptions()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            r6.addImplementationOptions(r7)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
        Lb8:
            androidx.camera.core.impl.Config r7 = r10.mCameraEventOnRepeatingOptions     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            r6.addImplementationOptions(r7)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            androidx.camera.core.impl.Config r7 = r5.getImplementationOptions()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            r6.addImplementationOptions(r7)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            androidx.camera.core.impl.CaptureConfig r6 = r6.build()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            androidx.camera.camera2.internal.SynchronizedCaptureSession r7 = r10.mSynchronizedCaptureSession     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            android.hardware.camera2.CameraDevice r7 = r7.getDevice()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            java.util.Map<androidx.camera.core.impl.DeferrableSurface, android.view.Surface> r8 = r10.mConfiguredSurfaceMap     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            android.hardware.camera2.CaptureRequest r6 = androidx.camera.camera2.internal.Camera2CaptureRequestBuilder.build(r6, r7, r8)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            if (r6 != 0) goto Ldf
            java.lang.String r11 = "CaptureSession"
            java.lang.String r1 = "Skipping issuing request without surface."
            androidx.camera.core.Logger.d(r11, r1)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r3
        Ldf:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            r7.<init>()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            java.util.List r5 = r5.getCameraCaptureCallbacks()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
        Lec:
            boolean r8 = r5.hasNext()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            if (r8 == 0) goto Lfc
            java.lang.Object r8 = r5.next()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            androidx.camera.core.impl.CameraCaptureCallback r8 = (androidx.camera.core.impl.CameraCaptureCallback) r8     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            androidx.camera.camera2.internal.CaptureCallbackConverter.toCaptureCallback(r8, r7)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            goto Lec
        Lfc:
            r1.addCamera2Callbacks(r6, r7)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            r2.add(r6)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            goto L34
        L104:
            boolean r11 = r2.isEmpty()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            if (r11 != 0) goto L146
            androidx.camera.camera2.internal.compat.workaround.StillCaptureFlow r11 = r10.mStillCaptureFlow     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            boolean r11 = r11.shouldStopRepeatingBeforeCapture(r2, r4)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            if (r11 == 0) goto L11f
            androidx.camera.camera2.internal.SynchronizedCaptureSession r11 = r10.mSynchronizedCaptureSession     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            r11.stopRepeating()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            androidx.camera.camera2.internal.d1 r11 = new androidx.camera.camera2.internal.d1     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            r1.setCaptureSequenceCallback(r11)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
        L11f:
            androidx.camera.camera2.internal.compat.workaround.TorchStateReset r11 = r10.mTorchStateReset     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            boolean r11 = r11.isTorchResetRequired(r2, r4)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            if (r11 == 0) goto L13e
            int r11 = r2.size()     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            int r11 = r11 - r6
            java.lang.Object r11 = r2.get(r11)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            android.hardware.camera2.CaptureRequest r11 = (android.hardware.camera2.CaptureRequest) r11     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            androidx.camera.camera2.internal.CaptureSession$3 r4 = new androidx.camera.camera2.internal.CaptureSession$3     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            r4.<init>(r10)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            java.util.List r4 = java.util.Collections.singletonList(r4)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            r1.addCamera2Callbacks(r11, r4)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
        L13e:
            androidx.camera.camera2.internal.SynchronizedCaptureSession r11 = r10.mSynchronizedCaptureSession     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            int r11 = r11.captureBurstRequests(r2, r1)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r11
        L146:
            java.lang.String r11 = "CaptureSession"
            java.lang.String r1 = "Skipping issuing burst request due to no valid request elements"
            androidx.camera.core.Logger.d(r11, r1)     // Catch: java.lang.Throwable -> L13 android.hardware.camera2.CameraAccessException -> L53
            goto L16b
        L14e:
            java.lang.String r1 = "CaptureSession"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r2.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = "Unable to access camera: "
            r2.append(r4)     // Catch: java.lang.Throwable -> L13
            java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> L13
            r2.append(r11)     // Catch: java.lang.Throwable -> L13
            java.lang.String r11 = r2.toString()     // Catch: java.lang.Throwable -> L13
            androidx.camera.core.Logger.e(r1, r11)     // Catch: java.lang.Throwable -> L13
            java.lang.Thread.dumpStack()     // Catch: java.lang.Throwable -> L13
        L16b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r3
        L16d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r11
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void issueCaptureRequests(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.CaptureConfig> r4) {
            r3 = this;
            java.lang.Object r0 = r3.mSessionLock
            monitor-enter(r0)
            int[] r1 = androidx.camera.camera2.internal.CaptureSession.AnonymousClass4.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch: java.lang.Throwable -> L19
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.mState     // Catch: java.lang.Throwable -> L19
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L19
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L19
            switch(r1) {
                case 1: goto L2b;
                case 2: goto L24;
                case 3: goto L24;
                case 4: goto L24;
                case 5: goto L1b;
                case 6: goto L11;
                case 7: goto L11;
                case 8: goto L11;
                default: goto L10;
            }     // Catch: java.lang.Throwable -> L19
        L10:
            goto L29
        L11:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "Cannot issue capture request on a closed/released session."
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L19
            throw r4     // Catch: java.lang.Throwable -> L19
        L19:
            r4 = move-exception
            goto L44
        L1b:
            java.util.List<androidx.camera.core.impl.CaptureConfig> r1 = r3.mCaptureConfigs     // Catch: java.lang.Throwable -> L19
            r1.addAll(r4)     // Catch: java.lang.Throwable -> L19
            r3.issuePendingCaptureRequest()     // Catch: java.lang.Throwable -> L19
            goto L29
        L24:
            java.util.List<androidx.camera.core.impl.CaptureConfig> r1 = r3.mCaptureConfigs     // Catch: java.lang.Throwable -> L19
            r1.addAll(r4)     // Catch: java.lang.Throwable -> L19
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            r1.<init>()     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = "issueCaptureRequests() should not be possible in state: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L19
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.mState     // Catch: java.lang.Throwable -> L19
            r1.append(r2)     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L19
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L19
            throw r4     // Catch: java.lang.Throwable -> L19
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r4
    }

    @androidx.annotation.GuardedBy("mSessionLock")
    void issuePendingCaptureRequest() {
            r2 = this;
            java.util.List<androidx.camera.core.impl.CaptureConfig> r0 = r2.mCaptureConfigs
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            return
        L9:
            java.util.List<androidx.camera.core.impl.CaptureConfig> r0 = r2.mCaptureConfigs     // Catch: java.lang.Throwable -> L14
            r2.issueBurstCaptureRequest(r0)     // Catch: java.lang.Throwable -> L14
            java.util.List<androidx.camera.core.impl.CaptureConfig> r0 = r2.mCaptureConfigs
            r0.clear()
            return
        L14:
            r0 = move-exception
            java.util.List<androidx.camera.core.impl.CaptureConfig> r1 = r2.mCaptureConfigs
            r1.clear()
            throw r0
    }

    int issueRepeatingCaptureRequests(@androidx.annotation.Nullable androidx.camera.core.impl.SessionConfig r7) {
            r6 = this;
            java.lang.Object r0 = r6.mSessionLock
            monitor-enter(r0)
            r1 = -1
            if (r7 != 0) goto L12
            java.lang.String r7 = "CaptureSession"
            java.lang.String r2 = "Skipping issueRepeatingCaptureRequests for no configuration case."
            androidx.camera.core.Logger.d(r7, r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r7 = move-exception
            goto Lce
        L12:
            androidx.camera.camera2.internal.CaptureSession$State r2 = r6.mState     // Catch: java.lang.Throwable -> Lf
            androidx.camera.camera2.internal.CaptureSession$State r3 = androidx.camera.camera2.internal.CaptureSession.State.OPENED     // Catch: java.lang.Throwable -> Lf
            if (r2 == r3) goto L21
            java.lang.String r7 = "CaptureSession"
            java.lang.String r2 = "Skipping issueRepeatingCaptureRequests due to session closed"
            androidx.camera.core.Logger.d(r7, r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        L21:
            androidx.camera.core.impl.CaptureConfig r7 = r7.getRepeatingCaptureConfig()     // Catch: java.lang.Throwable -> Lf
            java.util.List r2 = r7.getSurfaces()     // Catch: java.lang.Throwable -> Lf
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L5c
            java.lang.String r7 = "CaptureSession"
            java.lang.String r2 = "Skipping issueRepeatingCaptureRequests for no surface."
            androidx.camera.core.Logger.d(r7, r2)     // Catch: java.lang.Throwable -> Lf
            androidx.camera.camera2.internal.SynchronizedCaptureSession r7 = r6.mSynchronizedCaptureSession     // Catch: java.lang.Throwable -> Lf android.hardware.camera2.CameraAccessException -> L3c
            r7.stopRepeating()     // Catch: java.lang.Throwable -> Lf android.hardware.camera2.CameraAccessException -> L3c
            goto L5a
        L3c:
            r7 = move-exception
            java.lang.String r2 = "CaptureSession"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r3.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r4 = "Unable to access camera: "
            r3.append(r4)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> Lf
            r3.append(r7)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> Lf
            androidx.camera.core.Logger.e(r2, r7)     // Catch: java.lang.Throwable -> Lf
            java.lang.Thread.dumpStack()     // Catch: java.lang.Throwable -> Lf
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        L5c:
            java.lang.String r2 = "CaptureSession"
            java.lang.String r3 = "Issuing request for session."
            androidx.camera.core.Logger.d(r2, r3)     // Catch: java.lang.Throwable -> Lf android.hardware.camera2.CameraAccessException -> L95
            androidx.camera.core.impl.CaptureConfig$Builder r2 = androidx.camera.core.impl.CaptureConfig.Builder.from(r7)     // Catch: java.lang.Throwable -> Lf android.hardware.camera2.CameraAccessException -> L95
            androidx.camera.camera2.impl.CameraEventCallbacks r3 = r6.mCameraEventCallbacks     // Catch: java.lang.Throwable -> Lf android.hardware.camera2.CameraAccessException -> L95
            androidx.camera.camera2.impl.CameraEventCallbacks$ComboCameraEventCallback r3 = r3.createComboCallback()     // Catch: java.lang.Throwable -> Lf android.hardware.camera2.CameraAccessException -> L95
            java.util.List r3 = r3.onRepeating()     // Catch: java.lang.Throwable -> Lf android.hardware.camera2.CameraAccessException -> L95
            androidx.camera.core.impl.Config r3 = mergeOptions(r3)     // Catch: java.lang.Throwable -> Lf android.hardware.camera2.CameraAccessException -> L95
            r6.mCameraEventOnRepeatingOptions = r3     // Catch: java.lang.Throwable -> Lf android.hardware.camera2.CameraAccessException -> L95
            r2.addImplementationOptions(r3)     // Catch: java.lang.Throwable -> Lf android.hardware.camera2.CameraAccessException -> L95
            androidx.camera.core.impl.CaptureConfig r2 = r2.build()     // Catch: java.lang.Throwable -> Lf android.hardware.camera2.CameraAccessException -> L95
            androidx.camera.camera2.internal.SynchronizedCaptureSession r3 = r6.mSynchronizedCaptureSession     // Catch: java.lang.Throwable -> Lf android.hardware.camera2.CameraAccessException -> L95
            android.hardware.camera2.CameraDevice r3 = r3.getDevice()     // Catch: java.lang.Throwable -> Lf android.hardware.camera2.CameraAccessException -> L95
            java.util.Map<androidx.camera.core.impl.DeferrableSurface, android.view.Surface> r4 = r6.mConfiguredSurfaceMap     // Catch: java.lang.Throwable -> Lf android.hardware.camera2.CameraAccessException -> L95
            android.hardware.camera2.CaptureRequest r2 = androidx.camera.camera2.internal.Camera2CaptureRequestBuilder.build(r2, r3, r4)     // Catch: java.lang.Throwable -> Lf android.hardware.camera2.CameraAccessException -> L95
            if (r2 != 0) goto L97
            java.lang.String r7 = "CaptureSession"
            java.lang.String r2 = "Skipping issuing empty request for session."
            androidx.camera.core.Logger.d(r7, r2)     // Catch: java.lang.Throwable -> Lf android.hardware.camera2.CameraAccessException -> L95
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        L95:
            r7 = move-exception
            goto Laf
        L97:
            java.util.List r7 = r7.getCameraCaptureCallbacks()     // Catch: java.lang.Throwable -> Lf android.hardware.camera2.CameraAccessException -> L95
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r3 = r6.mCaptureCallback     // Catch: java.lang.Throwable -> Lf android.hardware.camera2.CameraAccessException -> L95
            r4 = 1
            android.hardware.camera2.CameraCaptureSession$CaptureCallback[] r4 = new android.hardware.camera2.CameraCaptureSession.CaptureCallback[r4]     // Catch: java.lang.Throwable -> Lf android.hardware.camera2.CameraAccessException -> L95
            r5 = 0
            r4[r5] = r3     // Catch: java.lang.Throwable -> Lf android.hardware.camera2.CameraAccessException -> L95
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r7 = r6.createCamera2CaptureCallback(r7, r4)     // Catch: java.lang.Throwable -> Lf android.hardware.camera2.CameraAccessException -> L95
            androidx.camera.camera2.internal.SynchronizedCaptureSession r3 = r6.mSynchronizedCaptureSession     // Catch: java.lang.Throwable -> Lf android.hardware.camera2.CameraAccessException -> L95
            int r7 = r3.setSingleRepeatingRequest(r2, r7)     // Catch: java.lang.Throwable -> Lf android.hardware.camera2.CameraAccessException -> L95
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r7
        Laf:
            java.lang.String r2 = "CaptureSession"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r3.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r4 = "Unable to access camera: "
            r3.append(r4)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> Lf
            r3.append(r7)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> Lf
            androidx.camera.core.Logger.e(r2, r7)     // Catch: java.lang.Throwable -> Lf
            java.lang.Thread.dumpStack()     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lce:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r7
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> open(@androidx.annotation.NonNull androidx.camera.core.impl.SessionConfig r6, @androidx.annotation.NonNull android.hardware.camera2.CameraDevice r7, @androidx.annotation.NonNull androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r8) {
            r5 = this;
            java.lang.Object r0 = r5.mSessionLock
            monitor-enter(r0)
            int[] r1 = androidx.camera.camera2.internal.CaptureSession.AnonymousClass4.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch: java.lang.Throwable -> L46
            androidx.camera.camera2.internal.CaptureSession$State r2 = r5.mState     // Catch: java.lang.Throwable -> L46
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L46
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L46
            r2 = 2
            if (r1 == r2) goto L48
            java.lang.String r6 = "CaptureSession"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r7.<init>()     // Catch: java.lang.Throwable -> L46
            java.lang.String r8 = "Open not allowed in state: "
            r7.append(r8)     // Catch: java.lang.Throwable -> L46
            androidx.camera.camera2.internal.CaptureSession$State r8 = r5.mState     // Catch: java.lang.Throwable -> L46
            r7.append(r8)     // Catch: java.lang.Throwable -> L46
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L46
            androidx.camera.core.Logger.e(r6, r7)     // Catch: java.lang.Throwable -> L46
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r7.<init>()     // Catch: java.lang.Throwable -> L46
            java.lang.String r8 = "open() should not allow the state: "
            r7.append(r8)     // Catch: java.lang.Throwable -> L46
            androidx.camera.camera2.internal.CaptureSession$State r8 = r5.mState     // Catch: java.lang.Throwable -> L46
            r7.append(r8)     // Catch: java.lang.Throwable -> L46
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L46
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L46
            com.google.common.util.concurrent.ListenableFuture r6 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(r6)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            return r6
        L46:
            r6 = move-exception
            goto L86
        L48:
            androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.GET_SURFACE     // Catch: java.lang.Throwable -> L46
            r5.mState = r1     // Catch: java.lang.Throwable -> L46
            java.util.List r1 = r6.getSurfaces()     // Catch: java.lang.Throwable -> L46
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L46
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L46
            r5.mConfiguredDeferrableSurfaces = r2     // Catch: java.lang.Throwable -> L46
            r5.mSynchronizedCaptureSessionOpener = r8     // Catch: java.lang.Throwable -> L46
            r3 = 5000(0x1388, double:2.4703E-320)
            com.google.common.util.concurrent.ListenableFuture r8 = r8.startWithDeferrableSurface(r2, r3)     // Catch: java.lang.Throwable -> L46
            androidx.camera.core.impl.utils.futures.FutureChain r8 = androidx.camera.core.impl.utils.futures.FutureChain.from(r8)     // Catch: java.lang.Throwable -> L46
            androidx.camera.camera2.internal.f1 r1 = new androidx.camera.camera2.internal.f1     // Catch: java.lang.Throwable -> L46
            r1.<init>(r5, r6, r7)     // Catch: java.lang.Throwable -> L46
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r6 = r5.mSynchronizedCaptureSessionOpener     // Catch: java.lang.Throwable -> L46
            java.util.concurrent.Executor r6 = r6.getExecutor()     // Catch: java.lang.Throwable -> L46
            androidx.camera.core.impl.utils.futures.FutureChain r6 = r8.transformAsync(r1, r6)     // Catch: java.lang.Throwable -> L46
            androidx.camera.camera2.internal.CaptureSession$2 r7 = new androidx.camera.camera2.internal.CaptureSession$2     // Catch: java.lang.Throwable -> L46
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L46
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r8 = r5.mSynchronizedCaptureSessionOpener     // Catch: java.lang.Throwable -> L46
            java.util.concurrent.Executor r8 = r8.getExecutor()     // Catch: java.lang.Throwable -> L46
            androidx.camera.core.impl.utils.futures.Futures.addCallback(r6, r7, r8)     // Catch: java.lang.Throwable -> L46
            com.google.common.util.concurrent.ListenableFuture r6 = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(r6)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            return r6
        L86:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r6
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    @androidx.annotation.NonNull
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> release(boolean r4) {
            r3 = this;
            java.lang.Object r0 = r3.mSessionLock
            monitor-enter(r0)
            int[] r1 = androidx.camera.camera2.internal.CaptureSession.AnonymousClass4.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch: java.lang.Throwable -> L1c
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.mState     // Catch: java.lang.Throwable -> L1c
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L1c
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L1c
            switch(r1) {
                case 1: goto L98;
                case 2: goto L8d;
                case 3: goto L70;
                case 4: goto L2c;
                case 5: goto L12;
                case 6: goto L12;
                case 7: goto L5d;
                default: goto L10;
            }     // Catch: java.lang.Throwable -> L1c
        L10:
            goto L91
        L12:
            androidx.camera.camera2.internal.SynchronizedCaptureSession r1 = r3.mSynchronizedCaptureSession     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L2c
            if (r4 == 0) goto L27
            r1.abortCaptures()     // Catch: java.lang.Throwable -> L1c android.hardware.camera2.CameraAccessException -> L1f
            goto L27
        L1c:
            r4 = move-exception
            goto Lb1
        L1f:
            r4 = move-exception
            java.lang.String r1 = "CaptureSession"
            java.lang.String r2 = "Unable to abort captures."
            androidx.camera.core.Logger.e(r1, r2, r4)     // Catch: java.lang.Throwable -> L1c
        L27:
            androidx.camera.camera2.internal.SynchronizedCaptureSession r4 = r3.mSynchronizedCaptureSession     // Catch: java.lang.Throwable -> L1c
            r4.close()     // Catch: java.lang.Throwable -> L1c
        L2c:
            androidx.camera.camera2.impl.CameraEventCallbacks r4 = r3.mCameraEventCallbacks     // Catch: java.lang.Throwable -> L1c
            androidx.camera.camera2.impl.CameraEventCallbacks$ComboCameraEventCallback r4 = r4.createComboCallback()     // Catch: java.lang.Throwable -> L1c
            r4.onDeInitSession()     // Catch: java.lang.Throwable -> L1c
            androidx.camera.camera2.internal.CaptureSession$State r4 = androidx.camera.camera2.internal.CaptureSession.State.RELEASING     // Catch: java.lang.Throwable -> L1c
            r3.mState = r4     // Catch: java.lang.Throwable -> L1c
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r4 = r3.mSynchronizedCaptureSessionOpener     // Catch: java.lang.Throwable -> L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r1.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L1c
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.mState     // Catch: java.lang.Throwable -> L1c
            r1.append(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1c
            androidx.core.util.Preconditions.checkNotNull(r4, r1)     // Catch: java.lang.Throwable -> L1c
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r4 = r3.mSynchronizedCaptureSessionOpener     // Catch: java.lang.Throwable -> L1c
            boolean r4 = r4.stop()     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L5d
            r3.finishClose()     // Catch: java.lang.Throwable -> L1c
            goto L91
        L5d:
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r4 = r3.mReleaseFuture     // Catch: java.lang.Throwable -> L1c
            if (r4 != 0) goto L6c
            androidx.camera.camera2.internal.e1 r4 = new androidx.camera.camera2.internal.e1     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1c
            com.google.common.util.concurrent.ListenableFuture r4 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r4)     // Catch: java.lang.Throwable -> L1c
            r3.mReleaseFuture = r4     // Catch: java.lang.Throwable -> L1c
        L6c:
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> r4 = r3.mReleaseFuture     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return r4
        L70:
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r4 = r3.mSynchronizedCaptureSessionOpener     // Catch: java.lang.Throwable -> L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r1.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L1c
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.mState     // Catch: java.lang.Throwable -> L1c
            r1.append(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1c
            androidx.core.util.Preconditions.checkNotNull(r4, r1)     // Catch: java.lang.Throwable -> L1c
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r4 = r3.mSynchronizedCaptureSessionOpener     // Catch: java.lang.Throwable -> L1c
            r4.stop()     // Catch: java.lang.Throwable -> L1c
        L8d:
            androidx.camera.camera2.internal.CaptureSession$State r4 = androidx.camera.camera2.internal.CaptureSession.State.RELEASED     // Catch: java.lang.Throwable -> L1c
            r3.mState = r4     // Catch: java.lang.Throwable -> L1c
        L91:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            r4 = 0
            com.google.common.util.concurrent.ListenableFuture r4 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r4)
            return r4
        L98:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r1.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "release() should not be possible in state: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L1c
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.mState     // Catch: java.lang.Throwable -> L1c
            r1.append(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        Lb1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r4
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void setSessionConfig(@androidx.annotation.Nullable androidx.camera.core.impl.SessionConfig r4) {
            r3 = this;
            java.lang.Object r0 = r3.mSessionLock
            monitor-enter(r0)
            int[] r1 = androidx.camera.camera2.internal.CaptureSession.AnonymousClass4.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch: java.lang.Throwable -> L19
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.mState     // Catch: java.lang.Throwable -> L19
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L19
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L19
            switch(r1) {
                case 1: goto L4b;
                case 2: goto L47;
                case 3: goto L47;
                case 4: goto L47;
                case 5: goto L1b;
                case 6: goto L11;
                case 7: goto L11;
                case 8: goto L11;
                default: goto L10;
            }     // Catch: java.lang.Throwable -> L19
        L10:
            goto L49
        L11:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "Session configuration cannot be set on a closed/released session."
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L19
            throw r4     // Catch: java.lang.Throwable -> L19
        L19:
            r4 = move-exception
            goto L64
        L1b:
            r3.mSessionConfig = r4     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L21
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L21:
            java.util.Map<androidx.camera.core.impl.DeferrableSurface, android.view.Surface> r1 = r3.mConfiguredSurfaceMap     // Catch: java.lang.Throwable -> L19
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L19
            java.util.List r4 = r4.getSurfaces()     // Catch: java.lang.Throwable -> L19
            boolean r4 = r1.containsAll(r4)     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L3a
            java.lang.String r4 = "CaptureSession"
            java.lang.String r1 = "Does not have the proper configured lists"
            androidx.camera.core.Logger.e(r4, r1)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L3a:
            java.lang.String r4 = "CaptureSession"
            java.lang.String r1 = "Attempting to submit CaptureRequest after setting"
            androidx.camera.core.Logger.d(r4, r1)     // Catch: java.lang.Throwable -> L19
            androidx.camera.core.impl.SessionConfig r4 = r3.mSessionConfig     // Catch: java.lang.Throwable -> L19
            r3.issueRepeatingCaptureRequests(r4)     // Catch: java.lang.Throwable -> L19
            goto L49
        L47:
            r3.mSessionConfig = r4     // Catch: java.lang.Throwable -> L19
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L4b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            r1.<init>()     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = "setSessionConfig() should not be possible in state: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L19
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.mState     // Catch: java.lang.Throwable -> L19
            r1.append(r2)     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L19
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L19
            throw r4     // Catch: java.lang.Throwable -> L19
        L64:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r4
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void setStreamUseCaseMap(@androidx.annotation.NonNull java.util.Map<androidx.camera.core.impl.DeferrableSurface, java.lang.Long> r2) {
            r1 = this;
            java.lang.Object r0 = r1.mSessionLock
            monitor-enter(r0)
            r1.mStreamUseCaseMap = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @androidx.annotation.GuardedBy("mSessionLock")
    java.util.List<androidx.camera.core.impl.CaptureConfig> setupConfiguredSurface(java.util.List<androidx.camera.core.impl.CaptureConfig> r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r5.next()
            androidx.camera.core.impl.CaptureConfig r1 = (androidx.camera.core.impl.CaptureConfig) r1
            androidx.camera.core.impl.CaptureConfig$Builder r1 = androidx.camera.core.impl.CaptureConfig.Builder.from(r1)
            r2 = 1
            r1.setTemplateType(r2)
            androidx.camera.core.impl.SessionConfig r2 = r4.mSessionConfig
            androidx.camera.core.impl.CaptureConfig r2 = r2.getRepeatingCaptureConfig()
            java.util.List r2 = r2.getSurfaces()
            java.util.Iterator r2 = r2.iterator()
        L2b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r2.next()
            androidx.camera.core.impl.DeferrableSurface r3 = (androidx.camera.core.impl.DeferrableSurface) r3
            r1.addSurface(r3)
            goto L2b
        L3b:
            androidx.camera.core.impl.CaptureConfig r1 = r1.build()
            r0.add(r1)
            goto L9
        L43:
            return r0
    }

    void stopRepeating() {
            r4 = this;
            java.lang.Object r0 = r4.mSessionLock
            monitor-enter(r0)
            androidx.camera.camera2.internal.CaptureSession$State r1 = r4.mState     // Catch: java.lang.Throwable -> L23
            androidx.camera.camera2.internal.CaptureSession$State r2 = androidx.camera.camera2.internal.CaptureSession.State.OPENED     // Catch: java.lang.Throwable -> L23
            if (r1 == r2) goto L25
            java.lang.String r1 = "CaptureSession"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r2.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = "Unable to stop repeating. Incorrect state:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L23
            androidx.camera.camera2.internal.CaptureSession$State r3 = r4.mState     // Catch: java.lang.Throwable -> L23
            r2.append(r3)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L23
            androidx.camera.core.Logger.e(r1, r2)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r1 = move-exception
            goto L35
        L25:
            androidx.camera.camera2.internal.SynchronizedCaptureSession r1 = r4.mSynchronizedCaptureSession     // Catch: java.lang.Throwable -> L23 android.hardware.camera2.CameraAccessException -> L2b
            r1.stopRepeating()     // Catch: java.lang.Throwable -> L23 android.hardware.camera2.CameraAccessException -> L2b
            goto L33
        L2b:
            r1 = move-exception
            java.lang.String r2 = "CaptureSession"
            java.lang.String r3 = "Unable to stop repeating."
            androidx.camera.core.Logger.e(r2, r3, r1)     // Catch: java.lang.Throwable -> L23
        L33:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r1
    }
}
