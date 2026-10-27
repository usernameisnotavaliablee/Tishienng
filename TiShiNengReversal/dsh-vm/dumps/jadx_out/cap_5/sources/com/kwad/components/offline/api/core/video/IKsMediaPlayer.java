package com.kwad.components.offline.api.core.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface IKsMediaPlayer {
    void addOnInfoListener(com.kwad.components.offline.api.core.video.IMediaPlayer.OnInfoListener r1);

    void addOnPreparedListener(com.kwad.components.offline.api.core.video.IMediaPlayer.OnPreparedListener r1);

    void clear();

    boolean getAlphaVideoValid();

    int getBufferPercentage();

    java.lang.String getCurrentPlayingUrl();

    long getCurrentPosition();

    long getDuration();

    int getMaxVolume();

    com.kwad.components.offline.api.core.video.IMediaPlayer getMediaPlayer();

    int getMediaPlayerType();

    long getPlayDuration();

    java.lang.String getStateString(int r1);

    int getVideoHeight();

    int getVideoWidth();

    int getVolume();

    void initMediaPlayer(@androidx.annotation.NonNull com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo r1, @androidx.annotation.NonNull com.kwad.components.offline.api.core.video.IKsMediaPlayerView r2);

    void initMediaPlayer(@androidx.annotation.NonNull com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo r1, boolean r2, boolean r3, @androidx.annotation.NonNull com.kwad.components.offline.api.core.video.IKsMediaPlayerView r4);

    boolean isPlaying();

    boolean isPrepared();

    boolean isPreparing();

    void notifyOnInfoListener(com.kwad.components.offline.api.core.video.IMediaPlayer r1, int r2, int r3);

    void onPlayStateChanged(int r1);

    boolean pause();

    void prepareAsync();

    void registerVideoMuteStateListener(com.kwad.components.offline.api.core.video.listener.VideoMuteStateChangeListener r1);

    void registerVideoPlayStateListener(com.kwad.components.offline.api.core.video.listener.OfflineVideoPlayStateListener r1);

    void release();

    void release(com.kwad.components.offline.api.core.video.listener.ReleaseCallback r1);

    void release(com.kwad.components.offline.api.core.video.listener.ReleaseCallback r1, boolean r2);

    void releaseAsync();

    void removeInfoListener(com.kwad.components.offline.api.core.video.IMediaPlayer.OnInfoListener r1);

    void resetAndPlay(com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo r1);

    void restart();

    void resume();

    void seekTo(long r1);

    void setAudioEnabled(boolean r1);

    void setDataSource(@androidx.annotation.NonNull com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo r1);

    void setForceGetAudioFocus(boolean r1);

    void setIsAlphaVideoPlayer(boolean r1);

    void setRadius(float r1, float r2, float r3, float r4);

    void setSpeed(float r1);

    void setSurface(android.view.Surface r1);

    void setTKPlayer();

    void setVideoAdaptStrategy(int r1);

    void setVolume(float r1, float r2);

    void start();

    void start(long r1);

    void stopAndPrepareAsync();

    void unRegisterVideoPlayStateListener(com.kwad.components.offline.api.core.video.listener.OfflineVideoPlayStateListener r1);

    void updateKsPlayLogParam(com.kwad.components.offline.api.core.video.mdoel.KsPlayerLogParams r1);
}
