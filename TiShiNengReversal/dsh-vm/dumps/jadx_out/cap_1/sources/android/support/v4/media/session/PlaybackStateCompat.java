package android.support.v4.media.session;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class PlaybackStateCompat implements android.os.Parcelable {
    public static final long ACTION_FAST_FORWARD = 64;
    public static final long ACTION_PAUSE = 2;
    public static final long ACTION_PLAY = 4;
    public static final long ACTION_PLAY_FROM_MEDIA_ID = 1024;
    public static final long ACTION_PLAY_FROM_SEARCH = 2048;
    public static final long ACTION_PLAY_FROM_URI = 8192;
    public static final long ACTION_PLAY_PAUSE = 512;
    public static final long ACTION_PREPARE = 16384;
    public static final long ACTION_PREPARE_FROM_MEDIA_ID = 32768;
    public static final long ACTION_PREPARE_FROM_SEARCH = 65536;
    public static final long ACTION_PREPARE_FROM_URI = 131072;
    public static final long ACTION_REWIND = 8;
    public static final long ACTION_SEEK_TO = 256;
    public static final long ACTION_SET_CAPTIONING_ENABLED = 1048576;
    public static final long ACTION_SET_RATING = 128;
    public static final long ACTION_SET_REPEAT_MODE = 262144;
    public static final long ACTION_SET_SHUFFLE_MODE = 2097152;

    @java.lang.Deprecated
    public static final long ACTION_SET_SHUFFLE_MODE_ENABLED = 524288;
    public static final long ACTION_SKIP_TO_NEXT = 32;
    public static final long ACTION_SKIP_TO_PREVIOUS = 16;
    public static final long ACTION_SKIP_TO_QUEUE_ITEM = 4096;
    public static final long ACTION_STOP = 1;
    public static final android.os.Parcelable.Creator<android.support.v4.media.session.PlaybackStateCompat> CREATOR = null;
    public static final int ERROR_CODE_ACTION_ABORTED = 10;
    public static final int ERROR_CODE_APP_ERROR = 1;
    public static final int ERROR_CODE_AUTHENTICATION_EXPIRED = 3;
    public static final int ERROR_CODE_CONCURRENT_STREAM_LIMIT = 5;
    public static final int ERROR_CODE_CONTENT_ALREADY_PLAYING = 8;
    public static final int ERROR_CODE_END_OF_QUEUE = 11;
    public static final int ERROR_CODE_NOT_AVAILABLE_IN_REGION = 7;
    public static final int ERROR_CODE_NOT_SUPPORTED = 2;
    public static final int ERROR_CODE_PARENTAL_CONTROL_RESTRICTED = 6;
    public static final int ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED = 4;
    public static final int ERROR_CODE_SKIP_LIMIT_REACHED = 9;
    public static final int ERROR_CODE_UNKNOWN_ERROR = 0;
    private static final int KEYCODE_MEDIA_PAUSE = 127;
    private static final int KEYCODE_MEDIA_PLAY = 126;
    public static final long PLAYBACK_POSITION_UNKNOWN = -1;
    public static final int REPEAT_MODE_ALL = 2;
    public static final int REPEAT_MODE_GROUP = 3;
    public static final int REPEAT_MODE_INVALID = -1;
    public static final int REPEAT_MODE_NONE = 0;
    public static final int REPEAT_MODE_ONE = 1;
    public static final int SHUFFLE_MODE_ALL = 1;
    public static final int SHUFFLE_MODE_GROUP = 2;
    public static final int SHUFFLE_MODE_INVALID = -1;
    public static final int SHUFFLE_MODE_NONE = 0;
    public static final int STATE_BUFFERING = 6;
    public static final int STATE_CONNECTING = 8;
    public static final int STATE_ERROR = 7;
    public static final int STATE_FAST_FORWARDING = 4;
    public static final int STATE_NONE = 0;
    public static final int STATE_PAUSED = 2;
    public static final int STATE_PLAYING = 3;
    public static final int STATE_REWINDING = 5;
    public static final int STATE_SKIPPING_TO_NEXT = 10;
    public static final int STATE_SKIPPING_TO_PREVIOUS = 9;
    public static final int STATE_SKIPPING_TO_QUEUE_ITEM = 11;
    public static final int STATE_STOPPED = 1;
    final long mActions;
    final long mActiveItemId;
    final long mBufferedPosition;
    java.util.List<android.support.v4.media.session.PlaybackStateCompat.CustomAction> mCustomActions;
    final int mErrorCode;
    final java.lang.CharSequence mErrorMessage;
    final android.os.Bundle mExtras;
    final long mPosition;
    final float mSpeed;
    final int mState;
    private java.lang.Object mStateObj;
    final long mUpdateTime;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Actions {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {
        private long mActions;
        private long mActiveItemId;
        private long mBufferedPosition;
        private final java.util.List<android.support.v4.media.session.PlaybackStateCompat.CustomAction> mCustomActions;
        private int mErrorCode;
        private java.lang.CharSequence mErrorMessage;
        private android.os.Bundle mExtras;
        private long mPosition;
        private float mRate;
        private int mState;
        private long mUpdateTime;

        public Builder() {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.mCustomActions = r0
                r0 = -1
                r2.mActiveItemId = r0
                return
        }

        public Builder(android.support.v4.media.session.PlaybackStateCompat r4) {
                r3 = this;
                r3.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r3.mCustomActions = r0
                r1 = -1
                r3.mActiveItemId = r1
                int r1 = r4.mState
                r3.mState = r1
                long r1 = r4.mPosition
                r3.mPosition = r1
                float r1 = r4.mSpeed
                r3.mRate = r1
                long r1 = r4.mUpdateTime
                r3.mUpdateTime = r1
                long r1 = r4.mBufferedPosition
                r3.mBufferedPosition = r1
                long r1 = r4.mActions
                r3.mActions = r1
                int r1 = r4.mErrorCode
                r3.mErrorCode = r1
                java.lang.CharSequence r1 = r4.mErrorMessage
                r3.mErrorMessage = r1
                java.util.List<android.support.v4.media.session.PlaybackStateCompat$CustomAction> r1 = r4.mCustomActions
                if (r1 == 0) goto L35
                r0.addAll(r1)
            L35:
                long r0 = r4.mActiveItemId
                r3.mActiveItemId = r0
                android.os.Bundle r4 = r4.mExtras
                r3.mExtras = r4
                return
        }

        public android.support.v4.media.session.PlaybackStateCompat.Builder addCustomAction(android.support.v4.media.session.PlaybackStateCompat.CustomAction r2) {
                r1 = this;
                if (r2 == 0) goto L8
                java.util.List<android.support.v4.media.session.PlaybackStateCompat$CustomAction> r0 = r1.mCustomActions
                r0.add(r2)
                return r1
            L8:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "You may not add a null CustomAction to PlaybackStateCompat."
                r2.<init>(r0)
                throw r2
        }

        public android.support.v4.media.session.PlaybackStateCompat.Builder addCustomAction(java.lang.String r3, java.lang.String r4, int r5) {
                r2 = this;
                android.support.v4.media.session.PlaybackStateCompat$CustomAction r0 = new android.support.v4.media.session.PlaybackStateCompat$CustomAction
                r1 = 0
                r0.<init>(r3, r4, r5, r1)
                android.support.v4.media.session.PlaybackStateCompat$Builder r3 = r2.addCustomAction(r0)
                return r3
        }

        public android.support.v4.media.session.PlaybackStateCompat build() {
                r21 = this;
                r0 = r21
                android.support.v4.media.session.PlaybackStateCompat r1 = new android.support.v4.media.session.PlaybackStateCompat
                int r2 = r0.mState
                long r3 = r0.mPosition
                long r5 = r0.mBufferedPosition
                float r7 = r0.mRate
                long r8 = r0.mActions
                int r10 = r0.mErrorCode
                java.lang.CharSequence r11 = r0.mErrorMessage
                long r12 = r0.mUpdateTime
                java.util.List<android.support.v4.media.session.PlaybackStateCompat$CustomAction> r14 = r0.mCustomActions
                r15 = r1
                r16 = r2
                long r1 = r0.mActiveItemId
                r17 = r1
                android.os.Bundle r1 = r0.mExtras
                r2 = r16
                r19 = r17
                r17 = r1
                r1 = r15
                r15 = r19
                r1.<init>(r2, r3, r5, r7, r8, r10, r11, r12, r14, r15, r17)
                r15 = r1
                return r15
        }

        public android.support.v4.media.session.PlaybackStateCompat.Builder setActions(long r1) {
                r0 = this;
                r0.mActions = r1
                return r0
        }

        public android.support.v4.media.session.PlaybackStateCompat.Builder setActiveQueueItemId(long r1) {
                r0 = this;
                r0.mActiveItemId = r1
                return r0
        }

        public android.support.v4.media.session.PlaybackStateCompat.Builder setBufferedPosition(long r1) {
                r0 = this;
                r0.mBufferedPosition = r1
                return r0
        }

        public android.support.v4.media.session.PlaybackStateCompat.Builder setErrorMessage(int r1, java.lang.CharSequence r2) {
                r0 = this;
                r0.mErrorCode = r1
                r0.mErrorMessage = r2
                return r0
        }

        public android.support.v4.media.session.PlaybackStateCompat.Builder setErrorMessage(java.lang.CharSequence r1) {
                r0 = this;
                r0.mErrorMessage = r1
                return r0
        }

        public android.support.v4.media.session.PlaybackStateCompat.Builder setExtras(android.os.Bundle r1) {
                r0 = this;
                r0.mExtras = r1
                return r0
        }

        public android.support.v4.media.session.PlaybackStateCompat.Builder setState(int r8, long r9, float r11) {
                r7 = this;
                long r5 = android.os.SystemClock.elapsedRealtime()
                r0 = r7
                r1 = r8
                r2 = r9
                r4 = r11
                android.support.v4.media.session.PlaybackStateCompat$Builder r8 = r0.setState(r1, r2, r4, r5)
                return r8
        }

        public android.support.v4.media.session.PlaybackStateCompat.Builder setState(int r1, long r2, float r4, long r5) {
                r0 = this;
                r0.mState = r1
                r0.mPosition = r2
                r0.mUpdateTime = r5
                r0.mRate = r4
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class CustomAction implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.support.v4.media.session.PlaybackStateCompat.CustomAction> CREATOR = null;
        private final java.lang.String mAction;
        private java.lang.Object mCustomActionObj;
        private final android.os.Bundle mExtras;
        private final int mIcon;
        private final java.lang.CharSequence mName;


        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class Builder {
            private final java.lang.String mAction;
            private android.os.Bundle mExtras;
            private final int mIcon;
            private final java.lang.CharSequence mName;

            public Builder(java.lang.String r2, java.lang.CharSequence r3, int r4) {
                    r1 = this;
                    r1.<init>()
                    boolean r0 = android.text.TextUtils.isEmpty(r2)
                    if (r0 != 0) goto L28
                    boolean r0 = android.text.TextUtils.isEmpty(r3)
                    if (r0 != 0) goto L20
                    if (r4 == 0) goto L18
                    r1.mAction = r2
                    r1.mName = r3
                    r1.mIcon = r4
                    return
                L18:
                    java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                    java.lang.String r3 = "You must specify an icon resource id to build a CustomAction."
                    r2.<init>(r3)
                    throw r2
                L20:
                    java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                    java.lang.String r3 = "You must specify a name to build a CustomAction."
                    r2.<init>(r3)
                    throw r2
                L28:
                    java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                    java.lang.String r3 = "You must specify an action to build a CustomAction."
                    r2.<init>(r3)
                    throw r2
            }

            public android.support.v4.media.session.PlaybackStateCompat.CustomAction build() {
                    r5 = this;
                    android.support.v4.media.session.PlaybackStateCompat$CustomAction r0 = new android.support.v4.media.session.PlaybackStateCompat$CustomAction
                    java.lang.String r1 = r5.mAction
                    java.lang.CharSequence r2 = r5.mName
                    int r3 = r5.mIcon
                    android.os.Bundle r4 = r5.mExtras
                    r0.<init>(r1, r2, r3, r4)
                    return r0
            }

            public android.support.v4.media.session.PlaybackStateCompat.CustomAction.Builder setExtras(android.os.Bundle r1) {
                    r0 = this;
                    r0.mExtras = r1
                    return r0
            }
        }

        static {
                android.support.v4.media.session.PlaybackStateCompat$CustomAction$1 r0 = new android.support.v4.media.session.PlaybackStateCompat$CustomAction$1
                r0.<init>()
                android.support.v4.media.session.PlaybackStateCompat.CustomAction.CREATOR = r0
                return
        }

        CustomAction(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.readString()
                r1.mAction = r0
                android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
                java.lang.Object r0 = r0.createFromParcel(r2)
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r1.mName = r0
                int r0 = r2.readInt()
                r1.mIcon = r0
                java.lang.Class<android.support.v4.media.session.MediaSessionCompat> r0 = android.support.v4.media.session.MediaSessionCompat.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Bundle r2 = r2.readBundle(r0)
                r1.mExtras = r2
                return
        }

        CustomAction(java.lang.String r1, java.lang.CharSequence r2, int r3, android.os.Bundle r4) {
                r0 = this;
                r0.<init>()
                r0.mAction = r1
                r0.mName = r2
                r0.mIcon = r3
                r0.mExtras = r4
                return
        }

        public static android.support.v4.media.session.PlaybackStateCompat.CustomAction fromCustomAction(java.lang.Object r5) {
                if (r5 == 0) goto L1a
                android.support.v4.media.session.PlaybackStateCompat$CustomAction r0 = new android.support.v4.media.session.PlaybackStateCompat$CustomAction
                java.lang.String r1 = android.support.v4.media.session.PlaybackStateCompatApi21.CustomAction.getAction(r5)
                java.lang.CharSequence r2 = android.support.v4.media.session.PlaybackStateCompatApi21.CustomAction.getName(r5)
                int r3 = android.support.v4.media.session.PlaybackStateCompatApi21.CustomAction.getIcon(r5)
                android.os.Bundle r4 = android.support.v4.media.session.PlaybackStateCompatApi21.CustomAction.getExtras(r5)
                r0.<init>(r1, r2, r3, r4)
                r0.mCustomActionObj = r5
                return r0
            L1a:
                r5 = 0
                return r5
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public java.lang.String getAction() {
                r1 = this;
                java.lang.String r0 = r1.mAction
                return r0
        }

        public java.lang.Object getCustomAction() {
                r4 = this;
                java.lang.Object r0 = r4.mCustomActionObj
                if (r0 != 0) goto L12
                java.lang.String r0 = r4.mAction
                java.lang.CharSequence r1 = r4.mName
                int r2 = r4.mIcon
                android.os.Bundle r3 = r4.mExtras
                java.lang.Object r0 = android.support.v4.media.session.PlaybackStateCompatApi21.CustomAction.newInstance(r0, r1, r2, r3)
                r4.mCustomActionObj = r0
            L12:
                return r0
        }

        public android.os.Bundle getExtras() {
                r1 = this;
                android.os.Bundle r0 = r1.mExtras
                return r0
        }

        public int getIcon() {
                r1 = this;
                int r0 = r1.mIcon
                return r0
        }

        public java.lang.CharSequence getName() {
                r1 = this;
                java.lang.CharSequence r0 = r1.mName
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Action:mName='"
                r0.append(r1)
                java.lang.CharSequence r1 = r2.mName
                r0.append(r1)
                java.lang.String r1 = ", mIcon="
                r0.append(r1)
                int r1 = r2.mIcon
                r0.append(r1)
                java.lang.String r1 = ", mExtras="
                r0.append(r1)
                android.os.Bundle r1 = r2.mExtras
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                java.lang.String r0 = r1.mAction
                r2.writeString(r0)
                java.lang.CharSequence r0 = r1.mName
                android.text.TextUtils.writeToParcel(r0, r2, r3)
                int r3 = r1.mIcon
                r2.writeInt(r3)
                android.os.Bundle r3 = r1.mExtras
                r2.writeBundle(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ErrorCode {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface MediaKeyAction {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface RepeatMode {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ShuffleMode {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface State {
    }

    static {
            android.support.v4.media.session.PlaybackStateCompat$1 r0 = new android.support.v4.media.session.PlaybackStateCompat$1
            r0.<init>()
            android.support.v4.media.session.PlaybackStateCompat.CREATOR = r0
            return
    }

    PlaybackStateCompat(int r1, long r2, long r4, float r6, long r7, int r9, java.lang.CharSequence r10, long r11, java.util.List<android.support.v4.media.session.PlaybackStateCompat.CustomAction> r13, long r14, android.os.Bundle r16) {
            r0 = this;
            r0.<init>()
            r0.mState = r1
            r0.mPosition = r2
            r0.mBufferedPosition = r4
            r0.mSpeed = r6
            r0.mActions = r7
            r0.mErrorCode = r9
            r0.mErrorMessage = r10
            r0.mUpdateTime = r11
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r13)
            r0.mCustomActions = r1
            r0.mActiveItemId = r14
            r1 = r16
            r0.mExtras = r1
            return
    }

    PlaybackStateCompat(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.readInt()
            r2.mState = r0
            long r0 = r3.readLong()
            r2.mPosition = r0
            float r0 = r3.readFloat()
            r2.mSpeed = r0
            long r0 = r3.readLong()
            r2.mUpdateTime = r0
            long r0 = r3.readLong()
            r2.mBufferedPosition = r0
            long r0 = r3.readLong()
            r2.mActions = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r0 = r0.createFromParcel(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.mErrorMessage = r0
            android.os.Parcelable$Creator<android.support.v4.media.session.PlaybackStateCompat$CustomAction> r0 = android.support.v4.media.session.PlaybackStateCompat.CustomAction.CREATOR
            java.util.ArrayList r0 = r3.createTypedArrayList(r0)
            r2.mCustomActions = r0
            long r0 = r3.readLong()
            r2.mActiveItemId = r0
            java.lang.Class<android.support.v4.media.session.MediaSessionCompat> r0 = android.support.v4.media.session.MediaSessionCompat.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Bundle r0 = r3.readBundle(r0)
            r2.mExtras = r0
            int r3 = r3.readInt()
            r2.mErrorCode = r3
            return
    }

    public static android.support.v4.media.session.PlaybackStateCompat fromPlaybackState(java.lang.Object r22) {
            r0 = r22
            r1 = 0
            if (r0 == 0) goto L64
            java.util.List r2 = android.support.v4.media.session.PlaybackStateCompatApi21.getCustomActions(r0)
            if (r2 == 0) goto L2d
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.size()
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L2a
            java.lang.Object r4 = r2.next()
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r4 = android.support.v4.media.session.PlaybackStateCompat.CustomAction.fromCustomAction(r4)
            r3.add(r4)
            goto L18
        L2a:
            r18 = r3
            goto L2f
        L2d:
            r18 = r1
        L2f:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 22
            if (r2 < r3) goto L39
            android.os.Bundle r1 = android.support.v4.media.session.PlaybackStateCompatApi22.getExtras(r0)
        L39:
            r21 = r1
            android.support.v4.media.session.PlaybackStateCompat r5 = new android.support.v4.media.session.PlaybackStateCompat
            int r6 = android.support.v4.media.session.PlaybackStateCompatApi21.getState(r0)
            long r7 = android.support.v4.media.session.PlaybackStateCompatApi21.getPosition(r0)
            long r9 = android.support.v4.media.session.PlaybackStateCompatApi21.getBufferedPosition(r0)
            float r11 = android.support.v4.media.session.PlaybackStateCompatApi21.getPlaybackSpeed(r0)
            long r12 = android.support.v4.media.session.PlaybackStateCompatApi21.getActions(r0)
            java.lang.CharSequence r15 = android.support.v4.media.session.PlaybackStateCompatApi21.getErrorMessage(r0)
            long r16 = android.support.v4.media.session.PlaybackStateCompatApi21.getLastPositionUpdateTime(r0)
            long r19 = android.support.v4.media.session.PlaybackStateCompatApi21.getActiveQueueItemId(r0)
            r14 = 0
            r5.<init>(r6, r7, r9, r11, r12, r14, r15, r16, r18, r19, r21)
            r5.mStateObj = r0
            return r5
        L64:
            return r1
    }

    public static int toKeyCode(long r3) {
            r0 = 4
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L9
            r3 = 126(0x7e, float:1.77E-43)
            return r3
        L9:
            r0 = 2
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L12
            r3 = 127(0x7f, float:1.78E-43)
            return r3
        L12:
            r0 = 32
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L1b
            r3 = 87
            return r3
        L1b:
            r0 = 16
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L24
            r3 = 88
            return r3
        L24:
            r0 = 1
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L2d
            r3 = 86
            return r3
        L2d:
            r0 = 64
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L36
            r3 = 90
            return r3
        L36:
            r0 = 8
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L3f
            r3 = 89
            return r3
        L3f:
            r0 = 512(0x200, double:2.53E-321)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L48
            r3 = 85
            return r3
        L48:
            r3 = 0
            return r3
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public long getActions() {
            r2 = this;
            long r0 = r2.mActions
            return r0
    }

    public long getActiveQueueItemId() {
            r2 = this;
            long r0 = r2.mActiveItemId
            return r0
    }

    public long getBufferedPosition() {
            r2 = this;
            long r0 = r2.mBufferedPosition
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public long getCurrentPosition(java.lang.Long r8) {
            r7 = this;
            long r0 = r7.mPosition
            float r2 = r7.mSpeed
            if (r8 == 0) goto Lb
            long r3 = r8.longValue()
            goto L12
        Lb:
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r7.mUpdateTime
            long r3 = r3 - r5
        L12:
            float r8 = (float) r3
            float r2 = r2 * r8
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 0
            long r0 = java.lang.Math.max(r2, r0)
            return r0
    }

    public java.util.List<android.support.v4.media.session.PlaybackStateCompat.CustomAction> getCustomActions() {
            r1 = this;
            java.util.List<android.support.v4.media.session.PlaybackStateCompat$CustomAction> r0 = r1.mCustomActions
            return r0
    }

    public int getErrorCode() {
            r1 = this;
            int r0 = r1.mErrorCode
            return r0
    }

    public java.lang.CharSequence getErrorMessage() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mErrorMessage
            return r0
    }

    @androidx.annotation.Nullable
    public android.os.Bundle getExtras() {
            r1 = this;
            android.os.Bundle r0 = r1.mExtras
            return r0
    }

    public long getLastPositionUpdateTime() {
            r2 = this;
            long r0 = r2.mUpdateTime
            return r0
    }

    public float getPlaybackSpeed() {
            r1 = this;
            float r0 = r1.mSpeed
            return r0
    }

    public java.lang.Object getPlaybackState() {
            r17 = this;
            r0 = r17
            java.lang.Object r1 = r0.mStateObj
            if (r1 != 0) goto L6a
            java.util.List<android.support.v4.media.session.PlaybackStateCompat$CustomAction> r1 = r0.mCustomActions
            if (r1 == 0) goto L31
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List<android.support.v4.media.session.PlaybackStateCompat$CustomAction> r2 = r0.mCustomActions
            int r2 = r2.size()
            r1.<init>(r2)
            java.util.List<android.support.v4.media.session.PlaybackStateCompat$CustomAction> r2 = r0.mCustomActions
            java.util.Iterator r2 = r2.iterator()
        L1b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r2.next()
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r3 = (android.support.v4.media.session.PlaybackStateCompat.CustomAction) r3
            java.lang.Object r3 = r3.getCustomAction()
            r1.add(r3)
            goto L1b
        L2f:
            r13 = r1
            goto L33
        L31:
            r1 = 0
            goto L2f
        L33:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 22
            if (r1 < r2) goto L54
            int r2 = r0.mState
            long r3 = r0.mPosition
            long r5 = r0.mBufferedPosition
            float r7 = r0.mSpeed
            long r8 = r0.mActions
            java.lang.CharSequence r10 = r0.mErrorMessage
            long r11 = r0.mUpdateTime
            long r14 = r0.mActiveItemId
            android.os.Bundle r1 = r0.mExtras
            r16 = r1
            java.lang.Object r1 = android.support.v4.media.session.PlaybackStateCompatApi22.newInstance(r2, r3, r5, r7, r8, r10, r11, r13, r14, r16)
            r0.mStateObj = r1
            goto L6a
        L54:
            int r2 = r0.mState
            long r3 = r0.mPosition
            long r5 = r0.mBufferedPosition
            float r7 = r0.mSpeed
            long r8 = r0.mActions
            java.lang.CharSequence r10 = r0.mErrorMessage
            long r11 = r0.mUpdateTime
            long r14 = r0.mActiveItemId
            java.lang.Object r1 = android.support.v4.media.session.PlaybackStateCompatApi21.newInstance(r2, r3, r5, r7, r8, r10, r11, r13, r14)
            r0.mStateObj = r1
        L6a:
            java.lang.Object r1 = r0.mStateObj
            return r1
    }

    public long getPosition() {
            r2 = this;
            long r0 = r2.mPosition
            return r0
    }

    public int getState() {
            r1 = this;
            int r0 = r1.mState
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PlaybackState {"
            r0.<init>(r1)
            java.lang.String r1 = "state="
            r0.append(r1)
            int r1 = r3.mState
            r0.append(r1)
            java.lang.String r1 = ", position="
            r0.append(r1)
            long r1 = r3.mPosition
            r0.append(r1)
            java.lang.String r1 = ", buffered position="
            r0.append(r1)
            long r1 = r3.mBufferedPosition
            r0.append(r1)
            java.lang.String r1 = ", speed="
            r0.append(r1)
            float r1 = r3.mSpeed
            r0.append(r1)
            java.lang.String r1 = ", updated="
            r0.append(r1)
            long r1 = r3.mUpdateTime
            r0.append(r1)
            java.lang.String r1 = ", actions="
            r0.append(r1)
            long r1 = r3.mActions
            r0.append(r1)
            java.lang.String r1 = ", error code="
            r0.append(r1)
            int r1 = r3.mErrorCode
            r0.append(r1)
            java.lang.String r1 = ", error message="
            r0.append(r1)
            java.lang.CharSequence r1 = r3.mErrorMessage
            r0.append(r1)
            java.lang.String r1 = ", custom actions="
            r0.append(r1)
            java.util.List<android.support.v4.media.session.PlaybackStateCompat$CustomAction> r1 = r3.mCustomActions
            r0.append(r1)
            java.lang.String r1 = ", active item id="
            r0.append(r1)
            long r1 = r3.mActiveItemId
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r0 = r2.mState
            r3.writeInt(r0)
            long r0 = r2.mPosition
            r3.writeLong(r0)
            float r0 = r2.mSpeed
            r3.writeFloat(r0)
            long r0 = r2.mUpdateTime
            r3.writeLong(r0)
            long r0 = r2.mBufferedPosition
            r3.writeLong(r0)
            long r0 = r2.mActions
            r3.writeLong(r0)
            java.lang.CharSequence r0 = r2.mErrorMessage
            android.text.TextUtils.writeToParcel(r0, r3, r4)
            java.util.List<android.support.v4.media.session.PlaybackStateCompat$CustomAction> r4 = r2.mCustomActions
            r3.writeTypedList(r4)
            long r0 = r2.mActiveItemId
            r3.writeLong(r0)
            android.os.Bundle r4 = r2.mExtras
            r3.writeBundle(r4)
            int r4 = r2.mErrorCode
            r3.writeInt(r4)
            return
    }
}
