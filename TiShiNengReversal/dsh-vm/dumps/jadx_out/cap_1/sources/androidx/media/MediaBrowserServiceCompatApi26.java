package androidx.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(26)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class MediaBrowserServiceCompatApi26 {
    private static final java.lang.String TAG = "MBSCompatApi26";
    static java.lang.reflect.Field sResultFlags;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class MediaBrowserServiceAdaptor extends androidx.media.MediaBrowserServiceCompatApi23.MediaBrowserServiceAdaptor {
        MediaBrowserServiceAdaptor(android.content.Context r1, androidx.media.MediaBrowserServiceCompatApi26.ServiceCompatProxy r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(java.lang.String r3, android.service.media.MediaBrowserService.Result<java.util.List<android.media.browse.MediaBrowser.MediaItem>> r4, android.os.Bundle r5) {
                r2 = this;
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r5)
                androidx.media.MediaBrowserServiceCompatApi21$ServiceCompatProxy r0 = r2.mServiceProxy
                androidx.media.MediaBrowserServiceCompatApi26$ServiceCompatProxy r0 = (androidx.media.MediaBrowserServiceCompatApi26.ServiceCompatProxy) r0
                androidx.media.MediaBrowserServiceCompatApi26$ResultWrapper r1 = new androidx.media.MediaBrowserServiceCompatApi26$ResultWrapper
                r1.<init>(r4)
                r0.onLoadChildren(r3, r1, r5)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ResultWrapper {
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

        public void sendResult(java.util.List<android.os.Parcel> r3, int r4) {
                r2 = this;
                java.lang.reflect.Field r0 = androidx.media.MediaBrowserServiceCompatApi26.sResultFlags     // Catch: java.lang.IllegalAccessException -> L7
                android.service.media.MediaBrowserService$Result r1 = r2.mResultObj     // Catch: java.lang.IllegalAccessException -> L7
                r0.setInt(r1, r4)     // Catch: java.lang.IllegalAccessException -> L7
            L7:
                android.service.media.MediaBrowserService$Result r4 = r2.mResultObj
                java.util.List r3 = r2.parcelListToItemList(r3)
                r4.sendResult(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ServiceCompatProxy extends androidx.media.MediaBrowserServiceCompatApi23.ServiceCompatProxy {
        void onLoadChildren(java.lang.String r1, androidx.media.MediaBrowserServiceCompatApi26.ResultWrapper r2, android.os.Bundle r3);
    }

    static {
            java.lang.Class<android.service.media.MediaBrowserService$Result> r0 = android.service.media.MediaBrowserService.Result.class
            java.lang.String r1 = "mFlags"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> Le
            androidx.media.MediaBrowserServiceCompatApi26.sResultFlags = r0     // Catch: java.lang.NoSuchFieldException -> Le
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> Le
        Le:
            return
    }

    private MediaBrowserServiceCompatApi26() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Object createService(android.content.Context r1, androidx.media.MediaBrowserServiceCompatApi26.ServiceCompatProxy r2) {
            androidx.media.MediaBrowserServiceCompatApi26$MediaBrowserServiceAdaptor r0 = new androidx.media.MediaBrowserServiceCompatApi26$MediaBrowserServiceAdaptor
            r0.<init>(r1, r2)
            return r0
    }

    public static android.os.Bundle getBrowserRootHints(java.lang.Object r0) {
            android.service.media.MediaBrowserService r0 = (android.service.media.MediaBrowserService) r0
            android.os.Bundle r0 = androidx.media.c.a(r0)
            return r0
    }

    public static void notifyChildrenChanged(java.lang.Object r0, java.lang.String r1, android.os.Bundle r2) {
            android.service.media.MediaBrowserService r0 = (android.service.media.MediaBrowserService) r0
            androidx.media.d.a(r0, r1, r2)
            return
    }
}
