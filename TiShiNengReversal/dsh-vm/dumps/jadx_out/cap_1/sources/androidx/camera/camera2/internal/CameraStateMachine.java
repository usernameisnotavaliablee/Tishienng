package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class CameraStateMachine {
    private static final java.lang.String TAG = "CameraStateMachine";

    @androidx.annotation.NonNull
    private final androidx.camera.core.impl.CameraStateRegistry mCameraStateRegistry;

    @androidx.annotation.NonNull
    private final androidx.lifecycle.MutableLiveData<androidx.camera.core.CameraState> mCameraStates;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.camera2.internal.CameraStateMachine$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$impl$CameraInternal$State = null;

        static {
                androidx.camera.core.impl.CameraInternal$State[] r0 = androidx.camera.core.impl.CameraInternal.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.camera.camera2.internal.CameraStateMachine.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$CameraInternal$State = r0
                androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.camera.camera2.internal.CameraStateMachine.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$CameraInternal$State     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.OPENING     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.camera.camera2.internal.CameraStateMachine.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$CameraInternal$State     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.OPEN     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.camera.camera2.internal.CameraStateMachine.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$CameraInternal$State     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.CONFIGURED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.camera.camera2.internal.CameraStateMachine.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$CameraInternal$State     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.CLOSING     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.camera.camera2.internal.CameraStateMachine.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$CameraInternal$State     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.RELEASING     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = androidx.camera.camera2.internal.CameraStateMachine.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$CameraInternal$State     // Catch: java.lang.NoSuchFieldError -> L54
                androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.CLOSED     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = androidx.camera.camera2.internal.CameraStateMachine.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$CameraInternal$State     // Catch: java.lang.NoSuchFieldError -> L60
                androidx.camera.core.impl.CameraInternal$State r1 = androidx.camera.core.impl.CameraInternal.State.RELEASED     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                return
        }
    }

    CameraStateMachine(@androidx.annotation.NonNull androidx.camera.core.impl.CameraStateRegistry r2) {
            r1 = this;
            r1.<init>()
            r1.mCameraStateRegistry = r2
            androidx.lifecycle.MutableLiveData r2 = new androidx.lifecycle.MutableLiveData
            r2.<init>()
            r1.mCameraStates = r2
            androidx.camera.core.CameraState$Type r0 = androidx.camera.core.CameraState.Type.CLOSED
            androidx.camera.core.CameraState r0 = androidx.camera.core.CameraState.create(r0)
            r2.postValue(r0)
            return
    }

    private androidx.camera.core.CameraState onCameraPendingOpen() {
            r1 = this;
            androidx.camera.core.impl.CameraStateRegistry r0 = r1.mCameraStateRegistry
            boolean r0 = r0.isCameraClosing()
            if (r0 == 0) goto Lf
            androidx.camera.core.CameraState$Type r0 = androidx.camera.core.CameraState.Type.OPENING
            androidx.camera.core.CameraState r0 = androidx.camera.core.CameraState.create(r0)
            return r0
        Lf:
            androidx.camera.core.CameraState$Type r0 = androidx.camera.core.CameraState.Type.PENDING_OPEN
            androidx.camera.core.CameraState r0 = androidx.camera.core.CameraState.create(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.lifecycle.LiveData<androidx.camera.core.CameraState> getStateLiveData() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<androidx.camera.core.CameraState> r0 = r1.mCameraStates
            return r0
    }

    public void updateState(@androidx.annotation.NonNull androidx.camera.core.impl.CameraInternal.State r4, @androidx.annotation.Nullable androidx.camera.core.CameraState.StateError r5) {
            r3 = this;
            int[] r0 = androidx.camera.camera2.internal.CameraStateMachine.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$CameraInternal$State
            int r1 = r4.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L3e;
                case 2: goto L37;
                case 3: goto L30;
                case 4: goto L30;
                case 5: goto L29;
                case 6: goto L29;
                case 7: goto L22;
                case 8: goto L22;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown internal camera state: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L22:
            androidx.camera.core.CameraState$Type r0 = androidx.camera.core.CameraState.Type.CLOSED
            androidx.camera.core.CameraState r0 = androidx.camera.core.CameraState.create(r0, r5)
            goto L42
        L29:
            androidx.camera.core.CameraState$Type r0 = androidx.camera.core.CameraState.Type.CLOSING
            androidx.camera.core.CameraState r0 = androidx.camera.core.CameraState.create(r0, r5)
            goto L42
        L30:
            androidx.camera.core.CameraState$Type r0 = androidx.camera.core.CameraState.Type.OPEN
            androidx.camera.core.CameraState r0 = androidx.camera.core.CameraState.create(r0, r5)
            goto L42
        L37:
            androidx.camera.core.CameraState$Type r0 = androidx.camera.core.CameraState.Type.OPENING
            androidx.camera.core.CameraState r0 = androidx.camera.core.CameraState.create(r0, r5)
            goto L42
        L3e:
            androidx.camera.core.CameraState r0 = r3.onCameraPendingOpen()
        L42:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "New public camera state "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = " from "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " and "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            java.lang.String r5 = "CameraStateMachine"
            androidx.camera.core.Logger.d(r5, r4)
            androidx.lifecycle.MutableLiveData<androidx.camera.core.CameraState> r4 = r3.mCameraStates
            java.lang.Object r4 = r4.getValue()
            androidx.camera.core.CameraState r4 = (androidx.camera.core.CameraState) r4
            boolean r4 = java.util.Objects.equals(r4, r0)
            if (r4 != 0) goto L8f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Publishing new public camera state "
            r4.append(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            androidx.camera.core.Logger.d(r5, r4)
            androidx.lifecycle.MutableLiveData<androidx.camera.core.CameraState> r4 = r3.mCameraStates
            r4.postValue(r0)
        L8f:
            return
    }
}
