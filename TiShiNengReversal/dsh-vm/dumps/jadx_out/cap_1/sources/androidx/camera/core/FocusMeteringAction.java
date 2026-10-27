package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FocusMeteringAction {
    static final long DEFAULT_AUTOCANCEL_DURATION = 5000;
    static final int DEFAULT_METERING_MODE = 7;
    public static final int FLAG_AE = 2;
    public static final int FLAG_AF = 1;
    public static final int FLAG_AWB = 4;
    private final long mAutoCancelDurationInMillis;
    private final java.util.List<androidx.camera.core.MeteringPoint> mMeteringPointsAe;
    private final java.util.List<androidx.camera.core.MeteringPoint> mMeteringPointsAf;
    private final java.util.List<androidx.camera.core.MeteringPoint> mMeteringPointsAwb;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {
        long mAutoCancelDurationInMillis;
        final java.util.List<androidx.camera.core.MeteringPoint> mMeteringPointsAe;
        final java.util.List<androidx.camera.core.MeteringPoint> mMeteringPointsAf;
        final java.util.List<androidx.camera.core.MeteringPoint> mMeteringPointsAwb;

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public Builder(@androidx.annotation.NonNull androidx.camera.core.FocusMeteringAction r6) {
                r5 = this;
                r5.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5.mMeteringPointsAf = r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r5.mMeteringPointsAe = r1
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r5.mMeteringPointsAwb = r2
                r3 = 5000(0x1388, double:2.4703E-320)
                r5.mAutoCancelDurationInMillis = r3
                java.util.List r3 = r6.getMeteringPointsAf()
                r0.addAll(r3)
                java.util.List r0 = r6.getMeteringPointsAe()
                r1.addAll(r0)
                java.util.List r0 = r6.getMeteringPointsAwb()
                r2.addAll(r0)
                long r0 = r6.getAutoCancelDurationInMillis()
                r5.mAutoCancelDurationInMillis = r0
                return
        }

        public Builder(@androidx.annotation.NonNull androidx.camera.core.MeteringPoint r2) {
                r1 = this;
                r0 = 7
                r1.<init>(r2, r0)
                return
        }

        public Builder(@androidx.annotation.NonNull androidx.camera.core.MeteringPoint r3, int r4) {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.mMeteringPointsAf = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.mMeteringPointsAe = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.mMeteringPointsAwb = r0
                r0 = 5000(0x1388, double:2.4703E-320)
                r2.mAutoCancelDurationInMillis = r0
                r2.addPoint(r3, r4)
                return
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.FocusMeteringAction.Builder addPoint(@androidx.annotation.NonNull androidx.camera.core.MeteringPoint r2) {
                r1 = this;
                r0 = 7
                androidx.camera.core.FocusMeteringAction$Builder r2 = r1.addPoint(r2, r0)
                return r2
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.FocusMeteringAction.Builder addPoint(@androidx.annotation.NonNull androidx.camera.core.MeteringPoint r5, int r6) {
                r4 = this;
                r0 = 0
                r1 = 1
                if (r5 == 0) goto L6
                r2 = 1
                goto L7
            L6:
                r2 = 0
            L7:
                java.lang.String r3 = "Point cannot be null."
                androidx.core.util.Preconditions.checkArgument(r2, r3)
                if (r6 < r1) goto L12
                r2 = 7
                if (r6 > r2) goto L12
                r0 = 1
            L12:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid metering mode "
                r1.append(r2)
                r1.append(r6)
                java.lang.String r1 = r1.toString()
                androidx.core.util.Preconditions.checkArgument(r0, r1)
                r0 = r6 & 1
                if (r0 == 0) goto L2f
                java.util.List<androidx.camera.core.MeteringPoint> r0 = r4.mMeteringPointsAf
                r0.add(r5)
            L2f:
                r0 = r6 & 2
                if (r0 == 0) goto L38
                java.util.List<androidx.camera.core.MeteringPoint> r0 = r4.mMeteringPointsAe
                r0.add(r5)
            L38:
                r6 = r6 & 4
                if (r6 == 0) goto L41
                java.util.List<androidx.camera.core.MeteringPoint> r6 = r4.mMeteringPointsAwb
                r6.add(r5)
            L41:
                return r4
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.FocusMeteringAction build() {
                r1 = this;
                androidx.camera.core.FocusMeteringAction r0 = new androidx.camera.core.FocusMeteringAction
                r0.<init>(r1)
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.FocusMeteringAction.Builder disableAutoCancel() {
                r2 = this;
                r0 = 0
                r2.mAutoCancelDurationInMillis = r0
                return r2
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public androidx.camera.core.FocusMeteringAction.Builder removePoints(int r2) {
                r1 = this;
                r0 = r2 & 1
                if (r0 == 0) goto L9
                java.util.List<androidx.camera.core.MeteringPoint> r0 = r1.mMeteringPointsAf
                r0.clear()
            L9:
                r0 = r2 & 2
                if (r0 == 0) goto L12
                java.util.List<androidx.camera.core.MeteringPoint> r0 = r1.mMeteringPointsAe
                r0.clear()
            L12:
                r2 = r2 & 4
                if (r2 == 0) goto L1b
                java.util.List<androidx.camera.core.MeteringPoint> r2 = r1.mMeteringPointsAwb
                r2.clear()
            L1b:
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.camera.core.FocusMeteringAction.Builder setAutoCancelDuration(@androidx.annotation.IntRange(from = 1) long r4, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r6) {
                r3 = this;
                r0 = 1
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                java.lang.String r1 = "autoCancelDuration must be at least 1"
                androidx.core.util.Preconditions.checkArgument(r0, r1)
                long r4 = r6.toMillis(r4)
                r3.mAutoCancelDurationInMillis = r4
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface MeteringMode {
    }

    FocusMeteringAction(androidx.camera.core.FocusMeteringAction.Builder r3) {
            r2 = this;
            r2.<init>()
            java.util.List<androidx.camera.core.MeteringPoint> r0 = r3.mMeteringPointsAf
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r2.mMeteringPointsAf = r0
            java.util.List<androidx.camera.core.MeteringPoint> r0 = r3.mMeteringPointsAe
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r2.mMeteringPointsAe = r0
            java.util.List<androidx.camera.core.MeteringPoint> r0 = r3.mMeteringPointsAwb
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r2.mMeteringPointsAwb = r0
            long r0 = r3.mAutoCancelDurationInMillis
            r2.mAutoCancelDurationInMillis = r0
            return
    }

    public long getAutoCancelDurationInMillis() {
            r2 = this;
            long r0 = r2.mAutoCancelDurationInMillis
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.MeteringPoint> getMeteringPointsAe() {
            r1 = this;
            java.util.List<androidx.camera.core.MeteringPoint> r0 = r1.mMeteringPointsAe
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.MeteringPoint> getMeteringPointsAf() {
            r1 = this;
            java.util.List<androidx.camera.core.MeteringPoint> r0 = r1.mMeteringPointsAf
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.camera.core.MeteringPoint> getMeteringPointsAwb() {
            r1 = this;
            java.util.List<androidx.camera.core.MeteringPoint> r0 = r1.mMeteringPointsAwb
            return r0
    }

    public boolean isAutoCancelEnabled() {
            r5 = this;
            long r0 = r5.mAutoCancelDurationInMillis
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }
}
