package android.support.v4.media.session;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MediaControllerCompat {

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String COMMAND_ADD_QUEUE_ITEM = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String COMMAND_ADD_QUEUE_ITEM_AT = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String COMMAND_ARGUMENT_INDEX = "android.support.v4.media.session.command.ARGUMENT_INDEX";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String COMMAND_ARGUMENT_MEDIA_DESCRIPTION = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String COMMAND_GET_EXTRA_BINDER = "android.support.v4.media.session.command.GET_EXTRA_BINDER";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String COMMAND_REMOVE_QUEUE_ITEM = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String COMMAND_REMOVE_QUEUE_ITEM_AT = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";
    static final java.lang.String TAG = "MediaControllerCompat";
    private final android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl mImpl;
    private final java.util.HashSet<android.support.v4.media.session.MediaControllerCompat.Callback> mRegisteredCallbacks;
    private final android.support.v4.media.session.MediaSessionCompat.Token mToken;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Callback implements android.os.IBinder.DeathRecipient {
        final java.lang.Object mCallbackObj;
        android.support.v4.media.session.MediaControllerCompat.Callback.MessageHandler mHandler;
        android.support.v4.media.session.IMediaControllerCallback mIControllerCallback;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private class MessageHandler extends android.os.Handler {
            private static final int MSG_DESTROYED = 8;
            private static final int MSG_EVENT = 1;
            private static final int MSG_SESSION_READY = 13;
            private static final int MSG_UPDATE_CAPTIONING_ENABLED = 11;
            private static final int MSG_UPDATE_EXTRAS = 7;
            private static final int MSG_UPDATE_METADATA = 3;
            private static final int MSG_UPDATE_PLAYBACK_STATE = 2;
            private static final int MSG_UPDATE_QUEUE = 5;
            private static final int MSG_UPDATE_QUEUE_TITLE = 6;
            private static final int MSG_UPDATE_REPEAT_MODE = 9;
            private static final int MSG_UPDATE_SHUFFLE_MODE = 12;
            private static final int MSG_UPDATE_VOLUME = 4;
            boolean mRegistered;
            final /* synthetic */ android.support.v4.media.session.MediaControllerCompat.Callback this$0;

            MessageHandler(android.support.v4.media.session.MediaControllerCompat.Callback r1, android.os.Looper r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>(r2)
                    r1 = 0
                    r0.mRegistered = r1
                    return
            }

            @Override // android.os.Handler
            public void handleMessage(android.os.Message r3) {
                    r2 = this;
                    boolean r0 = r2.mRegistered
                    if (r0 != 0) goto L5
                    goto La
                L5:
                    int r0 = r3.what
                    switch(r0) {
                        case 1: goto L80;
                        case 2: goto L76;
                        case 3: goto L6c;
                        case 4: goto L62;
                        case 5: goto L58;
                        case 6: goto L4e;
                        case 7: goto L41;
                        case 8: goto L3b;
                        case 9: goto L2d;
                        case 10: goto La;
                        case 11: goto L1f;
                        case 12: goto L11;
                        case 13: goto Lb;
                        default: goto La;
                    }
                La:
                    return
                Lb:
                    android.support.v4.media.session.MediaControllerCompat$Callback r3 = r2.this$0
                    r3.onSessionReady()
                    return
                L11:
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = r2.this$0
                    java.lang.Object r3 = r3.obj
                    java.lang.Integer r3 = (java.lang.Integer) r3
                    int r3 = r3.intValue()
                    r0.onShuffleModeChanged(r3)
                    return
                L1f:
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = r2.this$0
                    java.lang.Object r3 = r3.obj
                    java.lang.Boolean r3 = (java.lang.Boolean) r3
                    boolean r3 = r3.booleanValue()
                    r0.onCaptioningEnabledChanged(r3)
                    return
                L2d:
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = r2.this$0
                    java.lang.Object r3 = r3.obj
                    java.lang.Integer r3 = (java.lang.Integer) r3
                    int r3 = r3.intValue()
                    r0.onRepeatModeChanged(r3)
                    return
                L3b:
                    android.support.v4.media.session.MediaControllerCompat$Callback r3 = r2.this$0
                    r3.onSessionDestroyed()
                    return
                L41:
                    java.lang.Object r3 = r3.obj
                    android.os.Bundle r3 = (android.os.Bundle) r3
                    android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r3)
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = r2.this$0
                    r0.onExtrasChanged(r3)
                    return
                L4e:
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = r2.this$0
                    java.lang.Object r3 = r3.obj
                    java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                    r0.onQueueTitleChanged(r3)
                    return
                L58:
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = r2.this$0
                    java.lang.Object r3 = r3.obj
                    java.util.List r3 = (java.util.List) r3
                    r0.onQueueChanged(r3)
                    return
                L62:
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = r2.this$0
                    java.lang.Object r3 = r3.obj
                    android.support.v4.media.session.MediaControllerCompat$PlaybackInfo r3 = (android.support.v4.media.session.MediaControllerCompat.PlaybackInfo) r3
                    r0.onAudioInfoChanged(r3)
                    return
                L6c:
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = r2.this$0
                    java.lang.Object r3 = r3.obj
                    android.support.v4.media.MediaMetadataCompat r3 = (android.support.v4.media.MediaMetadataCompat) r3
                    r0.onMetadataChanged(r3)
                    return
                L76:
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = r2.this$0
                    java.lang.Object r3 = r3.obj
                    android.support.v4.media.session.PlaybackStateCompat r3 = (android.support.v4.media.session.PlaybackStateCompat) r3
                    r0.onPlaybackStateChanged(r3)
                    return
                L80:
                    android.os.Bundle r0 = r3.getData()
                    android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r0)
                    android.support.v4.media.session.MediaControllerCompat$Callback r1 = r2.this$0
                    java.lang.Object r3 = r3.obj
                    java.lang.String r3 = (java.lang.String) r3
                    r1.onSessionEvent(r3, r0)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class StubApi21 implements android.support.v4.media.session.MediaControllerCompatApi21.Callback {
            private final java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat.Callback> mCallback;

            StubApi21(android.support.v4.media.session.MediaControllerCompat.Callback r2) {
                    r1 = this;
                    r1.<init>()
                    java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                    r0.<init>(r2)
                    r1.mCallback = r0
                    return
            }

            @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
            public void onAudioInfoChanged(int r8, int r9, int r10, int r11, int r12) {
                    r7 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$Callback> r0 = r7.mCallback
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = (android.support.v4.media.session.MediaControllerCompat.Callback) r0
                    if (r0 == 0) goto L17
                    android.support.v4.media.session.MediaControllerCompat$PlaybackInfo r1 = new android.support.v4.media.session.MediaControllerCompat$PlaybackInfo
                    r2 = r8
                    r3 = r9
                    r4 = r10
                    r5 = r11
                    r6 = r12
                    r1.<init>(r2, r3, r4, r5, r6)
                    r0.onAudioInfoChanged(r1)
                L17:
                    return
            }

            @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
            public void onExtrasChanged(android.os.Bundle r2) {
                    r1 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$Callback> r0 = r1.mCallback
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = (android.support.v4.media.session.MediaControllerCompat.Callback) r0
                    if (r0 == 0) goto Ld
                    r0.onExtrasChanged(r2)
                Ld:
                    return
            }

            @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
            public void onMetadataChanged(java.lang.Object r2) {
                    r1 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$Callback> r0 = r1.mCallback
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = (android.support.v4.media.session.MediaControllerCompat.Callback) r0
                    if (r0 == 0) goto L11
                    android.support.v4.media.MediaMetadataCompat r2 = android.support.v4.media.MediaMetadataCompat.fromMediaMetadata(r2)
                    r0.onMetadataChanged(r2)
                L11:
                    return
            }

            @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
            public void onPlaybackStateChanged(java.lang.Object r3) {
                    r2 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$Callback> r0 = r2.mCallback
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = (android.support.v4.media.session.MediaControllerCompat.Callback) r0
                    if (r0 == 0) goto L16
                    android.support.v4.media.session.IMediaControllerCallback r1 = r0.mIControllerCallback
                    if (r1 == 0) goto Lf
                    goto L16
                Lf:
                    android.support.v4.media.session.PlaybackStateCompat r3 = android.support.v4.media.session.PlaybackStateCompat.fromPlaybackState(r3)
                    r0.onPlaybackStateChanged(r3)
                L16:
                    return
            }

            @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
            public void onQueueChanged(java.util.List<?> r2) {
                    r1 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$Callback> r0 = r1.mCallback
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = (android.support.v4.media.session.MediaControllerCompat.Callback) r0
                    if (r0 == 0) goto L11
                    java.util.List r2 = android.support.v4.media.session.MediaSessionCompat.QueueItem.fromQueueItemList(r2)
                    r0.onQueueChanged(r2)
                L11:
                    return
            }

            @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
            public void onQueueTitleChanged(java.lang.CharSequence r2) {
                    r1 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$Callback> r0 = r1.mCallback
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = (android.support.v4.media.session.MediaControllerCompat.Callback) r0
                    if (r0 == 0) goto Ld
                    r0.onQueueTitleChanged(r2)
                Ld:
                    return
            }

            @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
            public void onSessionDestroyed() {
                    r1 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$Callback> r0 = r1.mCallback
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = (android.support.v4.media.session.MediaControllerCompat.Callback) r0
                    if (r0 == 0) goto Ld
                    r0.onSessionDestroyed()
                Ld:
                    return
            }

            @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
            public void onSessionEvent(java.lang.String r4, android.os.Bundle r5) {
                    r3 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$Callback> r0 = r3.mCallback
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = (android.support.v4.media.session.MediaControllerCompat.Callback) r0
                    if (r0 == 0) goto L18
                    android.support.v4.media.session.IMediaControllerCallback r1 = r0.mIControllerCallback
                    if (r1 == 0) goto L15
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 23
                    if (r1 >= r2) goto L15
                    goto L18
                L15:
                    r0.onSessionEvent(r4, r5)
                L18:
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class StubCompat extends android.support.v4.media.session.IMediaControllerCallback.Stub {
            private final java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat.Callback> mCallback;

            StubCompat(android.support.v4.media.session.MediaControllerCompat.Callback r2) {
                    r1 = this;
                    r1.<init>()
                    java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                    r0.<init>(r2)
                    r1.mCallback = r0
                    return
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onCaptioningEnabledChanged(boolean r4) throws android.os.RemoteException {
                    r3 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$Callback> r0 = r3.mCallback
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = (android.support.v4.media.session.MediaControllerCompat.Callback) r0
                    if (r0 == 0) goto L14
                    java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                    r1 = 0
                    r2 = 11
                    r0.postToHandler(r2, r4, r1)
                L14:
                    return
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onEvent(java.lang.String r3, android.os.Bundle r4) throws android.os.RemoteException {
                    r2 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$Callback> r0 = r2.mCallback
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = (android.support.v4.media.session.MediaControllerCompat.Callback) r0
                    if (r0 == 0) goto Le
                    r1 = 1
                    r0.postToHandler(r1, r3, r4)
                Le:
                    return
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onExtrasChanged(android.os.Bundle r4) throws android.os.RemoteException {
                    r3 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$Callback> r0 = r3.mCallback
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = (android.support.v4.media.session.MediaControllerCompat.Callback) r0
                    if (r0 == 0) goto Lf
                    r1 = 7
                    r2 = 0
                    r0.postToHandler(r1, r4, r2)
                Lf:
                    return
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onMetadataChanged(android.support.v4.media.MediaMetadataCompat r4) throws android.os.RemoteException {
                    r3 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$Callback> r0 = r3.mCallback
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = (android.support.v4.media.session.MediaControllerCompat.Callback) r0
                    if (r0 == 0) goto Lf
                    r1 = 3
                    r2 = 0
                    r0.postToHandler(r1, r4, r2)
                Lf:
                    return
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onPlaybackStateChanged(android.support.v4.media.session.PlaybackStateCompat r4) throws android.os.RemoteException {
                    r3 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$Callback> r0 = r3.mCallback
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = (android.support.v4.media.session.MediaControllerCompat.Callback) r0
                    if (r0 == 0) goto Lf
                    r1 = 2
                    r2 = 0
                    r0.postToHandler(r1, r4, r2)
                Lf:
                    return
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onQueueChanged(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> r4) throws android.os.RemoteException {
                    r3 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$Callback> r0 = r3.mCallback
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = (android.support.v4.media.session.MediaControllerCompat.Callback) r0
                    if (r0 == 0) goto Lf
                    r1 = 5
                    r2 = 0
                    r0.postToHandler(r1, r4, r2)
                Lf:
                    return
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onQueueTitleChanged(java.lang.CharSequence r4) throws android.os.RemoteException {
                    r3 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$Callback> r0 = r3.mCallback
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = (android.support.v4.media.session.MediaControllerCompat.Callback) r0
                    if (r0 == 0) goto Lf
                    r1 = 6
                    r2 = 0
                    r0.postToHandler(r1, r4, r2)
                Lf:
                    return
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onRepeatModeChanged(int r4) throws android.os.RemoteException {
                    r3 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$Callback> r0 = r3.mCallback
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = (android.support.v4.media.session.MediaControllerCompat.Callback) r0
                    if (r0 == 0) goto L14
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    r1 = 0
                    r2 = 9
                    r0.postToHandler(r2, r4, r1)
                L14:
                    return
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onSessionDestroyed() throws android.os.RemoteException {
                    r3 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$Callback> r0 = r3.mCallback
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = (android.support.v4.media.session.MediaControllerCompat.Callback) r0
                    if (r0 == 0) goto L10
                    r1 = 8
                    r2 = 0
                    r0.postToHandler(r1, r2, r2)
                L10:
                    return
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onSessionReady() throws android.os.RemoteException {
                    r3 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$Callback> r0 = r3.mCallback
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = (android.support.v4.media.session.MediaControllerCompat.Callback) r0
                    if (r0 == 0) goto L10
                    r1 = 13
                    r2 = 0
                    r0.postToHandler(r1, r2, r2)
                L10:
                    return
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onShuffleModeChanged(int r4) throws android.os.RemoteException {
                    r3 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$Callback> r0 = r3.mCallback
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = (android.support.v4.media.session.MediaControllerCompat.Callback) r0
                    if (r0 == 0) goto L14
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    r1 = 0
                    r2 = 12
                    r0.postToHandler(r2, r4, r1)
                L14:
                    return
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onShuffleModeChangedRemoved(boolean r1) throws android.os.RemoteException {
                    r0 = this;
                    return
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onVolumeInfoChanged(android.support.v4.media.session.ParcelableVolumeInfo r9) throws android.os.RemoteException {
                    r8 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$Callback> r0 = r8.mCallback
                    java.lang.Object r0 = r0.get()
                    android.support.v4.media.session.MediaControllerCompat$Callback r0 = (android.support.v4.media.session.MediaControllerCompat.Callback) r0
                    if (r0 == 0) goto L22
                    r1 = 0
                    if (r9 == 0) goto L1d
                    android.support.v4.media.session.MediaControllerCompat$PlaybackInfo r2 = new android.support.v4.media.session.MediaControllerCompat$PlaybackInfo
                    int r3 = r9.volumeType
                    int r4 = r9.audioStream
                    int r5 = r9.controlType
                    int r6 = r9.maxVolume
                    int r7 = r9.currentVolume
                    r2.<init>(r3, r4, r5, r6, r7)
                    goto L1e
                L1d:
                    r2 = r1
                L1e:
                    r9 = 4
                    r0.postToHandler(r9, r2, r1)
                L22:
                    return
            }
        }

        public Callback() {
                r1 = this;
                r1.<init>()
                android.support.v4.media.session.MediaControllerCompat$Callback$StubApi21 r0 = new android.support.v4.media.session.MediaControllerCompat$Callback$StubApi21
                r0.<init>(r1)
                java.lang.Object r0 = android.support.v4.media.session.MediaControllerCompatApi21.createCallback(r0)
                r1.mCallbackObj = r0
                return
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
                r2 = this;
                r0 = 8
                r1 = 0
                r2.postToHandler(r0, r1, r1)
                return
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public android.support.v4.media.session.IMediaControllerCallback getIControllerCallback() {
                r1 = this;
                android.support.v4.media.session.IMediaControllerCallback r0 = r1.mIControllerCallback
                return r0
        }

        public void onAudioInfoChanged(android.support.v4.media.session.MediaControllerCompat.PlaybackInfo r1) {
                r0 = this;
                return
        }

        public void onCaptioningEnabledChanged(boolean r1) {
                r0 = this;
                return
        }

        public void onExtrasChanged(android.os.Bundle r1) {
                r0 = this;
                return
        }

        public void onMetadataChanged(android.support.v4.media.MediaMetadataCompat r1) {
                r0 = this;
                return
        }

        public void onPlaybackStateChanged(android.support.v4.media.session.PlaybackStateCompat r1) {
                r0 = this;
                return
        }

        public void onQueueChanged(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> r1) {
                r0 = this;
                return
        }

        public void onQueueTitleChanged(java.lang.CharSequence r1) {
                r0 = this;
                return
        }

        public void onRepeatModeChanged(int r1) {
                r0 = this;
                return
        }

        public void onSessionDestroyed() {
                r0 = this;
                return
        }

        public void onSessionEvent(java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        public void onSessionReady() {
                r0 = this;
                return
        }

        public void onShuffleModeChanged(int r1) {
                r0 = this;
                return
        }

        void postToHandler(int r2, java.lang.Object r3, android.os.Bundle r4) {
                r1 = this;
                android.support.v4.media.session.MediaControllerCompat$Callback$MessageHandler r0 = r1.mHandler
                if (r0 == 0) goto Le
                android.os.Message r2 = r0.obtainMessage(r2, r3)
                r2.setData(r4)
                r2.sendToTarget()
            Le:
                return
        }

        void setHandler(android.os.Handler r2) {
                r1 = this;
                if (r2 != 0) goto L10
                android.support.v4.media.session.MediaControllerCompat$Callback$MessageHandler r2 = r1.mHandler
                if (r2 == 0) goto Lf
                r0 = 0
                r2.mRegistered = r0
                r0 = 0
                r2.removeCallbacksAndMessages(r0)
                r1.mHandler = r0
            Lf:
                return
            L10:
                android.support.v4.media.session.MediaControllerCompat$Callback$MessageHandler r0 = new android.support.v4.media.session.MediaControllerCompat$Callback$MessageHandler
                android.os.Looper r2 = r2.getLooper()
                r0.<init>(r1, r2)
                r1.mHandler = r0
                r2 = 1
                r0.mRegistered = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class MediaControllerExtraData extends androidx.core.app.ComponentActivity.ExtraData {
        private final android.support.v4.media.session.MediaControllerCompat mMediaController;

        MediaControllerExtraData(android.support.v4.media.session.MediaControllerCompat r1) {
                r0 = this;
                r0.<init>()
                r0.mMediaController = r1
                return
        }

        android.support.v4.media.session.MediaControllerCompat getMediaController() {
                r1 = this;
                android.support.v4.media.session.MediaControllerCompat r0 = r1.mMediaController
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface MediaControllerImpl {
        void addQueueItem(android.support.v4.media.MediaDescriptionCompat r1);

        void addQueueItem(android.support.v4.media.MediaDescriptionCompat r1, int r2);

        void adjustVolume(int r1, int r2);

        boolean dispatchMediaButtonEvent(android.view.KeyEvent r1);

        android.os.Bundle getExtras();

        long getFlags();

        java.lang.Object getMediaController();

        android.support.v4.media.MediaMetadataCompat getMetadata();

        java.lang.String getPackageName();

        android.support.v4.media.session.MediaControllerCompat.PlaybackInfo getPlaybackInfo();

        android.support.v4.media.session.PlaybackStateCompat getPlaybackState();

        java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> getQueue();

        java.lang.CharSequence getQueueTitle();

        int getRatingType();

        int getRepeatMode();

        android.app.PendingIntent getSessionActivity();

        int getShuffleMode();

        android.support.v4.media.session.MediaControllerCompat.TransportControls getTransportControls();

        boolean isCaptioningEnabled();

        boolean isSessionReady();

        void registerCallback(android.support.v4.media.session.MediaControllerCompat.Callback r1, android.os.Handler r2);

        void removeQueueItem(android.support.v4.media.MediaDescriptionCompat r1);

        void sendCommand(java.lang.String r1, android.os.Bundle r2, android.os.ResultReceiver r3);

        void setVolumeTo(int r1, int r2);

        void unregisterCallback(android.support.v4.media.session.MediaControllerCompat.Callback r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static class MediaControllerImplApi21 implements android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl {
        private java.util.HashMap<android.support.v4.media.session.MediaControllerCompat.Callback, android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21.ExtraCallback> mCallbackMap;
        protected final java.lang.Object mControllerObj;
        final java.lang.Object mLock;

        @androidx.annotation.GuardedBy("mLock")
        private final java.util.List<android.support.v4.media.session.MediaControllerCompat.Callback> mPendingCallbacks;
        final android.support.v4.media.session.MediaSessionCompat.Token mSessionToken;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class ExtraBinderRequestResultReceiver extends android.os.ResultReceiver {
            private java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21> mMediaControllerImpl;

            ExtraBinderRequestResultReceiver(android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21 r2) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r0)
                    java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                    r0.<init>(r2)
                    r1.mMediaControllerImpl = r0
                    return
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int r4, android.os.Bundle r5) {
                    r3 = this;
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21> r4 = r3.mMediaControllerImpl
                    java.lang.Object r4 = r4.get()
                    android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 r4 = (android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21) r4
                    if (r4 == 0) goto L32
                    if (r5 != 0) goto Ld
                    goto L32
                Ld:
                    java.lang.Object r0 = r4.mLock
                    monitor-enter(r0)
                    android.support.v4.media.session.MediaSessionCompat$Token r1 = r4.mSessionToken     // Catch: java.lang.Throwable -> L2f
                    java.lang.String r2 = "android.support.v4.media.session.EXTRA_BINDER"
                    android.os.IBinder r2 = androidx.core.app.BundleCompat.getBinder(r5, r2)     // Catch: java.lang.Throwable -> L2f
                    android.support.v4.media.session.IMediaSession r2 = android.support.v4.media.session.IMediaSession.Stub.asInterface(r2)     // Catch: java.lang.Throwable -> L2f
                    r1.setExtraBinder(r2)     // Catch: java.lang.Throwable -> L2f
                    android.support.v4.media.session.MediaSessionCompat$Token r1 = r4.mSessionToken     // Catch: java.lang.Throwable -> L2f
                    java.lang.String r2 = "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"
                    android.os.Bundle r5 = r5.getBundle(r2)     // Catch: java.lang.Throwable -> L2f
                    r1.setSessionToken2Bundle(r5)     // Catch: java.lang.Throwable -> L2f
                    r4.processPendingCallbacksLocked()     // Catch: java.lang.Throwable -> L2f
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
                    return
                L2f:
                    r4 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
                    throw r4
                L32:
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class ExtraCallback extends android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat {
            ExtraCallback(android.support.v4.media.session.MediaControllerCompat.Callback r1) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onExtrasChanged(android.os.Bundle r1) throws android.os.RemoteException {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onMetadataChanged(android.support.v4.media.MediaMetadataCompat r1) throws android.os.RemoteException {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onQueueChanged(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> r1) throws android.os.RemoteException {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onQueueTitleChanged(java.lang.CharSequence r1) throws android.os.RemoteException {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onSessionDestroyed() throws android.os.RemoteException {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onVolumeInfoChanged(android.support.v4.media.session.ParcelableVolumeInfo r1) throws android.os.RemoteException {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }
        }

        public MediaControllerImplApi21(android.content.Context r2, android.support.v4.media.session.MediaSessionCompat.Token r3) throws android.os.RemoteException {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.mLock = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mPendingCallbacks = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mCallbackMap = r0
                r1.mSessionToken = r3
                java.lang.Object r0 = r3.getToken()
                java.lang.Object r2 = android.support.v4.media.session.MediaControllerCompatApi21.fromToken(r2, r0)
                r1.mControllerObj = r2
                if (r2 == 0) goto L30
                android.support.v4.media.session.IMediaSession r2 = r3.getExtraBinder()
                if (r2 != 0) goto L2f
                r1.requestExtraBinder()
            L2f:
                return
            L30:
                android.os.RemoteException r2 = new android.os.RemoteException
                r2.<init>()
                throw r2
        }

        private void requestExtraBinder() {
                r3 = this;
                android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver r0 = new android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
                r0.<init>(r3)
                java.lang.String r1 = "android.support.v4.media.session.command.GET_EXTRA_BINDER"
                r2 = 0
                r3.sendCommand(r1, r2, r0)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void addQueueItem(android.support.v4.media.MediaDescriptionCompat r6) {
                r5 = this;
                long r0 = r5.getFlags()
                r2 = 4
                long r0 = r0 & r2
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L1e
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"
                r0.putParcelable(r1, r6)
                java.lang.String r6 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM"
                r1 = 0
                r5.sendCommand(r6, r0, r1)
                return
            L1e:
                java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "This session doesn't support queue management operations"
                r6.<init>(r0)
                throw r6
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void addQueueItem(android.support.v4.media.MediaDescriptionCompat r6, int r7) {
                r5 = this;
                long r0 = r5.getFlags()
                r2 = 4
                long r0 = r0 & r2
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L23
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"
                r0.putParcelable(r1, r6)
                java.lang.String r6 = "android.support.v4.media.session.command.ARGUMENT_INDEX"
                r0.putInt(r6, r7)
                java.lang.String r6 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"
                r7 = 0
                r5.sendCommand(r6, r0, r7)
                return
            L23:
                java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
                java.lang.String r7 = "This session doesn't support queue management operations"
                r6.<init>(r7)
                throw r6
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void adjustVolume(int r2, int r3) {
                r1 = this;
                java.lang.Object r0 = r1.mControllerObj
                android.support.v4.media.session.MediaControllerCompatApi21.adjustVolume(r0, r2, r3)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public boolean dispatchMediaButtonEvent(android.view.KeyEvent r2) {
                r1 = this;
                java.lang.Object r0 = r1.mControllerObj
                boolean r2 = android.support.v4.media.session.MediaControllerCompatApi21.dispatchMediaButtonEvent(r0, r2)
                return r2
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.os.Bundle getExtras() {
                r1 = this;
                java.lang.Object r0 = r1.mControllerObj
                android.os.Bundle r0 = android.support.v4.media.session.MediaControllerCompatApi21.getExtras(r0)
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public long getFlags() {
                r2 = this;
                java.lang.Object r0 = r2.mControllerObj
                long r0 = android.support.v4.media.session.MediaControllerCompatApi21.getFlags(r0)
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public java.lang.Object getMediaController() {
                r1 = this;
                java.lang.Object r0 = r1.mControllerObj
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.support.v4.media.MediaMetadataCompat getMetadata() {
                r1 = this;
                java.lang.Object r0 = r1.mControllerObj
                java.lang.Object r0 = android.support.v4.media.session.MediaControllerCompatApi21.getMetadata(r0)
                if (r0 == 0) goto Ld
                android.support.v4.media.MediaMetadataCompat r0 = android.support.v4.media.MediaMetadataCompat.fromMediaMetadata(r0)
                return r0
            Ld:
                r0 = 0
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public java.lang.String getPackageName() {
                r1 = this;
                java.lang.Object r0 = r1.mControllerObj
                java.lang.String r0 = android.support.v4.media.session.MediaControllerCompatApi21.getPackageName(r0)
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.support.v4.media.session.MediaControllerCompat.PlaybackInfo getPlaybackInfo() {
                r7 = this;
                java.lang.Object r0 = r7.mControllerObj
                java.lang.Object r0 = android.support.v4.media.session.MediaControllerCompatApi21.getPlaybackInfo(r0)
                if (r0 == 0) goto L22
                android.support.v4.media.session.MediaControllerCompat$PlaybackInfo r1 = new android.support.v4.media.session.MediaControllerCompat$PlaybackInfo
                int r2 = android.support.v4.media.session.MediaControllerCompatApi21.PlaybackInfo.getPlaybackType(r0)
                int r3 = android.support.v4.media.session.MediaControllerCompatApi21.PlaybackInfo.getLegacyAudioStream(r0)
                int r4 = android.support.v4.media.session.MediaControllerCompatApi21.PlaybackInfo.getVolumeControl(r0)
                int r5 = android.support.v4.media.session.MediaControllerCompatApi21.PlaybackInfo.getMaxVolume(r0)
                int r6 = android.support.v4.media.session.MediaControllerCompatApi21.PlaybackInfo.getCurrentVolume(r0)
                r1.<init>(r2, r3, r4, r5, r6)
                return r1
            L22:
                r0 = 0
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.support.v4.media.session.PlaybackStateCompat getPlaybackState() {
                r1 = this;
                android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.mSessionToken
                android.support.v4.media.session.IMediaSession r0 = r0.getExtraBinder()
                if (r0 == 0) goto L14
                android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.mSessionToken     // Catch: android.os.RemoteException -> L13
                android.support.v4.media.session.IMediaSession r0 = r0.getExtraBinder()     // Catch: android.os.RemoteException -> L13
                android.support.v4.media.session.PlaybackStateCompat r0 = r0.getPlaybackState()     // Catch: android.os.RemoteException -> L13
                return r0
            L13:
            L14:
                java.lang.Object r0 = r1.mControllerObj
                java.lang.Object r0 = android.support.v4.media.session.MediaControllerCompatApi21.getPlaybackState(r0)
                if (r0 == 0) goto L21
                android.support.v4.media.session.PlaybackStateCompat r0 = android.support.v4.media.session.PlaybackStateCompat.fromPlaybackState(r0)
                goto L22
            L21:
                r0 = 0
            L22:
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> getQueue() {
                r1 = this;
                java.lang.Object r0 = r1.mControllerObj
                java.util.List r0 = android.support.v4.media.session.MediaControllerCompatApi21.getQueue(r0)
                if (r0 == 0) goto Ld
                java.util.List r0 = android.support.v4.media.session.MediaSessionCompat.QueueItem.fromQueueItemList(r0)
                return r0
            Ld:
                r0 = 0
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public java.lang.CharSequence getQueueTitle() {
                r1 = this;
                java.lang.Object r0 = r1.mControllerObj
                java.lang.CharSequence r0 = android.support.v4.media.session.MediaControllerCompatApi21.getQueueTitle(r0)
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public int getRatingType() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 22
                if (r0 >= r1) goto L19
                android.support.v4.media.session.MediaSessionCompat$Token r0 = r2.mSessionToken
                android.support.v4.media.session.IMediaSession r0 = r0.getExtraBinder()
                if (r0 == 0) goto L19
                android.support.v4.media.session.MediaSessionCompat$Token r0 = r2.mSessionToken     // Catch: android.os.RemoteException -> L19
                android.support.v4.media.session.IMediaSession r0 = r0.getExtraBinder()     // Catch: android.os.RemoteException -> L19
                int r0 = r0.getRatingType()     // Catch: android.os.RemoteException -> L19
                return r0
            L19:
                java.lang.Object r0 = r2.mControllerObj
                int r0 = android.support.v4.media.session.MediaControllerCompatApi21.getRatingType(r0)
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public int getRepeatMode() {
                r1 = this;
                android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.mSessionToken
                android.support.v4.media.session.IMediaSession r0 = r0.getExtraBinder()
                if (r0 == 0) goto L13
                android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.mSessionToken     // Catch: android.os.RemoteException -> L13
                android.support.v4.media.session.IMediaSession r0 = r0.getExtraBinder()     // Catch: android.os.RemoteException -> L13
                int r0 = r0.getRepeatMode()     // Catch: android.os.RemoteException -> L13
                return r0
            L13:
                r0 = -1
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.app.PendingIntent getSessionActivity() {
                r1 = this;
                java.lang.Object r0 = r1.mControllerObj
                android.app.PendingIntent r0 = android.support.v4.media.session.MediaControllerCompatApi21.getSessionActivity(r0)
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public int getShuffleMode() {
                r1 = this;
                android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.mSessionToken
                android.support.v4.media.session.IMediaSession r0 = r0.getExtraBinder()
                if (r0 == 0) goto L13
                android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.mSessionToken     // Catch: android.os.RemoteException -> L13
                android.support.v4.media.session.IMediaSession r0 = r0.getExtraBinder()     // Catch: android.os.RemoteException -> L13
                int r0 = r0.getShuffleMode()     // Catch: android.os.RemoteException -> L13
                return r0
            L13:
                r0 = -1
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.support.v4.media.session.MediaControllerCompat.TransportControls getTransportControls() {
                r2 = this;
                java.lang.Object r0 = r2.mControllerObj
                java.lang.Object r0 = android.support.v4.media.session.MediaControllerCompatApi21.getTransportControls(r0)
                if (r0 == 0) goto Le
                android.support.v4.media.session.MediaControllerCompat$TransportControlsApi21 r1 = new android.support.v4.media.session.MediaControllerCompat$TransportControlsApi21
                r1.<init>(r0)
                return r1
            Le:
                r0 = 0
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public boolean isCaptioningEnabled() {
                r1 = this;
                android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.mSessionToken
                android.support.v4.media.session.IMediaSession r0 = r0.getExtraBinder()
                if (r0 == 0) goto L13
                android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.mSessionToken     // Catch: android.os.RemoteException -> L13
                android.support.v4.media.session.IMediaSession r0 = r0.getExtraBinder()     // Catch: android.os.RemoteException -> L13
                boolean r0 = r0.isCaptioningEnabled()     // Catch: android.os.RemoteException -> L13
                return r0
            L13:
                r0 = 0
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public boolean isSessionReady() {
                r1 = this;
                android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.mSessionToken
                android.support.v4.media.session.IMediaSession r0 = r0.getExtraBinder()
                if (r0 == 0) goto La
                r0 = 1
                return r0
            La:
                r0 = 0
                return r0
        }

        @androidx.annotation.GuardedBy("mLock")
        void processPendingCallbacksLocked() {
                r4 = this;
                android.support.v4.media.session.MediaSessionCompat$Token r0 = r4.mSessionToken
                android.support.v4.media.session.IMediaSession r0 = r0.getExtraBinder()
                if (r0 != 0) goto L9
                return
            L9:
                java.util.List<android.support.v4.media.session.MediaControllerCompat$Callback> r0 = r4.mPendingCallbacks
                java.util.Iterator r0 = r0.iterator()
            Lf:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L37
                java.lang.Object r1 = r0.next()
                android.support.v4.media.session.MediaControllerCompat$Callback r1 = (android.support.v4.media.session.MediaControllerCompat.Callback) r1
                android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraCallback r2 = new android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraCallback
                r2.<init>(r1)
                java.util.HashMap<android.support.v4.media.session.MediaControllerCompat$Callback, android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraCallback> r3 = r4.mCallbackMap
                r3.put(r1, r2)
                r1.mIControllerCallback = r2
                android.support.v4.media.session.MediaSessionCompat$Token r3 = r4.mSessionToken     // Catch: android.os.RemoteException -> L37
                android.support.v4.media.session.IMediaSession r3 = r3.getExtraBinder()     // Catch: android.os.RemoteException -> L37
                r3.registerCallbackListener(r2)     // Catch: android.os.RemoteException -> L37
                r2 = 13
                r3 = 0
                r1.postToHandler(r2, r3, r3)
                goto Lf
            L37:
                java.util.List<android.support.v4.media.session.MediaControllerCompat$Callback> r0 = r4.mPendingCallbacks
                r0.clear()
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public final void registerCallback(android.support.v4.media.session.MediaControllerCompat.Callback r4, android.os.Handler r5) {
                r3 = this;
                java.lang.Object r0 = r3.mControllerObj
                java.lang.Object r1 = r4.mCallbackObj
                android.support.v4.media.session.MediaControllerCompatApi21.registerCallback(r0, r1, r5)
                java.lang.Object r5 = r3.mLock
                monitor-enter(r5)
                android.support.v4.media.session.MediaSessionCompat$Token r0 = r3.mSessionToken     // Catch: java.lang.Throwable -> L2e
                android.support.v4.media.session.IMediaSession r0 = r0.getExtraBinder()     // Catch: java.lang.Throwable -> L2e
                r1 = 0
                if (r0 == 0) goto L30
                android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraCallback r0 = new android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraCallback     // Catch: java.lang.Throwable -> L2e
                r0.<init>(r4)     // Catch: java.lang.Throwable -> L2e
                java.util.HashMap<android.support.v4.media.session.MediaControllerCompat$Callback, android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraCallback> r2 = r3.mCallbackMap     // Catch: java.lang.Throwable -> L2e
                r2.put(r4, r0)     // Catch: java.lang.Throwable -> L2e
                r4.mIControllerCallback = r0     // Catch: java.lang.Throwable -> L2e
                android.support.v4.media.session.MediaSessionCompat$Token r2 = r3.mSessionToken     // Catch: java.lang.Throwable -> L2e android.os.RemoteException -> L37
                android.support.v4.media.session.IMediaSession r2 = r2.getExtraBinder()     // Catch: java.lang.Throwable -> L2e android.os.RemoteException -> L37
                r2.registerCallbackListener(r0)     // Catch: java.lang.Throwable -> L2e android.os.RemoteException -> L37
                r0 = 13
                r4.postToHandler(r0, r1, r1)     // Catch: java.lang.Throwable -> L2e android.os.RemoteException -> L37
                goto L37
            L2e:
                r4 = move-exception
                goto L39
            L30:
                r4.mIControllerCallback = r1     // Catch: java.lang.Throwable -> L2e
                java.util.List<android.support.v4.media.session.MediaControllerCompat$Callback> r0 = r3.mPendingCallbacks     // Catch: java.lang.Throwable -> L2e
                r0.add(r4)     // Catch: java.lang.Throwable -> L2e
            L37:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L2e
                return
            L39:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L2e
                throw r4
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void removeQueueItem(android.support.v4.media.MediaDescriptionCompat r6) {
                r5 = this;
                long r0 = r5.getFlags()
                r2 = 4
                long r0 = r0 & r2
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L1e
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"
                r0.putParcelable(r1, r6)
                java.lang.String r6 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"
                r1 = 0
                r5.sendCommand(r6, r0, r1)
                return
            L1e:
                java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "This session doesn't support queue management operations"
                r6.<init>(r0)
                throw r6
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void sendCommand(java.lang.String r2, android.os.Bundle r3, android.os.ResultReceiver r4) {
                r1 = this;
                java.lang.Object r0 = r1.mControllerObj
                android.support.v4.media.session.MediaControllerCompatApi21.sendCommand(r0, r2, r3, r4)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void setVolumeTo(int r2, int r3) {
                r1 = this;
                java.lang.Object r0 = r1.mControllerObj
                android.support.v4.media.session.MediaControllerCompatApi21.setVolumeTo(r0, r2, r3)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public final void unregisterCallback(android.support.v4.media.session.MediaControllerCompat.Callback r4) {
                r3 = this;
                java.lang.Object r0 = r3.mControllerObj
                java.lang.Object r1 = r4.mCallbackObj
                android.support.v4.media.session.MediaControllerCompatApi21.unregisterCallback(r0, r1)
                java.lang.Object r0 = r3.mLock
                monitor-enter(r0)
                android.support.v4.media.session.MediaSessionCompat$Token r1 = r3.mSessionToken     // Catch: java.lang.Throwable -> L29
                android.support.v4.media.session.IMediaSession r1 = r1.getExtraBinder()     // Catch: java.lang.Throwable -> L29
                if (r1 == 0) goto L2b
                java.util.HashMap<android.support.v4.media.session.MediaControllerCompat$Callback, android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraCallback> r1 = r3.mCallbackMap     // Catch: java.lang.Throwable -> L29 android.os.RemoteException -> L30
                java.lang.Object r1 = r1.remove(r4)     // Catch: java.lang.Throwable -> L29 android.os.RemoteException -> L30
                android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraCallback r1 = (android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21.ExtraCallback) r1     // Catch: java.lang.Throwable -> L29 android.os.RemoteException -> L30
                if (r1 == 0) goto L30
                r2 = 0
                r4.mIControllerCallback = r2     // Catch: java.lang.Throwable -> L29 android.os.RemoteException -> L30
                android.support.v4.media.session.MediaSessionCompat$Token r4 = r3.mSessionToken     // Catch: java.lang.Throwable -> L29 android.os.RemoteException -> L30
                android.support.v4.media.session.IMediaSession r4 = r4.getExtraBinder()     // Catch: java.lang.Throwable -> L29 android.os.RemoteException -> L30
                r4.unregisterCallbackListener(r1)     // Catch: java.lang.Throwable -> L29 android.os.RemoteException -> L30
                goto L30
            L29:
                r4 = move-exception
                goto L32
            L2b:
                java.util.List<android.support.v4.media.session.MediaControllerCompat$Callback> r1 = r3.mPendingCallbacks     // Catch: java.lang.Throwable -> L29
                r1.remove(r4)     // Catch: java.lang.Throwable -> L29
            L30:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
                return
            L32:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
                throw r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    static class MediaControllerImplApi23 extends android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21 {
        public MediaControllerImplApi23(android.content.Context r1, android.support.v4.media.session.MediaSessionCompat.Token r2) throws android.os.RemoteException {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21, android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.support.v4.media.session.MediaControllerCompat.TransportControls getTransportControls() {
                r2 = this;
                java.lang.Object r0 = r2.mControllerObj
                java.lang.Object r0 = android.support.v4.media.session.MediaControllerCompatApi21.getTransportControls(r0)
                if (r0 == 0) goto Le
                android.support.v4.media.session.MediaControllerCompat$TransportControlsApi23 r1 = new android.support.v4.media.session.MediaControllerCompat$TransportControlsApi23
                r1.<init>(r0)
                return r1
            Le:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(24)
    static class MediaControllerImplApi24 extends android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi23 {
        public MediaControllerImplApi24(android.content.Context r1, android.support.v4.media.session.MediaSessionCompat.Token r2) throws android.os.RemoteException {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi23, android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21, android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.support.v4.media.session.MediaControllerCompat.TransportControls getTransportControls() {
                r2 = this;
                java.lang.Object r0 = r2.mControllerObj
                java.lang.Object r0 = android.support.v4.media.session.MediaControllerCompatApi21.getTransportControls(r0)
                if (r0 == 0) goto Le
                android.support.v4.media.session.MediaControllerCompat$TransportControlsApi24 r1 = new android.support.v4.media.session.MediaControllerCompat$TransportControlsApi24
                r1.<init>(r0)
                return r1
            Le:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class MediaControllerImplBase implements android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl {
        private android.support.v4.media.session.IMediaSession mBinder;
        private android.support.v4.media.session.MediaControllerCompat.TransportControls mTransportControls;

        public MediaControllerImplBase(android.support.v4.media.session.MediaSessionCompat.Token r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = r1.getToken()
                android.os.IBinder r1 = (android.os.IBinder) r1
                android.support.v4.media.session.IMediaSession r1 = android.support.v4.media.session.IMediaSession.Stub.asInterface(r1)
                r0.mBinder = r1
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void addQueueItem(android.support.v4.media.MediaDescriptionCompat r6) {
                r5 = this;
                android.support.v4.media.session.IMediaSession r0 = r5.mBinder     // Catch: android.os.RemoteException -> L1d
                long r0 = r0.getFlags()     // Catch: android.os.RemoteException -> L1d
                r2 = 4
                long r0 = r0 & r2
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L15
                android.support.v4.media.session.IMediaSession r0 = r5.mBinder     // Catch: android.os.RemoteException -> L1d
                r0.addQueueItem(r6)     // Catch: android.os.RemoteException -> L1d
                return
            L15:
                java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException     // Catch: android.os.RemoteException -> L1d
                java.lang.String r0 = "This session doesn't support queue management operations"
                r6.<init>(r0)     // Catch: android.os.RemoteException -> L1d
                throw r6     // Catch: android.os.RemoteException -> L1d
            L1d:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void addQueueItem(android.support.v4.media.MediaDescriptionCompat r6, int r7) {
                r5 = this;
                android.support.v4.media.session.IMediaSession r0 = r5.mBinder     // Catch: android.os.RemoteException -> L1d
                long r0 = r0.getFlags()     // Catch: android.os.RemoteException -> L1d
                r2 = 4
                long r0 = r0 & r2
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L15
                android.support.v4.media.session.IMediaSession r0 = r5.mBinder     // Catch: android.os.RemoteException -> L1d
                r0.addQueueItemAt(r6, r7)     // Catch: android.os.RemoteException -> L1d
                return
            L15:
                java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException     // Catch: android.os.RemoteException -> L1d
                java.lang.String r7 = "This session doesn't support queue management operations"
                r6.<init>(r7)     // Catch: android.os.RemoteException -> L1d
                throw r6     // Catch: android.os.RemoteException -> L1d
            L1d:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void adjustVolume(int r3, int r4) {
                r2 = this;
                android.support.v4.media.session.IMediaSession r0 = r2.mBinder     // Catch: android.os.RemoteException -> L6
                r1 = 0
                r0.adjustVolume(r3, r4, r1)     // Catch: android.os.RemoteException -> L6
            L6:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public boolean dispatchMediaButtonEvent(android.view.KeyEvent r2) {
                r1 = this;
                if (r2 == 0) goto L9
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L7
                r0.sendMediaButton(r2)     // Catch: android.os.RemoteException -> L7
            L7:
                r2 = 0
                return r2
            L9:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "event may not be null."
                r2.<init>(r0)
                throw r2
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.os.Bundle getExtras() {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L7
                android.os.Bundle r0 = r0.getExtras()     // Catch: android.os.RemoteException -> L7
                return r0
            L7:
                r0 = 0
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public long getFlags() {
                r2 = this;
                android.support.v4.media.session.IMediaSession r0 = r2.mBinder     // Catch: android.os.RemoteException -> L7
                long r0 = r0.getFlags()     // Catch: android.os.RemoteException -> L7
                return r0
            L7:
                r0 = 0
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public java.lang.Object getMediaController() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.support.v4.media.MediaMetadataCompat getMetadata() {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L7
                android.support.v4.media.MediaMetadataCompat r0 = r0.getMetadata()     // Catch: android.os.RemoteException -> L7
                return r0
            L7:
                r0 = 0
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public java.lang.String getPackageName() {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L7
                java.lang.String r0 = r0.getPackageName()     // Catch: android.os.RemoteException -> L7
                return r0
            L7:
                r0 = 0
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.support.v4.media.session.MediaControllerCompat.PlaybackInfo getPlaybackInfo() {
                r7 = this;
                android.support.v4.media.session.IMediaSession r0 = r7.mBinder     // Catch: android.os.RemoteException -> L16
                android.support.v4.media.session.ParcelableVolumeInfo r0 = r0.getVolumeAttributes()     // Catch: android.os.RemoteException -> L16
                android.support.v4.media.session.MediaControllerCompat$PlaybackInfo r1 = new android.support.v4.media.session.MediaControllerCompat$PlaybackInfo     // Catch: android.os.RemoteException -> L16
                int r2 = r0.volumeType     // Catch: android.os.RemoteException -> L16
                int r3 = r0.audioStream     // Catch: android.os.RemoteException -> L16
                int r4 = r0.controlType     // Catch: android.os.RemoteException -> L16
                int r5 = r0.maxVolume     // Catch: android.os.RemoteException -> L16
                int r6 = r0.currentVolume     // Catch: android.os.RemoteException -> L16
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: android.os.RemoteException -> L16
                return r1
            L16:
                r0 = 0
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.support.v4.media.session.PlaybackStateCompat getPlaybackState() {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L7
                android.support.v4.media.session.PlaybackStateCompat r0 = r0.getPlaybackState()     // Catch: android.os.RemoteException -> L7
                return r0
            L7:
                r0 = 0
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> getQueue() {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L7
                java.util.List r0 = r0.getQueue()     // Catch: android.os.RemoteException -> L7
                return r0
            L7:
                r0 = 0
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public java.lang.CharSequence getQueueTitle() {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L7
                java.lang.CharSequence r0 = r0.getQueueTitle()     // Catch: android.os.RemoteException -> L7
                return r0
            L7:
                r0 = 0
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public int getRatingType() {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L7
                int r0 = r0.getRatingType()     // Catch: android.os.RemoteException -> L7
                return r0
            L7:
                r0 = 0
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public int getRepeatMode() {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L7
                int r0 = r0.getRepeatMode()     // Catch: android.os.RemoteException -> L7
                return r0
            L7:
                r0 = -1
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.app.PendingIntent getSessionActivity() {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L7
                android.app.PendingIntent r0 = r0.getLaunchPendingIntent()     // Catch: android.os.RemoteException -> L7
                return r0
            L7:
                r0 = 0
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public int getShuffleMode() {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L7
                int r0 = r0.getShuffleMode()     // Catch: android.os.RemoteException -> L7
                return r0
            L7:
                r0 = -1
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public android.support.v4.media.session.MediaControllerCompat.TransportControls getTransportControls() {
                r2 = this;
                android.support.v4.media.session.MediaControllerCompat$TransportControls r0 = r2.mTransportControls
                if (r0 != 0) goto Ld
                android.support.v4.media.session.MediaControllerCompat$TransportControlsBase r0 = new android.support.v4.media.session.MediaControllerCompat$TransportControlsBase
                android.support.v4.media.session.IMediaSession r1 = r2.mBinder
                r0.<init>(r1)
                r2.mTransportControls = r0
            Ld:
                android.support.v4.media.session.MediaControllerCompat$TransportControls r0 = r2.mTransportControls
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public boolean isCaptioningEnabled() {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L7
                boolean r0 = r0.isCaptioningEnabled()     // Catch: android.os.RemoteException -> L7
                return r0
            L7:
                r0 = 0
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public boolean isSessionReady() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void registerCallback(android.support.v4.media.session.MediaControllerCompat.Callback r3, android.os.Handler r4) {
                r2 = this;
                if (r3 == 0) goto L22
                r4 = 0
                android.support.v4.media.session.IMediaSession r0 = r2.mBinder     // Catch: android.os.RemoteException -> L1c
                android.os.IBinder r0 = r0.asBinder()     // Catch: android.os.RemoteException -> L1c
                r1 = 0
                r0.linkToDeath(r3, r1)     // Catch: android.os.RemoteException -> L1c
                android.support.v4.media.session.IMediaSession r0 = r2.mBinder     // Catch: android.os.RemoteException -> L1c
                java.lang.Object r1 = r3.mCallbackObj     // Catch: android.os.RemoteException -> L1c
                android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1     // Catch: android.os.RemoteException -> L1c
                r0.registerCallbackListener(r1)     // Catch: android.os.RemoteException -> L1c
                r0 = 13
                r3.postToHandler(r0, r4, r4)     // Catch: android.os.RemoteException -> L1c
                return
            L1c:
                r0 = 8
                r3.postToHandler(r0, r4, r4)
                return
            L22:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "callback may not be null."
                r3.<init>(r4)
                throw r3
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void removeQueueItem(android.support.v4.media.MediaDescriptionCompat r6) {
                r5 = this;
                android.support.v4.media.session.IMediaSession r0 = r5.mBinder     // Catch: android.os.RemoteException -> L1d
                long r0 = r0.getFlags()     // Catch: android.os.RemoteException -> L1d
                r2 = 4
                long r0 = r0 & r2
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L15
                android.support.v4.media.session.IMediaSession r0 = r5.mBinder     // Catch: android.os.RemoteException -> L1d
                r0.removeQueueItem(r6)     // Catch: android.os.RemoteException -> L1d
                return
            L15:
                java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException     // Catch: android.os.RemoteException -> L1d
                java.lang.String r0 = "This session doesn't support queue management operations"
                r6.<init>(r0)     // Catch: android.os.RemoteException -> L1d
                throw r6     // Catch: android.os.RemoteException -> L1d
            L1d:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void sendCommand(java.lang.String r3, android.os.Bundle r4, android.os.ResultReceiver r5) {
                r2 = this;
                android.support.v4.media.session.IMediaSession r0 = r2.mBinder     // Catch: android.os.RemoteException -> La
                android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper r1 = new android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper     // Catch: android.os.RemoteException -> La
                r1.<init>(r5)     // Catch: android.os.RemoteException -> La
                r0.sendCommand(r3, r4, r1)     // Catch: android.os.RemoteException -> La
            La:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void setVolumeTo(int r3, int r4) {
                r2 = this;
                android.support.v4.media.session.IMediaSession r0 = r2.mBinder     // Catch: android.os.RemoteException -> L6
                r1 = 0
                r0.setVolumeTo(r3, r4, r1)     // Catch: android.os.RemoteException -> L6
            L6:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void unregisterCallback(android.support.v4.media.session.MediaControllerCompat.Callback r3) {
                r2 = this;
                if (r3 == 0) goto L16
                android.support.v4.media.session.IMediaSession r0 = r2.mBinder     // Catch: android.os.RemoteException -> L15
                java.lang.Object r1 = r3.mCallbackObj     // Catch: android.os.RemoteException -> L15
                android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1     // Catch: android.os.RemoteException -> L15
                r0.unregisterCallbackListener(r1)     // Catch: android.os.RemoteException -> L15
                android.support.v4.media.session.IMediaSession r0 = r2.mBinder     // Catch: android.os.RemoteException -> L15
                android.os.IBinder r0 = r0.asBinder()     // Catch: android.os.RemoteException -> L15
                r1 = 0
                r0.unlinkToDeath(r3, r1)     // Catch: android.os.RemoteException -> L15
            L15:
                return
            L16:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "callback may not be null."
                r3.<init>(r0)
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class PlaybackInfo {
        public static final int PLAYBACK_TYPE_LOCAL = 1;
        public static final int PLAYBACK_TYPE_REMOTE = 2;
        private final int mAudioStream;
        private final int mCurrentVolume;
        private final int mMaxVolume;
        private final int mPlaybackType;
        private final int mVolumeControl;

        PlaybackInfo(int r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                r0.<init>()
                r0.mPlaybackType = r1
                r0.mAudioStream = r2
                r0.mVolumeControl = r3
                r0.mMaxVolume = r4
                r0.mCurrentVolume = r5
                return
        }

        public int getAudioStream() {
                r1 = this;
                int r0 = r1.mAudioStream
                return r0
        }

        public int getCurrentVolume() {
                r1 = this;
                int r0 = r1.mCurrentVolume
                return r0
        }

        public int getMaxVolume() {
                r1 = this;
                int r0 = r1.mMaxVolume
                return r0
        }

        public int getPlaybackType() {
                r1 = this;
                int r0 = r1.mPlaybackType
                return r0
        }

        public int getVolumeControl() {
                r1 = this;
                int r0 = r1.mVolumeControl
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class TransportControls {
        public static final java.lang.String EXTRA_LEGACY_STREAM_TYPE = "android.media.session.extra.LEGACY_STREAM_TYPE";

        TransportControls() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract void fastForward();

        public abstract void pause();

        public abstract void play();

        public abstract void playFromMediaId(java.lang.String r1, android.os.Bundle r2);

        public abstract void playFromSearch(java.lang.String r1, android.os.Bundle r2);

        public abstract void playFromUri(android.net.Uri r1, android.os.Bundle r2);

        public abstract void prepare();

        public abstract void prepareFromMediaId(java.lang.String r1, android.os.Bundle r2);

        public abstract void prepareFromSearch(java.lang.String r1, android.os.Bundle r2);

        public abstract void prepareFromUri(android.net.Uri r1, android.os.Bundle r2);

        public abstract void rewind();

        public abstract void seekTo(long r1);

        public abstract void sendCustomAction(android.support.v4.media.session.PlaybackStateCompat.CustomAction r1, android.os.Bundle r2);

        public abstract void sendCustomAction(java.lang.String r1, android.os.Bundle r2);

        public abstract void setCaptioningEnabled(boolean r1);

        public abstract void setRating(android.support.v4.media.RatingCompat r1);

        public abstract void setRating(android.support.v4.media.RatingCompat r1, android.os.Bundle r2);

        public abstract void setRepeatMode(int r1);

        public abstract void setShuffleMode(int r1);

        public abstract void skipToNext();

        public abstract void skipToPrevious();

        public abstract void skipToQueueItem(long r1);

        public abstract void stop();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class TransportControlsApi21 extends android.support.v4.media.session.MediaControllerCompat.TransportControls {
        protected final java.lang.Object mControlsObj;

        public TransportControlsApi21(java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.mControlsObj = r1
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void fastForward() {
                r1 = this;
                java.lang.Object r0 = r1.mControlsObj
                android.support.v4.media.session.MediaControllerCompatApi21.TransportControls.fastForward(r0)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void pause() {
                r1 = this;
                java.lang.Object r0 = r1.mControlsObj
                android.support.v4.media.session.MediaControllerCompatApi21.TransportControls.pause(r0)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void play() {
                r1 = this;
                java.lang.Object r0 = r1.mControlsObj
                android.support.v4.media.session.MediaControllerCompatApi21.TransportControls.play(r0)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromMediaId(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                java.lang.Object r0 = r1.mControlsObj
                android.support.v4.media.session.MediaControllerCompatApi21.TransportControls.playFromMediaId(r0, r2, r3)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromSearch(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                java.lang.Object r0 = r1.mControlsObj
                android.support.v4.media.session.MediaControllerCompatApi21.TransportControls.playFromSearch(r0, r2, r3)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromUri(android.net.Uri r3, android.os.Bundle r4) {
                r2 = this;
                if (r3 == 0) goto L1f
                android.net.Uri r0 = android.net.Uri.EMPTY
                boolean r0 = r0.equals(r3)
                if (r0 != 0) goto L1f
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "android.support.v4.media.session.action.ARGUMENT_URI"
                r0.putParcelable(r1, r3)
                java.lang.String r3 = "android.support.v4.media.session.action.ARGUMENT_EXTRAS"
                r0.putBundle(r3, r4)
                java.lang.String r3 = "android.support.v4.media.session.action.PLAY_FROM_URI"
                r2.sendCustomAction(r3, r0)
                return
            L1f:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "You must specify a non-empty Uri for playFromUri."
                r3.<init>(r4)
                throw r3
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepare() {
                r2 = this;
                java.lang.String r0 = "android.support.v4.media.session.action.PREPARE"
                r1 = 0
                r2.sendCustomAction(r0, r1)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromMediaId(java.lang.String r3, android.os.Bundle r4) {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"
                r0.putString(r1, r3)
                java.lang.String r3 = "android.support.v4.media.session.action.ARGUMENT_EXTRAS"
                r0.putBundle(r3, r4)
                java.lang.String r3 = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID"
                r2.sendCustomAction(r3, r0)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromSearch(java.lang.String r3, android.os.Bundle r4) {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "android.support.v4.media.session.action.ARGUMENT_QUERY"
                r0.putString(r1, r3)
                java.lang.String r3 = "android.support.v4.media.session.action.ARGUMENT_EXTRAS"
                r0.putBundle(r3, r4)
                java.lang.String r3 = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH"
                r2.sendCustomAction(r3, r0)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromUri(android.net.Uri r3, android.os.Bundle r4) {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "android.support.v4.media.session.action.ARGUMENT_URI"
                r0.putParcelable(r1, r3)
                java.lang.String r3 = "android.support.v4.media.session.action.ARGUMENT_EXTRAS"
                r0.putBundle(r3, r4)
                java.lang.String r3 = "android.support.v4.media.session.action.PREPARE_FROM_URI"
                r2.sendCustomAction(r3, r0)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void rewind() {
                r1 = this;
                java.lang.Object r0 = r1.mControlsObj
                android.support.v4.media.session.MediaControllerCompatApi21.TransportControls.rewind(r0)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void seekTo(long r2) {
                r1 = this;
                java.lang.Object r0 = r1.mControlsObj
                android.support.v4.media.session.MediaControllerCompatApi21.TransportControls.seekTo(r0, r2)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void sendCustomAction(android.support.v4.media.session.PlaybackStateCompat.CustomAction r2, android.os.Bundle r3) {
                r1 = this;
                java.lang.String r0 = r2.getAction()
                android.support.v4.media.session.MediaControllerCompat.validateCustomAction(r0, r3)
                java.lang.Object r0 = r1.mControlsObj
                java.lang.String r2 = r2.getAction()
                android.support.v4.media.session.MediaControllerCompatApi21.TransportControls.sendCustomAction(r0, r2, r3)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void sendCustomAction(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                android.support.v4.media.session.MediaControllerCompat.validateCustomAction(r2, r3)
                java.lang.Object r0 = r1.mControlsObj
                android.support.v4.media.session.MediaControllerCompatApi21.TransportControls.sendCustomAction(r0, r2, r3)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setCaptioningEnabled(boolean r3) {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"
                r0.putBoolean(r1, r3)
                java.lang.String r3 = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED"
                r2.sendCustomAction(r3, r0)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setRating(android.support.v4.media.RatingCompat r2) {
                r1 = this;
                java.lang.Object r0 = r1.mControlsObj
                if (r2 == 0) goto L9
                java.lang.Object r2 = r2.getRating()
                goto La
            L9:
                r2 = 0
            La:
                android.support.v4.media.session.MediaControllerCompatApi21.TransportControls.setRating(r0, r2)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setRating(android.support.v4.media.RatingCompat r3, android.os.Bundle r4) {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "android.support.v4.media.session.action.ARGUMENT_RATING"
                r0.putParcelable(r1, r3)
                java.lang.String r3 = "android.support.v4.media.session.action.ARGUMENT_EXTRAS"
                r0.putBundle(r3, r4)
                java.lang.String r3 = "android.support.v4.media.session.action.SET_RATING"
                r2.sendCustomAction(r3, r0)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setRepeatMode(int r3) {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"
                r0.putInt(r1, r3)
                java.lang.String r3 = "android.support.v4.media.session.action.SET_REPEAT_MODE"
                r2.sendCustomAction(r3, r0)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setShuffleMode(int r3) {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"
                r0.putInt(r1, r3)
                java.lang.String r3 = "android.support.v4.media.session.action.SET_SHUFFLE_MODE"
                r2.sendCustomAction(r3, r0)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void skipToNext() {
                r1 = this;
                java.lang.Object r0 = r1.mControlsObj
                android.support.v4.media.session.MediaControllerCompatApi21.TransportControls.skipToNext(r0)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void skipToPrevious() {
                r1 = this;
                java.lang.Object r0 = r1.mControlsObj
                android.support.v4.media.session.MediaControllerCompatApi21.TransportControls.skipToPrevious(r0)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void skipToQueueItem(long r2) {
                r1 = this;
                java.lang.Object r0 = r1.mControlsObj
                android.support.v4.media.session.MediaControllerCompatApi21.TransportControls.skipToQueueItem(r0, r2)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void stop() {
                r1 = this;
                java.lang.Object r0 = r1.mControlsObj
                android.support.v4.media.session.MediaControllerCompatApi21.TransportControls.stop(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    static class TransportControlsApi23 extends android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21 {
        public TransportControlsApi23(java.lang.Object r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21, android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromUri(android.net.Uri r2, android.os.Bundle r3) {
                r1 = this;
                java.lang.Object r0 = r1.mControlsObj
                android.support.v4.media.session.MediaControllerCompatApi23.TransportControls.playFromUri(r0, r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(24)
    static class TransportControlsApi24 extends android.support.v4.media.session.MediaControllerCompat.TransportControlsApi23 {
        public TransportControlsApi24(java.lang.Object r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21, android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepare() {
                r1 = this;
                java.lang.Object r0 = r1.mControlsObj
                android.support.v4.media.session.MediaControllerCompatApi24.TransportControls.prepare(r0)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21, android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromMediaId(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                java.lang.Object r0 = r1.mControlsObj
                android.support.v4.media.session.MediaControllerCompatApi24.TransportControls.prepareFromMediaId(r0, r2, r3)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21, android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromSearch(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                java.lang.Object r0 = r1.mControlsObj
                android.support.v4.media.session.MediaControllerCompatApi24.TransportControls.prepareFromSearch(r0, r2, r3)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21, android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromUri(android.net.Uri r2, android.os.Bundle r3) {
                r1 = this;
                java.lang.Object r0 = r1.mControlsObj
                android.support.v4.media.session.MediaControllerCompatApi24.TransportControls.prepareFromUri(r0, r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class TransportControlsBase extends android.support.v4.media.session.MediaControllerCompat.TransportControls {
        private android.support.v4.media.session.IMediaSession mBinder;

        public TransportControlsBase(android.support.v4.media.session.IMediaSession r1) {
                r0 = this;
                r0.<init>()
                r0.mBinder = r1
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void fastForward() {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L5
                r0.fastForward()     // Catch: android.os.RemoteException -> L5
            L5:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void pause() {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L5
                r0.pause()     // Catch: android.os.RemoteException -> L5
            L5:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void play() {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L5
                r0.play()     // Catch: android.os.RemoteException -> L5
            L5:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromMediaId(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L5
                r0.playFromMediaId(r2, r3)     // Catch: android.os.RemoteException -> L5
            L5:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromSearch(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L5
                r0.playFromSearch(r2, r3)     // Catch: android.os.RemoteException -> L5
            L5:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromUri(android.net.Uri r2, android.os.Bundle r3) {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L5
                r0.playFromUri(r2, r3)     // Catch: android.os.RemoteException -> L5
            L5:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepare() {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L5
                r0.prepare()     // Catch: android.os.RemoteException -> L5
            L5:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromMediaId(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L5
                r0.prepareFromMediaId(r2, r3)     // Catch: android.os.RemoteException -> L5
            L5:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromSearch(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L5
                r0.prepareFromSearch(r2, r3)     // Catch: android.os.RemoteException -> L5
            L5:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromUri(android.net.Uri r2, android.os.Bundle r3) {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L5
                r0.prepareFromUri(r2, r3)     // Catch: android.os.RemoteException -> L5
            L5:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void rewind() {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L5
                r0.rewind()     // Catch: android.os.RemoteException -> L5
            L5:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void seekTo(long r2) {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L5
                r0.seekTo(r2)     // Catch: android.os.RemoteException -> L5
            L5:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void sendCustomAction(android.support.v4.media.session.PlaybackStateCompat.CustomAction r1, android.os.Bundle r2) {
                r0 = this;
                java.lang.String r1 = r1.getAction()
                r0.sendCustomAction(r1, r2)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void sendCustomAction(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                android.support.v4.media.session.MediaControllerCompat.validateCustomAction(r2, r3)
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L8
                r0.sendCustomAction(r2, r3)     // Catch: android.os.RemoteException -> L8
            L8:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setCaptioningEnabled(boolean r2) {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L5
                r0.setCaptioningEnabled(r2)     // Catch: android.os.RemoteException -> L5
            L5:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setRating(android.support.v4.media.RatingCompat r2) {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L5
                r0.rate(r2)     // Catch: android.os.RemoteException -> L5
            L5:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setRating(android.support.v4.media.RatingCompat r2, android.os.Bundle r3) {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L5
                r0.rateWithExtras(r2, r3)     // Catch: android.os.RemoteException -> L5
            L5:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setRepeatMode(int r2) {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L5
                r0.setRepeatMode(r2)     // Catch: android.os.RemoteException -> L5
            L5:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setShuffleMode(int r2) {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L5
                r0.setShuffleMode(r2)     // Catch: android.os.RemoteException -> L5
            L5:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void skipToNext() {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L5
                r0.next()     // Catch: android.os.RemoteException -> L5
            L5:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void skipToPrevious() {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L5
                r0.previous()     // Catch: android.os.RemoteException -> L5
            L5:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void skipToQueueItem(long r2) {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L5
                r0.skipToQueueItem(r2)     // Catch: android.os.RemoteException -> L5
            L5:
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void stop() {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mBinder     // Catch: android.os.RemoteException -> L5
                r0.stop()     // Catch: android.os.RemoteException -> L5
            L5:
                return
        }
    }

    public MediaControllerCompat(android.content.Context r3, @androidx.annotation.NonNull android.support.v4.media.session.MediaSessionCompat.Token r4) throws android.os.RemoteException {
            r2 = this;
            r2.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.mRegisteredCallbacks = r0
            if (r4 == 0) goto L30
            r2.mToken = r4
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L1c
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi24 r0 = new android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi24
            r0.<init>(r3, r4)
            r2.mImpl = r0
            return
        L1c:
            r1 = 23
            if (r0 < r1) goto L28
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi23 r0 = new android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi23
            r0.<init>(r3, r4)
            r2.mImpl = r0
            return
        L28:
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 r0 = new android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21
            r0.<init>(r3, r4)
            r2.mImpl = r0
            return
        L30:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "sessionToken must not be null"
            r3.<init>(r4)
            throw r3
    }

    public MediaControllerCompat(android.content.Context r3, @androidx.annotation.NonNull android.support.v4.media.session.MediaSessionCompat r4) {
            r2 = this;
            r2.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.mRegisteredCallbacks = r0
            if (r4 == 0) goto L32
            android.support.v4.media.session.MediaSessionCompat$Token r4 = r4.getSessionToken()
            r2.mToken = r4
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: android.os.RemoteException -> L2e
            r1 = 24
            if (r0 < r1) goto L1e
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi24 r0 = new android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi24     // Catch: android.os.RemoteException -> L2e
            r0.<init>(r3, r4)     // Catch: android.os.RemoteException -> L2e
            goto L2f
        L1e:
            r1 = 23
            if (r0 < r1) goto L28
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi23 r0 = new android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi23     // Catch: android.os.RemoteException -> L2e
            r0.<init>(r3, r4)     // Catch: android.os.RemoteException -> L2e
            goto L2f
        L28:
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 r0 = new android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21     // Catch: android.os.RemoteException -> L2e
            r0.<init>(r3, r4)     // Catch: android.os.RemoteException -> L2e
            goto L2f
        L2e:
            r0 = 0
        L2f:
            r2.mImpl = r0
            return
        L32:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "session must not be null"
            r3.<init>(r4)
            throw r3
    }

    public static android.support.v4.media.session.MediaControllerCompat getMediaController(@androidx.annotation.NonNull android.app.Activity r3) {
            boolean r0 = r3 instanceof androidx.core.app.ComponentActivity
            r1 = 0
            if (r0 == 0) goto L17
            androidx.core.app.ComponentActivity r3 = (androidx.core.app.ComponentActivity) r3
            java.lang.Class<android.support.v4.media.session.MediaControllerCompat$MediaControllerExtraData> r0 = android.support.v4.media.session.MediaControllerCompat.MediaControllerExtraData.class
            androidx.core.app.ComponentActivity$ExtraData r3 = r3.getExtraData(r0)
            android.support.v4.media.session.MediaControllerCompat$MediaControllerExtraData r3 = (android.support.v4.media.session.MediaControllerCompat.MediaControllerExtraData) r3
            if (r3 == 0) goto L16
            android.support.v4.media.session.MediaControllerCompat r3 = r3.getMediaController()
            return r3
        L16:
            return r1
        L17:
            java.lang.Object r0 = android.support.v4.media.session.MediaControllerCompatApi21.getMediaController(r3)
            if (r0 != 0) goto L1e
            return r1
        L1e:
            java.lang.Object r0 = android.support.v4.media.session.MediaControllerCompatApi21.getSessionToken(r0)
            android.support.v4.media.session.MediaControllerCompat r2 = new android.support.v4.media.session.MediaControllerCompat     // Catch: android.os.RemoteException -> L2c
            android.support.v4.media.session.MediaSessionCompat$Token r0 = android.support.v4.media.session.MediaSessionCompat.Token.fromToken(r0)     // Catch: android.os.RemoteException -> L2c
            r2.<init>(r3, r0)     // Catch: android.os.RemoteException -> L2c
            return r2
        L2c:
            return r1
    }

    public static void setMediaController(@androidx.annotation.NonNull android.app.Activity r2, android.support.v4.media.session.MediaControllerCompat r3) {
            boolean r0 = r2 instanceof androidx.core.app.ComponentActivity
            if (r0 == 0) goto Lf
            r0 = r2
            androidx.core.app.ComponentActivity r0 = (androidx.core.app.ComponentActivity) r0
            android.support.v4.media.session.MediaControllerCompat$MediaControllerExtraData r1 = new android.support.v4.media.session.MediaControllerCompat$MediaControllerExtraData
            r1.<init>(r3)
            r0.putExtraData(r1)
        Lf:
            if (r3 == 0) goto L1e
            android.support.v4.media.session.MediaSessionCompat$Token r3 = r3.getSessionToken()
            java.lang.Object r3 = r3.getToken()
            java.lang.Object r3 = android.support.v4.media.session.MediaControllerCompatApi21.fromToken(r2, r3)
            goto L1f
        L1e:
            r3 = 0
        L1f:
            android.support.v4.media.session.MediaControllerCompatApi21.setMediaController(r2, r3)
            return
    }

    static void validateCustomAction(java.lang.String r2, android.os.Bundle r3) {
            if (r2 != 0) goto L3
            goto L1e
        L3:
            java.lang.String r0 = "android.support.v4.media.session.action.FOLLOW"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L14
            java.lang.String r0 = "android.support.v4.media.session.action.UNFOLLOW"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L14
            goto L1e
        L14:
            if (r3 == 0) goto L1f
            java.lang.String r0 = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE"
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L1f
        L1e:
            return
        L1f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = "."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    public void addQueueItem(android.support.v4.media.MediaDescriptionCompat r2) {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl r0 = r1.mImpl
            r0.addQueueItem(r2)
            return
    }

    public void addQueueItem(android.support.v4.media.MediaDescriptionCompat r2, int r3) {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl r0 = r1.mImpl
            r0.addQueueItem(r2, r3)
            return
    }

    public void adjustVolume(int r2, int r3) {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl r0 = r1.mImpl
            r0.adjustVolume(r2, r3)
            return
    }

    public boolean dispatchMediaButtonEvent(android.view.KeyEvent r2) {
            r1 = this;
            if (r2 == 0) goto L9
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl r0 = r1.mImpl
            boolean r2 = r0.dispatchMediaButtonEvent(r2)
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "KeyEvent may not be null"
            r2.<init>(r0)
            throw r2
    }

    public android.os.Bundle getExtras() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl r0 = r1.mImpl
            android.os.Bundle r0 = r0.getExtras()
            return r0
    }

    public long getFlags() {
            r2 = this;
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl r0 = r2.mImpl
            long r0 = r0.getFlags()
            return r0
    }

    public java.lang.Object getMediaController() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl r0 = r1.mImpl
            java.lang.Object r0 = r0.getMediaController()
            return r0
    }

    public android.support.v4.media.MediaMetadataCompat getMetadata() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl r0 = r1.mImpl
            android.support.v4.media.MediaMetadataCompat r0 = r0.getMetadata()
            return r0
    }

    public java.lang.String getPackageName() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl r0 = r1.mImpl
            java.lang.String r0 = r0.getPackageName()
            return r0
    }

    public android.support.v4.media.session.MediaControllerCompat.PlaybackInfo getPlaybackInfo() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl r0 = r1.mImpl
            android.support.v4.media.session.MediaControllerCompat$PlaybackInfo r0 = r0.getPlaybackInfo()
            return r0
    }

    public android.support.v4.media.session.PlaybackStateCompat getPlaybackState() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl r0 = r1.mImpl
            android.support.v4.media.session.PlaybackStateCompat r0 = r0.getPlaybackState()
            return r0
    }

    public java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> getQueue() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl r0 = r1.mImpl
            java.util.List r0 = r0.getQueue()
            return r0
    }

    public java.lang.CharSequence getQueueTitle() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl r0 = r1.mImpl
            java.lang.CharSequence r0 = r0.getQueueTitle()
            return r0
    }

    public int getRatingType() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl r0 = r1.mImpl
            int r0 = r0.getRatingType()
            return r0
    }

    public int getRepeatMode() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl r0 = r1.mImpl
            int r0 = r0.getRepeatMode()
            return r0
    }

    public android.app.PendingIntent getSessionActivity() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl r0 = r1.mImpl
            android.app.PendingIntent r0 = r0.getSessionActivity()
            return r0
    }

    public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken() {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.mToken
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public android.os.Bundle getSessionToken2Bundle() {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.mToken
            android.os.Bundle r0 = r0.getSessionToken2Bundle()
            return r0
    }

    public int getShuffleMode() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl r0 = r1.mImpl
            int r0 = r0.getShuffleMode()
            return r0
    }

    public android.support.v4.media.session.MediaControllerCompat.TransportControls getTransportControls() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl r0 = r1.mImpl
            android.support.v4.media.session.MediaControllerCompat$TransportControls r0 = r0.getTransportControls()
            return r0
    }

    public boolean isCaptioningEnabled() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl r0 = r1.mImpl
            boolean r0 = r0.isCaptioningEnabled()
            return r0
    }

    public boolean isSessionReady() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl r0 = r1.mImpl
            boolean r0 = r0.isSessionReady()
            return r0
    }

    public void registerCallback(@androidx.annotation.NonNull android.support.v4.media.session.MediaControllerCompat.Callback r2) {
            r1 = this;
            r0 = 0
            r1.registerCallback(r2, r0)
            return
    }

    public void registerCallback(@androidx.annotation.NonNull android.support.v4.media.session.MediaControllerCompat.Callback r2, android.os.Handler r3) {
            r1 = this;
            if (r2 == 0) goto L17
            if (r3 != 0) goto L9
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
        L9:
            r2.setHandler(r3)
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl r0 = r1.mImpl
            r0.registerCallback(r2, r3)
            java.util.HashSet<android.support.v4.media.session.MediaControllerCompat$Callback> r3 = r1.mRegisteredCallbacks
            r3.add(r2)
            return
        L17:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "callback must not be null"
            r2.<init>(r3)
            throw r2
    }

    public void removeQueueItem(android.support.v4.media.MediaDescriptionCompat r2) {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl r0 = r1.mImpl
            r0.removeQueueItem(r2)
            return
    }

    @java.lang.Deprecated
    public void removeQueueItemAt(int r3) {
            r2 = this;
            java.util.List r0 = r2.getQueue()
            if (r0 == 0) goto L1d
            if (r3 < 0) goto L1d
            int r1 = r0.size()
            if (r3 >= r1) goto L1d
            java.lang.Object r3 = r0.get(r3)
            android.support.v4.media.session.MediaSessionCompat$QueueItem r3 = (android.support.v4.media.session.MediaSessionCompat.QueueItem) r3
            if (r3 == 0) goto L1d
            android.support.v4.media.MediaDescriptionCompat r3 = r3.getDescription()
            r2.removeQueueItem(r3)
        L1d:
            return
    }

    public void sendCommand(@androidx.annotation.NonNull java.lang.String r2, android.os.Bundle r3, android.os.ResultReceiver r4) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lc
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl r0 = r1.mImpl
            r0.sendCommand(r2, r3, r4)
            return
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "command must neither be null nor empty"
            r2.<init>(r3)
            throw r2
    }

    public void setVolumeTo(int r2, int r3) {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl r0 = r1.mImpl
            r0.setVolumeTo(r2, r3)
            return
    }

    public void unregisterCallback(@androidx.annotation.NonNull android.support.v4.media.session.MediaControllerCompat.Callback r3) {
            r2 = this;
            if (r3 == 0) goto L16
            r0 = 0
            java.util.HashSet<android.support.v4.media.session.MediaControllerCompat$Callback> r1 = r2.mRegisteredCallbacks     // Catch: java.lang.Throwable -> L11
            r1.remove(r3)     // Catch: java.lang.Throwable -> L11
            android.support.v4.media.session.MediaControllerCompat$MediaControllerImpl r1 = r2.mImpl     // Catch: java.lang.Throwable -> L11
            r1.unregisterCallback(r3)     // Catch: java.lang.Throwable -> L11
            r3.setHandler(r0)
            return
        L11:
            r1 = move-exception
            r3.setHandler(r0)
            throw r1
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "callback must not be null"
            r3.<init>(r0)
            throw r3
    }
}
