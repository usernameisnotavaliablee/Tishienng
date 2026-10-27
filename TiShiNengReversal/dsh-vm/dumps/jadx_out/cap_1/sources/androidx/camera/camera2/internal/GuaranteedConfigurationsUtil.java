package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class GuaranteedConfigurationsUtil {
    private GuaranteedConfigurationsUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static java.util.List<androidx.camera.core.impl.SurfaceCombination> generateSupportedCombinationList(int r4, boolean r5, boolean r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = getLegacySupportedCombinationList()
            r0.addAll(r1)
            r1 = 1
            r2 = 3
            if (r4 == 0) goto L14
            if (r4 == r1) goto L14
            if (r4 != r2) goto L1b
        L14:
            java.util.List r3 = getLimitedSupportedCombinationList()
            r0.addAll(r3)
        L1b:
            if (r4 == r1) goto L1f
            if (r4 != r2) goto L26
        L1f:
            java.util.List r1 = getFullSupportedCombinationList()
            r0.addAll(r1)
        L26:
            if (r5 == 0) goto L2f
            java.util.List r5 = getRAWSupportedCombinationList()
            r0.addAll(r5)
        L2f:
            if (r6 == 0) goto L3a
            if (r4 != 0) goto L3a
            java.util.List r5 = getBurstSupportedCombinationList()
            r0.addAll(r5)
        L3a:
            if (r4 != r2) goto L43
            java.util.List r4 = getLevel3SupportedCombinationList()
            r0.addAll(r4)
        L43:
            return r0
    }

    @androidx.annotation.NonNull
    public static java.util.List<androidx.camera.core.impl.SurfaceCombination> get10BitSupportedCombinationList() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r3 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM
            androidx.camera.core.impl.SurfaceConfig r4 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r4)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r4 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV
            androidx.camera.core.impl.SurfaceConfig r5 = androidx.camera.core.impl.SurfaceConfig.create(r4, r3)
            r1.addSurfaceConfig(r5)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r5 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW
            androidx.camera.core.impl.SurfaceConfig r6 = androidx.camera.core.impl.SurfaceConfig.create(r2, r5)
            r1.addSurfaceConfig(r6)
            androidx.camera.core.impl.SurfaceConfig$ConfigType r6 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r6, r3)
            r1.addSurfaceConfig(r7)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r2, r5)
            r1.addSurfaceConfig(r7)
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r4, r3)
            r1.addSurfaceConfig(r7)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r4, r5)
            r1.addSurfaceConfig(r7)
            androidx.camera.core.impl.SurfaceConfig r3 = androidx.camera.core.impl.SurfaceConfig.create(r4, r3)
            r1.addSurfaceConfig(r3)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r3 = androidx.camera.core.impl.SurfaceConfig.create(r2, r5)
            r1.addSurfaceConfig(r3)
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r3 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.RECORD
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r7)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r2, r5)
            r1.addSurfaceConfig(r7)
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r7)
            androidx.camera.core.impl.SurfaceConfig r4 = androidx.camera.core.impl.SurfaceConfig.create(r4, r3)
            r1.addSurfaceConfig(r4)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r4 = androidx.camera.core.impl.SurfaceConfig.create(r2, r5)
            r1.addSurfaceConfig(r4)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r6, r3)
            r1.addSurfaceConfig(r2)
            r0.add(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.util.List<androidx.camera.core.impl.SurfaceCombination> getBurstSupportedCombinationList() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r3 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW
            androidx.camera.core.impl.SurfaceConfig r4 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r4)
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r4 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM
            androidx.camera.core.impl.SurfaceConfig r5 = androidx.camera.core.impl.SurfaceConfig.create(r2, r4)
            r1.addSurfaceConfig(r5)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig$ConfigType r2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV
            androidx.camera.core.impl.SurfaceConfig r5 = androidx.camera.core.impl.SurfaceConfig.create(r2, r4)
            r1.addSurfaceConfig(r5)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r3 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r3)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r2, r4)
            r1.addSurfaceConfig(r2)
            r0.add(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.util.List<androidx.camera.core.impl.SurfaceCombination> getConcurrentSupportedCombinationList() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r3 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.s1440p
            androidx.camera.core.impl.SurfaceConfig r4 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r4)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r4 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV
            androidx.camera.core.impl.SurfaceConfig r5 = androidx.camera.core.impl.SurfaceConfig.create(r4, r3)
            r1.addSurfaceConfig(r5)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r5 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG
            androidx.camera.core.impl.SurfaceConfig r6 = androidx.camera.core.impl.SurfaceConfig.create(r5, r3)
            r1.addSurfaceConfig(r6)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r6 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.s720p
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r2, r6)
            r1.addSurfaceConfig(r7)
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r5, r3)
            r1.addSurfaceConfig(r7)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r4, r6)
            r1.addSurfaceConfig(r7)
            androidx.camera.core.impl.SurfaceConfig r5 = androidx.camera.core.impl.SurfaceConfig.create(r5, r3)
            r1.addSurfaceConfig(r5)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r5 = androidx.camera.core.impl.SurfaceConfig.create(r2, r6)
            r1.addSurfaceConfig(r5)
            androidx.camera.core.impl.SurfaceConfig r5 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r5)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r5 = androidx.camera.core.impl.SurfaceConfig.create(r2, r6)
            r1.addSurfaceConfig(r5)
            androidx.camera.core.impl.SurfaceConfig r5 = androidx.camera.core.impl.SurfaceConfig.create(r4, r3)
            r1.addSurfaceConfig(r5)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r5 = androidx.camera.core.impl.SurfaceConfig.create(r4, r6)
            r1.addSurfaceConfig(r5)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r2)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r4, r6)
            r1.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r4, r3)
            r1.addSurfaceConfig(r2)
            r0.add(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.util.List<androidx.camera.core.impl.SurfaceCombination> getFullSupportedCombinationList() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r3 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW
            androidx.camera.core.impl.SurfaceConfig r4 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r4)
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r4 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM
            androidx.camera.core.impl.SurfaceConfig r5 = androidx.camera.core.impl.SurfaceConfig.create(r2, r4)
            r1.addSurfaceConfig(r5)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r5 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r5)
            androidx.camera.core.impl.SurfaceConfig$ConfigType r5 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV
            androidx.camera.core.impl.SurfaceConfig r6 = androidx.camera.core.impl.SurfaceConfig.create(r5, r4)
            r1.addSurfaceConfig(r6)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r6 = androidx.camera.core.impl.SurfaceConfig.create(r5, r3)
            r1.addSurfaceConfig(r6)
            androidx.camera.core.impl.SurfaceConfig r6 = androidx.camera.core.impl.SurfaceConfig.create(r5, r4)
            r1.addSurfaceConfig(r6)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r6 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r6)
            androidx.camera.core.impl.SurfaceConfig r6 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r6)
            androidx.camera.core.impl.SurfaceConfig$ConfigType r6 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG
            androidx.camera.core.impl.SurfaceConfig r6 = androidx.camera.core.impl.SurfaceConfig.create(r6, r4)
            r1.addSurfaceConfig(r6)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r6 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.VGA
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r5, r6)
            r1.addSurfaceConfig(r7)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r5, r4)
            r1.addSurfaceConfig(r2)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r5, r6)
            r1.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r5, r3)
            r1.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r5, r4)
            r1.addSurfaceConfig(r2)
            r0.add(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.util.List<androidx.camera.core.impl.SurfaceCombination> getLegacySupportedCombinationList() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r3 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM
            androidx.camera.core.impl.SurfaceConfig r4 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r4)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r4 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG
            androidx.camera.core.impl.SurfaceConfig r5 = androidx.camera.core.impl.SurfaceConfig.create(r4, r3)
            r1.addSurfaceConfig(r5)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r5 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV
            androidx.camera.core.impl.SurfaceConfig r6 = androidx.camera.core.impl.SurfaceConfig.create(r5, r3)
            r1.addSurfaceConfig(r6)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r6 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r2, r6)
            r1.addSurfaceConfig(r7)
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r4, r3)
            r1.addSurfaceConfig(r7)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r5, r6)
            r1.addSurfaceConfig(r7)
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r4, r3)
            r1.addSurfaceConfig(r7)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r2, r6)
            r1.addSurfaceConfig(r7)
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r2, r6)
            r1.addSurfaceConfig(r7)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r2, r6)
            r1.addSurfaceConfig(r7)
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r5, r6)
            r1.addSurfaceConfig(r7)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r2, r6)
            r1.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r5, r6)
            r1.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r4, r3)
            r1.addSurfaceConfig(r2)
            r0.add(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.util.List<androidx.camera.core.impl.SurfaceCombination> getLevel3SupportedCombinationList() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r3 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW
            androidx.camera.core.impl.SurfaceConfig r4 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r4)
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r4 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.VGA
            androidx.camera.core.impl.SurfaceConfig r5 = androidx.camera.core.impl.SurfaceConfig.create(r2, r4)
            r1.addSurfaceConfig(r5)
            androidx.camera.core.impl.SurfaceConfig$ConfigType r5 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r6 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM
            androidx.camera.core.impl.SurfaceConfig r5 = androidx.camera.core.impl.SurfaceConfig.create(r5, r6)
            r1.addSurfaceConfig(r5)
            androidx.camera.core.impl.SurfaceConfig$ConfigType r5 = androidx.camera.core.impl.SurfaceConfig.ConfigType.RAW
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r5, r6)
            r1.addSurfaceConfig(r7)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r3 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r3)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r2, r4)
            r1.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig$ConfigType r2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r2, r6)
            r1.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r5, r6)
            r1.addSurfaceConfig(r2)
            r0.add(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.util.List<androidx.camera.core.impl.SurfaceCombination> getLimitedSupportedCombinationList() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r3 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW
            androidx.camera.core.impl.SurfaceConfig r4 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r4)
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r4 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.RECORD
            androidx.camera.core.impl.SurfaceConfig r5 = androidx.camera.core.impl.SurfaceConfig.create(r2, r4)
            r1.addSurfaceConfig(r5)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r5 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r5)
            androidx.camera.core.impl.SurfaceConfig$ConfigType r5 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV
            androidx.camera.core.impl.SurfaceConfig r6 = androidx.camera.core.impl.SurfaceConfig.create(r5, r4)
            r1.addSurfaceConfig(r6)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r6 = androidx.camera.core.impl.SurfaceConfig.create(r5, r3)
            r1.addSurfaceConfig(r6)
            androidx.camera.core.impl.SurfaceConfig r6 = androidx.camera.core.impl.SurfaceConfig.create(r5, r4)
            r1.addSurfaceConfig(r6)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r6 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r6)
            androidx.camera.core.impl.SurfaceConfig r6 = androidx.camera.core.impl.SurfaceConfig.create(r2, r4)
            r1.addSurfaceConfig(r6)
            androidx.camera.core.impl.SurfaceConfig$ConfigType r6 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r6, r4)
            r1.addSurfaceConfig(r7)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r5, r4)
            r1.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r6, r4)
            r1.addSurfaceConfig(r2)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r5, r3)
            r1.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r5, r3)
            r1.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r6, r2)
            r1.addSurfaceConfig(r2)
            r0.add(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.util.List<androidx.camera.core.impl.SurfaceCombination> getRAWSupportedCombinationList() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.RAW
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r3 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM
            androidx.camera.core.impl.SurfaceConfig r4 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r4)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r4 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r5 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW
            androidx.camera.core.impl.SurfaceConfig r6 = androidx.camera.core.impl.SurfaceConfig.create(r4, r5)
            r1.addSurfaceConfig(r6)
            androidx.camera.core.impl.SurfaceConfig r6 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r6)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r6 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r6, r5)
            r1.addSurfaceConfig(r7)
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r7)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r4, r5)
            r1.addSurfaceConfig(r7)
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r4, r5)
            r1.addSurfaceConfig(r7)
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r7)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r4, r5)
            r1.addSurfaceConfig(r7)
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r6, r5)
            r1.addSurfaceConfig(r7)
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r7)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r6, r5)
            r1.addSurfaceConfig(r7)
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r6, r5)
            r1.addSurfaceConfig(r7)
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r7)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r4 = androidx.camera.core.impl.SurfaceConfig.create(r4, r5)
            r1.addSurfaceConfig(r4)
            androidx.camera.core.impl.SurfaceConfig$ConfigType r4 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r4, r3)
            r1.addSurfaceConfig(r7)
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r7)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r5 = androidx.camera.core.impl.SurfaceConfig.create(r6, r5)
            r1.addSurfaceConfig(r5)
            androidx.camera.core.impl.SurfaceConfig r4 = androidx.camera.core.impl.SurfaceConfig.create(r4, r3)
            r1.addSurfaceConfig(r4)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r2)
            r0.add(r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(api = 33)
    public static java.util.List<androidx.camera.core.impl.SurfaceCombination> getStreamUseCaseSupportedCombinationList() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r3 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.s1440p
            r4 = 4
            androidx.camera.core.impl.SurfaceConfig r6 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3, r4)
            r1.addSurfaceConfig(r6)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r6 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV
            androidx.camera.core.impl.SurfaceConfig r3 = androidx.camera.core.impl.SurfaceConfig.create(r6, r3, r4)
            r1.addSurfaceConfig(r3)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r3 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.RECORD
            r4 = 3
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3, r4)
            r1.addSurfaceConfig(r7)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r6, r3, r4)
            r1.addSurfaceConfig(r7)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r7 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r8 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM
            r9 = 2
            androidx.camera.core.impl.SurfaceConfig r11 = androidx.camera.core.impl.SurfaceConfig.create(r7, r8, r9)
            r1.addSurfaceConfig(r11)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r11 = androidx.camera.core.impl.SurfaceConfig.create(r6, r8, r9)
            r1.addSurfaceConfig(r11)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r11 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW
            r12 = 1
            androidx.camera.core.impl.SurfaceConfig r14 = androidx.camera.core.impl.SurfaceConfig.create(r2, r11, r12)
            r1.addSurfaceConfig(r14)
            androidx.camera.core.impl.SurfaceConfig r14 = androidx.camera.core.impl.SurfaceConfig.create(r7, r8, r9)
            r1.addSurfaceConfig(r14)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r14 = androidx.camera.core.impl.SurfaceConfig.create(r2, r11, r12)
            r1.addSurfaceConfig(r14)
            androidx.camera.core.impl.SurfaceConfig r14 = androidx.camera.core.impl.SurfaceConfig.create(r6, r8, r9)
            r1.addSurfaceConfig(r14)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r14 = androidx.camera.core.impl.SurfaceConfig.create(r2, r11, r12)
            r1.addSurfaceConfig(r14)
            androidx.camera.core.impl.SurfaceConfig r14 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3, r4)
            r1.addSurfaceConfig(r14)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r14 = androidx.camera.core.impl.SurfaceConfig.create(r2, r11, r12)
            r1.addSurfaceConfig(r14)
            androidx.camera.core.impl.SurfaceConfig r14 = androidx.camera.core.impl.SurfaceConfig.create(r6, r3, r4)
            r1.addSurfaceConfig(r14)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r14 = androidx.camera.core.impl.SurfaceConfig.create(r2, r11, r12)
            r1.addSurfaceConfig(r14)
            androidx.camera.core.impl.SurfaceConfig r14 = androidx.camera.core.impl.SurfaceConfig.create(r6, r11, r12)
            r1.addSurfaceConfig(r14)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r14 = androidx.camera.core.impl.SurfaceConfig.create(r2, r11, r12)
            r1.addSurfaceConfig(r14)
            androidx.camera.core.impl.SurfaceConfig r14 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3, r4)
            r1.addSurfaceConfig(r14)
            androidx.camera.core.impl.SurfaceConfig r14 = androidx.camera.core.impl.SurfaceConfig.create(r7, r3, r9)
            r1.addSurfaceConfig(r14)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r14 = androidx.camera.core.impl.SurfaceConfig.create(r2, r11, r12)
            r1.addSurfaceConfig(r14)
            androidx.camera.core.impl.SurfaceConfig r4 = androidx.camera.core.impl.SurfaceConfig.create(r6, r3, r4)
            r1.addSurfaceConfig(r4)
            androidx.camera.core.impl.SurfaceConfig r3 = androidx.camera.core.impl.SurfaceConfig.create(r7, r3, r9)
            r1.addSurfaceConfig(r3)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r2, r11, r12)
            r1.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r6, r11, r12)
            r1.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r7, r8, r9)
            r1.addSurfaceConfig(r2)
            r0.add(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.util.List<androidx.camera.core.impl.SurfaceCombination> getUltraHighResolutionSupportedCombinationList() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r2 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r3 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.ULTRA_MAXIMUM
            androidx.camera.core.impl.SurfaceConfig r4 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r4)
            androidx.camera.core.impl.SurfaceConfig$ConfigType r4 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r5 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW
            androidx.camera.core.impl.SurfaceConfig r6 = androidx.camera.core.impl.SurfaceConfig.create(r4, r5)
            r1.addSurfaceConfig(r6)
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r6 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.RECORD
            androidx.camera.core.impl.SurfaceConfig r7 = androidx.camera.core.impl.SurfaceConfig.create(r4, r6)
            r1.addSurfaceConfig(r7)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r7 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG
            androidx.camera.core.impl.SurfaceConfig r8 = androidx.camera.core.impl.SurfaceConfig.create(r7, r3)
            r1.addSurfaceConfig(r8)
            androidx.camera.core.impl.SurfaceConfig r8 = androidx.camera.core.impl.SurfaceConfig.create(r4, r5)
            r1.addSurfaceConfig(r8)
            androidx.camera.core.impl.SurfaceConfig r8 = androidx.camera.core.impl.SurfaceConfig.create(r4, r6)
            r1.addSurfaceConfig(r8)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig$ConfigType r8 = androidx.camera.core.impl.SurfaceConfig.ConfigType.RAW
            androidx.camera.core.impl.SurfaceConfig r9 = androidx.camera.core.impl.SurfaceConfig.create(r8, r3)
            r1.addSurfaceConfig(r9)
            androidx.camera.core.impl.SurfaceConfig r9 = androidx.camera.core.impl.SurfaceConfig.create(r4, r5)
            r1.addSurfaceConfig(r9)
            androidx.camera.core.impl.SurfaceConfig r6 = androidx.camera.core.impl.SurfaceConfig.create(r4, r6)
            r1.addSurfaceConfig(r6)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r6 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r6)
            androidx.camera.core.impl.SurfaceConfig r6 = androidx.camera.core.impl.SurfaceConfig.create(r4, r5)
            r1.addSurfaceConfig(r6)
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r6 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM
            androidx.camera.core.impl.SurfaceConfig r9 = androidx.camera.core.impl.SurfaceConfig.create(r7, r6)
            r1.addSurfaceConfig(r9)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r9 = androidx.camera.core.impl.SurfaceConfig.create(r7, r3)
            r1.addSurfaceConfig(r9)
            androidx.camera.core.impl.SurfaceConfig r9 = androidx.camera.core.impl.SurfaceConfig.create(r4, r5)
            r1.addSurfaceConfig(r9)
            androidx.camera.core.impl.SurfaceConfig r9 = androidx.camera.core.impl.SurfaceConfig.create(r7, r6)
            r1.addSurfaceConfig(r9)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r9 = androidx.camera.core.impl.SurfaceConfig.create(r8, r3)
            r1.addSurfaceConfig(r9)
            androidx.camera.core.impl.SurfaceConfig r9 = androidx.camera.core.impl.SurfaceConfig.create(r4, r5)
            r1.addSurfaceConfig(r9)
            androidx.camera.core.impl.SurfaceConfig r9 = androidx.camera.core.impl.SurfaceConfig.create(r7, r6)
            r1.addSurfaceConfig(r9)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r9 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r9)
            androidx.camera.core.impl.SurfaceConfig r9 = androidx.camera.core.impl.SurfaceConfig.create(r4, r5)
            r1.addSurfaceConfig(r9)
            androidx.camera.core.impl.SurfaceConfig r9 = androidx.camera.core.impl.SurfaceConfig.create(r2, r6)
            r1.addSurfaceConfig(r9)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r9 = androidx.camera.core.impl.SurfaceConfig.create(r7, r3)
            r1.addSurfaceConfig(r9)
            androidx.camera.core.impl.SurfaceConfig r9 = androidx.camera.core.impl.SurfaceConfig.create(r4, r5)
            r1.addSurfaceConfig(r9)
            androidx.camera.core.impl.SurfaceConfig r9 = androidx.camera.core.impl.SurfaceConfig.create(r2, r6)
            r1.addSurfaceConfig(r9)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r9 = androidx.camera.core.impl.SurfaceConfig.create(r8, r3)
            r1.addSurfaceConfig(r9)
            androidx.camera.core.impl.SurfaceConfig r9 = androidx.camera.core.impl.SurfaceConfig.create(r4, r5)
            r1.addSurfaceConfig(r9)
            androidx.camera.core.impl.SurfaceConfig r9 = androidx.camera.core.impl.SurfaceConfig.create(r2, r6)
            r1.addSurfaceConfig(r9)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r2, r3)
            r1.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r4, r5)
            r1.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r8, r6)
            r1.addSurfaceConfig(r2)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r7, r3)
            r1.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r4, r5)
            r1.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r8, r6)
            r1.addSurfaceConfig(r2)
            r0.add(r1)
            androidx.camera.core.impl.SurfaceCombination r1 = new androidx.camera.core.impl.SurfaceCombination
            r1.<init>()
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r8, r3)
            r1.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r4, r5)
            r1.addSurfaceConfig(r2)
            androidx.camera.core.impl.SurfaceConfig r2 = androidx.camera.core.impl.SurfaceConfig.create(r8, r6)
            r1.addSurfaceConfig(r2)
            r0.add(r1)
            return r0
    }
}
