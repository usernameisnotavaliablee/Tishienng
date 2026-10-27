package tv.danmaku.ijk.media.player.misc;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class IjkTrackInfo implements tv.danmaku.ijk.media.player.misc.ITrackInfo {
    private tv.danmaku.ijk.media.player.IjkMediaMeta.IjkStreamMeta mStreamMeta;
    private int mTrackType;

    public IjkTrackInfo(tv.danmaku.ijk.media.player.IjkMediaMeta.IjkStreamMeta r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mTrackType = r0
            r1.mStreamMeta = r2
            return
    }

    @Override // tv.danmaku.ijk.media.player.misc.ITrackInfo
    public tv.danmaku.ijk.media.player.misc.IMediaFormat getFormat() {
            r2 = this;
            tv.danmaku.ijk.media.player.misc.IjkMediaFormat r0 = new tv.danmaku.ijk.media.player.misc.IjkMediaFormat
            tv.danmaku.ijk.media.player.IjkMediaMeta$IjkStreamMeta r1 = r2.mStreamMeta
            r0.<init>(r1)
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.misc.ITrackInfo
    public java.lang.String getInfoInline() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            int r1 = r4.mTrackType
            r2 = 1
            java.lang.String r3 = ", "
            if (r1 == r2) goto L5d
            r2 = 2
            if (r1 == r2) goto L33
            r2 = 3
            if (r1 == r2) goto L23
            r2 = 4
            if (r1 == r2) goto L1d
            java.lang.String r1 = "UNKNOWN"
            r0.append(r1)
            goto L86
        L1d:
            java.lang.String r1 = "SUBTITLE"
            r0.append(r1)
            goto L86
        L23:
            java.lang.String r1 = "TIMEDTEXT"
            r0.append(r1)
            r0.append(r3)
            tv.danmaku.ijk.media.player.IjkMediaMeta$IjkStreamMeta r1 = r4.mStreamMeta
            java.lang.String r1 = r1.mLanguage
            r0.append(r1)
            goto L86
        L33:
            java.lang.String r1 = "AUDIO"
            r0.append(r1)
            r0.append(r3)
            tv.danmaku.ijk.media.player.IjkMediaMeta$IjkStreamMeta r1 = r4.mStreamMeta
            java.lang.String r1 = r1.getCodecShortNameInline()
            r0.append(r1)
            r0.append(r3)
            tv.danmaku.ijk.media.player.IjkMediaMeta$IjkStreamMeta r1 = r4.mStreamMeta
            java.lang.String r1 = r1.getBitrateInline()
            r0.append(r1)
            r0.append(r3)
            tv.danmaku.ijk.media.player.IjkMediaMeta$IjkStreamMeta r1 = r4.mStreamMeta
            java.lang.String r1 = r1.getSampleRateInline()
            r0.append(r1)
            goto L86
        L5d:
            java.lang.String r1 = "VIDEO"
            r0.append(r1)
            r0.append(r3)
            tv.danmaku.ijk.media.player.IjkMediaMeta$IjkStreamMeta r1 = r4.mStreamMeta
            java.lang.String r1 = r1.getCodecShortNameInline()
            r0.append(r1)
            r0.append(r3)
            tv.danmaku.ijk.media.player.IjkMediaMeta$IjkStreamMeta r1 = r4.mStreamMeta
            java.lang.String r1 = r1.getBitrateInline()
            r0.append(r1)
            r0.append(r3)
            tv.danmaku.ijk.media.player.IjkMediaMeta$IjkStreamMeta r1 = r4.mStreamMeta
            java.lang.String r1 = r1.getResolutionInline()
            r0.append(r1)
        L86:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.misc.ITrackInfo
    public java.lang.String getLanguage() {
            r1 = this;
            tv.danmaku.ijk.media.player.IjkMediaMeta$IjkStreamMeta r0 = r1.mStreamMeta
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.mLanguage
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Ld
            goto L12
        Ld:
            tv.danmaku.ijk.media.player.IjkMediaMeta$IjkStreamMeta r0 = r1.mStreamMeta
            java.lang.String r0 = r0.mLanguage
            return r0
        L12:
            java.lang.String r0 = "und"
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.misc.ITrackInfo
    public int getTrackType() {
            r1 = this;
            int r0 = r1.mTrackType
            return r0
    }

    public void setMediaMeta(tv.danmaku.ijk.media.player.IjkMediaMeta.IjkStreamMeta r1) {
            r0 = this;
            r0.mStreamMeta = r1
            return
    }

    public void setTrackType(int r1) {
            r0 = this;
            r0.mTrackType = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            java.lang.String r1 = r2.getInfoInline()
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
