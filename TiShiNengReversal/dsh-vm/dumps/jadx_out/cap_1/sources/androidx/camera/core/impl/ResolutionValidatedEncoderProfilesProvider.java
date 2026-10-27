package androidx.camera.core.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ResolutionValidatedEncoderProfilesProvider implements androidx.camera.core.impl.EncoderProfilesProvider {
    private final androidx.camera.core.impl.EncoderProfilesResolutionValidator mEncoderProfilesResolutionValidator;
    private final androidx.camera.core.impl.EncoderProfilesProvider mProvider;

    public ResolutionValidatedEncoderProfilesProvider(@androidx.annotation.NonNull androidx.camera.core.impl.EncoderProfilesProvider r1, @androidx.annotation.NonNull androidx.camera.core.impl.Quirks r2) {
            r0 = this;
            r0.<init>()
            r0.mProvider = r1
            java.lang.Class<androidx.camera.core.impl.quirk.ProfileResolutionQuirk> r1 = androidx.camera.core.impl.quirk.ProfileResolutionQuirk.class
            java.util.List r1 = r2.getAll(r1)
            androidx.camera.core.impl.EncoderProfilesResolutionValidator r2 = new androidx.camera.core.impl.EncoderProfilesResolutionValidator
            r2.<init>(r1)
            r0.mEncoderProfilesResolutionValidator = r2
            return
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    @androidx.annotation.Nullable
    public androidx.camera.core.impl.EncoderProfilesProxy getAll(int r2) {
            r1 = this;
            androidx.camera.core.impl.EncoderProfilesProvider r0 = r1.mProvider
            boolean r0 = r0.hasProfile(r2)
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            androidx.camera.core.impl.EncoderProfilesProvider r0 = r1.mProvider
            androidx.camera.core.impl.EncoderProfilesProxy r2 = r0.getAll(r2)
            androidx.camera.core.impl.EncoderProfilesResolutionValidator r0 = r1.mEncoderProfilesResolutionValidator
            boolean r0 = r0.hasQuirk()
            if (r0 == 0) goto L1e
            androidx.camera.core.impl.EncoderProfilesResolutionValidator r0 = r1.mEncoderProfilesResolutionValidator
            androidx.camera.core.impl.EncoderProfilesProxy r2 = r0.filterInvalidVideoResolution(r2)
        L1e:
            return r2
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int r2) {
            r1 = this;
            androidx.camera.core.impl.EncoderProfilesProvider r0 = r1.mProvider
            boolean r0 = r0.hasProfile(r2)
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            androidx.camera.core.impl.EncoderProfilesResolutionValidator r0 = r1.mEncoderProfilesResolutionValidator
            boolean r0 = r0.hasQuirk()
            if (r0 == 0) goto L1f
            androidx.camera.core.impl.EncoderProfilesProvider r0 = r1.mProvider
            androidx.camera.core.impl.EncoderProfilesProxy r2 = r0.getAll(r2)
            androidx.camera.core.impl.EncoderProfilesResolutionValidator r0 = r1.mEncoderProfilesResolutionValidator
            boolean r2 = r0.hasValidVideoResolution(r2)
            return r2
        L1f:
            r2 = 1
            return r2
    }
}
