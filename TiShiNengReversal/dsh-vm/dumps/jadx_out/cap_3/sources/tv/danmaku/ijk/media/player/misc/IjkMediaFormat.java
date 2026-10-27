package tv.danmaku.ijk.media.player.misc;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class IjkMediaFormat implements tv.danmaku.ijk.media.player.misc.IMediaFormat {
    public static final java.lang.String CODEC_NAME_H264 = "h264";
    public static final java.lang.String KEY_IJK_BIT_RATE_UI = "ijk-bit-rate-ui";
    public static final java.lang.String KEY_IJK_CHANNEL_UI = "ijk-channel-ui";
    public static final java.lang.String KEY_IJK_CODEC_LONG_NAME_UI = "ijk-codec-long-name-ui";
    public static final java.lang.String KEY_IJK_CODEC_NAME_UI = "ijk-codec-name-ui";
    public static final java.lang.String KEY_IJK_CODEC_PIXEL_FORMAT_UI = "ijk-pixel-format-ui";
    public static final java.lang.String KEY_IJK_CODEC_PROFILE_LEVEL_UI = "ijk-profile-level-ui";
    public static final java.lang.String KEY_IJK_FRAME_RATE_UI = "ijk-frame-rate-ui";
    public static final java.lang.String KEY_IJK_RESOLUTION_UI = "ijk-resolution-ui";
    public static final java.lang.String KEY_IJK_SAMPLE_RATE_UI = "ijk-sample-rate-ui";
    private static final java.util.Map<java.lang.String, tv.danmaku.ijk.media.player.misc.IjkMediaFormat.Formatter> sFormatterMap = null;
    public final tv.danmaku.ijk.media.player.IjkMediaMeta.IjkStreamMeta mMediaFormat;










    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class Formatter {
        private Formatter() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ Formatter(tv.danmaku.ijk.media.player.misc.IjkMediaFormat.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        protected abstract java.lang.String doFormat(tv.danmaku.ijk.media.player.misc.IjkMediaFormat r1);

        public java.lang.String format(tv.danmaku.ijk.media.player.misc.IjkMediaFormat r2) {
                r1 = this;
                java.lang.String r2 = r1.doFormat(r2)
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 == 0) goto Le
                java.lang.String r2 = r1.getDefaultString()
            Le:
                return r2
        }

        protected java.lang.String getDefaultString() {
                r1 = this;
                java.lang.String r0 = "N/A"
                return r0
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            tv.danmaku.ijk.media.player.misc.IjkMediaFormat.sFormatterMap = r0
            return
    }

    public IjkMediaFormat(tv.danmaku.ijk.media.player.IjkMediaMeta.IjkStreamMeta r4) {
            r3 = this;
            r3.<init>()
            java.util.Map<java.lang.String, tv.danmaku.ijk.media.player.misc.IjkMediaFormat$Formatter> r0 = tv.danmaku.ijk.media.player.misc.IjkMediaFormat.sFormatterMap
            tv.danmaku.ijk.media.player.misc.IjkMediaFormat$1 r1 = new tv.danmaku.ijk.media.player.misc.IjkMediaFormat$1
            r1.<init>(r3)
            java.lang.String r2 = "ijk-codec-long-name-ui"
            r0.put(r2, r1)
            tv.danmaku.ijk.media.player.misc.IjkMediaFormat$2 r1 = new tv.danmaku.ijk.media.player.misc.IjkMediaFormat$2
            r1.<init>(r3)
            java.lang.String r2 = "ijk-codec-name-ui"
            r0.put(r2, r1)
            tv.danmaku.ijk.media.player.misc.IjkMediaFormat$3 r1 = new tv.danmaku.ijk.media.player.misc.IjkMediaFormat$3
            r1.<init>(r3)
            java.lang.String r2 = "ijk-bit-rate-ui"
            r0.put(r2, r1)
            tv.danmaku.ijk.media.player.misc.IjkMediaFormat$4 r1 = new tv.danmaku.ijk.media.player.misc.IjkMediaFormat$4
            r1.<init>(r3)
            java.lang.String r2 = "ijk-profile-level-ui"
            r0.put(r2, r1)
            tv.danmaku.ijk.media.player.misc.IjkMediaFormat$5 r1 = new tv.danmaku.ijk.media.player.misc.IjkMediaFormat$5
            r1.<init>(r3)
            java.lang.String r2 = "ijk-pixel-format-ui"
            r0.put(r2, r1)
            tv.danmaku.ijk.media.player.misc.IjkMediaFormat$6 r1 = new tv.danmaku.ijk.media.player.misc.IjkMediaFormat$6
            r1.<init>(r3)
            java.lang.String r2 = "ijk-resolution-ui"
            r0.put(r2, r1)
            tv.danmaku.ijk.media.player.misc.IjkMediaFormat$7 r1 = new tv.danmaku.ijk.media.player.misc.IjkMediaFormat$7
            r1.<init>(r3)
            java.lang.String r2 = "ijk-frame-rate-ui"
            r0.put(r2, r1)
            tv.danmaku.ijk.media.player.misc.IjkMediaFormat$8 r1 = new tv.danmaku.ijk.media.player.misc.IjkMediaFormat$8
            r1.<init>(r3)
            java.lang.String r2 = "ijk-sample-rate-ui"
            r0.put(r2, r1)
            tv.danmaku.ijk.media.player.misc.IjkMediaFormat$9 r1 = new tv.danmaku.ijk.media.player.misc.IjkMediaFormat$9
            r1.<init>(r3)
            java.lang.String r2 = "ijk-channel-ui"
            r0.put(r2, r1)
            r3.mMediaFormat = r4
            return
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaFormat
    @android.annotation.TargetApi(16)
    public int getInteger(java.lang.String r2) {
            r1 = this;
            tv.danmaku.ijk.media.player.IjkMediaMeta$IjkStreamMeta r0 = r1.mMediaFormat
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            int r2 = r0.getInt(r2)
            return r2
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaFormat
    public java.lang.String getString(java.lang.String r3) {
            r2 = this;
            tv.danmaku.ijk.media.player.IjkMediaMeta$IjkStreamMeta r0 = r2.mMediaFormat
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            java.util.Map<java.lang.String, tv.danmaku.ijk.media.player.misc.IjkMediaFormat$Formatter> r0 = tv.danmaku.ijk.media.player.misc.IjkMediaFormat.sFormatterMap
            boolean r1 = r0.containsKey(r3)
            if (r1 == 0) goto L19
            java.lang.Object r3 = r0.get(r3)
            tv.danmaku.ijk.media.player.misc.IjkMediaFormat$Formatter r3 = (tv.danmaku.ijk.media.player.misc.IjkMediaFormat.Formatter) r3
            java.lang.String r3 = r3.format(r2)
            return r3
        L19:
            tv.danmaku.ijk.media.player.IjkMediaMeta$IjkStreamMeta r0 = r2.mMediaFormat
            java.lang.String r3 = r0.getString(r3)
            return r3
    }
}
