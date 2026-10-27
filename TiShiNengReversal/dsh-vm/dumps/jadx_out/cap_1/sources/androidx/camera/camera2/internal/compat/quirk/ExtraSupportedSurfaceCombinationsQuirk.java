package androidx.camera.camera2.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements androidx.camera.core.impl.Quirk {
    private static final androidx.camera.core.impl.SurfaceCombination FULL_LEVEL_YUV_PRIV_YUV_CONFIGURATION = null;
    private static final androidx.camera.core.impl.SurfaceCombination FULL_LEVEL_YUV_YUV_YUV_CONFIGURATION = null;
    private static final androidx.camera.core.impl.SurfaceCombination LEVEL_3_LEVEL_PRIV_PRIV_YUV_RAW_CONFIGURATION = null;
    private static final java.util.Set<java.lang.String> SUPPORT_EXTRA_FULL_CONFIGURATIONS_SAMSUNG_MODELS = null;
    private static final java.util.Set<java.lang.String> SUPPORT_EXTRA_LEVEL_3_CONFIGURATIONS_GOOGLE_MODELS = null;
    private static final java.lang.String TAG = "ExtraSupportedSurfaceCombinationsQuirk";

    static {
            androidx.camera.core.impl.SurfaceCombination r0 = createFullYuvPrivYuvConfiguration()
            androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.FULL_LEVEL_YUV_PRIV_YUV_CONFIGURATION = r0
            androidx.camera.core.impl.SurfaceCombination r0 = createFullYuvYuvYuvConfiguration()
            androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.FULL_LEVEL_YUV_YUV_YUV_CONFIGURATION = r0
            androidx.camera.core.impl.SurfaceCombination r0 = createLevel3PrivPrivYuvRawConfiguration()
            androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.LEVEL_3_LEVEL_PRIV_PRIV_YUV_RAW_CONFIGURATION = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r146 = "SM-F916U1"
            java.lang.String r147 = "SM-F916W"
            java.lang.String r1 = "SM-A515F"
            java.lang.String r2 = "SM-A515U"
            java.lang.String r3 = "SM-A515U1"
            java.lang.String r4 = "SM-A515W"
            java.lang.String r5 = "SM-S515DL"
            java.lang.String r6 = "SC-54A"
            java.lang.String r7 = "SCG07"
            java.lang.String r8 = "SM-A5160"
            java.lang.String r9 = "SM-A516B"
            java.lang.String r10 = "SM-A516N"
            java.lang.String r11 = "SM-A516U"
            java.lang.String r12 = "SM-A516U1"
            java.lang.String r13 = "SM-A516V"
            java.lang.String r14 = "SM-A715F"
            java.lang.String r15 = "SM-A715W"
            java.lang.String r16 = "SM-A7160"
            java.lang.String r17 = "SM-A716B"
            java.lang.String r18 = "SM-A716U"
            java.lang.String r19 = "SM-A716U1"
            java.lang.String r20 = "SM-A716V"
            java.lang.String r21 = "SM-A8050"
            java.lang.String r22 = "SM-A805F"
            java.lang.String r23 = "SM-A805N"
            java.lang.String r24 = "SCV44"
            java.lang.String r25 = "SM-F9000"
            java.lang.String r26 = "SM-F900F"
            java.lang.String r27 = "SM-F900U"
            java.lang.String r28 = "SM-F900U1"
            java.lang.String r29 = "SM-F900W"
            java.lang.String r30 = "SM-F907B"
            java.lang.String r31 = "SM-F907N"
            java.lang.String r32 = "SM-N970F"
            java.lang.String r33 = "SM-N9700"
            java.lang.String r34 = "SM-N970U"
            java.lang.String r35 = "SM-N970U1"
            java.lang.String r36 = "SM-N970W"
            java.lang.String r37 = "SM-N971N"
            java.lang.String r38 = "SM-N770F"
            java.lang.String r39 = "SC-01M"
            java.lang.String r40 = "SCV45"
            java.lang.String r41 = "SM-N9750"
            java.lang.String r42 = "SM-N975C"
            java.lang.String r43 = "SM-N975U"
            java.lang.String r44 = "SM-N975U1"
            java.lang.String r45 = "SM-N975W"
            java.lang.String r46 = "SM-N975F"
            java.lang.String r47 = "SM-N976B"
            java.lang.String r48 = "SM-N976N"
            java.lang.String r49 = "SM-N9760"
            java.lang.String r50 = "SM-N976Q"
            java.lang.String r51 = "SM-N976V"
            java.lang.String r52 = "SM-N976U"
            java.lang.String r53 = "SM-N9810"
            java.lang.String r54 = "SM-N981N"
            java.lang.String r55 = "SM-N981U"
            java.lang.String r56 = "SM-N981U1"
            java.lang.String r57 = "SM-N981W"
            java.lang.String r58 = "SM-N981B"
            java.lang.String r59 = "SC-53A"
            java.lang.String r60 = "SCG06"
            java.lang.String r61 = "SM-N9860"
            java.lang.String r62 = "SM-N986N"
            java.lang.String r63 = "SM-N986U"
            java.lang.String r64 = "SM-N986U1"
            java.lang.String r65 = "SM-N986W"
            java.lang.String r66 = "SM-N986B"
            java.lang.String r67 = "SC-03L"
            java.lang.String r68 = "SCV41"
            java.lang.String r69 = "SM-G973F"
            java.lang.String r70 = "SM-G973N"
            java.lang.String r71 = "SM-G9730"
            java.lang.String r72 = "SM-G9738"
            java.lang.String r73 = "SM-G973C"
            java.lang.String r74 = "SM-G973U"
            java.lang.String r75 = "SM-G973U1"
            java.lang.String r76 = "SM-G973W"
            java.lang.String r77 = "SM-G977B"
            java.lang.String r78 = "SM-G977N"
            java.lang.String r79 = "SM-G977P"
            java.lang.String r80 = "SM-G977T"
            java.lang.String r81 = "SM-G977U"
            java.lang.String r82 = "SM-G770F"
            java.lang.String r83 = "SM-G770U1"
            java.lang.String r84 = "SC-04L"
            java.lang.String r85 = "SCV42"
            java.lang.String r86 = "SM-G975F"
            java.lang.String r87 = "SM-G975N"
            java.lang.String r88 = "SM-G9750"
            java.lang.String r89 = "SM-G9758"
            java.lang.String r90 = "SM-G975U"
            java.lang.String r91 = "SM-G975U1"
            java.lang.String r92 = "SM-G975W"
            java.lang.String r93 = "SC-05L"
            java.lang.String r94 = "SM-G970F"
            java.lang.String r95 = "SM-G970N"
            java.lang.String r96 = "SM-G9700"
            java.lang.String r97 = "SM-G9708"
            java.lang.String r98 = "SM-G970U"
            java.lang.String r99 = "SM-G970U1"
            java.lang.String r100 = "SM-G970W"
            java.lang.String r101 = "SC-51A"
            java.lang.String r102 = "SC51Aa"
            java.lang.String r103 = "SCG01"
            java.lang.String r104 = "SM-G9810"
            java.lang.String r105 = "SM-G981N"
            java.lang.String r106 = "SM-G981U"
            java.lang.String r107 = "SM-G981U1"
            java.lang.String r108 = "SM-G981V"
            java.lang.String r109 = "SM-G981W"
            java.lang.String r110 = "SM-G981B"
            java.lang.String r111 = "SCG03"
            java.lang.String r112 = "SM-G9880"
            java.lang.String r113 = "SM-G988N"
            java.lang.String r114 = "SM-G988Q"
            java.lang.String r115 = "SM-G988U"
            java.lang.String r116 = "SM-G988U1"
            java.lang.String r117 = "SM-G988W"
            java.lang.String r118 = "SM-G988B"
            java.lang.String r119 = "SC-52A"
            java.lang.String r120 = "SCG02"
            java.lang.String r121 = "SM-G9860"
            java.lang.String r122 = "SM-G986N"
            java.lang.String r123 = "SM-G986U"
            java.lang.String r124 = "SM-G986U1"
            java.lang.String r125 = "SM-G986W"
            java.lang.String r126 = "SM-G986B"
            java.lang.String r127 = "SCV47"
            java.lang.String r128 = "SM-F7000"
            java.lang.String r129 = "SM-F700F"
            java.lang.String r130 = "SM-F700N"
            java.lang.String r131 = "SM-F700U"
            java.lang.String r132 = "SM-F700U1"
            java.lang.String r133 = "SM-F700W"
            java.lang.String r134 = "SCG04"
            java.lang.String r135 = "SM-F7070"
            java.lang.String r136 = "SM-F707B"
            java.lang.String r137 = "SM-F707N"
            java.lang.String r138 = "SM-F707U"
            java.lang.String r139 = "SM-F707U1"
            java.lang.String r140 = "SM-F707W"
            java.lang.String r141 = "SM-F9160"
            java.lang.String r142 = "SM-F916B"
            java.lang.String r143 = "SM-F916N"
            java.lang.String r144 = "SM-F916Q"
            java.lang.String r145 = "SM-F916U"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.SUPPORT_EXTRA_FULL_CONFIGURATIONS_SAMSUNG_MODELS = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "PIXEL 7"
            java.lang.String r2 = "PIXEL 7 PRO"
            java.lang.String r3 = "PIXEL 6"
            java.lang.String r4 = "PIXEL 6 PRO"
            java.lang.String[] r1 = new java.lang.String[]{r3, r4, r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.SUPPORT_EXTRA_LEVEL_3_CONFIGURATIONS_GOOGLE_MODELS = r0
            return
    }

    public ExtraSupportedSurfaceCombinationsQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    private static androidx.camera.core.impl.SurfaceCombination createFullYuvPrivYuvConfiguration() {
            androidx.camera.core.impl.SurfaceCombination r0 = new androidx.camera.core.impl.SurfaceCombination
            r0.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.VGA
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r1, r2)
            r0.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig$ConfigType r2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r3 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r0.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM
            androidx.camera.core.impl.SurfaceConfig r1 = androidx.camera.core.impl.SurfaceConfig.create(r1, r2)
            r0.addSurfaceConfig(r1)
            return r0
    }

    @androidx.annotation.NonNull
    private static androidx.camera.core.impl.SurfaceCombination createFullYuvYuvYuvConfiguration() {
            androidx.camera.core.impl.SurfaceCombination r0 = new androidx.camera.core.impl.SurfaceCombination
            r0.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.VGA
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r1, r2)
            r0.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r1, r2)
            r0.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM
            androidx.camera.core.impl.SurfaceConfig r1 = androidx.camera.core.impl.SurfaceConfig.create(r1, r2)
            r0.addSurfaceConfig(r1)
            return r0
    }

    private static androidx.camera.core.impl.SurfaceCombination createLevel3PrivPrivYuvRawConfiguration() {
            androidx.camera.core.impl.SurfaceCombination r0 = new androidx.camera.core.impl.SurfaceCombination
            r0.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r1, r2)
            r0.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.VGA
            androidx.camera.core.impl.SurfaceConfig r1 = androidx.camera.core.impl.SurfaceConfig.create(r1, r2)
            r0.addSurfaceConfig(r1)
            androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM
            androidx.camera.core.impl.SurfaceConfig r1 = androidx.camera.core.impl.SurfaceConfig.create(r1, r2)
            r0.addSurfaceConfig(r1)
            androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = androidx.camera.core.impl.SurfaceConfig.ConfigType.RAW
            androidx.camera.core.impl.SurfaceConfig r1 = androidx.camera.core.impl.SurfaceConfig.create(r1, r2)
            r0.addSurfaceConfig(r1)
            return r0
    }

    @androidx.annotation.NonNull
    private java.util.List<androidx.camera.core.impl.SurfaceCombination> getLimitedDeviceExtraSupportedFullConfigurations(int r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r2 != 0) goto L11
            androidx.camera.core.impl.SurfaceCombination r2 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.FULL_LEVEL_YUV_PRIV_YUV_CONFIGURATION
            r0.add(r2)
            androidx.camera.core.impl.SurfaceCombination r2 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.FULL_LEVEL_YUV_YUV_YUV_CONFIGURATION
            r0.add(r2)
        L11:
            return r0
    }

    @androidx.annotation.NonNull
    private java.util.List<androidx.camera.core.impl.SurfaceCombination> getSamsungS7ExtraCombinations(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "1"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L12
            androidx.camera.core.impl.SurfaceCombination r3 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.FULL_LEVEL_YUV_PRIV_YUV_CONFIGURATION
            r0.add(r3)
        L12:
            return r0
    }

    private static boolean isSamsungS7() {
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r1 = "heroqltevzw"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 != 0) goto L15
            java.lang.String r1 = "heroqltetmo"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    static boolean load() {
            boolean r0 = isSamsungS7()
            if (r0 != 0) goto L15
            boolean r0 = supportExtraFullConfigurationsSamsungDevice()
            if (r0 != 0) goto L15
            boolean r0 = supportExtraLevel3ConfigurationsGoogleDevice()
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    private static boolean supportExtraFullConfigurationsSamsungDevice() {
            java.lang.String r0 = "samsung"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            java.lang.String r0 = android.os.Build.MODEL
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toUpperCase(r1)
            java.util.Set<java.lang.String> r1 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.SUPPORT_EXTRA_FULL_CONFIGURATIONS_SAMSUNG_MODELS
            boolean r0 = r1.contains(r0)
            return r0
    }

    private static boolean supportExtraLevel3ConfigurationsGoogleDevice() {
            java.lang.String r0 = "google"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            java.lang.String r0 = android.os.Build.MODEL
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toUpperCase(r1)
            java.util.Set<java.lang.String> r1 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.SUPPORT_EXTRA_LEVEL_3_CONFIGURATIONS_GOOGLE_MODELS
            boolean r0 = r1.contains(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.impl.SurfaceCombination> getExtraSupportedSurfaceCombinations(@androidx.annotation.NonNull java.lang.String r2, int r3) {
            r1 = this;
            boolean r0 = isSamsungS7()
            if (r0 == 0) goto Lb
            java.util.List r2 = r1.getSamsungS7ExtraCombinations(r2)
            return r2
        Lb:
            boolean r2 = supportExtraFullConfigurationsSamsungDevice()
            if (r2 == 0) goto L16
            java.util.List r2 = r1.getLimitedDeviceExtraSupportedFullConfigurations(r3)
            return r2
        L16:
            boolean r2 = supportExtraLevel3ConfigurationsGoogleDevice()
            if (r2 == 0) goto L23
            androidx.camera.core.impl.SurfaceCombination r2 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.LEVEL_3_LEVEL_PRIV_PRIV_YUV_RAW_CONFIGURATION
            java.util.List r2 = java.util.Collections.singletonList(r2)
            return r2
        L23:
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            return r2
    }
}
