package androidx.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class MediaBrowserServiceCompatApi21 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class BrowserRoot {
        final android.os.Bundle mExtras;
        final java.lang.String mRootId;

        BrowserRoot(java.lang.String r1, android.os.Bundle r2) {
                r0 = this;
                r0.<init>()
                r0.mRootId = r1
                r0.mExtras = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class MediaBrowserServiceAdaptor extends android.service.media.MediaBrowserService {
        final androidx.media.MediaBrowserServiceCompatApi21.ServiceCompatProxy mServiceProxy;

        MediaBrowserServiceAdaptor(android.content.Context r1, androidx.media.MediaBrowserServiceCompatApi21.ServiceCompatProxy r2) {
                r0 = this;
                r0.<init>()
                r0.attachBaseContext(r1)
                r0.mServiceProxy = r2
                return
        }

        @Override // android.service.media.MediaBrowserService
        public android.service.media.MediaBrowserService.BrowserRoot onGetRoot(java.lang.String r4, int r5, android.os.Bundle r6) {
                r3 = this;
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r6)
                androidx.media.MediaBrowserServiceCompatApi21$ServiceCompatProxy r0 = r3.mServiceProxy
                r1 = 0
                if (r6 != 0) goto La
                r2 = r1
                goto Lf
            La:
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>(r6)
            Lf:
                androidx.media.MediaBrowserServiceCompatApi21$BrowserRoot r4 = r0.onGetRoot(r4, r5, r2)
                if (r4 != 0) goto L16
                return r1
            L16:
                android.service.media.MediaBrowserService$BrowserRoot r5 = new android.service.media.MediaBrowserService$BrowserRoot
                java.lang.String r6 = r4.mRootId
                android.os.Bundle r4 = r4.mExtras
                r5.<init>(r6, r4)
                return r5
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(java.lang.String r3, android.service.media.MediaBrowserService.Result<java.util.List<android.media.browse.MediaBrowser.MediaItem>> r4) {
                r2 = this;
                androidx.media.MediaBrowserServiceCompatApi21$ServiceCompatProxy r0 = r2.mServiceProxy
                androidx.media.MediaBrowserServiceCompatApi21$ResultWrapper r1 = new androidx.media.MediaBrowserServiceCompatApi21$ResultWrapper
                r1.<init>(r4)
                r0.onLoadChildren(r3, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ResultWrapper<T> {
        android.service.media.MediaBrowserService.Result mResultObj;

        ResultWrapper(android.service.media.MediaBrowserService.Result r1) {
                r0 = this;
                r0.<init>()
                r0.mResultObj = r1
                return
        }

        public void detach() {
                r1 = this;
                android.service.media.MediaBrowserService$Result r0 = r1.mResultObj
                r0.detach()
                return
        }

        java.util.List<android.media.browse.MediaBrowser.MediaItem> parcelListToItemList(java.util.List<android.os.Parcel> r4) {
                r3 = this;
                if (r4 != 0) goto L4
                r4 = 0
                return r4
            L4:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r4 = r4.iterator()
            Ld:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L2a
                java.lang.Object r1 = r4.next()
                android.os.Parcel r1 = (android.os.Parcel) r1
                r2 = 0
                r1.setDataPosition(r2)
                android.os.Parcelable$Creator r2 = android.media.browse.MediaBrowser.MediaItem.CREATOR
                java.lang.Object r2 = r2.createFromParcel(r1)
                r0.add(r2)
                r1.recycle()
                goto Ld
            L2a:
                return r0
        }

        public void sendResult(T r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.util.List
                if (r0 == 0) goto L10
                android.service.media.MediaBrowserService$Result r0 = r2.mResultObj
                java.util.List r3 = (java.util.List) r3
                java.util.List r3 = r2.parcelListToItemList(r3)
                r0.sendResult(r3)
                return
            L10:
                boolean r0 = r3 instanceof android.os.Parcel
                if (r0 == 0) goto L29
                android.os.Parcel r3 = (android.os.Parcel) r3
                r0 = 0
                r3.setDataPosition(r0)
                android.service.media.MediaBrowserService$Result r0 = r2.mResultObj
                android.os.Parcelable$Creator r1 = android.media.browse.MediaBrowser.MediaItem.CREATOR
                java.lang.Object r1 = r1.createFromParcel(r3)
                r0.sendResult(r1)
                r3.recycle()
                return
            L29:
                android.service.media.MediaBrowserService$Result r3 = r2.mResultObj
                r0 = 0
                r3.sendResult(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ServiceCompatProxy {
        androidx.media.MediaBrowserServiceCompatApi21.BrowserRoot onGetRoot(java.lang.String r1, int r2, android.os.Bundle r3);

        void onLoadChildren(java.lang.String r1, androidx.media.MediaBrowserServiceCompatApi21.ResultWrapper<java.util.List<android.os.Parcel>> r2);
    }

    private MediaBrowserServiceCompatApi21() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Object createService(android.content.Context r1, androidx.media.MediaBrowserServiceCompatApi21.ServiceCompatProxy r2) {
            androidx.media.MediaBrowserServiceCompatApi21$MediaBrowserServiceAdaptor r0 = new androidx.media.MediaBrowserServiceCompatApi21$MediaBrowserServiceAdaptor
            r0.<init>(r1, r2)
            return r0
    }

    public static void notifyChildrenChanged(java.lang.Object r0, java.lang.String r1) {
            android.service.media.MediaBrowserService r0 = (android.service.media.MediaBrowserService) r0
            r0.notifyChildrenChanged(r1)
            return
    }

    public static android.os.IBinder onBind(java.lang.Object r0, android.content.Intent r1) {
            android.service.media.MediaBrowserService r0 = (android.service.media.MediaBrowserService) r0
            android.os.IBinder r0 = r0.onBind(r1)
            return r0
    }

    public static void onCreate(java.lang.Object r0) {
            android.service.media.MediaBrowserService r0 = (android.service.media.MediaBrowserService) r0
            r0.onCreate()
            return
    }

    public static void setSessionToken(java.lang.Object r0, java.lang.Object r1) {
            android.service.media.MediaBrowserService r0 = (android.service.media.MediaBrowserService) r0
            android.media.session.MediaSession$Token r1 = (android.media.session.MediaSession.Token) r1
            r0.setSessionToken(r1)
            return
    }
}
