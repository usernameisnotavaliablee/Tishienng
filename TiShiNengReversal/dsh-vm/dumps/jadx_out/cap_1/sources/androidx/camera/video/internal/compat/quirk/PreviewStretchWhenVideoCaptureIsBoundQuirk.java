package androidx.camera.video.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class PreviewStretchWhenVideoCaptureIsBoundQuirk implements androidx.camera.core.impl.Quirk {
    public PreviewStretchWhenVideoCaptureIsBoundQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean isHuaweiP8Lite() {
            java.lang.String r0 = "HUAWEI"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "HUAWEI ALE-L04"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    private static boolean isOppoA37F() {
            java.lang.String r0 = "OPPO"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "A37F"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    private static boolean isSamsungJ1AceNeo() {
            java.lang.String r0 = "Samsung"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "sm-j111f"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    private static boolean isSamsungJ3() {
            java.lang.String r0 = "Samsung"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "sm-j320f"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    private static boolean isSamsungJ5() {
            java.lang.String r0 = "Samsung"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "sm-j510fn"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    private static boolean isSamsungJ7() {
            java.lang.String r0 = "Samsung"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "sm-j700f"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    static boolean load() {
            boolean r0 = isHuaweiP8Lite()
            if (r0 != 0) goto L27
            boolean r0 = isSamsungJ3()
            if (r0 != 0) goto L27
            boolean r0 = isSamsungJ7()
            if (r0 != 0) goto L27
            boolean r0 = isSamsungJ1AceNeo()
            if (r0 != 0) goto L27
            boolean r0 = isOppoA37F()
            if (r0 != 0) goto L27
            boolean r0 = isSamsungJ5()
            if (r0 == 0) goto L25
            goto L27
        L25:
            r0 = 0
            return r0
        L27:
            r0 = 1
            return r0
    }
}
