package com.baidu.idl.face.platform.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class SoundPlayer {
    private static final boolean DEBUG = false;
    private static final long LOAD_SOUND_MILLIS = 100;
    public static final int MAX_STREAMS = 5;
    private static final java.lang.String TAG = "SoundPlayer";
    public static long playTime;
    private static com.baidu.idl.face.platform.utils.SoundPlayer sSoundPlayer;
    private android.media.SoundPool mSoundPool;
    private android.util.SparseIntArray mSoundPoolCache;


    static {
            return
    }

    private SoundPlayer() {
            r4 = this;
            r4.<init>()
            android.media.SoundPool r0 = new android.media.SoundPool
            r1 = 3
            r2 = 0
            r3 = 5
            r0.<init>(r3, r1, r2)
            r4.mSoundPool = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r4.mSoundPoolCache = r0
            r0 = 0
            com.baidu.idl.face.platform.utils.SoundPlayer.playTime = r0
            return
    }

    static /* synthetic */ com.baidu.idl.face.platform.utils.SoundPlayer access$000() {
            com.baidu.idl.face.platform.utils.SoundPlayer r0 = com.baidu.idl.face.platform.utils.SoundPlayer.sSoundPlayer
            return r0
    }

    static /* synthetic */ android.media.SoundPool access$100(com.baidu.idl.face.platform.utils.SoundPlayer r0) {
            android.media.SoundPool r0 = r0.mSoundPool
            return r0
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void play(android.content.Context r9, int r10) {
            com.baidu.idl.face.platform.utils.SoundPlayer r0 = com.baidu.idl.face.platform.utils.SoundPlayer.sSoundPlayer
            if (r0 != 0) goto Lb
            com.baidu.idl.face.platform.utils.SoundPlayer r0 = new com.baidu.idl.face.platform.utils.SoundPlayer
            r0.<init>()
            com.baidu.idl.face.platform.utils.SoundPlayer.sSoundPlayer = r0
        Lb:
            com.baidu.idl.face.platform.utils.SoundPlayer r0 = com.baidu.idl.face.platform.utils.SoundPlayer.sSoundPlayer
            android.util.SparseIntArray r0 = r0.mSoundPoolCache
            int r2 = r0.get(r10)
            if (r2 != 0) goto L5a
            if (r9 != 0) goto L18
            goto L69
        L18:
            com.baidu.idl.face.platform.utils.SoundPlayer r0 = com.baidu.idl.face.platform.utils.SoundPlayer.sSoundPlayer
            android.media.SoundPool r0 = r0.mSoundPool
            r1 = 1
            int r3 = r0.load(r9, r10, r1)
            com.baidu.idl.face.platform.utils.SoundPlayer r9 = com.baidu.idl.face.platform.utils.SoundPlayer.sSoundPlayer
            android.util.SparseIntArray r9 = r9.mSoundPoolCache
            r9.put(r10, r3)
            boolean r9 = com.baidu.idl.face.platform.utils.APIUtils.hasFroyo()
            if (r9 == 0) goto L3b
            com.baidu.idl.face.platform.utils.SoundPlayer r9 = com.baidu.idl.face.platform.utils.SoundPlayer.sSoundPlayer
            android.media.SoundPool r9 = r9.mSoundPool
            com.baidu.idl.face.platform.utils.SoundPlayer$1 r10 = new com.baidu.idl.face.platform.utils.SoundPlayer$1
            r10.<init>(r3)
            r9.setOnLoadCompleteListener(r10)
            goto L69
        L3b:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.InterruptedException -> L44
            r0 = 100
            r9.join(r0)     // Catch: java.lang.InterruptedException -> L44
        L44:
            long r9 = java.lang.System.currentTimeMillis()
            com.baidu.idl.face.platform.utils.SoundPlayer.playTime = r9
            com.baidu.idl.face.platform.utils.SoundPlayer r9 = com.baidu.idl.face.platform.utils.SoundPlayer.sSoundPlayer
            android.media.SoundPool r2 = r9.mSoundPool
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 5
            r2.play(r3, r4, r5, r6, r7, r8)
            goto L69
        L5a:
            com.baidu.idl.face.platform.utils.SoundPlayer r9 = com.baidu.idl.face.platform.utils.SoundPlayer.sSoundPlayer     // Catch: java.lang.Exception -> L69
            android.media.SoundPool r1 = r9.mSoundPool     // Catch: java.lang.Exception -> L69
            r6 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 5
            r1.play(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L69
        L69:
            return
    }

    public static void release() {
            com.baidu.idl.face.platform.utils.SoundPlayer r0 = com.baidu.idl.face.platform.utils.SoundPlayer.sSoundPlayer
            if (r0 == 0) goto L34
            android.util.SparseIntArray r0 = r0.mSoundPoolCache
            int r0 = r0.size()
            r1 = 0
        Lb:
            if (r1 >= r0) goto L1d
            com.baidu.idl.face.platform.utils.SoundPlayer r2 = com.baidu.idl.face.platform.utils.SoundPlayer.sSoundPlayer
            android.media.SoundPool r3 = r2.mSoundPool
            android.util.SparseIntArray r2 = r2.mSoundPoolCache
            int r2 = r2.valueAt(r1)
            r3.unload(r2)
            int r1 = r1 + 1
            goto Lb
        L1d:
            com.baidu.idl.face.platform.utils.SoundPlayer r0 = com.baidu.idl.face.platform.utils.SoundPlayer.sSoundPlayer
            android.media.SoundPool r0 = r0.mSoundPool
            r0.release()
            com.baidu.idl.face.platform.utils.SoundPlayer r0 = com.baidu.idl.face.platform.utils.SoundPlayer.sSoundPlayer
            r1 = 0
            r0.mSoundPool = r1
            android.util.SparseIntArray r0 = r0.mSoundPoolCache
            r0.clear()
            com.baidu.idl.face.platform.utils.SoundPlayer r0 = com.baidu.idl.face.platform.utils.SoundPlayer.sSoundPlayer
            r0.mSoundPoolCache = r1
            com.baidu.idl.face.platform.utils.SoundPlayer.sSoundPlayer = r1
        L34:
            r0 = 0
            com.baidu.idl.face.platform.utils.SoundPlayer.playTime = r0
            return
    }
}
