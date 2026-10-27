package androidx.camera.core.internal.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SizeUtil {
    public static final android.util.Size RESOLUTION_1080P = null;
    public static final android.util.Size RESOLUTION_1440P = null;
    public static final android.util.Size RESOLUTION_480P = null;
    public static final android.util.Size RESOLUTION_720P = null;
    public static final android.util.Size RESOLUTION_QVGA = null;
    public static final android.util.Size RESOLUTION_VGA = null;
    public static final android.util.Size RESOLUTION_ZERO = null;

    static {
            android.util.Size r0 = new android.util.Size
            r1 = 0
            r0.<init>(r1, r1)
            androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_ZERO = r0
            android.util.Size r0 = new android.util.Size
            r1 = 320(0x140, float:4.48E-43)
            r2 = 240(0xf0, float:3.36E-43)
            r0.<init>(r1, r2)
            androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_QVGA = r0
            android.util.Size r0 = new android.util.Size
            r1 = 640(0x280, float:8.97E-43)
            r2 = 480(0x1e0, float:6.73E-43)
            r0.<init>(r1, r2)
            androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_VGA = r0
            android.util.Size r0 = new android.util.Size
            r1 = 720(0x2d0, float:1.009E-42)
            r0.<init>(r1, r2)
            androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_480P = r0
            android.util.Size r0 = new android.util.Size
            r2 = 1280(0x500, float:1.794E-42)
            r0.<init>(r2, r1)
            androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_720P = r0
            android.util.Size r0 = new android.util.Size
            r1 = 1080(0x438, float:1.513E-42)
            r2 = 1920(0x780, float:2.69E-42)
            r0.<init>(r2, r1)
            androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_1080P = r0
            android.util.Size r0 = new android.util.Size
            r1 = 1440(0x5a0, float:2.018E-42)
            r0.<init>(r2, r1)
            androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_1440P = r0
            return
    }

    private SizeUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getArea(@androidx.annotation.NonNull android.util.Size r1) {
            int r0 = r1.getWidth()
            int r1 = r1.getHeight()
            int r0 = r0 * r1
            return r0
    }

    @androidx.annotation.Nullable
    public static android.util.Size getMaxSize(@androidx.annotation.NonNull java.util.List<android.util.Size> r1) {
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            androidx.camera.core.impl.utils.CompareSizesByArea r0 = new androidx.camera.core.impl.utils.CompareSizesByArea
            r0.<init>()
            java.lang.Object r1 = java.util.Collections.max(r1, r0)
            android.util.Size r1 = (android.util.Size) r1
            return r1
    }

    public static boolean isLongerInAnyEdge(@androidx.annotation.NonNull android.util.Size r2, @androidx.annotation.NonNull android.util.Size r3) {
            int r0 = r2.getWidth()
            int r1 = r3.getWidth()
            if (r0 > r1) goto L17
            int r2 = r2.getHeight()
            int r3 = r3.getHeight()
            if (r2 <= r3) goto L15
            goto L17
        L15:
            r2 = 0
            return r2
        L17:
            r2 = 1
            return r2
    }

    public static boolean isSmallerByArea(@androidx.annotation.NonNull android.util.Size r0, @androidx.annotation.NonNull android.util.Size r1) {
            int r0 = getArea(r0)
            int r1 = getArea(r1)
            if (r0 >= r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }
}
