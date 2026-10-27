package androidx.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(23)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class MediaBrowserServiceCompatApi23 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class MediaBrowserServiceAdaptor extends androidx.media.MediaBrowserServiceCompatApi21.MediaBrowserServiceAdaptor {
        MediaBrowserServiceAdaptor(android.content.Context r1, androidx.media.MediaBrowserServiceCompatApi23.ServiceCompatProxy r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadItem(java.lang.String r3, android.service.media.MediaBrowserService.Result<android.media.browse.MediaBrowser.MediaItem> r4) {
                r2 = this;
                androidx.media.MediaBrowserServiceCompatApi21$ServiceCompatProxy r0 = r2.mServiceProxy
                androidx.media.MediaBrowserServiceCompatApi23$ServiceCompatProxy r0 = (androidx.media.MediaBrowserServiceCompatApi23.ServiceCompatProxy) r0
                androidx.media.MediaBrowserServiceCompatApi21$ResultWrapper r1 = new androidx.media.MediaBrowserServiceCompatApi21$ResultWrapper
                r1.<init>(r4)
                r0.onLoadItem(r3, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ServiceCompatProxy extends androidx.media.MediaBrowserServiceCompatApi21.ServiceCompatProxy {
        void onLoadItem(java.lang.String r1, androidx.media.MediaBrowserServiceCompatApi21.ResultWrapper<android.os.Parcel> r2);
    }

    private MediaBrowserServiceCompatApi23() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Object createService(android.content.Context r1, androidx.media.MediaBrowserServiceCompatApi23.ServiceCompatProxy r2) {
            androidx.media.MediaBrowserServiceCompatApi23$MediaBrowserServiceAdaptor r0 = new androidx.media.MediaBrowserServiceCompatApi23$MediaBrowserServiceAdaptor
            r0.<init>(r1, r2)
            return r0
    }
}
