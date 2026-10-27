package androidx.camera.video.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class DynamicRangeMatchedEncoderProfilesProvider implements androidx.camera.core.impl.EncoderProfilesProvider {
    private final androidx.camera.core.DynamicRange mDynamicRange;
    private final java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> mEncoderProfilesCache;
    private final androidx.camera.core.impl.EncoderProfilesProvider mEncoderProfilesProvider;

    public DynamicRangeMatchedEncoderProfilesProvider(@androidx.annotation.NonNull androidx.camera.core.impl.EncoderProfilesProvider r2, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mEncoderProfilesCache = r0
            r1.mEncoderProfilesProvider = r2
            r1.mDynamicRange = r3
            return
    }

    @androidx.annotation.Nullable
    private static androidx.camera.core.impl.EncoderProfilesProxy filterUnmatchedDynamicRange(@androidx.annotation.Nullable androidx.camera.core.impl.EncoderProfilesProxy r5, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r6) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r2 = r5.getVideoProfiles()
            java.util.Iterator r2 = r2.iterator()
        L11:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r3 = (androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy) r3
            boolean r4 = isBitDepthMatched(r3, r6)
            if (r4 == 0) goto L11
            boolean r4 = isHdrEncodingMatched(r3, r6)
            if (r4 == 0) goto L11
            r1.add(r3)
            goto L11
        L2d:
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L34
            return r0
        L34:
            int r6 = r5.getDefaultDurationSeconds()
            int r0 = r5.getRecommendedFileFormat()
            java.util.List r5 = r5.getAudioProfiles()
            androidx.camera.core.impl.EncoderProfilesProxy$ImmutableEncoderProfilesProxy r5 = androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(r6, r0, r5, r1)
            return r5
    }

    @androidx.annotation.Nullable
    private androidx.camera.core.impl.EncoderProfilesProxy getProfilesInternal(int r3) {
            r2 = this;
            java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> r0 = r2.mEncoderProfilesCache
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L19
            java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> r0 = r2.mEncoderProfilesCache
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            androidx.camera.core.impl.EncoderProfilesProxy r3 = (androidx.camera.core.impl.EncoderProfilesProxy) r3
            return r3
        L19:
            androidx.camera.core.impl.EncoderProfilesProvider r0 = r2.mEncoderProfilesProvider
            boolean r0 = r0.hasProfile(r3)
            if (r0 == 0) goto L37
            androidx.camera.core.impl.EncoderProfilesProvider r0 = r2.mEncoderProfilesProvider
            androidx.camera.core.impl.EncoderProfilesProxy r0 = r0.getAll(r3)
            androidx.camera.core.DynamicRange r1 = r2.mDynamicRange
            androidx.camera.core.impl.EncoderProfilesProxy r0 = filterUnmatchedDynamicRange(r0, r1)
            java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> r1 = r2.mEncoderProfilesCache
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.put(r3, r0)
            return r0
        L37:
            r3 = 0
            return r3
    }

    private static boolean isBitDepthMatched(@androidx.annotation.NonNull androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy r1, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r2) {
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r0 = androidx.camera.video.internal.utils.DynamicRangeUtil.DR_TO_VP_BIT_DEPTH_MAP
            int r2 = r2.getBitDepth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L22
            int r1 = r1.getBitDepth()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L22
            r1 = 1
            return r1
        L22:
            r1 = 0
            return r1
    }

    private static boolean isHdrEncodingMatched(@androidx.annotation.NonNull androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy r1, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r2) {
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r0 = androidx.camera.video.internal.utils.DynamicRangeUtil.DR_TO_VP_FORMAT_MAP
            int r2 = r2.getEncoding()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L22
            int r1 = r1.getHdrFormat()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L22
            r1 = 1
            return r1
        L22:
            r1 = 0
            return r1
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    @androidx.annotation.Nullable
    public androidx.camera.core.impl.EncoderProfilesProxy getAll(int r1) {
            r0 = this;
            androidx.camera.core.impl.EncoderProfilesProxy r1 = r0.getProfilesInternal(r1)
            return r1
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int r3) {
            r2 = this;
            androidx.camera.core.impl.EncoderProfilesProvider r0 = r2.mEncoderProfilesProvider
            boolean r0 = r0.hasProfile(r3)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            androidx.camera.core.impl.EncoderProfilesProxy r3 = r2.getProfilesInternal(r3)
            if (r3 == 0) goto L12
            r3 = 1
            return r3
        L12:
            return r1
    }
}
