package androidx.camera.video.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class MediaCodecInfoReportIncorrectInfoQuirk implements androidx.camera.core.impl.Quirk {
    public static final java.util.List<java.lang.String> INCORRECT_FHD_PROFILE_MODEL_LIST = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class MediaFormatResolver {
        private final android.media.MediaFormat mMediaFormat;

        MediaFormatResolver(@androidx.annotation.NonNull android.media.MediaFormat r1) {
                r0 = this;
                r0.<init>()
                r0.mMediaFormat = r1
                return
        }

        @androidx.annotation.Nullable
        private java.lang.String getMime() {
                r2 = this;
                android.media.MediaFormat r0 = r2.mMediaFormat
                java.lang.String r1 = "mime"
                java.lang.String r0 = r0.getString(r1)
                return r0
        }

        boolean isAvc() {
                r2 = this;
                java.lang.String r0 = "video/avc"
                java.lang.String r1 = r2.getMime()
                boolean r0 = r0.equalsIgnoreCase(r1)
                return r0
        }

        boolean isMpeg4() {
                r2 = this;
                java.lang.String r0 = "video/mp4v-es"
                java.lang.String r1 = r2.getMime()
                boolean r0 = r0.equalsIgnoreCase(r1)
                return r0
        }

        boolean isSize(int r4, int r5) {
                r3 = this;
                android.media.MediaFormat r0 = r3.mMediaFormat
                java.lang.String r1 = "width"
                int r0 = r0.getInteger(r1)
                android.media.MediaFormat r1 = r3.mMediaFormat
                java.lang.String r2 = "height"
                int r1 = r1.getInteger(r2)
                if (r0 != r4) goto L17
                if (r1 != r5) goto L17
                r4 = 1
                return r4
            L17:
                r4 = 0
                return r4
        }

        boolean isVideo() {
                r2 = this;
                java.lang.String r0 = r2.getMime()
                if (r0 == 0) goto L11
                java.lang.String r1 = "video/"
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L11
                r0 = 1
                return r0
            L11:
                r0 = 0
                return r0
        }
    }

    static {
            java.lang.String r6 = "moto g(20)"
            java.lang.String r7 = "sm-a035m"
            java.lang.String r0 = "lg-k430"
            java.lang.String r1 = "redmi note 4"
            java.lang.String r2 = "m2003j15sc"
            java.lang.String r3 = "rmx3231"
            java.lang.String r4 = "v2117"
            java.lang.String r5 = "sm-a032f"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7}
            java.util.List r0 = java.util.Arrays.asList(r0)
            androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk.INCORRECT_FHD_PROFILE_MODEL_LIST = r0
            return
    }

    public MediaCodecInfoReportIncorrectInfoQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static java.util.Set<android.util.Size> getExtraSupportedSizes() {
            boolean r0 = isFHDProblematicDevice()
            if (r0 == 0) goto L14
            android.util.Size r0 = new android.util.Size
            r1 = 1920(0x780, float:2.69E-42)
            r2 = 1080(0x438, float:1.513E-42)
            r0.<init>(r1, r2)
            java.util.Set r0 = java.util.Collections.singleton(r0)
            return r0
        L14:
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
    }

    private static boolean isFHDProblematicDevice() {
            java.util.List<java.lang.String> r0 = androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk.INCORRECT_FHD_PROFILE_MODEL_LIST
            java.lang.String r1 = android.os.Build.MODEL
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r2)
            boolean r0 = r0.contains(r1)
            return r0
    }

    private static boolean isHuaweiMate9() {
            java.lang.String r0 = "Huawei"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "mha-l29"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    private static boolean isMotoC() {
            java.lang.String r0 = "motorola"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "moto c"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    private static boolean isNokia1() {
            java.lang.String r0 = "Nokia"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "Nokia 1"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    private static boolean isPositivoTwist2Pro() {
            java.lang.String r0 = "positivo"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "twist 2 pro"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    private static boolean isRedmiNote8Pro() {
            java.lang.String r0 = "Redmi"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "Redmi Note 8 Pro"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    private static boolean isX230() {
            java.lang.String r0 = "LGE"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "LG-X230"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    private static boolean isX650() {
            java.lang.String r0 = "infinix"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            java.lang.String r0 = "infinix x650"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    static boolean load() {
            boolean r0 = isNokia1()
            if (r0 != 0) goto L33
            boolean r0 = isMotoC()
            if (r0 != 0) goto L33
            boolean r0 = isX650()
            if (r0 != 0) goto L33
            boolean r0 = isX230()
            if (r0 != 0) goto L33
            boolean r0 = isHuaweiMate9()
            if (r0 != 0) goto L33
            boolean r0 = isRedmiNote8Pro()
            if (r0 != 0) goto L33
            boolean r0 = isPositivoTwist2Pro()
            if (r0 != 0) goto L33
            boolean r0 = isFHDProblematicDevice()
            if (r0 == 0) goto L31
            goto L33
        L31:
            r0 = 0
            return r0
        L33:
            r0 = 1
            return r0
    }

    public boolean isUnSupportMediaCodecInfo(@androidx.annotation.NonNull android.media.MediaFormat r5) {
            r4 = this;
            androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk$MediaFormatResolver r0 = new androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk$MediaFormatResolver
            r0.<init>(r5)
            boolean r5 = isNokia1()
            if (r5 != 0) goto L5d
            boolean r5 = isMotoC()
            if (r5 != 0) goto L5d
            boolean r5 = isX650()
            if (r5 != 0) goto L5d
            boolean r5 = isX230()
            if (r5 != 0) goto L5d
            boolean r5 = isPositivoTwist2Pro()
            if (r5 == 0) goto L24
            goto L5d
        L24:
            boolean r5 = isHuaweiMate9()
            r1 = 1
            r2 = 0
            if (r5 != 0) goto L4b
            boolean r5 = isRedmiNote8Pro()
            if (r5 == 0) goto L33
            goto L4b
        L33:
            boolean r5 = isFHDProblematicDevice()
            if (r5 == 0) goto L4a
            boolean r5 = r0.isAvc()
            if (r5 == 0) goto L4a
            r5 = 1920(0x780, float:2.69E-42)
            r3 = 1080(0x438, float:1.513E-42)
            boolean r5 = r0.isSize(r5, r3)
            if (r5 == 0) goto L4a
            return r1
        L4a:
            return r2
        L4b:
            boolean r5 = r0.isVideo()
            if (r5 == 0) goto L5c
            r5 = 3840(0xf00, float:5.381E-42)
            r3 = 2160(0x870, float:3.027E-42)
            boolean r5 = r0.isSize(r5, r3)
            if (r5 == 0) goto L5c
            return r1
        L5c:
            return r2
        L5d:
            boolean r5 = r0.isMpeg4()
            return r5
    }
}
