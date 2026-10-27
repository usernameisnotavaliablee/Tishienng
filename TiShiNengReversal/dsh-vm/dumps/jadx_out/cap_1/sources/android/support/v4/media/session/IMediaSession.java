package android.support.v4.media.session;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface IMediaSession extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Stub extends android.os.Binder implements android.support.v4.media.session.IMediaSession {
        private static final java.lang.String DESCRIPTOR = "android.support.v4.media.session.IMediaSession";
        static final int TRANSACTION_addQueueItem = 41;
        static final int TRANSACTION_addQueueItemAt = 42;
        static final int TRANSACTION_adjustVolume = 11;
        static final int TRANSACTION_fastForward = 22;
        static final int TRANSACTION_getExtras = 31;
        static final int TRANSACTION_getFlags = 9;
        static final int TRANSACTION_getLaunchPendingIntent = 8;
        static final int TRANSACTION_getMetadata = 27;
        static final int TRANSACTION_getPackageName = 6;
        static final int TRANSACTION_getPlaybackState = 28;
        static final int TRANSACTION_getQueue = 29;
        static final int TRANSACTION_getQueueTitle = 30;
        static final int TRANSACTION_getRatingType = 32;
        static final int TRANSACTION_getRepeatMode = 37;
        static final int TRANSACTION_getShuffleMode = 47;
        static final int TRANSACTION_getTag = 7;
        static final int TRANSACTION_getVolumeAttributes = 10;
        static final int TRANSACTION_isCaptioningEnabled = 45;
        static final int TRANSACTION_isShuffleModeEnabledRemoved = 38;
        static final int TRANSACTION_isTransportControlEnabled = 5;
        static final int TRANSACTION_next = 20;
        static final int TRANSACTION_pause = 18;
        static final int TRANSACTION_play = 13;
        static final int TRANSACTION_playFromMediaId = 14;
        static final int TRANSACTION_playFromSearch = 15;
        static final int TRANSACTION_playFromUri = 16;
        static final int TRANSACTION_prepare = 33;
        static final int TRANSACTION_prepareFromMediaId = 34;
        static final int TRANSACTION_prepareFromSearch = 35;
        static final int TRANSACTION_prepareFromUri = 36;
        static final int TRANSACTION_previous = 21;
        static final int TRANSACTION_rate = 25;
        static final int TRANSACTION_rateWithExtras = 51;
        static final int TRANSACTION_registerCallbackListener = 3;
        static final int TRANSACTION_removeQueueItem = 43;
        static final int TRANSACTION_removeQueueItemAt = 44;
        static final int TRANSACTION_rewind = 23;
        static final int TRANSACTION_seekTo = 24;
        static final int TRANSACTION_sendCommand = 1;
        static final int TRANSACTION_sendCustomAction = 26;
        static final int TRANSACTION_sendMediaButton = 2;
        static final int TRANSACTION_setCaptioningEnabled = 46;
        static final int TRANSACTION_setRepeatMode = 39;
        static final int TRANSACTION_setShuffleMode = 48;
        static final int TRANSACTION_setShuffleModeEnabledRemoved = 40;
        static final int TRANSACTION_setVolumeTo = 12;
        static final int TRANSACTION_skipToQueueItem = 17;
        static final int TRANSACTION_stop = 19;
        static final int TRANSACTION_unregisterCallbackListener = 4;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class Proxy implements android.support.v4.media.session.IMediaSession {
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.mRemote = r1
                    return
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItem(android.support.v4.media.MediaDescriptionCompat r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 0
                    if (r5 == 0) goto L1a
                    r3 = 1
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                    r5.writeToParcel(r0, r2)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r5 = move-exception
                    goto L2e
                L1a:
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                L1d:
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L18
                    r3 = 41
                    r5.transact(r3, r0, r1, r2)     // Catch: java.lang.Throwable -> L18
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    r1.recycle()
                    r0.recycle()
                    return
                L2e:
                    r1.recycle()
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void addQueueItemAt(android.support.v4.media.MediaDescriptionCompat r5, int r6) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 0
                    if (r5 == 0) goto L1a
                    r3 = 1
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                    r5.writeToParcel(r0, r2)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r5 = move-exception
                    goto L31
                L1a:
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                L1d:
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L18
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L18
                    r6 = 42
                    r5.transact(r6, r0, r1, r2)     // Catch: java.lang.Throwable -> L18
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    r1.recycle()
                    r0.recycle()
                    return
                L31:
                    r1.recycle()
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void adjustVolume(int r4, int r5, java.lang.String r6) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L28
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L28
                    r0.writeInt(r5)     // Catch: java.lang.Throwable -> L28
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L28
                    android.os.IBinder r4 = r3.mRemote     // Catch: java.lang.Throwable -> L28
                    r5 = 11
                    r6 = 0
                    r4.transact(r5, r0, r1, r6)     // Catch: java.lang.Throwable -> L28
                    r1.readException()     // Catch: java.lang.Throwable -> L28
                    r1.recycle()
                    r0.recycle()
                    return
                L28:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.mRemote
                    return r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void fastForward() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L1f
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L1f
                    r3 = 22
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L1f
                    r1.readException()     // Catch: java.lang.Throwable -> L1f
                    r1.recycle()
                    r0.recycle()
                    return
                L1f:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.os.Bundle getExtras() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L27
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L27
                    r3 = 31
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L27
                    r1.readException()     // Catch: java.lang.Throwable -> L27
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L27
                    if (r2 == 0) goto L29
                    android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR     // Catch: java.lang.Throwable -> L27
                    java.lang.Object r2 = r2.createFromParcel(r1)     // Catch: java.lang.Throwable -> L27
                    android.os.Bundle r2 = (android.os.Bundle) r2     // Catch: java.lang.Throwable -> L27
                    goto L2a
                L27:
                    r2 = move-exception
                    goto L31
                L29:
                    r2 = 0
                L2a:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L31:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.IMediaSession
            public long getFlags() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L23
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L23
                    r3 = 9
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L23
                    r1.readException()     // Catch: java.lang.Throwable -> L23
                    long r2 = r1.readLong()     // Catch: java.lang.Throwable -> L23
                    r1.recycle()
                    r0.recycle()
                    return r2
                L23:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            public java.lang.String getInterfaceDescriptor() {
                    r1 = this;
                    java.lang.String r0 = "android.support.v4.media.session.IMediaSession"
                    return r0
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.app.PendingIntent getLaunchPendingIntent() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L27
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L27
                    r3 = 8
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L27
                    r1.readException()     // Catch: java.lang.Throwable -> L27
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L27
                    if (r2 == 0) goto L29
                    android.os.Parcelable$Creator r2 = android.app.PendingIntent.CREATOR     // Catch: java.lang.Throwable -> L27
                    java.lang.Object r2 = r2.createFromParcel(r1)     // Catch: java.lang.Throwable -> L27
                    android.app.PendingIntent r2 = (android.app.PendingIntent) r2     // Catch: java.lang.Throwable -> L27
                    goto L2a
                L27:
                    r2 = move-exception
                    goto L31
                L29:
                    r2 = 0
                L2a:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L31:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.support.v4.media.MediaMetadataCompat getMetadata() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L27
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L27
                    r3 = 27
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L27
                    r1.readException()     // Catch: java.lang.Throwable -> L27
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L27
                    if (r2 == 0) goto L29
                    android.os.Parcelable$Creator<android.support.v4.media.MediaMetadataCompat> r2 = android.support.v4.media.MediaMetadataCompat.CREATOR     // Catch: java.lang.Throwable -> L27
                    java.lang.Object r2 = r2.createFromParcel(r1)     // Catch: java.lang.Throwable -> L27
                    android.support.v4.media.MediaMetadataCompat r2 = (android.support.v4.media.MediaMetadataCompat) r2     // Catch: java.lang.Throwable -> L27
                    goto L2a
                L27:
                    r2 = move-exception
                    goto L31
                L29:
                    r2 = 0
                L2a:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L31:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.lang.String getPackageName() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L22
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L22
                    r3 = 6
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L22
                    r1.readException()     // Catch: java.lang.Throwable -> L22
                    java.lang.String r2 = r1.readString()     // Catch: java.lang.Throwable -> L22
                    r1.recycle()
                    r0.recycle()
                    return r2
                L22:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.support.v4.media.session.PlaybackStateCompat getPlaybackState() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L27
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L27
                    r3 = 28
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L27
                    r1.readException()     // Catch: java.lang.Throwable -> L27
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L27
                    if (r2 == 0) goto L29
                    android.os.Parcelable$Creator<android.support.v4.media.session.PlaybackStateCompat> r2 = android.support.v4.media.session.PlaybackStateCompat.CREATOR     // Catch: java.lang.Throwable -> L27
                    java.lang.Object r2 = r2.createFromParcel(r1)     // Catch: java.lang.Throwable -> L27
                    android.support.v4.media.session.PlaybackStateCompat r2 = (android.support.v4.media.session.PlaybackStateCompat) r2     // Catch: java.lang.Throwable -> L27
                    goto L2a
                L27:
                    r2 = move-exception
                    goto L31
                L29:
                    r2 = 0
                L2a:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L31:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> getQueue() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L25
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L25
                    r3 = 29
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L25
                    r1.readException()     // Catch: java.lang.Throwable -> L25
                    android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$QueueItem> r2 = android.support.v4.media.session.MediaSessionCompat.QueueItem.CREATOR     // Catch: java.lang.Throwable -> L25
                    java.util.ArrayList r2 = r1.createTypedArrayList(r2)     // Catch: java.lang.Throwable -> L25
                    r1.recycle()
                    r0.recycle()
                    return r2
                L25:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.lang.CharSequence getQueueTitle() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L27
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L27
                    r3 = 30
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L27
                    r1.readException()     // Catch: java.lang.Throwable -> L27
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L27
                    if (r2 == 0) goto L29
                    android.os.Parcelable$Creator r2 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR     // Catch: java.lang.Throwable -> L27
                    java.lang.Object r2 = r2.createFromParcel(r1)     // Catch: java.lang.Throwable -> L27
                    java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch: java.lang.Throwable -> L27
                    goto L2a
                L27:
                    r2 = move-exception
                    goto L31
                L29:
                    r2 = 0
                L2a:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L31:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRatingType() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L23
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L23
                    r3 = 32
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L23
                    r1.readException()     // Catch: java.lang.Throwable -> L23
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L23
                    r1.recycle()
                    r0.recycle()
                    return r2
                L23:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getRepeatMode() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L23
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L23
                    r3 = 37
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L23
                    r1.readException()     // Catch: java.lang.Throwable -> L23
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L23
                    r1.recycle()
                    r0.recycle()
                    return r2
                L23:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.IMediaSession
            public int getShuffleMode() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L23
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L23
                    r3 = 47
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L23
                    r1.readException()     // Catch: java.lang.Throwable -> L23
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L23
                    r1.recycle()
                    r0.recycle()
                    return r2
                L23:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.IMediaSession
            public java.lang.String getTag() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L22
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L22
                    r3 = 7
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L22
                    r1.readException()     // Catch: java.lang.Throwable -> L22
                    java.lang.String r2 = r1.readString()     // Catch: java.lang.Throwable -> L22
                    r1.recycle()
                    r0.recycle()
                    return r2
                L22:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.IMediaSession
            public android.support.v4.media.session.ParcelableVolumeInfo getVolumeAttributes() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L27
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L27
                    r3 = 10
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L27
                    r1.readException()     // Catch: java.lang.Throwable -> L27
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L27
                    if (r2 == 0) goto L29
                    android.os.Parcelable$Creator<android.support.v4.media.session.ParcelableVolumeInfo> r2 = android.support.v4.media.session.ParcelableVolumeInfo.CREATOR     // Catch: java.lang.Throwable -> L27
                    java.lang.Object r2 = r2.createFromParcel(r1)     // Catch: java.lang.Throwable -> L27
                    android.support.v4.media.session.ParcelableVolumeInfo r2 = (android.support.v4.media.session.ParcelableVolumeInfo) r2     // Catch: java.lang.Throwable -> L27
                    goto L2a
                L27:
                    r2 = move-exception
                    goto L31
                L29:
                    r2 = 0
                L2a:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L31:
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isCaptioningEnabled() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L26
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L26
                    r3 = 45
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L26
                    r1.readException()     // Catch: java.lang.Throwable -> L26
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L26
                    if (r2 == 0) goto L1f
                    r4 = 1
                L1f:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L26:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isShuffleModeEnabledRemoved() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L26
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L26
                    r3 = 38
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L26
                    r1.readException()     // Catch: java.lang.Throwable -> L26
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L26
                    if (r2 == 0) goto L1f
                    r4 = 1
                L1f:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L26:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean isTransportControlEnabled() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L25
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L25
                    r3 = 5
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L25
                    r1.readException()     // Catch: java.lang.Throwable -> L25
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L25
                    if (r2 == 0) goto L1e
                    r4 = 1
                L1e:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L25:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void next() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L1f
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L1f
                    r3 = 20
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L1f
                    r1.readException()     // Catch: java.lang.Throwable -> L1f
                    r1.recycle()
                    r0.recycle()
                    return
                L1f:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void pause() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L1f
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L1f
                    r3 = 18
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L1f
                    r1.readException()     // Catch: java.lang.Throwable -> L1f
                    r1.recycle()
                    r0.recycle()
                    return
                L1f:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void play() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L1f
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L1f
                    r3 = 13
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L1f
                    r1.readException()     // Catch: java.lang.Throwable -> L1f
                    r1.recycle()
                    r0.recycle()
                    return
                L1f:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromMediaId(java.lang.String r4, android.os.Bundle r5) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L1b
                    r0.writeString(r4)     // Catch: java.lang.Throwable -> L1b
                    r4 = 0
                    if (r5 == 0) goto L1d
                    r2 = 1
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L1b
                    r5.writeToParcel(r0, r4)     // Catch: java.lang.Throwable -> L1b
                    goto L20
                L1b:
                    r4 = move-exception
                    goto L31
                L1d:
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L1b
                L20:
                    android.os.IBinder r5 = r3.mRemote     // Catch: java.lang.Throwable -> L1b
                    r2 = 14
                    r5.transact(r2, r0, r1, r4)     // Catch: java.lang.Throwable -> L1b
                    r1.readException()     // Catch: java.lang.Throwable -> L1b
                    r1.recycle()
                    r0.recycle()
                    return
                L31:
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromSearch(java.lang.String r4, android.os.Bundle r5) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L1b
                    r0.writeString(r4)     // Catch: java.lang.Throwable -> L1b
                    r4 = 0
                    if (r5 == 0) goto L1d
                    r2 = 1
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L1b
                    r5.writeToParcel(r0, r4)     // Catch: java.lang.Throwable -> L1b
                    goto L20
                L1b:
                    r4 = move-exception
                    goto L31
                L1d:
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L1b
                L20:
                    android.os.IBinder r5 = r3.mRemote     // Catch: java.lang.Throwable -> L1b
                    r2 = 15
                    r5.transact(r2, r0, r1, r4)     // Catch: java.lang.Throwable -> L1b
                    r1.readException()     // Catch: java.lang.Throwable -> L1b
                    r1.recycle()
                    r0.recycle()
                    return
                L31:
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void playFromUri(android.net.Uri r5, android.os.Bundle r6) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 1
                    r3 = 0
                    if (r5 == 0) goto L1a
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                    r5.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r5 = move-exception
                    goto L3a
                L1a:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                L1d:
                    if (r6 == 0) goto L26
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                    r6.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L18
                    goto L29
                L26:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                L29:
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L18
                    r6 = 16
                    r5.transact(r6, r0, r1, r3)     // Catch: java.lang.Throwable -> L18
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    r1.recycle()
                    r0.recycle()
                    return
                L3a:
                    r1.recycle()
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepare() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L1f
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L1f
                    r3 = 33
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L1f
                    r1.readException()     // Catch: java.lang.Throwable -> L1f
                    r1.recycle()
                    r0.recycle()
                    return
                L1f:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromMediaId(java.lang.String r4, android.os.Bundle r5) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L1b
                    r0.writeString(r4)     // Catch: java.lang.Throwable -> L1b
                    r4 = 0
                    if (r5 == 0) goto L1d
                    r2 = 1
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L1b
                    r5.writeToParcel(r0, r4)     // Catch: java.lang.Throwable -> L1b
                    goto L20
                L1b:
                    r4 = move-exception
                    goto L31
                L1d:
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L1b
                L20:
                    android.os.IBinder r5 = r3.mRemote     // Catch: java.lang.Throwable -> L1b
                    r2 = 34
                    r5.transact(r2, r0, r1, r4)     // Catch: java.lang.Throwable -> L1b
                    r1.readException()     // Catch: java.lang.Throwable -> L1b
                    r1.recycle()
                    r0.recycle()
                    return
                L31:
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromSearch(java.lang.String r4, android.os.Bundle r5) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L1b
                    r0.writeString(r4)     // Catch: java.lang.Throwable -> L1b
                    r4 = 0
                    if (r5 == 0) goto L1d
                    r2 = 1
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L1b
                    r5.writeToParcel(r0, r4)     // Catch: java.lang.Throwable -> L1b
                    goto L20
                L1b:
                    r4 = move-exception
                    goto L31
                L1d:
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L1b
                L20:
                    android.os.IBinder r5 = r3.mRemote     // Catch: java.lang.Throwable -> L1b
                    r2 = 35
                    r5.transact(r2, r0, r1, r4)     // Catch: java.lang.Throwable -> L1b
                    r1.readException()     // Catch: java.lang.Throwable -> L1b
                    r1.recycle()
                    r0.recycle()
                    return
                L31:
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepareFromUri(android.net.Uri r5, android.os.Bundle r6) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 1
                    r3 = 0
                    if (r5 == 0) goto L1a
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                    r5.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r5 = move-exception
                    goto L3a
                L1a:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                L1d:
                    if (r6 == 0) goto L26
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                    r6.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L18
                    goto L29
                L26:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                L29:
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L18
                    r6 = 36
                    r5.transact(r6, r0, r1, r3)     // Catch: java.lang.Throwable -> L18
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    r1.recycle()
                    r0.recycle()
                    return
                L3a:
                    r1.recycle()
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void previous() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L1f
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L1f
                    r3 = 21
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L1f
                    r1.readException()     // Catch: java.lang.Throwable -> L1f
                    r1.recycle()
                    r0.recycle()
                    return
                L1f:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rate(android.support.v4.media.RatingCompat r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 0
                    if (r5 == 0) goto L1a
                    r3 = 1
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                    r5.writeToParcel(r0, r2)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r5 = move-exception
                    goto L2e
                L1a:
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                L1d:
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L18
                    r3 = 25
                    r5.transact(r3, r0, r1, r2)     // Catch: java.lang.Throwable -> L18
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    r1.recycle()
                    r0.recycle()
                    return
                L2e:
                    r1.recycle()
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rateWithExtras(android.support.v4.media.RatingCompat r5, android.os.Bundle r6) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 1
                    r3 = 0
                    if (r5 == 0) goto L1a
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                    r5.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r5 = move-exception
                    goto L3a
                L1a:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                L1d:
                    if (r6 == 0) goto L26
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                    r6.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L18
                    goto L29
                L26:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                L29:
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L18
                    r6 = 51
                    r5.transact(r6, r0, r1, r3)     // Catch: java.lang.Throwable -> L18
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    r1.recycle()
                    r0.recycle()
                    return
                L3a:
                    r1.recycle()
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void registerCallbackListener(android.support.v4.media.session.IMediaControllerCallback r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L14
                    if (r5 == 0) goto L16
                    android.os.IBinder r5 = r5.asBinder()     // Catch: java.lang.Throwable -> L14
                    goto L17
                L14:
                    r5 = move-exception
                    goto L2b
                L16:
                    r5 = 0
                L17:
                    r0.writeStrongBinder(r5)     // Catch: java.lang.Throwable -> L14
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L14
                    r2 = 3
                    r3 = 0
                    r5.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L14
                    r1.readException()     // Catch: java.lang.Throwable -> L14
                    r1.recycle()
                    r0.recycle()
                    return
                L2b:
                    r1.recycle()
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItem(android.support.v4.media.MediaDescriptionCompat r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 0
                    if (r5 == 0) goto L1a
                    r3 = 1
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                    r5.writeToParcel(r0, r2)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r5 = move-exception
                    goto L2e
                L1a:
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                L1d:
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L18
                    r3 = 43
                    r5.transact(r3, r0, r1, r2)     // Catch: java.lang.Throwable -> L18
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    r1.recycle()
                    r0.recycle()
                    return
                L2e:
                    r1.recycle()
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void removeQueueItemAt(int r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L22
                    r0.writeInt(r5)     // Catch: java.lang.Throwable -> L22
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L22
                    r2 = 44
                    r3 = 0
                    r5.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L22
                    r1.readException()     // Catch: java.lang.Throwable -> L22
                    r1.recycle()
                    r0.recycle()
                    return
                L22:
                    r5 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void rewind() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L1f
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L1f
                    r3 = 23
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L1f
                    r1.readException()     // Catch: java.lang.Throwable -> L1f
                    r1.recycle()
                    r0.recycle()
                    return
                L1f:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void seekTo(long r4) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L22
                    r0.writeLong(r4)     // Catch: java.lang.Throwable -> L22
                    android.os.IBinder r4 = r3.mRemote     // Catch: java.lang.Throwable -> L22
                    r5 = 24
                    r2 = 0
                    r4.transact(r5, r0, r1, r2)     // Catch: java.lang.Throwable -> L22
                    r1.readException()     // Catch: java.lang.Throwable -> L22
                    r1.recycle()
                    r0.recycle()
                    return
                L22:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCommand(java.lang.String r4, android.os.Bundle r5, android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper r6) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L1b
                    r0.writeString(r4)     // Catch: java.lang.Throwable -> L1b
                    r4 = 1
                    r2 = 0
                    if (r5 == 0) goto L1d
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L1b
                    r5.writeToParcel(r0, r2)     // Catch: java.lang.Throwable -> L1b
                    goto L20
                L1b:
                    r4 = move-exception
                    goto L3b
                L1d:
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L1b
                L20:
                    if (r6 == 0) goto L29
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L1b
                    r6.writeToParcel(r0, r2)     // Catch: java.lang.Throwable -> L1b
                    goto L2c
                L29:
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L1b
                L2c:
                    android.os.IBinder r5 = r3.mRemote     // Catch: java.lang.Throwable -> L1b
                    r5.transact(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L1b
                    r1.readException()     // Catch: java.lang.Throwable -> L1b
                    r1.recycle()
                    r0.recycle()
                    return
                L3b:
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void sendCustomAction(java.lang.String r4, android.os.Bundle r5) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L1b
                    r0.writeString(r4)     // Catch: java.lang.Throwable -> L1b
                    r4 = 0
                    if (r5 == 0) goto L1d
                    r2 = 1
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L1b
                    r5.writeToParcel(r0, r4)     // Catch: java.lang.Throwable -> L1b
                    goto L20
                L1b:
                    r4 = move-exception
                    goto L31
                L1d:
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L1b
                L20:
                    android.os.IBinder r5 = r3.mRemote     // Catch: java.lang.Throwable -> L1b
                    r2 = 26
                    r5.transact(r2, r0, r1, r4)     // Catch: java.lang.Throwable -> L1b
                    r1.readException()     // Catch: java.lang.Throwable -> L1b
                    r1.recycle()
                    r0.recycle()
                    return
                L31:
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.v4.media.session.IMediaSession
            public boolean sendMediaButton(android.view.KeyEvent r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L18
                    r2 = 1
                    r3 = 0
                    if (r6 == 0) goto L1a
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L18
                    r6.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L18
                    goto L1d
                L18:
                    r6 = move-exception
                    goto L35
                L1a:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L18
                L1d:
                    android.os.IBinder r6 = r5.mRemote     // Catch: java.lang.Throwable -> L18
                    r4 = 2
                    r6.transact(r4, r0, r1, r3)     // Catch: java.lang.Throwable -> L18
                    r1.readException()     // Catch: java.lang.Throwable -> L18
                    int r6 = r1.readInt()     // Catch: java.lang.Throwable -> L18
                    if (r6 == 0) goto L2d
                    goto L2e
                L2d:
                    r2 = 0
                L2e:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L35:
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setCaptioningEnabled(boolean r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L22
                    r0.writeInt(r5)     // Catch: java.lang.Throwable -> L22
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L22
                    r2 = 46
                    r3 = 0
                    r5.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L22
                    r1.readException()     // Catch: java.lang.Throwable -> L22
                    r1.recycle()
                    r0.recycle()
                    return
                L22:
                    r5 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setRepeatMode(int r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L22
                    r0.writeInt(r5)     // Catch: java.lang.Throwable -> L22
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L22
                    r2 = 39
                    r3 = 0
                    r5.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L22
                    r1.readException()     // Catch: java.lang.Throwable -> L22
                    r1.recycle()
                    r0.recycle()
                    return
                L22:
                    r5 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleMode(int r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L22
                    r0.writeInt(r5)     // Catch: java.lang.Throwable -> L22
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L22
                    r2 = 48
                    r3 = 0
                    r5.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L22
                    r1.readException()     // Catch: java.lang.Throwable -> L22
                    r1.recycle()
                    r0.recycle()
                    return
                L22:
                    r5 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setShuffleModeEnabledRemoved(boolean r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L22
                    r0.writeInt(r5)     // Catch: java.lang.Throwable -> L22
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L22
                    r2 = 40
                    r3 = 0
                    r5.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L22
                    r1.readException()     // Catch: java.lang.Throwable -> L22
                    r1.recycle()
                    r0.recycle()
                    return
                L22:
                    r5 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void setVolumeTo(int r4, int r5, java.lang.String r6) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L28
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L28
                    r0.writeInt(r5)     // Catch: java.lang.Throwable -> L28
                    r0.writeString(r6)     // Catch: java.lang.Throwable -> L28
                    android.os.IBinder r4 = r3.mRemote     // Catch: java.lang.Throwable -> L28
                    r5 = 12
                    r6 = 0
                    r4.transact(r5, r0, r1, r6)     // Catch: java.lang.Throwable -> L28
                    r1.readException()     // Catch: java.lang.Throwable -> L28
                    r1.recycle()
                    r0.recycle()
                    return
                L28:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void skipToQueueItem(long r4) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L22
                    r0.writeLong(r4)     // Catch: java.lang.Throwable -> L22
                    android.os.IBinder r4 = r3.mRemote     // Catch: java.lang.Throwable -> L22
                    r5 = 17
                    r2 = 0
                    r4.transact(r5, r0, r1, r2)     // Catch: java.lang.Throwable -> L22
                    r1.readException()     // Catch: java.lang.Throwable -> L22
                    r1.recycle()
                    r0.recycle()
                    return
                L22:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void stop() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L1f
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L1f
                    r3 = 19
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L1f
                    r1.readException()     // Catch: java.lang.Throwable -> L1f
                    r1.recycle()
                    r0.recycle()
                    return
                L1f:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void unregisterCallbackListener(android.support.v4.media.session.IMediaControllerCallback r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L14
                    if (r5 == 0) goto L16
                    android.os.IBinder r5 = r5.asBinder()     // Catch: java.lang.Throwable -> L14
                    goto L17
                L14:
                    r5 = move-exception
                    goto L2b
                L16:
                    r5 = 0
                L17:
                    r0.writeStrongBinder(r5)     // Catch: java.lang.Throwable -> L14
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L14
                    r2 = 4
                    r3 = 0
                    r5.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L14
                    r1.readException()     // Catch: java.lang.Throwable -> L14
                    r1.recycle()
                    r0.recycle()
                    return
                L2b:
                    r1.recycle()
                    r0.recycle()
                    throw r5
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "android.support.v4.media.session.IMediaSession"
                r1.attachInterface(r1, r0)
                return
        }

        public static android.support.v4.media.session.IMediaSession asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "android.support.v4.media.session.IMediaSession"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof android.support.v4.media.session.IMediaSession
                if (r1 == 0) goto L13
                android.support.v4.media.session.IMediaSession r0 = (android.support.v4.media.session.IMediaSession) r0
                return r0
            L13:
                android.support.v4.media.session.IMediaSession$Stub$Proxy r0 = new android.support.v4.media.session.IMediaSession$Stub$Proxy
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
                r4 = this;
                r0 = 51
                r1 = 0
                java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                r3 = 1
                if (r5 == r0) goto L3cd
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r0) goto L3c9
                r0 = 0
                switch(r5) {
                    case 1: goto L39c;
                    case 2: goto L37f;
                    case 3: goto L36d;
                    case 4: goto L35b;
                    case 5: goto L34d;
                    case 6: goto L33f;
                    case 7: goto L331;
                    case 8: goto L31a;
                    case 9: goto L30c;
                    case 10: goto L2f5;
                    case 11: goto L2df;
                    case 12: goto L2c9;
                    case 13: goto L2bf;
                    case 14: goto L2a2;
                    case 15: goto L285;
                    case 16: goto L25c;
                    case 17: goto L24e;
                    case 18: goto L244;
                    case 19: goto L23a;
                    case 20: goto L230;
                    case 21: goto L226;
                    case 22: goto L21c;
                    case 23: goto L212;
                    case 24: goto L204;
                    case 25: goto L1eb;
                    case 26: goto L1ce;
                    case 27: goto L1b7;
                    case 28: goto L1a0;
                    case 29: goto L192;
                    case 30: goto L17b;
                    case 31: goto L164;
                    case 32: goto L156;
                    case 33: goto L14c;
                    case 34: goto L12f;
                    case 35: goto L112;
                    case 36: goto Le9;
                    case 37: goto Ldb;
                    case 38: goto Lcd;
                    case 39: goto Lbf;
                    case 40: goto Lae;
                    case 41: goto L95;
                    case 42: goto L78;
                    case 43: goto L5f;
                    case 44: goto L51;
                    case 45: goto L43;
                    case 46: goto L32;
                    case 47: goto L24;
                    case 48: goto L16;
                    default: goto L11;
                }
            L11:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L16:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.setShuffleMode(r5)
                r7.writeNoException()
                return r3
            L24:
                r6.enforceInterface(r2)
                int r5 = r4.getShuffleMode()
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L32:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L3c
                r0 = 1
            L3c:
                r4.setCaptioningEnabled(r0)
                r7.writeNoException()
                return r3
            L43:
                r6.enforceInterface(r2)
                boolean r5 = r4.isCaptioningEnabled()
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L51:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.removeQueueItemAt(r5)
                r7.writeNoException()
                return r3
            L5f:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L71
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r1 = r5
                android.support.v4.media.MediaDescriptionCompat r1 = (android.support.v4.media.MediaDescriptionCompat) r1
            L71:
                r4.removeQueueItem(r1)
                r7.writeNoException()
                return r3
            L78:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L8a
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r1 = r5
                android.support.v4.media.MediaDescriptionCompat r1 = (android.support.v4.media.MediaDescriptionCompat) r1
            L8a:
                int r5 = r6.readInt()
                r4.addQueueItemAt(r1, r5)
                r7.writeNoException()
                return r3
            L95:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto La7
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r1 = r5
                android.support.v4.media.MediaDescriptionCompat r1 = (android.support.v4.media.MediaDescriptionCompat) r1
            La7:
                r4.addQueueItem(r1)
                r7.writeNoException()
                return r3
            Lae:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto Lb8
                r0 = 1
            Lb8:
                r4.setShuffleModeEnabledRemoved(r0)
                r7.writeNoException()
                return r3
            Lbf:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.setRepeatMode(r5)
                r7.writeNoException()
                return r3
            Lcd:
                r6.enforceInterface(r2)
                boolean r5 = r4.isShuffleModeEnabledRemoved()
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            Ldb:
                r6.enforceInterface(r2)
                int r5 = r4.getRepeatMode()
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            Le9:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto Lfb
                android.os.Parcelable$Creator r5 = android.net.Uri.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.net.Uri r5 = (android.net.Uri) r5
                goto Lfc
            Lfb:
                r5 = r1
            Lfc:
                int r8 = r6.readInt()
                if (r8 == 0) goto L10b
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L10b:
                r4.prepareFromUri(r5, r1)
                r7.writeNoException()
                return r3
            L112:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L128
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L128:
                r4.prepareFromSearch(r5, r1)
                r7.writeNoException()
                return r3
            L12f:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L145
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L145:
                r4.prepareFromMediaId(r5, r1)
                r7.writeNoException()
                return r3
            L14c:
                r6.enforceInterface(r2)
                r4.prepare()
                r7.writeNoException()
                return r3
            L156:
                r6.enforceInterface(r2)
                int r5 = r4.getRatingType()
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L164:
                r6.enforceInterface(r2)
                android.os.Bundle r5 = r4.getExtras()
                r7.writeNoException()
                if (r5 == 0) goto L177
                r7.writeInt(r3)
                r5.writeToParcel(r7, r3)
                goto L17a
            L177:
                r7.writeInt(r0)
            L17a:
                return r3
            L17b:
                r6.enforceInterface(r2)
                java.lang.CharSequence r5 = r4.getQueueTitle()
                r7.writeNoException()
                if (r5 == 0) goto L18e
                r7.writeInt(r3)
                android.text.TextUtils.writeToParcel(r5, r7, r3)
                goto L191
            L18e:
                r7.writeInt(r0)
            L191:
                return r3
            L192:
                r6.enforceInterface(r2)
                java.util.List r5 = r4.getQueue()
                r7.writeNoException()
                r7.writeTypedList(r5)
                return r3
            L1a0:
                r6.enforceInterface(r2)
                android.support.v4.media.session.PlaybackStateCompat r5 = r4.getPlaybackState()
                r7.writeNoException()
                if (r5 == 0) goto L1b3
                r7.writeInt(r3)
                r5.writeToParcel(r7, r3)
                goto L1b6
            L1b3:
                r7.writeInt(r0)
            L1b6:
                return r3
            L1b7:
                r6.enforceInterface(r2)
                android.support.v4.media.MediaMetadataCompat r5 = r4.getMetadata()
                r7.writeNoException()
                if (r5 == 0) goto L1ca
                r7.writeInt(r3)
                r5.writeToParcel(r7, r3)
                goto L1cd
            L1ca:
                r7.writeInt(r0)
            L1cd:
                return r3
            L1ce:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L1e4
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L1e4:
                r4.sendCustomAction(r5, r1)
                r7.writeNoException()
                return r3
            L1eb:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L1fd
                android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> r5 = android.support.v4.media.RatingCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r1 = r5
                android.support.v4.media.RatingCompat r1 = (android.support.v4.media.RatingCompat) r1
            L1fd:
                r4.rate(r1)
                r7.writeNoException()
                return r3
            L204:
                r6.enforceInterface(r2)
                long r5 = r6.readLong()
                r4.seekTo(r5)
                r7.writeNoException()
                return r3
            L212:
                r6.enforceInterface(r2)
                r4.rewind()
                r7.writeNoException()
                return r3
            L21c:
                r6.enforceInterface(r2)
                r4.fastForward()
                r7.writeNoException()
                return r3
            L226:
                r6.enforceInterface(r2)
                r4.previous()
                r7.writeNoException()
                return r3
            L230:
                r6.enforceInterface(r2)
                r4.next()
                r7.writeNoException()
                return r3
            L23a:
                r6.enforceInterface(r2)
                r4.stop()
                r7.writeNoException()
                return r3
            L244:
                r6.enforceInterface(r2)
                r4.pause()
                r7.writeNoException()
                return r3
            L24e:
                r6.enforceInterface(r2)
                long r5 = r6.readLong()
                r4.skipToQueueItem(r5)
                r7.writeNoException()
                return r3
            L25c:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L26e
                android.os.Parcelable$Creator r5 = android.net.Uri.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.net.Uri r5 = (android.net.Uri) r5
                goto L26f
            L26e:
                r5 = r1
            L26f:
                int r8 = r6.readInt()
                if (r8 == 0) goto L27e
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L27e:
                r4.playFromUri(r5, r1)
                r7.writeNoException()
                return r3
            L285:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L29b
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L29b:
                r4.playFromSearch(r5, r1)
                r7.writeNoException()
                return r3
            L2a2:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L2b8
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L2b8:
                r4.playFromMediaId(r5, r1)
                r7.writeNoException()
                return r3
            L2bf:
                r6.enforceInterface(r2)
                r4.play()
                r7.writeNoException()
                return r3
            L2c9:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                java.lang.String r6 = r6.readString()
                r4.setVolumeTo(r5, r8, r6)
                r7.writeNoException()
                return r3
            L2df:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                java.lang.String r6 = r6.readString()
                r4.adjustVolume(r5, r8, r6)
                r7.writeNoException()
                return r3
            L2f5:
                r6.enforceInterface(r2)
                android.support.v4.media.session.ParcelableVolumeInfo r5 = r4.getVolumeAttributes()
                r7.writeNoException()
                if (r5 == 0) goto L308
                r7.writeInt(r3)
                r5.writeToParcel(r7, r3)
                goto L30b
            L308:
                r7.writeInt(r0)
            L30b:
                return r3
            L30c:
                r6.enforceInterface(r2)
                long r5 = r4.getFlags()
                r7.writeNoException()
                r7.writeLong(r5)
                return r3
            L31a:
                r6.enforceInterface(r2)
                android.app.PendingIntent r5 = r4.getLaunchPendingIntent()
                r7.writeNoException()
                if (r5 == 0) goto L32d
                r7.writeInt(r3)
                r5.writeToParcel(r7, r3)
                goto L330
            L32d:
                r7.writeInt(r0)
            L330:
                return r3
            L331:
                r6.enforceInterface(r2)
                java.lang.String r5 = r4.getTag()
                r7.writeNoException()
                r7.writeString(r5)
                return r3
            L33f:
                r6.enforceInterface(r2)
                java.lang.String r5 = r4.getPackageName()
                r7.writeNoException()
                r7.writeString(r5)
                return r3
            L34d:
                r6.enforceInterface(r2)
                boolean r5 = r4.isTransportControlEnabled()
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L35b:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.v4.media.session.IMediaControllerCallback r5 = android.support.v4.media.session.IMediaControllerCallback.Stub.asInterface(r5)
                r4.unregisterCallbackListener(r5)
                r7.writeNoException()
                return r3
            L36d:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.v4.media.session.IMediaControllerCallback r5 = android.support.v4.media.session.IMediaControllerCallback.Stub.asInterface(r5)
                r4.registerCallbackListener(r5)
                r7.writeNoException()
                return r3
            L37f:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L391
                android.os.Parcelable$Creator r5 = android.view.KeyEvent.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r1 = r5
                android.view.KeyEvent r1 = (android.view.KeyEvent) r1
            L391:
                boolean r5 = r4.sendMediaButton(r1)
                r7.writeNoException()
                r7.writeInt(r5)
                return r3
            L39c:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L3b2
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.os.Bundle r8 = (android.os.Bundle) r8
                goto L3b3
            L3b2:
                r8 = r1
            L3b3:
                int r0 = r6.readInt()
                if (r0 == 0) goto L3c2
                android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper> r0 = android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r1 = r6
                android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper r1 = (android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper) r1
            L3c2:
                r4.sendCommand(r5, r8, r1)
                r7.writeNoException()
                return r3
            L3c9:
                r7.writeString(r2)
                return r3
            L3cd:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L3df
                android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> r5 = android.support.v4.media.RatingCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.support.v4.media.RatingCompat r5 = (android.support.v4.media.RatingCompat) r5
                goto L3e0
            L3df:
                r5 = r1
            L3e0:
                int r8 = r6.readInt()
                if (r8 == 0) goto L3ef
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L3ef:
                r4.rateWithExtras(r5, r1)
                r7.writeNoException()
                return r3
        }
    }

    void addQueueItem(android.support.v4.media.MediaDescriptionCompat r1) throws android.os.RemoteException;

    void addQueueItemAt(android.support.v4.media.MediaDescriptionCompat r1, int r2) throws android.os.RemoteException;

    void adjustVolume(int r1, int r2, java.lang.String r3) throws android.os.RemoteException;

    void fastForward() throws android.os.RemoteException;

    android.os.Bundle getExtras() throws android.os.RemoteException;

    long getFlags() throws android.os.RemoteException;

    android.app.PendingIntent getLaunchPendingIntent() throws android.os.RemoteException;

    android.support.v4.media.MediaMetadataCompat getMetadata() throws android.os.RemoteException;

    java.lang.String getPackageName() throws android.os.RemoteException;

    android.support.v4.media.session.PlaybackStateCompat getPlaybackState() throws android.os.RemoteException;

    java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> getQueue() throws android.os.RemoteException;

    java.lang.CharSequence getQueueTitle() throws android.os.RemoteException;

    int getRatingType() throws android.os.RemoteException;

    int getRepeatMode() throws android.os.RemoteException;

    int getShuffleMode() throws android.os.RemoteException;

    java.lang.String getTag() throws android.os.RemoteException;

    android.support.v4.media.session.ParcelableVolumeInfo getVolumeAttributes() throws android.os.RemoteException;

    boolean isCaptioningEnabled() throws android.os.RemoteException;

    boolean isShuffleModeEnabledRemoved() throws android.os.RemoteException;

    boolean isTransportControlEnabled() throws android.os.RemoteException;

    void next() throws android.os.RemoteException;

    void pause() throws android.os.RemoteException;

    void play() throws android.os.RemoteException;

    void playFromMediaId(java.lang.String r1, android.os.Bundle r2) throws android.os.RemoteException;

    void playFromSearch(java.lang.String r1, android.os.Bundle r2) throws android.os.RemoteException;

    void playFromUri(android.net.Uri r1, android.os.Bundle r2) throws android.os.RemoteException;

    void prepare() throws android.os.RemoteException;

    void prepareFromMediaId(java.lang.String r1, android.os.Bundle r2) throws android.os.RemoteException;

    void prepareFromSearch(java.lang.String r1, android.os.Bundle r2) throws android.os.RemoteException;

    void prepareFromUri(android.net.Uri r1, android.os.Bundle r2) throws android.os.RemoteException;

    void previous() throws android.os.RemoteException;

    void rate(android.support.v4.media.RatingCompat r1) throws android.os.RemoteException;

    void rateWithExtras(android.support.v4.media.RatingCompat r1, android.os.Bundle r2) throws android.os.RemoteException;

    void registerCallbackListener(android.support.v4.media.session.IMediaControllerCallback r1) throws android.os.RemoteException;

    void removeQueueItem(android.support.v4.media.MediaDescriptionCompat r1) throws android.os.RemoteException;

    void removeQueueItemAt(int r1) throws android.os.RemoteException;

    void rewind() throws android.os.RemoteException;

    void seekTo(long r1) throws android.os.RemoteException;

    void sendCommand(java.lang.String r1, android.os.Bundle r2, android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper r3) throws android.os.RemoteException;

    void sendCustomAction(java.lang.String r1, android.os.Bundle r2) throws android.os.RemoteException;

    boolean sendMediaButton(android.view.KeyEvent r1) throws android.os.RemoteException;

    void setCaptioningEnabled(boolean r1) throws android.os.RemoteException;

    void setRepeatMode(int r1) throws android.os.RemoteException;

    void setShuffleMode(int r1) throws android.os.RemoteException;

    void setShuffleModeEnabledRemoved(boolean r1) throws android.os.RemoteException;

    void setVolumeTo(int r1, int r2, java.lang.String r3) throws android.os.RemoteException;

    void skipToQueueItem(long r1) throws android.os.RemoteException;

    void stop() throws android.os.RemoteException;

    void unregisterCallbackListener(android.support.v4.media.session.IMediaControllerCallback r1) throws android.os.RemoteException;
}
