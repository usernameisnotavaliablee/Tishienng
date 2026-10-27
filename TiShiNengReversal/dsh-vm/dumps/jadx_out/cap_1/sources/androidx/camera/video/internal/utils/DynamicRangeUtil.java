package androidx.camera.video.internal.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class DynamicRangeUtil {
    public static final java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> DR_TO_VP_BIT_DEPTH_MAP = null;
    public static final java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> DR_TO_VP_FORMAT_MAP = null;
    private static final java.util.Map<java.lang.String, java.util.Map<androidx.camera.core.DynamicRange, java.lang.Integer>> MIME_TO_DEFAULT_PROFILE_LEVEL_MAP = null;
    public static final java.util.Map<java.lang.Integer, java.lang.Integer> VP_TO_DR_FORMAT_MAP = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.camera.video.internal.utils.DynamicRangeUtil.DR_TO_VP_BIT_DEPTH_MAP = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            androidx.camera.video.internal.utils.DynamicRangeUtil.DR_TO_VP_FORMAT_MAP = r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            androidx.camera.video.internal.utils.DynamicRangeUtil.VP_TO_DR_FORMAT_MAP = r2
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            androidx.camera.video.internal.utils.DynamicRangeUtil.MIME_TO_DEFAULT_PROFILE_LEVEL_MAP = r3
            r4 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashSet r5 = new java.util.HashSet
            java.util.List r6 = java.util.Collections.singletonList(r4)
            r5.<init>(r6)
            r0.put(r4, r5)
            r5 = 10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.util.HashSet r6 = new java.util.HashSet
            java.util.List r7 = java.util.Collections.singletonList(r5)
            r6.<init>(r7)
            r0.put(r5, r6)
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.util.HashSet r8 = new java.util.HashSet
            r9 = 2
            java.lang.Integer[] r10 = new java.lang.Integer[r9]
            r10[r6] = r4
            r4 = 1
            r10[r4] = r5
            java.util.List r5 = java.util.Arrays.asList(r10)
            r8.<init>(r5)
            r0.put(r7, r8)
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r10 = 3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r12 = 4
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r14 = 5
            java.lang.Integer[] r15 = new java.lang.Integer[r14]
            r15[r6] = r7
            r15[r4] = r5
            r15[r9] = r8
            r15[r10] = r11
            r15[r12] = r13
            java.util.List r15 = java.util.Arrays.asList(r15)
            r0.<init>(r15)
            r1.put(r7, r0)
            java.util.HashSet r0 = new java.util.HashSet
            java.util.List r15 = java.util.Collections.singletonList(r7)
            r0.<init>(r15)
            r1.put(r5, r0)
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.Integer[] r12 = new java.lang.Integer[r12]
            r12[r6] = r5
            r12[r4] = r8
            r12[r9] = r11
            r12[r10] = r13
            java.util.List r4 = java.util.Arrays.asList(r12)
            r0.<init>(r4)
            r1.put(r8, r0)
            java.util.HashSet r0 = new java.util.HashSet
            java.util.List r4 = java.util.Collections.singletonList(r5)
            r0.<init>(r4)
            r1.put(r11, r0)
            java.util.HashSet r0 = new java.util.HashSet
            java.util.List r4 = java.util.Collections.singletonList(r8)
            r0.<init>(r4)
            r1.put(r13, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            java.util.HashSet r4 = new java.util.HashSet
            java.util.List r6 = java.util.Collections.singletonList(r11)
            r4.<init>(r6)
            r1.put(r0, r4)
            r4 = 6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashSet r6 = new java.util.HashSet
            java.util.List r9 = java.util.Collections.singletonList(r13)
            r6.<init>(r9)
            r1.put(r4, r6)
            r2.put(r7, r5)
            r2.put(r5, r11)
            r2.put(r8, r13)
            r2.put(r11, r0)
            r2.put(r13, r4)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.camera.core.DynamicRange r1 = androidx.camera.core.DynamicRange.SDR
            r0.put(r1, r5)
            androidx.camera.core.DynamicRange r2 = androidx.camera.core.DynamicRange.HLG_10_BIT
            r0.put(r2, r8)
            androidx.camera.core.DynamicRange r4 = androidx.camera.core.DynamicRange.HDR10_10_BIT
            r6 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.put(r4, r6)
            androidx.camera.core.DynamicRange r7 = androidx.camera.core.DynamicRange.HDR10_PLUS_10_BIT
            r9 = 8192(0x2000, float:1.148E-41)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0.put(r7, r9)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            r10.put(r1, r5)
            r10.put(r2, r8)
            r10.put(r4, r6)
            r10.put(r7, r9)
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r8.put(r1, r5)
            r8.put(r2, r13)
            r8.put(r4, r6)
            r1 = 16384(0x4000, float:2.2959E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r8.put(r7, r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            androidx.camera.core.DynamicRange r2 = androidx.camera.core.DynamicRange.DOLBY_VISION_10_BIT
            r4 = 256(0x100, float:3.59E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.put(r2, r4)
            androidx.camera.core.DynamicRange r2 = androidx.camera.core.DynamicRange.DOLBY_VISION_8_BIT
            r4 = 512(0x200, float:7.17E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.put(r2, r4)
            java.lang.String r2 = "video/hevc"
            r3.put(r2, r0)
            java.lang.String r0 = "video/av01"
            r3.put(r0, r10)
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            r3.put(r0, r8)
            java.lang.String r0 = "video/dolby-vision"
            r3.put(r0, r1)
            return
    }

    private DynamicRangeUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int dynamicRangeToCodecProfileLevelForMime(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r2) {
            java.util.Map<java.lang.String, java.util.Map<androidx.camera.core.DynamicRange, java.lang.Integer>> r0 = androidx.camera.video.internal.utils.DynamicRangeUtil.MIME_TO_DEFAULT_PROFILE_LEVEL_MAP
            java.lang.Object r1 = r0.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L17
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L17
            int r1 = r1.intValue()
            return r1
        L17:
            r1 = -1
            return r1
    }

    @androidx.annotation.NonNull
    public static java.util.Set<java.lang.Integer> dynamicRangeToVideoProfileBitDepth(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r1) {
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r0 = androidx.camera.video.internal.utils.DynamicRangeUtil.DR_TO_VP_BIT_DEPTH_MAP
            int r1 = r1.getBitDepth()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r0.get(r1)
            java.util.Set r1 = (java.util.Set) r1
            if (r1 != 0) goto L14
            java.util.Set r1 = java.util.Collections.EMPTY_SET
        L14:
            return r1
    }

    @androidx.annotation.NonNull
    public static java.util.Set<java.lang.Integer> dynamicRangeToVideoProfileHdrFormats(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r1) {
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r0 = androidx.camera.video.internal.utils.DynamicRangeUtil.DR_TO_VP_FORMAT_MAP
            int r1 = r1.getEncoding()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r0.get(r1)
            java.util.Set r1 = (java.util.Set) r1
            if (r1 != 0) goto L14
            java.util.Set r1 = java.util.Collections.EMPTY_SET
        L14:
            return r1
    }
}
