package tv.danmaku.ijk.media.player;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface IMediaPlayer {
    public static final int MEDIA_ERROR_IO = -1004;
    public static final int MEDIA_ERROR_MALFORMED = -1007;
    public static final int MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = 200;
    public static final int MEDIA_ERROR_SERVER_DIED = 100;
    public static final int MEDIA_ERROR_TIMED_OUT = -110;
    public static final int MEDIA_ERROR_UNKNOWN = 1;
    public static final int MEDIA_ERROR_UNSUPPORTED = -1010;
    public static final int MEDIA_INFO_AUDIO_DECODED_START = 10003;
    public static final int MEDIA_INFO_AUDIO_RENDERING_START = 10002;
    public static final int MEDIA_INFO_AUDIO_SEEK_RENDERING_START = 10009;
    public static final int MEDIA_INFO_BAD_INTERLEAVING = 800;
    public static final int MEDIA_INFO_BUFFERING_END = 702;
    public static final int MEDIA_INFO_BUFFERING_START = 701;
    public static final int MEDIA_INFO_COMPONENT_OPEN = 10007;
    public static final int MEDIA_INFO_FIND_STREAM_INFO = 10006;
    public static final int MEDIA_INFO_MEDIA_ACCURATE_SEEK_COMPLETE = 10100;
    public static final int MEDIA_INFO_METADATA_UPDATE = 802;
    public static final int MEDIA_INFO_NETWORK_BANDWIDTH = 703;
    public static final int MEDIA_INFO_NOT_SEEKABLE = 801;
    public static final int MEDIA_INFO_OPEN_INPUT = 10005;
    public static final int MEDIA_INFO_STARTED_AS_NEXT = 2;
    public static final int MEDIA_INFO_SUBTITLE_TIMED_OUT = 902;
    public static final int MEDIA_INFO_TIMED_TEXT_ERROR = 900;
    public static final int MEDIA_INFO_UNKNOWN = 1;
    public static final int MEDIA_INFO_UNSUPPORTED_SUBTITLE = 901;
    public static final int MEDIA_INFO_VIDEO_DECODED_START = 10004;
    public static final int MEDIA_INFO_VIDEO_RENDERING_START = 3;
    public static final int MEDIA_INFO_VIDEO_ROTATION_CHANGED = 10001;
    public static final int MEDIA_INFO_VIDEO_SEEK_RENDERING_START = 10008;
    public static final int MEDIA_INFO_VIDEO_TRACK_LAGGING = 700;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnBufferingUpdateListener {
        void onBufferingUpdate(tv.danmaku.ijk.media.player.IMediaPlayer r1, int r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnCompletionListener {
        void onCompletion(tv.danmaku.ijk.media.player.IMediaPlayer r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnErrorListener {
        boolean onError(tv.danmaku.ijk.media.player.IMediaPlayer r1, int r2, int r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnInfoListener {
        boolean onInfo(tv.danmaku.ijk.media.player.IMediaPlayer r1, int r2, int r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnPreparedListener {
        void onPrepared(tv.danmaku.ijk.media.player.IMediaPlayer r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnSeekCompleteListener {
        void onSeekComplete(tv.danmaku.ijk.media.player.IMediaPlayer r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnTimedTextListener {
        void onTimedText(tv.danmaku.ijk.media.player.IMediaPlayer r1, tv.danmaku.ijk.media.player.IjkTimedText r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnVideoSizeChangedListener {
        void onVideoSizeChanged(tv.danmaku.ijk.media.player.IMediaPlayer r1, int r2, int r3, int r4, int r5);
    }

    int getAudioSessionId();

    long getCurrentPosition();

    java.lang.String getDataSource();

    long getDuration();

    tv.danmaku.ijk.media.player.MediaInfo getMediaInfo();

    tv.danmaku.ijk.media.player.misc.ITrackInfo[] getTrackInfo();

    int getVideoHeight();

    int getVideoSarDen();

    int getVideoSarNum();

    int getVideoWidth();

    boolean isLooping();

    @java.lang.Deprecated
    boolean isPlayable();

    boolean isPlaying();

    void pause() throws java.lang.IllegalStateException;

    void prepareAsync() throws java.lang.IllegalStateException;

    void release();

    void reset();

    void seekTo(long r1) throws java.lang.IllegalStateException;

    void setAudioStreamType(int r1);

    void setDataSource(android.content.Context r1, android.net.Uri r2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException;

    @android.annotation.TargetApi(14)
    void setDataSource(android.content.Context r1, android.net.Uri r2, java.util.Map<java.lang.String, java.lang.String> r3) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException;

    void setDataSource(java.io.FileDescriptor r1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;

    void setDataSource(java.lang.String r1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException;

    void setDataSource(tv.danmaku.ijk.media.player.misc.IMediaDataSource r1);

    void setDisplay(android.view.SurfaceHolder r1);

    @java.lang.Deprecated
    void setKeepInBackground(boolean r1);

    @java.lang.Deprecated
    void setLogEnabled(boolean r1);

    void setLooping(boolean r1);

    void setOnBufferingUpdateListener(tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener r1);

    void setOnCompletionListener(tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener r1);

    void setOnErrorListener(tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener r1);

    void setOnInfoListener(tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener r1);

    void setOnPreparedListener(tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener r1);

    void setOnSeekCompleteListener(tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener r1);

    void setOnTimedTextListener(tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener r1);

    void setOnVideoSizeChangedListener(tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener r1);

    void setScreenOnWhilePlaying(boolean r1);

    void setSurface(android.view.Surface r1);

    void setVolume(float r1, float r2);

    @java.lang.Deprecated
    void setWakeMode(android.content.Context r1, int r2);

    void start() throws java.lang.IllegalStateException;

    void stop() throws java.lang.IllegalStateException;
}
