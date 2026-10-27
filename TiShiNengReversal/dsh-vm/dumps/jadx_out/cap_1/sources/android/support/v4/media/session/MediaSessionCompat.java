package android.support.v4.media.session;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class MediaSessionCompat {

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String ACTION_ARGUMENT_CAPTIONING_ENABLED = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String ACTION_ARGUMENT_EXTRAS = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String ACTION_ARGUMENT_MEDIA_ID = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String ACTION_ARGUMENT_QUERY = "android.support.v4.media.session.action.ARGUMENT_QUERY";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String ACTION_ARGUMENT_RATING = "android.support.v4.media.session.action.ARGUMENT_RATING";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String ACTION_ARGUMENT_REPEAT_MODE = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String ACTION_ARGUMENT_SHUFFLE_MODE = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String ACTION_ARGUMENT_URI = "android.support.v4.media.session.action.ARGUMENT_URI";
    public static final java.lang.String ACTION_FLAG_AS_INAPPROPRIATE = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";
    public static final java.lang.String ACTION_FOLLOW = "android.support.v4.media.session.action.FOLLOW";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String ACTION_PLAY_FROM_URI = "android.support.v4.media.session.action.PLAY_FROM_URI";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String ACTION_PREPARE = "android.support.v4.media.session.action.PREPARE";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String ACTION_PREPARE_FROM_MEDIA_ID = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String ACTION_PREPARE_FROM_SEARCH = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String ACTION_PREPARE_FROM_URI = "android.support.v4.media.session.action.PREPARE_FROM_URI";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String ACTION_SET_CAPTIONING_ENABLED = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String ACTION_SET_RATING = "android.support.v4.media.session.action.SET_RATING";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String ACTION_SET_REPEAT_MODE = "android.support.v4.media.session.action.SET_REPEAT_MODE";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String ACTION_SET_SHUFFLE_MODE = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";
    public static final java.lang.String ACTION_SKIP_AD = "android.support.v4.media.session.action.SKIP_AD";
    public static final java.lang.String ACTION_UNFOLLOW = "android.support.v4.media.session.action.UNFOLLOW";
    public static final java.lang.String ARGUMENT_MEDIA_ATTRIBUTE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";
    public static final java.lang.String ARGUMENT_MEDIA_ATTRIBUTE_VALUE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";
    private static final java.lang.String DATA_CALLING_PACKAGE = "data_calling_pkg";
    private static final java.lang.String DATA_CALLING_PID = "data_calling_pid";
    private static final java.lang.String DATA_CALLING_UID = "data_calling_uid";
    private static final java.lang.String DATA_EXTRAS = "data_extras";
    public static final int FLAG_HANDLES_MEDIA_BUTTONS = 1;
    public static final int FLAG_HANDLES_QUEUE_COMMANDS = 4;
    public static final int FLAG_HANDLES_TRANSPORT_CONTROLS = 2;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String KEY_EXTRA_BINDER = "android.support.v4.media.session.EXTRA_BINDER";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final java.lang.String KEY_SESSION_TOKEN2_BUNDLE = "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final java.lang.String KEY_TOKEN = "android.support.v4.media.session.TOKEN";
    private static final int MAX_BITMAP_SIZE_IN_DP = 320;
    public static final int MEDIA_ATTRIBUTE_ALBUM = 1;
    public static final int MEDIA_ATTRIBUTE_ARTIST = 0;
    public static final int MEDIA_ATTRIBUTE_PLAYLIST = 2;
    static final java.lang.String TAG = "MediaSessionCompat";
    static int sMaxBitmapSize;
    private final java.util.ArrayList<android.support.v4.media.session.MediaSessionCompat.OnActiveChangeListener> mActiveListeners;
    private final android.support.v4.media.session.MediaControllerCompat mController;
    private final android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl mImpl;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Callback {
        private android.support.v4.media.session.MediaSessionCompat.Callback.CallbackHandler mCallbackHandler;
        final java.lang.Object mCallbackObj;
        private boolean mMediaPlayPauseKeyPending;
        java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl> mSessionImpl;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private class CallbackHandler extends android.os.Handler {
            private static final int MSG_MEDIA_PLAY_PAUSE_KEY_DOUBLE_TAP_TIMEOUT = 1;
            final /* synthetic */ android.support.v4.media.session.MediaSessionCompat.Callback this$0;

            CallbackHandler(android.support.v4.media.session.MediaSessionCompat.Callback r1, android.os.Looper r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>(r2)
                    return
            }

            @Override // android.os.Handler
            public void handleMessage(android.os.Message r3) {
                    r2 = this;
                    int r0 = r3.what
                    r1 = 1
                    if (r0 != r1) goto Le
                    android.support.v4.media.session.MediaSessionCompat$Callback r0 = r2.this$0
                    java.lang.Object r3 = r3.obj
                    androidx.media.MediaSessionManager$RemoteUserInfo r3 = (androidx.media.MediaSessionManager.RemoteUserInfo) r3
                    r0.handleMediaPlayPauseKeySingleTapIfPending(r3)
                Le:
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @androidx.annotation.RequiresApi(21)
        private class StubApi21 implements android.support.v4.media.session.MediaSessionCompatApi21.Callback {
            final /* synthetic */ android.support.v4.media.session.MediaSessionCompat.Callback this$0;

            StubApi21(android.support.v4.media.session.MediaSessionCompat.Callback r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
            public void onCommand(java.lang.String r5, android.os.Bundle r6, android.os.ResultReceiver r7) {
                    r4 = this;
                    java.lang.String r0 = "android.support.v4.media.session.command.GET_EXTRA_BINDER"
                    boolean r0 = r5.equals(r0)     // Catch: android.os.BadParcelableException -> Lc1
                    r1 = 0
                    if (r0 == 0) goto L3c
                    android.support.v4.media.session.MediaSessionCompat$Callback r5 = r4.this$0     // Catch: android.os.BadParcelableException -> Lc1
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl> r5 = r5.mSessionImpl     // Catch: android.os.BadParcelableException -> Lc1
                    java.lang.Object r5 = r5.get()     // Catch: android.os.BadParcelableException -> Lc1
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21 r5 = (android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21) r5     // Catch: android.os.BadParcelableException -> Lc1
                    if (r5 == 0) goto Lbb
                    android.os.Bundle r6 = new android.os.Bundle     // Catch: android.os.BadParcelableException -> Lc1
                    r6.<init>()     // Catch: android.os.BadParcelableException -> Lc1
                    android.support.v4.media.session.MediaSessionCompat$Token r5 = r5.getSessionToken()     // Catch: android.os.BadParcelableException -> Lc1
                    android.support.v4.media.session.IMediaSession r0 = r5.getExtraBinder()     // Catch: android.os.BadParcelableException -> Lc1
                    java.lang.String r2 = "android.support.v4.media.session.EXTRA_BINDER"
                    if (r0 != 0) goto L27
                    goto L2b
                L27:
                    android.os.IBinder r1 = r0.asBinder()     // Catch: android.os.BadParcelableException -> Lc1
                L2b:
                    androidx.core.app.BundleCompat.putBinder(r6, r2, r1)     // Catch: android.os.BadParcelableException -> Lc1
                    android.os.Bundle r5 = r5.getSessionToken2Bundle()     // Catch: android.os.BadParcelableException -> Lc1
                    java.lang.String r0 = "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"
                    r6.putBundle(r0, r5)     // Catch: android.os.BadParcelableException -> Lc1
                    r5 = 0
                    r7.send(r5, r6)     // Catch: android.os.BadParcelableException -> Lc1
                    return
                L3c:
                    java.lang.String r0 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM"
                    boolean r0 = r5.equals(r0)     // Catch: android.os.BadParcelableException -> Lc1
                    java.lang.String r2 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"
                    if (r0 == 0) goto L52
                    android.support.v4.media.session.MediaSessionCompat$Callback r5 = r4.this$0     // Catch: android.os.BadParcelableException -> Lc1
                    android.os.Parcelable r6 = r6.getParcelable(r2)     // Catch: android.os.BadParcelableException -> Lc1
                    android.support.v4.media.MediaDescriptionCompat r6 = (android.support.v4.media.MediaDescriptionCompat) r6     // Catch: android.os.BadParcelableException -> Lc1
                    r5.onAddQueueItem(r6)     // Catch: android.os.BadParcelableException -> Lc1
                    return
                L52:
                    java.lang.String r0 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"
                    boolean r0 = r5.equals(r0)     // Catch: android.os.BadParcelableException -> Lc1
                    java.lang.String r3 = "android.support.v4.media.session.command.ARGUMENT_INDEX"
                    if (r0 == 0) goto L6c
                    android.support.v4.media.session.MediaSessionCompat$Callback r5 = r4.this$0     // Catch: android.os.BadParcelableException -> Lc1
                    android.os.Parcelable r7 = r6.getParcelable(r2)     // Catch: android.os.BadParcelableException -> Lc1
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.v4.media.MediaDescriptionCompat) r7     // Catch: android.os.BadParcelableException -> Lc1
                    int r6 = r6.getInt(r3)     // Catch: android.os.BadParcelableException -> Lc1
                    r5.onAddQueueItem(r7, r6)     // Catch: android.os.BadParcelableException -> Lc1
                    return
                L6c:
                    java.lang.String r0 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"
                    boolean r0 = r5.equals(r0)     // Catch: android.os.BadParcelableException -> Lc1
                    if (r0 == 0) goto L80
                    android.support.v4.media.session.MediaSessionCompat$Callback r5 = r4.this$0     // Catch: android.os.BadParcelableException -> Lc1
                    android.os.Parcelable r6 = r6.getParcelable(r2)     // Catch: android.os.BadParcelableException -> Lc1
                    android.support.v4.media.MediaDescriptionCompat r6 = (android.support.v4.media.MediaDescriptionCompat) r6     // Catch: android.os.BadParcelableException -> Lc1
                    r5.onRemoveQueueItem(r6)     // Catch: android.os.BadParcelableException -> Lc1
                    return
                L80:
                    java.lang.String r0 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"
                    boolean r0 = r5.equals(r0)     // Catch: android.os.BadParcelableException -> Lc1
                    if (r0 == 0) goto Lbc
                    android.support.v4.media.session.MediaSessionCompat$Callback r5 = r4.this$0     // Catch: android.os.BadParcelableException -> Lc1
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl> r5 = r5.mSessionImpl     // Catch: android.os.BadParcelableException -> Lc1
                    java.lang.Object r5 = r5.get()     // Catch: android.os.BadParcelableException -> Lc1
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21 r5 = (android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21) r5     // Catch: android.os.BadParcelableException -> Lc1
                    if (r5 == 0) goto Lbb
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r5.mQueue     // Catch: android.os.BadParcelableException -> Lc1
                    if (r7 == 0) goto Lbb
                    r7 = -1
                    int r6 = r6.getInt(r3, r7)     // Catch: android.os.BadParcelableException -> Lc1
                    if (r6 < 0) goto Lb0
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r5.mQueue     // Catch: android.os.BadParcelableException -> Lc1
                    int r7 = r7.size()     // Catch: android.os.BadParcelableException -> Lc1
                    if (r6 >= r7) goto Lb0
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r5 = r5.mQueue     // Catch: android.os.BadParcelableException -> Lc1
                    java.lang.Object r5 = r5.get(r6)     // Catch: android.os.BadParcelableException -> Lc1
                    r1 = r5
                    android.support.v4.media.session.MediaSessionCompat$QueueItem r1 = (android.support.v4.media.session.MediaSessionCompat.QueueItem) r1     // Catch: android.os.BadParcelableException -> Lc1
                Lb0:
                    if (r1 == 0) goto Lbb
                    android.support.v4.media.session.MediaSessionCompat$Callback r5 = r4.this$0     // Catch: android.os.BadParcelableException -> Lc1
                    android.support.v4.media.MediaDescriptionCompat r6 = r1.getDescription()     // Catch: android.os.BadParcelableException -> Lc1
                    r5.onRemoveQueueItem(r6)     // Catch: android.os.BadParcelableException -> Lc1
                Lbb:
                    return
                Lbc:
                    android.support.v4.media.session.MediaSessionCompat$Callback r0 = r4.this$0     // Catch: android.os.BadParcelableException -> Lc1
                    r0.onCommand(r5, r6, r7)     // Catch: android.os.BadParcelableException -> Lc1
                Lc1:
                    return
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
            public void onCustomAction(java.lang.String r4, android.os.Bundle r5) {
                    r3 = this;
                    java.lang.String r0 = "android.support.v4.media.session.action.ARGUMENT_EXTRAS"
                    android.os.Bundle r0 = r5.getBundle(r0)
                    android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r0)
                    java.lang.String r1 = "android.support.v4.media.session.action.PLAY_FROM_URI"
                    boolean r1 = r4.equals(r1)
                    java.lang.String r2 = "android.support.v4.media.session.action.ARGUMENT_URI"
                    if (r1 == 0) goto L1f
                    android.os.Parcelable r4 = r5.getParcelable(r2)
                    android.net.Uri r4 = (android.net.Uri) r4
                    android.support.v4.media.session.MediaSessionCompat$Callback r5 = r3.this$0
                    r5.onPlayFromUri(r4, r0)
                    return
                L1f:
                    java.lang.String r1 = "android.support.v4.media.session.action.PREPARE"
                    boolean r1 = r4.equals(r1)
                    if (r1 == 0) goto L2d
                    android.support.v4.media.session.MediaSessionCompat$Callback r4 = r3.this$0
                    r4.onPrepare()
                    return
                L2d:
                    java.lang.String r1 = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID"
                    boolean r1 = r4.equals(r1)
                    if (r1 == 0) goto L41
                    java.lang.String r4 = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"
                    java.lang.String r4 = r5.getString(r4)
                    android.support.v4.media.session.MediaSessionCompat$Callback r5 = r3.this$0
                    r5.onPrepareFromMediaId(r4, r0)
                    return
                L41:
                    java.lang.String r1 = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH"
                    boolean r1 = r4.equals(r1)
                    if (r1 == 0) goto L55
                    java.lang.String r4 = "android.support.v4.media.session.action.ARGUMENT_QUERY"
                    java.lang.String r4 = r5.getString(r4)
                    android.support.v4.media.session.MediaSessionCompat$Callback r5 = r3.this$0
                    r5.onPrepareFromSearch(r4, r0)
                    return
                L55:
                    java.lang.String r1 = "android.support.v4.media.session.action.PREPARE_FROM_URI"
                    boolean r1 = r4.equals(r1)
                    if (r1 == 0) goto L69
                    android.os.Parcelable r4 = r5.getParcelable(r2)
                    android.net.Uri r4 = (android.net.Uri) r4
                    android.support.v4.media.session.MediaSessionCompat$Callback r5 = r3.this$0
                    r5.onPrepareFromUri(r4, r0)
                    return
                L69:
                    java.lang.String r1 = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED"
                    boolean r1 = r4.equals(r1)
                    if (r1 == 0) goto L7d
                    java.lang.String r4 = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"
                    boolean r4 = r5.getBoolean(r4)
                    android.support.v4.media.session.MediaSessionCompat$Callback r5 = r3.this$0
                    r5.onSetCaptioningEnabled(r4)
                    return
                L7d:
                    java.lang.String r1 = "android.support.v4.media.session.action.SET_REPEAT_MODE"
                    boolean r1 = r4.equals(r1)
                    if (r1 == 0) goto L91
                    java.lang.String r4 = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"
                    int r4 = r5.getInt(r4)
                    android.support.v4.media.session.MediaSessionCompat$Callback r5 = r3.this$0
                    r5.onSetRepeatMode(r4)
                    return
                L91:
                    java.lang.String r1 = "android.support.v4.media.session.action.SET_SHUFFLE_MODE"
                    boolean r1 = r4.equals(r1)
                    if (r1 == 0) goto La5
                    java.lang.String r4 = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"
                    int r4 = r5.getInt(r4)
                    android.support.v4.media.session.MediaSessionCompat$Callback r5 = r3.this$0
                    r5.onSetShuffleMode(r4)
                    return
                La5:
                    java.lang.String r1 = "android.support.v4.media.session.action.SET_RATING"
                    boolean r1 = r4.equals(r1)
                    if (r1 == 0) goto Lbb
                    java.lang.String r4 = "android.support.v4.media.session.action.ARGUMENT_RATING"
                    android.os.Parcelable r4 = r5.getParcelable(r4)
                    android.support.v4.media.RatingCompat r4 = (android.support.v4.media.RatingCompat) r4
                    android.support.v4.media.session.MediaSessionCompat$Callback r5 = r3.this$0
                    r5.onSetRating(r4, r0)
                    return
                Lbb:
                    android.support.v4.media.session.MediaSessionCompat$Callback r0 = r3.this$0
                    r0.onCustomAction(r4, r5)
                    return
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
            public void onFastForward() {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$Callback r0 = r1.this$0
                    r0.onFastForward()
                    return
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
            public boolean onMediaButtonEvent(android.content.Intent r2) {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$Callback r0 = r1.this$0
                    boolean r2 = r0.onMediaButtonEvent(r2)
                    return r2
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
            public void onPause() {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$Callback r0 = r1.this$0
                    r0.onPause()
                    return
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
            public void onPlay() {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$Callback r0 = r1.this$0
                    r0.onPlay()
                    return
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
            public void onPlayFromMediaId(java.lang.String r2, android.os.Bundle r3) {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$Callback r0 = r1.this$0
                    r0.onPlayFromMediaId(r2, r3)
                    return
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
            public void onPlayFromSearch(java.lang.String r2, android.os.Bundle r3) {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$Callback r0 = r1.this$0
                    r0.onPlayFromSearch(r2, r3)
                    return
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
            public void onRewind() {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$Callback r0 = r1.this$0
                    r0.onRewind()
                    return
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
            public void onSeekTo(long r2) {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$Callback r0 = r1.this$0
                    r0.onSeekTo(r2)
                    return
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
            public void onSetRating(java.lang.Object r2) {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$Callback r0 = r1.this$0
                    android.support.v4.media.RatingCompat r2 = android.support.v4.media.RatingCompat.fromRating(r2)
                    r0.onSetRating(r2)
                    return
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
            public void onSetRating(java.lang.Object r1, android.os.Bundle r2) {
                    r0 = this;
                    return
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
            public void onSkipToNext() {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$Callback r0 = r1.this$0
                    r0.onSkipToNext()
                    return
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
            public void onSkipToPrevious() {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$Callback r0 = r1.this$0
                    r0.onSkipToPrevious()
                    return
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
            public void onSkipToQueueItem(long r2) {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$Callback r0 = r1.this$0
                    r0.onSkipToQueueItem(r2)
                    return
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi21.Callback
            public void onStop() {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$Callback r0 = r1.this$0
                    r0.onStop()
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @androidx.annotation.RequiresApi(23)
        private class StubApi23 extends android.support.v4.media.session.MediaSessionCompat.Callback.StubApi21 implements android.support.v4.media.session.MediaSessionCompatApi23.Callback {
            final /* synthetic */ android.support.v4.media.session.MediaSessionCompat.Callback this$0;

            StubApi23(android.support.v4.media.session.MediaSessionCompat.Callback r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>(r1)
                    return
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi23.Callback
            public void onPlayFromUri(android.net.Uri r2, android.os.Bundle r3) {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$Callback r0 = r1.this$0
                    r0.onPlayFromUri(r2, r3)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @androidx.annotation.RequiresApi(24)
        private class StubApi24 extends android.support.v4.media.session.MediaSessionCompat.Callback.StubApi23 implements android.support.v4.media.session.MediaSessionCompatApi24.Callback {
            final /* synthetic */ android.support.v4.media.session.MediaSessionCompat.Callback this$0;

            StubApi24(android.support.v4.media.session.MediaSessionCompat.Callback r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>(r1)
                    return
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi24.Callback
            public void onPrepare() {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$Callback r0 = r1.this$0
                    r0.onPrepare()
                    return
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi24.Callback
            public void onPrepareFromMediaId(java.lang.String r2, android.os.Bundle r3) {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$Callback r0 = r1.this$0
                    r0.onPrepareFromMediaId(r2, r3)
                    return
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi24.Callback
            public void onPrepareFromSearch(java.lang.String r2, android.os.Bundle r3) {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$Callback r0 = r1.this$0
                    r0.onPrepareFromSearch(r2, r3)
                    return
            }

            @Override // android.support.v4.media.session.MediaSessionCompatApi24.Callback
            public void onPrepareFromUri(android.net.Uri r2, android.os.Bundle r3) {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$Callback r0 = r1.this$0
                    r0.onPrepareFromUri(r2, r3)
                    return
            }
        }

        public Callback() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.mCallbackHandler = r0
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 24
                if (r0 < r1) goto L18
                android.support.v4.media.session.MediaSessionCompat$Callback$StubApi24 r0 = new android.support.v4.media.session.MediaSessionCompat$Callback$StubApi24
                r0.<init>(r2)
                java.lang.Object r0 = android.support.v4.media.session.MediaSessionCompatApi24.createCallback(r0)
                r2.mCallbackObj = r0
                return
            L18:
                r1 = 23
                if (r0 < r1) goto L28
                android.support.v4.media.session.MediaSessionCompat$Callback$StubApi23 r0 = new android.support.v4.media.session.MediaSessionCompat$Callback$StubApi23
                r0.<init>(r2)
                java.lang.Object r0 = android.support.v4.media.session.MediaSessionCompatApi23.createCallback(r0)
                r2.mCallbackObj = r0
                return
            L28:
                android.support.v4.media.session.MediaSessionCompat$Callback$StubApi21 r0 = new android.support.v4.media.session.MediaSessionCompat$Callback$StubApi21
                r0.<init>(r2)
                java.lang.Object r0 = android.support.v4.media.session.MediaSessionCompatApi21.createCallback(r0)
                r2.mCallbackObj = r0
                return
        }

        void handleMediaPlayPauseKeySingleTapIfPending(androidx.media.MediaSessionManager.RemoteUserInfo r12) {
                r11 = this;
                boolean r0 = r11.mMediaPlayPauseKeyPending
                if (r0 != 0) goto L5
                goto L18
            L5:
                r0 = 0
                r11.mMediaPlayPauseKeyPending = r0
                android.support.v4.media.session.MediaSessionCompat$Callback$CallbackHandler r1 = r11.mCallbackHandler
                r2 = 1
                r1.removeMessages(r2)
                java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl> r1 = r11.mSessionImpl
                java.lang.Object r1 = r1.get()
                android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r1 = (android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl) r1
                if (r1 != 0) goto L19
            L18:
                return
            L19:
                android.support.v4.media.session.PlaybackStateCompat r3 = r1.getPlaybackState()
                r4 = 0
                if (r3 != 0) goto L23
                r6 = r4
                goto L27
            L23:
                long r6 = r3.getActions()
            L27:
                if (r3 == 0) goto L32
                int r3 = r3.getState()
                r8 = 3
                if (r3 != r8) goto L32
                r3 = 1
                goto L33
            L32:
                r3 = 0
            L33:
                r8 = 516(0x204, double:2.55E-321)
                long r8 = r8 & r6
                int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r10 == 0) goto L3c
                r8 = 1
                goto L3d
            L3c:
                r8 = 0
            L3d:
                r9 = 514(0x202, double:2.54E-321)
                long r6 = r6 & r9
                int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r9 == 0) goto L45
                r0 = 1
            L45:
                r1.setCurrentControllerInfo(r12)
                if (r3 == 0) goto L50
                if (r0 == 0) goto L50
                r11.onPause()
                goto L57
            L50:
                if (r3 != 0) goto L57
                if (r8 == 0) goto L57
                r11.onPlay()
            L57:
                r12 = 0
                r1.setCurrentControllerInfo(r12)
                return
        }

        public void onAddQueueItem(android.support.v4.media.MediaDescriptionCompat r1) {
                r0 = this;
                return
        }

        public void onAddQueueItem(android.support.v4.media.MediaDescriptionCompat r1, int r2) {
                r0 = this;
                return
        }

        public void onCommand(java.lang.String r1, android.os.Bundle r2, android.os.ResultReceiver r3) {
                r0 = this;
                return
        }

        public void onCustomAction(java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        public void onFastForward() {
                r0 = this;
                return
        }

        public boolean onMediaButtonEvent(android.content.Intent r9) {
                r8 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 27
                r2 = 0
                if (r0 < r1) goto L8
                return r2
            L8:
                java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl> r0 = r8.mSessionImpl
                java.lang.Object r0 = r0.get()
                android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r0 = (android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl) r0
                if (r0 == 0) goto L7c
                android.support.v4.media.session.MediaSessionCompat$Callback$CallbackHandler r1 = r8.mCallbackHandler
                if (r1 != 0) goto L17
                goto L7c
            L17:
                java.lang.String r1 = "android.intent.extra.KEY_EVENT"
                android.os.Parcelable r9 = r9.getParcelableExtra(r1)
                android.view.KeyEvent r9 = (android.view.KeyEvent) r9
                if (r9 == 0) goto L7c
                int r1 = r9.getAction()
                if (r1 == 0) goto L28
                goto L7c
            L28:
                androidx.media.MediaSessionManager$RemoteUserInfo r1 = r0.getCurrentControllerInfo()
                int r3 = r9.getKeyCode()
                r4 = 79
                if (r3 == r4) goto L3c
                r4 = 85
                if (r3 == r4) goto L3c
                r8.handleMediaPlayPauseKeySingleTapIfPending(r1)
                return r2
            L3c:
                int r9 = r9.getRepeatCount()
                r3 = 1
                if (r9 <= 0) goto L47
                r8.handleMediaPlayPauseKeySingleTapIfPending(r1)
                goto L7b
            L47:
                boolean r9 = r8.mMediaPlayPauseKeyPending
                if (r9 == 0) goto L6b
                android.support.v4.media.session.MediaSessionCompat$Callback$CallbackHandler r9 = r8.mCallbackHandler
                r9.removeMessages(r3)
                r8.mMediaPlayPauseKeyPending = r2
                android.support.v4.media.session.PlaybackStateCompat r9 = r0.getPlaybackState()
                r0 = 0
                if (r9 != 0) goto L5c
                r4 = r0
                goto L60
            L5c:
                long r4 = r9.getActions()
            L60:
                r6 = 32
                long r4 = r4 & r6
                int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r9 == 0) goto L7b
                r8.onSkipToNext()
                goto L7b
            L6b:
                r8.mMediaPlayPauseKeyPending = r3
                android.support.v4.media.session.MediaSessionCompat$Callback$CallbackHandler r9 = r8.mCallbackHandler
                android.os.Message r0 = r9.obtainMessage(r3, r1)
                int r1 = android.view.ViewConfiguration.getDoubleTapTimeout()
                long r1 = (long) r1
                r9.sendMessageDelayed(r0, r1)
            L7b:
                return r3
            L7c:
                return r2
        }

        public void onPause() {
                r0 = this;
                return
        }

        public void onPlay() {
                r0 = this;
                return
        }

        public void onPlayFromMediaId(java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        public void onPlayFromSearch(java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        public void onPlayFromUri(android.net.Uri r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        public void onPrepare() {
                r0 = this;
                return
        }

        public void onPrepareFromMediaId(java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        public void onPrepareFromSearch(java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        public void onPrepareFromUri(android.net.Uri r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        public void onRemoveQueueItem(android.support.v4.media.MediaDescriptionCompat r1) {
                r0 = this;
                return
        }

        @java.lang.Deprecated
        public void onRemoveQueueItemAt(int r1) {
                r0 = this;
                return
        }

        public void onRewind() {
                r0 = this;
                return
        }

        public void onSeekTo(long r1) {
                r0 = this;
                return
        }

        public void onSetCaptioningEnabled(boolean r1) {
                r0 = this;
                return
        }

        public void onSetRating(android.support.v4.media.RatingCompat r1) {
                r0 = this;
                return
        }

        public void onSetRating(android.support.v4.media.RatingCompat r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        public void onSetRepeatMode(int r1) {
                r0 = this;
                return
        }

        public void onSetShuffleMode(int r1) {
                r0 = this;
                return
        }

        public void onSkipToNext() {
                r0 = this;
                return
        }

        public void onSkipToPrevious() {
                r0 = this;
                return
        }

        public void onSkipToQueueItem(long r1) {
                r0 = this;
                return
        }

        public void onStop() {
                r0 = this;
                return
        }

        void setSessionImpl(android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl r2, android.os.Handler r3) {
                r1 = this;
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mSessionImpl = r0
                android.support.v4.media.session.MediaSessionCompat$Callback$CallbackHandler r2 = r1.mCallbackHandler
                if (r2 == 0) goto Lf
                r0 = 0
                r2.removeCallbacksAndMessages(r0)
            Lf:
                android.support.v4.media.session.MediaSessionCompat$Callback$CallbackHandler r2 = new android.support.v4.media.session.MediaSessionCompat$Callback$CallbackHandler
                android.os.Looper r3 = r3.getLooper()
                r2.<init>(r1, r3)
                r1.mCallbackHandler = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface MediaSessionImpl {
        java.lang.String getCallingPackage();

        androidx.media.MediaSessionManager.RemoteUserInfo getCurrentControllerInfo();

        java.lang.Object getMediaSession();

        android.support.v4.media.session.PlaybackStateCompat getPlaybackState();

        java.lang.Object getRemoteControlClient();

        android.support.v4.media.session.MediaSessionCompat.Token getSessionToken();

        boolean isActive();

        void release();

        void sendSessionEvent(java.lang.String r1, android.os.Bundle r2);

        void setActive(boolean r1);

        void setCallback(android.support.v4.media.session.MediaSessionCompat.Callback r1, android.os.Handler r2);

        void setCaptioningEnabled(boolean r1);

        void setCurrentControllerInfo(androidx.media.MediaSessionManager.RemoteUserInfo r1);

        void setExtras(android.os.Bundle r1);

        void setFlags(int r1);

        void setMediaButtonReceiver(android.app.PendingIntent r1);

        void setMetadata(android.support.v4.media.MediaMetadataCompat r1);

        void setPlaybackState(android.support.v4.media.session.PlaybackStateCompat r1);

        void setPlaybackToLocal(int r1);

        void setPlaybackToRemote(androidx.media.VolumeProviderCompat r1);

        void setQueue(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> r1);

        void setQueueTitle(java.lang.CharSequence r1);

        void setRatingType(int r1);

        void setRepeatMode(int r1);

        void setSessionActivity(android.app.PendingIntent r1);

        void setShuffleMode(int r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(18)
    static class MediaSessionImplApi18 extends android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase {
        private static boolean sIsMbrPendingIntentSupported = true;


        static {
                return
        }

        MediaSessionImplApi18(android.content.Context r1, java.lang.String r2, android.content.ComponentName r3, android.app.PendingIntent r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        int getRccTransportControlFlagsFromActions(long r5) {
                r4 = this;
                int r0 = super.getRccTransportControlFlagsFromActions(r5)
                r1 = 256(0x100, double:1.265E-321)
                long r5 = r5 & r1
                r1 = 0
                int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r3 == 0) goto L10
                r5 = r0 | 256(0x100, float:3.59E-43)
                return r5
            L10:
                return r0
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        void registerMediaButtonEventReceiver(android.app.PendingIntent r2, android.content.ComponentName r3) {
                r1 = this;
                boolean r0 = android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18.sIsMbrPendingIntentSupported
                if (r0 == 0) goto Ld
                android.media.AudioManager r0 = r1.mAudioManager     // Catch: java.lang.NullPointerException -> La
                r0.registerMediaButtonEventReceiver(r2)     // Catch: java.lang.NullPointerException -> La
                goto Ld
            La:
                r0 = 0
                android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18.sIsMbrPendingIntentSupported = r0
            Ld:
                boolean r0 = android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18.sIsMbrPendingIntentSupported
                if (r0 != 0) goto L14
                super.registerMediaButtonEventReceiver(r2, r3)
            L14:
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCallback(android.support.v4.media.session.MediaSessionCompat.Callback r1, android.os.Handler r2) {
                r0 = this;
                super.setCallback(r1, r2)
                if (r1 != 0) goto Lc
                android.media.RemoteControlClient r1 = r0.mRcc
                r2 = 0
                r1.setPlaybackPositionUpdateListener(r2)
                return
            Lc:
                android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi18$1 r1 = new android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi18$1
                r1.<init>(r0)
                android.media.RemoteControlClient r2 = r0.mRcc
                r2.setPlaybackPositionUpdateListener(r1)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        void setRccState(android.support.v4.media.session.PlaybackStateCompat r11) {
                r10 = this;
                long r0 = r11.getPosition()
                float r2 = r11.getPlaybackSpeed()
                long r3 = r11.getLastPositionUpdateTime()
                long r5 = android.os.SystemClock.elapsedRealtime()
                int r7 = r11.getState()
                r8 = 3
                if (r7 != r8) goto L33
                r7 = 0
                int r9 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r9 <= 0) goto L33
                int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r9 <= 0) goto L32
                long r7 = r5 - r3
                r3 = 0
                int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r3 <= 0) goto L32
                r3 = 1065353216(0x3f800000, float:1.0)
                int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r3 == 0) goto L32
                float r3 = (float) r7
                float r3 = r3 * r2
                long r7 = (long) r3
            L32:
                long r0 = r0 + r7
            L33:
                android.media.RemoteControlClient r3 = r10.mRcc
                int r11 = r11.getState()
                int r11 = r10.getRccStateFromState(r11)
                r3.setPlaybackState(r11, r0, r2)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        void unregisterMediaButtonEventReceiver(android.app.PendingIntent r2, android.content.ComponentName r3) {
                r1 = this;
                boolean r0 = android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18.sIsMbrPendingIntentSupported
                if (r0 == 0) goto La
                android.media.AudioManager r3 = r1.mAudioManager
                r3.unregisterMediaButtonEventReceiver(r2)
                return
            La:
                super.unregisterMediaButtonEventReceiver(r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(19)
    static class MediaSessionImplApi19 extends android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18 {


        MediaSessionImplApi19(android.content.Context r1, java.lang.String r2, android.content.ComponentName r3, android.app.PendingIntent r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        android.media.RemoteControlClient.MetadataEditor buildRccMetadata(android.os.Bundle r9) {
                r8 = this;
                android.media.RemoteControlClient$MetadataEditor r0 = super.buildRccMetadata(r9)
                android.support.v4.media.session.PlaybackStateCompat r1 = r8.mState
                r2 = 0
                if (r1 != 0) goto Lc
                r4 = r2
                goto L10
            Lc:
                long r4 = r1.getActions()
            L10:
                r6 = 128(0x80, double:6.3E-322)
                long r4 = r4 & r6
                r1 = 268435457(0x10000001, float:2.5243552E-29)
                int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r6 == 0) goto L1d
                r0.addEditableKey(r1)
            L1d:
                if (r9 != 0) goto L20
                goto L51
            L20:
                java.lang.String r2 = "android.media.metadata.YEAR"
                boolean r3 = r9.containsKey(r2)
                if (r3 == 0) goto L31
                r3 = 8
                long r4 = r9.getLong(r2)
                r0.putLong(r3, r4)
            L31:
                java.lang.String r2 = "android.media.metadata.RATING"
                boolean r3 = r9.containsKey(r2)
                if (r3 == 0) goto L42
                r3 = 101(0x65, float:1.42E-43)
                android.os.Parcelable r2 = r9.getParcelable(r2)
                r0.putObject(r3, r2)
            L42:
                java.lang.String r2 = "android.media.metadata.USER_RATING"
                boolean r3 = r9.containsKey(r2)
                if (r3 == 0) goto L51
                android.os.Parcelable r9 = r9.getParcelable(r2)
                r0.putObject(r1, r9)
            L51:
                return r0
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18, android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        int getRccTransportControlFlagsFromActions(long r5) {
                r4 = this;
                int r0 = super.getRccTransportControlFlagsFromActions(r5)
                r1 = 128(0x80, double:6.3E-322)
                long r5 = r5 & r1
                r1 = 0
                int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r3 == 0) goto L10
                r5 = r0 | 512(0x200, float:7.17E-43)
                return r5
            L10:
                return r0
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18, android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCallback(android.support.v4.media.session.MediaSessionCompat.Callback r1, android.os.Handler r2) {
                r0 = this;
                super.setCallback(r1, r2)
                if (r1 != 0) goto Lc
                android.media.RemoteControlClient r1 = r0.mRcc
                r2 = 0
                r1.setMetadataUpdateListener(r2)
                return
            Lc:
                android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi19$1 r1 = new android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi19$1
                r1.<init>(r0)
                android.media.RemoteControlClient r2 = r0.mRcc
                r2.setMetadataUpdateListener(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static class MediaSessionImplApi21 implements android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl {
        boolean mCaptioningEnabled;
        boolean mDestroyed;
        final android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> mExtraControllerCallbacks;
        android.support.v4.media.MediaMetadataCompat mMetadata;
        android.support.v4.media.session.PlaybackStateCompat mPlaybackState;
        java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> mQueue;
        int mRatingType;
        int mRepeatMode;
        final java.lang.Object mSessionObj;
        int mShuffleMode;
        final android.support.v4.media.session.MediaSessionCompat.Token mToken;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class ExtraSession extends android.support.v4.media.session.IMediaSession.Stub {
            final /* synthetic */ android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 this$0;

            ExtraSession(android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItem(android.support.v4.media.MediaDescriptionCompat r1) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItemAt(android.support.v4.media.MediaDescriptionCompat r1, int r2) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void adjustVolume(int r1, int r2, java.lang.String r3) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void fastForward() throws android.os.RemoteException {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.os.Bundle getExtras() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public long getFlags() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.app.PendingIntent getLaunchPendingIntent() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.support.v4.media.MediaMetadataCompat getMetadata() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.lang.String getPackageName() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.support.v4.media.session.PlaybackStateCompat getPlaybackState() {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21 r0 = r2.this$0
                    android.support.v4.media.session.PlaybackStateCompat r1 = r0.mPlaybackState
                    android.support.v4.media.MediaMetadataCompat r0 = r0.mMetadata
                    android.support.v4.media.session.PlaybackStateCompat r0 = android.support.v4.media.session.MediaSessionCompat.getStateWithUpdatedPosition(r1, r0)
                    return r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> getQueue() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.lang.CharSequence getQueueTitle() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRatingType() {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21 r0 = r1.this$0
                    int r0 = r0.mRatingType
                    return r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRepeatMode() {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21 r0 = r1.this$0
                    int r0 = r0.mRepeatMode
                    return r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getShuffleMode() {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21 r0 = r1.this$0
                    int r0 = r0.mShuffleMode
                    return r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.lang.String getTag() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.support.v4.media.session.ParcelableVolumeInfo getVolumeAttributes() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isCaptioningEnabled() {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21 r0 = r1.this$0
                    boolean r0 = r0.mCaptioningEnabled
                    return r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isShuffleModeEnabledRemoved() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isTransportControlEnabled() {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void next() throws android.os.RemoteException {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void pause() throws android.os.RemoteException {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void play() throws android.os.RemoteException {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromMediaId(java.lang.String r1, android.os.Bundle r2) throws android.os.RemoteException {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromSearch(java.lang.String r1, android.os.Bundle r2) throws android.os.RemoteException {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromUri(android.net.Uri r1, android.os.Bundle r2) throws android.os.RemoteException {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepare() throws android.os.RemoteException {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromMediaId(java.lang.String r1, android.os.Bundle r2) throws android.os.RemoteException {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromSearch(java.lang.String r1, android.os.Bundle r2) throws android.os.RemoteException {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromUri(android.net.Uri r1, android.os.Bundle r2) throws android.os.RemoteException {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void previous() throws android.os.RemoteException {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rate(android.support.v4.media.RatingCompat r1) throws android.os.RemoteException {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rateWithExtras(android.support.v4.media.RatingCompat r1, android.os.Bundle r2) throws android.os.RemoteException {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void registerCallbackListener(android.support.v4.media.session.IMediaControllerCallback r5) {
                    r4 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21 r0 = r4.this$0
                    boolean r1 = r0.mDestroyed
                    if (r1 != 0) goto L22
                    java.lang.String r0 = r0.getCallingPackage()
                    if (r0 != 0) goto Le
                    java.lang.String r0 = "android.media.session.MediaController"
                Le:
                    androidx.media.MediaSessionManager$RemoteUserInfo r1 = new androidx.media.MediaSessionManager$RemoteUserInfo
                    int r2 = android.os.Binder.getCallingPid()
                    int r3 = android.os.Binder.getCallingUid()
                    r1.<init>(r0, r2, r3)
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21 r0 = r4.this$0
                    android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mExtraControllerCallbacks
                    r0.register(r5, r1)
                L22:
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItem(android.support.v4.media.MediaDescriptionCompat r1) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItemAt(int r1) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rewind() throws android.os.RemoteException {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void seekTo(long r1) throws android.os.RemoteException {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCommand(java.lang.String r1, android.os.Bundle r2, android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper r3) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCustomAction(java.lang.String r1, android.os.Bundle r2) throws android.os.RemoteException {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean sendMediaButton(android.view.KeyEvent r1) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setCaptioningEnabled(boolean r1) throws android.os.RemoteException {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setRepeatMode(int r1) throws android.os.RemoteException {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleMode(int r1) throws android.os.RemoteException {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleModeEnabledRemoved(boolean r1) throws android.os.RemoteException {
                    r0 = this;
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setVolumeTo(int r1, int r2, java.lang.String r3) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void skipToQueueItem(long r1) {
                    r0 = this;
                    java.lang.AssertionError r1 = new java.lang.AssertionError
                    r1.<init>()
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void stop() throws android.os.RemoteException {
                    r1 = this;
                    java.lang.AssertionError r0 = new java.lang.AssertionError
                    r0.<init>()
                    throw r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void unregisterCallbackListener(android.support.v4.media.session.IMediaControllerCallback r2) {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21 r0 = r1.this$0
                    android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mExtraControllerCallbacks
                    r0.unregister(r2)
                    return
            }
        }

        MediaSessionImplApi21(android.content.Context r2, java.lang.String r3, android.os.Bundle r4) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mDestroyed = r0
                android.os.RemoteCallbackList r0 = new android.os.RemoteCallbackList
                r0.<init>()
                r1.mExtraControllerCallbacks = r0
                java.lang.Object r2 = android.support.v4.media.session.MediaSessionCompatApi21.createSession(r2, r3)
                r1.mSessionObj = r2
                android.support.v4.media.session.MediaSessionCompat$Token r3 = new android.support.v4.media.session.MediaSessionCompat$Token
                android.os.Parcelable r2 = android.support.v4.media.session.MediaSessionCompatApi21.getSessionToken(r2)
                android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21$ExtraSession r0 = new android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21$ExtraSession
                r0.<init>(r1)
                r3.<init>(r2, r0, r4)
                r1.mToken = r3
                return
        }

        MediaSessionImplApi21(java.lang.Object r3) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.mDestroyed = r0
                android.os.RemoteCallbackList r0 = new android.os.RemoteCallbackList
                r0.<init>()
                r2.mExtraControllerCallbacks = r0
                java.lang.Object r3 = android.support.v4.media.session.MediaSessionCompatApi21.verifySession(r3)
                r2.mSessionObj = r3
                android.support.v4.media.session.MediaSessionCompat$Token r0 = new android.support.v4.media.session.MediaSessionCompat$Token
                android.os.Parcelable r3 = android.support.v4.media.session.MediaSessionCompatApi21.getSessionToken(r3)
                android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21$ExtraSession r1 = new android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21$ExtraSession
                r1.<init>(r2)
                r0.<init>(r3, r1)
                r2.mToken = r0
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public java.lang.String getCallingPackage() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 24
                if (r0 >= r1) goto L8
                r0 = 0
                return r0
            L8:
                java.lang.Object r0 = r2.mSessionObj
                java.lang.String r0 = android.support.v4.media.session.MediaSessionCompatApi24.getCallingPackage(r0)
                return r0
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public androidx.media.MediaSessionManager.RemoteUserInfo getCurrentControllerInfo() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public java.lang.Object getMediaSession() {
                r1 = this;
                java.lang.Object r0 = r1.mSessionObj
                return r0
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public android.support.v4.media.session.PlaybackStateCompat getPlaybackState() {
                r1 = this;
                android.support.v4.media.session.PlaybackStateCompat r0 = r1.mPlaybackState
                return r0
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public java.lang.Object getRemoteControlClient() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken() {
                r1 = this;
                android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.mToken
                return r0
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public boolean isActive() {
                r1 = this;
                java.lang.Object r0 = r1.mSessionObj
                boolean r0 = android.support.v4.media.session.MediaSessionCompatApi21.isActive(r0)
                return r0
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void release() {
                r1 = this;
                r0 = 1
                r1.mDestroyed = r0
                java.lang.Object r0 = r1.mSessionObj
                android.support.v4.media.session.MediaSessionCompatApi21.release(r0)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void sendSessionEvent(java.lang.String r3, android.os.Bundle r4) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 23
                if (r0 >= r1) goto L23
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mExtraControllerCallbacks
                int r0 = r0.beginBroadcast()
                int r0 = r0 + (-1)
            Le:
                if (r0 < 0) goto L1e
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mExtraControllerCallbacks
                android.os.IInterface r1 = r1.getBroadcastItem(r0)
                android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                r1.onEvent(r3, r4)     // Catch: android.os.RemoteException -> L1b
            L1b:
                int r0 = r0 + (-1)
                goto Le
            L1e:
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mExtraControllerCallbacks
                r0.finishBroadcast()
            L23:
                java.lang.Object r0 = r2.mSessionObj
                android.support.v4.media.session.MediaSessionCompatApi21.sendSessionEvent(r0, r3, r4)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setActive(boolean r2) {
                r1 = this;
                java.lang.Object r0 = r1.mSessionObj
                android.support.v4.media.session.MediaSessionCompatApi21.setActive(r0, r2)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCallback(android.support.v4.media.session.MediaSessionCompat.Callback r3, android.os.Handler r4) {
                r2 = this;
                java.lang.Object r0 = r2.mSessionObj
                if (r3 != 0) goto L6
                r1 = 0
                goto L8
            L6:
                java.lang.Object r1 = r3.mCallbackObj
            L8:
                android.support.v4.media.session.MediaSessionCompatApi21.setCallback(r0, r1, r4)
                if (r3 == 0) goto L10
                r3.setSessionImpl(r2, r4)
            L10:
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCaptioningEnabled(boolean r3) {
                r2 = this;
                boolean r0 = r2.mCaptioningEnabled
                if (r0 == r3) goto L23
                r2.mCaptioningEnabled = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mExtraControllerCallbacks
                int r0 = r0.beginBroadcast()
                int r0 = r0 + (-1)
            Le:
                if (r0 < 0) goto L1e
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mExtraControllerCallbacks
                android.os.IInterface r1 = r1.getBroadcastItem(r0)
                android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                r1.onCaptioningEnabledChanged(r3)     // Catch: android.os.RemoteException -> L1b
            L1b:
                int r0 = r0 + (-1)
                goto Le
            L1e:
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r3 = r2.mExtraControllerCallbacks
                r3.finishBroadcast()
            L23:
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCurrentControllerInfo(androidx.media.MediaSessionManager.RemoteUserInfo r1) {
                r0 = this;
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setExtras(android.os.Bundle r2) {
                r1 = this;
                java.lang.Object r0 = r1.mSessionObj
                android.support.v4.media.session.MediaSessionCompatApi21.setExtras(r0, r2)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setFlags(int r2) {
                r1 = this;
                java.lang.Object r0 = r1.mSessionObj
                android.support.v4.media.session.MediaSessionCompatApi21.setFlags(r0, r2)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setMediaButtonReceiver(android.app.PendingIntent r2) {
                r1 = this;
                java.lang.Object r0 = r1.mSessionObj
                android.support.v4.media.session.MediaSessionCompatApi21.setMediaButtonReceiver(r0, r2)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setMetadata(android.support.v4.media.MediaMetadataCompat r2) {
                r1 = this;
                r1.mMetadata = r2
                java.lang.Object r0 = r1.mSessionObj
                if (r2 != 0) goto L8
                r2 = 0
                goto Lc
            L8:
                java.lang.Object r2 = r2.getMediaMetadata()
            Lc:
                android.support.v4.media.session.MediaSessionCompatApi21.setMetadata(r0, r2)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackState(android.support.v4.media.session.PlaybackStateCompat r3) {
                r2 = this;
                r2.mPlaybackState = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mExtraControllerCallbacks
                int r0 = r0.beginBroadcast()
                int r0 = r0 + (-1)
            La:
                if (r0 < 0) goto L1a
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mExtraControllerCallbacks
                android.os.IInterface r1 = r1.getBroadcastItem(r0)
                android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                r1.onPlaybackStateChanged(r3)     // Catch: android.os.RemoteException -> L17
            L17:
                int r0 = r0 + (-1)
                goto La
            L1a:
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mExtraControllerCallbacks
                r0.finishBroadcast()
                java.lang.Object r0 = r2.mSessionObj
                if (r3 != 0) goto L25
                r3 = 0
                goto L29
            L25:
                java.lang.Object r3 = r3.getPlaybackState()
            L29:
                android.support.v4.media.session.MediaSessionCompatApi21.setPlaybackState(r0, r3)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToLocal(int r2) {
                r1 = this;
                java.lang.Object r0 = r1.mSessionObj
                android.support.v4.media.session.MediaSessionCompatApi21.setPlaybackToLocal(r0, r2)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToRemote(androidx.media.VolumeProviderCompat r2) {
                r1 = this;
                java.lang.Object r0 = r1.mSessionObj
                java.lang.Object r2 = r2.getVolumeProvider()
                android.support.v4.media.session.MediaSessionCompatApi21.setPlaybackToRemote(r0, r2)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setQueue(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> r3) {
                r2 = this;
                r2.mQueue = r3
                if (r3 == 0) goto L21
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r3 = r3.iterator()
            Ld:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L22
                java.lang.Object r1 = r3.next()
                android.support.v4.media.session.MediaSessionCompat$QueueItem r1 = (android.support.v4.media.session.MediaSessionCompat.QueueItem) r1
                java.lang.Object r1 = r1.getQueueItem()
                r0.add(r1)
                goto Ld
            L21:
                r0 = 0
            L22:
                java.lang.Object r3 = r2.mSessionObj
                android.support.v4.media.session.MediaSessionCompatApi21.setQueue(r3, r0)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setQueueTitle(java.lang.CharSequence r2) {
                r1 = this;
                java.lang.Object r0 = r1.mSessionObj
                android.support.v4.media.session.MediaSessionCompatApi21.setQueueTitle(r0, r2)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRatingType(int r3) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 22
                if (r0 >= r1) goto L9
                r2.mRatingType = r3
                return
            L9:
                java.lang.Object r0 = r2.mSessionObj
                android.support.v4.media.session.MediaSessionCompatApi22.setRatingType(r0, r3)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRepeatMode(int r3) {
                r2 = this;
                int r0 = r2.mRepeatMode
                if (r0 == r3) goto L23
                r2.mRepeatMode = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mExtraControllerCallbacks
                int r0 = r0.beginBroadcast()
                int r0 = r0 + (-1)
            Le:
                if (r0 < 0) goto L1e
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mExtraControllerCallbacks
                android.os.IInterface r1 = r1.getBroadcastItem(r0)
                android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                r1.onRepeatModeChanged(r3)     // Catch: android.os.RemoteException -> L1b
            L1b:
                int r0 = r0 + (-1)
                goto Le
            L1e:
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r3 = r2.mExtraControllerCallbacks
                r3.finishBroadcast()
            L23:
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setSessionActivity(android.app.PendingIntent r2) {
                r1 = this;
                java.lang.Object r0 = r1.mSessionObj
                android.support.v4.media.session.MediaSessionCompatApi21.setSessionActivity(r0, r2)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setShuffleMode(int r3) {
                r2 = this;
                int r0 = r2.mShuffleMode
                if (r0 == r3) goto L23
                r2.mShuffleMode = r3
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mExtraControllerCallbacks
                int r0 = r0.beginBroadcast()
                int r0 = r0 + (-1)
            Le:
                if (r0 < 0) goto L1e
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mExtraControllerCallbacks
                android.os.IInterface r1 = r1.getBroadcastItem(r0)
                android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                r1.onShuffleModeChanged(r3)     // Catch: android.os.RemoteException -> L1b
            L1b:
                int r0 = r0 + (-1)
                goto Le
            L1e:
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r3 = r2.mExtraControllerCallbacks
                r3.finishBroadcast()
            L23:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(28)
    static class MediaSessionImplApi28 extends android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21 {
        MediaSessionImplApi28(android.content.Context r1, java.lang.String r2, android.os.Bundle r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        MediaSessionImplApi28(java.lang.Object r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        @androidx.annotation.NonNull
        public final androidx.media.MediaSessionManager.RemoteUserInfo getCurrentControllerInfo() {
                r2 = this;
                java.lang.Object r0 = r2.mSessionObj
                android.media.session.MediaSession r0 = (android.media.session.MediaSession) r0
                android.media.session.MediaSessionManager$RemoteUserInfo r0 = android.support.v4.media.session.f.a(r0)
                androidx.media.MediaSessionManager$RemoteUserInfo r1 = new androidx.media.MediaSessionManager$RemoteUserInfo
                r1.<init>(r0)
                return r1
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCurrentControllerInfo(androidx.media.MediaSessionManager.RemoteUserInfo r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class MediaSessionImplBase implements android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl {
        static final int RCC_PLAYSTATE_NONE = 0;
        final android.media.AudioManager mAudioManager;
        volatile android.support.v4.media.session.MediaSessionCompat.Callback mCallback;
        boolean mCaptioningEnabled;
        private final android.content.Context mContext;
        final android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> mControllerCallbacks;
        boolean mDestroyed;
        android.os.Bundle mExtras;
        int mFlags;
        private android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.MessageHandler mHandler;
        boolean mIsActive;
        private boolean mIsMbrRegistered;
        private boolean mIsRccRegistered;
        int mLocalStream;
        final java.lang.Object mLock;
        private final android.content.ComponentName mMediaButtonReceiverComponentName;
        private final android.app.PendingIntent mMediaButtonReceiverIntent;
        android.support.v4.media.MediaMetadataCompat mMetadata;
        final java.lang.String mPackageName;
        java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> mQueue;
        java.lang.CharSequence mQueueTitle;
        int mRatingType;
        final android.media.RemoteControlClient mRcc;
        private androidx.media.MediaSessionManager.RemoteUserInfo mRemoteUserInfo;
        int mRepeatMode;
        android.app.PendingIntent mSessionActivity;
        int mShuffleMode;
        android.support.v4.media.session.PlaybackStateCompat mState;
        private final android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.MediaSessionStub mStub;
        final java.lang.String mTag;
        private final android.support.v4.media.session.MediaSessionCompat.Token mToken;
        private androidx.media.VolumeProviderCompat.Callback mVolumeCallback;
        androidx.media.VolumeProviderCompat mVolumeProvider;
        int mVolumeType;


        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static final class Command {
            public final java.lang.String command;
            public final android.os.Bundle extras;
            public final android.os.ResultReceiver stub;

            public Command(java.lang.String r1, android.os.Bundle r2, android.os.ResultReceiver r3) {
                    r0 = this;
                    r0.<init>()
                    r0.command = r1
                    r0.extras = r2
                    r0.stub = r3
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class MediaSessionStub extends android.support.v4.media.session.IMediaSession.Stub {
            final /* synthetic */ android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase this$0;

            MediaSessionStub(android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItem(android.support.v4.media.MediaDescriptionCompat r2) {
                    r1 = this;
                    r0 = 25
                    r1.postToHandler(r0, r2)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItemAt(android.support.v4.media.MediaDescriptionCompat r2, int r3) {
                    r1 = this;
                    r0 = 26
                    r1.postToHandler(r0, r2, r3)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void adjustVolume(int r1, int r2, java.lang.String r3) {
                    r0 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r3 = r0.this$0
                    r3.adjustVolume(r1, r2)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void fastForward() throws android.os.RemoteException {
                    r1 = this;
                    r0 = 16
                    r1.postToHandler(r0)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.os.Bundle getExtras() {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r2.this$0
                    java.lang.Object r0 = r0.mLock
                    monitor-enter(r0)
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r1 = r2.this$0     // Catch: java.lang.Throwable -> Lb
                    android.os.Bundle r1 = r1.mExtras     // Catch: java.lang.Throwable -> Lb
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                    return r1
                Lb:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public long getFlags() {
                    r3 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r3.this$0
                    java.lang.Object r0 = r0.mLock
                    monitor-enter(r0)
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r1 = r3.this$0     // Catch: java.lang.Throwable -> Lc
                    int r1 = r1.mFlags     // Catch: java.lang.Throwable -> Lc
                    long r1 = (long) r1     // Catch: java.lang.Throwable -> Lc
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                    return r1
                Lc:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.app.PendingIntent getLaunchPendingIntent() {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r2.this$0
                    java.lang.Object r0 = r0.mLock
                    monitor-enter(r0)
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r1 = r2.this$0     // Catch: java.lang.Throwable -> Lb
                    android.app.PendingIntent r1 = r1.mSessionActivity     // Catch: java.lang.Throwable -> Lb
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                    return r1
                Lb:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.support.v4.media.MediaMetadataCompat getMetadata() {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r1.this$0
                    android.support.v4.media.MediaMetadataCompat r0 = r0.mMetadata
                    return r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.lang.String getPackageName() {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r1.this$0
                    java.lang.String r0 = r0.mPackageName
                    return r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.support.v4.media.session.PlaybackStateCompat getPlaybackState() {
                    r3 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r3.this$0
                    java.lang.Object r0 = r0.mLock
                    monitor-enter(r0)
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r1 = r3.this$0     // Catch: java.lang.Throwable -> L11
                    android.support.v4.media.session.PlaybackStateCompat r2 = r1.mState     // Catch: java.lang.Throwable -> L11
                    android.support.v4.media.MediaMetadataCompat r1 = r1.mMetadata     // Catch: java.lang.Throwable -> L11
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                    android.support.v4.media.session.PlaybackStateCompat r0 = android.support.v4.media.session.MediaSessionCompat.getStateWithUpdatedPosition(r2, r1)
                    return r0
                L11:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> getQueue() {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r2.this$0
                    java.lang.Object r0 = r0.mLock
                    monitor-enter(r0)
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r1 = r2.this$0     // Catch: java.lang.Throwable -> Lb
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r1 = r1.mQueue     // Catch: java.lang.Throwable -> Lb
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                    return r1
                Lb:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.lang.CharSequence getQueueTitle() {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r1.this$0
                    java.lang.CharSequence r0 = r0.mQueueTitle
                    return r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRatingType() {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r1.this$0
                    int r0 = r0.mRatingType
                    return r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRepeatMode() {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r1.this$0
                    int r0 = r0.mRepeatMode
                    return r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getShuffleMode() {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r1.this$0
                    int r0 = r0.mShuffleMode
                    return r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.lang.String getTag() {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r1.this$0
                    java.lang.String r0 = r0.mTag
                    return r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.support.v4.media.session.ParcelableVolumeInfo getVolumeAttributes() {
                    r8 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r8.this$0
                    java.lang.Object r1 = r0.mLock
                    monitor-enter(r1)
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r8.this$0     // Catch: java.lang.Throwable -> L1f
                    int r3 = r0.mVolumeType     // Catch: java.lang.Throwable -> L1f
                    int r4 = r0.mLocalStream     // Catch: java.lang.Throwable -> L1f
                    androidx.media.VolumeProviderCompat r2 = r0.mVolumeProvider     // Catch: java.lang.Throwable -> L1f
                    r5 = 2
                    if (r3 != r5) goto L21
                    int r5 = r2.getVolumeControl()     // Catch: java.lang.Throwable -> L1f
                    int r0 = r2.getMaxVolume()     // Catch: java.lang.Throwable -> L1f
                    int r2 = r2.getCurrentVolume()     // Catch: java.lang.Throwable -> L1f
                L1c:
                    r6 = r0
                    r7 = r2
                    goto L30
                L1f:
                    r0 = move-exception
                    goto L37
                L21:
                    android.media.AudioManager r0 = r0.mAudioManager     // Catch: java.lang.Throwable -> L1f
                    int r0 = r0.getStreamMaxVolume(r4)     // Catch: java.lang.Throwable -> L1f
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r2 = r8.this$0     // Catch: java.lang.Throwable -> L1f
                    android.media.AudioManager r2 = r2.mAudioManager     // Catch: java.lang.Throwable -> L1f
                    int r2 = r2.getStreamVolume(r4)     // Catch: java.lang.Throwable -> L1f
                    goto L1c
                L30:
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
                    android.support.v4.media.session.ParcelableVolumeInfo r2 = new android.support.v4.media.session.ParcelableVolumeInfo
                    r2.<init>(r3, r4, r5, r6, r7)
                    return r2
                L37:
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
                    throw r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isCaptioningEnabled() {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r1.this$0
                    boolean r0 = r0.mCaptioningEnabled
                    return r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isShuffleModeEnabledRemoved() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isTransportControlEnabled() {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r1.this$0
                    int r0 = r0.mFlags
                    r0 = r0 & 2
                    if (r0 == 0) goto La
                    r0 = 1
                    return r0
                La:
                    r0 = 0
                    return r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void next() throws android.os.RemoteException {
                    r1 = this;
                    r0 = 14
                    r1.postToHandler(r0)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void pause() throws android.os.RemoteException {
                    r1 = this;
                    r0 = 12
                    r1.postToHandler(r0)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void play() throws android.os.RemoteException {
                    r1 = this;
                    r0 = 7
                    r1.postToHandler(r0)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromMediaId(java.lang.String r2, android.os.Bundle r3) throws android.os.RemoteException {
                    r1 = this;
                    r0 = 8
                    r1.postToHandler(r0, r2, r3)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromSearch(java.lang.String r2, android.os.Bundle r3) throws android.os.RemoteException {
                    r1 = this;
                    r0 = 9
                    r1.postToHandler(r0, r2, r3)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromUri(android.net.Uri r2, android.os.Bundle r3) throws android.os.RemoteException {
                    r1 = this;
                    r0 = 10
                    r1.postToHandler(r0, r2, r3)
                    return
            }

            void postToHandler(int r7) {
                    r6 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r6.this$0
                    r4 = 0
                    r5 = 0
                    r2 = 0
                    r3 = 0
                    r1 = r7
                    r0.postToHandler(r1, r2, r3, r4, r5)
                    return
            }

            void postToHandler(int r7, int r8) {
                    r6 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r6.this$0
                    r4 = 0
                    r5 = 0
                    r3 = 0
                    r1 = r7
                    r2 = r8
                    r0.postToHandler(r1, r2, r3, r4, r5)
                    return
            }

            void postToHandler(int r7, java.lang.Object r8) {
                    r6 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r6.this$0
                    r3 = 0
                    r5 = 0
                    r2 = 0
                    r1 = r7
                    r4 = r8
                    r0.postToHandler(r1, r2, r3, r4, r5)
                    return
            }

            void postToHandler(int r7, java.lang.Object r8, int r9) {
                    r6 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r6.this$0
                    r3 = 0
                    r5 = 0
                    r1 = r7
                    r4 = r8
                    r2 = r9
                    r0.postToHandler(r1, r2, r3, r4, r5)
                    return
            }

            void postToHandler(int r7, java.lang.Object r8, android.os.Bundle r9) {
                    r6 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r6.this$0
                    r2 = 0
                    r3 = 0
                    r1 = r7
                    r4 = r8
                    r5 = r9
                    r0.postToHandler(r1, r2, r3, r4, r5)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepare() throws android.os.RemoteException {
                    r1 = this;
                    r0 = 3
                    r1.postToHandler(r0)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromMediaId(java.lang.String r2, android.os.Bundle r3) throws android.os.RemoteException {
                    r1 = this;
                    r0 = 4
                    r1.postToHandler(r0, r2, r3)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromSearch(java.lang.String r2, android.os.Bundle r3) throws android.os.RemoteException {
                    r1 = this;
                    r0 = 5
                    r1.postToHandler(r0, r2, r3)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromUri(android.net.Uri r2, android.os.Bundle r3) throws android.os.RemoteException {
                    r1 = this;
                    r0 = 6
                    r1.postToHandler(r0, r2, r3)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void previous() throws android.os.RemoteException {
                    r1 = this;
                    r0 = 15
                    r1.postToHandler(r0)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rate(android.support.v4.media.RatingCompat r2) throws android.os.RemoteException {
                    r1 = this;
                    r0 = 19
                    r1.postToHandler(r0, r2)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rateWithExtras(android.support.v4.media.RatingCompat r2, android.os.Bundle r3) throws android.os.RemoteException {
                    r1 = this;
                    r0 = 31
                    r1.postToHandler(r0, r2, r3)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void registerCallbackListener(android.support.v4.media.session.IMediaControllerCallback r5) {
                    r4 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r4.this$0
                    boolean r0 = r0.mDestroyed
                    if (r0 == 0) goto La
                    r5.onSessionDestroyed()     // Catch: java.lang.Exception -> L9
                L9:
                    return
                La:
                    androidx.media.MediaSessionManager$RemoteUserInfo r0 = new androidx.media.MediaSessionManager$RemoteUserInfo
                    int r1 = android.os.Binder.getCallingPid()
                    int r2 = android.os.Binder.getCallingUid()
                    java.lang.String r3 = "android.media.session.MediaController"
                    r0.<init>(r3, r1, r2)
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r1 = r4.this$0
                    android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r1.mControllerCallbacks
                    r1.register(r5, r0)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItem(android.support.v4.media.MediaDescriptionCompat r2) {
                    r1 = this;
                    r0 = 27
                    r1.postToHandler(r0, r2)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItemAt(int r2) {
                    r1 = this;
                    r0 = 28
                    r1.postToHandler(r0, r2)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rewind() throws android.os.RemoteException {
                    r1 = this;
                    r0 = 17
                    r1.postToHandler(r0)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void seekTo(long r2) throws android.os.RemoteException {
                    r1 = this;
                    r0 = 18
                    java.lang.Long r2 = java.lang.Long.valueOf(r2)
                    r1.postToHandler(r0, r2)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCommand(java.lang.String r2, android.os.Bundle r3, android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper r4) {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$Command r0 = new android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$Command
                    android.os.ResultReceiver r4 = r4.mResultReceiver
                    r0.<init>(r2, r3, r4)
                    r2 = 1
                    r1.postToHandler(r2, r0)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCustomAction(java.lang.String r2, android.os.Bundle r3) throws android.os.RemoteException {
                    r1 = this;
                    r0 = 20
                    r1.postToHandler(r0, r2, r3)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean sendMediaButton(android.view.KeyEvent r3) {
                    r2 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r2.this$0
                    int r0 = r0.mFlags
                    r1 = 1
                    r0 = r0 & r1
                    if (r0 == 0) goto L9
                    goto La
                L9:
                    r1 = 0
                La:
                    if (r1 == 0) goto L11
                    r0 = 21
                    r2.postToHandler(r0, r3)
                L11:
                    return r1
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setCaptioningEnabled(boolean r2) throws android.os.RemoteException {
                    r1 = this;
                    r0 = 29
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                    r1.postToHandler(r0, r2)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setRepeatMode(int r2) throws android.os.RemoteException {
                    r1 = this;
                    r0 = 23
                    r1.postToHandler(r0, r2)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleMode(int r2) throws android.os.RemoteException {
                    r1 = this;
                    r0 = 30
                    r1.postToHandler(r0, r2)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleModeEnabledRemoved(boolean r1) throws android.os.RemoteException {
                    r0 = this;
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setVolumeTo(int r1, int r2, java.lang.String r3) {
                    r0 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r3 = r0.this$0
                    r3.setVolumeTo(r1, r2)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void skipToQueueItem(long r2) {
                    r1 = this;
                    r0 = 11
                    java.lang.Long r2 = java.lang.Long.valueOf(r2)
                    r1.postToHandler(r0, r2)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void stop() throws android.os.RemoteException {
                    r1 = this;
                    r0 = 13
                    r1.postToHandler(r0)
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void unregisterCallbackListener(android.support.v4.media.session.IMediaControllerCallback r2) {
                    r1 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r1.this$0
                    android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r0.mControllerCallbacks
                    r0.unregister(r2)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class MessageHandler extends android.os.Handler {
            private static final int KEYCODE_MEDIA_PAUSE = 127;
            private static final int KEYCODE_MEDIA_PLAY = 126;
            private static final int MSG_ADD_QUEUE_ITEM = 25;
            private static final int MSG_ADD_QUEUE_ITEM_AT = 26;
            private static final int MSG_ADJUST_VOLUME = 2;
            private static final int MSG_COMMAND = 1;
            private static final int MSG_CUSTOM_ACTION = 20;
            private static final int MSG_FAST_FORWARD = 16;
            private static final int MSG_MEDIA_BUTTON = 21;
            private static final int MSG_NEXT = 14;
            private static final int MSG_PAUSE = 12;
            private static final int MSG_PLAY = 7;
            private static final int MSG_PLAY_MEDIA_ID = 8;
            private static final int MSG_PLAY_SEARCH = 9;
            private static final int MSG_PLAY_URI = 10;
            private static final int MSG_PREPARE = 3;
            private static final int MSG_PREPARE_MEDIA_ID = 4;
            private static final int MSG_PREPARE_SEARCH = 5;
            private static final int MSG_PREPARE_URI = 6;
            private static final int MSG_PREVIOUS = 15;
            private static final int MSG_RATE = 19;
            private static final int MSG_RATE_EXTRA = 31;
            private static final int MSG_REMOVE_QUEUE_ITEM = 27;
            private static final int MSG_REMOVE_QUEUE_ITEM_AT = 28;
            private static final int MSG_REWIND = 17;
            private static final int MSG_SEEK_TO = 18;
            private static final int MSG_SET_CAPTIONING_ENABLED = 29;
            private static final int MSG_SET_REPEAT_MODE = 23;
            private static final int MSG_SET_SHUFFLE_MODE = 30;
            private static final int MSG_SET_VOLUME = 22;
            private static final int MSG_SKIP_TO_ITEM = 11;
            private static final int MSG_STOP = 13;
            final /* synthetic */ android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase this$0;

            public MessageHandler(android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase r1, android.os.Looper r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>(r2)
                    return
            }

            private void onMediaButtonEvent(android.view.KeyEvent r8, android.support.v4.media.session.MediaSessionCompat.Callback r9) {
                    r7 = this;
                    if (r8 == 0) goto L73
                    int r0 = r8.getAction()
                    if (r0 == 0) goto L9
                    goto L73
                L9:
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r7.this$0
                    android.support.v4.media.session.PlaybackStateCompat r0 = r0.mState
                    r1 = 0
                    if (r0 != 0) goto L13
                    r3 = r1
                    goto L17
                L13:
                    long r3 = r0.getActions()
                L17:
                    int r8 = r8.getKeyCode()
                    r0 = 126(0x7e, float:1.77E-43)
                    if (r8 == r0) goto L69
                    r0 = 127(0x7f, float:1.78E-43)
                    if (r8 == r0) goto L5e
                    switch(r8) {
                        case 86: goto L53;
                        case 87: goto L48;
                        case 88: goto L3d;
                        case 89: goto L32;
                        case 90: goto L27;
                        default: goto L26;
                    }
                L26:
                    goto L73
                L27:
                    r5 = 64
                    long r3 = r3 & r5
                    int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r8 == 0) goto L73
                    r9.onFastForward()
                    return
                L32:
                    r5 = 8
                    long r3 = r3 & r5
                    int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r8 == 0) goto L73
                    r9.onRewind()
                    return
                L3d:
                    r5 = 16
                    long r3 = r3 & r5
                    int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r8 == 0) goto L73
                    r9.onSkipToPrevious()
                    return
                L48:
                    r5 = 32
                    long r3 = r3 & r5
                    int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r8 == 0) goto L73
                    r9.onSkipToNext()
                    return
                L53:
                    r5 = 1
                    long r3 = r3 & r5
                    int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r8 == 0) goto L73
                    r9.onStop()
                    return
                L5e:
                    r5 = 2
                    long r3 = r3 & r5
                    int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r8 == 0) goto L73
                    r9.onPause()
                    return
                L69:
                    r5 = 4
                    long r3 = r3 & r5
                    int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r8 == 0) goto L73
                    r9.onPlay()
                L73:
                    return
            }

            @Override // android.os.Handler
            public void handleMessage(android.os.Message r8) {
                    r7 = this;
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r7.this$0
                    android.support.v4.media.session.MediaSessionCompat$Callback r0 = r0.mCallback
                    if (r0 != 0) goto L7
                    return
                L7:
                    android.os.Bundle r1 = r8.getData()
                    android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r1)
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r2 = r7.this$0
                    androidx.media.MediaSessionManager$RemoteUserInfo r3 = new androidx.media.MediaSessionManager$RemoteUserInfo
                    java.lang.String r4 = "data_calling_pkg"
                    java.lang.String r4 = r1.getString(r4)
                    java.lang.String r5 = "data_calling_pid"
                    int r5 = r1.getInt(r5)
                    java.lang.String r6 = "data_calling_uid"
                    int r6 = r1.getInt(r6)
                    r3.<init>(r4, r5, r6)
                    r2.setCurrentControllerInfo(r3)
                    java.lang.String r2 = "data_extras"
                    android.os.Bundle r1 = r1.getBundle(r2)
                    android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r1)
                    r2 = 0
                    int r3 = r8.what     // Catch: java.lang.Throwable -> L45
                    r4 = 0
                    switch(r3) {
                        case 1: goto L153;
                        case 2: goto L14b;
                        case 3: goto L147;
                        case 4: goto L13f;
                        case 5: goto L137;
                        case 6: goto L12f;
                        case 7: goto L12b;
                        case 8: goto L123;
                        case 9: goto L11b;
                        case 10: goto L113;
                        case 11: goto L107;
                        case 12: goto L103;
                        case 13: goto Lff;
                        case 14: goto Lfb;
                        case 15: goto Lf6;
                        case 16: goto Lf1;
                        case 17: goto Lec;
                        case 18: goto Ldf;
                        case 19: goto Ld6;
                        case 20: goto Lcd;
                        case 21: goto Lb2;
                        case 22: goto La9;
                        case 23: goto La2;
                        case 24: goto L3a;
                        case 25: goto L99;
                        case 26: goto L8e;
                        case 27: goto L85;
                        case 28: goto L5c;
                        case 29: goto L4f;
                        case 30: goto L48;
                        case 31: goto L3c;
                        default: goto L3a;
                    }     // Catch: java.lang.Throwable -> L45
                L3a:
                    goto L160
                L3c:
                    java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> L45
                    android.support.v4.media.RatingCompat r8 = (android.support.v4.media.RatingCompat) r8     // Catch: java.lang.Throwable -> L45
                    r0.onSetRating(r8, r1)     // Catch: java.lang.Throwable -> L45
                    goto L160
                L45:
                    r8 = move-exception
                    goto L166
                L48:
                    int r8 = r8.arg1     // Catch: java.lang.Throwable -> L45
                    r0.onSetShuffleMode(r8)     // Catch: java.lang.Throwable -> L45
                    goto L160
                L4f:
                    java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> L45
                    java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L45
                    boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L45
                    r0.onSetCaptioningEnabled(r8)     // Catch: java.lang.Throwable -> L45
                    goto L160
                L5c:
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r1 = r7.this$0     // Catch: java.lang.Throwable -> L45
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r1 = r1.mQueue     // Catch: java.lang.Throwable -> L45
                    if (r1 == 0) goto L160
                    int r3 = r8.arg1     // Catch: java.lang.Throwable -> L45
                    if (r3 < 0) goto L79
                    int r1 = r1.size()     // Catch: java.lang.Throwable -> L45
                    if (r3 >= r1) goto L79
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r1 = r7.this$0     // Catch: java.lang.Throwable -> L45
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r1 = r1.mQueue     // Catch: java.lang.Throwable -> L45
                    int r8 = r8.arg1     // Catch: java.lang.Throwable -> L45
                    java.lang.Object r8 = r1.get(r8)     // Catch: java.lang.Throwable -> L45
                    android.support.v4.media.session.MediaSessionCompat$QueueItem r8 = (android.support.v4.media.session.MediaSessionCompat.QueueItem) r8     // Catch: java.lang.Throwable -> L45
                    goto L7a
                L79:
                    r8 = r2
                L7a:
                    if (r8 == 0) goto L160
                    android.support.v4.media.MediaDescriptionCompat r8 = r8.getDescription()     // Catch: java.lang.Throwable -> L45
                    r0.onRemoveQueueItem(r8)     // Catch: java.lang.Throwable -> L45
                    goto L160
                L85:
                    java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> L45
                    android.support.v4.media.MediaDescriptionCompat r8 = (android.support.v4.media.MediaDescriptionCompat) r8     // Catch: java.lang.Throwable -> L45
                    r0.onRemoveQueueItem(r8)     // Catch: java.lang.Throwable -> L45
                    goto L160
                L8e:
                    java.lang.Object r1 = r8.obj     // Catch: java.lang.Throwable -> L45
                    android.support.v4.media.MediaDescriptionCompat r1 = (android.support.v4.media.MediaDescriptionCompat) r1     // Catch: java.lang.Throwable -> L45
                    int r8 = r8.arg1     // Catch: java.lang.Throwable -> L45
                    r0.onAddQueueItem(r1, r8)     // Catch: java.lang.Throwable -> L45
                    goto L160
                L99:
                    java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> L45
                    android.support.v4.media.MediaDescriptionCompat r8 = (android.support.v4.media.MediaDescriptionCompat) r8     // Catch: java.lang.Throwable -> L45
                    r0.onAddQueueItem(r8)     // Catch: java.lang.Throwable -> L45
                    goto L160
                La2:
                    int r8 = r8.arg1     // Catch: java.lang.Throwable -> L45
                    r0.onSetRepeatMode(r8)     // Catch: java.lang.Throwable -> L45
                    goto L160
                La9:
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r7.this$0     // Catch: java.lang.Throwable -> L45
                    int r8 = r8.arg1     // Catch: java.lang.Throwable -> L45
                    r0.setVolumeTo(r8, r4)     // Catch: java.lang.Throwable -> L45
                    goto L160
                Lb2:
                    java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> L45
                    android.view.KeyEvent r8 = (android.view.KeyEvent) r8     // Catch: java.lang.Throwable -> L45
                    android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L45
                    java.lang.String r3 = "android.intent.action.MEDIA_BUTTON"
                    r1.<init>(r3)     // Catch: java.lang.Throwable -> L45
                    java.lang.String r3 = "android.intent.extra.KEY_EVENT"
                    r1.putExtra(r3, r8)     // Catch: java.lang.Throwable -> L45
                    boolean r1 = r0.onMediaButtonEvent(r1)     // Catch: java.lang.Throwable -> L45
                    if (r1 != 0) goto L160
                    r7.onMediaButtonEvent(r8, r0)     // Catch: java.lang.Throwable -> L45
                    goto L160
                Lcd:
                    java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> L45
                    java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L45
                    r0.onCustomAction(r8, r1)     // Catch: java.lang.Throwable -> L45
                    goto L160
                Ld6:
                    java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> L45
                    android.support.v4.media.RatingCompat r8 = (android.support.v4.media.RatingCompat) r8     // Catch: java.lang.Throwable -> L45
                    r0.onSetRating(r8)     // Catch: java.lang.Throwable -> L45
                    goto L160
                Ldf:
                    java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> L45
                    java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> L45
                    long r3 = r8.longValue()     // Catch: java.lang.Throwable -> L45
                    r0.onSeekTo(r3)     // Catch: java.lang.Throwable -> L45
                    goto L160
                Lec:
                    r0.onRewind()     // Catch: java.lang.Throwable -> L45
                    goto L160
                Lf1:
                    r0.onFastForward()     // Catch: java.lang.Throwable -> L45
                    goto L160
                Lf6:
                    r0.onSkipToPrevious()     // Catch: java.lang.Throwable -> L45
                    goto L160
                Lfb:
                    r0.onSkipToNext()     // Catch: java.lang.Throwable -> L45
                    goto L160
                Lff:
                    r0.onStop()     // Catch: java.lang.Throwable -> L45
                    goto L160
                L103:
                    r0.onPause()     // Catch: java.lang.Throwable -> L45
                    goto L160
                L107:
                    java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> L45
                    java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> L45
                    long r3 = r8.longValue()     // Catch: java.lang.Throwable -> L45
                    r0.onSkipToQueueItem(r3)     // Catch: java.lang.Throwable -> L45
                    goto L160
                L113:
                    java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> L45
                    android.net.Uri r8 = (android.net.Uri) r8     // Catch: java.lang.Throwable -> L45
                    r0.onPlayFromUri(r8, r1)     // Catch: java.lang.Throwable -> L45
                    goto L160
                L11b:
                    java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> L45
                    java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L45
                    r0.onPlayFromSearch(r8, r1)     // Catch: java.lang.Throwable -> L45
                    goto L160
                L123:
                    java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> L45
                    java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L45
                    r0.onPlayFromMediaId(r8, r1)     // Catch: java.lang.Throwable -> L45
                    goto L160
                L12b:
                    r0.onPlay()     // Catch: java.lang.Throwable -> L45
                    goto L160
                L12f:
                    java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> L45
                    android.net.Uri r8 = (android.net.Uri) r8     // Catch: java.lang.Throwable -> L45
                    r0.onPrepareFromUri(r8, r1)     // Catch: java.lang.Throwable -> L45
                    goto L160
                L137:
                    java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> L45
                    java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L45
                    r0.onPrepareFromSearch(r8, r1)     // Catch: java.lang.Throwable -> L45
                    goto L160
                L13f:
                    java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> L45
                    java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L45
                    r0.onPrepareFromMediaId(r8, r1)     // Catch: java.lang.Throwable -> L45
                    goto L160
                L147:
                    r0.onPrepare()     // Catch: java.lang.Throwable -> L45
                    goto L160
                L14b:
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r7.this$0     // Catch: java.lang.Throwable -> L45
                    int r8 = r8.arg1     // Catch: java.lang.Throwable -> L45
                    r0.adjustVolume(r8, r4)     // Catch: java.lang.Throwable -> L45
                    goto L160
                L153:
                    java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> L45
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$Command r8 = (android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.Command) r8     // Catch: java.lang.Throwable -> L45
                    java.lang.String r1 = r8.command     // Catch: java.lang.Throwable -> L45
                    android.os.Bundle r3 = r8.extras     // Catch: java.lang.Throwable -> L45
                    android.os.ResultReceiver r8 = r8.stub     // Catch: java.lang.Throwable -> L45
                    r0.onCommand(r1, r3, r8)     // Catch: java.lang.Throwable -> L45
                L160:
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r8 = r7.this$0
                    r8.setCurrentControllerInfo(r2)
                    return
                L166:
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase r0 = r7.this$0
                    r0.setCurrentControllerInfo(r2)
                    throw r8
            }
        }

        public MediaSessionImplBase(android.content.Context r3, java.lang.String r4, android.content.ComponentName r5, android.app.PendingIntent r6) {
                r2 = this;
                r2.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r2.mLock = r0
                android.os.RemoteCallbackList r0 = new android.os.RemoteCallbackList
                r0.<init>()
                r2.mControllerCallbacks = r0
                r0 = 0
                r2.mDestroyed = r0
                r2.mIsActive = r0
                r2.mIsMbrRegistered = r0
                r2.mIsRccRegistered = r0
                android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$1 r1 = new android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$1
                r1.<init>(r2)
                r2.mVolumeCallback = r1
                if (r5 == 0) goto L59
                r2.mContext = r3
                java.lang.String r1 = r3.getPackageName()
                r2.mPackageName = r1
                java.lang.String r1 = "audio"
                java.lang.Object r3 = r3.getSystemService(r1)
                android.media.AudioManager r3 = (android.media.AudioManager) r3
                r2.mAudioManager = r3
                r2.mTag = r4
                r2.mMediaButtonReceiverComponentName = r5
                r2.mMediaButtonReceiverIntent = r6
                android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$MediaSessionStub r3 = new android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$MediaSessionStub
                r3.<init>(r2)
                r2.mStub = r3
                android.support.v4.media.session.MediaSessionCompat$Token r4 = new android.support.v4.media.session.MediaSessionCompat$Token
                r4.<init>(r3)
                r2.mToken = r4
                r2.mRatingType = r0
                r3 = 1
                r2.mVolumeType = r3
                r3 = 3
                r2.mLocalStream = r3
                android.media.RemoteControlClient r3 = new android.media.RemoteControlClient
                r3.<init>(r6)
                r2.mRcc = r3
                return
            L59:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "MediaButtonReceiver component may not be null."
                r3.<init>(r4)
                throw r3
        }

        private void sendCaptioningEnabled(boolean r3) {
                r2 = this;
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mControllerCallbacks
                int r0 = r0.beginBroadcast()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mControllerCallbacks
                android.os.IInterface r1 = r1.getBroadcastItem(r0)
                android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                r1.onCaptioningEnabledChanged(r3)     // Catch: android.os.RemoteException -> L15
            L15:
                int r0 = r0 + (-1)
                goto L8
            L18:
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r3 = r2.mControllerCallbacks
                r3.finishBroadcast()
                return
        }

        private void sendEvent(java.lang.String r3, android.os.Bundle r4) {
                r2 = this;
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mControllerCallbacks
                int r0 = r0.beginBroadcast()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mControllerCallbacks
                android.os.IInterface r1 = r1.getBroadcastItem(r0)
                android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                r1.onEvent(r3, r4)     // Catch: android.os.RemoteException -> L15
            L15:
                int r0 = r0 + (-1)
                goto L8
            L18:
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r3 = r2.mControllerCallbacks
                r3.finishBroadcast()
                return
        }

        private void sendExtras(android.os.Bundle r3) {
                r2 = this;
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mControllerCallbacks
                int r0 = r0.beginBroadcast()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mControllerCallbacks
                android.os.IInterface r1 = r1.getBroadcastItem(r0)
                android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                r1.onExtrasChanged(r3)     // Catch: android.os.RemoteException -> L15
            L15:
                int r0 = r0 + (-1)
                goto L8
            L18:
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r3 = r2.mControllerCallbacks
                r3.finishBroadcast()
                return
        }

        private void sendMetadata(android.support.v4.media.MediaMetadataCompat r3) {
                r2 = this;
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mControllerCallbacks
                int r0 = r0.beginBroadcast()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mControllerCallbacks
                android.os.IInterface r1 = r1.getBroadcastItem(r0)
                android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                r1.onMetadataChanged(r3)     // Catch: android.os.RemoteException -> L15
            L15:
                int r0 = r0 + (-1)
                goto L8
            L18:
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r3 = r2.mControllerCallbacks
                r3.finishBroadcast()
                return
        }

        private void sendQueue(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> r3) {
                r2 = this;
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mControllerCallbacks
                int r0 = r0.beginBroadcast()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mControllerCallbacks
                android.os.IInterface r1 = r1.getBroadcastItem(r0)
                android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                r1.onQueueChanged(r3)     // Catch: android.os.RemoteException -> L15
            L15:
                int r0 = r0 + (-1)
                goto L8
            L18:
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r3 = r2.mControllerCallbacks
                r3.finishBroadcast()
                return
        }

        private void sendQueueTitle(java.lang.CharSequence r3) {
                r2 = this;
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mControllerCallbacks
                int r0 = r0.beginBroadcast()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mControllerCallbacks
                android.os.IInterface r1 = r1.getBroadcastItem(r0)
                android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                r1.onQueueTitleChanged(r3)     // Catch: android.os.RemoteException -> L15
            L15:
                int r0 = r0 + (-1)
                goto L8
            L18:
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r3 = r2.mControllerCallbacks
                r3.finishBroadcast()
                return
        }

        private void sendRepeatMode(int r3) {
                r2 = this;
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mControllerCallbacks
                int r0 = r0.beginBroadcast()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mControllerCallbacks
                android.os.IInterface r1 = r1.getBroadcastItem(r0)
                android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                r1.onRepeatModeChanged(r3)     // Catch: android.os.RemoteException -> L15
            L15:
                int r0 = r0 + (-1)
                goto L8
            L18:
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r3 = r2.mControllerCallbacks
                r3.finishBroadcast()
                return
        }

        private void sendSessionDestroyed() {
                r2 = this;
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mControllerCallbacks
                int r0 = r0.beginBroadcast()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mControllerCallbacks
                android.os.IInterface r1 = r1.getBroadcastItem(r0)
                android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                r1.onSessionDestroyed()     // Catch: android.os.RemoteException -> L15
            L15:
                int r0 = r0 + (-1)
                goto L8
            L18:
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mControllerCallbacks
                r0.finishBroadcast()
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mControllerCallbacks
                r0.kill()
                return
        }

        private void sendShuffleMode(int r3) {
                r2 = this;
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mControllerCallbacks
                int r0 = r0.beginBroadcast()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mControllerCallbacks
                android.os.IInterface r1 = r1.getBroadcastItem(r0)
                android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                r1.onShuffleModeChanged(r3)     // Catch: android.os.RemoteException -> L15
            L15:
                int r0 = r0 + (-1)
                goto L8
            L18:
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r3 = r2.mControllerCallbacks
                r3.finishBroadcast()
                return
        }

        private void sendState(android.support.v4.media.session.PlaybackStateCompat r3) {
                r2 = this;
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mControllerCallbacks
                int r0 = r0.beginBroadcast()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mControllerCallbacks
                android.os.IInterface r1 = r1.getBroadcastItem(r0)
                android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                r1.onPlaybackStateChanged(r3)     // Catch: android.os.RemoteException -> L15
            L15:
                int r0 = r0 + (-1)
                goto L8
            L18:
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r3 = r2.mControllerCallbacks
                r3.finishBroadcast()
                return
        }

        void adjustVolume(int r3, int r4) {
                r2 = this;
                int r0 = r2.mVolumeType
                r1 = 2
                if (r0 != r1) goto Ld
                androidx.media.VolumeProviderCompat r4 = r2.mVolumeProvider
                if (r4 == 0) goto Lc
                r4.onAdjustVolume(r3)
            Lc:
                return
            Ld:
                android.media.AudioManager r0 = r2.mAudioManager
                int r1 = r2.mLocalStream
                r0.adjustStreamVolume(r1, r3, r4)
                return
        }

        android.media.RemoteControlClient.MetadataEditor buildRccMetadata(android.os.Bundle r7) {
                r6 = this;
                android.media.RemoteControlClient r0 = r6.mRcc
                r1 = 1
                android.media.RemoteControlClient$MetadataEditor r0 = r0.editMetadata(r1)
                if (r7 != 0) goto Lb
                goto L118
            Lb:
                java.lang.String r2 = "android.media.metadata.ART"
                boolean r3 = r7.containsKey(r2)
                r4 = 100
                r5 = 0
                if (r3 == 0) goto L2a
                android.os.Parcelable r2 = r7.getParcelable(r2)
                android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
                if (r2 == 0) goto L26
                android.graphics.Bitmap$Config r3 = r2.getConfig()
                android.graphics.Bitmap r2 = r2.copy(r3, r5)
            L26:
                r0.putBitmap(r4, r2)
                goto L45
            L2a:
                java.lang.String r2 = "android.media.metadata.ALBUM_ART"
                boolean r3 = r7.containsKey(r2)
                if (r3 == 0) goto L45
                android.os.Parcelable r2 = r7.getParcelable(r2)
                android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
                if (r2 == 0) goto L42
                android.graphics.Bitmap$Config r3 = r2.getConfig()
                android.graphics.Bitmap r2 = r2.copy(r3, r5)
            L42:
                r0.putBitmap(r4, r2)
            L45:
                java.lang.String r2 = "android.media.metadata.ALBUM"
                boolean r3 = r7.containsKey(r2)
                if (r3 == 0) goto L54
                java.lang.String r2 = r7.getString(r2)
                r0.putString(r1, r2)
            L54:
                java.lang.String r1 = "android.media.metadata.ALBUM_ARTIST"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L65
                r2 = 13
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L65:
                java.lang.String r1 = "android.media.metadata.ARTIST"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L75
                r2 = 2
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L75:
                java.lang.String r1 = "android.media.metadata.AUTHOR"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L85
                r2 = 3
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L85:
                java.lang.String r1 = "android.media.metadata.COMPILATION"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L96
                r2 = 15
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L96:
                java.lang.String r1 = "android.media.metadata.COMPOSER"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto La6
                r2 = 4
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            La6:
                java.lang.String r1 = "android.media.metadata.DATE"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto Lb6
                r2 = 5
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            Lb6:
                java.lang.String r1 = "android.media.metadata.DISC_NUMBER"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto Lc7
                r2 = 14
                long r3 = r7.getLong(r1)
                r0.putLong(r2, r3)
            Lc7:
                java.lang.String r1 = "android.media.metadata.DURATION"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto Ld8
                r2 = 9
                long r3 = r7.getLong(r1)
                r0.putLong(r2, r3)
            Ld8:
                java.lang.String r1 = "android.media.metadata.GENRE"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto Le8
                r2 = 6
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            Le8:
                java.lang.String r1 = "android.media.metadata.TITLE"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto Lf8
                r2 = 7
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            Lf8:
                java.lang.String r1 = "android.media.metadata.TRACK_NUMBER"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L107
                long r1 = r7.getLong(r1)
                r0.putLong(r5, r1)
            L107:
                java.lang.String r1 = "android.media.metadata.WRITER"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L118
                r2 = 11
                java.lang.String r7 = r7.getString(r1)
                r0.putString(r2, r7)
            L118:
                return r0
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public java.lang.String getCallingPackage() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public androidx.media.MediaSessionManager.RemoteUserInfo getCurrentControllerInfo() {
                r2 = this;
                java.lang.Object r0 = r2.mLock
                monitor-enter(r0)
                androidx.media.MediaSessionManager$RemoteUserInfo r1 = r2.mRemoteUserInfo     // Catch: java.lang.Throwable -> L7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                return r1
            L7:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                throw r1
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public java.lang.Object getMediaSession() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public android.support.v4.media.session.PlaybackStateCompat getPlaybackState() {
                r2 = this;
                java.lang.Object r0 = r2.mLock
                monitor-enter(r0)
                android.support.v4.media.session.PlaybackStateCompat r1 = r2.mState     // Catch: java.lang.Throwable -> L7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                return r1
            L7:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                throw r1
        }

        int getRccStateFromState(int r1) {
                r0 = this;
                switch(r1) {
                    case 0: goto L19;
                    case 1: goto L17;
                    case 2: goto L15;
                    case 3: goto L13;
                    case 4: goto L11;
                    case 5: goto Lf;
                    case 6: goto Lc;
                    case 7: goto L9;
                    case 8: goto Lc;
                    case 9: goto L7;
                    case 10: goto L5;
                    case 11: goto L5;
                    default: goto L3;
                }
            L3:
                r1 = -1
                return r1
            L5:
                r1 = 6
                return r1
            L7:
                r1 = 7
                return r1
            L9:
                r1 = 9
                return r1
            Lc:
                r1 = 8
                return r1
            Lf:
                r1 = 5
                return r1
            L11:
                r1 = 4
                return r1
            L13:
                r1 = 3
                return r1
            L15:
                r1 = 2
                return r1
            L17:
                r1 = 1
                return r1
            L19:
                r1 = 0
                return r1
        }

        int getRccTransportControlFlagsFromActions(long r7) {
                r6 = this;
                r0 = 1
                long r0 = r0 & r7
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto Lc
                r0 = 32
                goto Ld
            Lc:
                r0 = 0
            Ld:
                r4 = 2
                long r4 = r4 & r7
                int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r1 == 0) goto L16
                r0 = r0 | 16
            L16:
                r4 = 4
                long r4 = r4 & r7
                int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r1 == 0) goto L1f
                r0 = r0 | 4
            L1f:
                r4 = 8
                long r4 = r4 & r7
                int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r1 == 0) goto L28
                r0 = r0 | 2
            L28:
                r4 = 16
                long r4 = r4 & r7
                int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r1 == 0) goto L31
                r0 = r0 | 1
            L31:
                r4 = 32
                long r4 = r4 & r7
                int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r1 == 0) goto L3a
                r0 = r0 | 128(0x80, float:1.8E-43)
            L3a:
                r4 = 64
                long r4 = r4 & r7
                int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r1 == 0) goto L43
                r0 = r0 | 64
            L43:
                r4 = 512(0x200, double:2.53E-321)
                long r7 = r7 & r4
                int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r1 == 0) goto L4d
                r7 = r0 | 8
                return r7
            L4d:
                return r0
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public java.lang.Object getRemoteControlClient() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken() {
                r1 = this;
                android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.mToken
                return r0
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public boolean isActive() {
                r1 = this;
                boolean r0 = r1.mIsActive
                return r0
        }

        void postToHandler(int r3, int r4, int r5, java.lang.Object r6, android.os.Bundle r7) {
                r2 = this;
                java.lang.Object r0 = r2.mLock
                monitor-enter(r0)
                android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$MessageHandler r1 = r2.mHandler     // Catch: java.lang.Throwable -> L31
                if (r1 == 0) goto L39
                android.os.Message r3 = r1.obtainMessage(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L31
                android.os.Bundle r4 = new android.os.Bundle     // Catch: java.lang.Throwable -> L31
                r4.<init>()     // Catch: java.lang.Throwable -> L31
                java.lang.String r5 = "data_calling_pkg"
                java.lang.String r6 = "android.media.session.MediaController"
                r4.putString(r5, r6)     // Catch: java.lang.Throwable -> L31
                java.lang.String r5 = "data_calling_pid"
                int r6 = android.os.Binder.getCallingPid()     // Catch: java.lang.Throwable -> L31
                r4.putInt(r5, r6)     // Catch: java.lang.Throwable -> L31
                java.lang.String r5 = "data_calling_uid"
                int r6 = android.os.Binder.getCallingUid()     // Catch: java.lang.Throwable -> L31
                r4.putInt(r5, r6)     // Catch: java.lang.Throwable -> L31
                if (r7 == 0) goto L33
                java.lang.String r5 = "data_extras"
                r4.putBundle(r5, r7)     // Catch: java.lang.Throwable -> L31
                goto L33
            L31:
                r3 = move-exception
                goto L3b
            L33:
                r3.setData(r4)     // Catch: java.lang.Throwable -> L31
                r3.sendToTarget()     // Catch: java.lang.Throwable -> L31
            L39:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
                return
            L3b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
                throw r3
        }

        void registerMediaButtonEventReceiver(android.app.PendingIntent r1, android.content.ComponentName r2) {
                r0 = this;
                android.media.AudioManager r1 = r0.mAudioManager
                r1.registerMediaButtonEventReceiver(r2)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void release() {
                r1 = this;
                r0 = 0
                r1.mIsActive = r0
                r0 = 1
                r1.mDestroyed = r0
                r1.update()
                r1.sendSessionDestroyed()
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void sendSessionEvent(java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                r0.sendEvent(r1, r2)
                return
        }

        void sendVolumeInfoChanged(android.support.v4.media.session.ParcelableVolumeInfo r3) {
                r2 = this;
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r0 = r2.mControllerCallbacks
                int r0 = r0.beginBroadcast()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r2.mControllerCallbacks
                android.os.IInterface r1 = r1.getBroadcastItem(r0)
                android.support.v4.media.session.IMediaControllerCallback r1 = (android.support.v4.media.session.IMediaControllerCallback) r1
                r1.onVolumeInfoChanged(r3)     // Catch: android.os.RemoteException -> L15
            L15:
                int r0 = r0 + (-1)
                goto L8
            L18:
                android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r3 = r2.mControllerCallbacks
                r3.finishBroadcast()
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setActive(boolean r2) {
                r1 = this;
                boolean r0 = r1.mIsActive
                if (r2 != r0) goto L5
                goto L17
            L5:
                r1.mIsActive = r2
                boolean r2 = r1.update()
                if (r2 == 0) goto L17
                android.support.v4.media.MediaMetadataCompat r2 = r1.mMetadata
                r1.setMetadata(r2)
                android.support.v4.media.session.PlaybackStateCompat r2 = r1.mState
                r1.setPlaybackState(r2)
            L17:
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCallback(android.support.v4.media.session.MediaSessionCompat.Callback r3, android.os.Handler r4) {
                r2 = this;
                r2.mCallback = r3
                if (r3 == 0) goto L2d
                if (r4 != 0) goto Lb
                android.os.Handler r4 = new android.os.Handler
                r4.<init>()
            Lb:
                java.lang.Object r3 = r2.mLock
                monitor-enter(r3)
                android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$MessageHandler r0 = r2.mHandler     // Catch: java.lang.Throwable -> L17
                if (r0 == 0) goto L19
                r1 = 0
                r0.removeCallbacksAndMessages(r1)     // Catch: java.lang.Throwable -> L17
                goto L19
            L17:
                r4 = move-exception
                goto L2b
            L19:
                android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$MessageHandler r0 = new android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$MessageHandler     // Catch: java.lang.Throwable -> L17
                android.os.Looper r1 = r4.getLooper()     // Catch: java.lang.Throwable -> L17
                r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L17
                r2.mHandler = r0     // Catch: java.lang.Throwable -> L17
                android.support.v4.media.session.MediaSessionCompat$Callback r0 = r2.mCallback     // Catch: java.lang.Throwable -> L17
                r0.setSessionImpl(r2, r4)     // Catch: java.lang.Throwable -> L17
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L17
                return
            L2b:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L17
                throw r4
            L2d:
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCaptioningEnabled(boolean r2) {
                r1 = this;
                boolean r0 = r1.mCaptioningEnabled
                if (r0 == r2) goto L9
                r1.mCaptioningEnabled = r2
                r1.sendCaptioningEnabled(r2)
            L9:
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setCurrentControllerInfo(androidx.media.MediaSessionManager.RemoteUserInfo r2) {
                r1 = this;
                java.lang.Object r0 = r1.mLock
                monitor-enter(r0)
                r1.mRemoteUserInfo = r2     // Catch: java.lang.Throwable -> L7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r2 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                throw r2
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setExtras(android.os.Bundle r1) {
                r0 = this;
                r0.mExtras = r1
                r0.sendExtras(r1)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setFlags(int r2) {
                r1 = this;
                java.lang.Object r0 = r1.mLock
                monitor-enter(r0)
                r1.mFlags = r2     // Catch: java.lang.Throwable -> La
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La
                r1.update()
                return
            La:
                r2 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La
                throw r2
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setMediaButtonReceiver(android.app.PendingIntent r1) {
                r0 = this;
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setMetadata(android.support.v4.media.MediaMetadataCompat r3) {
                r2 = this;
                if (r3 == 0) goto Ld
                android.support.v4.media.MediaMetadataCompat$Builder r0 = new android.support.v4.media.MediaMetadataCompat$Builder
                int r1 = android.support.v4.media.session.MediaSessionCompat.sMaxBitmapSize
                r0.<init>(r3, r1)
                android.support.v4.media.MediaMetadataCompat r3 = r0.build()
            Ld:
                java.lang.Object r0 = r2.mLock
                monitor-enter(r0)
                r2.mMetadata = r3     // Catch: java.lang.Throwable -> L2b
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
                r2.sendMetadata(r3)
                boolean r0 = r2.mIsActive
                if (r0 != 0) goto L1b
                return
            L1b:
                if (r3 != 0) goto L1f
                r3 = 0
                goto L23
            L1f:
                android.os.Bundle r3 = r3.getBundle()
            L23:
                android.media.RemoteControlClient$MetadataEditor r3 = r2.buildRccMetadata(r3)
                r3.apply()
                return
            L2b:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
                throw r3
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackState(android.support.v4.media.session.PlaybackStateCompat r4) {
                r3 = this;
                java.lang.Object r0 = r3.mLock
                monitor-enter(r0)
                r3.mState = r4     // Catch: java.lang.Throwable -> L2d
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
                r3.sendState(r4)
                boolean r0 = r3.mIsActive
                if (r0 != 0) goto Le
                return
            Le:
                if (r4 != 0) goto L1c
                android.media.RemoteControlClient r4 = r3.mRcc
                r0 = 0
                r4.setPlaybackState(r0)
                android.media.RemoteControlClient r4 = r3.mRcc
                r4.setTransportControlFlags(r0)
                return
            L1c:
                r3.setRccState(r4)
                android.media.RemoteControlClient r0 = r3.mRcc
                long r1 = r4.getActions()
                int r4 = r3.getRccTransportControlFlagsFromActions(r1)
                r0.setTransportControlFlags(r4)
                return
            L2d:
                r4 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
                throw r4
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToLocal(int r7) {
                r6 = this;
                androidx.media.VolumeProviderCompat r0 = r6.mVolumeProvider
                if (r0 == 0) goto L8
                r1 = 0
                r0.setCallback(r1)
            L8:
                r6.mLocalStream = r7
                r7 = 1
                r6.mVolumeType = r7
                android.support.v4.media.session.ParcelableVolumeInfo r0 = new android.support.v4.media.session.ParcelableVolumeInfo
                int r1 = r6.mVolumeType
                int r2 = r6.mLocalStream
                android.media.AudioManager r7 = r6.mAudioManager
                int r4 = r7.getStreamMaxVolume(r2)
                android.media.AudioManager r7 = r6.mAudioManager
                int r3 = r6.mLocalStream
                int r5 = r7.getStreamVolume(r3)
                r3 = 2
                r0.<init>(r1, r2, r3, r4, r5)
                r6.sendVolumeInfoChanged(r0)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setPlaybackToRemote(androidx.media.VolumeProviderCompat r8) {
                r7 = this;
                if (r8 == 0) goto L33
                androidx.media.VolumeProviderCompat r0 = r7.mVolumeProvider
                if (r0 == 0) goto La
                r1 = 0
                r0.setCallback(r1)
            La:
                r0 = 2
                r7.mVolumeType = r0
                r7.mVolumeProvider = r8
                android.support.v4.media.session.ParcelableVolumeInfo r1 = new android.support.v4.media.session.ParcelableVolumeInfo
                int r2 = r7.mVolumeType
                int r3 = r7.mLocalStream
                androidx.media.VolumeProviderCompat r0 = r7.mVolumeProvider
                int r4 = r0.getVolumeControl()
                androidx.media.VolumeProviderCompat r0 = r7.mVolumeProvider
                int r5 = r0.getMaxVolume()
                androidx.media.VolumeProviderCompat r0 = r7.mVolumeProvider
                int r6 = r0.getCurrentVolume()
                r1.<init>(r2, r3, r4, r5, r6)
                r7.sendVolumeInfoChanged(r1)
                androidx.media.VolumeProviderCompat$Callback r0 = r7.mVolumeCallback
                r8.setCallback(r0)
                return
            L33:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "volumeProvider may not be null"
                r8.<init>(r0)
                throw r8
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setQueue(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> r1) {
                r0 = this;
                r0.mQueue = r1
                r0.sendQueue(r1)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setQueueTitle(java.lang.CharSequence r1) {
                r0 = this;
                r0.mQueueTitle = r1
                r0.sendQueueTitle(r1)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRatingType(int r1) {
                r0 = this;
                r0.mRatingType = r1
                return
        }

        void setRccState(android.support.v4.media.session.PlaybackStateCompat r2) {
                r1 = this;
                android.media.RemoteControlClient r0 = r1.mRcc
                int r2 = r2.getState()
                int r2 = r1.getRccStateFromState(r2)
                r0.setPlaybackState(r2)
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setRepeatMode(int r2) {
                r1 = this;
                int r0 = r1.mRepeatMode
                if (r0 == r2) goto L9
                r1.mRepeatMode = r2
                r1.sendRepeatMode(r2)
            L9:
                return
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setSessionActivity(android.app.PendingIntent r2) {
                r1 = this;
                java.lang.Object r0 = r1.mLock
                monitor-enter(r0)
                r1.mSessionActivity = r2     // Catch: java.lang.Throwable -> L7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r2 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                throw r2
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public void setShuffleMode(int r2) {
                r1 = this;
                int r0 = r1.mShuffleMode
                if (r0 == r2) goto L9
                r1.mShuffleMode = r2
                r1.sendShuffleMode(r2)
            L9:
                return
        }

        void setVolumeTo(int r3, int r4) {
                r2 = this;
                int r0 = r2.mVolumeType
                r1 = 2
                if (r0 != r1) goto Ld
                androidx.media.VolumeProviderCompat r4 = r2.mVolumeProvider
                if (r4 == 0) goto Lc
                r4.onSetVolumeTo(r3)
            Lc:
                return
            Ld:
                android.media.AudioManager r0 = r2.mAudioManager
                int r1 = r2.mLocalStream
                r0.setStreamVolume(r1, r3, r4)
                return
        }

        void unregisterMediaButtonEventReceiver(android.app.PendingIntent r1, android.content.ComponentName r2) {
                r0 = this;
                android.media.AudioManager r1 = r0.mAudioManager
                r1.unregisterMediaButtonEventReceiver(r2)
                return
        }

        boolean update() {
                r4 = this;
                boolean r0 = r4.mIsActive
                r1 = 0
                if (r0 == 0) goto L54
                boolean r0 = r4.mIsMbrRegistered
                r2 = 1
                if (r0 != 0) goto L19
                int r3 = r4.mFlags
                r3 = r3 & r2
                if (r3 == 0) goto L19
                android.app.PendingIntent r0 = r4.mMediaButtonReceiverIntent
                android.content.ComponentName r3 = r4.mMediaButtonReceiverComponentName
                r4.registerMediaButtonEventReceiver(r0, r3)
                r4.mIsMbrRegistered = r2
                goto L29
            L19:
                if (r0 == 0) goto L29
                int r0 = r4.mFlags
                r0 = r0 & r2
                if (r0 != 0) goto L29
                android.app.PendingIntent r0 = r4.mMediaButtonReceiverIntent
                android.content.ComponentName r3 = r4.mMediaButtonReceiverComponentName
                r4.unregisterMediaButtonEventReceiver(r0, r3)
                r4.mIsMbrRegistered = r1
            L29:
                boolean r0 = r4.mIsRccRegistered
                if (r0 != 0) goto L3d
                int r3 = r4.mFlags
                r3 = r3 & 2
                if (r3 == 0) goto L3d
                android.media.AudioManager r0 = r4.mAudioManager
                android.media.RemoteControlClient r1 = r4.mRcc
                r0.registerRemoteControlClient(r1)
                r4.mIsRccRegistered = r2
                return r2
            L3d:
                if (r0 == 0) goto L73
                int r0 = r4.mFlags
                r0 = r0 & 2
                if (r0 != 0) goto L73
                android.media.RemoteControlClient r0 = r4.mRcc
                r0.setPlaybackState(r1)
                android.media.AudioManager r0 = r4.mAudioManager
                android.media.RemoteControlClient r2 = r4.mRcc
                r0.unregisterRemoteControlClient(r2)
                r4.mIsRccRegistered = r1
                return r1
            L54:
                boolean r0 = r4.mIsMbrRegistered
                if (r0 == 0) goto L61
                android.app.PendingIntent r0 = r4.mMediaButtonReceiverIntent
                android.content.ComponentName r2 = r4.mMediaButtonReceiverComponentName
                r4.unregisterMediaButtonEventReceiver(r0, r2)
                r4.mIsMbrRegistered = r1
            L61:
                boolean r0 = r4.mIsRccRegistered
                if (r0 == 0) goto L73
                android.media.RemoteControlClient r0 = r4.mRcc
                r0.setPlaybackState(r1)
                android.media.AudioManager r0 = r4.mAudioManager
                android.media.RemoteControlClient r2 = r4.mRcc
                r0.unregisterRemoteControlClient(r2)
                r4.mIsRccRegistered = r1
            L73:
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnActiveChangeListener {
        void onActiveChanged();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class QueueItem implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.support.v4.media.session.MediaSessionCompat.QueueItem> CREATOR = null;
        public static final int UNKNOWN_ID = -1;
        private final android.support.v4.media.MediaDescriptionCompat mDescription;
        private final long mId;
        private java.lang.Object mItem;


        static {
                android.support.v4.media.session.MediaSessionCompat$QueueItem$1 r0 = new android.support.v4.media.session.MediaSessionCompat$QueueItem$1
                r0.<init>()
                android.support.v4.media.session.MediaSessionCompat.QueueItem.CREATOR = r0
                return
        }

        QueueItem(android.os.Parcel r3) {
                r2 = this;
                r2.<init>()
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r0 = android.support.v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r3)
                android.support.v4.media.MediaDescriptionCompat r0 = (android.support.v4.media.MediaDescriptionCompat) r0
                r2.mDescription = r0
                long r0 = r3.readLong()
                r2.mId = r0
                return
        }

        public QueueItem(android.support.v4.media.MediaDescriptionCompat r2, long r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r0, r2, r3)
                return
        }

        private QueueItem(java.lang.Object r4, android.support.v4.media.MediaDescriptionCompat r5, long r6) {
                r3 = this;
                r3.<init>()
                if (r5 == 0) goto L1a
                r0 = -1
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 == 0) goto L12
                r3.mDescription = r5
                r3.mId = r6
                r3.mItem = r4
                return
            L12:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Id cannot be QueueItem.UNKNOWN_ID"
                r4.<init>(r5)
                throw r4
            L1a:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Description cannot be null."
                r4.<init>(r5)
                throw r4
        }

        public static android.support.v4.media.session.MediaSessionCompat.QueueItem fromQueueItem(java.lang.Object r4) {
                if (r4 == 0) goto L14
                java.lang.Object r0 = android.support.v4.media.session.MediaSessionCompatApi21.QueueItem.getDescription(r4)
                android.support.v4.media.MediaDescriptionCompat r0 = android.support.v4.media.MediaDescriptionCompat.fromMediaDescription(r0)
                long r1 = android.support.v4.media.session.MediaSessionCompatApi21.QueueItem.getQueueId(r4)
                android.support.v4.media.session.MediaSessionCompat$QueueItem r3 = new android.support.v4.media.session.MediaSessionCompat$QueueItem
                r3.<init>(r4, r0, r1)
                return r3
            L14:
                r4 = 0
                return r4
        }

        public static java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> fromQueueItemList(java.util.List<?> r2) {
                if (r2 == 0) goto L1e
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r2 = r2.iterator()
            Lb:
                boolean r1 = r2.hasNext()
                if (r1 == 0) goto L1d
                java.lang.Object r1 = r2.next()
                android.support.v4.media.session.MediaSessionCompat$QueueItem r1 = fromQueueItem(r1)
                r0.add(r1)
                goto Lb
            L1d:
                return r0
            L1e:
                r2 = 0
                return r2
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public android.support.v4.media.MediaDescriptionCompat getDescription() {
                r1 = this;
                android.support.v4.media.MediaDescriptionCompat r0 = r1.mDescription
                return r0
        }

        public long getQueueId() {
                r2 = this;
                long r0 = r2.mId
                return r0
        }

        public java.lang.Object getQueueItem() {
                r3 = this;
                java.lang.Object r0 = r3.mItem
                if (r0 != 0) goto L12
                android.support.v4.media.MediaDescriptionCompat r0 = r3.mDescription
                java.lang.Object r0 = r0.getMediaDescription()
                long r1 = r3.mId
                java.lang.Object r0 = android.support.v4.media.session.MediaSessionCompatApi21.QueueItem.createItem(r0, r1)
                r3.mItem = r0
            L12:
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "MediaSession.QueueItem {Description="
                r0.append(r1)
                android.support.v4.media.MediaDescriptionCompat r1 = r3.mDescription
                r0.append(r1)
                java.lang.String r1 = ", Id="
                r0.append(r1)
                long r1 = r3.mId
                r0.append(r1)
                java.lang.String r1 = " }"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r3, int r4) {
                r2 = this;
                android.support.v4.media.MediaDescriptionCompat r0 = r2.mDescription
                r0.writeToParcel(r3, r4)
                long r0 = r2.mId
                r3.writeLong(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final class ResultReceiverWrapper implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper> CREATOR = null;
        android.os.ResultReceiver mResultReceiver;


        static {
                android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$1 r0 = new android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$1
                r0.<init>()
                android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.CREATOR = r0
                return
        }

        ResultReceiverWrapper(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                android.os.Parcelable$Creator r0 = android.os.ResultReceiver.CREATOR
                java.lang.Object r2 = r0.createFromParcel(r2)
                android.os.ResultReceiver r2 = (android.os.ResultReceiver) r2
                r1.mResultReceiver = r2
                return
        }

        public ResultReceiverWrapper(android.os.ResultReceiver r1) {
                r0 = this;
                r0.<init>()
                r0.mResultReceiver = r1
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                android.os.ResultReceiver r0 = r1.mResultReceiver
                r0.writeToParcel(r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface SessionFlags {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Token implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.support.v4.media.session.MediaSessionCompat.Token> CREATOR = null;
        private android.support.v4.media.session.IMediaSession mExtraBinder;
        private final java.lang.Object mInner;
        private android.os.Bundle mSessionToken2Bundle;


        static {
                android.support.v4.media.session.MediaSessionCompat$Token$1 r0 = new android.support.v4.media.session.MediaSessionCompat$Token$1
                r0.<init>()
                android.support.v4.media.session.MediaSessionCompat.Token.CREATOR = r0
                return
        }

        Token(java.lang.Object r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0, r0)
                return
        }

        Token(java.lang.Object r2, android.support.v4.media.session.IMediaSession r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        Token(java.lang.Object r1, android.support.v4.media.session.IMediaSession r2, android.os.Bundle r3) {
                r0 = this;
                r0.<init>()
                r0.mInner = r1
                r0.mExtraBinder = r2
                r0.mSessionToken2Bundle = r3
                return
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public static android.support.v4.media.session.MediaSessionCompat.Token fromBundle(android.os.Bundle r4) {
                r0 = 0
                if (r4 != 0) goto L4
                return r0
            L4:
                java.lang.String r1 = "android.support.v4.media.session.EXTRA_BINDER"
                android.os.IBinder r1 = androidx.core.app.BundleCompat.getBinder(r4, r1)
                android.support.v4.media.session.IMediaSession r1 = android.support.v4.media.session.IMediaSession.Stub.asInterface(r1)
                java.lang.String r2 = "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"
                android.os.Bundle r2 = r4.getBundle(r2)
                java.lang.String r3 = "android.support.v4.media.session.TOKEN"
                android.os.Parcelable r4 = r4.getParcelable(r3)
                android.support.v4.media.session.MediaSessionCompat$Token r4 = (android.support.v4.media.session.MediaSessionCompat.Token) r4
                if (r4 != 0) goto L1f
                return r0
            L1f:
                android.support.v4.media.session.MediaSessionCompat$Token r0 = new android.support.v4.media.session.MediaSessionCompat$Token
                java.lang.Object r4 = r4.mInner
                r0.<init>(r4, r1, r2)
                return r0
        }

        public static android.support.v4.media.session.MediaSessionCompat.Token fromToken(java.lang.Object r1) {
                r0 = 0
                android.support.v4.media.session.MediaSessionCompat$Token r1 = fromToken(r1, r0)
                return r1
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public static android.support.v4.media.session.MediaSessionCompat.Token fromToken(java.lang.Object r1, android.support.v4.media.session.IMediaSession r2) {
                if (r1 == 0) goto Lc
                android.support.v4.media.session.MediaSessionCompat$Token r0 = new android.support.v4.media.session.MediaSessionCompat$Token
                java.lang.Object r1 = android.support.v4.media.session.MediaSessionCompatApi21.verifyToken(r1)
                r0.<init>(r1, r2)
                return r0
            Lc:
                r1 = 0
                return r1
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof android.support.v4.media.session.MediaSessionCompat.Token
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                android.support.v4.media.session.MediaSessionCompat$Token r4 = (android.support.v4.media.session.MediaSessionCompat.Token) r4
                java.lang.Object r1 = r3.mInner
                if (r1 != 0) goto L16
                java.lang.Object r4 = r4.mInner
                if (r4 != 0) goto L15
                return r0
            L15:
                return r2
            L16:
                java.lang.Object r4 = r4.mInner
                if (r4 != 0) goto L1b
                return r2
            L1b:
                boolean r4 = r1.equals(r4)
                return r4
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public android.support.v4.media.session.IMediaSession getExtraBinder() {
                r1 = this;
                android.support.v4.media.session.IMediaSession r0 = r1.mExtraBinder
                return r0
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public android.os.Bundle getSessionToken2Bundle() {
                r1 = this;
                android.os.Bundle r0 = r1.mSessionToken2Bundle
                return r0
        }

        public java.lang.Object getToken() {
                r1 = this;
                java.lang.Object r0 = r1.mInner
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.Object r0 = r1.mInner
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                int r0 = r0.hashCode()
                return r0
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public void setExtraBinder(android.support.v4.media.session.IMediaSession r1) {
                r0 = this;
                r0.mExtraBinder = r1
                return
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public void setSessionToken2Bundle(android.os.Bundle r1) {
                r0 = this;
                r0.mSessionToken2Bundle = r1
                return
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public android.os.Bundle toBundle() {
                r3 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "android.support.v4.media.session.TOKEN"
                r0.putParcelable(r1, r3)
                android.support.v4.media.session.IMediaSession r1 = r3.mExtraBinder
                if (r1 == 0) goto L17
                java.lang.String r2 = "android.support.v4.media.session.EXTRA_BINDER"
                android.os.IBinder r1 = r1.asBinder()
                androidx.core.app.BundleCompat.putBinder(r0, r2, r1)
            L17:
                android.os.Bundle r1 = r3.mSessionToken2Bundle
                if (r1 == 0) goto L20
                java.lang.String r2 = "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"
                r0.putBundle(r2, r1)
            L20:
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                java.lang.Object r0 = r1.mInner
                android.os.Parcelable r0 = (android.os.Parcelable) r0
                r2.writeParcelable(r0, r3)
                return
        }
    }

    private MediaSessionCompat(android.content.Context r2, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mActiveListeners = r0
            r1.mImpl = r3
            java.lang.Object r3 = r3.getMediaSession()
            boolean r3 = android.support.v4.media.session.MediaSessionCompatApi21.hasCallback(r3)
            if (r3 != 0) goto L1e
            android.support.v4.media.session.MediaSessionCompat$3 r3 = new android.support.v4.media.session.MediaSessionCompat$3
            r3.<init>(r1)
            r1.setCallback(r3)
        L1e:
            android.support.v4.media.session.MediaControllerCompat r3 = new android.support.v4.media.session.MediaControllerCompat
            r3.<init>(r2, r1)
            r1.mController = r3
            return
    }

    public MediaSessionCompat(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r0)
            return
    }

    public MediaSessionCompat(android.content.Context r7, java.lang.String r8, android.content.ComponentName r9, android.app.PendingIntent r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private MediaSessionCompat(android.content.Context r2, java.lang.String r3, android.content.ComponentName r4, android.app.PendingIntent r5, android.os.Bundle r6) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mActiveListeners = r0
            if (r2 == 0) goto L7f
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L77
            if (r4 != 0) goto L18
            android.content.ComponentName r4 = androidx.media.session.MediaButtonReceiver.getMediaButtonReceiverComponent(r2)
        L18:
            if (r4 == 0) goto L2b
            if (r5 != 0) goto L2b
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.MEDIA_BUTTON"
            r5.<init>(r0)
            r5.setComponent(r4)
            r4 = 0
            android.app.PendingIntent r5 = android.app.PendingIntent.getBroadcast(r2, r4, r5, r4)
        L2b:
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r4 < r0) goto L44
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi28 r4 = new android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi28
            r4.<init>(r2, r3, r6)
            r1.mImpl = r4
            android.support.v4.media.session.MediaSessionCompat$1 r3 = new android.support.v4.media.session.MediaSessionCompat$1
            r3.<init>(r1)
            r1.setCallback(r3)
            r4.setMediaButtonReceiver(r5)
            goto L56
        L44:
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21 r4 = new android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21
            r4.<init>(r2, r3, r6)
            r1.mImpl = r4
            android.support.v4.media.session.MediaSessionCompat$2 r3 = new android.support.v4.media.session.MediaSessionCompat$2
            r3.<init>(r1)
            r1.setCallback(r3)
            r4.setMediaButtonReceiver(r5)
        L56:
            android.support.v4.media.session.MediaControllerCompat r3 = new android.support.v4.media.session.MediaControllerCompat
            r3.<init>(r2, r1)
            r1.mController = r3
            int r3 = android.support.v4.media.session.MediaSessionCompat.sMaxBitmapSize
            if (r3 != 0) goto L76
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            r3 = 1
            r4 = 1134559232(0x43a00000, float:320.0)
            float r2 = android.util.TypedValue.applyDimension(r3, r4, r2)
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            android.support.v4.media.session.MediaSessionCompat.sMaxBitmapSize = r2
        L76:
            return
        L77:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "tag must not be null or empty"
            r2.<init>(r3)
            throw r2
        L7f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "context must not be null"
            r2.<init>(r3)
            throw r2
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public MediaSessionCompat(android.content.Context r7, java.lang.String r8, android.os.Bundle r9) {
            r6 = this;
            r3 = 0
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static void ensureClassLoader(@androidx.annotation.Nullable android.os.Bundle r1) {
            if (r1 == 0) goto Lb
            java.lang.Class<android.support.v4.media.session.MediaSessionCompat> r0 = android.support.v4.media.session.MediaSessionCompat.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1.setClassLoader(r0)
        Lb:
            return
    }

    public static android.support.v4.media.session.MediaSessionCompat fromMediaSession(android.content.Context r2, java.lang.Object r3) {
            if (r2 == 0) goto Lf
            if (r3 == 0) goto Lf
            android.support.v4.media.session.MediaSessionCompat r0 = new android.support.v4.media.session.MediaSessionCompat
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21 r1 = new android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21
            r1.<init>(r3)
            r0.<init>(r2, r1)
            return r0
        Lf:
            r2 = 0
            return r2
    }

    static android.support.v4.media.session.PlaybackStateCompat getStateWithUpdatedPosition(android.support.v4.media.session.PlaybackStateCompat r14, android.support.v4.media.MediaMetadataCompat r15) {
            if (r14 == 0) goto L73
            long r0 = r14.getPosition()
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Ld
            goto L73
        Ld:
            int r0 = r14.getState()
            r1 = 3
            if (r0 == r1) goto L22
            int r0 = r14.getState()
            r1 = 4
            if (r0 == r1) goto L22
            int r0 = r14.getState()
            r1 = 5
            if (r0 != r1) goto L73
        L22:
            long r0 = r14.getLastPositionUpdateTime()
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L73
            long r12 = android.os.SystemClock.elapsedRealtime()
            float r6 = r14.getPlaybackSpeed()
            long r0 = r12 - r0
            float r0 = (float) r0
            float r6 = r6 * r0
            long r0 = (long) r6
            long r6 = r14.getPosition()
            long r0 = r0 + r6
            if (r15 == 0) goto L4d
            java.lang.String r6 = "android.media.metadata.DURATION"
            boolean r7 = r15.containsKey(r6)
            if (r7 == 0) goto L4d
            long r2 = r15.getLong(r6)
        L4d:
            int r15 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r15 < 0) goto L57
            int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r15 <= 0) goto L57
            r9 = r2
            goto L5e
        L57:
            int r15 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r15 >= 0) goto L5d
            r9 = r4
            goto L5e
        L5d:
            r9 = r0
        L5e:
            android.support.v4.media.session.PlaybackStateCompat$Builder r7 = new android.support.v4.media.session.PlaybackStateCompat$Builder
            r7.<init>(r14)
            int r8 = r14.getState()
            float r11 = r14.getPlaybackSpeed()
            android.support.v4.media.session.PlaybackStateCompat$Builder r14 = r7.setState(r8, r9, r11, r12)
            android.support.v4.media.session.PlaybackStateCompat r14 = r14.build()
        L73:
            return r14
    }

    public void addOnActiveChangeListener(android.support.v4.media.session.MediaSessionCompat.OnActiveChangeListener r2) {
            r1 = this;
            if (r2 == 0) goto L8
            java.util.ArrayList<android.support.v4.media.session.MediaSessionCompat$OnActiveChangeListener> r0 = r1.mActiveListeners
            r0.add(r2)
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Listener may not be null"
            r2.<init>(r0)
            throw r2
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public java.lang.String getCallingPackage() {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r0 = r1.mImpl
            java.lang.String r0 = r0.getCallingPackage()
            return r0
    }

    public android.support.v4.media.session.MediaControllerCompat getController() {
            r1 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r1.mController
            return r0
    }

    @androidx.annotation.NonNull
    public final androidx.media.MediaSessionManager.RemoteUserInfo getCurrentControllerInfo() {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r0 = r1.mImpl
            androidx.media.MediaSessionManager$RemoteUserInfo r0 = r0.getCurrentControllerInfo()
            return r0
    }

    public java.lang.Object getMediaSession() {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r0 = r1.mImpl
            java.lang.Object r0 = r0.getMediaSession()
            return r0
    }

    public java.lang.Object getRemoteControlClient() {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r0 = r1.mImpl
            java.lang.Object r0 = r0.getRemoteControlClient()
            return r0
    }

    public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken() {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r0 = r1.mImpl
            android.support.v4.media.session.MediaSessionCompat$Token r0 = r0.getSessionToken()
            return r0
    }

    public boolean isActive() {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r0 = r1.mImpl
            boolean r0 = r0.isActive()
            return r0
    }

    public void release() {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r0 = r1.mImpl
            r0.release()
            return
    }

    public void removeOnActiveChangeListener(android.support.v4.media.session.MediaSessionCompat.OnActiveChangeListener r2) {
            r1 = this;
            if (r2 == 0) goto L8
            java.util.ArrayList<android.support.v4.media.session.MediaSessionCompat$OnActiveChangeListener> r0 = r1.mActiveListeners
            r0.remove(r2)
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Listener may not be null"
            r2.<init>(r0)
            throw r2
    }

    public void sendSessionEvent(java.lang.String r2, android.os.Bundle r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lc
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r0 = r1.mImpl
            r0.sendSessionEvent(r2, r3)
            return
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "event cannot be null or empty"
            r2.<init>(r3)
            throw r2
    }

    public void setActive(boolean r2) {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r0 = r1.mImpl
            r0.setActive(r2)
            java.util.ArrayList<android.support.v4.media.session.MediaSessionCompat$OnActiveChangeListener> r2 = r1.mActiveListeners
            java.util.Iterator r2 = r2.iterator()
        Lb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r2.next()
            android.support.v4.media.session.MediaSessionCompat$OnActiveChangeListener r0 = (android.support.v4.media.session.MediaSessionCompat.OnActiveChangeListener) r0
            r0.onActiveChanged()
            goto Lb
        L1b:
            return
    }

    public void setCallback(android.support.v4.media.session.MediaSessionCompat.Callback r2) {
            r1 = this;
            r0 = 0
            r1.setCallback(r2, r0)
            return
    }

    public void setCallback(android.support.v4.media.session.MediaSessionCompat.Callback r2, android.os.Handler r3) {
            r1 = this;
            if (r2 != 0) goto L9
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r2 = r1.mImpl
            r3 = 0
            r2.setCallback(r3, r3)
            return
        L9:
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r0 = r1.mImpl
            if (r3 == 0) goto Le
            goto L13
        Le:
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
        L13:
            r0.setCallback(r2, r3)
            return
    }

    public void setCaptioningEnabled(boolean r2) {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r0 = r1.mImpl
            r0.setCaptioningEnabled(r2)
            return
    }

    public void setExtras(android.os.Bundle r2) {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r0 = r1.mImpl
            r0.setExtras(r2)
            return
    }

    public void setFlags(int r2) {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r0 = r1.mImpl
            r0.setFlags(r2)
            return
    }

    public void setMediaButtonReceiver(android.app.PendingIntent r2) {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r0 = r1.mImpl
            r0.setMediaButtonReceiver(r2)
            return
    }

    public void setMetadata(android.support.v4.media.MediaMetadataCompat r2) {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r0 = r1.mImpl
            r0.setMetadata(r2)
            return
    }

    public void setPlaybackState(android.support.v4.media.session.PlaybackStateCompat r2) {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r0 = r1.mImpl
            r0.setPlaybackState(r2)
            return
    }

    public void setPlaybackToLocal(int r2) {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r0 = r1.mImpl
            r0.setPlaybackToLocal(r2)
            return
    }

    public void setPlaybackToRemote(androidx.media.VolumeProviderCompat r2) {
            r1 = this;
            if (r2 == 0) goto L8
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r0 = r1.mImpl
            r0.setPlaybackToRemote(r2)
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "volumeProvider may not be null!"
            r2.<init>(r0)
            throw r2
    }

    public void setQueue(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> r2) {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r0 = r1.mImpl
            r0.setQueue(r2)
            return
    }

    public void setQueueTitle(java.lang.CharSequence r2) {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r0 = r1.mImpl
            r0.setQueueTitle(r2)
            return
    }

    public void setRatingType(int r2) {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r0 = r1.mImpl
            r0.setRatingType(r2)
            return
    }

    public void setRepeatMode(int r2) {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r0 = r1.mImpl
            r0.setRepeatMode(r2)
            return
    }

    public void setSessionActivity(android.app.PendingIntent r2) {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r0 = r1.mImpl
            r0.setSessionActivity(r2)
            return
    }

    public void setShuffleMode(int r2) {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl r0 = r1.mImpl
            r0.setShuffleMode(r2)
            return
    }
}
