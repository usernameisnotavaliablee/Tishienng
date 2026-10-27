package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class Camera2RequestProcessor implements androidx.camera.core.impl.RequestProcessor {
    private static final java.lang.String TAG = "Camera2RequestProcessor";

    @androidx.annotation.NonNull
    private final androidx.camera.camera2.internal.CaptureSession mCaptureSession;
    private volatile boolean mIsClosed;

    @androidx.annotation.NonNull
    private final java.util.List<androidx.camera.core.impl.SessionProcessorSurface> mProcessorSurfaces;

    @androidx.annotation.Nullable
    private volatile androidx.camera.core.impl.SessionConfig mSessionConfig;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class Camera2CallbackWrapper extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        private final androidx.camera.core.impl.RequestProcessor.Callback mCallback;
        private final boolean mInvokeSequenceCallback;
        private final androidx.camera.core.impl.RequestProcessor.Request mRequest;
        final /* synthetic */ androidx.camera.camera2.internal.Camera2RequestProcessor this$0;

        Camera2CallbackWrapper(@androidx.annotation.NonNull androidx.camera.camera2.internal.Camera2RequestProcessor r1, @androidx.annotation.NonNull androidx.camera.core.impl.RequestProcessor.Request r2, androidx.camera.core.impl.RequestProcessor.Callback r3, boolean r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mCallback = r3
                r0.mRequest = r2
                r0.mInvokeSequenceCallback = r4
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r2, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r3, @androidx.annotation.NonNull android.view.Surface r4, long r5) {
                r1 = this;
                androidx.camera.core.impl.RequestProcessor$Callback r2 = r1.mCallback
                androidx.camera.core.impl.RequestProcessor$Request r3 = r1.mRequest
                androidx.camera.camera2.internal.Camera2RequestProcessor r0 = r1.this$0
                int r4 = r0.findOutputConfigId(r4)
                r2.onCaptureBufferLost(r3, r5, r4)
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r2, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r3, @androidx.annotation.NonNull android.hardware.camera2.TotalCaptureResult r4) {
                r1 = this;
                androidx.camera.core.impl.RequestProcessor$Callback r2 = r1.mCallback
                androidx.camera.core.impl.RequestProcessor$Request r3 = r1.mRequest
                androidx.camera.camera2.internal.Camera2CameraCaptureResult r0 = new androidx.camera.camera2.internal.Camera2CameraCaptureResult
                r0.<init>(r4)
                r2.onCaptureCompleted(r3, r0)
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r4, @androidx.annotation.NonNull android.hardware.camera2.CaptureFailure r5) {
                r2 = this;
                androidx.camera.core.impl.RequestProcessor$Callback r3 = r2.mCallback
                androidx.camera.core.impl.RequestProcessor$Request r4 = r2.mRequest
                androidx.camera.camera2.internal.Camera2CameraCaptureFailure r0 = new androidx.camera.camera2.internal.Camera2CameraCaptureFailure
                androidx.camera.core.impl.CameraCaptureFailure$Reason r1 = androidx.camera.core.impl.CameraCaptureFailure.Reason.ERROR
                r0.<init>(r1, r5)
                r3.onCaptureFailed(r4, r0)
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r2, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r3, @androidx.annotation.NonNull android.hardware.camera2.CaptureResult r4) {
                r1 = this;
                androidx.camera.core.impl.RequestProcessor$Callback r2 = r1.mCallback
                androidx.camera.core.impl.RequestProcessor$Request r3 = r1.mRequest
                androidx.camera.camera2.internal.Camera2CameraCaptureResult r0 = new androidx.camera.camera2.internal.Camera2CameraCaptureResult
                r0.<init>(r4)
                r2.onCaptureProgressed(r3, r0)
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r1, int r2) {
                r0 = this;
                boolean r1 = r0.mInvokeSequenceCallback
                if (r1 == 0) goto L9
                androidx.camera.core.impl.RequestProcessor$Callback r1 = r0.mCallback
                r1.onCaptureSequenceAborted(r2)
            L9:
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r1, int r2, long r3) {
                r0 = this;
                boolean r1 = r0.mInvokeSequenceCallback
                if (r1 == 0) goto L9
                androidx.camera.core.impl.RequestProcessor$Callback r1 = r0.mCallback
                r1.onCaptureSequenceCompleted(r2, r3)
            L9:
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(@androidx.annotation.NonNull android.hardware.camera2.CameraCaptureSession r3, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest r4, long r5, long r7) {
                r2 = this;
                androidx.camera.core.impl.RequestProcessor$Callback r3 = r2.mCallback
                androidx.camera.core.impl.RequestProcessor$Request r4 = r2.mRequest
                r0 = r7
                r7 = r5
                r5 = r0
                r3.onCaptureStarted(r4, r5, r7)
                return
        }
    }

    public Camera2RequestProcessor(@androidx.annotation.NonNull androidx.camera.camera2.internal.CaptureSession r4, @androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.SessionProcessorSurface> r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mIsClosed = r0
            androidx.camera.camera2.internal.CaptureSession$State r1 = r4.mState
            androidx.camera.camera2.internal.CaptureSession$State r2 = androidx.camera.camera2.internal.CaptureSession.State.OPENED
            if (r1 != r2) goto Ld
            r0 = 1
        Ld:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "CaptureSession state must be OPENED. Current state:"
            r1.append(r2)
            androidx.camera.camera2.internal.CaptureSession$State r2 = r4.mState
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            androidx.core.util.Preconditions.checkArgument(r0, r1)
            r3.mCaptureSession = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r5)
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)
            r3.mProcessorSurfaces = r4
            return
    }

    private boolean areRequestsValid(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.RequestProcessor.Request> r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r2.next()
            androidx.camera.core.impl.RequestProcessor$Request r0 = (androidx.camera.core.impl.RequestProcessor.Request) r0
            boolean r0 = r1.isRequestValid(r0)
            if (r0 != 0) goto L4
            r2 = 0
            return r2
        L18:
            r2 = 1
            return r2
    }

    @androidx.annotation.Nullable
    private androidx.camera.core.impl.DeferrableSurface findSurface(int r4) {
            r3 = this;
            java.util.List<androidx.camera.core.impl.SessionProcessorSurface> r0 = r3.mProcessorSurfaces
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            androidx.camera.core.impl.SessionProcessorSurface r1 = (androidx.camera.core.impl.SessionProcessorSurface) r1
            int r2 = r1.getOutputConfigId()
            if (r2 != r4) goto L6
            return r1
        L19:
            r4 = 0
            return r4
    }

    private boolean isRequestValid(@androidx.annotation.NonNull androidx.camera.core.impl.RequestProcessor.Request r5) {
            r4 = this;
            java.util.List r0 = r5.getTargetOutputConfigIds()
            boolean r0 = r0.isEmpty()
            r1 = 0
            java.lang.String r2 = "Camera2RequestProcessor"
            if (r0 == 0) goto L13
            java.lang.String r5 = "Unable to submit the RequestProcessor.Request: empty targetOutputConfigIds"
            androidx.camera.core.Logger.e(r2, r5)
            return r1
        L13:
            java.util.List r5 = r5.getTargetOutputConfigIds()
            java.util.Iterator r5 = r5.iterator()
        L1b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r5.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r3 = r0.intValue()
            androidx.camera.core.impl.DeferrableSurface r3 = r4.findSurface(r3)
            if (r3 != 0) goto L1b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = "Unable to submit the RequestProcessor.Request: targetOutputConfigId("
            r5.append(r3)
            r5.append(r0)
            java.lang.String r0 = ") is not a valid id"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            androidx.camera.core.Logger.e(r2, r5)
            return r1
        L4b:
            r5 = 1
            return r5
    }

    @Override // androidx.camera.core.impl.RequestProcessor
    public void abortCaptures() {
            r1 = this;
            boolean r0 = r1.mIsClosed
            if (r0 == 0) goto L5
            return
        L5:
            androidx.camera.camera2.internal.CaptureSession r0 = r1.mCaptureSession
            r0.abortCaptures()
            return
    }

    public void close() {
            r1 = this;
            r0 = 1
            r1.mIsClosed = r0
            return
    }

    int findOutputConfigId(@androidx.annotation.NonNull android.view.Surface r4) {
            r3 = this;
            java.util.List<androidx.camera.core.impl.SessionProcessorSurface> r0 = r3.mProcessorSurfaces
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            androidx.camera.core.impl.SessionProcessorSurface r1 = (androidx.camera.core.impl.SessionProcessorSurface) r1
            com.google.common.util.concurrent.ListenableFuture r2 = r1.getSurface()     // Catch: java.lang.Throwable -> L21
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L21
            if (r2 != r4) goto L6
            int r4 = r1.getOutputConfigId()     // Catch: java.lang.Throwable -> L21
            return r4
        L21:
            goto L6
        L23:
            r4 = -1
            return r4
    }

    @Override // androidx.camera.core.impl.RequestProcessor
    public int setRepeating(@androidx.annotation.NonNull androidx.camera.core.impl.RequestProcessor.Request r5, @androidx.annotation.NonNull androidx.camera.core.impl.RequestProcessor.Callback r6) {
            r4 = this;
            boolean r0 = r4.mIsClosed
            if (r0 != 0) goto L9b
            boolean r0 = r4.isRequestValid(r5)
            if (r0 != 0) goto Lc
            goto L9b
        Lc:
            androidx.camera.core.impl.SessionConfig$Builder r0 = new androidx.camera.core.impl.SessionConfig$Builder
            r0.<init>()
            int r1 = r5.getTemplateId()
            r0.setTemplateType(r1)
            androidx.camera.core.impl.Config r1 = r5.getParameters()
            r0.setImplementationOptions(r1)
            androidx.camera.camera2.internal.Camera2RequestProcessor$Camera2CallbackWrapper r1 = new androidx.camera.camera2.internal.Camera2RequestProcessor$Camera2CallbackWrapper
            r2 = 1
            r1.<init>(r4, r5, r6, r2)
            androidx.camera.camera2.internal.CaptureCallbackContainer r6 = androidx.camera.camera2.internal.CaptureCallbackContainer.create(r1)
            r0.addCameraCaptureCallback(r6)
            androidx.camera.core.impl.SessionConfig r6 = r4.mSessionConfig
            if (r6 == 0) goto L70
            androidx.camera.core.impl.SessionConfig r6 = r4.mSessionConfig
            java.util.List r6 = r6.getRepeatingCameraCaptureCallbacks()
            java.util.Iterator r6 = r6.iterator()
        L3a:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r6.next()
            androidx.camera.core.impl.CameraCaptureCallback r1 = (androidx.camera.core.impl.CameraCaptureCallback) r1
            r0.addCameraCaptureCallback(r1)
            goto L3a
        L4a:
            androidx.camera.core.impl.SessionConfig r6 = r4.mSessionConfig
            androidx.camera.core.impl.CaptureConfig r6 = r6.getRepeatingCaptureConfig()
            androidx.camera.core.impl.TagBundle r6 = r6.getTagBundle()
            java.util.Set r1 = r6.listKeys()
            java.util.Iterator r1 = r1.iterator()
        L5c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L70
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r6.getTag(r2)
            r0.addTag(r2, r3)
            goto L5c
        L70:
            java.util.List r5 = r5.getTargetOutputConfigIds()
            java.util.Iterator r5 = r5.iterator()
        L78:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L90
            java.lang.Object r6 = r5.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            androidx.camera.core.impl.DeferrableSurface r6 = r4.findSurface(r6)
            r0.addSurface(r6)
            goto L78
        L90:
            androidx.camera.camera2.internal.CaptureSession r5 = r4.mCaptureSession
            androidx.camera.core.impl.SessionConfig r6 = r0.build()
            int r5 = r5.issueRepeatingCaptureRequests(r6)
            return r5
        L9b:
            r5 = -1
            return r5
    }

    @Override // androidx.camera.core.impl.RequestProcessor
    public void stopRepeating() {
            r1 = this;
            boolean r0 = r1.mIsClosed
            if (r0 == 0) goto L5
            return
        L5:
            androidx.camera.camera2.internal.CaptureSession r0 = r1.mCaptureSession
            r0.stopRepeating()
            return
    }

    @Override // androidx.camera.core.impl.RequestProcessor
    public int submit(@androidx.annotation.NonNull androidx.camera.core.impl.RequestProcessor.Request r3, @androidx.annotation.NonNull androidx.camera.core.impl.RequestProcessor.Callback r4) {
            r2 = this;
            r0 = 1
            androidx.camera.core.impl.RequestProcessor$Request[] r0 = new androidx.camera.core.impl.RequestProcessor.Request[r0]
            r1 = 0
            r0[r1] = r3
            java.util.List r3 = java.util.Arrays.asList(r0)
            int r3 = r2.submit(r3, r4)
            return r3
    }

    @Override // androidx.camera.core.impl.RequestProcessor
    public int submit(@androidx.annotation.NonNull java.util.List<androidx.camera.core.impl.RequestProcessor.Request> r6, @androidx.annotation.NonNull androidx.camera.core.impl.RequestProcessor.Callback r7) {
            r5 = this;
            boolean r0 = r5.mIsClosed
            if (r0 != 0) goto L70
            boolean r0 = r5.areRequestsValid(r6)
            if (r0 != 0) goto Lb
            goto L70
        Lb:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
            r1 = 1
        L15:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L69
            java.lang.Object r2 = r6.next()
            androidx.camera.core.impl.RequestProcessor$Request r2 = (androidx.camera.core.impl.RequestProcessor.Request) r2
            androidx.camera.core.impl.CaptureConfig$Builder r3 = new androidx.camera.core.impl.CaptureConfig$Builder
            r3.<init>()
            int r4 = r2.getTemplateId()
            r3.setTemplateType(r4)
            androidx.camera.core.impl.Config r4 = r2.getParameters()
            r3.setImplementationOptions(r4)
            androidx.camera.camera2.internal.Camera2RequestProcessor$Camera2CallbackWrapper r4 = new androidx.camera.camera2.internal.Camera2RequestProcessor$Camera2CallbackWrapper
            r4.<init>(r5, r2, r7, r1)
            androidx.camera.camera2.internal.CaptureCallbackContainer r1 = androidx.camera.camera2.internal.CaptureCallbackContainer.create(r4)
            r3.addCameraCaptureCallback(r1)
            java.util.List r1 = r2.getTargetOutputConfigIds()
            java.util.Iterator r1 = r1.iterator()
        L48:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L60
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            androidx.camera.core.impl.DeferrableSurface r2 = r5.findSurface(r2)
            r3.addSurface(r2)
            goto L48
        L60:
            androidx.camera.core.impl.CaptureConfig r1 = r3.build()
            r0.add(r1)
            r1 = 0
            goto L15
        L69:
            androidx.camera.camera2.internal.CaptureSession r6 = r5.mCaptureSession
            int r6 = r6.issueBurstCaptureRequest(r0)
            return r6
        L70:
            r6 = -1
            return r6
    }

    public void updateSessionConfig(@androidx.annotation.Nullable androidx.camera.core.impl.SessionConfig r1) {
            r0 = this;
            r0.mSessionConfig = r1
            return
    }
}
