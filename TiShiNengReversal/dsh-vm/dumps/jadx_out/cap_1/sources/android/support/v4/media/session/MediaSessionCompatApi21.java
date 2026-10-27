package android.support.v4.media.session;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class MediaSessionCompatApi21 {
    static final java.lang.String TAG = "MediaSessionCompatApi21";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface Callback {
        void onCommand(java.lang.String r1, android.os.Bundle r2, android.os.ResultReceiver r3);

        void onCustomAction(java.lang.String r1, android.os.Bundle r2);

        void onFastForward();

        boolean onMediaButtonEvent(android.content.Intent r1);

        void onPause();

        void onPlay();

        void onPlayFromMediaId(java.lang.String r1, android.os.Bundle r2);

        void onPlayFromSearch(java.lang.String r1, android.os.Bundle r2);

        void onRewind();

        void onSeekTo(long r1);

        void onSetRating(java.lang.Object r1);

        void onSetRating(java.lang.Object r1, android.os.Bundle r2);

        void onSkipToNext();

        void onSkipToPrevious();

        void onSkipToQueueItem(long r1);

        void onStop();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class CallbackProxy<T extends android.support.v4.media.session.MediaSessionCompatApi21.Callback> extends android.media.session.MediaSession.Callback {
        protected final T mCallback;

        public CallbackProxy(T r1) {
                r0 = this;
                r0.<init>()
                r0.mCallback = r1
                return
        }

        @Override // android.media.session.MediaSession.Callback
        public void onCommand(java.lang.String r2, android.os.Bundle r3, android.os.ResultReceiver r4) {
                r1 = this;
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r3)
                T extends android.support.v4.media.session.MediaSessionCompatApi21$Callback r0 = r1.mCallback
                r0.onCommand(r2, r3, r4)
                return
        }

        @Override // android.media.session.MediaSession.Callback
        public void onCustomAction(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r3)
                T extends android.support.v4.media.session.MediaSessionCompatApi21$Callback r0 = r1.mCallback
                r0.onCustomAction(r2, r3)
                return
        }

        @Override // android.media.session.MediaSession.Callback
        public void onFastForward() {
                r1 = this;
                T extends android.support.v4.media.session.MediaSessionCompatApi21$Callback r0 = r1.mCallback
                r0.onFastForward()
                return
        }

        @Override // android.media.session.MediaSession.Callback
        public boolean onMediaButtonEvent(android.content.Intent r2) {
                r1 = this;
                T extends android.support.v4.media.session.MediaSessionCompatApi21$Callback r0 = r1.mCallback
                boolean r0 = r0.onMediaButtonEvent(r2)
                if (r0 != 0) goto L11
                boolean r2 = super.onMediaButtonEvent(r2)
                if (r2 == 0) goto Lf
                goto L11
            Lf:
                r2 = 0
                return r2
            L11:
                r2 = 1
                return r2
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPause() {
                r1 = this;
                T extends android.support.v4.media.session.MediaSessionCompatApi21$Callback r0 = r1.mCallback
                r0.onPause()
                return
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlay() {
                r1 = this;
                T extends android.support.v4.media.session.MediaSessionCompatApi21$Callback r0 = r1.mCallback
                r0.onPlay()
                return
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlayFromMediaId(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r3)
                T extends android.support.v4.media.session.MediaSessionCompatApi21$Callback r0 = r1.mCallback
                r0.onPlayFromMediaId(r2, r3)
                return
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlayFromSearch(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r3)
                T extends android.support.v4.media.session.MediaSessionCompatApi21$Callback r0 = r1.mCallback
                r0.onPlayFromSearch(r2, r3)
                return
        }

        @Override // android.media.session.MediaSession.Callback
        public void onRewind() {
                r1 = this;
                T extends android.support.v4.media.session.MediaSessionCompatApi21$Callback r0 = r1.mCallback
                r0.onRewind()
                return
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSeekTo(long r2) {
                r1 = this;
                T extends android.support.v4.media.session.MediaSessionCompatApi21$Callback r0 = r1.mCallback
                r0.onSeekTo(r2)
                return
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSetRating(android.media.Rating r2) {
                r1 = this;
                T extends android.support.v4.media.session.MediaSessionCompatApi21$Callback r0 = r1.mCallback
                r0.onSetRating(r2)
                return
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSkipToNext() {
                r1 = this;
                T extends android.support.v4.media.session.MediaSessionCompatApi21$Callback r0 = r1.mCallback
                r0.onSkipToNext()
                return
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSkipToPrevious() {
                r1 = this;
                T extends android.support.v4.media.session.MediaSessionCompatApi21$Callback r0 = r1.mCallback
                r0.onSkipToPrevious()
                return
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSkipToQueueItem(long r2) {
                r1 = this;
                T extends android.support.v4.media.session.MediaSessionCompatApi21$Callback r0 = r1.mCallback
                r0.onSkipToQueueItem(r2)
                return
        }

        @Override // android.media.session.MediaSession.Callback
        public void onStop() {
                r1 = this;
                T extends android.support.v4.media.session.MediaSessionCompatApi21$Callback r0 = r1.mCallback
                r0.onStop()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class QueueItem {
        private QueueItem() {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.lang.Object createItem(java.lang.Object r1, long r2) {
                android.media.session.MediaSession$QueueItem r0 = new android.media.session.MediaSession$QueueItem
                android.media.MediaDescription r1 = (android.media.MediaDescription) r1
                r0.<init>(r1, r2)
                return r0
        }

        public static java.lang.Object getDescription(java.lang.Object r0) {
                android.media.session.MediaSession$QueueItem r0 = (android.media.session.MediaSession.QueueItem) r0
                android.media.MediaDescription r0 = r0.getDescription()
                return r0
        }

        public static long getQueueId(java.lang.Object r2) {
                android.media.session.MediaSession$QueueItem r2 = (android.media.session.MediaSession.QueueItem) r2
                long r0 = r2.getQueueId()
                return r0
        }
    }

    private MediaSessionCompatApi21() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Object createCallback(android.support.v4.media.session.MediaSessionCompatApi21.Callback r1) {
            android.support.v4.media.session.MediaSessionCompatApi21$CallbackProxy r0 = new android.support.v4.media.session.MediaSessionCompatApi21$CallbackProxy
            r0.<init>(r1)
            return r0
    }

    public static java.lang.Object createSession(android.content.Context r1, java.lang.String r2) {
            android.media.session.MediaSession r0 = new android.media.session.MediaSession
            r0.<init>(r1, r2)
            return r0
    }

    public static android.os.Parcelable getSessionToken(java.lang.Object r0) {
            android.media.session.MediaSession r0 = (android.media.session.MediaSession) r0
            android.media.session.MediaSession$Token r0 = r0.getSessionToken()
            return r0
    }

    public static boolean hasCallback(java.lang.Object r3) {
            r0 = 0
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = "mCallback"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L18
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L18
            return r2
        L18:
            return r0
    }

    public static boolean isActive(java.lang.Object r0) {
            android.media.session.MediaSession r0 = (android.media.session.MediaSession) r0
            boolean r0 = r0.isActive()
            return r0
    }

    public static void release(java.lang.Object r0) {
            android.media.session.MediaSession r0 = (android.media.session.MediaSession) r0
            r0.release()
            return
    }

    public static void sendSessionEvent(java.lang.Object r0, java.lang.String r1, android.os.Bundle r2) {
            android.media.session.MediaSession r0 = (android.media.session.MediaSession) r0
            r0.sendSessionEvent(r1, r2)
            return
    }

    public static void setActive(java.lang.Object r0, boolean r1) {
            android.media.session.MediaSession r0 = (android.media.session.MediaSession) r0
            r0.setActive(r1)
            return
    }

    public static void setCallback(java.lang.Object r0, java.lang.Object r1, android.os.Handler r2) {
            android.media.session.MediaSession r0 = (android.media.session.MediaSession) r0
            android.media.session.MediaSession$Callback r1 = (android.media.session.MediaSession.Callback) r1
            r0.setCallback(r1, r2)
            return
    }

    public static void setExtras(java.lang.Object r0, android.os.Bundle r1) {
            android.media.session.MediaSession r0 = (android.media.session.MediaSession) r0
            r0.setExtras(r1)
            return
    }

    public static void setFlags(java.lang.Object r0, int r1) {
            android.media.session.MediaSession r0 = (android.media.session.MediaSession) r0
            r0.setFlags(r1)
            return
    }

    public static void setMediaButtonReceiver(java.lang.Object r0, android.app.PendingIntent r1) {
            android.media.session.MediaSession r0 = (android.media.session.MediaSession) r0
            r0.setMediaButtonReceiver(r1)
            return
    }

    public static void setMetadata(java.lang.Object r0, java.lang.Object r1) {
            android.media.session.MediaSession r0 = (android.media.session.MediaSession) r0
            android.media.MediaMetadata r1 = (android.media.MediaMetadata) r1
            r0.setMetadata(r1)
            return
    }

    public static void setPlaybackState(java.lang.Object r0, java.lang.Object r1) {
            android.media.session.MediaSession r0 = (android.media.session.MediaSession) r0
            android.media.session.PlaybackState r1 = (android.media.session.PlaybackState) r1
            r0.setPlaybackState(r1)
            return
    }

    public static void setPlaybackToLocal(java.lang.Object r1, int r2) {
            android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder
            r0.<init>()
            r0.setLegacyStreamType(r2)
            android.media.session.MediaSession r1 = (android.media.session.MediaSession) r1
            android.media.AudioAttributes r2 = r0.build()
            r1.setPlaybackToLocal(r2)
            return
    }

    public static void setPlaybackToRemote(java.lang.Object r0, java.lang.Object r1) {
            android.media.session.MediaSession r0 = (android.media.session.MediaSession) r0
            android.media.VolumeProvider r1 = (android.media.VolumeProvider) r1
            r0.setPlaybackToRemote(r1)
            return
    }

    public static void setQueue(java.lang.Object r2, java.util.List<java.lang.Object> r3) {
            if (r3 != 0) goto L9
            android.media.session.MediaSession r2 = (android.media.session.MediaSession) r2
            r3 = 0
            r2.setQueue(r3)
            return
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r3.next()
            android.media.session.MediaSession$QueueItem r1 = (android.media.session.MediaSession.QueueItem) r1
            r0.add(r1)
            goto L12
        L22:
            android.media.session.MediaSession r2 = (android.media.session.MediaSession) r2
            r2.setQueue(r0)
            return
    }

    public static void setQueueTitle(java.lang.Object r0, java.lang.CharSequence r1) {
            android.media.session.MediaSession r0 = (android.media.session.MediaSession) r0
            r0.setQueueTitle(r1)
            return
    }

    public static void setSessionActivity(java.lang.Object r0, android.app.PendingIntent r1) {
            android.media.session.MediaSession r0 = (android.media.session.MediaSession) r0
            r0.setSessionActivity(r1)
            return
    }

    public static java.lang.Object verifySession(java.lang.Object r1) {
            boolean r0 = r1 instanceof android.media.session.MediaSession
            if (r0 == 0) goto L5
            return r1
        L5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "mediaSession is not a valid MediaSession object"
            r1.<init>(r0)
            throw r1
    }

    public static java.lang.Object verifyToken(java.lang.Object r1) {
            boolean r0 = r1 instanceof android.media.session.MediaSession.Token
            if (r0 == 0) goto L5
            return r1
        L5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "token is not a valid MediaSession.Token object"
            r1.<init>(r0)
            throw r1
    }
}
