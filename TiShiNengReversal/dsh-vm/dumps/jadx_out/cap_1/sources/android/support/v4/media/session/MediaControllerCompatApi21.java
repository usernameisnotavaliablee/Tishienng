package android.support.v4.media.session;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class MediaControllerCompatApi21 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Callback {
        void onAudioInfoChanged(int r1, int r2, int r3, int r4, int r5);

        void onExtrasChanged(android.os.Bundle r1);

        void onMetadataChanged(java.lang.Object r1);

        void onPlaybackStateChanged(java.lang.Object r1);

        void onQueueChanged(java.util.List<?> r1);

        void onQueueTitleChanged(java.lang.CharSequence r1);

        void onSessionDestroyed();

        void onSessionEvent(java.lang.String r1, android.os.Bundle r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class CallbackProxy<T extends android.support.v4.media.session.MediaControllerCompatApi21.Callback> extends android.media.session.MediaController.Callback {
        protected final T mCallback;

        public CallbackProxy(T r1) {
                r0 = this;
                r0.<init>()
                r0.mCallback = r1
                return
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(android.media.session.MediaController.PlaybackInfo r7) {
                r6 = this;
                T extends android.support.v4.media.session.MediaControllerCompatApi21$Callback r0 = r6.mCallback
                int r1 = r7.getPlaybackType()
                int r2 = android.support.v4.media.session.MediaControllerCompatApi21.PlaybackInfo.getLegacyAudioStream(r7)
                int r3 = r7.getVolumeControl()
                int r4 = r7.getMaxVolume()
                int r5 = r7.getCurrentVolume()
                r0.onAudioInfoChanged(r1, r2, r3, r4, r5)
                return
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(android.os.Bundle r2) {
                r1 = this;
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r2)
                T extends android.support.v4.media.session.MediaControllerCompatApi21$Callback r0 = r1.mCallback
                r0.onExtrasChanged(r2)
                return
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(android.media.MediaMetadata r2) {
                r1 = this;
                T extends android.support.v4.media.session.MediaControllerCompatApi21$Callback r0 = r1.mCallback
                r0.onMetadataChanged(r2)
                return
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(android.media.session.PlaybackState r2) {
                r1 = this;
                T extends android.support.v4.media.session.MediaControllerCompatApi21$Callback r0 = r1.mCallback
                r0.onPlaybackStateChanged(r2)
                return
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(java.util.List<android.media.session.MediaSession.QueueItem> r2) {
                r1 = this;
                T extends android.support.v4.media.session.MediaControllerCompatApi21$Callback r0 = r1.mCallback
                r0.onQueueChanged(r2)
                return
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(java.lang.CharSequence r2) {
                r1 = this;
                T extends android.support.v4.media.session.MediaControllerCompatApi21$Callback r0 = r1.mCallback
                r0.onQueueTitleChanged(r2)
                return
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
                r1 = this;
                T extends android.support.v4.media.session.MediaControllerCompatApi21$Callback r0 = r1.mCallback
                r0.onSessionDestroyed()
                return
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r3)
                T extends android.support.v4.media.session.MediaControllerCompatApi21$Callback r0 = r1.mCallback
                r0.onSessionEvent(r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class PlaybackInfo {
        private static final int FLAG_SCO = 4;
        private static final int STREAM_BLUETOOTH_SCO = 6;
        private static final int STREAM_SYSTEM_ENFORCED = 7;

        private PlaybackInfo() {
                r0 = this;
                r0.<init>()
                return
        }

        public static android.media.AudioAttributes getAudioAttributes(java.lang.Object r0) {
                android.media.session.MediaController$PlaybackInfo r0 = (android.media.session.MediaController.PlaybackInfo) r0
                android.media.AudioAttributes r0 = r0.getAudioAttributes()
                return r0
        }

        public static int getCurrentVolume(java.lang.Object r0) {
                android.media.session.MediaController$PlaybackInfo r0 = (android.media.session.MediaController.PlaybackInfo) r0
                int r0 = r0.getCurrentVolume()
                return r0
        }

        public static int getLegacyAudioStream(java.lang.Object r0) {
                android.media.AudioAttributes r0 = getAudioAttributes(r0)
                int r0 = toLegacyStreamType(r0)
                return r0
        }

        public static int getMaxVolume(java.lang.Object r0) {
                android.media.session.MediaController$PlaybackInfo r0 = (android.media.session.MediaController.PlaybackInfo) r0
                int r0 = r0.getMaxVolume()
                return r0
        }

        public static int getPlaybackType(java.lang.Object r0) {
                android.media.session.MediaController$PlaybackInfo r0 = (android.media.session.MediaController.PlaybackInfo) r0
                int r0 = r0.getPlaybackType()
                return r0
        }

        public static int getVolumeControl(java.lang.Object r0) {
                android.media.session.MediaController$PlaybackInfo r0 = (android.media.session.MediaController.PlaybackInfo) r0
                int r0 = r0.getVolumeControl()
                return r0
        }

        private static int toLegacyStreamType(android.media.AudioAttributes r3) {
                int r0 = r3.getFlags()
                r1 = 1
                r0 = r0 & r1
                if (r0 != r1) goto La
                r3 = 7
                return r3
            La:
                int r0 = r3.getFlags()
                r2 = 4
                r0 = r0 & r2
                if (r0 != r2) goto L14
                r3 = 6
                return r3
            L14:
                int r3 = r3.getUsage()
                r0 = 13
                if (r3 == r0) goto L2b
                switch(r3) {
                    case 2: goto L29;
                    case 3: goto L26;
                    case 4: goto L25;
                    case 5: goto L23;
                    case 6: goto L21;
                    case 7: goto L23;
                    case 8: goto L23;
                    case 9: goto L23;
                    case 10: goto L23;
                    default: goto L1f;
                }
            L1f:
                r3 = 3
                return r3
            L21:
                r3 = 2
                return r3
            L23:
                r3 = 5
                return r3
            L25:
                return r2
            L26:
                r3 = 8
                return r3
            L29:
                r3 = 0
                return r3
            L2b:
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class TransportControls {
        private TransportControls() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void fastForward(java.lang.Object r0) {
                android.media.session.MediaController$TransportControls r0 = (android.media.session.MediaController.TransportControls) r0
                r0.fastForward()
                return
        }

        public static void pause(java.lang.Object r0) {
                android.media.session.MediaController$TransportControls r0 = (android.media.session.MediaController.TransportControls) r0
                r0.pause()
                return
        }

        public static void play(java.lang.Object r0) {
                android.media.session.MediaController$TransportControls r0 = (android.media.session.MediaController.TransportControls) r0
                r0.play()
                return
        }

        public static void playFromMediaId(java.lang.Object r0, java.lang.String r1, android.os.Bundle r2) {
                android.media.session.MediaController$TransportControls r0 = (android.media.session.MediaController.TransportControls) r0
                r0.playFromMediaId(r1, r2)
                return
        }

        public static void playFromSearch(java.lang.Object r0, java.lang.String r1, android.os.Bundle r2) {
                android.media.session.MediaController$TransportControls r0 = (android.media.session.MediaController.TransportControls) r0
                r0.playFromSearch(r1, r2)
                return
        }

        public static void rewind(java.lang.Object r0) {
                android.media.session.MediaController$TransportControls r0 = (android.media.session.MediaController.TransportControls) r0
                r0.rewind()
                return
        }

        public static void seekTo(java.lang.Object r0, long r1) {
                android.media.session.MediaController$TransportControls r0 = (android.media.session.MediaController.TransportControls) r0
                r0.seekTo(r1)
                return
        }

        public static void sendCustomAction(java.lang.Object r0, java.lang.String r1, android.os.Bundle r2) {
                android.media.session.MediaController$TransportControls r0 = (android.media.session.MediaController.TransportControls) r0
                r0.sendCustomAction(r1, r2)
                return
        }

        public static void setRating(java.lang.Object r0, java.lang.Object r1) {
                android.media.session.MediaController$TransportControls r0 = (android.media.session.MediaController.TransportControls) r0
                android.media.Rating r1 = (android.media.Rating) r1
                r0.setRating(r1)
                return
        }

        public static void skipToNext(java.lang.Object r0) {
                android.media.session.MediaController$TransportControls r0 = (android.media.session.MediaController.TransportControls) r0
                r0.skipToNext()
                return
        }

        public static void skipToPrevious(java.lang.Object r0) {
                android.media.session.MediaController$TransportControls r0 = (android.media.session.MediaController.TransportControls) r0
                r0.skipToPrevious()
                return
        }

        public static void skipToQueueItem(java.lang.Object r0, long r1) {
                android.media.session.MediaController$TransportControls r0 = (android.media.session.MediaController.TransportControls) r0
                r0.skipToQueueItem(r1)
                return
        }

        public static void stop(java.lang.Object r0) {
                android.media.session.MediaController$TransportControls r0 = (android.media.session.MediaController.TransportControls) r0
                r0.stop()
                return
        }
    }

    private MediaControllerCompatApi21() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void adjustVolume(java.lang.Object r0, int r1, int r2) {
            android.media.session.MediaController r0 = (android.media.session.MediaController) r0
            r0.adjustVolume(r1, r2)
            return
    }

    public static java.lang.Object createCallback(android.support.v4.media.session.MediaControllerCompatApi21.Callback r1) {
            android.support.v4.media.session.MediaControllerCompatApi21$CallbackProxy r0 = new android.support.v4.media.session.MediaControllerCompatApi21$CallbackProxy
            r0.<init>(r1)
            return r0
    }

    public static boolean dispatchMediaButtonEvent(java.lang.Object r0, android.view.KeyEvent r1) {
            android.media.session.MediaController r0 = (android.media.session.MediaController) r0
            boolean r0 = r0.dispatchMediaButtonEvent(r1)
            return r0
    }

    public static java.lang.Object fromToken(android.content.Context r1, java.lang.Object r2) {
            android.media.session.MediaController r0 = new android.media.session.MediaController
            android.media.session.MediaSession$Token r2 = (android.media.session.MediaSession.Token) r2
            r0.<init>(r1, r2)
            return r0
    }

    public static android.os.Bundle getExtras(java.lang.Object r0) {
            android.media.session.MediaController r0 = (android.media.session.MediaController) r0
            android.os.Bundle r0 = r0.getExtras()
            return r0
    }

    public static long getFlags(java.lang.Object r2) {
            android.media.session.MediaController r2 = (android.media.session.MediaController) r2
            long r0 = r2.getFlags()
            return r0
    }

    public static java.lang.Object getMediaController(android.app.Activity r0) {
            android.media.session.MediaController r0 = r0.getMediaController()
            return r0
    }

    public static java.lang.Object getMetadata(java.lang.Object r0) {
            android.media.session.MediaController r0 = (android.media.session.MediaController) r0
            android.media.MediaMetadata r0 = r0.getMetadata()
            return r0
    }

    public static java.lang.String getPackageName(java.lang.Object r0) {
            android.media.session.MediaController r0 = (android.media.session.MediaController) r0
            java.lang.String r0 = r0.getPackageName()
            return r0
    }

    public static java.lang.Object getPlaybackInfo(java.lang.Object r0) {
            android.media.session.MediaController r0 = (android.media.session.MediaController) r0
            android.media.session.MediaController$PlaybackInfo r0 = r0.getPlaybackInfo()
            return r0
    }

    public static java.lang.Object getPlaybackState(java.lang.Object r0) {
            android.media.session.MediaController r0 = (android.media.session.MediaController) r0
            android.media.session.PlaybackState r0 = r0.getPlaybackState()
            return r0
    }

    public static java.util.List<java.lang.Object> getQueue(java.lang.Object r1) {
            android.media.session.MediaController r1 = (android.media.session.MediaController) r1
            java.util.List r1 = r1.getQueue()
            if (r1 != 0) goto La
            r1 = 0
            return r1
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            return r0
    }

    public static java.lang.CharSequence getQueueTitle(java.lang.Object r0) {
            android.media.session.MediaController r0 = (android.media.session.MediaController) r0
            java.lang.CharSequence r0 = r0.getQueueTitle()
            return r0
    }

    public static int getRatingType(java.lang.Object r0) {
            android.media.session.MediaController r0 = (android.media.session.MediaController) r0
            int r0 = r0.getRatingType()
            return r0
    }

    public static android.app.PendingIntent getSessionActivity(java.lang.Object r0) {
            android.media.session.MediaController r0 = (android.media.session.MediaController) r0
            android.app.PendingIntent r0 = r0.getSessionActivity()
            return r0
    }

    public static java.lang.Object getSessionToken(java.lang.Object r0) {
            android.media.session.MediaController r0 = (android.media.session.MediaController) r0
            android.media.session.MediaSession$Token r0 = r0.getSessionToken()
            return r0
    }

    public static java.lang.Object getTransportControls(java.lang.Object r0) {
            android.media.session.MediaController r0 = (android.media.session.MediaController) r0
            android.media.session.MediaController$TransportControls r0 = r0.getTransportControls()
            return r0
    }

    public static void registerCallback(java.lang.Object r0, java.lang.Object r1, android.os.Handler r2) {
            android.media.session.MediaController r0 = (android.media.session.MediaController) r0
            android.media.session.MediaController$Callback r1 = (android.media.session.MediaController.Callback) r1
            r0.registerCallback(r1, r2)
            return
    }

    public static void sendCommand(java.lang.Object r0, java.lang.String r1, android.os.Bundle r2, android.os.ResultReceiver r3) {
            android.media.session.MediaController r0 = (android.media.session.MediaController) r0
            r0.sendCommand(r1, r2, r3)
            return
    }

    public static void setMediaController(android.app.Activity r0, java.lang.Object r1) {
            android.media.session.MediaController r1 = (android.media.session.MediaController) r1
            r0.setMediaController(r1)
            return
    }

    public static void setVolumeTo(java.lang.Object r0, int r1, int r2) {
            android.media.session.MediaController r0 = (android.media.session.MediaController) r0
            r0.setVolumeTo(r1, r2)
            return
    }

    public static void unregisterCallback(java.lang.Object r0, java.lang.Object r1) {
            android.media.session.MediaController r0 = (android.media.session.MediaController) r0
            android.media.session.MediaController$Callback r1 = (android.media.session.MediaController.Callback) r1
            r0.unregisterCallback(r1)
            return
    }
}
