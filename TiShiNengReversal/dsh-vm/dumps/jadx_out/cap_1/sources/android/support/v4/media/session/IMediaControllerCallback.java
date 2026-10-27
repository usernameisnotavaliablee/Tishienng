package android.support.v4.media.session;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface IMediaControllerCallback extends android.os.IInterface {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Stub extends android.os.Binder implements android.support.v4.media.session.IMediaControllerCallback {
        private static final java.lang.String DESCRIPTOR = "android.support.v4.media.session.IMediaControllerCallback";
        static final int TRANSACTION_onCaptioningEnabledChanged = 11;
        static final int TRANSACTION_onEvent = 1;
        static final int TRANSACTION_onExtrasChanged = 7;
        static final int TRANSACTION_onMetadataChanged = 4;
        static final int TRANSACTION_onPlaybackStateChanged = 3;
        static final int TRANSACTION_onQueueChanged = 5;
        static final int TRANSACTION_onQueueTitleChanged = 6;
        static final int TRANSACTION_onRepeatModeChanged = 9;
        static final int TRANSACTION_onSessionDestroyed = 2;
        static final int TRANSACTION_onSessionReady = 13;
        static final int TRANSACTION_onShuffleModeChanged = 12;
        static final int TRANSACTION_onShuffleModeChangedRemoved = 10;
        static final int TRANSACTION_onVolumeInfoChanged = 8;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class Proxy implements android.support.v4.media.session.IMediaControllerCallback {
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.mRemote = r1
                    return
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.mRemote
                    return r0
            }

            public java.lang.String getInterfaceDescriptor() {
                    r1 = this;
                    java.lang.String r0 = "android.support.v4.media.session.IMediaControllerCallback"
                    return r0
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onCaptioningEnabledChanged(boolean r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.media.session.IMediaControllerCallback"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L19
                    r0.writeInt(r5)     // Catch: java.lang.Throwable -> L19
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L19
                    r1 = 0
                    r2 = 1
                    r3 = 11
                    r5.transact(r3, r0, r1, r2)     // Catch: java.lang.Throwable -> L19
                    r0.recycle()
                    return
                L19:
                    r5 = move-exception
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onEvent(java.lang.String r3, android.os.Bundle r4) throws android.os.RemoteException {
                    r2 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.media.session.IMediaControllerCallback"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L17
                    r0.writeString(r3)     // Catch: java.lang.Throwable -> L17
                    r3 = 0
                    r1 = 1
                    if (r4 == 0) goto L19
                    r0.writeInt(r1)     // Catch: java.lang.Throwable -> L17
                    r4.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L17
                    goto L1c
                L17:
                    r3 = move-exception
                    goto L26
                L19:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L17
                L1c:
                    android.os.IBinder r3 = r2.mRemote     // Catch: java.lang.Throwable -> L17
                    r4 = 0
                    r3.transact(r1, r0, r4, r1)     // Catch: java.lang.Throwable -> L17
                    r0.recycle()
                    return
                L26:
                    r0.recycle()
                    throw r3
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onExtrasChanged(android.os.Bundle r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.media.session.IMediaControllerCallback"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L14
                    r1 = 0
                    r2 = 1
                    if (r5 == 0) goto L16
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L14
                    r5.writeToParcel(r0, r1)     // Catch: java.lang.Throwable -> L14
                    goto L19
                L14:
                    r5 = move-exception
                    goto L24
                L16:
                    r0.writeInt(r1)     // Catch: java.lang.Throwable -> L14
                L19:
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L14
                    r1 = 7
                    r3 = 0
                    r5.transact(r1, r0, r3, r2)     // Catch: java.lang.Throwable -> L14
                    r0.recycle()
                    return
                L24:
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onMetadataChanged(android.support.v4.media.MediaMetadataCompat r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.media.session.IMediaControllerCallback"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L14
                    r1 = 0
                    r2 = 1
                    if (r5 == 0) goto L16
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L14
                    r5.writeToParcel(r0, r1)     // Catch: java.lang.Throwable -> L14
                    goto L19
                L14:
                    r5 = move-exception
                    goto L24
                L16:
                    r0.writeInt(r1)     // Catch: java.lang.Throwable -> L14
                L19:
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L14
                    r1 = 4
                    r3 = 0
                    r5.transact(r1, r0, r3, r2)     // Catch: java.lang.Throwable -> L14
                    r0.recycle()
                    return
                L24:
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onPlaybackStateChanged(android.support.v4.media.session.PlaybackStateCompat r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.media.session.IMediaControllerCallback"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L14
                    r1 = 0
                    r2 = 1
                    if (r5 == 0) goto L16
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L14
                    r5.writeToParcel(r0, r1)     // Catch: java.lang.Throwable -> L14
                    goto L19
                L14:
                    r5 = move-exception
                    goto L24
                L16:
                    r0.writeInt(r1)     // Catch: java.lang.Throwable -> L14
                L19:
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L14
                    r1 = 3
                    r3 = 0
                    r5.transact(r1, r0, r3, r2)     // Catch: java.lang.Throwable -> L14
                    r0.recycle()
                    return
                L24:
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onQueueChanged(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.media.session.IMediaControllerCallback"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L18
                    r0.writeTypedList(r5)     // Catch: java.lang.Throwable -> L18
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L18
                    r1 = 0
                    r2 = 1
                    r3 = 5
                    r5.transact(r3, r0, r1, r2)     // Catch: java.lang.Throwable -> L18
                    r0.recycle()
                    return
                L18:
                    r5 = move-exception
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onQueueTitleChanged(java.lang.CharSequence r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.media.session.IMediaControllerCallback"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L14
                    r1 = 0
                    r2 = 1
                    if (r5 == 0) goto L16
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L14
                    android.text.TextUtils.writeToParcel(r5, r0, r1)     // Catch: java.lang.Throwable -> L14
                    goto L19
                L14:
                    r5 = move-exception
                    goto L24
                L16:
                    r0.writeInt(r1)     // Catch: java.lang.Throwable -> L14
                L19:
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L14
                    r1 = 6
                    r3 = 0
                    r5.transact(r1, r0, r3, r2)     // Catch: java.lang.Throwable -> L14
                    r0.recycle()
                    return
                L24:
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onRepeatModeChanged(int r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.media.session.IMediaControllerCallback"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L19
                    r0.writeInt(r5)     // Catch: java.lang.Throwable -> L19
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L19
                    r1 = 0
                    r2 = 1
                    r3 = 9
                    r5.transact(r3, r0, r1, r2)     // Catch: java.lang.Throwable -> L19
                    r0.recycle()
                    return
                L19:
                    r5 = move-exception
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onSessionDestroyed() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.media.session.IMediaControllerCallback"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L15
                    android.os.IBinder r1 = r5.mRemote     // Catch: java.lang.Throwable -> L15
                    r2 = 0
                    r3 = 1
                    r4 = 2
                    r1.transact(r4, r0, r2, r3)     // Catch: java.lang.Throwable -> L15
                    r0.recycle()
                    return
                L15:
                    r1 = move-exception
                    r0.recycle()
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onSessionReady() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.media.session.IMediaControllerCallback"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L16
                    android.os.IBinder r1 = r5.mRemote     // Catch: java.lang.Throwable -> L16
                    r2 = 0
                    r3 = 1
                    r4 = 13
                    r1.transact(r4, r0, r2, r3)     // Catch: java.lang.Throwable -> L16
                    r0.recycle()
                    return
                L16:
                    r1 = move-exception
                    r0.recycle()
                    throw r1
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onShuffleModeChanged(int r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.media.session.IMediaControllerCallback"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L19
                    r0.writeInt(r5)     // Catch: java.lang.Throwable -> L19
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L19
                    r1 = 0
                    r2 = 1
                    r3 = 12
                    r5.transact(r3, r0, r1, r2)     // Catch: java.lang.Throwable -> L19
                    r0.recycle()
                    return
                L19:
                    r5 = move-exception
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onShuffleModeChangedRemoved(boolean r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.media.session.IMediaControllerCallback"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L19
                    r0.writeInt(r5)     // Catch: java.lang.Throwable -> L19
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L19
                    r1 = 0
                    r2 = 1
                    r3 = 10
                    r5.transact(r3, r0, r1, r2)     // Catch: java.lang.Throwable -> L19
                    r0.recycle()
                    return
                L19:
                    r5 = move-exception
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onVolumeInfoChanged(android.support.v4.media.session.ParcelableVolumeInfo r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.media.session.IMediaControllerCallback"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L14
                    r1 = 0
                    r2 = 1
                    if (r5 == 0) goto L16
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L14
                    r5.writeToParcel(r0, r1)     // Catch: java.lang.Throwable -> L14
                    goto L19
                L14:
                    r5 = move-exception
                    goto L25
                L16:
                    r0.writeInt(r1)     // Catch: java.lang.Throwable -> L14
                L19:
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L14
                    r1 = 8
                    r3 = 0
                    r5.transact(r1, r0, r3, r2)     // Catch: java.lang.Throwable -> L14
                    r0.recycle()
                    return
                L25:
                    r0.recycle()
                    throw r5
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "android.support.v4.media.session.IMediaControllerCallback"
                r1.attachInterface(r1, r0)
                return
        }

        public static android.support.v4.media.session.IMediaControllerCallback asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "android.support.v4.media.session.IMediaControllerCallback"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof android.support.v4.media.session.IMediaControllerCallback
                if (r1 == 0) goto L13
                android.support.v4.media.session.IMediaControllerCallback r0 = (android.support.v4.media.session.IMediaControllerCallback) r0
                return r0
            L13:
                android.support.v4.media.session.IMediaControllerCallback$Stub$Proxy r0 = new android.support.v4.media.session.IMediaControllerCallback$Stub$Proxy
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
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                java.lang.String r1 = "android.support.v4.media.session.IMediaControllerCallback"
                r2 = 1
                if (r5 == r0) goto Le7
                r0 = 0
                r3 = 0
                switch(r5) {
                    case 1: goto Lcd;
                    case 2: goto Lc6;
                    case 3: goto Lb0;
                    case 4: goto L9a;
                    case 5: goto L8d;
                    case 6: goto L77;
                    case 7: goto L61;
                    case 8: goto L4b;
                    case 9: goto L40;
                    case 10: goto L32;
                    case 11: goto L24;
                    case 12: goto L19;
                    case 13: goto L12;
                    default: goto Ld;
                }
            Ld:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L12:
                r6.enforceInterface(r1)
                r4.onSessionReady()
                return r2
            L19:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                r4.onShuffleModeChanged(r5)
                return r2
            L24:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L2e
                r0 = 1
            L2e:
                r4.onCaptioningEnabledChanged(r0)
                return r2
            L32:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L3c
                r0 = 1
            L3c:
                r4.onShuffleModeChangedRemoved(r0)
                return r2
            L40:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                r4.onRepeatModeChanged(r5)
                return r2
            L4b:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L5d
                android.os.Parcelable$Creator<android.support.v4.media.session.ParcelableVolumeInfo> r5 = android.support.v4.media.session.ParcelableVolumeInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.session.ParcelableVolumeInfo r3 = (android.support.v4.media.session.ParcelableVolumeInfo) r3
            L5d:
                r4.onVolumeInfoChanged(r3)
                return r2
            L61:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L73
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.os.Bundle r3 = (android.os.Bundle) r3
            L73:
                r4.onExtrasChanged(r3)
                return r2
            L77:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L89
                android.os.Parcelable$Creator r5 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            L89:
                r4.onQueueTitleChanged(r3)
                return r2
            L8d:
                r6.enforceInterface(r1)
                android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$QueueItem> r5 = android.support.v4.media.session.MediaSessionCompat.QueueItem.CREATOR
                java.util.ArrayList r5 = r6.createTypedArrayList(r5)
                r4.onQueueChanged(r5)
                return r2
            L9a:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto Lac
                android.os.Parcelable$Creator<android.support.v4.media.MediaMetadataCompat> r5 = android.support.v4.media.MediaMetadataCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.MediaMetadataCompat r3 = (android.support.v4.media.MediaMetadataCompat) r3
            Lac:
                r4.onMetadataChanged(r3)
                return r2
            Lb0:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto Lc2
                android.os.Parcelable$Creator<android.support.v4.media.session.PlaybackStateCompat> r5 = android.support.v4.media.session.PlaybackStateCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.session.PlaybackStateCompat r3 = (android.support.v4.media.session.PlaybackStateCompat) r3
            Lc2:
                r4.onPlaybackStateChanged(r3)
                return r2
            Lc6:
                r6.enforceInterface(r1)
                r4.onSessionDestroyed()
                return r2
            Lcd:
                r6.enforceInterface(r1)
                java.lang.String r5 = r6.readString()
                int r7 = r6.readInt()
                if (r7 == 0) goto Le3
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r7.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            Le3:
                r4.onEvent(r5, r3)
                return r2
            Le7:
                r7.writeString(r1)
                return r2
        }
    }

    void onCaptioningEnabledChanged(boolean r1) throws android.os.RemoteException;

    void onEvent(java.lang.String r1, android.os.Bundle r2) throws android.os.RemoteException;

    void onExtrasChanged(android.os.Bundle r1) throws android.os.RemoteException;

    void onMetadataChanged(android.support.v4.media.MediaMetadataCompat r1) throws android.os.RemoteException;

    void onPlaybackStateChanged(android.support.v4.media.session.PlaybackStateCompat r1) throws android.os.RemoteException;

    void onQueueChanged(java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem> r1) throws android.os.RemoteException;

    void onQueueTitleChanged(java.lang.CharSequence r1) throws android.os.RemoteException;

    void onRepeatModeChanged(int r1) throws android.os.RemoteException;

    void onSessionDestroyed() throws android.os.RemoteException;

    void onSessionReady() throws android.os.RemoteException;

    void onShuffleModeChanged(int r1) throws android.os.RemoteException;

    void onShuffleModeChangedRemoved(boolean r1) throws android.os.RemoteException;

    void onVolumeInfoChanged(android.support.v4.media.session.ParcelableVolumeInfo r1) throws android.os.RemoteException;
}
