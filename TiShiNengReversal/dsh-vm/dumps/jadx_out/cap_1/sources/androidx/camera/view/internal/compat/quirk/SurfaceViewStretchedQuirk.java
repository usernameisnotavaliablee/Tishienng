package androidx.camera.view.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SurfaceViewStretchedQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.lang.String GALAXY_Z_FOLD_2 = "F2Q";
    private static final java.lang.String GALAXY_Z_FOLD_3 = "Q2Q";
    private static final java.lang.String LENOVO = "LENOVO";
    private static final java.lang.String LENOVO_TAB_P12_PRO = "Q706F";
    private static final java.lang.String OPPO = "OPPO";
    private static final java.lang.String OPPO_FIND_N = "OP4E75L1";
    private static final java.lang.String SAMSUNG = "SAMSUNG";

    public SurfaceViewStretchedQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean isLenovoTablet() {
            java.lang.String r0 = "LENOVO"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "Q706F"
            java.lang.String r1 = android.os.Build.DEVICE
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    private static boolean isOppoFoldable() {
            java.lang.String r0 = "OPPO"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "OP4E75L1"
            java.lang.String r1 = android.os.Build.DEVICE
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    private static boolean isSamsungFold2OrFold3() {
            java.lang.String r0 = "SAMSUNG"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1e
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r1 = "F2Q"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 != 0) goto L1c
            java.lang.String r1 = "Q2Q"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L1e
        L1c:
            r0 = 1
            return r0
        L1e:
            r0 = 0
            return r0
    }

    static boolean load() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L1a
            boolean r0 = isSamsungFold2OrFold3()
            if (r0 != 0) goto L18
            boolean r0 = isOppoFoldable()
            if (r0 != 0) goto L18
            boolean r0 = isLenovoTablet()
            if (r0 == 0) goto L1a
        L18:
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
    }
}
