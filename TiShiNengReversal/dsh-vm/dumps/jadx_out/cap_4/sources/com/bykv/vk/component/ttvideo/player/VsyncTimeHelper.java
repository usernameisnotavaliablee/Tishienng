package com.bykv.vk.component.ttvideo.player;

@com.bykv.vk.component.ttvideo.player.Keep
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class VsyncTimeHelper {
    private static final double DEFAULT_REFRESH_RATE = 16.0d;
    private static final long NANOS_PER_SECOND = 1000000000;
    private static final long TIME_UNSET = -9223372036854775807L;
    private final com.bykv.vk.component.ttvideo.player.VsyncTimeHelper.DefaultDisplayListener displayListener;
    private long vsyncDurationNs;
    private final com.bykv.vk.component.ttvideo.player.VsyncTimeHelper.UIVSyncSampler vsyncSampler;
    private final android.view.WindowManager windowManager;

    @android.annotation.TargetApi(17)
    private final class DefaultDisplayListener implements android.hardware.display.DisplayManager.DisplayListener {
        private final android.hardware.display.DisplayManager displayManager;
        final /* synthetic */ com.bykv.vk.component.ttvideo.player.VsyncTimeHelper this$0;

        public DefaultDisplayListener(com.bykv.vk.component.ttvideo.player.VsyncTimeHelper r1, android.hardware.display.DisplayManager r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.displayManager = r2
                return
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int r1) {
                r0 = this;
                return
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int r1) {
                r0 = this;
                if (r1 != 0) goto L7
                com.bykv.vk.component.ttvideo.player.VsyncTimeHelper r1 = r0.this$0
                com.bykv.vk.component.ttvideo.player.VsyncTimeHelper.access$200(r1)
            L7:
                return
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int r1) {
                r0 = this;
                return
        }

        public void register() {
                r2 = this;
                android.hardware.display.DisplayManager r0 = r2.displayManager
                r1 = 0
                r0.registerDisplayListener(r2, r1)
                return
        }

        public void unregister() {
                r1 = this;
                android.hardware.display.DisplayManager r0 = r1.displayManager
                r0.unregisterDisplayListener(r1)
                return
        }
    }

    private static final class UIVSyncSampler implements android.os.Handler.Callback, android.view.Choreographer.FrameCallback {
        private static final java.lang.String BUNDLE_TIMESTAMP = "time";
        private static final java.lang.String BUNDLE_VSYNC_DURATION = "vsync";
        private static final com.bykv.vk.component.ttvideo.player.VsyncTimeHelper.UIVSyncSampler INSTANCE = null;
        private static final int MSG_ADD_OBSERVER = 0;
        private static final int MSG_REMOVE_OBSERVER = 1;
        private static final int MSG_UPDATE_VSYNC_DURATION = 4;
        private static final int MSG_VSYNC_COMING = 2;
        private static final java.lang.String TAG = "UIVSyncSampler";
        private android.os.Bundle bundle;
        private android.view.Choreographer choreographer;
        private final android.os.HandlerThread choreographerOwnerThread;
        private int currentUIFps;
        private final android.os.Handler handler;
        public volatile long lastSampledVsyncTimeNs;
        private int lowestUIFps;
        private final android.os.Handler mainHandler;
        private int observerCount;
        public volatile long sampledVsyncTimeNs;
        public volatile int skipedFrameCount;
        private long uiVsyncDurationNs;
        private long vsyncSampleCount;


        static {
                com.bykv.vk.component.ttvideo.player.VsyncTimeHelper$UIVSyncSampler r0 = new com.bykv.vk.component.ttvideo.player.VsyncTimeHelper$UIVSyncSampler
                r0.<init>()
                com.bykv.vk.component.ttvideo.player.VsyncTimeHelper.UIVSyncSampler.INSTANCE = r0
                return
        }

        private UIVSyncSampler() {
                r2 = this;
                r2.<init>()
                r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r2.sampledVsyncTimeNs = r0
                r2.lastSampledVsyncTimeNs = r0
                r0 = 0
                r2.skipedFrameCount = r0
                android.os.HandlerThread r0 = new android.os.HandlerThread
                java.lang.String r1 = "Vsync:Handler"
                r0.<init>(r1)
                r2.choreographerOwnerThread = r0
                r0.start()
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r0 = r0.getLooper()
                r1.<init>(r0, r2)
                r2.handler = r1
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                r2.bundle = r0
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1)
                r2.mainHandler = r0
                com.bykv.vk.component.ttvideo.player.VsyncTimeHelper$UIVSyncSampler$1 r1 = new com.bykv.vk.component.ttvideo.player.VsyncTimeHelper$UIVSyncSampler$1
                r1.<init>(r2)
                r0.post(r1)
                return
        }

        static /* synthetic */ int access$000(com.bykv.vk.component.ttvideo.player.VsyncTimeHelper.UIVSyncSampler r0) {
                int r0 = r0.currentUIFps
                return r0
        }

        static /* synthetic */ int access$100(com.bykv.vk.component.ttvideo.player.VsyncTimeHelper.UIVSyncSampler r0) {
                int r0 = r0.lowestUIFps
                return r0
        }

        static /* synthetic */ android.view.Choreographer access$300(com.bykv.vk.component.ttvideo.player.VsyncTimeHelper.UIVSyncSampler r0) {
                android.view.Choreographer r0 = r0.choreographer
                return r0
        }

        static /* synthetic */ android.view.Choreographer access$302(com.bykv.vk.component.ttvideo.player.VsyncTimeHelper.UIVSyncSampler r0, android.view.Choreographer r1) {
                r0.choreographer = r1
                return r1
        }

        static /* synthetic */ int access$400(com.bykv.vk.component.ttvideo.player.VsyncTimeHelper.UIVSyncSampler r0) {
                int r0 = r0.observerCount
                return r0
        }

        static /* synthetic */ com.bykv.vk.component.ttvideo.player.VsyncTimeHelper.UIVSyncSampler access$500() {
                com.bykv.vk.component.ttvideo.player.VsyncTimeHelper$UIVSyncSampler r0 = com.bykv.vk.component.ttvideo.player.VsyncTimeHelper.UIVSyncSampler.INSTANCE
                return r0
        }

        private void addObserverInternal() {
                r2 = this;
                int r0 = r2.observerCount
                r1 = 1
                int r0 = r0 + r1
                r2.observerCount = r0
                if (r0 != r1) goto Lf
                android.view.Choreographer r0 = r2.choreographer
                if (r0 == 0) goto Lf
                r0.postFrameCallback(r2)
            Lf:
                return
        }

        public static com.bykv.vk.component.ttvideo.player.VsyncTimeHelper.UIVSyncSampler getInstance() {
                com.bykv.vk.component.ttvideo.player.VsyncTimeHelper$UIVSyncSampler r0 = com.bykv.vk.component.ttvideo.player.VsyncTimeHelper.UIVSyncSampler.INSTANCE
                return r0
        }

        private void recordUIFps(long r8) {
                r7 = this;
                long r0 = r7.uiVsyncDurationNs
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L9
                return
            L9:
                long r0 = r7.vsyncSampleCount
                r4 = 1
                long r0 = r0 + r4
                r7.vsyncSampleCount = r0
                r7.sampledVsyncTimeNs = r8
                long r8 = r7.lastSampledVsyncTimeNs
                r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r4 != 0) goto L22
                long r8 = r7.sampledVsyncTimeNs
                r7.lastSampledVsyncTimeNs = r8
                return
            L22:
                long r8 = r7.sampledVsyncTimeNs
                long r4 = r7.lastSampledVsyncTimeNs
                long r8 = r8 - r4
                int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r4 > 0) goto L2e
                r7.lastSampledVsyncTimeNs = r0
                return
            L2e:
                long r0 = r7.uiVsyncDurationNs
                long r4 = r8 - r0
                int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r6 <= 0) goto L40
                long r2 = r8 - r0
                float r2 = (float) r2
                float r0 = (float) r0
                float r2 = r2 / r0
                int r0 = java.lang.Math.round(r2)
                goto L41
            L40:
                r0 = 0
            L41:
                int r1 = r7.skipedFrameCount
                int r1 = r1 + r0
                r7.skipedFrameCount = r1
                r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
                long r0 = r0 / r8
                int r8 = (int) r0
                r7.currentUIFps = r8
                int r9 = r7.lowestUIFps
                if (r9 != 0) goto L52
                goto L56
            L52:
                int r8 = java.lang.Math.min(r9, r8)
            L56:
                r7.lowestUIFps = r8
                long r8 = r7.sampledVsyncTimeNs
                r7.lastSampledVsyncTimeNs = r8
                return
        }

        private void removeObserverInternal() {
                r2 = this;
                int r0 = r2.observerCount
                int r0 = r0 + (-1)
                r2.observerCount = r0
                if (r0 != 0) goto L23
                android.view.Choreographer r0 = r2.choreographer
                if (r0 == 0) goto L23
                r0.removeFrameCallback(r2)
                r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r2.sampledVsyncTimeNs = r0
                r2.lastSampledVsyncTimeNs = r0
                r0 = 0
                r2.skipedFrameCount = r0
                r2.currentUIFps = r0
                r2.lowestUIFps = r0
                r0 = 0
                r2.vsyncSampleCount = r0
            L23:
                return
        }

        private void updateUIVsyncDurationNs(long r1) {
                r0 = this;
                r0.uiVsyncDurationNs = r1
                return
        }

        public void addObserver() {
                r2 = this;
                android.os.Handler r0 = r2.handler
                r1 = 0
                r0.sendEmptyMessage(r1)
                return
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long r4) {
                r3 = this;
                android.os.Handler r0 = r3.handler
                r1 = 2
                android.os.Message r0 = r0.obtainMessage(r1)
                android.os.Bundle r1 = r3.bundle
                java.lang.String r2 = "time"
                r1.putLong(r2, r4)
                android.os.Bundle r4 = r3.bundle
                r0.setData(r4)
                r0.sendToTarget()
                android.view.Choreographer r4 = r3.choreographer
                r4.postFrameCallback(r3)
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r5) {
                r4 = this;
                int r0 = r5.what
                r1 = 1
                if (r0 == 0) goto L2f
                if (r0 == r1) goto L2b
                r2 = 2
                if (r0 == r2) goto L1d
                r2 = 4
                if (r0 == r2) goto Lf
                r5 = 0
                return r5
            Lf:
                android.os.Bundle r5 = r5.getData()
                java.lang.String r0 = "vsync"
                long r2 = r5.getLong(r0)
                r4.updateUIVsyncDurationNs(r2)
                return r1
            L1d:
                android.os.Bundle r5 = r5.getData()
                java.lang.String r0 = "time"
                long r2 = r5.getLong(r0)
                r4.recordUIFps(r2)
                return r1
            L2b:
                r4.removeObserverInternal()
                return r1
            L2f:
                r4.addObserverInternal()
                return r1
        }

        public void removeObserver() {
                r2 = this;
                android.os.Handler r0 = r2.handler
                r1 = 1
                r0.sendEmptyMessage(r1)
                return
        }

        public void updateVsyncDuration(long r3) {
                r2 = this;
                android.os.Bundle r0 = r2.bundle
                java.lang.String r1 = "vsync"
                r0.putLong(r1, r3)
                android.os.Handler r3 = r2.handler
                r4 = 4
                android.os.Message r3 = r3.obtainMessage(r4)
                android.os.Bundle r4 = r2.bundle
                r3.setData(r4)
                r3.sendToTarget()
                return
        }
    }

    public VsyncTimeHelper(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            if (r4 == 0) goto L19
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            java.lang.String r1 = "window"
            java.lang.Object r1 = r4.getSystemService(r1)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            r3.windowManager = r1
            goto L1b
        L19:
            r3.windowManager = r0
        L1b:
            android.view.WindowManager r1 = r3.windowManager
            if (r1 == 0) goto L32
            int r1 = com.bykv.vk.component.ttvideo.utils.Util.SDK_INT
            r2 = 17
            if (r1 < r2) goto L29
            com.bykv.vk.component.ttvideo.player.VsyncTimeHelper$DefaultDisplayListener r0 = r3.maybeBuildDefaultDisplayListenerV17(r4)
        L29:
            r3.displayListener = r0
            com.bykv.vk.component.ttvideo.player.VsyncTimeHelper$UIVSyncSampler r4 = com.bykv.vk.component.ttvideo.player.VsyncTimeHelper.UIVSyncSampler.getInstance()
            r3.vsyncSampler = r4
            goto L36
        L32:
            r3.displayListener = r0
            r3.vsyncSampler = r0
        L36:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.vsyncDurationNs = r0
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public VsyncTimeHelper(com.bykv.vk.component.ttvideo.player.TTPlayer r1) {
            r0 = this;
            if (r1 == 0) goto L7
            android.content.Context r1 = r1.getContext()
            goto L8
        L7:
            r1 = 0
        L8:
            r0.<init>(r1)
            return
    }

    static /* synthetic */ void access$200(com.bykv.vk.component.ttvideo.player.VsyncTimeHelper r0) {
            r0.updateDefaultDisplayRefreshRateParams()
            return
    }

    @android.annotation.TargetApi(17)
    private com.bykv.vk.component.ttvideo.player.VsyncTimeHelper.DefaultDisplayListener maybeBuildDefaultDisplayListenerV17(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "display"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.hardware.display.DisplayManager r2 = (android.hardware.display.DisplayManager) r2
            if (r2 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            com.bykv.vk.component.ttvideo.player.VsyncTimeHelper$DefaultDisplayListener r0 = new com.bykv.vk.component.ttvideo.player.VsyncTimeHelper$DefaultDisplayListener
            r0.<init>(r1, r2)
            return r0
    }

    private void updateDefaultDisplayRefreshRateParams() {
            r4 = this;
            android.view.WindowManager r0 = r4.windowManager
            android.view.Display r0 = r0.getDefaultDisplay()
            if (r0 == 0) goto L17
            float r0 = r0.getRefreshRate()
            double r0 = (double) r0
            r2 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r2 = r2 / r0
            long r0 = (long) r2
            r4.vsyncDurationNs = r0
            goto L1c
        L17:
            r0 = 62500000(0x3b9aca0, double:3.0879103E-316)
            r4.vsyncDurationNs = r0
        L1c:
            com.bykv.vk.component.ttvideo.player.VsyncTimeHelper$UIVSyncSampler r0 = r4.vsyncSampler
            long r1 = r4.vsyncDurationNs
            r0.updateVsyncDuration(r1)
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void disable() {
            r1 = this;
            android.view.WindowManager r0 = r1.windowManager
            if (r0 == 0) goto L10
            com.bykv.vk.component.ttvideo.player.VsyncTimeHelper$DefaultDisplayListener r0 = r1.displayListener
            if (r0 == 0) goto Lb
            r0.unregister()
        Lb:
            com.bykv.vk.component.ttvideo.player.VsyncTimeHelper$UIVSyncSampler r0 = r1.vsyncSampler
            r0.removeObserver()
        L10:
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public void enable() {
            r1 = this;
            android.view.WindowManager r0 = r1.windowManager
            if (r0 == 0) goto L13
            com.bykv.vk.component.ttvideo.player.VsyncTimeHelper$UIVSyncSampler r0 = r1.vsyncSampler
            r0.addObserver()
            com.bykv.vk.component.ttvideo.player.VsyncTimeHelper$DefaultDisplayListener r0 = r1.displayListener
            if (r0 == 0) goto L10
            r0.register()
        L10:
            r1.updateDefaultDisplayRefreshRateParams()
        L13:
            return
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int getLowestUIFps() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.VsyncTimeHelper$UIVSyncSampler r0 = r1.vsyncSampler
            int r0 = com.bykv.vk.component.ttvideo.player.VsyncTimeHelper.UIVSyncSampler.access$100(r0)
            return r0
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public int getUIFps() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.VsyncTimeHelper$UIVSyncSampler r0 = r1.vsyncSampler
            int r0 = com.bykv.vk.component.ttvideo.player.VsyncTimeHelper.UIVSyncSampler.access$000(r0)
            return r0
    }

    @com.bykv.vk.component.ttvideo.player.CalledByNative
    public long getVsyncDurationNs() {
            r2 = this;
            long r0 = r2.vsyncDurationNs
            return r0
    }
}
