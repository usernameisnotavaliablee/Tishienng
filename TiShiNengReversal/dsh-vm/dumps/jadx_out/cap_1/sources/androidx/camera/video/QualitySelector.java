package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class QualitySelector {
    private static final java.lang.String TAG = "QualitySelector";
    private final androidx.camera.video.FallbackStrategy mFallbackStrategy;
    private final java.util.List<androidx.camera.video.Quality> mPreferredQualityList;

    QualitySelector(@androidx.annotation.NonNull java.util.List<androidx.camera.video.Quality> r3, @androidx.annotation.NonNull androidx.camera.video.FallbackStrategy r4) {
            r2 = this;
            r2.<init>()
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L10
            androidx.camera.video.FallbackStrategy r0 = androidx.camera.video.FallbackStrategy.NONE
            if (r4 == r0) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            java.lang.String r1 = "No preferred quality and fallback strategy."
            androidx.core.util.Preconditions.checkArgument(r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            java.util.List r3 = java.util.Collections.unmodifiableList(r0)
            r2.mPreferredQualityList = r3
            r2.mFallbackStrategy = r4
            return
    }

    private void addByFallbackStrategy(@androidx.annotation.NonNull java.util.List<androidx.camera.video.Quality> r11, @androidx.annotation.NonNull java.util.Set<androidx.camera.video.Quality> r12) {
            r10 = this;
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L8
            goto L117
        L8:
            boolean r0 = r12.containsAll(r11)
            if (r0 == 0) goto L10
            goto L117
        L10:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Select quality by fallbackStrategy = "
            r0.append(r1)
            androidx.camera.video.FallbackStrategy r1 = r10.mFallbackStrategy
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "QualitySelector"
            androidx.camera.core.Logger.d(r1, r0)
            androidx.camera.video.FallbackStrategy r0 = r10.mFallbackStrategy
            androidx.camera.video.FallbackStrategy r2 = androidx.camera.video.FallbackStrategy.NONE
            if (r0 != r2) goto L30
            goto L117
        L30:
            boolean r0 = r0 instanceof androidx.camera.video.FallbackStrategy.RuleStrategy
            java.lang.String r2 = "Currently only support type RuleStrategy"
            androidx.core.util.Preconditions.checkState(r0, r2)
            androidx.camera.video.FallbackStrategy r0 = r10.mFallbackStrategy
            androidx.camera.video.FallbackStrategy$RuleStrategy r0 = (androidx.camera.video.FallbackStrategy.RuleStrategy) r0
            java.util.List r2 = androidx.camera.video.Quality.getSortedQualities()
            androidx.camera.video.Quality r3 = r0.getFallbackQuality()
            androidx.camera.video.Quality r4 = androidx.camera.video.Quality.HIGHEST
            r5 = 0
            r6 = 1
            if (r3 != r4) goto L50
            java.lang.Object r3 = r2.get(r5)
            androidx.camera.video.Quality r3 = (androidx.camera.video.Quality) r3
            goto L68
        L50:
            androidx.camera.video.Quality r3 = r0.getFallbackQuality()
            androidx.camera.video.Quality r4 = androidx.camera.video.Quality.LOWEST
            if (r3 != r4) goto L64
            int r3 = r2.size()
            int r3 = r3 - r6
            java.lang.Object r3 = r2.get(r3)
            androidx.camera.video.Quality r3 = (androidx.camera.video.Quality) r3
            goto L68
        L64:
            androidx.camera.video.Quality r3 = r0.getFallbackQuality()
        L68:
            int r4 = r2.indexOf(r3)
            r7 = -1
            if (r4 == r7) goto L70
            r5 = 1
        L70:
            androidx.core.util.Preconditions.checkState(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r7 = r4 + (-1)
        L7a:
            if (r7 < 0) goto L8e
            java.lang.Object r8 = r2.get(r7)
            androidx.camera.video.Quality r8 = (androidx.camera.video.Quality) r8
            boolean r9 = r11.contains(r8)
            if (r9 == 0) goto L8b
            r5.add(r8)
        L8b:
            int r7 = r7 + (-1)
            goto L7a
        L8e:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r4 = r4 + r6
        L94:
            int r8 = r2.size()
            if (r4 >= r8) goto Lac
            java.lang.Object r8 = r2.get(r4)
            androidx.camera.video.Quality r8 = (androidx.camera.video.Quality) r8
            boolean r9 = r11.contains(r8)
            if (r9 == 0) goto La9
            r7.add(r8)
        La9:
            int r4 = r4 + 1
            goto L94
        Lac:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r4 = "sizeSortedQualities = "
            r11.append(r4)
            r11.append(r2)
            java.lang.String r2 = ", fallback quality = "
            r11.append(r2)
            r11.append(r3)
            java.lang.String r2 = ", largerQualities = "
            r11.append(r2)
            r11.append(r5)
            java.lang.String r2 = ", smallerQualities = "
            r11.append(r2)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            androidx.camera.core.Logger.d(r1, r11)
            int r11 = r0.getFallbackRule()
            if (r11 == 0) goto L117
            if (r11 == r6) goto L111
            r0 = 2
            if (r11 == r0) goto L10d
            r0 = 3
            if (r11 == r0) goto L106
            r0 = 4
            if (r11 != r0) goto Led
            r12.addAll(r7)
            return
        Led:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Unhandled fallback strategy: "
            r12.append(r0)
            androidx.camera.video.FallbackStrategy r0 = r10.mFallbackStrategy
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L106:
            r12.addAll(r7)
            r12.addAll(r5)
            return
        L10d:
            r12.addAll(r5)
            return
        L111:
            r12.addAll(r5)
            r12.addAll(r7)
        L117:
            return
    }

    private static void checkQualityConstantsOrThrow(@androidx.annotation.NonNull androidx.camera.video.Quality r3) {
            boolean r0 = androidx.camera.video.Quality.containsQuality(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid quality: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            androidx.core.util.Preconditions.checkArgument(r0, r3)
            return
    }

    private static void checkQualityConstantsOrThrow(@androidx.annotation.NonNull java.util.List<androidx.camera.video.Quality> r4) {
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r4.next()
            androidx.camera.video.Quality r0 = (androidx.camera.video.Quality) r0
            boolean r1 = androidx.camera.video.Quality.containsQuality(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "qualities contain invalid quality: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            androidx.core.util.Preconditions.checkArgument(r1, r0)
            goto L4
        L29:
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.QualitySelector from(@androidx.annotation.NonNull androidx.camera.video.Quality r1) {
            androidx.camera.video.FallbackStrategy r0 = androidx.camera.video.FallbackStrategy.NONE
            androidx.camera.video.QualitySelector r1 = from(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.QualitySelector from(@androidx.annotation.NonNull androidx.camera.video.Quality r1, @androidx.annotation.NonNull androidx.camera.video.FallbackStrategy r2) {
            java.lang.String r0 = "quality cannot be null"
            androidx.core.util.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "fallbackStrategy cannot be null"
            androidx.core.util.Preconditions.checkNotNull(r2, r0)
            checkQualityConstantsOrThrow(r1)
            androidx.camera.video.QualitySelector r0 = new androidx.camera.video.QualitySelector
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.QualitySelector fromOrderedList(@androidx.annotation.NonNull java.util.List<androidx.camera.video.Quality> r1) {
            androidx.camera.video.FallbackStrategy r0 = androidx.camera.video.FallbackStrategy.NONE
            androidx.camera.video.QualitySelector r1 = fromOrderedList(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static androidx.camera.video.QualitySelector fromOrderedList(@androidx.annotation.NonNull java.util.List<androidx.camera.video.Quality> r2, @androidx.annotation.NonNull androidx.camera.video.FallbackStrategy r3) {
            java.lang.String r0 = "qualities cannot be null"
            androidx.core.util.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "fallbackStrategy cannot be null"
            androidx.core.util.Preconditions.checkNotNull(r3, r0)
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            java.lang.String r1 = "qualities cannot be empty"
            androidx.core.util.Preconditions.checkArgument(r0, r1)
            checkQualityConstantsOrThrow(r2)
            androidx.camera.video.QualitySelector r0 = new androidx.camera.video.QualitySelector
            r0.<init>(r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    private static android.util.Size getProfileVideoSize(@androidx.annotation.NonNull androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r2) {
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r2 = r2.getDefaultVideoProfile()
            android.util.Size r0 = new android.util.Size
            int r1 = r2.getWidth()
            int r2 = r2.getHeight()
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static java.util.Map<androidx.camera.video.Quality, android.util.Size> getQualityToResolutionMap(@androidx.annotation.NonNull androidx.camera.video.VideoCapabilities r4, @androidx.annotation.NonNull androidx.camera.core.DynamicRange r5) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.List r1 = r4.getSupportedQualities(r5)
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r1.next()
            androidx.camera.video.Quality r2 = (androidx.camera.video.Quality) r2
            androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r3 = r4.getProfiles(r2, r5)
            java.util.Objects.requireNonNull(r3)
            android.util.Size r3 = getProfileVideoSize(r3)
            r0.put(r2, r3)
            goto Ld
        L28:
            return r0
    }

    @androidx.annotation.Nullable
    public static android.util.Size getResolution(@androidx.annotation.NonNull androidx.camera.core.CameraInfo r1, @androidx.annotation.NonNull androidx.camera.video.Quality r2) {
            checkQualityConstantsOrThrow(r2)
            androidx.camera.video.VideoCapabilities r1 = androidx.camera.video.Recorder.getVideoCapabilities(r1)
            androidx.camera.core.DynamicRange r0 = androidx.camera.core.DynamicRange.SDR
            androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r1 = r1.getProfiles(r2, r0)
            if (r1 == 0) goto L14
            android.util.Size r1 = getProfileVideoSize(r1)
            return r1
        L14:
            r1 = 0
            return r1
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static java.util.List<androidx.camera.video.Quality> getSupportedQualities(@androidx.annotation.NonNull androidx.camera.core.CameraInfo r1) {
            androidx.camera.video.VideoCapabilities r1 = androidx.camera.video.Recorder.getVideoCapabilities(r1)
            androidx.camera.core.DynamicRange r0 = androidx.camera.core.DynamicRange.SDR
            java.util.List r1 = r1.getSupportedQualities(r0)
            return r1
    }

    @java.lang.Deprecated
    public static boolean isQualitySupported(@androidx.annotation.NonNull androidx.camera.core.CameraInfo r1, @androidx.annotation.NonNull androidx.camera.video.Quality r2) {
            androidx.camera.video.VideoCapabilities r1 = androidx.camera.video.Recorder.getVideoCapabilities(r1)
            androidx.camera.core.DynamicRange r0 = androidx.camera.core.DynamicRange.SDR
            boolean r1 = r1.isQualitySupported(r2, r0)
            return r1
    }

    @androidx.annotation.NonNull
    java.util.List<androidx.camera.video.Quality> getPrioritizedQualities(@androidx.annotation.NonNull java.util.List<androidx.camera.video.Quality> r7) {
            r6 = this;
            boolean r0 = r7.isEmpty()
            java.lang.String r1 = "QualitySelector"
            if (r0 == 0) goto L13
            java.lang.String r7 = "No supported quality on the device."
            androidx.camera.core.Logger.w(r1, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            return r7
        L13:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "supportedQualities = "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            androidx.camera.core.Logger.d(r1, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.List<androidx.camera.video.Quality> r2 = r6.mPreferredQualityList
            java.util.Iterator r2 = r2.iterator()
        L32:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L75
            java.lang.Object r3 = r2.next()
            androidx.camera.video.Quality r3 = (androidx.camera.video.Quality) r3
            androidx.camera.video.Quality r4 = androidx.camera.video.Quality.HIGHEST
            if (r3 != r4) goto L46
            r0.addAll(r7)
            goto L75
        L46:
            androidx.camera.video.Quality r4 = androidx.camera.video.Quality.LOWEST
            if (r3 != r4) goto L56
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r7)
            java.util.Collections.reverse(r1)
            r0.addAll(r1)
            goto L75
        L56:
            boolean r4 = r7.contains(r3)
            if (r4 == 0) goto L60
            r0.add(r3)
            goto L32
        L60:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "quality is not supported and will be ignored: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            androidx.camera.core.Logger.w(r1, r3)
            goto L32
        L75:
            r6.addByFallbackStrategy(r7, r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            return r7
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "QualitySelector{preferredQualities="
            r0.append(r1)
            java.util.List<androidx.camera.video.Quality> r1 = r2.mPreferredQualityList
            r0.append(r1)
            java.lang.String r1 = ", fallbackStrategy="
            r0.append(r1)
            androidx.camera.video.FallbackStrategy r1 = r2.mFallbackStrategy
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
