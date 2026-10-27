package androidx.camera.video.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class BackupHdrProfileEncoderProfilesProvider implements androidx.camera.core.impl.EncoderProfilesProvider {
    private static final androidx.camera.core.impl.Timebase DEFAULT_TIME_BASE = null;
    public static final androidx.arch.core.util.Function<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy, androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> DEFAULT_VALIDATOR = null;
    private static final java.lang.String TAG = "BackupHdrProfileEncoderProfilesProvider";
    private final java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> mEncoderProfilesCache;
    private final androidx.camera.core.impl.EncoderProfilesProvider mEncoderProfilesProvider;
    private final androidx.arch.core.util.Function<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy, androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> mVideoProfileValidator;

    static {
            androidx.camera.video.internal.a r0 = new androidx.camera.video.internal.a
            r0.<init>()
            androidx.camera.video.internal.BackupHdrProfileEncoderProfilesProvider.DEFAULT_VALIDATOR = r0
            androidx.camera.core.impl.Timebase r0 = androidx.camera.core.impl.Timebase.UPTIME
            androidx.camera.video.internal.BackupHdrProfileEncoderProfilesProvider.DEFAULT_TIME_BASE = r0
            return
    }

    public BackupHdrProfileEncoderProfilesProvider(@androidx.annotation.NonNull androidx.camera.core.impl.EncoderProfilesProvider r2, @androidx.annotation.NonNull androidx.arch.core.util.Function<androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy, androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy> r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mEncoderProfilesCache = r0
            r1.mEncoderProfilesProvider = r2
            r1.mVideoProfileValidator = r3
            return
    }

    public static /* synthetic */ androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy a(androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy r0) {
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r0 = validateOrAdapt(r0)
            return r0
    }

    @androidx.annotation.Nullable
    private androidx.camera.core.impl.EncoderProfilesProxy appendBackupVideoProfile(@androidx.annotation.Nullable androidx.camera.core.impl.EncoderProfilesProxy r6, int r7, int r8) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List r2 = r6.getVideoProfiles()
            r1.<init>(r2)
            java.util.List r2 = r6.getVideoProfiles()
            java.util.Iterator r2 = r2.iterator()
        L15:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L28
            java.lang.Object r3 = r2.next()
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r3 = (androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy) r3
            int r4 = r3.getHdrFormat()
            if (r4 != 0) goto L15
            goto L29
        L28:
            r3 = r0
        L29:
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r7 = generateBackupProfile(r3, r7, r8)
            androidx.arch.core.util.Function<androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy, androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy> r8 = r5.mVideoProfileValidator
            java.lang.Object r7 = r8.apply(r7)
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r7 = (androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy) r7
            if (r7 == 0) goto L3a
            r1.add(r7)
        L3a:
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L41
            return r0
        L41:
            int r7 = r6.getDefaultDurationSeconds()
            int r8 = r6.getRecommendedFileFormat()
            java.util.List r6 = r6.getAudioProfiles()
            androidx.camera.core.impl.EncoderProfilesProxy$ImmutableEncoderProfilesProxy r6 = androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(r7, r8, r6, r1)
            return r6
    }

    private static int deriveCodec(int r3) {
            if (r3 == 0) goto L26
            r0 = 1
            if (r3 == r0) goto L26
            r0 = 2
            if (r3 == r0) goto L26
            r0 = 3
            if (r3 == r0) goto L26
            r0 = 4
            if (r3 != r0) goto Lf
            goto L26
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected HDR format: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L26:
            r3 = 5
            return r3
    }

    @androidx.annotation.NonNull
    private static java.lang.String deriveMediaType(int r0) {
            java.lang.String r0 = androidx.camera.core.impl.x.c(r0)
            return r0
    }

    private static int deriveProfile(int r3) {
            r0 = 1
            if (r3 == 0) goto L2e
            r1 = 2
            if (r3 == r0) goto L2d
            if (r3 == r1) goto L2a
            r0 = 3
            if (r3 == r0) goto L27
            r0 = 4
            if (r3 != r0) goto L10
            r3 = -1
            return r3
        L10:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected HDR format: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L27:
            r3 = 8192(0x2000, float:1.148E-41)
            return r3
        L2a:
            r3 = 4096(0x1000, float:5.74E-42)
            return r3
        L2d:
            return r1
        L2e:
            return r0
    }

    @androidx.annotation.Nullable
    private static androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy generateBackupProfile(@androidx.annotation.Nullable androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy r13, int r14, int r15) {
            if (r13 != 0) goto L4
            r13 = 0
            return r13
        L4:
            int r0 = r13.getCodec()
            java.lang.String r1 = r13.getMediaType()
            int r2 = r13.getProfile()
            int r3 = r13.getHdrFormat()
            if (r14 == r3) goto L22
            int r0 = deriveCodec(r14)
            java.lang.String r1 = deriveMediaType(r0)
            int r2 = deriveProfile(r14)
        L22:
            r3 = r0
            r4 = r1
            r9 = r2
            int r0 = r13.getBitrate()
            int r1 = r13.getBitDepth()
            int r5 = scaleBitrate(r0, r15, r1)
            int r6 = r13.getFrameRate()
            int r7 = r13.getWidth()
            int r8 = r13.getHeight()
            int r11 = r13.getChromaSubsampling()
            r12 = r14
            r10 = r15
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r13 = androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy.create(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
    }

    @androidx.annotation.Nullable
    private androidx.camera.core.impl.EncoderProfilesProxy getProfilesInternal(int r4) {
            r3 = this;
            java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> r0 = r3.mEncoderProfilesCache
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L19
            java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> r0 = r3.mEncoderProfilesCache
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            androidx.camera.core.impl.EncoderProfilesProxy r4 = (androidx.camera.core.impl.EncoderProfilesProxy) r4
            return r4
        L19:
            androidx.camera.core.impl.EncoderProfilesProvider r0 = r3.mEncoderProfilesProvider
            boolean r0 = r0.hasProfile(r4)
            if (r0 == 0) goto L38
            androidx.camera.core.impl.EncoderProfilesProvider r0 = r3.mEncoderProfilesProvider
            androidx.camera.core.impl.EncoderProfilesProxy r0 = r0.getAll(r4)
            r1 = 1
            r2 = 10
            androidx.camera.core.impl.EncoderProfilesProxy r0 = r3.appendBackupVideoProfile(r0, r1, r2)
            java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> r1 = r3.mEncoderProfilesCache
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.put(r4, r0)
            return r0
        L38:
            r4 = 0
            return r4
    }

    @androidx.annotation.NonNull
    private static androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy modifyBitrate(@androidx.annotation.NonNull androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy r10, int r11) {
            int r0 = r10.getCodec()
            java.lang.String r1 = r10.getMediaType()
            int r3 = r10.getFrameRate()
            int r4 = r10.getWidth()
            int r5 = r10.getHeight()
            int r6 = r10.getProfile()
            int r7 = r10.getBitDepth()
            int r8 = r10.getChromaSubsampling()
            int r9 = r10.getHdrFormat()
            r2 = r11
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r10 = androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy.create(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    private static int scaleBitrate(int r5, int r6, int r7) {
            if (r6 != r7) goto L3
            return r5
        L3:
            android.util.Rational r0 = new android.util.Rational
            r0.<init>(r6, r7)
            double r1 = (double) r5
            double r3 = r0.doubleValue()
            double r1 = r1 * r3
            int r0 = (int) r1
            java.lang.String r1 = "BackupHdrProfileEncoderProfilesProvider"
            boolean r2 = androidx.camera.core.Logger.isDebugEnabled(r1)
            if (r2 == 0) goto L40
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r5
            r5 = 1
            r3[r5] = r6
            r5 = 2
            r3[r5] = r7
            r5 = 3
            r3[r5] = r2
            java.lang.String r5 = "Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d"
            java.lang.String r5 = java.lang.String.format(r5, r3)
            androidx.camera.core.Logger.d(r1, r5)
        L40:
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    static androidx.camera.video.internal.encoder.VideoEncoderConfig toVideoEncoderConfig(@androidx.annotation.NonNull androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy r4) {
            androidx.camera.video.internal.encoder.VideoEncoderConfig$Builder r0 = androidx.camera.video.internal.encoder.VideoEncoderConfig.builder()
            java.lang.String r1 = r4.getMediaType()
            androidx.camera.video.internal.encoder.VideoEncoderConfig$Builder r0 = r0.setMimeType(r1)
            int r1 = r4.getProfile()
            androidx.camera.video.internal.encoder.VideoEncoderConfig$Builder r0 = r0.setProfile(r1)
            android.util.Size r1 = new android.util.Size
            int r2 = r4.getWidth()
            int r3 = r4.getHeight()
            r1.<init>(r2, r3)
            androidx.camera.video.internal.encoder.VideoEncoderConfig$Builder r0 = r0.setResolution(r1)
            int r1 = r4.getFrameRate()
            androidx.camera.video.internal.encoder.VideoEncoderConfig$Builder r0 = r0.setFrameRate(r1)
            int r4 = r4.getBitrate()
            androidx.camera.video.internal.encoder.VideoEncoderConfig$Builder r4 = r0.setBitrate(r4)
            androidx.camera.core.impl.Timebase r0 = androidx.camera.video.internal.BackupHdrProfileEncoderProfilesProvider.DEFAULT_TIME_BASE
            androidx.camera.video.internal.encoder.VideoEncoderConfig$Builder r4 = r4.setInputTimebase(r0)
            androidx.camera.video.internal.encoder.VideoEncoderConfig r4 = r4.build()
            return r4
    }

    @androidx.annotation.Nullable
    private static androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy validateOrAdapt(@androidx.annotation.Nullable androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            androidx.camera.video.internal.encoder.VideoEncoderConfig r1 = toVideoEncoderConfig(r4)
            androidx.camera.video.internal.encoder.VideoEncoderInfoImpl r2 = androidx.camera.video.internal.encoder.VideoEncoderInfoImpl.from(r1)     // Catch: androidx.camera.video.internal.encoder.InvalidConfigException -> L2a
            int r1 = r1.getBitrate()     // Catch: androidx.camera.video.internal.encoder.InvalidConfigException -> L2a
            android.util.Range r2 = r2.getSupportedBitrateRange()     // Catch: androidx.camera.video.internal.encoder.InvalidConfigException -> L2a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch: androidx.camera.video.internal.encoder.InvalidConfigException -> L2a
            java.lang.Comparable r2 = r2.clamp(r3)     // Catch: androidx.camera.video.internal.encoder.InvalidConfigException -> L2a
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: androidx.camera.video.internal.encoder.InvalidConfigException -> L2a
            int r2 = r2.intValue()     // Catch: androidx.camera.video.internal.encoder.InvalidConfigException -> L2a
            if (r2 != r1) goto L25
            return r4
        L25:
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r4 = modifyBitrate(r4, r2)     // Catch: androidx.camera.video.internal.encoder.InvalidConfigException -> L2a
            return r4
        L2a:
            return r0
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
