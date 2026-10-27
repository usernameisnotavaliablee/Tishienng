package android.support.v4.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(23)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class MediaBrowserCompatApi23 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface ItemCallback {
        void onError(@androidx.annotation.NonNull java.lang.String r1);

        void onItemLoaded(android.os.Parcel r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class ItemCallbackProxy<T extends android.support.v4.media.MediaBrowserCompatApi23.ItemCallback> extends android.media.browse.MediaBrowser.ItemCallback {
        protected final T mItemCallback;

        public ItemCallbackProxy(T r1) {
                r0 = this;
                r0.<init>()
                r0.mItemCallback = r1
                return
        }

        @Override // android.media.browse.MediaBrowser.ItemCallback
        public void onError(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                T extends android.support.v4.media.MediaBrowserCompatApi23$ItemCallback r0 = r1.mItemCallback
                r0.onError(r2)
                return
        }

        @Override // android.media.browse.MediaBrowser.ItemCallback
        public void onItemLoaded(android.media.browse.MediaBrowser.MediaItem r3) {
                r2 = this;
                if (r3 != 0) goto L9
                T extends android.support.v4.media.MediaBrowserCompatApi23$ItemCallback r3 = r2.mItemCallback
                r0 = 0
                r3.onItemLoaded(r0)
                return
            L9:
                android.os.Parcel r0 = android.os.Parcel.obtain()
                r1 = 0
                r3.writeToParcel(r0, r1)
                T extends android.support.v4.media.MediaBrowserCompatApi23$ItemCallback r3 = r2.mItemCallback
                r3.onItemLoaded(r0)
                return
        }
    }

    private MediaBrowserCompatApi23() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Object createItemCallback(android.support.v4.media.MediaBrowserCompatApi23.ItemCallback r1) {
            android.support.v4.media.MediaBrowserCompatApi23$ItemCallbackProxy r0 = new android.support.v4.media.MediaBrowserCompatApi23$ItemCallbackProxy
            r0.<init>(r1)
            return r0
    }

    public static void getItem(java.lang.Object r0, java.lang.String r1, java.lang.Object r2) {
            android.media.browse.MediaBrowser r0 = (android.media.browse.MediaBrowser) r0
            android.media.browse.MediaBrowser$ItemCallback r2 = android.support.v4.media.a.a(r2)
            android.support.v4.media.b.a(r0, r1, r2)
            return
    }
}
