package androidx.camera.camera2.internal.compat.params;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(33)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class DynamicRangeConversions {
    private static final java.util.Map<androidx.camera.core.DynamicRange, java.util.List<java.lang.Long>> DR_TO_PROFILE_MAP = null;
    private static final java.util.Map<java.lang.Long, androidx.camera.core.DynamicRange> PROFILE_TO_DR_MAP = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.camera.camera2.internal.compat.params.DynamicRangeConversions.PROFILE_TO_DR_MAP = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            androidx.camera.camera2.internal.compat.params.DynamicRangeConversions.DR_TO_PROFILE_MAP = r1
            r2 = 1
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            androidx.camera.core.DynamicRange r3 = androidx.camera.core.DynamicRange.SDR
            r0.put(r2, r3)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r1.put(r3, r2)
            r2 = 2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            androidx.camera.core.DynamicRange r3 = androidx.camera.core.DynamicRange.HLG_10_BIT
            r0.put(r2, r3)
            java.lang.Object r3 = r0.get(r2)
            androidx.camera.core.DynamicRange r3 = (androidx.camera.core.DynamicRange) r3
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r1.put(r3, r2)
            r2 = 4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            androidx.camera.core.DynamicRange r3 = androidx.camera.core.DynamicRange.HDR10_10_BIT
            r0.put(r2, r3)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r1.put(r3, r2)
            r2 = 8
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            androidx.camera.core.DynamicRange r3 = androidx.camera.core.DynamicRange.HDR10_PLUS_10_BIT
            r0.put(r2, r3)
            java.util.List r0 = java.util.Collections.singletonList(r2)
            r1.put(r3, r0)
            r0 = 64
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 128(0x80, double:6.3E-322)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 16
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 32
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 4
            java.lang.Long[] r5 = new java.lang.Long[r4]
            r6 = 0
            r5[r6] = r0
            r0 = 1
            r5[r0] = r1
            r1 = 2
            r5[r1] = r2
            r2 = 3
            r5[r2] = r3
            java.util.List r3 = java.util.Arrays.asList(r5)
            java.util.Iterator r5 = r3.iterator()
        L8b:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L9f
            java.lang.Object r7 = r5.next()
            java.lang.Long r7 = (java.lang.Long) r7
            java.util.Map<java.lang.Long, androidx.camera.core.DynamicRange> r8 = androidx.camera.camera2.internal.compat.params.DynamicRangeConversions.PROFILE_TO_DR_MAP
            androidx.camera.core.DynamicRange r9 = androidx.camera.core.DynamicRange.DOLBY_VISION_10_BIT
            r8.put(r7, r9)
            goto L8b
        L9f:
            java.util.Map<androidx.camera.core.DynamicRange, java.util.List<java.lang.Long>> r5 = androidx.camera.camera2.internal.compat.params.DynamicRangeConversions.DR_TO_PROFILE_MAP
            androidx.camera.core.DynamicRange r7 = androidx.camera.core.DynamicRange.DOLBY_VISION_10_BIT
            r5.put(r7, r3)
            r7 = 1024(0x400, double:5.06E-321)
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            r7 = 2048(0x800, double:1.012E-320)
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            r7 = 256(0x100, double:1.265E-321)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 512(0x200, double:2.53E-321)
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.Long[] r4 = new java.lang.Long[r4]
            r4[r6] = r3
            r4[r0] = r5
            r4[r1] = r7
            r4[r2] = r8
            java.util.List r0 = java.util.Arrays.asList(r4)
            java.util.Iterator r1 = r0.iterator()
        Ld0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Le4
            java.lang.Object r2 = r1.next()
            java.lang.Long r2 = (java.lang.Long) r2
            java.util.Map<java.lang.Long, androidx.camera.core.DynamicRange> r3 = androidx.camera.camera2.internal.compat.params.DynamicRangeConversions.PROFILE_TO_DR_MAP
            androidx.camera.core.DynamicRange r4 = androidx.camera.core.DynamicRange.DOLBY_VISION_8_BIT
            r3.put(r2, r4)
            goto Ld0
        Le4:
            java.util.Map<androidx.camera.core.DynamicRange, java.util.List<java.lang.Long>> r1 = androidx.camera.camera2.internal.compat.params.DynamicRangeConversions.DR_TO_PROFILE_MAP
            androidx.camera.core.DynamicRange r2 = androidx.camera.core.DynamicRange.DOLBY_VISION_8_BIT
            r1.put(r2, r0)
            return
    }

    private DynamicRangeConversions() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.DoNotInline
    public static java.lang.Long dynamicRangeToFirstSupportedProfile(@androidx.annotation.NonNull androidx.camera.core.DynamicRange r2, @androidx.annotation.NonNull android.hardware.camera2.params.DynamicRangeProfiles r3) {
            java.util.Map<androidx.camera.core.DynamicRange, java.util.List<java.lang.Long>> r0 = androidx.camera.camera2.internal.compat.params.DynamicRangeConversions.DR_TO_PROFILE_MAP
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L25
            java.util.Set r3 = androidx.camera.camera2.internal.compat.params.a.a(r3)
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
            java.lang.Long r0 = (java.lang.Long) r0
            boolean r1 = r3.contains(r0)
            if (r1 == 0) goto L12
            return r0
        L25:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    @androidx.annotation.DoNotInline
    public static androidx.camera.core.DynamicRange profileToDynamicRange(long r1) {
            java.util.Map<java.lang.Long, androidx.camera.core.DynamicRange> r0 = androidx.camera.camera2.internal.compat.params.DynamicRangeConversions.PROFILE_TO_DR_MAP
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r0.get(r1)
            androidx.camera.core.DynamicRange r1 = (androidx.camera.core.DynamicRange) r1
            return r1
    }
}
