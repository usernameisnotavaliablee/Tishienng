package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class DisplayInfoManager {
    private static final android.util.Size ABNORMAL_DISPLAY_SIZE_THRESHOLD = null;
    private static final android.util.Size FALLBACK_DISPLAY_SIZE = null;
    private static final java.lang.Object INSTANCE_LOCK = null;
    private static final android.util.Size MAX_PREVIEW_SIZE = null;
    private static volatile androidx.camera.camera2.internal.DisplayInfoManager sInstance;

    @androidx.annotation.NonNull
    private final android.hardware.display.DisplayManager mDisplayManager;
    private final androidx.camera.camera2.internal.compat.workaround.DisplaySizeCorrector mDisplaySizeCorrector;
    private final androidx.camera.camera2.internal.compat.workaround.MaxPreviewSize mMaxPreviewSize;
    private volatile android.util.Size mPreviewSize;

    static {
            android.util.Size r0 = new android.util.Size
            r1 = 1920(0x780, float:2.69E-42)
            r2 = 1080(0x438, float:1.513E-42)
            r0.<init>(r1, r2)
            androidx.camera.camera2.internal.DisplayInfoManager.MAX_PREVIEW_SIZE = r0
            android.util.Size r0 = new android.util.Size
            r1 = 320(0x140, float:4.48E-43)
            r2 = 240(0xf0, float:3.36E-43)
            r0.<init>(r1, r2)
            androidx.camera.camera2.internal.DisplayInfoManager.ABNORMAL_DISPLAY_SIZE_THRESHOLD = r0
            android.util.Size r0 = new android.util.Size
            r1 = 640(0x280, float:8.97E-43)
            r2 = 480(0x1e0, float:6.73E-43)
            r0.<init>(r1, r2)
            androidx.camera.camera2.internal.DisplayInfoManager.FALLBACK_DISPLAY_SIZE = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.camera.camera2.internal.DisplayInfoManager.INSTANCE_LOCK = r0
            return
    }

    private DisplayInfoManager(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mPreviewSize = r0
            androidx.camera.camera2.internal.compat.workaround.MaxPreviewSize r0 = new androidx.camera.camera2.internal.compat.workaround.MaxPreviewSize
            r0.<init>()
            r1.mMaxPreviewSize = r0
            androidx.camera.camera2.internal.compat.workaround.DisplaySizeCorrector r0 = new androidx.camera.camera2.internal.compat.workaround.DisplaySizeCorrector
            r0.<init>()
            r1.mDisplaySizeCorrector = r0
            java.lang.String r0 = "display"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.hardware.display.DisplayManager r2 = (android.hardware.display.DisplayManager) r2
            r1.mDisplayManager = r2
            return
    }

    private android.util.Size calculatePreviewSize() {
            r5 = this;
            android.util.Size r0 = r5.getCorrectedDisplaySize()
            int r1 = r0.getWidth()
            int r2 = r0.getHeight()
            int r1 = r1 * r2
            android.util.Size r2 = androidx.camera.camera2.internal.DisplayInfoManager.MAX_PREVIEW_SIZE
            int r3 = r2.getWidth()
            int r4 = r2.getHeight()
            int r3 = r3 * r4
            if (r1 <= r3) goto L1d
            r0 = r2
        L1d:
            androidx.camera.camera2.internal.compat.workaround.MaxPreviewSize r1 = r5.mMaxPreviewSize
            android.util.Size r0 = r1.getMaxPreviewResolution(r0)
            return r0
    }

    @androidx.annotation.NonNull
    private android.util.Size getCorrectedDisplaySize() {
            r3 = this;
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            r1 = 0
            android.view.Display r1 = r3.getMaxSizeDisplay(r1)
            r1.getRealSize(r0)
            android.util.Size r1 = new android.util.Size
            int r2 = r0.x
            int r0 = r0.y
            r1.<init>(r2, r0)
            android.util.Size r0 = androidx.camera.camera2.internal.DisplayInfoManager.ABNORMAL_DISPLAY_SIZE_THRESHOLD
            boolean r0 = androidx.camera.core.internal.utils.SizeUtil.isSmallerByArea(r1, r0)
            if (r0 == 0) goto L28
            androidx.camera.camera2.internal.compat.workaround.DisplaySizeCorrector r0 = r3.mDisplaySizeCorrector
            android.util.Size r1 = r0.getDisplaySize()
            if (r1 != 0) goto L28
            android.util.Size r1 = androidx.camera.camera2.internal.DisplayInfoManager.FALLBACK_DISPLAY_SIZE
        L28:
            int r0 = r1.getHeight()
            int r2 = r1.getWidth()
            if (r0 <= r2) goto L40
            android.util.Size r0 = new android.util.Size
            int r2 = r1.getHeight()
            int r1 = r1.getWidth()
            r0.<init>(r2, r1)
            return r0
        L40:
            return r1
    }

    @androidx.annotation.NonNull
    public static androidx.camera.camera2.internal.DisplayInfoManager getInstance(@androidx.annotation.NonNull android.content.Context r2) {
            androidx.camera.camera2.internal.DisplayInfoManager r0 = androidx.camera.camera2.internal.DisplayInfoManager.sInstance
            if (r0 != 0) goto L19
            java.lang.Object r0 = androidx.camera.camera2.internal.DisplayInfoManager.INSTANCE_LOCK
            monitor-enter(r0)
            androidx.camera.camera2.internal.DisplayInfoManager r1 = androidx.camera.camera2.internal.DisplayInfoManager.sInstance     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            androidx.camera.camera2.internal.DisplayInfoManager r1 = new androidx.camera.camera2.internal.DisplayInfoManager     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            androidx.camera.camera2.internal.DisplayInfoManager.sInstance = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            androidx.camera.camera2.internal.DisplayInfoManager r2 = androidx.camera.camera2.internal.DisplayInfoManager.sInstance
            return r2
    }

    @androidx.annotation.Nullable
    private android.view.Display getMaxSizeDisplayInternal(@androidx.annotation.NonNull android.view.Display[] r9, boolean r10) {
            r8 = this;
            int r0 = r9.length
            r1 = 0
            r2 = -1
            r3 = 0
        L4:
            if (r3 >= r0) goto L29
            r4 = r9[r3]
            if (r10 == 0) goto L12
            int r5 = r4.getState()
            r6 = 1
            if (r5 != r6) goto L12
            goto L26
        L12:
            android.graphics.Point r5 = new android.graphics.Point
            r5.<init>()
            r4.getRealSize(r5)
            int r6 = r5.x
            int r5 = r5.y
            int r7 = r6 * r5
            if (r7 <= r2) goto L26
            int r6 = r6 * r5
            r1 = r4
            r2 = r6
        L26:
            int r3 = r3 + 1
            goto L4
        L29:
            return r1
    }

    @androidx.annotation.VisibleForTesting
    static void releaseInstance() {
            r0 = 0
            androidx.camera.camera2.internal.DisplayInfoManager.sInstance = r0
            return
    }

    @androidx.annotation.NonNull
    public android.view.Display getMaxSizeDisplay(boolean r5) {
            r4 = this;
            android.hardware.display.DisplayManager r0 = r4.mDisplayManager
            android.view.Display[] r0 = r0.getDisplays()
            int r1 = r0.length
            r2 = 1
            r3 = 0
            if (r1 != r2) goto Le
            r5 = r0[r3]
            return r5
        Le:
            android.view.Display r1 = r4.getMaxSizeDisplayInternal(r0, r5)
            if (r1 != 0) goto L1a
            if (r5 == 0) goto L1a
            android.view.Display r1 = r4.getMaxSizeDisplayInternal(r0, r3)
        L1a:
            if (r1 == 0) goto L1d
            return r1
        L1d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "No display can be found from the input display manager!"
            r5.<init>(r0)
            throw r5
    }

    @androidx.annotation.NonNull
    android.util.Size getPreviewSize() {
            r1 = this;
            android.util.Size r0 = r1.mPreviewSize
            if (r0 == 0) goto L7
            android.util.Size r0 = r1.mPreviewSize
            return r0
        L7:
            android.util.Size r0 = r1.calculatePreviewSize()
            r1.mPreviewSize = r0
            android.util.Size r0 = r1.mPreviewSize
            return r0
    }

    void refresh() {
            r1 = this;
            android.util.Size r0 = r1.calculatePreviewSize()
            r1.mPreviewSize = r0
            return
    }
}
