package androidx.camera.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class Quality {
    public static final androidx.camera.video.Quality FHD = null;
    public static final androidx.camera.video.Quality HD = null;
    public static final androidx.camera.video.Quality HIGHEST = null;
    public static final androidx.camera.video.Quality LOWEST = null;
    static final androidx.camera.video.Quality NONE = null;
    private static final java.util.Set<androidx.camera.video.Quality> QUALITIES = null;
    private static final java.util.List<androidx.camera.video.Quality> QUALITIES_ORDER_BY_SIZE = null;
    public static final androidx.camera.video.Quality SD = null;
    public static final androidx.camera.video.Quality UHD = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.video.Quality$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue
    static abstract class ConstantQuality extends androidx.camera.video.Quality {
        ConstantQuality() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @androidx.annotation.NonNull
        static androidx.camera.video.Quality.ConstantQuality of(int r1, @androidx.annotation.NonNull java.lang.String r2) {
                androidx.camera.video.AutoValue_Quality_ConstantQuality r0 = new androidx.camera.video.AutoValue_Quality_ConstantQuality
                r0.<init>(r1, r2)
                return r0
        }

        @androidx.annotation.NonNull
        abstract java.lang.String getName();

        abstract int getValue();
    }

    static {
            java.lang.String r0 = "SD"
            r1 = 4
            androidx.camera.video.Quality$ConstantQuality r0 = androidx.camera.video.Quality.ConstantQuality.of(r1, r0)
            androidx.camera.video.Quality.SD = r0
            java.lang.String r2 = "HD"
            r3 = 5
            androidx.camera.video.Quality$ConstantQuality r2 = androidx.camera.video.Quality.ConstantQuality.of(r3, r2)
            androidx.camera.video.Quality.HD = r2
            java.lang.String r4 = "FHD"
            r5 = 6
            androidx.camera.video.Quality$ConstantQuality r4 = androidx.camera.video.Quality.ConstantQuality.of(r5, r4)
            androidx.camera.video.Quality.FHD = r4
            r6 = 8
            java.lang.String r7 = "UHD"
            androidx.camera.video.Quality$ConstantQuality r6 = androidx.camera.video.Quality.ConstantQuality.of(r6, r7)
            androidx.camera.video.Quality.UHD = r6
            java.lang.String r7 = "LOWEST"
            r8 = 0
            androidx.camera.video.Quality$ConstantQuality r7 = androidx.camera.video.Quality.ConstantQuality.of(r8, r7)
            androidx.camera.video.Quality.LOWEST = r7
            java.lang.String r9 = "HIGHEST"
            r10 = 1
            androidx.camera.video.Quality$ConstantQuality r9 = androidx.camera.video.Quality.ConstantQuality.of(r10, r9)
            androidx.camera.video.Quality.HIGHEST = r9
            r11 = -1
            java.lang.String r12 = "NONE"
            androidx.camera.video.Quality$ConstantQuality r11 = androidx.camera.video.Quality.ConstantQuality.of(r11, r12)
            androidx.camera.video.Quality.NONE = r11
            java.util.HashSet r11 = new java.util.HashSet
            androidx.camera.video.Quality[] r5 = new androidx.camera.video.Quality[r5]
            r5[r8] = r7
            r5[r10] = r9
            r7 = 2
            r5[r7] = r0
            r9 = 3
            r5[r9] = r2
            r5[r1] = r4
            r5[r3] = r6
            java.util.List r3 = java.util.Arrays.asList(r5)
            r11.<init>(r3)
            androidx.camera.video.Quality.QUALITIES = r11
            androidx.camera.video.Quality[] r1 = new androidx.camera.video.Quality[r1]
            r1[r8] = r6
            r1[r10] = r4
            r1[r7] = r2
            r1[r9] = r0
            java.util.List r0 = java.util.Arrays.asList(r1)
            androidx.camera.video.Quality.QUALITIES_ORDER_BY_SIZE = r0
            return
    }

    private Quality() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ Quality(androidx.camera.video.Quality.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean containsQuality(@androidx.annotation.NonNull androidx.camera.video.Quality r1) {
            java.util.Set<androidx.camera.video.Quality> r0 = androidx.camera.video.Quality.QUALITIES
            boolean r1 = r0.contains(r1)
            return r1
    }

    @androidx.annotation.NonNull
    static java.util.List<androidx.camera.video.Quality> getSortedQualities() {
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<androidx.camera.video.Quality> r1 = androidx.camera.video.Quality.QUALITIES_ORDER_BY_SIZE
            r0.<init>(r1)
            return r0
    }
}
