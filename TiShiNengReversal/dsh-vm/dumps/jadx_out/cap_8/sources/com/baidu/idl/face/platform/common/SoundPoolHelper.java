package com.baidu.idl.face.platform.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SoundPoolHelper {
    private static final java.lang.String TAG = "SoundPoolHelper";
    private android.content.Context mContext;
    private volatile boolean mIsEnableSound;
    private volatile boolean mIsPlaying;
    private volatile long mPlayDuration;
    private java.util.HashMap<java.lang.Integer, java.lang.Long> mPlayDurationMap;
    private com.baidu.idl.face.platform.FaceStatusNewEnum mPlaySoundStatusNewEnum;
    private volatile long mPlayTime;

    static {
            return
    }

    public SoundPoolHelper(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mPlayDuration = r0
            r2.mPlayTime = r0
            r0 = 0
            r2.mIsPlaying = r0
            r0 = 1
            r2.mIsEnableSound = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mPlayDurationMap = r0
            r2.mContext = r3
            return
    }

    private long getSoundDuration(int r6) {
            r5 = this;
            java.util.HashMap<java.lang.Integer, java.lang.Long> r0 = r5.mPlayDurationMap
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L1d
            java.util.HashMap<java.lang.Integer, java.lang.Long> r0 = r5.mPlayDurationMap
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r6 = r0.get(r6)
            java.lang.Long r6 = (java.lang.Long) r6
            long r0 = r6.longValue()
            return r0
        L1d:
            java.lang.System.currentTimeMillis()
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            r1 = 600(0x258, double:2.964E-321)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r3.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = "android.resource://"
            r3.append(r4)     // Catch: java.lang.Throwable -> L6a
            android.content.Context r4 = r5.mContext     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L6a
            r3.append(r4)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = "/"
            r3.append(r4)     // Catch: java.lang.Throwable -> L6a
            r3.append(r6)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L6a
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L6a
            android.content.Context r4 = r5.mContext     // Catch: java.lang.Throwable -> L6a
            r0.setDataSource(r4, r3)     // Catch: java.lang.Throwable -> L6a
            r3 = 9
            java.lang.String r0 = r0.extractMetadata(r3)     // Catch: java.lang.Throwable -> L6a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L6a
            long r1 = r0.longValue()     // Catch: java.lang.Throwable -> L6a
            java.util.HashMap<java.lang.Integer, java.lang.Long> r0 = r5.mPlayDurationMap     // Catch: java.lang.Throwable -> L6a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L6a
            java.lang.Long r3 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L6a
            r0.put(r6, r3)     // Catch: java.lang.Throwable -> L6a
        L6a:
            return r1
    }

    public boolean getEnableSound() {
            r1 = this;
            boolean r0 = r1.mIsEnableSound
            return r0
    }

    public long getPlayDuration() {
            r2 = this;
            long r0 = r2.mPlayDuration
            return r0
    }

    public boolean playSound(com.baidu.idl.face.platform.FaceStatusNewEnum r8) {
            r7 = this;
            boolean r0 = r7.mIsEnableSound
            if (r0 != 0) goto L7
            com.baidu.idl.face.platform.utils.SoundPlayer.release()
        L7:
            android.content.Context r0 = r7.mContext
            if (r0 != 0) goto Le
            com.baidu.idl.face.platform.utils.SoundPlayer.release()
        Le:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = com.baidu.idl.face.platform.utils.SoundPlayer.playTime
            long r0 = r0 - r2
            long r2 = r7.mPlayDuration
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            r7.mIsPlaying = r0
            boolean r0 = r7.mIsPlaying
            if (r0 != 0) goto L64
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = r7.mPlaySoundStatusNewEnum
            if (r0 != r8) goto L38
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r7.mPlayTime
            long r0 = r0 - r2
            long r2 = com.baidu.idl.face.platform.FaceEnvironment.TIME_TIPS_REPEAT
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L38
            goto L64
        L38:
            r7.mIsPlaying = r5
            r7.mPlaySoundStatusNewEnum = r8
            r0 = 0
            r7.mPlayDuration = r0
            long r0 = java.lang.System.currentTimeMillis()
            r7.mPlayTime = r0
            int r8 = com.baidu.idl.face.platform.FaceEnvironment.getSoundId(r8)
            if (r8 <= 0) goto L61
            long r0 = r7.getSoundDuration(r8)
            r7.mPlayDuration = r0
            long r0 = java.lang.System.currentTimeMillis()
            com.baidu.idl.face.platform.utils.SoundPlayer.playTime = r0
            boolean r0 = r7.mIsEnableSound
            if (r0 == 0) goto L61
            android.content.Context r0 = r7.mContext
            com.baidu.idl.face.platform.utils.SoundPlayer.play(r0, r8)
        L61:
            boolean r8 = r7.mIsPlaying
            return r8
        L64:
            return r4
    }

    public void release() {
            r2 = this;
            com.baidu.idl.face.platform.utils.SoundPlayer.release()
            r0 = 0
            r2.mPlayDuration = r0
            r2.mPlayTime = r0
            r0 = 0
            r2.mContext = r0
            return
    }

    public void setEnableSound(boolean r1) {
            r0 = this;
            r0.mIsEnableSound = r1
            return
    }
}
