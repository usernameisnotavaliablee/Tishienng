package androidx.camera.camera2.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ExtraCroppingQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.Map<java.lang.String, android.util.Range<java.lang.Integer>> SAMSUNG_DISTORTION_MODELS_TO_API_LEVEL_MAP = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$impl$SurfaceConfig$ConfigType = null;

        static {
                androidx.camera.core.impl.SurfaceConfig$ConfigType[] r0 = androidx.camera.core.impl.SurfaceConfig.ConfigType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$SurfaceConfig$ConfigType = r0
                androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$SurfaceConfig$ConfigType     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$SurfaceConfig$ConfigType     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk.SAMSUNG_DISTORTION_MODELS_TO_API_LEVEL_MAP = r0
            java.lang.String r1 = "SM-T580"
            r2 = 0
            r0.put(r1, r2)
            android.util.Range r1 = new android.util.Range
            r3 = 21
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 26
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.<init>(r3, r4)
            java.lang.String r5 = "SM-J710MN"
            r0.put(r5, r1)
            java.lang.String r1 = "SM-A320FL"
            r0.put(r1, r2)
            java.lang.String r1 = "SM-G570M"
            r0.put(r1, r2)
            java.lang.String r1 = "SM-G610F"
            r0.put(r1, r2)
            android.util.Range r1 = new android.util.Range
            r1.<init>(r3, r4)
            java.lang.String r2 = "SM-G610M"
            r0.put(r2, r1)
            return
    }

    public ExtraCroppingQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean isSamsungDistortion() {
            java.lang.String r0 = "samsung"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L33
            java.util.Map<java.lang.String, android.util.Range<java.lang.Integer>> r0 = androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk.SAMSUNG_DISTORTION_MODELS_TO_API_LEVEL_MAP
            java.lang.String r1 = android.os.Build.MODEL
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r3 = r1.toUpperCase(r2)
            boolean r3 = r0.containsKey(r3)
            if (r3 == 0) goto L33
            java.lang.String r1 = r1.toUpperCase(r2)
            java.lang.Object r0 = r0.get(r1)
            android.util.Range r0 = (android.util.Range) r0
            if (r0 != 0) goto L28
            r0 = 1
            return r0
        L28:
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.contains(r1)
            return r0
        L33:
            r0 = 0
            return r0
    }

    static boolean load() {
            boolean r0 = isSamsungDistortion()
            return r0
    }

    @androidx.annotation.Nullable
    public android.util.Size getVerifiedResolution(@androidx.annotation.NonNull androidx.camera.core.impl.SurfaceConfig.ConfigType r3) {
            r2 = this;
            boolean r0 = isSamsungDistortion()
            r1 = 0
            if (r0 == 0) goto L37
            int[] r0 = androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk.AnonymousClass1.$SwitchMap$androidx$camera$core$impl$SurfaceConfig$ConfigType
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L2d
            r0 = 2
            if (r3 == r0) goto L23
            r0 = 3
            if (r3 == r0) goto L19
            return r1
        L19:
            android.util.Size r3 = new android.util.Size
            r0 = 3264(0xcc0, float:4.574E-42)
            r1 = 1836(0x72c, float:2.573E-42)
            r3.<init>(r0, r1)
            return r3
        L23:
            android.util.Size r3 = new android.util.Size
            r0 = 1280(0x500, float:1.794E-42)
            r1 = 720(0x2d0, float:1.009E-42)
            r3.<init>(r0, r1)
            return r3
        L2d:
            android.util.Size r3 = new android.util.Size
            r0 = 1920(0x780, float:2.69E-42)
            r1 = 1080(0x438, float:1.513E-42)
            r3.<init>(r0, r1)
            return r3
        L37:
            return r1
    }
}
