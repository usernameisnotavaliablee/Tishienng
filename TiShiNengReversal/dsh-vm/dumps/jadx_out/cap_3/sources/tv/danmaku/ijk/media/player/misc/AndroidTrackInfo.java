package tv.danmaku.ijk.media.player.misc;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AndroidTrackInfo implements tv.danmaku.ijk.media.player.misc.ITrackInfo {
    private final android.media.MediaPlayer.TrackInfo mTrackInfo;

    private AndroidTrackInfo(android.media.MediaPlayer.TrackInfo r1) {
            r0 = this;
            r0.<init>()
            r0.mTrackInfo = r1
            return
    }

    public static tv.danmaku.ijk.media.player.misc.AndroidTrackInfo[] fromMediaPlayer(android.media.MediaPlayer r0) {
            android.media.MediaPlayer$TrackInfo[] r0 = r0.getTrackInfo()
            tv.danmaku.ijk.media.player.misc.AndroidTrackInfo[] r0 = fromTrackInfo(r0)
            return r0
    }

    private static tv.danmaku.ijk.media.player.misc.AndroidTrackInfo[] fromTrackInfo(android.media.MediaPlayer.TrackInfo[] r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            int r0 = r4.length
            tv.danmaku.ijk.media.player.misc.AndroidTrackInfo[] r0 = new tv.danmaku.ijk.media.player.misc.AndroidTrackInfo[r0]
            r1 = 0
        L8:
            int r2 = r4.length
            if (r1 >= r2) goto L17
            tv.danmaku.ijk.media.player.misc.AndroidTrackInfo r2 = new tv.danmaku.ijk.media.player.misc.AndroidTrackInfo
            r3 = r4[r1]
            r2.<init>(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L17:
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.misc.ITrackInfo
    @android.annotation.TargetApi(19)
    public tv.danmaku.ijk.media.player.misc.IMediaFormat getFormat() {
            r2 = this;
            android.media.MediaPlayer$TrackInfo r0 = r2.mTrackInfo
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.media.MediaFormat r0 = r0.getFormat()
            if (r0 != 0) goto Ld
            return r1
        Ld:
            tv.danmaku.ijk.media.player.misc.AndroidMediaFormat r1 = new tv.danmaku.ijk.media.player.misc.AndroidMediaFormat
            r1.<init>(r0)
            return r1
    }

    @Override // tv.danmaku.ijk.media.player.misc.ITrackInfo
    @android.annotation.TargetApi(16)
    public java.lang.String getInfoInline() {
            r1 = this;
            android.media.MediaPlayer$TrackInfo r0 = r1.mTrackInfo
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.toString()
            return r0
        L9:
            java.lang.String r0 = "null"
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.misc.ITrackInfo
    @android.annotation.TargetApi(16)
    public java.lang.String getLanguage() {
            r1 = this;
            android.media.MediaPlayer$TrackInfo r0 = r1.mTrackInfo
            if (r0 != 0) goto L7
            java.lang.String r0 = "und"
            return r0
        L7:
            java.lang.String r0 = r0.getLanguage()
            return r0
    }

    @Override // tv.danmaku.ijk.media.player.misc.ITrackInfo
    @android.annotation.TargetApi(16)
    public int getTrackType() {
            r1 = this;
            android.media.MediaPlayer$TrackInfo r0 = r1.mTrackInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.getTrackType()
            return r0
    }

    @android.annotation.TargetApi(16)
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            android.media.MediaPlayer$TrackInfo r1 = r2.mTrackInfo
            if (r1 == 0) goto L23
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            goto L28
        L23:
            java.lang.String r1 = "null"
            r0.append(r1)
        L28:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
