package tv.danmaku.ijk.media.player.misc;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AndroidMediaFormat implements tv.danmaku.ijk.media.player.misc.IMediaFormat {
    private final android.media.MediaFormat mMediaFormat;

    public AndroidMediaFormat(android.media.MediaFormat r1) {
            r0 = this;
            r0.<init>()
            r0.mMediaFormat = r1
            return
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaFormat
    @android.annotation.TargetApi(16)
    public int getInteger(java.lang.String r2) {
            r1 = this;
            android.media.MediaFormat r0 = r1.mMediaFormat
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            int r2 = r0.getInteger(r2)
            return r2
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaFormat
    @android.annotation.TargetApi(16)
    public java.lang.String getString(java.lang.String r2) {
            r1 = this;
            android.media.MediaFormat r0 = r1.mMediaFormat
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.String r2 = r0.getString(r2)
            return r2
    }

    @android.annotation.TargetApi(16)
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            android.media.MediaFormat r1 = r2.mMediaFormat
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
