package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class QualityRatioToResolutionsTable {
    private static final java.util.Map<java.lang.Integer, android.util.Rational> sAspectRatioMap = null;
    private static final java.util.Map<androidx.camera.video.Quality, android.util.Range<java.lang.Integer>> sQualityRangeMap = null;
    private final java.util.Map<androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio, java.util.List<android.util.Size>> mTable;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    static abstract class QualityRatio {
        QualityRatio() {
                r0 = this;
                r0.<init>()
                return
        }

        static androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio of(@androidx.annotation.NonNull androidx.camera.video.Quality r1, int r2) {
                androidx.camera.video.AutoValue_QualityRatioToResolutionsTable_QualityRatio r0 = new androidx.camera.video.AutoValue_QualityRatioToResolutionsTable_QualityRatio
                r0.<init>(r1, r2)
                return r0
        }

        abstract int getAspectRatio();

        @androidx.annotation.NonNull
        abstract androidx.camera.video.Quality getQuality();
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.camera.video.QualityRatioToResolutionsTable.sQualityRangeMap = r0
            androidx.camera.video.Quality r1 = androidx.camera.video.Quality.UHD
            r2 = 2160(0x870, float:3.027E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 4319(0x10df, float:6.052E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            android.util.Range r2 = android.util.Range.create(r2, r3)
            r0.put(r1, r2)
            androidx.camera.video.Quality r1 = androidx.camera.video.Quality.FHD
            r2 = 1080(0x438, float:1.513E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1439(0x59f, float:2.016E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            android.util.Range r2 = android.util.Range.create(r2, r3)
            r0.put(r1, r2)
            androidx.camera.video.Quality r1 = androidx.camera.video.Quality.HD
            r2 = 720(0x2d0, float:1.009E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1079(0x437, float:1.512E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            android.util.Range r2 = android.util.Range.create(r2, r3)
            r0.put(r1, r2)
            androidx.camera.video.Quality r1 = androidx.camera.video.Quality.SD
            r2 = 241(0xf1, float:3.38E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 719(0x2cf, float:1.008E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            android.util.Range r2 = android.util.Range.create(r2, r3)
            r0.put(r1, r2)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.camera.video.QualityRatioToResolutionsTable.sAspectRatioMap = r0
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            android.util.Rational r2 = androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_4_3
            r0.put(r1, r2)
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            android.util.Rational r2 = androidx.camera.core.impl.utils.AspectRatioUtil.ASPECT_RATIO_16_9
            r0.put(r1, r2)
            return
    }

    QualityRatioToResolutionsTable(@androidx.annotation.NonNull java.util.List<android.util.Size> r7, @androidx.annotation.NonNull java.util.Map<androidx.camera.video.Quality, android.util.Size> r8) {
            r6 = this;
            r6.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6.mTable = r0
            java.util.Map<androidx.camera.video.Quality, android.util.Range<java.lang.Integer>> r0 = androidx.camera.video.QualityRatioToResolutionsTable.sQualityRangeMap
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            androidx.camera.video.Quality r1 = (androidx.camera.video.Quality) r1
            java.util.Map<androidx.camera.video.QualityRatioToResolutionsTable$QualityRatio, java.util.List<android.util.Size>> r2 = r6.mTable
            r3 = -1
            androidx.camera.video.QualityRatioToResolutionsTable$QualityRatio r3 = androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio.of(r1, r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.put(r3, r4)
            java.util.Map<java.lang.Integer, android.util.Rational> r2 = androidx.camera.video.QualityRatioToResolutionsTable.sAspectRatioMap
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L39:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L14
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.util.Map<androidx.camera.video.QualityRatioToResolutionsTable$QualityRatio, java.util.List<android.util.Size>> r4 = r6.mTable
            int r3 = r3.intValue()
            androidx.camera.video.QualityRatioToResolutionsTable$QualityRatio r3 = androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio.of(r1, r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.put(r3, r5)
            goto L39
        L58:
            r6.addProfileSizesToTable(r8)
            r6.addResolutionsToTable(r7)
            r6.sortQualityRatioRow(r8)
            return
    }

    public static /* synthetic */ int a(int r0, android.util.Size r1, android.util.Size r2) {
            int r1 = androidx.camera.core.internal.utils.SizeUtil.getArea(r1)
            int r1 = r1 - r0
            int r1 = java.lang.Math.abs(r1)
            int r2 = androidx.camera.core.internal.utils.SizeUtil.getArea(r2)
            int r2 = r2 - r0
            int r0 = java.lang.Math.abs(r2)
            int r1 = r1 - r0
            return r1
    }

    private void addProfileSizesToTable(@androidx.annotation.NonNull java.util.Map<androidx.camera.video.Quality, android.util.Size> r4) {
            r3 = this;
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            androidx.camera.video.Quality r1 = (androidx.camera.video.Quality) r1
            r2 = -1
            java.util.List r1 = r3.getQualityRatioRow(r1, r2)
            java.util.Objects.requireNonNull(r1)
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.getValue()
            android.util.Size r0 = (android.util.Size) r0
            r1.add(r0)
            goto L8
        L2e:
            return
    }

    private void addResolutionsToTable(@androidx.annotation.NonNull java.util.List<android.util.Size> r4) {
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r4.next()
            android.util.Size r0 = (android.util.Size) r0
            androidx.camera.video.Quality r1 = findMappedQuality(r0)
            if (r1 != 0) goto L17
            goto L4
        L17:
            java.lang.Integer r2 = findMappedAspectRatio(r0)
            if (r2 != 0) goto L1e
            goto L4
        L1e:
            int r2 = r2.intValue()
            java.util.List r1 = r3.getQualityRatioRow(r1, r2)
            java.util.Objects.requireNonNull(r1)
            java.util.List r1 = (java.util.List) r1
            r1.add(r0)
            goto L4
        L2f:
            return
    }

    @androidx.annotation.Nullable
    private static java.lang.Integer findMappedAspectRatio(@androidx.annotation.NonNull android.util.Size r4) {
            java.util.Map<java.lang.Integer, android.util.Rational> r0 = androidx.camera.video.QualityRatioToResolutionsTable.sAspectRatioMap
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            android.util.Rational r2 = (android.util.Rational) r2
            android.util.Size r3 = androidx.camera.core.internal.utils.SizeUtil.RESOLUTION_QVGA
            boolean r2 = androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(r4, r2, r3)
            if (r2 == 0) goto La
            java.lang.Object r4 = r1.getKey()
            java.lang.Integer r4 = (java.lang.Integer) r4
            return r4
        L2b:
            r4 = 0
            return r4
    }

    @androidx.annotation.Nullable
    private static androidx.camera.video.Quality findMappedQuality(@androidx.annotation.NonNull android.util.Size r4) {
            java.util.Map<androidx.camera.video.Quality, android.util.Range<java.lang.Integer>> r0 = androidx.camera.video.QualityRatioToResolutionsTable.sQualityRangeMap
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            android.util.Range r2 = (android.util.Range) r2
            int r3 = r4.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto La
            java.lang.Object r4 = r1.getKey()
            androidx.camera.video.Quality r4 = (androidx.camera.video.Quality) r4
            return r4
        L31:
            r4 = 0
            return r4
    }

    @androidx.annotation.Nullable
    private java.util.List<android.util.Size> getQualityRatioRow(@androidx.annotation.NonNull androidx.camera.video.Quality r2, int r3) {
            r1 = this;
            java.util.Map<androidx.camera.video.QualityRatioToResolutionsTable$QualityRatio, java.util.List<android.util.Size>> r0 = r1.mTable
            androidx.camera.video.QualityRatioToResolutionsTable$QualityRatio r2 = androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio.of(r2, r3)
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    private void sortQualityRatioRow(@androidx.annotation.NonNull java.util.Map<androidx.camera.video.Quality, android.util.Size> r5) {
            r4 = this;
            java.util.Map<androidx.camera.video.QualityRatioToResolutionsTable$QualityRatio, java.util.List<android.util.Size>> r0 = r4.mTable
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            androidx.camera.video.QualityRatioToResolutionsTable$QualityRatio r2 = (androidx.camera.video.QualityRatioToResolutionsTable.QualityRatio) r2
            androidx.camera.video.Quality r2 = r2.getQuality()
            java.lang.Object r2 = r5.get(r2)
            android.util.Size r2 = (android.util.Size) r2
            if (r2 != 0) goto L29
            goto La
        L29:
            int r2 = androidx.camera.core.internal.utils.SizeUtil.getArea(r2)
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            androidx.camera.video.a r3 = new androidx.camera.video.a
            r3.<init>(r2)
            java.util.Collections.sort(r1, r3)
            goto La
        L3c:
            return
    }

    @androidx.annotation.NonNull
    java.util.List<android.util.Size> getResolutions(@androidx.annotation.NonNull androidx.camera.video.Quality r1, int r2) {
            r0 = this;
            java.util.List r1 = r0.getQualityRatioRow(r1, r2)
            if (r1 == 0) goto Lc
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            return r2
        Lc:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 0
            r1.<init>(r2)
            return r1
    }
}
