package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class EncoderProfilesResolutionValidator {

    @androidx.annotation.NonNull
    private final java.util.List<androidx.camera.core.impl.quirk.ProfileResolutionQuirk> mQuirks;

    @androidx.annotation.NonNull
    private final java.util.Set<android.util.Size> mSupportedResolutions;

    public EncoderProfilesResolutionValidator(@androidx.annotation.Nullable java.util.List<androidx.camera.core.impl.quirk.ProfileResolutionQuirk> r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mQuirks = r0
            if (r2 == 0) goto Lf
            r0.addAll(r2)
        Lf:
            java.util.Set r2 = r1.generateSupportedResolutions(r2)
            r1.mSupportedResolutions = r2
            return
    }

    @androidx.annotation.NonNull
    private java.util.Set<android.util.Size> generateSupportedResolutions(@androidx.annotation.Nullable java.util.List<androidx.camera.core.impl.quirk.ProfileResolutionQuirk> r4) {
            r3 = this;
            if (r4 == 0) goto L31
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            goto L31
        L9:
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 0
            java.lang.Object r1 = r4.get(r1)
            androidx.camera.core.impl.quirk.ProfileResolutionQuirk r1 = (androidx.camera.core.impl.quirk.ProfileResolutionQuirk) r1
            java.util.List r1 = r1.getSupportedResolutions()
            r0.<init>(r1)
            r1 = 1
        L1a:
            int r2 = r4.size()
            if (r1 >= r2) goto L30
            java.lang.Object r2 = r4.get(r1)
            androidx.camera.core.impl.quirk.ProfileResolutionQuirk r2 = (androidx.camera.core.impl.quirk.ProfileResolutionQuirk) r2
            java.util.List r2 = r2.getSupportedResolutions()
            r0.retainAll(r2)
            int r1 = r1 + 1
            goto L1a
        L30:
            return r0
        L31:
            java.util.Set r4 = java.util.Collections.EMPTY_SET
            return r4
    }

    @androidx.annotation.Nullable
    public androidx.camera.core.impl.EncoderProfilesProxy filterInvalidVideoResolution(@androidx.annotation.Nullable androidx.camera.core.impl.EncoderProfilesProxy r8) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            boolean r1 = r7.hasQuirk()
            if (r1 != 0) goto Lb
            return r8
        Lb:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r2 = r8.getVideoProfiles()
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r2.next()
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r3 = (androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy) r3
            android.util.Size r4 = new android.util.Size
            int r5 = r3.getWidth()
            int r6 = r3.getHeight()
            r4.<init>(r5, r6)
            java.util.Set<android.util.Size> r5 = r7.mSupportedResolutions
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L18
            r1.add(r3)
            goto L18
        L3d:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L44
            return r0
        L44:
            int r0 = r8.getDefaultDurationSeconds()
            int r2 = r8.getRecommendedFileFormat()
            java.util.List r8 = r8.getAudioProfiles()
            androidx.camera.core.impl.EncoderProfilesProxy$ImmutableEncoderProfilesProxy r8 = androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(r0, r2, r8, r1)
            return r8
    }

    public boolean hasQuirk() {
            r1 = this;
            java.util.List<androidx.camera.core.impl.quirk.ProfileResolutionQuirk> r0 = r1.mQuirks
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    public boolean hasValidVideoResolution(@androidx.annotation.Nullable androidx.camera.core.impl.EncoderProfilesProxy r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            boolean r1 = r5.hasQuirk()
            r2 = 1
            if (r1 != 0) goto L15
            java.util.List r6 = r6.getVideoProfiles()
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r2
            return r6
        L15:
            java.util.List r6 = r6.getVideoProfiles()
            java.util.Iterator r6 = r6.iterator()
        L1d:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r6.next()
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r1 = (androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy) r1
            android.util.Size r3 = new android.util.Size
            int r4 = r1.getWidth()
            int r1 = r1.getHeight()
            r3.<init>(r4, r1)
            java.util.Set<android.util.Size> r1 = r5.mSupportedResolutions
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L1d
            return r2
        L3f:
            return r0
    }
}
