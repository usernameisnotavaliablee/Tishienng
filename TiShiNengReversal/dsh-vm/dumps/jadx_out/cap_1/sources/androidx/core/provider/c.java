package androidx.core.provider;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final /* synthetic */ class c {
    public static /* synthetic */ void a(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.lang.AutoCloseable
            if (r0 == 0) goto La
            java.lang.AutoCloseable r1 = (java.lang.AutoCloseable) r1
            r1.close()
            return
        La:
            boolean r0 = r1 instanceof java.util.concurrent.ExecutorService
            if (r0 == 0) goto L14
            java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1
            androidx.core.provider.d.a(r1)
            return
        L14:
            boolean r0 = r1 instanceof android.content.res.TypedArray
            if (r0 == 0) goto L1e
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            r1.recycle()
            return
        L1e:
            boolean r0 = r1 instanceof android.media.MediaMetadataRetriever
            if (r0 == 0) goto L28
            android.media.MediaMetadataRetriever r1 = (android.media.MediaMetadataRetriever) r1
            r1.release()
            return
        L28:
            boolean r0 = r1 instanceof android.media.MediaDrm
            if (r0 == 0) goto L32
            android.media.MediaDrm r1 = (android.media.MediaDrm) r1
            r1.release()
            return
        L32:
            boolean r0 = r1 instanceof android.drm.DrmManagerClient
            if (r0 == 0) goto L3c
            android.drm.DrmManagerClient r1 = (android.drm.DrmManagerClient) r1
            r1.release()
            return
        L3c:
            boolean r0 = r1 instanceof android.content.ContentProviderClient
            if (r0 == 0) goto L46
            android.content.ContentProviderClient r1 = (android.content.ContentProviderClient) r1
            r1.release()
            return
        L46:
            androidx.core.provider.e.a(r1)
            return
    }
}
